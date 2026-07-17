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

/** Fields to update on an Okta entity context sync configuration. */
@JsonPropertyOrder({
  SecurityMonitoringOktaIntegrationConfigUpdateAttributes.JSON_PROPERTY_DOMAIN,
  SecurityMonitoringOktaIntegrationConfigUpdateAttributes.JSON_PROPERTY_ENABLED,
  SecurityMonitoringOktaIntegrationConfigUpdateAttributes.JSON_PROPERTY_INTEGRATION_TYPE,
  SecurityMonitoringOktaIntegrationConfigUpdateAttributes.JSON_PROPERTY_NAME,
  SecurityMonitoringOktaIntegrationConfigUpdateAttributes.JSON_PROPERTY_SECRETS,
  SecurityMonitoringOktaIntegrationConfigUpdateAttributes.JSON_PROPERTY_SETTINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringOktaIntegrationConfigUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_INTEGRATION_TYPE = "integration_type";
  private SecurityMonitoringIntegrationTypeOkta integrationType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SECRETS = "secrets";
  private SecurityMonitoringIntegrationConfigOktaSecrets secrets;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private Map<String, Object> settings = null;

  public SecurityMonitoringOktaIntegrationConfigUpdateAttributes() {}

  @JsonCreator
  public SecurityMonitoringOktaIntegrationConfigUpdateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_INTEGRATION_TYPE)
          SecurityMonitoringIntegrationTypeOkta integrationType) {
    this.integrationType = integrationType;
    this.unparsed |= !integrationType.isValid();
  }

  public SecurityMonitoringOktaIntegrationConfigUpdateAttributes domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * The new domain associated with the external entity source.
   *
   * @return domain
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public SecurityMonitoringOktaIntegrationConfigUpdateAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the entity context sync should be enabled.
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

  public SecurityMonitoringOktaIntegrationConfigUpdateAttributes integrationType(
      SecurityMonitoringIntegrationTypeOkta integrationType) {
    this.integrationType = integrationType;
    this.unparsed |= !integrationType.isValid();
    return this;
  }

  /**
   * The source type for an Okta entity context sync.
   *
   * @return integrationType
   */
  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringIntegrationTypeOkta getIntegrationType() {
    return integrationType;
  }

  public void setIntegrationType(SecurityMonitoringIntegrationTypeOkta integrationType) {
    if (!integrationType.isValid()) {
      this.unparsed = true;
    }
    this.integrationType = integrationType;
  }

  public SecurityMonitoringOktaIntegrationConfigUpdateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The new display name for the entity context sync configuration.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SecurityMonitoringOktaIntegrationConfigUpdateAttributes secrets(
      SecurityMonitoringIntegrationConfigOktaSecrets secrets) {
    this.secrets = secrets;
    this.unparsed |= secrets.unparsed;
    return this;
  }

  /**
   * Credentials for an Okta entity context sync.
   *
   * @return secrets
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECRETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringIntegrationConfigOktaSecrets getSecrets() {
    return secrets;
  }

  public void setSecrets(SecurityMonitoringIntegrationConfigOktaSecrets secrets) {
    this.secrets = secrets;
    if (secrets != null) {
      this.unparsed |= secrets.unparsed;
    }
  }

  public SecurityMonitoringOktaIntegrationConfigUpdateAttributes settings(
      Map<String, Object> settings) {
    this.settings = settings;
    return this;
  }

  public SecurityMonitoringOktaIntegrationConfigUpdateAttributes putSettingsItem(
      String key, Object settingsItem) {
    if (this.settings == null) {
      this.settings = new HashMap<>();
    }
    this.settings.put(key, settingsItem);
    return this;
  }

  /**
   * Free-form, non-sensitive settings for the entity context sync. The accepted keys depend on the
   * source type.
   *
   * @return settings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getSettings() {
    return settings;
  }

  public void setSettings(Map<String, Object> settings) {
    this.settings = settings;
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
   * @return SecurityMonitoringOktaIntegrationConfigUpdateAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringOktaIntegrationConfigUpdateAttributes putAdditionalProperty(
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
   * Return true if this SecurityMonitoringOktaIntegrationConfigUpdateAttributes object is equal to
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
    SecurityMonitoringOktaIntegrationConfigUpdateAttributes
        securityMonitoringOktaIntegrationConfigUpdateAttributes =
            (SecurityMonitoringOktaIntegrationConfigUpdateAttributes) o;
    return Objects.equals(
            this.domain, securityMonitoringOktaIntegrationConfigUpdateAttributes.domain)
        && Objects.equals(
            this.enabled, securityMonitoringOktaIntegrationConfigUpdateAttributes.enabled)
        && Objects.equals(
            this.integrationType,
            securityMonitoringOktaIntegrationConfigUpdateAttributes.integrationType)
        && Objects.equals(this.name, securityMonitoringOktaIntegrationConfigUpdateAttributes.name)
        && Objects.equals(
            this.secrets, securityMonitoringOktaIntegrationConfigUpdateAttributes.secrets)
        && Objects.equals(
            this.settings, securityMonitoringOktaIntegrationConfigUpdateAttributes.settings)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringOktaIntegrationConfigUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        domain, enabled, integrationType, name, secrets, settings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringOktaIntegrationConfigUpdateAttributes {\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
