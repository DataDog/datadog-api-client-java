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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Relationships to assets related to the metric. */
@JsonPropertyOrder({
  MetricAssetResponseRelationships.JSON_PROPERTY_DASHBOARDS,
  MetricAssetResponseRelationships.JSON_PROPERTY_MONITORS,
  MetricAssetResponseRelationships.JSON_PROPERTY_NOTEBOOKS,
  MetricAssetResponseRelationships.JSON_PROPERTY_SLOS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricAssetResponseRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DASHBOARDS = "dashboards";
  private MetricAssetDashboardRelationships dashboards;

  public static final String JSON_PROPERTY_MONITORS = "monitors";
  private MetricAssetMonitorRelationships monitors;

  public static final String JSON_PROPERTY_NOTEBOOKS = "notebooks";
  private MetricAssetNotebookRelationships notebooks;

  public static final String JSON_PROPERTY_SLOS = "slos";
  private MetricAssetSLORelationships slos;

  public MetricAssetResponseRelationships dashboards(MetricAssetDashboardRelationships dashboards) {
    this.dashboards = dashboards;
    this.unparsed |= dashboards.unparsed;
    return this;
  }

  /**
   * An object containing the list of dashboards that can be referenced in the <code>included</code>
   * data.
   *
   * @return dashboards
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DASHBOARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MetricAssetDashboardRelationships getDashboards() {
    return dashboards;
  }

  public void setDashboards(MetricAssetDashboardRelationships dashboards) {
    this.dashboards = dashboards;
  }

  public MetricAssetResponseRelationships monitors(MetricAssetMonitorRelationships monitors) {
    this.monitors = monitors;
    this.unparsed |= monitors.unparsed;
    return this;
  }

  /**
   * A object containing the list of monitors that can be referenced in the <code>included</code>
   * data.
   *
   * @return monitors
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MetricAssetMonitorRelationships getMonitors() {
    return monitors;
  }

  public void setMonitors(MetricAssetMonitorRelationships monitors) {
    this.monitors = monitors;
  }

  public MetricAssetResponseRelationships notebooks(MetricAssetNotebookRelationships notebooks) {
    this.notebooks = notebooks;
    this.unparsed |= notebooks.unparsed;
    return this;
  }

  /**
   * An object containing the list of notebooks that can be referenced in the <code>included</code>
   * data.
   *
   * @return notebooks
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTEBOOKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MetricAssetNotebookRelationships getNotebooks() {
    return notebooks;
  }

  public void setNotebooks(MetricAssetNotebookRelationships notebooks) {
    this.notebooks = notebooks;
  }

  public MetricAssetResponseRelationships slos(MetricAssetSLORelationships slos) {
    this.slos = slos;
    this.unparsed |= slos.unparsed;
    return this;
  }

  /**
   * An object containing a list of SLOs that can be referenced in the <code>included</code> data.
   *
   * @return slos
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MetricAssetSLORelationships getSlos() {
    return slos;
  }

  public void setSlos(MetricAssetSLORelationships slos) {
    this.slos = slos;
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
   * @return MetricAssetResponseRelationships
   */
  @JsonAnySetter
  public MetricAssetResponseRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MetricAssetResponseRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricAssetResponseRelationships metricAssetResponseRelationships =
        (MetricAssetResponseRelationships) o;
    return Objects.equals(this.dashboards, metricAssetResponseRelationships.dashboards)
        && Objects.equals(this.monitors, metricAssetResponseRelationships.monitors)
        && Objects.equals(this.notebooks, metricAssetResponseRelationships.notebooks)
        && Objects.equals(this.slos, metricAssetResponseRelationships.slos)
        && Objects.equals(
            this.additionalProperties, metricAssetResponseRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboards, monitors, notebooks, slos, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricAssetResponseRelationships {\n");
    sb.append("    dashboards: ").append(toIndentedString(dashboards)).append("\n");
    sb.append("    monitors: ").append(toIndentedString(monitors)).append("\n");
    sb.append("    notebooks: ").append(toIndentedString(notebooks)).append("\n");
    sb.append("    slos: ").append(toIndentedString(slos)).append("\n");
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
