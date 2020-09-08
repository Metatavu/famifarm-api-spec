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


public class Packing   {
  private @Valid UUID id = null;
  private @Valid UUID productId = null;
  private @Valid UUID campaignId = null;
  private @Valid OffsetDateTime time = null;
  private @Valid Integer packedCount = null;
  private @Valid UUID packageSizeId = null;
  private @Valid PackingState state = null;
  private @Valid PackingType type = null;

  /**
   **/
  public Packing id(UUID id) {
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
  public Packing productId(UUID productId) {
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
  public Packing campaignId(UUID campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("campaignId")

  public UUID getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(UUID campaignId) {
    this.campaignId = campaignId;
  }

  /**
   **/
  public Packing time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("time")
  @NotNull

  public OffsetDateTime getTime() {
    return time;
  }
  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  /**
   * Amount of created packages
   **/
  public Packing packedCount(Integer packedCount) {
    this.packedCount = packedCount;
    return this;
  }

  
  //@ApiModelProperty(value = "Amount of created packages")
  @JsonProperty("packedCount")

  public Integer getPackedCount() {
    return packedCount;
  }
  public void setPackedCount(Integer packedCount) {
    this.packedCount = packedCount;
  }

  /**
   **/
  public Packing packageSizeId(UUID packageSizeId) {
    this.packageSizeId = packageSizeId;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("packageSizeId")

  public UUID getPackageSizeId() {
    return packageSizeId;
  }
  public void setPackageSizeId(UUID packageSizeId) {
    this.packageSizeId = packageSizeId;
  }

  /**
   **/
  public Packing state(PackingState state) {
    this.state = state;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("state")
  @NotNull

  public PackingState getState() {
    return state;
  }
  public void setState(PackingState state) {
    this.state = state;
  }

  /**
   **/
  public Packing type(PackingType type) {
    this.type = type;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  @NotNull

  public PackingType getType() {
    return type;
  }
  public void setType(PackingType type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Packing packing = (Packing) o;
    return Objects.equals(id, packing.id) &&
        Objects.equals(productId, packing.productId) &&
        Objects.equals(campaignId, packing.campaignId) &&
        Objects.equals(time, packing.time) &&
        Objects.equals(packedCount, packing.packedCount) &&
        Objects.equals(packageSizeId, packing.packageSizeId) &&
        Objects.equals(state, packing.state) &&
        Objects.equals(type, packing.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productId, campaignId, time, packedCount, packageSizeId, state, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Packing {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    packedCount: ").append(toIndentedString(packedCount)).append("\n");
    sb.append("    packageSizeId: ").append(toIndentedString(packageSizeId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
