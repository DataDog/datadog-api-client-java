/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** A recurring downtime schedule definition. */
@JsonPropertyOrder({
  DowntimeScheduleRecurrencesUpdateRequest.JSON_PROPERTY_RECURRENCES,
  DowntimeScheduleRecurrencesUpdateRequest.JSON_PROPERTY_TIMEZONE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DowntimeScheduleRecurrencesUpdateRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RECURRENCES = "recurrences";
  private List<DowntimeScheduleRecurrenceCreateUpdateRequest> recurrences = null;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone = "UTC";

  public DowntimeScheduleRecurrencesUpdateRequest recurrences(
      List<DowntimeScheduleRecurrenceCreateUpdateRequest> recurrences) {
    this.recurrences = recurrences;
    for (DowntimeScheduleRecurrenceCreateUpdateRequest item : recurrences) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DowntimeScheduleRecurrencesUpdateRequest addRecurrencesItem(
      DowntimeScheduleRecurrenceCreateUpdateRequest recurrencesItem) {
    if (this.recurrences == null) {
      this.recurrences = new ArrayList<>();
    }
    this.recurrences.add(recurrencesItem);
    this.unparsed |= recurrencesItem.unparsed;
    return this;
  }

  /**
   * A list of downtime recurrences.
   *
   * @return recurrences
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECURRENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DowntimeScheduleRecurrenceCreateUpdateRequest> getRecurrences() {
    return recurrences;
  }

  public void setRecurrences(List<DowntimeScheduleRecurrenceCreateUpdateRequest> recurrences) {
    this.recurrences = recurrences;
  }

  public DowntimeScheduleRecurrencesUpdateRequest timezone(String timezone) {
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
   * @return DowntimeScheduleRecurrencesUpdateRequest
   */
  @JsonAnySetter
  public DowntimeScheduleRecurrencesUpdateRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DowntimeScheduleRecurrencesUpdateRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowntimeScheduleRecurrencesUpdateRequest downtimeScheduleRecurrencesUpdateRequest =
        (DowntimeScheduleRecurrencesUpdateRequest) o;
    return Objects.equals(this.recurrences, downtimeScheduleRecurrencesUpdateRequest.recurrences)
        && Objects.equals(this.timezone, downtimeScheduleRecurrencesUpdateRequest.timezone)
        && Objects.equals(
            this.additionalProperties,
            downtimeScheduleRecurrencesUpdateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recurrences, timezone, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowntimeScheduleRecurrencesUpdateRequest {\n");
    sb.append("    recurrences: ").append(toIndentedString(recurrences)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
