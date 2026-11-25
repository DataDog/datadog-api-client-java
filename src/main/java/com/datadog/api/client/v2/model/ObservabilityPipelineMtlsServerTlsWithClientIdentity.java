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

/**
 * Configuration for enabling TLS encryption between the pipeline component and external connecting
 * clients, or mutual TLS when <code>verify_certificate</code> is <code>true</code>. Mutual TLS also
 * enables an optional allowlist of client certificate identities.
 */
@JsonPropertyOrder({
  ObservabilityPipelineMtlsServerTlsWithClientIdentity.JSON_PROPERTY_CA_FILE,
  ObservabilityPipelineMtlsServerTlsWithClientIdentity.JSON_PROPERTY_CLIENT_IDENTITY,
  ObservabilityPipelineMtlsServerTlsWithClientIdentity.JSON_PROPERTY_CRT_FILE,
  ObservabilityPipelineMtlsServerTlsWithClientIdentity.JSON_PROPERTY_KEY_FILE,
  ObservabilityPipelineMtlsServerTlsWithClientIdentity.JSON_PROPERTY_KEY_PASS_KEY,
  ObservabilityPipelineMtlsServerTlsWithClientIdentity.JSON_PROPERTY_VERIFY_CERTIFICATE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineMtlsServerTlsWithClientIdentity {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CA_FILE = "ca_file";
  private String caFile;

  public static final String JSON_PROPERTY_CLIENT_IDENTITY = "client_identity";
  private ObservabilityPipelineClientIdentity clientIdentity;

  public static final String JSON_PROPERTY_CRT_FILE = "crt_file";
  private String crtFile;

  public static final String JSON_PROPERTY_KEY_FILE = "key_file";
  private String keyFile;

  public static final String JSON_PROPERTY_KEY_PASS_KEY = "key_pass_key";
  private String keyPassKey;

  public static final String JSON_PROPERTY_VERIFY_CERTIFICATE = "verify_certificate";
  private Boolean verifyCertificate;

  public ObservabilityPipelineMtlsServerTlsWithClientIdentity() {}

  @JsonCreator
  public ObservabilityPipelineMtlsServerTlsWithClientIdentity(
      @JsonProperty(required = true, value = JSON_PROPERTY_CRT_FILE) String crtFile) {
    this.crtFile = crtFile;
  }

  public ObservabilityPipelineMtlsServerTlsWithClientIdentity caFile(String caFile) {
    this.caFile = caFile;
    return this;
  }

  /**
   * Path to the Certificate Authority (CA) file used to validate connecting clients' TLS
   * certificates.
   *
   * @return caFile
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CA_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCaFile() {
    return caFile;
  }

  public void setCaFile(String caFile) {
    this.caFile = caFile;
  }

  public ObservabilityPipelineMtlsServerTlsWithClientIdentity clientIdentity(
      ObservabilityPipelineClientIdentity clientIdentity) {
    this.clientIdentity = clientIdentity;
    this.unparsed |= clientIdentity.unparsed;
    return this;
  }

  /**
   * Restricts which clients may connect, based on the identities in their TLS certificate. Checks
   * run during the TLS handshake, after the client certificate chain is validated against <code>
   * ca_file</code>, and never relax that validation. Requires <code>verify_certificate: true</code>
   * and <code>ca_file</code>. Set exactly one of <code>allowlist_file</code> or <code>allowlist
   * </code>. When set, connections are closed after a maximum age of 300 seconds so that clients
   * removed from the allowlist are disconnected. Requires Observability Pipelines Worker 2.27 or
   * later.
   *
   * @return clientIdentity
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_IDENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineClientIdentity getClientIdentity() {
    return clientIdentity;
  }

  public void setClientIdentity(ObservabilityPipelineClientIdentity clientIdentity) {
    this.clientIdentity = clientIdentity;
    if (clientIdentity != null) {
      this.unparsed |= clientIdentity.unparsed;
    }
  }

  public ObservabilityPipelineMtlsServerTlsWithClientIdentity crtFile(String crtFile) {
    this.crtFile = crtFile;
    return this;
  }

  /**
   * Path to the TLS server certificate file used to identify the pipeline component to connecting
   * clients.
   *
   * @return crtFile
   */
  @JsonProperty(JSON_PROPERTY_CRT_FILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCrtFile() {
    return crtFile;
  }

  public void setCrtFile(String crtFile) {
    this.crtFile = crtFile;
  }

  public ObservabilityPipelineMtlsServerTlsWithClientIdentity keyFile(String keyFile) {
    this.keyFile = keyFile;
    return this;
  }

  /**
   * Path to the private key file associated with the TLS server certificate.
   *
   * @return keyFile
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKeyFile() {
    return keyFile;
  }

  public void setKeyFile(String keyFile) {
    this.keyFile = keyFile;
  }

  public ObservabilityPipelineMtlsServerTlsWithClientIdentity keyPassKey(String keyPassKey) {
    this.keyPassKey = keyPassKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the passphrase for the private key file.
   *
   * @return keyPassKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY_PASS_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKeyPassKey() {
    return keyPassKey;
  }

  public void setKeyPassKey(String keyPassKey) {
    this.keyPassKey = keyPassKey;
  }

  public ObservabilityPipelineMtlsServerTlsWithClientIdentity verifyCertificate(
      Boolean verifyCertificate) {
    this.verifyCertificate = verifyCertificate;
    return this;
  }

  /**
   * When <code>true</code>, requires client connections to present a valid certificate, enabling
   * mutual TLS authentication.
   *
   * @return verifyCertificate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERIFY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getVerifyCertificate() {
    return verifyCertificate;
  }

  public void setVerifyCertificate(Boolean verifyCertificate) {
    this.verifyCertificate = verifyCertificate;
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
   * @return ObservabilityPipelineMtlsServerTlsWithClientIdentity
   */
  @JsonAnySetter
  public ObservabilityPipelineMtlsServerTlsWithClientIdentity putAdditionalProperty(
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
   * Return true if this ObservabilityPipelineMtlsServerTlsWithClientIdentity object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineMtlsServerTlsWithClientIdentity
        observabilityPipelineMtlsServerTlsWithClientIdentity =
            (ObservabilityPipelineMtlsServerTlsWithClientIdentity) o;
    return Objects.equals(this.caFile, observabilityPipelineMtlsServerTlsWithClientIdentity.caFile)
        && Objects.equals(
            this.clientIdentity,
            observabilityPipelineMtlsServerTlsWithClientIdentity.clientIdentity)
        && Objects.equals(
            this.crtFile, observabilityPipelineMtlsServerTlsWithClientIdentity.crtFile)
        && Objects.equals(
            this.keyFile, observabilityPipelineMtlsServerTlsWithClientIdentity.keyFile)
        && Objects.equals(
            this.keyPassKey, observabilityPipelineMtlsServerTlsWithClientIdentity.keyPassKey)
        && Objects.equals(
            this.verifyCertificate,
            observabilityPipelineMtlsServerTlsWithClientIdentity.verifyCertificate)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineMtlsServerTlsWithClientIdentity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        caFile,
        clientIdentity,
        crtFile,
        keyFile,
        keyPassKey,
        verifyCertificate,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineMtlsServerTlsWithClientIdentity {\n");
    sb.append("    caFile: ").append(toIndentedString(caFile)).append("\n");
    sb.append("    clientIdentity: ").append(toIndentedString(clientIdentity)).append("\n");
    sb.append("    crtFile: ").append(toIndentedString(crtFile)).append("\n");
    sb.append("    keyFile: ").append(toIndentedString(keyFile)).append("\n");
    sb.append("    keyPassKey: ").append(toIndentedString(keyPassKey)).append("\n");
    sb.append("    verifyCertificate: ").append(toIndentedString(verifyCertificate)).append("\n");
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
