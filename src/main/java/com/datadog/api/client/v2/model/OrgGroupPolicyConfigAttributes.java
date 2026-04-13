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

/** Attributes of an org group policy config. */
@JsonPropertyOrder({
  OrgGroupPolicyConfigAttributes.JSON_PROPERTY_ALLOWED_VALUES,
  OrgGroupPolicyConfigAttributes.JSON_PROPERTY_DEFAULT_VALUE,
  OrgGroupPolicyConfigAttributes.JSON_PROPERTY_DESCRIPTION,
  OrgGroupPolicyConfigAttributes.JSON_PROPERTY_NAME,
  OrgGroupPolicyConfigAttributes.JSON_PROPERTY_VALUE_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrgGroupPolicyConfigAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOWED_VALUES = "allowed_values";
  private List<String> allowedValues = new ArrayList<>();

  public static final String JSON_PROPERTY_DEFAULT_VALUE = "default_value";
  private Object defaultValue = new Object();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VALUE_TYPE = "value_type";
  private String valueType;

  public OrgGroupPolicyConfigAttributes() {}

  @JsonCreator
  public OrgGroupPolicyConfigAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ALLOWED_VALUES)
          List<String> allowedValues,
      @JsonProperty(required = true, value = JSON_PROPERTY_DEFAULT_VALUE) Object defaultValue,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE_TYPE) String valueType) {
    this.allowedValues = allowedValues;
    this.defaultValue = defaultValue;
    this.description = description;
    this.name = name;
    this.valueType = valueType;
  }

  public OrgGroupPolicyConfigAttributes allowedValues(List<String> allowedValues) {
    this.allowedValues = allowedValues;
    return this;
  }

  public OrgGroupPolicyConfigAttributes addAllowedValuesItem(String allowedValuesItem) {
    this.allowedValues.add(allowedValuesItem);
    return this;
  }

  /**
   * The allowed values for this config.
   *
   * @return allowedValues
   */
  @JsonProperty(JSON_PROPERTY_ALLOWED_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getAllowedValues() {
    return allowedValues;
  }

  public void setAllowedValues(List<String> allowedValues) {
    this.allowedValues = allowedValues;
  }

  public OrgGroupPolicyConfigAttributes defaultValue(Object defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * The default value for this config.
   *
   * @return defaultValue
   */
  @JsonProperty(JSON_PROPERTY_DEFAULT_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Object getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(Object defaultValue) {
    this.defaultValue = defaultValue;
  }

  public OrgGroupPolicyConfigAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the policy config.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrgGroupPolicyConfigAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the policy config.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrgGroupPolicyConfigAttributes valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * The type of the value for this config.
   *
   * @return valueType
   */
  @JsonProperty(JSON_PROPERTY_VALUE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
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
   * @return OrgGroupPolicyConfigAttributes
   */
  @JsonAnySetter
  public OrgGroupPolicyConfigAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OrgGroupPolicyConfigAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgGroupPolicyConfigAttributes orgGroupPolicyConfigAttributes =
        (OrgGroupPolicyConfigAttributes) o;
    return Objects.equals(this.allowedValues, orgGroupPolicyConfigAttributes.allowedValues)
        && Objects.equals(this.defaultValue, orgGroupPolicyConfigAttributes.defaultValue)
        && Objects.equals(this.description, orgGroupPolicyConfigAttributes.description)
        && Objects.equals(this.name, orgGroupPolicyConfigAttributes.name)
        && Objects.equals(this.valueType, orgGroupPolicyConfigAttributes.valueType)
        && Objects.equals(
            this.additionalProperties, orgGroupPolicyConfigAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowedValues, defaultValue, description, name, valueType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgGroupPolicyConfigAttributes {\n");
    sb.append("    allowedValues: ").append(toIndentedString(allowedValues)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
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
