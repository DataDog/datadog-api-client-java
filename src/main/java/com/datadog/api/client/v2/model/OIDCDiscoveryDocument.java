/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** OpenID Connect provider metadata. */
@JsonPropertyOrder({
  OIDCDiscoveryDocument.JSON_PROPERTY_AUTHORIZATION_ENDPOINT,
  OIDCDiscoveryDocument.JSON_PROPERTY_ID_TOKEN_SIGNING_ALG_VALUES_SUPPORTED,
  OIDCDiscoveryDocument.JSON_PROPERTY_ISSUER,
  OIDCDiscoveryDocument.JSON_PROPERTY_JWKS_URI,
  OIDCDiscoveryDocument.JSON_PROPERTY_RESPONSE_TYPES_SUPPORTED,
  OIDCDiscoveryDocument.JSON_PROPERTY_SUBJECT_TYPES_SUPPORTED,
  OIDCDiscoveryDocument.JSON_PROPERTY_TOKEN_ENDPOINT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OIDCDiscoveryDocument {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHORIZATION_ENDPOINT = "authorization_endpoint";
  private String authorizationEndpoint;

  public static final String JSON_PROPERTY_ID_TOKEN_SIGNING_ALG_VALUES_SUPPORTED =
      "id_token_signing_alg_values_supported";
  private List<String> idTokenSigningAlgValuesSupported = new ArrayList<>();

  public static final String JSON_PROPERTY_ISSUER = "issuer";
  private String issuer;

  public static final String JSON_PROPERTY_JWKS_URI = "jwks_uri";
  private String jwksUri;

  public static final String JSON_PROPERTY_RESPONSE_TYPES_SUPPORTED = "response_types_supported";
  private List<String> responseTypesSupported = new ArrayList<>();

  public static final String JSON_PROPERTY_SUBJECT_TYPES_SUPPORTED = "subject_types_supported";
  private List<String> subjectTypesSupported = new ArrayList<>();

  public static final String JSON_PROPERTY_TOKEN_ENDPOINT = "token_endpoint";
  private String tokenEndpoint;

  public OIDCDiscoveryDocument() {}

  @JsonCreator
  public OIDCDiscoveryDocument(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTHORIZATION_ENDPOINT)
          String authorizationEndpoint,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID_TOKEN_SIGNING_ALG_VALUES_SUPPORTED)
          List<String> idTokenSigningAlgValuesSupported,
      @JsonProperty(required = true, value = JSON_PROPERTY_ISSUER) String issuer,
      @JsonProperty(required = true, value = JSON_PROPERTY_JWKS_URI) String jwksUri,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_TYPES_SUPPORTED)
          List<String> responseTypesSupported,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUBJECT_TYPES_SUPPORTED)
          List<String> subjectTypesSupported,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOKEN_ENDPOINT) String tokenEndpoint) {
    this.authorizationEndpoint = authorizationEndpoint;
    this.idTokenSigningAlgValuesSupported = idTokenSigningAlgValuesSupported;
    this.issuer = issuer;
    this.jwksUri = jwksUri;
    this.responseTypesSupported = responseTypesSupported;
    this.subjectTypesSupported = subjectTypesSupported;
    this.tokenEndpoint = tokenEndpoint;
  }

  public OIDCDiscoveryDocument authorizationEndpoint(String authorizationEndpoint) {
    this.authorizationEndpoint = authorizationEndpoint;
    return this;
  }

  /**
   * URL of the OAuth2 authorization endpoint.
   *
   * @return authorizationEndpoint
   */
  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAuthorizationEndpoint() {
    return authorizationEndpoint;
  }

  public void setAuthorizationEndpoint(String authorizationEndpoint) {
    this.authorizationEndpoint = authorizationEndpoint;
  }

  public OIDCDiscoveryDocument idTokenSigningAlgValuesSupported(
      List<String> idTokenSigningAlgValuesSupported) {
    this.idTokenSigningAlgValuesSupported = idTokenSigningAlgValuesSupported;
    return this;
  }

  public OIDCDiscoveryDocument addIdTokenSigningAlgValuesSupportedItem(
      String idTokenSigningAlgValuesSupportedItem) {
    this.idTokenSigningAlgValuesSupported.add(idTokenSigningAlgValuesSupportedItem);
    return this;
  }

  /**
   * Signing algorithms supported for ID tokens.
   *
   * @return idTokenSigningAlgValuesSupported
   */
  @JsonProperty(JSON_PROPERTY_ID_TOKEN_SIGNING_ALG_VALUES_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getIdTokenSigningAlgValuesSupported() {
    return idTokenSigningAlgValuesSupported;
  }

  public void setIdTokenSigningAlgValuesSupported(List<String> idTokenSigningAlgValuesSupported) {
    this.idTokenSigningAlgValuesSupported = idTokenSigningAlgValuesSupported;
  }

  public OIDCDiscoveryDocument issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * URL identifying the OpenID Connect issuer.
   *
   * @return issuer
   */
  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public OIDCDiscoveryDocument jwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
    return this;
  }

  /**
   * URL of the JSON Web Key Set used to verify ID token signatures.
   *
   * @return jwksUri
   */
  @JsonProperty(JSON_PROPERTY_JWKS_URI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getJwksUri() {
    return jwksUri;
  }

  public void setJwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
  }

  public OIDCDiscoveryDocument responseTypesSupported(List<String> responseTypesSupported) {
    this.responseTypesSupported = responseTypesSupported;
    return this;
  }

  public OIDCDiscoveryDocument addResponseTypesSupportedItem(String responseTypesSupportedItem) {
    this.responseTypesSupported.add(responseTypesSupportedItem);
    return this;
  }

  /**
   * OAuth2 response types supported by the provider.
   *
   * @return responseTypesSupported
   */
  @JsonProperty(JSON_PROPERTY_RESPONSE_TYPES_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getResponseTypesSupported() {
    return responseTypesSupported;
  }

  public void setResponseTypesSupported(List<String> responseTypesSupported) {
    this.responseTypesSupported = responseTypesSupported;
  }

  public OIDCDiscoveryDocument subjectTypesSupported(List<String> subjectTypesSupported) {
    this.subjectTypesSupported = subjectTypesSupported;
    return this;
  }

  public OIDCDiscoveryDocument addSubjectTypesSupportedItem(String subjectTypesSupportedItem) {
    this.subjectTypesSupported.add(subjectTypesSupportedItem);
    return this;
  }

  /**
   * Subject identifier types supported by the provider.
   *
   * @return subjectTypesSupported
   */
  @JsonProperty(JSON_PROPERTY_SUBJECT_TYPES_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getSubjectTypesSupported() {
    return subjectTypesSupported;
  }

  public void setSubjectTypesSupported(List<String> subjectTypesSupported) {
    this.subjectTypesSupported = subjectTypesSupported;
  }

  public OIDCDiscoveryDocument tokenEndpoint(String tokenEndpoint) {
    this.tokenEndpoint = tokenEndpoint;
    return this;
  }

  /**
   * URL of the OAuth2 token endpoint.
   *
   * @return tokenEndpoint
   */
  @JsonProperty(JSON_PROPERTY_TOKEN_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTokenEndpoint() {
    return tokenEndpoint;
  }

  public void setTokenEndpoint(String tokenEndpoint) {
    this.tokenEndpoint = tokenEndpoint;
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
   * @return OIDCDiscoveryDocument
   */
  @JsonAnySetter
  public OIDCDiscoveryDocument putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OIDCDiscoveryDocument object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OIDCDiscoveryDocument oidcDiscoveryDocument = (OIDCDiscoveryDocument) o;
    return Objects.equals(this.authorizationEndpoint, oidcDiscoveryDocument.authorizationEndpoint)
        && Objects.equals(
            this.idTokenSigningAlgValuesSupported,
            oidcDiscoveryDocument.idTokenSigningAlgValuesSupported)
        && Objects.equals(this.issuer, oidcDiscoveryDocument.issuer)
        && Objects.equals(this.jwksUri, oidcDiscoveryDocument.jwksUri)
        && Objects.equals(this.responseTypesSupported, oidcDiscoveryDocument.responseTypesSupported)
        && Objects.equals(this.subjectTypesSupported, oidcDiscoveryDocument.subjectTypesSupported)
        && Objects.equals(this.tokenEndpoint, oidcDiscoveryDocument.tokenEndpoint)
        && Objects.equals(this.additionalProperties, oidcDiscoveryDocument.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        authorizationEndpoint,
        idTokenSigningAlgValuesSupported,
        issuer,
        jwksUri,
        responseTypesSupported,
        subjectTypesSupported,
        tokenEndpoint,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OIDCDiscoveryDocument {\n");
    sb.append("    authorizationEndpoint: ")
        .append(toIndentedString(authorizationEndpoint))
        .append("\n");
    sb.append("    idTokenSigningAlgValuesSupported: ")
        .append(toIndentedString(idTokenSigningAlgValuesSupported))
        .append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    jwksUri: ").append(toIndentedString(jwksUri)).append("\n");
    sb.append("    responseTypesSupported: ")
        .append(toIndentedString(responseTypesSupported))
        .append("\n");
    sb.append("    subjectTypesSupported: ")
        .append(toIndentedString(subjectTypesSupported))
        .append("\n");
    sb.append("    tokenEndpoint: ").append(toIndentedString(tokenEndpoint)).append("\n");
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
