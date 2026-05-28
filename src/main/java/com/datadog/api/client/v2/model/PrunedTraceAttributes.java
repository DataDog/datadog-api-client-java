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

/** The attributes of a pruned trace returned by the Get pruned trace by ID endpoint. */
@JsonPropertyOrder({
  PrunedTraceAttributes.JSON_PROPERTY_IS_TRUNCATED,
  PrunedTraceAttributes.JSON_PROPERTY_SIZE_BYTES,
  PrunedTraceAttributes.JSON_PROPERTY_SUMMARIZED_TRACE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PrunedTraceAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_TRUNCATED = "is_truncated";
  private Boolean isTruncated;

  public static final String JSON_PROPERTY_SIZE_BYTES = "size_bytes";
  private Integer sizeBytes;

  public static final String JSON_PROPERTY_SUMMARIZED_TRACE = "summarized_trace";
  private SummarizedTrace summarizedTrace;

  public PrunedTraceAttributes() {}

  @JsonCreator
  public PrunedTraceAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_TRUNCATED) Boolean isTruncated,
      @JsonProperty(required = true, value = JSON_PROPERTY_SIZE_BYTES) Integer sizeBytes,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUMMARIZED_TRACE)
          SummarizedTrace summarizedTrace) {
    this.isTruncated = isTruncated;
    this.sizeBytes = sizeBytes;
    this.summarizedTrace = summarizedTrace;
    this.unparsed |= summarizedTrace.unparsed;
  }

  public PrunedTraceAttributes isTruncated(Boolean isTruncated) {
    this.isTruncated = isTruncated;
    return this;
  }

  /**
   * Indicates whether the underlying trace was truncated because its size exceeded the maximum that
   * can be retrieved from storage.
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

  public PrunedTraceAttributes sizeBytes(Integer sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }

  /**
   * The size, in bytes, of the original (non-pruned) trace before summarization. maximum:
   * 2147483647
   *
   * @return sizeBytes
   */
  @JsonProperty(JSON_PROPERTY_SIZE_BYTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getSizeBytes() {
    return sizeBytes;
  }

  public void setSizeBytes(Integer sizeBytes) {
    this.sizeBytes = sizeBytes;
  }

  public PrunedTraceAttributes summarizedTrace(SummarizedTrace summarizedTrace) {
    this.summarizedTrace = summarizedTrace;
    this.unparsed |= summarizedTrace.unparsed;
    return this;
  }

  /**
   * A summarized, hierarchical view of a trace.
   *
   * @return summarizedTrace
   */
  @JsonProperty(JSON_PROPERTY_SUMMARIZED_TRACE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SummarizedTrace getSummarizedTrace() {
    return summarizedTrace;
  }

  public void setSummarizedTrace(SummarizedTrace summarizedTrace) {
    this.summarizedTrace = summarizedTrace;
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
   * @return PrunedTraceAttributes
   */
  @JsonAnySetter
  public PrunedTraceAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this PrunedTraceAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrunedTraceAttributes prunedTraceAttributes = (PrunedTraceAttributes) o;
    return Objects.equals(this.isTruncated, prunedTraceAttributes.isTruncated)
        && Objects.equals(this.sizeBytes, prunedTraceAttributes.sizeBytes)
        && Objects.equals(this.summarizedTrace, prunedTraceAttributes.summarizedTrace)
        && Objects.equals(this.additionalProperties, prunedTraceAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isTruncated, sizeBytes, summarizedTrace, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrunedTraceAttributes {\n");
    sb.append("    isTruncated: ").append(toIndentedString(isTruncated)).append("\n");
    sb.append("    sizeBytes: ").append(toIndentedString(sizeBytes)).append("\n");
    sb.append("    summarizedTrace: ").append(toIndentedString(summarizedTrace)).append("\n");
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
