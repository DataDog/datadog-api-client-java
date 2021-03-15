/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Object describing the SSL certificate used for a Synthetic test. */
@ApiModel(description = "Object describing the SSL certificate used for a Synthetic test.")
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SyntheticsSSLCertificate {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cipher used for the connection.")
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Exponent associated to the certificate.")
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of extensions and details used for the certificate.")
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MD5 digest of the DER-encoded Certificate information.")
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SHA-1 digest of the DER-encoded Certificate information.")
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
    return this;
  }

  /**
   * Get issuer
   *
   * @return issuer
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Modulus associated to the SSL certificate private key.")
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TLS protocol used for the test.")
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Serial Number assigned by Symantec to the SSL certificate.")
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
    return this;
  }

  /**
   * Get subject
   *
   * @return subject
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date from which the SSL certificate is valid.")
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date until which the SSL certificate is valid.")
  @JsonProperty(JSON_PROPERTY_VALID_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
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
    SyntheticsSSLCertificate syntheticsSSLCertificate = (SyntheticsSSLCertificate) o;
    return Objects.equals(this.cipher, syntheticsSSLCertificate.cipher)
        && Objects.equals(this.exponent, syntheticsSSLCertificate.exponent)
        && Objects.equals(this.extKeyUsage, syntheticsSSLCertificate.extKeyUsage)
        && Objects.equals(this.fingerprint, syntheticsSSLCertificate.fingerprint)
        && Objects.equals(this.fingerprint256, syntheticsSSLCertificate.fingerprint256)
        && Objects.equals(this.issuer, syntheticsSSLCertificate.issuer)
        && Objects.equals(this.modulus, syntheticsSSLCertificate.modulus)
        && Objects.equals(this.protocol, syntheticsSSLCertificate.protocol)
        && Objects.equals(this.serialNumber, syntheticsSSLCertificate.serialNumber)
        && Objects.equals(this.subject, syntheticsSSLCertificate.subject)
        && Objects.equals(this.validFrom, syntheticsSSLCertificate.validFrom)
        && Objects.equals(this.validTo, syntheticsSSLCertificate.validTo);
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
        validTo);
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
    sb.append("}");
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
