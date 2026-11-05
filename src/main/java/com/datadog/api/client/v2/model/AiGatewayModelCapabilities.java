/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Model features reported by the enrichment source. Omitted properties are unknown. */
@JsonPropertyOrder({
  AiGatewayModelCapabilities.JSON_PROPERTY_ATTACHMENT,
  AiGatewayModelCapabilities.JSON_PROPERTY_INTERLEAVED_REASONING,
  AiGatewayModelCapabilities.JSON_PROPERTY_REASONING,
  AiGatewayModelCapabilities.JSON_PROPERTY_STRUCTURED_OUTPUT,
  AiGatewayModelCapabilities.JSON_PROPERTY_TEMPERATURE,
  AiGatewayModelCapabilities.JSON_PROPERTY_TOOL_CALL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayModelCapabilities {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTACHMENT = "attachment";
  private Boolean attachment;

  public static final String JSON_PROPERTY_INTERLEAVED_REASONING = "interleaved_reasoning";
  private Boolean interleavedReasoning;

  public static final String JSON_PROPERTY_REASONING = "reasoning";
  private Boolean reasoning;

  public static final String JSON_PROPERTY_STRUCTURED_OUTPUT = "structured_output";
  private Boolean structuredOutput;

  public static final String JSON_PROPERTY_TEMPERATURE = "temperature";
  private Boolean temperature;

  public static final String JSON_PROPERTY_TOOL_CALL = "tool_call";
  private Boolean toolCall;

  public AiGatewayModelCapabilities attachment(Boolean attachment) {
    this.attachment = attachment;
    return this;
  }

  /**
   * Whether attachment input is supported.
   *
   * @return attachment
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTACHMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAttachment() {
    return attachment;
  }

  public void setAttachment(Boolean attachment) {
    this.attachment = attachment;
  }

  public AiGatewayModelCapabilities interleavedReasoning(Boolean interleavedReasoning) {
    this.interleavedReasoning = interleavedReasoning;
    return this;
  }

  /**
   * Whether reasoning can be interleaved with tool use.
   *
   * @return interleavedReasoning
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERLEAVED_REASONING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getInterleavedReasoning() {
    return interleavedReasoning;
  }

  public void setInterleavedReasoning(Boolean interleavedReasoning) {
    this.interleavedReasoning = interleavedReasoning;
  }

  public AiGatewayModelCapabilities reasoning(Boolean reasoning) {
    this.reasoning = reasoning;
    return this;
  }

  /**
   * Whether reasoning is supported.
   *
   * @return reasoning
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASONING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getReasoning() {
    return reasoning;
  }

  public void setReasoning(Boolean reasoning) {
    this.reasoning = reasoning;
  }

  public AiGatewayModelCapabilities structuredOutput(Boolean structuredOutput) {
    this.structuredOutput = structuredOutput;
    return this;
  }

  /**
   * Whether structured output is supported.
   *
   * @return structuredOutput
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STRUCTURED_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getStructuredOutput() {
    return structuredOutput;
  }

  public void setStructuredOutput(Boolean structuredOutput) {
    this.structuredOutput = structuredOutput;
  }

  public AiGatewayModelCapabilities temperature(Boolean temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * Whether temperature can be configured.
   *
   * @return temperature
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPERATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getTemperature() {
    return temperature;
  }

  public void setTemperature(Boolean temperature) {
    this.temperature = temperature;
  }

  public AiGatewayModelCapabilities toolCall(Boolean toolCall) {
    this.toolCall = toolCall;
    return this;
  }

  /**
   * Whether tool calls are supported.
   *
   * @return toolCall
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOOL_CALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getToolCall() {
    return toolCall;
  }

  public void setToolCall(Boolean toolCall) {
    this.toolCall = toolCall;
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
   * @return AiGatewayModelCapabilities
   */
  @JsonAnySetter
  public AiGatewayModelCapabilities putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayModelCapabilities object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayModelCapabilities aiGatewayModelCapabilities = (AiGatewayModelCapabilities) o;
    return Objects.equals(this.attachment, aiGatewayModelCapabilities.attachment)
        && Objects.equals(
            this.interleavedReasoning, aiGatewayModelCapabilities.interleavedReasoning)
        && Objects.equals(this.reasoning, aiGatewayModelCapabilities.reasoning)
        && Objects.equals(this.structuredOutput, aiGatewayModelCapabilities.structuredOutput)
        && Objects.equals(this.temperature, aiGatewayModelCapabilities.temperature)
        && Objects.equals(this.toolCall, aiGatewayModelCapabilities.toolCall)
        && Objects.equals(
            this.additionalProperties, aiGatewayModelCapabilities.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        attachment,
        interleavedReasoning,
        reasoning,
        structuredOutput,
        temperature,
        toolCall,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayModelCapabilities {\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    interleavedReasoning: ")
        .append(toIndentedString(interleavedReasoning))
        .append("\n");
    sb.append("    reasoning: ").append(toIndentedString(reasoning)).append("\n");
    sb.append("    structuredOutput: ").append(toIndentedString(structuredOutput)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    toolCall: ").append(toIndentedString(toolCall)).append("\n");
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
