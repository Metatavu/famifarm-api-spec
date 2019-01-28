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
 * Entry of products has been thrown away
 */
@Schema(description = "Entry of products has been thrown away")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-01-28T07:53:33.473+02:00[Europe/Helsinki]")public class WastageEventData {

  @JsonProperty("reasonId")

  private UUID reasonId = null;

  @JsonProperty("amount")

  private Integer amount = null;
  public WastageEventData reasonId(UUID reasonId) {
    this.reasonId = reasonId;
    return this;
  }

  

  /**
  * Id of reason a product has been thrown away
  * @return reasonId
  **/
  @Schema(description = "Id of reason a product has been thrown away")
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
  @Schema(description = "")
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
    WastageEventData wastageEventData = (WastageEventData) o;
    return Objects.equals(this.reasonId, wastageEventData.reasonId) &&
        Objects.equals(this.amount, wastageEventData.amount);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(reasonId, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WastageEventData {\n");
    
    sb.append("    reasonId: ").append(toIndentedString(reasonId)).append("\n");
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
