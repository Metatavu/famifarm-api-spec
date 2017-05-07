package fi.metatavu.edelphi.pages;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import fi.metatavu.edelphi.EdelfoiStatusCode;
import fi.metatavu.edelphi.domainmodel.base.Delfoi;
import fi.metatavu.edelphi.domainmodel.features.Feature;
import fi.metatavu.edelphi.domainmodel.resources.Document;
import fi.metatavu.edelphi.domainmodel.resources.Folder;
import fi.metatavu.edelphi.i18n.Messages;
import fi.metatavu.edelphi.smvcj.SmvcRuntimeException;
import fi.metatavu.edelphi.smvcj.controllers.PageRequestContext;
import fi.metatavu.edelphi.utils.ActionUtils;
import fi.metatavu.edelphi.utils.MaterialBean;
import fi.metatavu.edelphi.utils.MaterialBeanNameComparator;
import fi.metatavu.edelphi.utils.MaterialUtils;
import fi.metatavu.edelphi.utils.RequestUtils;

public class HelpPageController extends AbstractDelphiMaterialPageController {

  private static final String DOCUMENT_ID_PARAMETER = "documentId";
  private static final String PAGE_PARAMETER = "page";

  @Override
  public Feature getFeature() {
    return Feature.BASIC_USAGE;
  }

  @Override
  public void processPageRequest(PageRequestContext pageRequestContext) {
    Delfoi delfoi = RequestUtils.getDelfoi(pageRequestContext);
    
    Messages messages = Messages.getInstance();
    Locale locale = pageRequestContext.getRequest().getLocale();
    String lang = locale.getLanguage();
    
    Long resourceId = pageRequestContext.getLong(DOCUMENT_ID_PARAMETER);
    Integer pageId = pageRequestContext.getInteger(PAGE_PARAMETER);
    
    pageRequestContext.getRequest().setAttribute("delfoi", delfoi);

    try {
      Folder helpFolder = MaterialUtils.getDelfoiHelpFolder(delfoi, lang, RequestUtils.getUser(pageRequestContext));

      List<MaterialBean> folderMaterials = MaterialUtils.listFolderMaterials(helpFolder, true, true);
      Collections.sort(folderMaterials, new MaterialBeanNameComparator());

      Map<Long, List<MaterialBean>> materialTrees = MaterialUtils.listMaterialTrees(helpFolder, true, true);

      Document document = resolveDocument(resourceId, folderMaterials, materialTrees);
      appendDocument(pageRequestContext, document, resourceId, pageId);
      
      pageRequestContext.getRequest().setAttribute("helpMaterials", folderMaterials);
      pageRequestContext.getRequest().setAttribute("helpMaterialCount", MaterialUtils.getMaterialCount(helpFolder, true));
      pageRequestContext.getRequest().setAttribute("helpMaterialFolderId", helpFolder.getId());
      pageRequestContext.getRequest().setAttribute("helpMaterialTrees", materialTrees);
    } catch (IOException e) {
      throw new SmvcRuntimeException(EdelfoiStatusCode.GOOGLE_DOCS_FAILURE, messages.getText(locale, "exception.1012.googleDocsFailure"), e);
    }
 
    ActionUtils.includeRoleAccessList(pageRequestContext);
    
    pageRequestContext.setIncludeJSP("/jsp/pages/help.jsp");
  }
  
}