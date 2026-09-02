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

/**
 * A quantity of one SKU that is included with, and consumed before, the billable usage of another
 * SKU.
 */
@JsonPropertyOrder({
  ProductCatalogSKUAllotment.JSON_PROPERTY_CHILD_SKU_CODE,
  ProductCatalogSKUAllotment.JSON_PROPERTY_HOURLY_QUANTITY,
  ProductCatalogSKUAllotment.JSON_PROPERTY_MONTHLY_QUANTITY,
  ProductCatalogSKUAllotment.JSON_PROPERTY_PARENT_SKU_CODE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductCatalogSKUAllotment {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHILD_SKU_CODE = "child_sku_code";
  private String childSkuCode;

  public static final String JSON_PROPERTY_HOURLY_QUANTITY = "hourly_quantity";
  private Double hourlyQuantity;

  public static final String JSON_PROPERTY_MONTHLY_QUANTITY = "monthly_quantity";
  private Long monthlyQuantity;

  public static final String JSON_PROPERTY_PARENT_SKU_CODE = "parent_sku_code";
  private String parentSkuCode;

  public ProductCatalogSKUAllotment() {}

  @JsonCreator
  public ProductCatalogSKUAllotment(
      @JsonProperty(required = true, value = JSON_PROPERTY_CHILD_SKU_CODE) String childSkuCode,
      @JsonProperty(required = true, value = JSON_PROPERTY_HOURLY_QUANTITY) Double hourlyQuantity,
      @JsonProperty(required = true, value = JSON_PROPERTY_MONTHLY_QUANTITY) Long monthlyQuantity,
      @JsonProperty(required = true, value = JSON_PROPERTY_PARENT_SKU_CODE) String parentSkuCode) {
    this.childSkuCode = childSkuCode;
    this.hourlyQuantity = hourlyQuantity;
    this.monthlyQuantity = monthlyQuantity;
    this.parentSkuCode = parentSkuCode;
  }

  public ProductCatalogSKUAllotment childSkuCode(String childSkuCode) {
    this.childSkuCode = childSkuCode;
    return this;
  }

  /**
   * The code of the SKU that receives the allotment.
   *
   * @return childSkuCode
   */
  @JsonProperty(JSON_PROPERTY_CHILD_SKU_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getChildSkuCode() {
    return childSkuCode;
  }

  public void setChildSkuCode(String childSkuCode) {
    this.childSkuCode = childSkuCode;
  }

  public ProductCatalogSKUAllotment hourlyQuantity(Double hourlyQuantity) {
    this.hourlyQuantity = hourlyQuantity;
    return this;
  }

  /**
   * The quantity allotted per hour. Fractional for some allotments, and equal to <code>
   * monthly_quantity</code> for others, depending on how the child SKU meters usage.
   *
   * @return hourlyQuantity
   */
  @JsonProperty(JSON_PROPERTY_HOURLY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getHourlyQuantity() {
    return hourlyQuantity;
  }

  public void setHourlyQuantity(Double hourlyQuantity) {
    this.hourlyQuantity = hourlyQuantity;
  }

  public ProductCatalogSKUAllotment monthlyQuantity(Long monthlyQuantity) {
    this.monthlyQuantity = monthlyQuantity;
    return this;
  }

  /**
   * The quantity allotted per month.
   *
   * @return monthlyQuantity
   */
  @JsonProperty(JSON_PROPERTY_MONTHLY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getMonthlyQuantity() {
    return monthlyQuantity;
  }

  public void setMonthlyQuantity(Long monthlyQuantity) {
    this.monthlyQuantity = monthlyQuantity;
  }

  public ProductCatalogSKUAllotment parentSkuCode(String parentSkuCode) {
    this.parentSkuCode = parentSkuCode;
    return this;
  }

  /**
   * The code of the SKU that provides the allotment. Always the code of the SKU the allotment is
   * returned under.
   *
   * @return parentSkuCode
   */
  @JsonProperty(JSON_PROPERTY_PARENT_SKU_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getParentSkuCode() {
    return parentSkuCode;
  }

  public void setParentSkuCode(String parentSkuCode) {
    this.parentSkuCode = parentSkuCode;
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
   * @return ProductCatalogSKUAllotment
   */
  @JsonAnySetter
  public ProductCatalogSKUAllotment putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductCatalogSKUAllotment object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCatalogSKUAllotment productCatalogSkuAllotment = (ProductCatalogSKUAllotment) o;
    return Objects.equals(this.childSkuCode, productCatalogSkuAllotment.childSkuCode)
        && Objects.equals(this.hourlyQuantity, productCatalogSkuAllotment.hourlyQuantity)
        && Objects.equals(this.monthlyQuantity, productCatalogSkuAllotment.monthlyQuantity)
        && Objects.equals(this.parentSkuCode, productCatalogSkuAllotment.parentSkuCode)
        && Objects.equals(
            this.additionalProperties, productCatalogSkuAllotment.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        childSkuCode, hourlyQuantity, monthlyQuantity, parentSkuCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCatalogSKUAllotment {\n");
    sb.append("    childSkuCode: ").append(toIndentedString(childSkuCode)).append("\n");
    sb.append("    hourlyQuantity: ").append(toIndentedString(hourlyQuantity)).append("\n");
    sb.append("    monthlyQuantity: ").append(toIndentedString(monthlyQuantity)).append("\n");
    sb.append("    parentSkuCode: ").append(toIndentedString(parentSkuCode)).append("\n");
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
