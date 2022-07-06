/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** A single monitor group search result. */
@JsonPropertyOrder({
  MonitorGroupSearchResult.JSON_PROPERTY_GROUP,
  MonitorGroupSearchResult.JSON_PROPERTY_GROUP_TAGS,
  MonitorGroupSearchResult.JSON_PROPERTY_LAST_NODATA_TS,
  MonitorGroupSearchResult.JSON_PROPERTY_LAST_TRIGGERED_TS,
  MonitorGroupSearchResult.JSON_PROPERTY_MONITOR_ID,
  MonitorGroupSearchResult.JSON_PROPERTY_MONITOR_NAME,
  MonitorGroupSearchResult.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorGroupSearchResult {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GROUP = "group";
  private String group;

  public static final String JSON_PROPERTY_GROUP_TAGS = "group_tags";
  private List<String> groupTags = null;

  public static final String JSON_PROPERTY_LAST_NODATA_TS = "last_nodata_ts";
  private Long lastNodataTs;

  public static final String JSON_PROPERTY_LAST_TRIGGERED_TS = "last_triggered_ts";
  private JsonNullable<Long> lastTriggeredTs = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_MONITOR_ID = "monitor_id";
  private Long monitorId;

  public static final String JSON_PROPERTY_MONITOR_NAME = "monitor_name";
  private String monitorName;

  public static final String JSON_PROPERTY_STATUS = "status";
  private MonitorOverallStates status;

  /**
   * The name of the group.
   *
   * @return group
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGroup() {
    return group;
  }

  /**
   * The list of tags of the monitor group.
   *
   * @return groupTags
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getGroupTags() {
    return groupTags;
  }

  /**
   * Latest timestamp the monitor group was in NO_DATA state.
   *
   * @return lastNodataTs
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_NODATA_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLastNodataTs() {
    return lastNodataTs;
  }

  /**
   * Latest timestamp the monitor group triggered.
   *
   * @return lastTriggeredTs
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Long getLastTriggeredTs() {

    if (lastTriggeredTs == null) {
      lastTriggeredTs = JsonNullable.<Long>undefined();
    }
    return lastTriggeredTs.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_TRIGGERED_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getLastTriggeredTs_JsonNullable() {
    return lastTriggeredTs;
  }

  @JsonProperty(JSON_PROPERTY_LAST_TRIGGERED_TS)
  private void setLastTriggeredTs_JsonNullable(JsonNullable<Long> lastTriggeredTs) {
    this.lastTriggeredTs = lastTriggeredTs;
  }

  /**
   * The ID of the monitor.
   *
   * @return monitorId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMonitorId() {
    return monitorId;
  }

  /**
   * The name of the monitor.
   *
   * @return monitorName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMonitorName() {
    return monitorName;
  }

  /**
   * The different states your monitor can be in.
   *
   * @return status
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MonitorOverallStates getStatus() {
    return status;
  }

  /** Return true if this MonitorGroupSearchResult object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorGroupSearchResult monitorGroupSearchResult = (MonitorGroupSearchResult) o;
    return Objects.equals(this.group, monitorGroupSearchResult.group)
        && Objects.equals(this.groupTags, monitorGroupSearchResult.groupTags)
        && Objects.equals(this.lastNodataTs, monitorGroupSearchResult.lastNodataTs)
        && Objects.equals(this.lastTriggeredTs, monitorGroupSearchResult.lastTriggeredTs)
        && Objects.equals(this.monitorId, monitorGroupSearchResult.monitorId)
        && Objects.equals(this.monitorName, monitorGroupSearchResult.monitorName)
        && Objects.equals(this.status, monitorGroupSearchResult.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        group, groupTags, lastNodataTs, lastTriggeredTs, monitorId, monitorName, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorGroupSearchResult {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    groupTags: ").append(toIndentedString(groupTags)).append("\n");
    sb.append("    lastNodataTs: ").append(toIndentedString(lastNodataTs)).append("\n");
    sb.append("    lastTriggeredTs: ").append(toIndentedString(lastTriggeredTs)).append("\n");
    sb.append("    monitorId: ").append(toIndentedString(monitorId)).append("\n");
    sb.append("    monitorName: ").append(toIndentedString(monitorName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
