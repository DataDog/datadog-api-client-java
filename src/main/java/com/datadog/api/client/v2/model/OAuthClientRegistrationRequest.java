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

/** Request payload for OAuth2 dynamic client registration as defined by RFC 7591. */
@JsonPropertyOrder({
  OAuthClientRegistrationRequest.JSON_PROPERTY_CLIENT_NAME,
  OAuthClientRegistrationRequest.JSON_PROPERTY_CLIENT_URI,
  OAuthClientRegistrationRequest.JSON_PROPERTY_GRANT_TYPES,
  OAuthClientRegistrationRequest.JSON_PROPERTY_JWKS_URI,
  OAuthClientRegistrationRequest.JSON_PROPERTY_LOGO_URI,
  OAuthClientRegistrationRequest.JSON_PROPERTY_POLICY_URI,
  OAuthClientRegistrationRequest.JSON_PROPERTY_REDIRECT_URIS,
  OAuthClientRegistrationRequest.JSON_PROPERTY_RESPONSE_TYPES,
  OAuthClientRegistrationRequest.JSON_PROPERTY_SCOPE,
  OAuthClientRegistrationRequest.JSON_PROPERTY_TOKEN_ENDPOINT_AUTH_METHOD,
  OAuthClientRegistrationRequest.JSON_PROPERTY_TOS_URI
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OAuthClientRegistrationRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLIENT_NAME = "client_name";
  private String clientName;

  public static final String JSON_PROPERTY_CLIENT_URI = "client_uri";
  private String clientUri;

  public static final String JSON_PROPERTY_GRANT_TYPES = "grant_types";
  private List<OAuthClientRegistrationGrantType> grantTypes = null;

  public static final String JSON_PROPERTY_JWKS_URI = "jwks_uri";
  private String jwksUri;

  public static final String JSON_PROPERTY_LOGO_URI = "logo_uri";
  private String logoUri;

  public static final String JSON_PROPERTY_POLICY_URI = "policy_uri";
  private String policyUri;

  public static final String JSON_PROPERTY_REDIRECT_URIS = "redirect_uris";
  private List<String> redirectUris = new ArrayList<>();

  public static final String JSON_PROPERTY_RESPONSE_TYPES = "response_types";
  private List<OAuthClientRegistrationResponseType> responseTypes = null;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_TOKEN_ENDPOINT_AUTH_METHOD =
      "token_endpoint_auth_method";
  private String tokenEndpointAuthMethod;

  public static final String JSON_PROPERTY_TOS_URI = "tos_uri";
  private String tosUri;

  public OAuthClientRegistrationRequest() {}

  @JsonCreator
  public OAuthClientRegistrationRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_CLIENT_NAME) String clientName,
      @JsonProperty(required = true, value = JSON_PROPERTY_REDIRECT_URIS)
          List<String> redirectUris) {
    this.clientName = clientName;
    this.redirectUris = redirectUris;
  }

  public OAuthClientRegistrationRequest clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

  /**
   * Human-readable name of the client. Control characters are rejected.
   *
   * @return clientName
   */
  @JsonProperty(JSON_PROPERTY_CLIENT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public OAuthClientRegistrationRequest clientUri(String clientUri) {
    this.clientUri = clientUri;
    return this;
  }

  /**
   * URL of the home page of the client.
   *
   * @return clientUri
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClientUri() {
    return clientUri;
  }

  public void setClientUri(String clientUri) {
    this.clientUri = clientUri;
  }

  public OAuthClientRegistrationRequest grantTypes(
      List<OAuthClientRegistrationGrantType> grantTypes) {
    this.grantTypes = grantTypes;
    return this;
  }

  public OAuthClientRegistrationRequest addGrantTypesItem(
      OAuthClientRegistrationGrantType grantTypesItem) {
    if (this.grantTypes == null) {
      this.grantTypes = new ArrayList<>();
    }
    this.grantTypes.add(grantTypesItem);
    this.unparsed |= !grantTypesItem.isValid();
    return this;
  }

  /**
   * OAuth 2.0 grant types the client may use. Defaults to <code>authorization_code</code> and
   * <code>refresh_token</code> when omitted.
   *
   * @return grantTypes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRANT_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<OAuthClientRegistrationGrantType> getGrantTypes() {
    return grantTypes;
  }

  public void setGrantTypes(List<OAuthClientRegistrationGrantType> grantTypes) {
    this.grantTypes = grantTypes;
  }

  public OAuthClientRegistrationRequest jwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
    return this;
  }

  /**
   * URL referencing the client's JSON Web Key Set.
   *
   * @return jwksUri
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JWKS_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getJwksUri() {
    return jwksUri;
  }

  public void setJwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
  }

  public OAuthClientRegistrationRequest logoUri(String logoUri) {
    this.logoUri = logoUri;
    return this;
  }

  /**
   * URL referencing a logo for the client.
   *
   * @return logoUri
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGO_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLogoUri() {
    return logoUri;
  }

  public void setLogoUri(String logoUri) {
    this.logoUri = logoUri;
  }

  public OAuthClientRegistrationRequest policyUri(String policyUri) {
    this.policyUri = policyUri;
    return this;
  }

  /**
   * URL pointing to the client's privacy policy.
   *
   * @return policyUri
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POLICY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPolicyUri() {
    return policyUri;
  }

  public void setPolicyUri(String policyUri) {
    this.policyUri = policyUri;
  }

  public OAuthClientRegistrationRequest redirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
    return this;
  }

  public OAuthClientRegistrationRequest addRedirectUrisItem(String redirectUrisItem) {
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

  /**
   * Array of redirection URI strings used by the client in redirect-based flows.
   *
   * @return redirectUris
   */
  @JsonProperty(JSON_PROPERTY_REDIRECT_URIS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getRedirectUris() {
    return redirectUris;
  }

  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }

  public OAuthClientRegistrationRequest responseTypes(
      List<OAuthClientRegistrationResponseType> responseTypes) {
    this.responseTypes = responseTypes;
    return this;
  }

  public OAuthClientRegistrationRequest addResponseTypesItem(
      OAuthClientRegistrationResponseType responseTypesItem) {
    if (this.responseTypes == null) {
      this.responseTypes = new ArrayList<>();
    }
    this.responseTypes.add(responseTypesItem);
    this.unparsed |= !responseTypesItem.isValid();
    return this;
  }

  /**
   * OAuth 2.0 response types the client may use. Only <code>code</code> is supported.
   *
   * @return responseTypes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<OAuthClientRegistrationResponseType> getResponseTypes() {
    return responseTypes;
  }

  public void setResponseTypes(List<OAuthClientRegistrationResponseType> responseTypes) {
    this.responseTypes = responseTypes;
  }

  public OAuthClientRegistrationRequest scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Space-separated list of scope values the client may request.
   *
   * @return scope
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public OAuthClientRegistrationRequest tokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
    return this;
  }

  /**
   * Requested authentication method for the token endpoint. Only <code>none</code> is supported.
   *
   * @return tokenEndpointAuthMethod
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN_ENDPOINT_AUTH_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTokenEndpointAuthMethod() {
    return tokenEndpointAuthMethod;
  }

  public void setTokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
  }

  public OAuthClientRegistrationRequest tosUri(String tosUri) {
    this.tosUri = tosUri;
    return this;
  }

  /**
   * URL pointing to the client's terms of service.
   *
   * @return tosUri
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOS_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTosUri() {
    return tosUri;
  }

  public void setTosUri(String tosUri) {
    this.tosUri = tosUri;
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
   * @return OAuthClientRegistrationRequest
   */
  @JsonAnySetter
  public OAuthClientRegistrationRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OAuthClientRegistrationRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthClientRegistrationRequest oAuthClientRegistrationRequest =
        (OAuthClientRegistrationRequest) o;
    return Objects.equals(this.clientName, oAuthClientRegistrationRequest.clientName)
        && Objects.equals(this.clientUri, oAuthClientRegistrationRequest.clientUri)
        && Objects.equals(this.grantTypes, oAuthClientRegistrationRequest.grantTypes)
        && Objects.equals(this.jwksUri, oAuthClientRegistrationRequest.jwksUri)
        && Objects.equals(this.logoUri, oAuthClientRegistrationRequest.logoUri)
        && Objects.equals(this.policyUri, oAuthClientRegistrationRequest.policyUri)
        && Objects.equals(this.redirectUris, oAuthClientRegistrationRequest.redirectUris)
        && Objects.equals(this.responseTypes, oAuthClientRegistrationRequest.responseTypes)
        && Objects.equals(this.scope, oAuthClientRegistrationRequest.scope)
        && Objects.equals(
            this.tokenEndpointAuthMethod, oAuthClientRegistrationRequest.tokenEndpointAuthMethod)
        && Objects.equals(this.tosUri, oAuthClientRegistrationRequest.tosUri)
        && Objects.equals(
            this.additionalProperties, oAuthClientRegistrationRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        clientName,
        clientUri,
        grantTypes,
        jwksUri,
        logoUri,
        policyUri,
        redirectUris,
        responseTypes,
        scope,
        tokenEndpointAuthMethod,
        tosUri,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthClientRegistrationRequest {\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    clientUri: ").append(toIndentedString(clientUri)).append("\n");
    sb.append("    grantTypes: ").append(toIndentedString(grantTypes)).append("\n");
    sb.append("    jwksUri: ").append(toIndentedString(jwksUri)).append("\n");
    sb.append("    logoUri: ").append(toIndentedString(logoUri)).append("\n");
    sb.append("    policyUri: ").append(toIndentedString(policyUri)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("    responseTypes: ").append(toIndentedString(responseTypes)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tokenEndpointAuthMethod: ")
        .append(toIndentedString(tokenEndpointAuthMethod))
        .append("\n");
    sb.append("    tosUri: ").append(toIndentedString(tosUri)).append("\n");
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
