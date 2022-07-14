/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Error returned by the Logs API */
@JsonPropertyOrder({
  LogsAPIError.JSON_PROPERTY_CODE,
  LogsAPIError.JSON_PROPERTY_DETAILS,
  LogsAPIError.JSON_PROPERTY_MESSAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsAPIError {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private List<LogsAPIError> details = null;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public LogsAPIError code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Code identifying the error
   *
   * @return code
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public LogsAPIError details(List<LogsAPIError> details) {
    this.details = details;
    for (LogsAPIError item : details) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LogsAPIError addDetailsItem(LogsAPIError detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    this.unparsed |= detailsItem.unparsed;
    return this;
  }

  /**
   * Additional error details
   *
   * @return details
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LogsAPIError> getDetails() {
    return details;
  }

  public void setDetails(List<LogsAPIError> details) {
    this.details = details;
  }

  public LogsAPIError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Error message
   *
   * @return message
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  /** Return true if this LogsAPIError object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsAPIError logsApiError = (LogsAPIError) o;
    return Objects.equals(this.code, logsApiError.code)
        && Objects.equals(this.details, logsApiError.details)
        && Objects.equals(this.message, logsApiError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, details, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsAPIError {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
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
