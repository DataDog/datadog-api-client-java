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
   * <p>Attributes of a content pack state</p>
 */
@JsonPropertyOrder({
  SecurityMonitoringContentPackStateAttributes.JSON_PROPERTY_CLOUD_SIEM_INDEX_INCORRECT,
  SecurityMonitoringContentPackStateAttributes.JSON_PROPERTY_CP_ACTIVATION,
  SecurityMonitoringContentPackStateAttributes.JSON_PROPERTY_FILTERS_CONFIGURED_FOR_LOGS,
  SecurityMonitoringContentPackStateAttributes.JSON_PROPERTY_INTEGRATION_INSTALLED_STATUS,
  SecurityMonitoringContentPackStateAttributes.JSON_PROPERTY_LOGS_LAST_COLLECTED,
  SecurityMonitoringContentPackStateAttributes.JSON_PROPERTY_LOGS_SEEN_FROM_ANY_INDEX,
  SecurityMonitoringContentPackStateAttributes.JSON_PROPERTY_STATE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringContentPackStateAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLOUD_SIEM_INDEX_INCORRECT = "cloud_siem_index_incorrect";
  private Boolean cloudSiemIndexIncorrect;

  public static final String JSON_PROPERTY_CP_ACTIVATION = "cp_activation";
  private SecurityMonitoringContentPackActivation cpActivation;

  public static final String JSON_PROPERTY_FILTERS_CONFIGURED_FOR_LOGS = "filters_configured_for_logs";
  private Boolean filtersConfiguredForLogs;

  public static final String JSON_PROPERTY_INTEGRATION_INSTALLED_STATUS = "integration_installed_status";
  private SecurityMonitoringContentPackIntegrationStatus integrationInstalledStatus;

  public static final String JSON_PROPERTY_LOGS_LAST_COLLECTED = "logs_last_collected";
  private SecurityMonitoringContentPackTimestampBucket logsLastCollected;

  public static final String JSON_PROPERTY_LOGS_SEEN_FROM_ANY_INDEX = "logs_seen_from_any_index";
  private Boolean logsSeenFromAnyIndex;

  public static final String JSON_PROPERTY_STATE = "state";
  private SecurityMonitoringContentPackStatus state;

  public SecurityMonitoringContentPackStateAttributes() {}

  @JsonCreator
  public SecurityMonitoringContentPackStateAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_CLOUD_SIEM_INDEX_INCORRECT)Boolean cloudSiemIndexIncorrect,
            @JsonProperty(required=true, value=JSON_PROPERTY_CP_ACTIVATION)SecurityMonitoringContentPackActivation cpActivation,
            @JsonProperty(required=true, value=JSON_PROPERTY_FILTERS_CONFIGURED_FOR_LOGS)Boolean filtersConfiguredForLogs,
            @JsonProperty(required=true, value=JSON_PROPERTY_LOGS_LAST_COLLECTED)SecurityMonitoringContentPackTimestampBucket logsLastCollected,
            @JsonProperty(required=true, value=JSON_PROPERTY_LOGS_SEEN_FROM_ANY_INDEX)Boolean logsSeenFromAnyIndex,
            @JsonProperty(required=true, value=JSON_PROPERTY_STATE)SecurityMonitoringContentPackStatus state) {
        this.cloudSiemIndexIncorrect = cloudSiemIndexIncorrect;
        this.cpActivation = cpActivation;
        this.unparsed |= !cpActivation.isValid();
        this.filtersConfiguredForLogs = filtersConfiguredForLogs;
        this.logsLastCollected = logsLastCollected;
        this.unparsed |= !logsLastCollected.isValid();
        this.logsSeenFromAnyIndex = logsSeenFromAnyIndex;
        this.state = state;
        this.unparsed |= !state.isValid();
  }
  public SecurityMonitoringContentPackStateAttributes cloudSiemIndexIncorrect(Boolean cloudSiemIndexIncorrect) {
    this.cloudSiemIndexIncorrect = cloudSiemIndexIncorrect;
    return this;
  }

  /**
   * <p>Whether the cloud SIEM index configuration is incorrect (only applies to certain pricing models)</p>
   * @return cloudSiemIndexIncorrect
  **/
      @JsonProperty(JSON_PROPERTY_CLOUD_SIEM_INDEX_INCORRECT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getCloudSiemIndexIncorrect() {
        return cloudSiemIndexIncorrect;
      }
  public void setCloudSiemIndexIncorrect(Boolean cloudSiemIndexIncorrect) {
    this.cloudSiemIndexIncorrect = cloudSiemIndexIncorrect;
  }
  public SecurityMonitoringContentPackStateAttributes cpActivation(SecurityMonitoringContentPackActivation cpActivation) {
    this.cpActivation = cpActivation;
    this.unparsed |= !cpActivation.isValid();
    return this;
  }

  /**
   * <p>The activation status of a content pack</p>
   * @return cpActivation
  **/
      @JsonProperty(JSON_PROPERTY_CP_ACTIVATION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SecurityMonitoringContentPackActivation getCpActivation() {
        return cpActivation;
      }
  public void setCpActivation(SecurityMonitoringContentPackActivation cpActivation) {
    if (!cpActivation.isValid()) {
        this.unparsed = true;
    }
    this.cpActivation = cpActivation;
  }
  public SecurityMonitoringContentPackStateAttributes filtersConfiguredForLogs(Boolean filtersConfiguredForLogs) {
    this.filtersConfiguredForLogs = filtersConfiguredForLogs;
    return this;
  }

  /**
   * <p>Whether filters (Security Filters or Index Query depending on the pricing model) are configured for logs</p>
   * @return filtersConfiguredForLogs
  **/
      @JsonProperty(JSON_PROPERTY_FILTERS_CONFIGURED_FOR_LOGS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getFiltersConfiguredForLogs() {
        return filtersConfiguredForLogs;
      }
  public void setFiltersConfiguredForLogs(Boolean filtersConfiguredForLogs) {
    this.filtersConfiguredForLogs = filtersConfiguredForLogs;
  }
  public SecurityMonitoringContentPackStateAttributes integrationInstalledStatus(SecurityMonitoringContentPackIntegrationStatus integrationInstalledStatus) {
    this.integrationInstalledStatus = integrationInstalledStatus;
    this.unparsed |= !integrationInstalledStatus.isValid();
    return this;
  }

  /**
   * <p>The installation status of the related integration</p>
   * @return integrationInstalledStatus
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INTEGRATION_INSTALLED_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SecurityMonitoringContentPackIntegrationStatus getIntegrationInstalledStatus() {
        return integrationInstalledStatus;
      }
  public void setIntegrationInstalledStatus(SecurityMonitoringContentPackIntegrationStatus integrationInstalledStatus) {
    if (!integrationInstalledStatus.isValid()) {
        this.unparsed = true;
    }
    this.integrationInstalledStatus = integrationInstalledStatus;
  }
  public SecurityMonitoringContentPackStateAttributes logsLastCollected(SecurityMonitoringContentPackTimestampBucket logsLastCollected) {
    this.logsLastCollected = logsLastCollected;
    this.unparsed |= !logsLastCollected.isValid();
    return this;
  }

  /**
   * <p>Timestamp bucket indicating when logs were last collected</p>
   * @return logsLastCollected
  **/
      @JsonProperty(JSON_PROPERTY_LOGS_LAST_COLLECTED)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SecurityMonitoringContentPackTimestampBucket getLogsLastCollected() {
        return logsLastCollected;
      }
  public void setLogsLastCollected(SecurityMonitoringContentPackTimestampBucket logsLastCollected) {
    if (!logsLastCollected.isValid()) {
        this.unparsed = true;
    }
    this.logsLastCollected = logsLastCollected;
  }
  public SecurityMonitoringContentPackStateAttributes logsSeenFromAnyIndex(Boolean logsSeenFromAnyIndex) {
    this.logsSeenFromAnyIndex = logsSeenFromAnyIndex;
    return this;
  }

  /**
   * <p>Whether logs have been seen from any index</p>
   * @return logsSeenFromAnyIndex
  **/
      @JsonProperty(JSON_PROPERTY_LOGS_SEEN_FROM_ANY_INDEX)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getLogsSeenFromAnyIndex() {
        return logsSeenFromAnyIndex;
      }
  public void setLogsSeenFromAnyIndex(Boolean logsSeenFromAnyIndex) {
    this.logsSeenFromAnyIndex = logsSeenFromAnyIndex;
  }
  public SecurityMonitoringContentPackStateAttributes state(SecurityMonitoringContentPackStatus state) {
    this.state = state;
    this.unparsed |= !state.isValid();
    return this;
  }

  /**
   * <p>The current status of a content pack</p>
   * @return state
  **/
      @JsonProperty(JSON_PROPERTY_STATE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SecurityMonitoringContentPackStatus getState() {
        return state;
      }
  public void setState(SecurityMonitoringContentPackStatus state) {
    if (!state.isValid()) {
        this.unparsed = true;
    }
    this.state = state;
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
   * @return SecurityMonitoringContentPackStateAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringContentPackStateAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this SecurityMonitoringContentPackStateAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringContentPackStateAttributes securityMonitoringContentPackStateAttributes = (SecurityMonitoringContentPackStateAttributes) o;
    return Objects.equals(this.cloudSiemIndexIncorrect, securityMonitoringContentPackStateAttributes.cloudSiemIndexIncorrect) && Objects.equals(this.cpActivation, securityMonitoringContentPackStateAttributes.cpActivation) && Objects.equals(this.filtersConfiguredForLogs, securityMonitoringContentPackStateAttributes.filtersConfiguredForLogs) && Objects.equals(this.integrationInstalledStatus, securityMonitoringContentPackStateAttributes.integrationInstalledStatus) && Objects.equals(this.logsLastCollected, securityMonitoringContentPackStateAttributes.logsLastCollected) && Objects.equals(this.logsSeenFromAnyIndex, securityMonitoringContentPackStateAttributes.logsSeenFromAnyIndex) && Objects.equals(this.state, securityMonitoringContentPackStateAttributes.state) && Objects.equals(this.additionalProperties, securityMonitoringContentPackStateAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(cloudSiemIndexIncorrect,cpActivation,filtersConfiguredForLogs,integrationInstalledStatus,logsLastCollected,logsSeenFromAnyIndex,state, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringContentPackStateAttributes {\n");
    sb.append("    cloudSiemIndexIncorrect: ").append(toIndentedString(cloudSiemIndexIncorrect)).append("\n");
    sb.append("    cpActivation: ").append(toIndentedString(cpActivation)).append("\n");
    sb.append("    filtersConfiguredForLogs: ").append(toIndentedString(filtersConfiguredForLogs)).append("\n");
    sb.append("    integrationInstalledStatus: ").append(toIndentedString(integrationInstalledStatus)).append("\n");
    sb.append("    logsLastCollected: ").append(toIndentedString(logsLastCollected)).append("\n");
    sb.append("    logsSeenFromAnyIndex: ").append(toIndentedString(logsSeenFromAnyIndex)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
