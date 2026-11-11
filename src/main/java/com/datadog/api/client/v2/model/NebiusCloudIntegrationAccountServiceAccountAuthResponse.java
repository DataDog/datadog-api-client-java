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

/** The service-account key pair authentication method configured on the account. */
@JsonPropertyOrder({
  NebiusCloudIntegrationAccountServiceAccountAuthResponse.JSON_PROPERTY_AUTH_TYPE,
  NebiusCloudIntegrationAccountServiceAccountAuthResponse.JSON_PROPERTY_PUBLIC_KEY_ID,
  NebiusCloudIntegrationAccountServiceAccountAuthResponse.JSON_PROPERTY_SERVICE_ACCOUNT_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NebiusCloudIntegrationAccountServiceAccountAuthResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_TYPE = "auth_type";
  private NebiusCloudIntegrationAccountServiceAccountAuthType authType =
      NebiusCloudIntegrationAccountServiceAccountAuthType.NEBIUS_SERVICE_ACCOUNT;

  public static final String JSON_PROPERTY_PUBLIC_KEY_ID = "public_key_id";
  private String publicKeyId;

  public static final String JSON_PROPERTY_SERVICE_ACCOUNT_ID = "service_account_id";
  private String serviceAccountId;

  public NebiusCloudIntegrationAccountServiceAccountAuthResponse() {}

  @JsonCreator
  public NebiusCloudIntegrationAccountServiceAccountAuthResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH_TYPE)
          NebiusCloudIntegrationAccountServiceAccountAuthType authType,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE_ACCOUNT_ID)
          String serviceAccountId) {
    this.authType = authType;
    this.unparsed |= !authType.isValid();
    this.serviceAccountId = serviceAccountId;
  }

  public NebiusCloudIntegrationAccountServiceAccountAuthResponse authType(
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

  public NebiusCloudIntegrationAccountServiceAccountAuthResponse publicKeyId(String publicKeyId) {
    this.publicKeyId = publicKeyId;
    return this;
  }

  /**
   * ID of the public key half of the authorized key pair. Omitted when unset.
   *
   * @return publicKeyId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_KEY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicKeyId() {
    return publicKeyId;
  }

  public void setPublicKeyId(String publicKeyId) {
    this.publicKeyId = publicKeyId;
  }

  public NebiusCloudIntegrationAccountServiceAccountAuthResponse serviceAccountId(
      String serviceAccountId) {
    this.serviceAccountId = serviceAccountId;
    return this;
  }

  /**
   * ID of the Nebius service account the account authenticates as.
   *
   * @return serviceAccountId
   */
  @JsonProperty(JSON_PROPERTY_SERVICE_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getServiceAccountId() {
    return serviceAccountId;
  }

  public void setServiceAccountId(String serviceAccountId) {
    this.serviceAccountId = serviceAccountId;
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
   * @return NebiusCloudIntegrationAccountServiceAccountAuthResponse
   */
  @JsonAnySetter
  public NebiusCloudIntegrationAccountServiceAccountAuthResponse putAdditionalProperty(
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
   * Return true if this NebiusCloudIntegrationAccountServiceAccountAuthResponse object is equal to
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
    NebiusCloudIntegrationAccountServiceAccountAuthResponse
        nebiusCloudIntegrationAccountServiceAccountAuthResponse =
            (NebiusCloudIntegrationAccountServiceAccountAuthResponse) o;
    return Objects.equals(
            this.authType, nebiusCloudIntegrationAccountServiceAccountAuthResponse.authType)
        && Objects.equals(
            this.publicKeyId, nebiusCloudIntegrationAccountServiceAccountAuthResponse.publicKeyId)
        && Objects.equals(
            this.serviceAccountId,
            nebiusCloudIntegrationAccountServiceAccountAuthResponse.serviceAccountId)
        && Objects.equals(
            this.additionalProperties,
            nebiusCloudIntegrationAccountServiceAccountAuthResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, publicKeyId, serviceAccountId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NebiusCloudIntegrationAccountServiceAccountAuthResponse {\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    publicKeyId: ").append(toIndentedString(publicKeyId)).append("\n");
    sb.append("    serviceAccountId: ").append(toIndentedString(serviceAccountId)).append("\n");
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
