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
  DowntimeCreateRequestAttributes.JSON_PROPERTY_DISPLAY_TIMEZONE,
  DowntimeCreateRequestAttributes.JSON_PROPERTY_MESSAGE,
  DowntimeCreateRequestAttributes.JSON_PROPERTY_MONITOR_IDENTIFIER,
  DowntimeCreateRequestAttributes.JSON_PROPERTY_MUTE_FIRST_RECOVERY_NOTIFICATION,
  DowntimeCreateRequestAttributes.JSON_PROPERTY_NOTIFY_END_STATES,
  DowntimeCreateRequestAttributes.JSON_PROPERTY_NOTIFY_END_TYPES,
  DowntimeCreateRequestAttributes.JSON_PROPERTY_SCHEDULE,
  DowntimeCreateRequestAttributes.JSON_PROPERTY_SCOPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DowntimeCreateRequestAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISPLAY_TIMEZONE = "display_timezone";
  private JsonNullable<String> displayTimezone = JsonNullable.<String>of("UTC");

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private JsonNullable<String> message = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MONITOR_IDENTIFIER = "monitor_identifier";
  private DowntimeMonitorIdentifier monitorIdentifier;

  public static final String JSON_PROPERTY_MUTE_FIRST_RECOVERY_NOTIFICATION = "mute_first_recovery_notification";
  private Boolean muteFirstRecoveryNotification;

  public static final String JSON_PROPERTY_NOTIFY_END_STATES = "notify_end_states";
  private List<DowntimeNotifyEndStateTypes> notifyEndStates = null;

  public static final String JSON_PROPERTY_NOTIFY_END_TYPES = "notify_end_types";
  private List<DowntimeNotifyEndStateActions> notifyEndTypes = null;

  public static final String JSON_PROPERTY_SCHEDULE = "schedule";
  private DowntimeScheduleCreateRequest schedule;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public DowntimeCreateRequestAttributes() {}

  @JsonCreator
  public DowntimeCreateRequestAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_MONITOR_IDENTIFIER)DowntimeMonitorIdentifier monitorIdentifier,
            @JsonProperty(required=true, value=JSON_PROPERTY_SCOPE)String scope) {
        this.monitorIdentifier = monitorIdentifier;
        this.unparsed |= monitorIdentifier.unparsed;
        this.scope = scope;
  }
  public DowntimeCreateRequestAttributes displayTimezone(String displayTimezone) {
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
  public DowntimeCreateRequestAttributes message(String message) {
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
  public DowntimeCreateRequestAttributes monitorIdentifier(DowntimeMonitorIdentifier monitorIdentifier) {
    this.monitorIdentifier = monitorIdentifier;
    this.unparsed |= monitorIdentifier.unparsed;
    return this;
  }

  /**
   * <p>Monitor identifier for the downtime.</p>
   * @return monitorIdentifier
  **/
      @JsonProperty(JSON_PROPERTY_MONITOR_IDENTIFIER)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public DowntimeMonitorIdentifier getMonitorIdentifier() {
        return monitorIdentifier;
      }
  public void setMonitorIdentifier(DowntimeMonitorIdentifier monitorIdentifier) {
    this.monitorIdentifier = monitorIdentifier;
  }
  public DowntimeCreateRequestAttributes muteFirstRecoveryNotification(Boolean muteFirstRecoveryNotification) {
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
  public DowntimeCreateRequestAttributes notifyEndStates(List<DowntimeNotifyEndStateTypes> notifyEndStates) {
    this.notifyEndStates = notifyEndStates;
    return this;
  }
  public DowntimeCreateRequestAttributes addNotifyEndStatesItem(DowntimeNotifyEndStateTypes notifyEndStatesItem) {
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
  public DowntimeCreateRequestAttributes notifyEndTypes(List<DowntimeNotifyEndStateActions> notifyEndTypes) {
    this.notifyEndTypes = notifyEndTypes;
    return this;
  }
  public DowntimeCreateRequestAttributes addNotifyEndTypesItem(DowntimeNotifyEndStateActions notifyEndTypesItem) {
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
  public DowntimeCreateRequestAttributes schedule(DowntimeScheduleCreateRequest schedule) {
    this.schedule = schedule;
    this.unparsed |= schedule.unparsed;
    return this;
  }

  /**
   * <p>Schedule for the downtime.</p>
   * @return schedule
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SCHEDULE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public DowntimeScheduleCreateRequest getSchedule() {
        return schedule;
      }
  public void setSchedule(DowntimeScheduleCreateRequest schedule) {
    this.schedule = schedule;
  }
  public DowntimeCreateRequestAttributes scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * <p>The scope to which the downtime applies. Must follow the <a href="https://docs.datadoghq.com/logs/explorer/search_syntax/">common search syntax</a>.</p>
   * @return scope
  **/
      @JsonProperty(JSON_PROPERTY_SCOPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getScope() {
        return scope;
      }
  public void setScope(String scope) {
    this.scope = scope;
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
   * @return DowntimeCreateRequestAttributes
   */
  @JsonAnySetter
  public DowntimeCreateRequestAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this DowntimeCreateRequestAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowntimeCreateRequestAttributes downtimeCreateRequestAttributes = (DowntimeCreateRequestAttributes) o;
    return Objects.equals(this.displayTimezone, downtimeCreateRequestAttributes.displayTimezone) && Objects.equals(this.message, downtimeCreateRequestAttributes.message) && Objects.equals(this.monitorIdentifier, downtimeCreateRequestAttributes.monitorIdentifier) && Objects.equals(this.muteFirstRecoveryNotification, downtimeCreateRequestAttributes.muteFirstRecoveryNotification) && Objects.equals(this.notifyEndStates, downtimeCreateRequestAttributes.notifyEndStates) && Objects.equals(this.notifyEndTypes, downtimeCreateRequestAttributes.notifyEndTypes) && Objects.equals(this.schedule, downtimeCreateRequestAttributes.schedule) && Objects.equals(this.scope, downtimeCreateRequestAttributes.scope) && Objects.equals(this.additionalProperties, downtimeCreateRequestAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(displayTimezone,message,monitorIdentifier,muteFirstRecoveryNotification,notifyEndStates,notifyEndTypes,schedule,scope, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowntimeCreateRequestAttributes {\n");
    sb.append("    displayTimezone: ").append(toIndentedString(displayTimezone)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    monitorIdentifier: ").append(toIndentedString(monitorIdentifier)).append("\n");
    sb.append("    muteFirstRecoveryNotification: ").append(toIndentedString(muteFirstRecoveryNotification)).append("\n");
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
