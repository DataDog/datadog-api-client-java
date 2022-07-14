/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.datadog.api.client.JsonTimeSerializer;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import java.util.Objects;

/** Absolute timeframe. */
@JsonPropertyOrder({
  NotebookAbsoluteTime.JSON_PROPERTY_END,
  NotebookAbsoluteTime.JSON_PROPERTY_LIVE,
  NotebookAbsoluteTime.JSON_PROPERTY_START
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotebookAbsoluteTime {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_END = "end";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime end;

  public static final String JSON_PROPERTY_LIVE = "live";
  private Boolean live;

  public static final String JSON_PROPERTY_START = "start";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime start;

  public NotebookAbsoluteTime() {}

  @JsonCreator
  public NotebookAbsoluteTime(
      @JsonProperty(required = true, value = JSON_PROPERTY_END) OffsetDateTime end,
      @JsonProperty(required = true, value = JSON_PROPERTY_START) OffsetDateTime start) {
    this.end = end;
    this.start = start;
  }

  public NotebookAbsoluteTime end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

  /**
   * The end time.
   *
   * @return end
   */
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }

  public NotebookAbsoluteTime live(Boolean live) {
    this.live = live;
    return this;
  }

  /**
   * Indicates whether the timeframe should be shifted to end at the current time.
   *
   * @return live
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getLive() {
    return live;
  }

  public void setLive(Boolean live) {
    this.live = live;
  }

  public NotebookAbsoluteTime start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

  /**
   * The start time.
   *
   * @return start
   */
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  /** Return true if this NotebookAbsoluteTime object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookAbsoluteTime notebookAbsoluteTime = (NotebookAbsoluteTime) o;
    return Objects.equals(this.end, notebookAbsoluteTime.end)
        && Objects.equals(this.live, notebookAbsoluteTime.live)
        && Objects.equals(this.start, notebookAbsoluteTime.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, live, start);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookAbsoluteTime {\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    live: ").append(toIndentedString(live)).append("\n");
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
