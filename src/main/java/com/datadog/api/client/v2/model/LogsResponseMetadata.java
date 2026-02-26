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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The metadata associated with a request */
@JsonPropertyOrder({
  LogsResponseMetadata.JSON_PROPERTY_ELAPSED,
  LogsResponseMetadata.JSON_PROPERTY_PAGE,
  LogsResponseMetadata.JSON_PROPERTY_REQUEST_ID,
  LogsResponseMetadata.JSON_PROPERTY_STATUS,
  LogsResponseMetadata.JSON_PROPERTY_WARNINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsResponseMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ELAPSED = "elapsed";
  private Long elapsed;

  public static final String JSON_PROPERTY_PAGE = "page";
  private LogsResponseMetadataPage page;

  public static final String JSON_PROPERTY_REQUEST_ID = "request_id";
  private String requestId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private LogsAggregateResponseStatus status;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<LogsWarning> warnings = null;

  public LogsResponseMetadata elapsed(Long elapsed) {
    this.elapsed = elapsed;
    return this;
  }

  /**
   * The time elapsed in milliseconds
   *
   * @return elapsed
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELAPSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getElapsed() {
    return elapsed;
  }

  public void setElapsed(Long elapsed) {
    this.elapsed = elapsed;
  }

  public LogsResponseMetadata page(LogsResponseMetadataPage page) {
    this.page = page;
    this.unparsed |= page.unparsed;
    return this;
  }

  /**
   * Paging attributes.
   *
   * @return page
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsResponseMetadataPage getPage() {
    return page;
  }

  public void setPage(LogsResponseMetadataPage page) {
    this.page = page;
  }

  public LogsResponseMetadata requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * The identifier of the request
   *
   * @return requestId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public LogsResponseMetadata status(LogsAggregateResponseStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of the response
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsAggregateResponseStatus getStatus() {
    return status;
  }

  public void setStatus(LogsAggregateResponseStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public LogsResponseMetadata warnings(List<LogsWarning> warnings) {
    this.warnings = warnings;
    for (LogsWarning item : warnings) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LogsResponseMetadata addWarningsItem(LogsWarning warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    this.unparsed |= warningsItem.unparsed;
    return this;
  }

  /**
   * A list of warnings (non fatal errors) encountered, partial results might be returned if
   * warnings are present in the response.
   *
   * @return warnings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LogsWarning> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<LogsWarning> warnings) {
    this.warnings = warnings;
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
   * @return LogsResponseMetadata
   */
  @JsonAnySetter
  public LogsResponseMetadata putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LogsResponseMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsResponseMetadata logsResponseMetadata = (LogsResponseMetadata) o;
    return Objects.equals(this.elapsed, logsResponseMetadata.elapsed)
        && Objects.equals(this.page, logsResponseMetadata.page)
        && Objects.equals(this.requestId, logsResponseMetadata.requestId)
        && Objects.equals(this.status, logsResponseMetadata.status)
        && Objects.equals(this.warnings, logsResponseMetadata.warnings)
        && Objects.equals(this.additionalProperties, logsResponseMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elapsed, page, requestId, status, warnings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsResponseMetadata {\n");
    sb.append("    elapsed: ").append(toIndentedString(elapsed)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
