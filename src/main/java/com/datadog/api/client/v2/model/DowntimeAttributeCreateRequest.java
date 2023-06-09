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
import org.openapitools.jackson.nullable.JsonNullable;

/** Downtime details. */
@JsonPropertyOrder({
  DowntimeAttributeCreateRequest.JSON_PROPERTY_DISPLAY_TIMEZONE,
  DowntimeAttributeCreateRequest.JSON_PROPERTY_MESSAGE,
  DowntimeAttributeCreateRequest.JSON_PROPERTY_MONITOR_IDENTIFIER,
  DowntimeAttributeCreateRequest.JSON_PROPERTY_MUTE_FIRST_RECOVERY_NOTIFICATION,
  DowntimeAttributeCreateRequest.JSON_PROPERTY_NOTIFY_END_STATES,
  DowntimeAttributeCreateRequest.JSON_PROPERTY_NOTIFY_END_TYPES,
  DowntimeAttributeCreateRequest.JSON_PROPERTY_SCHEDULE,
  DowntimeAttributeCreateRequest.JSON_PROPERTY_SCOPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DowntimeAttributeCreateRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISPLAY_TIMEZONE = "display_timezone";
  private JsonNullable<String> displayTimezone = JsonNullable.<String>of("UTC");

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private JsonNullable<String> message = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MONITOR_IDENTIFIER = "monitor_identifier";
  private DowntimeAttributeMonitorIdentifier monitorIdentifier;

  public static final String JSON_PROPERTY_MUTE_FIRST_RECOVERY_NOTIFICATION =
      "mute_first_recovery_notification";
  private Boolean muteFirstRecoveryNotification;

  public static final String JSON_PROPERTY_NOTIFY_END_STATES = "notify_end_states";
  private List<DowntimeAttributeNotifyEndStateTypes> notifyEndStates = null;

  public static final String JSON_PROPERTY_NOTIFY_END_TYPES = "notify_end_types";
  private List<DowntimeAttributeNotifyEndStateActions> notifyEndTypes = null;

  public static final String JSON_PROPERTY_SCHEDULE = "schedule";
  private DowntimeAttributeScheduleCreateRequest schedule;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public DowntimeAttributeCreateRequest() {}

  @JsonCreator
  public DowntimeAttributeCreateRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_MONITOR_IDENTIFIER)
          DowntimeAttributeMonitorIdentifier monitorIdentifier,
      @JsonProperty(required = true, value = JSON_PROPERTY_SCOPE) String scope) {
    this.monitorIdentifier = monitorIdentifier;
    this.unparsed |= monitorIdentifier.unparsed;
    this.scope = scope;
  }

  public DowntimeAttributeCreateRequest displayTimezone(String displayTimezone) {
    this.displayTimezone = JsonNullable.<String>of(displayTimezone);
    return this;
  }

  /**
   * The timezone in which to display the downtime's start and end times in Datadog applications.
   * This is not used as an offset for scheduling.
   *
   * @return displayTimezone
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDisplayTimezone() {
    return displayTimezone.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISPLAY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDisplayTimezone_JsonNullable() {
    return displayTimezone;
  }

  @JsonProperty(JSON_PROPERTY_DISPLAY_TIMEZONE)
  public void setDisplayTimezone_JsonNullable(JsonNullable<String> displayTimezone) {
    this.displayTimezone = displayTimezone;
  }

  public void setDisplayTimezone(String displayTimezone) {
    this.displayTimezone = JsonNullable.<String>of(displayTimezone);
  }

  public DowntimeAttributeCreateRequest message(String message) {
    this.message = JsonNullable.<String>of(message);
    return this;
  }

  /**
   * A message to include with notifications for this downtime. Email notifications can be sent to
   * specific users by using the same <code>@username</code> notation as events.
   *
   * @return message
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getMessage() {
    return message.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getMessage_JsonNullable() {
    return message;
  }

  @JsonProperty(JSON_PROPERTY_MESSAGE)
  public void setMessage_JsonNullable(JsonNullable<String> message) {
    this.message = message;
  }

  public void setMessage(String message) {
    this.message = JsonNullable.<String>of(message);
  }

  public DowntimeAttributeCreateRequest monitorIdentifier(
      DowntimeAttributeMonitorIdentifier monitorIdentifier) {
    this.monitorIdentifier = monitorIdentifier;
    this.unparsed |= monitorIdentifier.unparsed;
    return this;
  }

  /**
   * Monitor identifier for the downtime.
   *
   * @return monitorIdentifier
   */
  @JsonProperty(JSON_PROPERTY_MONITOR_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DowntimeAttributeMonitorIdentifier getMonitorIdentifier() {
    return monitorIdentifier;
  }

  public void setMonitorIdentifier(DowntimeAttributeMonitorIdentifier monitorIdentifier) {
    this.monitorIdentifier = monitorIdentifier;
  }

  public DowntimeAttributeCreateRequest muteFirstRecoveryNotification(
      Boolean muteFirstRecoveryNotification) {
    this.muteFirstRecoveryNotification = muteFirstRecoveryNotification;
    return this;
  }

  /**
   * If the first recovery notification during a downtime should be muted.
   *
   * @return muteFirstRecoveryNotification
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MUTE_FIRST_RECOVERY_NOTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getMuteFirstRecoveryNotification() {
    return muteFirstRecoveryNotification;
  }

  public void setMuteFirstRecoveryNotification(Boolean muteFirstRecoveryNotification) {
    this.muteFirstRecoveryNotification = muteFirstRecoveryNotification;
  }

  public DowntimeAttributeCreateRequest notifyEndStates(
      List<DowntimeAttributeNotifyEndStateTypes> notifyEndStates) {
    this.notifyEndStates = notifyEndStates;
    return this;
  }

  public DowntimeAttributeCreateRequest addNotifyEndStatesItem(
      DowntimeAttributeNotifyEndStateTypes notifyEndStatesItem) {
    if (this.notifyEndStates == null) {
      this.notifyEndStates = new ArrayList<>();
    }
    this.notifyEndStates.add(notifyEndStatesItem);
    this.unparsed |= !notifyEndStatesItem.isValid();
    return this;
  }

  /**
   * States that will trigger a monitor notification when the <code>notify_end_types</code> action
   * occurs.
   *
   * @return notifyEndStates
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFY_END_STATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DowntimeAttributeNotifyEndStateTypes> getNotifyEndStates() {
    return notifyEndStates;
  }

  public void setNotifyEndStates(List<DowntimeAttributeNotifyEndStateTypes> notifyEndStates) {
    this.notifyEndStates = notifyEndStates;
  }

  public DowntimeAttributeCreateRequest notifyEndTypes(
      List<DowntimeAttributeNotifyEndStateActions> notifyEndTypes) {
    this.notifyEndTypes = notifyEndTypes;
    return this;
  }

  public DowntimeAttributeCreateRequest addNotifyEndTypesItem(
      DowntimeAttributeNotifyEndStateActions notifyEndTypesItem) {
    if (this.notifyEndTypes == null) {
      this.notifyEndTypes = new ArrayList<>();
    }
    this.notifyEndTypes.add(notifyEndTypesItem);
    this.unparsed |= !notifyEndTypesItem.isValid();
    return this;
  }

  /**
   * Actions that will trigger a monitor notification if the downtime is in the <code>
   * notify_end_types</code> state.
   *
   * @return notifyEndTypes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFY_END_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DowntimeAttributeNotifyEndStateActions> getNotifyEndTypes() {
    return notifyEndTypes;
  }

  public void setNotifyEndTypes(List<DowntimeAttributeNotifyEndStateActions> notifyEndTypes) {
    this.notifyEndTypes = notifyEndTypes;
  }

  public DowntimeAttributeCreateRequest schedule(DowntimeAttributeScheduleCreateRequest schedule) {
    this.schedule = schedule;
    this.unparsed |= schedule.unparsed;
    return this;
  }

  /**
   * Schedule for the downtime.
   *
   * @return schedule
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DowntimeAttributeScheduleCreateRequest getSchedule() {
    return schedule;
  }

  public void setSchedule(DowntimeAttributeScheduleCreateRequest schedule) {
    this.schedule = schedule;
  }

  public DowntimeAttributeCreateRequest scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * The scope to which the downtime applies. Must be in <a
   * href="https://docs.datadoghq.com/logs/explorer/search_syntax/">simple grammar syntax</a>.
   *
   * @return scope
   */
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  /** Return true if this DowntimeAttributeCreateRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowntimeAttributeCreateRequest downtimeAttributeCreateRequest =
        (DowntimeAttributeCreateRequest) o;
    return Objects.equals(this.displayTimezone, downtimeAttributeCreateRequest.displayTimezone)
        && Objects.equals(this.message, downtimeAttributeCreateRequest.message)
        && Objects.equals(this.monitorIdentifier, downtimeAttributeCreateRequest.monitorIdentifier)
        && Objects.equals(
            this.muteFirstRecoveryNotification,
            downtimeAttributeCreateRequest.muteFirstRecoveryNotification)
        && Objects.equals(this.notifyEndStates, downtimeAttributeCreateRequest.notifyEndStates)
        && Objects.equals(this.notifyEndTypes, downtimeAttributeCreateRequest.notifyEndTypes)
        && Objects.equals(this.schedule, downtimeAttributeCreateRequest.schedule)
        && Objects.equals(this.scope, downtimeAttributeCreateRequest.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        displayTimezone,
        message,
        monitorIdentifier,
        muteFirstRecoveryNotification,
        notifyEndStates,
        notifyEndTypes,
        schedule,
        scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowntimeAttributeCreateRequest {\n");
    sb.append("    displayTimezone: ").append(toIndentedString(displayTimezone)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    monitorIdentifier: ").append(toIndentedString(monitorIdentifier)).append("\n");
    sb.append("    muteFirstRecoveryNotification: ")
        .append(toIndentedString(muteFirstRecoveryNotification))
        .append("\n");
    sb.append("    notifyEndStates: ").append(toIndentedString(notifyEndStates)).append("\n");
    sb.append("    notifyEndTypes: ").append(toIndentedString(notifyEndTypes)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
