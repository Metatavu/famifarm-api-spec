package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.famifarm.EncodingUtils;

import fi.metatavu.famifarm.client.model.CutPacking;
import fi.metatavu.famifarm.client.model.ErrorResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-24T18:18:32.873+02:00[Europe/Helsinki]")public interface CutPackingsApi extends ApiClient.Api {

  /**
   * Create a new cut packing
   * 
   * @param body A cut packing to be added (required)
   * @return CutPacking
   */
  @RequestLine("POST /v1/cutPackings")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  CutPacking createCutPacking(CutPacking body);
  /**
   * Deletes a cut packing
   * 
   * @param cutPackingId The id of a cut packing to delete (required)
   */
  @RequestLine("DELETE /v1/cutPackings/{cutPackingId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  void deleteCutPacking(@Param("cutPackingId") UUID cutPackingId);
  /**
   * Find a cut packing
   * 
   * @param cutPackingId The id of a cut packing to find (required)
   * @return CutPacking
   */
  @RequestLine("GET /v1/cutPackings/{cutPackingId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  CutPacking findCutPacking(@Param("cutPackingId") UUID cutPackingId);
  /**
   * List all cut packings
   * 
   * @param firstResult First index of results to be returned (optional)
   * @param maxResults How many items to return at one time (optional)
   * @param productId Filter results by product id (optional)
   * @param createdBefore Created before time (optional)
   * @param createdAfter Created after time (optional)
   * @return List&lt;CutPacking&gt;
   */
  @RequestLine("GET /v1/cutPackings?firstResult={firstResult}&maxResults={maxResults}&productId={productId}&createdBefore={createdBefore}&createdAfter={createdAfter}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  List<CutPacking> listCutPackings(@Param("firstResult") Integer firstResult, @Param("maxResults") Integer maxResults, @Param("productId") UUID productId, @Param("createdBefore") String createdBefore, @Param("createdAfter") String createdAfter);

  /**
   * List all cut packings
   * 
   * Note, this is equivalent to the other <code>listCutPackings</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListCutPackingsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>firstResult - First index of results to be returned (optional)</li>
   *   <li>maxResults - How many items to return at one time (optional)</li>
   *   <li>productId - Filter results by product id (optional)</li>
   *   <li>createdBefore - Created before time (optional)</li>
   *   <li>createdAfter - Created after time (optional)</li>
   *   </ul>
   * @return List&lt;CutPacking&gt;

   */
  @RequestLine("GET /v1/cutPackings?firstResult={firstResult}&maxResults={maxResults}&productId={productId}&createdBefore={createdBefore}&createdAfter={createdAfter}")
  @Headers({
      "Content-Type: application/json",
  })
  List<CutPacking> listCutPackings(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listCutPackings</code> method in a fluent style.
   */
  public static class ListCutPackingsQueryParams extends HashMap<String, Object> {
    public ListCutPackingsQueryParams firstResult(final Integer value) {
      put("firstResult", EncodingUtils.encode(value));
      return this;
    }
    public ListCutPackingsQueryParams maxResults(final Integer value) {
      put("maxResults", EncodingUtils.encode(value));
      return this;
    }
    public ListCutPackingsQueryParams productId(final UUID value) {
      put("productId", EncodingUtils.encode(value));
      return this;
    }
    public ListCutPackingsQueryParams createdBefore(final String value) {
      put("createdBefore", EncodingUtils.encode(value));
      return this;
    }
    public ListCutPackingsQueryParams createdAfter(final String value) {
      put("createdAfter", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Updates a cut packing
   * 
   * @param body Request payload (required)
   * @param cutPackingId The id of a cut packing to update (required)
   * @return CutPacking
   */
  @RequestLine("PUT /v1/cutPackings/{cutPackingId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  CutPacking updateCutPacking(CutPacking body, @Param("cutPackingId") UUID cutPackingId);
}
