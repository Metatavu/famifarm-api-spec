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
 * PlantingEventData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-12T10:07:22.492+03:00[Europe/Helsinki]")public class PlantingEventData {

  @JsonProperty("productionLineId")

  private UUID productionLineId = null;

  @JsonProperty("gutterHoleCount")

  private Integer gutterHoleCount = null;

  @JsonProperty("gutterCount")

  private Integer gutterCount = null;

  @JsonProperty("trayCount")

  private Integer trayCount = null;

  @JsonProperty("workerCount")

  private Integer workerCount = null;
  public PlantingEventData productionLineId(UUID productionLineId) {
    this.productionLineId = productionLineId;
    return this;
  }

  

  /**
  * Production line id
  * @return productionLineId
  **/
  @Schema(description = "Production line id")
  public UUID getProductionLineId() {
    return productionLineId;
  }
  public void setProductionLineId(UUID productionLineId) {
    this.productionLineId = productionLineId;
  }
  public PlantingEventData gutterHoleCount(Integer gutterHoleCount) {
    this.gutterHoleCount = gutterHoleCount;
    return this;
  }

  

  /**
  * Number of holes in gutter used in planting
  * @return gutterHoleCount
  **/
  @Schema(description = "Number of holes in gutter used in planting")
  public Integer getGutterHoleCount() {
    return gutterHoleCount;
  }
  public void setGutterHoleCount(Integer gutterHoleCount) {
    this.gutterHoleCount = gutterHoleCount;
  }
  public PlantingEventData gutterCount(Integer gutterCount) {
    this.gutterCount = gutterCount;
    return this;
  }

  

  /**
  * How many gutter were used during the planting
  * @return gutterCount
  **/
  @Schema(description = "How many gutter were used during the planting")
  public Integer getGutterCount() {
    return gutterCount;
  }
  public void setGutterCount(Integer gutterCount) {
    this.gutterCount = gutterCount;
  }
  public PlantingEventData trayCount(Integer trayCount) {
    this.trayCount = trayCount;
    return this;
  }

  

  /**
  * How many trays were planted
  * @return trayCount
  **/
  @Schema(description = "How many trays were planted")
  public Integer getTrayCount() {
    return trayCount;
  }
  public void setTrayCount(Integer trayCount) {
    this.trayCount = trayCount;
  }
  public PlantingEventData workerCount(Integer workerCount) {
    this.workerCount = workerCount;
    return this;
  }

  

  /**
  * How many workers were doing the planting
  * @return workerCount
  **/
  @Schema(description = "How many workers were doing the planting")
  public Integer getWorkerCount() {
    return workerCount;
  }
  public void setWorkerCount(Integer workerCount) {
    this.workerCount = workerCount;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlantingEventData plantingEventData = (PlantingEventData) o;
    return Objects.equals(this.productionLineId, plantingEventData.productionLineId) &&
        Objects.equals(this.gutterHoleCount, plantingEventData.gutterHoleCount) &&
        Objects.equals(this.gutterCount, plantingEventData.gutterCount) &&
        Objects.equals(this.trayCount, plantingEventData.trayCount) &&
        Objects.equals(this.workerCount, plantingEventData.workerCount);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(productionLineId, gutterHoleCount, gutterCount, trayCount, workerCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlantingEventData {\n");
    
    sb.append("    productionLineId: ").append(toIndentedString(productionLineId)).append("\n");
    sb.append("    gutterHoleCount: ").append(toIndentedString(gutterHoleCount)).append("\n");
    sb.append("    gutterCount: ").append(toIndentedString(gutterCount)).append("\n");
    sb.append("    trayCount: ").append(toIndentedString(trayCount)).append("\n");
    sb.append("    workerCount: ").append(toIndentedString(workerCount)).append("\n");
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
