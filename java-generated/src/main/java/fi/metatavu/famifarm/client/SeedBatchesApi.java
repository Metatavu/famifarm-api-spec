package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.famifarm.EncodingUtils;

import fi.metatavu.famifarm.client.model.ErrorResponse;
import fi.metatavu.famifarm.client.model.SeedBatch;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-21T14:10:27.946+02:00[Europe/Helsinki]")public interface SeedBatchesApi extends ApiClient.Api {

  /**
   * Create new seed batch
   * 
   * @param body Wastage reason to be added (required)
   * @return SeedBatch
   */
  @RequestLine("POST /v1/seedBatches")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  SeedBatch createSeedBatch(SeedBatch body);
  /**
   * Deletes a seed batch
   * 
   * @param seedBatchId SeedBatchId (required)
   */
  @RequestLine("DELETE /v1/seedBatches/{seedBatchId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  void deleteSeedBatch(@Param("seedBatchId") UUID seedBatchId);
  /**
   * Find a seed batch
   * 
   * @param seedBatchId Wastage reason id (required)
   * @return SeedBatch
   */
  @RequestLine("GET /v1/seedBatches/{seedBatchId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  SeedBatch findSeedBatch(@Param("seedBatchId") UUID seedBatchId);
  /**
   * List all seed batches
   * 
   * @param firstResult First index of results to be returned (optional)
   * @param maxResults How many items to return at one time (optional)
   * @return List&lt;SeedBatch&gt;
   */
  @RequestLine("GET /v1/seedBatches?firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  List<SeedBatch> listSeedBatches(@Param("firstResult") Integer firstResult, @Param("maxResults") Integer maxResults);

  /**
   * List all seed batches
   * 
   * Note, this is equivalent to the other <code>listSeedBatches</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListSeedBatchesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>firstResult - First index of results to be returned (optional)</li>
   *   <li>maxResults - How many items to return at one time (optional)</li>
   *   </ul>
   * @return List&lt;SeedBatch&gt;

   */
  @RequestLine("GET /v1/seedBatches?firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
      "Content-Type: application/json",
  })
  List<SeedBatch> listSeedBatches(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listSeedBatches</code> method in a fluent style.
   */
  public static class ListSeedBatchesQueryParams extends HashMap<String, Object> {
    public ListSeedBatchesQueryParams firstResult(final Integer value) {
      put("firstResult", EncodingUtils.encode(value));
      return this;
    }
    public ListSeedBatchesQueryParams maxResults(final Integer value) {
      put("maxResults", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Updates a seed batch
   * 
   * @param body Request payload (required)
   * @param seedBatchId Wastage reason id (required)
   * @return SeedBatch
   */
  @RequestLine("PUT /v1/seedBatches/{seedBatchId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  SeedBatch updateSeedBatch(SeedBatch body, @Param("seedBatchId") UUID seedBatchId);
}
