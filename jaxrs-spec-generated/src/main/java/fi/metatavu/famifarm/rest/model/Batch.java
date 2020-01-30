package fi.metatavu.famifarm.rest.model;

import java.util.UUID;
import java.util.List;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import fi.metatavu.famifarm.rest.model.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Identifies a single batch for it&#x27;s entire life-cycle
 **/
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.media.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;
@Schema(description = "Identifies a single batch for it's entire life-cycle")

public class Batch   {
  private @Valid UUID id = null;
  private @Valid UUID productId = null;
  private @Valid List<String> sowingLineNumbers = new ArrayList<>();
  private @Valid BatchPhase phase = null;
  private @Valid OffsetDateTime createdAt = null;

  /**
   **/
  public Batch id(UUID id) {
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
  public Batch productId(UUID productId) {
    this.productId = productId;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("productId")
  @NotNull

  public UUID getProductId() {
    return productId;
  }
  public void setProductId(UUID productId) {
    this.productId = productId;
  }

  /**
   * Read-only field that shows line numbers used in sowing phase
   **/
  public Batch sowingLineNumbers(List<String> sowingLineNumbers) {
    this.sowingLineNumbers = sowingLineNumbers;
    return this;
  }

  
  //@ApiModelProperty(value = "Read-only field that shows line numbers used in sowing phase")
  @JsonProperty("sowingLineNumbers")

  public List<String> getSowingLineNumbers() {
    return sowingLineNumbers;
  }
  public void setSowingLineNumbers(List<String> sowingLineNumbers) {
    this.sowingLineNumbers = sowingLineNumbers;
  }

  /**
   **/
  public Batch phase(BatchPhase phase) {
    this.phase = phase;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("phase")

  public BatchPhase getPhase() {
    return phase;
  }
  public void setPhase(BatchPhase phase) {
    this.phase = phase;
  }

  /**
   **/
  public Batch createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("createdAt")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
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
        Objects.equals(productId, batch.productId) &&
        Objects.equals(sowingLineNumbers, batch.sowingLineNumbers) &&
        Objects.equals(phase, batch.phase) &&
        Objects.equals(createdAt, batch.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productId, sowingLineNumbers, phase, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Batch {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    sowingLineNumbers: ").append(toIndentedString(sowingLineNumbers)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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
