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
   * <p>Object description of attributes from your event.</p>
 */
@JsonPropertyOrder({
  EventAttributes.JSON_PROPERTY_AGGREGATION_KEY,
  EventAttributes.JSON_PROPERTY_DATE_HAPPENED,
  EventAttributes.JSON_PROPERTY_DEVICE_NAME,
  EventAttributes.JSON_PROPERTY_DURATION,
  EventAttributes.JSON_PROPERTY_EVENT_OBJECT,
  EventAttributes.JSON_PROPERTY_EVT,
  EventAttributes.JSON_PROPERTY_HOSTNAME,
  EventAttributes.JSON_PROPERTY_MONITOR,
  EventAttributes.JSON_PROPERTY_MONITOR_GROUPS,
  EventAttributes.JSON_PROPERTY_MONITOR_ID,
  EventAttributes.JSON_PROPERTY_PRIORITY,
  EventAttributes.JSON_PROPERTY_RELATED_EVENT_ID,
  EventAttributes.JSON_PROPERTY_SERVICE,
  EventAttributes.JSON_PROPERTY_SOURCE_TYPE_NAME,
  EventAttributes.JSON_PROPERTY_SOURCECATEGORY,
  EventAttributes.JSON_PROPERTY_STATUS,
  EventAttributes.JSON_PROPERTY_TAGS,
  EventAttributes.JSON_PROPERTY_TIMESTAMP,
  EventAttributes.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION_KEY = "aggregation_key";
  private String aggregationKey;

  public static final String JSON_PROPERTY_DATE_HAPPENED = "date_happened";
  private Long dateHappened;

  public static final String JSON_PROPERTY_DEVICE_NAME = "device_name";
  private String deviceName;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Long duration;

  public static final String JSON_PROPERTY_EVENT_OBJECT = "event_object";
  private String eventObject;

  public static final String JSON_PROPERTY_EVT = "evt";
  private Event evt;

  public static final String JSON_PROPERTY_HOSTNAME = "hostname";
  private String hostname;

  public static final String JSON_PROPERTY_MONITOR = "monitor";
  private JsonNullable<MonitorType> monitor = JsonNullable.<MonitorType>undefined();

  public static final String JSON_PROPERTY_MONITOR_GROUPS = "monitor_groups";
  private JsonNullable<List<String>> monitorGroups = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_MONITOR_ID = "monitor_id";
  private JsonNullable<Long> monitorId = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private JsonNullable<EventPriority> priority = JsonNullable.<EventPriority>undefined();

  public static final String JSON_PROPERTY_RELATED_EVENT_ID = "related_event_id";
  private Long relatedEventId;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_SOURCE_TYPE_NAME = "source_type_name";
  private String sourceTypeName;

  public static final String JSON_PROPERTY_SOURCECATEGORY = "sourcecategory";
  private String sourcecategory;

  public static final String JSON_PROPERTY_STATUS = "status";
  private EventStatusType status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public EventAttributes aggregationKey(String aggregationKey) {
    this.aggregationKey = aggregationKey;
    return this;
  }

  /**
   * <p>Aggregation key of the event.</p>
   * @return aggregationKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AGGREGATION_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAggregationKey() {
        return aggregationKey;
      }
  public void setAggregationKey(String aggregationKey) {
    this.aggregationKey = aggregationKey;
  }
  public EventAttributes dateHappened(Long dateHappened) {
    this.dateHappened = dateHappened;
    return this;
  }

  /**
   * <p>POSIX timestamp of the event. Must be sent as an integer (no quotation marks).
   * Limited to events no older than 18 hours.</p>
   * @return dateHappened
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DATE_HAPPENED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getDateHappened() {
        return dateHappened;
      }
  public void setDateHappened(Long dateHappened) {
    this.dateHappened = dateHappened;
  }
  public EventAttributes deviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

  /**
   * <p>A device name.</p>
   * @return deviceName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DEVICE_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDeviceName() {
        return deviceName;
      }
  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }
  public EventAttributes duration(Long duration) {
    this.duration = duration;
    return this;
  }

  /**
   * <p>The duration between the triggering of the event and its recovery in nanoseconds.</p>
   * @return duration
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DURATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getDuration() {
        return duration;
      }
  public void setDuration(Long duration) {
    this.duration = duration;
  }
  public EventAttributes eventObject(String eventObject) {
    this.eventObject = eventObject;
    return this;
  }

  /**
   * <p>The event title.</p>
   * @return eventObject
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EVENT_OBJECT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getEventObject() {
        return eventObject;
      }
  public void setEventObject(String eventObject) {
    this.eventObject = eventObject;
  }
  public EventAttributes evt(Event evt) {
    this.evt = evt;
    this.unparsed |= evt.unparsed;
    return this;
  }

  /**
   * <p>The metadata associated with a request.</p>
   * @return evt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EVT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Event getEvt() {
        return evt;
      }
  public void setEvt(Event evt) {
    this.evt = evt;
  }
  public EventAttributes hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * <p>Host name to associate with the event.
   * Any tags associated with the host are also applied to this event.</p>
   * @return hostname
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HOSTNAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getHostname() {
        return hostname;
      }
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }
  public EventAttributes monitor(MonitorType monitor) {
    this.monitor = JsonNullable.<MonitorType>of(monitor);
    return this;
  }

  /**
   * <p>Attributes from the monitor that triggered the event.</p>
   * @return monitor
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public MonitorType getMonitor() {
        return monitor.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_MONITOR)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<MonitorType> getMonitor_JsonNullable() {
    return monitor;
  }
  @JsonProperty(JSON_PROPERTY_MONITOR)public void setMonitor_JsonNullable(JsonNullable<MonitorType> monitor) {
    this.monitor = monitor;
  }
  public void setMonitor(MonitorType monitor) {
    this.monitor = JsonNullable.<MonitorType>of(monitor);
  }
  public EventAttributes monitorGroups(List<String> monitorGroups) {
    this.monitorGroups = JsonNullable.<List<String>>of(monitorGroups);
    return this;
  }
  public EventAttributes addMonitorGroupsItem(String monitorGroupsItem) {
    if (this.monitorGroups == null || !this.monitorGroups.isPresent()) {
      this.monitorGroups = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.monitorGroups.get().add(monitorGroupsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * <p>List of groups referred to in the event.</p>
   * @return monitorGroups
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public List<String> getMonitorGroups() {
        return monitorGroups.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_MONITOR_GROUPS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getMonitorGroups_JsonNullable() {
    return monitorGroups;
  }
  @JsonProperty(JSON_PROPERTY_MONITOR_GROUPS)public void setMonitorGroups_JsonNullable(JsonNullable<List<String>> monitorGroups) {
    this.monitorGroups = monitorGroups;
  }
  public void setMonitorGroups(List<String> monitorGroups) {
    this.monitorGroups = JsonNullable.<List<String>>of(monitorGroups);
  }
  public EventAttributes monitorId(Long monitorId) {
    this.monitorId = JsonNullable.<Long>of(monitorId);
    return this;
  }

  /**
   * <p>ID of the monitor that triggered the event. When an event isn't related to a monitor, this field is empty.</p>
   * @return monitorId
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getMonitorId() {
        return monitorId.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_MONITOR_ID)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getMonitorId_JsonNullable() {
    return monitorId;
  }
  @JsonProperty(JSON_PROPERTY_MONITOR_ID)public void setMonitorId_JsonNullable(JsonNullable<Long> monitorId) {
    this.monitorId = monitorId;
  }
  public void setMonitorId(Long monitorId) {
    this.monitorId = JsonNullable.<Long>of(monitorId);
  }
  public EventAttributes priority(EventPriority priority) {
    this.priority = JsonNullable.<EventPriority>of(priority);
    return this;
  }

  /**
   * <p>The priority of the event's monitor. For example, <code>normal</code> or <code>low</code>.</p>
   * @return priority
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public EventPriority getPriority() {
        return priority.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<EventPriority> getPriority_JsonNullable() {
    return priority;
  }
  @JsonProperty(JSON_PROPERTY_PRIORITY)public void setPriority_JsonNullable(JsonNullable<EventPriority> priority) {
    this.priority = priority;
  }
  public void setPriority(EventPriority priority) {
    if (!priority.isValid()) {
        this.unparsed = true;
    }
    this.priority = JsonNullable.<EventPriority>of(priority);
  }
  public EventAttributes relatedEventId(Long relatedEventId) {
    this.relatedEventId = relatedEventId;
    return this;
  }

  /**
   * <p>Related event ID.</p>
   * @return relatedEventId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RELATED_EVENT_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getRelatedEventId() {
        return relatedEventId;
      }
  public void setRelatedEventId(Long relatedEventId) {
    this.relatedEventId = relatedEventId;
  }
  public EventAttributes service(String service) {
    this.service = service;
    return this;
  }

  /**
   * <p>Service that triggered the event.</p>
   * @return service
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SERVICE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getService() {
        return service;
      }
  public void setService(String service) {
    this.service = service;
  }
  public EventAttributes sourceTypeName(String sourceTypeName) {
    this.sourceTypeName = sourceTypeName;
    return this;
  }

  /**
   * <p>The type of event being posted.
   * For example, <code>nagios</code>, <code>hudson</code>, <code>jenkins</code>, <code>my_apps</code>, <code>chef</code>, <code>puppet</code>, <code>git</code> or <code>bitbucket</code>.
   * The list of standard source attribute values is <a href="https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value">available here</a>.</p>
   * @return sourceTypeName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SOURCE_TYPE_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSourceTypeName() {
        return sourceTypeName;
      }
  public void setSourceTypeName(String sourceTypeName) {
    this.sourceTypeName = sourceTypeName;
  }
  public EventAttributes sourcecategory(String sourcecategory) {
    this.sourcecategory = sourcecategory;
    return this;
  }

  /**
   * <p>Identifier for the source of the event, such as a monitor alert, an externally-submitted event, or an integration.</p>
   * @return sourcecategory
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SOURCECATEGORY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSourcecategory() {
        return sourcecategory;
      }
  public void setSourcecategory(String sourcecategory) {
    this.sourcecategory = sourcecategory;
  }
  public EventAttributes status(EventStatusType status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * <p>If an alert event is enabled, its status is one of the following:
   * <code>failure</code>, <code>error</code>, <code>warning</code>, <code>info</code>, <code>success</code>, <code>user_update</code>,
   * <code>recommendation</code>, or <code>snapshot</code>.</p>
   * @return status
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public EventStatusType getStatus() {
        return status;
      }
  public void setStatus(EventStatusType status) {
    if (!status.isValid()) {
        this.unparsed = true;
    }
    this.status = status;
  }
  public EventAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public EventAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>A list of tags to apply to the event.</p>
   * @return tags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getTags() {
        return tags;
      }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }
  public EventAttributes timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * <p>POSIX timestamp of your event in milliseconds.</p>
   * @return timestamp
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIMESTAMP)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getTimestamp() {
        return timestamp;
      }
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }
  public EventAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <p>The event title.</p>
   * @return title
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TITLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTitle() {
        return title;
      }
  public void setTitle(String title) {
    this.title = title;
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
   * @return EventAttributes
   */
  @JsonAnySetter
  public EventAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this EventAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventAttributes eventAttributes = (EventAttributes) o;
    return Objects.equals(this.aggregationKey, eventAttributes.aggregationKey) && Objects.equals(this.dateHappened, eventAttributes.dateHappened) && Objects.equals(this.deviceName, eventAttributes.deviceName) && Objects.equals(this.duration, eventAttributes.duration) && Objects.equals(this.eventObject, eventAttributes.eventObject) && Objects.equals(this.evt, eventAttributes.evt) && Objects.equals(this.hostname, eventAttributes.hostname) && Objects.equals(this.monitor, eventAttributes.monitor) && Objects.equals(this.monitorGroups, eventAttributes.monitorGroups) && Objects.equals(this.monitorId, eventAttributes.monitorId) && Objects.equals(this.priority, eventAttributes.priority) && Objects.equals(this.relatedEventId, eventAttributes.relatedEventId) && Objects.equals(this.service, eventAttributes.service) && Objects.equals(this.sourceTypeName, eventAttributes.sourceTypeName) && Objects.equals(this.sourcecategory, eventAttributes.sourcecategory) && Objects.equals(this.status, eventAttributes.status) && Objects.equals(this.tags, eventAttributes.tags) && Objects.equals(this.timestamp, eventAttributes.timestamp) && Objects.equals(this.title, eventAttributes.title) && Objects.equals(this.additionalProperties, eventAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(aggregationKey,dateHappened,deviceName,duration,eventObject,evt,hostname,monitor,monitorGroups,monitorId,priority,relatedEventId,service,sourceTypeName,sourcecategory,status,tags,timestamp,title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventAttributes {\n");
    sb.append("    aggregationKey: ").append(toIndentedString(aggregationKey)).append("\n");
    sb.append("    dateHappened: ").append(toIndentedString(dateHappened)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    eventObject: ").append(toIndentedString(eventObject)).append("\n");
    sb.append("    evt: ").append(toIndentedString(evt)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    monitor: ").append(toIndentedString(monitor)).append("\n");
    sb.append("    monitorGroups: ").append(toIndentedString(monitorGroups)).append("\n");
    sb.append("    monitorId: ").append(toIndentedString(monitorId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    relatedEventId: ").append(toIndentedString(relatedEventId)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    sourceTypeName: ").append(toIndentedString(sourceTypeName)).append("\n");
    sb.append("    sourcecategory: ").append(toIndentedString(sourcecategory)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
