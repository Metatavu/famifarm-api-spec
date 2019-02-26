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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-26T09:54:05.278+02:00[Europe/Helsinki]")public class PlantingEventData {

  @JsonProperty("productionLineId")

  private UUID productionLineId = null;

  @JsonProperty("gutterSize")

  private Integer gutterSize = null;

  @JsonProperty("gutterCount")

  private Integer gutterCount = null;

  @JsonProperty("cellCount")

  private Integer cellCount = null;

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
  public PlantingEventData gutterSize(Integer gutterSize) {
    this.gutterSize = gutterSize;
    return this;
  }

  

  /**
  * Size of gutter used in planting
  * @return gutterSize
  **/
  @Schema(description = "Size of gutter used in planting")
  public Integer getGutterSize() {
    return gutterSize;
  }
  public void setGutterSize(Integer gutterSize) {
    this.gutterSize = gutterSize;
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
  public PlantingEventData cellCount(Integer cellCount) {
    this.cellCount = cellCount;
    return this;
  }

  

  /**
  * How many cells were planted
  * @return cellCount
  **/
  @Schema(description = "How many cells were planted")
  public Integer getCellCount() {
    return cellCount;
  }
  public void setCellCount(Integer cellCount) {
    this.cellCount = cellCount;
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
        Objects.equals(this.gutterSize, plantingEventData.gutterSize) &&
        Objects.equals(this.gutterCount, plantingEventData.gutterCount) &&
        Objects.equals(this.cellCount, plantingEventData.cellCount) &&
        Objects.equals(this.workerCount, plantingEventData.workerCount);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(productionLineId, gutterSize, gutterCount, cellCount, workerCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlantingEventData {\n");
    
    sb.append("    productionLineId: ").append(toIndentedString(productionLineId)).append("\n");
    sb.append("    gutterSize: ").append(toIndentedString(gutterSize)).append("\n");
    sb.append("    gutterCount: ").append(toIndentedString(gutterCount)).append("\n");
    sb.append("    cellCount: ").append(toIndentedString(cellCount)).append("\n");
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
