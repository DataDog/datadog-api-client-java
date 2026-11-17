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
 * The chart link to remove. It must match the stored link exactly: <code>chart_id</code> alone for
 * a saved chart, or <code>chart_id</code> and <code>dashboard_id</code> for a dashboard widget.
 */
@JsonPropertyOrder({
  ProductAnalyticsMonitorUnlinkAttributes.JSON_PROPERTY_CHART_ID,
  ProductAnalyticsMonitorUnlinkAttributes.JSON_PROPERTY_DASHBOARD_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsMonitorUnlinkAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHART_ID = "chart_id";
  private String chartId;

  public static final String JSON_PROPERTY_DASHBOARD_ID = "dashboard_id";
  private String dashboardId;

  public ProductAnalyticsMonitorUnlinkAttributes() {}

  @JsonCreator
  public ProductAnalyticsMonitorUnlinkAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CHART_ID) String chartId) {
    this.chartId = chartId;
  }

  public ProductAnalyticsMonitorUnlinkAttributes chartId(String chartId) {
    this.chartId = chartId;
    return this;
  }

  /**
   * ID of the chart the monitor is linked to.
   *
   * @return chartId
   */
  @JsonProperty(JSON_PROPERTY_CHART_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getChartId() {
    return chartId;
  }

  public void setChartId(String chartId) {
    this.chartId = chartId;
  }

  public ProductAnalyticsMonitorUnlinkAttributes dashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  /**
   * ID of the dashboard the monitor is linked to.
   *
   * @return dashboardId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DASHBOARD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDashboardId() {
    return dashboardId;
  }

  public void setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
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
   * @return ProductAnalyticsMonitorUnlinkAttributes
   */
  @JsonAnySetter
  public ProductAnalyticsMonitorUnlinkAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsMonitorUnlinkAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsMonitorUnlinkAttributes productAnalyticsMonitorUnlinkAttributes =
        (ProductAnalyticsMonitorUnlinkAttributes) o;
    return Objects.equals(this.chartId, productAnalyticsMonitorUnlinkAttributes.chartId)
        && Objects.equals(this.dashboardId, productAnalyticsMonitorUnlinkAttributes.dashboardId)
        && Objects.equals(
            this.additionalProperties,
            productAnalyticsMonitorUnlinkAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chartId, dashboardId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsMonitorUnlinkAttributes {\n");
    sb.append("    chartId: ").append(toIndentedString(chartId)).append("\n");
    sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
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
