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
 * Configuration for enabling TLS encryption between the pipeline component and external services.
 */
@JsonPropertyOrder({
  ObservabilityPipelineTls.JSON_PROPERTY_CA_FILE,
  ObservabilityPipelineTls.JSON_PROPERTY_CRT_FILE,
  ObservabilityPipelineTls.JSON_PROPERTY_KEY_FILE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineTls {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CA_FILE = "ca_file";
  private String caFile;

  public static final String JSON_PROPERTY_CRT_FILE = "crt_file";
  private String crtFile;

  public static final String JSON_PROPERTY_KEY_FILE = "key_file";
  private String keyFile;

  public ObservabilityPipelineTls() {}

  @JsonCreator
  public ObservabilityPipelineTls(
      @JsonProperty(required = true, value = JSON_PROPERTY_CRT_FILE) String crtFile) {
    this.crtFile = crtFile;
  }

  public ObservabilityPipelineTls caFile(String caFile) {
    this.caFile = caFile;
    return this;
  }

  /**
   * Path to the Certificate Authority (CA) file used to validate the server’s TLS certificate.
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

  public ObservabilityPipelineTls crtFile(String crtFile) {
    this.crtFile = crtFile;
    return this;
  }

  /**
   * Path to the TLS client certificate file used to authenticate the pipeline component with
   * upstream or downstream services.
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

  public ObservabilityPipelineTls keyFile(String keyFile) {
    this.keyFile = keyFile;
    return this;
  }

  /**
   * Path to the private key file associated with the TLS client certificate. Used for mutual TLS
   * authentication.
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
   * @return ObservabilityPipelineTls
   */
  @JsonAnySetter
  public ObservabilityPipelineTls putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineTls object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineTls observabilityPipelineTls = (ObservabilityPipelineTls) o;
    return Objects.equals(this.caFile, observabilityPipelineTls.caFile)
        && Objects.equals(this.crtFile, observabilityPipelineTls.crtFile)
        && Objects.equals(this.keyFile, observabilityPipelineTls.keyFile)
        && Objects.equals(this.additionalProperties, observabilityPipelineTls.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caFile, crtFile, keyFile, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineTls {\n");
    sb.append("    caFile: ").append(toIndentedString(caFile)).append("\n");
    sb.append("    crtFile: ").append(toIndentedString(crtFile)).append("\n");
    sb.append("    keyFile: ").append(toIndentedString(keyFile)).append("\n");
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
