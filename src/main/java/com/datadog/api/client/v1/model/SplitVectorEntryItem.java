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

/** The split graph list contains a graph for each value of the split dimension. */
@JsonPropertyOrder({
  SplitVectorEntryItem.JSON_PROPERTY_TAG_KEY,
  SplitVectorEntryItem.JSON_PROPERTY_TAG_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SplitVectorEntryItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TAG_KEY = "tag_key";
  private String tagKey;

  public static final String JSON_PROPERTY_TAG_VALUES = "tag_values";
  private List<String> tagValues = new ArrayList<>();

  public SplitVectorEntryItem() {}

  @JsonCreator
  public SplitVectorEntryItem(
      @JsonProperty(required = true, value = JSON_PROPERTY_TAG_KEY) String tagKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAG_VALUES) List<String> tagValues) {
    this.tagKey = tagKey;
    this.tagValues = tagValues;
  }

  public SplitVectorEntryItem tagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  /**
   * The tag key.
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

  public SplitVectorEntryItem tagValues(List<String> tagValues) {
    this.tagValues = tagValues;
    return this;
  }

  public SplitVectorEntryItem addTagValuesItem(String tagValuesItem) {
    this.tagValues.add(tagValuesItem);
    return this;
  }

  /**
   * The tag values.
   *
   * @return tagValues
   */
  @JsonProperty(JSON_PROPERTY_TAG_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTagValues() {
    return tagValues;
  }

  public void setTagValues(List<String> tagValues) {
    this.tagValues = tagValues;
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
   * @return SplitVectorEntryItem
   */
  @JsonAnySetter
  public SplitVectorEntryItem putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SplitVectorEntryItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitVectorEntryItem splitVectorEntryItem = (SplitVectorEntryItem) o;
    return Objects.equals(this.tagKey, splitVectorEntryItem.tagKey)
        && Objects.equals(this.tagValues, splitVectorEntryItem.tagValues)
        && Objects.equals(this.additionalProperties, splitVectorEntryItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagKey, tagValues, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitVectorEntryItem {\n");
    sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
    sb.append("    tagValues: ").append(toIndentedString(tagValues)).append("\n");
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
