/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/**
 * Data Datadog collects from Databricks, keyed by dataflow id. Each dataflow turns on a distinct
 * kind of collection: set <code>enabled</code> to start or stop it, and use <code>settings</code>
 * to tune what it gathers. The defaults noted below apply when the account is created; on update,
 * anything left out keeps its current value. Some dataflows have prerequisites, noted on each;
 * unless one is documented as rejecting the request, it is not verified, so a dataflow enabled
 * without it is stored but collects no data.
 */
@JsonPropertyOrder({
  DatabricksIntegrationDataflowsRequest.JSON_PROPERTY_DATABRICKS_CLOUD_COST_METRICS,
  DatabricksIntegrationDataflowsRequest.JSON_PROPERTY_DATABRICKS_DATA_OBSERVABILITY_JOBS_MONITORING,
  DatabricksIntegrationDataflowsRequest
      .JSON_PROPERTY_DATABRICKS_DATA_OBSERVABILITY_QUALITY_MONITORING,
  DatabricksIntegrationDataflowsRequest.JSON_PROPERTY_DATABRICKS_MODEL_SERVING_METRICS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatabricksIntegrationDataflowsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATABRICKS_CLOUD_COST_METRICS =
      "databricks-cloud-cost-metrics";
  private DatabricksCloudCostMetricsIntegrationDataflowRequest databricksCloudCostMetrics;

  public static final String JSON_PROPERTY_DATABRICKS_DATA_OBSERVABILITY_JOBS_MONITORING =
      "databricks-data-observability-jobs-monitoring";
  private DatabricksDataObservabilityJobsMonitoringIntegrationDataflowRequest
      databricksDataObservabilityJobsMonitoring;

  public static final String JSON_PROPERTY_DATABRICKS_DATA_OBSERVABILITY_QUALITY_MONITORING =
      "databricks-data-observability-quality-monitoring";
  private DatabricksDataObservabilityQualityMonitoringIntegrationDataflowRequest
      databricksDataObservabilityQualityMonitoring;

  public static final String JSON_PROPERTY_DATABRICKS_MODEL_SERVING_METRICS =
      "databricks-model-serving-metrics";
  private DatabricksModelServingMetricsIntegrationDataflowRequest databricksModelServingMetrics;

  public DatabricksIntegrationDataflowsRequest databricksCloudCostMetrics(
      DatabricksCloudCostMetricsIntegrationDataflowRequest databricksCloudCostMetrics) {
    this.databricksCloudCostMetrics = databricksCloudCostMetrics;
    this.unparsed |= databricksCloudCostMetrics.unparsed;
    return this;
  }

  /**
   * Cost data collected from your Databricks system tables. <a
   * href="https://docs.datadoghq.com/cloud_cost_management/">Cloud Cost Management</a> must be
   * enabled for your organization while this dataflow is on; any request that leaves it enabled
   * without that is rejected with a <code>422</code> response.
   *
   * @return databricksCloudCostMetrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATABRICKS_CLOUD_COST_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DatabricksCloudCostMetricsIntegrationDataflowRequest getDatabricksCloudCostMetrics() {
    return databricksCloudCostMetrics;
  }

  public void setDatabricksCloudCostMetrics(
      DatabricksCloudCostMetricsIntegrationDataflowRequest databricksCloudCostMetrics) {
    this.databricksCloudCostMetrics = databricksCloudCostMetrics;
    if (databricksCloudCostMetrics != null) {
      this.unparsed |= databricksCloudCostMetrics.unparsed;
    }
  }

  public DatabricksIntegrationDataflowsRequest databricksDataObservabilityJobsMonitoring(
      DatabricksDataObservabilityJobsMonitoringIntegrationDataflowRequest
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
  public DatabricksDataObservabilityJobsMonitoringIntegrationDataflowRequest
      getDatabricksDataObservabilityJobsMonitoring() {
    return databricksDataObservabilityJobsMonitoring;
  }

  public void setDatabricksDataObservabilityJobsMonitoring(
      DatabricksDataObservabilityJobsMonitoringIntegrationDataflowRequest
          databricksDataObservabilityJobsMonitoring) {
    this.databricksDataObservabilityJobsMonitoring = databricksDataObservabilityJobsMonitoring;
    if (databricksDataObservabilityJobsMonitoring != null) {
      this.unparsed |= databricksDataObservabilityJobsMonitoring.unparsed;
    }
  }

  public DatabricksIntegrationDataflowsRequest databricksDataObservabilityQualityMonitoring(
      DatabricksDataObservabilityQualityMonitoringIntegrationDataflowRequest
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
  public DatabricksDataObservabilityQualityMonitoringIntegrationDataflowRequest
      getDatabricksDataObservabilityQualityMonitoring() {
    return databricksDataObservabilityQualityMonitoring;
  }

  public void setDatabricksDataObservabilityQualityMonitoring(
      DatabricksDataObservabilityQualityMonitoringIntegrationDataflowRequest
          databricksDataObservabilityQualityMonitoring) {
    this.databricksDataObservabilityQualityMonitoring =
        databricksDataObservabilityQualityMonitoring;
    if (databricksDataObservabilityQualityMonitoring != null) {
      this.unparsed |= databricksDataObservabilityQualityMonitoring.unparsed;
    }
  }

  public DatabricksIntegrationDataflowsRequest databricksModelServingMetrics(
      DatabricksModelServingMetricsIntegrationDataflowRequest databricksModelServingMetrics) {
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
  public DatabricksModelServingMetricsIntegrationDataflowRequest
      getDatabricksModelServingMetrics() {
    return databricksModelServingMetrics;
  }

  public void setDatabricksModelServingMetrics(
      DatabricksModelServingMetricsIntegrationDataflowRequest databricksModelServingMetrics) {
    this.databricksModelServingMetrics = databricksModelServingMetrics;
    if (databricksModelServingMetrics != null) {
      this.unparsed |= databricksModelServingMetrics.unparsed;
    }
  }

  /** Return true if this DatabricksIntegrationDataflowsRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabricksIntegrationDataflowsRequest databricksIntegrationDataflowsRequest =
        (DatabricksIntegrationDataflowsRequest) o;
    return Objects.equals(
            this.databricksCloudCostMetrics,
            databricksIntegrationDataflowsRequest.databricksCloudCostMetrics)
        && Objects.equals(
            this.databricksDataObservabilityJobsMonitoring,
            databricksIntegrationDataflowsRequest.databricksDataObservabilityJobsMonitoring)
        && Objects.equals(
            this.databricksDataObservabilityQualityMonitoring,
            databricksIntegrationDataflowsRequest.databricksDataObservabilityQualityMonitoring)
        && Objects.equals(
            this.databricksModelServingMetrics,
            databricksIntegrationDataflowsRequest.databricksModelServingMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        databricksCloudCostMetrics,
        databricksDataObservabilityJobsMonitoring,
        databricksDataObservabilityQualityMonitoring,
        databricksModelServingMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabricksIntegrationDataflowsRequest {\n");
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
