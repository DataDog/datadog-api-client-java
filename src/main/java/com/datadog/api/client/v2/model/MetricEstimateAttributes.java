/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Object containing the definition of a metric estimate attribute. */
@JsonPropertyOrder({
  MetricEstimateAttributes.JSON_PROPERTY_ESTIMATE_TYPE,
  MetricEstimateAttributes.JSON_PROPERTY_ESTIMATED_AT,
  MetricEstimateAttributes.JSON_PROPERTY_ESTIMATED_OUTPUT_SERIES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricEstimateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ESTIMATE_TYPE = "estimate_type";
  private MetricEstimateType estimateType = MetricEstimateType.COUNT_OR_GAUGE;

  public static final String JSON_PROPERTY_ESTIMATED_AT = "estimated_at";
  private OffsetDateTime estimatedAt;

  public static final String JSON_PROPERTY_ESTIMATED_OUTPUT_SERIES = "estimated_output_series";
  private Long estimatedOutputSeries;

  public MetricEstimateAttributes estimateType(MetricEstimateType estimateType) {
    this.estimateType = estimateType;
    this.unparsed |= !estimateType.isValid();
    return this;
  }

  /**
   * Estimate type based on the queried configuration. By default, <code>count_or_gauge</code> is
   * returned. <code>distribution</code> is returned for distribution metrics without percentiles
   * enabled. Lastly, <code>percentile</code> is returned if <code>filter[pct]=true</code> is
   * queried with a distribution metric.
   *
   * @return estimateType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESTIMATE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MetricEstimateType getEstimateType() {
    return estimateType;
  }

  public void setEstimateType(MetricEstimateType estimateType) {
    if (!estimateType.isValid()) {
      this.unparsed = true;
    }
    this.estimateType = estimateType;
  }

  public MetricEstimateAttributes estimatedAt(OffsetDateTime estimatedAt) {
    this.estimatedAt = estimatedAt;
    return this;
  }

  /**
   * Timestamp when the cardinality estimate was requested.
   *
   * @return estimatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESTIMATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getEstimatedAt() {
    return estimatedAt;
  }

  public void setEstimatedAt(OffsetDateTime estimatedAt) {
    this.estimatedAt = estimatedAt;
  }

  public MetricEstimateAttributes estimatedOutputSeries(Long estimatedOutputSeries) {
    this.estimatedOutputSeries = estimatedOutputSeries;
    return this;
  }

  /**
   * Estimated cardinality of the metric based on the queried configuration.
   *
   * @return estimatedOutputSeries
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESTIMATED_OUTPUT_SERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEstimatedOutputSeries() {
    return estimatedOutputSeries;
  }

  public void setEstimatedOutputSeries(Long estimatedOutputSeries) {
    this.estimatedOutputSeries = estimatedOutputSeries;
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
   * @return MetricEstimateAttributes
   */
  @JsonAnySetter
  public MetricEstimateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MetricEstimateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricEstimateAttributes metricEstimateAttributes = (MetricEstimateAttributes) o;
    return Objects.equals(this.estimateType, metricEstimateAttributes.estimateType)
        && Objects.equals(this.estimatedAt, metricEstimateAttributes.estimatedAt)
        && Objects.equals(
            this.estimatedOutputSeries, metricEstimateAttributes.estimatedOutputSeries)
        && Objects.equals(this.additionalProperties, metricEstimateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimateType, estimatedAt, estimatedOutputSeries, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricEstimateAttributes {\n");
    sb.append("    estimateType: ").append(toIndentedString(estimateType)).append("\n");
    sb.append("    estimatedAt: ").append(toIndentedString(estimatedAt)).append("\n");
    sb.append("    estimatedOutputSeries: ")
        .append(toIndentedString(estimatedOutputSeries))
        .append("\n");
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
