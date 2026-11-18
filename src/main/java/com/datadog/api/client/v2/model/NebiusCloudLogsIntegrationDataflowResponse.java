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

/**
 * Logs from your Nebius tenant: Kubernetes control plane and audit logs, tenant-level audit events,
 * compute serial console logs, cloud apps and AI inference logs, PostgreSQL logs, and MLflow logs,
 * collected from the services named in <code>settings.enabled_services</code>.
 */
@JsonPropertyOrder({
  NebiusCloudLogsIntegrationDataflowResponse.JSON_PROPERTY_ENABLED,
  NebiusCloudLogsIntegrationDataflowResponse.JSON_PROPERTY_SETTINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NebiusCloudLogsIntegrationDataflowResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private NebiusCloudLogsIntegrationDataflowSettingsResponse settings;

  public NebiusCloudLogsIntegrationDataflowResponse enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether Datadog collects logs. Absent when no service is enabled.
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

  public NebiusCloudLogsIntegrationDataflowResponse settings(
      NebiusCloudLogsIntegrationDataflowSettingsResponse settings) {
    this.settings = settings;
    this.unparsed |= settings.unparsed;
    return this;
  }

  /**
   * Settings of the logs dataflow.
   *
   * @return settings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NebiusCloudLogsIntegrationDataflowSettingsResponse getSettings() {
    return settings;
  }

  public void setSettings(NebiusCloudLogsIntegrationDataflowSettingsResponse settings) {
    this.settings = settings;
    if (settings != null) {
      this.unparsed |= settings.unparsed;
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
   * @return NebiusCloudLogsIntegrationDataflowResponse
   */
  @JsonAnySetter
  public NebiusCloudLogsIntegrationDataflowResponse putAdditionalProperty(
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

  /** Return true if this NebiusCloudLogsIntegrationDataflowResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NebiusCloudLogsIntegrationDataflowResponse nebiusCloudLogsIntegrationDataflowResponse =
        (NebiusCloudLogsIntegrationDataflowResponse) o;
    return Objects.equals(this.enabled, nebiusCloudLogsIntegrationDataflowResponse.enabled)
        && Objects.equals(this.settings, nebiusCloudLogsIntegrationDataflowResponse.settings)
        && Objects.equals(
            this.additionalProperties,
            nebiusCloudLogsIntegrationDataflowResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, settings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NebiusCloudLogsIntegrationDataflowResponse {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
