/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  AggregateCompute.JSON_PROPERTY_AGGREGATION,
  AggregateCompute.JSON_PROPERTY_INTERVAL,
  AggregateCompute.JSON_PROPERTY_METRIC,
  AggregateCompute.JSON_PROPERTY_NAME,
  AggregateCompute.JSON_PROPERTY_ROLLUP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AggregateCompute {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private EventsAggregator aggregation;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private Double interval;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ROLLUP = "rollup";
  private CalendarInterval rollup;

  public AggregateCompute() {}

  @JsonCreator
  public AggregateCompute(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATION)
          EventsAggregator aggregation,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.aggregation = aggregation;
    this.unparsed |= aggregation.unparsed;
    this.name = name;
  }

  public AggregateCompute aggregation(EventsAggregator aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= aggregation.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return aggregation
   */
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EventsAggregator getAggregation() {
    return aggregation;
  }

  public void setAggregation(EventsAggregator aggregation) {
    this.aggregation = aggregation;
    if (aggregation != null) {
      this.unparsed |= aggregation.unparsed;
    }
  }

  public AggregateCompute interval(Double interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public AggregateCompute metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public AggregateCompute name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AggregateCompute rollup(CalendarInterval rollup) {
    this.rollup = rollup;
    this.unparsed |= rollup.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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
    if (rollup != null) {
      this.unparsed |= rollup.unparsed;
    }
  }

  /** Return true if this AggregateCompute object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregateCompute aggregateCompute = (AggregateCompute) o;
    return Objects.equals(this.aggregation, aggregateCompute.aggregation)
        && Objects.equals(this.interval, aggregateCompute.interval)
        && Objects.equals(this.metric, aggregateCompute.metric)
        && Objects.equals(this.name, aggregateCompute.name)
        && Objects.equals(this.rollup, aggregateCompute.rollup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, interval, metric, name, rollup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregateCompute {\n");
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
