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
import fi.metatavu.famifarm.client.model.CellType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;

/**
 * Entry when a batch has been sowed
 */
@Schema(description = "Entry when a batch has been sowed")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-01-30T10:50:19.546+02:00[Europe/Helsinki]")public class SowingEventData {

  @JsonProperty("productionLineId")

  private UUID productionLineId = null;

  @JsonProperty("gutterNumber")

  private Integer gutterNumber = null;

  @JsonProperty("seedBatchId")

  private UUID seedBatchId = null;

  @JsonProperty("cellType")

  private CellType cellType = null;

  @JsonProperty("amount")

  private Double amount = null;
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
  public SowingEventData gutterNumber(Integer gutterNumber) {
    this.gutterNumber = gutterNumber;
    return this;
  }

  

  /**
  * Get gutterNumber
  * @return gutterNumber
  **/
  @Schema(description = "")
  public Integer getGutterNumber() {
    return gutterNumber;
  }
  public void setGutterNumber(Integer gutterNumber) {
    this.gutterNumber = gutterNumber;
  }
  public SowingEventData seedBatchId(UUID seedBatchId) {
    this.seedBatchId = seedBatchId;
    return this;
  }

  

  /**
  * Get seedBatchId
  * @return seedBatchId
  **/
  @Schema(description = "")
  public UUID getSeedBatchId() {
    return seedBatchId;
  }
  public void setSeedBatchId(UUID seedBatchId) {
    this.seedBatchId = seedBatchId;
  }
  public SowingEventData cellType(CellType cellType) {
    this.cellType = cellType;
    return this;
  }

  

  /**
  * Get cellType
  * @return cellType
  **/
  @Schema(required = true, description = "")
  public CellType getCellType() {
    return cellType;
  }
  public void setCellType(CellType cellType) {
    this.cellType = cellType;
  }
  public SowingEventData amount(Double amount) {
    this.amount = amount;
    return this;
  }

  

  /**
  * Get amount
  * @return amount
  **/
  @Schema(required = true, description = "")
  public Double getAmount() {
    return amount;
  }
  public void setAmount(Double amount) {
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
        Objects.equals(this.gutterNumber, sowingEventData.gutterNumber) &&
        Objects.equals(this.seedBatchId, sowingEventData.seedBatchId) &&
        Objects.equals(this.cellType, sowingEventData.cellType) &&
        Objects.equals(this.amount, sowingEventData.amount);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(productionLineId, gutterNumber, seedBatchId, cellType, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SowingEventData {\n");
    
    sb.append("    productionLineId: ").append(toIndentedString(productionLineId)).append("\n");
    sb.append("    gutterNumber: ").append(toIndentedString(gutterNumber)).append("\n");
    sb.append("    seedBatchId: ").append(toIndentedString(seedBatchId)).append("\n");
    sb.append("    cellType: ").append(toIndentedString(cellType)).append("\n");
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
