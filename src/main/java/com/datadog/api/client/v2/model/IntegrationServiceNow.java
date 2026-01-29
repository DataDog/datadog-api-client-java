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

/** ServiceNow integration settings */
@JsonPropertyOrder({
  IntegrationServiceNow.JSON_PROPERTY_ASSIGNMENT_GROUP,
  IntegrationServiceNow.JSON_PROPERTY_AUTO_CREATION,
  IntegrationServiceNow.JSON_PROPERTY_ENABLED,
  IntegrationServiceNow.JSON_PROPERTY_INSTANCE_NAME,
  IntegrationServiceNow.JSON_PROPERTY_SYNC_CONFIG
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IntegrationServiceNow {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSIGNMENT_GROUP = "assignment_group";
  private String assignmentGroup;

  public static final String JSON_PROPERTY_AUTO_CREATION = "auto_creation";
  private IntegrationServiceNowAutoCreation autoCreation;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_INSTANCE_NAME = "instance_name";
  private String instanceName;

  public static final String JSON_PROPERTY_SYNC_CONFIG = "sync_config";
  private IntegrationServiceNowSyncConfig syncConfig;

  public IntegrationServiceNow assignmentGroup(String assignmentGroup) {
    this.assignmentGroup = assignmentGroup;
    return this;
  }

  /**
   * Assignment group
   *
   * @return assignmentGroup
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAssignmentGroup() {
    return assignmentGroup;
  }

  public void setAssignmentGroup(String assignmentGroup) {
    this.assignmentGroup = assignmentGroup;
  }

  public IntegrationServiceNow autoCreation(IntegrationServiceNowAutoCreation autoCreation) {
    this.autoCreation = autoCreation;
    this.unparsed |= autoCreation.unparsed;
    return this;
  }

  /**
   * GetautoCreation
   *
   * @return autoCreation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_CREATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IntegrationServiceNowAutoCreation getAutoCreation() {
    return autoCreation;
  }

  public void setAutoCreation(IntegrationServiceNowAutoCreation autoCreation) {
    this.autoCreation = autoCreation;
  }

  public IntegrationServiceNow enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether ServiceNow integration is enabled
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

  public IntegrationServiceNow instanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

  /**
   * ServiceNow instance name
   *
   * @return instanceName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTANCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getInstanceName() {
    return instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }

  public IntegrationServiceNow syncConfig(IntegrationServiceNowSyncConfig syncConfig) {
    this.syncConfig = syncConfig;
    this.unparsed |= syncConfig.unparsed;
    return this;
  }

  /**
   * GetsyncConfig
   *
   * @return syncConfig
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNC_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IntegrationServiceNowSyncConfig getSyncConfig() {
    return syncConfig;
  }

  public void setSyncConfig(IntegrationServiceNowSyncConfig syncConfig) {
    this.syncConfig = syncConfig;
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
   * @return IntegrationServiceNow
   */
  @JsonAnySetter
  public IntegrationServiceNow putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IntegrationServiceNow object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationServiceNow integrationServiceNow = (IntegrationServiceNow) o;
    return Objects.equals(this.assignmentGroup, integrationServiceNow.assignmentGroup)
        && Objects.equals(this.autoCreation, integrationServiceNow.autoCreation)
        && Objects.equals(this.enabled, integrationServiceNow.enabled)
        && Objects.equals(this.instanceName, integrationServiceNow.instanceName)
        && Objects.equals(this.syncConfig, integrationServiceNow.syncConfig)
        && Objects.equals(this.additionalProperties, integrationServiceNow.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assignmentGroup, autoCreation, enabled, instanceName, syncConfig, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationServiceNow {\n");
    sb.append("    assignmentGroup: ").append(toIndentedString(assignmentGroup)).append("\n");
    sb.append("    autoCreation: ").append(toIndentedString(autoCreation)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    syncConfig: ").append(toIndentedString(syncConfig)).append("\n");
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
