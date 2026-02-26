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

/** Object representing an event. */
@JsonPropertyOrder({
  Event.JSON_PROPERTY_ALERT_TYPE,
  Event.JSON_PROPERTY_DATE_HAPPENED,
  Event.JSON_PROPERTY_DEVICE_NAME,
  Event.JSON_PROPERTY_HOST,
  Event.JSON_PROPERTY_ID,
  Event.JSON_PROPERTY_ID_STR,
  Event.JSON_PROPERTY_PAYLOAD,
  Event.JSON_PROPERTY_PRIORITY,
  Event.JSON_PROPERTY_SOURCE_TYPE_NAME,
  Event.JSON_PROPERTY_TAGS,
  Event.JSON_PROPERTY_TEXT,
  Event.JSON_PROPERTY_TITLE,
  Event.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class Event {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALERT_TYPE = "alert_type";
  private EventAlertType alertType;

  public static final String JSON_PROPERTY_DATE_HAPPENED = "date_happened";
  private Long dateHappened;

  public static final String JSON_PROPERTY_DEVICE_NAME = "device_name";
  private String deviceName;

  public static final String JSON_PROPERTY_HOST = "host";
  private String host;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_ID_STR = "id_str";
  private String idStr;

  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private String payload;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private JsonNullable<EventPriority> priority = JsonNullable.<EventPriority>undefined();

  public static final String JSON_PROPERTY_SOURCE_TYPE_NAME = "source_type_name";
  private String sourceTypeName;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public Event alertType(EventAlertType alertType) {
    this.alertType = alertType;
    this.unparsed |= !alertType.isValid();
    return this;
  }

  /**
   * If an alert event is enabled, set its type. For example, <code>error</code>, <code>warning
   * </code>, <code>info</code>, <code>success</code>, <code>user_update</code>, <code>
   * recommendation</code>, and <code>snapshot</code>.
   *
   * @return alertType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EventAlertType getAlertType() {
    return alertType;
  }

  public void setAlertType(EventAlertType alertType) {
    if (!alertType.isValid()) {
      this.unparsed = true;
    }
    this.alertType = alertType;
  }

  public Event dateHappened(Long dateHappened) {
    this.dateHappened = dateHappened;
    return this;
  }

  /**
   * POSIX timestamp of the event. Must be sent as an integer (that is no quotes). Limited to events
   * up to 18 hours in the past and two hours in the future.
   *
   * @return dateHappened
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_HAPPENED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDateHappened() {
    return dateHappened;
  }

  public void setDateHappened(Long dateHappened) {
    this.dateHappened = dateHappened;
  }

  public Event deviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

  /**
   * A device name.
   *
   * @return deviceName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDeviceName() {
    return deviceName;
  }

  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  public Event host(String host) {
    this.host = host;
    return this;
  }

  /**
   * Host name to associate with the event. Any tags associated with the host are also applied to
   * this event.
   *
   * @return host
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  /**
   * Integer ID of the event.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getId() {
    return id;
  }

  /**
   * Handling IDs as large 64-bit numbers can cause loss of accuracy issues with some programming
   * languages. Instead, use the string representation of the Event ID to avoid losing accuracy.
   *
   * @return idStr
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID_STR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIdStr() {
    return idStr;
  }

  /**
   * Payload of the event.
   *
   * @return payload
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPayload() {
    return payload;
  }

  public Event priority(EventPriority priority) {
    this.priority = JsonNullable.<EventPriority>of(priority);
    return this;
  }

  /**
   * The priority of the event. For example, <code>normal</code> or <code>low</code>.
   *
   * @return priority
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public EventPriority getPriority() {
    return priority.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<EventPriority> getPriority_JsonNullable() {
    return priority;
  }

  @JsonProperty(JSON_PROPERTY_PRIORITY)
  public void setPriority_JsonNullable(JsonNullable<EventPriority> priority) {
    this.priority = priority;
  }

  public void setPriority(EventPriority priority) {
    if (!priority.isValid()) {
      this.unparsed = true;
    }
    this.priority = JsonNullable.<EventPriority>of(priority);
  }

  public Event sourceTypeName(String sourceTypeName) {
    this.sourceTypeName = sourceTypeName;
    return this;
  }

  /**
   * The type of event being posted. Option examples include nagios, hudson, jenkins, my_apps, chef,
   * puppet, git, bitbucket, etc. The list of standard source attribute values <a
   * href="https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value">available
   * here</a>.
   *
   * @return sourceTypeName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_TYPE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSourceTypeName() {
    return sourceTypeName;
  }

  public void setSourceTypeName(String sourceTypeName) {
    this.sourceTypeName = sourceTypeName;
  }

  public Event tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Event addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of tags to apply to the event.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Event text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The body of the event. Limited to 4000 characters. The text supports markdown. To use markdown
   * in the event text, start the text block with <code>%%% \n</code> and end the text block with
   * <code>\n %%%</code>. Use <code>msg_text</code> with the Datadog Ruby library.
   *
   * @return text
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Event title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The event title.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * URL of the event.
   *
   * @return url
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
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
   * @return Event
   */
  @JsonAnySetter
  public Event putAdditionalProperty(String key, Object value) {
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

  /** Return true if this Event object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.alertType, event.alertType)
        && Objects.equals(this.dateHappened, event.dateHappened)
        && Objects.equals(this.deviceName, event.deviceName)
        && Objects.equals(this.host, event.host)
        && Objects.equals(this.id, event.id)
        && Objects.equals(this.idStr, event.idStr)
        && Objects.equals(this.payload, event.payload)
        && Objects.equals(this.priority, event.priority)
        && Objects.equals(this.sourceTypeName, event.sourceTypeName)
        && Objects.equals(this.tags, event.tags)
        && Objects.equals(this.text, event.text)
        && Objects.equals(this.title, event.title)
        && Objects.equals(this.url, event.url)
        && Objects.equals(this.additionalProperties, event.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        alertType,
        dateHappened,
        deviceName,
        host,
        id,
        idStr,
        payload,
        priority,
        sourceTypeName,
        tags,
        text,
        title,
        url,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
    sb.append("    dateHappened: ").append(toIndentedString(dateHappened)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idStr: ").append(toIndentedString(idStr)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    sourceTypeName: ").append(toIndentedString(sourceTypeName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
