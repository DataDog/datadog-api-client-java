/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Template variable. */
@JsonPropertyOrder({
  DashboardTemplateVariable.JSON_PROPERTY_AVAILABLE_VALUES,
  DashboardTemplateVariable.JSON_PROPERTY_DEFAULT,
  DashboardTemplateVariable.JSON_PROPERTY_DEFAULTS,
  DashboardTemplateVariable.JSON_PROPERTY_NAME,
  DashboardTemplateVariable.JSON_PROPERTY_PREFIX,
  DashboardTemplateVariable.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardTemplateVariable {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AVAILABLE_VALUES = "available_values";
  private JsonNullable<List<String>> availableValues = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_DEFAULT = "default";
  private JsonNullable<String> _default = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DEFAULTS = "defaults";
  private List<String> defaults = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private JsonNullable<String> prefix = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private JsonNullable<String> type = JsonNullable.<String>undefined();

  public DashboardTemplateVariable() {}

  @JsonCreator
  public DashboardTemplateVariable(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.name = name;
  }

  public DashboardTemplateVariable availableValues(List<String> availableValues) {
    this.availableValues = JsonNullable.<List<String>>of(availableValues);
    return this;
  }

  public DashboardTemplateVariable addAvailableValuesItem(String availableValuesItem) {
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

  public DashboardTemplateVariable _default(String _default) {
    this._default = JsonNullable.<String>of(_default);
    return this;
  }

  /**
   * (deprecated) The default value for the template variable on dashboard load. Cannot be used in
   * conjunction with <code>defaults</code>.
   *
   * @return _default
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDefault() {
    return _default.orElse(null);
  }

  @Deprecated
  @JsonProperty(JSON_PROPERTY_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDefault_JsonNullable() {
    return _default;
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT)
  public void setDefault_JsonNullable(JsonNullable<String> _default) {
    this._default = _default;
  }

  public void setDefault(String _default) {
    this._default = JsonNullable.<String>of(_default);
  }

  public DashboardTemplateVariable defaults(List<String> defaults) {
    this.defaults = defaults;
    return this;
  }

  public DashboardTemplateVariable addDefaultsItem(String defaultsItem) {
    if (this.defaults == null) {
      this.defaults = new ArrayList<>();
    }
    this.defaults.add(defaultsItem);
    return this;
  }

  /**
   * One or many default values for template variables on load. If more than one default is
   * specified, they will be unioned together with <code>OR</code>. Cannot be used in conjunction
   * with <code>default</code>.
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

  public DashboardTemplateVariable name(String name) {
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

  public DashboardTemplateVariable prefix(String prefix) {
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

  public DashboardTemplateVariable type(String type) {
    this.type = JsonNullable.<String>of(type);
    return this;
  }

  /**
   * The type of variable. This is to differentiate between filter variables (interpolated in query)
   * and group by variables (interpolated into group by).
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getType() {
    return type.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getType_JsonNullable() {
    return type;
  }

  @JsonProperty(JSON_PROPERTY_TYPE)
  public void setType_JsonNullable(JsonNullable<String> type) {
    this.type = type;
  }

  public void setType(String type) {
    this.type = JsonNullable.<String>of(type);
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
   * @return DashboardTemplateVariable
   */
  @JsonAnySetter
  public DashboardTemplateVariable putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DashboardTemplateVariable object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardTemplateVariable dashboardTemplateVariable = (DashboardTemplateVariable) o;
    return Objects.equals(this.availableValues, dashboardTemplateVariable.availableValues)
        && Objects.equals(this._default, dashboardTemplateVariable._default)
        && Objects.equals(this.defaults, dashboardTemplateVariable.defaults)
        && Objects.equals(this.name, dashboardTemplateVariable.name)
        && Objects.equals(this.prefix, dashboardTemplateVariable.prefix)
        && Objects.equals(this.type, dashboardTemplateVariable.type)
        && Objects.equals(
            this.additionalProperties, dashboardTemplateVariable.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        availableValues, _default, defaults, name, prefix, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardTemplateVariable {\n");
    sb.append("    availableValues: ").append(toIndentedString(availableValues)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    defaults: ").append(toIndentedString(defaults)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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
