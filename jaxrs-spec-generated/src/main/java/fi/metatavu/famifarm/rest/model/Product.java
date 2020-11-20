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


public class Product   {
  private @Valid UUID id = null;
  private @Valid LocalizedEntry name = null;
  private @Valid UUID defaultPackageSizeId = null;
  private @Valid Boolean isSubcontractorProduct = null;

  /**
   **/
  public Product id(UUID id) {
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
  public Product name(LocalizedEntry name) {
    this.name = name;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("name")

  public LocalizedEntry getName() {
    return name;
  }
  public void setName(LocalizedEntry name) {
    this.name = name;
  }

  /**
   **/
  public Product defaultPackageSizeId(UUID defaultPackageSizeId) {
    this.defaultPackageSizeId = defaultPackageSizeId;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("defaultPackageSizeId")

  public UUID getDefaultPackageSizeId() {
    return defaultPackageSizeId;
  }
  public void setDefaultPackageSizeId(UUID defaultPackageSizeId) {
    this.defaultPackageSizeId = defaultPackageSizeId;
  }

  /**
   **/
  public Product isSubcontractorProduct(Boolean isSubcontractorProduct) {
    this.isSubcontractorProduct = isSubcontractorProduct;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("isSubcontractorProduct")
  @NotNull

  public Boolean isisIsSubcontractorProduct() {
    return isSubcontractorProduct;
  }
  public void setIsSubcontractorProduct(Boolean isSubcontractorProduct) {
    this.isSubcontractorProduct = isSubcontractorProduct;
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
    return Objects.equals(id, product.id) &&
        Objects.equals(name, product.name) &&
        Objects.equals(defaultPackageSizeId, product.defaultPackageSizeId) &&
        Objects.equals(isSubcontractorProduct, product.isSubcontractorProduct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, defaultPackageSizeId, isSubcontractorProduct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    defaultPackageSizeId: ").append(toIndentedString(defaultPackageSizeId)).append("\n");
    sb.append("    isSubcontractorProduct: ").append(toIndentedString(isSubcontractorProduct)).append("\n");
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
