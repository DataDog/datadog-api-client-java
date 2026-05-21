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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** A tool definition available to the model during inference. */
@JsonPropertyOrder({
  LLMObsInferenceTool.JSON_PROPERTY_FUNCTION,
  LLMObsInferenceTool.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsInferenceTool {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FUNCTION = "function";
  private LLMObsInferenceFunction function;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public LLMObsInferenceTool() {}

  @JsonCreator
  public LLMObsInferenceTool(
      @JsonProperty(required = true, value = JSON_PROPERTY_FUNCTION)
          LLMObsInferenceFunction function,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type) {
    this.function = function;
    this.unparsed |= function.unparsed;
    this.type = type;
  }

  public LLMObsInferenceTool function(LLMObsInferenceFunction function) {
    this.function = function;
    this.unparsed |= function.unparsed;
    return this;
  }

  /**
   * A function definition for a tool available to the model.
   *
   * @return function
   */
  @JsonProperty(JSON_PROPERTY_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LLMObsInferenceFunction getFunction() {
    return function;
  }

  public void setFunction(LLMObsInferenceFunction function) {
    this.function = function;
  }

  public LLMObsInferenceTool type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of tool.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return LLMObsInferenceTool
   */
  @JsonAnySetter
  public LLMObsInferenceTool putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsInferenceTool object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsInferenceTool llmObsInferenceTool = (LLMObsInferenceTool) o;
    return Objects.equals(this.function, llmObsInferenceTool.function)
        && Objects.equals(this.type, llmObsInferenceTool.type)
        && Objects.equals(this.additionalProperties, llmObsInferenceTool.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(function, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsInferenceTool {\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
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
