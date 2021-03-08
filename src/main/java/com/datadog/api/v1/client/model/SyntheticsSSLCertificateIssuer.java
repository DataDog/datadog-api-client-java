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

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Object describing the issuer of a SSL certificate.
 */
@ApiModel(description = "Object describing the issuer of a SSL certificate.")
@JsonPropertyOrder({
  SyntheticsSSLCertificateIssuer.JSON_PROPERTY_C,
  SyntheticsSSLCertificateIssuer.JSON_PROPERTY_C_N,
  SyntheticsSSLCertificateIssuer.JSON_PROPERTY_L,
  SyntheticsSSLCertificateIssuer.JSON_PROPERTY_O,
  SyntheticsSSLCertificateIssuer.JSON_PROPERTY_O_U,
  SyntheticsSSLCertificateIssuer.JSON_PROPERTY_S_T
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SyntheticsSSLCertificateIssuer {
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


  public SyntheticsSSLCertificateIssuer C(String C) {
    this.C = C;
    return this;
  }

   /**
   * Country Name that issued the certificate.
   * @return C
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Country Name that issued the certificate.")
  @JsonProperty(JSON_PROPERTY_C)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getC() {
    return C;
  }


  public void setC(String C) {
    this.C = C;
  }


  public SyntheticsSSLCertificateIssuer CN(String CN) {
    this.CN = CN;
    return this;
  }

   /**
   * Common Name that issued certificate.
   * @return CN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Common Name that issued certificate.")
  @JsonProperty(JSON_PROPERTY_C_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCN() {
    return CN;
  }


  public void setCN(String CN) {
    this.CN = CN;
  }


  public SyntheticsSSLCertificateIssuer L(String L) {
    this.L = L;
    return this;
  }

   /**
   * Locality that issued the certificate.
   * @return L
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Locality that issued the certificate.")
  @JsonProperty(JSON_PROPERTY_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getL() {
    return L;
  }


  public void setL(String L) {
    this.L = L;
  }


  public SyntheticsSSLCertificateIssuer O(String O) {
    this.O = O;
    return this;
  }

   /**
   * Organization that issued the certificate.
   * @return O
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Organization that issued the certificate.")
  @JsonProperty(JSON_PROPERTY_O)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getO() {
    return O;
  }


  public void setO(String O) {
    this.O = O;
  }


  public SyntheticsSSLCertificateIssuer OU(String OU) {
    this.OU = OU;
    return this;
  }

   /**
   * Organizational Unit that issued the certificate.
   * @return OU
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Organizational Unit that issued the certificate.")
  @JsonProperty(JSON_PROPERTY_O_U)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOU() {
    return OU;
  }


  public void setOU(String OU) {
    this.OU = OU;
  }


  public SyntheticsSSLCertificateIssuer ST(String ST) {
    this.ST = ST;
    return this;
  }

   /**
   * State Or Province Name that issued the certificate.
   * @return ST
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State Or Province Name that issued the certificate.")
  @JsonProperty(JSON_PROPERTY_S_T)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getST() {
    return ST;
  }


  public void setST(String ST) {
    this.ST = ST;
  }


  /**
   * Return true if this SyntheticsSSLCertificate_issuer object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsSSLCertificateIssuer syntheticsSSLCertificateIssuer = (SyntheticsSSLCertificateIssuer) o;
    return Objects.equals(this.C, syntheticsSSLCertificateIssuer.C) &&
        Objects.equals(this.CN, syntheticsSSLCertificateIssuer.CN) &&
        Objects.equals(this.L, syntheticsSSLCertificateIssuer.L) &&
        Objects.equals(this.O, syntheticsSSLCertificateIssuer.O) &&
        Objects.equals(this.OU, syntheticsSSLCertificateIssuer.OU) &&
        Objects.equals(this.ST, syntheticsSSLCertificateIssuer.ST);
  }

  @Override
  public int hashCode() {
    return Objects.hash(C, CN, L, O, OU, ST);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsSSLCertificateIssuer {\n");
    sb.append("    C: ").append(toIndentedString(C)).append("\n");
    sb.append("    CN: ").append(toIndentedString(CN)).append("\n");
    sb.append("    L: ").append(toIndentedString(L)).append("\n");
    sb.append("    O: ").append(toIndentedString(O)).append("\n");
    sb.append("    OU: ").append(toIndentedString(OU)).append("\n");
    sb.append("    ST: ").append(toIndentedString(ST)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

