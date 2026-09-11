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

/** Data Datadog collects from Databricks, keyed by dataflow id. */
@JsonPropertyOrder({
  DatabricksIntegrationDataflowsResponse.JSON_PROPERTY_DATABRICKS_CLOUD_COST_METRICS,
  DatabricksIntegrationDataflowsResponse
      .JSON_PROPERTY_DATABRICKS_DATA_OBSERVABILITY_JOBS_MONITORING,
  DatabricksIntegrationDataflowsResponse
      .JSON_PROPERTY_DATABRICKS_DATA_OBSERVABILITY_QUALITY_MONITORING,
  DatabricksIntegrationDataflowsResponse.JSON_PROPERTY_DATABRICKS_MODEL_SERVING_METRICS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatabricksIntegrationDataflowsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATABRICKS_CLOUD_COST_METRICS =
      "databricks-cloud-cost-metrics";
  private DatabricksCloudCostMetricsIntegrationDataflowResponse databricksCloudCostMetrics;

  public static final String JSON_PROPERTY_DATABRICKS_DATA_OBSERVABILITY_JOBS_MONITORING =
      "databricks-data-observability-jobs-monitoring";
  private DatabricksDataObservabilityJobsMonitoringIntegrationDataflowResponse
      databricksDataObservabilityJobsMonitoring;

  public static final String JSON_PROPERTY_DATABRICKS_DATA_OBSERVABILITY_QUALITY_MONITORING =
      "databricks-data-observability-quality-monitoring";
  private DatabricksDataObservabilityQualityMonitoringIntegrationDataflowResponse
      databricksDataObservabilityQualityMonitoring;

  public static final String JSON_PROPERTY_DATABRICKS_MODEL_SERVING_METRICS =
      "databricks-model-serving-metrics";
  private DatabricksModelServingMetricsIntegrationDataflowResponse databricksModelServingMetrics;

  public DatabricksIntegrationDataflowsResponse databricksCloudCostMetrics(
      DatabricksCloudCostMetricsIntegrationDataflowResponse databricksCloudCostMetrics) {
    this.databricksCloudCostMetrics = databricksCloudCostMetrics;
    this.unparsed |= databricksCloudCostMetrics.unparsed;
    return this;
  }

  /**
   * Cost data collected from your Databricks system tables. Requires <a
   * href="https://docs.datadoghq.com/cloud_cost_management/">Cloud Cost Management</a> to be set up
   * for your organization.
   *
   * @return databricksCloudCostMetrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATABRICKS_CLOUD_COST_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DatabricksCloudCostMetricsIntegrationDataflowResponse getDatabricksCloudCostMetrics() {
    return databricksCloudCostMetrics;
  }

  public void setDatabricksCloudCostMetrics(
      DatabricksCloudCostMetricsIntegrationDataflowResponse databricksCloudCostMetrics) {
    this.databricksCloudCostMetrics = databricksCloudCostMetrics;
    if (databricksCloudCostMetrics != null) {
      this.unparsed |= databricksCloudCostMetrics.unparsed;
    }
  }

  public DatabricksIntegrationDataflowsResponse databricksDataObservabilityJobsMonitoring(
      DatabricksDataObservabilityJobsMonitoringIntegrationDataflowResponse
          databricksDataObservabilityJobsMonitoring) {
    this.databricksDataObservabilityJobsMonitoring = databricksDataObservabilityJobsMonitoring;
    this.unparsed |= databricksDataObservabilityJobsMonitoring.unparsed;
    return this;
  }

  /**
   * Data Jobs Monitoring, which collects performance, reliability, and cost data for your
   * Databricks jobs.
   *
   * @return databricksDataObservabilityJobsMonitoring
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATABRICKS_DATA_OBSERVABILITY_JOBS_MONITORING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DatabricksDataObservabilityJobsMonitoringIntegrationDataflowResponse
      getDatabricksDataObservabilityJobsMonitoring() {
    return databricksDataObservabilityJobsMonitoring;
  }

  public void setDatabricksDataObservabilityJobsMonitoring(
      DatabricksDataObservabilityJobsMonitoringIntegrationDataflowResponse
          databricksDataObservabilityJobsMonitoring) {
    this.databricksDataObservabilityJobsMonitoring = databricksDataObservabilityJobsMonitoring;
    if (databricksDataObservabilityJobsMonitoring != null) {
      this.unparsed |= databricksDataObservabilityJobsMonitoring.unparsed;
    }
  }

  public DatabricksIntegrationDataflowsResponse databricksDataObservabilityQualityMonitoring(
      DatabricksDataObservabilityQualityMonitoringIntegrationDataflowResponse
          databricksDataObservabilityQualityMonitoring) {
    this.databricksDataObservabilityQualityMonitoring =
        databricksDataObservabilityQualityMonitoring;
    this.unparsed |= databricksDataObservabilityQualityMonitoring.unparsed;
    return this;
  }

  /**
   * Data Observability, which collects lineage and data quality information from your Databricks
   * catalogs so you can explore how data flows and detect, resolve, and prevent quality issues.
   *
   * @return databricksDataObservabilityQualityMonitoring
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATABRICKS_DATA_OBSERVABILITY_QUALITY_MONITORING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DatabricksDataObservabilityQualityMonitoringIntegrationDataflowResponse
      getDatabricksDataObservabilityQualityMonitoring() {
    return databricksDataObservabilityQualityMonitoring;
  }

  public void setDatabricksDataObservabilityQualityMonitoring(
      DatabricksDataObservabilityQualityMonitoringIntegrationDataflowResponse
          databricksDataObservabilityQualityMonitoring) {
    this.databricksDataObservabilityQualityMonitoring =
        databricksDataObservabilityQualityMonitoring;
    if (databricksDataObservabilityQualityMonitoring != null) {
      this.unparsed |= databricksDataObservabilityQualityMonitoring.unparsed;
    }
  }

  public DatabricksIntegrationDataflowsResponse databricksModelServingMetrics(
      DatabricksModelServingMetricsIntegrationDataflowResponse databricksModelServingMetrics) {
    this.databricksModelServingMetrics = databricksModelServingMetrics;
    this.unparsed |= databricksModelServingMetrics.unparsed;
    return this;
  }

  /**
   * Health and usage metrics for your Databricks model serving endpoints. Not supported on accounts
   * that authenticate with <code>private-action-runner</code>; on those accounts this dataflow
   * collects no data even when enabled.
   *
   * @return databricksModelServingMetrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATABRICKS_MODEL_SERVING_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DatabricksModelServingMetricsIntegrationDataflowResponse
      getDatabricksModelServingMetrics() {
    return databricksModelServingMetrics;
  }

  public void setDatabricksModelServingMetrics(
      DatabricksModelServingMetricsIntegrationDataflowResponse databricksModelServingMetrics) {
    this.databricksModelServingMetrics = databricksModelServingMetrics;
    if (databricksModelServingMetrics != null) {
      this.unparsed |= databricksModelServingMetrics.unparsed;
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
   * @return DatabricksIntegrationDataflowsResponse
   */
  @JsonAnySetter
  public DatabricksIntegrationDataflowsResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DatabricksIntegrationDataflowsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabricksIntegrationDataflowsResponse databricksIntegrationDataflowsResponse =
        (DatabricksIntegrationDataflowsResponse) o;
    return Objects.equals(
            this.databricksCloudCostMetrics,
            databricksIntegrationDataflowsResponse.databricksCloudCostMetrics)
        && Objects.equals(
            this.databricksDataObservabilityJobsMonitoring,
            databricksIntegrationDataflowsResponse.databricksDataObservabilityJobsMonitoring)
        && Objects.equals(
            this.databricksDataObservabilityQualityMonitoring,
            databricksIntegrationDataflowsResponse.databricksDataObservabilityQualityMonitoring)
        && Objects.equals(
            this.databricksModelServingMetrics,
            databricksIntegrationDataflowsResponse.databricksModelServingMetrics)
        && Objects.equals(
            this.additionalProperties, databricksIntegrationDataflowsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        databricksCloudCostMetrics,
        databricksDataObservabilityJobsMonitoring,
        databricksDataObservabilityQualityMonitoring,
        databricksModelServingMetrics,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabricksIntegrationDataflowsResponse {\n");
    sb.append("    databricksCloudCostMetrics: ")
        .append(toIndentedString(databricksCloudCostMetrics))
        .append("\n");
    sb.append("    databricksDataObservabilityJobsMonitoring: ")
        .append(toIndentedString(databricksDataObservabilityJobsMonitoring))
        .append("\n");
    sb.append("    databricksDataObservabilityQualityMonitoring: ")
        .append(toIndentedString(databricksDataObservabilityQualityMonitoring))
        .append("\n");
    sb.append("    databricksModelServingMetrics: ")
        .append(toIndentedString(databricksModelServingMetrics))
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
