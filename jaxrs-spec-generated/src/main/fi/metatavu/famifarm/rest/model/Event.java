// package io.swagger.model;
package fi.metatavu.famifarm.rest.model;

import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Event   {
  
  private @Valid UUID id = null;
  private @Valid UUID batchId = null;
  private @Valid UUID userId = null;
  private @Valid String time = null;

public enum TypeEnum {

    PLANTING(String.valueOf("PLANTING")), SOWING(String.valueOf("SOWING")), PACKING(String.valueOf("PACKING")), TABLE_SPREAD(String.valueOf("TABLE_SPREAD")), CULTIVATION_OBSERVATION(String.valueOf("CULTIVATION_OBSERVATION")), HARVEST(String.valueOf("HARVEST")), WASTEAGE(String.valueOf("WASTEAGE"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String v) {
        for (TypeEnum b : TypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  private @Valid TypeEnum type = null;
  private @Valid Object data = null;

  /**
   **/
  public Event id(UUID id) {
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
  public Event batchId(UUID batchId) {
    this.batchId = batchId;
    return this;
  }

  
  @JsonProperty("batchId")
  @NotNull
  public UUID getBatchId() {
    return batchId;
  }
  public void setBatchId(UUID batchId) {
    this.batchId = batchId;
  }

  /**
   * Id of user who added this entry
   **/
  public Event userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  
  @JsonProperty("userId")
  @NotNull
  public UUID getUserId() {
    return userId;
  }
  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  /**
   * Time when the entry was added
   **/
  public Event time(String time) {
    this.time = time;
    return this;
  }

  
  @JsonProperty("time")
  @NotNull
  public String getTime() {
    return time;
  }
  public void setTime(String time) {
    this.time = time;
  }

  /**
   **/
  public Event type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  public Event data(Object data) {
    this.data = data;
    return this;
  }

  
  @JsonProperty("data")
  @NotNull
  public Object getData() {
    return data;
  }
  public void setData(Object data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(id, event.id) &&
        Objects.equals(batchId, event.batchId) &&
        Objects.equals(userId, event.userId) &&
        Objects.equals(time, event.time) &&
        Objects.equals(type, event.type) &&
        Objects.equals(data, event.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, batchId, userId, time, type, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

