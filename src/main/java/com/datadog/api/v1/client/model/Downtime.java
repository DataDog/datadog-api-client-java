/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.v1.client.model.DowntimeRecurrence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Downtiming gives you greater control over monitor notifications by allowing you to globally exclude scopes from alerting. Downtime settings, which can be scheduled with start and end times, prevent all alerting related to specified Datadog tags.
 */
@ApiModel(description = "Downtiming gives you greater control over monitor notifications by allowing you to globally exclude scopes from alerting. Downtime settings, which can be scheduled with start and end times, prevent all alerting related to specified Datadog tags.")
@JsonPropertyOrder({
  Downtime.JSON_PROPERTY_ACTIVE,
  Downtime.JSON_PROPERTY_CANCELED,
  Downtime.JSON_PROPERTY_CREATOR_ID,
  Downtime.JSON_PROPERTY_DISABLED,
  Downtime.JSON_PROPERTY_DOWNTIME_TYPE,
  Downtime.JSON_PROPERTY_END,
  Downtime.JSON_PROPERTY_ID,
  Downtime.JSON_PROPERTY_MESSAGE,
  Downtime.JSON_PROPERTY_MONITOR_ID,
  Downtime.JSON_PROPERTY_MONITOR_TAGS,
  Downtime.JSON_PROPERTY_PARENT_ID,
  Downtime.JSON_PROPERTY_RECURRENCE,
  Downtime.JSON_PROPERTY_SCOPE,
  Downtime.JSON_PROPERTY_START,
  Downtime.JSON_PROPERTY_TIMEZONE,
  Downtime.JSON_PROPERTY_UPDATER_ID
})

public class Downtime {
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
  private String message;

  public static final String JSON_PROPERTY_MONITOR_ID = "monitor_id";
  private JsonNullable<Long> monitorId = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_MONITOR_TAGS = "monitor_tags";
  private List<String> monitorTags = null;

  public static final String JSON_PROPERTY_PARENT_ID = "parent_id";
  private JsonNullable<Long> parentId = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_RECURRENCE = "recurrence";
  private JsonNullable<DowntimeRecurrence> recurrence = JsonNullable.<DowntimeRecurrence>undefined();

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
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If a scheduled downtime currently exists.")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }




