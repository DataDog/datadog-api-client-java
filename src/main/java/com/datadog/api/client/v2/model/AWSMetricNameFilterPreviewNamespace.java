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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The metric name filter preview for a single namespace. */
@JsonPropertyOrder({
  AWSMetricNameFilterPreviewNamespace.JSON_PROPERTY_FILTERS,
  AWSMetricNameFilterPreviewNamespace.JSON_PROPERTY_METRICS,
  AWSMetricNameFilterPreviewNamespace.JSON_PROPERTY_NAMESPACE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSMetricNameFilterPreviewNamespace {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<AWSMetricNameFilterPreviewFilterMatch> filters = new ArrayList<>();

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private List<AWSMetricNameFilterPreviewMetric> metrics = new ArrayList<>();

  public static final String JSON_PROPERTY_NAMESPACE = "namespace";
  private String namespace;

  public AWSMetricNameFilterPreviewNamespace() {}

  @JsonCreator
  public AWSMetricNameFilterPreviewNamespace(
      @JsonProperty(required = true, value = JSON_PROPERTY_FILTERS)
          List<AWSMetricNameFilterPreviewFilterMatch> filters,
      @JsonProperty(required = true, value = JSON_PROPERTY_METRICS)
          List<AWSMetricNameFilterPreviewMetric> metrics,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAMESPACE) String namespace) {
    this.filters = filters;
    for (AWSMetricNameFilterPreviewFilterMatch item : filters) {
      this.unparsed |= item.unparsed;
    }
    this.metrics = metrics;
    for (AWSMetricNameFilterPreviewMetric item : metrics) {
      this.unparsed |= item.unparsed;
    }
    this.namespace = namespace;
  }

  public AWSMetricNameFilterPreviewNamespace filters(
      List<AWSMetricNameFilterPreviewFilterMatch> filters) {
    this.filters = filters;
    for (AWSMetricNameFilterPreviewFilterMatch item : filters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AWSMetricNameFilterPreviewNamespace addFiltersItem(
      AWSMetricNameFilterPreviewFilterMatch filtersItem) {
    this.filters.add(filtersItem);
    this.unparsed |= filtersItem.unparsed;
    return this;
  }

  /**
   * The metric name filter patterns evaluated for this namespace and how many metrics they matched.
   *
   * @return filters
   */
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<AWSMetricNameFilterPreviewFilterMatch> getFilters() {
    return filters;
  }

  public void setFilters(List<AWSMetricNameFilterPreviewFilterMatch> filters) {
    this.filters = filters;
    if (filters != null) {
      for (AWSMetricNameFilterPreviewFilterMatch item : filters) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AWSMetricNameFilterPreviewNamespace metrics(
      List<AWSMetricNameFilterPreviewMetric> metrics) {
    this.metrics = metrics;
    for (AWSMetricNameFilterPreviewMetric item : metrics) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AWSMetricNameFilterPreviewNamespace addMetricsItem(
      AWSMetricNameFilterPreviewMetric metricsItem) {
    this.metrics.add(metricsItem);
    this.unparsed |= metricsItem.unparsed;
    return this;
  }

  /**
   * The CloudWatch metrics collected for this namespace and whether each resulting Datadog metric
   * is filtered.
   *
   * @return metrics
   */
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<AWSMetricNameFilterPreviewMetric> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<AWSMetricNameFilterPreviewMetric> metrics) {
    this.metrics = metrics;
    if (metrics != null) {
      for (AWSMetricNameFilterPreviewMetric item : metrics) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AWSMetricNameFilterPreviewNamespace namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * The AWS CloudWatch namespace.
   *
   * @return namespace
   */
  @JsonProperty(JSON_PROPERTY_NAMESPACE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
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
   * @return AWSMetricNameFilterPreviewNamespace
   */
  @JsonAnySetter
  public AWSMetricNameFilterPreviewNamespace putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AWSMetricNameFilterPreviewNamespace object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSMetricNameFilterPreviewNamespace awsMetricNameFilterPreviewNamespace =
        (AWSMetricNameFilterPreviewNamespace) o;
    return Objects.equals(this.filters, awsMetricNameFilterPreviewNamespace.filters)
        && Objects.equals(this.metrics, awsMetricNameFilterPreviewNamespace.metrics)
        && Objects.equals(this.namespace, awsMetricNameFilterPreviewNamespace.namespace)
        && Objects.equals(
            this.additionalProperties, awsMetricNameFilterPreviewNamespace.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, metrics, namespace, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSMetricNameFilterPreviewNamespace {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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
