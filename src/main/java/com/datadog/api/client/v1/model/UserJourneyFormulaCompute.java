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

/** Compute configuration for User Journey formula queries. */
@JsonPropertyOrder({
  UserJourneyFormulaCompute.JSON_PROPERTY_AGGREGATION,
  UserJourneyFormulaCompute.JSON_PROPERTY_INTERVAL,
  UserJourneyFormulaCompute.JSON_PROPERTY_METRIC,
  UserJourneyFormulaCompute.JSON_PROPERTY_TARGET
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UserJourneyFormulaCompute {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private FormulaAndFunctionEventAggregation aggregation;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private Double interval;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private UserJourneyFormulaComputeMetric metric;

  public static final String JSON_PROPERTY_TARGET = "target";
  private UserJourneySearchTarget target;

  public UserJourneyFormulaCompute() {}

  @JsonCreator
  public UserJourneyFormulaCompute(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATION)
          FormulaAndFunctionEventAggregation aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
  }

  public UserJourneyFormulaCompute aggregation(FormulaAndFunctionEventAggregation aggregation) {
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

  public UserJourneyFormulaCompute interval(Double interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Time bucket interval in milliseconds for time series queries.
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

  public UserJourneyFormulaCompute metric(UserJourneyFormulaComputeMetric metric) {
    this.metric = metric;
    this.unparsed |= !metric.isValid();
    return this;
  }

  /**
   * Metric for User Journey formula compute. <code>__dd.conversion</code> and <code>
   * __dd.conversion_rate</code> accept <code>count</code> and <code>cardinality</code> as
   * aggregations. <code>__dd.time_to_convert</code> accepts <code>avg</code>, <code>median</code>,
   * <code>pc75</code>, <code>pc95</code>, <code>pc98</code>, <code>pc99</code>, <code>min</code>,
   * and <code>max</code>.
   *
   * @return metric
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UserJourneyFormulaComputeMetric getMetric() {
    return metric;
  }

  public void setMetric(UserJourneyFormulaComputeMetric metric) {
    if (!metric.isValid()) {
      this.unparsed = true;
    }
    this.metric = metric;
  }

  public UserJourneyFormulaCompute target(UserJourneySearchTarget target) {
    this.target = target;
    this.unparsed |= target.unparsed;
    return this;
  }

  /**
   * Target for user journey search.
   *
   * @return target
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UserJourneySearchTarget getTarget() {
    return target;
  }

  public void setTarget(UserJourneySearchTarget target) {
    this.target = target;
  }

  /** Return true if this UserJourneyFormulaCompute object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserJourneyFormulaCompute userJourneyFormulaCompute = (UserJourneyFormulaCompute) o;
    return Objects.equals(this.aggregation, userJourneyFormulaCompute.aggregation)
        && Objects.equals(this.interval, userJourneyFormulaCompute.interval)
        && Objects.equals(this.metric, userJourneyFormulaCompute.metric)
        && Objects.equals(this.target, userJourneyFormulaCompute.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, interval, metric, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserJourneyFormulaCompute {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
