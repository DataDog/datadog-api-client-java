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

/**
 * The most recent actual start and end dates for a recurring downtime. For a canceled downtime,
 * this is the previously occurring downtime. For active downtimes, this is the ongoing downtime,
 * and for scheduled downtimes it is the upcoming downtime.
 */
@JsonPropertyOrder({
  DowntimeAttributeScheduleCurrentDowntimeResponse.JSON_PROPERTY_END,
  DowntimeAttributeScheduleCurrentDowntimeResponse.JSON_PROPERTY_START
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DowntimeAttributeScheduleCurrentDowntimeResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_END = "end";
  private JsonNullable<OffsetDateTime> end = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_START = "start";
  private OffsetDateTime start;

  public DowntimeAttributeScheduleCurrentDowntimeResponse end(OffsetDateTime end) {
    this.end = JsonNullable.<OffsetDateTime>of(end);
    return this;
  }

  /**
   * The end of the current downtime.
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

  public DowntimeAttributeScheduleCurrentDowntimeResponse start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

  /**
   * The start of the current downtime.
   *
   * @return start
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  /** Return true if this DowntimeAttributeScheduleCurrentDowntimeResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowntimeAttributeScheduleCurrentDowntimeResponse
        downtimeAttributeScheduleCurrentDowntimeResponse =
            (DowntimeAttributeScheduleCurrentDowntimeResponse) o;
    return Objects.equals(this.end, downtimeAttributeScheduleCurrentDowntimeResponse.end)
        && Objects.equals(this.start, downtimeAttributeScheduleCurrentDowntimeResponse.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, start);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowntimeAttributeScheduleCurrentDowntimeResponse {\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
