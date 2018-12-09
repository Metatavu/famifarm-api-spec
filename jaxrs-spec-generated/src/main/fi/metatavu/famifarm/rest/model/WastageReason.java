// package io.swagger.model;
package fi.metatavu.famifarm.rest.model;

import io.swagger.model.LocalizedEntry;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Reason why a product has been thrown away
 **/
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WastageReason   {
  
  private @Valid UUID id = null;
  private @Valid LocalizedEntry reason = null;

  /**
   **/
  public WastageReason id(UUID id) {
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
  public WastageReason reason(LocalizedEntry reason) {
    this.reason = reason;
    return this;
  }

  
  @JsonProperty("reason")
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
    return Objects.equals(id, wastageReason.id) &&
        Objects.equals(reason, wastageReason.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, reason);
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

