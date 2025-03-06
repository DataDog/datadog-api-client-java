/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** The definition of <code>OutputSchemaParameters</code> object. */
@JsonPropertyOrder({
  OutputSchemaParameters.JSON_PROPERTY_DEFAULT_VALUE,
  OutputSchemaParameters.JSON_PROPERTY_DESCRIPTION,
  OutputSchemaParameters.JSON_PROPERTY_LABEL,
  OutputSchemaParameters.JSON_PROPERTY_NAME,
  OutputSchemaParameters.JSON_PROPERTY_TYPE,
  OutputSchemaParameters.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OutputSchemaParameters {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEFAULT_VALUE = "defaultValue";
  private Object defaultValue = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private OutputSchemaParametersType type;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Object value = null;

  public OutputSchemaParameters() {}

  @JsonCreator
  public OutputSchemaParameters(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) OutputSchemaParametersType type) {
    this.name = name;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public OutputSchemaParameters defaultValue(Object defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * The <code>OutputSchemaParameters</code> <code>defaultValue</code>.
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

  public OutputSchemaParameters description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The <code>OutputSchemaParameters</code> <code>description</code>.
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

  public OutputSchemaParameters label(String label) {
    this.label = label;
    return this;
  }

  /**
   * The <code>OutputSchemaParameters</code> <code>label</code>.
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

  public OutputSchemaParameters name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The <code>OutputSchemaParameters</code> <code>name</code>.
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

  public OutputSchemaParameters type(OutputSchemaParametersType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The definition of <code>OutputSchemaParametersType</code> object.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OutputSchemaParametersType getType() {
    return type;
  }

  public void setType(OutputSchemaParametersType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public OutputSchemaParameters value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * The <code>OutputSchemaParameters</code> <code>value</code>.
   *
   * @return value
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  /** Return true if this OutputSchemaParameters object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutputSchemaParameters outputSchemaParameters = (OutputSchemaParameters) o;
    return Objects.equals(this.defaultValue, outputSchemaParameters.defaultValue)
        && Objects.equals(this.description, outputSchemaParameters.description)
        && Objects.equals(this.label, outputSchemaParameters.label)
        && Objects.equals(this.name, outputSchemaParameters.name)
        && Objects.equals(this.type, outputSchemaParameters.type)
        && Objects.equals(this.value, outputSchemaParameters.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValue, description, label, name, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputSchemaParameters {\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
