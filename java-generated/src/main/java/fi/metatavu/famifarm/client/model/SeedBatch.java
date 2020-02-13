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
 * SeedBatch
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-13T22:48:42.208+02:00[Europe/Helsinki]")public class SeedBatch {

  @JsonProperty("id")

  private UUID id = null;

  @JsonProperty("code")

  private String code = null;

  @JsonProperty("seedId")

  private UUID seedId = null;

  @JsonProperty("time")

  private OffsetDateTime time = null;

  @JsonProperty("active")

  private Boolean active = null;
  public SeedBatch id(UUID id) {
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
  public SeedBatch code(String code) {
    this.code = code;
    return this;
  }

  

  /**
  * Manufacturer&#x27;s code for the batch
  * @return code
  **/
  @Schema(description = "Manufacturer's code for the batch")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
  public SeedBatch seedId(UUID seedId) {
    this.seedId = seedId;
    return this;
  }

  

  /**
  * Get seedId
  * @return seedId
  **/
  @Schema(description = "")
  public UUID getSeedId() {
    return seedId;
  }
  public void setSeedId(UUID seedId) {
    this.seedId = seedId;
  }
  public SeedBatch time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  

  /**
  * Time when the seed has arrived
  * @return time
  **/
  @Schema(description = "Time when the seed has arrived")
  public OffsetDateTime getTime() {
    return time;
  }
  public void setTime(OffsetDateTime time) {
    this.time = time;
  }
  public SeedBatch active(Boolean active) {
    this.active = active;
    return this;
  }

  

  /**
  * if seed batch is active
  * @return active
  **/
  @Schema(description = "if seed batch is active")
  public Boolean isActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeedBatch seedBatch = (SeedBatch) o;
    return Objects.equals(this.id, seedBatch.id) &&
        Objects.equals(this.code, seedBatch.code) &&
        Objects.equals(this.seedId, seedBatch.seedId) &&
        Objects.equals(this.time, seedBatch.time) &&
        Objects.equals(this.active, seedBatch.active);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, code, seedId, time, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeedBatch {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    seedId: ").append(toIndentedString(seedId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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
