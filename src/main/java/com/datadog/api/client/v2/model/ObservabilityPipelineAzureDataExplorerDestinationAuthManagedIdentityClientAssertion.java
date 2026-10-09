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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Authenticate using a managed identity as a client assertion for a Microsoft Entra application.
 */
@JsonPropertyOrder({
  ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
      .JSON_PROPERTY_AZURE_CREDENTIAL_KIND,
  ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
      .JSON_PROPERTY_CLIENT_ASSERTION_CLIENT_ID,
  ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
      .JSON_PROPERTY_CLIENT_ASSERTION_TENANT_ID,
  ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
      .JSON_PROPERTY_USER_ASSIGNED_MANAGED_IDENTITY_ID,
  ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
      .JSON_PROPERTY_USER_ASSIGNED_MANAGED_IDENTITY_ID_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AZURE_CREDENTIAL_KIND = "azure_credential_kind";
  private ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertionKind
      azureCredentialKind =
          ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertionKind
              .MANAGED_IDENTITY_CLIENT_ASSERTION;

  public static final String JSON_PROPERTY_CLIENT_ASSERTION_CLIENT_ID =
      "client_assertion_client_id";
  private String clientAssertionClientId;

  public static final String JSON_PROPERTY_CLIENT_ASSERTION_TENANT_ID =
      "client_assertion_tenant_id";
  private String clientAssertionTenantId;

  public static final String JSON_PROPERTY_USER_ASSIGNED_MANAGED_IDENTITY_ID =
      "user_assigned_managed_identity_id";
  private JsonNullable<String> userAssignedManagedIdentityId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USER_ASSIGNED_MANAGED_IDENTITY_ID_TYPE =
      "user_assigned_managed_identity_id_type";
  private ObservabilityPipelineAzureDataExplorerDestinationManagedIdentityIdType
      userAssignedManagedIdentityIdType;

  public ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion() {}

  @JsonCreator
  public ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion(
      @JsonProperty(required = true, value = JSON_PROPERTY_AZURE_CREDENTIAL_KIND)
          ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertionKind
              azureCredentialKind,
      @JsonProperty(required = true, value = JSON_PROPERTY_CLIENT_ASSERTION_CLIENT_ID)
          String clientAssertionClientId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CLIENT_ASSERTION_TENANT_ID)
          String clientAssertionTenantId) {
    this.azureCredentialKind = azureCredentialKind;
    this.unparsed |= !azureCredentialKind.isValid();
    this.clientAssertionClientId = clientAssertionClientId;
    this.clientAssertionTenantId = clientAssertionTenantId;
  }

  public ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
      azureCredentialKind(
          ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertionKind
              azureCredentialKind) {
    this.azureCredentialKind = azureCredentialKind;
    this.unparsed |= !azureCredentialKind.isValid();
    return this;
  }

  /**
   * The Azure credential kind. The value should always be <code>managed_identity_client_assertion
   * </code>.
   *
   * @return azureCredentialKind
   */
  @JsonProperty(JSON_PROPERTY_AZURE_CREDENTIAL_KIND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertionKind
      getAzureCredentialKind() {
    return azureCredentialKind;
  }

  public void setAzureCredentialKind(
      ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertionKind
          azureCredentialKind) {
    if (!azureCredentialKind.isValid()) {
      this.unparsed = true;
    }
    this.azureCredentialKind = azureCredentialKind;
  }

  public ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
      clientAssertionClientId(String clientAssertionClientId) {
    this.clientAssertionClientId = clientAssertionClientId;
    return this;
  }

  /**
   * The client ID of the Microsoft Entra application that trusts the managed identity.
   *
   * @return clientAssertionClientId
   */
  @JsonProperty(JSON_PROPERTY_CLIENT_ASSERTION_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getClientAssertionClientId() {
    return clientAssertionClientId;
  }

  public void setClientAssertionClientId(String clientAssertionClientId) {
    this.clientAssertionClientId = clientAssertionClientId;
  }

  public ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
      clientAssertionTenantId(String clientAssertionTenantId) {
    this.clientAssertionTenantId = clientAssertionTenantId;
    return this;
  }

  /**
   * The tenant ID of the Microsoft Entra application that trusts the managed identity.
   *
   * @return clientAssertionTenantId
   */
  @JsonProperty(JSON_PROPERTY_CLIENT_ASSERTION_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getClientAssertionTenantId() {
    return clientAssertionTenantId;
  }

  public void setClientAssertionTenantId(String clientAssertionTenantId) {
    this.clientAssertionTenantId = clientAssertionTenantId;
  }

  public ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
      userAssignedManagedIdentityId(String userAssignedManagedIdentityId) {
    this.userAssignedManagedIdentityId = JsonNullable.<String>of(userAssignedManagedIdentityId);
    return this;
  }

  /**
   * The ID of the user-assigned managed identity. If omitted, the system-assigned managed identity
   * is used.
   *
   * @return userAssignedManagedIdentityId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getUserAssignedManagedIdentityId() {
    return userAssignedManagedIdentityId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_ASSIGNED_MANAGED_IDENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getUserAssignedManagedIdentityId_JsonNullable() {
    return userAssignedManagedIdentityId;
  }

  @JsonProperty(JSON_PROPERTY_USER_ASSIGNED_MANAGED_IDENTITY_ID)
  public void setUserAssignedManagedIdentityId_JsonNullable(
      JsonNullable<String> userAssignedManagedIdentityId) {
    this.userAssignedManagedIdentityId = userAssignedManagedIdentityId;
  }

  public void setUserAssignedManagedIdentityId(String userAssignedManagedIdentityId) {
    this.userAssignedManagedIdentityId = JsonNullable.<String>of(userAssignedManagedIdentityId);
  }

  public ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
      userAssignedManagedIdentityIdType(
          ObservabilityPipelineAzureDataExplorerDestinationManagedIdentityIdType
              userAssignedManagedIdentityIdType) {
    this.userAssignedManagedIdentityIdType = userAssignedManagedIdentityIdType;
    this.unparsed |= !userAssignedManagedIdentityIdType.isValid();
    return this;
  }

  /**
   * The type of the user-assigned managed identity ID.
   *
   * @return userAssignedManagedIdentityIdType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ASSIGNED_MANAGED_IDENTITY_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineAzureDataExplorerDestinationManagedIdentityIdType
      getUserAssignedManagedIdentityIdType() {
    return userAssignedManagedIdentityIdType;
  }

  public void setUserAssignedManagedIdentityIdType(
      ObservabilityPipelineAzureDataExplorerDestinationManagedIdentityIdType
          userAssignedManagedIdentityIdType) {
    if (!userAssignedManagedIdentityIdType.isValid()) {
      this.unparsed = true;
    }
    this.userAssignedManagedIdentityIdType = userAssignedManagedIdentityIdType;
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
   * @return ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
   */
  @JsonAnySetter
  public ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
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
   * Return true if this
   * ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion object is
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
    ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
        observabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion =
            (ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion) o;
    return Objects.equals(
            this.azureCredentialKind,
            observabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
                .azureCredentialKind)
        && Objects.equals(
            this.clientAssertionClientId,
            observabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
                .clientAssertionClientId)
        && Objects.equals(
            this.clientAssertionTenantId,
            observabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
                .clientAssertionTenantId)
        && Objects.equals(
            this.userAssignedManagedIdentityId,
            observabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
                .userAssignedManagedIdentityId)
        && Objects.equals(
            this.userAssignedManagedIdentityIdType,
            observabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
                .userAssignedManagedIdentityIdType)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        azureCredentialKind,
        clientAssertionClientId,
        clientAssertionTenantId,
        userAssignedManagedIdentityId,
        userAssignedManagedIdentityIdType,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(
        "class ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertion"
            + " {\n");
    sb.append("    azureCredentialKind: ")
        .append(toIndentedString(azureCredentialKind))
        .append("\n");
    sb.append("    clientAssertionClientId: ")
        .append(toIndentedString(clientAssertionClientId))
        .append("\n");
    sb.append("    clientAssertionTenantId: ")
        .append(toIndentedString(clientAssertionTenantId))
        .append("\n");
    sb.append("    userAssignedManagedIdentityId: ")
        .append(toIndentedString(userAssignedManagedIdentityId))
        .append("\n");
    sb.append("    userAssignedManagedIdentityIdType: ")
        .append(toIndentedString(userAssignedManagedIdentityIdType))
        .append("\n");
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
