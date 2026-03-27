/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** A recurring downtime schedule definition. */
@JsonPropertyOrder({
  DowntimeScheduleRecurrencesResponse.JSON_PROPERTY_CURRENT_DOWNTIME,
  DowntimeScheduleRecurrencesResponse.JSON_PROPERTY_RECURRENCES,
  DowntimeScheduleRecurrencesResponse.JSON_PROPERTY_TIMEZONE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DowntimeScheduleRecurrencesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CURRENT_DOWNTIME = "current_downtime";
  private DowntimeScheduleCurrentDowntimeResponse currentDowntime;

  public static final String JSON_PROPERTY_RECURRENCES = "recurrences";
  private List<DowntimeScheduleRecurrenceResponse> recurrences = new ArrayList<>();

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone = "UTC";

  public DowntimeScheduleRecurrencesResponse() {}

  @JsonCreator
  public DowntimeScheduleRecurrencesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_RECURRENCES)
          List<DowntimeScheduleRecurrenceResponse> recurrences) {
    this.recurrences = recurrences;
  }

  public DowntimeScheduleRecurrencesResponse currentDowntime(
      DowntimeScheduleCurrentDowntimeResponse currentDowntime) {
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
  public DowntimeScheduleCurrentDowntimeResponse getCurrentDowntime() {
    return currentDowntime;
  }

  public void setCurrentDowntime(DowntimeScheduleCurrentDowntimeResponse currentDowntime) {
    this.currentDowntime = currentDowntime;
  }

  public DowntimeScheduleRecurrencesResponse recurrences(
      List<DowntimeScheduleRecurrenceResponse> recurrences) {
    this.recurrences = recurrences;
    for (DowntimeScheduleRecurrenceResponse item : recurrences) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DowntimeScheduleRecurrencesResponse addRecurrencesItem(
      DowntimeScheduleRecurrenceResponse recurrencesItem) {
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
  public List<DowntimeScheduleRecurrenceResponse> getRecurrences() {
    return recurrences;
  }

  public void setRecurrences(List<DowntimeScheduleRecurrenceResponse> recurrences) {
    this.recurrences = recurrences;
  }

  public DowntimeScheduleRecurrencesResponse timezone(String timezone) {
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
   * @return DowntimeScheduleRecurrencesResponse
   */
  @JsonAnySetter
  public DowntimeScheduleRecurrencesResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DowntimeScheduleRecurrencesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowntimeScheduleRecurrencesResponse downtimeScheduleRecurrencesResponse =
        (DowntimeScheduleRecurrencesResponse) o;
    return Objects.equals(this.currentDowntime, downtimeScheduleRecurrencesResponse.currentDowntime)
        && Objects.equals(this.recurrences, downtimeScheduleRecurrencesResponse.recurrences)
        && Objects.equals(this.timezone, downtimeScheduleRecurrencesResponse.timezone)
        && Objects.equals(
            this.additionalProperties, downtimeScheduleRecurrencesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentDowntime, recurrences, timezone, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowntimeScheduleRecurrencesResponse {\n");
    sb.append("    currentDowntime: ").append(toIndentedString(currentDowntime)).append("\n");
    sb.append("    recurrences: ").append(toIndentedString(recurrences)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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
