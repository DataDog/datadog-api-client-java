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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The pricing and allotment metadata of a SKU. */
@JsonPropertyOrder({
  ProductCatalogSKUDataAttributesResponse.JSON_PROPERTY_ALLOTMENTS,
  ProductCatalogSKUDataAttributesResponse.JSON_PROPERTY_BILLING_DIMENSION,
  ProductCatalogSKUDataAttributesResponse.JSON_PROPERTY_BILLING_UNITS,
  ProductCatalogSKUDataAttributesResponse.JSON_PROPERTY_CURRENCY,
  ProductCatalogSKUDataAttributesResponse.JSON_PROPERTY_DEFAULT_ON_DEMAND_OPTION,
  ProductCatalogSKUDataAttributesResponse.JSON_PROPERTY_NUMBER_OF_UNITS_INCLUDED_IN_PRICE,
  ProductCatalogSKUDataAttributesResponse.JSON_PROPERTY_ON_DEMAND_LIST_PRICE,
  ProductCatalogSKUDataAttributesResponse.JSON_PROPERTY_ON_DEMAND_TIERED,
  ProductCatalogSKUDataAttributesResponse.JSON_PROPERTY_PRICING_TYPE,
  ProductCatalogSKUDataAttributesResponse.JSON_PROPERTY_SKU_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductCatalogSKUDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOTMENTS = "allotments";
  private List<ProductCatalogSKUAllotment> allotments = new ArrayList<>();

  public static final String JSON_PROPERTY_BILLING_DIMENSION = "billing_dimension";
  private String billingDimension;

  public static final String JSON_PROPERTY_BILLING_UNITS = "billing_units";
  private String billingUnits;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_DEFAULT_ON_DEMAND_OPTION = "default_on_demand_option";
  private ProductCatalogSKUOnDemandOption defaultOnDemandOption;

  public static final String JSON_PROPERTY_NUMBER_OF_UNITS_INCLUDED_IN_PRICE =
      "number_of_units_included_in_price";
  private Long numberOfUnitsIncludedInPrice;

  public static final String JSON_PROPERTY_ON_DEMAND_LIST_PRICE = "on_demand_list_price";
  private String onDemandListPrice;

  public static final String JSON_PROPERTY_ON_DEMAND_TIERED = "on_demand_tiered";
  private ProductCatalogSKUTieredPricing onDemandTiered;

  public static final String JSON_PROPERTY_PRICING_TYPE = "pricing_type";
  private ProductCatalogSKUPricingType pricingType;

  public static final String JSON_PROPERTY_SKU_NAME = "sku_name";
  private String skuName;

  public ProductCatalogSKUDataAttributesResponse() {}

  @JsonCreator
  public ProductCatalogSKUDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_ALLOTMENTS)
          List<ProductCatalogSKUAllotment> allotments,
      @JsonProperty(required = true, value = JSON_PROPERTY_BILLING_DIMENSION)
          String billingDimension,
      @JsonProperty(required = true, value = JSON_PROPERTY_BILLING_UNITS) String billingUnits,
      @JsonProperty(required = true, value = JSON_PROPERTY_CURRENCY) String currency,
      @JsonProperty(required = true, value = JSON_PROPERTY_DEFAULT_ON_DEMAND_OPTION)
          ProductCatalogSKUOnDemandOption defaultOnDemandOption,
      @JsonProperty(required = true, value = JSON_PROPERTY_NUMBER_OF_UNITS_INCLUDED_IN_PRICE)
          Long numberOfUnitsIncludedInPrice,
      @JsonProperty(required = true, value = JSON_PROPERTY_ON_DEMAND_LIST_PRICE)
          String onDemandListPrice,
      @JsonProperty(required = true, value = JSON_PROPERTY_ON_DEMAND_TIERED)
          ProductCatalogSKUTieredPricing onDemandTiered,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRICING_TYPE)
          ProductCatalogSKUPricingType pricingType,
      @JsonProperty(required = true, value = JSON_PROPERTY_SKU_NAME) String skuName) {
    this.allotments = allotments;
    for (ProductCatalogSKUAllotment item : allotments) {
      this.unparsed |= item.unparsed;
    }
    this.billingDimension = billingDimension;
    this.billingUnits = billingUnits;
    if (billingUnits != null) {}
    this.currency = currency;
    this.defaultOnDemandOption = defaultOnDemandOption;
    this.unparsed |= !defaultOnDemandOption.isValid();
    this.numberOfUnitsIncludedInPrice = numberOfUnitsIncludedInPrice;
    this.onDemandListPrice = onDemandListPrice;
    if (onDemandListPrice != null) {}
    this.onDemandTiered = onDemandTiered;
    if (onDemandTiered != null) {
      this.unparsed |= onDemandTiered.unparsed;
    }
    this.pricingType = pricingType;
    this.unparsed |= !pricingType.isValid();
    this.skuName = skuName;
  }

  public ProductCatalogSKUDataAttributesResponse allotments(
      List<ProductCatalogSKUAllotment> allotments) {
    this.allotments = allotments;
    for (ProductCatalogSKUAllotment item : allotments) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ProductCatalogSKUDataAttributesResponse addAllotmentsItem(
      ProductCatalogSKUAllotment allotmentsItem) {
    this.allotments.add(allotmentsItem);
    this.unparsed |= allotmentsItem.unparsed;
    return this;
  }

  /**
   * The allotments the SKU provides to other SKUs. Every entry carries the code of this SKU as its
   * <code>parent_sku_code</code>. Empty when the SKU provides no allotments.
   *
   * @return allotments
   */
  @JsonProperty(JSON_PROPERTY_ALLOTMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ProductCatalogSKUAllotment> getAllotments() {
    return allotments;
  }

  public void setAllotments(List<ProductCatalogSKUAllotment> allotments) {
    this.allotments = allotments;
    if (allotments != null) {
      for (ProductCatalogSKUAllotment item : allotments) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ProductCatalogSKUDataAttributesResponse billingDimension(String billingDimension) {
    this.billingDimension = billingDimension;
    return this;
  }

  /**
   * The identifier of the billing dimension the SKU is billed on, as used by the usage metering
   * endpoints. Several SKUs can share one billing dimension, so this value does not identify a SKU.
   *
   * @return billingDimension
   */
  @JsonProperty(JSON_PROPERTY_BILLING_DIMENSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getBillingDimension() {
    return billingDimension;
  }

  public void setBillingDimension(String billingDimension) {
    this.billingDimension = billingDimension;
  }

  public ProductCatalogSKUDataAttributesResponse billingUnits(String billingUnits) {
    this.billingUnits = billingUnits;
    if (billingUnits != null) {}
    return this;
  }

  /**
   * The billable usage unit the SKU is priced per. <code>null</code> for SKUs that are not priced
   * per unit of usage, such as those whose <code>pricing_type</code> is <code>percent</code>.
   *
   * @return billingUnits
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING_UNITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getBillingUnits() {
    return billingUnits;
  }

  public void setBillingUnits(String billingUnits) {
    this.billingUnits = billingUnits;
  }

  public ProductCatalogSKUDataAttributesResponse currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The ISO-4217 code of the currency the prices are expressed in.
   *
   * @return currency
   */
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public ProductCatalogSKUDataAttributesResponse defaultOnDemandOption(
      ProductCatalogSKUOnDemandOption defaultOnDemandOption) {
    this.defaultOnDemandOption = defaultOnDemandOption;
    this.unparsed |= !defaultOnDemandOption.isValid();
    return this;
  }

  /**
   * The billing frequency applied to on-demand usage of the SKU by default.
   *
   * @return defaultOnDemandOption
   */
  @JsonProperty(JSON_PROPERTY_DEFAULT_ON_DEMAND_OPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductCatalogSKUOnDemandOption getDefaultOnDemandOption() {
    return defaultOnDemandOption;
  }

  public void setDefaultOnDemandOption(ProductCatalogSKUOnDemandOption defaultOnDemandOption) {
    if (!defaultOnDemandOption.isValid()) {
      this.unparsed = true;
    }
    this.defaultOnDemandOption = defaultOnDemandOption;
  }

  public ProductCatalogSKUDataAttributesResponse numberOfUnitsIncludedInPrice(
      Long numberOfUnitsIncludedInPrice) {
    this.numberOfUnitsIncludedInPrice = numberOfUnitsIncludedInPrice;
    return this;
  }

  /**
   * The number of billable usage units included in the price. <code>0</code> for SKUs that are not
   * priced per unit of usage, such as those whose <code>pricing_type</code> is <code>percent</code>
   * .
   *
   * @return numberOfUnitsIncludedInPrice
   */
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_UNITS_INCLUDED_IN_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getNumberOfUnitsIncludedInPrice() {
    return numberOfUnitsIncludedInPrice;
  }

  public void setNumberOfUnitsIncludedInPrice(Long numberOfUnitsIncludedInPrice) {
    this.numberOfUnitsIncludedInPrice = numberOfUnitsIncludedInPrice;
  }

  public ProductCatalogSKUDataAttributesResponse onDemandListPrice(String onDemandListPrice) {
    this.onDemandListPrice = onDemandListPrice;
    if (onDemandListPrice != null) {}
    return this;
  }

  /**
   * The public list price of on-demand usage of the SKU, as a decimal string. The number of decimal
   * places is not normalized, so values such as <code>0</code>, <code>0.9</code>, and <code>
   * 30000.00</code> all occur. <code>null</code> when the SKU is priced with tiers, in which case
   * the prices are in <code>on_demand_tiered</code>.
   *
   * @return onDemandListPrice
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ON_DEMAND_LIST_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getOnDemandListPrice() {
    return onDemandListPrice;
  }

  public void setOnDemandListPrice(String onDemandListPrice) {
    this.onDemandListPrice = onDemandListPrice;
  }

  public ProductCatalogSKUDataAttributesResponse onDemandTiered(
      ProductCatalogSKUTieredPricing onDemandTiered) {
    this.onDemandTiered = onDemandTiered;
    if (onDemandTiered != null) {
      this.unparsed |= onDemandTiered.unparsed;
    }
    return this;
  }

  /**
   * The tiered pricing applied to on-demand usage of the SKU. <code>null</code> when the SKU is
   * priced with a single list price instead.
   *
   * @return onDemandTiered
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ON_DEMAND_TIERED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductCatalogSKUTieredPricing getOnDemandTiered() {
    return onDemandTiered;
  }

  public void setOnDemandTiered(ProductCatalogSKUTieredPricing onDemandTiered) {
    this.onDemandTiered = onDemandTiered;
    if (onDemandTiered != null) {
      this.unparsed |= onDemandTiered.unparsed;
    }
  }

  public ProductCatalogSKUDataAttributesResponse pricingType(
      ProductCatalogSKUPricingType pricingType) {
    this.pricingType = pricingType;
    this.unparsed |= !pricingType.isValid();
    return this;
  }

  /**
   * How the SKU is priced. <code>usage</code> prices each billable usage unit, and <code>percent
   * </code> prices a percentage; percent-priced SKUs have no <code>billing_units</code>.
   *
   * @return pricingType
   */
  @JsonProperty(JSON_PROPERTY_PRICING_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductCatalogSKUPricingType getPricingType() {
    return pricingType;
  }

  public void setPricingType(ProductCatalogSKUPricingType pricingType) {
    if (!pricingType.isValid()) {
      this.unparsed = true;
    }
    this.pricingType = pricingType;
  }

  public ProductCatalogSKUDataAttributesResponse skuName(String skuName) {
    this.skuName = skuName;
    return this;
  }

  /**
   * The human-readable name of the SKU.
   *
   * @return skuName
   */
  @JsonProperty(JSON_PROPERTY_SKU_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSkuName() {
    return skuName;
  }

  public void setSkuName(String skuName) {
    this.skuName = skuName;
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
   * @return ProductCatalogSKUDataAttributesResponse
   */
  @JsonAnySetter
  public ProductCatalogSKUDataAttributesResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductCatalogSKUDataAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCatalogSKUDataAttributesResponse productCatalogSkuDataAttributesResponse =
        (ProductCatalogSKUDataAttributesResponse) o;
    return Objects.equals(this.allotments, productCatalogSkuDataAttributesResponse.allotments)
        && Objects.equals(
            this.billingDimension, productCatalogSkuDataAttributesResponse.billingDimension)
        && Objects.equals(this.billingUnits, productCatalogSkuDataAttributesResponse.billingUnits)
        && Objects.equals(this.currency, productCatalogSkuDataAttributesResponse.currency)
        && Objects.equals(
            this.defaultOnDemandOption,
            productCatalogSkuDataAttributesResponse.defaultOnDemandOption)
        && Objects.equals(
            this.numberOfUnitsIncludedInPrice,
            productCatalogSkuDataAttributesResponse.numberOfUnitsIncludedInPrice)
        && Objects.equals(
            this.onDemandListPrice, productCatalogSkuDataAttributesResponse.onDemandListPrice)
        && Objects.equals(
            this.onDemandTiered, productCatalogSkuDataAttributesResponse.onDemandTiered)
        && Objects.equals(this.pricingType, productCatalogSkuDataAttributesResponse.pricingType)
        && Objects.equals(this.skuName, productCatalogSkuDataAttributesResponse.skuName)
        && Objects.equals(
            this.additionalProperties,
            productCatalogSkuDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allotments,
        billingDimension,
        billingUnits,
        currency,
        defaultOnDemandOption,
        numberOfUnitsIncludedInPrice,
        onDemandListPrice,
        onDemandTiered,
        pricingType,
        skuName,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCatalogSKUDataAttributesResponse {\n");
    sb.append("    allotments: ").append(toIndentedString(allotments)).append("\n");
    sb.append("    billingDimension: ").append(toIndentedString(billingDimension)).append("\n");
    sb.append("    billingUnits: ").append(toIndentedString(billingUnits)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    defaultOnDemandOption: ")
        .append(toIndentedString(defaultOnDemandOption))
        .append("\n");
    sb.append("    numberOfUnitsIncludedInPrice: ")
        .append(toIndentedString(numberOfUnitsIncludedInPrice))
        .append("\n");
    sb.append("    onDemandListPrice: ").append(toIndentedString(onDemandListPrice)).append("\n");
    sb.append("    onDemandTiered: ").append(toIndentedString(onDemandTiered)).append("\n");
    sb.append("    pricingType: ").append(toIndentedString(pricingType)).append("\n");
    sb.append("    skuName: ").append(toIndentedString(skuName)).append("\n");
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
