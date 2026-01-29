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

/** Project settings */
@JsonPropertyOrder({
  ProjectSettings.JSON_PROPERTY_AUTO_CLOSE_INACTIVE_CASES,
  ProjectSettings.JSON_PROPERTY_AUTO_TRANSITION_ASSIGNED_CASES,
  ProjectSettings.JSON_PROPERTY_INTEGRATION_INCIDENT,
  ProjectSettings.JSON_PROPERTY_INTEGRATION_JIRA,
  ProjectSettings.JSON_PROPERTY_INTEGRATION_MONITOR,
  ProjectSettings.JSON_PROPERTY_INTEGRATION_ON_CALL,
  ProjectSettings.JSON_PROPERTY_INTEGRATION_SERVICE_NOW,
  ProjectSettings.JSON_PROPERTY_NOTIFICATION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProjectSettings {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTO_CLOSE_INACTIVE_CASES = "auto_close_inactive_cases";
  private AutoCloseInactiveCases autoCloseInactiveCases;

  public static final String JSON_PROPERTY_AUTO_TRANSITION_ASSIGNED_CASES =
      "auto_transition_assigned_cases";
  private AutoTransitionAssignedCases autoTransitionAssignedCases;

  public static final String JSON_PROPERTY_INTEGRATION_INCIDENT = "integration_incident";
  private IntegrationIncident integrationIncident;

  public static final String JSON_PROPERTY_INTEGRATION_JIRA = "integration_jira";
  private IntegrationJira integrationJira;

  public static final String JSON_PROPERTY_INTEGRATION_MONITOR = "integration_monitor";
  private IntegrationMonitor integrationMonitor;

  public static final String JSON_PROPERTY_INTEGRATION_ON_CALL = "integration_on_call";
  private IntegrationOnCall integrationOnCall;

  public static final String JSON_PROPERTY_INTEGRATION_SERVICE_NOW = "integration_service_now";
  private IntegrationServiceNow integrationServiceNow;

  public static final String JSON_PROPERTY_NOTIFICATION = "notification";
  private ProjectNotificationSettings notification;

  public ProjectSettings autoCloseInactiveCases(AutoCloseInactiveCases autoCloseInactiveCases) {
    this.autoCloseInactiveCases = autoCloseInactiveCases;
    this.unparsed |= autoCloseInactiveCases.unparsed;
    return this;
  }

  /**
   * Auto-close inactive cases settings
   *
   * @return autoCloseInactiveCases
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_CLOSE_INACTIVE_CASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AutoCloseInactiveCases getAutoCloseInactiveCases() {
    return autoCloseInactiveCases;
  }

  public void setAutoCloseInactiveCases(AutoCloseInactiveCases autoCloseInactiveCases) {
    this.autoCloseInactiveCases = autoCloseInactiveCases;
  }

  public ProjectSettings autoTransitionAssignedCases(
      AutoTransitionAssignedCases autoTransitionAssignedCases) {
    this.autoTransitionAssignedCases = autoTransitionAssignedCases;
    this.unparsed |= autoTransitionAssignedCases.unparsed;
    return this;
  }

  /**
   * Auto-transition assigned cases settings
   *
   * @return autoTransitionAssignedCases
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_TRANSITION_ASSIGNED_CASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AutoTransitionAssignedCases getAutoTransitionAssignedCases() {
    return autoTransitionAssignedCases;
  }

  public void setAutoTransitionAssignedCases(
      AutoTransitionAssignedCases autoTransitionAssignedCases) {
    this.autoTransitionAssignedCases = autoTransitionAssignedCases;
  }

  public ProjectSettings integrationIncident(IntegrationIncident integrationIncident) {
    this.integrationIncident = integrationIncident;
    this.unparsed |= integrationIncident.unparsed;
    return this;
  }

  /**
   * Incident integration settings
   *
   * @return integrationIncident
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_INCIDENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IntegrationIncident getIntegrationIncident() {
    return integrationIncident;
  }

  public void setIntegrationIncident(IntegrationIncident integrationIncident) {
    this.integrationIncident = integrationIncident;
  }

  public ProjectSettings integrationJira(IntegrationJira integrationJira) {
    this.integrationJira = integrationJira;
    this.unparsed |= integrationJira.unparsed;
    return this;
  }

  /**
   * Jira integration settings
   *
   * @return integrationJira
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_JIRA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IntegrationJira getIntegrationJira() {
    return integrationJira;
  }

  public void setIntegrationJira(IntegrationJira integrationJira) {
    this.integrationJira = integrationJira;
  }

  public ProjectSettings integrationMonitor(IntegrationMonitor integrationMonitor) {
    this.integrationMonitor = integrationMonitor;
    this.unparsed |= integrationMonitor.unparsed;
    return this;
  }

  /**
   * Monitor integration settings
   *
   * @return integrationMonitor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_MONITOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IntegrationMonitor getIntegrationMonitor() {
    return integrationMonitor;
  }

  public void setIntegrationMonitor(IntegrationMonitor integrationMonitor) {
    this.integrationMonitor = integrationMonitor;
  }

  public ProjectSettings integrationOnCall(IntegrationOnCall integrationOnCall) {
    this.integrationOnCall = integrationOnCall;
    this.unparsed |= integrationOnCall.unparsed;
    return this;
  }

  /**
   * On-Call integration settings
   *
   * @return integrationOnCall
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ON_CALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IntegrationOnCall getIntegrationOnCall() {
    return integrationOnCall;
  }

  public void setIntegrationOnCall(IntegrationOnCall integrationOnCall) {
    this.integrationOnCall = integrationOnCall;
  }

  public ProjectSettings integrationServiceNow(IntegrationServiceNow integrationServiceNow) {
    this.integrationServiceNow = integrationServiceNow;
    this.unparsed |= integrationServiceNow.unparsed;
    return this;
  }

  /**
   * ServiceNow integration settings
   *
   * @return integrationServiceNow
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_SERVICE_NOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IntegrationServiceNow getIntegrationServiceNow() {
    return integrationServiceNow;
  }

  public void setIntegrationServiceNow(IntegrationServiceNow integrationServiceNow) {
    this.integrationServiceNow = integrationServiceNow;
  }

  public ProjectSettings notification(ProjectNotificationSettings notification) {
    this.notification = notification;
    this.unparsed |= notification.unparsed;
    return this;
  }

  /**
   * Project notification settings
   *
   * @return notification
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProjectNotificationSettings getNotification() {
    return notification;
  }

  public void setNotification(ProjectNotificationSettings notification) {
    this.notification = notification;
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
   * @return ProjectSettings
   */
  @JsonAnySetter
  public ProjectSettings putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProjectSettings object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectSettings projectSettings = (ProjectSettings) o;
    return Objects.equals(this.autoCloseInactiveCases, projectSettings.autoCloseInactiveCases)
        && Objects.equals(
            this.autoTransitionAssignedCases, projectSettings.autoTransitionAssignedCases)
        && Objects.equals(this.integrationIncident, projectSettings.integrationIncident)
        && Objects.equals(this.integrationJira, projectSettings.integrationJira)
        && Objects.equals(this.integrationMonitor, projectSettings.integrationMonitor)
        && Objects.equals(this.integrationOnCall, projectSettings.integrationOnCall)
        && Objects.equals(this.integrationServiceNow, projectSettings.integrationServiceNow)
        && Objects.equals(this.notification, projectSettings.notification)
        && Objects.equals(this.additionalProperties, projectSettings.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        autoCloseInactiveCases,
        autoTransitionAssignedCases,
        integrationIncident,
        integrationJira,
        integrationMonitor,
        integrationOnCall,
        integrationServiceNow,
        notification,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectSettings {\n");
    sb.append("    autoCloseInactiveCases: ")
        .append(toIndentedString(autoCloseInactiveCases))
        .append("\n");
    sb.append("    autoTransitionAssignedCases: ")
        .append(toIndentedString(autoTransitionAssignedCases))
        .append("\n");
    sb.append("    integrationIncident: ")
        .append(toIndentedString(integrationIncident))
        .append("\n");
    sb.append("    integrationJira: ").append(toIndentedString(integrationJira)).append("\n");
    sb.append("    integrationMonitor: ").append(toIndentedString(integrationMonitor)).append("\n");
    sb.append("    integrationOnCall: ").append(toIndentedString(integrationOnCall)).append("\n");
    sb.append("    integrationServiceNow: ")
        .append(toIndentedString(integrationServiceNow))
        .append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
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
