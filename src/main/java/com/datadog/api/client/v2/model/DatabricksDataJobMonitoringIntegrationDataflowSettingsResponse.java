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

/** Settings of the Databricks Data Jobs Monitoring dataflow. */
@JsonPropertyOrder({
  DatabricksDataJobMonitoringIntegrationDataflowSettingsResponse.JSON_PROPERTY_DD_API_KEY_ID,
  DatabricksDataJobMonitoringIntegrationDataflowSettingsResponse
      .JSON_PROPERTY_DJM_GLOBAL_INIT_SCRIPT_ENABLED,
  DatabricksDataJobMonitoringIntegrationDataflowSettingsResponse.JSON_PROPERTY_SCRIPT_GPUM_ENABLED,
  DatabricksDataJobMonitoringIntegrationDataflowSettingsResponse.JSON_PROPERTY_SCRIPT_LOGS_ENABLED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatabricksDataJobMonitoringIntegrationDataflowSettingsResponse {
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

  public DatabricksDataJobMonitoringIntegrationDataflowSettingsResponse ddApiKeyId(
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

  public DatabricksDataJobMonitoringIntegrationDataflowSettingsResponse djmGlobalInitScriptEnabled(
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

  public DatabricksDataJobMonitoringIntegrationDataflowSettingsResponse scriptGpumEnabled(
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

  public DatabricksDataJobMonitoringIntegrationDataflowSettingsResponse scriptLogsEnabled(
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
   * @return DatabricksDataJobMonitoringIntegrationDataflowSettingsResponse
   */
  @JsonAnySetter
  public DatabricksDataJobMonitoringIntegrationDataflowSettingsResponse putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this DatabricksDataJobMonitoringIntegrationDataflowSettingsResponse object is
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
    DatabricksDataJobMonitoringIntegrationDataflowSettingsResponse
        databricksDataJobMonitoringIntegrationDataflowSettingsResponse =
            (DatabricksDataJobMonitoringIntegrationDataflowSettingsResponse) o;
    return Objects.equals(
            this.ddApiKeyId,
            databricksDataJobMonitoringIntegrationDataflowSettingsResponse.ddApiKeyId)
        && Objects.equals(
            this.djmGlobalInitScriptEnabled,
            databricksDataJobMonitoringIntegrationDataflowSettingsResponse
                .djmGlobalInitScriptEnabled)
        && Objects.equals(
            this.scriptGpumEnabled,
            databricksDataJobMonitoringIntegrationDataflowSettingsResponse.scriptGpumEnabled)
        && Objects.equals(
            this.scriptLogsEnabled,
            databricksDataJobMonitoringIntegrationDataflowSettingsResponse.scriptLogsEnabled)
        && Objects.equals(
            this.additionalProperties,
            databricksDataJobMonitoringIntegrationDataflowSettingsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        ddApiKeyId,
        djmGlobalInitScriptEnabled,
        scriptGpumEnabled,
        scriptLogsEnabled,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabricksDataJobMonitoringIntegrationDataflowSettingsResponse {\n");
    sb.append("    ddApiKeyId: ").append(toIndentedString(ddApiKeyId)).append("\n");
    sb.append("    djmGlobalInitScriptEnabled: ")
        .append(toIndentedString(djmGlobalInitScriptEnabled))
        .append("\n");
    sb.append("    scriptGpumEnabled: ").append(toIndentedString(scriptGpumEnabled)).append("\n");
    sb.append("    scriptLogsEnabled: ").append(toIndentedString(scriptLogsEnabled)).append("\n");
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
