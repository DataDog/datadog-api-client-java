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
 * The <code>prometheus_remote_write</code> destination forwards metrics to an endpoint that
 * supports the Prometheus Remote Write protocol.
 *
 * <p><strong>Supported pipeline types:</strong> metrics
 */
@JsonPropertyOrder({
  ObservabilityPipelinePrometheusRemoteWriteDestination.JSON_PROPERTY_AUTH_STRATEGY,
  ObservabilityPipelinePrometheusRemoteWriteDestination.JSON_PROPERTY_BUFFER,
  ObservabilityPipelinePrometheusRemoteWriteDestination.JSON_PROPERTY_DEFAULT_NAMESPACE,
  ObservabilityPipelinePrometheusRemoteWriteDestination.JSON_PROPERTY_ENDPOINT_URL_KEY,
  ObservabilityPipelinePrometheusRemoteWriteDestination.JSON_PROPERTY_ID,
  ObservabilityPipelinePrometheusRemoteWriteDestination.JSON_PROPERTY_INPUTS,
  ObservabilityPipelinePrometheusRemoteWriteDestination.JSON_PROPERTY_PASSWORD_KEY,
  ObservabilityPipelinePrometheusRemoteWriteDestination.JSON_PROPERTY_TENANT_ID,
  ObservabilityPipelinePrometheusRemoteWriteDestination.JSON_PROPERTY_TLS,
  ObservabilityPipelinePrometheusRemoteWriteDestination.JSON_PROPERTY_TOKEN_KEY,
  ObservabilityPipelinePrometheusRemoteWriteDestination.JSON_PROPERTY_TYPE,
  ObservabilityPipelinePrometheusRemoteWriteDestination.JSON_PROPERTY_USERNAME_KEY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelinePrometheusRemoteWriteDestination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_STRATEGY = "auth_strategy";
  private ObservabilityPipelinePrometheusRemoteWriteDestinationAuthStrategy authStrategy;

  public static final String JSON_PROPERTY_BUFFER = "buffer";
  private ObservabilityPipelineBufferOptions buffer;

  public static final String JSON_PROPERTY_DEFAULT_NAMESPACE = "default_namespace";
  private String defaultNamespace;

  public static final String JSON_PROPERTY_ENDPOINT_URL_KEY = "endpoint_url_key";
  private String endpointUrlKey;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_PASSWORD_KEY = "password_key";
  private String passwordKey;

  public static final String JSON_PROPERTY_TENANT_ID = "tenant_id";
  private String tenantId;

  public static final String JSON_PROPERTY_TLS = "tls";
  private ObservabilityPipelineClientTls tls;

  public static final String JSON_PROPERTY_TOKEN_KEY = "token_key";
  private String tokenKey;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelinePrometheusRemoteWriteDestinationType type =
      ObservabilityPipelinePrometheusRemoteWriteDestinationType.PROMETHEUS_REMOTE_WRITE;

  public static final String JSON_PROPERTY_USERNAME_KEY = "username_key";
  private String usernameKey;

  public ObservabilityPipelinePrometheusRemoteWriteDestination() {}

  @JsonCreator
  public ObservabilityPipelinePrometheusRemoteWriteDestination(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUTS) List<String> inputs,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelinePrometheusRemoteWriteDestinationType type) {
    this.id = id;
    this.inputs = inputs;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelinePrometheusRemoteWriteDestination authStrategy(
      ObservabilityPipelinePrometheusRemoteWriteDestinationAuthStrategy authStrategy) {
    this.authStrategy = authStrategy;
    this.unparsed |= !authStrategy.isValid();
    return this;
  }

  /**
   * The authentication strategy to use for outgoing Prometheus Remote Write requests.
   *
   * @return authStrategy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelinePrometheusRemoteWriteDestinationAuthStrategy getAuthStrategy() {
    return authStrategy;
  }

  public void setAuthStrategy(
      ObservabilityPipelinePrometheusRemoteWriteDestinationAuthStrategy authStrategy) {
    if (!authStrategy.isValid()) {
      this.unparsed = true;
    }
    this.authStrategy = authStrategy;
  }

  public ObservabilityPipelinePrometheusRemoteWriteDestination buffer(
      ObservabilityPipelineBufferOptions buffer) {
    this.buffer = buffer;
    this.unparsed |= buffer.unparsed;
    return this;
  }

  /**
   * Configuration for buffer settings on destination components.
   *
   * @return buffer
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUFFER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineBufferOptions getBuffer() {
    return buffer;
  }

  public void setBuffer(ObservabilityPipelineBufferOptions buffer) {
    this.buffer = buffer;
    if (buffer != null) {
      this.unparsed |= buffer.unparsed;
    }
  }

  public ObservabilityPipelinePrometheusRemoteWriteDestination defaultNamespace(
      String defaultNamespace) {
    this.defaultNamespace = defaultNamespace;
    return this;
  }

  /**
   * The default namespace to add as a prefix to metric names that do not already have one.
   *
   * @return defaultNamespace
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_NAMESPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDefaultNamespace() {
    return defaultNamespace;
  }

  public void setDefaultNamespace(String defaultNamespace) {
    this.defaultNamespace = defaultNamespace;
  }

  public ObservabilityPipelinePrometheusRemoteWriteDestination endpointUrlKey(
      String endpointUrlKey) {
    this.endpointUrlKey = endpointUrlKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the Prometheus Remote Write endpoint URL.
   * Defaults to <code>DESTINATION_PROMETHEUS_REMOTE_WRITE_ENDPOINT_URL</code> (prefixed with <code>
   * DD_OP_</code> at runtime).
   *
   * @return endpointUrlKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDPOINT_URL_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEndpointUrlKey() {
    return endpointUrlKey;
  }

  public void setEndpointUrlKey(String endpointUrlKey) {
    this.endpointUrlKey = endpointUrlKey;
  }

  public ObservabilityPipelinePrometheusRemoteWriteDestination id(String id) {
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

  public ObservabilityPipelinePrometheusRemoteWriteDestination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ObservabilityPipelinePrometheusRemoteWriteDestination addInputsItem(String inputsItem) {
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * A list of component IDs whose output is used as the <code>input</code> for this component.
   *
   * @return inputs
   */
  @JsonProperty(JSON_PROPERTY_INPUTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getInputs() {
    return inputs;
  }

  public void setInputs(List<String> inputs) {
    this.inputs = inputs;
  }

  public ObservabilityPipelinePrometheusRemoteWriteDestination passwordKey(String passwordKey) {
    this.passwordKey = passwordKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the password (used when <code>
   * auth_strategy</code> is <code>basic</code>).
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

  public ObservabilityPipelinePrometheusRemoteWriteDestination tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The tenant ID to include with outgoing requests. Used by multi-tenant Prometheus Remote Write
   * receivers.
   *
   * @return tenantId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public ObservabilityPipelinePrometheusRemoteWriteDestination tls(
      ObservabilityPipelineClientTls tls) {
    this.tls = tls;
    this.unparsed |= tls.unparsed;
    return this;
  }

  /**
   * Configuration for enabling TLS encryption between the pipeline component and external services.
   *
   * @return tls
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineClientTls getTls() {
    return tls;
  }

  public void setTls(ObservabilityPipelineClientTls tls) {
    this.tls = tls;
    if (tls != null) {
      this.unparsed |= tls.unparsed;
    }
  }

  public ObservabilityPipelinePrometheusRemoteWriteDestination tokenKey(String tokenKey) {
    this.tokenKey = tokenKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the bearer token (used when <code>
   * auth_strategy</code> is <code>bearer</code>).
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

  public ObservabilityPipelinePrometheusRemoteWriteDestination type(
      ObservabilityPipelinePrometheusRemoteWriteDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The destination type. The value should always be <code>prometheus_remote_write</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelinePrometheusRemoteWriteDestinationType getType() {
    return type;
  }

  public void setType(ObservabilityPipelinePrometheusRemoteWriteDestinationType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public ObservabilityPipelinePrometheusRemoteWriteDestination usernameKey(String usernameKey) {
    this.usernameKey = usernameKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the username (used when <code>
   * auth_strategy</code> is <code>basic</code>).
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
   * @return ObservabilityPipelinePrometheusRemoteWriteDestination
   */
  @JsonAnySetter
  public ObservabilityPipelinePrometheusRemoteWriteDestination putAdditionalProperty(
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

  /**
   * Return true if this ObservabilityPipelinePrometheusRemoteWriteDestination object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelinePrometheusRemoteWriteDestination
        observabilityPipelinePrometheusRemoteWriteDestination =
            (ObservabilityPipelinePrometheusRemoteWriteDestination) o;
    return Objects.equals(
            this.authStrategy, observabilityPipelinePrometheusRemoteWriteDestination.authStrategy)
        && Objects.equals(this.buffer, observabilityPipelinePrometheusRemoteWriteDestination.buffer)
        && Objects.equals(
            this.defaultNamespace,
            observabilityPipelinePrometheusRemoteWriteDestination.defaultNamespace)
        && Objects.equals(
            this.endpointUrlKey,
            observabilityPipelinePrometheusRemoteWriteDestination.endpointUrlKey)
        && Objects.equals(this.id, observabilityPipelinePrometheusRemoteWriteDestination.id)
        && Objects.equals(this.inputs, observabilityPipelinePrometheusRemoteWriteDestination.inputs)
        && Objects.equals(
            this.passwordKey, observabilityPipelinePrometheusRemoteWriteDestination.passwordKey)
        && Objects.equals(
            this.tenantId, observabilityPipelinePrometheusRemoteWriteDestination.tenantId)
        && Objects.equals(this.tls, observabilityPipelinePrometheusRemoteWriteDestination.tls)
        && Objects.equals(
            this.tokenKey, observabilityPipelinePrometheusRemoteWriteDestination.tokenKey)
        && Objects.equals(this.type, observabilityPipelinePrometheusRemoteWriteDestination.type)
        && Objects.equals(
            this.usernameKey, observabilityPipelinePrometheusRemoteWriteDestination.usernameKey)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelinePrometheusRemoteWriteDestination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        authStrategy,
        buffer,
        defaultNamespace,
        endpointUrlKey,
        id,
        inputs,
        passwordKey,
        tenantId,
        tls,
        tokenKey,
        type,
        usernameKey,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelinePrometheusRemoteWriteDestination {\n");
    sb.append("    authStrategy: ").append(toIndentedString(authStrategy)).append("\n");
    sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
    sb.append("    defaultNamespace: ").append(toIndentedString(defaultNamespace)).append("\n");
    sb.append("    endpointUrlKey: ").append(toIndentedString(endpointUrlKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    passwordKey: ").append(toIndentedString(passwordKey)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    tokenKey: ").append(toIndentedString(tokenKey)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
