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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * OAuth2 client credentials attributes returned by the API. The <code>client_secret</code> is never
 * echoed.
 */
@JsonPropertyOrder({
  WebhooksOAuth2ClientCredentialsResponseAttributes.JSON_PROPERTY_ACCESS_TOKEN_URL,
  WebhooksOAuth2ClientCredentialsResponseAttributes.JSON_PROPERTY_AUDIENCE,
  WebhooksOAuth2ClientCredentialsResponseAttributes.JSON_PROPERTY_CLIENT_ID,
  WebhooksOAuth2ClientCredentialsResponseAttributes.JSON_PROPERTY_NAME,
  WebhooksOAuth2ClientCredentialsResponseAttributes.JSON_PROPERTY_PROTOCOL,
  WebhooksOAuth2ClientCredentialsResponseAttributes.JSON_PROPERTY_SCOPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WebhooksOAuth2ClientCredentialsResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCESS_TOKEN_URL = "access_token_url";
  private String accessTokenUrl;

  public static final String JSON_PROPERTY_AUDIENCE = "audience";
  private JsonNullable<String> audience = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private WebhooksAuthMethodProtocol protocol;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private JsonNullable<String> scope = JsonNullable.<String>undefined();

  public WebhooksOAuth2ClientCredentialsResponseAttributes accessTokenUrl(String accessTokenUrl) {
    this.accessTokenUrl = accessTokenUrl;
    return this;
  }

  /**
   * URL of the OAuth2 access token endpoint.
   *
   * @return accessTokenUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccessTokenUrl() {
    return accessTokenUrl;
  }

  public void setAccessTokenUrl(String accessTokenUrl) {
    this.accessTokenUrl = accessTokenUrl;
  }

  public WebhooksOAuth2ClientCredentialsResponseAttributes audience(String audience) {
    this.audience = JsonNullable.<String>of(audience);
    return this;
  }

  /**
   * The intended audience for the OAuth2 access token.
   *
   * @return audience
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getAudience() {
    return audience.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AUDIENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getAudience_JsonNullable() {
    return audience;
  }

  @JsonProperty(JSON_PROPERTY_AUDIENCE)
  public void setAudience_JsonNullable(JsonNullable<String> audience) {
    this.audience = audience;
  }

  public void setAudience(String audience) {
    this.audience = JsonNullable.<String>of(audience);
  }

  public WebhooksOAuth2ClientCredentialsResponseAttributes clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * The OAuth2 client ID issued by the authorization server.
   *
   * @return clientId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public WebhooksOAuth2ClientCredentialsResponseAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human-readable name for this auth method.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WebhooksOAuth2ClientCredentialsResponseAttributes protocol(
      WebhooksAuthMethodProtocol protocol) {
    this.protocol = protocol;
    this.unparsed |= !protocol.isValid();
    return this;
  }

  /**
   * Authentication protocol used by the auth method.
   *
   * @return protocol
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WebhooksAuthMethodProtocol getProtocol() {
    return protocol;
  }

  public void setProtocol(WebhooksAuthMethodProtocol protocol) {
    if (!protocol.isValid()) {
      this.unparsed = true;
    }
    this.protocol = protocol;
  }

  public WebhooksOAuth2ClientCredentialsResponseAttributes scope(String scope) {
    this.scope = JsonNullable.<String>of(scope);
    return this;
  }

  /**
   * Space-separated list of OAuth2 scopes to request.
   *
   * @return scope
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getScope() {
    return scope.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getScope_JsonNullable() {
    return scope;
  }

  @JsonProperty(JSON_PROPERTY_SCOPE)
  public void setScope_JsonNullable(JsonNullable<String> scope) {
    this.scope = scope;
  }

  public void setScope(String scope) {
    this.scope = JsonNullable.<String>of(scope);
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
   * @return WebhooksOAuth2ClientCredentialsResponseAttributes
   */
  @JsonAnySetter
  public WebhooksOAuth2ClientCredentialsResponseAttributes putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this WebhooksOAuth2ClientCredentialsResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhooksOAuth2ClientCredentialsResponseAttributes
        webhooksOAuth2ClientCredentialsResponseAttributes =
            (WebhooksOAuth2ClientCredentialsResponseAttributes) o;
    return Objects.equals(
            this.accessTokenUrl, webhooksOAuth2ClientCredentialsResponseAttributes.accessTokenUrl)
        && Objects.equals(this.audience, webhooksOAuth2ClientCredentialsResponseAttributes.audience)
        && Objects.equals(this.clientId, webhooksOAuth2ClientCredentialsResponseAttributes.clientId)
        && Objects.equals(this.name, webhooksOAuth2ClientCredentialsResponseAttributes.name)
        && Objects.equals(this.protocol, webhooksOAuth2ClientCredentialsResponseAttributes.protocol)
        && Objects.equals(this.scope, webhooksOAuth2ClientCredentialsResponseAttributes.scope)
        && Objects.equals(
            this.additionalProperties,
            webhooksOAuth2ClientCredentialsResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accessTokenUrl, audience, clientId, name, protocol, scope, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhooksOAuth2ClientCredentialsResponseAttributes {\n");
    sb.append("    accessTokenUrl: ").append(toIndentedString(accessTokenUrl)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
