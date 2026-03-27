/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Object containing the template variable's name, associated tag/attribute, default value and selectable values.</p>
 */
@JsonPropertyOrder({
  SelectableTemplateVariableItems.JSON_PROPERTY_DEFAULT_VALUE,
  SelectableTemplateVariableItems.JSON_PROPERTY_NAME,
  SelectableTemplateVariableItems.JSON_PROPERTY_PREFIX,
  SelectableTemplateVariableItems.JSON_PROPERTY_TYPE,
  SelectableTemplateVariableItems.JSON_PROPERTY_VISIBLE_TAGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SelectableTemplateVariableItems {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEFAULT_VALUE = "default_value";
  private String defaultValue;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private String prefix;

  public static final String JSON_PROPERTY_TYPE = "type";
  private JsonNullable<String> type = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VISIBLE_TAGS = "visible_tags";
  private JsonNullable<List<String>> visibleTags = JsonNullable.<List<String>>undefined();

  public SelectableTemplateVariableItems defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * <p>The default value of the template variable.</p>
   * @return defaultValue
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DEFAULT_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Name of the template variable.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The tag/attribute key associated with the template variable.</p>
   * @return prefix
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PREFIX)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPrefix() {
        return prefix;
      }
  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }
  public SelectableTemplateVariableItems type(String type) {
    this.type = JsonNullable.<String>of(type);
    return this;
  }

  /**
   * <p>The type of variable. This is to differentiate between filter variables (interpolated in query) and group by variables (interpolated into group by).</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getType() {
        return type.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getType_JsonNullable() {
    return type;
  }
  @JsonProperty(JSON_PROPERTY_TYPE)public void setType_JsonNullable(JsonNullable<String> type) {
    this.type = type;
  }
  public void setType(String type) {
    this.type = JsonNullable.<String>of(type);
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
   * <p>List of visible tag values on the shared dashboard.</p>
   * @return visibleTags
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public List<String> getVisibleTags() {
        return visibleTags.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_VISIBLE_TAGS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getVisibleTags_JsonNullable() {
    return visibleTags;
  }
  @JsonProperty(JSON_PROPERTY_VISIBLE_TAGS)public void setVisibleTags_JsonNullable(JsonNullable<List<String>> visibleTags) {
    this.visibleTags = visibleTags;
  }
  public void setVisibleTags(List<String> visibleTags) {
    this.visibleTags = JsonNullable.<List<String>>of(visibleTags);
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

  /**
   * Return true if this SelectableTemplateVariableItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectableTemplateVariableItems selectableTemplateVariableItems = (SelectableTemplateVariableItems) o;
    return Objects.equals(this.defaultValue, selectableTemplateVariableItems.defaultValue) && Objects.equals(this.name, selectableTemplateVariableItems.name) && Objects.equals(this.prefix, selectableTemplateVariableItems.prefix) && Objects.equals(this.type, selectableTemplateVariableItems.type) && Objects.equals(this.visibleTags, selectableTemplateVariableItems.visibleTags) && Objects.equals(this.additionalProperties, selectableTemplateVariableItems.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(defaultValue,name,prefix,type,visibleTags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectableTemplateVariableItems {\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
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
