package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.famifarm.EncodingUtils;

import fi.metatavu.famifarm.client.model.ErrorResponse;
import fi.metatavu.famifarm.client.model.Packing;
import fi.metatavu.famifarm.client.model.PackingState;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-01-19T13:04:40.726+02:00[Europe/Helsinki]")public interface PackingsApi extends ApiClient.Api {

  /**
   * Create new packing
   * 
   * @param body Packing to be added (required)
   * @return Packing
   */
  @RequestLine("POST /v1/packings")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Packing createPacking(Packing body);
  /**
   * Deletes a packing
   * 
   * @param packingId Packing id (required)
   */
  @RequestLine("DELETE /v1/packings/{packingId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  void deletePacking(@Param("packingId") UUID packingId);
  /**
   * Find a packing
   * 
   * @param packingId Packing id (required)
   * @return Packing
   */
  @RequestLine("GET /v1/packings/{packingId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Packing findPacking(@Param("packingId") UUID packingId);
  /**
   * List all packings
   * 
   * @param firstResult First index of results to be returned (optional)
   * @param maxResults How many items to return at one time (optional)
   * @param productId Filter results by product id (optional)
   * @param status Filter results by packing status (optional)
   * @param createdBefore Created before time (optional)
   * @param createdAfter Created after time (optional)
   * @return List&lt;Packing&gt;
   */
  @RequestLine("GET /v1/packings?firstResult={firstResult}&maxResults={maxResults}&productId={productId}&status={status}&createdBefore={createdBefore}&createdAfter={createdAfter}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  List<Packing> listPackings(@Param("firstResult") Integer firstResult, @Param("maxResults") Integer maxResults, @Param("productId") UUID productId, @Param("status") PackingState status, @Param("createdBefore") String createdBefore, @Param("createdAfter") String createdAfter);

  /**
   * List all packings
   * 
   * Note, this is equivalent to the other <code>listPackings</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListPackingsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>firstResult - First index of results to be returned (optional)</li>
   *   <li>maxResults - How many items to return at one time (optional)</li>
   *   <li>productId - Filter results by product id (optional)</li>
   *   <li>status - Filter results by packing status (optional)</li>
   *   <li>createdBefore - Created before time (optional)</li>
   *   <li>createdAfter - Created after time (optional)</li>
   *   </ul>
   * @return List&lt;Packing&gt;

   */
  @RequestLine("GET /v1/packings?firstResult={firstResult}&maxResults={maxResults}&productId={productId}&status={status}&createdBefore={createdBefore}&createdAfter={createdAfter}")
  @Headers({
      "Content-Type: application/json",
  })
  List<Packing> listPackings(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listPackings</code> method in a fluent style.
   */
  public static class ListPackingsQueryParams extends HashMap<String, Object> {
    public ListPackingsQueryParams firstResult(final Integer value) {
      put("firstResult", EncodingUtils.encode(value));
      return this;
    }
    public ListPackingsQueryParams maxResults(final Integer value) {
      put("maxResults", EncodingUtils.encode(value));
      return this;
    }
    public ListPackingsQueryParams productId(final UUID value) {
      put("productId", EncodingUtils.encode(value));
      return this;
    }
    public ListPackingsQueryParams status(final PackingState value) {
      put("status", EncodingUtils.encode(value));
      return this;
    }
    public ListPackingsQueryParams createdBefore(final String value) {
      put("createdBefore", EncodingUtils.encode(value));
      return this;
    }
    public ListPackingsQueryParams createdAfter(final String value) {
      put("createdAfter", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Updates a packing
   * 
   * @param body Request payload (required)
   * @param packingId Packing id (required)
   * @return Packing
   */
  @RequestLine("PUT /v1/packings/{packingId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Packing updatePacking(Packing body, @Param("packingId") UUID packingId);
}
