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

/** The attributes of a trace returned by the Get trace by ID endpoint. */
@JsonPropertyOrder({
  TraceAttributes.JSON_PROPERTY_IS_TRUNCATED,
  TraceAttributes.JSON_PROPERTY_SPANS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TraceAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_TRUNCATED = "is_truncated";
  private Boolean isTruncated;

  public static final String JSON_PROPERTY_SPANS = "spans";
  private List<APMTraceSpan> spans = new ArrayList<>();

  public TraceAttributes() {}

  @JsonCreator
  public TraceAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_TRUNCATED) Boolean isTruncated,
      @JsonProperty(required = true, value = JSON_PROPERTY_SPANS) List<APMTraceSpan> spans) {
    this.isTruncated = isTruncated;
    this.spans = spans;
    for (APMTraceSpan item : spans) {
      this.unparsed |= item.unparsed;
    }
  }

  public TraceAttributes isTruncated(Boolean isTruncated) {
    this.isTruncated = isTruncated;
    return this;
  }

  /**
   * Indicates whether the trace was truncated because its size exceeded the maximum response
   * payload.
   *
   * @return isTruncated
   */
  @JsonProperty(JSON_PROPERTY_IS_TRUNCATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsTruncated() {
    return isTruncated;
  }

  public void setIsTruncated(Boolean isTruncated) {
    this.isTruncated = isTruncated;
  }

  public TraceAttributes spans(List<APMTraceSpan> spans) {
    this.spans = spans;
    for (APMTraceSpan item : spans) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TraceAttributes addSpansItem(APMTraceSpan spansItem) {
    this.spans.add(spansItem);
    this.unparsed |= spansItem.unparsed;
    return this;
  }

  /**
   * The list of spans that compose the trace.
   *
   * @return spans
   */
  @JsonProperty(JSON_PROPERTY_SPANS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<APMTraceSpan> getSpans() {
    return spans;
  }

  public void setSpans(List<APMTraceSpan> spans) {
    this.spans = spans;
    if (spans != null) {
      for (APMTraceSpan item : spans) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return TraceAttributes
   */
  @JsonAnySetter
  public TraceAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TraceAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TraceAttributes traceAttributes = (TraceAttributes) o;
    return Objects.equals(this.isTruncated, traceAttributes.isTruncated)
        && Objects.equals(this.spans, traceAttributes.spans)
        && Objects.equals(this.additionalProperties, traceAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isTruncated, spans, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TraceAttributes {\n");
    sb.append("    isTruncated: ").append(toIndentedString(isTruncated)).append("\n");
    sb.append("    spans: ").append(toIndentedString(spans)).append("\n");
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
