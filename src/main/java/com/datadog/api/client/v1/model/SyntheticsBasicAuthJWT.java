/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Object to handle JWT authentication when performing the test. */
@JsonPropertyOrder({
  SyntheticsBasicAuthJWT.JSON_PROPERTY_ADD_CLAIMS,
  SyntheticsBasicAuthJWT.JSON_PROPERTY_ALGORITHM,
  SyntheticsBasicAuthJWT.JSON_PROPERTY_EXPIRES_IN,
  SyntheticsBasicAuthJWT.JSON_PROPERTY_HEADER,
  SyntheticsBasicAuthJWT.JSON_PROPERTY_PAYLOAD,
  SyntheticsBasicAuthJWT.JSON_PROPERTY_SECRET,
  SyntheticsBasicAuthJWT.JSON_PROPERTY_TOKEN_PREFIX,
  SyntheticsBasicAuthJWT.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsBasicAuthJWT {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADD_CLAIMS = "addClaims";
  private SyntheticsBasicAuthJWTAddClaims addClaims;

  public static final String JSON_PROPERTY_ALGORITHM = "algorithm";
  private SyntheticsBasicAuthJWTAlgorithm algorithm;

  public static final String JSON_PROPERTY_EXPIRES_IN = "expiresIn";
  private Long expiresIn;

  public static final String JSON_PROPERTY_HEADER = "header";
  private String header;

  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private String payload;

  public static final String JSON_PROPERTY_SECRET = "secret";
  private String secret;

  public static final String JSON_PROPERTY_TOKEN_PREFIX = "tokenPrefix";
  private String tokenPrefix;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsBasicAuthJWTType type = SyntheticsBasicAuthJWTType.JWT;

  public SyntheticsBasicAuthJWT() {}

  @JsonCreator
  public SyntheticsBasicAuthJWT(
      @JsonProperty(required = true, value = JSON_PROPERTY_ALGORITHM)
          SyntheticsBasicAuthJWTAlgorithm algorithm,
      @JsonProperty(required = true, value = JSON_PROPERTY_PAYLOAD) String payload,
      @JsonProperty(required = true, value = JSON_PROPERTY_SECRET) String secret,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) SyntheticsBasicAuthJWTType type) {
    this.algorithm = algorithm;
    this.unparsed |= !algorithm.isValid();
    this.payload = payload;
    this.secret = secret;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SyntheticsBasicAuthJWT addClaims(SyntheticsBasicAuthJWTAddClaims addClaims) {
    this.addClaims = addClaims;
    this.unparsed |= addClaims.unparsed;
    return this;
  }

  /**
   * Standard JWT claims to automatically inject.
   *
   * @return addClaims
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADD_CLAIMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsBasicAuthJWTAddClaims getAddClaims() {
    return addClaims;
  }

  public void setAddClaims(SyntheticsBasicAuthJWTAddClaims addClaims) {
    this.addClaims = addClaims;
  }

  public SyntheticsBasicAuthJWT algorithm(SyntheticsBasicAuthJWTAlgorithm algorithm) {
    this.algorithm = algorithm;
    this.unparsed |= !algorithm.isValid();
    return this;
  }

  /**
   * Algorithm to use for the JWT authentication.
   *
   * @return algorithm
   */
  @JsonProperty(JSON_PROPERTY_ALGORITHM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsBasicAuthJWTAlgorithm getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(SyntheticsBasicAuthJWTAlgorithm algorithm) {
    if (!algorithm.isValid()) {
      this.unparsed = true;
    }
    this.algorithm = algorithm;
  }

  public SyntheticsBasicAuthJWT expiresIn(Long expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  /**
   * Token time-to-live in seconds. minimum: 1
   *
   * @return expiresIn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRES_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Long expiresIn) {
    this.expiresIn = expiresIn;
  }

  public SyntheticsBasicAuthJWT header(String header) {
    this.header = header;
    return this;
  }

  /**
   * Custom JWT header as a JSON string.
   *
   * @return header
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }

  public SyntheticsBasicAuthJWT payload(String payload) {
    this.payload = payload;
    return this;
  }

  /**
   * JWT claims as a JSON string.
   *
   * @return payload
   */
  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public SyntheticsBasicAuthJWT secret(String secret) {
    this.secret = secret;
    return this;
  }

  /**
   * Signing key for the JWT authentication. Use the shared secret for <code>HS256</code> or the
   * private key (PEM format) for <code>RS256</code> and <code>ES256</code>.
   *
   * @return secret
   */
  @JsonProperty(JSON_PROPERTY_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public SyntheticsBasicAuthJWT tokenPrefix(String tokenPrefix) {
    this.tokenPrefix = tokenPrefix;
    return this;
  }

  /**
   * Prefix added before the token in the <code>Authorization</code> header. Defaults to <code>
   * Bearer</code>.
   *
   * @return tokenPrefix
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTokenPrefix() {
    return tokenPrefix;
  }

  public void setTokenPrefix(String tokenPrefix) {
    this.tokenPrefix = tokenPrefix;
  }

  public SyntheticsBasicAuthJWT type(SyntheticsBasicAuthJWTType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of authentication to use when performing the test.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsBasicAuthJWTType getType() {
    return type;
  }

  public void setType(SyntheticsBasicAuthJWTType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return SyntheticsBasicAuthJWT
   */
  @JsonAnySetter
  public SyntheticsBasicAuthJWT putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsBasicAuthJWT object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsBasicAuthJWT syntheticsBasicAuthJwt = (SyntheticsBasicAuthJWT) o;
    return Objects.equals(this.addClaims, syntheticsBasicAuthJwt.addClaims)
        && Objects.equals(this.algorithm, syntheticsBasicAuthJwt.algorithm)
        && Objects.equals(this.expiresIn, syntheticsBasicAuthJwt.expiresIn)
        && Objects.equals(this.header, syntheticsBasicAuthJwt.header)
        && Objects.equals(this.payload, syntheticsBasicAuthJwt.payload)
        && Objects.equals(this.secret, syntheticsBasicAuthJwt.secret)
        && Objects.equals(this.tokenPrefix, syntheticsBasicAuthJwt.tokenPrefix)
        && Objects.equals(this.type, syntheticsBasicAuthJwt.type)
        && Objects.equals(this.additionalProperties, syntheticsBasicAuthJwt.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        addClaims,
        algorithm,
        expiresIn,
        header,
        payload,
        secret,
        tokenPrefix,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsBasicAuthJWT {\n");
    sb.append("    addClaims: ").append(toIndentedString(addClaims)).append("\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    tokenPrefix: ").append(toIndentedString(tokenPrefix)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
