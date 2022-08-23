/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Object describing how to split the graph to display multiple visualizations per request. */
@JsonPropertyOrder({NotebookSplitBy.JSON_PROPERTY_KEYS, NotebookSplitBy.JSON_PROPERTY_TAGS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotebookSplitBy {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_KEYS = "keys";
  private List<String> keys = new ArrayList<>();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public NotebookSplitBy() {}

  @JsonCreator
  public NotebookSplitBy(
      @JsonProperty(required = true, value = JSON_PROPERTY_KEYS) List<String> keys,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS) List<String> tags) {
    this.keys = keys;
    this.tags = tags;
  }

  public NotebookSplitBy keys(List<String> keys) {
    this.keys = keys;
    return this;
  }

  public NotebookSplitBy addKeysItem(String keysItem) {
    this.keys.add(keysItem);
    return this;
  }

  /**
   * Keys to split on.
   *
   * @return keys
   */
  @JsonProperty(JSON_PROPERTY_KEYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getKeys() {
    return keys;
  }

  public void setKeys(List<String> keys) {
    this.keys = keys;
  }

  public NotebookSplitBy tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public NotebookSplitBy addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags to split on.
   *
   * @return tags
   */
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /** Return true if this NotebookSplitBy object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookSplitBy notebookSplitBy = (NotebookSplitBy) o;
    return Objects.equals(this.keys, notebookSplitBy.keys)
        && Objects.equals(this.tags, notebookSplitBy.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keys, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookSplitBy {\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
