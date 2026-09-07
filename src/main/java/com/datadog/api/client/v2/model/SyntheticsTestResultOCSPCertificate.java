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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Certificate details returned in an OCSP response. */
@JsonPropertyOrder({
  SyntheticsTestResultOCSPCertificate.JSON_PROPERTY_REVOCATION_REASON,
  SyntheticsTestResultOCSPCertificate.JSON_PROPERTY_REVOCATION_TIME,
  SyntheticsTestResultOCSPCertificate.JSON_PROPERTY_SERIAL_NUMBER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultOCSPCertificate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_REVOCATION_REASON = "revocation_reason";
  private String revocationReason;

  public static final String JSON_PROPERTY_REVOCATION_TIME = "revocation_time";
  private Long revocationTime;

  public static final String JSON_PROPERTY_SERIAL_NUMBER = "serial_number";
  private String serialNumber;

  public SyntheticsTestResultOCSPCertificate revocationReason(String revocationReason) {
    this.revocationReason = revocationReason;
    return this;
  }

  /**
   * Reason code for the revocation, when applicable.
   *
   * @return revocationReason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVOCATION_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRevocationReason() {
    return revocationReason;
  }

  public void setRevocationReason(String revocationReason) {
    this.revocationReason = revocationReason;
  }

  public SyntheticsTestResultOCSPCertificate revocationTime(Long revocationTime) {
    this.revocationTime = revocationTime;
    return this;
  }

  /**
   * Unix timestamp (ms) of the revocation.
   *
   * @return revocationTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVOCATION_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRevocationTime() {
    return revocationTime;
  }

  public void setRevocationTime(Long revocationTime) {
    this.revocationTime = revocationTime;
  }

  public SyntheticsTestResultOCSPCertificate serialNumber(String serialNumber) {
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
   * @return SyntheticsTestResultOCSPCertificate
   */
  @JsonAnySetter
  public SyntheticsTestResultOCSPCertificate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultOCSPCertificate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultOCSPCertificate syntheticsTestResultOcspCertificate =
        (SyntheticsTestResultOCSPCertificate) o;
    return Objects.equals(
            this.revocationReason, syntheticsTestResultOcspCertificate.revocationReason)
        && Objects.equals(this.revocationTime, syntheticsTestResultOcspCertificate.revocationTime)
        && Objects.equals(this.serialNumber, syntheticsTestResultOcspCertificate.serialNumber)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultOcspCertificate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revocationReason, revocationTime, serialNumber, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultOCSPCertificate {\n");
    sb.append("    revocationReason: ").append(toIndentedString(revocationReason)).append("\n");
    sb.append("    revocationTime: ").append(toIndentedString(revocationTime)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
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
