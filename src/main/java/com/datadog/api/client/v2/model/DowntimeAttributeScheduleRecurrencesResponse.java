/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** A recurring downtime schedule definition. */
@JsonPropertyOrder({
  DowntimeAttributeScheduleRecurrencesResponse.JSON_PROPERTY_CURRENT_DOWNTIME,
  DowntimeAttributeScheduleRecurrencesResponse.JSON_PROPERTY_RECURRENCES,
  DowntimeAttributeScheduleRecurrencesResponse.JSON_PROPERTY_TIMEZONE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DowntimeAttributeScheduleRecurrencesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CURRENT_DOWNTIME = "current_downtime";
  private DowntimeAttributeScheduleCurrentDowntimeResponse currentDowntime;

  public static final String JSON_PROPERTY_RECURRENCES = "recurrences";
  private List<DowntimeAttributeScheduleRecurrenceResponse> recurrences = new ArrayList<>();

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone = "UTC";

  public DowntimeAttributeScheduleRecurrencesResponse() {}

  @JsonCreator
  public DowntimeAttributeScheduleRecurrencesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_RECURRENCES)
          List<DowntimeAttributeScheduleRecurrenceResponse> recurrences) {
    this.recurrences = recurrences;
  }

  public DowntimeAttributeScheduleRecurrencesResponse currentDowntime(
      DowntimeAttributeScheduleCurrentDowntimeResponse currentDowntime) {
    this.currentDowntime = currentDowntime;
    this.unparsed |= currentDowntime.unparsed;
    return this;
  }

  /**
   * The most recent actual start and end dates for a recurring downtime. For a canceled downtime,
   * this is the previously occurring downtime. For active downtimes, this is the ongoing downtime,
   * and for scheduled downtimes it is the upcoming downtime.
   *
   * @return currentDowntime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_DOWNTIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DowntimeAttributeScheduleCurrentDowntimeResponse getCurrentDowntime() {
    return currentDowntime;
  }

  public void setCurrentDowntime(DowntimeAttributeScheduleCurrentDowntimeResponse currentDowntime) {
    this.currentDowntime = currentDowntime;
  }

  public DowntimeAttributeScheduleRecurrencesResponse recurrences(
      List<DowntimeAttributeScheduleRecurrenceResponse> recurrences) {
    this.recurrences = recurrences;
    for (DowntimeAttributeScheduleRecurrenceResponse item : recurrences) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DowntimeAttributeScheduleRecurrencesResponse addRecurrencesItem(
      DowntimeAttributeScheduleRecurrenceResponse recurrencesItem) {
    this.recurrences.add(recurrencesItem);
    this.unparsed |= recurrencesItem.unparsed;
    return this;
  }

  /**
   * A list of downtime recurrences.
   *
   * @return recurrences
   */
  @JsonProperty(JSON_PROPERTY_RECURRENCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<DowntimeAttributeScheduleRecurrenceResponse> getRecurrences() {
    return recurrences;
  }

  public void setRecurrences(List<DowntimeAttributeScheduleRecurrenceResponse> recurrences) {
    this.recurrences = recurrences;
  }

  public DowntimeAttributeScheduleRecurrencesResponse timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * The timezone in which to schedule the downtime. This affects recurring start and end dates.
   * Must match <code>display_timezone</code>.
   *
   * @return timezone
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  /** Return true if this DowntimeAttributeScheduleRecurrencesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowntimeAttributeScheduleRecurrencesResponse downtimeAttributeScheduleRecurrencesResponse =
        (DowntimeAttributeScheduleRecurrencesResponse) o;
    return Objects.equals(
            this.currentDowntime, downtimeAttributeScheduleRecurrencesResponse.currentDowntime)
        && Objects.equals(
            this.recurrences, downtimeAttributeScheduleRecurrencesResponse.recurrences)
        && Objects.equals(this.timezone, downtimeAttributeScheduleRecurrencesResponse.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentDowntime, recurrences, timezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowntimeAttributeScheduleRecurrencesResponse {\n");
    sb.append("    currentDowntime: ").append(toIndentedString(currentDowntime)).append("\n");
    sb.append("    recurrences: ").append(toIndentedString(recurrences)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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
