/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Canonical unit. */
@JsonPropertyOrder({
  NumberFormatUnitCanonical.JSON_PROPERTY_PER_UNIT_NAME,
  NumberFormatUnitCanonical.JSON_PROPERTY_TYPE,
  NumberFormatUnitCanonical.JSON_PROPERTY_UNIT_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NumberFormatUnitCanonical {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PER_UNIT_NAME = "per_unit_name";
  private String perUnitName;

  public static final String JSON_PROPERTY_TYPE = "type";
  private NumberFormatUnitScaleType type;

  public static final String JSON_PROPERTY_UNIT_NAME = "unit_name";
  private String unitName;

  public NumberFormatUnitCanonical perUnitName(String perUnitName) {
    this.perUnitName = perUnitName;
    return this;
  }

  /**
   * The name of the unit per item.
   *
   * @return perUnitName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PER_UNIT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPerUnitName() {
    return perUnitName;
  }

  public void setPerUnitName(String perUnitName) {
    this.perUnitName = perUnitName;
  }

  public NumberFormatUnitCanonical type(NumberFormatUnitScaleType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of unit scale.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NumberFormatUnitScaleType getType() {
    return type;
  }

  public void setType(NumberFormatUnitScaleType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public NumberFormatUnitCanonical unitName(String unitName) {
    this.unitName = unitName;
    return this;
  }

  /**
   * The name of the unit.
   *
   * @return unitName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUnitName() {
    return unitName;
  }

  public void setUnitName(String unitName) {
    this.unitName = unitName;
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
   * @return NumberFormatUnitCanonical
   */
  @JsonAnySetter
  public NumberFormatUnitCanonical putAdditionalProperty(String key, Object value) {
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

  /** Return true if this NumberFormatUnitCanonical object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberFormatUnitCanonical numberFormatUnitCanonical = (NumberFormatUnitCanonical) o;
    return Objects.equals(this.perUnitName, numberFormatUnitCanonical.perUnitName)
        && Objects.equals(this.type, numberFormatUnitCanonical.type)
        && Objects.equals(this.unitName, numberFormatUnitCanonical.unitName)
        && Objects.equals(
            this.additionalProperties, numberFormatUnitCanonical.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(perUnitName, type, unitName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberFormatUnitCanonical {\n");
    sb.append("    perUnitName: ").append(toIndentedString(perUnitName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unitName: ").append(toIndentedString(unitName)).append("\n");
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
