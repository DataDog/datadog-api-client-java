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

/**
 * Top-level JSON:API meta block accompanying every DDSQL tabular query response. Carries standard
 * observability handles for client-side correlation.
 */
@JsonPropertyOrder({
  DdsqlTabularQueryResponseMeta.JSON_PROPERTY_ELAPSED,
  DdsqlTabularQueryResponseMeta.JSON_PROPERTY_REQUEST_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DdsqlTabularQueryResponseMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ELAPSED = "elapsed";
  private Long elapsed;

  public static final String JSON_PROPERTY_REQUEST_ID = "request_id";
  private String requestId;

  public DdsqlTabularQueryResponseMeta() {}

  @JsonCreator
  public DdsqlTabularQueryResponseMeta(
      @JsonProperty(required = true, value = JSON_PROPERTY_ELAPSED) Long elapsed,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_ID) String requestId) {
    this.elapsed = elapsed;
    this.requestId = requestId;
  }

  public DdsqlTabularQueryResponseMeta elapsed(Long elapsed) {
    this.elapsed = elapsed;
    return this;
  }

  /**
   * Server-side time spent serving this request, in milliseconds.
   *
   * @return elapsed
   */
  @JsonProperty(JSON_PROPERTY_ELAPSED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getElapsed() {
    return elapsed;
  }

  public void setElapsed(Long elapsed) {
    this.elapsed = elapsed;
  }

  public DdsqlTabularQueryResponseMeta requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Echo of the <code>DD-Request-ID</code> header assigned by Datadog's edge to this request, for
   * support correlation.
   *
   * @return requestId
   */
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
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
   * @return DdsqlTabularQueryResponseMeta
   */
  @JsonAnySetter
  public DdsqlTabularQueryResponseMeta putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DdsqlTabularQueryResponseMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DdsqlTabularQueryResponseMeta ddsqlTabularQueryResponseMeta = (DdsqlTabularQueryResponseMeta) o;
    return Objects.equals(this.elapsed, ddsqlTabularQueryResponseMeta.elapsed)
        && Objects.equals(this.requestId, ddsqlTabularQueryResponseMeta.requestId)
        && Objects.equals(
            this.additionalProperties, ddsqlTabularQueryResponseMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elapsed, requestId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DdsqlTabularQueryResponseMeta {\n");
    sb.append("    elapsed: ").append(toIndentedString(elapsed)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
