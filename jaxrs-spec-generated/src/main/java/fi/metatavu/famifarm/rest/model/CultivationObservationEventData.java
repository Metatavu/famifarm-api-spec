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


public class CultivationObservationEventData   {
  private @Valid Double weight = null;
  private @Valid List<UUID> pestIds = new ArrayList<>();
  private @Valid Double luminance = null;
  private @Valid List<UUID> performedActionIds = new ArrayList<>();

  /**
   * Weight in grams
   **/
  public CultivationObservationEventData weight(Double weight) {
    this.weight = weight;
    return this;
  }

  
  //@ApiModelProperty(value = "Weight in grams")
  @JsonProperty("weight")

  public Double getWeight() {
    return weight;
  }
  public void setWeight(Double weight) {
    this.weight = weight;
  }

  /**
   * List of ids pests observed
   **/
  public CultivationObservationEventData pestIds(List<UUID> pestIds) {
    this.pestIds = pestIds;
    return this;
  }

  
  //@ApiModelProperty(value = "List of ids pests observed")
  @JsonProperty("pestIds")

  public List<UUID> getPestIds() {
    return pestIds;
  }
  public void setPestIds(List<UUID> pestIds) {
    this.pestIds = pestIds;
  }

  /**
   * Luminance in lumens on the time of observation
   **/
  public CultivationObservationEventData luminance(Double luminance) {
    this.luminance = luminance;
    return this;
  }

  
  //@ApiModelProperty(value = "Luminance in lumens on the time of observation")
  @JsonProperty("luminance")

  public Double getLuminance() {
    return luminance;
  }
  public void setLuminance(Double luminance) {
    this.luminance = luminance;
  }

  /**
   * List of ids of cultivation actions done based on observations
   **/
  public CultivationObservationEventData performedActionIds(List<UUID> performedActionIds) {
    this.performedActionIds = performedActionIds;
    return this;
  }

  
  //@ApiModelProperty(value = "List of ids of cultivation actions done based on observations")
  @JsonProperty("performedActionIds")

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
    return Objects.equals(weight, cultivationObservationEventData.weight) &&
        Objects.equals(pestIds, cultivationObservationEventData.pestIds) &&
        Objects.equals(luminance, cultivationObservationEventData.luminance) &&
        Objects.equals(performedActionIds, cultivationObservationEventData.performedActionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weight, pestIds, luminance, performedActionIds);
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
