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

/** Authenticate using a Microsoft Entra application client certificate. */
@JsonPropertyOrder({
  ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate
      .JSON_PROPERTY_AZURE_CLIENT_ID,
  ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate
      .JSON_PROPERTY_AZURE_CREDENTIAL_KIND,
  ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate
      .JSON_PROPERTY_AZURE_TENANT_ID,
  ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate
      .JSON_PROPERTY_CERTIFICATE_PASSWORD_KEY,
  ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate
      .JSON_PROPERTY_CERTIFICATE_PATH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AZURE_CLIENT_ID = "azure_client_id";
  private String azureClientId;

  public static final String JSON_PROPERTY_AZURE_CREDENTIAL_KIND = "azure_credential_kind";
  private ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificateKind
      azureCredentialKind =
          ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificateKind
              .CLIENT_CERTIFICATE_CREDENTIAL;

  public static final String JSON_PROPERTY_AZURE_TENANT_ID = "azure_tenant_id";
  private String azureTenantId;

  public static final String JSON_PROPERTY_CERTIFICATE_PASSWORD_KEY = "certificate_password_key";
  private JsonNullable<String> certificatePasswordKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CERTIFICATE_PATH = "certificate_path";
  private String certificatePath;

  public ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate() {}

  @JsonCreator
  public ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate(
      @JsonProperty(required = true, value = JSON_PROPERTY_AZURE_CLIENT_ID) String azureClientId,
      @JsonProperty(required = true, value = JSON_PROPERTY_AZURE_CREDENTIAL_KIND)
          ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificateKind
              azureCredentialKind,
      @JsonProperty(required = true, value = JSON_PROPERTY_AZURE_TENANT_ID) String azureTenantId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CERTIFICATE_PATH)
          String certificatePath) {
    this.azureClientId = azureClientId;
    this.azureCredentialKind = azureCredentialKind;
    this.unparsed |= !azureCredentialKind.isValid();
    this.azureTenantId = azureTenantId;
    this.certificatePath = certificatePath;
  }

  public ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate azureClientId(
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

  public ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate azureCredentialKind(
      ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificateKind
          azureCredentialKind) {
    this.azureCredentialKind = azureCredentialKind;
    this.unparsed |= !azureCredentialKind.isValid();
    return this;
  }

  /**
   * The Azure credential kind. The value should always be <code>client_certificate_credential
   * </code>.
   *
   * @return azureCredentialKind
   */
  @JsonProperty(JSON_PROPERTY_AZURE_CREDENTIAL_KIND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificateKind
      getAzureCredentialKind() {
    return azureCredentialKind;
  }

  public void setAzureCredentialKind(
      ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificateKind
          azureCredentialKind) {
    if (!azureCredentialKind.isValid()) {
      this.unparsed = true;
    }
    this.azureCredentialKind = azureCredentialKind;
  }

  public ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate azureTenantId(
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

  public ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate
      certificatePasswordKey(String certificatePasswordKey) {
    this.certificatePasswordKey = JsonNullable.<String>of(certificatePasswordKey);
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the password for the client certificate.
   *
   * @return certificatePasswordKey
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getCertificatePasswordKey() {
    return certificatePasswordKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CERTIFICATE_PASSWORD_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCertificatePasswordKey_JsonNullable() {
    return certificatePasswordKey;
  }

  @JsonProperty(JSON_PROPERTY_CERTIFICATE_PASSWORD_KEY)
  public void setCertificatePasswordKey_JsonNullable(JsonNullable<String> certificatePasswordKey) {
    this.certificatePasswordKey = certificatePasswordKey;
  }

  public void setCertificatePasswordKey(String certificatePasswordKey) {
    this.certificatePasswordKey = JsonNullable.<String>of(certificatePasswordKey);
  }

  public ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate certificatePath(
      String certificatePath) {
    this.certificatePath = certificatePath;
    return this;
  }

  /**
   * Path to the <code>.pfx</code> client certificate file on the Worker.
   *
   * @return certificatePath
   */
  @JsonProperty(JSON_PROPERTY_CERTIFICATE_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCertificatePath() {
    return certificatePath;
  }

  public void setCertificatePath(String certificatePath) {
    this.certificatePath = certificatePath;
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
   * @return ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate
   */
  @JsonAnySetter
  public ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate
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
   * Return true if this ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate
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
    ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate
        observabilityPipelineAzureDataExplorerDestinationAuthClientCertificate =
            (ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate) o;
    return Objects.equals(
            this.azureClientId,
            observabilityPipelineAzureDataExplorerDestinationAuthClientCertificate.azureClientId)
        && Objects.equals(
            this.azureCredentialKind,
            observabilityPipelineAzureDataExplorerDestinationAuthClientCertificate
                .azureCredentialKind)
        && Objects.equals(
            this.azureTenantId,
            observabilityPipelineAzureDataExplorerDestinationAuthClientCertificate.azureTenantId)
        && Objects.equals(
            this.certificatePasswordKey,
            observabilityPipelineAzureDataExplorerDestinationAuthClientCertificate
                .certificatePasswordKey)
        && Objects.equals(
            this.certificatePath,
            observabilityPipelineAzureDataExplorerDestinationAuthClientCertificate.certificatePath)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineAzureDataExplorerDestinationAuthClientCertificate
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        azureClientId,
        azureCredentialKind,
        azureTenantId,
        certificatePasswordKey,
        certificatePath,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineAzureDataExplorerDestinationAuthClientCertificate {\n");
    sb.append("    azureClientId: ").append(toIndentedString(azureClientId)).append("\n");
    sb.append("    azureCredentialKind: ")
        .append(toIndentedString(azureCredentialKind))
        .append("\n");
    sb.append("    azureTenantId: ").append(toIndentedString(azureTenantId)).append("\n");
    sb.append("    certificatePasswordKey: ")
        .append(toIndentedString(certificatePasswordKey))
        .append("\n");
    sb.append("    certificatePath: ").append(toIndentedString(certificatePath)).append("\n");
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
