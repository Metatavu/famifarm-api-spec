// package io.swagger.model;
package fi.metatavu.famifarm.rest.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Identifies a single batch for it&#39;s entire life-cycle
 **/
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Batch   {
  
  private @Valid UUID id = null;
  private @Valid UUID productId = null;

  /**
   **/
  public Batch id(UUID id) {
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
  public Batch productId(UUID productId) {
    this.productId = productId;
    return this;
  }

  
  @JsonProperty("productId")
  @NotNull
  public UUID getProductId() {
    return productId;
  }
  public void setProductId(UUID productId) {
    this.productId = productId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Batch batch = (Batch) o;
    return Objects.equals(id, batch.id) &&
        Objects.equals(productId, batch.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Batch {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

