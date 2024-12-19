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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The definition of <code>InputSchemaDataAttributesParametersItemsDataAttributes</code> object. */
@JsonPropertyOrder({
  InputSchemaDataAttributesParametersItemsDataAttributes.JSON_PROPERTY_DEFAULT_VALUE,
  InputSchemaDataAttributesParametersItemsDataAttributes.JSON_PROPERTY_DESCRIPTION,
  InputSchemaDataAttributesParametersItemsDataAttributes.JSON_PROPERTY_ENUM,
  InputSchemaDataAttributesParametersItemsDataAttributes.JSON_PROPERTY_LABEL,
  InputSchemaDataAttributesParametersItemsDataAttributes.JSON_PROPERTY_NAME,
  InputSchemaDataAttributesParametersItemsDataAttributes.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class InputSchemaDataAttributesParametersItemsDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEFAULT_VALUE = "defaultValue";
  private Object defaultValue = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENUM = "enum";
  private List<String> _enum = null;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public InputSchemaDataAttributesParametersItemsDataAttributes defaultValue(Object defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * The <code>attributes</code> <code>defaultValue</code>.
   *
   * @return defaultValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(Object defaultValue) {
    this.defaultValue = defaultValue;
  }

  public InputSchemaDataAttributesParametersItemsDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The <code>attributes</code> <code>description</code>.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InputSchemaDataAttributesParametersItemsDataAttributes _enum(List<String> _enum) {
    this._enum = _enum;
    return this;
  }

  public InputSchemaDataAttributesParametersItemsDataAttributes add_enumItem(String _enumItem) {
    if (this._enum == null) {
      this._enum = new ArrayList<>();
    }
    this._enum.add(_enumItem);
    return this;
  }

  /**
   * The <code>attributes</code> <code>enum</code>.
   *
   * @return _enum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getEnum() {
    return _enum;
  }

  public void setEnum(List<String> _enum) {
    this._enum = _enum;
  }

  public InputSchemaDataAttributesParametersItemsDataAttributes label(String label) {
    this.label = label;
    return this;
  }

  /**
   * The <code>attributes</code> <code>label</code>.
   *
   * @return label
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public InputSchemaDataAttributesParametersItemsDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The <code>attributes</code> <code>name</code>.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InputSchemaDataAttributesParametersItemsDataAttributes type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The <code>attributes</code> <code>type</code>.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * @return InputSchemaDataAttributesParametersItemsDataAttributes
   */
  @JsonAnySetter
  public InputSchemaDataAttributesParametersItemsDataAttributes putAdditionalProperty(
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

  /**
   * Return true if this InputSchemaDataAttributesParametersItemsDataAttributes object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputSchemaDataAttributesParametersItemsDataAttributes
        inputSchemaDataAttributesParametersItemsDataAttributes =
            (InputSchemaDataAttributesParametersItemsDataAttributes) o;
    return Objects.equals(
            this.defaultValue, inputSchemaDataAttributesParametersItemsDataAttributes.defaultValue)
        && Objects.equals(
            this.description, inputSchemaDataAttributesParametersItemsDataAttributes.description)
        && Objects.equals(this._enum, inputSchemaDataAttributesParametersItemsDataAttributes._enum)
        && Objects.equals(this.label, inputSchemaDataAttributesParametersItemsDataAttributes.label)
        && Objects.equals(this.name, inputSchemaDataAttributesParametersItemsDataAttributes.name)
        && Objects.equals(this.type, inputSchemaDataAttributesParametersItemsDataAttributes.type)
        && Objects.equals(
            this.additionalProperties,
            inputSchemaDataAttributesParametersItemsDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValue, description, _enum, label, name, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputSchemaDataAttributesParametersItemsDataAttributes {\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    _enum: ").append(toIndentedString(_enum)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
