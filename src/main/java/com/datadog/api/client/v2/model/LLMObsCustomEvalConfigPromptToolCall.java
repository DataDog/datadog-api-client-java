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

/** A tool call within a prompt message. */
@JsonPropertyOrder({
  LLMObsCustomEvalConfigPromptToolCall.JSON_PROPERTY_ARGUMENTS,
  LLMObsCustomEvalConfigPromptToolCall.JSON_PROPERTY_ID,
  LLMObsCustomEvalConfigPromptToolCall.JSON_PROPERTY_NAME,
  LLMObsCustomEvalConfigPromptToolCall.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsCustomEvalConfigPromptToolCall {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARGUMENTS = "arguments";
  private String arguments;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public LLMObsCustomEvalConfigPromptToolCall arguments(String arguments) {
    this.arguments = arguments;
    return this;
  }

  /**
   * JSON-encoded arguments for the tool call.
   *
   * @return arguments
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARGUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getArguments() {
    return arguments;
  }

  public void setArguments(String arguments) {
    this.arguments = arguments;
  }

  public LLMObsCustomEvalConfigPromptToolCall id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the tool call.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LLMObsCustomEvalConfigPromptToolCall name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the tool being called.
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

  public LLMObsCustomEvalConfigPromptToolCall type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the tool call.
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
   * @return LLMObsCustomEvalConfigPromptToolCall
   */
  @JsonAnySetter
  public LLMObsCustomEvalConfigPromptToolCall putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsCustomEvalConfigPromptToolCall object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsCustomEvalConfigPromptToolCall llmObsCustomEvalConfigPromptToolCall =
        (LLMObsCustomEvalConfigPromptToolCall) o;
    return Objects.equals(this.arguments, llmObsCustomEvalConfigPromptToolCall.arguments)
        && Objects.equals(this.id, llmObsCustomEvalConfigPromptToolCall.id)
        && Objects.equals(this.name, llmObsCustomEvalConfigPromptToolCall.name)
        && Objects.equals(this.type, llmObsCustomEvalConfigPromptToolCall.type)
        && Objects.equals(
            this.additionalProperties, llmObsCustomEvalConfigPromptToolCall.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arguments, id, name, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsCustomEvalConfigPromptToolCall {\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
