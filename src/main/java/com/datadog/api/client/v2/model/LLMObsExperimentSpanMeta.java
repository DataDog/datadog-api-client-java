/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Metadata associated with an experiment span.</p>
 */
@JsonPropertyOrder({
  LLMObsExperimentSpanMeta.JSON_PROPERTY_ERROR,
  LLMObsExperimentSpanMeta.JSON_PROPERTY_EXPECTED_OUTPUT,
  LLMObsExperimentSpanMeta.JSON_PROPERTY_INPUT,
  LLMObsExperimentSpanMeta.JSON_PROPERTY_OUTPUT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsExperimentSpanMeta {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERROR = "error";
  private LLMObsExperimentSpanError error;

  public static final String JSON_PROPERTY_EXPECTED_OUTPUT = "expected_output";
  private Map<String, Object> expectedOutput = null;

  public static final String JSON_PROPERTY_INPUT = "input";
  private JsonNullable<AnyValue> input = JsonNullable.<AnyValue>undefined();

  public static final String JSON_PROPERTY_OUTPUT = "output";
  private JsonNullable<AnyValue> output = JsonNullable.<AnyValue>undefined();

  public LLMObsExperimentSpanMeta error(LLMObsExperimentSpanError error) {
    this.error = error;
    this.unparsed |= error.unparsed;
    return this;
  }

  /**
   * <p>Error details for an experiment span.</p>
   * @return error
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ERROR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public LLMObsExperimentSpanError getError() {
        return error;
      }
  public void setError(LLMObsExperimentSpanError error) {
    this.error = error;
  }
  public LLMObsExperimentSpanMeta expectedOutput(Map<String, Object> expectedOutput) {
    this.expectedOutput = expectedOutput;
    return this;
  }
  public LLMObsExperimentSpanMeta putExpectedOutputItem(String key, Object expectedOutputItem) {
    if (this.expectedOutput == null) {
      this.expectedOutput = new HashMap<>();
    }
    this.expectedOutput.put(key, expectedOutputItem);
    return this;
  }

  /**
   * <p>Expected output for the span, used for evaluation.</p>
   * @return expectedOutput
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EXPECTED_OUTPUT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, Object> getExpectedOutput() {
        return expectedOutput;
      }
  public void setExpectedOutput(Map<String, Object> expectedOutput) {
    this.expectedOutput = expectedOutput;
  }
  public LLMObsExperimentSpanMeta input(AnyValue input) {
    this.input = JsonNullable.<AnyValue>of(input);
    return this;
  }

  /**
   * <p>Represents any valid JSON value.</p>
   * @return input
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public AnyValue getInput() {
        return input.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_INPUT)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<AnyValue> getInput_JsonNullable() {
    return input;
  }
  @JsonProperty(JSON_PROPERTY_INPUT)public void setInput_JsonNullable(JsonNullable<AnyValue> input) {
    this.input = input;
  }
  public void setInput(AnyValue input) {
    this.input = JsonNullable.<AnyValue>of(input);
  }
  public LLMObsExperimentSpanMeta output(AnyValue output) {
    this.output = JsonNullable.<AnyValue>of(output);
    return this;
  }

  /**
   * <p>Represents any valid JSON value.</p>
   * @return output
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public AnyValue getOutput() {
        return output.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_OUTPUT)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<AnyValue> getOutput_JsonNullable() {
    return output;
  }
  @JsonProperty(JSON_PROPERTY_OUTPUT)public void setOutput_JsonNullable(JsonNullable<AnyValue> output) {
    this.output = output;
  }
  public void setOutput(AnyValue output) {
    this.output = JsonNullable.<AnyValue>of(output);
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return LLMObsExperimentSpanMeta
   */
  @JsonAnySetter
  public LLMObsExperimentSpanMeta putAdditionalProperty(String key, Object value) {
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
   * Return true if this LLMObsExperimentSpanMeta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsExperimentSpanMeta llmObsExperimentSpanMeta = (LLMObsExperimentSpanMeta) o;
    return Objects.equals(this.error, llmObsExperimentSpanMeta.error) && Objects.equals(this.expectedOutput, llmObsExperimentSpanMeta.expectedOutput) && Objects.equals(this.input, llmObsExperimentSpanMeta.input) && Objects.equals(this.output, llmObsExperimentSpanMeta.output) && Objects.equals(this.additionalProperties, llmObsExperimentSpanMeta.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(error,expectedOutput,input,output, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsExperimentSpanMeta {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    expectedOutput: ").append(toIndentedString(expectedOutput)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
