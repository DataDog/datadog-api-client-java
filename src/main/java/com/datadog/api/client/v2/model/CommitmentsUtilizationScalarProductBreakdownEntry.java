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

/** Per-product utilization data in a scalar utilization response. */
@JsonPropertyOrder({
  CommitmentsUtilizationScalarProductBreakdownEntry.JSON_PROPERTY_PRODUCT,
  CommitmentsUtilizationScalarProductBreakdownEntry.JSON_PROPERTY_UTILIZATION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CommitmentsUtilizationScalarProductBreakdownEntry {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PRODUCT = "product";
  private String product;

  public static final String JSON_PROPERTY_UTILIZATION = "utilization";
  private Double utilization;

  public CommitmentsUtilizationScalarProductBreakdownEntry() {}

  @JsonCreator
  public CommitmentsUtilizationScalarProductBreakdownEntry(
      @JsonProperty(required = true, value = JSON_PROPERTY_PRODUCT) String product,
      @JsonProperty(required = true, value = JSON_PROPERTY_UTILIZATION) Double utilization) {
    this.product = product;
    this.utilization = utilization;
  }

  public CommitmentsUtilizationScalarProductBreakdownEntry product(String product) {
    this.product = product;
    return this;
  }

  /**
   * The cloud product name.
   *
   * @return product
   */
  @JsonProperty(JSON_PROPERTY_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public CommitmentsUtilizationScalarProductBreakdownEntry utilization(Double utilization) {
    this.utilization = utilization;
    return this;
  }

  /**
   * The utilization percentage for the product.
   *
   * @return utilization
   */
  @JsonProperty(JSON_PROPERTY_UTILIZATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getUtilization() {
    return utilization;
  }

  public void setUtilization(Double utilization) {
    this.utilization = utilization;
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
   * @return CommitmentsUtilizationScalarProductBreakdownEntry
   */
  @JsonAnySetter
  public CommitmentsUtilizationScalarProductBreakdownEntry putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this CommitmentsUtilizationScalarProductBreakdownEntry object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitmentsUtilizationScalarProductBreakdownEntry
        commitmentsUtilizationScalarProductBreakdownEntry =
            (CommitmentsUtilizationScalarProductBreakdownEntry) o;
    return Objects.equals(this.product, commitmentsUtilizationScalarProductBreakdownEntry.product)
        && Objects.equals(
            this.utilization, commitmentsUtilizationScalarProductBreakdownEntry.utilization)
        && Objects.equals(
            this.additionalProperties,
            commitmentsUtilizationScalarProductBreakdownEntry.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, utilization, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitmentsUtilizationScalarProductBreakdownEntry {\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    utilization: ").append(toIndentedString(utilization)).append("\n");
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
