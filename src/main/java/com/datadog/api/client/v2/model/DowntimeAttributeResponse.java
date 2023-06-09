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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Downtime details. */
@JsonPropertyOrder({
  DowntimeAttributeResponse.JSON_PROPERTY_CREATED_AT,
  DowntimeAttributeResponse.JSON_PROPERTY_DISPLAY_TIMEZONE,
  DowntimeAttributeResponse.JSON_PROPERTY_MESSAGE,
  DowntimeAttributeResponse.JSON_PROPERTY_MODIFIED_AT,
  DowntimeAttributeResponse.JSON_PROPERTY_MONITOR_IDENTIFIER,
  DowntimeAttributeResponse.JSON_PROPERTY_MUTE_FIRST_RECOVERY_NOTIFICATION,
  DowntimeAttributeResponse.JSON_PROPERTY_NOTIFY_END_STATES,
  DowntimeAttributeResponse.JSON_PROPERTY_NOTIFY_END_TYPES,
  DowntimeAttributeResponse.JSON_PROPERTY_SCHEDULE,
  DowntimeAttributeResponse.JSON_PROPERTY_SCOPE,
  DowntimeAttributeResponse.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DowntimeAttributeResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DISPLAY_TIMEZONE = "display_timezone";
  private JsonNullable<String> displayTimezone = JsonNullable.<String>of("UTC");

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private JsonNullable<String> message = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

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
  private DowntimeAttributeScheduleResponse schedule;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_STATUS = "status";
  private DowntimeStatusEnum status;

  public DowntimeAttributeResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation time of the downtime.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public DowntimeAttributeResponse displayTimezone(String displayTimezone) {
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

  public DowntimeAttributeResponse message(String message) {
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

  public DowntimeAttributeResponse modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Time that the downtime was last modified.
   *
   * @return modifiedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public DowntimeAttributeResponse monitorIdentifier(
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DowntimeAttributeMonitorIdentifier getMonitorIdentifier() {
    return monitorIdentifier;
  }

  public void setMonitorIdentifier(DowntimeAttributeMonitorIdentifier monitorIdentifier) {
    this.monitorIdentifier = monitorIdentifier;
  }

  public DowntimeAttributeResponse muteFirstRecoveryNotification(
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

  public DowntimeAttributeResponse notifyEndStates(
      List<DowntimeAttributeNotifyEndStateTypes> notifyEndStates) {
    this.notifyEndStates = notifyEndStates;
    return this;
  }

  public DowntimeAttributeResponse addNotifyEndStatesItem(
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

  public DowntimeAttributeResponse notifyEndTypes(
      List<DowntimeAttributeNotifyEndStateActions> notifyEndTypes) {
    this.notifyEndTypes = notifyEndTypes;
    return this;
  }

  public DowntimeAttributeResponse addNotifyEndTypesItem(
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

  public DowntimeAttributeResponse schedule(DowntimeAttributeScheduleResponse schedule) {
    this.schedule = schedule;
    this.unparsed |= schedule.unparsed;
    return this;
  }

  /**
   * The schedule that defines when the monitor starts, stops, and recurs. There are two types of
   * schedules: one-time and recurring. Recurring schedules may have up to five RRULE-based
   * recurrences. If no schedules is provided, the downtime will begin immediately and never end.
   *
   * @return schedule
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DowntimeAttributeScheduleResponse getSchedule() {
    return schedule;
  }

  public void setSchedule(DowntimeAttributeScheduleResponse schedule) {
    this.schedule = schedule;
  }

  public DowntimeAttributeResponse scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * The scope to which the downtime applies. Must be in <a
   * href="https://docs.datadoghq.com/logs/explorer/search_syntax/">simple grammar syntax</a>.
   *
   * @return scope
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public DowntimeAttributeResponse status(DowntimeStatusEnum status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The current status of the downtime.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DowntimeStatusEnum getStatus() {
    return status;
  }

  public void setStatus(DowntimeStatusEnum status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  /** Return true if this DowntimeAttributeResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowntimeAttributeResponse downtimeAttributeResponse = (DowntimeAttributeResponse) o;
    return Objects.equals(this.createdAt, downtimeAttributeResponse.createdAt)
        && Objects.equals(this.displayTimezone, downtimeAttributeResponse.displayTimezone)
        && Objects.equals(this.message, downtimeAttributeResponse.message)
        && Objects.equals(this.modifiedAt, downtimeAttributeResponse.modifiedAt)
        && Objects.equals(this.monitorIdentifier, downtimeAttributeResponse.monitorIdentifier)
        && Objects.equals(
            this.muteFirstRecoveryNotification,
            downtimeAttributeResponse.muteFirstRecoveryNotification)
        && Objects.equals(this.notifyEndStates, downtimeAttributeResponse.notifyEndStates)
        && Objects.equals(this.notifyEndTypes, downtimeAttributeResponse.notifyEndTypes)
        && Objects.equals(this.schedule, downtimeAttributeResponse.schedule)
        && Objects.equals(this.scope, downtimeAttributeResponse.scope)
        && Objects.equals(this.status, downtimeAttributeResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        displayTimezone,
        message,
        modifiedAt,
        monitorIdentifier,
        muteFirstRecoveryNotification,
        notifyEndStates,
        notifyEndTypes,
        schedule,
        scope,
        status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowntimeAttributeResponse {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    displayTimezone: ").append(toIndentedString(displayTimezone)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    monitorIdentifier: ").append(toIndentedString(monitorIdentifier)).append("\n");
    sb.append("    muteFirstRecoveryNotification: ")
        .append(toIndentedString(muteFirstRecoveryNotification))
        .append("\n");
    sb.append("    notifyEndStates: ").append(toIndentedString(notifyEndStates)).append("\n");
    sb.append("    notifyEndTypes: ").append(toIndentedString(notifyEndTypes)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
