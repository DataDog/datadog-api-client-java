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
   * <p>The <code>http_client</code> destination sends data to an HTTP endpoint.</p>
   * <p><strong>Supported pipeline types:</strong> logs, metrics</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineHttpClientDestination.JSON_PROPERTY_AUTH_STRATEGY,
  ObservabilityPipelineHttpClientDestination.JSON_PROPERTY_COMPRESSION,
  ObservabilityPipelineHttpClientDestination.JSON_PROPERTY_CUSTOM_KEY,
  ObservabilityPipelineHttpClientDestination.JSON_PROPERTY_ENCODING,
  ObservabilityPipelineHttpClientDestination.JSON_PROPERTY_ID,
  ObservabilityPipelineHttpClientDestination.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineHttpClientDestination.JSON_PROPERTY_PASSWORD_KEY,
  ObservabilityPipelineHttpClientDestination.JSON_PROPERTY_TLS,
  ObservabilityPipelineHttpClientDestination.JSON_PROPERTY_TOKEN_KEY,
  ObservabilityPipelineHttpClientDestination.JSON_PROPERTY_TYPE,
  ObservabilityPipelineHttpClientDestination.JSON_PROPERTY_URI_KEY,
  ObservabilityPipelineHttpClientDestination.JSON_PROPERTY_USERNAME_KEY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineHttpClientDestination {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_STRATEGY = "auth_strategy";
  private ObservabilityPipelineHttpClientDestinationAuthStrategy authStrategy;

  public static final String JSON_PROPERTY_COMPRESSION = "compression";
  private ObservabilityPipelineHttpClientDestinationCompression compression;

  public static final String JSON_PROPERTY_CUSTOM_KEY = "custom_key";
  private String customKey;

  public static final String JSON_PROPERTY_ENCODING = "encoding";
  private ObservabilityPipelineHttpClientDestinationEncoding encoding;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_PASSWORD_KEY = "password_key";
  private String passwordKey;

  public static final String JSON_PROPERTY_TLS = "tls";
  private ObservabilityPipelineTls tls;

  public static final String JSON_PROPERTY_TOKEN_KEY = "token_key";
  private String tokenKey;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineHttpClientDestinationType type = ObservabilityPipelineHttpClientDestinationType.HTTP_CLIENT;

  public static final String JSON_PROPERTY_URI_KEY = "uri_key";
  private String uriKey;

  public static final String JSON_PROPERTY_USERNAME_KEY = "username_key";
  private String usernameKey;

  public ObservabilityPipelineHttpClientDestination() {}

  @JsonCreator
  public ObservabilityPipelineHttpClientDestination(
            @JsonProperty(required=true, value=JSON_PROPERTY_ENCODING)ObservabilityPipelineHttpClientDestinationEncoding encoding,
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_INPUTS)List<String> inputs,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)ObservabilityPipelineHttpClientDestinationType type) {
        this.encoding = encoding;
        this.unparsed |= !encoding.isValid();
        this.id = id;
        this.inputs = inputs;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public ObservabilityPipelineHttpClientDestination authStrategy(ObservabilityPipelineHttpClientDestinationAuthStrategy authStrategy) {
    this.authStrategy = authStrategy;
    this.unparsed |= !authStrategy.isValid();
    return this;
  }

  /**
   * <p>HTTP authentication strategy.</p>
   * @return authStrategy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AUTH_STRATEGY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ObservabilityPipelineHttpClientDestinationAuthStrategy getAuthStrategy() {
        return authStrategy;
      }
  public void setAuthStrategy(ObservabilityPipelineHttpClientDestinationAuthStrategy authStrategy) {
    if (!authStrategy.isValid()) {
        this.unparsed = true;
    }
    this.authStrategy = authStrategy;
  }
  public ObservabilityPipelineHttpClientDestination compression(ObservabilityPipelineHttpClientDestinationCompression compression) {
    this.compression = compression;
    this.unparsed |= compression.unparsed;
    return this;
  }

  /**
   * <p>Compression configuration for HTTP requests.</p>
   * @return compression
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COMPRESSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ObservabilityPipelineHttpClientDestinationCompression getCompression() {
        return compression;
      }
  public void setCompression(ObservabilityPipelineHttpClientDestinationCompression compression) {
    this.compression = compression;
  }
  public ObservabilityPipelineHttpClientDestination customKey(String customKey) {
    this.customKey = customKey;
    return this;
  }

  /**
   * <p>Name of the environment variable or secret that holds a custom header value (used with custom auth strategies).</p>
   * @return customKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CUSTOM_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCustomKey() {
        return customKey;
      }
  public void setCustomKey(String customKey) {
    this.customKey = customKey;
  }
  public ObservabilityPipelineHttpClientDestination encoding(ObservabilityPipelineHttpClientDestinationEncoding encoding) {
    this.encoding = encoding;
    this.unparsed |= !encoding.isValid();
    return this;
  }

  /**
   * <p>Encoding format for log events.</p>
   * @return encoding
  **/
      @JsonProperty(JSON_PROPERTY_ENCODING)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineHttpClientDestinationEncoding getEncoding() {
        return encoding;
      }
  public void setEncoding(ObservabilityPipelineHttpClientDestinationEncoding encoding) {
    if (!encoding.isValid()) {
        this.unparsed = true;
    }
    this.encoding = encoding;
  }
  public ObservabilityPipelineHttpClientDestination id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>The unique identifier for this component.</p>
   * @return id
  **/
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public ObservabilityPipelineHttpClientDestination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }
  public ObservabilityPipelineHttpClientDestination addInputsItem(String inputsItem) {
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * <p>A list of component IDs whose output is used as the input for this component.</p>
   * @return inputs
  **/
      @JsonProperty(JSON_PROPERTY_INPUTS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getInputs() {
        return inputs;
      }
  public void setInputs(List<String> inputs) {
    this.inputs = inputs;
  }
  public ObservabilityPipelineHttpClientDestination passwordKey(String passwordKey) {
    this.passwordKey = passwordKey;
    return this;
  }

  /**
   * <p>Name of the environment variable or secret that holds the password (used when <code>auth_strategy</code> is <code>basic</code>).</p>
   * @return passwordKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PASSWORD_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPasswordKey() {
        return passwordKey;
      }
  public void setPasswordKey(String passwordKey) {
    this.passwordKey = passwordKey;
  }
  public ObservabilityPipelineHttpClientDestination tls(ObservabilityPipelineTls tls) {
    this.tls = tls;
    this.unparsed |= tls.unparsed;
    return this;
  }

  /**
   * <p>Configuration for enabling TLS encryption between the pipeline component and external services.</p>
   * @return tls
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TLS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ObservabilityPipelineTls getTls() {
        return tls;
      }
  public void setTls(ObservabilityPipelineTls tls) {
    this.tls = tls;
  }
  public ObservabilityPipelineHttpClientDestination tokenKey(String tokenKey) {
    this.tokenKey = tokenKey;
    return this;
  }

  /**
   * <p>Name of the environment variable or secret that holds the bearer token (used when <code>auth_strategy</code> is <code>bearer</code>).</p>
   * @return tokenKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TOKEN_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTokenKey() {
        return tokenKey;
      }
  public void setTokenKey(String tokenKey) {
    this.tokenKey = tokenKey;
  }
  public ObservabilityPipelineHttpClientDestination type(ObservabilityPipelineHttpClientDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The destination type. The value should always be <code>http_client</code>.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineHttpClientDestinationType getType() {
        return type;
      }
  public void setType(ObservabilityPipelineHttpClientDestinationType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }
  public ObservabilityPipelineHttpClientDestination uriKey(String uriKey) {
    this.uriKey = uriKey;
    return this;
  }

  /**
   * <p>Name of the environment variable or secret that holds the HTTP endpoint URI.</p>
   * @return uriKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_URI_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getUriKey() {
        return uriKey;
      }
  public void setUriKey(String uriKey) {
    this.uriKey = uriKey;
  }
  public ObservabilityPipelineHttpClientDestination usernameKey(String usernameKey) {
    this.usernameKey = usernameKey;
    return this;
  }

  /**
   * <p>Name of the environment variable or secret that holds the username (used when <code>auth_strategy</code> is <code>basic</code>).</p>
   * @return usernameKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_USERNAME_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getUsernameKey() {
        return usernameKey;
      }
  public void setUsernameKey(String usernameKey) {
    this.usernameKey = usernameKey;
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
   * @return ObservabilityPipelineHttpClientDestination
   */
  @JsonAnySetter
  public ObservabilityPipelineHttpClientDestination putAdditionalProperty(String key, Object value) {
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
   * Return true if this ObservabilityPipelineHttpClientDestination object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineHttpClientDestination observabilityPipelineHttpClientDestination = (ObservabilityPipelineHttpClientDestination) o;
    return Objects.equals(this.authStrategy, observabilityPipelineHttpClientDestination.authStrategy) && Objects.equals(this.compression, observabilityPipelineHttpClientDestination.compression) && Objects.equals(this.customKey, observabilityPipelineHttpClientDestination.customKey) && Objects.equals(this.encoding, observabilityPipelineHttpClientDestination.encoding) && Objects.equals(this.id, observabilityPipelineHttpClientDestination.id) && Objects.equals(this.inputs, observabilityPipelineHttpClientDestination.inputs) && Objects.equals(this.passwordKey, observabilityPipelineHttpClientDestination.passwordKey) && Objects.equals(this.tls, observabilityPipelineHttpClientDestination.tls) && Objects.equals(this.tokenKey, observabilityPipelineHttpClientDestination.tokenKey) && Objects.equals(this.type, observabilityPipelineHttpClientDestination.type) && Objects.equals(this.uriKey, observabilityPipelineHttpClientDestination.uriKey) && Objects.equals(this.usernameKey, observabilityPipelineHttpClientDestination.usernameKey) && Objects.equals(this.additionalProperties, observabilityPipelineHttpClientDestination.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(authStrategy,compression,customKey,encoding,id,inputs,passwordKey,tls,tokenKey,type,uriKey,usernameKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineHttpClientDestination {\n");
    sb.append("    authStrategy: ").append(toIndentedString(authStrategy)).append("\n");
    sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
    sb.append("    customKey: ").append(toIndentedString(customKey)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
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
