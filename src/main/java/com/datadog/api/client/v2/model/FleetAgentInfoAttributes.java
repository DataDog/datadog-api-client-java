/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Attributes for agent information.</p>
 */
@JsonPropertyOrder({
  FleetAgentInfoAttributes.JSON_PROPERTY_AGENT_INFOS,
  FleetAgentInfoAttributes.JSON_PROPERTY_CONFIGURATION_FILES,
  FleetAgentInfoAttributes.JSON_PROPERTY_DETECTED_INTEGRATIONS,
  FleetAgentInfoAttributes.JSON_PROPERTY_INTEGRATIONS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetAgentInfoAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGENT_INFOS = "agent_infos";
  private FleetAgentInfoDetails agentInfos;

  public static final String JSON_PROPERTY_CONFIGURATION_FILES = "configuration_files";
  private FleetConfigurationLayer configurationFiles;

  public static final String JSON_PROPERTY_DETECTED_INTEGRATIONS = "detected_integrations";
  private List<FleetDetectedIntegration> detectedIntegrations = null;

  public static final String JSON_PROPERTY_INTEGRATIONS = "integrations";
  private FleetIntegrationsByStatus integrations;

  public FleetAgentInfoAttributes agentInfos(FleetAgentInfoDetails agentInfos) {
    this.agentInfos = agentInfos;
    this.unparsed |= agentInfos.unparsed;
    return this;
  }

  /**
   * <p>Detailed information about a Datadog Agent.</p>
   * @return agentInfos
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AGENT_INFOS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public FleetAgentInfoDetails getAgentInfos() {
        return agentInfos;
      }
  public void setAgentInfos(FleetAgentInfoDetails agentInfos) {
    this.agentInfos = agentInfos;
  }
  public FleetAgentInfoAttributes configurationFiles(FleetConfigurationLayer configurationFiles) {
    this.configurationFiles = configurationFiles;
    this.unparsed |= configurationFiles.unparsed;
    return this;
  }

  /**
   * <p>Configuration information organized by layers.</p>
   * @return configurationFiles
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONFIGURATION_FILES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public FleetConfigurationLayer getConfigurationFiles() {
        return configurationFiles;
      }
  public void setConfigurationFiles(FleetConfigurationLayer configurationFiles) {
    this.configurationFiles = configurationFiles;
  }
  public FleetAgentInfoAttributes detectedIntegrations(List<FleetDetectedIntegration> detectedIntegrations) {
    this.detectedIntegrations = detectedIntegrations;
    for (FleetDetectedIntegration item : detectedIntegrations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public FleetAgentInfoAttributes addDetectedIntegrationsItem(FleetDetectedIntegration detectedIntegrationsItem) {
    if (this.detectedIntegrations == null) {
      this.detectedIntegrations = new ArrayList<>();
    }
    this.detectedIntegrations.add(detectedIntegrationsItem);
    this.unparsed |= detectedIntegrationsItem.unparsed;
    return this;
  }

  /**
   * <p>List of detected integrations.</p>
   * @return detectedIntegrations
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DETECTED_INTEGRATIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<FleetDetectedIntegration> getDetectedIntegrations() {
        return detectedIntegrations;
      }
  public void setDetectedIntegrations(List<FleetDetectedIntegration> detectedIntegrations) {
    this.detectedIntegrations = detectedIntegrations;
  }
  public FleetAgentInfoAttributes integrations(FleetIntegrationsByStatus integrations) {
    this.integrations = integrations;
    this.unparsed |= integrations.unparsed;
    return this;
  }

  /**
   * <p>Integrations organized by their status.</p>
   * @return integrations
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INTEGRATIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public FleetIntegrationsByStatus getIntegrations() {
        return integrations;
      }
  public void setIntegrations(FleetIntegrationsByStatus integrations) {
    this.integrations = integrations;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return FleetAgentInfoAttributes
   */
  @JsonAnySetter
  public FleetAgentInfoAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this FleetAgentInfoAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetAgentInfoAttributes fleetAgentInfoAttributes = (FleetAgentInfoAttributes) o;
    return Objects.equals(this.agentInfos, fleetAgentInfoAttributes.agentInfos) && Objects.equals(this.configurationFiles, fleetAgentInfoAttributes.configurationFiles) && Objects.equals(this.detectedIntegrations, fleetAgentInfoAttributes.detectedIntegrations) && Objects.equals(this.integrations, fleetAgentInfoAttributes.integrations) && Objects.equals(this.additionalProperties, fleetAgentInfoAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(agentInfos,configurationFiles,detectedIntegrations,integrations, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetAgentInfoAttributes {\n");
    sb.append("    agentInfos: ").append(toIndentedString(agentInfos)).append("\n");
    sb.append("    configurationFiles: ").append(toIndentedString(configurationFiles)).append("\n");
    sb.append("    detectedIntegrations: ").append(toIndentedString(detectedIntegrations)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
