/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** The object describing a Datadog log-based metric. */
@JsonPropertyOrder({
  LogsMetricResponseAttributes.JSON_PROPERTY_COMPUTE,
  LogsMetricResponseAttributes.JSON_PROPERTY_FILTER,
  LogsMetricResponseAttributes.JSON_PROPERTY_GROUP_BY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsMetricResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
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
   * The compute rule to compute the log-based metric.
   *
   * @return compute
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * The log-based metric filter. Logs matching this filter will be aggregated in this metric.
   *
   * @return filter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * The rules for the group by.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LogsMetricResponseGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<LogsMetricResponseGroupBy> groupBy) {
    this.groupBy = groupBy;
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
   * @return LogsMetricResponseAttributes
   */
  @JsonAnySetter
  public LogsMetricResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LogsMetricResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsMetricResponseAttributes logsMetricResponseAttributes = (LogsMetricResponseAttributes) o;
    return Objects.equals(this.compute, logsMetricResponseAttributes.compute)
        && Objects.equals(this.filter, logsMetricResponseAttributes.filter)
        && Objects.equals(this.groupBy, logsMetricResponseAttributes.groupBy)
        && Objects.equals(
            this.additionalProperties, logsMetricResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compute, filter, groupBy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsMetricResponseAttributes {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
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
