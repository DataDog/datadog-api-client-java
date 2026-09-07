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

/** The CrowdStrike credentials to validate against the external entity source. */
@JsonPropertyOrder({
  SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes.JSON_PROPERTY_DOMAIN,
  SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes
      .JSON_PROPERTY_INTEGRATION_TYPE,
  SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes.JSON_PROPERTY_SECRETS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_INTEGRATION_TYPE = "integration_type";
  private SecurityMonitoringIntegrationTypeCrowdStrike integrationType;

  public static final String JSON_PROPERTY_SECRETS = "secrets";
  private SecurityMonitoringIntegrationConfigCrowdStrikeSecrets secrets;

  public SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes() {}

  @JsonCreator
  public SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DOMAIN) String domain,
      @JsonProperty(required = true, value = JSON_PROPERTY_INTEGRATION_TYPE)
          SecurityMonitoringIntegrationTypeCrowdStrike integrationType,
      @JsonProperty(required = true, value = JSON_PROPERTY_SECRETS)
          SecurityMonitoringIntegrationConfigCrowdStrikeSecrets secrets) {
    this.domain = domain;
    this.integrationType = integrationType;
    this.unparsed |= !integrationType.isValid();
    this.secrets = secrets;
    this.unparsed |= secrets.unparsed;
  }

  public SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes domain(
      String domain) {
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

  public SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes integrationType(
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

  public SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes secrets(
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
   * @return SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes
      putAdditionalProperty(String key, Object value) {
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
   * Return true if this SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes
   * object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes
        securityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes =
            (SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes) o;
    return Objects.equals(
            this.domain,
            securityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes.domain)
        && Objects.equals(
            this.integrationType,
            securityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes.integrationType)
        && Objects.equals(
            this.secrets,
            securityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes.secrets)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, integrationType, secrets, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes {\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
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
