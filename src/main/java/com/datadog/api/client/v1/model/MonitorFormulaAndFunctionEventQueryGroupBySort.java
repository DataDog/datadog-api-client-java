/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Options for sorting group by results. */
@JsonPropertyOrder({
  MonitorFormulaAndFunctionEventQueryGroupBySort.JSON_PROPERTY_AGGREGATION,
  MonitorFormulaAndFunctionEventQueryGroupBySort.JSON_PROPERTY_METRIC,
  MonitorFormulaAndFunctionEventQueryGroupBySort.JSON_PROPERTY_ORDER
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorFormulaAndFunctionEventQueryGroupBySort {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private MonitorFormulaAndFunctionEventAggregation aggregation;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_ORDER = "order";
  private QuerySortOrder order = QuerySortOrder.DESC;

  public MonitorFormulaAndFunctionEventQueryGroupBySort() {}

  @JsonCreator
  public MonitorFormulaAndFunctionEventQueryGroupBySort(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATION)
          MonitorFormulaAndFunctionEventAggregation aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
  }

  public MonitorFormulaAndFunctionEventQueryGroupBySort aggregation(
      MonitorFormulaAndFunctionEventAggregation aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
    return this;
  }

  /**
   * Aggregation methods for event platform queries.
   *
   * @return aggregation
   */
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MonitorFormulaAndFunctionEventAggregation getAggregation() {
    return aggregation;
  }

  public void setAggregation(MonitorFormulaAndFunctionEventAggregation aggregation) {
    if (!aggregation.isValid()) {
      this.unparsed = true;
    }
    this.aggregation = aggregation;
  }

  public MonitorFormulaAndFunctionEventQueryGroupBySort metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * Metric used for sorting group by results.
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

  public MonitorFormulaAndFunctionEventQueryGroupBySort order(QuerySortOrder order) {
    this.order = order;
    this.unparsed |= !order.isValid();
    return this;
  }

  /**
   * Direction of sort.
   *
   * @return order
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public QuerySortOrder getOrder() {
    return order;
  }

  public void setOrder(QuerySortOrder order) {
    if (!order.isValid()) {
      this.unparsed = true;
    }
    this.order = order;
  }

  /** Return true if this MonitorFormulaAndFunctionEventQueryGroupBySort object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorFormulaAndFunctionEventQueryGroupBySort monitorFormulaAndFunctionEventQueryGroupBySort =
        (MonitorFormulaAndFunctionEventQueryGroupBySort) o;
    return Objects.equals(
            this.aggregation, monitorFormulaAndFunctionEventQueryGroupBySort.aggregation)
        && Objects.equals(this.metric, monitorFormulaAndFunctionEventQueryGroupBySort.metric)
        && Objects.equals(this.order, monitorFormulaAndFunctionEventQueryGroupBySort.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, metric, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorFormulaAndFunctionEventQueryGroupBySort {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
