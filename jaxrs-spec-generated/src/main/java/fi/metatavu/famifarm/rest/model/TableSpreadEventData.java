package fi.metatavu.famifarm.rest.model;

import java.util.UUID;
import java.util.List;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import fi.metatavu.famifarm.rest.model.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Event of spreading the young plant trays to nursery tables
 **/
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.media.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;
@Schema(description = "Event of spreading the young plant trays to nursery tables")

public class TableSpreadEventData   {
  private @Valid Integer trayCount = null;
  private @Valid String location = null;

  /**
   * Count of trays used
   **/
  public TableSpreadEventData trayCount(Integer trayCount) {
    this.trayCount = trayCount;
    return this;
  }

  
  //@ApiModelProperty(value = "Count of trays used")
  @JsonProperty("trayCount")

  public Integer getTrayCount() {
    return trayCount;
  }
  public void setTrayCount(Integer trayCount) {
    this.trayCount = trayCount;
  }

  /**
   * Where the batch has been placed
   **/
  public TableSpreadEventData location(String location) {
    this.location = location;
    return this;
  }

  
  //@ApiModelProperty(value = "Where the batch has been placed")
  @JsonProperty("location")

  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableSpreadEventData tableSpreadEventData = (TableSpreadEventData) o;
    return Objects.equals(trayCount, tableSpreadEventData.trayCount) &&
        Objects.equals(location, tableSpreadEventData.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trayCount, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableSpreadEventData {\n");
    
    sb.append("    trayCount: ").append(toIndentedString(trayCount)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
