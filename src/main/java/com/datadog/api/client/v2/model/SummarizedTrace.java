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

/** A summarized, hierarchical view of a trace. */
@JsonPropertyOrder({SummarizedTrace.JSON_PROPERTY_ROOT, SummarizedTrace.JSON_PROPERTY_TRACE_ID})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SummarizedTrace {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ROOT = "root";
  private SummarizedSpan root;

  public static final String JSON_PROPERTY_TRACE_ID = "traceId";
  private String traceId;

  public SummarizedTrace() {}

  @JsonCreator
  public SummarizedTrace(
      @JsonProperty(required = true, value = JSON_PROPERTY_ROOT) SummarizedSpan root,
      @JsonProperty(required = true, value = JSON_PROPERTY_TRACE_ID) String traceId) {
    this.root = root;
    this.unparsed |= root.unparsed;
    this.traceId = traceId;
  }

  public SummarizedTrace root(SummarizedSpan root) {
    this.root = root;
    this.unparsed |= root.unparsed;
    return this;
  }

  /**
   * A node in the pruned trace tree.
   *
   * @return root
   */
  @JsonProperty(JSON_PROPERTY_ROOT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SummarizedSpan getRoot() {
    return root;
  }

  public void setRoot(SummarizedSpan root) {
    this.root = root;
  }

  public SummarizedTrace traceId(String traceId) {
    this.traceId = traceId;
    return this;
  }

  /**
   * The full 128-bit trace ID, encoded as a 32-character hexadecimal string.
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
   * @return SummarizedTrace
   */
  @JsonAnySetter
  public SummarizedTrace putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SummarizedTrace object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummarizedTrace summarizedTrace = (SummarizedTrace) o;
    return Objects.equals(this.root, summarizedTrace.root)
        && Objects.equals(this.traceId, summarizedTrace.traceId)
        && Objects.equals(this.additionalProperties, summarizedTrace.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(root, traceId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummarizedTrace {\n");
    sb.append("    root: ").append(toIndentedString(root)).append("\n");
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
