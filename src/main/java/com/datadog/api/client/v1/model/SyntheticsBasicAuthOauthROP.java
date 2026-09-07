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
   * <p>Object to handle <code>oauth rop</code> authentication when performing the test.</p>
 */
@JsonPropertyOrder({
  SyntheticsBasicAuthOauthROP.JSON_PROPERTY_ACCESS_TOKEN_URL,
  SyntheticsBasicAuthOauthROP.JSON_PROPERTY_AUDIENCE,
  SyntheticsBasicAuthOauthROP.JSON_PROPERTY_CLIENT_ID,
  SyntheticsBasicAuthOauthROP.JSON_PROPERTY_CLIENT_SECRET,
  SyntheticsBasicAuthOauthROP.JSON_PROPERTY_PASSWORD,
  SyntheticsBasicAuthOauthROP.JSON_PROPERTY_RESOURCE,
  SyntheticsBasicAuthOauthROP.JSON_PROPERTY_SCOPE,
  SyntheticsBasicAuthOauthROP.JSON_PROPERTY_TOKEN_API_AUTHENTICATION,
  SyntheticsBasicAuthOauthROP.JSON_PROPERTY_TYPE,
  SyntheticsBasicAuthOauthROP.JSON_PROPERTY_USERNAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsBasicAuthOauthROP {
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

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_RESOURCE = "resource";
  private String resource;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_TOKEN_API_AUTHENTICATION = "tokenApiAuthentication";
  private SyntheticsBasicAuthOauthTokenApiAuthentication tokenApiAuthentication;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsBasicAuthOauthROPType type = SyntheticsBasicAuthOauthROPType.OAUTH_ROP;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public SyntheticsBasicAuthOauthROP() {}

  @JsonCreator
  public SyntheticsBasicAuthOauthROP(
            @JsonProperty(required=true, value=JSON_PROPERTY_ACCESS_TOKEN_URL)String accessTokenUrl,
            @JsonProperty(required=true, value=JSON_PROPERTY_PASSWORD)String password,
            @JsonProperty(required=true, value=JSON_PROPERTY_TOKEN_API_AUTHENTICATION)SyntheticsBasicAuthOauthTokenApiAuthentication tokenApiAuthentication,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)SyntheticsBasicAuthOauthROPType type,
            @JsonProperty(required=true, value=JSON_PROPERTY_USERNAME)String username) {
        this.accessTokenUrl = accessTokenUrl;
        this.password = password;
        this.tokenApiAuthentication = tokenApiAuthentication;
        this.unparsed |= !tokenApiAuthentication.isValid();
        this.type = type;
        this.unparsed |= !type.isValid();
        this.username = username;
  }
  public SyntheticsBasicAuthOauthROP accessTokenUrl(String accessTokenUrl) {
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
  public SyntheticsBasicAuthOauthROP audience(String audience) {
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
  public SyntheticsBasicAuthOauthROP clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * <p>Client ID to use when performing the authentication.</p>
   * @return clientId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CLIENT_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getClientId() {
        return clientId;
      }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }
  public SyntheticsBasicAuthOauthROP clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * <p>Client secret to use when performing the authentication.</p>
   * @return clientSecret
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getClientSecret() {
        return clientSecret;
      }
  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }
  public SyntheticsBasicAuthOauthROP password(String password) {
    this.password = password;
    return this;
  }

  /**
   * <p>Password to use when performing the authentication.</p>
   * @return password
  **/
      @JsonProperty(JSON_PROPERTY_PASSWORD)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getPassword() {
        return password;
      }
  public void setPassword(String password) {
    this.password = password;
  }
  public SyntheticsBasicAuthOauthROP resource(String resource) {
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
  public SyntheticsBasicAuthOauthROP scope(String scope) {
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
  public SyntheticsBasicAuthOauthROP tokenApiAuthentication(SyntheticsBasicAuthOauthTokenApiAuthentication tokenApiAuthentication) {
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
  public SyntheticsBasicAuthOauthROP type(SyntheticsBasicAuthOauthROPType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The type of basic authentication to use when performing the test.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SyntheticsBasicAuthOauthROPType getType() {
        return type;
      }
  public void setType(SyntheticsBasicAuthOauthROPType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }
  public SyntheticsBasicAuthOauthROP username(String username) {
    this.username = username;
    return this;
  }

  /**
   * <p>Username to use when performing the authentication.</p>
   * @return username
  **/
      @JsonProperty(JSON_PROPERTY_USERNAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getUsername() {
        return username;
      }
  public void setUsername(String username) {
    this.username = username;
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
   * @return SyntheticsBasicAuthOauthROP
   */
  @JsonAnySetter
  public SyntheticsBasicAuthOauthROP putAdditionalProperty(String key, Object value) {
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
   * Return true if this SyntheticsBasicAuthOauthROP object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsBasicAuthOauthROP syntheticsBasicAuthOauthRop = (SyntheticsBasicAuthOauthROP) o;
    return Objects.equals(this.accessTokenUrl, syntheticsBasicAuthOauthRop.accessTokenUrl) && Objects.equals(this.audience, syntheticsBasicAuthOauthRop.audience) && Objects.equals(this.clientId, syntheticsBasicAuthOauthRop.clientId) && Objects.equals(this.clientSecret, syntheticsBasicAuthOauthRop.clientSecret) && Objects.equals(this.password, syntheticsBasicAuthOauthRop.password) && Objects.equals(this.resource, syntheticsBasicAuthOauthRop.resource) && Objects.equals(this.scope, syntheticsBasicAuthOauthRop.scope) && Objects.equals(this.tokenApiAuthentication, syntheticsBasicAuthOauthRop.tokenApiAuthentication) && Objects.equals(this.type, syntheticsBasicAuthOauthRop.type) && Objects.equals(this.username, syntheticsBasicAuthOauthRop.username) && Objects.equals(this.additionalProperties, syntheticsBasicAuthOauthRop.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(accessTokenUrl,audience,clientId,clientSecret,password,resource,scope,tokenApiAuthentication,type,username, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsBasicAuthOauthROP {\n");
    sb.append("    accessTokenUrl: ").append(toIndentedString(accessTokenUrl)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tokenApiAuthentication: ").append(toIndentedString(tokenApiAuthentication)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
