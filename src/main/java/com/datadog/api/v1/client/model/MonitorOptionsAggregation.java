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
import java.util.Objects;

/** Type of aggregation performed in the monitor query. */
@JsonPropertyOrder({
  MonitorOptionsAggregation.JSON_PROPERTY_GROUP_BY,
  MonitorOptionsAggregation.JSON_PROPERTY_METRIC,
  MonitorOptionsAggregation.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorOptionsAggregation {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private String groupBy;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public MonitorOptionsAggregation groupBy(String groupBy) {
    this.groupBy = groupBy;
    return this;
  }

  /**
   * Group to break down the monitor on.
   *
   * @return groupBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(String groupBy) {
    this.groupBy = groupBy;
  }

  public MonitorOptionsAggregation metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * Metric name used in the monitor.
   *
   * @return metric
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMetric() {
    return metric;
  }

  public void setMetric(String metric) {
    this.metric = metric;
  }

  public MonitorOptionsAggregation type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Metric type used in the monitor.
   *
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /** Return true if this MonitorOptionsAggregation object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorOptionsAggregation monitorOptionsAggregation = (MonitorOptionsAggregation) o;
    return Objects.equals(this.groupBy, monitorOptionsAggregation.groupBy)
        && Objects.equals(this.metric, monitorOptionsAggregation.metric)
        && Objects.equals(this.type, monitorOptionsAggregation.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupBy, metric, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorOptionsAggregation {\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
