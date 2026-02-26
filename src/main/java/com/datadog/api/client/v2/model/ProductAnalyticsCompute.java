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
import java.util.UUID;
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
   * <p>A compute rule for aggregating data.</p>
 */
@JsonPropertyOrder({
  ProductAnalyticsCompute.JSON_PROPERTY_AGGREGATION,
  ProductAnalyticsCompute.JSON_PROPERTY_INTERVAL,
  ProductAnalyticsCompute.JSON_PROPERTY_METRIC
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsCompute {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private String aggregation;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private Long interval;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public ProductAnalyticsCompute() {}

  @JsonCreator
  public ProductAnalyticsCompute(
            @JsonProperty(required=true, value=JSON_PROPERTY_AGGREGATION)String aggregation) {
        this.aggregation = aggregation;
  }
  public ProductAnalyticsCompute aggregation(String aggregation) {
    this.aggregation = aggregation;
    return this;
  }

  /**
   * <p>The aggregation function (count, cardinality, avg, sum, min, max, etc.).</p>
   * @return aggregation
  **/
      @JsonProperty(JSON_PROPERTY_AGGREGATION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getAggregation() {
        return aggregation;
      }
  public void setAggregation(String aggregation) {
    this.aggregation = aggregation;
  }
  public ProductAnalyticsCompute interval(Long interval) {
    this.interval = interval;
    return this;
  }

  /**
   * <p>Time bucket size in milliseconds. Required for timeseries queries.</p>
   * @return interval
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INTERVAL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getInterval() {
        return interval;
      }
  public void setInterval(Long interval) {
    this.interval = interval;
  }
  public ProductAnalyticsCompute metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * <p>The metric to aggregate on. Required for non-count aggregations.</p>
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

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ProductAnalyticsCompute
   */
  @JsonAnySetter
  public ProductAnalyticsCompute putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this ProductAnalyticsCompute object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsCompute productAnalyticsCompute = (ProductAnalyticsCompute) o;
    return Objects.equals(this.aggregation, productAnalyticsCompute.aggregation) && Objects.equals(this.interval, productAnalyticsCompute.interval) && Objects.equals(this.metric, productAnalyticsCompute.metric) && Objects.equals(this.additionalProperties, productAnalyticsCompute.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(aggregation,interval,metric, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsCompute {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
