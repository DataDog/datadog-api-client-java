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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes of an incident configuration in a response. */
@JsonPropertyOrder({
  IncidentConfigurationDataAttributesResponse.JSON_PROPERTY_CREATED_AT,
  IncidentConfigurationDataAttributesResponse.JSON_PROPERTY_EXECUTE_INTEGRATIONS,
  IncidentConfigurationDataAttributesResponse.JSON_PROPERTY_EXECUTE_NOTIFICATION_RULES,
  IncidentConfigurationDataAttributesResponse.JSON_PROPERTY_INCIDENT_ID,
  IncidentConfigurationDataAttributesResponse.JSON_PROPERTY_INCLUDE_IN_ANALYTICS,
  IncidentConfigurationDataAttributesResponse.JSON_PROPERTY_INCLUDE_IN_SEARCH,
  IncidentConfigurationDataAttributesResponse.JSON_PROPERTY_MODIFIED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentConfigurationDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_EXECUTE_INTEGRATIONS = "execute_integrations";
  private Boolean executeIntegrations;

  public static final String JSON_PROPERTY_EXECUTE_NOTIFICATION_RULES =
      "execute_notification_rules";
  private Boolean executeNotificationRules;

  public static final String JSON_PROPERTY_INCIDENT_ID = "incident_id";
  private String incidentId;

  public static final String JSON_PROPERTY_INCLUDE_IN_ANALYTICS = "include_in_analytics";
  private Boolean includeInAnalytics;

  public static final String JSON_PROPERTY_INCLUDE_IN_SEARCH = "include_in_search";
  private Boolean includeInSearch;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public IncidentConfigurationDataAttributesResponse() {}

  @JsonCreator
  public IncidentConfigurationDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCIDENT_ID) String incidentId,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt) {
    this.createdAt = createdAt;
    this.incidentId = incidentId;
    this.modifiedAt = modifiedAt;
  }

  public IncidentConfigurationDataAttributesResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the configuration was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public IncidentConfigurationDataAttributesResponse executeIntegrations(
      Boolean executeIntegrations) {
    this.executeIntegrations = executeIntegrations;
    return this;
  }

  /**
   * Whether integrations are executed for this incident.
   *
   * @return executeIntegrations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXECUTE_INTEGRATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getExecuteIntegrations() {
    return executeIntegrations;
  }

  public void setExecuteIntegrations(Boolean executeIntegrations) {
    this.executeIntegrations = executeIntegrations;
  }

  public IncidentConfigurationDataAttributesResponse executeNotificationRules(
      Boolean executeNotificationRules) {
    this.executeNotificationRules = executeNotificationRules;
    return this;
  }

  /**
   * Whether notification rules are executed for this incident.
   *
   * @return executeNotificationRules
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXECUTE_NOTIFICATION_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getExecuteNotificationRules() {
    return executeNotificationRules;
  }

  public void setExecuteNotificationRules(Boolean executeNotificationRules) {
    this.executeNotificationRules = executeNotificationRules;
  }

  public IncidentConfigurationDataAttributesResponse incidentId(String incidentId) {
    this.incidentId = incidentId;
    return this;
  }

  /**
   * The incident identifier.
   *
   * @return incidentId
   */
  @JsonProperty(JSON_PROPERTY_INCIDENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIncidentId() {
    return incidentId;
  }

  public void setIncidentId(String incidentId) {
    this.incidentId = incidentId;
  }

  public IncidentConfigurationDataAttributesResponse includeInAnalytics(
      Boolean includeInAnalytics) {
    this.includeInAnalytics = includeInAnalytics;
    return this;
  }

  /**
   * Whether this incident is included in analytics.
   *
   * @return includeInAnalytics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_IN_ANALYTICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIncludeInAnalytics() {
    return includeInAnalytics;
  }

  public void setIncludeInAnalytics(Boolean includeInAnalytics) {
    this.includeInAnalytics = includeInAnalytics;
  }

  public IncidentConfigurationDataAttributesResponse includeInSearch(Boolean includeInSearch) {
    this.includeInSearch = includeInSearch;
    return this;
  }

  /**
   * Whether this incident is included in search results.
   *
   * @return includeInSearch
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_IN_SEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIncludeInSearch() {
    return includeInSearch;
  }

  public void setIncludeInSearch(Boolean includeInSearch) {
    this.includeInSearch = includeInSearch;
  }

  public IncidentConfigurationDataAttributesResponse modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Timestamp when the configuration was last modified.
   *
   * @return modifiedAt
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
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
   * @return IncidentConfigurationDataAttributesResponse
   */
  @JsonAnySetter
  public IncidentConfigurationDataAttributesResponse putAdditionalProperty(
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

  /** Return true if this IncidentConfigurationDataAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentConfigurationDataAttributesResponse incidentConfigurationDataAttributesResponse =
        (IncidentConfigurationDataAttributesResponse) o;
    return Objects.equals(this.createdAt, incidentConfigurationDataAttributesResponse.createdAt)
        && Objects.equals(
            this.executeIntegrations,
            incidentConfigurationDataAttributesResponse.executeIntegrations)
        && Objects.equals(
            this.executeNotificationRules,
            incidentConfigurationDataAttributesResponse.executeNotificationRules)
        && Objects.equals(this.incidentId, incidentConfigurationDataAttributesResponse.incidentId)
        && Objects.equals(
            this.includeInAnalytics, incidentConfigurationDataAttributesResponse.includeInAnalytics)
        && Objects.equals(
            this.includeInSearch, incidentConfigurationDataAttributesResponse.includeInSearch)
        && Objects.equals(this.modifiedAt, incidentConfigurationDataAttributesResponse.modifiedAt)
        && Objects.equals(
            this.additionalProperties,
            incidentConfigurationDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        executeIntegrations,
        executeNotificationRules,
        incidentId,
        includeInAnalytics,
        includeInSearch,
        modifiedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentConfigurationDataAttributesResponse {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    executeIntegrations: ")
        .append(toIndentedString(executeIntegrations))
        .append("\n");
    sb.append("    executeNotificationRules: ")
        .append(toIndentedString(executeNotificationRules))
        .append("\n");
    sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
    sb.append("    includeInAnalytics: ").append(toIndentedString(includeInAnalytics)).append("\n");
    sb.append("    includeInSearch: ").append(toIndentedString(includeInSearch)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
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
