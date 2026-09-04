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

/** Dataflows configured on the Databricks integration account, keyed by dataflow id. */
@JsonPropertyOrder({
  DatabricksIntegrationDataflowsResponse.JSON_PROPERTY_DATABRICKS_CLOUD_COST_METRICS,
  DatabricksIntegrationDataflowsResponse.JSON_PROPERTY_DATABRICKS_DATA_JOB_MONITORING,
  DatabricksIntegrationDataflowsResponse.JSON_PROPERTY_DATABRICKS_DATA_OBSERVABILITY,
  DatabricksIntegrationDataflowsResponse.JSON_PROPERTY_DATABRICKS_MODEL_SERVING_METRICS,
  DatabricksIntegrationDataflowsResponse.JSON_PROPERTY_DATABRICKS_SERVERLESS_JOBS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatabricksIntegrationDataflowsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATABRICKS_CLOUD_COST_METRICS =
      "databricks-cloud-cost-metrics";
  private DatabricksCloudCostMetricsIntegrationDataflowResponse databricksCloudCostMetrics;

  public static final String JSON_PROPERTY_DATABRICKS_DATA_JOB_MONITORING =
      "databricks-data-job-monitoring";
  private DatabricksDataJobMonitoringIntegrationDataflowResponse databricksDataJobMonitoring;

  public static final String JSON_PROPERTY_DATABRICKS_DATA_OBSERVABILITY =
      "databricks-data-observability";
  private DatabricksDataObservabilityIntegrationDataflowResponse databricksDataObservability;

  public static final String JSON_PROPERTY_DATABRICKS_MODEL_SERVING_METRICS =
      "databricks-model-serving-metrics";
  private DatabricksModelServingMetricsIntegrationDataflowResponse databricksModelServingMetrics;

  public static final String JSON_PROPERTY_DATABRICKS_SERVERLESS_JOBS =
      "databricks-serverless-jobs";
  private DatabricksServerlessJobsIntegrationDataflowResponse databricksServerlessJobs;

  public DatabricksIntegrationDataflowsResponse databricksCloudCostMetrics(
      DatabricksCloudCostMetricsIntegrationDataflowResponse databricksCloudCostMetrics) {
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

  public DatabricksIntegrationDataflowsResponse databricksDataJobMonitoring(
      DatabricksDataJobMonitoringIntegrationDataflowResponse databricksDataJobMonitoring) {
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
  public DatabricksDataJobMonitoringIntegrationDataflowResponse getDatabricksDataJobMonitoring() {
    return databricksDataJobMonitoring;
  }

  public void setDatabricksDataJobMonitoring(
      DatabricksDataJobMonitoringIntegrationDataflowResponse databricksDataJobMonitoring) {
    this.databricksDataJobMonitoring = databricksDataJobMonitoring;
    if (databricksDataJobMonitoring != null) {
      this.unparsed |= databricksDataJobMonitoring.unparsed;
    }
  }

  public DatabricksIntegrationDataflowsResponse databricksDataObservability(
      DatabricksDataObservabilityIntegrationDataflowResponse databricksDataObservability) {
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
  public DatabricksDataObservabilityIntegrationDataflowResponse getDatabricksDataObservability() {
    return databricksDataObservability;
  }

  public void setDatabricksDataObservability(
      DatabricksDataObservabilityIntegrationDataflowResponse databricksDataObservability) {
    this.databricksDataObservability = databricksDataObservability;
    if (databricksDataObservability != null) {
      this.unparsed |= databricksDataObservability.unparsed;
    }
  }

  public DatabricksIntegrationDataflowsResponse databricksModelServingMetrics(
      DatabricksModelServingMetricsIntegrationDataflowResponse databricksModelServingMetrics) {
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

  public DatabricksIntegrationDataflowsResponse databricksServerlessJobs(
      DatabricksServerlessJobsIntegrationDataflowResponse databricksServerlessJobs) {
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
  public DatabricksServerlessJobsIntegrationDataflowResponse getDatabricksServerlessJobs() {
    return databricksServerlessJobs;
  }

  public void setDatabricksServerlessJobs(
      DatabricksServerlessJobsIntegrationDataflowResponse databricksServerlessJobs) {
    this.databricksServerlessJobs = databricksServerlessJobs;
    if (databricksServerlessJobs != null) {
      this.unparsed |= databricksServerlessJobs.unparsed;
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
            this.databricksDataJobMonitoring,
            databricksIntegrationDataflowsResponse.databricksDataJobMonitoring)
        && Objects.equals(
            this.databricksDataObservability,
            databricksIntegrationDataflowsResponse.databricksDataObservability)
        && Objects.equals(
            this.databricksModelServingMetrics,
            databricksIntegrationDataflowsResponse.databricksModelServingMetrics)
        && Objects.equals(
            this.databricksServerlessJobs,
            databricksIntegrationDataflowsResponse.databricksServerlessJobs)
        && Objects.equals(
            this.additionalProperties, databricksIntegrationDataflowsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        databricksCloudCostMetrics,
        databricksDataJobMonitoring,
        databricksDataObservability,
        databricksModelServingMetrics,
        databricksServerlessJobs,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabricksIntegrationDataflowsResponse {\n");
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
