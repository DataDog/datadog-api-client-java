/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  SplitVectorTagFilter.JSON_PROPERTY_TAG_KEY,
  SplitVectorTagFilter.JSON_PROPERTY_TAG_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SplitVectorTagFilter {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TAG_KEY = "tag_key";
  private String tagKey;

  public static final String JSON_PROPERTY_TAG_VALUES = "tag_values";
  private List<String> tagValues = new ArrayList<>();

  public SplitVectorTagFilter() {}

  @JsonCreator
  public SplitVectorTagFilter(
      @JsonProperty(required = true, value = JSON_PROPERTY_TAG_KEY) String tagKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAG_VALUES) List<String> tagValues) {
    this.tagKey = tagKey;
    this.tagValues = tagValues;
  }

  public SplitVectorTagFilter tagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public SplitVectorTagFilter tagValues(List<String> tagValues) {
    this.tagValues = tagValues;
    return this;
  }

  public SplitVectorTagFilter addTagValuesItem(String tagValuesItem) {
    this.tagValues.add(tagValuesItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  /** Return true if this SplitVectorTagFilter object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitVectorTagFilter splitVectorTagFilter = (SplitVectorTagFilter) o;
    return Objects.equals(this.tagKey, splitVectorTagFilter.tagKey)
        && Objects.equals(this.tagValues, splitVectorTagFilter.tagValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagKey, tagValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitVectorTagFilter {\n");
    sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
    sb.append("    tagValues: ").append(toIndentedString(tagValues)).append("\n");
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
