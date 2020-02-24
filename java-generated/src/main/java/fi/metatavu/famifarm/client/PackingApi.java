package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.famifarm.EncodingUtils;

import fi.metatavu.famifarm.client.model.ErrorResponse;
import fi.metatavu.famifarm.client.model.Packing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-24T14:03:26.829+02:00[Europe/Helsinki]")public interface PackingApi extends ApiClient.Api {

  /**
   * Create new packing
   * 
   * @param body Packing to be added (required)
   * @return Packing
   */
  @RequestLine("POST /v1/packings")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Packing createPackaging(Packing body);
}
