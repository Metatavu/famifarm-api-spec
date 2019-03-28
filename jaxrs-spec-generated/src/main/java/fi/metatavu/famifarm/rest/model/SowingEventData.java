package fi.metatavu.famifarm.rest.model;

import java.util.UUID;
import java.util.List;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import fi.metatavu.famifarm.rest.model.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Entry when a batch has been sowed
 **/
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.media.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;
@Schema(description = "Entry when a batch has been sowed")

public class SowingEventData   {
  private @Valid UUID productionLineId = null;
  private @Valid UUID seedBatchId = null;
  private @Valid PotType potType = null;
  private @Valid Integer amount = null;

  /**
   **/
  public SowingEventData productionLineId(UUID productionLineId) {
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
  public SowingEventData seedBatchId(UUID seedBatchId) {
    this.seedBatchId = seedBatchId;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("seedBatchId")

  public UUID getSeedBatchId() {
    return seedBatchId;
  }
  public void setSeedBatchId(UUID seedBatchId) {
    this.seedBatchId = seedBatchId;
  }

  /**
   **/
  public SowingEventData potType(PotType potType) {
    this.potType = potType;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("potType")

  public PotType getPotType() {
    return potType;
  }
  public void setPotType(PotType potType) {
    this.potType = potType;
  }

  /**
   **/
  public SowingEventData amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("amount")
  @NotNull

  public Integer getAmount() {
    return amount;
  }
  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SowingEventData sowingEventData = (SowingEventData) o;
    return Objects.equals(productionLineId, sowingEventData.productionLineId) &&
        Objects.equals(seedBatchId, sowingEventData.seedBatchId) &&
        Objects.equals(potType, sowingEventData.potType) &&
        Objects.equals(amount, sowingEventData.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productionLineId, seedBatchId, potType, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SowingEventData {\n");
    
    sb.append("    productionLineId: ").append(toIndentedString(productionLineId)).append("\n");
    sb.append("    seedBatchId: ").append(toIndentedString(seedBatchId)).append("\n");
    sb.append("    potType: ").append(toIndentedString(potType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
