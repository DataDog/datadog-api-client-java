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

/**
 * A clustered point attached inline to a topic. The metric fields are populated only when the
 * request includes <code>include_metrics=true</code>.
 */
@JsonPropertyOrder({
  LLMObsPatternsClusteredPointRef.JSON_PROPERTY_DURATION,
  LLMObsPatternsClusteredPointRef.JSON_PROPERTY_ESTIMATED_TOTAL_COST,
  LLMObsPatternsClusteredPointRef.JSON_PROPERTY_EVALUATION,
  LLMObsPatternsClusteredPointRef.JSON_PROPERTY_INPUT_TOKENS,
  LLMObsPatternsClusteredPointRef.JSON_PROPERTY_OUTPUT_TOKENS,
  LLMObsPatternsClusteredPointRef.JSON_PROPERTY_SPAN_ID,
  LLMObsPatternsClusteredPointRef.JSON_PROPERTY_STATUS,
  LLMObsPatternsClusteredPointRef.JSON_PROPERTY_TOTAL_TOKENS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsPatternsClusteredPointRef {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DURATION = "duration";
  private Double duration;

  public static final String JSON_PROPERTY_ESTIMATED_TOTAL_COST = "estimated_total_cost";
  private Double estimatedTotalCost;

  public static final String JSON_PROPERTY_EVALUATION = "evaluation";
  private Map<String, Object> evaluation = null;

  public static final String JSON_PROPERTY_INPUT_TOKENS = "input_tokens";
  private Double inputTokens;

  public static final String JSON_PROPERTY_OUTPUT_TOKENS = "output_tokens";
  private Double outputTokens;

  public static final String JSON_PROPERTY_SPAN_ID = "span_id";
  private String spanId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TOTAL_TOKENS = "total_tokens";
  private Double totalTokens;

  public LLMObsPatternsClusteredPointRef() {}

  @JsonCreator
  public LLMObsPatternsClusteredPointRef(
      @JsonProperty(required = true, value = JSON_PROPERTY_SPAN_ID) String spanId) {
    this.spanId = spanId;
  }

  public LLMObsPatternsClusteredPointRef duration(Double duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Duration of the source span in nanoseconds. Included only when metrics are requested.
   *
   * @return duration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDuration() {
    return duration;
  }

  public void setDuration(Double duration) {
    this.duration = duration;
  }

  public LLMObsPatternsClusteredPointRef estimatedTotalCost(Double estimatedTotalCost) {
    this.estimatedTotalCost = estimatedTotalCost;
    return this;
  }

  /**
   * Estimated total cost of the source span. Included only when metrics are requested.
   *
   * @return estimatedTotalCost
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESTIMATED_TOTAL_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEstimatedTotalCost() {
    return estimatedTotalCost;
  }

  public void setEstimatedTotalCost(Double estimatedTotalCost) {
    this.estimatedTotalCost = estimatedTotalCost;
  }

  public LLMObsPatternsClusteredPointRef evaluation(Map<String, Object> evaluation) {
    this.evaluation = evaluation;
    return this;
  }

  public LLMObsPatternsClusteredPointRef putEvaluationItem(String key, Object evaluationItem) {
    if (this.evaluation == null) {
      this.evaluation = new HashMap<>();
    }
    this.evaluation.put(key, evaluationItem);
    return this;
  }

  /**
   * Evaluation results for the source span keyed by evaluation name. Included only when metrics are
   * requested.
   *
   * @return evaluation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVALUATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getEvaluation() {
    return evaluation;
  }

  public void setEvaluation(Map<String, Object> evaluation) {
    this.evaluation = evaluation;
  }

  public LLMObsPatternsClusteredPointRef inputTokens(Double inputTokens) {
    this.inputTokens = inputTokens;
    return this;
  }

  /**
   * Number of input tokens of the source span. Included only when metrics are requested.
   *
   * @return inputTokens
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInputTokens() {
    return inputTokens;
  }

  public void setInputTokens(Double inputTokens) {
    this.inputTokens = inputTokens;
  }

  public LLMObsPatternsClusteredPointRef outputTokens(Double outputTokens) {
    this.outputTokens = outputTokens;
    return this;
  }

  /**
   * Number of output tokens of the source span. Included only when metrics are requested.
   *
   * @return outputTokens
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTPUT_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOutputTokens() {
    return outputTokens;
  }

  public void setOutputTokens(Double outputTokens) {
    this.outputTokens = outputTokens;
  }

  public LLMObsPatternsClusteredPointRef spanId(String spanId) {
    this.spanId = spanId;
    return this;
  }

  /**
   * Identifier of the source span.
   *
   * @return spanId
   */
  @JsonProperty(JSON_PROPERTY_SPAN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSpanId() {
    return spanId;
  }

  public void setSpanId(String spanId) {
    this.spanId = spanId;
  }

  public LLMObsPatternsClusteredPointRef status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the source span. Included only when metrics are requested.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public LLMObsPatternsClusteredPointRef totalTokens(Double totalTokens) {
    this.totalTokens = totalTokens;
    return this;
  }

  /**
   * Total number of tokens of the source span. Included only when metrics are requested.
   *
   * @return totalTokens
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalTokens() {
    return totalTokens;
  }

  public void setTotalTokens(Double totalTokens) {
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
   * @return LLMObsPatternsClusteredPointRef
   */
  @JsonAnySetter
  public LLMObsPatternsClusteredPointRef putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsPatternsClusteredPointRef object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsPatternsClusteredPointRef llmObsPatternsClusteredPointRef =
        (LLMObsPatternsClusteredPointRef) o;
    return Objects.equals(this.duration, llmObsPatternsClusteredPointRef.duration)
        && Objects.equals(
            this.estimatedTotalCost, llmObsPatternsClusteredPointRef.estimatedTotalCost)
        && Objects.equals(this.evaluation, llmObsPatternsClusteredPointRef.evaluation)
        && Objects.equals(this.inputTokens, llmObsPatternsClusteredPointRef.inputTokens)
        && Objects.equals(this.outputTokens, llmObsPatternsClusteredPointRef.outputTokens)
        && Objects.equals(this.spanId, llmObsPatternsClusteredPointRef.spanId)
        && Objects.equals(this.status, llmObsPatternsClusteredPointRef.status)
        && Objects.equals(this.totalTokens, llmObsPatternsClusteredPointRef.totalTokens)
        && Objects.equals(
            this.additionalProperties, llmObsPatternsClusteredPointRef.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        duration,
        estimatedTotalCost,
        evaluation,
        inputTokens,
        outputTokens,
        spanId,
        status,
        totalTokens,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsPatternsClusteredPointRef {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    estimatedTotalCost: ").append(toIndentedString(estimatedTotalCost)).append("\n");
    sb.append("    evaluation: ").append(toIndentedString(evaluation)).append("\n");
    sb.append("    inputTokens: ").append(toIndentedString(inputTokens)).append("\n");
    sb.append("    outputTokens: ").append(toIndentedString(outputTokens)).append("\n");
    sb.append("    spanId: ").append(toIndentedString(spanId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
