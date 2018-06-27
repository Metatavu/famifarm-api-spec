<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://edelphi.fi/_tags/edelfoi" prefix="ed"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
	<head>
	  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	  <title><fmt:message key="admin.manageUserSubscriptionLevels.editTitle"/></title>
	  <jsp:include page="/jsp/templates/index_head.jsp"></jsp:include>
    <jsp:include page="/jsp/supports/modalpopup_support.jsp"></jsp:include>
    <script type="text/javascript" src="${pageContext.request.contextPath}/_scripts/gui/admin/manageusersblockcontroller.js"></script>
	</head>
	<body class="environment_admin usersubscriptions">
    <c:set var="pageBreadcrumbTitle"><fmt:message key="admin.breadcrumb.searchUsers"/></c:set>
    <jsp:include page="/jsp/templates/index_header.jsp">
      <jsp:param value="management" name="activeTrail"/>
      <jsp:param value="${pageBreadcrumbTitle}" name="breadcrumbPageTitle"/>
      <jsp:param value="${pageContext.request.contextPath}/admin/manageusersubscriptions.page?lang=${dashboardLang}" name="breadcrumbPageUrl"/>
    </jsp:include>
    
    <div class="GUI_pageWrapper">
      <div class="GUI_pageContainer">
        <ed:include page="/jsp/blocks/admin/searchusers.jsp"/>
      </div>
    </div>

	</body>
</html>