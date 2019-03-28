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


public class ProductionLine   {
  private @Valid UUID id = null;
  private @Valid String lineNumber = null;
  private @Valid UUID defaultTeamId = null;
  private @Valid Integer defaultGutterHoleCount = null;

  /**
   **/
  public ProductionLine id(UUID id) {
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
  public ProductionLine lineNumber(String lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("lineNumber")

  public String getLineNumber() {
    return lineNumber;
  }
  public void setLineNumber(String lineNumber) {
    this.lineNumber = lineNumber;
  }

  /**
   **/
  public ProductionLine defaultTeamId(UUID defaultTeamId) {
    this.defaultTeamId = defaultTeamId;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("defaultTeamId")

  public UUID getDefaultTeamId() {
    return defaultTeamId;
  }
  public void setDefaultTeamId(UUID defaultTeamId) {
    this.defaultTeamId = defaultTeamId;
  }

  /**
   **/
  public ProductionLine defaultGutterHoleCount(Integer defaultGutterHoleCount) {
    this.defaultGutterHoleCount = defaultGutterHoleCount;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("defaultGutterHoleCount")

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
    return Objects.equals(id, productionLine.id) &&
        Objects.equals(lineNumber, productionLine.lineNumber) &&
        Objects.equals(defaultTeamId, productionLine.defaultTeamId) &&
        Objects.equals(defaultGutterHoleCount, productionLine.defaultGutterHoleCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lineNumber, defaultTeamId, defaultGutterHoleCount);
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
