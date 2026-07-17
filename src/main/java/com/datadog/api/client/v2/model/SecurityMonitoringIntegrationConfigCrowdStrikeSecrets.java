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

/** Credentials for a CrowdStrike entity context sync. */
@JsonPropertyOrder({
  SecurityMonitoringIntegrationConfigCrowdStrikeSecrets.JSON_PROPERTY_CLIENT_ID,
  SecurityMonitoringIntegrationConfigCrowdStrikeSecrets.JSON_PROPERTY_CLIENT_SECRET
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringIntegrationConfigCrowdStrikeSecrets {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_CLIENT_SECRET = "client_secret";
  private String clientSecret;

  public SecurityMonitoringIntegrationConfigCrowdStrikeSecrets() {}

  @JsonCreator
  public SecurityMonitoringIntegrationConfigCrowdStrikeSecrets(
      @JsonProperty(required = true, value = JSON_PROPERTY_CLIENT_ID) String clientId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CLIENT_SECRET) String clientSecret) {
    this.clientId = clientId;
    this.clientSecret = clientSecret;
  }

  public SecurityMonitoringIntegrationConfigCrowdStrikeSecrets clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * The CrowdStrike API client ID.
   *
   * @return clientId
   */
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public SecurityMonitoringIntegrationConfigCrowdStrikeSecrets clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * The CrowdStrike API client secret.
   *
   * @return clientSecret
   */
  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
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
   * @return SecurityMonitoringIntegrationConfigCrowdStrikeSecrets
   */
  @JsonAnySetter
  public SecurityMonitoringIntegrationConfigCrowdStrikeSecrets putAdditionalProperty(
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
   * Return true if this SecurityMonitoringIntegrationConfigCrowdStrikeSecrets object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringIntegrationConfigCrowdStrikeSecrets
        securityMonitoringIntegrationConfigCrowdStrikeSecrets =
            (SecurityMonitoringIntegrationConfigCrowdStrikeSecrets) o;
    return Objects.equals(
            this.clientId, securityMonitoringIntegrationConfigCrowdStrikeSecrets.clientId)
        && Objects.equals(
            this.clientSecret, securityMonitoringIntegrationConfigCrowdStrikeSecrets.clientSecret)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringIntegrationConfigCrowdStrikeSecrets.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringIntegrationConfigCrowdStrikeSecrets {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
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
