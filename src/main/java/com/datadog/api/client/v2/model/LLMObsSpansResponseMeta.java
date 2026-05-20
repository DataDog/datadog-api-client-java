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

/** Metadata accompanying the spans response. */
@JsonPropertyOrder({
  LLMObsSpansResponseMeta.JSON_PROPERTY_ELAPSED,
  LLMObsSpansResponseMeta.JSON_PROPERTY_PAGE,
  LLMObsSpansResponseMeta.JSON_PROPERTY_REQUEST_ID,
  LLMObsSpansResponseMeta.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsSpansResponseMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ELAPSED = "elapsed";
  private Long elapsed;

  public static final String JSON_PROPERTY_PAGE = "page";
  private LLMObsSpansResponsePage page;

  public static final String JSON_PROPERTY_REQUEST_ID = "request_id";
  private String requestId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public LLMObsSpansResponseMeta() {}

  @JsonCreator
  public LLMObsSpansResponseMeta(
      @JsonProperty(required = true, value = JSON_PROPERTY_ELAPSED) Long elapsed,
      @JsonProperty(required = true, value = JSON_PROPERTY_PAGE) LLMObsSpansResponsePage page,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_ID) String requestId,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) String status) {
    this.elapsed = elapsed;
    this.page = page;
    this.unparsed |= page.unparsed;
    this.requestId = requestId;
    this.status = status;
  }

  public LLMObsSpansResponseMeta elapsed(Long elapsed) {
    this.elapsed = elapsed;
    return this;
  }

  /**
   * Time elapsed for the query in milliseconds.
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

  public LLMObsSpansResponseMeta page(LLMObsSpansResponsePage page) {
    this.page = page;
    this.unparsed |= page.unparsed;
    return this;
  }

  /**
   * Pagination cursor for the spans response.
   *
   * @return page
   */
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LLMObsSpansResponsePage getPage() {
    return page;
  }

  public void setPage(LLMObsSpansResponsePage page) {
    this.page = page;
  }

  public LLMObsSpansResponseMeta requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Unique identifier for the request.
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

  public LLMObsSpansResponseMeta status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the query execution.
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
   * @return LLMObsSpansResponseMeta
   */
  @JsonAnySetter
  public LLMObsSpansResponseMeta putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsSpansResponseMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsSpansResponseMeta llmObsSpansResponseMeta = (LLMObsSpansResponseMeta) o;
    return Objects.equals(this.elapsed, llmObsSpansResponseMeta.elapsed)
        && Objects.equals(this.page, llmObsSpansResponseMeta.page)
        && Objects.equals(this.requestId, llmObsSpansResponseMeta.requestId)
        && Objects.equals(this.status, llmObsSpansResponseMeta.status)
        && Objects.equals(this.additionalProperties, llmObsSpansResponseMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elapsed, page, requestId, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsSpansResponseMeta {\n");
    sb.append("    elapsed: ").append(toIndentedString(elapsed)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
