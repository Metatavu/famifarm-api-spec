package fi.metatavu.famifarm.rest.model;

import java.util.UUID;
import java.util.List;
import java.util.ArrayList;
import fi.metatavu.famifarm.rest.model.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Entry of products has been thrown away
 **/
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.media.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;
@Schema(description = "Entry of products has been thrown away")

public class WastageEventData   {
  private @Valid UUID reasonId = null;
  private @Valid Integer amount = null;

  /**
   * Id of reason a product has been thrown away
   **/
  public WastageEventData reasonId(UUID reasonId) {
    this.reasonId = reasonId;
    return this;
  }

  
  //@ApiModelProperty(value = "Id of reason a product has been thrown away")
  @JsonProperty("reasonId")

  public UUID getReasonId() {
    return reasonId;
  }
  public void setReasonId(UUID reasonId) {
    this.reasonId = reasonId;
  }

  /**
   **/
  public WastageEventData amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("amount")

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
    return Objects.equals(reasonId, wastageEventData.reasonId) &&
        Objects.equals(amount, wastageEventData.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasonId, amount);
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
