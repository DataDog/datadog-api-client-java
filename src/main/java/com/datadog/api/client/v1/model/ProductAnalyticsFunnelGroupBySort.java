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

/** Sort configuration for user journey funnel group by. */
@JsonPropertyOrder({
  ProductAnalyticsFunnelGroupBySort.JSON_PROPERTY_AGGREGATION,
  ProductAnalyticsFunnelGroupBySort.JSON_PROPERTY_METRIC,
  ProductAnalyticsFunnelGroupBySort.JSON_PROPERTY_ORDER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsFunnelGroupBySort {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private String aggregation;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_ORDER = "order";
  private WidgetSort order;

  public ProductAnalyticsFunnelGroupBySort() {}

  @JsonCreator
  public ProductAnalyticsFunnelGroupBySort(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATION) String aggregation) {
    this.aggregation = aggregation;
  }

  public ProductAnalyticsFunnelGroupBySort aggregation(String aggregation) {
    this.aggregation = aggregation;
    return this;
  }

  /**
   * Aggregation type.
   *
   * @return aggregation
   */
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAggregation() {
    return aggregation;
  }

  public void setAggregation(String aggregation) {
    this.aggregation = aggregation;
  }

  public ProductAnalyticsFunnelGroupBySort metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * Metric to sort by.
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

  public ProductAnalyticsFunnelGroupBySort order(WidgetSort order) {
    this.order = order;
    this.unparsed |= !order.isValid();
    return this;
  }

  /**
   * Widget sorting methods.
   *
   * @return order
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetSort getOrder() {
    return order;
  }

  public void setOrder(WidgetSort order) {
    if (!order.isValid()) {
      this.unparsed = true;
    }
    this.order = order;
  }

  /** Return true if this ProductAnalyticsFunnelGroupBySort object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsFunnelGroupBySort productAnalyticsFunnelGroupBySort =
        (ProductAnalyticsFunnelGroupBySort) o;
    return Objects.equals(this.aggregation, productAnalyticsFunnelGroupBySort.aggregation)
        && Objects.equals(this.metric, productAnalyticsFunnelGroupBySort.metric)
        && Objects.equals(this.order, productAnalyticsFunnelGroupBySort.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, metric, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsFunnelGroupBySort {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
