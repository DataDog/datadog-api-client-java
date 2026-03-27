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
   * <p>A span associated with an LLM Observability experiment.</p>
 */
@JsonPropertyOrder({
  LLMObsExperimentSpan.JSON_PROPERTY_DATASET_ID,
  LLMObsExperimentSpan.JSON_PROPERTY_DURATION,
  LLMObsExperimentSpan.JSON_PROPERTY_META,
  LLMObsExperimentSpan.JSON_PROPERTY_NAME,
  LLMObsExperimentSpan.JSON_PROPERTY_PROJECT_ID,
  LLMObsExperimentSpan.JSON_PROPERTY_SPAN_ID,
  LLMObsExperimentSpan.JSON_PROPERTY_START_NS,
  LLMObsExperimentSpan.JSON_PROPERTY_STATUS,
  LLMObsExperimentSpan.JSON_PROPERTY_TAGS,
  LLMObsExperimentSpan.JSON_PROPERTY_TRACE_ID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsExperimentSpan {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATASET_ID = "dataset_id";
  private String datasetId;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Long duration;

  public static final String JSON_PROPERTY_META = "meta";
  private LLMObsExperimentSpanMeta meta;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROJECT_ID = "project_id";
  private String projectId;

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

  public LLMObsExperimentSpan() {}

  @JsonCreator
  public LLMObsExperimentSpan(
            @JsonProperty(required=true, value=JSON_PROPERTY_DATASET_ID)String datasetId,
            @JsonProperty(required=true, value=JSON_PROPERTY_DURATION)Long duration,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_PROJECT_ID)String projectId,
            @JsonProperty(required=true, value=JSON_PROPERTY_SPAN_ID)String spanId,
            @JsonProperty(required=true, value=JSON_PROPERTY_START_NS)Long startNs,
            @JsonProperty(required=true, value=JSON_PROPERTY_STATUS)LLMObsExperimentSpanStatus status,
            @JsonProperty(required=true, value=JSON_PROPERTY_TRACE_ID)String traceId) {
        this.datasetId = datasetId;
        this.duration = duration;
        this.name = name;
        this.projectId = projectId;
        this.spanId = spanId;
        this.startNs = startNs;
        this.status = status;
        this.unparsed |= !status.isValid();
        this.traceId = traceId;
  }
  public LLMObsExperimentSpan datasetId(String datasetId) {
    this.datasetId = datasetId;
    return this;
  }

  /**
   * <p>Dataset ID associated with this span.</p>
   * @return datasetId
  **/
      @JsonProperty(JSON_PROPERTY_DATASET_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getDatasetId() {
        return datasetId;
      }
  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }
  public LLMObsExperimentSpan duration(Long duration) {
    this.duration = duration;
    return this;
  }

  /**
   * <p>Duration of the span in nanoseconds.</p>
   * @return duration
  **/
      @JsonProperty(JSON_PROPERTY_DURATION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getDuration() {
        return duration;
      }
  public void setDuration(Long duration) {
    this.duration = duration;
  }
  public LLMObsExperimentSpan meta(LLMObsExperimentSpanMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * <p>Metadata associated with an experiment span.</p>
   * @return meta
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_META)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public LLMObsExperimentSpanMeta getMeta() {
        return meta;
      }
  public void setMeta(LLMObsExperimentSpanMeta meta) {
    this.meta = meta;
  }
  public LLMObsExperimentSpan name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the span.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public LLMObsExperimentSpan projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * <p>Project ID associated with this span.</p>
   * @return projectId
  **/
      @JsonProperty(JSON_PROPERTY_PROJECT_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getProjectId() {
        return projectId;
      }
  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }
  public LLMObsExperimentSpan spanId(String spanId) {
    this.spanId = spanId;
    return this;
  }

  /**
   * <p>Unique identifier of the span.</p>
   * @return spanId
  **/
      @JsonProperty(JSON_PROPERTY_SPAN_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getSpanId() {
        return spanId;
      }
  public void setSpanId(String spanId) {
    this.spanId = spanId;
  }
  public LLMObsExperimentSpan startNs(Long startNs) {
    this.startNs = startNs;
    return this;
  }

  /**
   * <p>Start time of the span in nanoseconds since Unix epoch.</p>
   * @return startNs
  **/
      @JsonProperty(JSON_PROPERTY_START_NS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getStartNs() {
        return startNs;
      }
  public void setStartNs(Long startNs) {
    this.startNs = startNs;
  }
  public LLMObsExperimentSpan status(LLMObsExperimentSpanStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * <p>Status of the span.</p>
   * @return status
  **/
      @JsonProperty(JSON_PROPERTY_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public LLMObsExperimentSpanStatus getStatus() {
        return status;
      }
  public void setStatus(LLMObsExperimentSpanStatus status) {
    if (!status.isValid()) {
        this.unparsed = true;
    }
    this.status = status;
  }
  public LLMObsExperimentSpan tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public LLMObsExperimentSpan addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>List of tags associated with the span.</p>
   * @return tags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getTags() {
        return tags;
      }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }
  public LLMObsExperimentSpan traceId(String traceId) {
    this.traceId = traceId;
    return this;
  }

  /**
   * <p>Trace ID for the span.</p>
   * @return traceId
  **/
      @JsonProperty(JSON_PROPERTY_TRACE_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getTraceId() {
        return traceId;
      }
  public void setTraceId(String traceId) {
    this.traceId = traceId;
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
   * @return LLMObsExperimentSpan
   */
  @JsonAnySetter
  public LLMObsExperimentSpan putAdditionalProperty(String key, Object value) {
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
   * Return true if this LLMObsExperimentSpan object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsExperimentSpan llmObsExperimentSpan = (LLMObsExperimentSpan) o;
    return Objects.equals(this.datasetId, llmObsExperimentSpan.datasetId) && Objects.equals(this.duration, llmObsExperimentSpan.duration) && Objects.equals(this.meta, llmObsExperimentSpan.meta) && Objects.equals(this.name, llmObsExperimentSpan.name) && Objects.equals(this.projectId, llmObsExperimentSpan.projectId) && Objects.equals(this.spanId, llmObsExperimentSpan.spanId) && Objects.equals(this.startNs, llmObsExperimentSpan.startNs) && Objects.equals(this.status, llmObsExperimentSpan.status) && Objects.equals(this.tags, llmObsExperimentSpan.tags) && Objects.equals(this.traceId, llmObsExperimentSpan.traceId) && Objects.equals(this.additionalProperties, llmObsExperimentSpan.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(datasetId,duration,meta,name,projectId,spanId,startNs,status,tags,traceId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsExperimentSpan {\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
