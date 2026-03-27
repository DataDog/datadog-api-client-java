/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Client certificate to use when performing the test request. */
@JsonPropertyOrder({
  SyntheticsTestRequestCertificate.JSON_PROPERTY_CERT,
  SyntheticsTestRequestCertificate.JSON_PROPERTY_KEY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestRequestCertificate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CERT = "cert";
  private SyntheticsTestRequestCertificateItem cert;

  public static final String JSON_PROPERTY_KEY = "key";
  private SyntheticsTestRequestCertificateItem key;

  public SyntheticsTestRequestCertificate cert(SyntheticsTestRequestCertificateItem cert) {
    this.cert = cert;
    this.unparsed |= cert.unparsed;
    return this;
  }

  /**
   * Define a request certificate.
   *
   * @return cert
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestRequestCertificateItem getCert() {
    return cert;
  }

  public void setCert(SyntheticsTestRequestCertificateItem cert) {
    this.cert = cert;
  }

  public SyntheticsTestRequestCertificate key(SyntheticsTestRequestCertificateItem key) {
    this.key = key;
    this.unparsed |= key.unparsed;
    return this;
  }

  /**
   * Define a request certificate.
   *
   * @return key
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestRequestCertificateItem getKey() {
    return key;
  }

  public void setKey(SyntheticsTestRequestCertificateItem key) {
    this.key = key;
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
   * @return SyntheticsTestRequestCertificate
   */
  @JsonAnySetter
  public SyntheticsTestRequestCertificate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestRequestCertificate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestRequestCertificate syntheticsTestRequestCertificate =
        (SyntheticsTestRequestCertificate) o;
    return Objects.equals(this.cert, syntheticsTestRequestCertificate.cert)
        && Objects.equals(this.key, syntheticsTestRequestCertificate.key)
        && Objects.equals(
            this.additionalProperties, syntheticsTestRequestCertificate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cert, key, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestRequestCertificate {\n");
    sb.append("    cert: ").append(toIndentedString(cert)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
