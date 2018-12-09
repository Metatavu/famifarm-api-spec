// package io.swagger.model;
package fi.metatavu.famifarm.rest.model;

import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class HarvestEventData   {
  
  private @Valid UUID teamId = null;

public enum TypeEnum {

    BAGGING(String.valueOf("BAGGING")), CUTTING(String.valueOf("CUTTING")), BOXING(String.valueOf("BOXING"));


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
  private @Valid UUID productionLineId = null;

  /**
   **/
  public HarvestEventData teamId(UUID teamId) {
    this.teamId = teamId;
    return this;
  }

  
  @JsonProperty("teamId")
  public UUID getTeamId() {
    return teamId;
  }
  public void setTeamId(UUID teamId) {
    this.teamId = teamId;
  }

  /**
   **/
  public HarvestEventData type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Production line id
   **/
  public HarvestEventData productionLineId(UUID productionLineId) {
    this.productionLineId = productionLineId;
    return this;
  }

  
  @JsonProperty("productionLineId")
  public UUID getProductionLineId() {
    return productionLineId;
  }
  public void setProductionLineId(UUID productionLineId) {
    this.productionLineId = productionLineId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HarvestEventData harvestEventData = (HarvestEventData) o;
    return Objects.equals(teamId, harvestEventData.teamId) &&
        Objects.equals(type, harvestEventData.type) &&
        Objects.equals(productionLineId, harvestEventData.productionLineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamId, type, productionLineId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HarvestEventData {\n");
    
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    productionLineId: ").append(toIndentedString(productionLineId)).append("\n");
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

