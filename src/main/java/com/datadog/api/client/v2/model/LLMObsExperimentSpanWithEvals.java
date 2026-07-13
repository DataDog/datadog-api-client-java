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

/** An experiment span enriched with its associated evaluation metrics. */
@JsonPropertyOrder({
  LLMObsExperimentSpanWithEvals.JSON_PROPERTY_DATASET_RECORD_ID,
  LLMObsExperimentSpanWithEvals.JSON_PROPERTY_DURATION,
  LLMObsExperimentSpanWithEvals.JSON_PROPERTY_EVAL_METRICS,
  LLMObsExperimentSpanWithEvals.JSON_PROPERTY_ID,
  LLMObsExperimentSpanWithEvals.JSON_PROPERTY_META,
  LLMObsExperimentSpanWithEvals.JSON_PROPERTY_METRICS,
  LLMObsExperimentSpanWithEvals.JSON_PROPERTY_NAME,
  LLMObsExperimentSpanWithEvals.JSON_PROPERTY_PARENT_ID,
  LLMObsExperimentSpanWithEvals.JSON_PROPERTY_SPAN_ID,
  LLMObsExperimentSpanWithEvals.JSON_PROPERTY_START_NS,
  LLMObsExperimentSpanWithEvals.JSON_PROPERTY_STATUS,
  LLMObsExperimentSpanWithEvals.JSON_PROPERTY_TAGS,
  LLMObsExperimentSpanWithEvals.JSON_PROPERTY_TRACE_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsExperimentSpanWithEvals {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATASET_RECORD_ID = "dataset_record_id";
  private JsonNullable<String> datasetRecordId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Double duration;

  public static final String JSON_PROPERTY_EVAL_METRICS = "eval_metrics";
  private List<LLMObsExperimentEvalMetricEvent> evalMetrics = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_META = "meta";
  private LLMObsExperimentSpanMeta meta;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private Map<String, Double> metrics = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PARENT_ID = "parent_id";
  private String parentId;

  public static final String JSON_PROPERTY_SPAN_ID = "span_id";
  private String spanId;

  public static final String JSON_PROPERTY_START_NS = "start_ns";
  private Long startNs;

  public static final String JSON_PROPERTY_STATUS = "status";
  private LLMObsExperimentSpanStatus status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TRACE_ID = "trace_id";
  private String traceId;

  public LLMObsExperimentSpanWithEvals datasetRecordId(String datasetRecordId) {
    this.datasetRecordId = JsonNullable.<String>of(datasetRecordId);
    return this;
  }

  /**
   * ID of the dataset record this span evaluated.
   *
   * @return datasetRecordId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDatasetRecordId() {
    return datasetRecordId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATASET_RECORD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDatasetRecordId_JsonNullable() {
    return datasetRecordId;
  }

  @JsonProperty(JSON_PROPERTY_DATASET_RECORD_ID)
  public void setDatasetRecordId_JsonNullable(JsonNullable<String> datasetRecordId) {
    this.datasetRecordId = datasetRecordId;
  }

  public void setDatasetRecordId(String datasetRecordId) {
    this.datasetRecordId = JsonNullable.<String>of(datasetRecordId);
  }

  public LLMObsExperimentSpanWithEvals duration(Double duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Duration of the span in nanoseconds.
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

  public LLMObsExperimentSpanWithEvals evalMetrics(
      List<LLMObsExperimentEvalMetricEvent> evalMetrics) {
    this.evalMetrics = evalMetrics;
    for (LLMObsExperimentEvalMetricEvent item : evalMetrics) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsExperimentSpanWithEvals addEvalMetricsItem(
      LLMObsExperimentEvalMetricEvent evalMetricsItem) {
    if (this.evalMetrics == null) {
      this.evalMetrics = new ArrayList<>();
    }
    this.evalMetrics.add(evalMetricsItem);
    this.unparsed |= evalMetricsItem.unparsed;
    return this;
  }

  /**
   * Evaluation metrics associated with this span.
   *
   * @return evalMetrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVAL_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LLMObsExperimentEvalMetricEvent> getEvalMetrics() {
    return evalMetrics;
  }

  public void setEvalMetrics(List<LLMObsExperimentEvalMetricEvent> evalMetrics) {
    this.evalMetrics = evalMetrics;
    if (evalMetrics != null) {
      for (LLMObsExperimentEvalMetricEvent item : evalMetrics) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LLMObsExperimentSpanWithEvals id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the span.
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

  public LLMObsExperimentSpanWithEvals meta(LLMObsExperimentSpanMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Metadata associated with an experiment span.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsExperimentSpanMeta getMeta() {
    return meta;
  }

  public void setMeta(LLMObsExperimentSpanMeta meta) {
    this.meta = meta;
    if (meta != null) {
      this.unparsed |= meta.unparsed;
    }
  }

  public LLMObsExperimentSpanWithEvals metrics(Map<String, Double> metrics) {
    this.metrics = metrics;
    return this;
  }

  public LLMObsExperimentSpanWithEvals putMetricsItem(String key, Double metricsItem) {
    if (this.metrics == null) {
      this.metrics = new HashMap<>();
    }
    this.metrics.put(key, metricsItem);
    return this;
  }

  /**
   * Numeric metrics attached to the span.
   *
   * @return metrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Double> getMetrics() {
    return metrics;
  }

  public void setMetrics(Map<String, Double> metrics) {
    this.metrics = metrics;
  }

  public LLMObsExperimentSpanWithEvals name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the span.
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

  public LLMObsExperimentSpanWithEvals parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Parent span ID, if any.
   *
   * @return parentId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public LLMObsExperimentSpanWithEvals spanId(String spanId) {
    this.spanId = spanId;
    return this;
  }

  /**
   * Span ID.
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

  public LLMObsExperimentSpanWithEvals startNs(Long startNs) {
    this.startNs = startNs;
    return this;
  }

  /**
   * Start time in nanoseconds since Unix epoch.
   *
   * @return startNs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_NS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStartNs() {
    return startNs;
  }

  public void setStartNs(Long startNs) {
    this.startNs = startNs;
  }

  public LLMObsExperimentSpanWithEvals status(LLMObsExperimentSpanStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Status of the span.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsExperimentSpanStatus getStatus() {
    return status;
  }

  public void setStatus(LLMObsExperimentSpanStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public LLMObsExperimentSpanWithEvals tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public LLMObsExperimentSpanWithEvals addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags associated with the span.
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

  public LLMObsExperimentSpanWithEvals traceId(String traceId) {
    this.traceId = traceId;
    return this;
  }

  /**
   * Trace ID.
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
   * @return LLMObsExperimentSpanWithEvals
   */
  @JsonAnySetter
  public LLMObsExperimentSpanWithEvals putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsExperimentSpanWithEvals object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsExperimentSpanWithEvals llmObsExperimentSpanWithEvals = (LLMObsExperimentSpanWithEvals) o;
    return Objects.equals(this.datasetRecordId, llmObsExperimentSpanWithEvals.datasetRecordId)
        && Objects.equals(this.duration, llmObsExperimentSpanWithEvals.duration)
        && Objects.equals(this.evalMetrics, llmObsExperimentSpanWithEvals.evalMetrics)
        && Objects.equals(this.id, llmObsExperimentSpanWithEvals.id)
        && Objects.equals(this.meta, llmObsExperimentSpanWithEvals.meta)
        && Objects.equals(this.metrics, llmObsExperimentSpanWithEvals.metrics)
        && Objects.equals(this.name, llmObsExperimentSpanWithEvals.name)
        && Objects.equals(this.parentId, llmObsExperimentSpanWithEvals.parentId)
        && Objects.equals(this.spanId, llmObsExperimentSpanWithEvals.spanId)
        && Objects.equals(this.startNs, llmObsExperimentSpanWithEvals.startNs)
        && Objects.equals(this.status, llmObsExperimentSpanWithEvals.status)
        && Objects.equals(this.tags, llmObsExperimentSpanWithEvals.tags)
        && Objects.equals(this.traceId, llmObsExperimentSpanWithEvals.traceId)
        && Objects.equals(
            this.additionalProperties, llmObsExperimentSpanWithEvals.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        datasetRecordId,
        duration,
        evalMetrics,
        id,
        meta,
        metrics,
        name,
        parentId,
        spanId,
        startNs,
        status,
        tags,
        traceId,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsExperimentSpanWithEvals {\n");
    sb.append("    datasetRecordId: ").append(toIndentedString(datasetRecordId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    evalMetrics: ").append(toIndentedString(evalMetrics)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    spanId: ").append(toIndentedString(spanId)).append("\n");
    sb.append("    startNs: ").append(toIndentedString(startNs)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
