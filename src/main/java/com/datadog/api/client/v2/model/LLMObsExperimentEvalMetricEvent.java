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
import org.openapitools.jackson.nullable.JsonNullable;

/** An evaluation metric event associated with an experiment span. */
@JsonPropertyOrder({
  LLMObsExperimentEvalMetricEvent.JSON_PROPERTY_ASSESSMENT,
  LLMObsExperimentEvalMetricEvent.JSON_PROPERTY_BOOLEAN_VALUE,
  LLMObsExperimentEvalMetricEvent.JSON_PROPERTY_CATEGORICAL_VALUE,
  LLMObsExperimentEvalMetricEvent.JSON_PROPERTY_EVAL_SOURCE_TYPE,
  LLMObsExperimentEvalMetricEvent.JSON_PROPERTY_ID,
  LLMObsExperimentEvalMetricEvent.JSON_PROPERTY_JSON_VALUE,
  LLMObsExperimentEvalMetricEvent.JSON_PROPERTY_LABEL,
  LLMObsExperimentEvalMetricEvent.JSON_PROPERTY_METADATA,
  LLMObsExperimentEvalMetricEvent.JSON_PROPERTY_METRIC_SOURCE,
  LLMObsExperimentEvalMetricEvent.JSON_PROPERTY_METRIC_TYPE,
  LLMObsExperimentEvalMetricEvent.JSON_PROPERTY_REASONING,
  LLMObsExperimentEvalMetricEvent.JSON_PROPERTY_SCORE_VALUE,
  LLMObsExperimentEvalMetricEvent.JSON_PROPERTY_SPAN_ID,
  LLMObsExperimentEvalMetricEvent.JSON_PROPERTY_TAGS,
  LLMObsExperimentEvalMetricEvent.JSON_PROPERTY_TIMESTAMP_MS,
  LLMObsExperimentEvalMetricEvent.JSON_PROPERTY_TRACE_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsExperimentEvalMetricEvent {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSESSMENT = "assessment";
  private LLMObsMetricAssessment assessment;

  public static final String JSON_PROPERTY_BOOLEAN_VALUE = "boolean_value";
  private JsonNullable<Boolean> booleanValue = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_CATEGORICAL_VALUE = "categorical_value";
  private JsonNullable<String> categoricalValue = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EVAL_SOURCE_TYPE = "eval_source_type";
  private String evalSourceType;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_JSON_VALUE = "json_value";
  private JsonNullable<Map<String, Object>> jsonValue =
      JsonNullable.<Map<String, Object>>undefined();

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Map<String, Object>> metadata =
      JsonNullable.<Map<String, Object>>undefined();

  public static final String JSON_PROPERTY_METRIC_SOURCE = "metric_source";
  private String metricSource;

  public static final String JSON_PROPERTY_METRIC_TYPE = "metric_type";
  private LLMObsMetricScoreType metricType;

  public static final String JSON_PROPERTY_REASONING = "reasoning";
  private JsonNullable<String> reasoning = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SCORE_VALUE = "score_value";
  private JsonNullable<Double> scoreValue = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_SPAN_ID = "span_id";
  private String spanId;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TIMESTAMP_MS = "timestamp_ms";
  private Long timestampMs;

  public static final String JSON_PROPERTY_TRACE_ID = "trace_id";
  private String traceId;

  public LLMObsExperimentEvalMetricEvent assessment(LLMObsMetricAssessment assessment) {
    this.assessment = assessment;
    this.unparsed |= !assessment.isValid();
    return this;
  }

  /**
   * Assessment result for an LLM Observability experiment metric.
   *
   * @return assessment
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSESSMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsMetricAssessment getAssessment() {
    return assessment;
  }

  public void setAssessment(LLMObsMetricAssessment assessment) {
    if (!assessment.isValid()) {
      this.unparsed = true;
    }
    this.assessment = assessment;
  }

  public LLMObsExperimentEvalMetricEvent booleanValue(Boolean booleanValue) {
    this.booleanValue = JsonNullable.<Boolean>of(booleanValue);
    return this;
  }

  /**
   * Boolean value. Present when <code>metric_type</code> is <code>boolean</code>.
   *
   * @return booleanValue
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getBooleanValue() {
    return booleanValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BOOLEAN_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getBooleanValue_JsonNullable() {
    return booleanValue;
  }

  @JsonProperty(JSON_PROPERTY_BOOLEAN_VALUE)
  public void setBooleanValue_JsonNullable(JsonNullable<Boolean> booleanValue) {
    this.booleanValue = booleanValue;
  }

  public void setBooleanValue(Boolean booleanValue) {
    this.booleanValue = JsonNullable.<Boolean>of(booleanValue);
  }

  public LLMObsExperimentEvalMetricEvent categoricalValue(String categoricalValue) {
    this.categoricalValue = JsonNullable.<String>of(categoricalValue);
    return this;
  }

  /**
   * Categorical value. Present when <code>metric_type</code> is <code>categorical</code>.
   *
   * @return categoricalValue
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getCategoricalValue() {
    return categoricalValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CATEGORICAL_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCategoricalValue_JsonNullable() {
    return categoricalValue;
  }

  @JsonProperty(JSON_PROPERTY_CATEGORICAL_VALUE)
  public void setCategoricalValue_JsonNullable(JsonNullable<String> categoricalValue) {
    this.categoricalValue = categoricalValue;
  }

  public void setCategoricalValue(String categoricalValue) {
    this.categoricalValue = JsonNullable.<String>of(categoricalValue);
  }

  public LLMObsExperimentEvalMetricEvent evalSourceType(String evalSourceType) {
    this.evalSourceType = evalSourceType;
    return this;
  }

  /**
   * Source type of the evaluation.
   *
   * @return evalSourceType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVAL_SOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEvalSourceType() {
    return evalSourceType;
  }

  public void setEvalSourceType(String evalSourceType) {
    this.evalSourceType = evalSourceType;
  }

  public LLMObsExperimentEvalMetricEvent id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the evaluation metric event.
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

  public LLMObsExperimentEvalMetricEvent jsonValue(Map<String, Object> jsonValue) {
    this.jsonValue = JsonNullable.<Map<String, Object>>of(jsonValue);
    return this;
  }

  public LLMObsExperimentEvalMetricEvent putJsonValueItem(String key, Object jsonValueItem) {
    if (this.jsonValue == null || !this.jsonValue.isPresent()) {
      this.jsonValue = JsonNullable.<Map<String, Object>>of(new HashMap<>());
    }
    try {
      this.jsonValue.get().put(key, jsonValueItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * JSON value. Present when <code>metric_type</code> is <code>json</code>.
   *
   * @return jsonValue
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Map<String, Object> getJsonValue() {
    return jsonValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_JSON_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, Object>> getJsonValue_JsonNullable() {
    return jsonValue;
  }

  @JsonProperty(JSON_PROPERTY_JSON_VALUE)
  public void setJsonValue_JsonNullable(JsonNullable<Map<String, Object>> jsonValue) {
    this.jsonValue = jsonValue;
  }

  public void setJsonValue(Map<String, Object> jsonValue) {
    this.jsonValue = JsonNullable.<Map<String, Object>>of(jsonValue);
  }

  public LLMObsExperimentEvalMetricEvent label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Label or name for the metric.
   *
   * @return label
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public LLMObsExperimentEvalMetricEvent metadata(Map<String, Object> metadata) {
    this.metadata = JsonNullable.<Map<String, Object>>of(metadata);
    return this;
  }

  public LLMObsExperimentEvalMetricEvent putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null || !this.metadata.isPresent()) {
      this.metadata = JsonNullable.<Map<String, Object>>of(new HashMap<>());
    }
    try {
      this.metadata.get().put(key, metadataItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Arbitrary metadata associated with the metric.
   *
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Map<String, Object> getMetadata() {
    return metadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, Object>> getMetadata_JsonNullable() {
    return metadata;
  }

  @JsonProperty(JSON_PROPERTY_METADATA)
  public void setMetadata_JsonNullable(JsonNullable<Map<String, Object>> metadata) {
    this.metadata = metadata;
  }

  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = JsonNullable.<Map<String, Object>>of(metadata);
  }

  public LLMObsExperimentEvalMetricEvent metricSource(String metricSource) {
    this.metricSource = metricSource;
    return this;
  }

  /**
   * Source of the metric. Either <code>custom</code> (user-submitted) or <code>summary</code>
   * (experiment-level aggregate).
   *
   * @return metricSource
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMetricSource() {
    return metricSource;
  }

  public void setMetricSource(String metricSource) {
    this.metricSource = metricSource;
  }

  public LLMObsExperimentEvalMetricEvent metricType(LLMObsMetricScoreType metricType) {
    this.metricType = metricType;
    this.unparsed |= !metricType.isValid();
    return this;
  }

  /**
   * Type of metric recorded for an LLM Observability experiment.
   *
   * @return metricType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsMetricScoreType getMetricType() {
    return metricType;
  }

  public void setMetricType(LLMObsMetricScoreType metricType) {
    if (!metricType.isValid()) {
      this.unparsed = true;
    }
    this.metricType = metricType;
  }

  public LLMObsExperimentEvalMetricEvent reasoning(String reasoning) {
    this.reasoning = JsonNullable.<String>of(reasoning);
    return this;
  }

  /**
   * Human-readable reasoning for the metric value.
   *
   * @return reasoning
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getReasoning() {
    return reasoning.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REASONING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getReasoning_JsonNullable() {
    return reasoning;
  }

  @JsonProperty(JSON_PROPERTY_REASONING)
  public void setReasoning_JsonNullable(JsonNullable<String> reasoning) {
    this.reasoning = reasoning;
  }

  public void setReasoning(String reasoning) {
    this.reasoning = JsonNullable.<String>of(reasoning);
  }

  public LLMObsExperimentEvalMetricEvent scoreValue(Double scoreValue) {
    this.scoreValue = JsonNullable.<Double>of(scoreValue);
    return this;
  }

  /**
   * Numeric score. Present when <code>metric_type</code> is <code>score</code>.
   *
   * @return scoreValue
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getScoreValue() {
    return scoreValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SCORE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getScoreValue_JsonNullable() {
    return scoreValue;
  }

  @JsonProperty(JSON_PROPERTY_SCORE_VALUE)
  public void setScoreValue_JsonNullable(JsonNullable<Double> scoreValue) {
    this.scoreValue = scoreValue;
  }

  public void setScoreValue(Double scoreValue) {
    this.scoreValue = JsonNullable.<Double>of(scoreValue);
  }

  public LLMObsExperimentEvalMetricEvent spanId(String spanId) {
    this.spanId = spanId;
    return this;
  }

  /**
   * Span ID this metric is associated with.
   *
   * @return spanId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSpanId() {
    return spanId;
  }

  public void setSpanId(String spanId) {
    this.spanId = spanId;
  }

  public LLMObsExperimentEvalMetricEvent tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public LLMObsExperimentEvalMetricEvent addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags associated with the metric.
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

  public LLMObsExperimentEvalMetricEvent timestampMs(Long timestampMs) {
    this.timestampMs = timestampMs;
    return this;
  }

  /**
   * Timestamp when the metric was recorded, in milliseconds since Unix epoch.
   *
   * @return timestampMs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTimestampMs() {
    return timestampMs;
  }

  public void setTimestampMs(Long timestampMs) {
    this.timestampMs = timestampMs;
  }

  public LLMObsExperimentEvalMetricEvent traceId(String traceId) {
    this.traceId = traceId;
    return this;
  }

  /**
   * Trace ID linking this metric to a span.
   *
   * @return traceId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTraceId() {
    return traceId;
  }

  public void setTraceId(String traceId) {
    this.traceId = traceId;
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
   * @return LLMObsExperimentEvalMetricEvent
   */
  @JsonAnySetter
  public LLMObsExperimentEvalMetricEvent putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsExperimentEvalMetricEvent object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsExperimentEvalMetricEvent llmObsExperimentEvalMetricEvent =
        (LLMObsExperimentEvalMetricEvent) o;
    return Objects.equals(this.assessment, llmObsExperimentEvalMetricEvent.assessment)
        && Objects.equals(this.booleanValue, llmObsExperimentEvalMetricEvent.booleanValue)
        && Objects.equals(this.categoricalValue, llmObsExperimentEvalMetricEvent.categoricalValue)
        && Objects.equals(this.evalSourceType, llmObsExperimentEvalMetricEvent.evalSourceType)
        && Objects.equals(this.id, llmObsExperimentEvalMetricEvent.id)
        && Objects.equals(this.jsonValue, llmObsExperimentEvalMetricEvent.jsonValue)
        && Objects.equals(this.label, llmObsExperimentEvalMetricEvent.label)
        && Objects.equals(this.metadata, llmObsExperimentEvalMetricEvent.metadata)
        && Objects.equals(this.metricSource, llmObsExperimentEvalMetricEvent.metricSource)
        && Objects.equals(this.metricType, llmObsExperimentEvalMetricEvent.metricType)
        && Objects.equals(this.reasoning, llmObsExperimentEvalMetricEvent.reasoning)
        && Objects.equals(this.scoreValue, llmObsExperimentEvalMetricEvent.scoreValue)
        && Objects.equals(this.spanId, llmObsExperimentEvalMetricEvent.spanId)
        && Objects.equals(this.tags, llmObsExperimentEvalMetricEvent.tags)
        && Objects.equals(this.timestampMs, llmObsExperimentEvalMetricEvent.timestampMs)
        && Objects.equals(this.traceId, llmObsExperimentEvalMetricEvent.traceId)
        && Objects.equals(
            this.additionalProperties, llmObsExperimentEvalMetricEvent.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assessment,
        booleanValue,
        categoricalValue,
        evalSourceType,
        id,
        jsonValue,
        label,
        metadata,
        metricSource,
        metricType,
        reasoning,
        scoreValue,
        spanId,
        tags,
        timestampMs,
        traceId,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsExperimentEvalMetricEvent {\n");
    sb.append("    assessment: ").append(toIndentedString(assessment)).append("\n");
    sb.append("    booleanValue: ").append(toIndentedString(booleanValue)).append("\n");
    sb.append("    categoricalValue: ").append(toIndentedString(categoricalValue)).append("\n");
    sb.append("    evalSourceType: ").append(toIndentedString(evalSourceType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jsonValue: ").append(toIndentedString(jsonValue)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    metricSource: ").append(toIndentedString(metricSource)).append("\n");
    sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
    sb.append("    reasoning: ").append(toIndentedString(reasoning)).append("\n");
    sb.append("    scoreValue: ").append(toIndentedString(scoreValue)).append("\n");
    sb.append("    spanId: ").append(toIndentedString(spanId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    timestampMs: ").append(toIndentedString(timestampMs)).append("\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
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
