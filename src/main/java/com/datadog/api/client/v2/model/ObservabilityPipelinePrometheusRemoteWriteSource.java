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

/**
 * The <code>prometheus_remote_write</code> source ingests metrics pushed over the Prometheus Remote
 * Write protocol.
 *
 * <p><strong>Supported pipeline types:</strong> metrics
 */
@JsonPropertyOrder({
  ObservabilityPipelinePrometheusRemoteWriteSource.JSON_PROPERTY_ADDRESS_KEY,
  ObservabilityPipelinePrometheusRemoteWriteSource.JSON_PROPERTY_AUTH_STRATEGY,
  ObservabilityPipelinePrometheusRemoteWriteSource.JSON_PROPERTY_ID,
  ObservabilityPipelinePrometheusRemoteWriteSource.JSON_PROPERTY_PASSWORD_KEY,
  ObservabilityPipelinePrometheusRemoteWriteSource.JSON_PROPERTY_PATH,
  ObservabilityPipelinePrometheusRemoteWriteSource.JSON_PROPERTY_TLS,
  ObservabilityPipelinePrometheusRemoteWriteSource.JSON_PROPERTY_TYPE,
  ObservabilityPipelinePrometheusRemoteWriteSource.JSON_PROPERTY_USERNAME_KEY,
  ObservabilityPipelinePrometheusRemoteWriteSource.JSON_PROPERTY_VALID_TOKENS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelinePrometheusRemoteWriteSource {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADDRESS_KEY = "address_key";
  private String addressKey;

  public static final String JSON_PROPERTY_AUTH_STRATEGY = "auth_strategy";
  private ObservabilityPipelinePrometheusRemoteWriteSourceAuthStrategy authStrategy;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PASSWORD_KEY = "password_key";
  private String passwordKey;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path = "/api/v1/write";

  public static final String JSON_PROPERTY_TLS = "tls";
  private ObservabilityPipelineMtlsServerTls tls;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelinePrometheusRemoteWriteSourceType type =
      ObservabilityPipelinePrometheusRemoteWriteSourceType.PROMETHEUS_REMOTE_WRITE;

  public static final String JSON_PROPERTY_USERNAME_KEY = "username_key";
  private String usernameKey;

  public static final String JSON_PROPERTY_VALID_TOKENS = "valid_tokens";
  private List<ObservabilityPipelinePrometheusRemoteWriteSourceValidToken> validTokens = null;

  public ObservabilityPipelinePrometheusRemoteWriteSource() {}

  @JsonCreator
  public ObservabilityPipelinePrometheusRemoteWriteSource(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH_STRATEGY)
          ObservabilityPipelinePrometheusRemoteWriteSourceAuthStrategy authStrategy,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelinePrometheusRemoteWriteSourceType type) {
    this.authStrategy = authStrategy;
    this.unparsed |= !authStrategy.isValid();
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelinePrometheusRemoteWriteSource addressKey(String addressKey) {
    this.addressKey = addressKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the listen address for the Prometheus
   * Remote Write endpoint.
   *
   * @return addressKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAddressKey() {
    return addressKey;
  }

  public void setAddressKey(String addressKey) {
    this.addressKey = addressKey;
  }

  public ObservabilityPipelinePrometheusRemoteWriteSource authStrategy(
      ObservabilityPipelinePrometheusRemoteWriteSourceAuthStrategy authStrategy) {
    this.authStrategy = authStrategy;
    this.unparsed |= !authStrategy.isValid();
    return this;
  }

  /**
   * HTTP authentication method.
   *
   * @return authStrategy
   */
  @JsonProperty(JSON_PROPERTY_AUTH_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelinePrometheusRemoteWriteSourceAuthStrategy getAuthStrategy() {
    return authStrategy;
  }

  public void setAuthStrategy(
      ObservabilityPipelinePrometheusRemoteWriteSourceAuthStrategy authStrategy) {
    if (!authStrategy.isValid()) {
      this.unparsed = true;
    }
    this.authStrategy = authStrategy;
  }

  public ObservabilityPipelinePrometheusRemoteWriteSource id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for this component. Used in other parts of the pipeline to reference this
   * component (for example, as the <code>input</code> to downstream components).
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

  public ObservabilityPipelinePrometheusRemoteWriteSource passwordKey(String passwordKey) {
    this.passwordKey = passwordKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the password (used when <code>
   * auth_strategy</code> is <code>plain</code>).
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

  public ObservabilityPipelinePrometheusRemoteWriteSource path(String path) {
    this.path = path;
    return this;
  }

  /**
   * The HTTP path on which the source listens for incoming Prometheus Remote Write requests.
   *
   * @return path
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ObservabilityPipelinePrometheusRemoteWriteSource tls(
      ObservabilityPipelineMtlsServerTls tls) {
    this.tls = tls;
    this.unparsed |= tls.unparsed;
    return this;
  }

  /**
   * Configuration for enabling TLS encryption between the pipeline component and external
   * connecting clients.
   *
   * @return tls
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineMtlsServerTls getTls() {
    return tls;
  }

  public void setTls(ObservabilityPipelineMtlsServerTls tls) {
    this.tls = tls;
    if (tls != null) {
      this.unparsed |= tls.unparsed;
    }
  }

  public ObservabilityPipelinePrometheusRemoteWriteSource type(
      ObservabilityPipelinePrometheusRemoteWriteSourceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The source type. The value should always be <code>prometheus_remote_write</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelinePrometheusRemoteWriteSourceType getType() {
    return type;
  }

  public void setType(ObservabilityPipelinePrometheusRemoteWriteSourceType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public ObservabilityPipelinePrometheusRemoteWriteSource usernameKey(String usernameKey) {
    this.usernameKey = usernameKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the username (used when <code>
   * auth_strategy</code> is <code>plain</code>).
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

  public ObservabilityPipelinePrometheusRemoteWriteSource validTokens(
      List<ObservabilityPipelinePrometheusRemoteWriteSourceValidToken> validTokens) {
    this.validTokens = validTokens;
    if (validTokens != null) {
      for (ObservabilityPipelinePrometheusRemoteWriteSourceValidToken item : validTokens) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ObservabilityPipelinePrometheusRemoteWriteSource addValidTokensItem(
      ObservabilityPipelinePrometheusRemoteWriteSourceValidToken validTokensItem) {
    if (this.validTokens == null) {
      this.validTokens = new ArrayList<>();
    }
    this.validTokens.add(validTokensItem);
    this.unparsed |= validTokensItem.unparsed;
    return this;
  }

  /**
   * A list of tokens that are accepted for authenticating incoming requests. When set, the source
   * rejects any request whose token does not match an enabled entry in this list.
   *
   * @return validTokens
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALID_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ObservabilityPipelinePrometheusRemoteWriteSourceValidToken> getValidTokens() {
    return validTokens;
  }

  public void setValidTokens(
      List<ObservabilityPipelinePrometheusRemoteWriteSourceValidToken> validTokens) {
    this.validTokens = validTokens;
    if (validTokens != null) {
      for (ObservabilityPipelinePrometheusRemoteWriteSourceValidToken item : validTokens) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return ObservabilityPipelinePrometheusRemoteWriteSource
   */
  @JsonAnySetter
  public ObservabilityPipelinePrometheusRemoteWriteSource putAdditionalProperty(
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

  /** Return true if this ObservabilityPipelinePrometheusRemoteWriteSource object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelinePrometheusRemoteWriteSource
        observabilityPipelinePrometheusRemoteWriteSource =
            (ObservabilityPipelinePrometheusRemoteWriteSource) o;
    return Objects.equals(
            this.addressKey, observabilityPipelinePrometheusRemoteWriteSource.addressKey)
        && Objects.equals(
            this.authStrategy, observabilityPipelinePrometheusRemoteWriteSource.authStrategy)
        && Objects.equals(this.id, observabilityPipelinePrometheusRemoteWriteSource.id)
        && Objects.equals(
            this.passwordKey, observabilityPipelinePrometheusRemoteWriteSource.passwordKey)
        && Objects.equals(this.path, observabilityPipelinePrometheusRemoteWriteSource.path)
        && Objects.equals(this.tls, observabilityPipelinePrometheusRemoteWriteSource.tls)
        && Objects.equals(this.type, observabilityPipelinePrometheusRemoteWriteSource.type)
        && Objects.equals(
            this.usernameKey, observabilityPipelinePrometheusRemoteWriteSource.usernameKey)
        && Objects.equals(
            this.validTokens, observabilityPipelinePrometheusRemoteWriteSource.validTokens)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelinePrometheusRemoteWriteSource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        addressKey,
        authStrategy,
        id,
        passwordKey,
        path,
        tls,
        type,
        usernameKey,
        validTokens,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelinePrometheusRemoteWriteSource {\n");
    sb.append("    addressKey: ").append(toIndentedString(addressKey)).append("\n");
    sb.append("    authStrategy: ").append(toIndentedString(authStrategy)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    passwordKey: ").append(toIndentedString(passwordKey)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    usernameKey: ").append(toIndentedString(usernameKey)).append("\n");
    sb.append("    validTokens: ").append(toIndentedString(validTokens)).append("\n");
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
