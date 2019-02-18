package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import fi.metatavu.famifarm.EncodingUtils;

import fi.metatavu.famifarm.client.model.ErrorResponse;
import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-18T10:14:54.634+02:00[Europe/Helsinki]")public interface ReportsApi extends ApiClient.Api {

  /**
   * Constructs report
   * 
   * @param type Report type (required)
   * @return File
   */
  @RequestLine("GET /v1/reports/{type}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  File getReport(@Param("type") String type);
}
