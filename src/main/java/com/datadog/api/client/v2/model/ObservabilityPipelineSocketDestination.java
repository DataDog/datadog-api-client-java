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
 * The <code>socket</code> destination sends logs over TCP or UDP to a remote server.
 *
 * <p><strong>Supported pipeline types:</strong> logs
 */
@JsonPropertyOrder({
  ObservabilityPipelineSocketDestination.JSON_PROPERTY_BUFFER,
  ObservabilityPipelineSocketDestination.JSON_PROPERTY_ENCODING,
  ObservabilityPipelineSocketDestination.JSON_PROPERTY_FRAMING,
  ObservabilityPipelineSocketDestination.JSON_PROPERTY_ID,
  ObservabilityPipelineSocketDestination.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineSocketDestination.JSON_PROPERTY_MODE,
  ObservabilityPipelineSocketDestination.JSON_PROPERTY_TLS,
  ObservabilityPipelineSocketDestination.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineSocketDestination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUFFER = "buffer";
  private ObservabilityPipelineBufferOptions buffer;

  public static final String JSON_PROPERTY_ENCODING = "encoding";
  private ObservabilityPipelineSocketDestinationEncoding encoding;

  public static final String JSON_PROPERTY_FRAMING = "framing";
  private ObservabilityPipelineSocketDestinationFraming framing;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_MODE = "mode";
  private ObservabilityPipelineSocketDestinationMode mode;

  public static final String JSON_PROPERTY_TLS = "tls";
  private ObservabilityPipelineTls tls;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineSocketDestinationType type =
      ObservabilityPipelineSocketDestinationType.SOCKET;

  public ObservabilityPipelineSocketDestination() {}

  @JsonCreator
  public ObservabilityPipelineSocketDestination(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENCODING)
          ObservabilityPipelineSocketDestinationEncoding encoding,
      @JsonProperty(required = true, value = JSON_PROPERTY_FRAMING)
          ObservabilityPipelineSocketDestinationFraming framing,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUTS) List<String> inputs,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODE)
          ObservabilityPipelineSocketDestinationMode mode,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineSocketDestinationType type) {
    this.encoding = encoding;
    this.unparsed |= !encoding.isValid();
    this.framing = framing;
    this.unparsed |= framing.unparsed;
    this.id = id;
    this.inputs = inputs;
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineSocketDestination buffer(ObservabilityPipelineBufferOptions buffer) {
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

  public ObservabilityPipelineSocketDestination encoding(
      ObservabilityPipelineSocketDestinationEncoding encoding) {
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
  public ObservabilityPipelineSocketDestinationEncoding getEncoding() {
    return encoding;
  }

  public void setEncoding(ObservabilityPipelineSocketDestinationEncoding encoding) {
    if (!encoding.isValid()) {
      this.unparsed = true;
    }
    this.encoding = encoding;
  }

  public ObservabilityPipelineSocketDestination framing(
      ObservabilityPipelineSocketDestinationFraming framing) {
    this.framing = framing;
    this.unparsed |= framing.unparsed;
    return this;
  }

  /**
   * Framing method configuration.
   *
   * @return framing
   */
  @JsonProperty(JSON_PROPERTY_FRAMING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineSocketDestinationFraming getFraming() {
    return framing;
  }

  public void setFraming(ObservabilityPipelineSocketDestinationFraming framing) {
    this.framing = framing;
  }

  public ObservabilityPipelineSocketDestination id(String id) {
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

  public ObservabilityPipelineSocketDestination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ObservabilityPipelineSocketDestination addInputsItem(String inputsItem) {
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

  public ObservabilityPipelineSocketDestination mode(
      ObservabilityPipelineSocketDestinationMode mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    return this;
  }

  /**
   * Protocol used to send logs.
   *
   * @return mode
   */
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineSocketDestinationMode getMode() {
    return mode;
  }

  public void setMode(ObservabilityPipelineSocketDestinationMode mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public ObservabilityPipelineSocketDestination tls(ObservabilityPipelineTls tls) {
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

  public ObservabilityPipelineSocketDestination type(
      ObservabilityPipelineSocketDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The destination type. The value should always be <code>socket</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineSocketDestinationType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineSocketDestinationType type) {
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
   * @return ObservabilityPipelineSocketDestination
   */
  @JsonAnySetter
  public ObservabilityPipelineSocketDestination putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineSocketDestination object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineSocketDestination observabilityPipelineSocketDestination =
        (ObservabilityPipelineSocketDestination) o;
    return Objects.equals(this.buffer, observabilityPipelineSocketDestination.buffer)
        && Objects.equals(this.encoding, observabilityPipelineSocketDestination.encoding)
        && Objects.equals(this.framing, observabilityPipelineSocketDestination.framing)
        && Objects.equals(this.id, observabilityPipelineSocketDestination.id)
        && Objects.equals(this.inputs, observabilityPipelineSocketDestination.inputs)
        && Objects.equals(this.mode, observabilityPipelineSocketDestination.mode)
        && Objects.equals(this.tls, observabilityPipelineSocketDestination.tls)
        && Objects.equals(this.type, observabilityPipelineSocketDestination.type)
        && Objects.equals(
            this.additionalProperties, observabilityPipelineSocketDestination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        buffer, encoding, framing, id, inputs, mode, tls, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineSocketDestination {\n");
    sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    framing: ").append(toIndentedString(framing)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
