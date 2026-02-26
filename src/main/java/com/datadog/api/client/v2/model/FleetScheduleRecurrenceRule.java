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

/**
 * Defines the recurrence pattern for the schedule. Specifies when deployments should be
 * automatically triggered based on maintenance windows.
 */
@JsonPropertyOrder({
  FleetScheduleRecurrenceRule.JSON_PROPERTY_DAYS_OF_WEEK,
  FleetScheduleRecurrenceRule.JSON_PROPERTY_MAINTENANCE_WINDOW_DURATION,
  FleetScheduleRecurrenceRule.JSON_PROPERTY_START_MAINTENANCE_WINDOW,
  FleetScheduleRecurrenceRule.JSON_PROPERTY_TIMEZONE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetScheduleRecurrenceRule {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DAYS_OF_WEEK = "days_of_week";
  private List<String> daysOfWeek = new ArrayList<>();

  public static final String JSON_PROPERTY_MAINTENANCE_WINDOW_DURATION =
      "maintenance_window_duration";
  private Long maintenanceWindowDuration;

  public static final String JSON_PROPERTY_START_MAINTENANCE_WINDOW = "start_maintenance_window";
  private String startMaintenanceWindow;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public FleetScheduleRecurrenceRule() {}

  @JsonCreator
  public FleetScheduleRecurrenceRule(
      @JsonProperty(required = true, value = JSON_PROPERTY_DAYS_OF_WEEK) List<String> daysOfWeek,
      @JsonProperty(required = true, value = JSON_PROPERTY_MAINTENANCE_WINDOW_DURATION)
          Long maintenanceWindowDuration,
      @JsonProperty(required = true, value = JSON_PROPERTY_START_MAINTENANCE_WINDOW)
          String startMaintenanceWindow,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMEZONE) String timezone) {
    this.daysOfWeek = daysOfWeek;
    this.maintenanceWindowDuration = maintenanceWindowDuration;
    this.startMaintenanceWindow = startMaintenanceWindow;
    this.timezone = timezone;
  }

  public FleetScheduleRecurrenceRule daysOfWeek(List<String> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }

  public FleetScheduleRecurrenceRule addDaysOfWeekItem(String daysOfWeekItem) {
    this.daysOfWeek.add(daysOfWeekItem);
    return this;
  }

  /**
   * List of days of the week when the schedule should trigger. Valid values are: "Mon", "Tue",
   * "Wed", "Thu", "Fri", "Sat", "Sun".
   *
   * @return daysOfWeek
   */
  @JsonProperty(JSON_PROPERTY_DAYS_OF_WEEK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getDaysOfWeek() {
    return daysOfWeek;
  }

  public void setDaysOfWeek(List<String> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }

  public FleetScheduleRecurrenceRule maintenanceWindowDuration(Long maintenanceWindowDuration) {
    this.maintenanceWindowDuration = maintenanceWindowDuration;
    return this;
  }

  /**
   * Duration of the maintenance window in minutes.
   *
   * @return maintenanceWindowDuration
   */
  @JsonProperty(JSON_PROPERTY_MAINTENANCE_WINDOW_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getMaintenanceWindowDuration() {
    return maintenanceWindowDuration;
  }

  public void setMaintenanceWindowDuration(Long maintenanceWindowDuration) {
    this.maintenanceWindowDuration = maintenanceWindowDuration;
  }

  public FleetScheduleRecurrenceRule startMaintenanceWindow(String startMaintenanceWindow) {
    this.startMaintenanceWindow = startMaintenanceWindow;
    return this;
  }

  /**
   * Start time of the maintenance window in 24-hour clock format (HH:MM). Deployments will be
   * triggered at this time on the specified days.
   *
   * @return startMaintenanceWindow
   */
  @JsonProperty(JSON_PROPERTY_START_MAINTENANCE_WINDOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStartMaintenanceWindow() {
    return startMaintenanceWindow;
  }

  public void setStartMaintenanceWindow(String startMaintenanceWindow) {
    this.startMaintenanceWindow = startMaintenanceWindow;
  }

  public FleetScheduleRecurrenceRule timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Timezone for the schedule in IANA Time Zone Database format (e.g., "America/New_York", "UTC").
   *
   * @return timezone
   */
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return FleetScheduleRecurrenceRule
   */
  @JsonAnySetter
  public FleetScheduleRecurrenceRule putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetScheduleRecurrenceRule object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetScheduleRecurrenceRule fleetScheduleRecurrenceRule = (FleetScheduleRecurrenceRule) o;
    return Objects.equals(this.daysOfWeek, fleetScheduleRecurrenceRule.daysOfWeek)
        && Objects.equals(
            this.maintenanceWindowDuration, fleetScheduleRecurrenceRule.maintenanceWindowDuration)
        && Objects.equals(
            this.startMaintenanceWindow, fleetScheduleRecurrenceRule.startMaintenanceWindow)
        && Objects.equals(this.timezone, fleetScheduleRecurrenceRule.timezone)
        && Objects.equals(
            this.additionalProperties, fleetScheduleRecurrenceRule.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        daysOfWeek,
        maintenanceWindowDuration,
        startMaintenanceWindow,
        timezone,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetScheduleRecurrenceRule {\n");
    sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
    sb.append("    maintenanceWindowDuration: ")
        .append(toIndentedString(maintenanceWindowDuration))
        .append("\n");
    sb.append("    startMaintenanceWindow: ")
        .append(toIndentedString(startMaintenanceWindow))
        .append("\n");
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
