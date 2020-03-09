package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.famifarm.EncodingUtils;

import fi.metatavu.famifarm.client.model.ErrorResponse;
import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-09T14:11:42.122+02:00[Europe/Helsinki]")public interface ReportsApi extends ApiClient.Api {

  /**
   * Constructs report
   * 
   * @param type Report type (required)
   * @param fromTime From time of the report (optional)
   * @param toTime To time of the report (optional)
   * @return File
   */
  @RequestLine("GET /v1/reports/{type}?fromTime={fromTime}&toTime={toTime}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  File getReport(@Param("type") String type, @Param("fromTime") String fromTime, @Param("toTime") String toTime);

  /**
   * Constructs report
   * 
   * Note, this is equivalent to the other <code>getReport</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetReportQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param type Report type (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fromTime - From time of the report (optional)</li>
   *   <li>toTime - To time of the report (optional)</li>
   *   </ul>
   * @return File

   */
  @RequestLine("GET /v1/reports/{type}?fromTime={fromTime}&toTime={toTime}")
  @Headers({
      "Content-Type: application/json",
  })
  File getReport(@Param("type") String type, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getReport</code> method in a fluent style.
   */
  public static class GetReportQueryParams extends HashMap<String, Object> {
    public GetReportQueryParams fromTime(final String value) {
      put("fromTime", EncodingUtils.encode(value));
      return this;
    }
    public GetReportQueryParams toTime(final String value) {
      put("toTime", EncodingUtils.encode(value));
      return this;
    }
  }
}
