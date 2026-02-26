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
   * <p>The <code>opentelemetry</code> source receives telemetry data using the OpenTelemetry Protocol (OTLP) over gRPC and HTTP.</p>
   * <p><strong>Supported pipeline types:</strong> logs</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineOpentelemetrySource.JSON_PROPERTY_GRPC_ADDRESS_KEY,
  ObservabilityPipelineOpentelemetrySource.JSON_PROPERTY_HTTP_ADDRESS_KEY,
  ObservabilityPipelineOpentelemetrySource.JSON_PROPERTY_ID,
  ObservabilityPipelineOpentelemetrySource.JSON_PROPERTY_TLS,
  ObservabilityPipelineOpentelemetrySource.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineOpentelemetrySource {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_GRPC_ADDRESS_KEY = "grpc_address_key";
  private String grpcAddressKey;

  public static final String JSON_PROPERTY_HTTP_ADDRESS_KEY = "http_address_key";
  private String httpAddressKey;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TLS = "tls";
  private ObservabilityPipelineTls tls;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineOpentelemetrySourceType type = ObservabilityPipelineOpentelemetrySourceType.OPENTELEMETRY;

  public ObservabilityPipelineOpentelemetrySource() {}

  @JsonCreator
  public ObservabilityPipelineOpentelemetrySource(
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)ObservabilityPipelineOpentelemetrySourceType type) {
        this.id = id;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public ObservabilityPipelineOpentelemetrySource grpcAddressKey(String grpcAddressKey) {
    this.grpcAddressKey = grpcAddressKey;
    return this;
  }

  /**
   * <p>Environment variable name containing the gRPC server address for receiving OTLP data. Must be a valid environment variable name (alphanumeric characters and underscores only).</p>
   * @return grpcAddressKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GRPC_ADDRESS_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getGrpcAddressKey() {
        return grpcAddressKey;
      }
  public void setGrpcAddressKey(String grpcAddressKey) {
    this.grpcAddressKey = grpcAddressKey;
  }
  public ObservabilityPipelineOpentelemetrySource httpAddressKey(String httpAddressKey) {
    this.httpAddressKey = httpAddressKey;
    return this;
  }

  /**
   * <p>Environment variable name containing the HTTP server address for receiving OTLP data. Must be a valid environment variable name (alphanumeric characters and underscores only).</p>
   * @return httpAddressKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HTTP_ADDRESS_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getHttpAddressKey() {
        return httpAddressKey;
      }
  public void setHttpAddressKey(String httpAddressKey) {
    this.httpAddressKey = httpAddressKey;
  }
  public ObservabilityPipelineOpentelemetrySource id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>The unique identifier for this component. Used in other parts of the pipeline to reference this component (for example, as the <code>input</code> to downstream components).</p>
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
  public ObservabilityPipelineOpentelemetrySource tls(ObservabilityPipelineTls tls) {
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
  public ObservabilityPipelineOpentelemetrySource type(ObservabilityPipelineOpentelemetrySourceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The source type. The value should always be <code>opentelemetry</code>.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineOpentelemetrySourceType getType() {
        return type;
      }
  public void setType(ObservabilityPipelineOpentelemetrySourceType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
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
   * @return ObservabilityPipelineOpentelemetrySource
   */
  @JsonAnySetter
  public ObservabilityPipelineOpentelemetrySource putAdditionalProperty(String key, Object value) {
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
   * Return true if this ObservabilityPipelineOpentelemetrySource object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineOpentelemetrySource observabilityPipelineOpentelemetrySource = (ObservabilityPipelineOpentelemetrySource) o;
    return Objects.equals(this.grpcAddressKey, observabilityPipelineOpentelemetrySource.grpcAddressKey) && Objects.equals(this.httpAddressKey, observabilityPipelineOpentelemetrySource.httpAddressKey) && Objects.equals(this.id, observabilityPipelineOpentelemetrySource.id) && Objects.equals(this.tls, observabilityPipelineOpentelemetrySource.tls) && Objects.equals(this.type, observabilityPipelineOpentelemetrySource.type) && Objects.equals(this.additionalProperties, observabilityPipelineOpentelemetrySource.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(grpcAddressKey,httpAddressKey,id,tls,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineOpentelemetrySource {\n");
    sb.append("    grpcAddressKey: ").append(toIndentedString(grpcAddressKey)).append("\n");
    sb.append("    httpAddressKey: ").append(toIndentedString(httpAddressKey)).append("\n");
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
