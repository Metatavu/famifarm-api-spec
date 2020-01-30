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
import fi.metatavu.famifarm.client.model.EventType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;

/**
 * Entry of products has been thrown away
 */
@Schema(description = "Entry of products has been thrown away")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-30T15:17:14.560+02:00[Europe/Helsinki]")public class WastageEventData {

  @JsonProperty("reasonId")

  private UUID reasonId = null;

  @JsonProperty("amount")

  private Integer amount = null;

  @JsonProperty("productionLineId")

  private UUID productionLineId = null;

  @JsonProperty("phase")

  private EventType phase = null;
  public WastageEventData reasonId(UUID reasonId) {
    this.reasonId = reasonId;
    return this;
  }

  

  /**
  * Id of reason a product has been thrown away
  * @return reasonId
  **/
  @Schema(required = true, description = "Id of reason a product has been thrown away")
  public UUID getReasonId() {
    return reasonId;
  }
  public void setReasonId(UUID reasonId) {
    this.reasonId = reasonId;
  }
  public WastageEventData amount(Integer amount) {
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
  public WastageEventData productionLineId(UUID productionLineId) {
    this.productionLineId = productionLineId;
    return this;
  }

  

  /**
  * Get productionLineId
  * @return productionLineId
  **/
  @Schema(description = "")
  public UUID getProductionLineId() {
    return productionLineId;
  }
  public void setProductionLineId(UUID productionLineId) {
    this.productionLineId = productionLineId;
  }
  public WastageEventData phase(EventType phase) {
    this.phase = phase;
    return this;
  }

  

  /**
  * Get phase
  * @return phase
  **/
  @Schema(required = true, description = "")
  public EventType getPhase() {
    return phase;
  }
  public void setPhase(EventType phase) {
    this.phase = phase;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WastageEventData wastageEventData = (WastageEventData) o;
    return Objects.equals(this.reasonId, wastageEventData.reasonId) &&
        Objects.equals(this.amount, wastageEventData.amount) &&
        Objects.equals(this.productionLineId, wastageEventData.productionLineId) &&
        Objects.equals(this.phase, wastageEventData.phase);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(reasonId, amount, productionLineId, phase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WastageEventData {\n");
    
    sb.append("    reasonId: ").append(toIndentedString(reasonId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    productionLineId: ").append(toIndentedString(productionLineId)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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
