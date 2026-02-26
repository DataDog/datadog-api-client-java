/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** A one-time downtime definition. */
@JsonPropertyOrder({
  DowntimeScheduleOneTimeCreateUpdateRequest.JSON_PROPERTY_END,
  DowntimeScheduleOneTimeCreateUpdateRequest.JSON_PROPERTY_START
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DowntimeScheduleOneTimeCreateUpdateRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_END = "end";
  private JsonNullable<OffsetDateTime> end = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_START = "start";
  private JsonNullable<OffsetDateTime> start = JsonNullable.<OffsetDateTime>undefined();

  public DowntimeScheduleOneTimeCreateUpdateRequest end(OffsetDateTime end) {
    this.end = JsonNullable.<OffsetDateTime>of(end);
    return this;
  }

  /**
   * ISO-8601 Datetime to end the downtime. Must include a UTC offset of zero. If not provided, the
   * downtime continues forever.
   *
   * @return end
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getEnd() {
    return end.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getEnd_JsonNullable() {
    return end;
  }

  @JsonProperty(JSON_PROPERTY_END)
  public void setEnd_JsonNullable(JsonNullable<OffsetDateTime> end) {
    this.end = end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = JsonNullable.<OffsetDateTime>of(end);
  }

  public DowntimeScheduleOneTimeCreateUpdateRequest start(OffsetDateTime start) {
    this.start = JsonNullable.<OffsetDateTime>of(start);
    return this;
  }

  /**
   * ISO-8601 Datetime to start the downtime. Must include a UTC offset of zero. If not provided,
   * the downtime starts the moment it is created.
   *
   * @return start
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getStart() {
    return start.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getStart_JsonNullable() {
    return start;
  }

  @JsonProperty(JSON_PROPERTY_START)
  public void setStart_JsonNullable(JsonNullable<OffsetDateTime> start) {
    this.start = start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = JsonNullable.<OffsetDateTime>of(start);
  }

  /** Return true if this DowntimeScheduleOneTimeCreateUpdateRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowntimeScheduleOneTimeCreateUpdateRequest downtimeScheduleOneTimeCreateUpdateRequest =
        (DowntimeScheduleOneTimeCreateUpdateRequest) o;
    return Objects.equals(this.end, downtimeScheduleOneTimeCreateUpdateRequest.end)
        && Objects.equals(this.start, downtimeScheduleOneTimeCreateUpdateRequest.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, start);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowntimeScheduleOneTimeCreateUpdateRequest {\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
