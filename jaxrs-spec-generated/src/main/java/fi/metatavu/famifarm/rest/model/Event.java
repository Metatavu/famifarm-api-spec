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
  private @Valid UUID productId = null;
  private @Valid UUID userId = null;
  private @Valid OffsetDateTime startTime = null;
  private @Valid OffsetDateTime endTime = null;
  private @Valid String additionalInformation = null;
  private @Valid EventType type = null;
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
  public Event productId(UUID productId) {
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
   * Id of user who added this entry
   **/
  public Event userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  
  //@ApiModelProperty(value = "Id of user who added this entry")
  @JsonProperty("userId")

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
  public Event additionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("additionalInformation")

  public String getAdditionalInformation() {
    return additionalInformation;
  }
  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  /**
   **/
  public Event type(EventType type) {
    this.type = type;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  @NotNull

  public EventType getType() {
    return type;
  }
  public void setType(EventType type) {
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
        Objects.equals(productId, event.productId) &&
        Objects.equals(userId, event.userId) &&
        Objects.equals(startTime, event.startTime) &&
        Objects.equals(endTime, event.endTime) &&
        Objects.equals(additionalInformation, event.additionalInformation) &&
        Objects.equals(type, event.type) &&
        Objects.equals(data, event.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productId, userId, startTime, endTime, additionalInformation, type, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
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
