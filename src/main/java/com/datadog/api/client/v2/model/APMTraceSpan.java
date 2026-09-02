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

/** A single APM span returned as part of a trace. */
@JsonPropertyOrder({
  APMTraceSpan.JSON_PROPERTY_DURATION,
  APMTraceSpan.JSON_PROPERTY_END_TIME,
  APMTraceSpan.JSON_PROPERTY_ERROR,
  APMTraceSpan.JSON_PROPERTY_META,
  APMTraceSpan.JSON_PROPERTY_METRICS,
  APMTraceSpan.JSON_PROPERTY_NAME,
  APMTraceSpan.JSON_PROPERTY_PARENT_ID,
  APMTraceSpan.JSON_PROPERTY_RESOURCE,
  APMTraceSpan.JSON_PROPERTY_RESOURCE_HASH,
  APMTraceSpan.JSON_PROPERTY_RESTRICTED,
  APMTraceSpan.JSON_PROPERTY_SELF_TIME,
  APMTraceSpan.JSON_PROPERTY_SERVICE,
  APMTraceSpan.JSON_PROPERTY_SPAN_ID,
  APMTraceSpan.JSON_PROPERTY_START_TIME,
  APMTraceSpan.JSON_PROPERTY_TRACE_ID,
  APMTraceSpan.JSON_PROPERTY_TRACE_ID_FULL,
  APMTraceSpan.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class APMTraceSpan {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DURATION = "duration";
  private Long duration;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private Long endTime;

  public static final String JSON_PROPERTY_ERROR = "error";
  private APMSpanErrorFlag error;

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

  public static final String JSON_PROPERTY_RESOURCE_HASH = "resourceHash";
  private String resourceHash;

  public static final String JSON_PROPERTY_RESTRICTED = "restricted";
  private Boolean restricted;

  public static final String JSON_PROPERTY_SELF_TIME = "self_time";
  private Double selfTime;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_SPAN_ID = "spanID";
  private Long spanId;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private Long startTime;

  public static final String JSON_PROPERTY_TRACE_ID = "traceID";
  private Long traceId;

  public static final String JSON_PROPERTY_TRACE_ID_FULL = "traceIDFull";
  private String traceIdFull;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public APMTraceSpan() {}

  @JsonCreator
  public APMTraceSpan(
      @JsonProperty(required = true, value = JSON_PROPERTY_DURATION) Long duration,
      @JsonProperty(required = true, value = JSON_PROPERTY_END_TIME) Long endTime,
      @JsonProperty(required = true, value = JSON_PROPERTY_ERROR) APMSpanErrorFlag error,
      @JsonProperty(required = true, value = JSON_PROPERTY_META) Map<String, String> meta,
      @JsonProperty(required = true, value = JSON_PROPERTY_METRICS) Map<String, Double> metrics,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_PARENT_ID) Long parentId,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE) String resource,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE) String service,
      @JsonProperty(required = true, value = JSON_PROPERTY_SPAN_ID) Long spanId,
      @JsonProperty(required = true, value = JSON_PROPERTY_START_TIME) Long startTime,
      @JsonProperty(required = true, value = JSON_PROPERTY_TRACE_ID) Long traceId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TRACE_ID_FULL) String traceIdFull,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type) {
    this.duration = duration;
    this.endTime = endTime;
    this.error = error;
    this.unparsed |= !error.isValid();
    this.meta = meta;
    this.metrics = metrics;
    this.name = name;
    this.parentId = parentId;
    this.resource = resource;
    this.service = service;
    this.spanId = spanId;
    this.startTime = startTime;
    this.traceId = traceId;
    this.traceIdFull = traceIdFull;
    this.type = type;
  }

  public APMTraceSpan duration(Long duration) {
    this.duration = duration;
    return this;
  }

  /**
   * The duration of the span, in nanoseconds.
   *
   * @return duration
   */
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public APMTraceSpan endTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The end time of the span, in Unix nanoseconds.
   *
   * @return endTime
   */
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getEndTime() {
    return endTime;
  }

  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }

  public APMTraceSpan error(APMSpanErrorFlag error) {
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

  public APMTraceSpan meta(Map<String, String> meta) {
    this.meta = meta;
    return this;
  }

  public APMTraceSpan putMetaItem(String key, String metaItem) {
    this.meta.put(key, metaItem);
    return this;
  }

  /**
   * String-valued tags attached to the span. Tag keys starting with <code>_</code> are filtered out
   * of the response.
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

  public APMTraceSpan metrics(Map<String, Double> metrics) {
    this.metrics = metrics;
    return this;
  }

  public APMTraceSpan putMetricsItem(String key, Double metricsItem) {
    this.metrics.put(key, metricsItem);
    return this;
  }

  /**
   * Numeric metrics attached to the span. Metric keys starting with <code>_</code> are filtered out
   * of the response.
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

  public APMTraceSpan name(String name) {
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

  public APMTraceSpan parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * The ID of the parent span, or <code>0</code> when the span is a trace root.
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

  public APMTraceSpan resource(String resource) {
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

  public APMTraceSpan resourceHash(String resourceHash) {
    this.resourceHash = resourceHash;
    return this;
  }

  /**
   * A hash of the resource field.
   *
   * @return resourceHash
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResourceHash() {
    return resourceHash;
  }

  public void setResourceHash(String resourceHash) {
    this.resourceHash = resourceHash;
  }

  public APMTraceSpan restricted(Boolean restricted) {
    this.restricted = restricted;
    return this;
  }

  /**
   * Whether access to the span is restricted by the organization's data access policies.
   *
   * @return restricted
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESTRICTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRestricted() {
    return restricted;
  }

  public void setRestricted(Boolean restricted) {
    this.restricted = restricted;
  }

  public APMTraceSpan selfTime(Double selfTime) {
    this.selfTime = selfTime;
    return this;
  }

  /**
   * The time spent in the span itself, excluding time spent in child spans, in nanoseconds.
   *
   * @return selfTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SELF_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSelfTime() {
    return selfTime;
  }

  public void setSelfTime(Double selfTime) {
    this.selfTime = selfTime;
  }

  public APMTraceSpan service(String service) {
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

  public APMTraceSpan spanId(Long spanId) {
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

  public APMTraceSpan startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The start time of the span, in Unix nanoseconds.
   *
   * @return startTime
   */
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getStartTime() {
    return startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public APMTraceSpan traceId(Long traceId) {
    this.traceId = traceId;
    return this;
  }

  /**
   * The lower 64 bits of the trace ID, as an unsigned 64-bit integer.
   *
   * @return traceId
   */
  @JsonProperty(JSON_PROPERTY_TRACE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTraceId() {
    return traceId;
  }

  public void setTraceId(Long traceId) {
    this.traceId = traceId;
  }

  public APMTraceSpan traceIdFull(String traceIdFull) {
    this.traceIdFull = traceIdFull;
    return this;
  }

  /**
   * The full 128-bit trace ID, encoded as a 32-character hexadecimal string.
   *
   * @return traceIdFull
   */
  @JsonProperty(JSON_PROPERTY_TRACE_ID_FULL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTraceIdFull() {
    return traceIdFull;
  }

  public void setTraceIdFull(String traceIdFull) {
    this.traceIdFull = traceIdFull;
  }

  public APMTraceSpan type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the span (for example, <code>web</code>, <code>db</code>, or <code>rpc</code>).
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
   * @return APMTraceSpan
   */
  @JsonAnySetter
  public APMTraceSpan putAdditionalProperty(String key, Object value) {
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

  /** Return true if this APMTraceSpan object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APMTraceSpan apmTraceSpan = (APMTraceSpan) o;
    return Objects.equals(this.duration, apmTraceSpan.duration)
        && Objects.equals(this.endTime, apmTraceSpan.endTime)
        && Objects.equals(this.error, apmTraceSpan.error)
        && Objects.equals(this.meta, apmTraceSpan.meta)
        && Objects.equals(this.metrics, apmTraceSpan.metrics)
        && Objects.equals(this.name, apmTraceSpan.name)
        && Objects.equals(this.parentId, apmTraceSpan.parentId)
        && Objects.equals(this.resource, apmTraceSpan.resource)
        && Objects.equals(this.resourceHash, apmTraceSpan.resourceHash)
        && Objects.equals(this.restricted, apmTraceSpan.restricted)
        && Objects.equals(this.selfTime, apmTraceSpan.selfTime)
        && Objects.equals(this.service, apmTraceSpan.service)
        && Objects.equals(this.spanId, apmTraceSpan.spanId)
        && Objects.equals(this.startTime, apmTraceSpan.startTime)
        && Objects.equals(this.traceId, apmTraceSpan.traceId)
        && Objects.equals(this.traceIdFull, apmTraceSpan.traceIdFull)
        && Objects.equals(this.type, apmTraceSpan.type)
        && Objects.equals(this.additionalProperties, apmTraceSpan.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        duration,
        endTime,
        error,
        meta,
        metrics,
        name,
        parentId,
        resource,
        resourceHash,
        restricted,
        selfTime,
        service,
        spanId,
        startTime,
        traceId,
        traceIdFull,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APMTraceSpan {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    resourceHash: ").append(toIndentedString(resourceHash)).append("\n");
    sb.append("    restricted: ").append(toIndentedString(restricted)).append("\n");
    sb.append("    selfTime: ").append(toIndentedString(selfTime)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    spanId: ").append(toIndentedString(spanId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
    sb.append("    traceIdFull: ").append(toIndentedString(traceIdFull)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
