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


public class PackingEventData   {
  private @Valid Integer packedCount = null;
  private @Valid UUID packageSizeId = null;

  /**
   * Amount of created packages
   **/
  public PackingEventData packedCount(Integer packedCount) {
    this.packedCount = packedCount;
    return this;
  }

  
  //@ApiModelProperty(value = "Amount of created packages")
  @JsonProperty("packedCount")

  public Integer getPackedCount() {
    return packedCount;
  }
  public void setPackedCount(Integer packedCount) {
    this.packedCount = packedCount;
  }

  /**
   **/
  public PackingEventData packageSizeId(UUID packageSizeId) {
    this.packageSizeId = packageSizeId;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("packageSizeId")

  public UUID getPackageSizeId() {
    return packageSizeId;
  }
  public void setPackageSizeId(UUID packageSizeId) {
    this.packageSizeId = packageSizeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackingEventData packingEventData = (PackingEventData) o;
    return Objects.equals(packedCount, packingEventData.packedCount) &&
        Objects.equals(packageSizeId, packingEventData.packageSizeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packedCount, packageSizeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackingEventData {\n");
    
    sb.append("    packedCount: ").append(toIndentedString(packedCount)).append("\n");
    sb.append("    packageSizeId: ").append(toIndentedString(packageSizeId)).append("\n");
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
