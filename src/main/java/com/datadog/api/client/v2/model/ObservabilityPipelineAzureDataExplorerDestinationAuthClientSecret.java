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

/** Authenticate using a Microsoft Entra application client secret. */
@JsonPropertyOrder({
  ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret.JSON_PROPERTY_AZURE_CLIENT_ID,
  ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret
      .JSON_PROPERTY_AZURE_CLIENT_SECRET_KEY,
  ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret
      .JSON_PROPERTY_AZURE_CREDENTIAL_KIND,
  ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret.JSON_PROPERTY_AZURE_TENANT_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AZURE_CLIENT_ID = "azure_client_id";
  private String azureClientId;

  public static final String JSON_PROPERTY_AZURE_CLIENT_SECRET_KEY = "azure_client_secret_key";
  private String azureClientSecretKey;

  public static final String JSON_PROPERTY_AZURE_CREDENTIAL_KIND = "azure_credential_kind";
  private ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecretKind
      azureCredentialKind =
          ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecretKind
              .CLIENT_SECRET_CREDENTIAL;

  public static final String JSON_PROPERTY_AZURE_TENANT_ID = "azure_tenant_id";
  private String azureTenantId;

  public ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret() {}

  @JsonCreator
  public ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret(
      @JsonProperty(required = true, value = JSON_PROPERTY_AZURE_CLIENT_ID) String azureClientId,
      @JsonProperty(required = true, value = JSON_PROPERTY_AZURE_CLIENT_SECRET_KEY)
          String azureClientSecretKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_AZURE_CREDENTIAL_KIND)
          ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecretKind azureCredentialKind,
      @JsonProperty(required = true, value = JSON_PROPERTY_AZURE_TENANT_ID) String azureTenantId) {
    this.azureClientId = azureClientId;
    this.azureClientSecretKey = azureClientSecretKey;
    this.azureCredentialKind = azureCredentialKind;
    this.unparsed |= !azureCredentialKind.isValid();
    this.azureTenantId = azureTenantId;
  }

  public ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret azureClientId(
      String azureClientId) {
    this.azureClientId = azureClientId;
    return this;
  }

  /**
   * The Microsoft Entra application (client) ID.
   *
   * @return azureClientId
   */
  @JsonProperty(JSON_PROPERTY_AZURE_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAzureClientId() {
    return azureClientId;
  }

  public void setAzureClientId(String azureClientId) {
    this.azureClientId = azureClientId;
  }

  public ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret azureClientSecretKey(
      String azureClientSecretKey) {
    this.azureClientSecretKey = azureClientSecretKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the Microsoft Entra application client
   * secret.
   *
   * @return azureClientSecretKey
   */
  @JsonProperty(JSON_PROPERTY_AZURE_CLIENT_SECRET_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAzureClientSecretKey() {
    return azureClientSecretKey;
  }

  public void setAzureClientSecretKey(String azureClientSecretKey) {
    this.azureClientSecretKey = azureClientSecretKey;
  }

  public ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret azureCredentialKind(
      ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecretKind azureCredentialKind) {
    this.azureCredentialKind = azureCredentialKind;
    this.unparsed |= !azureCredentialKind.isValid();
    return this;
  }

  /**
   * The Azure credential kind. The value should always be <code>client_secret_credential</code>.
   *
   * @return azureCredentialKind
   */
  @JsonProperty(JSON_PROPERTY_AZURE_CREDENTIAL_KIND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecretKind
      getAzureCredentialKind() {
    return azureCredentialKind;
  }

  public void setAzureCredentialKind(
      ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecretKind azureCredentialKind) {
    if (!azureCredentialKind.isValid()) {
      this.unparsed = true;
    }
    this.azureCredentialKind = azureCredentialKind;
  }

  public ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret azureTenantId(
      String azureTenantId) {
    this.azureTenantId = azureTenantId;
    return this;
  }

  /**
   * The Microsoft Entra tenant ID.
   *
   * @return azureTenantId
   */
  @JsonProperty(JSON_PROPERTY_AZURE_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAzureTenantId() {
    return azureTenantId;
  }

  public void setAzureTenantId(String azureTenantId) {
    this.azureTenantId = azureTenantId;
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
   * @return ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret
   */
  @JsonAnySetter
  public ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret putAdditionalProperty(
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
   * Return true if this ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret object is
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
    ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret
        observabilityPipelineAzureDataExplorerDestinationAuthClientSecret =
            (ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret) o;
    return Objects.equals(
            this.azureClientId,
            observabilityPipelineAzureDataExplorerDestinationAuthClientSecret.azureClientId)
        && Objects.equals(
            this.azureClientSecretKey,
            observabilityPipelineAzureDataExplorerDestinationAuthClientSecret.azureClientSecretKey)
        && Objects.equals(
            this.azureCredentialKind,
            observabilityPipelineAzureDataExplorerDestinationAuthClientSecret.azureCredentialKind)
        && Objects.equals(
            this.azureTenantId,
            observabilityPipelineAzureDataExplorerDestinationAuthClientSecret.azureTenantId)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineAzureDataExplorerDestinationAuthClientSecret.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        azureClientId,
        azureClientSecretKey,
        azureCredentialKind,
        azureTenantId,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecret {\n");
    sb.append("    azureClientId: ").append(toIndentedString(azureClientId)).append("\n");
    sb.append("    azureClientSecretKey: ")
        .append(toIndentedString(azureClientSecretKey))
        .append("\n");
    sb.append("    azureCredentialKind: ")
        .append(toIndentedString(azureCredentialKind))
        .append("\n");
    sb.append("    azureTenantId: ").append(toIndentedString(azureTenantId)).append("\n");
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
