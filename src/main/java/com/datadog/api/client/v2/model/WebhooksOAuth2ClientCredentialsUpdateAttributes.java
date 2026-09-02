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

/** OAuth2 client credentials attributes for an update request. */
@JsonPropertyOrder({
  WebhooksOAuth2ClientCredentialsUpdateAttributes.JSON_PROPERTY_ACCESS_TOKEN_URL,
  WebhooksOAuth2ClientCredentialsUpdateAttributes.JSON_PROPERTY_AUDIENCE,
  WebhooksOAuth2ClientCredentialsUpdateAttributes.JSON_PROPERTY_CLIENT_ID,
  WebhooksOAuth2ClientCredentialsUpdateAttributes.JSON_PROPERTY_CLIENT_SECRET,
  WebhooksOAuth2ClientCredentialsUpdateAttributes.JSON_PROPERTY_NAME,
  WebhooksOAuth2ClientCredentialsUpdateAttributes.JSON_PROPERTY_SCOPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WebhooksOAuth2ClientCredentialsUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCESS_TOKEN_URL = "access_token_url";
  private String accessTokenUrl;

  public static final String JSON_PROPERTY_AUDIENCE = "audience";
  private JsonNullable<String> audience = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_CLIENT_SECRET = "client_secret";
  private String clientSecret;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private JsonNullable<String> scope = JsonNullable.<String>undefined();

  public WebhooksOAuth2ClientCredentialsUpdateAttributes accessTokenUrl(String accessTokenUrl) {
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

  public WebhooksOAuth2ClientCredentialsUpdateAttributes audience(String audience) {
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

  public WebhooksOAuth2ClientCredentialsUpdateAttributes clientId(String clientId) {
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

  public WebhooksOAuth2ClientCredentialsUpdateAttributes clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * The OAuth2 client secret issued by the authorization server. Write-only; never returned by the
   * API.
   *
   * @return clientSecret
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public WebhooksOAuth2ClientCredentialsUpdateAttributes name(String name) {
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

  public WebhooksOAuth2ClientCredentialsUpdateAttributes scope(String scope) {
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
   * @return WebhooksOAuth2ClientCredentialsUpdateAttributes
   */
  @JsonAnySetter
  public WebhooksOAuth2ClientCredentialsUpdateAttributes putAdditionalProperty(
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

  /** Return true if this WebhooksOAuth2ClientCredentialsUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhooksOAuth2ClientCredentialsUpdateAttributes
        webhooksOAuth2ClientCredentialsUpdateAttributes =
            (WebhooksOAuth2ClientCredentialsUpdateAttributes) o;
    return Objects.equals(
            this.accessTokenUrl, webhooksOAuth2ClientCredentialsUpdateAttributes.accessTokenUrl)
        && Objects.equals(this.audience, webhooksOAuth2ClientCredentialsUpdateAttributes.audience)
        && Objects.equals(this.clientId, webhooksOAuth2ClientCredentialsUpdateAttributes.clientId)
        && Objects.equals(
            this.clientSecret, webhooksOAuth2ClientCredentialsUpdateAttributes.clientSecret)
        && Objects.equals(this.name, webhooksOAuth2ClientCredentialsUpdateAttributes.name)
        && Objects.equals(this.scope, webhooksOAuth2ClientCredentialsUpdateAttributes.scope)
        && Objects.equals(
            this.additionalProperties,
            webhooksOAuth2ClientCredentialsUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accessTokenUrl, audience, clientId, clientSecret, name, scope, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhooksOAuth2ClientCredentialsUpdateAttributes {\n");
    sb.append("    accessTokenUrl: ").append(toIndentedString(accessTokenUrl)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
