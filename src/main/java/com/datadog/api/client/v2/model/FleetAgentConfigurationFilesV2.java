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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Configuration details for an agent, organized by configuration layer. */
@JsonPropertyOrder({
  FleetAgentConfigurationFilesV2.JSON_PROPERTY_AGENT_CONFIGURATION,
  FleetAgentConfigurationFilesV2.JSON_PROPERTY_APPLICATION_MONITORING_CONFIGURATION,
  FleetAgentConfigurationFilesV2.JSON_PROPERTY_DATADOG_AGENT_KEY,
  FleetAgentConfigurationFilesV2.JSON_PROPERTY_OTEL_COLLECTORS_CONFIGURATION,
  FleetAgentConfigurationFilesV2.JSON_PROPERTY_SECURITY_AGENT_CONFIGURATION,
  FleetAgentConfigurationFilesV2.JSON_PROPERTY_SYSTEM_PROBE_CONFIGURATION,
  FleetAgentConfigurationFilesV2.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetAgentConfigurationFilesV2 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGENT_CONFIGURATION = "agent_configuration";
  private FleetConfigurationLayer agentConfiguration;

  public static final String JSON_PROPERTY_APPLICATION_MONITORING_CONFIGURATION =
      "application_monitoring_configuration";
  private FleetConfigurationLayer applicationMonitoringConfiguration;

  public static final String JSON_PROPERTY_DATADOG_AGENT_KEY = "datadog_agent_key";
  private String datadogAgentKey;

  public static final String JSON_PROPERTY_OTEL_COLLECTORS_CONFIGURATION =
      "otel_collectors_configuration";
  private List<FleetOtelCollectorConfigurationV2> otelCollectorsConfiguration = null;

  public static final String JSON_PROPERTY_SECURITY_AGENT_CONFIGURATION =
      "security_agent_configuration";
  private FleetConfigurationLayer securityAgentConfiguration;

  public static final String JSON_PROPERTY_SYSTEM_PROBE_CONFIGURATION =
      "system_probe_configuration";
  private FleetConfigurationLayer systemProbeConfiguration;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public FleetAgentConfigurationFilesV2 agentConfiguration(
      FleetConfigurationLayer agentConfiguration) {
    this.agentConfiguration = agentConfiguration;
    this.unparsed |= agentConfiguration.unparsed;
    return this;
  }

  /**
   * Configuration information organized by layers.
   *
   * @return agentConfiguration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FleetConfigurationLayer getAgentConfiguration() {
    return agentConfiguration;
  }

  public void setAgentConfiguration(FleetConfigurationLayer agentConfiguration) {
    this.agentConfiguration = agentConfiguration;
    if (agentConfiguration != null) {
      this.unparsed |= agentConfiguration.unparsed;
    }
  }

  public FleetAgentConfigurationFilesV2 applicationMonitoringConfiguration(
      FleetConfigurationLayer applicationMonitoringConfiguration) {
    this.applicationMonitoringConfiguration = applicationMonitoringConfiguration;
    this.unparsed |= applicationMonitoringConfiguration.unparsed;
    return this;
  }

  /**
   * Configuration information organized by layers.
   *
   * @return applicationMonitoringConfiguration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICATION_MONITORING_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FleetConfigurationLayer getApplicationMonitoringConfiguration() {
    return applicationMonitoringConfiguration;
  }

  public void setApplicationMonitoringConfiguration(
      FleetConfigurationLayer applicationMonitoringConfiguration) {
    this.applicationMonitoringConfiguration = applicationMonitoringConfiguration;
    if (applicationMonitoringConfiguration != null) {
      this.unparsed |= applicationMonitoringConfiguration.unparsed;
    }
  }

  public FleetAgentConfigurationFilesV2 datadogAgentKey(String datadogAgentKey) {
    this.datadogAgentKey = datadogAgentKey;
    return this;
  }

  /**
   * The unique agent key identifier.
   *
   * @return datadogAgentKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATADOG_AGENT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDatadogAgentKey() {
    return datadogAgentKey;
  }

  public void setDatadogAgentKey(String datadogAgentKey) {
    this.datadogAgentKey = datadogAgentKey;
  }

  public FleetAgentConfigurationFilesV2 otelCollectorsConfiguration(
      List<FleetOtelCollectorConfigurationV2> otelCollectorsConfiguration) {
    this.otelCollectorsConfiguration = otelCollectorsConfiguration;
    if (otelCollectorsConfiguration != null) {
      for (FleetOtelCollectorConfigurationV2 item : otelCollectorsConfiguration) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public FleetAgentConfigurationFilesV2 addOtelCollectorsConfigurationItem(
      FleetOtelCollectorConfigurationV2 otelCollectorsConfigurationItem) {
    if (this.otelCollectorsConfiguration == null) {
      this.otelCollectorsConfiguration = new ArrayList<>();
    }
    this.otelCollectorsConfiguration.add(otelCollectorsConfigurationItem);
    this.unparsed |= otelCollectorsConfigurationItem.unparsed;
    return this;
  }

  /**
   * Configuration for OpenTelemetry collectors associated with the agent. Present only when the
   * agent has associated OpenTelemetry collectors.
   *
   * @return otelCollectorsConfiguration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OTEL_COLLECTORS_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FleetOtelCollectorConfigurationV2> getOtelCollectorsConfiguration() {
    return otelCollectorsConfiguration;
  }

  public void setOtelCollectorsConfiguration(
      List<FleetOtelCollectorConfigurationV2> otelCollectorsConfiguration) {
    this.otelCollectorsConfiguration = otelCollectorsConfiguration;
    if (otelCollectorsConfiguration != null) {
      for (FleetOtelCollectorConfigurationV2 item : otelCollectorsConfiguration) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public FleetAgentConfigurationFilesV2 securityAgentConfiguration(
      FleetConfigurationLayer securityAgentConfiguration) {
    this.securityAgentConfiguration = securityAgentConfiguration;
    this.unparsed |= securityAgentConfiguration.unparsed;
    return this;
  }

  /**
   * Configuration information organized by layers.
   *
   * @return securityAgentConfiguration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECURITY_AGENT_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FleetConfigurationLayer getSecurityAgentConfiguration() {
    return securityAgentConfiguration;
  }

  public void setSecurityAgentConfiguration(FleetConfigurationLayer securityAgentConfiguration) {
    this.securityAgentConfiguration = securityAgentConfiguration;
    if (securityAgentConfiguration != null) {
      this.unparsed |= securityAgentConfiguration.unparsed;
    }
  }

  public FleetAgentConfigurationFilesV2 systemProbeConfiguration(
      FleetConfigurationLayer systemProbeConfiguration) {
    this.systemProbeConfiguration = systemProbeConfiguration;
    this.unparsed |= systemProbeConfiguration.unparsed;
    return this;
  }

  /**
   * Configuration information organized by layers.
   *
   * @return systemProbeConfiguration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYSTEM_PROBE_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FleetConfigurationLayer getSystemProbeConfiguration() {
    return systemProbeConfiguration;
  }

  public void setSystemProbeConfiguration(FleetConfigurationLayer systemProbeConfiguration) {
    this.systemProbeConfiguration = systemProbeConfiguration;
    if (systemProbeConfiguration != null) {
      this.unparsed |= systemProbeConfiguration.unparsed;
    }
  }

  public FleetAgentConfigurationFilesV2 version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The configuration version.
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
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
   * @return FleetAgentConfigurationFilesV2
   */
  @JsonAnySetter
  public FleetAgentConfigurationFilesV2 putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetAgentConfigurationFilesV2 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetAgentConfigurationFilesV2 fleetAgentConfigurationFilesV2 =
        (FleetAgentConfigurationFilesV2) o;
    return Objects.equals(
            this.agentConfiguration, fleetAgentConfigurationFilesV2.agentConfiguration)
        && Objects.equals(
            this.applicationMonitoringConfiguration,
            fleetAgentConfigurationFilesV2.applicationMonitoringConfiguration)
        && Objects.equals(this.datadogAgentKey, fleetAgentConfigurationFilesV2.datadogAgentKey)
        && Objects.equals(
            this.otelCollectorsConfiguration,
            fleetAgentConfigurationFilesV2.otelCollectorsConfiguration)
        && Objects.equals(
            this.securityAgentConfiguration,
            fleetAgentConfigurationFilesV2.securityAgentConfiguration)
        && Objects.equals(
            this.systemProbeConfiguration, fleetAgentConfigurationFilesV2.systemProbeConfiguration)
        && Objects.equals(this.version, fleetAgentConfigurationFilesV2.version)
        && Objects.equals(
            this.additionalProperties, fleetAgentConfigurationFilesV2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        agentConfiguration,
        applicationMonitoringConfiguration,
        datadogAgentKey,
        otelCollectorsConfiguration,
        securityAgentConfiguration,
        systemProbeConfiguration,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetAgentConfigurationFilesV2 {\n");
    sb.append("    agentConfiguration: ").append(toIndentedString(agentConfiguration)).append("\n");
    sb.append("    applicationMonitoringConfiguration: ")
        .append(toIndentedString(applicationMonitoringConfiguration))
        .append("\n");
    sb.append("    datadogAgentKey: ").append(toIndentedString(datadogAgentKey)).append("\n");
    sb.append("    otelCollectorsConfiguration: ")
        .append(toIndentedString(otelCollectorsConfiguration))
        .append("\n");
    sb.append("    securityAgentConfiguration: ")
        .append(toIndentedString(securityAgentConfiguration))
        .append("\n");
    sb.append("    systemProbeConfiguration: ")
        .append(toIndentedString(systemProbeConfiguration))
        .append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
