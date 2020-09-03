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


public class Campaign   {
  private @Valid UUID id = null;
  private @Valid String name = null;
  private @Valid List<CampaignProducts> products = new ArrayList<>();

  /**
   **/
  public Campaign id(UUID id) {
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
  public Campaign name(String name) {
    this.name = name;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  @NotNull

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public Campaign products(List<CampaignProducts> products) {
    this.products = products;
    return this;
  }

  
  //@ApiModelProperty(required = true, value = "")
  @JsonProperty("products")
  @NotNull

  public List<CampaignProducts> getProducts() {
    return products;
  }
  public void setProducts(List<CampaignProducts> products) {
    this.products = products;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Campaign campaign = (Campaign) o;
    return Objects.equals(id, campaign.id) &&
        Objects.equals(name, campaign.name) &&
        Objects.equals(products, campaign.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, products);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Campaign {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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
