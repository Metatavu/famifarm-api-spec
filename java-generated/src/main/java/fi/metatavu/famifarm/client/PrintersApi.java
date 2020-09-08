package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.famifarm.EncodingUtils;

import fi.metatavu.famifarm.client.model.ErrorResponse;
import fi.metatavu.famifarm.client.model.PrintData;
import fi.metatavu.famifarm.client.model.Printer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-08T08:43:27.518+03:00[Europe/Helsinki]")public interface PrintersApi extends ApiClient.Api {

  /**
   * List all connected printers
   * 
   * @return List&lt;Printer&gt;
   */
  @RequestLine("GET /v1/printers")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  List<Printer> listPrinters();
  /**
   * Print
   * 
   * @param body Data to print (required)
   * @param printerId Printer id (required)
   * @return Object
   */
  @RequestLine("POST /v1/printers/{printerId}/print")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Object print(PrintData body, @Param("printerId") String printerId);
}
