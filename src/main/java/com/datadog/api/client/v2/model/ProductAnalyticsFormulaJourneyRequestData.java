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
 * The single JSON:API resource carrying a journey timeseries query. Its attributes hold the time
 * window, the bucket interval that splits it, and the journey metric to compute per bucket.
 */
@JsonPropertyOrder({
  ProductAnalyticsFormulaJourneyRequestData.JSON_PROPERTY_ATTRIBUTES,
  ProductAnalyticsFormulaJourneyRequestData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsFormulaJourneyRequestData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private ProductAnalyticsFormulaJourneyRequestAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ProductAnalyticsFormulaJourneyRequestType type;

  public ProductAnalyticsFormulaJourneyRequestData() {}

  @JsonCreator
  public ProductAnalyticsFormulaJourneyRequestData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          ProductAnalyticsFormulaJourneyRequestAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ProductAnalyticsFormulaJourneyRequestType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ProductAnalyticsFormulaJourneyRequestData attributes(
      ProductAnalyticsFormulaJourneyRequestAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes of a journey timeseries request.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsFormulaJourneyRequestAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ProductAnalyticsFormulaJourneyRequestAttributes attributes) {
    this.attributes = attributes;
    if (attributes != null) {
      this.unparsed |= attributes.unparsed;
    }
  }

  public ProductAnalyticsFormulaJourneyRequestData type(
      ProductAnalyticsFormulaJourneyRequestType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The resource type identifier for a journey timeseries or scalar request.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsFormulaJourneyRequestType getType() {
    return type;
  }

  public void setType(ProductAnalyticsFormulaJourneyRequestType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return ProductAnalyticsFormulaJourneyRequestData
   */
  @JsonAnySetter
  public ProductAnalyticsFormulaJourneyRequestData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsFormulaJourneyRequestData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsFormulaJourneyRequestData productAnalyticsFormulaJourneyRequestData =
        (ProductAnalyticsFormulaJourneyRequestData) o;
    return Objects.equals(this.attributes, productAnalyticsFormulaJourneyRequestData.attributes)
        && Objects.equals(this.type, productAnalyticsFormulaJourneyRequestData.type)
        && Objects.equals(
            this.additionalProperties,
            productAnalyticsFormulaJourneyRequestData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsFormulaJourneyRequestData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
