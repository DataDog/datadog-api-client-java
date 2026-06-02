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

/** Attributes for creating an incident configuration. */
@JsonPropertyOrder({
  IncidentConfigurationDataAttributesRequest.JSON_PROPERTY_EXECUTE_INTEGRATIONS,
  IncidentConfigurationDataAttributesRequest.JSON_PROPERTY_EXECUTE_NOTIFICATION_RULES,
  IncidentConfigurationDataAttributesRequest.JSON_PROPERTY_INCLUDE_IN_ANALYTICS,
  IncidentConfigurationDataAttributesRequest.JSON_PROPERTY_INCLUDE_IN_SEARCH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentConfigurationDataAttributesRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXECUTE_INTEGRATIONS = "execute_integrations";
  private Boolean executeIntegrations;

  public static final String JSON_PROPERTY_EXECUTE_NOTIFICATION_RULES =
      "execute_notification_rules";
  private Boolean executeNotificationRules;

  public static final String JSON_PROPERTY_INCLUDE_IN_ANALYTICS = "include_in_analytics";
  private Boolean includeInAnalytics;

  public static final String JSON_PROPERTY_INCLUDE_IN_SEARCH = "include_in_search";
  private Boolean includeInSearch;

  public IncidentConfigurationDataAttributesRequest executeIntegrations(
      Boolean executeIntegrations) {
    this.executeIntegrations = executeIntegrations;
    return this;
  }

  /**
   * Whether to execute integrations for this incident.
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

  public IncidentConfigurationDataAttributesRequest executeNotificationRules(
      Boolean executeNotificationRules) {
    this.executeNotificationRules = executeNotificationRules;
    return this;
  }

  /**
   * Whether to execute notification rules for this incident.
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

  public IncidentConfigurationDataAttributesRequest includeInAnalytics(Boolean includeInAnalytics) {
    this.includeInAnalytics = includeInAnalytics;
    return this;
  }

  /**
   * Whether to include this incident in analytics.
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

  public IncidentConfigurationDataAttributesRequest includeInSearch(Boolean includeInSearch) {
    this.includeInSearch = includeInSearch;
    return this;
  }

  /**
   * Whether to include this incident in search results.
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
   * @return IncidentConfigurationDataAttributesRequest
   */
  @JsonAnySetter
  public IncidentConfigurationDataAttributesRequest putAdditionalProperty(
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

  /** Return true if this IncidentConfigurationDataAttributesRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentConfigurationDataAttributesRequest incidentConfigurationDataAttributesRequest =
        (IncidentConfigurationDataAttributesRequest) o;
    return Objects.equals(
            this.executeIntegrations,
            incidentConfigurationDataAttributesRequest.executeIntegrations)
        && Objects.equals(
            this.executeNotificationRules,
            incidentConfigurationDataAttributesRequest.executeNotificationRules)
        && Objects.equals(
            this.includeInAnalytics, incidentConfigurationDataAttributesRequest.includeInAnalytics)
        && Objects.equals(
            this.includeInSearch, incidentConfigurationDataAttributesRequest.includeInSearch)
        && Objects.equals(
            this.additionalProperties,
            incidentConfigurationDataAttributesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        executeIntegrations,
        executeNotificationRules,
        includeInAnalytics,
        includeInSearch,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentConfigurationDataAttributesRequest {\n");
    sb.append("    executeIntegrations: ")
        .append(toIndentedString(executeIntegrations))
        .append("\n");
    sb.append("    executeNotificationRules: ")
        .append(toIndentedString(executeNotificationRules))
        .append("\n");
    sb.append("    includeInAnalytics: ").append(toIndentedString(includeInAnalytics)).append("\n");
    sb.append("    includeInSearch: ").append(toIndentedString(includeInSearch)).append("\n");
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
