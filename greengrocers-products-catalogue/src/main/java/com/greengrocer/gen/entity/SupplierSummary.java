package com.greengrocer.gen.entity;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.greengrocer.gen.entity.ProductsSummary;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SupplierSummary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-02T19:29:17.494839200Z[Europe/London]", comments = "Generator version: 7.12.0")
public class SupplierSummary {

  private String id;

  private String name;

  @Valid
  private List<@Valid ProductsSummary> products = new ArrayList<>();

  public SupplierSummary() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SupplierSummary(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public SupplierSummary id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @NotNull 
  @Schema(name = "id", example = "123", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SupplierSummary name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @NotNull 
  @Schema(name = "name", example = "World Record Breaker", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SupplierSummary products(List<@Valid ProductsSummary> products) {
    this.products = products;
    return this;
  }

  public SupplierSummary addProductsItem(ProductsSummary productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

  /**
   * Get products
   * @return products
   */
  @Valid 
  @Schema(name = "products", example = "[{\"productId\":345,\"name\":\"Kulkuli\",\"sellUnitPrice\":3.0,\"sellUnitCurrency\":\"GBP\",\"barCode\":\"99999\"}]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("products")
  public List<@Valid ProductsSummary> getProducts() {
    return products;
  }

  public void setProducts(List<@Valid ProductsSummary> products) {
    this.products = products;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupplierSummary supplierSummary = (SupplierSummary) o;
    return Objects.equals(this.id, supplierSummary.id) &&
        Objects.equals(this.name, supplierSummary.name) &&
        Objects.equals(this.products, supplierSummary.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, products);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplierSummary {\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

