package fi.metatavu.famifarm.rest.model;

import java.util.UUID;
import java.util.List;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import fi.metatavu.famifarm.rest.model.*;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.media.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;


public class PlantingEventData   {
  private @Valid UUID productionLineId = null;
  private @Valid Integer gutterSize = null;
  private @Valid Integer gutterCount = null;
  private @Valid Integer trayCount = null;
  private @Valid Integer workerCount = null;

  /**
   * Production line id
   **/
  public PlantingEventData productionLineId(UUID productionLineId) {
    this.productionLineId = productionLineId;
    return this;
  }

  
  //@ApiModelProperty(value = "Production line id")
  @JsonProperty("productionLineId")

  public UUID getProductionLineId() {
    return productionLineId;
  }
  public void setProductionLineId(UUID productionLineId) {
    this.productionLineId = productionLineId;
  }

  /**
   * Size of gutter used in planting
   **/
  public PlantingEventData gutterSize(Integer gutterSize) {
    this.gutterSize = gutterSize;
    return this;
  }

  
  //@ApiModelProperty(value = "Size of gutter used in planting")
  @JsonProperty("gutterSize")

  public Integer getGutterSize() {
    return gutterSize;
  }
  public void setGutterSize(Integer gutterSize) {
    this.gutterSize = gutterSize;
  }

  /**
   * How many gutter were used during the planting
   **/
  public PlantingEventData gutterCount(Integer gutterCount) {
    this.gutterCount = gutterCount;
    return this;
  }

  
  //@ApiModelProperty(value = "How many gutter were used during the planting")
  @JsonProperty("gutterCount")

  public Integer getGutterCount() {
    return gutterCount;
  }
  public void setGutterCount(Integer gutterCount) {
    this.gutterCount = gutterCount;
  }

  /**
   * How many trays were planted
   **/
  public PlantingEventData trayCount(Integer trayCount) {
    this.trayCount = trayCount;
    return this;
  }

  
  //@ApiModelProperty(value = "How many trays were planted")
  @JsonProperty("trayCount")

  public Integer getTrayCount() {
    return trayCount;
  }
  public void setTrayCount(Integer trayCount) {
    this.trayCount = trayCount;
  }

  /**
   * How many workers were doing the planting
   **/
  public PlantingEventData workerCount(Integer workerCount) {
    this.workerCount = workerCount;
    return this;
  }

  
  //@ApiModelProperty(value = "How many workers were doing the planting")
  @JsonProperty("workerCount")

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
    return Objects.equals(productionLineId, plantingEventData.productionLineId) &&
        Objects.equals(gutterSize, plantingEventData.gutterSize) &&
        Objects.equals(gutterCount, plantingEventData.gutterCount) &&
        Objects.equals(trayCount, plantingEventData.trayCount) &&
        Objects.equals(workerCount, plantingEventData.workerCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productionLineId, gutterSize, gutterCount, trayCount, workerCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlantingEventData {\n");
    
    sb.append("    productionLineId: ").append(toIndentedString(productionLineId)).append("\n");
    sb.append("    gutterSize: ").append(toIndentedString(gutterSize)).append("\n");
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
