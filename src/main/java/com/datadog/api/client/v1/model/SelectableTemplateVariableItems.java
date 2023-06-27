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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Object containing the template variable's name, associated tag/attribute, default value and
 * selectable values.
 */
@JsonPropertyOrder({
  SelectableTemplateVariableItems.JSON_PROPERTY_DEFAULT_VALUE,
  SelectableTemplateVariableItems.JSON_PROPERTY_NAME,
  SelectableTemplateVariableItems.JSON_PROPERTY_PREFIX,
  SelectableTemplateVariableItems.JSON_PROPERTY_VISIBLE_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SelectableTemplateVariableItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEFAULT_VALUE = "default_value";
  private String defaultValue;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private String prefix;

  public static final String JSON_PROPERTY_VISIBLE_TAGS = "visible_tags";
  private JsonNullable<List<String>> visibleTags = JsonNullable.<List<String>>undefined();

  public SelectableTemplateVariableItems defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * The default value of the template variable.
   *
   * @return defaultValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public SelectableTemplateVariableItems name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the template variable.
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

  public SelectableTemplateVariableItems prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * The tag/attribute key associated with the template variable.
   *
   * @return prefix
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public SelectableTemplateVariableItems visibleTags(List<String> visibleTags) {
    this.visibleTags = JsonNullable.<List<String>>of(visibleTags);
    return this;
  }

  public SelectableTemplateVariableItems addVisibleTagsItem(String visibleTagsItem) {
    if (this.visibleTags == null || !this.visibleTags.isPresent()) {
      this.visibleTags = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.visibleTags.get().add(visibleTagsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * List of visible tag values on the shared dashboard.
   *
   * @return visibleTags
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getVisibleTags() {
    return visibleTags.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VISIBLE_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getVisibleTags_JsonNullable() {
    return visibleTags;
  }

  @JsonProperty(JSON_PROPERTY_VISIBLE_TAGS)
  public void setVisibleTags_JsonNullable(JsonNullable<List<String>> visibleTags) {
    this.visibleTags = visibleTags;
  }

  public void setVisibleTags(List<String> visibleTags) {
    this.visibleTags = JsonNullable.<List<String>>of(visibleTags);
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
   * @return SelectableTemplateVariableItems
   */
  @JsonAnySetter
  public SelectableTemplateVariableItems putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SelectableTemplateVariableItems object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectableTemplateVariableItems selectableTemplateVariableItems =
        (SelectableTemplateVariableItems) o;
    return Objects.equals(this.defaultValue, selectableTemplateVariableItems.defaultValue)
        && Objects.equals(this.name, selectableTemplateVariableItems.name)
        && Objects.equals(this.prefix, selectableTemplateVariableItems.prefix)
        && Objects.equals(this.visibleTags, selectableTemplateVariableItems.visibleTags)
        && Objects.equals(
            this.additionalProperties, selectableTemplateVariableItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValue, name, prefix, visibleTags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectableTemplateVariableItems {\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    visibleTags: ").append(toIndentedString(visibleTags)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append("}");
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
