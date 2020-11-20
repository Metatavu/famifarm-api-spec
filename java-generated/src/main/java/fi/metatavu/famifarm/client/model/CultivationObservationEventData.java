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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * CultivationObservationEventData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-20T14:19:00.698+02:00[Europe/Helsinki]")public class CultivationObservationEventData {

  @JsonProperty("weight")

  private Double weight = null;

  @JsonProperty("pestIds")

  private List<UUID> pestIds = null;

  @JsonProperty("luminance")

  private Double luminance = null;

  @JsonProperty("performedActionIds")

  private List<UUID> performedActionIds = null;
  public CultivationObservationEventData weight(Double weight) {
    this.weight = weight;
    return this;
  }

  

  /**
  * Weight in grams
  * @return weight
  **/
  @Schema(description = "Weight in grams")
  public Double getWeight() {
    return weight;
  }
  public void setWeight(Double weight) {
    this.weight = weight;
  }
  public CultivationObservationEventData pestIds(List<UUID> pestIds) {
    this.pestIds = pestIds;
    return this;
  }

  public CultivationObservationEventData addPestIdsItem(UUID pestIdsItem) {
    if (this.pestIds == null) {
      this.pestIds = new ArrayList<>();
    }
    this.pestIds.add(pestIdsItem);
    return this;
  }

  /**
  * List of ids pests observed
  * @return pestIds
  **/
  @Schema(description = "List of ids pests observed")
  public List<UUID> getPestIds() {
    return pestIds;
  }
  public void setPestIds(List<UUID> pestIds) {
    this.pestIds = pestIds;
  }
  public CultivationObservationEventData luminance(Double luminance) {
    this.luminance = luminance;
    return this;
  }

  

  /**
  * Luminance in lumens on the time of observation
  * @return luminance
  **/
  @Schema(description = "Luminance in lumens on the time of observation")
  public Double getLuminance() {
    return luminance;
  }
  public void setLuminance(Double luminance) {
    this.luminance = luminance;
  }
  public CultivationObservationEventData performedActionIds(List<UUID> performedActionIds) {
    this.performedActionIds = performedActionIds;
    return this;
  }

  public CultivationObservationEventData addPerformedActionIdsItem(UUID performedActionIdsItem) {
    if (this.performedActionIds == null) {
      this.performedActionIds = new ArrayList<>();
    }
    this.performedActionIds.add(performedActionIdsItem);
    return this;
  }

  /**
  * List of ids of cultivation actions done based on observations
  * @return performedActionIds
  **/
  @Schema(description = "List of ids of cultivation actions done based on observations")
  public List<UUID> getPerformedActionIds() {
    return performedActionIds;
  }
  public void setPerformedActionIds(List<UUID> performedActionIds) {
    this.performedActionIds = performedActionIds;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CultivationObservationEventData cultivationObservationEventData = (CultivationObservationEventData) o;
    return Objects.equals(this.weight, cultivationObservationEventData.weight) &&
        Objects.equals(this.pestIds, cultivationObservationEventData.pestIds) &&
        Objects.equals(this.luminance, cultivationObservationEventData.luminance) &&
        Objects.equals(this.performedActionIds, cultivationObservationEventData.performedActionIds);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(weight, pestIds, luminance, performedActionIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CultivationObservationEventData {\n");
    
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    pestIds: ").append(toIndentedString(pestIds)).append("\n");
    sb.append("    luminance: ").append(toIndentedString(luminance)).append("\n");
    sb.append("    performedActionIds: ").append(toIndentedString(performedActionIds)).append("\n");
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
