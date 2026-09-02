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

/** A tool call result within a prompt message. */
@JsonPropertyOrder({
  LLMObsCustomEvalConfigPromptToolResult.JSON_PROPERTY_NAME,
  LLMObsCustomEvalConfigPromptToolResult.JSON_PROPERTY_RESULT,
  LLMObsCustomEvalConfigPromptToolResult.JSON_PROPERTY_TOOL_ID,
  LLMObsCustomEvalConfigPromptToolResult.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsCustomEvalConfigPromptToolResult {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RESULT = "result";
  private String result;

  public static final String JSON_PROPERTY_TOOL_ID = "tool_id";
  private String toolId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public LLMObsCustomEvalConfigPromptToolResult name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the tool that produced this result.
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

  public LLMObsCustomEvalConfigPromptToolResult result(String result) {
    this.result = result;
    return this;
  }

  /**
   * The result returned by the tool.
   *
   * @return result
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public LLMObsCustomEvalConfigPromptToolResult toolId(String toolId) {
    this.toolId = toolId;
    return this;
  }

  /**
   * Identifier of the tool call this result corresponds to.
   *
   * @return toolId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOOL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getToolId() {
    return toolId;
  }

  public void setToolId(String toolId) {
    this.toolId = toolId;
  }

  public LLMObsCustomEvalConfigPromptToolResult type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the tool result.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
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
   * @return LLMObsCustomEvalConfigPromptToolResult
   */
  @JsonAnySetter
  public LLMObsCustomEvalConfigPromptToolResult putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsCustomEvalConfigPromptToolResult object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsCustomEvalConfigPromptToolResult llmObsCustomEvalConfigPromptToolResult =
        (LLMObsCustomEvalConfigPromptToolResult) o;
    return Objects.equals(this.name, llmObsCustomEvalConfigPromptToolResult.name)
        && Objects.equals(this.result, llmObsCustomEvalConfigPromptToolResult.result)
        && Objects.equals(this.toolId, llmObsCustomEvalConfigPromptToolResult.toolId)
        && Objects.equals(this.type, llmObsCustomEvalConfigPromptToolResult.type)
        && Objects.equals(
            this.additionalProperties, llmObsCustomEvalConfigPromptToolResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, result, toolId, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsCustomEvalConfigPromptToolResult {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    toolId: ").append(toIndentedString(toolId)).append("\n");
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