   /**
   * If a scheduled downtime is cancelled.
   * @return canceled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1412799983", value = "If a scheduled downtime is cancelled.")
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
   * TODO.
   * maximum: 2147483647
   * @return creatorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "TODO.")
  @JsonProperty(JSON_PROPERTY_CREATOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCreatorId() {
    return creatorId;
  }




  public Downtime disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * If a downtime has been disabled.
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "If a downtime has been disabled.")
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


   /**
   * TODO.
   * maximum: 2147483647
   * @return downtimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "TODO.")
  @JsonProperty(JSON_PROPERTY_DOWNTIME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDowntimeType() {
    return downtimeType;
  }




  public Downtime end(Long end) {
    this.end = JsonNullable.<Long>of(end);
    
    return this;
  }

   /**
   * POSIX timestamp to end the downtime. If not provided, the downtime is in effect indefinitely until you cancel it.
   * @return end
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1412793983", value = "POSIX timestamp to end the downtime. If not provided, the downtime is in effect indefinitely until you cancel it.")
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
   * TODO.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1625", value = "TODO.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }




  public Downtime message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * A message to include with notifications for this downtime. Email notifications can be sent to specific users by using the same ‘@username’ notation as events.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Message on the downtime", value = "A message to include with notifications for this downtime. Email notifications can be sent to specific users by using the same ‘@username’ notation as events.")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public Downtime monitorId(Long monitorId) {
    this.monitorId = JsonNullable.<Long>of(monitorId);
    
    return this;
  }

   /**
   * A single monitor to which the downtime applies. If not provided, the downtime applies to all monitors.
   * @return monitorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "A single monitor to which the downtime applies. If not provided, the downtime applies to all monitors.")
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


  public Downtime monitorTags(List<String> monitorTags) {
    
    this.monitorTags = monitorTags;
    return this;
  }

  public Downtime addMonitorTagsItem(String monitorTagsItem) {
    if (this.monitorTags == null) {
      this.monitorTags = new ArrayList<>();
    }
    this.monitorTags.add(monitorTagsItem);
    return this;
  }

   /**
   * A comma-separated list of monitor tags. For example, tags that are applied directly to monitors, not tags that are used in monitor queries (which are filtered by the scope parameter), to which the downtime applies. The resulting downtime applies to monitors that match ALL provided monitor tags. For example, &#x60;service:postgres&#x60; **AND** &#x60;team:frontend&#x60;.
   * @return monitorTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"*\"]", value = "A comma-separated list of monitor tags. For example, tags that are applied directly to monitors, not tags that are used in monitor queries (which are filtered by the scope parameter), to which the downtime applies. The resulting downtime applies to monitors that match ALL provided monitor tags. For example, `service:postgres` **AND** `team:frontend`.")
  @JsonProperty(JSON_PROPERTY_MONITOR_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMonitorTags() {
    return monitorTags;
  }


  public void setMonitorTags(List<String> monitorTags) {
    this.monitorTags = monitorTags;
  }


  public Downtime parentId(Long parentId) {
    this.parentId = JsonNullable.<Long>of(parentId);
    
    return this;
  }

   /**
   * TODO.
   * @return parentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "TODO.")
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


  public Downtime recurrence(DowntimeRecurrence recurrence) {
    this.recurrence = JsonNullable.<DowntimeRecurrence>of(recurrence);
    
    return this;
  }

   /**
   * Get recurrence
   * @return recurrence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public Downtime scope(List<String> scope) {
    
    this.scope = scope;
    return this;
  }

  public Downtime addScopeItem(String scopeItem) {
    if (this.scope == null) {
      this.scope = new ArrayList<>();
    }
    this.scope.add(scopeItem);
    return this;
  }

   /**
   * The scope(s) to which the downtime applies. For example, &#x60;host:app2&#x60;. Provide multiple scopes as a comma-separated list like &#x60;env:dev,env:prod&#x60;. The resulting downtime applies to sources that matches ALL provided scopes (&#x60;env:dev&#x60; **AND** &#x60;env:prod&#x60;).
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"env:staging\"]", value = "The scope(s) to which the downtime applies. For example, `host:app2`. Provide multiple scopes as a comma-separated list like `env:dev,env:prod`. The resulting downtime applies to sources that matches ALL provided scopes (`env:dev` **AND** `env:prod`).")
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getScope() {
    return scope;
  }


  public void setScope(List<String> scope) {
    this.scope = scope;
  }


  public Downtime start(Long start) {
    
    this.start = start;
    return this;
  }

   /**
   * POSIX timestamp to start the downtime. If not provided, the downtime starts the moment it is created.
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1412792983", value = "POSIX timestamp to start the downtime. If not provided, the downtime starts the moment it is created.")
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStart() {
    return start;
  }


  public void setStart(Long start) {
    this.start = start;
  }


  public Downtime timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * The timezone for the downtime.
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "America/New_York", value = "The timezone for the downtime.")
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


   /**
   * TODO.
   * maximum: 2147483647
   * @return updaterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "TODO.")
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



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Downtime downtime = (Downtime) o;
    return Objects.equals(this.active, downtime.active) &&
        Objects.equals(this.canceled, downtime.canceled) &&
        Objects.equals(this.creatorId, downtime.creatorId) &&
        Objects.equals(this.disabled, downtime.disabled) &&
        Objects.equals(this.downtimeType, downtime.downtimeType) &&
        Objects.equals(this.end, downtime.end) &&
        Objects.equals(this.id, downtime.id) &&
        Objects.equals(this.message, downtime.message) &&
        Objects.equals(this.monitorId, downtime.monitorId) &&
        Objects.equals(this.monitorTags, downtime.monitorTags) &&
        Objects.equals(this.parentId, downtime.parentId) &&
        Objects.equals(this.recurrence, downtime.recurrence) &&
        Objects.equals(this.scope, downtime.scope) &&
        Objects.equals(this.start, downtime.start) &&
        Objects.equals(this.timezone, downtime.timezone) &&
        Objects.equals(this.updaterId, downtime.updaterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, canceled, creatorId, disabled, downtimeType, end, id, message, monitorId, monitorTags, parentId, recurrence, scope, start, timezone, updaterId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Downtime {\n");
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
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    updaterId: ").append(toIndentedString(updaterId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

