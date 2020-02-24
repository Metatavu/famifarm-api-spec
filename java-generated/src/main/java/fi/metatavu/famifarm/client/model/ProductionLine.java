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
 * ProductionLine
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-24T14:17:22.156+02:00[Europe/Helsinki]")public class ProductionLine {

  @JsonProperty("id")

  private UUID id = null;

  @JsonProperty("lineNumber")

  private String lineNumber = null;

  @JsonProperty("defaultTeamId")

  private UUID defaultTeamId = null;

  @JsonProperty("defaultGutterHoleCount")

  private Integer defaultGutterHoleCount = null;
  public ProductionLine id(UUID id) {
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
  public ProductionLine lineNumber(String lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

  

  /**
  * Get lineNumber
  * @return lineNumber
  **/
  @Schema(description = "")
  public String getLineNumber() {
    return lineNumber;
  }
  public void setLineNumber(String lineNumber) {
    this.lineNumber = lineNumber;
  }
  public ProductionLine defaultTeamId(UUID defaultTeamId) {
    this.defaultTeamId = defaultTeamId;
    return this;
  }

  

  /**
  * Get defaultTeamId
  * @return defaultTeamId
  **/
  @Schema(description = "")
  public UUID getDefaultTeamId() {
    return defaultTeamId;
  }
  public void setDefaultTeamId(UUID defaultTeamId) {
    this.defaultTeamId = defaultTeamId;
  }
  public ProductionLine defaultGutterHoleCount(Integer defaultGutterHoleCount) {
    this.defaultGutterHoleCount = defaultGutterHoleCount;
    return this;
  }

  

  /**
  * Get defaultGutterHoleCount
  * @return defaultGutterHoleCount
  **/
  @Schema(description = "")
  public Integer getDefaultGutterHoleCount() {
    return defaultGutterHoleCount;
  }
  public void setDefaultGutterHoleCount(Integer defaultGutterHoleCount) {
    this.defaultGutterHoleCount = defaultGutterHoleCount;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductionLine productionLine = (ProductionLine) o;
    return Objects.equals(this.id, productionLine.id) &&
        Objects.equals(this.lineNumber, productionLine.lineNumber) &&
        Objects.equals(this.defaultTeamId, productionLine.defaultTeamId) &&
        Objects.equals(this.defaultGutterHoleCount, productionLine.defaultGutterHoleCount);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, lineNumber, defaultTeamId, defaultGutterHoleCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductionLine {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    defaultTeamId: ").append(toIndentedString(defaultTeamId)).append("\n");
    sb.append("    defaultGutterHoleCount: ").append(toIndentedString(defaultGutterHoleCount)).append("\n");
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
