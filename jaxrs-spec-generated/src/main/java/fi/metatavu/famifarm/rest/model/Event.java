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


public class Event   {
  private @Valid UUID id = null;
  private @Valid UUID batchId = null;
  private @Valid UUID userId = null;
  private @Valid OffsetDateTime startTime = null;
  private @Valid OffsetDateTime endTime = null;
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
  public Event batchId(UUID batchId) {
    this.batchId = batchId;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
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

  
  //@ApiModelProperty(required = true, value = "Id of user who added this entry")
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
  public Event startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  
  //@ApiModelProperty(value = "Time when the entry was added")
  @JsonProperty("startTime")

  public OffsetDateTime getStartTime() {
    return startTime;
  }
  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  /**
   * Time when the entry was added
   **/
  public Event endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  
  //@ApiModelProperty(value = "Time when the entry was added")
  @JsonProperty("endTime")

  public OffsetDateTime getEndTime() {
    return endTime;
  }
  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  /**
   **/
  public Event type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
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

  
  //@ApiModelProperty(required = true, value = "")
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
        Objects.equals(startTime, event.startTime) &&
        Objects.equals(endTime, event.endTime) &&
        Objects.equals(type, event.type) &&
        Objects.equals(data, event.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, batchId, userId, startTime, endTime, type, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
