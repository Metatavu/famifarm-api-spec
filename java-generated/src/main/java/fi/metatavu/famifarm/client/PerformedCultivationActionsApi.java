package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.famifarm.EncodingUtils;

import fi.metatavu.famifarm.client.model.ErrorResponse;
import fi.metatavu.famifarm.client.model.PerformedCultivationAction;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-20T14:36:54.043+02:00[Europe/Helsinki]")public interface PerformedCultivationActionsApi extends ApiClient.Api {

  /**
   * Create new performed cultivation action
   * 
   * @param body Wastage reason to be added (required)
   * @return PerformedCultivationAction
   */
  @RequestLine("POST /v1/performedCultivationActions")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  PerformedCultivationAction createPerformedCultivationAction(PerformedCultivationAction body);
  /**
   * Deletes a performed cultivation action
   * 
   * @param performedCultivationActionId PerformedCultivationActionId (required)
   */
  @RequestLine("DELETE /v1/performedCultivationActions/{performedCultivationActionId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  void deletePerformedCultivationAction(@Param("performedCultivationActionId") UUID performedCultivationActionId);
  /**
   * Find a performed cultivation action
   * 
   * @param performedCultivationActionId Wastage reason id (required)
   * @return PerformedCultivationAction
   */
  @RequestLine("GET /v1/performedCultivationActions/{performedCultivationActionId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  PerformedCultivationAction findPerformedCultivationAction(@Param("performedCultivationActionId") UUID performedCultivationActionId);
  /**
   * List all performed cultivation actions
   * 
   * @param firstResult First index of results to be returned (optional)
   * @param maxResults How many items to return at one time (optional)
   * @return List&lt;PerformedCultivationAction&gt;
   */
  @RequestLine("GET /v1/performedCultivationActions?firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  List<PerformedCultivationAction> listPerformedCultivationActions(@Param("firstResult") Integer firstResult, @Param("maxResults") Integer maxResults);

  /**
   * List all performed cultivation actions
   * 
   * Note, this is equivalent to the other <code>listPerformedCultivationActions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListPerformedCultivationActionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>firstResult - First index of results to be returned (optional)</li>
   *   <li>maxResults - How many items to return at one time (optional)</li>
   *   </ul>
   * @return List&lt;PerformedCultivationAction&gt;

   */
  @RequestLine("GET /v1/performedCultivationActions?firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
      "Content-Type: application/json",
  })
  List<PerformedCultivationAction> listPerformedCultivationActions(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listPerformedCultivationActions</code> method in a fluent style.
   */
  public static class ListPerformedCultivationActionsQueryParams extends HashMap<String, Object> {
    public ListPerformedCultivationActionsQueryParams firstResult(final Integer value) {
      put("firstResult", EncodingUtils.encode(value));
      return this;
    }
    public ListPerformedCultivationActionsQueryParams maxResults(final Integer value) {
      put("maxResults", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Updates a performed cultivation action
   * 
   * @param body Request payload (required)
   * @param performedCultivationActionId Wastage reason id (required)
   * @return PerformedCultivationAction
   */
  @RequestLine("PUT /v1/performedCultivationActions/{performedCultivationActionId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  PerformedCultivationAction updatePerformedCultivationAction(PerformedCultivationAction body, @Param("performedCultivationActionId") UUID performedCultivationActionId);
}
