/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The definition of the <code>AzureTenant</code> object.</p>
 */
@JsonPropertyOrder({
  AzureTenantUpdate.JSON_PROPERTY_APP_CLIENT_ID,
  AzureTenantUpdate.JSON_PROPERTY_CLIENT_SECRET,
  AzureTenantUpdate.JSON_PROPERTY_CUSTOM_SCOPES,
  AzureTenantUpdate.JSON_PROPERTY_TENANT_ID,
  AzureTenantUpdate.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AzureTenantUpdate {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_APP_CLIENT_ID = "app_client_id";
  private String appClientId;

  public static final String JSON_PROPERTY_CLIENT_SECRET = "client_secret";
  private String clientSecret;

  public static final String JSON_PROPERTY_CUSTOM_SCOPES = "custom_scopes";
  private String customScopes;

  public static final String JSON_PROPERTY_TENANT_ID = "tenant_id";
  private String tenantId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private AzureTenantType type;

  public AzureTenantUpdate() {}

  @JsonCreator
  public AzureTenantUpdate(
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)AzureTenantType type) {
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public AzureTenantUpdate appClientId(String appClientId) {
    this.appClientId = appClientId;
    return this;
  }

  /**
   * <p>The Client ID, also known as the Application ID in Azure, is a unique identifier for an application. It's used to identify the application during the authentication process. Your Application (client) ID is listed in the application's overview page. You can navigate to your application via the Azure Directory. </p>
   * @return appClientId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_APP_CLIENT_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAppClientId() {
        return appClientId;
      }
  public void setAppClientId(String appClientId) {
    this.appClientId = appClientId;
  }
  public AzureTenantUpdate clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * <p>The Client Secret is a confidential piece of information known only to the application and Azure AD. It's used to prove the application's identity. Your Client Secret is available from the application’s secrets page. You can navigate to your application via the Azure Directory.</p>
   * @return clientSecret
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getClientSecret() {
        return clientSecret;
      }
  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }
  public AzureTenantUpdate customScopes(String customScopes) {
    this.customScopes = customScopes;
    return this;
  }

  /**
   * <p>If provided, the custom scope to be requested from Microsoft when acquiring an OAuth 2 access token. This custom scope is used only in conjunction with the HTTP action. A resource's scope is constructed by using the identifier URI for the resource and .default, separated by a forward slash (/) as follows:{identifierURI}/.default.</p>
   * @return customScopes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CUSTOM_SCOPES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCustomScopes() {
        return customScopes;
      }
  public void setCustomScopes(String customScopes) {
    this.customScopes = customScopes;
  }
  public AzureTenantUpdate tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * <p>The Tenant ID, also known as the Directory ID in Azure, is a unique identifier that represents an Azure AD instance. Your Tenant ID (Directory ID) is listed in your Active Directory overview page under the 'Tenant information' section.</p>
   * @return tenantId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TENANT_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTenantId() {
        return tenantId;
      }
  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }
  public AzureTenantUpdate type(AzureTenantType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The definition of the <code>AzureTenant</code> object.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public AzureTenantType getType() {
        return type;
      }
  public void setType(AzureTenantType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return AzureTenantUpdate
   */
  @JsonAnySetter
  public AzureTenantUpdate putAdditionalProperty(String key, Object value) {
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
   * Return true if this AzureTenantUpdate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureTenantUpdate azureTenantUpdate = (AzureTenantUpdate) o;
    return Objects.equals(this.appClientId, azureTenantUpdate.appClientId) && Objects.equals(this.clientSecret, azureTenantUpdate.clientSecret) && Objects.equals(this.customScopes, azureTenantUpdate.customScopes) && Objects.equals(this.tenantId, azureTenantUpdate.tenantId) && Objects.equals(this.type, azureTenantUpdate.type) && Objects.equals(this.additionalProperties, azureTenantUpdate.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(appClientId,clientSecret,customScopes,tenantId,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureTenantUpdate {\n");
    sb.append("    appClientId: ").append(toIndentedString(appClientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    customScopes: ").append(toIndentedString(customScopes)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
