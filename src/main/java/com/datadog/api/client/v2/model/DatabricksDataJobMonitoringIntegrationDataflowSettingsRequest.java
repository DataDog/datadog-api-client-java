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
 * Settings of the Databricks Data Jobs Monitoring dataflow. Only the fields provided are changed.
 */
@JsonPropertyOrder({
  DatabricksDataJobMonitoringIntegrationDataflowSettingsRequest.JSON_PROPERTY_DD_API_KEY_ID,
  DatabricksDataJobMonitoringIntegrationDataflowSettingsRequest.JSON_PROPERTY_DD_API_KEY_SECRET,
  DatabricksDataJobMonitoringIntegrationDataflowSettingsRequest
      .JSON_PROPERTY_DJM_GLOBAL_INIT_SCRIPT_ENABLED,
  DatabricksDataJobMonitoringIntegrationDataflowSettingsRequest.JSON_PROPERTY_SCRIPT_GPUM_ENABLED,
  DatabricksDataJobMonitoringIntegrationDataflowSettingsRequest.JSON_PROPERTY_SCRIPT_LOGS_ENABLED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatabricksDataJobMonitoringIntegrationDataflowSettingsRequest {
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

  public DatabricksDataJobMonitoringIntegrationDataflowSettingsRequest ddApiKeyId(
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

  public DatabricksDataJobMonitoringIntegrationDataflowSettingsRequest ddApiKeySecret(
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

  public DatabricksDataJobMonitoringIntegrationDataflowSettingsRequest djmGlobalInitScriptEnabled(
      Boolean djmGlobalInitScriptEnabled) {
    this.djmGlobalInitScriptEnabled = djmGlobalInitScriptEnabled;
    return this;
  }

  /**
   * Whether Datadog manages the global init script that installs the Agent on your Databricks
   * clusters.
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

  public DatabricksDataJobMonitoringIntegrationDataflowSettingsRequest scriptGpumEnabled(
      Boolean scriptGpumEnabled) {
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

  public DatabricksDataJobMonitoringIntegrationDataflowSettingsRequest scriptLogsEnabled(
      Boolean scriptLogsEnabled) {
    this.scriptLogsEnabled = scriptLogsEnabled;
    return this;
  }

  /**
   * Whether logs are collected from your Databricks clusters. The Agent installed by the global
   * init script performs the collection, so this requires the dataflow to be enabled with <code>
   * djm_global_init_script_enabled</code> set to <code>true</code>.
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

  /**
   * Return true if this DatabricksDataJobMonitoringIntegrationDataflowSettingsRequest object is
   * equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabricksDataJobMonitoringIntegrationDataflowSettingsRequest
        databricksDataJobMonitoringIntegrationDataflowSettingsRequest =
            (DatabricksDataJobMonitoringIntegrationDataflowSettingsRequest) o;
    return Objects.equals(
            this.ddApiKeyId,
            databricksDataJobMonitoringIntegrationDataflowSettingsRequest.ddApiKeyId)
        && Objects.equals(
            this.ddApiKeySecret,
            databricksDataJobMonitoringIntegrationDataflowSettingsRequest.ddApiKeySecret)
        && Objects.equals(
            this.djmGlobalInitScriptEnabled,
            databricksDataJobMonitoringIntegrationDataflowSettingsRequest
                .djmGlobalInitScriptEnabled)
        && Objects.equals(
            this.scriptGpumEnabled,
            databricksDataJobMonitoringIntegrationDataflowSettingsRequest.scriptGpumEnabled)
        && Objects.equals(
            this.scriptLogsEnabled,
            databricksDataJobMonitoringIntegrationDataflowSettingsRequest.scriptLogsEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        ddApiKeyId,
        ddApiKeySecret,
        djmGlobalInitScriptEnabled,
        scriptGpumEnabled,
        scriptLogsEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabricksDataJobMonitoringIntegrationDataflowSettingsRequest {\n");
    sb.append("    ddApiKeyId: ").append(toIndentedString(ddApiKeyId)).append("\n");
    sb.append("    ddApiKeySecret: ").append(toIndentedString(ddApiKeySecret)).append("\n");
    sb.append("    djmGlobalInitScriptEnabled: ")
        .append(toIndentedString(djmGlobalInitScriptEnabled))
        .append("\n");
    sb.append("    scriptGpumEnabled: ").append(toIndentedString(scriptGpumEnabled)).append("\n");
    sb.append("    scriptLogsEnabled: ").append(toIndentedString(scriptLogsEnabled)).append("\n");
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
