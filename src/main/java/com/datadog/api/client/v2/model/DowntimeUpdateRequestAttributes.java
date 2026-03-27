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
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of the downtime to update. */
@JsonPropertyOrder({
  DowntimeUpdateRequestAttributes.JSON_PROPERTY_DISPLAY_TIMEZONE,
  DowntimeUpdateRequestAttributes.JSON_PROPERTY_MESSAGE,
  DowntimeUpdateRequestAttributes.JSON_PROPERTY_MONITOR_IDENTIFIER,
  DowntimeUpdateRequestAttributes.JSON_PROPERTY_MUTE_FIRST_RECOVERY_NOTIFICATION,
  DowntimeUpdateRequestAttributes.JSON_PROPERTY_NOTIFY_END_STATES,
  DowntimeUpdateRequestAttributes.JSON_PROPERTY_NOTIFY_END_TYPES,
  DowntimeUpdateRequestAttributes.JSON_PROPERTY_SCHEDULE,
  DowntimeUpdateRequestAttributes.JSON_PROPERTY_SCOPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DowntimeUpdateRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISPLAY_TIMEZONE = "display_timezone";
  private JsonNullable<String> displayTimezone = JsonNullable.<String>of("UTC");

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private JsonNullable<String> message = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MONITOR_IDENTIFIER = "monitor_identifier";
  private DowntimeMonitorIdentifier monitorIdentifier;

  public static final String JSON_PROPERTY_MUTE_FIRST_RECOVERY_NOTIFICATION =
      "mute_first_recovery_notification";
  private Boolean muteFirstRecoveryNotification;

  public static final String JSON_PROPERTY_NOTIFY_END_STATES = "notify_end_states";
  private List<DowntimeNotifyEndStateTypes> notifyEndStates = null;

  public static final String JSON_PROPERTY_NOTIFY_END_TYPES = "notify_end_types";
  private List<DowntimeNotifyEndStateActions> notifyEndTypes = null;

  public static final String JSON_PROPERTY_SCHEDULE = "schedule";
  private DowntimeScheduleUpdateRequest schedule;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public DowntimeUpdateRequestAttributes displayTimezone(String displayTimezone) {
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

  public DowntimeUpdateRequestAttributes message(String message) {
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

  public DowntimeUpdateRequestAttributes monitorIdentifier(
      DowntimeMonitorIdentifier monitorIdentifier) {
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
  public DowntimeMonitorIdentifier getMonitorIdentifier() {
    return monitorIdentifier;
  }

  public void setMonitorIdentifier(DowntimeMonitorIdentifier monitorIdentifier) {
    this.monitorIdentifier = monitorIdentifier;
  }

  public DowntimeUpdateRequestAttributes muteFirstRecoveryNotification(
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

  public DowntimeUpdateRequestAttributes notifyEndStates(
      List<DowntimeNotifyEndStateTypes> notifyEndStates) {
    this.notifyEndStates = notifyEndStates;
    return this;
  }

  public DowntimeUpdateRequestAttributes addNotifyEndStatesItem(
      DowntimeNotifyEndStateTypes notifyEndStatesItem) {
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
  public List<DowntimeNotifyEndStateTypes> getNotifyEndStates() {
    return notifyEndStates;
  }

  public void setNotifyEndStates(List<DowntimeNotifyEndStateTypes> notifyEndStates) {
    this.notifyEndStates = notifyEndStates;
  }

  public DowntimeUpdateRequestAttributes notifyEndTypes(
      List<DowntimeNotifyEndStateActions> notifyEndTypes) {
    this.notifyEndTypes = notifyEndTypes;
    return this;
  }

  public DowntimeUpdateRequestAttributes addNotifyEndTypesItem(
      DowntimeNotifyEndStateActions notifyEndTypesItem) {
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
  public List<DowntimeNotifyEndStateActions> getNotifyEndTypes() {
    return notifyEndTypes;
  }

  public void setNotifyEndTypes(List<DowntimeNotifyEndStateActions> notifyEndTypes) {
    this.notifyEndTypes = notifyEndTypes;
  }

  public DowntimeUpdateRequestAttributes schedule(DowntimeScheduleUpdateRequest schedule) {
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
  public DowntimeScheduleUpdateRequest getSchedule() {
    return schedule;
  }

  public void setSchedule(DowntimeScheduleUpdateRequest schedule) {
    this.schedule = schedule;
  }

  public DowntimeUpdateRequestAttributes scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * The scope to which the downtime applies. Must follow the <a
   * href="https://docs.datadoghq.com/logs/explorer/search_syntax/">common search syntax</a>.
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
   * @return DowntimeUpdateRequestAttributes
   */
  @JsonAnySetter
  public DowntimeUpdateRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DowntimeUpdateRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowntimeUpdateRequestAttributes downtimeUpdateRequestAttributes =
        (DowntimeUpdateRequestAttributes) o;
    return Objects.equals(this.displayTimezone, downtimeUpdateRequestAttributes.displayTimezone)
        && Objects.equals(this.message, downtimeUpdateRequestAttributes.message)
        && Objects.equals(this.monitorIdentifier, downtimeUpdateRequestAttributes.monitorIdentifier)
        && Objects.equals(
            this.muteFirstRecoveryNotification,
            downtimeUpdateRequestAttributes.muteFirstRecoveryNotification)
        && Objects.equals(this.notifyEndStates, downtimeUpdateRequestAttributes.notifyEndStates)
        && Objects.equals(this.notifyEndTypes, downtimeUpdateRequestAttributes.notifyEndTypes)
        && Objects.equals(this.schedule, downtimeUpdateRequestAttributes.schedule)
        && Objects.equals(this.scope, downtimeUpdateRequestAttributes.scope)
        && Objects.equals(
            this.additionalProperties, downtimeUpdateRequestAttributes.additionalProperties);
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
        scope,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowntimeUpdateRequestAttributes {\n");
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
