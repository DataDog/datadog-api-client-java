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
 * The <code>splunk_hec_metrics</code> destination forwards metrics to Splunk using the HTTP Event
 * Collector (HEC).
 *
 * <p><strong>Supported pipeline types:</strong> metrics
 */
@JsonPropertyOrder({
  ObservabilityPipelineSplunkHecMetricsDestination.JSON_PROPERTY_BUFFER,
  ObservabilityPipelineSplunkHecMetricsDestination.JSON_PROPERTY_COMPRESSION,
  ObservabilityPipelineSplunkHecMetricsDestination.JSON_PROPERTY_DEFAULT_NAMESPACE,
  ObservabilityPipelineSplunkHecMetricsDestination.JSON_PROPERTY_ENDPOINT_URL_KEY,
  ObservabilityPipelineSplunkHecMetricsDestination.JSON_PROPERTY_ID,
  ObservabilityPipelineSplunkHecMetricsDestination.JSON_PROPERTY_INDEX,
  ObservabilityPipelineSplunkHecMetricsDestination.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineSplunkHecMetricsDestination.JSON_PROPERTY_SOURCE,
  ObservabilityPipelineSplunkHecMetricsDestination.JSON_PROPERTY_SOURCETYPE,
  ObservabilityPipelineSplunkHecMetricsDestination.JSON_PROPERTY_TLS,
  ObservabilityPipelineSplunkHecMetricsDestination.JSON_PROPERTY_TOKEN_KEY,
  ObservabilityPipelineSplunkHecMetricsDestination.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineSplunkHecMetricsDestination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUFFER = "buffer";
  private ObservabilityPipelineBufferOptions buffer;

  public static final String JSON_PROPERTY_COMPRESSION = "compression";
  private ObservabilityPipelineSplunkHecMetricsDestinationCompression compression =
      ObservabilityPipelineSplunkHecMetricsDestinationCompression.NONE;

  public static final String JSON_PROPERTY_DEFAULT_NAMESPACE = "default_namespace";
  private String defaultNamespace;

  public static final String JSON_PROPERTY_ENDPOINT_URL_KEY = "endpoint_url_key";
  private String endpointUrlKey;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INDEX = "index";
  private String index;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_SOURCETYPE = "sourcetype";
  private String sourcetype;

  public static final String JSON_PROPERTY_TLS = "tls";
  private ObservabilityPipelineTls tls;

  public static final String JSON_PROPERTY_TOKEN_KEY = "token_key";
  private String tokenKey;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineSplunkHecMetricsDestinationType type =
      ObservabilityPipelineSplunkHecMetricsDestinationType.SPLUNK_HEC_METRICS;

  public ObservabilityPipelineSplunkHecMetricsDestination() {}

  @JsonCreator
  public ObservabilityPipelineSplunkHecMetricsDestination(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUTS) List<String> inputs,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineSplunkHecMetricsDestinationType type) {
    this.id = id;
    this.inputs = inputs;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineSplunkHecMetricsDestination buffer(
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

  public ObservabilityPipelineSplunkHecMetricsDestination compression(
      ObservabilityPipelineSplunkHecMetricsDestinationCompression compression) {
    this.compression = compression;
    this.unparsed |= !compression.isValid();
    return this;
  }

  /**
   * Compression algorithm applied when sending metrics to Splunk HEC.
   *
   * @return compression
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineSplunkHecMetricsDestinationCompression getCompression() {
    return compression;
  }

  public void setCompression(
      ObservabilityPipelineSplunkHecMetricsDestinationCompression compression) {
    if (!compression.isValid()) {
      this.unparsed = true;
    }
    this.compression = compression;
  }

  public ObservabilityPipelineSplunkHecMetricsDestination defaultNamespace(
      String defaultNamespace) {
    this.defaultNamespace = defaultNamespace;
    return this;
  }

  /**
   * Optional default namespace for metrics sent to Splunk HEC.
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

  public ObservabilityPipelineSplunkHecMetricsDestination endpointUrlKey(String endpointUrlKey) {
    this.endpointUrlKey = endpointUrlKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the Splunk HEC endpoint URL.
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

  public ObservabilityPipelineSplunkHecMetricsDestination id(String id) {
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

  public ObservabilityPipelineSplunkHecMetricsDestination index(String index) {
    this.index = index;
    return this;
  }

  /**
   * Optional name of the Splunk index where metrics are written.
   *
   * @return index
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIndex() {
    return index;
  }

  public void setIndex(String index) {
    this.index = index;
  }

  public ObservabilityPipelineSplunkHecMetricsDestination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ObservabilityPipelineSplunkHecMetricsDestination addInputsItem(String inputsItem) {
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

  public ObservabilityPipelineSplunkHecMetricsDestination source(String source) {
    this.source = source;
    return this;
  }

  /**
   * The Splunk source field value for metric events.
   *
   * @return source
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public ObservabilityPipelineSplunkHecMetricsDestination sourcetype(String sourcetype) {
    this.sourcetype = sourcetype;
    return this;
  }

  /**
   * The Splunk sourcetype to assign to metric events.
   *
   * @return sourcetype
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCETYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSourcetype() {
    return sourcetype;
  }

  public void setSourcetype(String sourcetype) {
    this.sourcetype = sourcetype;
  }

  public ObservabilityPipelineSplunkHecMetricsDestination tls(ObservabilityPipelineTls tls) {
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
    if (tls != null) {
      this.unparsed |= tls.unparsed;
    }
  }

  public ObservabilityPipelineSplunkHecMetricsDestination tokenKey(String tokenKey) {
    this.tokenKey = tokenKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the Splunk HEC token.
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

  public ObservabilityPipelineSplunkHecMetricsDestination type(
      ObservabilityPipelineSplunkHecMetricsDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The destination type. Always <code>splunk_hec_metrics</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineSplunkHecMetricsDestinationType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineSplunkHecMetricsDestinationType type) {
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
   * @return ObservabilityPipelineSplunkHecMetricsDestination
   */
  @JsonAnySetter
  public ObservabilityPipelineSplunkHecMetricsDestination putAdditionalProperty(
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

  /** Return true if this ObservabilityPipelineSplunkHecMetricsDestination object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineSplunkHecMetricsDestination
        observabilityPipelineSplunkHecMetricsDestination =
            (ObservabilityPipelineSplunkHecMetricsDestination) o;
    return Objects.equals(this.buffer, observabilityPipelineSplunkHecMetricsDestination.buffer)
        && Objects.equals(
            this.compression, observabilityPipelineSplunkHecMetricsDestination.compression)
        && Objects.equals(
            this.defaultNamespace,
            observabilityPipelineSplunkHecMetricsDestination.defaultNamespace)
        && Objects.equals(
            this.endpointUrlKey, observabilityPipelineSplunkHecMetricsDestination.endpointUrlKey)
        && Objects.equals(this.id, observabilityPipelineSplunkHecMetricsDestination.id)
        && Objects.equals(this.index, observabilityPipelineSplunkHecMetricsDestination.index)
        && Objects.equals(this.inputs, observabilityPipelineSplunkHecMetricsDestination.inputs)
        && Objects.equals(this.source, observabilityPipelineSplunkHecMetricsDestination.source)
        && Objects.equals(
            this.sourcetype, observabilityPipelineSplunkHecMetricsDestination.sourcetype)
        && Objects.equals(this.tls, observabilityPipelineSplunkHecMetricsDestination.tls)
        && Objects.equals(this.tokenKey, observabilityPipelineSplunkHecMetricsDestination.tokenKey)
        && Objects.equals(this.type, observabilityPipelineSplunkHecMetricsDestination.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineSplunkHecMetricsDestination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        buffer,
        compression,
        defaultNamespace,
        endpointUrlKey,
        id,
        index,
        inputs,
        source,
        sourcetype,
        tls,
        tokenKey,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineSplunkHecMetricsDestination {\n");
    sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
    sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
    sb.append("    defaultNamespace: ").append(toIndentedString(defaultNamespace)).append("\n");
    sb.append("    endpointUrlKey: ").append(toIndentedString(endpointUrlKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourcetype: ").append(toIndentedString(sourcetype)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    tokenKey: ").append(toIndentedString(tokenKey)).append("\n");
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
