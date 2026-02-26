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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * List of objects representing template variables on the monitor which can have selectable values.
 */
@JsonPropertyOrder({
  MonitorUserTemplateTemplateVariablesItems.JSON_PROPERTY_AVAILABLE_VALUES,
  MonitorUserTemplateTemplateVariablesItems.JSON_PROPERTY_DEFAULTS,
  MonitorUserTemplateTemplateVariablesItems.JSON_PROPERTY_NAME,
  MonitorUserTemplateTemplateVariablesItems.JSON_PROPERTY_TAG_KEY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorUserTemplateTemplateVariablesItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AVAILABLE_VALUES = "available_values";
  private List<String> availableValues = null;

  public static final String JSON_PROPERTY_DEFAULTS = "defaults";
  private List<String> defaults = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TAG_KEY = "tag_key";
  private String tagKey;

  public MonitorUserTemplateTemplateVariablesItems() {}

  @JsonCreator
  public MonitorUserTemplateTemplateVariablesItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.name = name;
  }

  public MonitorUserTemplateTemplateVariablesItems availableValues(List<String> availableValues) {
    this.availableValues = availableValues;
    return this;
  }

  public MonitorUserTemplateTemplateVariablesItems addAvailableValuesItem(
      String availableValuesItem) {
    if (this.availableValues == null) {
      this.availableValues = new ArrayList<>();
    }
    this.availableValues.add(availableValuesItem);
    return this;
  }

  /**
   * Available values for the variable.
   *
   * @return availableValues
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVAILABLE_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getAvailableValues() {
    return availableValues;
  }

  public void setAvailableValues(List<String> availableValues) {
    this.availableValues = availableValues;
  }

  public MonitorUserTemplateTemplateVariablesItems defaults(List<String> defaults) {
    this.defaults = defaults;
    return this;
  }

  public MonitorUserTemplateTemplateVariablesItems addDefaultsItem(String defaultsItem) {
    if (this.defaults == null) {
      this.defaults = new ArrayList<>();
    }
    this.defaults.add(defaultsItem);
    return this;
  }

  /**
   * Default values of the template variable.
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

  public MonitorUserTemplateTemplateVariablesItems name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the template variable.
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

  public MonitorUserTemplateTemplateVariablesItems tagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  /**
   * The tag key associated with the variable. This works the same as dashboard template variables.
   *
   * @return tagKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTagKey() {
    return tagKey;
  }

  public void setTagKey(String tagKey) {
    this.tagKey = tagKey;
  }

  /** Return true if this MonitorUserTemplateTemplateVariablesItems object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorUserTemplateTemplateVariablesItems monitorUserTemplateTemplateVariablesItems =
        (MonitorUserTemplateTemplateVariablesItems) o;
    return Objects.equals(
            this.availableValues, monitorUserTemplateTemplateVariablesItems.availableValues)
        && Objects.equals(this.defaults, monitorUserTemplateTemplateVariablesItems.defaults)
        && Objects.equals(this.name, monitorUserTemplateTemplateVariablesItems.name)
        && Objects.equals(this.tagKey, monitorUserTemplateTemplateVariablesItems.tagKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableValues, defaults, name, tagKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorUserTemplateTemplateVariablesItems {\n");
    sb.append("    availableValues: ").append(toIndentedString(availableValues)).append("\n");
    sb.append("    defaults: ").append(toIndentedString(defaults)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
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
