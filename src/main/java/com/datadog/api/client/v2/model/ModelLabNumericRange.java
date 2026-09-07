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

/** The numeric range of values for a facet. */
@JsonPropertyOrder({ModelLabNumericRange.JSON_PROPERTY_MAX, ModelLabNumericRange.JSON_PROPERTY_MIN})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ModelLabNumericRange {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MAX = "max";
  private Double max;

  public static final String JSON_PROPERTY_MIN = "min";
  private Double min;

  public ModelLabNumericRange() {}

  @JsonCreator
  public ModelLabNumericRange(
      @JsonProperty(required = true, value = JSON_PROPERTY_MAX) Double max,
      @JsonProperty(required = true, value = JSON_PROPERTY_MIN) Double min) {
    this.max = max;
    this.min = min;
  }

  public ModelLabNumericRange max(Double max) {
    this.max = max;
    return this;
  }

  /**
   * The maximum value.
   *
   * @return max
   */
  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getMax() {
    return max;
  }

  public void setMax(Double max) {
    this.max = max;
  }

  public ModelLabNumericRange min(Double min) {
    this.min = min;
    return this;
  }

  /**
   * The minimum value.
   *
   * @return min
   */
  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getMin() {
    return min;
  }

  public void setMin(Double min) {
    this.min = min;
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
   * @return ModelLabNumericRange
   */
  @JsonAnySetter
  public ModelLabNumericRange putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ModelLabNumericRange object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelLabNumericRange modelLabNumericRange = (ModelLabNumericRange) o;
    return Objects.equals(this.max, modelLabNumericRange.max)
        && Objects.equals(this.min, modelLabNumericRange.min)
        && Objects.equals(this.additionalProperties, modelLabNumericRange.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, min, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelLabNumericRange {\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
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
