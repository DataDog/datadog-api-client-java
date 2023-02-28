/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** An object describing the error with error type and error message. */
@JsonPropertyOrder({
  SLOHistoryResponseErrorWithType.JSON_PROPERTY_ERROR_MESSAGE,
  SLOHistoryResponseErrorWithType.JSON_PROPERTY_ERROR_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOHistoryResponseErrorWithType {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERROR_MESSAGE = "error_message";
  private String errorMessage;

  public static final String JSON_PROPERTY_ERROR_TYPE = "error_type";
  private String errorType;

  public SLOHistoryResponseErrorWithType() {}

  @JsonCreator
  public SLOHistoryResponseErrorWithType(
      @JsonProperty(required = true, value = JSON_PROPERTY_ERROR_MESSAGE) String errorMessage,
      @JsonProperty(required = true, value = JSON_PROPERTY_ERROR_TYPE) String errorType) {
    this.errorMessage = errorMessage;
    this.errorType = errorType;
  }

  public SLOHistoryResponseErrorWithType errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * A message with more details about the error.
   *
   * @return errorMessage
   */
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public SLOHistoryResponseErrorWithType errorType(String errorType) {
    this.errorType = errorType;
    return this;
  }

  /**
   * Type of the error.
   *
   * @return errorType
   */
  @JsonProperty(JSON_PROPERTY_ERROR_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getErrorType() {
    return errorType;
  }

  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }

  /** Return true if this SLOHistoryResponseErrorWithType object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOHistoryResponseErrorWithType sloHistoryResponseErrorWithType =
        (SLOHistoryResponseErrorWithType) o;
    return Objects.equals(this.errorMessage, sloHistoryResponseErrorWithType.errorMessage)
        && Objects.equals(this.errorType, sloHistoryResponseErrorWithType.errorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, errorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOHistoryResponseErrorWithType {\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
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
