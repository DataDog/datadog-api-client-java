/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The definition of <code>OutputSchemaParameters</code> object.</p>
 */
@JsonPropertyOrder({
  OutputSchemaParameters.JSON_PROPERTY_DEFAULT_VALUE,
  OutputSchemaParameters.JSON_PROPERTY_DESCRIPTION,
  OutputSchemaParameters.JSON_PROPERTY_LABEL,
  OutputSchemaParameters.JSON_PROPERTY_NAME,
  OutputSchemaParameters.JSON_PROPERTY_TYPE,
  OutputSchemaParameters.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OutputSchemaParameters {
  @JsonIgnore
  public boolean unparsed = false;
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
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)OutputSchemaParametersType type) {
        this.name = name;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public OutputSchemaParameters defaultValue(Object defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * <p>The <code>OutputSchemaParameters</code> <code>defaultValue</code>.</p>
   * @return defaultValue
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DEFAULT_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The <code>OutputSchemaParameters</code> <code>description</code>.</p>
   * @return description
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The <code>OutputSchemaParameters</code> <code>label</code>.</p>
   * @return label
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LABEL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The <code>OutputSchemaParameters</code> <code>name</code>.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * <p>The definition of <code>OutputSchemaParametersType</code> object.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * <p>The <code>OutputSchemaParameters</code> <code>value</code>.</p>
   * @return value
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Object getValue() {
        return value;
      }
  public void setValue(Object value) {
    this.value = value;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return OutputSchemaParameters
   */
  @JsonAnySetter
  public OutputSchemaParameters putAdditionalProperty(String key, Object value) {
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
   * Return true if this OutputSchemaParameters object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutputSchemaParameters outputSchemaParameters = (OutputSchemaParameters) o;
    return Objects.equals(this.defaultValue, outputSchemaParameters.defaultValue) && Objects.equals(this.description, outputSchemaParameters.description) && Objects.equals(this.label, outputSchemaParameters.label) && Objects.equals(this.name, outputSchemaParameters.name) && Objects.equals(this.type, outputSchemaParameters.type) && Objects.equals(this.value, outputSchemaParameters.value) && Objects.equals(this.additionalProperties, outputSchemaParameters.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(defaultValue,description,label,name,type,value, additionalProperties);
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
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
