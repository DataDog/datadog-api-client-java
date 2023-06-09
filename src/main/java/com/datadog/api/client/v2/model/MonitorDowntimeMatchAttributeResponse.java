/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Downtime match details. */
@JsonPropertyOrder({
  MonitorDowntimeMatchAttributeResponse.JSON_PROPERTY_END,
  MonitorDowntimeMatchAttributeResponse.JSON_PROPERTY_GROUPS,
  MonitorDowntimeMatchAttributeResponse.JSON_PROPERTY_SCOPE,
  MonitorDowntimeMatchAttributeResponse.JSON_PROPERTY_START
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorDowntimeMatchAttributeResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_END = "end";
  private OffsetDateTime end;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private List<String> groups = null;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_START = "start";
  private OffsetDateTime start;

  public MonitorDowntimeMatchAttributeResponse end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

  /**
   * The end of the downtime.
   *
   * @return end
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }

  public MonitorDowntimeMatchAttributeResponse groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public MonitorDowntimeMatchAttributeResponse addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * An array of groups associated with the downtime.
   *
   * @return groups
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public MonitorDowntimeMatchAttributeResponse scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * The scope to which the downtime applies. Must be in <a
   * href="https://docs.datadoghq.com/logs/explorer/search_syntax/">simple grammar syntax</a>.
   *
   * @return scope
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public MonitorDowntimeMatchAttributeResponse start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

  /**
   * The start of the downtime.
   *
   * @return start
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  /** Return true if this MonitorDowntimeMatchAttributeResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorDowntimeMatchAttributeResponse monitorDowntimeMatchAttributeResponse =
        (MonitorDowntimeMatchAttributeResponse) o;
    return Objects.equals(this.end, monitorDowntimeMatchAttributeResponse.end)
        && Objects.equals(this.groups, monitorDowntimeMatchAttributeResponse.groups)
        && Objects.equals(this.scope, monitorDowntimeMatchAttributeResponse.scope)
        && Objects.equals(this.start, monitorDowntimeMatchAttributeResponse.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, groups, scope, start);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorDowntimeMatchAttributeResponse {\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
