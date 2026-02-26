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

/** Integrations organized by their status. */
@JsonPropertyOrder({
  FleetIntegrationsByStatus.JSON_PROPERTY_CONFIGURATION_FILES,
  FleetIntegrationsByStatus.JSON_PROPERTY_DATADOG_AGENT_KEY,
  FleetIntegrationsByStatus.JSON_PROPERTY_ERROR_INTEGRATIONS,
  FleetIntegrationsByStatus.JSON_PROPERTY_MISSING_INTEGRATIONS,
  FleetIntegrationsByStatus.JSON_PROPERTY_WARNING_INTEGRATIONS,
  FleetIntegrationsByStatus.JSON_PROPERTY_WORKING_INTEGRATIONS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetIntegrationsByStatus {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIGURATION_FILES = "configuration_files";
  private List<FleetConfigurationFile> configurationFiles = null;

  public static final String JSON_PROPERTY_DATADOG_AGENT_KEY = "datadog_agent_key";
  private String datadogAgentKey;

  public static final String JSON_PROPERTY_ERROR_INTEGRATIONS = "error_integrations";
  private List<FleetIntegrationDetails> errorIntegrations = null;

  public static final String JSON_PROPERTY_MISSING_INTEGRATIONS = "missing_integrations";
  private List<FleetDetectedIntegration> missingIntegrations = null;

  public static final String JSON_PROPERTY_WARNING_INTEGRATIONS = "warning_integrations";
  private List<FleetIntegrationDetails> warningIntegrations = null;

  public static final String JSON_PROPERTY_WORKING_INTEGRATIONS = "working_integrations";
  private List<FleetIntegrationDetails> workingIntegrations = null;

  public FleetIntegrationsByStatus configurationFiles(
      List<FleetConfigurationFile> configurationFiles) {
    this.configurationFiles = configurationFiles;
    for (FleetConfigurationFile item : configurationFiles) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FleetIntegrationsByStatus addConfigurationFilesItem(
      FleetConfigurationFile configurationFilesItem) {
    if (this.configurationFiles == null) {
      this.configurationFiles = new ArrayList<>();
    }
    this.configurationFiles.add(configurationFilesItem);
    this.unparsed |= configurationFilesItem.unparsed;
    return this;
  }

  /**
   * Configuration files for integrations.
   *
   * @return configurationFiles
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIGURATION_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FleetConfigurationFile> getConfigurationFiles() {
    return configurationFiles;
  }

  public void setConfigurationFiles(List<FleetConfigurationFile> configurationFiles) {
    this.configurationFiles = configurationFiles;
  }

  public FleetIntegrationsByStatus datadogAgentKey(String datadogAgentKey) {
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

  public FleetIntegrationsByStatus errorIntegrations(
      List<FleetIntegrationDetails> errorIntegrations) {
    this.errorIntegrations = errorIntegrations;
    for (FleetIntegrationDetails item : errorIntegrations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FleetIntegrationsByStatus addErrorIntegrationsItem(
      FleetIntegrationDetails errorIntegrationsItem) {
    if (this.errorIntegrations == null) {
      this.errorIntegrations = new ArrayList<>();
    }
    this.errorIntegrations.add(errorIntegrationsItem);
    this.unparsed |= errorIntegrationsItem.unparsed;
    return this;
  }

  /**
   * Integrations with errors.
   *
   * @return errorIntegrations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_INTEGRATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FleetIntegrationDetails> getErrorIntegrations() {
    return errorIntegrations;
  }

  public void setErrorIntegrations(List<FleetIntegrationDetails> errorIntegrations) {
    this.errorIntegrations = errorIntegrations;
  }

  public FleetIntegrationsByStatus missingIntegrations(
      List<FleetDetectedIntegration> missingIntegrations) {
    this.missingIntegrations = missingIntegrations;
    for (FleetDetectedIntegration item : missingIntegrations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FleetIntegrationsByStatus addMissingIntegrationsItem(
      FleetDetectedIntegration missingIntegrationsItem) {
    if (this.missingIntegrations == null) {
      this.missingIntegrations = new ArrayList<>();
    }
    this.missingIntegrations.add(missingIntegrationsItem);
    this.unparsed |= missingIntegrationsItem.unparsed;
    return this;
  }

  /**
   * Detected but not configured integrations.
   *
   * @return missingIntegrations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MISSING_INTEGRATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FleetDetectedIntegration> getMissingIntegrations() {
    return missingIntegrations;
  }

  public void setMissingIntegrations(List<FleetDetectedIntegration> missingIntegrations) {
    this.missingIntegrations = missingIntegrations;
  }

  public FleetIntegrationsByStatus warningIntegrations(
      List<FleetIntegrationDetails> warningIntegrations) {
    this.warningIntegrations = warningIntegrations;
    for (FleetIntegrationDetails item : warningIntegrations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FleetIntegrationsByStatus addWarningIntegrationsItem(
      FleetIntegrationDetails warningIntegrationsItem) {
    if (this.warningIntegrations == null) {
      this.warningIntegrations = new ArrayList<>();
    }
    this.warningIntegrations.add(warningIntegrationsItem);
    this.unparsed |= warningIntegrationsItem.unparsed;
    return this;
  }

  /**
   * Integrations with warnings.
   *
   * @return warningIntegrations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARNING_INTEGRATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FleetIntegrationDetails> getWarningIntegrations() {
    return warningIntegrations;
  }

  public void setWarningIntegrations(List<FleetIntegrationDetails> warningIntegrations) {
    this.warningIntegrations = warningIntegrations;
  }

  public FleetIntegrationsByStatus workingIntegrations(
      List<FleetIntegrationDetails> workingIntegrations) {
    this.workingIntegrations = workingIntegrations;
    for (FleetIntegrationDetails item : workingIntegrations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FleetIntegrationsByStatus addWorkingIntegrationsItem(
      FleetIntegrationDetails workingIntegrationsItem) {
    if (this.workingIntegrations == null) {
      this.workingIntegrations = new ArrayList<>();
    }
    this.workingIntegrations.add(workingIntegrationsItem);
    this.unparsed |= workingIntegrationsItem.unparsed;
    return this;
  }

  /**
   * Integrations that are working correctly.
   *
   * @return workingIntegrations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKING_INTEGRATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FleetIntegrationDetails> getWorkingIntegrations() {
    return workingIntegrations;
  }

  public void setWorkingIntegrations(List<FleetIntegrationDetails> workingIntegrations) {
    this.workingIntegrations = workingIntegrations;
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
   * @return FleetIntegrationsByStatus
   */
  @JsonAnySetter
  public FleetIntegrationsByStatus putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetIntegrationsByStatus object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetIntegrationsByStatus fleetIntegrationsByStatus = (FleetIntegrationsByStatus) o;
    return Objects.equals(this.configurationFiles, fleetIntegrationsByStatus.configurationFiles)
        && Objects.equals(this.datadogAgentKey, fleetIntegrationsByStatus.datadogAgentKey)
        && Objects.equals(this.errorIntegrations, fleetIntegrationsByStatus.errorIntegrations)
        && Objects.equals(this.missingIntegrations, fleetIntegrationsByStatus.missingIntegrations)
        && Objects.equals(this.warningIntegrations, fleetIntegrationsByStatus.warningIntegrations)
        && Objects.equals(this.workingIntegrations, fleetIntegrationsByStatus.workingIntegrations)
        && Objects.equals(
            this.additionalProperties, fleetIntegrationsByStatus.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        configurationFiles,
        datadogAgentKey,
        errorIntegrations,
        missingIntegrations,
        warningIntegrations,
        workingIntegrations,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetIntegrationsByStatus {\n");
    sb.append("    configurationFiles: ").append(toIndentedString(configurationFiles)).append("\n");
    sb.append("    datadogAgentKey: ").append(toIndentedString(datadogAgentKey)).append("\n");
    sb.append("    errorIntegrations: ").append(toIndentedString(errorIntegrations)).append("\n");
    sb.append("    missingIntegrations: ")
        .append(toIndentedString(missingIntegrations))
        .append("\n");
    sb.append("    warningIntegrations: ")
        .append(toIndentedString(warningIntegrations))
        .append("\n");
    sb.append("    workingIntegrations: ")
        .append(toIndentedString(workingIntegrations))
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
