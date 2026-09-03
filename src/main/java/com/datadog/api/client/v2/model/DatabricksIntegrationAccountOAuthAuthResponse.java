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

/** The Databricks OAuth authentication method and service principal configured on the account. */
@JsonPropertyOrder({
  DatabricksIntegrationAccountOAuthAuthResponse.JSON_PROPERTY_AUTH_TYPE,
  DatabricksIntegrationAccountOAuthAuthResponse.JSON_PROPERTY_AZURE_TENANT_ID,
  DatabricksIntegrationAccountOAuthAuthResponse.JSON_PROPERTY_CLIENT_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatabricksIntegrationAccountOAuthAuthResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_TYPE = "auth_type";
  private DatabricksIntegrationAccountOAuthAuthType authType =
      DatabricksIntegrationAccountOAuthAuthType.DATABRICKS_OAUTH;

  public static final String JSON_PROPERTY_AZURE_TENANT_ID = "azure_tenant_id";
  private String azureTenantId;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public DatabricksIntegrationAccountOAuthAuthResponse() {}

  @JsonCreator
  public DatabricksIntegrationAccountOAuthAuthResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH_TYPE)
          DatabricksIntegrationAccountOAuthAuthType authType,
      @JsonProperty(required = true, value = JSON_PROPERTY_CLIENT_ID) String clientId) {
    this.authType = authType;
    this.unparsed |= !authType.isValid();
    this.clientId = clientId;
  }

  public DatabricksIntegrationAccountOAuthAuthResponse authType(
      DatabricksIntegrationAccountOAuthAuthType authType) {
    this.authType = authType;
    this.unparsed |= !authType.isValid();
    return this;
  }

  /**
   * The authentication method type.
   *
   * @return authType
   */
  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DatabricksIntegrationAccountOAuthAuthType getAuthType() {
    return authType;
  }

  public void setAuthType(DatabricksIntegrationAccountOAuthAuthType authType) {
    if (!authType.isValid()) {
      this.unparsed = true;
    }
    this.authType = authType;
  }

  public DatabricksIntegrationAccountOAuthAuthResponse azureTenantId(String azureTenantId) {
    this.azureTenantId = azureTenantId;
    return this;
  }

  /**
   * Microsoft Entra ID tenant of the service principal, for Azure Databricks workspaces.
   *
   * @return azureTenantId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AZURE_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAzureTenantId() {
    return azureTenantId;
  }

  public void setAzureTenantId(String azureTenantId) {
    this.azureTenantId = azureTenantId;
  }

  public DatabricksIntegrationAccountOAuthAuthResponse clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Client ID of the Databricks service principal.
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
   * @return DatabricksIntegrationAccountOAuthAuthResponse
   */
  @JsonAnySetter
  public DatabricksIntegrationAccountOAuthAuthResponse putAdditionalProperty(
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

  /** Return true if this DatabricksIntegrationAccountOAuthAuthResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabricksIntegrationAccountOAuthAuthResponse databricksIntegrationAccountOAuthAuthResponse =
        (DatabricksIntegrationAccountOAuthAuthResponse) o;
    return Objects.equals(this.authType, databricksIntegrationAccountOAuthAuthResponse.authType)
        && Objects.equals(
            this.azureTenantId, databricksIntegrationAccountOAuthAuthResponse.azureTenantId)
        && Objects.equals(this.clientId, databricksIntegrationAccountOAuthAuthResponse.clientId)
        && Objects.equals(
            this.additionalProperties,
            databricksIntegrationAccountOAuthAuthResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, azureTenantId, clientId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabricksIntegrationAccountOAuthAuthResponse {\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    azureTenantId: ").append(toIndentedString(azureTenantId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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
