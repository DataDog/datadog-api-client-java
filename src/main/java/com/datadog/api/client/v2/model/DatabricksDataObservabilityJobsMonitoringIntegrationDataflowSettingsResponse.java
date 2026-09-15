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

/** Settings of the Data Jobs Monitoring dataflow. */
@JsonPropertyOrder({
  DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsResponse
      .JSON_PROPERTY_DD_API_KEY_ID,
  DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsResponse
      .JSON_PROPERTY_DJM_GLOBAL_INIT_SCRIPT_ENABLED,
  DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsResponse
      .JSON_PROPERTY_SCRIPT_GPUM_ENABLED,
  DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsResponse
      .JSON_PROPERTY_SCRIPT_LOGS_ENABLED,
  DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsResponse
      .JSON_PROPERTY_SERVERLESS_JOBS_ENABLED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DD_API_KEY_ID = "dd_api_key_id";
  private String ddApiKeyId;

  public static final String JSON_PROPERTY_DJM_GLOBAL_INIT_SCRIPT_ENABLED =
      "djm_global_init_script_enabled";
  private Boolean djmGlobalInitScriptEnabled;

  public static final String JSON_PROPERTY_SCRIPT_GPUM_ENABLED = "script_gpum_enabled";
  private Boolean scriptGpumEnabled;

  public static final String JSON_PROPERTY_SCRIPT_LOGS_ENABLED = "script_logs_enabled";
  private Boolean scriptLogsEnabled;

  public static final String JSON_PROPERTY_SERVERLESS_JOBS_ENABLED = "serverless_jobs_enabled";
  private Boolean serverlessJobsEnabled;

  public DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsResponse ddApiKeyId(
      String ddApiKeyId) {
    this.ddApiKeyId = ddApiKeyId;
    return this;
  }

  /**
   * ID of the Datadog API key the global init script uses to submit data.
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

  public DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsResponse
      djmGlobalInitScriptEnabled(Boolean djmGlobalInitScriptEnabled) {
    this.djmGlobalInitScriptEnabled = djmGlobalInitScriptEnabled;
    return this;
  }

  /**
   * Whether Datadog installs and manages the Agent on your Databricks clusters through a global
   * init script. The script does not apply to clusters in Standard access mode. When <code>false
   * </code>, the Agent is installed manually.
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

  public DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsResponse
      scriptGpumEnabled(Boolean scriptGpumEnabled) {
    this.scriptGpumEnabled = scriptGpumEnabled;
    return this;
  }

  /**
   * Whether GPU metrics are collected from your Databricks clusters. The Agent installed by the
   * global init script performs the collection, so this requires the dataflow to be enabled with
   * <code>djm_global_init_script_enabled</code> set to <code>true</code>.
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

  public DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsResponse
      scriptLogsEnabled(Boolean scriptLogsEnabled) {
    this.scriptLogsEnabled = scriptLogsEnabled;
    return this;
  }

  /**
   * Whether driver and worker logs are collected from your Databricks clusters. The Agent installed
   * by the global init script performs the collection, so this requires the dataflow to be enabled
   * with <code>djm_global_init_script_enabled</code> set to <code>true</code>.
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

  public DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsResponse
      serverlessJobsEnabled(Boolean serverlessJobsEnabled) {
    this.serverlessJobsEnabled = serverlessJobsEnabled;
    return this;
  }

  /**
   * Whether health and cost data is collected for jobs running on Serverless or SQL Warehouse
   * compute. This compute has no clusters for the global init script to target, so collection reads
   * the Databricks system tables and requires <code>system_tables_sql_warehouse_id</code>.
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
   * @return DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsResponse
   */
  @JsonAnySetter
  public DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsResponse
      putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this
   * DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsResponse object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsResponse
        databricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsResponse =
            (DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsResponse) o;
    return Objects.equals(
            this.ddApiKeyId,
            databricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsResponse.ddApiKeyId)
        && Objects.equals(
            this.djmGlobalInitScriptEnabled,
            databricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsResponse
                .djmGlobalInitScriptEnabled)
        && Objects.equals(
            this.scriptGpumEnabled,
            databricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsResponse
                .scriptGpumEnabled)
        && Objects.equals(
            this.scriptLogsEnabled,
            databricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsResponse
                .scriptLogsEnabled)
        && Objects.equals(
            this.serverlessJobsEnabled,
            databricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsResponse
                .serverlessJobsEnabled)
        && Objects.equals(
            this.additionalProperties,
            databricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsResponse
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        ddApiKeyId,
        djmGlobalInitScriptEnabled,
        scriptGpumEnabled,
        scriptLogsEnabled,
        serverlessJobsEnabled,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(
        "class DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsResponse {\n");
    sb.append("    ddApiKeyId: ").append(toIndentedString(ddApiKeyId)).append("\n");
    sb.append("    djmGlobalInitScriptEnabled: ")
        .append(toIndentedString(djmGlobalInitScriptEnabled))
        .append("\n");
    sb.append("    scriptGpumEnabled: ").append(toIndentedString(scriptGpumEnabled)).append("\n");
    sb.append("    scriptLogsEnabled: ").append(toIndentedString(scriptLogsEnabled)).append("\n");
    sb.append("    serverlessJobsEnabled: ")
        .append(toIndentedString(serverlessJobsEnabled))
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
