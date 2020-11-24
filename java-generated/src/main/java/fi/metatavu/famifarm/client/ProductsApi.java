package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.famifarm.EncodingUtils;

import fi.metatavu.famifarm.client.model.ErrorResponse;
import fi.metatavu.famifarm.client.model.Product;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-24T18:18:32.873+02:00[Europe/Helsinki]")public interface ProductsApi extends ApiClient.Api {

  /**
   * Create new product
   * 
   * @param body Product to be added (required)
   * @return Product
   */
  @RequestLine("POST /v1/products")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Product createProduct(Product body);
  /**
   * Deletes a product
   * 
   * @param productId Product id (required)
   */
  @RequestLine("DELETE /v1/products/{productId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  void deleteProduct(@Param("productId") UUID productId);
  /**
   * Find a product
   * 
   * @param productId Product id (required)
   * @return Product
   */
  @RequestLine("GET /v1/products/{productId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Product findProduct(@Param("productId") UUID productId);
  /**
   * List all products
   * 
   * @param firstResult First index of results to be returned (optional)
   * @param maxResults How many items to return at one time (optional)
   * @param includeSubcontractorProducts Should subcontractor products be included. If this parameter is left undefined, it will interpreted as false (optional)
   * @return List&lt;Product&gt;
   */
  @RequestLine("GET /v1/products?firstResult={firstResult}&maxResults={maxResults}&includeSubcontractorProducts={includeSubcontractorProducts}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  List<Product> listProducts(@Param("firstResult") Integer firstResult, @Param("maxResults") Integer maxResults, @Param("includeSubcontractorProducts") Boolean includeSubcontractorProducts);

  /**
   * List all products
   * 
   * Note, this is equivalent to the other <code>listProducts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListProductsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>firstResult - First index of results to be returned (optional)</li>
   *   <li>maxResults - How many items to return at one time (optional)</li>
   *   <li>includeSubcontractorProducts - Should subcontractor products be included. If this parameter is left undefined, it will interpreted as false (optional)</li>
   *   </ul>
   * @return List&lt;Product&gt;

   */
  @RequestLine("GET /v1/products?firstResult={firstResult}&maxResults={maxResults}&includeSubcontractorProducts={includeSubcontractorProducts}")
  @Headers({
      "Content-Type: application/json",
  })
  List<Product> listProducts(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listProducts</code> method in a fluent style.
   */
  public static class ListProductsQueryParams extends HashMap<String, Object> {
    public ListProductsQueryParams firstResult(final Integer value) {
      put("firstResult", EncodingUtils.encode(value));
      return this;
    }
    public ListProductsQueryParams maxResults(final Integer value) {
      put("maxResults", EncodingUtils.encode(value));
      return this;
    }
    public ListProductsQueryParams includeSubcontractorProducts(final Boolean value) {
      put("includeSubcontractorProducts", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Updates a product
   * 
   * @param body Request payload (required)
   * @param productId Product id (required)
   * @return Product
   */
  @RequestLine("PUT /v1/products/{productId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Product updateProduct(Product body, @Param("productId") UUID productId);
}
