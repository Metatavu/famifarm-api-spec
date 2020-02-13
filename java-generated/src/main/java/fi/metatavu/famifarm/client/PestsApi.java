package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.famifarm.EncodingUtils;

import fi.metatavu.famifarm.client.model.ErrorResponse;
import fi.metatavu.famifarm.client.model.Pest;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-13T22:42:23.922+02:00[Europe/Helsinki]")public interface PestsApi extends ApiClient.Api {

  /**
   * Create new pest
   * 
   * @param body Pest to be added (required)
   * @return Pest
   */
  @RequestLine("POST /v1/pests")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Pest createPest(Pest body);
  /**
   * Deletes a pest
   * 
   * @param pestId Pest id (required)
   */
  @RequestLine("DELETE /v1/pests/{pestId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  void deletePest(@Param("pestId") UUID pestId);
  /**
   * Find a pest
   * 
   * @param pestId Pest id (required)
   * @return Pest
   */
  @RequestLine("GET /v1/pests/{pestId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Pest findPest(@Param("pestId") UUID pestId);
  /**
   * List all pests
   * 
   * @param firstResult First index of results to be returned (optional)
   * @param maxResults How many items to return at one time (optional)
   * @return List&lt;Pest&gt;
   */
  @RequestLine("GET /v1/pests?firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  List<Pest> listPests(@Param("firstResult") Integer firstResult, @Param("maxResults") Integer maxResults);

  /**
   * List all pests
   * 
   * Note, this is equivalent to the other <code>listPests</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListPestsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>firstResult - First index of results to be returned (optional)</li>
   *   <li>maxResults - How many items to return at one time (optional)</li>
   *   </ul>
   * @return List&lt;Pest&gt;

   */
  @RequestLine("GET /v1/pests?firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
      "Content-Type: application/json",
  })
  List<Pest> listPests(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listPests</code> method in a fluent style.
   */
  public static class ListPestsQueryParams extends HashMap<String, Object> {
    public ListPestsQueryParams firstResult(final Integer value) {
      put("firstResult", EncodingUtils.encode(value));
      return this;
    }
    public ListPestsQueryParams maxResults(final Integer value) {
      put("maxResults", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Updates a pest
   * 
   * @param body Request payload (required)
   * @param pestId Pest id (required)
   * @return Pest
   */
  @RequestLine("PUT /v1/pests/{pestId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Pest updatePest(Pest body, @Param("pestId") UUID pestId);
}
