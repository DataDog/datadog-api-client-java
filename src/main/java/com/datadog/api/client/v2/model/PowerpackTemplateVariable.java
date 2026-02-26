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
import org.openapitools.jackson.nullable.JsonNullable;

/** Powerpack template variables. */
@JsonPropertyOrder({
  PowerpackTemplateVariable.JSON_PROPERTY_AVAILABLE_VALUES,
  PowerpackTemplateVariable.JSON_PROPERTY_DEFAULTS,
  PowerpackTemplateVariable.JSON_PROPERTY_NAME,
  PowerpackTemplateVariable.JSON_PROPERTY_PREFIX
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PowerpackTemplateVariable {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AVAILABLE_VALUES = "available_values";
  private JsonNullable<List<String>> availableValues = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_DEFAULTS = "defaults";
  private List<String> defaults = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private JsonNullable<String> prefix = JsonNullable.<String>undefined();

  public PowerpackTemplateVariable() {}

  @JsonCreator
  public PowerpackTemplateVariable(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.name = name;
  }

  public PowerpackTemplateVariable availableValues(List<String> availableValues) {
    this.availableValues = JsonNullable.<List<String>>of(availableValues);
    return this;
  }

  public PowerpackTemplateVariable addAvailableValuesItem(String availableValuesItem) {
    if (this.availableValues == null || !this.availableValues.isPresent()) {
      this.availableValues = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.availableValues.get().add(availableValuesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of values that the template variable drop-down is limited to.
   *
   * @return availableValues
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getAvailableValues() {
    return availableValues.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVAILABLE_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getAvailableValues_JsonNullable() {
    return availableValues;
  }

  @JsonProperty(JSON_PROPERTY_AVAILABLE_VALUES)
  public void setAvailableValues_JsonNullable(JsonNullable<List<String>> availableValues) {
    this.availableValues = availableValues;
  }

  public void setAvailableValues(List<String> availableValues) {
    this.availableValues = JsonNullable.<List<String>>of(availableValues);
  }

  public PowerpackTemplateVariable defaults(List<String> defaults) {
    this.defaults = defaults;
    return this;
  }

  public PowerpackTemplateVariable addDefaultsItem(String defaultsItem) {
    if (this.defaults == null) {
      this.defaults = new ArrayList<>();
    }
    this.defaults.add(defaultsItem);
    return this;
  }

  /**
   * One or many template variable default values within the saved view, which are unioned together
   * using <code>OR</code> if more than one is specified.
   *
   * @return defaults
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getDefaults() {
    return defaults;
  }

  public void setDefaults(List<String> defaults) {
    this.defaults = defaults;
  }

  public PowerpackTemplateVariable name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the variable.
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

  public PowerpackTemplateVariable prefix(String prefix) {
    this.prefix = JsonNullable.<String>of(prefix);
    return this;
  }

  /**
   * The tag prefix associated with the variable. Only tags with this prefix appear in the variable
   * drop-down.
   *
   * @return prefix
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getPrefix() {
    return prefix.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPrefix_JsonNullable() {
    return prefix;
  }

  @JsonProperty(JSON_PROPERTY_PREFIX)
  public void setPrefix_JsonNullable(JsonNullable<String> prefix) {
    this.prefix = prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = JsonNullable.<String>of(prefix);
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
   * @return PowerpackTemplateVariable
   */
  @JsonAnySetter
  public PowerpackTemplateVariable putAdditionalProperty(String key, Object value) {
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

  /** Return true if this PowerpackTemplateVariable object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowerpackTemplateVariable powerpackTemplateVariable = (PowerpackTemplateVariable) o;
    return Objects.equals(this.availableValues, powerpackTemplateVariable.availableValues)
        && Objects.equals(this.defaults, powerpackTemplateVariable.defaults)
        && Objects.equals(this.name, powerpackTemplateVariable.name)
        && Objects.equals(this.prefix, powerpackTemplateVariable.prefix)
        && Objects.equals(
            this.additionalProperties, powerpackTemplateVariable.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableValues, defaults, name, prefix, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerpackTemplateVariable {\n");
    sb.append("    availableValues: ").append(toIndentedString(availableValues)).append("\n");
    sb.append("    defaults: ").append(toIndentedString(defaults)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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
