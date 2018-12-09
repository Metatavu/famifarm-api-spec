// package io.swagger.model;
package fi.metatavu.famifarm.rest.model;

import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SeedBatch   {
  
  private @Valid UUID id = null;
  private @Valid String code = null;
  private @Valid UUID seedId = null;
  private @Valid String time = null;

  /**
   **/
  public SeedBatch id(UUID id) {
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
   * Manufacturer&#39;s code for the batch
   **/
  public SeedBatch code(String code) {
    this.code = code;
    return this;
  }

  
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   **/
  public SeedBatch seedId(UUID seedId) {
    this.seedId = seedId;
    return this;
  }

  
  @JsonProperty("seedId")
  public UUID getSeedId() {
    return seedId;
  }
  public void setSeedId(UUID seedId) {
    this.seedId = seedId;
  }

  /**
   * Time when the seed has arrived
   **/
  public SeedBatch time(String time) {
    this.time = time;
    return this;
  }

  
  @JsonProperty("time")
  public String getTime() {
    return time;
  }
  public void setTime(String time) {
    this.time = time;
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
    return Objects.equals(id, seedBatch.id) &&
        Objects.equals(code, seedBatch.code) &&
        Objects.equals(seedId, seedBatch.seedId) &&
        Objects.equals(time, seedBatch.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, seedId, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeedBatch {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    seedId: ").append(toIndentedString(seedId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

