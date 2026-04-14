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

/** Compute configuration for Product Analytics Extended queries. */
@JsonPropertyOrder({
  ProductAnalyticsExtendedCompute.JSON_PROPERTY_AGGREGATION,
  ProductAnalyticsExtendedCompute.JSON_PROPERTY_INTERVAL,
  ProductAnalyticsExtendedCompute.JSON_PROPERTY_METRIC,
  ProductAnalyticsExtendedCompute.JSON_PROPERTY_NAME,
  ProductAnalyticsExtendedCompute.JSON_PROPERTY_ROLLUP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsExtendedCompute {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private FormulaAndFunctionEventAggregation aggregation;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private Double interval;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ROLLUP = "rollup";
  private CalendarInterval rollup;

  public ProductAnalyticsExtendedCompute() {}

  @JsonCreator
  public ProductAnalyticsExtendedCompute(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATION)
          FormulaAndFunctionEventAggregation aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
  }

  public ProductAnalyticsExtendedCompute aggregation(
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

  public ProductAnalyticsExtendedCompute interval(Double interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Fixed-width time bucket interval in milliseconds for time series queries. Mutually exclusive
   * with <code>rollup</code>.
   *
   * @return interval
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInterval() {
    return interval;
  }

  public void setInterval(Double interval) {
    this.interval = interval;
  }

  public ProductAnalyticsExtendedCompute metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * Measurable attribute to compute.
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

  public ProductAnalyticsExtendedCompute name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the compute for use in formulas.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductAnalyticsExtendedCompute rollup(CalendarInterval rollup) {
    this.rollup = rollup;
    this.unparsed |= rollup.unparsed;
    return this;
  }

  /**
   * Calendar interval definition.
   *
   * @return rollup
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLLUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CalendarInterval getRollup() {
    return rollup;
  }

  public void setRollup(CalendarInterval rollup) {
    this.rollup = rollup;
  }

  /** Return true if this ProductAnalyticsExtendedCompute object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsExtendedCompute productAnalyticsExtendedCompute =
        (ProductAnalyticsExtendedCompute) o;
    return Objects.equals(this.aggregation, productAnalyticsExtendedCompute.aggregation)
        && Objects.equals(this.interval, productAnalyticsExtendedCompute.interval)
        && Objects.equals(this.metric, productAnalyticsExtendedCompute.metric)
        && Objects.equals(this.name, productAnalyticsExtendedCompute.name)
        && Objects.equals(this.rollup, productAnalyticsExtendedCompute.rollup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, interval, metric, name, rollup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsExtendedCompute {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rollup: ").append(toIndentedString(rollup)).append("\n");
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
