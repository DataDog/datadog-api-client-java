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

/** Defines the metric computed over the journey for a scalar query. */
@JsonPropertyOrder({
  ProductAnalyticsJourneyScalarCompute.JSON_PROPERTY_AGGREGATION,
  ProductAnalyticsJourneyScalarCompute.JSON_PROPERTY_METRIC,
  ProductAnalyticsJourneyScalarCompute.JSON_PROPERTY_TARGET
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsJourneyScalarCompute {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private String aggregation;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_TARGET = "target";
  private ProductAnalyticsJourneyTarget target;

  public ProductAnalyticsJourneyScalarCompute() {}

  @JsonCreator
  public ProductAnalyticsJourneyScalarCompute(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATION) String aggregation) {
    this.aggregation = aggregation;
  }

  public ProductAnalyticsJourneyScalarCompute aggregation(String aggregation) {
    this.aggregation = aggregation;
    return this;
  }

  /**
   * Aggregation function: <code>count</code>, <code>cardinality</code>, <code>avg</code>, <code>
   * median</code>, <code>min</code>, <code>max</code>, <code>sum</code>, or a percentile of the
   * form <code>pc&lt;N&gt;</code> such as <code>pc95</code>. Defaults to <code>cardinality</code>.
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

  public ProductAnalyticsJourneyScalarCompute metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * Metric to aggregate on. Use a facet path such as <code>@view.time_spent</code>, or one of the
   * journey metrics <code>__dd.conversion</code>, <code>__dd.conversion_rate</code>, <code>
   * __dd.time_to_convert</code>, or <code>__dd.dropoff_rate</code>. Defaults to <code>
   * __dd.conversion</code>.
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

  public ProductAnalyticsJourneyScalarCompute target(ProductAnalyticsJourneyTarget target) {
    this.target = target;
    this.unparsed |= target.unparsed;
    return this;
  }

  /**
   * A reference to a step, or a range of steps, in the journey. Use a <code>node</code> target to
   * name a single step, or a <code>path</code> target to name the range between two steps.
   *
   * @return target
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsJourneyTarget getTarget() {
    return target;
  }

  public void setTarget(ProductAnalyticsJourneyTarget target) {
    this.target = target;
    if (target != null) {
      this.unparsed |= target.unparsed;
    }
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
   * @return ProductAnalyticsJourneyScalarCompute
   */
  @JsonAnySetter
  public ProductAnalyticsJourneyScalarCompute putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsJourneyScalarCompute object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsJourneyScalarCompute productAnalyticsJourneyScalarCompute =
        (ProductAnalyticsJourneyScalarCompute) o;
    return Objects.equals(this.aggregation, productAnalyticsJourneyScalarCompute.aggregation)
        && Objects.equals(this.metric, productAnalyticsJourneyScalarCompute.metric)
        && Objects.equals(this.target, productAnalyticsJourneyScalarCompute.target)
        && Objects.equals(
            this.additionalProperties, productAnalyticsJourneyScalarCompute.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, metric, target, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsJourneyScalarCompute {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
