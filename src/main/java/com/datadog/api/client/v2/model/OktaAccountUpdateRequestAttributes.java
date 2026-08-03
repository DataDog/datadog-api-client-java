/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
   * <p>Attributes object for updating an Okta account.</p>
 */
@JsonPropertyOrder({
  OktaAccountUpdateRequestAttributes.JSON_PROPERTY_API_KEY,
  OktaAccountUpdateRequestAttributes.JSON_PROPERTY_AUTH_METHOD,
  OktaAccountUpdateRequestAttributes.JSON_PROPERTY_CLIENT_ID,
  OktaAccountUpdateRequestAttributes.JSON_PROPERTY_CLIENT_SECRET,
  OktaAccountUpdateRequestAttributes.JSON_PROPERTY_DOMAIN
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OktaAccountUpdateRequestAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_API_KEY = "api_key";
  private String apiKey;

  public static final String JSON_PROPERTY_AUTH_METHOD = "auth_method";
  private String authMethod;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_CLIENT_SECRET = "client_secret";
  private String clientSecret;

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public OktaAccountUpdateRequestAttributes() {}

  @JsonCreator
  public OktaAccountUpdateRequestAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_AUTH_METHOD)String authMethod,
            @JsonProperty(required=true, value=JSON_PROPERTY_DOMAIN)String domain) {
        this.authMethod = authMethod;
        this.domain = domain;
  }
  public OktaAccountUpdateRequestAttributes apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * <p>The API key of the Okta account.</p>
   * @return apiKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_API_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getApiKey() {
        return apiKey;
      }
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }
  public OktaAccountUpdateRequestAttributes authMethod(String authMethod) {
    this.authMethod = authMethod;
    return this;
  }

  /**
   * <p>The authorization method for an Okta account.</p>
   * @return authMethod
  **/
      @JsonProperty(JSON_PROPERTY_AUTH_METHOD)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getAuthMethod() {
        return authMethod;
      }
  public void setAuthMethod(String authMethod) {
    this.authMethod = authMethod;
  }
  public OktaAccountUpdateRequestAttributes clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * <p>The Client ID of an Okta app integration.</p>
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
  public OktaAccountUpdateRequestAttributes clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * <p>The client secret of an Okta app integration.</p>
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
  public OktaAccountUpdateRequestAttributes domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * <p>The domain associated with an Okta account.</p>
   * @return domain
  **/
      @JsonProperty(JSON_PROPERTY_DOMAIN)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getDomain() {
        return domain;
      }
  public void setDomain(String domain) {
    this.domain = domain;
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
   * @return OktaAccountUpdateRequestAttributes
   */
  @JsonAnySetter
  public OktaAccountUpdateRequestAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this OktaAccountUpdateRequestAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OktaAccountUpdateRequestAttributes oktaAccountUpdateRequestAttributes = (OktaAccountUpdateRequestAttributes) o;
    return Objects.equals(this.apiKey, oktaAccountUpdateRequestAttributes.apiKey) && Objects.equals(this.authMethod, oktaAccountUpdateRequestAttributes.authMethod) && Objects.equals(this.clientId, oktaAccountUpdateRequestAttributes.clientId) && Objects.equals(this.clientSecret, oktaAccountUpdateRequestAttributes.clientSecret) && Objects.equals(this.domain, oktaAccountUpdateRequestAttributes.domain) && Objects.equals(this.additionalProperties, oktaAccountUpdateRequestAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(apiKey,authMethod,clientId,clientSecret,domain, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OktaAccountUpdateRequestAttributes {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    authMethod: ").append(toIndentedString(authMethod)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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
