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
import fi.metatavu.famifarm.client.model.PotType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Entry when a batch has been sowed
 */
@Schema(description = "Entry when a batch has been sowed")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-25T14:58:19.013+02:00[Europe/Helsinki]")public class SowingEventData {

  @JsonProperty("productionLineId")

  private UUID productionLineId = null;

  @JsonProperty("seedBatchIds")

  private List<UUID> seedBatchIds = null;

  @JsonProperty("potType")

  private PotType potType = null;

  @JsonProperty("amount")

  private Integer amount = null;
  public SowingEventData productionLineId(UUID productionLineId) {
    this.productionLineId = productionLineId;
    return this;
  }

  

  /**
  * Get productionLineId
  * @return productionLineId
  **/
  @Schema(required = true, description = "")
  public UUID getProductionLineId() {
    return productionLineId;
  }
  public void setProductionLineId(UUID productionLineId) {
    this.productionLineId = productionLineId;
  }
  public SowingEventData seedBatchIds(List<UUID> seedBatchIds) {
    this.seedBatchIds = seedBatchIds;
    return this;
  }

  public SowingEventData addSeedBatchIdsItem(UUID seedBatchIdsItem) {
    if (this.seedBatchIds == null) {
      this.seedBatchIds = new ArrayList<>();
    }
    this.seedBatchIds.add(seedBatchIdsItem);
    return this;
  }

  /**
  * Get seedBatchIds
  * @return seedBatchIds
  **/
  @Schema(description = "")
  public List<UUID> getSeedBatchIds() {
    return seedBatchIds;
  }
  public void setSeedBatchIds(List<UUID> seedBatchIds) {
    this.seedBatchIds = seedBatchIds;
  }
  public SowingEventData potType(PotType potType) {
    this.potType = potType;
    return this;
  }

  

  /**
  * Get potType
  * @return potType
  **/
  @Schema(description = "")
  public PotType getPotType() {
    return potType;
  }
  public void setPotType(PotType potType) {
    this.potType = potType;
  }
  public SowingEventData amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  

  /**
  * Get amount
  * @return amount
  **/
  @Schema(required = true, description = "")
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
    return Objects.equals(this.productionLineId, sowingEventData.productionLineId) &&
        Objects.equals(this.seedBatchIds, sowingEventData.seedBatchIds) &&
        Objects.equals(this.potType, sowingEventData.potType) &&
        Objects.equals(this.amount, sowingEventData.amount);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(productionLineId, seedBatchIds, potType, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SowingEventData {\n");
    
    sb.append("    productionLineId: ").append(toIndentedString(productionLineId)).append("\n");
    sb.append("    seedBatchIds: ").append(toIndentedString(seedBatchIds)).append("\n");
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
