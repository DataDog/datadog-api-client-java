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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The log-based metric properties that will be updated. */
@JsonPropertyOrder({
  LogsMetricUpdateAttributes.JSON_PROPERTY_COMPUTE,
  LogsMetricUpdateAttributes.JSON_PROPERTY_FILTER,
  LogsMetricUpdateAttributes.JSON_PROPERTY_GROUP_BY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsMetricUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private LogsMetricUpdateCompute compute;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private LogsMetricFilter filter;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<LogsMetricGroupBy> groupBy = null;

  public LogsMetricUpdateAttributes compute(LogsMetricUpdateCompute compute) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    return this;
  }

  /**
   * The compute rule to compute the log-based metric.
   *
   * @return compute
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsMetricUpdateCompute getCompute() {
    return compute;
  }

  public void setCompute(LogsMetricUpdateCompute compute) {
    this.compute = compute;
  }

  public LogsMetricUpdateAttributes filter(LogsMetricFilter filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * The log-based metric filter. Logs matching this filter will be aggregated in this metric.
   *
   * @return filter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsMetricFilter getFilter() {
    return filter;
  }

  public void setFilter(LogsMetricFilter filter) {
    this.filter = filter;
  }

  public LogsMetricUpdateAttributes groupBy(List<LogsMetricGroupBy> groupBy) {
    this.groupBy = groupBy;
    for (LogsMetricGroupBy item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LogsMetricUpdateAttributes addGroupByItem(LogsMetricGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * The rules for the group by.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LogsMetricGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<LogsMetricGroupBy> groupBy) {
    this.groupBy = groupBy;
  }

  /** Return true if this LogsMetricUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsMetricUpdateAttributes logsMetricUpdateAttributes = (LogsMetricUpdateAttributes) o;
    return Objects.equals(this.compute, logsMetricUpdateAttributes.compute)
        && Objects.equals(this.filter, logsMetricUpdateAttributes.filter)
        && Objects.equals(this.groupBy, logsMetricUpdateAttributes.groupBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compute, filter, groupBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsMetricUpdateAttributes {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
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
