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
 * Logs from your Nebius tenant: Kubernetes control plane and audit logs, tenant-level audit events,
 * compute serial console logs, cloud apps and AI inference logs, PostgreSQL logs, and MLflow logs,
 * collected from the services named in <code>settings.enabled_services</code>. <code>
 * enabled_services</code> is the sole source of truth for what is collected; <code>enabled</code>
 * set to <code>false</code> stops log collection, while <code>true</code> on its own changes
 * nothing. Defaults to no services.
 */
@JsonPropertyOrder({
  NebiusCloudLogsIntegrationDataflowRequest.JSON_PROPERTY_ENABLED,
  NebiusCloudLogsIntegrationDataflowRequest.JSON_PROPERTY_SETTINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NebiusCloudLogsIntegrationDataflowRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private NebiusCloudLogsIntegrationDataflowSettingsRequest settings;

  public NebiusCloudLogsIntegrationDataflowRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether Datadog collects logs. Defaults to <code>false</code>. Set to <code>false</code> to
   * stop log collection; sending <code>true</code> on its own changes nothing, because <code>
   * settings.enabled_services</code> is the sole source of truth.
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public NebiusCloudLogsIntegrationDataflowRequest settings(
      NebiusCloudLogsIntegrationDataflowSettingsRequest settings) {
    this.settings = settings;
    this.unparsed |= settings.unparsed;
    return this;
  }

  /**
   * Settings of the logs dataflow. Only the fields provided are changed.
   *
   * @return settings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NebiusCloudLogsIntegrationDataflowSettingsRequest getSettings() {
    return settings;
  }

  public void setSettings(NebiusCloudLogsIntegrationDataflowSettingsRequest settings) {
    this.settings = settings;
    if (settings != null) {
      this.unparsed |= settings.unparsed;
    }
  }

  /** Return true if this NebiusCloudLogsIntegrationDataflowRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NebiusCloudLogsIntegrationDataflowRequest nebiusCloudLogsIntegrationDataflowRequest =
        (NebiusCloudLogsIntegrationDataflowRequest) o;
    return Objects.equals(this.enabled, nebiusCloudLogsIntegrationDataflowRequest.enabled)
        && Objects.equals(this.settings, nebiusCloudLogsIntegrationDataflowRequest.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NebiusCloudLogsIntegrationDataflowRequest {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
