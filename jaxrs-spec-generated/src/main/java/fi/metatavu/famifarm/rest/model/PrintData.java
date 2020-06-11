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


public class PrintData   {
  private @Valid UUID packingId = null;

  /**
   **/
  public PrintData packingId(UUID packingId) {
    this.packingId = packingId;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("packingId")
  @NotNull

  public UUID getPackingId() {
    return packingId;
  }
  public void setPackingId(UUID packingId) {
    this.packingId = packingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrintData printData = (PrintData) o;
    return Objects.equals(packingId, printData.packingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrintData {\n");
    
    sb.append("    packingId: ").append(toIndentedString(packingId)).append("\n");
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
