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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Service-account key pair authentication, the only method Nebius Cloud integration accounts
 * support. Only the fields provided are changed; omit <code>private_key</code> and <code>
 * static_api_key</code> to keep the stored ones.
 */
@JsonPropertyOrder({
  NebiusCloudIntegrationAccountServiceAccountAuthUpdate.JSON_PROPERTY_AUTH_TYPE,
  NebiusCloudIntegrationAccountServiceAccountAuthUpdate.JSON_PROPERTY_PRIVATE_KEY,
  NebiusCloudIntegrationAccountServiceAccountAuthUpdate.JSON_PROPERTY_PUBLIC_KEY_ID,
  NebiusCloudIntegrationAccountServiceAccountAuthUpdate.JSON_PROPERTY_SERVICE_ACCOUNT_ID,
  NebiusCloudIntegrationAccountServiceAccountAuthUpdate.JSON_PROPERTY_STATIC_API_KEY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NebiusCloudIntegrationAccountServiceAccountAuthUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_TYPE = "auth_type";
  private NebiusCloudIntegrationAccountServiceAccountAuthType authType =
      NebiusCloudIntegrationAccountServiceAccountAuthType.NEBIUS_SERVICE_ACCOUNT;

  public static final String JSON_PROPERTY_PRIVATE_KEY = "private_key";
  private String privateKey;

  public static final String JSON_PROPERTY_PUBLIC_KEY_ID = "public_key_id";
  private JsonNullable<String> publicKeyId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SERVICE_ACCOUNT_ID = "service_account_id";
  private String serviceAccountId;

  public static final String JSON_PROPERTY_STATIC_API_KEY = "static_api_key";
  private String staticApiKey;

  public NebiusCloudIntegrationAccountServiceAccountAuthUpdate() {}

  @JsonCreator
  public NebiusCloudIntegrationAccountServiceAccountAuthUpdate(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH_TYPE)
          NebiusCloudIntegrationAccountServiceAccountAuthType authType) {
    this.authType = authType;
    this.unparsed |= !authType.isValid();
  }

  public NebiusCloudIntegrationAccountServiceAccountAuthUpdate authType(
      NebiusCloudIntegrationAccountServiceAccountAuthType authType) {
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
  public NebiusCloudIntegrationAccountServiceAccountAuthType getAuthType() {
    return authType;
  }

  public void setAuthType(NebiusCloudIntegrationAccountServiceAccountAuthType authType) {
    if (!authType.isValid()) {
      this.unparsed = true;
    }
    this.authType = authType;
  }

  public NebiusCloudIntegrationAccountServiceAccountAuthUpdate privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

  /**
   * The private key of the authorized key pair, in PEM format. Omit it to keep the stored one; an
   * empty string is rejected with a <code>422</code> response.
   *
   * @return privateKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIVATE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }

  public NebiusCloudIntegrationAccountServiceAccountAuthUpdate publicKeyId(String publicKeyId) {
    this.publicKeyId = JsonNullable.<String>of(publicKeyId);
    return this;
  }

  /**
   * ID of the public key half of the authorized key pair. Omit it to keep the stored public key ID,
   * send <code>null</code> or an empty string to remove it, or send a value to replace it. Removing
   * it is rejected with a <code>422</code> response while log, resource, or service-quota
   * collection is enabled.
   *
   * @return publicKeyId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getPublicKeyId() {
    return publicKeyId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PUBLIC_KEY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPublicKeyId_JsonNullable() {
    return publicKeyId;
  }

  @JsonProperty(JSON_PROPERTY_PUBLIC_KEY_ID)
  public void setPublicKeyId_JsonNullable(JsonNullable<String> publicKeyId) {
    this.publicKeyId = publicKeyId;
  }

  public void setPublicKeyId(String publicKeyId) {
    this.publicKeyId = JsonNullable.<String>of(publicKeyId);
  }

  public NebiusCloudIntegrationAccountServiceAccountAuthUpdate serviceAccountId(
      String serviceAccountId) {
    this.serviceAccountId = serviceAccountId;
    return this;
  }

  /**
   * Non-secret ID of the Nebius service account the account authenticates as. It cannot be cleared;
   * sending <code>null</code> or an empty string is rejected with a <code>422</code> response.
   *
   * @return serviceAccountId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getServiceAccountId() {
    return serviceAccountId;
  }

  public void setServiceAccountId(String serviceAccountId) {
    this.serviceAccountId = serviceAccountId;
  }

  public NebiusCloudIntegrationAccountServiceAccountAuthUpdate staticApiKey(String staticApiKey) {
    this.staticApiKey = staticApiKey;
    return this;
  }

  /**
   * Nebius static API key with the OBSERVABILITY scope. Omit it to keep the stored one; an empty
   * string is rejected with a <code>422</code> response.
   *
   * @return staticApiKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATIC_API_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStaticApiKey() {
    return staticApiKey;
  }

  public void setStaticApiKey(String staticApiKey) {
    this.staticApiKey = staticApiKey;
  }

  /**
   * Return true if this NebiusCloudIntegrationAccountServiceAccountAuthUpdate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NebiusCloudIntegrationAccountServiceAccountAuthUpdate
        nebiusCloudIntegrationAccountServiceAccountAuthUpdate =
            (NebiusCloudIntegrationAccountServiceAccountAuthUpdate) o;
    return Objects.equals(
            this.authType, nebiusCloudIntegrationAccountServiceAccountAuthUpdate.authType)
        && Objects.equals(
            this.privateKey, nebiusCloudIntegrationAccountServiceAccountAuthUpdate.privateKey)
        && Objects.equals(
            this.publicKeyId, nebiusCloudIntegrationAccountServiceAccountAuthUpdate.publicKeyId)
        && Objects.equals(
            this.serviceAccountId,
            nebiusCloudIntegrationAccountServiceAccountAuthUpdate.serviceAccountId)
        && Objects.equals(
            this.staticApiKey, nebiusCloudIntegrationAccountServiceAccountAuthUpdate.staticApiKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, privateKey, publicKeyId, serviceAccountId, staticApiKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NebiusCloudIntegrationAccountServiceAccountAuthUpdate {\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    publicKeyId: ").append(toIndentedString(publicKeyId)).append("\n");
    sb.append("    serviceAccountId: ").append(toIndentedString(serviceAccountId)).append("\n");
    sb.append("    staticApiKey: ").append(toIndentedString(staticApiKey)).append("\n");
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
