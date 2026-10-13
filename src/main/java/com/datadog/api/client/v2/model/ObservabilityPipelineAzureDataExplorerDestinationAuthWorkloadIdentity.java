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

/** Authenticate using Azure Workload Identity (for example, on Kubernetes). */
@JsonPropertyOrder({
  ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity
      .JSON_PROPERTY_AZURE_CREDENTIAL_KIND,
  ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity.JSON_PROPERTY_CLIENT_ID,
  ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity.JSON_PROPERTY_TENANT_ID,
  ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity
      .JSON_PROPERTY_TOKEN_FILE_PATH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AZURE_CREDENTIAL_KIND = "azure_credential_kind";
  private ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentityKind
      azureCredentialKind =
          ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentityKind
              .WORKLOAD_IDENTITY;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private JsonNullable<String> clientId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TENANT_ID = "tenant_id";
  private JsonNullable<String> tenantId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TOKEN_FILE_PATH = "token_file_path";
  private JsonNullable<String> tokenFilePath = JsonNullable.<String>undefined();

  public ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity() {}

  @JsonCreator
  public ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity(
      @JsonProperty(required = true, value = JSON_PROPERTY_AZURE_CREDENTIAL_KIND)
          ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentityKind
              azureCredentialKind) {
    this.azureCredentialKind = azureCredentialKind;
    this.unparsed |= !azureCredentialKind.isValid();
  }

  public ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity azureCredentialKind(
      ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentityKind
          azureCredentialKind) {
    this.azureCredentialKind = azureCredentialKind;
    this.unparsed |= !azureCredentialKind.isValid();
    return this;
  }

  /**
   * The Azure credential kind. The value should always be <code>workload_identity</code>.
   *
   * @return azureCredentialKind
   */
  @JsonProperty(JSON_PROPERTY_AZURE_CREDENTIAL_KIND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentityKind
      getAzureCredentialKind() {
    return azureCredentialKind;
  }

  public void setAzureCredentialKind(
      ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentityKind
          azureCredentialKind) {
    if (!azureCredentialKind.isValid()) {
      this.unparsed = true;
    }
    this.azureCredentialKind = azureCredentialKind;
  }

  public ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity clientId(
      String clientId) {
    this.clientId = JsonNullable.<String>of(clientId);
    return this;
  }

  /**
   * The client ID of the Microsoft Entra application. If omitted, it is read from the environment.
   *
   * @return clientId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getClientId() {
    return clientId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getClientId_JsonNullable() {
    return clientId;
  }

  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  public void setClientId_JsonNullable(JsonNullable<String> clientId) {
    this.clientId = clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = JsonNullable.<String>of(clientId);
  }

  public ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity tenantId(
      String tenantId) {
    this.tenantId = JsonNullable.<String>of(tenantId);
    return this;
  }

  /**
   * The Microsoft Entra tenant ID. If omitted, it is read from the environment.
   *
   * @return tenantId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getTenantId() {
    return tenantId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTenantId_JsonNullable() {
    return tenantId;
  }

  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  public void setTenantId_JsonNullable(JsonNullable<String> tenantId) {
    this.tenantId = tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = JsonNullable.<String>of(tenantId);
  }

  public ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity tokenFilePath(
      String tokenFilePath) {
    this.tokenFilePath = JsonNullable.<String>of(tokenFilePath);
    return this;
  }

  /**
   * Path to the federated token file. If omitted, it is read from the environment.
   *
   * @return tokenFilePath
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getTokenFilePath() {
    return tokenFilePath.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TOKEN_FILE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTokenFilePath_JsonNullable() {
    return tokenFilePath;
  }

  @JsonProperty(JSON_PROPERTY_TOKEN_FILE_PATH)
  public void setTokenFilePath_JsonNullable(JsonNullable<String> tokenFilePath) {
    this.tokenFilePath = tokenFilePath;
  }

  public void setTokenFilePath(String tokenFilePath) {
    this.tokenFilePath = JsonNullable.<String>of(tokenFilePath);
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
   * @return ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity
   */
  @JsonAnySetter
  public ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity
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
   * Return true if this ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity
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
    ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity
        observabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity =
            (ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity) o;
    return Objects.equals(
            this.azureCredentialKind,
            observabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity
                .azureCredentialKind)
        && Objects.equals(
            this.clientId,
            observabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity.clientId)
        && Objects.equals(
            this.tenantId,
            observabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity.tenantId)
        && Objects.equals(
            this.tokenFilePath,
            observabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity.tokenFilePath)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        azureCredentialKind, clientId, tenantId, tokenFilePath, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineAzureDataExplorerDestinationAuthWorkloadIdentity {\n");
    sb.append("    azureCredentialKind: ")
        .append(toIndentedString(azureCredentialKind))
        .append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    tokenFilePath: ").append(toIndentedString(tokenFilePath)).append("\n");
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
