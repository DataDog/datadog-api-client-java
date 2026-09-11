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

/** Data Datadog collects from Snowflake, keyed by dataflow id. */
@JsonPropertyOrder({
  SnowflakeIntegrationDataflowsResponse.JSON_PROPERTY_SNOWFLAKE_ACCOUNT_USAGE_METRICS,
  SnowflakeIntegrationDataflowsResponse.JSON_PROPERTY_SNOWFLAKE_CLOUD_COST_METRICS,
  SnowflakeIntegrationDataflowsResponse
      .JSON_PROPERTY_SNOWFLAKE_DATA_OBSERVABILITY_QUALITY_MONITORING,
  SnowflakeIntegrationDataflowsResponse.JSON_PROPERTY_SNOWFLAKE_EVENT_TABLE_LOGS,
  SnowflakeIntegrationDataflowsResponse.JSON_PROPERTY_SNOWFLAKE_ORGANIZATION_USAGE_METRICS,
  SnowflakeIntegrationDataflowsResponse.JSON_PROPERTY_SNOWFLAKE_QUERY_HISTORY_LOGS,
  SnowflakeIntegrationDataflowsResponse.JSON_PROPERTY_SNOWFLAKE_SECURITY_LOGS,
  SnowflakeIntegrationDataflowsResponse.JSON_PROPERTY_SNOWFLAKE_TASK_HISTORY_LOGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnowflakeIntegrationDataflowsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SNOWFLAKE_ACCOUNT_USAGE_METRICS =
      "snowflake-account-usage-metrics";
  private SnowflakeAccountUsageMetricsIntegrationDataflowResponse snowflakeAccountUsageMetrics;

  public static final String JSON_PROPERTY_SNOWFLAKE_CLOUD_COST_METRICS =
      "snowflake-cloud-cost-metrics";
  private SnowflakeCloudCostMetricsIntegrationDataflowResponse snowflakeCloudCostMetrics;

  public static final String JSON_PROPERTY_SNOWFLAKE_DATA_OBSERVABILITY_QUALITY_MONITORING =
      "snowflake-data-observability-quality-monitoring";
  private SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowResponse
      snowflakeDataObservabilityQualityMonitoring;

  public static final String JSON_PROPERTY_SNOWFLAKE_EVENT_TABLE_LOGS =
      "snowflake-event-table-logs";
  private SnowflakeEventTableLogsIntegrationDataflowResponse snowflakeEventTableLogs;

  public static final String JSON_PROPERTY_SNOWFLAKE_ORGANIZATION_USAGE_METRICS =
      "snowflake-organization-usage-metrics";
  private SnowflakeOrganizationUsageMetricsIntegrationDataflowResponse
      snowflakeOrganizationUsageMetrics;

  public static final String JSON_PROPERTY_SNOWFLAKE_QUERY_HISTORY_LOGS =
      "snowflake-query-history-logs";
  private SnowflakeQueryHistoryLogsIntegrationDataflowResponse snowflakeQueryHistoryLogs;

  public static final String JSON_PROPERTY_SNOWFLAKE_SECURITY_LOGS = "snowflake-security-logs";
  private SnowflakeSecurityLogsIntegrationDataflowResponse snowflakeSecurityLogs;

  public static final String JSON_PROPERTY_SNOWFLAKE_TASK_HISTORY_LOGS =
      "snowflake-task-history-logs";
  private SnowflakeTaskHistoryLogsIntegrationDataflowResponse snowflakeTaskHistoryLogs;

  public SnowflakeIntegrationDataflowsResponse snowflakeAccountUsageMetrics(
      SnowflakeAccountUsageMetricsIntegrationDataflowResponse snowflakeAccountUsageMetrics) {
    this.snowflakeAccountUsageMetrics = snowflakeAccountUsageMetrics;
    this.unparsed |= snowflakeAccountUsageMetrics.unparsed;
    return this;
  }

  /**
   * Account-level usage metrics read from the Snowflake <code>ACCOUNT_USAGE</code> schema, covering
   * storage usage, credit consumption, and query activity.
   *
   * @return snowflakeAccountUsageMetrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNOWFLAKE_ACCOUNT_USAGE_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SnowflakeAccountUsageMetricsIntegrationDataflowResponse getSnowflakeAccountUsageMetrics() {
    return snowflakeAccountUsageMetrics;
  }

  public void setSnowflakeAccountUsageMetrics(
      SnowflakeAccountUsageMetricsIntegrationDataflowResponse snowflakeAccountUsageMetrics) {
    this.snowflakeAccountUsageMetrics = snowflakeAccountUsageMetrics;
    if (snowflakeAccountUsageMetrics != null) {
      this.unparsed |= snowflakeAccountUsageMetrics.unparsed;
    }
  }

  public SnowflakeIntegrationDataflowsResponse snowflakeCloudCostMetrics(
      SnowflakeCloudCostMetricsIntegrationDataflowResponse snowflakeCloudCostMetrics) {
    this.snowflakeCloudCostMetrics = snowflakeCloudCostMetrics;
    this.unparsed |= snowflakeCloudCostMetrics.unparsed;
    return this;
  }

  /**
   * Cost data aggregated from the Snowflake <code>ORGANIZATION_USAGE</code> schema. Requires <a
   * href="https://docs.datadoghq.com/cloud_cost_management/">Cloud Cost Management</a> to be set up
   * for your organization, and the ORGANIZATION_BILLING_VIEWER database role on the Snowflake role.
   *
   * @return snowflakeCloudCostMetrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNOWFLAKE_CLOUD_COST_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SnowflakeCloudCostMetricsIntegrationDataflowResponse getSnowflakeCloudCostMetrics() {
    return snowflakeCloudCostMetrics;
  }

  public void setSnowflakeCloudCostMetrics(
      SnowflakeCloudCostMetricsIntegrationDataflowResponse snowflakeCloudCostMetrics) {
    this.snowflakeCloudCostMetrics = snowflakeCloudCostMetrics;
    if (snowflakeCloudCostMetrics != null) {
      this.unparsed |= snowflakeCloudCostMetrics.unparsed;
    }
  }

  public SnowflakeIntegrationDataflowsResponse snowflakeDataObservabilityQualityMonitoring(
      SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowResponse
          snowflakeDataObservabilityQualityMonitoring) {
    this.snowflakeDataObservabilityQualityMonitoring = snowflakeDataObservabilityQualityMonitoring;
    this.unparsed |= snowflakeDataObservabilityQualityMonitoring.unparsed;
    return this;
  }

  /**
   * Data Observability, which collects lineage and data quality information from your Snowflake
   * databases so you can explore how data flows and detect and resolve quality issues.
   *
   * @return snowflakeDataObservabilityQualityMonitoring
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNOWFLAKE_DATA_OBSERVABILITY_QUALITY_MONITORING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowResponse
      getSnowflakeDataObservabilityQualityMonitoring() {
    return snowflakeDataObservabilityQualityMonitoring;
  }

  public void setSnowflakeDataObservabilityQualityMonitoring(
      SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowResponse
          snowflakeDataObservabilityQualityMonitoring) {
    this.snowflakeDataObservabilityQualityMonitoring = snowflakeDataObservabilityQualityMonitoring;
    if (snowflakeDataObservabilityQualityMonitoring != null) {
      this.unparsed |= snowflakeDataObservabilityQualityMonitoring.unparsed;
    }
  }

  public SnowflakeIntegrationDataflowsResponse snowflakeEventTableLogs(
      SnowflakeEventTableLogsIntegrationDataflowResponse snowflakeEventTableLogs) {
    this.snowflakeEventTableLogs = snowflakeEventTableLogs;
    this.unparsed |= snowflakeEventTableLogs.unparsed;
    return this;
  }

  /**
   * Records from your Snowflake event tables, used to monitor application behavior and identify
   * issues. <code>enabled</code> turns the dataflow on and off as a whole, and the per-record-type
   * toggles in <code>settings</code> select which kinds of record it collects while it is on. The
   * Snowflake role needs usage granted on the database, the schema, and the event table itself.
   *
   * @return snowflakeEventTableLogs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNOWFLAKE_EVENT_TABLE_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SnowflakeEventTableLogsIntegrationDataflowResponse getSnowflakeEventTableLogs() {
    return snowflakeEventTableLogs;
  }

  public void setSnowflakeEventTableLogs(
      SnowflakeEventTableLogsIntegrationDataflowResponse snowflakeEventTableLogs) {
    this.snowflakeEventTableLogs = snowflakeEventTableLogs;
    if (snowflakeEventTableLogs != null) {
      this.unparsed |= snowflakeEventTableLogs.unparsed;
    }
  }

  public SnowflakeIntegrationDataflowsResponse snowflakeOrganizationUsageMetrics(
      SnowflakeOrganizationUsageMetricsIntegrationDataflowResponse
          snowflakeOrganizationUsageMetrics) {
    this.snowflakeOrganizationUsageMetrics = snowflakeOrganizationUsageMetrics;
    this.unparsed |= snowflakeOrganizationUsageMetrics.unparsed;
    return this;
  }

  /**
   * Organization-level usage metrics read from the Snowflake <code>ORGANIZATION_USAGE</code>
   * schema, covering the credit consumption of every account in the organization and the history of
   * data transferred out of Snowflake. Reading that schema requires the ORGADMIN role.
   *
   * @return snowflakeOrganizationUsageMetrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNOWFLAKE_ORGANIZATION_USAGE_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SnowflakeOrganizationUsageMetricsIntegrationDataflowResponse
      getSnowflakeOrganizationUsageMetrics() {
    return snowflakeOrganizationUsageMetrics;
  }

  public void setSnowflakeOrganizationUsageMetrics(
      SnowflakeOrganizationUsageMetricsIntegrationDataflowResponse
          snowflakeOrganizationUsageMetrics) {
    this.snowflakeOrganizationUsageMetrics = snowflakeOrganizationUsageMetrics;
    if (snowflakeOrganizationUsageMetrics != null) {
      this.unparsed |= snowflakeOrganizationUsageMetrics.unparsed;
    }
  }

  public SnowflakeIntegrationDataflowsResponse snowflakeQueryHistoryLogs(
      SnowflakeQueryHistoryLogsIntegrationDataflowResponse snowflakeQueryHistoryLogs) {
    this.snowflakeQueryHistoryLogs = snowflakeQueryHistoryLogs;
    this.unparsed |= snowflakeQueryHistoryLogs.unparsed;
    return this;
  }

  /**
   * Per-query logs that let you identify long-running, poorly performing, and expensive queries.
   *
   * @return snowflakeQueryHistoryLogs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNOWFLAKE_QUERY_HISTORY_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SnowflakeQueryHistoryLogsIntegrationDataflowResponse getSnowflakeQueryHistoryLogs() {
    return snowflakeQueryHistoryLogs;
  }

  public void setSnowflakeQueryHistoryLogs(
      SnowflakeQueryHistoryLogsIntegrationDataflowResponse snowflakeQueryHistoryLogs) {
    this.snowflakeQueryHistoryLogs = snowflakeQueryHistoryLogs;
    if (snowflakeQueryHistoryLogs != null) {
      this.unparsed |= snowflakeQueryHistoryLogs.unparsed;
    }
  }

  public SnowflakeIntegrationDataflowsResponse snowflakeSecurityLogs(
      SnowflakeSecurityLogsIntegrationDataflowResponse snowflakeSecurityLogs) {
    this.snowflakeSecurityLogs = snowflakeSecurityLogs;
    this.unparsed |= snowflakeSecurityLogs.unparsed;
    return this;
  }

  /**
   * Security logs from the Snowflake <code>ACCOUNT_USAGE</code> schema, for analyzing the security
   * of your Snowflake account and running threat detection with <a
   * href="https://docs.datadoghq.com/security/cloud_siem/">Cloud SIEM</a>.
   *
   * @return snowflakeSecurityLogs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNOWFLAKE_SECURITY_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SnowflakeSecurityLogsIntegrationDataflowResponse getSnowflakeSecurityLogs() {
    return snowflakeSecurityLogs;
  }

  public void setSnowflakeSecurityLogs(
      SnowflakeSecurityLogsIntegrationDataflowResponse snowflakeSecurityLogs) {
    this.snowflakeSecurityLogs = snowflakeSecurityLogs;
    if (snowflakeSecurityLogs != null) {
      this.unparsed |= snowflakeSecurityLogs.unparsed;
    }
  }

  public SnowflakeIntegrationDataflowsResponse snowflakeTaskHistoryLogs(
      SnowflakeTaskHistoryLogsIntegrationDataflowResponse snowflakeTaskHistoryLogs) {
    this.snowflakeTaskHistoryLogs = snowflakeTaskHistoryLogs;
    this.unparsed |= snowflakeTaskHistoryLogs.unparsed;
    return this;
  }

  /**
   * Execution logs for your scheduled Snowflake tasks, covering start and end time, status, and any
   * error message.
   *
   * @return snowflakeTaskHistoryLogs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNOWFLAKE_TASK_HISTORY_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SnowflakeTaskHistoryLogsIntegrationDataflowResponse getSnowflakeTaskHistoryLogs() {
    return snowflakeTaskHistoryLogs;
  }

  public void setSnowflakeTaskHistoryLogs(
      SnowflakeTaskHistoryLogsIntegrationDataflowResponse snowflakeTaskHistoryLogs) {
    this.snowflakeTaskHistoryLogs = snowflakeTaskHistoryLogs;
    if (snowflakeTaskHistoryLogs != null) {
      this.unparsed |= snowflakeTaskHistoryLogs.unparsed;
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
   * @return SnowflakeIntegrationDataflowsResponse
   */
  @JsonAnySetter
  public SnowflakeIntegrationDataflowsResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SnowflakeIntegrationDataflowsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnowflakeIntegrationDataflowsResponse snowflakeIntegrationDataflowsResponse =
        (SnowflakeIntegrationDataflowsResponse) o;
    return Objects.equals(
            this.snowflakeAccountUsageMetrics,
            snowflakeIntegrationDataflowsResponse.snowflakeAccountUsageMetrics)
        && Objects.equals(
            this.snowflakeCloudCostMetrics,
            snowflakeIntegrationDataflowsResponse.snowflakeCloudCostMetrics)
        && Objects.equals(
            this.snowflakeDataObservabilityQualityMonitoring,
            snowflakeIntegrationDataflowsResponse.snowflakeDataObservabilityQualityMonitoring)
        && Objects.equals(
            this.snowflakeEventTableLogs,
            snowflakeIntegrationDataflowsResponse.snowflakeEventTableLogs)
        && Objects.equals(
            this.snowflakeOrganizationUsageMetrics,
            snowflakeIntegrationDataflowsResponse.snowflakeOrganizationUsageMetrics)
        && Objects.equals(
            this.snowflakeQueryHistoryLogs,
            snowflakeIntegrationDataflowsResponse.snowflakeQueryHistoryLogs)
        && Objects.equals(
            this.snowflakeSecurityLogs, snowflakeIntegrationDataflowsResponse.snowflakeSecurityLogs)
        && Objects.equals(
            this.snowflakeTaskHistoryLogs,
            snowflakeIntegrationDataflowsResponse.snowflakeTaskHistoryLogs)
        && Objects.equals(
            this.additionalProperties, snowflakeIntegrationDataflowsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        snowflakeAccountUsageMetrics,
        snowflakeCloudCostMetrics,
        snowflakeDataObservabilityQualityMonitoring,
        snowflakeEventTableLogs,
        snowflakeOrganizationUsageMetrics,
        snowflakeQueryHistoryLogs,
        snowflakeSecurityLogs,
        snowflakeTaskHistoryLogs,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnowflakeIntegrationDataflowsResponse {\n");
    sb.append("    snowflakeAccountUsageMetrics: ")
        .append(toIndentedString(snowflakeAccountUsageMetrics))
        .append("\n");
    sb.append("    snowflakeCloudCostMetrics: ")
        .append(toIndentedString(snowflakeCloudCostMetrics))
        .append("\n");
    sb.append("    snowflakeDataObservabilityQualityMonitoring: ")
        .append(toIndentedString(snowflakeDataObservabilityQualityMonitoring))
        .append("\n");
    sb.append("    snowflakeEventTableLogs: ")
        .append(toIndentedString(snowflakeEventTableLogs))
        .append("\n");
    sb.append("    snowflakeOrganizationUsageMetrics: ")
        .append(toIndentedString(snowflakeOrganizationUsageMetrics))
        .append("\n");
    sb.append("    snowflakeQueryHistoryLogs: ")
        .append(toIndentedString(snowflakeQueryHistoryLogs))
        .append("\n");
    sb.append("    snowflakeSecurityLogs: ")
        .append(toIndentedString(snowflakeSecurityLogs))
        .append("\n");
    sb.append("    snowflakeTaskHistoryLogs: ")
        .append(toIndentedString(snowflakeTaskHistoryLogs))
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
