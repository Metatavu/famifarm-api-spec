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
import fi.metatavu.famifarm.client.model.PackingState;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Packing
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-09T14:11:42.122+02:00[Europe/Helsinki]")public class Packing {

  @JsonProperty("id")

  private UUID id = null;

  @JsonProperty("productId")

  private UUID productId = null;

  @JsonProperty("time")

  private OffsetDateTime time = null;

  @JsonProperty("packedCount")

  private Integer packedCount = null;

  @JsonProperty("packageSizeId")

  private UUID packageSizeId = null;

  @JsonProperty("state")

  private PackingState state = null;
  public Packing id(UUID id) {
    this.id = id;
    return this;
  }

  

  /**
  * Get id
  * @return id
  **/
  @Schema(description = "")
  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }
  public Packing productId(UUID productId) {
    this.productId = productId;
    return this;
  }

  

  /**
  * Get productId
  * @return productId
  **/
  @Schema(required = true, description = "")
  public UUID getProductId() {
    return productId;
  }
  public void setProductId(UUID productId) {
    this.productId = productId;
  }
  public Packing time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  

  /**
  * Get time
  * @return time
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getTime() {
    return time;
  }
  public void setTime(OffsetDateTime time) {
    this.time = time;
  }
  public Packing packedCount(Integer packedCount) {
    this.packedCount = packedCount;
    return this;
  }

  

  /**
  * Amount of created packages
  * @return packedCount
  **/
  @Schema(description = "Amount of created packages")
  public Integer getPackedCount() {
    return packedCount;
  }
  public void setPackedCount(Integer packedCount) {
    this.packedCount = packedCount;
  }
  public Packing packageSizeId(UUID packageSizeId) {
    this.packageSizeId = packageSizeId;
    return this;
  }

  

  /**
  * Get packageSizeId
  * @return packageSizeId
  **/
  @Schema(description = "")
  public UUID getPackageSizeId() {
    return packageSizeId;
  }
  public void setPackageSizeId(UUID packageSizeId) {
    this.packageSizeId = packageSizeId;
  }
  public Packing state(PackingState state) {
    this.state = state;
    return this;
  }

  

  /**
  * Get state
  * @return state
  **/
  @Schema(required = true, description = "")
  public PackingState getState() {
    return state;
  }
  public void setState(PackingState state) {
    this.state = state;
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
    return Objects.equals(this.id, packing.id) &&
        Objects.equals(this.productId, packing.productId) &&
        Objects.equals(this.time, packing.time) &&
        Objects.equals(this.packedCount, packing.packedCount) &&
        Objects.equals(this.packageSizeId, packing.packageSizeId) &&
        Objects.equals(this.state, packing.state);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, productId, time, packedCount, packageSizeId, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Packing {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    packedCount: ").append(toIndentedString(packedCount)).append("\n");
    sb.append("    packageSizeId: ").append(toIndentedString(packageSizeId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
