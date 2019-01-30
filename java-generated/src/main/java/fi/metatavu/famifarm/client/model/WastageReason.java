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
import fi.metatavu.famifarm.client.model.LocalizedEntry;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;

/**
 * Reason why a product has been thrown away
 */
@Schema(description = "Reason why a product has been thrown away")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-01-30T10:50:19.546+02:00[Europe/Helsinki]")public class WastageReason {

  @JsonProperty("id")

  private UUID id = null;

  @JsonProperty("reason")

  private LocalizedEntry reason = null;
  public WastageReason id(UUID id) {
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
  public WastageReason reason(LocalizedEntry reason) {
    this.reason = reason;
    return this;
  }

  

  /**
  * Get reason
  * @return reason
  **/
  @Schema(description = "")
  public LocalizedEntry getReason() {
    return reason;
  }
  public void setReason(LocalizedEntry reason) {
    this.reason = reason;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WastageReason wastageReason = (WastageReason) o;
    return Objects.equals(this.id, wastageReason.id) &&
        Objects.equals(this.reason, wastageReason.reason);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WastageReason {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
