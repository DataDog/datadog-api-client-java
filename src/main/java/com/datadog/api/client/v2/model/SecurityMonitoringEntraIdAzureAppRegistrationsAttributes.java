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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The attributes of the Entra ID Azure App Registration prerequisites. */
@JsonPropertyOrder({
  SecurityMonitoringEntraIdAzureAppRegistrationsAttributes.JSON_PROPERTY_AZURE_APP_REGISTRATIONS,
  SecurityMonitoringEntraIdAzureAppRegistrationsAttributes.JSON_PROPERTY_HAS_VALID_PREREQUISITE,
  SecurityMonitoringEntraIdAzureAppRegistrationsAttributes.JSON_PROPERTY_INTEGRATION_ID,
  SecurityMonitoringEntraIdAzureAppRegistrationsAttributes.JSON_PROPERTY_IS_ENABLED,
  SecurityMonitoringEntraIdAzureAppRegistrationsAttributes.JSON_PROPERTY_SUBSCRIBED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringEntraIdAzureAppRegistrationsAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AZURE_APP_REGISTRATIONS = "azure_app_registrations";
  private List<SecurityMonitoringAzureAppRegistration> azureAppRegistrations = new ArrayList<>();

  public static final String JSON_PROPERTY_HAS_VALID_PREREQUISITE = "has_valid_prerequisite";
  private Boolean hasValidPrerequisite;

  public static final String JSON_PROPERTY_INTEGRATION_ID = "integration_id";
  private String integrationId;

  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_SUBSCRIBED_AT = "subscribed_at";
  private OffsetDateTime subscribedAt;

  public SecurityMonitoringEntraIdAzureAppRegistrationsAttributes() {}

  @JsonCreator
  public SecurityMonitoringEntraIdAzureAppRegistrationsAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_AZURE_APP_REGISTRATIONS)
          List<SecurityMonitoringAzureAppRegistration> azureAppRegistrations,
      @JsonProperty(required = true, value = JSON_PROPERTY_HAS_VALID_PREREQUISITE)
          Boolean hasValidPrerequisite) {
    this.azureAppRegistrations = azureAppRegistrations;
    this.hasValidPrerequisite = hasValidPrerequisite;
  }

  public SecurityMonitoringEntraIdAzureAppRegistrationsAttributes azureAppRegistrations(
      List<SecurityMonitoringAzureAppRegistration> azureAppRegistrations) {
    this.azureAppRegistrations = azureAppRegistrations;
    for (SecurityMonitoringAzureAppRegistration item : azureAppRegistrations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringEntraIdAzureAppRegistrationsAttributes addAzureAppRegistrationsItem(
      SecurityMonitoringAzureAppRegistration azureAppRegistrationsItem) {
    this.azureAppRegistrations.add(azureAppRegistrationsItem);
    this.unparsed |= azureAppRegistrationsItem.unparsed;
    return this;
  }

  /**
   * The Azure App Registrations discovered for the organization.
   *
   * @return azureAppRegistrations
   */
  @JsonProperty(JSON_PROPERTY_AZURE_APP_REGISTRATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SecurityMonitoringAzureAppRegistration> getAzureAppRegistrations() {
    return azureAppRegistrations;
  }

  public void setAzureAppRegistrations(
      List<SecurityMonitoringAzureAppRegistration> azureAppRegistrations) {
    this.azureAppRegistrations = azureAppRegistrations;
  }

  public SecurityMonitoringEntraIdAzureAppRegistrationsAttributes hasValidPrerequisite(
      Boolean hasValidPrerequisite) {
    this.hasValidPrerequisite = hasValidPrerequisite;
    return this;
  }

  /**
   * Whether at least one Azure App Registration has resource collection enabled.
   *
   * @return hasValidPrerequisite
   */
  @JsonProperty(JSON_PROPERTY_HAS_VALID_PREREQUISITE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getHasValidPrerequisite() {
    return hasValidPrerequisite;
  }

  public void setHasValidPrerequisite(Boolean hasValidPrerequisite) {
    this.hasValidPrerequisite = hasValidPrerequisite;
  }

  public SecurityMonitoringEntraIdAzureAppRegistrationsAttributes integrationId(
      String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  /**
   * The ID of the Entra ID integration configuration, if one exists.
   *
   * @return integrationId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIntegrationId() {
    return integrationId;
  }

  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }

  public SecurityMonitoringEntraIdAzureAppRegistrationsAttributes isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Whether the Entra ID integration configuration is enabled, if one exists.
   *
   * @return isEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public SecurityMonitoringEntraIdAzureAppRegistrationsAttributes subscribedAt(
      OffsetDateTime subscribedAt) {
    this.subscribedAt = subscribedAt;
    return this;
  }

  /**
   * The time at which the Entra ID integration configuration was created, if one exists.
   *
   * @return subscribedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIBED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getSubscribedAt() {
    return subscribedAt;
  }

  public void setSubscribedAt(OffsetDateTime subscribedAt) {
    this.subscribedAt = subscribedAt;
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
   * @return SecurityMonitoringEntraIdAzureAppRegistrationsAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringEntraIdAzureAppRegistrationsAttributes putAdditionalProperty(
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

  /**
   * Return true if this SecurityMonitoringEntraIdAzureAppRegistrationsAttributes object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringEntraIdAzureAppRegistrationsAttributes
        securityMonitoringEntraIdAzureAppRegistrationsAttributes =
            (SecurityMonitoringEntraIdAzureAppRegistrationsAttributes) o;
    return Objects.equals(
            this.azureAppRegistrations,
            securityMonitoringEntraIdAzureAppRegistrationsAttributes.azureAppRegistrations)
        && Objects.equals(
            this.hasValidPrerequisite,
            securityMonitoringEntraIdAzureAppRegistrationsAttributes.hasValidPrerequisite)
        && Objects.equals(
            this.integrationId,
            securityMonitoringEntraIdAzureAppRegistrationsAttributes.integrationId)
        && Objects.equals(
            this.isEnabled, securityMonitoringEntraIdAzureAppRegistrationsAttributes.isEnabled)
        && Objects.equals(
            this.subscribedAt,
            securityMonitoringEntraIdAzureAppRegistrationsAttributes.subscribedAt)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringEntraIdAzureAppRegistrationsAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        azureAppRegistrations,
        hasValidPrerequisite,
        integrationId,
        isEnabled,
        subscribedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringEntraIdAzureAppRegistrationsAttributes {\n");
    sb.append("    azureAppRegistrations: ")
        .append(toIndentedString(azureAppRegistrations))
        .append("\n");
    sb.append("    hasValidPrerequisite: ")
        .append(toIndentedString(hasValidPrerequisite))
        .append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    subscribedAt: ").append(toIndentedString(subscribedAt)).append("\n");
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
