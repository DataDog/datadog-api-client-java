/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Number of hourly recorded custom metrics for a given organization. */
@JsonPropertyOrder({
  UsageTopAvgMetricsHour.JSON_PROPERTY_AVG_METRIC_HOUR,
  UsageTopAvgMetricsHour.JSON_PROPERTY_MAX_METRIC_HOUR,
  UsageTopAvgMetricsHour.JSON_PROPERTY_METRIC_CATEGORY,
  UsageTopAvgMetricsHour.JSON_PROPERTY_METRIC_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageTopAvgMetricsHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AVG_METRIC_HOUR = "avg_metric_hour";
  private Long avgMetricHour;

  public static final String JSON_PROPERTY_MAX_METRIC_HOUR = "max_metric_hour";
  private Long maxMetricHour;

  public static final String JSON_PROPERTY_METRIC_CATEGORY = "metric_category";
  private UsageMetricCategory metricCategory;

  public static final String JSON_PROPERTY_METRIC_NAME = "metric_name";
  private String metricName;

  public UsageTopAvgMetricsHour avgMetricHour(Long avgMetricHour) {
    this.avgMetricHour = avgMetricHour;
    return this;
  }

  /**
   * Average number of timeseries per hour in which the metric occurs.
   *
   * @return avgMetricHour
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVG_METRIC_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAvgMetricHour() {
    return avgMetricHour;
  }

  public void setAvgMetricHour(Long avgMetricHour) {
    this.avgMetricHour = avgMetricHour;
  }

  public UsageTopAvgMetricsHour maxMetricHour(Long maxMetricHour) {
    this.maxMetricHour = maxMetricHour;
    return this;
  }

  /**
   * Maximum number of timeseries per hour in which the metric occurs.
   *
   * @return maxMetricHour
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_METRIC_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxMetricHour() {
    return maxMetricHour;
  }

  public void setMaxMetricHour(Long maxMetricHour) {
    this.maxMetricHour = maxMetricHour;
  }

  public UsageTopAvgMetricsHour metricCategory(UsageMetricCategory metricCategory) {
    this.metricCategory = metricCategory;
    this.unparsed |= !metricCategory.isValid();
    return this;
  }

  /**
   * Contains the metric category.
   *
   * @return metricCategory
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageMetricCategory getMetricCategory() {
    return metricCategory;
  }

  public void setMetricCategory(UsageMetricCategory metricCategory) {
    if (!metricCategory.isValid()) {
      this.unparsed = true;
    }
    this.metricCategory = metricCategory;
  }

  public UsageTopAvgMetricsHour metricName(String metricName) {
    this.metricName = metricName;
    return this;
  }

  /**
   * Contains the custom metric name.
   *
   * @return metricName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMetricName() {
    return metricName;
  }

  public void setMetricName(String metricName) {
    this.metricName = metricName;
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
   * @return UsageTopAvgMetricsHour
   */
  @JsonAnySetter
  public UsageTopAvgMetricsHour putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UsageTopAvgMetricsHour object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageTopAvgMetricsHour usageTopAvgMetricsHour = (UsageTopAvgMetricsHour) o;
    return Objects.equals(this.avgMetricHour, usageTopAvgMetricsHour.avgMetricHour)
        && Objects.equals(this.maxMetricHour, usageTopAvgMetricsHour.maxMetricHour)
        && Objects.equals(this.metricCategory, usageTopAvgMetricsHour.metricCategory)
        && Objects.equals(this.metricName, usageTopAvgMetricsHour.metricName)
        && Objects.equals(this.additionalProperties, usageTopAvgMetricsHour.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        avgMetricHour, maxMetricHour, metricCategory, metricName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageTopAvgMetricsHour {\n");
    sb.append("    avgMetricHour: ").append(toIndentedString(avgMetricHour)).append("\n");
    sb.append("    maxMetricHour: ").append(toIndentedString(maxMetricHour)).append("\n");
    sb.append("    metricCategory: ").append(toIndentedString(metricCategory)).append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
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
