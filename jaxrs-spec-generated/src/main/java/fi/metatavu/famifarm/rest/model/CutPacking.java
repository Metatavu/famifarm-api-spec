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


public class CutPacking   {
  private @Valid UUID id = null;
  private @Valid Double weight = null;
  private @Valid UUID productId = null;
  private @Valid UUID productionLineId = null;
  private @Valid OffsetDateTime cuttingDay = null;
  private @Valid OffsetDateTime sowingDay = null;
  private @Valid String producer = null;
  private @Valid String contactInformation = null;
  private @Valid Integer gutterCount = null;
  private @Valid Integer gutterHoleCount = null;
  private @Valid String storageCondition = null;

  /**
   **/
  public CutPacking id(UUID id) {
    this.id = id;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("id")

  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   **/
  public CutPacking weight(Double weight) {
    this.weight = weight;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("weight")
  @NotNull

  public Double getWeight() {
    return weight;
  }
  public void setWeight(Double weight) {
    this.weight = weight;
  }

  /**
   **/
  public CutPacking productId(UUID productId) {
    this.productId = productId;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("productId")
  @NotNull

  public UUID getProductId() {
    return productId;
  }
  public void setProductId(UUID productId) {
    this.productId = productId;
  }

  /**
   **/
  public CutPacking productionLineId(UUID productionLineId) {
    this.productionLineId = productionLineId;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("productionLineId")
  @NotNull

  public UUID getProductionLineId() {
    return productionLineId;
  }
  public void setProductionLineId(UUID productionLineId) {
    this.productionLineId = productionLineId;
  }

  /**
   **/
  public CutPacking cuttingDay(OffsetDateTime cuttingDay) {
    this.cuttingDay = cuttingDay;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("cuttingDay")
  @NotNull

  public OffsetDateTime getCuttingDay() {
    return cuttingDay;
  }
  public void setCuttingDay(OffsetDateTime cuttingDay) {
    this.cuttingDay = cuttingDay;
  }

  /**
   **/
  public CutPacking sowingDay(OffsetDateTime sowingDay) {
    this.sowingDay = sowingDay;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("sowingDay")
  @NotNull

  public OffsetDateTime getSowingDay() {
    return sowingDay;
  }
  public void setSowingDay(OffsetDateTime sowingDay) {
    this.sowingDay = sowingDay;
  }

  /**
   **/
  public CutPacking producer(String producer) {
    this.producer = producer;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("producer")
  @NotNull

  public String getProducer() {
    return producer;
  }
  public void setProducer(String producer) {
    this.producer = producer;
  }

  /**
   **/
  public CutPacking contactInformation(String contactInformation) {
    this.contactInformation = contactInformation;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("contactInformation")
  @NotNull

  public String getContactInformation() {
    return contactInformation;
  }
  public void setContactInformation(String contactInformation) {
    this.contactInformation = contactInformation;
  }

  /**
   **/
  public CutPacking gutterCount(Integer gutterCount) {
    this.gutterCount = gutterCount;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("gutterCount")
  @NotNull

  public Integer getGutterCount() {
    return gutterCount;
  }
  public void setGutterCount(Integer gutterCount) {
    this.gutterCount = gutterCount;
  }

  /**
   **/
  public CutPacking gutterHoleCount(Integer gutterHoleCount) {
    this.gutterHoleCount = gutterHoleCount;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("gutterHoleCount")
  @NotNull

  public Integer getGutterHoleCount() {
    return gutterHoleCount;
  }
  public void setGutterHoleCount(Integer gutterHoleCount) {
    this.gutterHoleCount = gutterHoleCount;
  }

  /**
   **/
  public CutPacking storageCondition(String storageCondition) {
    this.storageCondition = storageCondition;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("storageCondition")
  @NotNull

  public String getStorageCondition() {
    return storageCondition;
  }
  public void setStorageCondition(String storageCondition) {
    this.storageCondition = storageCondition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CutPacking cutPacking = (CutPacking) o;
    return Objects.equals(id, cutPacking.id) &&
        Objects.equals(weight, cutPacking.weight) &&
        Objects.equals(productId, cutPacking.productId) &&
        Objects.equals(productionLineId, cutPacking.productionLineId) &&
        Objects.equals(cuttingDay, cutPacking.cuttingDay) &&
        Objects.equals(sowingDay, cutPacking.sowingDay) &&
        Objects.equals(producer, cutPacking.producer) &&
        Objects.equals(contactInformation, cutPacking.contactInformation) &&
        Objects.equals(gutterCount, cutPacking.gutterCount) &&
        Objects.equals(gutterHoleCount, cutPacking.gutterHoleCount) &&
        Objects.equals(storageCondition, cutPacking.storageCondition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, weight, productId, productionLineId, cuttingDay, sowingDay, producer, contactInformation, gutterCount, gutterHoleCount, storageCondition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CutPacking {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productionLineId: ").append(toIndentedString(productionLineId)).append("\n");
    sb.append("    cuttingDay: ").append(toIndentedString(cuttingDay)).append("\n");
    sb.append("    sowingDay: ").append(toIndentedString(sowingDay)).append("\n");
    sb.append("    producer: ").append(toIndentedString(producer)).append("\n");
    sb.append("    contactInformation: ").append(toIndentedString(contactInformation)).append("\n");
    sb.append("    gutterCount: ").append(toIndentedString(gutterCount)).append("\n");
    sb.append("    gutterHoleCount: ").append(toIndentedString(gutterHoleCount)).append("\n");
    sb.append("    storageCondition: ").append(toIndentedString(storageCondition)).append("\n");
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
