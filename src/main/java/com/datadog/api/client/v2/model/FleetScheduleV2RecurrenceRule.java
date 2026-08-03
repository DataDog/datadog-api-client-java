/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Defines the recurrence pattern for the schedule.</p>
 */
@JsonPropertyOrder({
  FleetScheduleV2RecurrenceRule.JSON_PROPERTY_DAYS_OF_WEEK,
  FleetScheduleV2RecurrenceRule.JSON_PROPERTY_INTERVAL,
  FleetScheduleV2RecurrenceRule.JSON_PROPERTY_MAINTENANCE_WINDOW_DURATION,
  FleetScheduleV2RecurrenceRule.JSON_PROPERTY_START_MAINTENANCE_WINDOW,
  FleetScheduleV2RecurrenceRule.JSON_PROPERTY_TIMEZONE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetScheduleV2RecurrenceRule {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DAYS_OF_WEEK = "days_of_week";
  private List<String> daysOfWeek = null;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private Long interval;

  public static final String JSON_PROPERTY_MAINTENANCE_WINDOW_DURATION = "maintenance_window_duration";
  private Long maintenanceWindowDuration;

  public static final String JSON_PROPERTY_START_MAINTENANCE_WINDOW = "start_maintenance_window";
  private String startMaintenanceWindow;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public FleetScheduleV2RecurrenceRule daysOfWeek(List<String> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }
  public FleetScheduleV2RecurrenceRule addDaysOfWeekItem(String daysOfWeekItem) {
    if (this.daysOfWeek == null) {
      this.daysOfWeek = new ArrayList<>();
    }
    this.daysOfWeek.add(daysOfWeekItem);
    return this;
  }

  /**
   * <p>Days of the week when the schedule triggers. Valid values are
   * "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun".</p>
   * @return daysOfWeek
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DAYS_OF_WEEK)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getDaysOfWeek() {
        return daysOfWeek;
      }
  public void setDaysOfWeek(List<String> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }
  public FleetScheduleV2RecurrenceRule interval(Long interval) {
    this.interval = interval;
    return this;
  }

  /**
   * <p>Interval between schedule runs in weeks. 1 means the schedule runs every week
   * on the specified days. Higher values repeat every N weeks.</p>
   * @return interval
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INTERVAL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getInterval() {
        return interval;
      }
  public void setInterval(Long interval) {
    this.interval = interval;
  }
  public FleetScheduleV2RecurrenceRule maintenanceWindowDuration(Long maintenanceWindowDuration) {
    this.maintenanceWindowDuration = maintenanceWindowDuration;
    return this;
  }

  /**
   * <p>Duration of the maintenance window in minutes.</p>
   * @return maintenanceWindowDuration
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MAINTENANCE_WINDOW_DURATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getMaintenanceWindowDuration() {
        return maintenanceWindowDuration;
      }
  public void setMaintenanceWindowDuration(Long maintenanceWindowDuration) {
    this.maintenanceWindowDuration = maintenanceWindowDuration;
  }
  public FleetScheduleV2RecurrenceRule startMaintenanceWindow(String startMaintenanceWindow) {
    this.startMaintenanceWindow = startMaintenanceWindow;
    return this;
  }

  /**
   * <p>Start time of the maintenance window in 24-hour clock format (HH:MM).
   * Deployments are triggered at this time on the specified days.</p>
   * @return startMaintenanceWindow
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_START_MAINTENANCE_WINDOW)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getStartMaintenanceWindow() {
        return startMaintenanceWindow;
      }
  public void setStartMaintenanceWindow(String startMaintenanceWindow) {
    this.startMaintenanceWindow = startMaintenanceWindow;
  }
  public FleetScheduleV2RecurrenceRule timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * <p>Timezone in IANA Time Zone Database format.</p>
   * @return timezone
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIMEZONE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTimezone() {
        return timezone;
      }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return FleetScheduleV2RecurrenceRule
   */
  @JsonAnySetter
  public FleetScheduleV2RecurrenceRule putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this FleetScheduleV2RecurrenceRule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetScheduleV2RecurrenceRule fleetScheduleV2RecurrenceRule = (FleetScheduleV2RecurrenceRule) o;
    return Objects.equals(this.daysOfWeek, fleetScheduleV2RecurrenceRule.daysOfWeek) && Objects.equals(this.interval, fleetScheduleV2RecurrenceRule.interval) && Objects.equals(this.maintenanceWindowDuration, fleetScheduleV2RecurrenceRule.maintenanceWindowDuration) && Objects.equals(this.startMaintenanceWindow, fleetScheduleV2RecurrenceRule.startMaintenanceWindow) && Objects.equals(this.timezone, fleetScheduleV2RecurrenceRule.timezone) && Objects.equals(this.additionalProperties, fleetScheduleV2RecurrenceRule.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(daysOfWeek,interval,maintenanceWindowDuration,startMaintenanceWindow,timezone, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetScheduleV2RecurrenceRule {\n");
    sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    maintenanceWindowDuration: ").append(toIndentedString(maintenanceWindowDuration)).append("\n");
    sb.append("    startMaintenanceWindow: ").append(toIndentedString(startMaintenanceWindow)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
