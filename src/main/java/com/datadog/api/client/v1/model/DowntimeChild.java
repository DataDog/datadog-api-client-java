/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/**
 * The downtime object definition of the active child for the original parent recurring downtime.
 * This field will only exist on recurring downtimes.
 */
@JsonPropertyOrder({
  DowntimeChild.JSON_PROPERTY_ACTIVE,
  DowntimeChild.JSON_PROPERTY_CANCELED,
  DowntimeChild.JSON_PROPERTY_CREATOR_ID,
  DowntimeChild.JSON_PROPERTY_DISABLED,
  DowntimeChild.JSON_PROPERTY_DOWNTIME_TYPE,
  DowntimeChild.JSON_PROPERTY_END,
  DowntimeChild.JSON_PROPERTY_ID,
  DowntimeChild.JSON_PROPERTY_MESSAGE,
  DowntimeChild.JSON_PROPERTY_MONITOR_ID,
  DowntimeChild.JSON_PROPERTY_MONITOR_TAGS,
  DowntimeChild.JSON_PROPERTY_MUTE_FIRST_RECOVERY_NOTIFICATION,
  DowntimeChild.JSON_PROPERTY_NOTIFY_END_STATES,
  DowntimeChild.JSON_PROPERTY_NOTIFY_END_TYPES,
  DowntimeChild.JSON_PROPERTY_PARENT_ID,
  DowntimeChild.JSON_PROPERTY_RECURRENCE,
  DowntimeChild.JSON_PROPERTY_SCOPE,
  DowntimeChild.JSON_PROPERTY_START,
  DowntimeChild.JSON_PROPERTY_TIMEZONE,
  DowntimeChild.JSON_PROPERTY_UPDATER_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DowntimeChild {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_CANCELED = "canceled";
  private JsonNullable<Long> canceled = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_CREATOR_ID = "creator_id";
  private Integer creatorId;

  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private Boolean disabled;

  public static final String JSON_PROPERTY_DOWNTIME_TYPE = "downtime_type";
  private Integer downtimeType;

  public static final String JSON_PROPERTY_END = "end";
  private JsonNullable<Long> end = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private JsonNullable<String> message = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MONITOR_ID = "monitor_id";
  private JsonNullable<Long> monitorId = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_MONITOR_TAGS = "monitor_tags";
  private List<String> monitorTags = null;

  public static final String JSON_PROPERTY_MUTE_FIRST_RECOVERY_NOTIFICATION =
      "mute_first_recovery_notification";
  private Boolean muteFirstRecoveryNotification;

  public static final String JSON_PROPERTY_NOTIFY_END_STATES = "notify_end_states";
  private List<NotifyEndState> notifyEndStates = null;

  public static final String JSON_PROPERTY_NOTIFY_END_TYPES = "notify_end_types";
  private List<NotifyEndType> notifyEndTypes = null;

  public static final String JSON_PROPERTY_PARENT_ID = "parent_id";
  private JsonNullable<Long> parentId = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_RECURRENCE = "recurrence";
  private JsonNullable<DowntimeRecurrence> recurrence =
      JsonNullable.<DowntimeRecurrence>undefined();

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private List<String> scope = null;

  public static final String JSON_PROPERTY_START = "start";
  private Long start;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_UPDATER_ID = "updater_id";
  private JsonNullable<Integer> updaterId = JsonNullable.<Integer>undefined();

  /**
   * If a scheduled downtime currently exists.
   *
   * @return active
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getActive() {
    return active;
  }

  /**
   * If a scheduled downtime is canceled.
   *
   * @return canceled
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getCanceled() {

    if (canceled == null) {
      canceled = JsonNullable.<Long>undefined();
    }
    return canceled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CANCELED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getCanceled_JsonNullable() {
    return canceled;
  }

  @JsonProperty(JSON_PROPERTY_CANCELED)
  private void setCanceled_JsonNullable(JsonNullable<Long> canceled) {
    this.canceled = canceled;
  }

  /**
   * User ID of the downtime creator. maximum: 2147483647
   *
   * @return creatorId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getCreatorId() {
    return creatorId;
  }

  public DowntimeChild disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * If a downtime has been disabled.
   *
   * @return disabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  /**
   * <code>0</code> for a downtime applied on <code>*</code> or all, <code>1</code> when the
   * downtime is only scoped to hosts, or <code>2</code> when the downtime is scoped to anything but
   * hosts. maximum: 2147483647
   *
   * @return downtimeType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOWNTIME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getDowntimeType() {
    return downtimeType;
  }

  public DowntimeChild end(Long end) {
    this.end = JsonNullable.<Long>of(end);
    return this;
  }

  /**
   * POSIX timestamp to end the downtime. If not provided, the downtime is in effect indefinitely
   * until you cancel it.
   *
   * @return end
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getEnd() {
    return end.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getEnd_JsonNullable() {
    return end;
  }

  @JsonProperty(JSON_PROPERTY_END)
  public void setEnd_JsonNullable(JsonNullable<Long> end) {
    this.end = end;
  }

  public void setEnd(Long end) {
    this.end = JsonNullable.<Long>of(end);
  }

  /**
   * The downtime ID.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getId() {
    return id;
  }

  public DowntimeChild message(String message) {
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

  public DowntimeChild monitorId(Long monitorId) {
    this.monitorId = JsonNullable.<Long>of(monitorId);
    return this;
  }

  /**
   * A single monitor to which the downtime applies. If not provided, the downtime applies to all
   * monitors.
   *
   * @return monitorId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getMonitorId() {
    return monitorId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MONITOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getMonitorId_JsonNullable() {
    return monitorId;
  }

  @JsonProperty(JSON_PROPERTY_MONITOR_ID)
  public void setMonitorId_JsonNullable(JsonNullable<Long> monitorId) {
    this.monitorId = monitorId;
  }

  public void setMonitorId(Long monitorId) {
    this.monitorId = JsonNullable.<Long>of(monitorId);
  }

  public DowntimeChild monitorTags(List<String> monitorTags) {
    this.monitorTags = monitorTags;
    return this;
  }

  public DowntimeChild addMonitorTagsItem(String monitorTagsItem) {
    if (this.monitorTags == null) {
      this.monitorTags = new ArrayList<>();
    }
    this.monitorTags.add(monitorTagsItem);
    return this;
  }

  /**
   * A comma-separated list of monitor tags. For example, tags that are applied directly to
   * monitors, not tags that are used in monitor queries (which are filtered by the scope
   * parameter), to which the downtime applies. The resulting downtime applies to monitors that
   * match ALL provided monitor tags. For example, <code>service:postgres</code>
   * <strong>AND</strong> <code>team:frontend</code>.
   *
   * @return monitorTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getMonitorTags() {
    return monitorTags;
  }

  public void setMonitorTags(List<String> monitorTags) {
    this.monitorTags = monitorTags;
  }

  public DowntimeChild muteFirstRecoveryNotification(Boolean muteFirstRecoveryNotification) {
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

  public DowntimeChild notifyEndStates(List<NotifyEndState> notifyEndStates) {
    this.notifyEndStates = notifyEndStates;
    return this;
  }

  public DowntimeChild addNotifyEndStatesItem(NotifyEndState notifyEndStatesItem) {
    if (this.notifyEndStates == null) {
      this.notifyEndStates = new ArrayList<>();
    }
    this.notifyEndStates.add(notifyEndStatesItem);
    this.unparsed |= !notifyEndStatesItem.isValid();
    return this;
  }

  /**
   * States for which <code>notify_end_types</code> sends out notifications for.
   *
   * @return notifyEndStates
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFY_END_STATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<NotifyEndState> getNotifyEndStates() {
    return notifyEndStates;
  }

  public void setNotifyEndStates(List<NotifyEndState> notifyEndStates) {
    this.notifyEndStates = notifyEndStates;
  }

  public DowntimeChild notifyEndTypes(List<NotifyEndType> notifyEndTypes) {
    this.notifyEndTypes = notifyEndTypes;
    return this;
  }

  public DowntimeChild addNotifyEndTypesItem(NotifyEndType notifyEndTypesItem) {
    if (this.notifyEndTypes == null) {
      this.notifyEndTypes = new ArrayList<>();
    }
    this.notifyEndTypes.add(notifyEndTypesItem);
    this.unparsed |= !notifyEndTypesItem.isValid();
    return this;
  }

  /**
   * If set, notifies if a monitor is in an alert-worthy state (<code>ALERT</code>, <code>WARNING
   * </code>, or <code>NO DATA</code>) when this downtime expires or is canceled. Applied to
   * monitors that change states during the downtime (such as from <code>OK</code> to <code>ALERT
   * </code>, <code>WARNING</code>, or <code>NO DATA</code>), and to monitors that already have an
   * alert-worthy state when downtime begins.
   *
   * @return notifyEndTypes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFY_END_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<NotifyEndType> getNotifyEndTypes() {
    return notifyEndTypes;
  }

  public void setNotifyEndTypes(List<NotifyEndType> notifyEndTypes) {
    this.notifyEndTypes = notifyEndTypes;
  }

  public DowntimeChild parentId(Long parentId) {
    this.parentId = JsonNullable.<Long>of(parentId);
    return this;
  }

  /**
   * ID of the parent Downtime.
   *
   * @return parentId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getParentId() {
    return parentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getParentId_JsonNullable() {
    return parentId;
  }

  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  public void setParentId_JsonNullable(JsonNullable<Long> parentId) {
    this.parentId = parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = JsonNullable.<Long>of(parentId);
  }

  public DowntimeChild recurrence(DowntimeRecurrence recurrence) {
    this.recurrence = JsonNullable.<DowntimeRecurrence>of(recurrence);
    return this;
  }

  /**
   * An object defining the recurrence of the downtime.
   *
   * @return recurrence
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public DowntimeRecurrence getRecurrence() {
    return recurrence.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RECURRENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<DowntimeRecurrence> getRecurrence_JsonNullable() {
    return recurrence;
  }

  @JsonProperty(JSON_PROPERTY_RECURRENCE)
  public void setRecurrence_JsonNullable(JsonNullable<DowntimeRecurrence> recurrence) {
    this.recurrence = recurrence;
  }

  public void setRecurrence(DowntimeRecurrence recurrence) {
    this.recurrence = JsonNullable.<DowntimeRecurrence>of(recurrence);
  }

  public DowntimeChild scope(List<String> scope) {
    this.scope = scope;
    return this;
  }

  public DowntimeChild addScopeItem(String scopeItem) {
    if (this.scope == null) {
      this.scope = new ArrayList<>();
    }
    this.scope.add(scopeItem);
    return this;
  }

  /**
   * The scope(s) to which the downtime applies and must be in <code>key:value</code> format. For
   * example, <code>host:app2</code>. Provide multiple scopes as a comma-separated list like <code>
   * env:dev,env:prod</code>. The resulting downtime applies to sources that matches ALL provided
   * scopes (<code>env:dev</code> <strong>AND</strong> <code>env:prod</code>).
   *
   * @return scope
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getScope() {
    return scope;
  }

  public void setScope(List<String> scope) {
    this.scope = scope;
  }

  public DowntimeChild start(Long start) {
    this.start = start;
    return this;
  }

  /**
   * POSIX timestamp to start the downtime. If not provided, the downtime starts the moment it is
   * created.
   *
   * @return start
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStart() {
    return start;
  }

  public void setStart(Long start) {
    this.start = start;
  }

  public DowntimeChild timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * The timezone in which to display the downtime's start and end times in Datadog applications.
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
   * ID of the last user that updated the downtime. maximum: 2147483647
   *
   * @return updaterId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Integer getUpdaterId() {

    if (updaterId == null) {
      updaterId = JsonNullable.<Integer>undefined();
    }
    return updaterId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UPDATER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getUpdaterId_JsonNullable() {
    return updaterId;
  }

  @JsonProperty(JSON_PROPERTY_UPDATER_ID)
  private void setUpdaterId_JsonNullable(JsonNullable<Integer> updaterId) {
    this.updaterId = updaterId;
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
   * @return DowntimeChild
   */
  @JsonAnySetter
  public DowntimeChild putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DowntimeChild object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowntimeChild downtimeChild = (DowntimeChild) o;
    return Objects.equals(this.active, downtimeChild.active)
        && Objects.equals(this.canceled, downtimeChild.canceled)
        && Objects.equals(this.creatorId, downtimeChild.creatorId)
        && Objects.equals(this.disabled, downtimeChild.disabled)
        && Objects.equals(this.downtimeType, downtimeChild.downtimeType)
        && Objects.equals(this.end, downtimeChild.end)
        && Objects.equals(this.id, downtimeChild.id)
        && Objects.equals(this.message, downtimeChild.message)
        && Objects.equals(this.monitorId, downtimeChild.monitorId)
        && Objects.equals(this.monitorTags, downtimeChild.monitorTags)
        && Objects.equals(
            this.muteFirstRecoveryNotification, downtimeChild.muteFirstRecoveryNotification)
        && Objects.equals(this.notifyEndStates, downtimeChild.notifyEndStates)
        && Objects.equals(this.notifyEndTypes, downtimeChild.notifyEndTypes)
        && Objects.equals(this.parentId, downtimeChild.parentId)
        && Objects.equals(this.recurrence, downtimeChild.recurrence)
        && Objects.equals(this.scope, downtimeChild.scope)
        && Objects.equals(this.start, downtimeChild.start)
        && Objects.equals(this.timezone, downtimeChild.timezone)
        && Objects.equals(this.updaterId, downtimeChild.updaterId)
        && Objects.equals(this.additionalProperties, downtimeChild.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        active,
        canceled,
        creatorId,
        disabled,
        downtimeType,
        end,
        id,
        message,
        monitorId,
        monitorTags,
        muteFirstRecoveryNotification,
        notifyEndStates,
        notifyEndTypes,
        parentId,
        recurrence,
        scope,
        start,
        timezone,
        updaterId,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowntimeChild {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    canceled: ").append(toIndentedString(canceled)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    downtimeType: ").append(toIndentedString(downtimeType)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    monitorId: ").append(toIndentedString(monitorId)).append("\n");
    sb.append("    monitorTags: ").append(toIndentedString(monitorTags)).append("\n");
    sb.append("    muteFirstRecoveryNotification: ")
        .append(toIndentedString(muteFirstRecoveryNotification))
        .append("\n");
    sb.append("    notifyEndStates: ").append(toIndentedString(notifyEndStates)).append("\n");
    sb.append("    notifyEndTypes: ").append(toIndentedString(notifyEndTypes)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    updaterId: ").append(toIndentedString(updaterId)).append("\n");
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
