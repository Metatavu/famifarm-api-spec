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
import fi.metatavu.famifarm.client.model.EventType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Event
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-08T08:43:27.518+03:00[Europe/Helsinki]")public class Event {

  @JsonProperty("id")

  private UUID id = null;

  @JsonProperty("batchId")

  private UUID batchId = null;

  @JsonProperty("userId")

  private UUID userId = null;

  @JsonProperty("startTime")

  private OffsetDateTime startTime = null;

  @JsonProperty("endTime")

  private OffsetDateTime endTime = null;

  @JsonProperty("remainingUnits")

  private Integer remainingUnits = null;

  @JsonProperty("additionalInformation")

  private String additionalInformation = null;

  @JsonProperty("type")

  private EventType type = null;

  @JsonProperty("data")

  private Object data = null;
  public Event id(UUID id) {
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
  public Event batchId(UUID batchId) {
    this.batchId = batchId;
    return this;
  }

  

  /**
  * Get batchId
  * @return batchId
  **/
  @Schema(required = true, description = "")
  public UUID getBatchId() {
    return batchId;
  }
  public void setBatchId(UUID batchId) {
    this.batchId = batchId;
  }
  public Event userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  

  /**
  * Id of user who added this entry
  * @return userId
  **/
  @Schema(description = "Id of user who added this entry")
  public UUID getUserId() {
    return userId;
  }
  public void setUserId(UUID userId) {
    this.userId = userId;
  }
  public Event startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  

  /**
  * Time when the entry was added
  * @return startTime
  **/
  @Schema(description = "Time when the entry was added")
  public OffsetDateTime getStartTime() {
    return startTime;
  }
  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }
  public Event endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  

  /**
  * Time when the entry was added
  * @return endTime
  **/
  @Schema(description = "Time when the entry was added")
  public OffsetDateTime getEndTime() {
    return endTime;
  }
  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }
  /**
  * Get remainingUnits
  * @return remainingUnits
  **/
  @Schema(description = "")
  public Integer getRemainingUnits() {
    return remainingUnits;
  }
  public Event additionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  

  /**
  * Get additionalInformation
  * @return additionalInformation
  **/
  @Schema(description = "")
  public String getAdditionalInformation() {
    return additionalInformation;
  }
  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }
  public Event type(EventType type) {
    this.type = type;
    return this;
  }

  

  /**
  * Get type
  * @return type
  **/
  @Schema(required = true, description = "")
  public EventType getType() {
    return type;
  }
  public void setType(EventType type) {
    this.type = type;
  }
  public Event data(Object data) {
    this.data = data;
    return this;
  }

  

  /**
  * Get data
  * @return data
  **/
  @Schema(required = true, description = "")
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
    return Objects.equals(this.id, event.id) &&
        Objects.equals(this.batchId, event.batchId) &&
        Objects.equals(this.userId, event.userId) &&
        Objects.equals(this.startTime, event.startTime) &&
        Objects.equals(this.endTime, event.endTime) &&
        Objects.equals(this.remainingUnits, event.remainingUnits) &&
        Objects.equals(this.additionalInformation, event.additionalInformation) &&
        Objects.equals(this.type, event.type) &&
        Objects.equals(this.data, event.data);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, batchId, userId, startTime, endTime, remainingUnits, additionalInformation, type, data);
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
    sb.append("    remainingUnits: ").append(toIndentedString(remainingUnits)).append("\n");
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
