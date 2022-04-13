/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Options for sorting group by results. */
@JsonPropertyOrder({
  FormulaAndFunctionEventQueryGroupBySort.JSON_PROPERTY_AGGREGATION,
  FormulaAndFunctionEventQueryGroupBySort.JSON_PROPERTY_METRIC,
  FormulaAndFunctionEventQueryGroupBySort.JSON_PROPERTY_ORDER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FormulaAndFunctionEventQueryGroupBySort {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private FormulaAndFunctionEventAggregation aggregation;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_ORDER = "order";
  private QuerySortOrder order = QuerySortOrder.DESC;

  public FormulaAndFunctionEventQueryGroupBySort() {}

  @JsonCreator
  public FormulaAndFunctionEventQueryGroupBySort(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATION)
          FormulaAndFunctionEventAggregation aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
  }

  public FormulaAndFunctionEventQueryGroupBySort aggregation(
      FormulaAndFunctionEventAggregation aggregation) {
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
  public FormulaAndFunctionEventAggregation getAggregation() {
    return aggregation;
  }

  public void setAggregation(FormulaAndFunctionEventAggregation aggregation) {
    if (!aggregation.isValid()) {
      this.unparsed = true;
    }
    this.aggregation = aggregation;
  }

  public FormulaAndFunctionEventQueryGroupBySort metric(String metric) {
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

  public FormulaAndFunctionEventQueryGroupBySort order(QuerySortOrder order) {
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

  /** Return true if this FormulaAndFunctionEventQueryGroupBySort object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaAndFunctionEventQueryGroupBySort formulaAndFunctionEventQueryGroupBySort =
        (FormulaAndFunctionEventQueryGroupBySort) o;
    return Objects.equals(this.aggregation, formulaAndFunctionEventQueryGroupBySort.aggregation)
        && Objects.equals(this.metric, formulaAndFunctionEventQueryGroupBySort.metric)
        && Objects.equals(this.order, formulaAndFunctionEventQueryGroupBySort.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, metric, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaAndFunctionEventQueryGroupBySort {\n");
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
