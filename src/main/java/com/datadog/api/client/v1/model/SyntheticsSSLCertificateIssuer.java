/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Object describing the issuer of a SSL certificate.</p>
 */
@JsonPropertyOrder({
  SyntheticsSSLCertificateIssuer.JSON_PROPERTY_C,
  SyntheticsSSLCertificateIssuer.JSON_PROPERTY_C_N,
  SyntheticsSSLCertificateIssuer.JSON_PROPERTY_L,
  SyntheticsSSLCertificateIssuer.JSON_PROPERTY_O,
  SyntheticsSSLCertificateIssuer.JSON_PROPERTY_O_U,
  SyntheticsSSLCertificateIssuer.JSON_PROPERTY_S_T
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsSSLCertificateIssuer {
  @JsonIgnore
  public boolean unparsed = false;
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
   * <p>Country Name that issued the certificate.</p>
   * @return C
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_C)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Common Name that issued certificate.</p>
   * @return CN
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_C_N)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Locality that issued the certificate.</p>
   * @return L
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_L)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Organization that issued the certificate.</p>
   * @return O
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_O)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Organizational Unit that issued the certificate.</p>
   * @return OU
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_O_U)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>State Or Province Name that issued the certificate.</p>
   * @return ST
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_S_T)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getST() {
        return ST;
      }
  public void setST(String ST) {
    this.ST = ST;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SyntheticsSSLCertificateIssuer
   */
  @JsonAnySetter
  public SyntheticsSSLCertificateIssuer putAdditionalProperty(String key, Object value) {
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
   * Return true if this SyntheticsSSLCertificateIssuer object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsSSLCertificateIssuer syntheticsSslCertificateIssuer = (SyntheticsSSLCertificateIssuer) o;
    return Objects.equals(this.C, syntheticsSslCertificateIssuer.C) && Objects.equals(this.CN, syntheticsSslCertificateIssuer.CN) && Objects.equals(this.L, syntheticsSslCertificateIssuer.L) && Objects.equals(this.O, syntheticsSslCertificateIssuer.O) && Objects.equals(this.OU, syntheticsSslCertificateIssuer.OU) && Objects.equals(this.ST, syntheticsSslCertificateIssuer.ST) && Objects.equals(this.additionalProperties, syntheticsSslCertificateIssuer.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(C,CN,L,O,OU,ST, additionalProperties);
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
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
