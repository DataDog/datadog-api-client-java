/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Charges breakdown. */
@JsonPropertyOrder({
  ChargebackBreakdown.JSON_PROPERTY_CHARGE_TYPE,
  ChargebackBreakdown.JSON_PROPERTY_COST,
  ChargebackBreakdown.JSON_PROPERTY_PRODUCT_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChargebackBreakdown {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHARGE_TYPE = "charge_type";
  private String chargeType;

  public static final String JSON_PROPERTY_COST = "cost";
  private Double cost;

  public static final String JSON_PROPERTY_PRODUCT_NAME = "product_name";
  private String productName;

  public ChargebackBreakdown chargeType(String chargeType) {
    this.chargeType = chargeType;
    return this;
  }

  /**
   * The type of charge for a particular product.
   *
   * @return chargeType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHARGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getChargeType() {
    return chargeType;
  }

  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }

  public ChargebackBreakdown cost(Double cost) {
    this.cost = cost;
    return this;
  }

  /**
   * The cost for a particular product and charge type during a given month.
   *
   * @return cost
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCost() {
    return cost;
  }

  public void setCost(Double cost) {
    this.cost = cost;
  }

  public ChargebackBreakdown productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * The product for which cost is being reported.
   *
   * @return productName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
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
   * @return ChargebackBreakdown
   */
  @JsonAnySetter
  public ChargebackBreakdown putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ChargebackBreakdown object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargebackBreakdown chargebackBreakdown = (ChargebackBreakdown) o;
    return Objects.equals(this.chargeType, chargebackBreakdown.chargeType)
        && Objects.equals(this.cost, chargebackBreakdown.cost)
        && Objects.equals(this.productName, chargebackBreakdown.productName)
        && Objects.equals(this.additionalProperties, chargebackBreakdown.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeType, cost, productName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargebackBreakdown {\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
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
