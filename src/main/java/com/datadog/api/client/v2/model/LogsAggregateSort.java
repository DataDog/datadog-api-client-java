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
import java.util.Objects;

/** A sort rule */
@JsonPropertyOrder({
  LogsAggregateSort.JSON_PROPERTY_AGGREGATION,
  LogsAggregateSort.JSON_PROPERTY_METRIC,
  LogsAggregateSort.JSON_PROPERTY_ORDER,
  LogsAggregateSort.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsAggregateSort {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private LogsAggregationFunction aggregation;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_ORDER = "order";
  private LogsSortOrder order;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsAggregateSortType type = LogsAggregateSortType.ALPHABETICAL;

  public LogsAggregateSort aggregation(LogsAggregationFunction aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
    return this;
  }

  /**
   * An aggregation function
   *
   * @return aggregation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsAggregationFunction getAggregation() {
    return aggregation;
  }

  public void setAggregation(LogsAggregationFunction aggregation) {
    if (!aggregation.isValid()) {
      this.unparsed = true;
    }
    this.aggregation = aggregation;
  }

  public LogsAggregateSort metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * The metric to sort by (only used for <code>type=measure</code>)
   *
   * @return metric
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMetric() {
    return metric;
  }

  public void setMetric(String metric) {
    this.metric = metric;
  }

  public LogsAggregateSort order(LogsSortOrder order) {
    this.order = order;
    this.unparsed |= !order.isValid();
    return this;
  }

  /**
   * The order to use, ascending or descending
   *
   * @return order
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsSortOrder getOrder() {
    return order;
  }

  public void setOrder(LogsSortOrder order) {
    if (!order.isValid()) {
      this.unparsed = true;
    }
    this.order = order;
  }

  public LogsAggregateSort type(LogsAggregateSortType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of sorting algorithm
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsAggregateSortType getType() {
    return type;
  }

  public void setType(LogsAggregateSortType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this LogsAggregateSort object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsAggregateSort logsAggregateSort = (LogsAggregateSort) o;
    return Objects.equals(this.aggregation, logsAggregateSort.aggregation)
        && Objects.equals(this.metric, logsAggregateSort.metric)
        && Objects.equals(this.order, logsAggregateSort.order)
        && Objects.equals(this.type, logsAggregateSort.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, metric, order, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsAggregateSort {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
