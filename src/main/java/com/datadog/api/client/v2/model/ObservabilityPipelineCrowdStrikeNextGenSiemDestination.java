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
 * The <code>crowdstrike_next_gen_siem</code> destination forwards logs to CrowdStrike Next Gen
 * SIEM.
 *
 * <p><strong>Supported pipeline types:</strong> logs
 */
@JsonPropertyOrder({
  ObservabilityPipelineCrowdStrikeNextGenSiemDestination.JSON_PROPERTY_BUFFER,
  ObservabilityPipelineCrowdStrikeNextGenSiemDestination.JSON_PROPERTY_COMPRESSION,
  ObservabilityPipelineCrowdStrikeNextGenSiemDestination.JSON_PROPERTY_ENCODING,
  ObservabilityPipelineCrowdStrikeNextGenSiemDestination.JSON_PROPERTY_ID,
  ObservabilityPipelineCrowdStrikeNextGenSiemDestination.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineCrowdStrikeNextGenSiemDestination.JSON_PROPERTY_TLS,
  ObservabilityPipelineCrowdStrikeNextGenSiemDestination.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineCrowdStrikeNextGenSiemDestination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUFFER = "buffer";
  private ObservabilityPipelineBufferOptions buffer;

  public static final String JSON_PROPERTY_COMPRESSION = "compression";
  private ObservabilityPipelineCrowdStrikeNextGenSiemDestinationCompression compression;

  public static final String JSON_PROPERTY_ENCODING = "encoding";
  private ObservabilityPipelineCrowdStrikeNextGenSiemDestinationEncoding encoding;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_TLS = "tls";
  private ObservabilityPipelineTls tls;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineCrowdStrikeNextGenSiemDestinationType type =
      ObservabilityPipelineCrowdStrikeNextGenSiemDestinationType.CROWDSTRIKE_NEXT_GEN_SIEM;

  public ObservabilityPipelineCrowdStrikeNextGenSiemDestination() {}

  @JsonCreator
  public ObservabilityPipelineCrowdStrikeNextGenSiemDestination(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENCODING)
          ObservabilityPipelineCrowdStrikeNextGenSiemDestinationEncoding encoding,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUTS) List<String> inputs,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineCrowdStrikeNextGenSiemDestinationType type) {
    this.encoding = encoding;
    this.unparsed |= !encoding.isValid();
    this.id = id;
    this.inputs = inputs;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineCrowdStrikeNextGenSiemDestination buffer(
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
  }

  public ObservabilityPipelineCrowdStrikeNextGenSiemDestination compression(
      ObservabilityPipelineCrowdStrikeNextGenSiemDestinationCompression compression) {
    this.compression = compression;
    this.unparsed |= compression.unparsed;
    return this;
  }

  /**
   * Compression configuration for log events.
   *
   * @return compression
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineCrowdStrikeNextGenSiemDestinationCompression getCompression() {
    return compression;
  }

  public void setCompression(
      ObservabilityPipelineCrowdStrikeNextGenSiemDestinationCompression compression) {
    this.compression = compression;
  }

  public ObservabilityPipelineCrowdStrikeNextGenSiemDestination encoding(
      ObservabilityPipelineCrowdStrikeNextGenSiemDestinationEncoding encoding) {
    this.encoding = encoding;
    this.unparsed |= !encoding.isValid();
    return this;
  }

  /**
   * Encoding format for log events.
   *
   * @return encoding
   */
  @JsonProperty(JSON_PROPERTY_ENCODING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineCrowdStrikeNextGenSiemDestinationEncoding getEncoding() {
    return encoding;
  }

  public void setEncoding(ObservabilityPipelineCrowdStrikeNextGenSiemDestinationEncoding encoding) {
    if (!encoding.isValid()) {
      this.unparsed = true;
    }
    this.encoding = encoding;
  }

  public ObservabilityPipelineCrowdStrikeNextGenSiemDestination id(String id) {
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

  public ObservabilityPipelineCrowdStrikeNextGenSiemDestination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ObservabilityPipelineCrowdStrikeNextGenSiemDestination addInputsItem(String inputsItem) {
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

  public ObservabilityPipelineCrowdStrikeNextGenSiemDestination tls(ObservabilityPipelineTls tls) {
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

  public ObservabilityPipelineCrowdStrikeNextGenSiemDestination type(
      ObservabilityPipelineCrowdStrikeNextGenSiemDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The destination type. The value should always be <code>crowdstrike_next_gen_siem</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineCrowdStrikeNextGenSiemDestinationType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineCrowdStrikeNextGenSiemDestinationType type) {
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
   * @return ObservabilityPipelineCrowdStrikeNextGenSiemDestination
   */
  @JsonAnySetter
  public ObservabilityPipelineCrowdStrikeNextGenSiemDestination putAdditionalProperty(
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
   * Return true if this ObservabilityPipelineCrowdStrikeNextGenSiemDestination object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineCrowdStrikeNextGenSiemDestination
        observabilityPipelineCrowdStrikeNextGenSiemDestination =
            (ObservabilityPipelineCrowdStrikeNextGenSiemDestination) o;
    return Objects.equals(
            this.buffer, observabilityPipelineCrowdStrikeNextGenSiemDestination.buffer)
        && Objects.equals(
            this.compression, observabilityPipelineCrowdStrikeNextGenSiemDestination.compression)
        && Objects.equals(
            this.encoding, observabilityPipelineCrowdStrikeNextGenSiemDestination.encoding)
        && Objects.equals(this.id, observabilityPipelineCrowdStrikeNextGenSiemDestination.id)
        && Objects.equals(
            this.inputs, observabilityPipelineCrowdStrikeNextGenSiemDestination.inputs)
        && Objects.equals(this.tls, observabilityPipelineCrowdStrikeNextGenSiemDestination.tls)
        && Objects.equals(this.type, observabilityPipelineCrowdStrikeNextGenSiemDestination.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineCrowdStrikeNextGenSiemDestination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buffer, compression, encoding, id, inputs, tls, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineCrowdStrikeNextGenSiemDestination {\n");
    sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
    sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
