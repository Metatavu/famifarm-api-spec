package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import fi.metatavu.famifarm.EncodingUtils;

import fi.metatavu.famifarm.client.model.Error;
import fi.metatavu.famifarm.client.model.Product;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-12-10T07:26:39.900+02:00[Europe/Helsinki]")public interface ProductsApi extends ApiClient.Api {

  /**
   * Create new product
   * 
   * @param body Product to be added (required)
   * @return Product
   */
  @RequestLine("POST /products")
  @Headers({
      "Accept: */*",
  })
  Product createProduct(Product body);
  /**
   * Deletes a product
   * 
   * @param productId Product id (required)
   */
  @RequestLine("DELETE /products/{productId}")
  @Headers({
      "Accept: */*",
  })
  void deleteProduct(@Param("productId") UUID productId);
  /**
   * Find a product
   * 
   * @param productId Product id (required)
   * @return Product
   */
  @RequestLine("GET /products/{productId}")
  @Headers({
      "Accept: */*",
  })
  Product findProduct(@Param("productId") UUID productId);
  /**
   * List all products
   * 
   * @param firstResult First index of results to be returned (optional)
   * @param maxResults How many items to return at one time (optional)
   * @return List&lt;Product&gt;
   */
  @RequestLine("GET /products?firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
      "Accept: */*",
  })
  List<Product> listProducts(@Param("firstResult") Integer firstResult, @Param("maxResults") Integer maxResults);

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
   *   </ul>
   * @return List&lt;Product&gt;

   */
  @RequestLine("GET /products?firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
      "Content-Type: */*",
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
  }
  /**
   * Updates a product
   * 
   * @param body Request payload (required)
   * @param productId Product id (required)
   * @return Product
   */
  @RequestLine("PUT /products/{productId}")
  @Headers({
      "Accept: */*",
  })
  Product updateProduct(Product body, @Param("productId") UUID productId);
}
