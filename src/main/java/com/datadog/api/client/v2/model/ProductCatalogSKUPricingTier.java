/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** A usage range and the price that applies to usage falling inside it. */
@JsonPropertyOrder({
  ProductCatalogSKUPricingTier.JSON_PROPERTY_MAX_USAGE_QUANTITY,
  ProductCatalogSKUPricingTier.JSON_PROPERTY_MIN_USAGE_QUANTITY,
  ProductCatalogSKUPricingTier.JSON_PROPERTY_PRICE,
  ProductCatalogSKUPricingTier.JSON_PROPERTY_PRICING_UNIT_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductCatalogSKUPricingTier {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MAX_USAGE_QUANTITY = "max_usage_quantity";
  private Long maxUsageQuantity;

  public static final String JSON_PROPERTY_MIN_USAGE_QUANTITY = "min_usage_quantity";
  private Long minUsageQuantity;

  public static final String JSON_PROPERTY_PRICE = "price";
  private String price;

  public static final String JSON_PROPERTY_PRICING_UNIT_TYPE = "pricing_unit_type";
  private ProductCatalogSKUPricingUnitType pricingUnitType;

  public ProductCatalogSKUPricingTier() {}

  @JsonCreator
  public ProductCatalogSKUPricingTier(
      @JsonProperty(required = true, value = JSON_PROPERTY_MAX_USAGE_QUANTITY)
          Long maxUsageQuantity,
      @JsonProperty(required = true, value = JSON_PROPERTY_MIN_USAGE_QUANTITY)
          Long minUsageQuantity,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRICE) String price,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRICING_UNIT_TYPE)
          ProductCatalogSKUPricingUnitType pricingUnitType) {
    this.maxUsageQuantity = maxUsageQuantity;
    if (maxUsageQuantity != null) {}
    this.minUsageQuantity = minUsageQuantity;
    this.price = price;
    this.pricingUnitType = pricingUnitType;
    this.unparsed |= !pricingUnitType.isValid();
  }

  public ProductCatalogSKUPricingTier maxUsageQuantity(Long maxUsageQuantity) {
    this.maxUsageQuantity = maxUsageQuantity;
    if (maxUsageQuantity != null) {}
    return this;
  }

  /**
   * The exclusive upper bound of the usage range the tier prices. <code>null</code> on the final
   * tier, which is unbounded.
   *
   * @return maxUsageQuantity
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_USAGE_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getMaxUsageQuantity() {
    return maxUsageQuantity;
  }

  public void setMaxUsageQuantity(Long maxUsageQuantity) {
    this.maxUsageQuantity = maxUsageQuantity;
  }

  public ProductCatalogSKUPricingTier minUsageQuantity(Long minUsageQuantity) {
    this.minUsageQuantity = minUsageQuantity;
    return this;
  }

  /**
   * The inclusive lower bound of the usage range the tier prices.
   *
   * @return minUsageQuantity
   */
  @JsonProperty(JSON_PROPERTY_MIN_USAGE_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getMinUsageQuantity() {
    return minUsageQuantity;
  }

  public void setMinUsageQuantity(Long minUsageQuantity) {
    this.minUsageQuantity = minUsageQuantity;
  }

  public ProductCatalogSKUPricingTier price(String price) {
    this.price = price;
    return this;
  }

  /**
   * The price applied to usage in the tier, as a decimal string. The number of decimal places is
   * not normalized, so free tiers appear as either <code>0</code> or <code>0.00</code>.
   *
   * @return price
   */
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public ProductCatalogSKUPricingTier pricingUnitType(
      ProductCatalogSKUPricingUnitType pricingUnitType) {
    this.pricingUnitType = pricingUnitType;
    this.unparsed |= !pricingUnitType.isValid();
    return this;
  }

  /**
   * Whether the tier's price applies per unit of usage or to a block of usage.
   *
   * @return pricingUnitType
   */
  @JsonProperty(JSON_PROPERTY_PRICING_UNIT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductCatalogSKUPricingUnitType getPricingUnitType() {
    return pricingUnitType;
  }

  public void setPricingUnitType(ProductCatalogSKUPricingUnitType pricingUnitType) {
    if (!pricingUnitType.isValid()) {
      this.unparsed = true;
    }
    this.pricingUnitType = pricingUnitType;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ProductCatalogSKUPricingTier
   */
  @JsonAnySetter
  public ProductCatalogSKUPricingTier putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this ProductCatalogSKUPricingTier object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCatalogSKUPricingTier productCatalogSkuPricingTier = (ProductCatalogSKUPricingTier) o;
    return Objects.equals(this.maxUsageQuantity, productCatalogSkuPricingTier.maxUsageQuantity)
        && Objects.equals(this.minUsageQuantity, productCatalogSkuPricingTier.minUsageQuantity)
        && Objects.equals(this.price, productCatalogSkuPricingTier.price)
        && Objects.equals(this.pricingUnitType, productCatalogSkuPricingTier.pricingUnitType)
        && Objects.equals(
            this.additionalProperties, productCatalogSkuPricingTier.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        maxUsageQuantity, minUsageQuantity, price, pricingUnitType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCatalogSKUPricingTier {\n");
    sb.append("    maxUsageQuantity: ").append(toIndentedString(maxUsageQuantity)).append("\n");
    sb.append("    minUsageQuantity: ").append(toIndentedString(minUsageQuantity)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    pricingUnitType: ").append(toIndentedString(pricingUnitType)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
