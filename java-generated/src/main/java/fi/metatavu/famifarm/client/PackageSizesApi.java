package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.famifarm.EncodingUtils;

import fi.metatavu.famifarm.client.model.ErrorResponse;
import fi.metatavu.famifarm.client.model.PackageSize;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-01-19T13:04:40.726+02:00[Europe/Helsinki]")public interface PackageSizesApi extends ApiClient.Api {

  /**
   * Create new package size
   * 
   * @param body Wastage reason to be added (required)
   * @return PackageSize
   */
  @RequestLine("POST /v1/packageSizes")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  PackageSize createPackageSize(PackageSize body);
  /**
   * Deletes a package size
   * 
   * @param packageSizeId PackageSizeId (required)
   */
  @RequestLine("DELETE /v1/packageSizes/{packageSizeId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  void deletePackageSize(@Param("packageSizeId") UUID packageSizeId);
  /**
   * Find a package size
   * 
   * @param packageSizeId Wastage reason id (required)
   * @return PackageSize
   */
  @RequestLine("GET /v1/packageSizes/{packageSizeId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  PackageSize findPackageSize(@Param("packageSizeId") UUID packageSizeId);
  /**
   * List all package sizes
   * 
   * @param firstResult First index of results to be returned (optional)
   * @param maxResults How many items to return at one time (optional)
   * @return List&lt;PackageSize&gt;
   */
  @RequestLine("GET /v1/packageSizes?firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  List<PackageSize> listPackageSizes(@Param("firstResult") Integer firstResult, @Param("maxResults") Integer maxResults);

  /**
   * List all package sizes
   * 
   * Note, this is equivalent to the other <code>listPackageSizes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListPackageSizesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>firstResult - First index of results to be returned (optional)</li>
   *   <li>maxResults - How many items to return at one time (optional)</li>
   *   </ul>
   * @return List&lt;PackageSize&gt;

   */
  @RequestLine("GET /v1/packageSizes?firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
      "Content-Type: application/json",
  })
  List<PackageSize> listPackageSizes(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listPackageSizes</code> method in a fluent style.
   */
  public static class ListPackageSizesQueryParams extends HashMap<String, Object> {
    public ListPackageSizesQueryParams firstResult(final Integer value) {
      put("firstResult", EncodingUtils.encode(value));
      return this;
    }
    public ListPackageSizesQueryParams maxResults(final Integer value) {
      put("maxResults", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Updates a package size
   * 
   * @param body Request payload (required)
   * @param packageSizeId Wastage reason id (required)
   * @return PackageSize
   */
  @RequestLine("PUT /v1/packageSizes/{packageSizeId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  PackageSize updatePackageSize(PackageSize body, @Param("packageSizeId") UUID packageSizeId);
}
