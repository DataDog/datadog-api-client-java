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

/** A tool call made during LLM inference. */
@JsonPropertyOrder({
  LLMObsInferenceToolCall.JSON_PROPERTY_ARGUMENTS,
  LLMObsInferenceToolCall.JSON_PROPERTY_NAME,
  LLMObsInferenceToolCall.JSON_PROPERTY_TOOL_ID,
  LLMObsInferenceToolCall.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsInferenceToolCall {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARGUMENTS = "arguments";
  private Map<String, Object> arguments = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TOOL_ID = "tool_id";
  private String toolId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public LLMObsInferenceToolCall arguments(Map<String, Object> arguments) {
    this.arguments = arguments;
    return this;
  }

  public LLMObsInferenceToolCall putArgumentsItem(String key, Object argumentsItem) {
    if (this.arguments == null) {
      this.arguments = new HashMap<>();
    }
    this.arguments.put(key, argumentsItem);
    return this;
  }

  /**
   * The arguments passed to the tool.
   *
   * @return arguments
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARGUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getArguments() {
    return arguments;
  }

  public void setArguments(Map<String, Object> arguments) {
    this.arguments = arguments;
  }

  public LLMObsInferenceToolCall name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the tool being called.
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

  public LLMObsInferenceToolCall toolId(String toolId) {
    this.toolId = toolId;
    return this;
  }

  /**
   * Unique identifier for the tool call.
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

  public LLMObsInferenceToolCall type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of tool call.
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
   * @return LLMObsInferenceToolCall
   */
  @JsonAnySetter
  public LLMObsInferenceToolCall putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsInferenceToolCall object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsInferenceToolCall llmObsInferenceToolCall = (LLMObsInferenceToolCall) o;
    return Objects.equals(this.arguments, llmObsInferenceToolCall.arguments)
        && Objects.equals(this.name, llmObsInferenceToolCall.name)
        && Objects.equals(this.toolId, llmObsInferenceToolCall.toolId)
        && Objects.equals(this.type, llmObsInferenceToolCall.type)
        && Objects.equals(this.additionalProperties, llmObsInferenceToolCall.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arguments, name, toolId, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsInferenceToolCall {\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
