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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Object describing the SSL certificate used for a Synthetic test. */
@JsonPropertyOrder({
  SyntheticsSSLCertificate.JSON_PROPERTY_CIPHER,
  SyntheticsSSLCertificate.JSON_PROPERTY_EXPONENT,
  SyntheticsSSLCertificate.JSON_PROPERTY_EXT_KEY_USAGE,
  SyntheticsSSLCertificate.JSON_PROPERTY_FINGERPRINT,
  SyntheticsSSLCertificate.JSON_PROPERTY_FINGERPRINT256,
  SyntheticsSSLCertificate.JSON_PROPERTY_ISSUER,
  SyntheticsSSLCertificate.JSON_PROPERTY_MODULUS,
  SyntheticsSSLCertificate.JSON_PROPERTY_PROTOCOL,
  SyntheticsSSLCertificate.JSON_PROPERTY_SERIAL_NUMBER,
  SyntheticsSSLCertificate.JSON_PROPERTY_SUBJECT,
  SyntheticsSSLCertificate.JSON_PROPERTY_VALID_FROM,
  SyntheticsSSLCertificate.JSON_PROPERTY_VALID_TO
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsSSLCertificate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CIPHER = "cipher";
  private String cipher;

  public static final String JSON_PROPERTY_EXPONENT = "exponent";
  private Double exponent;

  public static final String JSON_PROPERTY_EXT_KEY_USAGE = "extKeyUsage";
  private List<String> extKeyUsage = null;

  public static final String JSON_PROPERTY_FINGERPRINT = "fingerprint";
  private String fingerprint;

  public static final String JSON_PROPERTY_FINGERPRINT256 = "fingerprint256";
  private String fingerprint256;

  public static final String JSON_PROPERTY_ISSUER = "issuer";
  private SyntheticsSSLCertificateIssuer issuer;

  public static final String JSON_PROPERTY_MODULUS = "modulus";
  private String modulus;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private String protocol;

  public static final String JSON_PROPERTY_SERIAL_NUMBER = "serialNumber";
  private String serialNumber;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private SyntheticsSSLCertificateSubject subject;

  public static final String JSON_PROPERTY_VALID_FROM = "validFrom";
  private OffsetDateTime validFrom;

  public static final String JSON_PROPERTY_VALID_TO = "validTo";
  private OffsetDateTime validTo;

  public SyntheticsSSLCertificate cipher(String cipher) {
    this.cipher = cipher;
    return this;
  }

  /**
   * Cipher used for the connection.
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

  public SyntheticsSSLCertificate exponent(Double exponent) {
    this.exponent = exponent;
    return this;
  }

  /**
   * Exponent associated to the certificate.
   *
   * @return exponent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPONENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getExponent() {
    return exponent;
  }

  public void setExponent(Double exponent) {
    this.exponent = exponent;
  }

  public SyntheticsSSLCertificate extKeyUsage(List<String> extKeyUsage) {
    this.extKeyUsage = extKeyUsage;
    return this;
  }

  public SyntheticsSSLCertificate addExtKeyUsageItem(String extKeyUsageItem) {
    if (this.extKeyUsage == null) {
      this.extKeyUsage = new ArrayList<>();
    }
    this.extKeyUsage.add(extKeyUsageItem);
    return this;
  }

  /**
   * Array of extensions and details used for the certificate.
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

  public SyntheticsSSLCertificate fingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * MD5 digest of the DER-encoded Certificate information.
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

  public SyntheticsSSLCertificate fingerprint256(String fingerprint256) {
    this.fingerprint256 = fingerprint256;
    return this;
  }

  /**
   * SHA-1 digest of the DER-encoded Certificate information.
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

  public SyntheticsSSLCertificate issuer(SyntheticsSSLCertificateIssuer issuer) {
    this.issuer = issuer;
    this.unparsed |= issuer.unparsed;
    return this;
  }

  /**
   * Object describing the issuer of a SSL certificate.
   *
   * @return issuer
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsSSLCertificateIssuer getIssuer() {
    return issuer;
  }

  public void setIssuer(SyntheticsSSLCertificateIssuer issuer) {
    this.issuer = issuer;
  }

  public SyntheticsSSLCertificate modulus(String modulus) {
    this.modulus = modulus;
    return this;
  }

  /**
   * Modulus associated to the SSL certificate private key.
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

  public SyntheticsSSLCertificate protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * TLS protocol used for the test.
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

  public SyntheticsSSLCertificate serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Serial Number assigned by Symantec to the SSL certificate.
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

  public SyntheticsSSLCertificate subject(SyntheticsSSLCertificateSubject subject) {
    this.subject = subject;
    this.unparsed |= subject.unparsed;
    return this;
  }

  /**
   * Object describing the SSL certificate used for the test.
   *
   * @return subject
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsSSLCertificateSubject getSubject() {
    return subject;
  }

  public void setSubject(SyntheticsSSLCertificateSubject subject) {
    this.subject = subject;
  }

  public SyntheticsSSLCertificate validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  /**
   * Date from which the SSL certificate is valid.
   *
   * @return validFrom
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALID_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  public SyntheticsSSLCertificate validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

  /**
   * Date until which the SSL certificate is valid.
   *
   * @return validTo
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALID_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
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
   * @return SyntheticsSSLCertificate
   */
  @JsonAnySetter
  public SyntheticsSSLCertificate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsSSLCertificate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsSSLCertificate syntheticsSslCertificate = (SyntheticsSSLCertificate) o;
    return Objects.equals(this.cipher, syntheticsSslCertificate.cipher)
        && Objects.equals(this.exponent, syntheticsSslCertificate.exponent)
        && Objects.equals(this.extKeyUsage, syntheticsSslCertificate.extKeyUsage)
        && Objects.equals(this.fingerprint, syntheticsSslCertificate.fingerprint)
        && Objects.equals(this.fingerprint256, syntheticsSslCertificate.fingerprint256)
        && Objects.equals(this.issuer, syntheticsSslCertificate.issuer)
        && Objects.equals(this.modulus, syntheticsSslCertificate.modulus)
        && Objects.equals(this.protocol, syntheticsSslCertificate.protocol)
        && Objects.equals(this.serialNumber, syntheticsSslCertificate.serialNumber)
        && Objects.equals(this.subject, syntheticsSslCertificate.subject)
        && Objects.equals(this.validFrom, syntheticsSslCertificate.validFrom)
        && Objects.equals(this.validTo, syntheticsSslCertificate.validTo)
        && Objects.equals(this.additionalProperties, syntheticsSslCertificate.additionalProperties);
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
        validFrom,
        validTo,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsSSLCertificate {\n");
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
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
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
