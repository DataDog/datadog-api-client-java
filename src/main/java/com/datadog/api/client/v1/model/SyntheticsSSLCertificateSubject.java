/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Object describing the SSL certificate used for the test. */
@JsonPropertyOrder({
  SyntheticsSSLCertificateSubject.JSON_PROPERTY_C,
  SyntheticsSSLCertificateSubject.JSON_PROPERTY_C_N,
  SyntheticsSSLCertificateSubject.JSON_PROPERTY_L,
  SyntheticsSSLCertificateSubject.JSON_PROPERTY_O,
  SyntheticsSSLCertificateSubject.JSON_PROPERTY_O_U,
  SyntheticsSSLCertificateSubject.JSON_PROPERTY_S_T,
  SyntheticsSSLCertificateSubject.JSON_PROPERTY_ALT_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsSSLCertificateSubject {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_C = "C";
  private String C;

  public static final String JSON_PROPERTY_C_N = "CN";
  private String CN;

  public static final String JSON_PROPERTY_L = "L";
  private String L;

  public static final String JSON_PROPERTY_O = "O";
  private String O;

  public static final String JSON_PROPERTY_O_U = "OU";
  private String OU;

  public static final String JSON_PROPERTY_S_T = "ST";
  private String ST;

  public static final String JSON_PROPERTY_ALT_NAME = "altName";
  private String altName;

  public SyntheticsSSLCertificateSubject C(String C) {
    this.C = C;
    return this;
  }

  /**
   * Country Name associated with the certificate.
   *
   * @return C
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getC() {
    return C;
  }

  public void setC(String C) {
    this.C = C;
  }

  public SyntheticsSSLCertificateSubject CN(String CN) {
    this.CN = CN;
    return this;
  }

  /**
   * Common Name that associated with the certificate.
   *
   * @return CN
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCN() {
    return CN;
  }

  public void setCN(String CN) {
    this.CN = CN;
  }

  public SyntheticsSSLCertificateSubject L(String L) {
    this.L = L;
    return this;
  }

  /**
   * Locality associated with the certificate.
   *
   * @return L
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getL() {
    return L;
  }

  public void setL(String L) {
    this.L = L;
  }

  public SyntheticsSSLCertificateSubject O(String O) {
    this.O = O;
    return this;
  }

  /**
   * Organization associated with the certificate.
   *
   * @return O
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_O)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getO() {
    return O;
  }

  public void setO(String O) {
    this.O = O;
  }

  public SyntheticsSSLCertificateSubject OU(String OU) {
    this.OU = OU;
    return this;
  }

  /**
   * Organizational Unit associated with the certificate.
   *
   * @return OU
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_O_U)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOU() {
    return OU;
  }

  public void setOU(String OU) {
    this.OU = OU;
  }

  public SyntheticsSSLCertificateSubject ST(String ST) {
    this.ST = ST;
    return this;
  }

  /**
   * State Or Province Name associated with the certificate.
   *
   * @return ST
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_S_T)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getST() {
    return ST;
  }

  public void setST(String ST) {
    this.ST = ST;
  }

  public SyntheticsSSLCertificateSubject altName(String altName) {
    this.altName = altName;
    return this;
  }

  /**
   * Subject Alternative Name associated with the certificate.
   *
   * @return altName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAltName() {
    return altName;
  }

  public void setAltName(String altName) {
    this.altName = altName;
  }

  /** Return true if this SyntheticsSSLCertificateSubject object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsSSLCertificateSubject syntheticsSslCertificateSubject =
        (SyntheticsSSLCertificateSubject) o;
    return Objects.equals(this.C, syntheticsSslCertificateSubject.C)
        && Objects.equals(this.CN, syntheticsSslCertificateSubject.CN)
        && Objects.equals(this.L, syntheticsSslCertificateSubject.L)
        && Objects.equals(this.O, syntheticsSslCertificateSubject.O)
        && Objects.equals(this.OU, syntheticsSslCertificateSubject.OU)
        && Objects.equals(this.ST, syntheticsSslCertificateSubject.ST)
        && Objects.equals(this.altName, syntheticsSslCertificateSubject.altName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(C, CN, L, O, OU, ST, altName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsSSLCertificateSubject {\n");
    sb.append("    C: ").append(toIndentedString(C)).append("\n");
    sb.append("    CN: ").append(toIndentedString(CN)).append("\n");
    sb.append("    L: ").append(toIndentedString(L)).append("\n");
    sb.append("    O: ").append(toIndentedString(O)).append("\n");
    sb.append("    OU: ").append(toIndentedString(OU)).append("\n");
    sb.append("    ST: ").append(toIndentedString(ST)).append("\n");
    sb.append("    altName: ").append(toIndentedString(altName)).append("\n");
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
