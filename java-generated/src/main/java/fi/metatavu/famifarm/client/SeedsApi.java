package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.famifarm.EncodingUtils;

import fi.metatavu.famifarm.client.model.ErrorResponse;
import fi.metatavu.famifarm.client.model.Seed;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-13T22:48:42.208+02:00[Europe/Helsinki]")public interface SeedsApi extends ApiClient.Api {

  /**
   * Create new seed
   * 
   * @param body Seed to be added (required)
   * @return Seed
   */
  @RequestLine("POST /v1/seeds")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Seed createSeed(Seed body);
  /**
   * Deletes a seed
   * 
   * @param seedId Seed id (required)
   */
  @RequestLine("DELETE /v1/seeds/{seedId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  void deleteSeed(@Param("seedId") UUID seedId);
  /**
   * Find a seed
   * 
   * @param seedId Seed id (required)
   * @return Seed
   */
  @RequestLine("GET /v1/seeds/{seedId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Seed findSeed(@Param("seedId") UUID seedId);
  /**
   * List all seeds
   * 
   * @param firstResult First index of results to be returned (optional)
   * @param maxResults How many items to return at one time (optional)
   * @return List&lt;Seed&gt;
   */
  @RequestLine("GET /v1/seeds?firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  List<Seed> listSeeds(@Param("firstResult") Integer firstResult, @Param("maxResults") Integer maxResults);

  /**
   * List all seeds
   * 
   * Note, this is equivalent to the other <code>listSeeds</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListSeedsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>firstResult - First index of results to be returned (optional)</li>
   *   <li>maxResults - How many items to return at one time (optional)</li>
   *   </ul>
   * @return List&lt;Seed&gt;

   */
  @RequestLine("GET /v1/seeds?firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
      "Content-Type: application/json",
  })
  List<Seed> listSeeds(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listSeeds</code> method in a fluent style.
   */
  public static class ListSeedsQueryParams extends HashMap<String, Object> {
    public ListSeedsQueryParams firstResult(final Integer value) {
      put("firstResult", EncodingUtils.encode(value));
      return this;
    }
    public ListSeedsQueryParams maxResults(final Integer value) {
      put("maxResults", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Updates a seed
   * 
   * @param body Request payload (required)
   * @param seedId Seed id (required)
   * @return Seed
   */
  @RequestLine("PUT /v1/seeds/{seedId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Seed updateSeed(Seed body, @Param("seedId") UUID seedId);
}
