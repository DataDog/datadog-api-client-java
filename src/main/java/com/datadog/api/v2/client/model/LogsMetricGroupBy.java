/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** A group by rule. */
@JsonPropertyOrder({LogsMetricGroupBy.JSON_PROPERTY_PATH, LogsMetricGroupBy.JSON_PROPERTY_TAG_NAME})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsMetricGroupBy {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public static final String JSON_PROPERTY_TAG_NAME = "tag_name";
  private String tagName;

  public LogsMetricGroupBy() {}

  @JsonCreator
  public LogsMetricGroupBy(@JsonProperty(required = true, value = JSON_PROPERTY_PATH) String path) {
    this.path = path;
  }

  public LogsMetricGroupBy path(String path) {
    this.path = path;
    return this;
  }

  /**
   * The path to the value the log-based metric will be aggregated over.
   *
   * @return path
   */
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public LogsMetricGroupBy tagName(String tagName) {
    this.tagName = tagName;
    return this;
  }

  /**
   * Eventual name of the tag that gets created. By default, the path attribute is used as the tag
   * name.
   *
   * @return tagName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTagName() {
    return tagName;
  }

  public void setTagName(String tagName) {
    this.tagName = tagName;
  }

  /** Return true if this LogsMetricGroupBy object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsMetricGroupBy logsMetricGroupBy = (LogsMetricGroupBy) o;
    return Objects.equals(this.path, logsMetricGroupBy.path)
        && Objects.equals(this.tagName, logsMetricGroupBy.tagName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, tagName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsMetricGroupBy {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
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
