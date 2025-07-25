/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
 * The decoder processor decodes any source attribute containing a base64/base16-encoded UTF-8/ASCII
 * string back to its original value, storing the result in a target attribute.
 */
@JsonPropertyOrder({
  LogsDecoderProcessor.JSON_PROPERTY_BINARY_TO_TEXT_ENCODING,
  LogsDecoderProcessor.JSON_PROPERTY_INPUT_REPRESENTATION,
  LogsDecoderProcessor.JSON_PROPERTY_IS_ENABLED,
  LogsDecoderProcessor.JSON_PROPERTY_NAME,
  LogsDecoderProcessor.JSON_PROPERTY_SOURCE,
  LogsDecoderProcessor.JSON_PROPERTY_TARGET,
  LogsDecoderProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsDecoderProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BINARY_TO_TEXT_ENCODING = "binary_to_text_encoding";
  private LogsDecoderProcessorBinaryToTextEncoding binaryToTextEncoding;

  public static final String JSON_PROPERTY_INPUT_REPRESENTATION = "input_representation";
  private LogsDecoderProcessorInputRepresentation inputRepresentation;

  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsDecoderProcessorType type = LogsDecoderProcessorType.DECODER_PROCESSOR;

  public LogsDecoderProcessor() {}

  @JsonCreator
  public LogsDecoderProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_BINARY_TO_TEXT_ENCODING)
          LogsDecoderProcessorBinaryToTextEncoding binaryToTextEncoding,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUT_REPRESENTATION)
          LogsDecoderProcessorInputRepresentation inputRepresentation,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE) String source,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET) String target,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) LogsDecoderProcessorType type) {
    this.binaryToTextEncoding = binaryToTextEncoding;
    this.unparsed |= !binaryToTextEncoding.isValid();
    this.inputRepresentation = inputRepresentation;
    this.unparsed |= !inputRepresentation.isValid();
    this.source = source;
    this.target = target;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LogsDecoderProcessor binaryToTextEncoding(
      LogsDecoderProcessorBinaryToTextEncoding binaryToTextEncoding) {
    this.binaryToTextEncoding = binaryToTextEncoding;
    this.unparsed |= !binaryToTextEncoding.isValid();
    return this;
  }

  /**
   * The encoding used to represent the binary data.
   *
   * @return binaryToTextEncoding
   */
  @JsonProperty(JSON_PROPERTY_BINARY_TO_TEXT_ENCODING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsDecoderProcessorBinaryToTextEncoding getBinaryToTextEncoding() {
    return binaryToTextEncoding;
  }

  public void setBinaryToTextEncoding(
      LogsDecoderProcessorBinaryToTextEncoding binaryToTextEncoding) {
    if (!binaryToTextEncoding.isValid()) {
      this.unparsed = true;
    }
    this.binaryToTextEncoding = binaryToTextEncoding;
  }

  public LogsDecoderProcessor inputRepresentation(
      LogsDecoderProcessorInputRepresentation inputRepresentation) {
    this.inputRepresentation = inputRepresentation;
    this.unparsed |= !inputRepresentation.isValid();
    return this;
  }

  /**
   * The original representation of input string.
   *
   * @return inputRepresentation
   */
  @JsonProperty(JSON_PROPERTY_INPUT_REPRESENTATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsDecoderProcessorInputRepresentation getInputRepresentation() {
    return inputRepresentation;
  }

  public void setInputRepresentation(LogsDecoderProcessorInputRepresentation inputRepresentation) {
    if (!inputRepresentation.isValid()) {
      this.unparsed = true;
    }
    this.inputRepresentation = inputRepresentation;
  }

  public LogsDecoderProcessor isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Whether the processor is enabled.
   *
   * @return isEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public LogsDecoderProcessor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the processor.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LogsDecoderProcessor source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Name of the log attribute with the encoded data.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public LogsDecoderProcessor target(String target) {
    this.target = target;
    return this;
  }

  /**
   * Name of the log attribute that contains the decoded data.
   *
   * @return target
   */
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public LogsDecoderProcessor type(LogsDecoderProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of logs decoder processor.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsDecoderProcessorType getType() {
    return type;
  }

  public void setType(LogsDecoderProcessorType type) {
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
   * @return LogsDecoderProcessor
   */
  @JsonAnySetter
  public LogsDecoderProcessor putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LogsDecoderProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsDecoderProcessor logsDecoderProcessor = (LogsDecoderProcessor) o;
    return Objects.equals(this.binaryToTextEncoding, logsDecoderProcessor.binaryToTextEncoding)
        && Objects.equals(this.inputRepresentation, logsDecoderProcessor.inputRepresentation)
        && Objects.equals(this.isEnabled, logsDecoderProcessor.isEnabled)
        && Objects.equals(this.name, logsDecoderProcessor.name)
        && Objects.equals(this.source, logsDecoderProcessor.source)
        && Objects.equals(this.target, logsDecoderProcessor.target)
        && Objects.equals(this.type, logsDecoderProcessor.type)
        && Objects.equals(this.additionalProperties, logsDecoderProcessor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        binaryToTextEncoding,
        inputRepresentation,
        isEnabled,
        name,
        source,
        target,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsDecoderProcessor {\n");
    sb.append("    binaryToTextEncoding: ")
        .append(toIndentedString(binaryToTextEncoding))
        .append("\n");
    sb.append("    inputRepresentation: ")
        .append(toIndentedString(inputRepresentation))
        .append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
