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
 * Downtime
 */
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
  private Integer updaterId;


   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }




   /**
   * Get canceled
   * @return canceled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1412799983", value = "")
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
   * Get creatorId
   * maximum: 2147483647
   * @return creatorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "")
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
   * Get disabled
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


   /**
   * Get downtimeType
   * maximum: 2147483647
   * @return downtimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")
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
   * Get end
   * @return end
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1412793983", value = "")
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
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1625", value = "")
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
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Message on the downtime", value = "")
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
   * Get monitorId
   * @return monitorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "")
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
      this.monitorTags = new ArrayList<String>();
    }
    this.monitorTags.add(monitorTagsItem);
    return this;
  }

   /**
   * Get monitorTags
   * @return monitorTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"*\"]", value = "")
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
   * Get parentId
   * @return parentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "")
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
      this.scope = new ArrayList<String>();
    }
    this.scope.add(scopeItem);
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"env:staging\"]", value = "")
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
   * Get start
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1412792983", value = "")
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
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "America/New_York", value = "")
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


   /**
   * Get updaterId
   * maximum: 2147483647
   * @return updaterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "")
  @JsonProperty(JSON_PROPERTY_UPDATER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUpdaterId() {
    return updaterId;
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

