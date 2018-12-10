package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import fi.metatavu.famifarm.EncodingUtils;

import fi.metatavu.famifarm.client.model.Batch;
import fi.metatavu.famifarm.client.model.Error;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-12-10T07:26:39.900+02:00[Europe/Helsinki]")public interface BatchesApi extends ApiClient.Api {

  /**
   * Create new batch
   * 
   * @param body Batch to be added (required)
   * @return Batch
   */
  @RequestLine("POST /batches")
  @Headers({
      "Accept: */*",
  })
  Batch createBatch(Batch body);
  /**
   * Deletes a batch
   * 
   * @param batchId BatchId (required)
   */
  @RequestLine("DELETE /batches/{batchId}")
  @Headers({
      "Accept: */*",
  })
  void deleteBatch(@Param("batchId") UUID batchId);
  /**
   * Find a batch
   * 
   * @param batchId Batch id (required)
   * @return Batch
   */
  @RequestLine("GET /batches/{batchId}")
  @Headers({
      "Accept: */*",
  })
  Batch findBatch(@Param("batchId") UUID batchId);
  /**
   * List all batches
   * 
   * @param maxResult How many items to return at one time (optional)
   * @return List&lt;Batch&gt;
   */
  @RequestLine("GET /batches?maxResult={maxResult}")
  @Headers({
      "Accept: */*",
  })
  List<Batch> listBatches(@Param("maxResult") Integer maxResult);

  /**
   * List all batches
   * 
   * Note, this is equivalent to the other <code>listBatches</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListBatchesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>maxResult - How many items to return at one time (optional)</li>
   *   </ul>
   * @return List&lt;Batch&gt;

   */
  @RequestLine("GET /batches?maxResult={maxResult}")
  @Headers({
      "Content-Type: */*",
  })
  List<Batch> listBatches(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listBatches</code> method in a fluent style.
   */
  public static class ListBatchesQueryParams extends HashMap<String, Object> {
    public ListBatchesQueryParams maxResult(final Integer value) {
      put("maxResult", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Updates a batch
   * 
   * @param body Request payload (required)
   * @param batchId Batch id (required)
   * @return Batch
   */
  @RequestLine("PUT /batches/{batchId}")
  @Headers({
      "Accept: */*",
  })
  Batch updateBatch(Batch body, @Param("batchId") UUID batchId);
}
