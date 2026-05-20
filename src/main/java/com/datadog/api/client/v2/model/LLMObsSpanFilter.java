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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Filter criteria for an LLM Observability span search. */
@JsonPropertyOrder({
  LLMObsSpanFilter.JSON_PROPERTY_FROM,
  LLMObsSpanFilter.JSON_PROPERTY_ML_APP,
  LLMObsSpanFilter.JSON_PROPERTY_QUERY,
  LLMObsSpanFilter.JSON_PROPERTY_SPAN_ID,
  LLMObsSpanFilter.JSON_PROPERTY_SPAN_KIND,
  LLMObsSpanFilter.JSON_PROPERTY_SPAN_NAME,
  LLMObsSpanFilter.JSON_PROPERTY_TAGS,
  LLMObsSpanFilter.JSON_PROPERTY_TO,
  LLMObsSpanFilter.JSON_PROPERTY_TRACE_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsSpanFilter {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FROM = "from";
  private String from;

  public static final String JSON_PROPERTY_ML_APP = "ml_app";
  private String mlApp;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_SPAN_ID = "span_id";
  private String spanId;

  public static final String JSON_PROPERTY_SPAN_KIND = "span_kind";
  private String spanKind;

  public static final String JSON_PROPERTY_SPAN_NAME = "span_name";
  private String spanName;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = null;

  public static final String JSON_PROPERTY_TO = "to";
  private String to;

  public static final String JSON_PROPERTY_TRACE_ID = "trace_id";
  private String traceId;

  public LLMObsSpanFilter from(String from) {
    this.from = from;
    return this;
  }

  /**
   * Start of the time range. Accepts ISO 8601 or relative format (e.g., <code>now-15m</code>).
   * Defaults to <code>now-15m</code>.
   *
   * @return from
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public LLMObsSpanFilter mlApp(String mlApp) {
    this.mlApp = mlApp;
    return this;
  }

  /**
   * Filter by ML application name.
   *
   * @return mlApp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ML_APP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMlApp() {
    return mlApp;
  }

  public void setMlApp(String mlApp) {
    this.mlApp = mlApp;
  }

  public LLMObsSpanFilter query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Search query using LLM Observability query syntax. Supports attribute filters using the
   * field:value syntax (e.g. session_id, trace_id, ml_app, meta.span.kind). When provided,
   * structured field filters (<code>span_id</code>, <code>trace_id</code>, etc.) are ignored.
   *
   * @return query
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public LLMObsSpanFilter spanId(String spanId) {
    this.spanId = spanId;
    return this;
  }

  /**
   * Filter by exact span ID.
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

  public LLMObsSpanFilter spanKind(String spanKind) {
    this.spanKind = spanKind;
    return this;
  }

  /**
   * Filter by span kind (e.g., llm, agent, tool, task, workflow).
   *
   * @return spanKind
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPAN_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSpanKind() {
    return spanKind;
  }

  public void setSpanKind(String spanKind) {
    this.spanKind = spanKind;
  }

  public LLMObsSpanFilter spanName(String spanName) {
    this.spanName = spanName;
    return this;
  }

  /**
   * Filter by span name.
   *
   * @return spanName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPAN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSpanName() {
    return spanName;
  }

  public void setSpanName(String spanName) {
    this.spanName = spanName;
  }

  public LLMObsSpanFilter tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public LLMObsSpanFilter putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

  /**
   * Filter by tag key-value pairs.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  public LLMObsSpanFilter to(String to) {
    this.to = to;
    return this;
  }

  /**
   * End of the time range. Accepts ISO 8601 or relative format (e.g., <code>now</code>). Defaults
   * to <code>now</code>.
   *
   * @return to
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public LLMObsSpanFilter traceId(String traceId) {
    this.traceId = traceId;
    return this;
  }

  /**
   * Filter by exact trace ID.
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
   * @return LLMObsSpanFilter
   */
  @JsonAnySetter
  public LLMObsSpanFilter putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsSpanFilter object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsSpanFilter llmObsSpanFilter = (LLMObsSpanFilter) o;
    return Objects.equals(this.from, llmObsSpanFilter.from)
        && Objects.equals(this.mlApp, llmObsSpanFilter.mlApp)
        && Objects.equals(this.query, llmObsSpanFilter.query)
        && Objects.equals(this.spanId, llmObsSpanFilter.spanId)
        && Objects.equals(this.spanKind, llmObsSpanFilter.spanKind)
        && Objects.equals(this.spanName, llmObsSpanFilter.spanName)
        && Objects.equals(this.tags, llmObsSpanFilter.tags)
        && Objects.equals(this.to, llmObsSpanFilter.to)
        && Objects.equals(this.traceId, llmObsSpanFilter.traceId)
        && Objects.equals(this.additionalProperties, llmObsSpanFilter.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        from, mlApp, query, spanId, spanKind, spanName, tags, to, traceId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsSpanFilter {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    mlApp: ").append(toIndentedString(mlApp)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    spanId: ").append(toIndentedString(spanId)).append("\n");
    sb.append("    spanKind: ").append(toIndentedString(spanKind)).append("\n");
    sb.append("    spanName: ").append(toIndentedString(spanName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
