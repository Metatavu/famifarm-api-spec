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
 * PackingEventData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-21T14:10:27.946+02:00[Europe/Helsinki]")public class PackingEventData {

  @JsonProperty("packedAmount")

  private Integer packedAmount = null;

  @JsonProperty("packageSizeId")

  private UUID packageSizeId = null;
  public PackingEventData packedAmount(Integer packedAmount) {
    this.packedAmount = packedAmount;
    return this;
  }

  

  /**
  * Amount of packed items
  * @return packedAmount
  **/
  @Schema(description = "Amount of packed items")
  public Integer getPackedAmount() {
    return packedAmount;
  }
  public void setPackedAmount(Integer packedAmount) {
    this.packedAmount = packedAmount;
  }
  public PackingEventData packageSizeId(UUID packageSizeId) {
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
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackingEventData packingEventData = (PackingEventData) o;
    return Objects.equals(this.packedAmount, packingEventData.packedAmount) &&
        Objects.equals(this.packageSizeId, packingEventData.packageSizeId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(packedAmount, packageSizeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackingEventData {\n");
    
    sb.append("    packedAmount: ").append(toIndentedString(packedAmount)).append("\n");
    sb.append("    packageSizeId: ").append(toIndentedString(packageSizeId)).append("\n");
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
