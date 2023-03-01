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
   * <p>Object to handle <code>oauth client</code> authentication when performing the test.</p>
 */
@JsonPropertyOrder({
  SyntheticsBasicAuthOauthClient.JSON_PROPERTY_ACCESS_TOKEN_URL,
  SyntheticsBasicAuthOauthClient.JSON_PROPERTY_AUDIENCE,
  SyntheticsBasicAuthOauthClient.JSON_PROPERTY_CLIENT_ID,
  SyntheticsBasicAuthOauthClient.JSON_PROPERTY_CLIENT_SECRET,
  SyntheticsBasicAuthOauthClient.JSON_PROPERTY_RESOURCE,
  SyntheticsBasicAuthOauthClient.JSON_PROPERTY_SCOPE,
  SyntheticsBasicAuthOauthClient.JSON_PROPERTY_TOKEN_API_AUTHENTICATION,
  SyntheticsBasicAuthOauthClient.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsBasicAuthOauthClient {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCESS_TOKEN_URL = "accessTokenUrl";
  private String accessTokenUrl;

  public static final String JSON_PROPERTY_AUDIENCE = "audience";
  private String audience;

  public static final String JSON_PROPERTY_CLIENT_ID = "clientId";
  private String clientId;

  public static final String JSON_PROPERTY_CLIENT_SECRET = "clientSecret";
  private String clientSecret;

  public static final String JSON_PROPERTY_RESOURCE = "resource";
  private String resource;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_TOKEN_API_AUTHENTICATION = "tokenApiAuthentication";
  private SyntheticsBasicAuthOauthTokenApiAuthentication tokenApiAuthentication;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsBasicAuthOauthClientType type = SyntheticsBasicAuthOauthClientType.OAUTH_CLIENT;

  public SyntheticsBasicAuthOauthClient() {}

  @JsonCreator
  public SyntheticsBasicAuthOauthClient(
            @JsonProperty(required=true, value=JSON_PROPERTY_ACCESS_TOKEN_URL)String accessTokenUrl,
            @JsonProperty(required=true, value=JSON_PROPERTY_CLIENT_ID)String clientId,
            @JsonProperty(required=true, value=JSON_PROPERTY_CLIENT_SECRET)String clientSecret,
            @JsonProperty(required=true, value=JSON_PROPERTY_TOKEN_API_AUTHENTICATION)SyntheticsBasicAuthOauthTokenApiAuthentication tokenApiAuthentication) {
        this.accessTokenUrl = accessTokenUrl;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.tokenApiAuthentication = tokenApiAuthentication;
        this.unparsed |= !tokenApiAuthentication.isValid();
  }
  public SyntheticsBasicAuthOauthClient accessTokenUrl(String accessTokenUrl) {
    this.accessTokenUrl = accessTokenUrl;
    return this;
  }

  /**
   * <p>Access token URL to use when performing the authentication.</p>
   * @return accessTokenUrl
  **/
      @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN_URL)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getAccessTokenUrl() {
        return accessTokenUrl;
      }
  public void setAccessTokenUrl(String accessTokenUrl) {
    this.accessTokenUrl = accessTokenUrl;
  }
  public SyntheticsBasicAuthOauthClient audience(String audience) {
    this.audience = audience;
    return this;
  }

  /**
   * <p>Audience to use when performing the authentication.</p>
   * @return audience
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AUDIENCE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAudience() {
        return audience;
      }
  public void setAudience(String audience) {
    this.audience = audience;
  }
  public SyntheticsBasicAuthOauthClient clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * <p>Client ID to use when performing the authentication.</p>
   * @return clientId
  **/
      @JsonProperty(JSON_PROPERTY_CLIENT_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getClientId() {
        return clientId;
      }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }
  public SyntheticsBasicAuthOauthClient clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * <p>Client secret to use when performing the authentication.</p>
   * @return clientSecret
  **/
      @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getClientSecret() {
        return clientSecret;
      }
  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }
  public SyntheticsBasicAuthOauthClient resource(String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * <p>Resource to use when performing the authentication.</p>
   * @return resource
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESOURCE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getResource() {
        return resource;
      }
  public void setResource(String resource) {
    this.resource = resource;
  }
  public SyntheticsBasicAuthOauthClient scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * <p>Scope to use when performing the authentication.</p>
   * @return scope
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SCOPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getScope() {
        return scope;
      }
  public void setScope(String scope) {
    this.scope = scope;
  }
  public SyntheticsBasicAuthOauthClient tokenApiAuthentication(SyntheticsBasicAuthOauthTokenApiAuthentication tokenApiAuthentication) {
    this.tokenApiAuthentication = tokenApiAuthentication;
    this.unparsed |= !tokenApiAuthentication.isValid();
    return this;
  }

  /**
   * <p>Type of token to use when performing the authentication.</p>
   * @return tokenApiAuthentication
  **/
      @JsonProperty(JSON_PROPERTY_TOKEN_API_AUTHENTICATION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SyntheticsBasicAuthOauthTokenApiAuthentication getTokenApiAuthentication() {
        return tokenApiAuthentication;
      }
  public void setTokenApiAuthentication(SyntheticsBasicAuthOauthTokenApiAuthentication tokenApiAuthentication) {
    if (!tokenApiAuthentication.isValid()) {
        this.unparsed = true;
    }
    this.tokenApiAuthentication = tokenApiAuthentication;
  }
  public SyntheticsBasicAuthOauthClient type(SyntheticsBasicAuthOauthClientType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The type of basic authentication to use when performing the test.</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsBasicAuthOauthClientType getType() {
        return type;
      }
  public void setType(SyntheticsBasicAuthOauthClientType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * Return true if this SyntheticsBasicAuthOauthClient object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsBasicAuthOauthClient syntheticsBasicAuthOauthClient = (SyntheticsBasicAuthOauthClient) o;
    return Objects.equals(this.accessTokenUrl, syntheticsBasicAuthOauthClient.accessTokenUrl) && Objects.equals(this.audience, syntheticsBasicAuthOauthClient.audience) && Objects.equals(this.clientId, syntheticsBasicAuthOauthClient.clientId) && Objects.equals(this.clientSecret, syntheticsBasicAuthOauthClient.clientSecret) && Objects.equals(this.resource, syntheticsBasicAuthOauthClient.resource) && Objects.equals(this.scope, syntheticsBasicAuthOauthClient.scope) && Objects.equals(this.tokenApiAuthentication, syntheticsBasicAuthOauthClient.tokenApiAuthentication) && Objects.equals(this.type, syntheticsBasicAuthOauthClient.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(accessTokenUrl,audience,clientId,clientSecret,resource,scope,tokenApiAuthentication,type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsBasicAuthOauthClient {\n");
    sb.append("    accessTokenUrl: ").append(toIndentedString(accessTokenUrl)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tokenApiAuthentication: ").append(toIndentedString(tokenApiAuthentication)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
