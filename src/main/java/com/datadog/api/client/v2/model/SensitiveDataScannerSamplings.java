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

/** Sampling configurations for the Scanning Group. */
@JsonPropertyOrder({
  SensitiveDataScannerSamplings.JSON_PROPERTY_PRODUCT,
  SensitiveDataScannerSamplings.JSON_PROPERTY_RATE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerSamplings {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PRODUCT = "product";
  private SensitiveDataScannerProduct product = SensitiveDataScannerProduct.LOGS;

  public static final String JSON_PROPERTY_RATE = "rate";
  private Double rate;

  public SensitiveDataScannerSamplings product(SensitiveDataScannerProduct product) {
    this.product = product;
    this.unparsed |= !product.isValid();
    return this;
  }

  /**
   * Datadog product onto which Sensitive Data Scanner can be activated.
   *
   * @return product
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SensitiveDataScannerProduct getProduct() {
    return product;
  }

  public void setProduct(SensitiveDataScannerProduct product) {
    if (!product.isValid()) {
      this.unparsed = true;
    }
    this.product = product;
  }

  public SensitiveDataScannerSamplings rate(Double rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Rate at which data in product type will be scanned, as a percentage. minimum: 0.0 maximum:
   * 100.0
   *
   * @return rate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
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
   * @return SensitiveDataScannerSamplings
   */
  @JsonAnySetter
  public SensitiveDataScannerSamplings putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SensitiveDataScannerSamplings object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerSamplings sensitiveDataScannerSamplings = (SensitiveDataScannerSamplings) o;
    return Objects.equals(this.product, sensitiveDataScannerSamplings.product)
        && Objects.equals(this.rate, sensitiveDataScannerSamplings.rate)
        && Objects.equals(
            this.additionalProperties, sensitiveDataScannerSamplings.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, rate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerSamplings {\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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
