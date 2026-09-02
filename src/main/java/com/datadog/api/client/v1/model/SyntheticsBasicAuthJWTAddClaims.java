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

/** Standard JWT claims to automatically inject. */
@JsonPropertyOrder({
  SyntheticsBasicAuthJWTAddClaims.JSON_PROPERTY_EXP,
  SyntheticsBasicAuthJWTAddClaims.JSON_PROPERTY_IAT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsBasicAuthJWTAddClaims {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXP = "exp";
  private Boolean exp;

  public static final String JSON_PROPERTY_IAT = "iat";
  private Boolean iat;

  public SyntheticsBasicAuthJWTAddClaims exp(Boolean exp) {
    this.exp = exp;
    return this;
  }

  /**
   * Whether to inject the <code>exp</code> (expiration) claim.
   *
   * @return exp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getExp() {
    return exp;
  }

  public void setExp(Boolean exp) {
    this.exp = exp;
  }

  public SyntheticsBasicAuthJWTAddClaims iat(Boolean iat) {
    this.iat = iat;
    return this;
  }

  /**
   * Whether to inject the <code>iat</code> (issued at) claim.
   *
   * @return iat
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIat() {
    return iat;
  }

  public void setIat(Boolean iat) {
    this.iat = iat;
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
   * @return SyntheticsBasicAuthJWTAddClaims
   */
  @JsonAnySetter
  public SyntheticsBasicAuthJWTAddClaims putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsBasicAuthJWTAddClaims object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsBasicAuthJWTAddClaims syntheticsBasicAuthJwtAddClaims =
        (SyntheticsBasicAuthJWTAddClaims) o;
    return Objects.equals(this.exp, syntheticsBasicAuthJwtAddClaims.exp)
        && Objects.equals(this.iat, syntheticsBasicAuthJwtAddClaims.iat)
        && Objects.equals(
            this.additionalProperties, syntheticsBasicAuthJwtAddClaims.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exp, iat, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsBasicAuthJWTAddClaims {\n");
    sb.append("    exp: ").append(toIndentedString(exp)).append("\n");
    sb.append("    iat: ").append(toIndentedString(iat)).append("\n");
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
