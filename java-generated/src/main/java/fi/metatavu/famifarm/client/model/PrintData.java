/*
 * Famifarm-API
 * Famifarm API specification
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package fi.metatavu.famifarm.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;

/**
 * PrintData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-25T11:16:55.980+03:00[Europe/Helsinki]")public class PrintData {

  @JsonProperty("packingId")

  private UUID packingId = null;
  public PrintData packingId(UUID packingId) {
    this.packingId = packingId;
    return this;
  }

  

  /**
  * Get packingId
  * @return packingId
  **/
  @Schema(required = true, description = "")
  public UUID getPackingId() {
    return packingId;
  }
  public void setPackingId(UUID packingId) {
    this.packingId = packingId;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrintData printData = (PrintData) o;
    return Objects.equals(this.packingId, printData.packingId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(packingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrintData {\n");
    
    sb.append("    packingId: ").append(toIndentedString(packingId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
