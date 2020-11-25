package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.famifarm.EncodingUtils;

import fi.metatavu.famifarm.client.model.ErrorResponse;
import java.util.UUID;
import fi.metatavu.famifarm.client.model.WastageReason;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-25T14:58:19.013+02:00[Europe/Helsinki]")public interface WastageReasonsApi extends ApiClient.Api {

  /**
   * Create new wastage reason
   * 
   * @param body Wastage reason to be added (required)
   * @return WastageReason
   */
  @RequestLine("POST /v1/wastageReasons")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  WastageReason createWastageReason(WastageReason body);
  /**
   * Deletes an wastage reason
   * 
   * @param wastageReasonId WastageReasonId (required)
   */
  @RequestLine("DELETE /v1/wastageReasons/{wastageReasonId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  void deleteWastageReason(@Param("wastageReasonId") UUID wastageReasonId);
  /**
   * Find an wastage reason
   * 
   * @param wastageReasonId Wastage reason id (required)
   * @return WastageReason
   */
  @RequestLine("GET /v1/wastageReasons/{wastageReasonId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  WastageReason findWastageReason(@Param("wastageReasonId") UUID wastageReasonId);
  /**
   * List all wastage reasons
   * 
   * @param firstResult First index of results to be returned (optional)
   * @param maxResults How many items to return at one time (optional)
   * @return List&lt;WastageReason&gt;
   */
  @RequestLine("GET /v1/wastageReasons?firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  List<WastageReason> listWastageReasons(@Param("firstResult") Integer firstResult, @Param("maxResults") Integer maxResults);

  /**
   * List all wastage reasons
   * 
   * Note, this is equivalent to the other <code>listWastageReasons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListWastageReasonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>firstResult - First index of results to be returned (optional)</li>
   *   <li>maxResults - How many items to return at one time (optional)</li>
   *   </ul>
   * @return List&lt;WastageReason&gt;

   */
  @RequestLine("GET /v1/wastageReasons?firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
      "Content-Type: application/json",
  })
  List<WastageReason> listWastageReasons(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listWastageReasons</code> method in a fluent style.
   */
  public static class ListWastageReasonsQueryParams extends HashMap<String, Object> {
    public ListWastageReasonsQueryParams firstResult(final Integer value) {
      put("firstResult", EncodingUtils.encode(value));
      return this;
    }
    public ListWastageReasonsQueryParams maxResults(final Integer value) {
      put("maxResults", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Updates an wastage reason
   * 
   * @param body Request payload (required)
   * @param wastageReasonId Wastage reason id (required)
   * @return WastageReason
   */
  @RequestLine("PUT /v1/wastageReasons/{wastageReasonId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  WastageReason updateWastageReason(WastageReason body, @Param("wastageReasonId") UUID wastageReasonId);
}
