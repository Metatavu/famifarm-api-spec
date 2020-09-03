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


public class CampaignProducts   {
  private @Valid UUID productId = null;
  private @Valid Integer count = null;

  /**
   **/
  public CampaignProducts productId(UUID productId) {
    this.productId = productId;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("productId")

  public UUID getProductId() {
    return productId;
  }
  public void setProductId(UUID productId) {
    this.productId = productId;
  }

  /**
   **/
  public CampaignProducts count(Integer count) {
    this.count = count;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("count")

  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignProducts campaignProducts = (CampaignProducts) o;
    return Objects.equals(productId, campaignProducts.productId) &&
        Objects.equals(count, campaignProducts.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignProducts {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
