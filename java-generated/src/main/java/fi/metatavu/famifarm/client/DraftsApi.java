package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.famifarm.EncodingUtils;

import fi.metatavu.famifarm.client.model.Draft;
import fi.metatavu.famifarm.client.model.ErrorResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-06T14:19:55.440+02:00[Europe/Helsinki]")public interface DraftsApi extends ApiClient.Api {

  /**
   * Create new draft
   * 
   * @param body Draft body (required)
   * @return Draft
   */
  @RequestLine("POST /v1/drafts")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Draft createDraft(Draft body);
  /**
   * Deletes a draft
   * 
   * @param draftId Draft id (required)
   */
  @RequestLine("DELETE /v1/drafts/{draftId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  void deleteDraft(@Param("draftId") UUID draftId);
  /**
   * List all drafts
   * 
   * @param userId User id who&#x27;s drafts are beign listed (required)
   * @param type Type of draft (required)
   * @return List&lt;Draft&gt;
   */
  @RequestLine("GET /v1/drafts?userId={userId}&type={type}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  List<Draft> listDrafts(@Param("userId") UUID userId, @Param("type") String type);

  /**
   * List all drafts
   * 
   * Note, this is equivalent to the other <code>listDrafts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListDraftsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>userId - User id who&#x27;s drafts are beign listed (required)</li>
   *   <li>type - Type of draft (required)</li>
   *   </ul>
   * @return List&lt;Draft&gt;

   */
  @RequestLine("GET /v1/drafts?userId={userId}&type={type}")
  @Headers({
      "Content-Type: application/json",
  })
  List<Draft> listDrafts(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listDrafts</code> method in a fluent style.
   */
  public static class ListDraftsQueryParams extends HashMap<String, Object> {
    public ListDraftsQueryParams userId(final UUID value) {
      put("userId", EncodingUtils.encode(value));
      return this;
    }
    public ListDraftsQueryParams type(final String value) {
      put("type", EncodingUtils.encode(value));
      return this;
    }
  }
}
