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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Options of a Product Analytics monitor. */
@JsonPropertyOrder({
  ProductAnalyticsMonitorOptions.JSON_PROPERTY_CHART_UUID,
  ProductAnalyticsMonitorOptions.JSON_PROPERTY_METRIC_SELECTOR,
  ProductAnalyticsMonitorOptions.JSON_PROPERTY_QUERY_INDEX,
  ProductAnalyticsMonitorOptions.JSON_PROPERTY_RENOTIFY_INTERVAL,
  ProductAnalyticsMonitorOptions.JSON_PROPERTY_THRESHOLDS,
  ProductAnalyticsMonitorOptions.JSON_PROPERTY_TIMEFRAME,
  ProductAnalyticsMonitorOptions.JSON_PROPERTY_VARIABLES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsMonitorOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHART_UUID = "chart_uuid";
  private String chartUuid;

  public static final String JSON_PROPERTY_METRIC_SELECTOR = "metric_selector";
  private String metricSelector;

  public static final String JSON_PROPERTY_QUERY_INDEX = "query_index";
  private Long queryIndex;

  public static final String JSON_PROPERTY_RENOTIFY_INTERVAL = "renotify_interval";
  private Long renotifyInterval;

  public static final String JSON_PROPERTY_THRESHOLDS = "thresholds";
  private ProductAnalyticsMonitorThresholds thresholds;

  public static final String JSON_PROPERTY_TIMEFRAME = "timeframe";
  private String timeframe;

  public static final String JSON_PROPERTY_VARIABLES = "variables";
  private List<Map<String, Object>> variables = null;

  public ProductAnalyticsMonitorOptions chartUuid(String chartUuid) {
    this.chartUuid = chartUuid;
    return this;
  }

  /**
   * UUID of the chart the monitor was created from.
   *
   * @return chartUuid
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHART_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getChartUuid() {
    return chartUuid;
  }

  public void setChartUuid(String chartUuid) {
    this.chartUuid = chartUuid;
  }

  public ProductAnalyticsMonitorOptions metricSelector(String metricSelector) {
    this.metricSelector = metricSelector;
    return this;
  }

  /**
   * Metric of the chart that the monitor evaluates.
   *
   * @return metricSelector
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_SELECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMetricSelector() {
    return metricSelector;
  }

  public void setMetricSelector(String metricSelector) {
    this.metricSelector = metricSelector;
  }

  public ProductAnalyticsMonitorOptions queryIndex(Long queryIndex) {
    this.queryIndex = queryIndex;
    return this;
  }

  /**
   * Index of the chart query that the monitor evaluates.
   *
   * @return queryIndex
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getQueryIndex() {
    return queryIndex;
  }

  public void setQueryIndex(Long queryIndex) {
    this.queryIndex = queryIndex;
  }

  public ProductAnalyticsMonitorOptions renotifyInterval(Long renotifyInterval) {
    this.renotifyInterval = renotifyInterval;
    return this;
  }

  /**
   * Number of minutes after the last notification before the monitor notifies again on the current
   * status. <code>0</code> means it never notifies again.
   *
   * @return renotifyInterval
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RENOTIFY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRenotifyInterval() {
    return renotifyInterval;
  }

  public void setRenotifyInterval(Long renotifyInterval) {
    this.renotifyInterval = renotifyInterval;
  }

  public ProductAnalyticsMonitorOptions thresholds(ProductAnalyticsMonitorThresholds thresholds) {
    this.thresholds = thresholds;
    this.unparsed |= thresholds.unparsed;
    return this;
  }

  /**
   * Alert thresholds of a Product Analytics monitor. Keep <code>critical</code> in sync with the
   * comparison in the monitor query; the query is not derived from these values.
   *
   * @return thresholds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THRESHOLDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsMonitorThresholds getThresholds() {
    return thresholds;
  }

  public void setThresholds(ProductAnalyticsMonitorThresholds thresholds) {
    this.thresholds = thresholds;
    if (thresholds != null) {
      this.unparsed |= thresholds.unparsed;
    }
  }

  public ProductAnalyticsMonitorOptions timeframe(String timeframe) {
    this.timeframe = timeframe;
    return this;
  }

  /**
   * Time frame of the chart that the monitor evaluates.
   *
   * @return timeframe
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEFRAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTimeframe() {
    return timeframe;
  }

  public void setTimeframe(String timeframe) {
    this.timeframe = timeframe;
  }

  public ProductAnalyticsMonitorOptions variables(List<Map<String, Object>> variables) {
    this.variables = variables;
    return this;
  }

  public ProductAnalyticsMonitorOptions addVariablesItem(Map<String, Object> variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<>();
    }
    this.variables.add(variablesItem);
    return this;
  }

  /**
   * Query variables referenced by the monitor query.
   *
   * @return variables
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Map<String, Object>> getVariables() {
    return variables;
  }

  public void setVariables(List<Map<String, Object>> variables) {
    this.variables = variables;
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
   * @return ProductAnalyticsMonitorOptions
   */
  @JsonAnySetter
  public ProductAnalyticsMonitorOptions putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsMonitorOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsMonitorOptions productAnalyticsMonitorOptions =
        (ProductAnalyticsMonitorOptions) o;
    return Objects.equals(this.chartUuid, productAnalyticsMonitorOptions.chartUuid)
        && Objects.equals(this.metricSelector, productAnalyticsMonitorOptions.metricSelector)
        && Objects.equals(this.queryIndex, productAnalyticsMonitorOptions.queryIndex)
        && Objects.equals(this.renotifyInterval, productAnalyticsMonitorOptions.renotifyInterval)
        && Objects.equals(this.thresholds, productAnalyticsMonitorOptions.thresholds)
        && Objects.equals(this.timeframe, productAnalyticsMonitorOptions.timeframe)
        && Objects.equals(this.variables, productAnalyticsMonitorOptions.variables)
        && Objects.equals(
            this.additionalProperties, productAnalyticsMonitorOptions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        chartUuid,
        metricSelector,
        queryIndex,
        renotifyInterval,
        thresholds,
        timeframe,
        variables,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsMonitorOptions {\n");
    sb.append("    chartUuid: ").append(toIndentedString(chartUuid)).append("\n");
    sb.append("    metricSelector: ").append(toIndentedString(metricSelector)).append("\n");
    sb.append("    queryIndex: ").append(toIndentedString(queryIndex)).append("\n");
    sb.append("    renotifyInterval: ").append(toIndentedString(renotifyInterval)).append("\n");
    sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
    sb.append("    timeframe: ").append(toIndentedString(timeframe)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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
