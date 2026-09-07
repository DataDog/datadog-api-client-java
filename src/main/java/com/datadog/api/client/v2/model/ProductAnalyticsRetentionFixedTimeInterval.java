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

/** A retention interval of fixed length, such as "7 days". */
@JsonPropertyOrder({
  ProductAnalyticsRetentionFixedTimeInterval.JSON_PROPERTY_TYPE,
  ProductAnalyticsRetentionFixedTimeInterval.JSON_PROPERTY_UNIT,
  ProductAnalyticsRetentionFixedTimeInterval.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsRetentionFixedTimeInterval {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TYPE = "type";
  private ProductAnalyticsRetentionFixedTimeIntervalType type;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private ProductAnalyticsRetentionFixedTimeIntervalUnit unit;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Double value;

  public ProductAnalyticsRetentionFixedTimeInterval() {}

  @JsonCreator
  public ProductAnalyticsRetentionFixedTimeInterval(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ProductAnalyticsRetentionFixedTimeIntervalType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_UNIT)
          ProductAnalyticsRetentionFixedTimeIntervalUnit unit,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE) Double value) {
    this.type = type;
    this.unparsed |= !type.isValid();
    this.unit = unit;
    this.unparsed |= !unit.isValid();
    this.value = value;
  }

  public ProductAnalyticsRetentionFixedTimeInterval type(
      ProductAnalyticsRetentionFixedTimeIntervalType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The discriminator identifying a fixed-length retention interval.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsRetentionFixedTimeIntervalType getType() {
    return type;
  }

  public void setType(ProductAnalyticsRetentionFixedTimeIntervalType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public ProductAnalyticsRetentionFixedTimeInterval unit(
      ProductAnalyticsRetentionFixedTimeIntervalUnit unit) {
    this.unit = unit;
    this.unparsed |= !unit.isValid();
    return this;
  }

  /**
   * Time unit for a fixed-length retention interval.
   *
   * @return unit
   */
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsRetentionFixedTimeIntervalUnit getUnit() {
    return unit;
  }

  public void setUnit(ProductAnalyticsRetentionFixedTimeIntervalUnit unit) {
    if (!unit.isValid()) {
      this.unparsed = true;
    }
    this.unit = unit;
  }

  public ProductAnalyticsRetentionFixedTimeInterval value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * Length of the interval, expressed in <code>unit</code>. minimum: 0
   *
   * @return value
   */
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
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
   * @return ProductAnalyticsRetentionFixedTimeInterval
   */
  @JsonAnySetter
  public ProductAnalyticsRetentionFixedTimeInterval putAdditionalProperty(
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

  /** Return true if this ProductAnalyticsRetentionFixedTimeInterval object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsRetentionFixedTimeInterval productAnalyticsRetentionFixedTimeInterval =
        (ProductAnalyticsRetentionFixedTimeInterval) o;
    return Objects.equals(this.type, productAnalyticsRetentionFixedTimeInterval.type)
        && Objects.equals(this.unit, productAnalyticsRetentionFixedTimeInterval.unit)
        && Objects.equals(this.value, productAnalyticsRetentionFixedTimeInterval.value)
        && Objects.equals(
            this.additionalProperties,
            productAnalyticsRetentionFixedTimeInterval.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, unit, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsRetentionFixedTimeInterval {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
