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

/** A template variable that viewers can modify on the secure embed shared dashboard. */
@JsonPropertyOrder({
  SecureEmbedSelectableTemplateVariable.JSON_PROPERTY_DEFAULT_VALUES,
  SecureEmbedSelectableTemplateVariable.JSON_PROPERTY_NAME,
  SecureEmbedSelectableTemplateVariable.JSON_PROPERTY_PREFIX,
  SecureEmbedSelectableTemplateVariable.JSON_PROPERTY_VISIBLE_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecureEmbedSelectableTemplateVariable {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEFAULT_VALUES = "default_values";
  private List<String> defaultValues = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private String prefix;

  public static final String JSON_PROPERTY_VISIBLE_TAGS = "visible_tags";
  private List<String> visibleTags = null;

  public SecureEmbedSelectableTemplateVariable defaultValues(List<String> defaultValues) {
    this.defaultValues = defaultValues;
    return this;
  }

  public SecureEmbedSelectableTemplateVariable addDefaultValuesItem(String defaultValuesItem) {
    if (this.defaultValues == null) {
      this.defaultValues = new ArrayList<>();
    }
    this.defaultValues.add(defaultValuesItem);
    return this;
  }

  /**
   * Default selected values for the variable.
   *
   * @return defaultValues
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getDefaultValues() {
    return defaultValues;
  }

  public void setDefaultValues(List<String> defaultValues) {
    this.defaultValues = defaultValues;
  }

  public SecureEmbedSelectableTemplateVariable name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the template variable. Usually matches the prefix unless you want a different display
   * name.
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

  public SecureEmbedSelectableTemplateVariable prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * Tag prefix for the variable (e.g., <code>environment</code>, <code>service</code>).
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

  public SecureEmbedSelectableTemplateVariable visibleTags(List<String> visibleTags) {
    this.visibleTags = visibleTags;
    return this;
  }

  public SecureEmbedSelectableTemplateVariable addVisibleTagsItem(String visibleTagsItem) {
    if (this.visibleTags == null) {
      this.visibleTags = new ArrayList<>();
    }
    this.visibleTags.add(visibleTagsItem);
    return this;
  }

  /**
   * Restrict which tag values are visible to the viewer.
   *
   * @return visibleTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBLE_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * @return SecureEmbedSelectableTemplateVariable
   */
  @JsonAnySetter
  public SecureEmbedSelectableTemplateVariable putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecureEmbedSelectableTemplateVariable object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecureEmbedSelectableTemplateVariable secureEmbedSelectableTemplateVariable =
        (SecureEmbedSelectableTemplateVariable) o;
    return Objects.equals(this.defaultValues, secureEmbedSelectableTemplateVariable.defaultValues)
        && Objects.equals(this.name, secureEmbedSelectableTemplateVariable.name)
        && Objects.equals(this.prefix, secureEmbedSelectableTemplateVariable.prefix)
        && Objects.equals(this.visibleTags, secureEmbedSelectableTemplateVariable.visibleTags)
        && Objects.equals(
            this.additionalProperties, secureEmbedSelectableTemplateVariable.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValues, name, prefix, visibleTags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecureEmbedSelectableTemplateVariable {\n");
    sb.append("    defaultValues: ").append(toIndentedString(defaultValues)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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
