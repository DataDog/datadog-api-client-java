/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>A compute rule to compute metrics or timeseries.</p>
 */
@JsonPropertyOrder({
  RUMCompute.JSON_PROPERTY_AGGREGATION,
  RUMCompute.JSON_PROPERTY_INTERVAL,
  RUMCompute.JSON_PROPERTY_METRIC,
  RUMCompute.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RUMCompute {
  @JsonIgnore
  public boolean unparsed = false;
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
            @JsonProperty(required=true, value=JSON_PROPERTY_AGGREGATION)RUMAggregationFunction aggregation) {
        this.aggregation = aggregation;
        this.unparsed |= !aggregation.isValid();
  }
  public RUMCompute aggregation(RUMAggregationFunction aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
    return this;
  }

  /**
   * <p>An aggregation function.</p>
   * @return aggregation
  **/
      @JsonProperty(JSON_PROPERTY_AGGREGATION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * <p>The time buckets' size (only used for type=timeseries)
   * Defaults to a resolution of 150 points.</p>
   * @return interval
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INTERVAL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The metric to use.</p>
   * @return metric
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_METRIC)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The type of compute.</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * Return true if this RUMCompute object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RUMCompute rumCompute = (RUMCompute) o;
    return Objects.equals(this.aggregation, rumCompute.aggregation) && Objects.equals(this.interval, rumCompute.interval) && Objects.equals(this.metric, rumCompute.metric) && Objects.equals(this.type, rumCompute.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(aggregation,interval,metric,type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RUMCompute {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
