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

/** Attributes of an LLM Observability span. */
@JsonPropertyOrder({
  LLMObsSpanAttributes.JSON_PROPERTY_DURATION,
  LLMObsSpanAttributes.JSON_PROPERTY_EVALUATION,
  LLMObsSpanAttributes.JSON_PROPERTY_INPUT,
  LLMObsSpanAttributes.JSON_PROPERTY_INTENT,
  LLMObsSpanAttributes.JSON_PROPERTY_METADATA,
  LLMObsSpanAttributes.JSON_PROPERTY_METRICS,
  LLMObsSpanAttributes.JSON_PROPERTY_ML_APP,
  LLMObsSpanAttributes.JSON_PROPERTY_MODEL_NAME,
  LLMObsSpanAttributes.JSON_PROPERTY_MODEL_PROVIDER,
  LLMObsSpanAttributes.JSON_PROPERTY_NAME,
  LLMObsSpanAttributes.JSON_PROPERTY_OUTPUT,
  LLMObsSpanAttributes.JSON_PROPERTY_PARENT_ID,
  LLMObsSpanAttributes.JSON_PROPERTY_SPAN_ID,
  LLMObsSpanAttributes.JSON_PROPERTY_SPAN_KIND,
  LLMObsSpanAttributes.JSON_PROPERTY_START_NS,
  LLMObsSpanAttributes.JSON_PROPERTY_STATUS,
  LLMObsSpanAttributes.JSON_PROPERTY_TAGS,
  LLMObsSpanAttributes.JSON_PROPERTY_TOOL_DEFINITIONS,
  LLMObsSpanAttributes.JSON_PROPERTY_TRACE_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsSpanAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DURATION = "duration";
  private Double duration;

  public static final String JSON_PROPERTY_EVALUATION = "evaluation";
  private Map<String, LLMObsSpanEvaluationMetric> evaluation = null;

  public static final String JSON_PROPERTY_INPUT = "input";
  private LLMObsSpanIO input;

  public static final String JSON_PROPERTY_INTENT = "intent";
  private String intent;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, Object> metadata = null;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private Map<String, Double> metrics = null;

  public static final String JSON_PROPERTY_ML_APP = "ml_app";
  private String mlApp;

  public static final String JSON_PROPERTY_MODEL_NAME = "model_name";
  private String modelName;

  public static final String JSON_PROPERTY_MODEL_PROVIDER = "model_provider";
  private String modelProvider;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OUTPUT = "output";
  private LLMObsSpanIO output;

  public static final String JSON_PROPERTY_PARENT_ID = "parent_id";
  private String parentId;

  public static final String JSON_PROPERTY_SPAN_ID = "span_id";
  private String spanId;

  public static final String JSON_PROPERTY_SPAN_KIND = "span_kind";
  private String spanKind;

  public static final String JSON_PROPERTY_START_NS = "start_ns";
  private Long startNs;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TOOL_DEFINITIONS = "tool_definitions";
  private List<LLMObsSpanToolDefinition> toolDefinitions = null;

  public static final String JSON_PROPERTY_TRACE_ID = "trace_id";
  private String traceId;

  public LLMObsSpanAttributes() {}

  @JsonCreator
  public LLMObsSpanAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DURATION) Double duration,
      @JsonProperty(required = true, value = JSON_PROPERTY_ML_APP) String mlApp,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SPAN_ID) String spanId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SPAN_KIND) String spanKind,
      @JsonProperty(required = true, value = JSON_PROPERTY_START_NS) Long startNs,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) String status,
      @JsonProperty(required = true, value = JSON_PROPERTY_TRACE_ID) String traceId) {
    this.duration = duration;
    this.mlApp = mlApp;
    this.name = name;
    this.spanId = spanId;
    this.spanKind = spanKind;
    this.startNs = startNs;
    this.status = status;
    this.traceId = traceId;
  }

  public LLMObsSpanAttributes duration(Double duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Duration of the span in nanoseconds.
   *
   * @return duration
   */
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getDuration() {
    return duration;
  }

  public void setDuration(Double duration) {
    this.duration = duration;
  }

  public LLMObsSpanAttributes evaluation(Map<String, LLMObsSpanEvaluationMetric> evaluation) {
    this.evaluation = evaluation;
    return this;
  }

  public LLMObsSpanAttributes putEvaluationItem(
      String key, LLMObsSpanEvaluationMetric evaluationItem) {
    if (this.evaluation == null) {
      this.evaluation = new HashMap<>();
    }
    this.evaluation.put(key, evaluationItem);
    return this;
  }

  /**
   * Evaluation metrics keyed by evaluator name.
   *
   * @return evaluation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVALUATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, LLMObsSpanEvaluationMetric> getEvaluation() {
    return evaluation;
  }

  public void setEvaluation(Map<String, LLMObsSpanEvaluationMetric> evaluation) {
    this.evaluation = evaluation;
  }

  public LLMObsSpanAttributes input(LLMObsSpanIO input) {
    this.input = input;
    this.unparsed |= input.unparsed;
    return this;
  }

  /**
   * Input or output content of an LLM Observability span.
   *
   * @return input
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsSpanIO getInput() {
    return input;
  }

  public void setInput(LLMObsSpanIO input) {
    this.input = input;
    if (input != null) {
      this.unparsed |= input.unparsed;
    }
  }

  public LLMObsSpanAttributes intent(String intent) {
    this.intent = intent;
    return this;
  }

  /**
   * Detected intent of the span.
   *
   * @return intent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIntent() {
    return intent;
  }

  public void setIntent(String intent) {
    this.intent = intent;
  }

  public LLMObsSpanAttributes metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public LLMObsSpanAttributes putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Arbitrary metadata associated with the span.
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

  public LLMObsSpanAttributes metrics(Map<String, Double> metrics) {
    this.metrics = metrics;
    return this;
  }

  public LLMObsSpanAttributes putMetricsItem(String key, Double metricsItem) {
    if (this.metrics == null) {
      this.metrics = new HashMap<>();
    }
    this.metrics.put(key, metricsItem);
    return this;
  }

  /**
   * Numeric metrics associated with the span (e.g., token counts).
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

  public LLMObsSpanAttributes mlApp(String mlApp) {
    this.mlApp = mlApp;
    return this;
  }

  /**
   * Name of the ML application this span belongs to.
   *
   * @return mlApp
   */
  @JsonProperty(JSON_PROPERTY_ML_APP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMlApp() {
    return mlApp;
  }

  public void setMlApp(String mlApp) {
    this.mlApp = mlApp;
  }

  public LLMObsSpanAttributes modelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  /**
   * Name of the model used in this span.
   *
   * @return modelName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public LLMObsSpanAttributes modelProvider(String modelProvider) {
    this.modelProvider = modelProvider;
    return this;
  }

  /**
   * Provider of the model used in this span.
   *
   * @return modelProvider
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getModelProvider() {
    return modelProvider;
  }

  public void setModelProvider(String modelProvider) {
    this.modelProvider = modelProvider;
  }

  public LLMObsSpanAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the span.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LLMObsSpanAttributes output(LLMObsSpanIO output) {
    this.output = output;
    this.unparsed |= output.unparsed;
    return this;
  }

  /**
   * Input or output content of an LLM Observability span.
   *
   * @return output
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsSpanIO getOutput() {
    return output;
  }

  public void setOutput(LLMObsSpanIO output) {
    this.output = output;
    if (output != null) {
      this.unparsed |= output.unparsed;
    }
  }

  public LLMObsSpanAttributes parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Identifier of the parent span, if any.
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

  public LLMObsSpanAttributes spanId(String spanId) {
    this.spanId = spanId;
    return this;
  }

  /**
   * Unique identifier of the span.
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

  public LLMObsSpanAttributes spanKind(String spanKind) {
    this.spanKind = spanKind;
    return this;
  }

  /**
   * Kind of span (e.g., llm, agent, tool, task, workflow).
   *
   * @return spanKind
   */
  @JsonProperty(JSON_PROPERTY_SPAN_KIND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSpanKind() {
    return spanKind;
  }

  public void setSpanKind(String spanKind) {
    this.spanKind = spanKind;
  }

  public LLMObsSpanAttributes startNs(Long startNs) {
    this.startNs = startNs;
    return this;
  }

  /**
   * Start time of the span in nanoseconds since Unix epoch.
   *
   * @return startNs
   */
  @JsonProperty(JSON_PROPERTY_START_NS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getStartNs() {
    return startNs;
  }

  public void setStartNs(Long startNs) {
    this.startNs = startNs;
  }

  public LLMObsSpanAttributes status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the span (e.g., ok, error).
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public LLMObsSpanAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public LLMObsSpanAttributes addTagsItem(String tagsItem) {
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

  public LLMObsSpanAttributes toolDefinitions(List<LLMObsSpanToolDefinition> toolDefinitions) {
    this.toolDefinitions = toolDefinitions;
    if (toolDefinitions != null) {
      for (LLMObsSpanToolDefinition item : toolDefinitions) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public LLMObsSpanAttributes addToolDefinitionsItem(LLMObsSpanToolDefinition toolDefinitionsItem) {
    if (this.toolDefinitions == null) {
      this.toolDefinitions = new ArrayList<>();
    }
    this.toolDefinitions.add(toolDefinitionsItem);
    this.unparsed |= toolDefinitionsItem.unparsed;
    return this;
  }

  /**
   * Tool definitions available to the span.
   *
   * @return toolDefinitions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOOL_DEFINITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LLMObsSpanToolDefinition> getToolDefinitions() {
    return toolDefinitions;
  }

  public void setToolDefinitions(List<LLMObsSpanToolDefinition> toolDefinitions) {
    this.toolDefinitions = toolDefinitions;
    if (toolDefinitions != null) {
      for (LLMObsSpanToolDefinition item : toolDefinitions) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LLMObsSpanAttributes traceId(String traceId) {
    this.traceId = traceId;
    return this;
  }

  /**
   * Trace identifier this span belongs to.
   *
   * @return traceId
   */
  @JsonProperty(JSON_PROPERTY_TRACE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return LLMObsSpanAttributes
   */
  @JsonAnySetter
  public LLMObsSpanAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsSpanAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsSpanAttributes llmObsSpanAttributes = (LLMObsSpanAttributes) o;
    return Objects.equals(this.duration, llmObsSpanAttributes.duration)
        && Objects.equals(this.evaluation, llmObsSpanAttributes.evaluation)
        && Objects.equals(this.input, llmObsSpanAttributes.input)
        && Objects.equals(this.intent, llmObsSpanAttributes.intent)
        && Objects.equals(this.metadata, llmObsSpanAttributes.metadata)
        && Objects.equals(this.metrics, llmObsSpanAttributes.metrics)
        && Objects.equals(this.mlApp, llmObsSpanAttributes.mlApp)
        && Objects.equals(this.modelName, llmObsSpanAttributes.modelName)
        && Objects.equals(this.modelProvider, llmObsSpanAttributes.modelProvider)
        && Objects.equals(this.name, llmObsSpanAttributes.name)
        && Objects.equals(this.output, llmObsSpanAttributes.output)
        && Objects.equals(this.parentId, llmObsSpanAttributes.parentId)
        && Objects.equals(this.spanId, llmObsSpanAttributes.spanId)
        && Objects.equals(this.spanKind, llmObsSpanAttributes.spanKind)
        && Objects.equals(this.startNs, llmObsSpanAttributes.startNs)
        && Objects.equals(this.status, llmObsSpanAttributes.status)
        && Objects.equals(this.tags, llmObsSpanAttributes.tags)
        && Objects.equals(this.toolDefinitions, llmObsSpanAttributes.toolDefinitions)
        && Objects.equals(this.traceId, llmObsSpanAttributes.traceId)
        && Objects.equals(this.additionalProperties, llmObsSpanAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        duration,
        evaluation,
        input,
        intent,
        metadata,
        metrics,
        mlApp,
        modelName,
        modelProvider,
        name,
        output,
        parentId,
        spanId,
        spanKind,
        startNs,
        status,
        tags,
        toolDefinitions,
        traceId,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsSpanAttributes {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    evaluation: ").append(toIndentedString(evaluation)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    mlApp: ").append(toIndentedString(mlApp)).append("\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    modelProvider: ").append(toIndentedString(modelProvider)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    spanId: ").append(toIndentedString(spanId)).append("\n");
    sb.append("    spanKind: ").append(toIndentedString(spanKind)).append("\n");
    sb.append("    startNs: ").append(toIndentedString(startNs)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    toolDefinitions: ").append(toIndentedString(toolDefinitions)).append("\n");
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
