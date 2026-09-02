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

/** Credentials for a Google Workspace entity context sync. */
@JsonPropertyOrder({
  SecurityMonitoringIntegrationConfigGoogleWorkspaceSecrets.JSON_PROPERTY_ADMIN_EMAIL,
  SecurityMonitoringIntegrationConfigGoogleWorkspaceSecrets.JSON_PROPERTY_SERVICE_ACCOUNT_JSON
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringIntegrationConfigGoogleWorkspaceSecrets {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADMIN_EMAIL = "admin_email";
  private String adminEmail;

  public static final String JSON_PROPERTY_SERVICE_ACCOUNT_JSON = "service_account_json";
  private SecurityMonitoringIntegrationConfigGoogleWorkspaceServiceAccount serviceAccountJson;

  public SecurityMonitoringIntegrationConfigGoogleWorkspaceSecrets() {}

  @JsonCreator
  public SecurityMonitoringIntegrationConfigGoogleWorkspaceSecrets(
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE_ACCOUNT_JSON)
          SecurityMonitoringIntegrationConfigGoogleWorkspaceServiceAccount serviceAccountJson) {
    this.serviceAccountJson = serviceAccountJson;
    this.unparsed |= serviceAccountJson.unparsed;
  }

  public SecurityMonitoringIntegrationConfigGoogleWorkspaceSecrets adminEmail(String adminEmail) {
    this.adminEmail = adminEmail;
    return this;
  }

  /**
   * The admin email to impersonate for domain-wide delegation.
   *
   * @return adminEmail
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADMIN_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAdminEmail() {
    return adminEmail;
  }

  public void setAdminEmail(String adminEmail) {
    this.adminEmail = adminEmail;
  }

  public SecurityMonitoringIntegrationConfigGoogleWorkspaceSecrets serviceAccountJson(
      SecurityMonitoringIntegrationConfigGoogleWorkspaceServiceAccount serviceAccountJson) {
    this.serviceAccountJson = serviceAccountJson;
    this.unparsed |= serviceAccountJson.unparsed;
    return this;
  }

  /**
   * The Google Cloud service account JSON used to authenticate against the Google Workspace Admin
   * SDK. Additional keys beyond those documented are preserved.
   *
   * @return serviceAccountJson
   */
  @JsonProperty(JSON_PROPERTY_SERVICE_ACCOUNT_JSON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringIntegrationConfigGoogleWorkspaceServiceAccount getServiceAccountJson() {
    return serviceAccountJson;
  }

  public void setServiceAccountJson(
      SecurityMonitoringIntegrationConfigGoogleWorkspaceServiceAccount serviceAccountJson) {
    this.serviceAccountJson = serviceAccountJson;
    if (serviceAccountJson != null) {
      this.unparsed |= serviceAccountJson.unparsed;
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
   * @return SecurityMonitoringIntegrationConfigGoogleWorkspaceSecrets
   */
  @JsonAnySetter
  public SecurityMonitoringIntegrationConfigGoogleWorkspaceSecrets putAdditionalProperty(
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
   * Return true if this SecurityMonitoringIntegrationConfigGoogleWorkspaceSecrets object is equal
   * to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringIntegrationConfigGoogleWorkspaceSecrets
        securityMonitoringIntegrationConfigGoogleWorkspaceSecrets =
            (SecurityMonitoringIntegrationConfigGoogleWorkspaceSecrets) o;
    return Objects.equals(
            this.adminEmail, securityMonitoringIntegrationConfigGoogleWorkspaceSecrets.adminEmail)
        && Objects.equals(
            this.serviceAccountJson,
            securityMonitoringIntegrationConfigGoogleWorkspaceSecrets.serviceAccountJson)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringIntegrationConfigGoogleWorkspaceSecrets.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminEmail, serviceAccountJson, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringIntegrationConfigGoogleWorkspaceSecrets {\n");
    sb.append("    adminEmail: ").append(toIndentedString(adminEmail)).append("\n");
    sb.append("    serviceAccountJson: ").append(toIndentedString(serviceAccountJson)).append("\n");
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
