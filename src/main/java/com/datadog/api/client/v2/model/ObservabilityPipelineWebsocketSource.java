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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * The <code>websocket</code> source ingests logs from a WebSocket server using the <code>ws://
 * </code> or <code>wss://</code> protocol.
 *
 * <p><strong>Supported pipeline types:</strong> logs.
 */
@JsonPropertyOrder({
  ObservabilityPipelineWebsocketSource.JSON_PROPERTY_AUTH_STRATEGY,
  ObservabilityPipelineWebsocketSource.JSON_PROPERTY_CUSTOM_KEY,
  ObservabilityPipelineWebsocketSource.JSON_PROPERTY_DECODING,
  ObservabilityPipelineWebsocketSource.JSON_PROPERTY_ID,
  ObservabilityPipelineWebsocketSource.JSON_PROPERTY_PASSWORD_KEY,
  ObservabilityPipelineWebsocketSource.JSON_PROPERTY_TLS,
  ObservabilityPipelineWebsocketSource.JSON_PROPERTY_TOKEN_KEY,
  ObservabilityPipelineWebsocketSource.JSON_PROPERTY_TYPE,
  ObservabilityPipelineWebsocketSource.JSON_PROPERTY_URI_KEY,
  ObservabilityPipelineWebsocketSource.JSON_PROPERTY_USERNAME_KEY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineWebsocketSource {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_STRATEGY = "auth_strategy";
  private ObservabilityPipelineWebsocketSourceAuthStrategy authStrategy;

  public static final String JSON_PROPERTY_CUSTOM_KEY = "custom_key";
  private String customKey;

  public static final String JSON_PROPERTY_DECODING = "decoding";
  private ObservabilityPipelineDecoding decoding;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PASSWORD_KEY = "password_key";
  private String passwordKey;

  public static final String JSON_PROPERTY_TLS = "tls";
  private ObservabilityPipelineWebsocketSourceTls tls;

  public static final String JSON_PROPERTY_TOKEN_KEY = "token_key";
  private String tokenKey;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineWebsocketSourceType type =
      ObservabilityPipelineWebsocketSourceType.WEBSOCKET;

  public static final String JSON_PROPERTY_URI_KEY = "uri_key";
  private String uriKey;

  public static final String JSON_PROPERTY_USERNAME_KEY = "username_key";
  private String usernameKey;

  public ObservabilityPipelineWebsocketSource() {}

  @JsonCreator
  public ObservabilityPipelineWebsocketSource(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH_STRATEGY)
          ObservabilityPipelineWebsocketSourceAuthStrategy authStrategy,
      @JsonProperty(required = true, value = JSON_PROPERTY_DECODING)
          ObservabilityPipelineDecoding decoding,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineWebsocketSourceType type) {
    this.authStrategy = authStrategy;
    this.unparsed |= !authStrategy.isValid();
    this.decoding = decoding;
    this.unparsed |= !decoding.isValid();
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineWebsocketSource authStrategy(
      ObservabilityPipelineWebsocketSourceAuthStrategy authStrategy) {
    this.authStrategy = authStrategy;
    this.unparsed |= !authStrategy.isValid();
    return this;
  }

  /**
   * Authentication strategy for the WebSocket source connection.
   *
   * @return authStrategy
   */
  @JsonProperty(JSON_PROPERTY_AUTH_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineWebsocketSourceAuthStrategy getAuthStrategy() {
    return authStrategy;
  }

  public void setAuthStrategy(ObservabilityPipelineWebsocketSourceAuthStrategy authStrategy) {
    if (!authStrategy.isValid()) {
      this.unparsed = true;
    }
    this.authStrategy = authStrategy;
  }

  public ObservabilityPipelineWebsocketSource customKey(String customKey) {
    this.customKey = customKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the custom authorization header value.
   * Used when <code>auth_strategy</code> is <code>custom</code>.
   *
   * @return customKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomKey() {
    return customKey;
  }

  public void setCustomKey(String customKey) {
    this.customKey = customKey;
  }

  public ObservabilityPipelineWebsocketSource decoding(ObservabilityPipelineDecoding decoding) {
    this.decoding = decoding;
    this.unparsed |= !decoding.isValid();
    return this;
  }

  /**
   * The decoding format used to interpret incoming logs.
   *
   * @return decoding
   */
  @JsonProperty(JSON_PROPERTY_DECODING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineDecoding getDecoding() {
    return decoding;
  }

  public void setDecoding(ObservabilityPipelineDecoding decoding) {
    if (!decoding.isValid()) {
      this.unparsed = true;
    }
    this.decoding = decoding;
  }

  public ObservabilityPipelineWebsocketSource id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for this component.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ObservabilityPipelineWebsocketSource passwordKey(String passwordKey) {
    this.passwordKey = passwordKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the password. Used when <code>
   * auth_strategy</code> is <code>basic</code>.
   *
   * @return passwordKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPasswordKey() {
    return passwordKey;
  }

  public void setPasswordKey(String passwordKey) {
    this.passwordKey = passwordKey;
  }

  public ObservabilityPipelineWebsocketSource tls(ObservabilityPipelineWebsocketSourceTls tls) {
    this.tls = tls;
    this.unparsed |= tls.unparsed;
    return this;
  }

  /**
   * TLS configuration for the WebSocket source. Use <code>enabled</code> for standard <code>wss://
   * </code> connections, or <code>with_client_cert</code> to present a client certificate for
   * mutual TLS.
   *
   * @return tls
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineWebsocketSourceTls getTls() {
    return tls;
  }

  public void setTls(ObservabilityPipelineWebsocketSourceTls tls) {
    this.tls = tls;
  }

  public ObservabilityPipelineWebsocketSource tokenKey(String tokenKey) {
    this.tokenKey = tokenKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the bearer token. Used when <code>
   * auth_strategy</code> is <code>bearer</code>.
   *
   * @return tokenKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTokenKey() {
    return tokenKey;
  }

  public void setTokenKey(String tokenKey) {
    this.tokenKey = tokenKey;
  }

  public ObservabilityPipelineWebsocketSource type(ObservabilityPipelineWebsocketSourceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The source type. The value should always be <code>websocket</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineWebsocketSourceType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineWebsocketSourceType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public ObservabilityPipelineWebsocketSource uriKey(String uriKey) {
    this.uriKey = uriKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the WebSocket server URI (<code>ws://
   * </code> or <code>wss://</code>).
   *
   * @return uriKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URI_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUriKey() {
    return uriKey;
  }

  public void setUriKey(String uriKey) {
    this.uriKey = uriKey;
  }

  public ObservabilityPipelineWebsocketSource usernameKey(String usernameKey) {
    this.usernameKey = usernameKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the username. Used when <code>
   * auth_strategy</code> is <code>basic</code>.
   *
   * @return usernameKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUsernameKey() {
    return usernameKey;
  }

  public void setUsernameKey(String usernameKey) {
    this.usernameKey = usernameKey;
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
   * @return ObservabilityPipelineWebsocketSource
   */
  @JsonAnySetter
  public ObservabilityPipelineWebsocketSource putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineWebsocketSource object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineWebsocketSource observabilityPipelineWebsocketSource =
        (ObservabilityPipelineWebsocketSource) o;
    return Objects.equals(this.authStrategy, observabilityPipelineWebsocketSource.authStrategy)
        && Objects.equals(this.customKey, observabilityPipelineWebsocketSource.customKey)
        && Objects.equals(this.decoding, observabilityPipelineWebsocketSource.decoding)
        && Objects.equals(this.id, observabilityPipelineWebsocketSource.id)
        && Objects.equals(this.passwordKey, observabilityPipelineWebsocketSource.passwordKey)
        && Objects.equals(this.tls, observabilityPipelineWebsocketSource.tls)
        && Objects.equals(this.tokenKey, observabilityPipelineWebsocketSource.tokenKey)
        && Objects.equals(this.type, observabilityPipelineWebsocketSource.type)
        && Objects.equals(this.uriKey, observabilityPipelineWebsocketSource.uriKey)
        && Objects.equals(this.usernameKey, observabilityPipelineWebsocketSource.usernameKey)
        && Objects.equals(
            this.additionalProperties, observabilityPipelineWebsocketSource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        authStrategy,
        customKey,
        decoding,
        id,
        passwordKey,
        tls,
        tokenKey,
        type,
        uriKey,
        usernameKey,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineWebsocketSource {\n");
    sb.append("    authStrategy: ").append(toIndentedString(authStrategy)).append("\n");
    sb.append("    customKey: ").append(toIndentedString(customKey)).append("\n");
    sb.append("    decoding: ").append(toIndentedString(decoding)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    passwordKey: ").append(toIndentedString(passwordKey)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    tokenKey: ").append(toIndentedString(tokenKey)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uriKey: ").append(toIndentedString(uriKey)).append("\n");
    sb.append("    usernameKey: ").append(toIndentedString(usernameKey)).append("\n");
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
