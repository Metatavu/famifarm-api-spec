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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-20T14:36:54.043+02:00[Europe/Helsinki]")public class TableSpreadEventData {

  @JsonProperty("tableCount")

  private Integer tableCount = null;

  @JsonProperty("location")

  private String location = null;
  public TableSpreadEventData tableCount(Integer tableCount) {
    this.tableCount = tableCount;
    return this;
  }

  

  /**
  * Count of tables used
  * @return tableCount
  **/
  @Schema(description = "Count of tables used")
  public Integer getTableCount() {
    return tableCount;
  }
  public void setTableCount(Integer tableCount) {
    this.tableCount = tableCount;
  }
  public TableSpreadEventData location(String location) {
    this.location = location;
    return this;
  }

  

  /**
  * Where the batch has been placed
  * @return location
  **/
  @Schema(description = "Where the batch has been placed")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
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
    return Objects.equals(this.tableCount, tableSpreadEventData.tableCount) &&
        Objects.equals(this.location, tableSpreadEventData.location);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(tableCount, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableSpreadEventData {\n");
    
    sb.append("    tableCount: ").append(toIndentedString(tableCount)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
