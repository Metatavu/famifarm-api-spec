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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-21T09:20:59.306+02:00[Europe/Helsinki]")public class PackingEventData {

  @JsonProperty("packedAmount")

  private Integer packedAmount = null;

  @JsonProperty("packageSize")

  private UUID packageSize = null;
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
  public PackingEventData packageSize(UUID packageSize) {
    this.packageSize = packageSize;
    return this;
  }

  

  /**
  * Get packageSize
  * @return packageSize
  **/
  @Schema(description = "")
  public UUID getPackageSize() {
    return packageSize;
  }
  public void setPackageSize(UUID packageSize) {
    this.packageSize = packageSize;
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
        Objects.equals(this.packageSize, packingEventData.packageSize);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(packedAmount, packageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackingEventData {\n");
    
    sb.append("    packedAmount: ").append(toIndentedString(packedAmount)).append("\n");
    sb.append("    packageSize: ").append(toIndentedString(packageSize)).append("\n");
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
