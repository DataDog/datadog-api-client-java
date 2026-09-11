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

/** Settings of the Data Jobs Monitoring dataflow. Only the fields provided are changed. */
@JsonPropertyOrder({
  DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsRequest
      .JSON_PROPERTY_DD_API_KEY_ID,
  DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsRequest
      .JSON_PROPERTY_DD_API_KEY_SECRET,
  DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsRequest
      .JSON_PROPERTY_DJM_GLOBAL_INIT_SCRIPT_ENABLED,
  DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsRequest
      .JSON_PROPERTY_SCRIPT_GPUM_ENABLED,
  DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsRequest
      .JSON_PROPERTY_SCRIPT_LOGS_ENABLED,
  DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsRequest
      .JSON_PROPERTY_SERVERLESS_JOBS_ENABLED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DD_API_KEY_ID = "dd_api_key_id";
  private String ddApiKeyId;

  public static final String JSON_PROPERTY_DD_API_KEY_SECRET = "dd_api_key_secret";
  private String ddApiKeySecret;

  public static final String JSON_PROPERTY_DJM_GLOBAL_INIT_SCRIPT_ENABLED =
      "djm_global_init_script_enabled";
  private Boolean djmGlobalInitScriptEnabled;

  public static final String JSON_PROPERTY_SCRIPT_GPUM_ENABLED = "script_gpum_enabled";
  private Boolean scriptGpumEnabled;

  public static final String JSON_PROPERTY_SCRIPT_LOGS_ENABLED = "script_logs_enabled";
  private Boolean scriptLogsEnabled;

  public static final String JSON_PROPERTY_SERVERLESS_JOBS_ENABLED = "serverless_jobs_enabled";
  private Boolean serverlessJobsEnabled;

  public DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsRequest ddApiKeyId(
      String ddApiKeyId) {
    this.ddApiKeyId = ddApiKeyId;
    return this;
  }

  /**
   * ID of the Datadog API key the global init script uses to submit data. Setting or changing it
   * requires <code>dd_api_key_secret</code> in the same request.
   *
   * @return ddApiKeyId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DD_API_KEY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDdApiKeyId() {
    return ddApiKeyId;
  }

  public void setDdApiKeyId(String ddApiKeyId) {
    this.ddApiKeyId = ddApiKeyId;
  }

  public DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsRequest ddApiKeySecret(
      String ddApiKeySecret) {
    this.ddApiKeySecret = ddApiKeySecret;
    return this;
  }

  /**
   * Secret value of the Datadog API key identified by <code>dd_api_key_id</code>.
   *
   * @return ddApiKeySecret
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DD_API_KEY_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDdApiKeySecret() {
    return ddApiKeySecret;
  }

  public void setDdApiKeySecret(String ddApiKeySecret) {
    this.ddApiKeySecret = ddApiKeySecret;
  }

  public DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsRequest
      djmGlobalInitScriptEnabled(Boolean djmGlobalInitScriptEnabled) {
    this.djmGlobalInitScriptEnabled = djmGlobalInitScriptEnabled;
    return this;
  }

  /**
   * Whether Datadog installs and manages the Agent on your Databricks clusters through a global
   * init script. Installation can take up to 15 minutes and requires Databricks Workspace Admin
   * permissions. The script does not apply to clusters in Standard access mode. Leave this <code>
   * false</code> to install the Agent yourself. Defaults to <code>false</code>.
   *
   * @return djmGlobalInitScriptEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DJM_GLOBAL_INIT_SCRIPT_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDjmGlobalInitScriptEnabled() {
    return djmGlobalInitScriptEnabled;
  }

  public void setDjmGlobalInitScriptEnabled(Boolean djmGlobalInitScriptEnabled) {
    this.djmGlobalInitScriptEnabled = djmGlobalInitScriptEnabled;
  }

  public DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsRequest
      scriptGpumEnabled(Boolean scriptGpumEnabled) {
    this.scriptGpumEnabled = scriptGpumEnabled;
    return this;
  }

  /**
   * Whether GPU metrics are collected from your Databricks clusters. The Agent installed by the
   * global init script performs the collection, so this requires the dataflow to be enabled with
   * <code>djm_global_init_script_enabled</code> set to <code>true</code>. Defaults to <code>false
   * </code>.
   *
   * @return scriptGpumEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCRIPT_GPUM_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getScriptGpumEnabled() {
    return scriptGpumEnabled;
  }

  public void setScriptGpumEnabled(Boolean scriptGpumEnabled) {
    this.scriptGpumEnabled = scriptGpumEnabled;
  }

  public DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsRequest
      scriptLogsEnabled(Boolean scriptLogsEnabled) {
    this.scriptLogsEnabled = scriptLogsEnabled;
    return this;
  }

  /**
   * Whether driver and worker logs are collected from your Databricks clusters. The Agent installed
   * by the global init script performs the collection, so this requires the dataflow to be enabled
   * with <code>djm_global_init_script_enabled</code> set to <code>true</code>. Defaults to <code>
   * false</code>.
   *
   * @return scriptLogsEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCRIPT_LOGS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getScriptLogsEnabled() {
    return scriptLogsEnabled;
  }

  public void setScriptLogsEnabled(Boolean scriptLogsEnabled) {
    this.scriptLogsEnabled = scriptLogsEnabled;
  }

  public DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsRequest
      serverlessJobsEnabled(Boolean serverlessJobsEnabled) {
    this.serverlessJobsEnabled = serverlessJobsEnabled;
    return this;
  }

  /**
   * Whether health and cost data is collected for jobs running on Serverless or SQL Warehouse
   * compute. This compute has no clusters for the global init script to target, so collection reads
   * the Databricks system tables and requires <code>system_tables_sql_warehouse_id</code>. Defaults
   * to <code>true</code>.
   *
   * @return serverlessJobsEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_JOBS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getServerlessJobsEnabled() {
    return serverlessJobsEnabled;
  }

  public void setServerlessJobsEnabled(Boolean serverlessJobsEnabled) {
    this.serverlessJobsEnabled = serverlessJobsEnabled;
  }

  /**
   * Return true if this DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsRequest
   * object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsRequest
        databricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsRequest =
            (DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsRequest) o;
    return Objects.equals(
            this.ddApiKeyId,
            databricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsRequest.ddApiKeyId)
        && Objects.equals(
            this.ddApiKeySecret,
            databricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsRequest
                .ddApiKeySecret)
        && Objects.equals(
            this.djmGlobalInitScriptEnabled,
            databricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsRequest
                .djmGlobalInitScriptEnabled)
        && Objects.equals(
            this.scriptGpumEnabled,
            databricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsRequest
                .scriptGpumEnabled)
        && Objects.equals(
            this.scriptLogsEnabled,
            databricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsRequest
                .scriptLogsEnabled)
        && Objects.equals(
            this.serverlessJobsEnabled,
            databricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsRequest
                .serverlessJobsEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        ddApiKeyId,
        ddApiKeySecret,
        djmGlobalInitScriptEnabled,
        scriptGpumEnabled,
        scriptLogsEnabled,
        serverlessJobsEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(
        "class DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsRequest {\n");
    sb.append("    ddApiKeyId: ").append(toIndentedString(ddApiKeyId)).append("\n");
    sb.append("    ddApiKeySecret: ").append(toIndentedString(ddApiKeySecret)).append("\n");
    sb.append("    djmGlobalInitScriptEnabled: ")
        .append(toIndentedString(djmGlobalInitScriptEnabled))
        .append("\n");
    sb.append("    scriptGpumEnabled: ").append(toIndentedString(scriptGpumEnabled)).append("\n");
    sb.append("    scriptLogsEnabled: ").append(toIndentedString(scriptLogsEnabled)).append("\n");
    sb.append("    serverlessJobsEnabled: ")
        .append(toIndentedString(serverlessJobsEnabled))
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
