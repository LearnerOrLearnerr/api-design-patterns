package com.greengrocer.gen.entity;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * ProductsSummary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-02T22:12:19.538108500Z[Europe/London]", comments = "Generator version: 7.12.0")
public class ProductsSummary {

  private String productId;

  private String name;

  private @Nullable String sellUnit;

  private Double sellUnitPrice;

  private String sellUnitCurrency;

  private @Nullable Integer weight;

  private @Nullable String weightUnit;

  private @Nullable String imageUrl;

  private @Nullable String catalogIdsReference;

  private String barCode;

  @Valid
  private List<String> ingredients = new ArrayList<>();

  public ProductsSummary() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProductsSummary(String productId, String name, Double sellUnitPrice, String sellUnitCurrency, String barCode) {
    this.productId = productId;
    this.name = name;
    this.sellUnitPrice = sellUnitPrice;
    this.sellUnitCurrency = sellUnitCurrency;
    this.barCode = barCode;
  }

  public ProductsSummary productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
   */
  @NotNull 
  @Schema(name = "productId", example = "345", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("productId")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public ProductsSummary name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @NotNull 
  @Schema(name = "name", example = "Kulkuli", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductsSummary sellUnit(String sellUnit) {
    this.sellUnit = sellUnit;
    return this;
  }

  /**
   * Get sellUnit
   * @return sellUnit
   */
  
  @Schema(name = "sellUnit", example = "piece", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sellUnit")
  public String getSellUnit() {
    return sellUnit;
  }

  public void setSellUnit(String sellUnit) {
    this.sellUnit = sellUnit;
  }

  public ProductsSummary sellUnitPrice(Double sellUnitPrice) {
    this.sellUnitPrice = sellUnitPrice;
    return this;
  }

  /**
   * Get sellUnitPrice
   * @return sellUnitPrice
   */
  @NotNull 
  @Schema(name = "sellUnitPrice", example = "3.0", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sellUnitPrice")
  public Double getSellUnitPrice() {
    return sellUnitPrice;
  }

  public void setSellUnitPrice(Double sellUnitPrice) {
    this.sellUnitPrice = sellUnitPrice;
  }

  public ProductsSummary sellUnitCurrency(String sellUnitCurrency) {
    this.sellUnitCurrency = sellUnitCurrency;
    return this;
  }

  /**
   * Get sellUnitCurrency
   * @return sellUnitCurrency
   */
  @NotNull 
  @Schema(name = "sellUnitCurrency", example = "GBP", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sellUnitCurrency")
  public String getSellUnitCurrency() {
    return sellUnitCurrency;
  }

  public void setSellUnitCurrency(String sellUnitCurrency) {
    this.sellUnitCurrency = sellUnitCurrency;
  }

  public ProductsSummary weight(Integer weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
   */
  
  @Schema(name = "weight", example = "250", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weight")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public ProductsSummary weightUnit(String weightUnit) {
    this.weightUnit = weightUnit;
    return this;
  }

  /**
   * Get weightUnit
   * @return weightUnit
   */
  
  @Schema(name = "weightUnit", example = "ml", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weightUnit")
  public String getWeightUnit() {
    return weightUnit;
  }

  public void setWeightUnit(String weightUnit) {
    this.weightUnit = weightUnit;
  }

  public ProductsSummary imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
   */
  
  @Schema(name = "imageUrl", example = "https://greengrocers/images/4466", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imageUrl")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public ProductsSummary catalogIdsReference(String catalogIdsReference) {
    this.catalogIdsReference = catalogIdsReference;
    return this;
  }

  /**
   * Get catalogIdsReference
   * @return catalogIdsReference
   */
  
  @Schema(name = "catalogIdsReference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catalogIdsReference")
  public String getCatalogIdsReference() {
    return catalogIdsReference;
  }

  public void setCatalogIdsReference(String catalogIdsReference) {
    this.catalogIdsReference = catalogIdsReference;
  }

  public ProductsSummary barCode(String barCode) {
    this.barCode = barCode;
    return this;
  }

  /**
   * Get barCode
   * @return barCode
   */
  @NotNull 
  @Schema(name = "barCode", example = "99990", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("barCode")
  public String getBarCode() {
    return barCode;
  }

  public void setBarCode(String barCode) {
    this.barCode = barCode;
  }

  public ProductsSummary ingredients(List<String> ingredients) {
    this.ingredients = ingredients;
    return this;
  }

  public ProductsSummary addIngredientsItem(String ingredientsItem) {
    if (this.ingredients == null) {
      this.ingredients = new ArrayList<>();
    }
    this.ingredients.add(ingredientsItem);
    return this;
  }

  /**
   * Get ingredients
   * @return ingredients
   */
  
  @Schema(name = "ingredients", example = "[\"Coco\",\"Sugar\",\"Milk\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ingredients")
  public List<String> getIngredients() {
    return ingredients;
  }

  public void setIngredients(List<String> ingredients) {
    this.ingredients = ingredients;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductsSummary productsSummary = (ProductsSummary) o;
    return Objects.equals(this.productId, productsSummary.productId) &&
        Objects.equals(this.name, productsSummary.name) &&
        Objects.equals(this.sellUnit, productsSummary.sellUnit) &&
        Objects.equals(this.sellUnitPrice, productsSummary.sellUnitPrice) &&
        Objects.equals(this.sellUnitCurrency, productsSummary.sellUnitCurrency) &&
        Objects.equals(this.weight, productsSummary.weight) &&
        Objects.equals(this.weightUnit, productsSummary.weightUnit) &&
        Objects.equals(this.imageUrl, productsSummary.imageUrl) &&
        Objects.equals(this.catalogIdsReference, productsSummary.catalogIdsReference) &&
        Objects.equals(this.barCode, productsSummary.barCode) &&
        Objects.equals(this.ingredients, productsSummary.ingredients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, name, sellUnit, sellUnitPrice, sellUnitCurrency, weight, weightUnit, imageUrl, catalogIdsReference, barCode, ingredients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductsSummary {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sellUnit: ").append(toIndentedString(sellUnit)).append("\n");
    sb.append("    sellUnitPrice: ").append(toIndentedString(sellUnitPrice)).append("\n");
    sb.append("    sellUnitCurrency: ").append(toIndentedString(sellUnitCurrency)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    weightUnit: ").append(toIndentedString(weightUnit)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    catalogIdsReference: ").append(toIndentedString(catalogIdsReference)).append("\n");
    sb.append("    barCode: ").append(toIndentedString(barCode)).append("\n");
    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
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

