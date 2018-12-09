// package io.swagger.model;
package fi.metatavu.famifarm.rest.model;

import io.swagger.model.LocalizedEntry;
import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Product   {
  
  private @Valid UUID id = null;
  private @Valid LocalizedEntry name = null;
  private @Valid UUID defaultPackageSize = null;

  /**
   **/
  public Product id(UUID id) {
    this.id = id;
    return this;
  }

  
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

  
  @JsonProperty("name")
  public LocalizedEntry getName() {
    return name;
  }
  public void setName(LocalizedEntry name) {
    this.name = name;
  }

  /**
   **/
  public Product defaultPackageSize(UUID defaultPackageSize) {
    this.defaultPackageSize = defaultPackageSize;
    return this;
  }

  
  @JsonProperty("defaultPackageSize")
  public UUID getDefaultPackageSize() {
    return defaultPackageSize;
  }
  public void setDefaultPackageSize(UUID defaultPackageSize) {
    this.defaultPackageSize = defaultPackageSize;
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
        Objects.equals(defaultPackageSize, product.defaultPackageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, defaultPackageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    defaultPackageSize: ").append(toIndentedString(defaultPackageSize)).append("\n");
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

