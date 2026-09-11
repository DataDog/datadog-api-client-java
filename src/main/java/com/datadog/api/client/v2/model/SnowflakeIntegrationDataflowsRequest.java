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
 * Data Datadog collects from Snowflake, keyed by dataflow id. Each dataflow turns on a distinct
 * kind of collection: set <code>enabled</code> to start or stop it, and use <code>settings</code>
 * to configure what it collects. Defaults listed on each dataflow apply when the account is
 * created; on update, omitted fields keep their current values. Every dataflow reads from Snowflake
 * as the user in <code>settings.username</code>, so that user's role must be granted access to the
 * underlying views; a dataflow enabled without those grants is stored but collects no data.
 */
@JsonPropertyOrder({
  SnowflakeIntegrationDataflowsRequest.JSON_PROPERTY_SNOWFLAKE_ACCOUNT_USAGE_METRICS,
  SnowflakeIntegrationDataflowsRequest.JSON_PROPERTY_SNOWFLAKE_CLOUD_COST_METRICS,
  SnowflakeIntegrationDataflowsRequest
      .JSON_PROPERTY_SNOWFLAKE_DATA_OBSERVABILITY_QUALITY_MONITORING,
  SnowflakeIntegrationDataflowsRequest.JSON_PROPERTY_SNOWFLAKE_EVENT_TABLE_LOGS,
  SnowflakeIntegrationDataflowsRequest.JSON_PROPERTY_SNOWFLAKE_ORGANIZATION_USAGE_METRICS,
  SnowflakeIntegrationDataflowsRequest.JSON_PROPERTY_SNOWFLAKE_QUERY_HISTORY_LOGS,
  SnowflakeIntegrationDataflowsRequest.JSON_PROPERTY_SNOWFLAKE_SECURITY_LOGS,
  SnowflakeIntegrationDataflowsRequest.JSON_PROPERTY_SNOWFLAKE_TASK_HISTORY_LOGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnowflakeIntegrationDataflowsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SNOWFLAKE_ACCOUNT_USAGE_METRICS =
      "snowflake-account-usage-metrics";
  private SnowflakeAccountUsageMetricsIntegrationDataflowRequest snowflakeAccountUsageMetrics;

  public static final String JSON_PROPERTY_SNOWFLAKE_CLOUD_COST_METRICS =
      "snowflake-cloud-cost-metrics";
  private SnowflakeCloudCostMetricsIntegrationDataflowRequest snowflakeCloudCostMetrics;

  public static final String JSON_PROPERTY_SNOWFLAKE_DATA_OBSERVABILITY_QUALITY_MONITORING =
      "snowflake-data-observability-quality-monitoring";
  private SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowRequest
      snowflakeDataObservabilityQualityMonitoring;

  public static final String JSON_PROPERTY_SNOWFLAKE_EVENT_TABLE_LOGS =
      "snowflake-event-table-logs";
  private SnowflakeEventTableLogsIntegrationDataflowRequest snowflakeEventTableLogs;

  public static final String JSON_PROPERTY_SNOWFLAKE_ORGANIZATION_USAGE_METRICS =
      "snowflake-organization-usage-metrics";
  private SnowflakeOrganizationUsageMetricsIntegrationDataflowRequest
      snowflakeOrganizationUsageMetrics;

  public static final String JSON_PROPERTY_SNOWFLAKE_QUERY_HISTORY_LOGS =
      "snowflake-query-history-logs";
  private SnowflakeQueryHistoryLogsIntegrationDataflowRequest snowflakeQueryHistoryLogs;

  public static final String JSON_PROPERTY_SNOWFLAKE_SECURITY_LOGS = "snowflake-security-logs";
  private SnowflakeSecurityLogsIntegrationDataflowRequest snowflakeSecurityLogs;

  public static final String JSON_PROPERTY_SNOWFLAKE_TASK_HISTORY_LOGS =
      "snowflake-task-history-logs";
  private SnowflakeTaskHistoryLogsIntegrationDataflowRequest snowflakeTaskHistoryLogs;

  public SnowflakeIntegrationDataflowsRequest snowflakeAccountUsageMetrics(
      SnowflakeAccountUsageMetricsIntegrationDataflowRequest snowflakeAccountUsageMetrics) {
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
  public SnowflakeAccountUsageMetricsIntegrationDataflowRequest getSnowflakeAccountUsageMetrics() {
    return snowflakeAccountUsageMetrics;
  }

  public void setSnowflakeAccountUsageMetrics(
      SnowflakeAccountUsageMetricsIntegrationDataflowRequest snowflakeAccountUsageMetrics) {
    this.snowflakeAccountUsageMetrics = snowflakeAccountUsageMetrics;
    if (snowflakeAccountUsageMetrics != null) {
      this.unparsed |= snowflakeAccountUsageMetrics.unparsed;
    }
  }

  public SnowflakeIntegrationDataflowsRequest snowflakeCloudCostMetrics(
      SnowflakeCloudCostMetricsIntegrationDataflowRequest snowflakeCloudCostMetrics) {
    this.snowflakeCloudCostMetrics = snowflakeCloudCostMetrics;
    this.unparsed |= snowflakeCloudCostMetrics.unparsed;
    return this;
  }

  /**
   * Cost data aggregated from the Snowflake <code>ORGANIZATION_USAGE</code> schema. <a
   * href="https://docs.datadoghq.com/cloud_cost_management/">Cloud Cost Management</a> must be
   * enabled for your organization while this dataflow is enabled. Any request that enables this
   * dataflow without Cloud Cost Management is rejected with a <code>422</code> response. The
   * Snowflake role also needs the ORGANIZATION_BILLING_VIEWER database role to read the underlying
   * cost views.
   *
   * @return snowflakeCloudCostMetrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNOWFLAKE_CLOUD_COST_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SnowflakeCloudCostMetricsIntegrationDataflowRequest getSnowflakeCloudCostMetrics() {
    return snowflakeCloudCostMetrics;
  }

  public void setSnowflakeCloudCostMetrics(
      SnowflakeCloudCostMetricsIntegrationDataflowRequest snowflakeCloudCostMetrics) {
    this.snowflakeCloudCostMetrics = snowflakeCloudCostMetrics;
    if (snowflakeCloudCostMetrics != null) {
      this.unparsed |= snowflakeCloudCostMetrics.unparsed;
    }
  }

  public SnowflakeIntegrationDataflowsRequest snowflakeDataObservabilityQualityMonitoring(
      SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowRequest
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
  public SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowRequest
      getSnowflakeDataObservabilityQualityMonitoring() {
    return snowflakeDataObservabilityQualityMonitoring;
  }

  public void setSnowflakeDataObservabilityQualityMonitoring(
      SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowRequest
          snowflakeDataObservabilityQualityMonitoring) {
    this.snowflakeDataObservabilityQualityMonitoring = snowflakeDataObservabilityQualityMonitoring;
    if (snowflakeDataObservabilityQualityMonitoring != null) {
      this.unparsed |= snowflakeDataObservabilityQualityMonitoring.unparsed;
    }
  }

  public SnowflakeIntegrationDataflowsRequest snowflakeEventTableLogs(
      SnowflakeEventTableLogsIntegrationDataflowRequest snowflakeEventTableLogs) {
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
  public SnowflakeEventTableLogsIntegrationDataflowRequest getSnowflakeEventTableLogs() {
    return snowflakeEventTableLogs;
  }

  public void setSnowflakeEventTableLogs(
      SnowflakeEventTableLogsIntegrationDataflowRequest snowflakeEventTableLogs) {
    this.snowflakeEventTableLogs = snowflakeEventTableLogs;
    if (snowflakeEventTableLogs != null) {
      this.unparsed |= snowflakeEventTableLogs.unparsed;
    }
  }

  public SnowflakeIntegrationDataflowsRequest snowflakeOrganizationUsageMetrics(
      SnowflakeOrganizationUsageMetricsIntegrationDataflowRequest
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
  public SnowflakeOrganizationUsageMetricsIntegrationDataflowRequest
      getSnowflakeOrganizationUsageMetrics() {
    return snowflakeOrganizationUsageMetrics;
  }

  public void setSnowflakeOrganizationUsageMetrics(
      SnowflakeOrganizationUsageMetricsIntegrationDataflowRequest
          snowflakeOrganizationUsageMetrics) {
    this.snowflakeOrganizationUsageMetrics = snowflakeOrganizationUsageMetrics;
    if (snowflakeOrganizationUsageMetrics != null) {
      this.unparsed |= snowflakeOrganizationUsageMetrics.unparsed;
    }
  }

  public SnowflakeIntegrationDataflowsRequest snowflakeQueryHistoryLogs(
      SnowflakeQueryHistoryLogsIntegrationDataflowRequest snowflakeQueryHistoryLogs) {
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
  public SnowflakeQueryHistoryLogsIntegrationDataflowRequest getSnowflakeQueryHistoryLogs() {
    return snowflakeQueryHistoryLogs;
  }

  public void setSnowflakeQueryHistoryLogs(
      SnowflakeQueryHistoryLogsIntegrationDataflowRequest snowflakeQueryHistoryLogs) {
    this.snowflakeQueryHistoryLogs = snowflakeQueryHistoryLogs;
    if (snowflakeQueryHistoryLogs != null) {
      this.unparsed |= snowflakeQueryHistoryLogs.unparsed;
    }
  }

  public SnowflakeIntegrationDataflowsRequest snowflakeSecurityLogs(
      SnowflakeSecurityLogsIntegrationDataflowRequest snowflakeSecurityLogs) {
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
  public SnowflakeSecurityLogsIntegrationDataflowRequest getSnowflakeSecurityLogs() {
    return snowflakeSecurityLogs;
  }

  public void setSnowflakeSecurityLogs(
      SnowflakeSecurityLogsIntegrationDataflowRequest snowflakeSecurityLogs) {
    this.snowflakeSecurityLogs = snowflakeSecurityLogs;
    if (snowflakeSecurityLogs != null) {
      this.unparsed |= snowflakeSecurityLogs.unparsed;
    }
  }

  public SnowflakeIntegrationDataflowsRequest snowflakeTaskHistoryLogs(
      SnowflakeTaskHistoryLogsIntegrationDataflowRequest snowflakeTaskHistoryLogs) {
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
  public SnowflakeTaskHistoryLogsIntegrationDataflowRequest getSnowflakeTaskHistoryLogs() {
    return snowflakeTaskHistoryLogs;
  }

  public void setSnowflakeTaskHistoryLogs(
      SnowflakeTaskHistoryLogsIntegrationDataflowRequest snowflakeTaskHistoryLogs) {
    this.snowflakeTaskHistoryLogs = snowflakeTaskHistoryLogs;
    if (snowflakeTaskHistoryLogs != null) {
      this.unparsed |= snowflakeTaskHistoryLogs.unparsed;
    }
  }

  /** Return true if this SnowflakeIntegrationDataflowsRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnowflakeIntegrationDataflowsRequest snowflakeIntegrationDataflowsRequest =
        (SnowflakeIntegrationDataflowsRequest) o;
    return Objects.equals(
            this.snowflakeAccountUsageMetrics,
            snowflakeIntegrationDataflowsRequest.snowflakeAccountUsageMetrics)
        && Objects.equals(
            this.snowflakeCloudCostMetrics,
            snowflakeIntegrationDataflowsRequest.snowflakeCloudCostMetrics)
        && Objects.equals(
            this.snowflakeDataObservabilityQualityMonitoring,
            snowflakeIntegrationDataflowsRequest.snowflakeDataObservabilityQualityMonitoring)
        && Objects.equals(
            this.snowflakeEventTableLogs,
            snowflakeIntegrationDataflowsRequest.snowflakeEventTableLogs)
        && Objects.equals(
            this.snowflakeOrganizationUsageMetrics,
            snowflakeIntegrationDataflowsRequest.snowflakeOrganizationUsageMetrics)
        && Objects.equals(
            this.snowflakeQueryHistoryLogs,
            snowflakeIntegrationDataflowsRequest.snowflakeQueryHistoryLogs)
        && Objects.equals(
            this.snowflakeSecurityLogs, snowflakeIntegrationDataflowsRequest.snowflakeSecurityLogs)
        && Objects.equals(
            this.snowflakeTaskHistoryLogs,
            snowflakeIntegrationDataflowsRequest.snowflakeTaskHistoryLogs);
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
        snowflakeTaskHistoryLogs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnowflakeIntegrationDataflowsRequest {\n");
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
