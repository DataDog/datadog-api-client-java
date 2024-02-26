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

/** JSON object containing all event attributes and their associated values. */
@JsonPropertyOrder({
  CIAppPipelineEventAttributes.JSON_PROPERTY_ATTRIBUTES,
  CIAppPipelineEventAttributes.JSON_PROPERTY_CI_LEVEL,
  CIAppPipelineEventAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppPipelineEventAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private Map<String, Object> attributes = null;

  public static final String JSON_PROPERTY_CI_LEVEL = "ci_level";
  private CIAppPipelineLevel ciLevel;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public CIAppPipelineEventAttributes attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public CIAppPipelineEventAttributes putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * JSON object of attributes from CI Visibility pipeline events.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }

  public CIAppPipelineEventAttributes ciLevel(CIAppPipelineLevel ciLevel) {
    this.ciLevel = ciLevel;
    this.unparsed |= !ciLevel.isValid();
    return this;
  }

  /**
   * Pipeline execution level.
   *
   * @return ciLevel
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CI_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CIAppPipelineLevel getCiLevel() {
    return ciLevel;
  }

  public void setCiLevel(CIAppPipelineLevel ciLevel) {
    if (!ciLevel.isValid()) {
      this.unparsed = true;
    }
    this.ciLevel = ciLevel;
  }

  public CIAppPipelineEventAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CIAppPipelineEventAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Array of tags associated with your event.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
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
   * @return CIAppPipelineEventAttributes
   */
  @JsonAnySetter
  public CIAppPipelineEventAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CIAppPipelineEventAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppPipelineEventAttributes ciAppPipelineEventAttributes = (CIAppPipelineEventAttributes) o;
    return Objects.equals(this.attributes, ciAppPipelineEventAttributes.attributes)
        && Objects.equals(this.ciLevel, ciAppPipelineEventAttributes.ciLevel)
        && Objects.equals(this.tags, ciAppPipelineEventAttributes.tags)
        && Objects.equals(
            this.additionalProperties, ciAppPipelineEventAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, ciLevel, tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppPipelineEventAttributes {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    ciLevel: ").append(toIndentedString(ciLevel)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
