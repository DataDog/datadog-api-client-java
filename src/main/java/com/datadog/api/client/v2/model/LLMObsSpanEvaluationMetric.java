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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** An evaluation metric associated with an LLM Observability span. */
@JsonPropertyOrder({
  LLMObsSpanEvaluationMetric.JSON_PROPERTY_ASSESSMENT,
  LLMObsSpanEvaluationMetric.JSON_PROPERTY_EVAL_METRIC_TYPE,
  LLMObsSpanEvaluationMetric.JSON_PROPERTY_REASONING,
  LLMObsSpanEvaluationMetric.JSON_PROPERTY_STATUS,
  LLMObsSpanEvaluationMetric.JSON_PROPERTY_TAGS,
  LLMObsSpanEvaluationMetric.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsSpanEvaluationMetric {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSESSMENT = "assessment";
  private String assessment;

  public static final String JSON_PROPERTY_EVAL_METRIC_TYPE = "eval_metric_type";
  private String evalMetricType;

  public static final String JSON_PROPERTY_REASONING = "reasoning";
  private String reasoning;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Object value = null;

  public LLMObsSpanEvaluationMetric assessment(String assessment) {
    this.assessment = assessment;
    return this;
  }

  /**
   * Assessment result (e.g., pass or fail).
   *
   * @return assessment
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSESSMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAssessment() {
    return assessment;
  }

  public void setAssessment(String assessment) {
    this.assessment = assessment;
  }

  public LLMObsSpanEvaluationMetric evalMetricType(String evalMetricType) {
    this.evalMetricType = evalMetricType;
    return this;
  }

  /**
   * Type of the evaluation metric (e.g., score, categorical, boolean).
   *
   * @return evalMetricType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVAL_METRIC_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEvalMetricType() {
    return evalMetricType;
  }

  public void setEvalMetricType(String evalMetricType) {
    this.evalMetricType = evalMetricType;
  }

  public LLMObsSpanEvaluationMetric reasoning(String reasoning) {
    this.reasoning = reasoning;
    return this;
  }

  /**
   * Human-readable reasoning for the evaluation result.
   *
   * @return reasoning
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASONING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReasoning() {
    return reasoning;
  }

  public void setReasoning(String reasoning) {
    this.reasoning = reasoning;
  }

  public LLMObsSpanEvaluationMetric status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the evaluation execution.
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

  public LLMObsSpanEvaluationMetric tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public LLMObsSpanEvaluationMetric addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags associated with the evaluation metric.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public LLMObsSpanEvaluationMetric value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * Value of the evaluation result.
   *
   * @return value
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
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
   * @return LLMObsSpanEvaluationMetric
   */
  @JsonAnySetter
  public LLMObsSpanEvaluationMetric putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsSpanEvaluationMetric object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsSpanEvaluationMetric llmObsSpanEvaluationMetric = (LLMObsSpanEvaluationMetric) o;
    return Objects.equals(this.assessment, llmObsSpanEvaluationMetric.assessment)
        && Objects.equals(this.evalMetricType, llmObsSpanEvaluationMetric.evalMetricType)
        && Objects.equals(this.reasoning, llmObsSpanEvaluationMetric.reasoning)
        && Objects.equals(this.status, llmObsSpanEvaluationMetric.status)
        && Objects.equals(this.tags, llmObsSpanEvaluationMetric.tags)
        && Objects.equals(this.value, llmObsSpanEvaluationMetric.value)
        && Objects.equals(
            this.additionalProperties, llmObsSpanEvaluationMetric.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assessment, evalMetricType, reasoning, status, tags, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsSpanEvaluationMetric {\n");
    sb.append("    assessment: ").append(toIndentedString(assessment)).append("\n");
    sb.append("    evalMetricType: ").append(toIndentedString(evalMetricType)).append("\n");
    sb.append("    reasoning: ").append(toIndentedString(reasoning)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
