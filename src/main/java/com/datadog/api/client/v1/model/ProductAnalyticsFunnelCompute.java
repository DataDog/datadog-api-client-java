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

/** Compute configuration for user journey funnel. */
@JsonPropertyOrder({
  ProductAnalyticsFunnelCompute.JSON_PROPERTY_AGGREGATION,
  ProductAnalyticsFunnelCompute.JSON_PROPERTY_METRIC
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsFunnelCompute {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private ProductAnalyticsFunnelComputeAggregation aggregation;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private ProductAnalyticsFunnelComputeMetric metric;

  public ProductAnalyticsFunnelCompute() {}

  @JsonCreator
  public ProductAnalyticsFunnelCompute(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATION)
          ProductAnalyticsFunnelComputeAggregation aggregation,
      @JsonProperty(required = true, value = JSON_PROPERTY_METRIC)
          ProductAnalyticsFunnelComputeMetric metric) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
    this.metric = metric;
    this.unparsed |= !metric.isValid();
  }

  public ProductAnalyticsFunnelCompute aggregation(
      ProductAnalyticsFunnelComputeAggregation aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
    return this;
  }

  /**
   * Aggregation type for user journey funnel compute.
   *
   * @return aggregation
   */
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsFunnelComputeAggregation getAggregation() {
    return aggregation;
  }

  public void setAggregation(ProductAnalyticsFunnelComputeAggregation aggregation) {
    if (!aggregation.isValid()) {
      this.unparsed = true;
    }
    this.aggregation = aggregation;
  }

  public ProductAnalyticsFunnelCompute metric(ProductAnalyticsFunnelComputeMetric metric) {
    this.metric = metric;
    this.unparsed |= !metric.isValid();
    return this;
  }

  /**
   * Metric for user journey funnel compute. <code>__dd.conversion</code> and <code>
   * __dd.conversion_rate</code> accept <code>count</code> (unique users/sessions) and <code>
   * cardinality</code> (total users/sessions) as aggregations.
   *
   * @return metric
   */
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsFunnelComputeMetric getMetric() {
    return metric;
  }

  public void setMetric(ProductAnalyticsFunnelComputeMetric metric) {
    if (!metric.isValid()) {
      this.unparsed = true;
    }
    this.metric = metric;
  }

  /** Return true if this ProductAnalyticsFunnelCompute object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsFunnelCompute productAnalyticsFunnelCompute = (ProductAnalyticsFunnelCompute) o;
    return Objects.equals(this.aggregation, productAnalyticsFunnelCompute.aggregation)
        && Objects.equals(this.metric, productAnalyticsFunnelCompute.metric);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, metric);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsFunnelCompute {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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
