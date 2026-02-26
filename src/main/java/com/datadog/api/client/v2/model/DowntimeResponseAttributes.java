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
   * <p>Downtime details.</p>
 */
@JsonPropertyOrder({
  DowntimeResponseAttributes.JSON_PROPERTY_CANCELED,
  DowntimeResponseAttributes.JSON_PROPERTY_CREATED,
  DowntimeResponseAttributes.JSON_PROPERTY_DISPLAY_TIMEZONE,
  DowntimeResponseAttributes.JSON_PROPERTY_MESSAGE,
  DowntimeResponseAttributes.JSON_PROPERTY_MODIFIED,
  DowntimeResponseAttributes.JSON_PROPERTY_MONITOR_IDENTIFIER,
  DowntimeResponseAttributes.JSON_PROPERTY_MUTE_FIRST_RECOVERY_NOTIFICATION,
  DowntimeResponseAttributes.JSON_PROPERTY_NOTIFY_END_STATES,
  DowntimeResponseAttributes.JSON_PROPERTY_NOTIFY_END_TYPES,
  DowntimeResponseAttributes.JSON_PROPERTY_SCHEDULE,
  DowntimeResponseAttributes.JSON_PROPERTY_SCOPE,
  DowntimeResponseAttributes.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DowntimeResponseAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CANCELED = "canceled";
  private JsonNullable<OffsetDateTime> canceled = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_DISPLAY_TIMEZONE = "display_timezone";
  private JsonNullable<String> displayTimezone = JsonNullable.<String>of("UTC");

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private JsonNullable<String> message = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_MONITOR_IDENTIFIER = "monitor_identifier";
  private DowntimeMonitorIdentifier monitorIdentifier;

  public static final String JSON_PROPERTY_MUTE_FIRST_RECOVERY_NOTIFICATION = "mute_first_recovery_notification";
  private Boolean muteFirstRecoveryNotification;

  public static final String JSON_PROPERTY_NOTIFY_END_STATES = "notify_end_states";
  private List<DowntimeNotifyEndStateTypes> notifyEndStates = null;

  public static final String JSON_PROPERTY_NOTIFY_END_TYPES = "notify_end_types";
  private List<DowntimeNotifyEndStateActions> notifyEndTypes = null;

  public static final String JSON_PROPERTY_SCHEDULE = "schedule";
  private DowntimeScheduleResponse schedule;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_STATUS = "status";
  private DowntimeStatus status;

  public DowntimeResponseAttributes canceled(OffsetDateTime canceled) {
    this.canceled = JsonNullable.<OffsetDateTime>of(canceled);
    return this;
  }

  /**
   * <p>Time that the downtime was canceled.</p>
   * @return canceled
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public OffsetDateTime getCanceled() {
        return canceled.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_CANCELED)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getCanceled_JsonNullable() {
    return canceled;
  }
  @JsonProperty(JSON_PROPERTY_CANCELED)public void setCanceled_JsonNullable(JsonNullable<OffsetDateTime> canceled) {
    this.canceled = canceled;
  }
  public void setCanceled(OffsetDateTime canceled) {
    this.canceled = JsonNullable.<OffsetDateTime>of(canceled);
  }
  public DowntimeResponseAttributes created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * <p>Creation time of the downtime.</p>
   * @return created
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getCreated() {
        return created;
      }
  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }
  public DowntimeResponseAttributes displayTimezone(String displayTimezone) {
    this.displayTimezone = JsonNullable.<String>of(displayTimezone);
    return this;
  }

  /**
   * <p>The timezone in which to display the downtime's start and end times in Datadog applications. This is not used
   * as an offset for scheduling.</p>
   * @return displayTimezone
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getDisplayTimezone() {
        return displayTimezone.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_DISPLAY_TIMEZONE)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDisplayTimezone_JsonNullable() {
    return displayTimezone;
  }
  @JsonProperty(JSON_PROPERTY_DISPLAY_TIMEZONE)public void setDisplayTimezone_JsonNullable(JsonNullable<String> displayTimezone) {
    this.displayTimezone = displayTimezone;
  }
  public void setDisplayTimezone(String displayTimezone) {
    this.displayTimezone = JsonNullable.<String>of(displayTimezone);
  }
  public DowntimeResponseAttributes message(String message) {
    this.message = JsonNullable.<String>of(message);
    return this;
  }

  /**
   * <p>A message to include with notifications for this downtime. Email notifications can be sent to specific users
   * by using the same <code>@username</code> notation as events.</p>
   * @return message
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getMessage() {
        return message.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getMessage_JsonNullable() {
    return message;
  }
  @JsonProperty(JSON_PROPERTY_MESSAGE)public void setMessage_JsonNullable(JsonNullable<String> message) {
    this.message = message;
  }
  public void setMessage(String message) {
    this.message = JsonNullable.<String>of(message);
  }
  public DowntimeResponseAttributes modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

  /**
   * <p>Time that the downtime was last modified.</p>
   * @return modified
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODIFIED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getModified() {
        return modified;
      }
  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }
  public DowntimeResponseAttributes monitorIdentifier(DowntimeMonitorIdentifier monitorIdentifier) {
    this.monitorIdentifier = monitorIdentifier;
    this.unparsed |= monitorIdentifier.unparsed;
    return this;
  }

  /**
   * <p>Monitor identifier for the downtime.</p>
   * @return monitorIdentifier
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MONITOR_IDENTIFIER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public DowntimeMonitorIdentifier getMonitorIdentifier() {
        return monitorIdentifier;
      }
  public void setMonitorIdentifier(DowntimeMonitorIdentifier monitorIdentifier) {
    this.monitorIdentifier = monitorIdentifier;
  }
  public DowntimeResponseAttributes muteFirstRecoveryNotification(Boolean muteFirstRecoveryNotification) {
    this.muteFirstRecoveryNotification = muteFirstRecoveryNotification;
    return this;
  }

  /**
   * <p>If the first recovery notification during a downtime should be muted.</p>
   * @return muteFirstRecoveryNotification
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MUTE_FIRST_RECOVERY_NOTIFICATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getMuteFirstRecoveryNotification() {
        return muteFirstRecoveryNotification;
      }
  public void setMuteFirstRecoveryNotification(Boolean muteFirstRecoveryNotification) {
    this.muteFirstRecoveryNotification = muteFirstRecoveryNotification;
  }
  public DowntimeResponseAttributes notifyEndStates(List<DowntimeNotifyEndStateTypes> notifyEndStates) {
    this.notifyEndStates = notifyEndStates;
    return this;
  }
  public DowntimeResponseAttributes addNotifyEndStatesItem(DowntimeNotifyEndStateTypes notifyEndStatesItem) {
    if (this.notifyEndStates == null) {
      this.notifyEndStates = new ArrayList<>();
    }
    this.notifyEndStates.add(notifyEndStatesItem);
    this.unparsed |= !notifyEndStatesItem.isValid();
    return this;
  }

  /**
   * <p>States that will trigger a monitor notification when the <code>notify_end_types</code> action occurs.</p>
   * @return notifyEndStates
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NOTIFY_END_STATES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<DowntimeNotifyEndStateTypes> getNotifyEndStates() {
        return notifyEndStates;
      }
  public void setNotifyEndStates(List<DowntimeNotifyEndStateTypes> notifyEndStates) {
    this.notifyEndStates = notifyEndStates;
  }
  public DowntimeResponseAttributes notifyEndTypes(List<DowntimeNotifyEndStateActions> notifyEndTypes) {
    this.notifyEndTypes = notifyEndTypes;
    return this;
  }
  public DowntimeResponseAttributes addNotifyEndTypesItem(DowntimeNotifyEndStateActions notifyEndTypesItem) {
    if (this.notifyEndTypes == null) {
      this.notifyEndTypes = new ArrayList<>();
    }
    this.notifyEndTypes.add(notifyEndTypesItem);
    this.unparsed |= !notifyEndTypesItem.isValid();
    return this;
  }

  /**
   * <p>Actions that will trigger a monitor notification if the downtime is in the <code>notify_end_types</code> state.</p>
   * @return notifyEndTypes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NOTIFY_END_TYPES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<DowntimeNotifyEndStateActions> getNotifyEndTypes() {
        return notifyEndTypes;
      }
  public void setNotifyEndTypes(List<DowntimeNotifyEndStateActions> notifyEndTypes) {
    this.notifyEndTypes = notifyEndTypes;
  }
  public DowntimeResponseAttributes schedule(DowntimeScheduleResponse schedule) {
    this.schedule = schedule;
    this.unparsed |= schedule.unparsed;
    return this;
  }

  /**
   * <p>The schedule that defines when the monitor starts, stops, and recurs. There are two types of schedules:
   * one-time and recurring. Recurring schedules may have up to five RRULE-based recurrences. If no schedules are
   * provided, the downtime will begin immediately and never end.</p>
   * @return schedule
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SCHEDULE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public DowntimeScheduleResponse getSchedule() {
        return schedule;
      }
  public void setSchedule(DowntimeScheduleResponse schedule) {
    this.schedule = schedule;
  }
  public DowntimeResponseAttributes scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * <p>The scope to which the downtime applies. Must follow the <a href="https://docs.datadoghq.com/logs/explorer/search_syntax/">common search syntax</a>.</p>
   * @return scope
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SCOPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getScope() {
        return scope;
      }
  public void setScope(String scope) {
    this.scope = scope;
  }
  public DowntimeResponseAttributes status(DowntimeStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * <p>The current status of the downtime.</p>
   * @return status
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public DowntimeStatus getStatus() {
        return status;
      }
  public void setStatus(DowntimeStatus status) {
    if (!status.isValid()) {
        this.unparsed = true;
    }
    this.status = status;
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
   * @return DowntimeResponseAttributes
   */
  @JsonAnySetter
  public DowntimeResponseAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this DowntimeResponseAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowntimeResponseAttributes downtimeResponseAttributes = (DowntimeResponseAttributes) o;
    return Objects.equals(this.canceled, downtimeResponseAttributes.canceled) && Objects.equals(this.created, downtimeResponseAttributes.created) && Objects.equals(this.displayTimezone, downtimeResponseAttributes.displayTimezone) && Objects.equals(this.message, downtimeResponseAttributes.message) && Objects.equals(this.modified, downtimeResponseAttributes.modified) && Objects.equals(this.monitorIdentifier, downtimeResponseAttributes.monitorIdentifier) && Objects.equals(this.muteFirstRecoveryNotification, downtimeResponseAttributes.muteFirstRecoveryNotification) && Objects.equals(this.notifyEndStates, downtimeResponseAttributes.notifyEndStates) && Objects.equals(this.notifyEndTypes, downtimeResponseAttributes.notifyEndTypes) && Objects.equals(this.schedule, downtimeResponseAttributes.schedule) && Objects.equals(this.scope, downtimeResponseAttributes.scope) && Objects.equals(this.status, downtimeResponseAttributes.status) && Objects.equals(this.additionalProperties, downtimeResponseAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(canceled,created,displayTimezone,message,modified,monitorIdentifier,muteFirstRecoveryNotification,notifyEndStates,notifyEndTypes,schedule,scope,status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowntimeResponseAttributes {\n");
    sb.append("    canceled: ").append(toIndentedString(canceled)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    displayTimezone: ").append(toIndentedString(displayTimezone)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    monitorIdentifier: ").append(toIndentedString(monitorIdentifier)).append("\n");
    sb.append("    muteFirstRecoveryNotification: ").append(toIndentedString(muteFirstRecoveryNotification)).append("\n");
    sb.append("    notifyEndStates: ").append(toIndentedString(notifyEndStates)).append("\n");
    sb.append("    notifyEndTypes: ").append(toIndentedString(notifyEndTypes)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
