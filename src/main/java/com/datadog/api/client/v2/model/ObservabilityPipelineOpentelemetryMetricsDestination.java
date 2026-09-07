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
   * <p>The <code>opentelemetry</code> destination forwards metrics using the OpenTelemetry Protocol (OTLP) over HTTP.</p>
   * <p><strong>Supported pipeline types:</strong> metrics</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineOpentelemetryMetricsDestination.JSON_PROPERTY_BUFFER,
  ObservabilityPipelineOpentelemetryMetricsDestination.JSON_PROPERTY_HTTP_CLIENT_URI_KEY,
  ObservabilityPipelineOpentelemetryMetricsDestination.JSON_PROPERTY_ID,
  ObservabilityPipelineOpentelemetryMetricsDestination.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineOpentelemetryMetricsDestination.JSON_PROPERTY_TLS,
  ObservabilityPipelineOpentelemetryMetricsDestination.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineOpentelemetryMetricsDestination {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUFFER = "buffer";
  private ObservabilityPipelineBufferOptions buffer;

  public static final String JSON_PROPERTY_HTTP_CLIENT_URI_KEY = "http_client_uri_key";
  private String httpClientUriKey = "DESTINATION_OTEL_HTTP_CLIENT_URI";

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_TLS = "tls";
  private ObservabilityPipelineTls tls;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineOpentelemetryMetricsDestinationType type = ObservabilityPipelineOpentelemetryMetricsDestinationType.OPENTELEMETRY;

  public ObservabilityPipelineOpentelemetryMetricsDestination() {}

  @JsonCreator
  public ObservabilityPipelineOpentelemetryMetricsDestination(
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_INPUTS)List<String> inputs,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)ObservabilityPipelineOpentelemetryMetricsDestinationType type) {
        this.id = id;
        this.inputs = inputs;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public ObservabilityPipelineOpentelemetryMetricsDestination buffer(ObservabilityPipelineBufferOptions buffer) {
    this.buffer = buffer;
    this.unparsed |= buffer.unparsed;
    return this;
  }

  /**
   * <p>Configuration for buffer settings on destination components.</p>
   * @return buffer
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BUFFER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ObservabilityPipelineBufferOptions getBuffer() {
        return buffer;
      }
  public void setBuffer(ObservabilityPipelineBufferOptions buffer) {
    this.buffer = buffer;
    if (buffer != null) {
      this.unparsed |= buffer.unparsed;
    }
  }
  public ObservabilityPipelineOpentelemetryMetricsDestination httpClientUriKey(String httpClientUriKey) {
    this.httpClientUriKey = httpClientUriKey;
    return this;
  }

  /**
   * <p>Environment variable name containing the URI of the OTLP HTTP endpoint to send metrics to.</p>
   * @return httpClientUriKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HTTP_CLIENT_URI_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getHttpClientUriKey() {
        return httpClientUriKey;
      }
  public void setHttpClientUriKey(String httpClientUriKey) {
    this.httpClientUriKey = httpClientUriKey;
  }
  public ObservabilityPipelineOpentelemetryMetricsDestination id(String id) {
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
  public ObservabilityPipelineOpentelemetryMetricsDestination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }
  public ObservabilityPipelineOpentelemetryMetricsDestination addInputsItem(String inputsItem) {
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * <p>A list of component IDs whose output is used as the <code>input</code> for this component.</p>
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
  public ObservabilityPipelineOpentelemetryMetricsDestination tls(ObservabilityPipelineTls tls) {
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
    if (tls != null) {
      this.unparsed |= tls.unparsed;
    }
  }
  public ObservabilityPipelineOpentelemetryMetricsDestination type(ObservabilityPipelineOpentelemetryMetricsDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The destination type. Always <code>opentelemetry</code>.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineOpentelemetryMetricsDestinationType getType() {
        return type;
      }
  public void setType(ObservabilityPipelineOpentelemetryMetricsDestinationType type) {
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
   * @return ObservabilityPipelineOpentelemetryMetricsDestination
   */
  @JsonAnySetter
  public ObservabilityPipelineOpentelemetryMetricsDestination putAdditionalProperty(String key, Object value) {
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
   * Return true if this ObservabilityPipelineOpentelemetryMetricsDestination object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineOpentelemetryMetricsDestination observabilityPipelineOpentelemetryMetricsDestination = (ObservabilityPipelineOpentelemetryMetricsDestination) o;
    return Objects.equals(this.buffer, observabilityPipelineOpentelemetryMetricsDestination.buffer) && Objects.equals(this.httpClientUriKey, observabilityPipelineOpentelemetryMetricsDestination.httpClientUriKey) && Objects.equals(this.id, observabilityPipelineOpentelemetryMetricsDestination.id) && Objects.equals(this.inputs, observabilityPipelineOpentelemetryMetricsDestination.inputs) && Objects.equals(this.tls, observabilityPipelineOpentelemetryMetricsDestination.tls) && Objects.equals(this.type, observabilityPipelineOpentelemetryMetricsDestination.type) && Objects.equals(this.additionalProperties, observabilityPipelineOpentelemetryMetricsDestination.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(buffer,httpClientUriKey,id,inputs,tls,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineOpentelemetryMetricsDestination {\n");
    sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
    sb.append("    httpClientUriKey: ").append(toIndentedString(httpClientUriKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
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
