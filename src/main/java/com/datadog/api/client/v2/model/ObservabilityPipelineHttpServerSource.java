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

/** The <code>http_server</code> source collects logs over HTTP POST from external services. */
@JsonPropertyOrder({
  ObservabilityPipelineHttpServerSource.JSON_PROPERTY_AUTH_STRATEGY,
  ObservabilityPipelineHttpServerSource.JSON_PROPERTY_DECODING,
  ObservabilityPipelineHttpServerSource.JSON_PROPERTY_ID,
  ObservabilityPipelineHttpServerSource.JSON_PROPERTY_TLS,
  ObservabilityPipelineHttpServerSource.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineHttpServerSource {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_STRATEGY = "auth_strategy";
  private ObservabilityPipelineHttpServerSourceAuthStrategy authStrategy;

  public static final String JSON_PROPERTY_DECODING = "decoding";
  private ObservabilityPipelineDecoding decoding;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TLS = "tls";
  private ObservabilityPipelineTls tls;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineHttpServerSourceType type =
      ObservabilityPipelineHttpServerSourceType.HTTP_SERVER;

  public ObservabilityPipelineHttpServerSource() {}

  @JsonCreator
  public ObservabilityPipelineHttpServerSource(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH_STRATEGY)
          ObservabilityPipelineHttpServerSourceAuthStrategy authStrategy,
      @JsonProperty(required = true, value = JSON_PROPERTY_DECODING)
          ObservabilityPipelineDecoding decoding,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineHttpServerSourceType type) {
    this.authStrategy = authStrategy;
    this.unparsed |= !authStrategy.isValid();
    this.decoding = decoding;
    this.unparsed |= !decoding.isValid();
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineHttpServerSource authStrategy(
      ObservabilityPipelineHttpServerSourceAuthStrategy authStrategy) {
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
  public ObservabilityPipelineHttpServerSourceAuthStrategy getAuthStrategy() {
    return authStrategy;
  }

  public void setAuthStrategy(ObservabilityPipelineHttpServerSourceAuthStrategy authStrategy) {
    if (!authStrategy.isValid()) {
      this.unparsed = true;
    }
    this.authStrategy = authStrategy;
  }

  public ObservabilityPipelineHttpServerSource decoding(ObservabilityPipelineDecoding decoding) {
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

  public ObservabilityPipelineHttpServerSource id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique ID for the HTTP server source.
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

  public ObservabilityPipelineHttpServerSource tls(ObservabilityPipelineTls tls) {
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
  public ObservabilityPipelineTls getTls() {
    return tls;
  }

  public void setTls(ObservabilityPipelineTls tls) {
    this.tls = tls;
  }

  public ObservabilityPipelineHttpServerSource type(
      ObservabilityPipelineHttpServerSourceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The source type. The value should always be <code>http_server</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineHttpServerSourceType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineHttpServerSourceType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return ObservabilityPipelineHttpServerSource
   */
  @JsonAnySetter
  public ObservabilityPipelineHttpServerSource putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineHttpServerSource object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineHttpServerSource observabilityPipelineHttpServerSource =
        (ObservabilityPipelineHttpServerSource) o;
    return Objects.equals(this.authStrategy, observabilityPipelineHttpServerSource.authStrategy)
        && Objects.equals(this.decoding, observabilityPipelineHttpServerSource.decoding)
        && Objects.equals(this.id, observabilityPipelineHttpServerSource.id)
        && Objects.equals(this.tls, observabilityPipelineHttpServerSource.tls)
        && Objects.equals(this.type, observabilityPipelineHttpServerSource.type)
        && Objects.equals(
            this.additionalProperties, observabilityPipelineHttpServerSource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authStrategy, decoding, id, tls, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineHttpServerSource {\n");
    sb.append("    authStrategy: ").append(toIndentedString(authStrategy)).append("\n");
    sb.append("    decoding: ").append(toIndentedString(decoding)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
