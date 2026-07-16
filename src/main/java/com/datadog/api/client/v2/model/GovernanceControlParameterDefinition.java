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

/** The definition of a configurable parameter on a control or mitigation. */
@JsonPropertyOrder({
  GovernanceControlParameterDefinition.JSON_PROPERTY_DEFAULT_VALUE,
  GovernanceControlParameterDefinition.JSON_PROPERTY_DESCRIPTION,
  GovernanceControlParameterDefinition.JSON_PROPERTY_DISPLAY_NAME,
  GovernanceControlParameterDefinition.JSON_PROPERTY_HIDDEN,
  GovernanceControlParameterDefinition.JSON_PROPERTY_NAME,
  GovernanceControlParameterDefinition.JSON_PROPERTY_REQUIRED,
  GovernanceControlParameterDefinition.JSON_PROPERTY_SUPPORTED_VALUES,
  GovernanceControlParameterDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GovernanceControlParameterDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEFAULT_VALUE = "default_value";
  private Object defaultValue = new Object();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_HIDDEN = "hidden";
  private Boolean hidden;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REQUIRED = "required";
  private Boolean required;

  public static final String JSON_PROPERTY_SUPPORTED_VALUES = "supported_values";
  private List<GovernanceControlSupportedValue> supportedValues = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public GovernanceControlParameterDefinition() {}

  @JsonCreator
  public GovernanceControlParameterDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_DEFAULT_VALUE) Object defaultValue,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_DISPLAY_NAME) String displayName,
      @JsonProperty(required = true, value = JSON_PROPERTY_HIDDEN) Boolean hidden,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUIRED) Boolean required,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUPPORTED_VALUES)
          List<GovernanceControlSupportedValue> supportedValues,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type) {
    this.defaultValue = defaultValue;
    this.description = description;
    this.displayName = displayName;
    this.hidden = hidden;
    this.name = name;
    this.required = required;
    this.supportedValues = supportedValues;
    for (GovernanceControlSupportedValue item : supportedValues) {
      this.unparsed |= item.unparsed;
    }
    this.type = type;
  }

  public GovernanceControlParameterDefinition defaultValue(Object defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * The default value of the parameter. The JSON type depends on the parameter's <code>type</code>.
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

  public GovernanceControlParameterDefinition description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A human-readable description of the parameter.
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

  public GovernanceControlParameterDefinition displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The human-readable name of the parameter.
   *
   * @return displayName
   */
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public GovernanceControlParameterDefinition hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

  /**
   * Whether the parameter is hidden from the UI.
   *
   * @return hidden
   */
  @JsonProperty(JSON_PROPERTY_HIDDEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public GovernanceControlParameterDefinition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The machine-readable name of the parameter.
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

  public GovernanceControlParameterDefinition required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Whether the parameter must be provided.
   *
   * @return required
   */
  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public GovernanceControlParameterDefinition supportedValues(
      List<GovernanceControlSupportedValue> supportedValues) {
    this.supportedValues = supportedValues;
    for (GovernanceControlSupportedValue item : supportedValues) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GovernanceControlParameterDefinition addSupportedValuesItem(
      GovernanceControlSupportedValue supportedValuesItem) {
    this.supportedValues.add(supportedValuesItem);
    this.unparsed |= supportedValuesItem.unparsed;
    return this;
  }

  /**
   * The supported values for an enumerated parameter.
   *
   * @return supportedValues
   */
  @JsonProperty(JSON_PROPERTY_SUPPORTED_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<GovernanceControlSupportedValue> getSupportedValues() {
    return supportedValues;
  }

  public void setSupportedValues(List<GovernanceControlSupportedValue> supportedValues) {
    this.supportedValues = supportedValues;
    if (supportedValues != null) {
      for (GovernanceControlSupportedValue item : supportedValues) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public GovernanceControlParameterDefinition type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the parameter, such as <code>integer</code>, <code>string</code>, <code>boolean
   * </code>, <code>enum</code>, or <code>pattern_list</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
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
   * @return GovernanceControlParameterDefinition
   */
  @JsonAnySetter
  public GovernanceControlParameterDefinition putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GovernanceControlParameterDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GovernanceControlParameterDefinition governanceControlParameterDefinition =
        (GovernanceControlParameterDefinition) o;
    return Objects.equals(this.defaultValue, governanceControlParameterDefinition.defaultValue)
        && Objects.equals(this.description, governanceControlParameterDefinition.description)
        && Objects.equals(this.displayName, governanceControlParameterDefinition.displayName)
        && Objects.equals(this.hidden, governanceControlParameterDefinition.hidden)
        && Objects.equals(this.name, governanceControlParameterDefinition.name)
        && Objects.equals(this.required, governanceControlParameterDefinition.required)
        && Objects.equals(
            this.supportedValues, governanceControlParameterDefinition.supportedValues)
        && Objects.equals(this.type, governanceControlParameterDefinition.type)
        && Objects.equals(
            this.additionalProperties, governanceControlParameterDefinition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        defaultValue,
        description,
        displayName,
        hidden,
        name,
        required,
        supportedValues,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GovernanceControlParameterDefinition {\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    supportedValues: ").append(toIndentedString(supportedValues)).append("\n");
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
