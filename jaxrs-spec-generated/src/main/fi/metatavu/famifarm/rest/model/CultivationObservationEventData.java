// package io.swagger.model;
package fi.metatavu.famifarm.rest.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CultivationObservationEventData   {
  
  private @Valid Double weight = null;
  private @Valid String pests = null;
  private @Valid Double luminance = null;
  private @Valid List<UUID> performedActionIds = new ArrayList<>();

  /**
   * Weight in grams
   **/
  public CultivationObservationEventData weight(Double weight) {
    this.weight = weight;
    return this;
  }

  
  @JsonProperty("weight")
  public Double getWeight() {
    return weight;
  }
  public void setWeight(Double weight) {
    this.weight = weight;
  }

  /**
   * Possible pest observations
   **/
  public CultivationObservationEventData pests(String pests) {
    this.pests = pests;
    return this;
  }

  
  @JsonProperty("pests")
  public String getPests() {
    return pests;
  }
  public void setPests(String pests) {
    this.pests = pests;
  }

  /**
   * Luminance in lumens on the time of observation
   **/
  public CultivationObservationEventData luminance(Double luminance) {
    this.luminance = luminance;
    return this;
  }

  
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
        Objects.equals(pests, cultivationObservationEventData.pests) &&
        Objects.equals(luminance, cultivationObservationEventData.luminance) &&
        Objects.equals(performedActionIds, cultivationObservationEventData.performedActionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weight, pests, luminance, performedActionIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CultivationObservationEventData {\n");
    
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    pests: ").append(toIndentedString(pests)).append("\n");
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

