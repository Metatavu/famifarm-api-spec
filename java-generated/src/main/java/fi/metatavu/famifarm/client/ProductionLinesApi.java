package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.famifarm.EncodingUtils;

import fi.metatavu.famifarm.client.model.ErrorResponse;
import fi.metatavu.famifarm.client.model.ProductionLine;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-18T07:31:56.542+02:00[Europe/Helsinki]")public interface ProductionLinesApi extends ApiClient.Api {

  /**
   * Create new production line
   * 
   * @param body Wastage reason to be added (required)
   * @return ProductionLine
   */
  @RequestLine("POST /v1/productionLines")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  ProductionLine createProductionLine(ProductionLine body);
  /**
   * Deletes a production line
   * 
   * @param productionLineId ProductionLineId (required)
   */
  @RequestLine("DELETE /v1/productionLines/{productionLineId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  void deleteProductionLine(@Param("productionLineId") UUID productionLineId);
  /**
   * Find a production line
   * 
   * @param productionLineId Wastage reason id (required)
   * @return ProductionLine
   */
  @RequestLine("GET /v1/productionLines/{productionLineId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  ProductionLine findProductionLine(@Param("productionLineId") UUID productionLineId);
  /**
   * List all production lines
   * 
   * @param firstResult First index of results to be returned (optional)
   * @param maxResults How many items to return at one time (optional)
   * @return List&lt;ProductionLine&gt;
   */
  @RequestLine("GET /v1/productionLines?firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  List<ProductionLine> listProductionLines(@Param("firstResult") Integer firstResult, @Param("maxResults") Integer maxResults);

  /**
   * List all production lines
   * 
   * Note, this is equivalent to the other <code>listProductionLines</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListProductionLinesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>firstResult - First index of results to be returned (optional)</li>
   *   <li>maxResults - How many items to return at one time (optional)</li>
   *   </ul>
   * @return List&lt;ProductionLine&gt;

   */
  @RequestLine("GET /v1/productionLines?firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
      "Content-Type: application/json",
  })
  List<ProductionLine> listProductionLines(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listProductionLines</code> method in a fluent style.
   */
  public static class ListProductionLinesQueryParams extends HashMap<String, Object> {
    public ListProductionLinesQueryParams firstResult(final Integer value) {
      put("firstResult", EncodingUtils.encode(value));
      return this;
    }
    public ListProductionLinesQueryParams maxResults(final Integer value) {
      put("maxResults", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Updates a production line
   * 
   * @param body Request payload (required)
   * @param productionLineId Wastage reason id (required)
   * @return ProductionLine
   */
  @RequestLine("PUT /v1/productionLines/{productionLineId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  ProductionLine updateProductionLine(ProductionLine body, @Param("productionLineId") UUID productionLineId);
}
