// package io.swagger.model;
package fi.metatavu.famifarm.rest.model;

import io.swagger.model.LocalizedEntry;
import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PerformedCultivationAction   {
  
  private @Valid UUID id = null;
  private @Valid LocalizedEntry name = null;

  /**
   **/
  public PerformedCultivationAction id(UUID id) {
    this.id = id;
    return this;
  }

  
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   **/
  public PerformedCultivationAction name(LocalizedEntry name) {
    this.name = name;
    return this;
  }

  
  @JsonProperty("name")
  public LocalizedEntry getName() {
    return name;
  }
  public void setName(LocalizedEntry name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerformedCultivationAction performedCultivationAction = (PerformedCultivationAction) o;
    return Objects.equals(id, performedCultivationAction.id) &&
        Objects.equals(name, performedCultivationAction.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformedCultivationAction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

