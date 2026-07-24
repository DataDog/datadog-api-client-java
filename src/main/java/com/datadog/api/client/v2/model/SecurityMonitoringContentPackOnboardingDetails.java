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

/** Content pack details returned when Cloud SIEM is inactive for the requesting organization. */
@JsonPropertyOrder({
  SecurityMonitoringContentPackOnboardingDetails.JSON_PROPERTY_INTEGRATION_INSTALLED_STATUS,
  SecurityMonitoringContentPackOnboardingDetails.JSON_PROPERTY_LOGS_SEEN_FROM_ANY_INDEX,
  SecurityMonitoringContentPackOnboardingDetails.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringContentPackOnboardingDetails {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INTEGRATION_INSTALLED_STATUS =
      "integration_installed_status";
  private SecurityMonitoringContentPackIntegrationStatus integrationInstalledStatus;

  public static final String JSON_PROPERTY_LOGS_SEEN_FROM_ANY_INDEX = "logs_seen_from_any_index";
  private Boolean logsSeenFromAnyIndex;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SecurityMonitoringContentPackOnboardingDetailsType type;

  public SecurityMonitoringContentPackOnboardingDetails() {}

  @JsonCreator
  public SecurityMonitoringContentPackOnboardingDetails(
      @JsonProperty(required = true, value = JSON_PROPERTY_LOGS_SEEN_FROM_ANY_INDEX)
          Boolean logsSeenFromAnyIndex,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          SecurityMonitoringContentPackOnboardingDetailsType type) {
    this.logsSeenFromAnyIndex = logsSeenFromAnyIndex;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SecurityMonitoringContentPackOnboardingDetails integrationInstalledStatus(
      SecurityMonitoringContentPackIntegrationStatus integrationInstalledStatus) {
    this.integrationInstalledStatus = integrationInstalledStatus;
    this.unparsed |= !integrationInstalledStatus.isValid();
    return this;
  }

  /**
   * The installation status of the related integration.
   *
   * @return integrationInstalledStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_INSTALLED_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringContentPackIntegrationStatus getIntegrationInstalledStatus() {
    return integrationInstalledStatus;
  }

  public void setIntegrationInstalledStatus(
      SecurityMonitoringContentPackIntegrationStatus integrationInstalledStatus) {
    if (!integrationInstalledStatus.isValid()) {
      this.unparsed = true;
    }
    this.integrationInstalledStatus = integrationInstalledStatus;
  }

  public SecurityMonitoringContentPackOnboardingDetails logsSeenFromAnyIndex(
      Boolean logsSeenFromAnyIndex) {
    this.logsSeenFromAnyIndex = logsSeenFromAnyIndex;
    return this;
  }

  /**
   * Whether logs for this content pack have been seen in any Datadog index in the last 72 hours.
   *
   * @return logsSeenFromAnyIndex
   */
  @JsonProperty(JSON_PROPERTY_LOGS_SEEN_FROM_ANY_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getLogsSeenFromAnyIndex() {
    return logsSeenFromAnyIndex;
  }

  public void setLogsSeenFromAnyIndex(Boolean logsSeenFromAnyIndex) {
    this.logsSeenFromAnyIndex = logsSeenFromAnyIndex;
  }

  public SecurityMonitoringContentPackOnboardingDetails type(
      SecurityMonitoringContentPackOnboardingDetailsType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type for onboarding content pack details.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringContentPackOnboardingDetailsType getType() {
    return type;
  }

  public void setType(SecurityMonitoringContentPackOnboardingDetailsType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return SecurityMonitoringContentPackOnboardingDetails
   */
  @JsonAnySetter
  public SecurityMonitoringContentPackOnboardingDetails putAdditionalProperty(
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

  /** Return true if this SecurityMonitoringContentPackOnboardingDetails object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringContentPackOnboardingDetails securityMonitoringContentPackOnboardingDetails =
        (SecurityMonitoringContentPackOnboardingDetails) o;
    return Objects.equals(
            this.integrationInstalledStatus,
            securityMonitoringContentPackOnboardingDetails.integrationInstalledStatus)
        && Objects.equals(
            this.logsSeenFromAnyIndex,
            securityMonitoringContentPackOnboardingDetails.logsSeenFromAnyIndex)
        && Objects.equals(this.type, securityMonitoringContentPackOnboardingDetails.type)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringContentPackOnboardingDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        integrationInstalledStatus, logsSeenFromAnyIndex, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringContentPackOnboardingDetails {\n");
    sb.append("    integrationInstalledStatus: ")
        .append(toIndentedString(integrationInstalledStatus))
        .append("\n");
    sb.append("    logsSeenFromAnyIndex: ")
        .append(toIndentedString(logsSeenFromAnyIndex))
        .append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
