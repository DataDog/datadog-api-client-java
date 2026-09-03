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
 * Dataflows to configure on the Databricks integration account, keyed by dataflow id. Some
 * dataflows and settings have prerequisites, noted on each. Those prerequisites are not checked
 * when the request is made, so anything left enabled without them is stored but collects no data.
 */
@JsonPropertyOrder({
  DatabricksIntegrationDataflowsRequest.JSON_PROPERTY_DATABRICKS_CLOUD_COST_METRICS,
  DatabricksIntegrationDataflowsRequest.JSON_PROPERTY_DATABRICKS_DATA_JOB_MONITORING,
  DatabricksIntegrationDataflowsRequest.JSON_PROPERTY_DATABRICKS_DATA_OBSERVABILITY,
  DatabricksIntegrationDataflowsRequest.JSON_PROPERTY_DATABRICKS_MODEL_SERVING_METRICS,
  DatabricksIntegrationDataflowsRequest.JSON_PROPERTY_DATABRICKS_SERVERLESS_JOBS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatabricksIntegrationDataflowsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATABRICKS_CLOUD_COST_METRICS =
      "databricks-cloud-cost-metrics";
  private DatabricksCloudCostMetricsIntegrationDataflowRequest databricksCloudCostMetrics;

  public static final String JSON_PROPERTY_DATABRICKS_DATA_JOB_MONITORING =
      "databricks-data-job-monitoring";
  private DatabricksDataJobMonitoringIntegrationDataflowRequest databricksDataJobMonitoring;

  public static final String JSON_PROPERTY_DATABRICKS_DATA_OBSERVABILITY =
      "databricks-data-observability";
  private DatabricksDataObservabilityIntegrationDataflowRequest databricksDataObservability;

  public static final String JSON_PROPERTY_DATABRICKS_MODEL_SERVING_METRICS =
      "databricks-model-serving-metrics";
  private DatabricksModelServingMetricsIntegrationDataflowRequest databricksModelServingMetrics;

  public static final String JSON_PROPERTY_DATABRICKS_SERVERLESS_JOBS =
      "databricks-serverless-jobs";
  private DatabricksServerlessJobsIntegrationDataflowRequest databricksServerlessJobs;

  public DatabricksIntegrationDataflowsRequest databricksCloudCostMetrics(
      DatabricksCloudCostMetricsIntegrationDataflowRequest databricksCloudCostMetrics) {
    this.databricksCloudCostMetrics = databricksCloudCostMetrics;
    this.unparsed |= databricksCloudCostMetrics.unparsed;
    return this;
  }

  /**
   * The Databricks cloud cost metrics dataflow.
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

  public DatabricksIntegrationDataflowsRequest databricksDataJobMonitoring(
      DatabricksDataJobMonitoringIntegrationDataflowRequest databricksDataJobMonitoring) {
    this.databricksDataJobMonitoring = databricksDataJobMonitoring;
    this.unparsed |= databricksDataJobMonitoring.unparsed;
    return this;
  }

  /**
   * The Databricks Data Jobs Monitoring dataflow.
   *
   * @return databricksDataJobMonitoring
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATABRICKS_DATA_JOB_MONITORING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DatabricksDataJobMonitoringIntegrationDataflowRequest getDatabricksDataJobMonitoring() {
    return databricksDataJobMonitoring;
  }

  public void setDatabricksDataJobMonitoring(
      DatabricksDataJobMonitoringIntegrationDataflowRequest databricksDataJobMonitoring) {
    this.databricksDataJobMonitoring = databricksDataJobMonitoring;
    if (databricksDataJobMonitoring != null) {
      this.unparsed |= databricksDataJobMonitoring.unparsed;
    }
  }

  public DatabricksIntegrationDataflowsRequest databricksDataObservability(
      DatabricksDataObservabilityIntegrationDataflowRequest databricksDataObservability) {
    this.databricksDataObservability = databricksDataObservability;
    this.unparsed |= databricksDataObservability.unparsed;
    return this;
  }

  /**
   * The Databricks data observability dataflow.
   *
   * @return databricksDataObservability
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATABRICKS_DATA_OBSERVABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DatabricksDataObservabilityIntegrationDataflowRequest getDatabricksDataObservability() {
    return databricksDataObservability;
  }

  public void setDatabricksDataObservability(
      DatabricksDataObservabilityIntegrationDataflowRequest databricksDataObservability) {
    this.databricksDataObservability = databricksDataObservability;
    if (databricksDataObservability != null) {
      this.unparsed |= databricksDataObservability.unparsed;
    }
  }

  public DatabricksIntegrationDataflowsRequest databricksModelServingMetrics(
      DatabricksModelServingMetricsIntegrationDataflowRequest databricksModelServingMetrics) {
    this.databricksModelServingMetrics = databricksModelServingMetrics;
    this.unparsed |= databricksModelServingMetrics.unparsed;
    return this;
  }

  /**
   * The Databricks model serving metrics dataflow. Not supported on accounts that authenticate with
   * <code>private-action-runner</code>; on those accounts this dataflow collects no data even when
   * enabled.
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

  public DatabricksIntegrationDataflowsRequest databricksServerlessJobs(
      DatabricksServerlessJobsIntegrationDataflowRequest databricksServerlessJobs) {
    this.databricksServerlessJobs = databricksServerlessJobs;
    this.unparsed |= databricksServerlessJobs.unparsed;
    return this;
  }

  /**
   * The Databricks serverless jobs dataflow.
   *
   * @return databricksServerlessJobs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATABRICKS_SERVERLESS_JOBS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DatabricksServerlessJobsIntegrationDataflowRequest getDatabricksServerlessJobs() {
    return databricksServerlessJobs;
  }

  public void setDatabricksServerlessJobs(
      DatabricksServerlessJobsIntegrationDataflowRequest databricksServerlessJobs) {
    this.databricksServerlessJobs = databricksServerlessJobs;
    if (databricksServerlessJobs != null) {
      this.unparsed |= databricksServerlessJobs.unparsed;
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
            this.databricksDataJobMonitoring,
            databricksIntegrationDataflowsRequest.databricksDataJobMonitoring)
        && Objects.equals(
            this.databricksDataObservability,
            databricksIntegrationDataflowsRequest.databricksDataObservability)
        && Objects.equals(
            this.databricksModelServingMetrics,
            databricksIntegrationDataflowsRequest.databricksModelServingMetrics)
        && Objects.equals(
            this.databricksServerlessJobs,
            databricksIntegrationDataflowsRequest.databricksServerlessJobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        databricksCloudCostMetrics,
        databricksDataJobMonitoring,
        databricksDataObservability,
        databricksModelServingMetrics,
        databricksServerlessJobs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabricksIntegrationDataflowsRequest {\n");
    sb.append("    databricksCloudCostMetrics: ")
        .append(toIndentedString(databricksCloudCostMetrics))
        .append("\n");
    sb.append("    databricksDataJobMonitoring: ")
        .append(toIndentedString(databricksDataJobMonitoring))
        .append("\n");
    sb.append("    databricksDataObservability: ")
        .append(toIndentedString(databricksDataObservability))
        .append("\n");
    sb.append("    databricksModelServingMetrics: ")
        .append(toIndentedString(databricksModelServingMetrics))
        .append("\n");
    sb.append("    databricksServerlessJobs: ")
        .append(toIndentedString(databricksServerlessJobs))
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
