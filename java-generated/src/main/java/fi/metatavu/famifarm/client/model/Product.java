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
import fi.metatavu.famifarm.client.model.LocalizedEntry;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;

/**
 * Product
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-03T16:19:25.038+03:00[Europe/Helsinki]")public class Product {

  @JsonProperty("id")

  private UUID id = null;

  @JsonProperty("name")

  private LocalizedEntry name = null;

  @JsonProperty("defaultPackageSizeId")

  private UUID defaultPackageSizeId = null;
  public Product id(UUID id) {
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
  public Product name(LocalizedEntry name) {
    this.name = name;
    return this;
  }

  

  /**
  * Get name
  * @return name
  **/
  @Schema(description = "")
  public LocalizedEntry getName() {
    return name;
  }
  public void setName(LocalizedEntry name) {
    this.name = name;
  }
  public Product defaultPackageSizeId(UUID defaultPackageSizeId) {
    this.defaultPackageSizeId = defaultPackageSizeId;
    return this;
  }

  

  /**
  * Get defaultPackageSizeId
  * @return defaultPackageSizeId
  **/
  @Schema(description = "")
  public UUID getDefaultPackageSizeId() {
    return defaultPackageSizeId;
  }
  public void setDefaultPackageSizeId(UUID defaultPackageSizeId) {
    this.defaultPackageSizeId = defaultPackageSizeId;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.defaultPackageSizeId, product.defaultPackageSizeId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, name, defaultPackageSizeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    defaultPackageSizeId: ").append(toIndentedString(defaultPackageSizeId)).append("\n");
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
