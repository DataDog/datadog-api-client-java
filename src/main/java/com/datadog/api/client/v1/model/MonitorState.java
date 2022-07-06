/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Wrapper object with the different monitor states. */
@JsonPropertyOrder({MonitorState.JSON_PROPERTY_GROUPS})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorState {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GROUPS = "groups";
  private Map<String, MonitorStateGroup> groups = null;

  public MonitorState groups(Map<String, MonitorStateGroup> groups) {
    this.groups = groups;
    return this;
  }

  public MonitorState putGroupsItem(String key, MonitorStateGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new HashMap<>();
    }
    this.groups.put(key, groupsItem);
    return this;
  }

  /**
   * Dictionary where the keys are groups (comma separated lists of tags) and the values are the
   * list of groups your monitor is broken down on.
   *
   * @return groups
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, MonitorStateGroup> getGroups() {
    return groups;
  }

  public void setGroups(Map<String, MonitorStateGroup> groups) {
    this.groups = groups;
  }

  /** Return true if this MonitorState object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorState monitorState = (MonitorState) o;
    return Objects.equals(this.groups, monitorState.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorState {\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
