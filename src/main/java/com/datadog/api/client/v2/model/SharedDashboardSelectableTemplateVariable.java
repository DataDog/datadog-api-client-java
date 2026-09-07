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

/** A template variable that viewers can modify on the shared dashboard. */
@JsonPropertyOrder({
  SharedDashboardSelectableTemplateVariable.JSON_PROPERTY_ALLOW_ANY_VALUE,
  SharedDashboardSelectableTemplateVariable.JSON_PROPERTY_DEFAULT_VALUES,
  SharedDashboardSelectableTemplateVariable.JSON_PROPERTY_NAME,
  SharedDashboardSelectableTemplateVariable.JSON_PROPERTY_PREFIX,
  SharedDashboardSelectableTemplateVariable.JSON_PROPERTY_TYPE,
  SharedDashboardSelectableTemplateVariable.JSON_PROPERTY_VISIBLE_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SharedDashboardSelectableTemplateVariable {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOW_ANY_VALUE = "allow_any_value";
  private Boolean allowAnyValue;

  public static final String JSON_PROPERTY_DEFAULT_VALUES = "default_values";
  private List<String> defaultValues = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private String prefix;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_VISIBLE_TAGS = "visible_tags";
  private List<String> visibleTags = new ArrayList<>();

  public SharedDashboardSelectableTemplateVariable() {}

  @JsonCreator
  public SharedDashboardSelectableTemplateVariable(
      @JsonProperty(required = true, value = JSON_PROPERTY_ALLOW_ANY_VALUE) Boolean allowAnyValue,
      @JsonProperty(required = true, value = JSON_PROPERTY_DEFAULT_VALUES)
          List<String> defaultValues,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_PREFIX) String prefix,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type,
      @JsonProperty(required = true, value = JSON_PROPERTY_VISIBLE_TAGS) List<String> visibleTags) {
    this.allowAnyValue = allowAnyValue;
    this.defaultValues = defaultValues;
    this.name = name;
    this.prefix = prefix;
    this.type = type;
    this.visibleTags = visibleTags;
  }

  public SharedDashboardSelectableTemplateVariable allowAnyValue(Boolean allowAnyValue) {
    this.allowAnyValue = allowAnyValue;
    return this;
  }

  /**
   * Whether viewers can see all tag values for the template variable and specify any value.
   *
   * @return allowAnyValue
   */
  @JsonProperty(JSON_PROPERTY_ALLOW_ANY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getAllowAnyValue() {
    return allowAnyValue;
  }

  public void setAllowAnyValue(Boolean allowAnyValue) {
    this.allowAnyValue = allowAnyValue;
  }

  public SharedDashboardSelectableTemplateVariable defaultValues(List<String> defaultValues) {
    this.defaultValues = defaultValues;
    return this;
  }

  public SharedDashboardSelectableTemplateVariable addDefaultValuesItem(String defaultValuesItem) {
    this.defaultValues.add(defaultValuesItem);
    return this;
  }

  /**
   * Default selected values for the variable.
   *
   * @return defaultValues
   */
  @JsonProperty(JSON_PROPERTY_DEFAULT_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getDefaultValues() {
    return defaultValues;
  }

  public void setDefaultValues(List<String> defaultValues) {
    this.defaultValues = defaultValues;
  }

  public SharedDashboardSelectableTemplateVariable name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the template variable.
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

  public SharedDashboardSelectableTemplateVariable prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * Tag prefix for the variable.
   *
   * @return prefix
   */
  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public SharedDashboardSelectableTemplateVariable type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the template variable.
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

  public SharedDashboardSelectableTemplateVariable visibleTags(List<String> visibleTags) {
    this.visibleTags = visibleTags;
    return this;
  }

  public SharedDashboardSelectableTemplateVariable addVisibleTagsItem(String visibleTagsItem) {
    this.visibleTags.add(visibleTagsItem);
    return this;
  }

  /**
   * Restricts which tag values are visible to the viewer.
   *
   * @return visibleTags
   */
  @JsonProperty(JSON_PROPERTY_VISIBLE_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getVisibleTags() {
    return visibleTags;
  }

  public void setVisibleTags(List<String> visibleTags) {
    this.visibleTags = visibleTags;
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
   * @return SharedDashboardSelectableTemplateVariable
   */
  @JsonAnySetter
  public SharedDashboardSelectableTemplateVariable putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SharedDashboardSelectableTemplateVariable object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedDashboardSelectableTemplateVariable sharedDashboardSelectableTemplateVariable =
        (SharedDashboardSelectableTemplateVariable) o;
    return Objects.equals(
            this.allowAnyValue, sharedDashboardSelectableTemplateVariable.allowAnyValue)
        && Objects.equals(
            this.defaultValues, sharedDashboardSelectableTemplateVariable.defaultValues)
        && Objects.equals(this.name, sharedDashboardSelectableTemplateVariable.name)
        && Objects.equals(this.prefix, sharedDashboardSelectableTemplateVariable.prefix)
        && Objects.equals(this.type, sharedDashboardSelectableTemplateVariable.type)
        && Objects.equals(this.visibleTags, sharedDashboardSelectableTemplateVariable.visibleTags)
        && Objects.equals(
            this.additionalProperties,
            sharedDashboardSelectableTemplateVariable.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowAnyValue, defaultValues, name, prefix, type, visibleTags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedDashboardSelectableTemplateVariable {\n");
    sb.append("    allowAnyValue: ").append(toIndentedString(allowAnyValue)).append("\n");
    sb.append("    defaultValues: ").append(toIndentedString(defaultValues)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    visibleTags: ").append(toIndentedString(visibleTags)).append("\n");
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
