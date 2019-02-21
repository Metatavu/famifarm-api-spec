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
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;

/**
 * HarvestEventData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-21T07:07:18.869+02:00[Europe/Helsinki]")public class HarvestEventData {

  @JsonProperty("teamId")

  private UUID teamId = null;
  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    BAGGING("BAGGING"),
    CUTTING("CUTTING"),
    BOXING("BOXING");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }
  @JsonProperty("type")

  private TypeEnum type = null;

  @JsonProperty("productionLineId")

  private UUID productionLineId = null;
  public HarvestEventData teamId(UUID teamId) {
    this.teamId = teamId;
    return this;
  }

  

  /**
  * Get teamId
  * @return teamId
  **/
  @Schema(description = "")
  public UUID getTeamId() {
    return teamId;
  }
  public void setTeamId(UUID teamId) {
    this.teamId = teamId;
  }
  public HarvestEventData type(TypeEnum type) {
    this.type = type;
    return this;
  }

  

  /**
  * Get type
  * @return type
  **/
  @Schema(description = "")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }
  public HarvestEventData productionLineId(UUID productionLineId) {
    this.productionLineId = productionLineId;
    return this;
  }

  

  /**
  * Production line id
  * @return productionLineId
  **/
  @Schema(description = "Production line id")
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
    return Objects.equals(this.teamId, harvestEventData.teamId) &&
        Objects.equals(this.type, harvestEventData.type) &&
        Objects.equals(this.productionLineId, harvestEventData.productionLineId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(teamId, type, productionLineId);
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
