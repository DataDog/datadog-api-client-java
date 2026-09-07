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

/** The output of a completed LLM inference call. */
@JsonPropertyOrder({
  LLMObsInferenceRunResult.JSON_PROPERTY_ASSESSMENT,
  LLMObsInferenceRunResult.JSON_PROPERTY_CONTENT,
  LLMObsInferenceRunResult.JSON_PROPERTY_FINISH_REASON,
  LLMObsInferenceRunResult.JSON_PROPERTY_INFERENCE_CODES,
  LLMObsInferenceRunResult.JSON_PROPERTY_INPUT_TOKENS,
  LLMObsInferenceRunResult.JSON_PROPERTY_INTERNAL_REASONING,
  LLMObsInferenceRunResult.JSON_PROPERTY_LATENCY,
  LLMObsInferenceRunResult.JSON_PROPERTY_OUTPUT_TOKENS,
  LLMObsInferenceRunResult.JSON_PROPERTY_TOOLS,
  LLMObsInferenceRunResult.JSON_PROPERTY_TOTAL_TOKENS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsInferenceRunResult {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSESSMENT = "assessment";
  private String assessment;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_FINISH_REASON = "finish_reason";
  private String finishReason;

  public static final String JSON_PROPERTY_INFERENCE_CODES = "inference_codes";
  private List<LLMObsInferenceCode> inferenceCodes = new ArrayList<>();

  public static final String JSON_PROPERTY_INPUT_TOKENS = "input_tokens";
  private Long inputTokens;

  public static final String JSON_PROPERTY_INTERNAL_REASONING = "internal_reasoning";
  private LLMObsInternalReasoning internalReasoning;

  public static final String JSON_PROPERTY_LATENCY = "latency";
  private Long latency;

  public static final String JSON_PROPERTY_OUTPUT_TOKENS = "output_tokens";
  private Long outputTokens;

  public static final String JSON_PROPERTY_TOOLS = "tools";
  private List<LLMObsInferenceTool> tools = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL_TOKENS = "total_tokens";
  private Long totalTokens;

  public LLMObsInferenceRunResult() {}

  @JsonCreator
  public LLMObsInferenceRunResult(
      @JsonProperty(required = true, value = JSON_PROPERTY_ASSESSMENT) String assessment,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTENT) String content,
      @JsonProperty(required = true, value = JSON_PROPERTY_FINISH_REASON) String finishReason,
      @JsonProperty(required = true, value = JSON_PROPERTY_INFERENCE_CODES)
          List<LLMObsInferenceCode> inferenceCodes,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUT_TOKENS) Long inputTokens,
      @JsonProperty(required = true, value = JSON_PROPERTY_LATENCY) Long latency,
      @JsonProperty(required = true, value = JSON_PROPERTY_OUTPUT_TOKENS) Long outputTokens,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOOLS) List<LLMObsInferenceTool> tools,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL_TOKENS) Long totalTokens) {
    this.assessment = assessment;
    if (assessment != null) {}
    this.content = content;
    this.finishReason = finishReason;
    this.inferenceCodes = inferenceCodes;
    for (LLMObsInferenceCode item : inferenceCodes) {
      this.unparsed |= item.unparsed;
    }
    this.inputTokens = inputTokens;
    this.latency = latency;
    this.outputTokens = outputTokens;
    this.tools = tools;
    for (LLMObsInferenceTool item : tools) {
      this.unparsed |= item.unparsed;
    }
    this.totalTokens = totalTokens;
  }

  public LLMObsInferenceRunResult assessment(String assessment) {
    this.assessment = assessment;
    if (assessment != null) {}
    return this;
  }

  /**
   * An optional assessment of the inference output quality.
   *
   * @return assessment
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSESSMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAssessment() {
    return assessment;
  }

  public void setAssessment(String assessment) {
    this.assessment = assessment;
  }

  public LLMObsInferenceRunResult content(String content) {
    this.content = content;
    return this;
  }

  /**
   * The text content of the model response.
   *
   * @return content
   */
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public LLMObsInferenceRunResult finishReason(String finishReason) {
    this.finishReason = finishReason;
    return this;
  }

  /**
   * The reason the model stopped generating tokens.
   *
   * @return finishReason
   */
  @JsonProperty(JSON_PROPERTY_FINISH_REASON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFinishReason() {
    return finishReason;
  }

  public void setFinishReason(String finishReason) {
    this.finishReason = finishReason;
  }

  public LLMObsInferenceRunResult inferenceCodes(List<LLMObsInferenceCode> inferenceCodes) {
    this.inferenceCodes = inferenceCodes;
    for (LLMObsInferenceCode item : inferenceCodes) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsInferenceRunResult addInferenceCodesItem(LLMObsInferenceCode inferenceCodesItem) {
    this.inferenceCodes.add(inferenceCodesItem);
    this.unparsed |= inferenceCodesItem.unparsed;
    return this;
  }

  /**
   * List of generated code snippets for the inference configuration.
   *
   * @return inferenceCodes
   */
  @JsonProperty(JSON_PROPERTY_INFERENCE_CODES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<LLMObsInferenceCode> getInferenceCodes() {
    return inferenceCodes;
  }

  public void setInferenceCodes(List<LLMObsInferenceCode> inferenceCodes) {
    this.inferenceCodes = inferenceCodes;
    if (inferenceCodes != null) {
      for (LLMObsInferenceCode item : inferenceCodes) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LLMObsInferenceRunResult inputTokens(Long inputTokens) {
    this.inputTokens = inputTokens;
    return this;
  }

  /**
   * Number of input tokens consumed.
   *
   * @return inputTokens
   */
  @JsonProperty(JSON_PROPERTY_INPUT_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getInputTokens() {
    return inputTokens;
  }

  public void setInputTokens(Long inputTokens) {
    this.inputTokens = inputTokens;
  }

  public LLMObsInferenceRunResult internalReasoning(LLMObsInternalReasoning internalReasoning) {
    this.internalReasoning = internalReasoning;
    this.unparsed |= internalReasoning.unparsed;
    return this;
  }

  /**
   * The model's internal reasoning or thinking output, if available.
   *
   * @return internalReasoning
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERNAL_REASONING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsInternalReasoning getInternalReasoning() {
    return internalReasoning;
  }

  public void setInternalReasoning(LLMObsInternalReasoning internalReasoning) {
    this.internalReasoning = internalReasoning;
    if (internalReasoning != null) {
      this.unparsed |= internalReasoning.unparsed;
    }
  }

  public LLMObsInferenceRunResult latency(Long latency) {
    this.latency = latency;
    return this;
  }

  /**
   * Request latency in milliseconds.
   *
   * @return latency
   */
  @JsonProperty(JSON_PROPERTY_LATENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getLatency() {
    return latency;
  }

  public void setLatency(Long latency) {
    this.latency = latency;
  }

  public LLMObsInferenceRunResult outputTokens(Long outputTokens) {
    this.outputTokens = outputTokens;
    return this;
  }

  /**
   * Number of output tokens generated.
   *
   * @return outputTokens
   */
  @JsonProperty(JSON_PROPERTY_OUTPUT_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getOutputTokens() {
    return outputTokens;
  }

  public void setOutputTokens(Long outputTokens) {
    this.outputTokens = outputTokens;
  }

  public LLMObsInferenceRunResult tools(List<LLMObsInferenceTool> tools) {
    this.tools = tools;
    for (LLMObsInferenceTool item : tools) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsInferenceRunResult addToolsItem(LLMObsInferenceTool toolsItem) {
    this.tools.add(toolsItem);
    this.unparsed |= toolsItem.unparsed;
    return this;
  }

  /**
   * List of tools available to the model.
   *
   * @return tools
   */
  @JsonProperty(JSON_PROPERTY_TOOLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<LLMObsInferenceTool> getTools() {
    return tools;
  }

  public void setTools(List<LLMObsInferenceTool> tools) {
    this.tools = tools;
    if (tools != null) {
      for (LLMObsInferenceTool item : tools) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LLMObsInferenceRunResult totalTokens(Long totalTokens) {
    this.totalTokens = totalTokens;
    return this;
  }

  /**
   * Total tokens used (input plus output).
   *
   * @return totalTokens
   */
  @JsonProperty(JSON_PROPERTY_TOTAL_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTotalTokens() {
    return totalTokens;
  }

  public void setTotalTokens(Long totalTokens) {
    this.totalTokens = totalTokens;
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
   * @return LLMObsInferenceRunResult
   */
  @JsonAnySetter
  public LLMObsInferenceRunResult putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsInferenceRunResult object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsInferenceRunResult llmObsInferenceRunResult = (LLMObsInferenceRunResult) o;
    return Objects.equals(this.assessment, llmObsInferenceRunResult.assessment)
        && Objects.equals(this.content, llmObsInferenceRunResult.content)
        && Objects.equals(this.finishReason, llmObsInferenceRunResult.finishReason)
        && Objects.equals(this.inferenceCodes, llmObsInferenceRunResult.inferenceCodes)
        && Objects.equals(this.inputTokens, llmObsInferenceRunResult.inputTokens)
        && Objects.equals(this.internalReasoning, llmObsInferenceRunResult.internalReasoning)
        && Objects.equals(this.latency, llmObsInferenceRunResult.latency)
        && Objects.equals(this.outputTokens, llmObsInferenceRunResult.outputTokens)
        && Objects.equals(this.tools, llmObsInferenceRunResult.tools)
        && Objects.equals(this.totalTokens, llmObsInferenceRunResult.totalTokens)
        && Objects.equals(this.additionalProperties, llmObsInferenceRunResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assessment,
        content,
        finishReason,
        inferenceCodes,
        inputTokens,
        internalReasoning,
        latency,
        outputTokens,
        tools,
        totalTokens,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsInferenceRunResult {\n");
    sb.append("    assessment: ").append(toIndentedString(assessment)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    finishReason: ").append(toIndentedString(finishReason)).append("\n");
    sb.append("    inferenceCodes: ").append(toIndentedString(inferenceCodes)).append("\n");
    sb.append("    inputTokens: ").append(toIndentedString(inputTokens)).append("\n");
    sb.append("    internalReasoning: ").append(toIndentedString(internalReasoning)).append("\n");
    sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
    sb.append("    outputTokens: ").append(toIndentedString(outputTokens)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
    sb.append("    totalTokens: ").append(toIndentedString(totalTokens)).append("\n");
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
