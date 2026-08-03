/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes for the v2 agent detail response. */
@JsonPropertyOrder({
  FleetAgentDetailV2Attributes.JSON_PROPERTY_AGENT_INFOS,
  FleetAgentDetailV2Attributes.JSON_PROPERTY_CONFIGURATION_FILES,
  FleetAgentDetailV2Attributes.JSON_PROPERTY_INTEGRATIONS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetAgentDetailV2Attributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGENT_INFOS = "agent_infos";
  private FleetAgentInfoDetailsV2 agentInfos;

  public static final String JSON_PROPERTY_CONFIGURATION_FILES = "configuration_files";
  private FleetAgentConfigurationFilesV2 configurationFiles;

  public static final String JSON_PROPERTY_INTEGRATIONS = "integrations";
  private FleetIntegrationsByStatusV2 integrations;

  public FleetAgentDetailV2Attributes() {}

  @JsonCreator
  public FleetAgentDetailV2Attributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGENT_INFOS)
          FleetAgentInfoDetailsV2 agentInfos) {
    this.agentInfos = agentInfos;
    this.unparsed |= agentInfos.unparsed;
  }

  public FleetAgentDetailV2Attributes agentInfos(FleetAgentInfoDetailsV2 agentInfos) {
    this.agentInfos = agentInfos;
    this.unparsed |= agentInfos.unparsed;
    return this;
  }

  /**
   * Detailed information about a Datadog Agent.
   *
   * @return agentInfos
   */
  @JsonProperty(JSON_PROPERTY_AGENT_INFOS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FleetAgentInfoDetailsV2 getAgentInfos() {
    return agentInfos;
  }

  public void setAgentInfos(FleetAgentInfoDetailsV2 agentInfos) {
    this.agentInfos = agentInfos;
    if (agentInfos != null) {
      this.unparsed |= agentInfos.unparsed;
    }
  }

  public FleetAgentDetailV2Attributes configurationFiles(
      FleetAgentConfigurationFilesV2 configurationFiles) {
    this.configurationFiles = configurationFiles;
    this.unparsed |= configurationFiles.unparsed;
    return this;
  }

  /**
   * Configuration details for an agent, organized by configuration layer.
   *
   * @return configurationFiles
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIGURATION_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FleetAgentConfigurationFilesV2 getConfigurationFiles() {
    return configurationFiles;
  }

  public void setConfigurationFiles(FleetAgentConfigurationFilesV2 configurationFiles) {
    this.configurationFiles = configurationFiles;
    if (configurationFiles != null) {
      this.unparsed |= configurationFiles.unparsed;
    }
  }

  public FleetAgentDetailV2Attributes integrations(FleetIntegrationsByStatusV2 integrations) {
    this.integrations = integrations;
    this.unparsed |= integrations.unparsed;
    return this;
  }

  /**
   * Integrations organized by their status.
   *
   * @return integrations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FleetIntegrationsByStatusV2 getIntegrations() {
    return integrations;
  }

  public void setIntegrations(FleetIntegrationsByStatusV2 integrations) {
    this.integrations = integrations;
    if (integrations != null) {
      this.unparsed |= integrations.unparsed;
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
   * @return FleetAgentDetailV2Attributes
   */
  @JsonAnySetter
  public FleetAgentDetailV2Attributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetAgentDetailV2Attributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetAgentDetailV2Attributes fleetAgentDetailV2Attributes = (FleetAgentDetailV2Attributes) o;
    return Objects.equals(this.agentInfos, fleetAgentDetailV2Attributes.agentInfos)
        && Objects.equals(this.configurationFiles, fleetAgentDetailV2Attributes.configurationFiles)
        && Objects.equals(this.integrations, fleetAgentDetailV2Attributes.integrations)
        && Objects.equals(
            this.additionalProperties, fleetAgentDetailV2Attributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentInfos, configurationFiles, integrations, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetAgentDetailV2Attributes {\n");
    sb.append("    agentInfos: ").append(toIndentedString(agentInfos)).append("\n");
    sb.append("    configurationFiles: ").append(toIndentedString(configurationFiles)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
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
