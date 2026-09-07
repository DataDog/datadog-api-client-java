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

/** Attributes of a Cloud Cost Management tag source. */
@JsonPropertyOrder({
  CostTagKeySourceAttributes.JSON_PROPERTY_TAG_KEY,
  CostTagKeySourceAttributes.JSON_PROPERTY_TAG_SOURCES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CostTagKeySourceAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TAG_KEY = "tag_key";
  private String tagKey;

  public static final String JSON_PROPERTY_TAG_SOURCES = "tag_sources";
  private List<String> tagSources = new ArrayList<>();

  public CostTagKeySourceAttributes() {}

  @JsonCreator
  public CostTagKeySourceAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_TAG_KEY) String tagKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAG_SOURCES) List<String> tagSources) {
    this.tagKey = tagKey;
    this.tagSources = tagSources;
  }

  public CostTagKeySourceAttributes tagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  /**
   * The tag key name.
   *
   * @return tagKey
   */
  @JsonProperty(JSON_PROPERTY_TAG_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTagKey() {
    return tagKey;
  }

  public void setTagKey(String tagKey) {
    this.tagKey = tagKey;
  }

  public CostTagKeySourceAttributes tagSources(List<String> tagSources) {
    this.tagSources = tagSources;
    return this;
  }

  public CostTagKeySourceAttributes addTagSourcesItem(String tagSourcesItem) {
    this.tagSources.add(tagSourcesItem);
    return this;
  }

  /**
   * Origins where this tag key was observed (for example, <code>aws-user-defined</code>).
   *
   * @return tagSources
   */
  @JsonProperty(JSON_PROPERTY_TAG_SOURCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTagSources() {
    return tagSources;
  }

  public void setTagSources(List<String> tagSources) {
    this.tagSources = tagSources;
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
   * @return CostTagKeySourceAttributes
   */
  @JsonAnySetter
  public CostTagKeySourceAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CostTagKeySourceAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostTagKeySourceAttributes costTagKeySourceAttributes = (CostTagKeySourceAttributes) o;
    return Objects.equals(this.tagKey, costTagKeySourceAttributes.tagKey)
        && Objects.equals(this.tagSources, costTagKeySourceAttributes.tagSources)
        && Objects.equals(
            this.additionalProperties, costTagKeySourceAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagKey, tagSources, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostTagKeySourceAttributes {\n");
    sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
    sb.append("    tagSources: ").append(toIndentedString(tagSources)).append("\n");
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
