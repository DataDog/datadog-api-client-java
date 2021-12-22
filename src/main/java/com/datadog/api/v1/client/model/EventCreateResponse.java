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
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v1.client.model.EventAlertType;
import com.datadog.api.v1.client.model.EventPriority;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.datadog.api.v1.client.JSON;


/**
 * Object containing an event response.
 */
@ApiModel(description = "Object containing an event response.")
@JsonPropertyOrder({
  EventCreateResponse.JSON_PROPERTY_ALERT_TYPE,
  EventCreateResponse.JSON_PROPERTY_DATE_HAPPENED,
  EventCreateResponse.JSON_PROPERTY_DEVICE_NAME,
  EventCreateResponse.JSON_PROPERTY_HOST,
  EventCreateResponse.JSON_PROPERTY_ID,
  EventCreateResponse.JSON_PROPERTY_PAYLOAD,
  EventCreateResponse.JSON_PROPERTY_PRIORITY,
  EventCreateResponse.JSON_PROPERTY_RELATED_EVENT_ID,
  EventCreateResponse.JSON_PROPERTY_SOURCE_TYPE_NAME,
  EventCreateResponse.JSON_PROPERTY_STATUS,
  EventCreateResponse.JSON_PROPERTY_TAGS,
  EventCreateResponse.JSON_PROPERTY_TEXT,
  EventCreateResponse.JSON_PROPERTY_TITLE,
  EventCreateResponse.JSON_PROPERTY_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EventCreateResponse {
  @JsonIgnore
  public boolean unparsed = false;
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

  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private String payload;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private EventPriority priority;

  public static final String JSON_PROPERTY_RELATED_EVENT_ID = "related_event_id";
  private Long relatedEventId;

  public static final String JSON_PROPERTY_SOURCE_TYPE_NAME = "source_type_name";
  private String sourceTypeName;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;


  public EventCreateResponse alertType(EventAlertType alertType) {
    this.alertType = alertType;
    this.unparsed |= !alertType.isValid();
    return this;
  }

   /**
   * Get alertType
   * @return alertType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public EventCreateResponse dateHappened(Long dateHappened) {
    this.dateHappened = dateHappened;
    return this;
  }

   /**
   * POSIX timestamp of the event. Must be sent as an integer (that is no quotes). Limited to events no older than 7 days.
   * @return dateHappened
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "POSIX timestamp of the event. Must be sent as an integer (that is no quotes). Limited to events no older than 7 days.")
  @JsonProperty(JSON_PROPERTY_DATE_HAPPENED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDateHappened() {
    return dateHappened;
  }


  public void setDateHappened(Long dateHappened) {
    this.dateHappened = dateHappened;
  }


  public EventCreateResponse deviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

   /**
   * A device name.
   * @return deviceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A device name.")
  @JsonProperty(JSON_PROPERTY_DEVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeviceName() {
    return deviceName;
  }


  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }


  public EventCreateResponse host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Host name to associate with the event. Any tags associated with the host are also applied to this event.
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Host name to associate with the event. Any tags associated with the host are also applied to this event.")
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
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Integer ID of the event.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }




   /**
   * Payload of the event.
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "Payload of the event.")
  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayload() {
    return payload;
  }




  public EventCreateResponse priority(EventPriority priority) {
    this.priority = priority;
    this.unparsed |= !priority.isValid();
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EventPriority getPriority() {
    return priority;
  }


  public void setPriority(EventPriority priority) {
    if (!priority.isValid()) {
        this.unparsed = true;
    }
    this.priority = priority;
  }


  public EventCreateResponse relatedEventId(Long relatedEventId) {
    this.relatedEventId = relatedEventId;
    return this;
  }

   /**
   * ID of the parent event. Must be sent as an integer (that is no quotes).
   * @return relatedEventId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the parent event. Must be sent as an integer (that is no quotes).")
  @JsonProperty(JSON_PROPERTY_RELATED_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRelatedEventId() {
    return relatedEventId;
  }


  public void setRelatedEventId(Long relatedEventId) {
    this.relatedEventId = relatedEventId;
  }


  public EventCreateResponse sourceTypeName(String sourceTypeName) {
    this.sourceTypeName = sourceTypeName;
    return this;
  }

   /**
   * The type of event being posted. Option examples include nagios, hudson, jenkins, my_apps, chef, puppet, git, bitbucket, etc. A complete list of source attribute values [available here](https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value).
   * @return sourceTypeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of event being posted. Option examples include nagios, hudson, jenkins, my_apps, chef, puppet, git, bitbucket, etc. A complete list of source attribute values [available here](https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value).")
  @JsonProperty(JSON_PROPERTY_SOURCE_TYPE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceTypeName() {
    return sourceTypeName;
  }


  public void setSourceTypeName(String sourceTypeName) {
    this.sourceTypeName = sourceTypeName;
  }


  public EventCreateResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * A status.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A status.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public EventCreateResponse tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public EventCreateResponse addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of tags to apply to the event.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"environment:test\"]", value = "A list of tags to apply to the event.")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public EventCreateResponse text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The body of the event. Limited to 4000 characters. The text supports markdown. Use &#x60;msg_text&#x60; with the Datadog Ruby library.
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Oh boy!", value = "The body of the event. Limited to 4000 characters. The text supports markdown. Use `msg_text` with the Datadog Ruby library.")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public EventCreateResponse title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The event title. Limited to 100 characters. Use &#x60;msg_title&#x60; with the Datadog Ruby library.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Did you hear the news today?", value = "The event title. Limited to 100 characters. Use `msg_title` with the Datadog Ruby library.")
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
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL of the event.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }




  /**
   * Return true if this EventCreateResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventCreateResponse eventCreateResponse = (EventCreateResponse) o;
    return Objects.equals(this.alertType, eventCreateResponse.alertType) &&
        Objects.equals(this.dateHappened, eventCreateResponse.dateHappened) &&
        Objects.equals(this.deviceName, eventCreateResponse.deviceName) &&
        Objects.equals(this.host, eventCreateResponse.host) &&
        Objects.equals(this.id, eventCreateResponse.id) &&
        Objects.equals(this.payload, eventCreateResponse.payload) &&
        Objects.equals(this.priority, eventCreateResponse.priority) &&
        Objects.equals(this.relatedEventId, eventCreateResponse.relatedEventId) &&
        Objects.equals(this.sourceTypeName, eventCreateResponse.sourceTypeName) &&
        Objects.equals(this.status, eventCreateResponse.status) &&
        Objects.equals(this.tags, eventCreateResponse.tags) &&
        Objects.equals(this.text, eventCreateResponse.text) &&
        Objects.equals(this.title, eventCreateResponse.title) &&
        Objects.equals(this.url, eventCreateResponse.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertType, dateHappened, deviceName, host, id, payload, priority, relatedEventId, sourceTypeName, status, tags, text, title, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventCreateResponse {\n");
    sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
    sb.append("    dateHappened: ").append(toIndentedString(dateHappened)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    relatedEventId: ").append(toIndentedString(relatedEventId)).append("\n");
    sb.append("    sourceTypeName: ").append(toIndentedString(sourceTypeName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
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

