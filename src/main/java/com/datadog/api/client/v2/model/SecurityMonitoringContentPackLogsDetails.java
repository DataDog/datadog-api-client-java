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

/** Details for a logs-based content pack. */
@JsonPropertyOrder({
  SecurityMonitoringContentPackLogsDetails.JSON_PROPERTY_CP_ACTIVATION,
  SecurityMonitoringContentPackLogsDetails.JSON_PROPERTY_DATA_LAST_SEEN,
  SecurityMonitoringContentPackLogsDetails.JSON_PROPERTY_FILTERS_CONFIGURED,
  SecurityMonitoringContentPackLogsDetails.JSON_PROPERTY_INTEGRATION_INSTALLED_STATUS,
  SecurityMonitoringContentPackLogsDetails.JSON_PROPERTY_LOGS_SEEN_FROM_ANY_INDEX,
  SecurityMonitoringContentPackLogsDetails.JSON_PROPERTY_SIEM_INDEX_INCORRECT,
  SecurityMonitoringContentPackLogsDetails.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringContentPackLogsDetails {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CP_ACTIVATION = "cp_activation";
  private SecurityMonitoringContentPackActivation cpActivation;

  public static final String JSON_PROPERTY_DATA_LAST_SEEN = "data_last_seen";
  private SecurityMonitoringContentPackTimestampBucket dataLastSeen;

  public static final String JSON_PROPERTY_FILTERS_CONFIGURED = "filters_configured";
  private Boolean filtersConfigured;

  public static final String JSON_PROPERTY_INTEGRATION_INSTALLED_STATUS =
      "integration_installed_status";
  private SecurityMonitoringContentPackIntegrationStatus integrationInstalledStatus;

  public static final String JSON_PROPERTY_LOGS_SEEN_FROM_ANY_INDEX = "logs_seen_from_any_index";
  private Boolean logsSeenFromAnyIndex;

  public static final String JSON_PROPERTY_SIEM_INDEX_INCORRECT = "siem_index_incorrect";
  private Boolean siemIndexIncorrect;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SecurityFilterFilteredDataType type;

  public SecurityMonitoringContentPackLogsDetails() {}

  @JsonCreator
  public SecurityMonitoringContentPackLogsDetails(
      @JsonProperty(required = true, value = JSON_PROPERTY_CP_ACTIVATION)
          SecurityMonitoringContentPackActivation cpActivation,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_LAST_SEEN)
          SecurityMonitoringContentPackTimestampBucket dataLastSeen,
      @JsonProperty(required = true, value = JSON_PROPERTY_FILTERS_CONFIGURED)
          Boolean filtersConfigured,
      @JsonProperty(required = true, value = JSON_PROPERTY_INTEGRATION_INSTALLED_STATUS)
          SecurityMonitoringContentPackIntegrationStatus integrationInstalledStatus,
      @JsonProperty(required = true, value = JSON_PROPERTY_LOGS_SEEN_FROM_ANY_INDEX)
          Boolean logsSeenFromAnyIndex,
      @JsonProperty(required = true, value = JSON_PROPERTY_SIEM_INDEX_INCORRECT)
          Boolean siemIndexIncorrect,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          SecurityFilterFilteredDataType type) {
    this.cpActivation = cpActivation;
    this.unparsed |= !cpActivation.isValid();
    this.dataLastSeen = dataLastSeen;
    this.unparsed |= !dataLastSeen.isValid();
    this.filtersConfigured = filtersConfigured;
    this.integrationInstalledStatus = integrationInstalledStatus;
    this.unparsed |= !integrationInstalledStatus.isValid();
    this.logsSeenFromAnyIndex = logsSeenFromAnyIndex;
    this.siemIndexIncorrect = siemIndexIncorrect;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SecurityMonitoringContentPackLogsDetails cpActivation(
      SecurityMonitoringContentPackActivation cpActivation) {
    this.cpActivation = cpActivation;
    this.unparsed |= !cpActivation.isValid();
    return this;
  }

  /**
   * The activation status of a content pack.
   *
   * @return cpActivation
   */
  @JsonProperty(JSON_PROPERTY_CP_ACTIVATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringContentPackActivation getCpActivation() {
    return cpActivation;
  }

  public void setCpActivation(SecurityMonitoringContentPackActivation cpActivation) {
    if (!cpActivation.isValid()) {
      this.unparsed = true;
    }
    this.cpActivation = cpActivation;
  }

  public SecurityMonitoringContentPackLogsDetails dataLastSeen(
      SecurityMonitoringContentPackTimestampBucket dataLastSeen) {
    this.dataLastSeen = dataLastSeen;
    this.unparsed |= !dataLastSeen.isValid();
    return this;
  }

  /**
   * Timestamp bucket indicating when logs were last collected.
   *
   * @return dataLastSeen
   */
  @JsonProperty(JSON_PROPERTY_DATA_LAST_SEEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringContentPackTimestampBucket getDataLastSeen() {
    return dataLastSeen;
  }

  public void setDataLastSeen(SecurityMonitoringContentPackTimestampBucket dataLastSeen) {
    if (!dataLastSeen.isValid()) {
      this.unparsed = true;
    }
    this.dataLastSeen = dataLastSeen;
  }

  public SecurityMonitoringContentPackLogsDetails filtersConfigured(Boolean filtersConfigured) {
    this.filtersConfigured = filtersConfigured;
    return this;
  }

  /**
   * Whether filters (Security Filters or Index Query depending on the pricing model) are present
   * and correctly configured to route logs into Cloud SIEM.
   *
   * @return filtersConfigured
   */
  @JsonProperty(JSON_PROPERTY_FILTERS_CONFIGURED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getFiltersConfigured() {
    return filtersConfigured;
  }

  public void setFiltersConfigured(Boolean filtersConfigured) {
    this.filtersConfigured = filtersConfigured;
  }

  public SecurityMonitoringContentPackLogsDetails integrationInstalledStatus(
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
  @JsonProperty(JSON_PROPERTY_INTEGRATION_INSTALLED_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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

  public SecurityMonitoringContentPackLogsDetails logsSeenFromAnyIndex(
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

  public SecurityMonitoringContentPackLogsDetails siemIndexIncorrect(Boolean siemIndexIncorrect) {
    this.siemIndexIncorrect = siemIndexIncorrect;
    return this;
  }

  /**
   * Whether the Cloud SIEM index configuration is incorrect (only applies to certain pricing
   * models).
   *
   * @return siemIndexIncorrect
   */
  @JsonProperty(JSON_PROPERTY_SIEM_INDEX_INCORRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getSiemIndexIncorrect() {
    return siemIndexIncorrect;
  }

  public void setSiemIndexIncorrect(Boolean siemIndexIncorrect) {
    this.siemIndexIncorrect = siemIndexIncorrect;
  }

  public SecurityMonitoringContentPackLogsDetails type(SecurityFilterFilteredDataType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The filtered data type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityFilterFilteredDataType getType() {
    return type;
  }

  public void setType(SecurityFilterFilteredDataType type) {
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
   * @return SecurityMonitoringContentPackLogsDetails
   */
  @JsonAnySetter
  public SecurityMonitoringContentPackLogsDetails putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityMonitoringContentPackLogsDetails object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringContentPackLogsDetails securityMonitoringContentPackLogsDetails =
        (SecurityMonitoringContentPackLogsDetails) o;
    return Objects.equals(this.cpActivation, securityMonitoringContentPackLogsDetails.cpActivation)
        && Objects.equals(this.dataLastSeen, securityMonitoringContentPackLogsDetails.dataLastSeen)
        && Objects.equals(
            this.filtersConfigured, securityMonitoringContentPackLogsDetails.filtersConfigured)
        && Objects.equals(
            this.integrationInstalledStatus,
            securityMonitoringContentPackLogsDetails.integrationInstalledStatus)
        && Objects.equals(
            this.logsSeenFromAnyIndex,
            securityMonitoringContentPackLogsDetails.logsSeenFromAnyIndex)
        && Objects.equals(
            this.siemIndexIncorrect, securityMonitoringContentPackLogsDetails.siemIndexIncorrect)
        && Objects.equals(this.type, securityMonitoringContentPackLogsDetails.type)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringContentPackLogsDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cpActivation,
        dataLastSeen,
        filtersConfigured,
        integrationInstalledStatus,
        logsSeenFromAnyIndex,
        siemIndexIncorrect,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringContentPackLogsDetails {\n");
    sb.append("    cpActivation: ").append(toIndentedString(cpActivation)).append("\n");
    sb.append("    dataLastSeen: ").append(toIndentedString(dataLastSeen)).append("\n");
    sb.append("    filtersConfigured: ").append(toIndentedString(filtersConfigured)).append("\n");
    sb.append("    integrationInstalledStatus: ")
        .append(toIndentedString(integrationInstalledStatus))
        .append("\n");
    sb.append("    logsSeenFromAnyIndex: ")
        .append(toIndentedString(logsSeenFromAnyIndex))
        .append("\n");
    sb.append("    siemIndexIncorrect: ").append(toIndentedString(siemIndexIncorrect)).append("\n");
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
