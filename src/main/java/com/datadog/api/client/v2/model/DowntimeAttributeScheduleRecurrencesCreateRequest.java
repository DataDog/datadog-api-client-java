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
  DowntimeAttributeScheduleRecurrencesCreateRequest.JSON_PROPERTY_RECURRENCES,
  DowntimeAttributeScheduleRecurrencesCreateRequest.JSON_PROPERTY_TIMEZONE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DowntimeAttributeScheduleRecurrencesCreateRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RECURRENCES = "recurrences";
  private List<DowntimeAttributeScheduleRecurrenceCreateEditRequest> recurrences =
      new ArrayList<>();

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone = "UTC";

  public DowntimeAttributeScheduleRecurrencesCreateRequest() {}

  @JsonCreator
  public DowntimeAttributeScheduleRecurrencesCreateRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_RECURRENCES)
          List<DowntimeAttributeScheduleRecurrenceCreateEditRequest> recurrences) {
    this.recurrences = recurrences;
  }

  public DowntimeAttributeScheduleRecurrencesCreateRequest recurrences(
      List<DowntimeAttributeScheduleRecurrenceCreateEditRequest> recurrences) {
    this.recurrences = recurrences;
    for (DowntimeAttributeScheduleRecurrenceCreateEditRequest item : recurrences) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DowntimeAttributeScheduleRecurrencesCreateRequest addRecurrencesItem(
      DowntimeAttributeScheduleRecurrenceCreateEditRequest recurrencesItem) {
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
  public List<DowntimeAttributeScheduleRecurrenceCreateEditRequest> getRecurrences() {
    return recurrences;
  }

  public void setRecurrences(
      List<DowntimeAttributeScheduleRecurrenceCreateEditRequest> recurrences) {
    this.recurrences = recurrences;
  }

  public DowntimeAttributeScheduleRecurrencesCreateRequest timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * The timezone in which to schedule the downtime.
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

  /** Return true if this DowntimeAttributeScheduleRecurrencesCreateRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowntimeAttributeScheduleRecurrencesCreateRequest
        downtimeAttributeScheduleRecurrencesCreateRequest =
            (DowntimeAttributeScheduleRecurrencesCreateRequest) o;
    return Objects.equals(
            this.recurrences, downtimeAttributeScheduleRecurrencesCreateRequest.recurrences)
        && Objects.equals(
            this.timezone, downtimeAttributeScheduleRecurrencesCreateRequest.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recurrences, timezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowntimeAttributeScheduleRecurrencesCreateRequest {\n");
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
