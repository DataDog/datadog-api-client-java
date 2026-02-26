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
   * <p>Represents a layer within a schedule update, including rotation details, members,
   * and optional restrictions.</p>
 */
@JsonPropertyOrder({
  ScheduleUpdateRequestDataAttributesLayersItems.JSON_PROPERTY_EFFECTIVE_DATE,
  ScheduleUpdateRequestDataAttributesLayersItems.JSON_PROPERTY_END_DATE,
  ScheduleUpdateRequestDataAttributesLayersItems.JSON_PROPERTY_ID,
  ScheduleUpdateRequestDataAttributesLayersItems.JSON_PROPERTY_INTERVAL,
  ScheduleUpdateRequestDataAttributesLayersItems.JSON_PROPERTY_MEMBERS,
  ScheduleUpdateRequestDataAttributesLayersItems.JSON_PROPERTY_NAME,
  ScheduleUpdateRequestDataAttributesLayersItems.JSON_PROPERTY_RESTRICTIONS,
  ScheduleUpdateRequestDataAttributesLayersItems.JSON_PROPERTY_ROTATION_START,
  ScheduleUpdateRequestDataAttributesLayersItems.JSON_PROPERTY_TIME_ZONE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScheduleUpdateRequestDataAttributesLayersItems {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_EFFECTIVE_DATE = "effective_date";
  private OffsetDateTime effectiveDate;

  public static final String JSON_PROPERTY_END_DATE = "end_date";
  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private LayerAttributesInterval interval;

  public static final String JSON_PROPERTY_MEMBERS = "members";
  private List<ScheduleRequestDataAttributesLayersItemsMembersItems> members = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RESTRICTIONS = "restrictions";
  private List<TimeRestriction> restrictions = null;

  public static final String JSON_PROPERTY_ROTATION_START = "rotation_start";
  private OffsetDateTime rotationStart;

  public static final String JSON_PROPERTY_TIME_ZONE = "time_zone";
  private String timeZone;

  public ScheduleUpdateRequestDataAttributesLayersItems() {}

  @JsonCreator
  public ScheduleUpdateRequestDataAttributesLayersItems(
            @JsonProperty(required=true, value=JSON_PROPERTY_EFFECTIVE_DATE)OffsetDateTime effectiveDate,
            @JsonProperty(required=true, value=JSON_PROPERTY_INTERVAL)LayerAttributesInterval interval,
            @JsonProperty(required=true, value=JSON_PROPERTY_MEMBERS)List<ScheduleRequestDataAttributesLayersItemsMembersItems> members,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_ROTATION_START)OffsetDateTime rotationStart) {
        this.effectiveDate = effectiveDate;
        this.interval = interval;
        this.unparsed |= interval.unparsed;
        this.members = members;
        this.name = name;
        this.rotationStart = rotationStart;
  }
  public ScheduleUpdateRequestDataAttributesLayersItems effectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * <p>When this updated layer takes effect (ISO 8601 format).</p>
   * @return effectiveDate
  **/
      @JsonProperty(JSON_PROPERTY_EFFECTIVE_DATE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public OffsetDateTime getEffectiveDate() {
        return effectiveDate;
      }
  public void setEffectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
  }
  public ScheduleUpdateRequestDataAttributesLayersItems endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * <p>When this updated layer should stop being active (ISO 8601 format).</p>
   * @return endDate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_END_DATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getEndDate() {
        return endDate;
      }
  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }
  public ScheduleUpdateRequestDataAttributesLayersItems id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>A unique identifier for the layer being updated.</p>
   * @return id
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public ScheduleUpdateRequestDataAttributesLayersItems interval(LayerAttributesInterval interval) {
    this.interval = interval;
    this.unparsed |= interval.unparsed;
    return this;
  }

  /**
   * <p>Defines how often the rotation repeats, using a combination of days and optional seconds. Should be at least 1 hour.</p>
   * @return interval
  **/
      @JsonProperty(JSON_PROPERTY_INTERVAL)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public LayerAttributesInterval getInterval() {
        return interval;
      }
  public void setInterval(LayerAttributesInterval interval) {
    this.interval = interval;
  }
  public ScheduleUpdateRequestDataAttributesLayersItems members(List<ScheduleRequestDataAttributesLayersItemsMembersItems> members) {
    this.members = members;
    for (ScheduleRequestDataAttributesLayersItemsMembersItems item : members) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ScheduleUpdateRequestDataAttributesLayersItems addMembersItem(ScheduleRequestDataAttributesLayersItemsMembersItems membersItem) {
    this.members.add(membersItem);
    this.unparsed |= membersItem.unparsed;
    return this;
  }

  /**
   * <p>The members assigned to this layer.</p>
   * @return members
  **/
      @JsonProperty(JSON_PROPERTY_MEMBERS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<ScheduleRequestDataAttributesLayersItemsMembersItems> getMembers() {
        return members;
      }
  public void setMembers(List<ScheduleRequestDataAttributesLayersItemsMembersItems> members) {
    this.members = members;
  }
  public ScheduleUpdateRequestDataAttributesLayersItems name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name for this layer (for example, "Secondary Coverage").</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public ScheduleUpdateRequestDataAttributesLayersItems restrictions(List<TimeRestriction> restrictions) {
    this.restrictions = restrictions;
    for (TimeRestriction item : restrictions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ScheduleUpdateRequestDataAttributesLayersItems addRestrictionsItem(TimeRestriction restrictionsItem) {
    if (this.restrictions == null) {
      this.restrictions = new ArrayList<>();
    }
    this.restrictions.add(restrictionsItem);
    this.unparsed |= restrictionsItem.unparsed;
    return this;
  }

  /**
   * <p>Any time restrictions that define when this layer is active.</p>
   * @return restrictions
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESTRICTIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<TimeRestriction> getRestrictions() {
        return restrictions;
      }
  public void setRestrictions(List<TimeRestriction> restrictions) {
    this.restrictions = restrictions;
  }
  public ScheduleUpdateRequestDataAttributesLayersItems rotationStart(OffsetDateTime rotationStart) {
    this.rotationStart = rotationStart;
    return this;
  }

  /**
   * <p>The date/time at which the rotation begins (ISO 8601 format).</p>
   * @return rotationStart
  **/
      @JsonProperty(JSON_PROPERTY_ROTATION_START)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public OffsetDateTime getRotationStart() {
        return rotationStart;
      }
  public void setRotationStart(OffsetDateTime rotationStart) {
    this.rotationStart = rotationStart;
  }
  public ScheduleUpdateRequestDataAttributesLayersItems timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * <p>The time zone for this layer.</p>
   * @return timeZone
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIME_ZONE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTimeZone() {
        return timeZone;
      }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
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
   * @return ScheduleUpdateRequestDataAttributesLayersItems
   */
  @JsonAnySetter
  public ScheduleUpdateRequestDataAttributesLayersItems putAdditionalProperty(String key, Object value) {
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
   * Return true if this ScheduleUpdateRequestDataAttributesLayersItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleUpdateRequestDataAttributesLayersItems scheduleUpdateRequestDataAttributesLayersItems = (ScheduleUpdateRequestDataAttributesLayersItems) o;
    return Objects.equals(this.effectiveDate, scheduleUpdateRequestDataAttributesLayersItems.effectiveDate) && Objects.equals(this.endDate, scheduleUpdateRequestDataAttributesLayersItems.endDate) && Objects.equals(this.id, scheduleUpdateRequestDataAttributesLayersItems.id) && Objects.equals(this.interval, scheduleUpdateRequestDataAttributesLayersItems.interval) && Objects.equals(this.members, scheduleUpdateRequestDataAttributesLayersItems.members) && Objects.equals(this.name, scheduleUpdateRequestDataAttributesLayersItems.name) && Objects.equals(this.restrictions, scheduleUpdateRequestDataAttributesLayersItems.restrictions) && Objects.equals(this.rotationStart, scheduleUpdateRequestDataAttributesLayersItems.rotationStart) && Objects.equals(this.timeZone, scheduleUpdateRequestDataAttributesLayersItems.timeZone) && Objects.equals(this.additionalProperties, scheduleUpdateRequestDataAttributesLayersItems.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(effectiveDate,endDate,id,interval,members,name,restrictions,rotationStart,timeZone, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleUpdateRequestDataAttributesLayersItems {\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
    sb.append("    rotationStart: ").append(toIndentedString(rotationStart)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
