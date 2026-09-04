/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/**
 * Databricks OAuth machine-to-machine authentication using a service principal. Omit <code>
 * client_secret</code> to keep the stored one; <code>client_id</code> must be provided on every
 * submission. Omitting <code>azure_tenant_id</code> clears it.
 */
@JsonPropertyOrder({
  DatabricksIntegrationAccountOAuthAuthUpdate.JSON_PROPERTY_AUTH_TYPE,
  DatabricksIntegrationAccountOAuthAuthUpdate.JSON_PROPERTY_AZURE_TENANT_ID,
  DatabricksIntegrationAccountOAuthAuthUpdate.JSON_PROPERTY_CLIENT_ID,
  DatabricksIntegrationAccountOAuthAuthUpdate.JSON_PROPERTY_CLIENT_SECRET
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatabricksIntegrationAccountOAuthAuthUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_TYPE = "auth_type";
  private DatabricksIntegrationAccountOAuthAuthType authType =
      DatabricksIntegrationAccountOAuthAuthType.DATABRICKS_OAUTH;

  public static final String JSON_PROPERTY_AZURE_TENANT_ID = "azure_tenant_id";
  private String azureTenantId;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_CLIENT_SECRET = "client_secret";
  private String clientSecret;

  public DatabricksIntegrationAccountOAuthAuthUpdate() {}

  @JsonCreator
  public DatabricksIntegrationAccountOAuthAuthUpdate(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH_TYPE)
          DatabricksIntegrationAccountOAuthAuthType authType,
      @JsonProperty(required = true, value = JSON_PROPERTY_CLIENT_ID) String clientId) {
    this.authType = authType;
    this.unparsed |= !authType.isValid();
    this.clientId = clientId;
  }

  public DatabricksIntegrationAccountOAuthAuthUpdate authType(
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

  public DatabricksIntegrationAccountOAuthAuthUpdate azureTenantId(String azureTenantId) {
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

  public DatabricksIntegrationAccountOAuthAuthUpdate clientId(String clientId) {
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

  public DatabricksIntegrationAccountOAuthAuthUpdate clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * Secret of the Databricks service principal.
   *
   * @return clientSecret
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  /** Return true if this DatabricksIntegrationAccountOAuthAuthUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabricksIntegrationAccountOAuthAuthUpdate databricksIntegrationAccountOAuthAuthUpdate =
        (DatabricksIntegrationAccountOAuthAuthUpdate) o;
    return Objects.equals(this.authType, databricksIntegrationAccountOAuthAuthUpdate.authType)
        && Objects.equals(
            this.azureTenantId, databricksIntegrationAccountOAuthAuthUpdate.azureTenantId)
        && Objects.equals(this.clientId, databricksIntegrationAccountOAuthAuthUpdate.clientId)
        && Objects.equals(
            this.clientSecret, databricksIntegrationAccountOAuthAuthUpdate.clientSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, azureTenantId, clientId, clientSecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabricksIntegrationAccountOAuthAuthUpdate {\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    azureTenantId: ").append(toIndentedString(azureTenantId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
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
