/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** SSL/TLS certificate information returned from an SSL test. */
@JsonPropertyOrder({
  SyntheticsTestResultCertificate.JSON_PROPERTY_CIPHER,
  SyntheticsTestResultCertificate.JSON_PROPERTY_EXPONENT,
  SyntheticsTestResultCertificate.JSON_PROPERTY_EXT_KEY_USAGE,
  SyntheticsTestResultCertificate.JSON_PROPERTY_FINGERPRINT,
  SyntheticsTestResultCertificate.JSON_PROPERTY_FINGERPRINT256,
  SyntheticsTestResultCertificate.JSON_PROPERTY_ISSUER,
  SyntheticsTestResultCertificate.JSON_PROPERTY_MODULUS,
  SyntheticsTestResultCertificate.JSON_PROPERTY_PROTOCOL,
  SyntheticsTestResultCertificate.JSON_PROPERTY_SERIAL_NUMBER,
  SyntheticsTestResultCertificate.JSON_PROPERTY_SUBJECT,
  SyntheticsTestResultCertificate.JSON_PROPERTY_TLS_VERSION,
  SyntheticsTestResultCertificate.JSON_PROPERTY_VALID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultCertificate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CIPHER = "cipher";
  private String cipher;

  public static final String JSON_PROPERTY_EXPONENT = "exponent";
  private Long exponent;

  public static final String JSON_PROPERTY_EXT_KEY_USAGE = "ext_key_usage";
  private List<String> extKeyUsage = null;

  public static final String JSON_PROPERTY_FINGERPRINT = "fingerprint";
  private String fingerprint;

  public static final String JSON_PROPERTY_FINGERPRINT256 = "fingerprint256";
  private String fingerprint256;

  public static final String JSON_PROPERTY_ISSUER = "issuer";
  private Map<String, String> issuer = null;

  public static final String JSON_PROPERTY_MODULUS = "modulus";
  private String modulus;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private String protocol;

  public static final String JSON_PROPERTY_SERIAL_NUMBER = "serial_number";
  private String serialNumber;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private Map<String, String> subject = null;

  public static final String JSON_PROPERTY_TLS_VERSION = "tls_version";
  private Double tlsVersion;

  public static final String JSON_PROPERTY_VALID = "valid";
  private SyntheticsTestResultCertificateValidity valid;

  public SyntheticsTestResultCertificate cipher(String cipher) {
    this.cipher = cipher;
    return this;
  }

  /**
   * Cipher used for the TLS connection.
   *
   * @return cipher
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CIPHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCipher() {
    return cipher;
  }

  public void setCipher(String cipher) {
    this.cipher = cipher;
  }

  public SyntheticsTestResultCertificate exponent(Long exponent) {
    this.exponent = exponent;
    return this;
  }

  /**
   * RSA exponent of the certificate.
   *
   * @return exponent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPONENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getExponent() {
    return exponent;
  }

  public void setExponent(Long exponent) {
    this.exponent = exponent;
  }

  public SyntheticsTestResultCertificate extKeyUsage(List<String> extKeyUsage) {
    this.extKeyUsage = extKeyUsage;
    return this;
  }

  public SyntheticsTestResultCertificate addExtKeyUsageItem(String extKeyUsageItem) {
    if (this.extKeyUsage == null) {
      this.extKeyUsage = new ArrayList<>();
    }
    this.extKeyUsage.add(extKeyUsageItem);
    return this;
  }

  /**
   * Extended key usage extensions for the certificate.
   *
   * @return extKeyUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXT_KEY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getExtKeyUsage() {
    return extKeyUsage;
  }

  public void setExtKeyUsage(List<String> extKeyUsage) {
    this.extKeyUsage = extKeyUsage;
  }

  public SyntheticsTestResultCertificate fingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * SHA-1 fingerprint of the certificate.
   *
   * @return fingerprint
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FINGERPRINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFingerprint() {
    return fingerprint;
  }

  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }

  public SyntheticsTestResultCertificate fingerprint256(String fingerprint256) {
    this.fingerprint256 = fingerprint256;
    return this;
  }

  /**
   * SHA-256 fingerprint of the certificate.
   *
   * @return fingerprint256
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FINGERPRINT256)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFingerprint256() {
    return fingerprint256;
  }

  public void setFingerprint256(String fingerprint256) {
    this.fingerprint256 = fingerprint256;
  }

  public SyntheticsTestResultCertificate issuer(Map<String, String> issuer) {
    this.issuer = issuer;
    return this;
  }

  public SyntheticsTestResultCertificate putIssuerItem(String key, String issuerItem) {
    if (this.issuer == null) {
      this.issuer = new HashMap<>();
    }
    this.issuer.put(key, issuerItem);
    return this;
  }

  /**
   * Certificate issuer details.
   *
   * @return issuer
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getIssuer() {
    return issuer;
  }

  public void setIssuer(Map<String, String> issuer) {
    this.issuer = issuer;
  }

  public SyntheticsTestResultCertificate modulus(String modulus) {
    this.modulus = modulus;
    return this;
  }

  /**
   * RSA modulus of the certificate.
   *
   * @return modulus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODULUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getModulus() {
    return modulus;
  }

  public void setModulus(String modulus) {
    this.modulus = modulus;
  }

  public SyntheticsTestResultCertificate protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * TLS protocol used (for example, <code>TLSv1.2</code>).
   *
   * @return protocol
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public SyntheticsTestResultCertificate serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Serial number of the certificate.
   *
   * @return serialNumber
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERIAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public SyntheticsTestResultCertificate subject(Map<String, String> subject) {
    this.subject = subject;
    return this;
  }

  public SyntheticsTestResultCertificate putSubjectItem(String key, String subjectItem) {
    if (this.subject == null) {
      this.subject = new HashMap<>();
    }
    this.subject.put(key, subjectItem);
    return this;
  }

  /**
   * Certificate subject details.
   *
   * @return subject
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getSubject() {
    return subject;
  }

  public void setSubject(Map<String, String> subject) {
    this.subject = subject;
  }

  public SyntheticsTestResultCertificate tlsVersion(Double tlsVersion) {
    this.tlsVersion = tlsVersion;
    return this;
  }

  /**
   * TLS protocol version.
   *
   * @return tlsVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TLS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTlsVersion() {
    return tlsVersion;
  }

  public void setTlsVersion(Double tlsVersion) {
    this.tlsVersion = tlsVersion;
  }

  public SyntheticsTestResultCertificate valid(SyntheticsTestResultCertificateValidity valid) {
    this.valid = valid;
    this.unparsed |= valid.unparsed;
    return this;
  }

  /**
   * Validity window of a certificate.
   *
   * @return valid
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultCertificateValidity getValid() {
    return valid;
  }

  public void setValid(SyntheticsTestResultCertificateValidity valid) {
    this.valid = valid;
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
   * @return SyntheticsTestResultCertificate
   */
  @JsonAnySetter
  public SyntheticsTestResultCertificate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultCertificate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultCertificate syntheticsTestResultCertificate =
        (SyntheticsTestResultCertificate) o;
    return Objects.equals(this.cipher, syntheticsTestResultCertificate.cipher)
        && Objects.equals(this.exponent, syntheticsTestResultCertificate.exponent)
        && Objects.equals(this.extKeyUsage, syntheticsTestResultCertificate.extKeyUsage)
        && Objects.equals(this.fingerprint, syntheticsTestResultCertificate.fingerprint)
        && Objects.equals(this.fingerprint256, syntheticsTestResultCertificate.fingerprint256)
        && Objects.equals(this.issuer, syntheticsTestResultCertificate.issuer)
        && Objects.equals(this.modulus, syntheticsTestResultCertificate.modulus)
        && Objects.equals(this.protocol, syntheticsTestResultCertificate.protocol)
        && Objects.equals(this.serialNumber, syntheticsTestResultCertificate.serialNumber)
        && Objects.equals(this.subject, syntheticsTestResultCertificate.subject)
        && Objects.equals(this.tlsVersion, syntheticsTestResultCertificate.tlsVersion)
        && Objects.equals(this.valid, syntheticsTestResultCertificate.valid)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultCertificate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cipher,
        exponent,
        extKeyUsage,
        fingerprint,
        fingerprint256,
        issuer,
        modulus,
        protocol,
        serialNumber,
        subject,
        tlsVersion,
        valid,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultCertificate {\n");
    sb.append("    cipher: ").append(toIndentedString(cipher)).append("\n");
    sb.append("    exponent: ").append(toIndentedString(exponent)).append("\n");
    sb.append("    extKeyUsage: ").append(toIndentedString(extKeyUsage)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    fingerprint256: ").append(toIndentedString(fingerprint256)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    modulus: ").append(toIndentedString(modulus)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    tlsVersion: ").append(toIndentedString(tlsVersion)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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
