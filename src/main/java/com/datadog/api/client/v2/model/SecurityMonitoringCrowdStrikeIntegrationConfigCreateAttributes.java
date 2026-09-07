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

/** The attributes of a CrowdStrike entity context sync configuration to create. */
@JsonPropertyOrder({
  SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes.JSON_PROPERTY_DOMAIN,
  SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes.JSON_PROPERTY_INTEGRATION_TYPE,
  SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes.JSON_PROPERTY_NAME,
  SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes.JSON_PROPERTY_SECRETS,
  SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes.JSON_PROPERTY_SETTINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_INTEGRATION_TYPE = "integration_type";
  private SecurityMonitoringIntegrationTypeCrowdStrike integrationType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SECRETS = "secrets";
  private SecurityMonitoringIntegrationConfigCrowdStrikeSecrets secrets;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private Map<String, Object> settings = null;

  public SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes() {}

  @JsonCreator
  public SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DOMAIN) String domain,
      @JsonProperty(required = true, value = JSON_PROPERTY_INTEGRATION_TYPE)
          SecurityMonitoringIntegrationTypeCrowdStrike integrationType,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SECRETS)
          SecurityMonitoringIntegrationConfigCrowdStrikeSecrets secrets) {
    this.domain = domain;
    this.integrationType = integrationType;
    this.unparsed |= !integrationType.isValid();
    this.name = name;
    this.secrets = secrets;
    this.unparsed |= secrets.unparsed;
  }

  public SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * The domain associated with the external entity source.
   *
   * @return domain
   */
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes integrationType(
      SecurityMonitoringIntegrationTypeCrowdStrike integrationType) {
    this.integrationType = integrationType;
    this.unparsed |= !integrationType.isValid();
    return this;
  }

  /**
   * The source type for a CrowdStrike entity context sync.
   *
   * @return integrationType
   */
  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringIntegrationTypeCrowdStrike getIntegrationType() {
    return integrationType;
  }

  public void setIntegrationType(SecurityMonitoringIntegrationTypeCrowdStrike integrationType) {
    if (!integrationType.isValid()) {
      this.unparsed = true;
    }
    this.integrationType = integrationType;
  }

  public SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The display name for the entity context sync configuration.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes secrets(
      SecurityMonitoringIntegrationConfigCrowdStrikeSecrets secrets) {
    this.secrets = secrets;
    this.unparsed |= secrets.unparsed;
    return this;
  }

  /**
   * Credentials for a CrowdStrike entity context sync.
   *
   * @return secrets
   */
  @JsonProperty(JSON_PROPERTY_SECRETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringIntegrationConfigCrowdStrikeSecrets getSecrets() {
    return secrets;
  }

  public void setSecrets(SecurityMonitoringIntegrationConfigCrowdStrikeSecrets secrets) {
    this.secrets = secrets;
    if (secrets != null) {
      this.unparsed |= secrets.unparsed;
    }
  }

  public SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes settings(
      Map<String, Object> settings) {
    this.settings = settings;
    return this;
  }

  public SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes putSettingsItem(
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
   * @return SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes putAdditionalProperty(
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
   * Return true if this SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes object is
   * equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes
        securityMonitoringCrowdStrikeIntegrationConfigCreateAttributes =
            (SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes) o;
    return Objects.equals(
            this.domain, securityMonitoringCrowdStrikeIntegrationConfigCreateAttributes.domain)
        && Objects.equals(
            this.integrationType,
            securityMonitoringCrowdStrikeIntegrationConfigCreateAttributes.integrationType)
        && Objects.equals(
            this.name, securityMonitoringCrowdStrikeIntegrationConfigCreateAttributes.name)
        && Objects.equals(
            this.secrets, securityMonitoringCrowdStrikeIntegrationConfigCreateAttributes.secrets)
        && Objects.equals(
            this.settings, securityMonitoringCrowdStrikeIntegrationConfigCreateAttributes.settings)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringCrowdStrikeIntegrationConfigCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, integrationType, name, secrets, settings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes {\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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
