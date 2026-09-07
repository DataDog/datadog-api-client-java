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
   * <p>Integrations organized by their status.</p>
 */
@JsonPropertyOrder({
  FleetIntegrationsByStatusV2.JSON_PROPERTY_CONFIGURATION_FILES,
  FleetIntegrationsByStatusV2.JSON_PROPERTY_ERROR_INTEGRATIONS,
  FleetIntegrationsByStatusV2.JSON_PROPERTY_MISSING_INTEGRATIONS,
  FleetIntegrationsByStatusV2.JSON_PROPERTY_WARNING_INTEGRATIONS,
  FleetIntegrationsByStatusV2.JSON_PROPERTY_WORKING_INTEGRATIONS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetIntegrationsByStatusV2 {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIGURATION_FILES = "configuration_files";
  private List<FleetConfigurationFileV2> configurationFiles = null;

  public static final String JSON_PROPERTY_ERROR_INTEGRATIONS = "error_integrations";
  private List<FleetIntegrationDetailsV2> errorIntegrations = null;

  public static final String JSON_PROPERTY_MISSING_INTEGRATIONS = "missing_integrations";
  private List<FleetDetectedIntegration> missingIntegrations = null;

  public static final String JSON_PROPERTY_WARNING_INTEGRATIONS = "warning_integrations";
  private List<FleetIntegrationDetailsV2> warningIntegrations = null;

  public static final String JSON_PROPERTY_WORKING_INTEGRATIONS = "working_integrations";
  private List<FleetIntegrationDetailsV2> workingIntegrations = null;

  public FleetIntegrationsByStatusV2 configurationFiles(List<FleetConfigurationFileV2> configurationFiles) {
    this.configurationFiles = configurationFiles;
    if (configurationFiles != null) {
    for (FleetConfigurationFileV2 item : configurationFiles) {
      this.unparsed |= item.unparsed;
    }
    }
    return this;
  }
  public FleetIntegrationsByStatusV2 addConfigurationFilesItem(FleetConfigurationFileV2 configurationFilesItem) {
    if (this.configurationFiles == null) {
      this.configurationFiles = new ArrayList<>();
    }
    this.configurationFiles.add(configurationFilesItem);
    this.unparsed |= configurationFilesItem.unparsed;
    return this;
  }

  /**
   * <p>Configuration files for integrations.</p>
   * @return configurationFiles
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONFIGURATION_FILES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<FleetConfigurationFileV2> getConfigurationFiles() {
        return configurationFiles;
      }
  public void setConfigurationFiles(List<FleetConfigurationFileV2> configurationFiles) {
    this.configurationFiles = configurationFiles;
    if (configurationFiles != null) {
      for (FleetConfigurationFileV2 item : configurationFiles) {
        this.unparsed |= item.unparsed;
      }
    }
  }
  public FleetIntegrationsByStatusV2 errorIntegrations(List<FleetIntegrationDetailsV2> errorIntegrations) {
    this.errorIntegrations = errorIntegrations;
    if (errorIntegrations != null) {
    for (FleetIntegrationDetailsV2 item : errorIntegrations) {
      this.unparsed |= item.unparsed;
    }
    }
    return this;
  }
  public FleetIntegrationsByStatusV2 addErrorIntegrationsItem(FleetIntegrationDetailsV2 errorIntegrationsItem) {
    if (this.errorIntegrations == null) {
      this.errorIntegrations = new ArrayList<>();
    }
    this.errorIntegrations.add(errorIntegrationsItem);
    this.unparsed |= errorIntegrationsItem.unparsed;
    return this;
  }

  /**
   * <p>Integrations with errors.</p>
   * @return errorIntegrations
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ERROR_INTEGRATIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<FleetIntegrationDetailsV2> getErrorIntegrations() {
        return errorIntegrations;
      }
  public void setErrorIntegrations(List<FleetIntegrationDetailsV2> errorIntegrations) {
    this.errorIntegrations = errorIntegrations;
    if (errorIntegrations != null) {
      for (FleetIntegrationDetailsV2 item : errorIntegrations) {
        this.unparsed |= item.unparsed;
      }
    }
  }
  public FleetIntegrationsByStatusV2 missingIntegrations(List<FleetDetectedIntegration> missingIntegrations) {
    this.missingIntegrations = missingIntegrations;
    if (missingIntegrations != null) {
    for (FleetDetectedIntegration item : missingIntegrations) {
      this.unparsed |= item.unparsed;
    }
    }
    return this;
  }
  public FleetIntegrationsByStatusV2 addMissingIntegrationsItem(FleetDetectedIntegration missingIntegrationsItem) {
    if (this.missingIntegrations == null) {
      this.missingIntegrations = new ArrayList<>();
    }
    this.missingIntegrations.add(missingIntegrationsItem);
    this.unparsed |= missingIntegrationsItem.unparsed;
    return this;
  }

  /**
   * <p>Detected but not configured integrations.</p>
   * @return missingIntegrations
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MISSING_INTEGRATIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<FleetDetectedIntegration> getMissingIntegrations() {
        return missingIntegrations;
      }
  public void setMissingIntegrations(List<FleetDetectedIntegration> missingIntegrations) {
    this.missingIntegrations = missingIntegrations;
    if (missingIntegrations != null) {
      for (FleetDetectedIntegration item : missingIntegrations) {
        this.unparsed |= item.unparsed;
      }
    }
  }
  public FleetIntegrationsByStatusV2 warningIntegrations(List<FleetIntegrationDetailsV2> warningIntegrations) {
    this.warningIntegrations = warningIntegrations;
    if (warningIntegrations != null) {
    for (FleetIntegrationDetailsV2 item : warningIntegrations) {
      this.unparsed |= item.unparsed;
    }
    }
    return this;
  }
  public FleetIntegrationsByStatusV2 addWarningIntegrationsItem(FleetIntegrationDetailsV2 warningIntegrationsItem) {
    if (this.warningIntegrations == null) {
      this.warningIntegrations = new ArrayList<>();
    }
    this.warningIntegrations.add(warningIntegrationsItem);
    this.unparsed |= warningIntegrationsItem.unparsed;
    return this;
  }

  /**
   * <p>Integrations with warnings.</p>
   * @return warningIntegrations
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_WARNING_INTEGRATIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<FleetIntegrationDetailsV2> getWarningIntegrations() {
        return warningIntegrations;
      }
  public void setWarningIntegrations(List<FleetIntegrationDetailsV2> warningIntegrations) {
    this.warningIntegrations = warningIntegrations;
    if (warningIntegrations != null) {
      for (FleetIntegrationDetailsV2 item : warningIntegrations) {
        this.unparsed |= item.unparsed;
      }
    }
  }
  public FleetIntegrationsByStatusV2 workingIntegrations(List<FleetIntegrationDetailsV2> workingIntegrations) {
    this.workingIntegrations = workingIntegrations;
    if (workingIntegrations != null) {
    for (FleetIntegrationDetailsV2 item : workingIntegrations) {
      this.unparsed |= item.unparsed;
    }
    }
    return this;
  }
  public FleetIntegrationsByStatusV2 addWorkingIntegrationsItem(FleetIntegrationDetailsV2 workingIntegrationsItem) {
    if (this.workingIntegrations == null) {
      this.workingIntegrations = new ArrayList<>();
    }
    this.workingIntegrations.add(workingIntegrationsItem);
    this.unparsed |= workingIntegrationsItem.unparsed;
    return this;
  }

  /**
   * <p>Integrations that are working correctly.</p>
   * @return workingIntegrations
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_WORKING_INTEGRATIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<FleetIntegrationDetailsV2> getWorkingIntegrations() {
        return workingIntegrations;
      }
  public void setWorkingIntegrations(List<FleetIntegrationDetailsV2> workingIntegrations) {
    this.workingIntegrations = workingIntegrations;
    if (workingIntegrations != null) {
      for (FleetIntegrationDetailsV2 item : workingIntegrations) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return FleetIntegrationsByStatusV2
   */
  @JsonAnySetter
  public FleetIntegrationsByStatusV2 putAdditionalProperty(String key, Object value) {
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
   * Return true if this FleetIntegrationsByStatusV2 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetIntegrationsByStatusV2 fleetIntegrationsByStatusV2 = (FleetIntegrationsByStatusV2) o;
    return Objects.equals(this.configurationFiles, fleetIntegrationsByStatusV2.configurationFiles) && Objects.equals(this.errorIntegrations, fleetIntegrationsByStatusV2.errorIntegrations) && Objects.equals(this.missingIntegrations, fleetIntegrationsByStatusV2.missingIntegrations) && Objects.equals(this.warningIntegrations, fleetIntegrationsByStatusV2.warningIntegrations) && Objects.equals(this.workingIntegrations, fleetIntegrationsByStatusV2.workingIntegrations) && Objects.equals(this.additionalProperties, fleetIntegrationsByStatusV2.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(configurationFiles,errorIntegrations,missingIntegrations,warningIntegrations,workingIntegrations, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetIntegrationsByStatusV2 {\n");
    sb.append("    configurationFiles: ").append(toIndentedString(configurationFiles)).append("\n");
    sb.append("    errorIntegrations: ").append(toIndentedString(errorIntegrations)).append("\n");
    sb.append("    missingIntegrations: ").append(toIndentedString(missingIntegrations)).append("\n");
    sb.append("    warningIntegrations: ").append(toIndentedString(warningIntegrations)).append("\n");
    sb.append("    workingIntegrations: ").append(toIndentedString(workingIntegrations)).append("\n");
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
