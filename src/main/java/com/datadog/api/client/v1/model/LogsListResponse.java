/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
import org.openapitools.jackson.nullable.JsonNullable;

/** Response object with all logs matching the request and pagination information. */
@JsonPropertyOrder({
  LogsListResponse.JSON_PROPERTY_LOGS,
  LogsListResponse.JSON_PROPERTY_NEXT_LOG_ID,
  LogsListResponse.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsListResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LOGS = "logs";
  private List<Log> logs = null;

  public static final String JSON_PROPERTY_NEXT_LOG_ID = "nextLogId";
  private JsonNullable<String> nextLogId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public LogsListResponse logs(List<Log> logs) {
    this.logs = logs;
    for (Log item : logs) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LogsListResponse addLogsItem(Log logsItem) {
    if (this.logs == null) {
      this.logs = new ArrayList<>();
    }
    this.logs.add(logsItem);
    this.unparsed |= logsItem.unparsed;
    return this;
  }

  /**
   * Array of logs matching the request and the <code>nextLogId</code> if sent.
   *
   * @return logs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Log> getLogs() {
    return logs;
  }

  public void setLogs(List<Log> logs) {
    this.logs = logs;
  }

  public LogsListResponse nextLogId(String nextLogId) {
    this.nextLogId = JsonNullable.<String>of(nextLogId);
    return this;
  }

  /**
   * Hash identifier of the next log to return in the list. This parameter is used for the
   * pagination feature.
   *
   * @return nextLogId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getNextLogId() {
    return nextLogId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEXT_LOG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getNextLogId_JsonNullable() {
    return nextLogId;
  }

  @JsonProperty(JSON_PROPERTY_NEXT_LOG_ID)
  public void setNextLogId_JsonNullable(JsonNullable<String> nextLogId) {
    this.nextLogId = nextLogId;
  }

  public void setNextLogId(String nextLogId) {
    this.nextLogId = JsonNullable.<String>of(nextLogId);
  }

  public LogsListResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the response.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * @return LogsListResponse
   */
  @JsonAnySetter
  public LogsListResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LogsListResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsListResponse logsListResponse = (LogsListResponse) o;
    return Objects.equals(this.logs, logsListResponse.logs)
        && Objects.equals(this.nextLogId, logsListResponse.nextLogId)
        && Objects.equals(this.status, logsListResponse.status)
        && Objects.equals(this.additionalProperties, logsListResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logs, nextLogId, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsListResponse {\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
    sb.append("    nextLogId: ").append(toIndentedString(nextLogId)).append("\n");
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
