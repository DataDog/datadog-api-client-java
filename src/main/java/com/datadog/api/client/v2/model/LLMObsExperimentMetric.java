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

/** A metric associated with an LLM Observability experiment span. */
@JsonPropertyOrder({
  LLMObsExperimentMetric.JSON_PROPERTY_ASSESSMENT,
  LLMObsExperimentMetric.JSON_PROPERTY_BOOLEAN_VALUE,
  LLMObsExperimentMetric.JSON_PROPERTY_CATEGORICAL_VALUE,
  LLMObsExperimentMetric.JSON_PROPERTY_ERROR,
  LLMObsExperimentMetric.JSON_PROPERTY_JSON_VALUE,
  LLMObsExperimentMetric.JSON_PROPERTY_LABEL,
  LLMObsExperimentMetric.JSON_PROPERTY_METADATA,
  LLMObsExperimentMetric.JSON_PROPERTY_METRIC_TYPE,
  LLMObsExperimentMetric.JSON_PROPERTY_REASONING,
  LLMObsExperimentMetric.JSON_PROPERTY_SCORE_VALUE,
  LLMObsExperimentMetric.JSON_PROPERTY_SPAN_ID,
  LLMObsExperimentMetric.JSON_PROPERTY_TAGS,
  LLMObsExperimentMetric.JSON_PROPERTY_TIMESTAMP_MS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsExperimentMetric {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSESSMENT = "assessment";
  private LLMObsMetricAssessment assessment;

  public static final String JSON_PROPERTY_BOOLEAN_VALUE = "boolean_value";
  private Boolean booleanValue;

  public static final String JSON_PROPERTY_CATEGORICAL_VALUE = "categorical_value";
  private String categoricalValue;

  public static final String JSON_PROPERTY_ERROR = "error";
  private LLMObsExperimentMetricError error;

  public static final String JSON_PROPERTY_JSON_VALUE = "json_value";
  private Map<String, Object> jsonValue = null;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, Object> metadata = null;

  public static final String JSON_PROPERTY_METRIC_TYPE = "metric_type";
  private LLMObsMetricScoreType metricType;

  public static final String JSON_PROPERTY_REASONING = "reasoning";
  private String reasoning;

  public static final String JSON_PROPERTY_SCORE_VALUE = "score_value";
  private Double scoreValue;

  public static final String JSON_PROPERTY_SPAN_ID = "span_id";
  private String spanId;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TIMESTAMP_MS = "timestamp_ms";
  private Long timestampMs;

  public LLMObsExperimentMetric() {}

  @JsonCreator
  public LLMObsExperimentMetric(
      @JsonProperty(required = true, value = JSON_PROPERTY_LABEL) String label,
      @JsonProperty(required = true, value = JSON_PROPERTY_METRIC_TYPE)
          LLMObsMetricScoreType metricType,
      @JsonProperty(required = true, value = JSON_PROPERTY_SPAN_ID) String spanId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMESTAMP_MS) Long timestampMs) {
    this.label = label;
    this.metricType = metricType;
    this.unparsed |= !metricType.isValid();
    this.spanId = spanId;
    this.timestampMs = timestampMs;
  }

  public LLMObsExperimentMetric assessment(LLMObsMetricAssessment assessment) {
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

  public LLMObsExperimentMetric booleanValue(Boolean booleanValue) {
    this.booleanValue = booleanValue;
    return this;
  }

  /**
   * Boolean value. Used when <code>metric_type</code> is <code>boolean</code>.
   *
   * @return booleanValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BOOLEAN_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getBooleanValue() {
    return booleanValue;
  }

  public void setBooleanValue(Boolean booleanValue) {
    this.booleanValue = booleanValue;
  }

  public LLMObsExperimentMetric categoricalValue(String categoricalValue) {
    this.categoricalValue = categoricalValue;
    return this;
  }

  /**
   * Categorical value. Used when <code>metric_type</code> is <code>categorical</code>.
   *
   * @return categoricalValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORICAL_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCategoricalValue() {
    return categoricalValue;
  }

  public void setCategoricalValue(String categoricalValue) {
    this.categoricalValue = categoricalValue;
  }

  public LLMObsExperimentMetric error(LLMObsExperimentMetricError error) {
    this.error = error;
    this.unparsed |= error.unparsed;
    return this;
  }

  /**
   * Error details for an experiment metric evaluation.
   *
   * @return error
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsExperimentMetricError getError() {
    return error;
  }

  public void setError(LLMObsExperimentMetricError error) {
    this.error = error;
  }

  public LLMObsExperimentMetric jsonValue(Map<String, Object> jsonValue) {
    this.jsonValue = jsonValue;
    return this;
  }

  public LLMObsExperimentMetric putJsonValueItem(String key, Object jsonValueItem) {
    if (this.jsonValue == null) {
      this.jsonValue = new HashMap<>();
    }
    this.jsonValue.put(key, jsonValueItem);
    return this;
  }

  /**
   * JSON value. Used when <code>metric_type</code> is <code>json</code>.
   *
   * @return jsonValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JSON_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getJsonValue() {
    return jsonValue;
  }

  public void setJsonValue(Map<String, Object> jsonValue) {
    this.jsonValue = jsonValue;
  }

  public LLMObsExperimentMetric label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Label or name for the metric.
   *
   * @return label
   */
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public LLMObsExperimentMetric metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public LLMObsExperimentMetric putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Arbitrary metadata associated with the metric.
   *
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }

  public LLMObsExperimentMetric metricType(LLMObsMetricScoreType metricType) {
    this.metricType = metricType;
    this.unparsed |= !metricType.isValid();
    return this;
  }

  /**
   * Type of metric recorded for an LLM Observability experiment.
   *
   * @return metricType
   */
  @JsonProperty(JSON_PROPERTY_METRIC_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LLMObsMetricScoreType getMetricType() {
    return metricType;
  }

  public void setMetricType(LLMObsMetricScoreType metricType) {
    if (!metricType.isValid()) {
      this.unparsed = true;
    }
    this.metricType = metricType;
  }

  public LLMObsExperimentMetric reasoning(String reasoning) {
    this.reasoning = reasoning;
    return this;
  }

  /**
   * Human-readable reasoning for the metric value.
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

  public LLMObsExperimentMetric scoreValue(Double scoreValue) {
    this.scoreValue = scoreValue;
    return this;
  }

  /**
   * Numeric score value. Used when <code>metric_type</code> is <code>score</code>.
   *
   * @return scoreValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCORE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getScoreValue() {
    return scoreValue;
  }

  public void setScoreValue(Double scoreValue) {
    this.scoreValue = scoreValue;
  }

  public LLMObsExperimentMetric spanId(String spanId) {
    this.spanId = spanId;
    return this;
  }

  /**
   * Identifier of the span this metric is associated with.
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

  public LLMObsExperimentMetric tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public LLMObsExperimentMetric addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * List of tags associated with the metric.
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

  public LLMObsExperimentMetric timestampMs(Long timestampMs) {
    this.timestampMs = timestampMs;
    return this;
  }

  /**
   * Timestamp when the metric was recorded, in milliseconds since Unix epoch.
   *
   * @return timestampMs
   */
  @JsonProperty(JSON_PROPERTY_TIMESTAMP_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTimestampMs() {
    return timestampMs;
  }

  public void setTimestampMs(Long timestampMs) {
    this.timestampMs = timestampMs;
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
   * @return LLMObsExperimentMetric
   */
  @JsonAnySetter
  public LLMObsExperimentMetric putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsExperimentMetric object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsExperimentMetric llmObsExperimentMetric = (LLMObsExperimentMetric) o;
    return Objects.equals(this.assessment, llmObsExperimentMetric.assessment)
        && Objects.equals(this.booleanValue, llmObsExperimentMetric.booleanValue)
        && Objects.equals(this.categoricalValue, llmObsExperimentMetric.categoricalValue)
        && Objects.equals(this.error, llmObsExperimentMetric.error)
        && Objects.equals(this.jsonValue, llmObsExperimentMetric.jsonValue)
        && Objects.equals(this.label, llmObsExperimentMetric.label)
        && Objects.equals(this.metadata, llmObsExperimentMetric.metadata)
        && Objects.equals(this.metricType, llmObsExperimentMetric.metricType)
        && Objects.equals(this.reasoning, llmObsExperimentMetric.reasoning)
        && Objects.equals(this.scoreValue, llmObsExperimentMetric.scoreValue)
        && Objects.equals(this.spanId, llmObsExperimentMetric.spanId)
        && Objects.equals(this.tags, llmObsExperimentMetric.tags)
        && Objects.equals(this.timestampMs, llmObsExperimentMetric.timestampMs)
        && Objects.equals(this.additionalProperties, llmObsExperimentMetric.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assessment,
        booleanValue,
        categoricalValue,
        error,
        jsonValue,
        label,
        metadata,
        metricType,
        reasoning,
        scoreValue,
        spanId,
        tags,
        timestampMs,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsExperimentMetric {\n");
    sb.append("    assessment: ").append(toIndentedString(assessment)).append("\n");
    sb.append("    booleanValue: ").append(toIndentedString(booleanValue)).append("\n");
    sb.append("    categoricalValue: ").append(toIndentedString(categoricalValue)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    jsonValue: ").append(toIndentedString(jsonValue)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
    sb.append("    reasoning: ").append(toIndentedString(reasoning)).append("\n");
    sb.append("    scoreValue: ").append(toIndentedString(scoreValue)).append("\n");
    sb.append("    spanId: ").append(toIndentedString(spanId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    timestampMs: ").append(toIndentedString(timestampMs)).append("\n");
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
