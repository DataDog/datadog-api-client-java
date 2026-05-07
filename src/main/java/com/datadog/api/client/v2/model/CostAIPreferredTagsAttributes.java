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

/** Attributes for the preferred tags response. */
@JsonPropertyOrder({
  CostAIPreferredTagsAttributes.JSON_PROPERTY_MESSAGE,
  CostAIPreferredTagsAttributes.JSON_PROPERTY_PREFERRED_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CostAIPreferredTagsAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_PREFERRED_TAGS = "preferred_tags";
  private List<String> preferredTags = new ArrayList<>();

  public CostAIPreferredTagsAttributes() {}

  @JsonCreator
  public CostAIPreferredTagsAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_MESSAGE) String message,
      @JsonProperty(required = true, value = JSON_PROPERTY_PREFERRED_TAGS)
          List<String> preferredTags) {
    this.message = message;
    this.preferredTags = preferredTags;
  }

  public CostAIPreferredTagsAttributes message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A contextual message about the preferred tags configuration.
   *
   * @return message
   */
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CostAIPreferredTagsAttributes preferredTags(List<String> preferredTags) {
    this.preferredTags = preferredTags;
    return this;
  }

  public CostAIPreferredTagsAttributes addPreferredTagsItem(String preferredTagsItem) {
    this.preferredTags.add(preferredTagsItem);
    return this;
  }

  /**
   * The list of preferred cost allocation tags.
   *
   * @return preferredTags
   */
  @JsonProperty(JSON_PROPERTY_PREFERRED_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getPreferredTags() {
    return preferredTags;
  }

  public void setPreferredTags(List<String> preferredTags) {
    this.preferredTags = preferredTags;
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
   * @return CostAIPreferredTagsAttributes
   */
  @JsonAnySetter
  public CostAIPreferredTagsAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CostAIPreferredTagsAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostAIPreferredTagsAttributes costAiPreferredTagsAttributes = (CostAIPreferredTagsAttributes) o;
    return Objects.equals(this.message, costAiPreferredTagsAttributes.message)
        && Objects.equals(this.preferredTags, costAiPreferredTagsAttributes.preferredTags)
        && Objects.equals(
            this.additionalProperties, costAiPreferredTagsAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, preferredTags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostAIPreferredTagsAttributes {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    preferredTags: ").append(toIndentedString(preferredTags)).append("\n");
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
