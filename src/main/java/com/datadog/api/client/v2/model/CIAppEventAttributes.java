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
   * <p>JSON object containing all event attributes and their associated values.</p>
 */
@JsonPropertyOrder({
  CIAppEventAttributes.JSON_PROPERTY_ATTRIBUTES,
  CIAppEventAttributes.JSON_PROPERTY_TAGS,
  CIAppEventAttributes.JSON_PROPERTY_TEST_LEVEL
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppEventAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private Map<String, Object> attributes = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TEST_LEVEL = "test_level";
  private CIAppTestLevel testLevel;

  public CIAppEventAttributes attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }
  public CIAppEventAttributes putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * <p>JSON object of attributes from CI Visibility test events.</p>
   * @return attributes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, Object> getAttributes() {
        return attributes;
      }
  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }
  public CIAppEventAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public CIAppEventAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>Array of tags associated with your event.</p>
   * @return tags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getTags() {
        return tags;
      }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }
  public CIAppEventAttributes testLevel(CIAppTestLevel testLevel) {
    this.testLevel = testLevel;
    this.unparsed |= !testLevel.isValid();
    return this;
  }

  /**
   * <p>Test run level.</p>
   * @return testLevel
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TEST_LEVEL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CIAppTestLevel getTestLevel() {
        return testLevel;
      }
  public void setTestLevel(CIAppTestLevel testLevel) {
    if (!testLevel.isValid()) {
        this.unparsed = true;
    }
    this.testLevel = testLevel;
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
   * @return CIAppEventAttributes
   */
  @JsonAnySetter
  public CIAppEventAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this CIAppEventAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppEventAttributes ciAppEventAttributes = (CIAppEventAttributes) o;
    return Objects.equals(this.attributes, ciAppEventAttributes.attributes) && Objects.equals(this.tags, ciAppEventAttributes.tags) && Objects.equals(this.testLevel, ciAppEventAttributes.testLevel) && Objects.equals(this.additionalProperties, ciAppEventAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(attributes,tags,testLevel, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppEventAttributes {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    testLevel: ").append(toIndentedString(testLevel)).append("\n");
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
