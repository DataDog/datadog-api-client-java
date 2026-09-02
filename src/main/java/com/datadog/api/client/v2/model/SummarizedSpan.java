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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** A node in the pruned trace tree. */
@JsonPropertyOrder({
  SummarizedSpan.JSON_PROPERTY_CHILDREN,
  SummarizedSpan.JSON_PROPERTY_DURATION_SECONDS,
  SummarizedSpan.JSON_PROPERTY_END_TIME,
  SummarizedSpan.JSON_PROPERTY_ERROR,
  SummarizedSpan.JSON_PROPERTY_HIDDEN_CHILD_SPANS_COUNT,
  SummarizedSpan.JSON_PROPERTY_META,
  SummarizedSpan.JSON_PROPERTY_METRICS,
  SummarizedSpan.JSON_PROPERTY_NAME,
  SummarizedSpan.JSON_PROPERTY_PARENT_ID,
  SummarizedSpan.JSON_PROPERTY_RESOURCE,
  SummarizedSpan.JSON_PROPERTY_SERVICE,
  SummarizedSpan.JSON_PROPERTY_SPAN_ID,
  SummarizedSpan.JSON_PROPERTY_SPAN_KIND,
  SummarizedSpan.JSON_PROPERTY_START_TIME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SummarizedSpan {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHILDREN = "children";
  private List<SummarizedSpan> children = new ArrayList<>();

  public static final String JSON_PROPERTY_DURATION_SECONDS = "durationSeconds";
  private Double durationSeconds;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private OffsetDateTime endTime;

  public static final String JSON_PROPERTY_ERROR = "error";
  private APMSpanErrorFlag error;

  public static final String JSON_PROPERTY_HIDDEN_CHILD_SPANS_COUNT = "hidden_child_spans_count";
  private Integer hiddenChildSpansCount;

  public static final String JSON_PROPERTY_META = "meta";
  private Map<String, String> meta = new HashMap<String, String>();

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private Map<String, Double> metrics = new HashMap<String, Double>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PARENT_ID = "parentID";
  private Long parentId;

  public static final String JSON_PROPERTY_RESOURCE = "resource";
  private String resource;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_SPAN_ID = "spanID";
  private Long spanId;

  public static final String JSON_PROPERTY_SPAN_KIND = "span_kind";
  private String spanKind;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private OffsetDateTime startTime;

  public SummarizedSpan() {}

  @JsonCreator
  public SummarizedSpan(
      @JsonProperty(required = true, value = JSON_PROPERTY_CHILDREN) List<SummarizedSpan> children,
      @JsonProperty(required = true, value = JSON_PROPERTY_DURATION_SECONDS) Double durationSeconds,
      @JsonProperty(required = true, value = JSON_PROPERTY_END_TIME) OffsetDateTime endTime,
      @JsonProperty(required = true, value = JSON_PROPERTY_ERROR) APMSpanErrorFlag error,
      @JsonProperty(required = true, value = JSON_PROPERTY_HIDDEN_CHILD_SPANS_COUNT)
          Integer hiddenChildSpansCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_META) Map<String, String> meta,
      @JsonProperty(required = true, value = JSON_PROPERTY_METRICS) Map<String, Double> metrics,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_PARENT_ID) Long parentId,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE) String resource,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE) String service,
      @JsonProperty(required = true, value = JSON_PROPERTY_SPAN_ID) Long spanId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SPAN_KIND) String spanKind,
      @JsonProperty(required = true, value = JSON_PROPERTY_START_TIME) OffsetDateTime startTime) {
    this.children = children;
    for (SummarizedSpan item : children) {
      this.unparsed |= item.unparsed;
    }
    this.durationSeconds = durationSeconds;
    this.endTime = endTime;
    this.error = error;
    this.unparsed |= !error.isValid();
    this.hiddenChildSpansCount = hiddenChildSpansCount;
    this.meta = meta;
    this.metrics = metrics;
    this.name = name;
    this.parentId = parentId;
    this.resource = resource;
    this.service = service;
    this.spanId = spanId;
    this.spanKind = spanKind;
    this.startTime = startTime;
  }

  public SummarizedSpan children(List<SummarizedSpan> children) {
    this.children = children;
    for (SummarizedSpan item : children) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SummarizedSpan addChildrenItem(SummarizedSpan childrenItem) {
    this.children.add(childrenItem);
    this.unparsed |= childrenItem.unparsed;
    return this;
  }

  /**
   * The child spans of this node in the pruned tree.
   *
   * @return children
   */
  @JsonProperty(JSON_PROPERTY_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SummarizedSpan> getChildren() {
    return children;
  }

  public void setChildren(List<SummarizedSpan> children) {
    this.children = children;
    if (children != null) {
      for (SummarizedSpan item : children) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SummarizedSpan durationSeconds(Double durationSeconds) {
    this.durationSeconds = durationSeconds;
    return this;
  }

  /**
   * The duration of the span, in seconds.
   *
   * @return durationSeconds
   */
  @JsonProperty(JSON_PROPERTY_DURATION_SECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getDurationSeconds() {
    return durationSeconds;
  }

  public void setDurationSeconds(Double durationSeconds) {
    this.durationSeconds = durationSeconds;
  }

  public SummarizedSpan endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The end time of the span, in RFC3339 format.
   *
   * @return endTime
   */
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public SummarizedSpan error(APMSpanErrorFlag error) {
    this.error = error;
    this.unparsed |= !error.isValid();
    return this;
  }

  /**
   * Error flag for a span. <code>1</code> when the span is in error, <code>0</code> otherwise.
   *
   * @return error
   */
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public APMSpanErrorFlag getError() {
    return error;
  }

  public void setError(APMSpanErrorFlag error) {
    if (!error.isValid()) {
      this.unparsed = true;
    }
    this.error = error;
  }

  public SummarizedSpan hiddenChildSpansCount(Integer hiddenChildSpansCount) {
    this.hiddenChildSpansCount = hiddenChildSpansCount;
    return this;
  }

  /**
   * The number of child spans that were pruned from this node when summarizing the trace. maximum:
   * 2147483647
   *
   * @return hiddenChildSpansCount
   */
  @JsonProperty(JSON_PROPERTY_HIDDEN_CHILD_SPANS_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getHiddenChildSpansCount() {
    return hiddenChildSpansCount;
  }

  public void setHiddenChildSpansCount(Integer hiddenChildSpansCount) {
    this.hiddenChildSpansCount = hiddenChildSpansCount;
  }

  public SummarizedSpan meta(Map<String, String> meta) {
    this.meta = meta;
    return this;
  }

  public SummarizedSpan putMetaItem(String key, String metaItem) {
    this.meta.put(key, metaItem);
    return this;
  }

  /**
   * String-valued tags attached to the span.
   *
   * @return meta
   */
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, String> getMeta() {
    return meta;
  }

  public void setMeta(Map<String, String> meta) {
    this.meta = meta;
  }

  public SummarizedSpan metrics(Map<String, Double> metrics) {
    this.metrics = metrics;
    return this;
  }

  public SummarizedSpan putMetricsItem(String key, Double metricsItem) {
    this.metrics.put(key, metricsItem);
    return this;
  }

  /**
   * Numeric metrics attached to the span.
   *
   * @return metrics
   */
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Double> getMetrics() {
    return metrics;
  }

  public void setMetrics(Map<String, Double> metrics) {
    this.metrics = metrics;
  }

  public SummarizedSpan name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The operation name of the span.
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

  public SummarizedSpan parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * The ID of the parent span, or <code>0</code> when the span is the trace root.
   *
   * @return parentId
   */
  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public SummarizedSpan resource(String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * The resource that the span describes.
   *
   * @return resource
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public SummarizedSpan service(String service) {
    this.service = service;
    return this;
  }

  /**
   * The name of the service that emitted the span.
   *
   * @return service
   */
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public SummarizedSpan spanId(Long spanId) {
    this.spanId = spanId;
    return this;
  }

  /**
   * The span ID, as an unsigned 64-bit integer.
   *
   * @return spanId
   */
  @JsonProperty(JSON_PROPERTY_SPAN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSpanId() {
    return spanId;
  }

  public void setSpanId(Long spanId) {
    this.spanId = spanId;
  }

  public SummarizedSpan spanKind(String spanKind) {
    this.spanKind = spanKind;
    return this;
  }

  /**
   * The OpenTelemetry span kind, for example <code>INTERNAL</code>, <code>SERVER</code>, <code>
   * CLIENT</code>, <code>PRODUCER</code>, or <code>CONSUMER</code>.
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

  public SummarizedSpan startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The start time of the span, in RFC3339 format.
   *
   * @return startTime
   */
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
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
   * @return SummarizedSpan
   */
  @JsonAnySetter
  public SummarizedSpan putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SummarizedSpan object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummarizedSpan summarizedSpan = (SummarizedSpan) o;
    return Objects.equals(this.children, summarizedSpan.children)
        && Objects.equals(this.durationSeconds, summarizedSpan.durationSeconds)
        && Objects.equals(this.endTime, summarizedSpan.endTime)
        && Objects.equals(this.error, summarizedSpan.error)
        && Objects.equals(this.hiddenChildSpansCount, summarizedSpan.hiddenChildSpansCount)
        && Objects.equals(this.meta, summarizedSpan.meta)
        && Objects.equals(this.metrics, summarizedSpan.metrics)
        && Objects.equals(this.name, summarizedSpan.name)
        && Objects.equals(this.parentId, summarizedSpan.parentId)
        && Objects.equals(this.resource, summarizedSpan.resource)
        && Objects.equals(this.service, summarizedSpan.service)
        && Objects.equals(this.spanId, summarizedSpan.spanId)
        && Objects.equals(this.spanKind, summarizedSpan.spanKind)
        && Objects.equals(this.startTime, summarizedSpan.startTime)
        && Objects.equals(this.additionalProperties, summarizedSpan.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        children,
        durationSeconds,
        endTime,
        error,
        hiddenChildSpansCount,
        meta,
        metrics,
        name,
        parentId,
        resource,
        service,
        spanId,
        spanKind,
        startTime,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummarizedSpan {\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    hiddenChildSpansCount: ")
        .append(toIndentedString(hiddenChildSpansCount))
        .append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    spanId: ").append(toIndentedString(spanId)).append("\n");
    sb.append("    spanKind: ").append(toIndentedString(spanKind)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
