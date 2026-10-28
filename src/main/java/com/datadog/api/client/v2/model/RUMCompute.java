/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * A compute rule to compute metrics or timeseries. In the response, the result of each rule is
 * keyed <code>c0</code>, <code>c1</code>... following the order of the <code>compute</code> list.
 */
@JsonPropertyOrder({
  RUMCompute.JSON_PROPERTY_AGGREGATION,
  RUMCompute.JSON_PROPERTY_INTERVAL,
  RUMCompute.JSON_PROPERTY_METRIC,
  RUMCompute.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RUMCompute {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private RUMAggregationFunction aggregation;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private String interval;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_TYPE = "type";
  private RUMComputeType type = RUMComputeType.TOTAL;

  public RUMCompute() {}

  @JsonCreator
  public RUMCompute(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATION)
          RUMAggregationFunction aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
  }

  public RUMCompute aggregation(RUMAggregationFunction aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
    return this;
  }

  /**
   * An aggregation function. <code>count</code> counts events and needs no metric. <code>
   * cardinality</code> counts the distinct values of the metric. <code>sum</code>, <code>min</code>
   * , <code>max</code>, <code>avg</code>, <code>median</code> and the percentiles (<code>pc75
   * </code> to <code>pc99</code>) apply to a numeric metric such as <code>@view.loading_time</code>
   * .
   *
   * @return aggregation
   */
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RUMAggregationFunction getAggregation() {
    return aggregation;
  }

  public void setAggregation(RUMAggregationFunction aggregation) {
    if (!aggregation.isValid()) {
      this.unparsed = true;
    }
    this.aggregation = aggregation;
  }

  public RUMCompute interval(String interval) {
    this.interval = interval;
    return this;
  }

  /**
   * The time buckets' size, for example <code>5m</code>, <code>1h</code> or <code>1d</code> (only
   * used for <code>type=timeseries</code>). Defaults to a resolution of 150 points over the queried
   * time range.
   *
   * @return interval
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }

  public RUMCompute metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * The attribute to aggregate, for example <code>@view.loading_time</code>. Not needed for <code>
   * count</code>, required for the other aggregations.
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

  public RUMCompute type(RUMComputeType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of compute. <code>total</code> returns one value per bucket, <code>timeseries</code>
   * returns a list of time points per bucket.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RUMComputeType getType() {
    return type;
  }

  public void setType(RUMComputeType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return RUMCompute
   */
  @JsonAnySetter
  public RUMCompute putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RUMCompute object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RUMCompute rumCompute = (RUMCompute) o;
    return Objects.equals(this.aggregation, rumCompute.aggregation)
        && Objects.equals(this.interval, rumCompute.interval)
        && Objects.equals(this.metric, rumCompute.metric)
        && Objects.equals(this.type, rumCompute.type)
        && Objects.equals(this.additionalProperties, rumCompute.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, interval, metric, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RUMCompute {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
