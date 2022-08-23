/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The object describing a Datadog log-based metric.</p>
 */
@JsonPropertyOrder({
  LogsMetricResponseAttributes.JSON_PROPERTY_COMPUTE,
  LogsMetricResponseAttributes.JSON_PROPERTY_FILTER,
  LogsMetricResponseAttributes.JSON_PROPERTY_GROUP_BY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsMetricResponseAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private LogsMetricResponseCompute compute;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private LogsMetricResponseFilter filter;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<LogsMetricResponseGroupBy> groupBy = null;

  public LogsMetricResponseAttributes compute(LogsMetricResponseCompute compute) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    return this;
  }

  /**
   * <p>The compute rule to compute the log-based metric.</p>
   * @return compute
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COMPUTE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public LogsMetricResponseCompute getCompute() {
        return compute;
      }
  public void setCompute(LogsMetricResponseCompute compute) {
    this.compute = compute;
  }
  public LogsMetricResponseAttributes filter(LogsMetricResponseFilter filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * <p>The log-based metric filter. Logs matching this filter will be aggregated in this metric.</p>
   * @return filter
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILTER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public LogsMetricResponseFilter getFilter() {
        return filter;
      }
  public void setFilter(LogsMetricResponseFilter filter) {
    this.filter = filter;
  }
  public LogsMetricResponseAttributes groupBy(List<LogsMetricResponseGroupBy> groupBy) {
    this.groupBy = groupBy;
    for (LogsMetricResponseGroupBy item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public LogsMetricResponseAttributes addGroupByItem(LogsMetricResponseGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * <p>The rules for the group by.</p>
   * @return groupBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GROUP_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<LogsMetricResponseGroupBy> getGroupBy() {
        return groupBy;
      }
  public void setGroupBy(List<LogsMetricResponseGroupBy> groupBy) {
    this.groupBy = groupBy;
  }

  /**
   * Return true if this LogsMetricResponseAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsMetricResponseAttributes logsMetricResponseAttributes = (LogsMetricResponseAttributes) o;
    return Objects.equals(this.compute, logsMetricResponseAttributes.compute) && Objects.equals(this.filter, logsMetricResponseAttributes.filter) && Objects.equals(this.groupBy, logsMetricResponseAttributes.groupBy);
  }


  @Override
  public int hashCode() {
    return Objects.hash(compute,filter,groupBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsMetricResponseAttributes {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
