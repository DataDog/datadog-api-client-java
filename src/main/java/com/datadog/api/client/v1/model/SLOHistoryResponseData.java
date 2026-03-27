/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** An array of service level objective objects. */
@JsonPropertyOrder({
  SLOHistoryResponseData.JSON_PROPERTY_FROM_TS,
  SLOHistoryResponseData.JSON_PROPERTY_GROUP_BY,
  SLOHistoryResponseData.JSON_PROPERTY_GROUPS,
  SLOHistoryResponseData.JSON_PROPERTY_MONITORS,
  SLOHistoryResponseData.JSON_PROPERTY_OVERALL,
  SLOHistoryResponseData.JSON_PROPERTY_SERIES,
  SLOHistoryResponseData.JSON_PROPERTY_THRESHOLDS,
  SLOHistoryResponseData.JSON_PROPERTY_TO_TS,
  SLOHistoryResponseData.JSON_PROPERTY_TYPE,
  SLOHistoryResponseData.JSON_PROPERTY_TYPE_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOHistoryResponseData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FROM_TS = "from_ts";
  private Long fromTs;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<String> groupBy = null;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private List<SLOHistoryMonitor> groups = null;

  public static final String JSON_PROPERTY_MONITORS = "monitors";
  private List<SLOHistoryMonitor> monitors = null;

  public static final String JSON_PROPERTY_OVERALL = "overall";
  private SLOHistorySLIData overall;

  public static final String JSON_PROPERTY_SERIES = "series";
  private SLOHistoryMetrics series;

  public static final String JSON_PROPERTY_THRESHOLDS = "thresholds";
  private Map<String, SLOThreshold> thresholds = null;

  public static final String JSON_PROPERTY_TO_TS = "to_ts";
  private Long toTs;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SLOType type;

  public static final String JSON_PROPERTY_TYPE_ID = "type_id";
  private SLOTypeNumeric typeId;

  public SLOHistoryResponseData fromTs(Long fromTs) {
    this.fromTs = fromTs;
    return this;
  }

  /**
   * The <code>from</code> timestamp in epoch seconds.
   *
   * @return fromTs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFromTs() {
    return fromTs;
  }

  public void setFromTs(Long fromTs) {
    this.fromTs = fromTs;
  }

  public SLOHistoryResponseData groupBy(List<String> groupBy) {
    this.groupBy = groupBy;
    return this;
  }

  public SLOHistoryResponseData addGroupByItem(String groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    return this;
  }

  /**
   * For <code>metric</code> based SLOs where the query includes a group-by clause, this represents
   * the list of grouping parameters.
   *
   * <p>This is not included in responses for <code>monitor</code> based SLOs.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<String> groupBy) {
    this.groupBy = groupBy;
  }

  public SLOHistoryResponseData groups(List<SLOHistoryMonitor> groups) {
    this.groups = groups;
    for (SLOHistoryMonitor item : groups) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SLOHistoryResponseData addGroupsItem(SLOHistoryMonitor groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    this.unparsed |= groupsItem.unparsed;
    return this;
  }

  /**
   * For grouped SLOs, this represents SLI data for specific groups.
   *
   * <p>This is not included in the responses for <code>metric</code> based SLOs.
   *
   * @return groups
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SLOHistoryMonitor> getGroups() {
    return groups;
  }

  public void setGroups(List<SLOHistoryMonitor> groups) {
    this.groups = groups;
  }

  public SLOHistoryResponseData monitors(List<SLOHistoryMonitor> monitors) {
    this.monitors = monitors;
    for (SLOHistoryMonitor item : monitors) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SLOHistoryResponseData addMonitorsItem(SLOHistoryMonitor monitorsItem) {
    if (this.monitors == null) {
      this.monitors = new ArrayList<>();
    }
    this.monitors.add(monitorsItem);
    this.unparsed |= monitorsItem.unparsed;
    return this;
  }

  /**
   * For multi-monitor SLOs, this represents SLI data for specific monitors.
   *
   * <p>This is not included in the responses for <code>metric</code> based SLOs.
   *
   * @return monitors
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SLOHistoryMonitor> getMonitors() {
    return monitors;
  }

  public void setMonitors(List<SLOHistoryMonitor> monitors) {
    this.monitors = monitors;
  }

  public SLOHistoryResponseData overall(SLOHistorySLIData overall) {
    this.overall = overall;
    this.unparsed |= overall.unparsed;
    return this;
  }

  /**
   * An object that holds an SLI value and its associated data. It can represent an SLO's overall
   * SLI value. This can also represent the SLI value for a specific monitor in multi-monitor SLOs,
   * or a group in grouped SLOs.
   *
   * @return overall
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SLOHistorySLIData getOverall() {
    return overall;
  }

  public void setOverall(SLOHistorySLIData overall) {
    this.overall = overall;
  }

  public SLOHistoryResponseData series(SLOHistoryMetrics series) {
    this.series = series;
    this.unparsed |= series.unparsed;
    return this;
  }

  /**
   * A <code>metric</code> based SLO history response.
   *
   * <p>This is not included in responses for <code>monitor</code> based SLOs.
   *
   * @return series
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SLOHistoryMetrics getSeries() {
    return series;
  }

  public void setSeries(SLOHistoryMetrics series) {
    this.series = series;
  }

  public SLOHistoryResponseData thresholds(Map<String, SLOThreshold> thresholds) {
    this.thresholds = thresholds;
    return this;
  }

  public SLOHistoryResponseData putThresholdsItem(String key, SLOThreshold thresholdsItem) {
    if (this.thresholds == null) {
      this.thresholds = new HashMap<>();
    }
    this.thresholds.put(key, thresholdsItem);
    return this;
  }

  /**
   * mapping of string timeframe to the SLO threshold.
   *
   * @return thresholds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THRESHOLDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, SLOThreshold> getThresholds() {
    return thresholds;
  }

  public void setThresholds(Map<String, SLOThreshold> thresholds) {
    this.thresholds = thresholds;
  }

  public SLOHistoryResponseData toTs(Long toTs) {
    this.toTs = toTs;
    return this;
  }

  /**
   * The <code>to</code> timestamp in epoch seconds.
   *
   * @return toTs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getToTs() {
    return toTs;
  }

  public void setToTs(Long toTs) {
    this.toTs = toTs;
  }

  public SLOHistoryResponseData type(SLOType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of the service level objective.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SLOType getType() {
    return type;
  }

  public void setType(SLOType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public SLOHistoryResponseData typeId(SLOTypeNumeric typeId) {
    this.typeId = typeId;
    this.unparsed |= !typeId.isValid();
    return this;
  }

  /**
   * A numeric representation of the type of the service level objective (<code>0</code> for
   * monitor, <code>1</code> for metric). Always included in service level objective responses.
   * Ignored in create/update requests.
   *
   * @return typeId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SLOTypeNumeric getTypeId() {
    return typeId;
  }

  public void setTypeId(SLOTypeNumeric typeId) {
    if (!typeId.isValid()) {
      this.unparsed = true;
    }
    this.typeId = typeId;
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
   * @return SLOHistoryResponseData
   */
  @JsonAnySetter
  public SLOHistoryResponseData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SLOHistoryResponseData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOHistoryResponseData sloHistoryResponseData = (SLOHistoryResponseData) o;
    return Objects.equals(this.fromTs, sloHistoryResponseData.fromTs)
        && Objects.equals(this.groupBy, sloHistoryResponseData.groupBy)
        && Objects.equals(this.groups, sloHistoryResponseData.groups)
        && Objects.equals(this.monitors, sloHistoryResponseData.monitors)
        && Objects.equals(this.overall, sloHistoryResponseData.overall)
        && Objects.equals(this.series, sloHistoryResponseData.series)
        && Objects.equals(this.thresholds, sloHistoryResponseData.thresholds)
        && Objects.equals(this.toTs, sloHistoryResponseData.toTs)
        && Objects.equals(this.type, sloHistoryResponseData.type)
        && Objects.equals(this.typeId, sloHistoryResponseData.typeId)
        && Objects.equals(this.additionalProperties, sloHistoryResponseData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        fromTs,
        groupBy,
        groups,
        monitors,
        overall,
        series,
        thresholds,
        toTs,
        type,
        typeId,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOHistoryResponseData {\n");
    sb.append("    fromTs: ").append(toIndentedString(fromTs)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    monitors: ").append(toIndentedString(monitors)).append("\n");
    sb.append("    overall: ").append(toIndentedString(overall)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
    sb.append("    toTs: ").append(toIndentedString(toTs)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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
