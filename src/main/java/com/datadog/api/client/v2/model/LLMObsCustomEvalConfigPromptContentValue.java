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

/** Value of a prompt message content block. */
@JsonPropertyOrder({
  LLMObsCustomEvalConfigPromptContentValue.JSON_PROPERTY_TEXT,
  LLMObsCustomEvalConfigPromptContentValue.JSON_PROPERTY_TOOL_CALL,
  LLMObsCustomEvalConfigPromptContentValue.JSON_PROPERTY_TOOL_CALL_RESULT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsCustomEvalConfigPromptContentValue {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_TOOL_CALL = "tool_call";
  private LLMObsCustomEvalConfigPromptToolCall toolCall;

  public static final String JSON_PROPERTY_TOOL_CALL_RESULT = "tool_call_result";
  private LLMObsCustomEvalConfigPromptToolResult toolCallResult;

  public LLMObsCustomEvalConfigPromptContentValue text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Text content of the message block.
   *
   * @return text
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public LLMObsCustomEvalConfigPromptContentValue toolCall(
      LLMObsCustomEvalConfigPromptToolCall toolCall) {
    this.toolCall = toolCall;
    this.unparsed |= toolCall.unparsed;
    return this;
  }

  /**
   * A tool call within a prompt message.
   *
   * @return toolCall
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOOL_CALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsCustomEvalConfigPromptToolCall getToolCall() {
    return toolCall;
  }

  public void setToolCall(LLMObsCustomEvalConfigPromptToolCall toolCall) {
    this.toolCall = toolCall;
  }

  public LLMObsCustomEvalConfigPromptContentValue toolCallResult(
      LLMObsCustomEvalConfigPromptToolResult toolCallResult) {
    this.toolCallResult = toolCallResult;
    this.unparsed |= toolCallResult.unparsed;
    return this;
  }

  /**
   * A tool call result within a prompt message.
   *
   * @return toolCallResult
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOOL_CALL_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsCustomEvalConfigPromptToolResult getToolCallResult() {
    return toolCallResult;
  }

  public void setToolCallResult(LLMObsCustomEvalConfigPromptToolResult toolCallResult) {
    this.toolCallResult = toolCallResult;
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
   * @return LLMObsCustomEvalConfigPromptContentValue
   */
  @JsonAnySetter
  public LLMObsCustomEvalConfigPromptContentValue putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsCustomEvalConfigPromptContentValue object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsCustomEvalConfigPromptContentValue llmObsCustomEvalConfigPromptContentValue =
        (LLMObsCustomEvalConfigPromptContentValue) o;
    return Objects.equals(this.text, llmObsCustomEvalConfigPromptContentValue.text)
        && Objects.equals(this.toolCall, llmObsCustomEvalConfigPromptContentValue.toolCall)
        && Objects.equals(
            this.toolCallResult, llmObsCustomEvalConfigPromptContentValue.toolCallResult)
        && Objects.equals(
            this.additionalProperties,
            llmObsCustomEvalConfigPromptContentValue.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, toolCall, toolCallResult, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsCustomEvalConfigPromptContentValue {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    toolCall: ").append(toIndentedString(toolCall)).append("\n");
    sb.append("    toolCallResult: ").append(toIndentedString(toolCallResult)).append("\n");
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
