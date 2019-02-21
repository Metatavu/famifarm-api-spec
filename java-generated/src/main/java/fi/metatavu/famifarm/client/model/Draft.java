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
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Draft
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-21T09:49:47.708+02:00[Europe/Helsinki]")public class Draft {

  @JsonProperty("id")

  private UUID id = null;

  @JsonProperty("type")

  private String type = null;

  @JsonProperty("data")

  private String data = null;

  @JsonProperty("userId")

  private UUID userId = null;

  @JsonProperty("createdAt")

  private OffsetDateTime createdAt = null;
  public Draft id(UUID id) {
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
  public Draft type(String type) {
    this.type = type;
    return this;
  }

  

  /**
  * Get type
  * @return type
  **/
  @Schema(required = true, description = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  public Draft data(String data) {
    this.data = data;
    return this;
  }

  

  /**
  * Get data
  * @return data
  **/
  @Schema(required = true, description = "")
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }
  /**
  * Id of user who added draft
  * @return userId
  **/
  @Schema(description = "Id of user who added draft")
  public UUID getUserId() {
    return userId;
  }
  /**
  * Time when the draft was created
  * @return createdAt
  **/
  @Schema(description = "Time when the draft was created")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Draft draft = (Draft) o;
    return Objects.equals(this.id, draft.id) &&
        Objects.equals(this.type, draft.type) &&
        Objects.equals(this.data, draft.data) &&
        Objects.equals(this.userId, draft.userId) &&
        Objects.equals(this.createdAt, draft.createdAt);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, type, data, userId, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Draft {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
