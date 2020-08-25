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

/**
 * Event of spreading the young plant trays to nursery tables
 */
@Schema(description = "Event of spreading the young plant trays to nursery tables")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-25T11:16:55.980+03:00[Europe/Helsinki]")public class TableSpreadEventData {

  @JsonProperty("trayCount")

  private Integer trayCount = null;
  public TableSpreadEventData trayCount(Integer trayCount) {
    this.trayCount = trayCount;
    return this;
  }

  

  /**
  * Count of trays used
  * @return trayCount
  **/
  @Schema(description = "Count of trays used")
  public Integer getTrayCount() {
    return trayCount;
  }
  public void setTrayCount(Integer trayCount) {
    this.trayCount = trayCount;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableSpreadEventData tableSpreadEventData = (TableSpreadEventData) o;
    return Objects.equals(this.trayCount, tableSpreadEventData.trayCount);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(trayCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableSpreadEventData {\n");
    
    sb.append("    trayCount: ").append(toIndentedString(trayCount)).append("\n");
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
