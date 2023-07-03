/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Object of the monitor tags. */
@JsonPropertyOrder({DowntimeMonitorIdentifierTags.JSON_PROPERTY_MONITOR_TAGS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DowntimeMonitorIdentifierTags {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MONITOR_TAGS = "monitor_tags";
  private List<String> monitorTags = new ArrayList<>();

  public DowntimeMonitorIdentifierTags() {}

  @JsonCreator
  public DowntimeMonitorIdentifierTags(
      @JsonProperty(required = true, value = JSON_PROPERTY_MONITOR_TAGS) List<String> monitorTags) {
    this.monitorTags = monitorTags;
  }

  public DowntimeMonitorIdentifierTags monitorTags(List<String> monitorTags) {
    this.monitorTags = monitorTags;
    return this;
  }

  public DowntimeMonitorIdentifierTags addMonitorTagsItem(String monitorTagsItem) {
    this.monitorTags.add(monitorTagsItem);
    return this;
  }

  /**
   * A list of monitor tags. For example, tags that are applied directly to monitors, not tags that
   * are used in monitor queries (which are filtered by the scope parameter), to which the downtime
   * applies. The resulting downtime applies to monitors that match <strong>all</strong> provided
   * monitor tags. Setting <code>monitor_tags</code> to <code>[*]</code> configures the downtime to
   * mute all monitors for the given scope.
   *
   * @return monitorTags
   */
  @JsonProperty(JSON_PROPERTY_MONITOR_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getMonitorTags() {
    return monitorTags;
  }

  public void setMonitorTags(List<String> monitorTags) {
    this.monitorTags = monitorTags;
  }

  /** Return true if this DowntimeMonitorIdentifierTags object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowntimeMonitorIdentifierTags downtimeMonitorIdentifierTags = (DowntimeMonitorIdentifierTags) o;
    return Objects.equals(this.monitorTags, downtimeMonitorIdentifierTags.monitorTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitorTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowntimeMonitorIdentifierTags {\n");
    sb.append("    monitorTags: ").append(toIndentedString(monitorTags)).append("\n");
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
