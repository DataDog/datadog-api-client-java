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
   * <p>The object describing the Datadog log-based metric to create.</p>
 */
@JsonPropertyOrder({
  LogsMetricCreateAttributes.JSON_PROPERTY_COMPUTE,
  LogsMetricCreateAttributes.JSON_PROPERTY_FILTER,
  LogsMetricCreateAttributes.JSON_PROPERTY_GROUP_BY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsMetricCreateAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private LogsMetricCompute compute;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private LogsMetricFilter filter;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<LogsMetricGroupBy> groupBy = null;

  public LogsMetricCreateAttributes() {}

  @JsonCreator
  public LogsMetricCreateAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_COMPUTE)LogsMetricCompute compute) {
        this.compute = compute;
        this.unparsed |= compute.unparsed;
  }
  public LogsMetricCreateAttributes compute(LogsMetricCompute compute) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    return this;
  }

  /**
   * <p>The compute rule to compute the log-based metric.</p>
   * @return compute
  **/
      @JsonProperty(JSON_PROPERTY_COMPUTE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public LogsMetricCompute getCompute() {
        return compute;
      }
  public void setCompute(LogsMetricCompute compute) {
    this.compute = compute;
  }
  public LogsMetricCreateAttributes filter(LogsMetricFilter filter) {
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
      public LogsMetricFilter getFilter() {
        return filter;
      }
  public void setFilter(LogsMetricFilter filter) {
    this.filter = filter;
  }
  public LogsMetricCreateAttributes groupBy(List<LogsMetricGroupBy> groupBy) {
    this.groupBy = groupBy;
    for (LogsMetricGroupBy item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public LogsMetricCreateAttributes addGroupByItem(LogsMetricGroupBy groupByItem) {
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
      public List<LogsMetricGroupBy> getGroupBy() {
        return groupBy;
      }
  public void setGroupBy(List<LogsMetricGroupBy> groupBy) {
    this.groupBy = groupBy;
  }

  /**
   * Return true if this LogsMetricCreateAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsMetricCreateAttributes logsMetricCreateAttributes = (LogsMetricCreateAttributes) o;
    return Objects.equals(this.compute, logsMetricCreateAttributes.compute) && Objects.equals(this.filter, logsMetricCreateAttributes.filter) && Objects.equals(this.groupBy, logsMetricCreateAttributes.groupBy);
  }


  @Override
  public int hashCode() {
    return Objects.hash(compute,filter,groupBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsMetricCreateAttributes {\n");
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
