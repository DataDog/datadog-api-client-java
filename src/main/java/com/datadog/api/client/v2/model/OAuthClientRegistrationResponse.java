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
import java.util.UUID;

/** Response payload for a successful OAuth2 dynamic client registration as defined by RFC 7591. */
@JsonPropertyOrder({
  OAuthClientRegistrationResponse.JSON_PROPERTY_CLIENT_ID,
  OAuthClientRegistrationResponse.JSON_PROPERTY_CLIENT_NAME,
  OAuthClientRegistrationResponse.JSON_PROPERTY_GRANT_TYPES,
  OAuthClientRegistrationResponse.JSON_PROPERTY_REDIRECT_URIS,
  OAuthClientRegistrationResponse.JSON_PROPERTY_RESPONSE_TYPES,
  OAuthClientRegistrationResponse.JSON_PROPERTY_TOKEN_ENDPOINT_AUTH_METHOD
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OAuthClientRegistrationResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private UUID clientId;

  public static final String JSON_PROPERTY_CLIENT_NAME = "client_name";
  private String clientName;

  public static final String JSON_PROPERTY_GRANT_TYPES = "grant_types";
  private List<OAuthClientRegistrationGrantType> grantTypes = new ArrayList<>();

  public static final String JSON_PROPERTY_REDIRECT_URIS = "redirect_uris";
  private List<String> redirectUris = new ArrayList<>();

  public static final String JSON_PROPERTY_RESPONSE_TYPES = "response_types";
  private List<OAuthClientRegistrationResponseType> responseTypes = new ArrayList<>();

  public static final String JSON_PROPERTY_TOKEN_ENDPOINT_AUTH_METHOD =
      "token_endpoint_auth_method";
  private String tokenEndpointAuthMethod;

  public OAuthClientRegistrationResponse() {}

  @JsonCreator
  public OAuthClientRegistrationResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_CLIENT_ID) UUID clientId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CLIENT_NAME) String clientName,
      @JsonProperty(required = true, value = JSON_PROPERTY_GRANT_TYPES)
          List<OAuthClientRegistrationGrantType> grantTypes,
      @JsonProperty(required = true, value = JSON_PROPERTY_REDIRECT_URIS) List<String> redirectUris,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_TYPES)
          List<OAuthClientRegistrationResponseType> responseTypes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOKEN_ENDPOINT_AUTH_METHOD)
          String tokenEndpointAuthMethod) {
    this.clientId = clientId;
    this.clientName = clientName;
    this.grantTypes = grantTypes;
    this.redirectUris = redirectUris;
    this.responseTypes = responseTypes;
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
  }

  public OAuthClientRegistrationResponse clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Unique identifier assigned to the registered client.
   *
   * @return clientId
   */
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public OAuthClientRegistrationResponse clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

  /**
   * Human-readable name of the client.
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

  public OAuthClientRegistrationResponse grantTypes(
      List<OAuthClientRegistrationGrantType> grantTypes) {
    this.grantTypes = grantTypes;
    return this;
  }

  public OAuthClientRegistrationResponse addGrantTypesItem(
      OAuthClientRegistrationGrantType grantTypesItem) {
    this.grantTypes.add(grantTypesItem);
    this.unparsed |= !grantTypesItem.isValid();
    return this;
  }

  /**
   * OAuth 2.0 grant types registered for the client.
   *
   * @return grantTypes
   */
  @JsonProperty(JSON_PROPERTY_GRANT_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<OAuthClientRegistrationGrantType> getGrantTypes() {
    return grantTypes;
  }

  public void setGrantTypes(List<OAuthClientRegistrationGrantType> grantTypes) {
    this.grantTypes = grantTypes;
  }

  public OAuthClientRegistrationResponse redirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
    return this;
  }

  public OAuthClientRegistrationResponse addRedirectUrisItem(String redirectUrisItem) {
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

  /**
   * Redirection URIs registered for the client.
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

  public OAuthClientRegistrationResponse responseTypes(
      List<OAuthClientRegistrationResponseType> responseTypes) {
    this.responseTypes = responseTypes;
    return this;
  }

  public OAuthClientRegistrationResponse addResponseTypesItem(
      OAuthClientRegistrationResponseType responseTypesItem) {
    this.responseTypes.add(responseTypesItem);
    this.unparsed |= !responseTypesItem.isValid();
    return this;
  }

  /**
   * OAuth 2.0 response types registered for the client.
   *
   * @return responseTypes
   */
  @JsonProperty(JSON_PROPERTY_RESPONSE_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<OAuthClientRegistrationResponseType> getResponseTypes() {
    return responseTypes;
  }

  public void setResponseTypes(List<OAuthClientRegistrationResponseType> responseTypes) {
    this.responseTypes = responseTypes;
  }

  public OAuthClientRegistrationResponse tokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
    return this;
  }

  /**
   * Authentication method registered for the token endpoint. Always <code>none</code>.
   *
   * @return tokenEndpointAuthMethod
   */
  @JsonProperty(JSON_PROPERTY_TOKEN_ENDPOINT_AUTH_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTokenEndpointAuthMethod() {
    return tokenEndpointAuthMethod;
  }

  public void setTokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
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
   * @return OAuthClientRegistrationResponse
   */
  @JsonAnySetter
  public OAuthClientRegistrationResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OAuthClientRegistrationResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthClientRegistrationResponse oAuthClientRegistrationResponse =
        (OAuthClientRegistrationResponse) o;
    return Objects.equals(this.clientId, oAuthClientRegistrationResponse.clientId)
        && Objects.equals(this.clientName, oAuthClientRegistrationResponse.clientName)
        && Objects.equals(this.grantTypes, oAuthClientRegistrationResponse.grantTypes)
        && Objects.equals(this.redirectUris, oAuthClientRegistrationResponse.redirectUris)
        && Objects.equals(this.responseTypes, oAuthClientRegistrationResponse.responseTypes)
        && Objects.equals(
            this.tokenEndpointAuthMethod, oAuthClientRegistrationResponse.tokenEndpointAuthMethod)
        && Objects.equals(
            this.additionalProperties, oAuthClientRegistrationResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        clientId,
        clientName,
        grantTypes,
        redirectUris,
        responseTypes,
        tokenEndpointAuthMethod,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthClientRegistrationResponse {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    grantTypes: ").append(toIndentedString(grantTypes)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("    responseTypes: ").append(toIndentedString(responseTypes)).append("\n");
    sb.append("    tokenEndpointAuthMethod: ")
        .append(toIndentedString(tokenEndpointAuthMethod))
        .append("\n");
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
