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

/** Object describing the error. */
@JsonPropertyOrder({
  SLOBulkDeleteError.JSON_PROPERTY_ID,
  SLOBulkDeleteError.JSON_PROPERTY_MESSAGE,
  SLOBulkDeleteError.JSON_PROPERTY_TIMEFRAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOBulkDeleteError {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_TIMEFRAME = "timeframe";
  private SLOErrorTimeframe timeframe;

  public SLOBulkDeleteError() {}

  @JsonCreator
  public SLOBulkDeleteError(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_MESSAGE) String message,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMEFRAME) SLOErrorTimeframe timeframe) {
    this.id = id;
    this.message = message;
    this.timeframe = timeframe;
    this.unparsed |= !timeframe.isValid();
  }

  public SLOBulkDeleteError id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the service level objective object associated with this error.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SLOBulkDeleteError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The error message.
   *
   * @return message
   */
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public SLOBulkDeleteError timeframe(SLOErrorTimeframe timeframe) {
    this.timeframe = timeframe;
    this.unparsed |= !timeframe.isValid();
    return this;
  }

  /**
   * The timeframe of the threshold associated with this error or "all" if all thresholds are
   * affected.
   *
   * @return timeframe
   */
  @JsonProperty(JSON_PROPERTY_TIMEFRAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SLOErrorTimeframe getTimeframe() {
    return timeframe;
  }

  public void setTimeframe(SLOErrorTimeframe timeframe) {
    if (!timeframe.isValid()) {
      this.unparsed = true;
    }
    this.timeframe = timeframe;
  }

  /** Return true if this SLOBulkDeleteError object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOBulkDeleteError sloBulkDeleteError = (SLOBulkDeleteError) o;
    return Objects.equals(this.id, sloBulkDeleteError.id)
        && Objects.equals(this.message, sloBulkDeleteError.message)
        && Objects.equals(this.timeframe, sloBulkDeleteError.timeframe);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, message, timeframe);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOBulkDeleteError {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    timeframe: ").append(toIndentedString(timeframe)).append("\n");
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
