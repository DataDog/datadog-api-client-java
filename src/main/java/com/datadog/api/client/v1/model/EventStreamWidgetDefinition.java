/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * The event stream is a widget version of the stream of events on the Event Stream view. Only
 * available on FREE layout dashboards.
 */
@JsonPropertyOrder({
  EventStreamWidgetDefinition.JSON_PROPERTY_EVENT_SIZE,
  EventStreamWidgetDefinition.JSON_PROPERTY_QUERY,
  EventStreamWidgetDefinition.JSON_PROPERTY_TAGS_EXECUTION,
  EventStreamWidgetDefinition.JSON_PROPERTY_TIME,
  EventStreamWidgetDefinition.JSON_PROPERTY_TITLE,
  EventStreamWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  EventStreamWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  EventStreamWidgetDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventStreamWidgetDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EVENT_SIZE = "event_size";
  private WidgetEventSize eventSize;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_TAGS_EXECUTION = "tags_execution";
  private String tagsExecution;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private EventStreamWidgetDefinitionType type = EventStreamWidgetDefinitionType.EVENT_STREAM;

  public EventStreamWidgetDefinition() {}

  @JsonCreator
  public EventStreamWidgetDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          EventStreamWidgetDefinitionType type) {
    this.query = query;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public EventStreamWidgetDefinition eventSize(WidgetEventSize eventSize) {
    this.eventSize = eventSize;
    this.unparsed |= !eventSize.isValid();
    return this;
  }

  /**
   * Size to use to display an event.
   *
   * @return eventSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetEventSize getEventSize() {
    return eventSize;
  }

  public void setEventSize(WidgetEventSize eventSize) {
    if (!eventSize.isValid()) {
      this.unparsed = true;
    }
    this.eventSize = eventSize;
  }

  public EventStreamWidgetDefinition query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Query to filter the event stream with.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public EventStreamWidgetDefinition tagsExecution(String tagsExecution) {
    this.tagsExecution = tagsExecution;
    return this;
  }

  /**
   * The execution method for multi-value filters. Can be either and or or.
   *
   * @return tagsExecution
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS_EXECUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTagsExecution() {
    return tagsExecution;
  }

  public void setTagsExecution(String tagsExecution) {
    this.tagsExecution = tagsExecution;
  }

  public EventStreamWidgetDefinition time(WidgetTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * Time setting for the widget.
   *
   * @return time
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTime getTime() {
    return time;
  }

  public void setTime(WidgetTime time) {
    this.time = time;
  }

  public EventStreamWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the widget.
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

  public EventStreamWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
    this.unparsed |= !titleAlign.isValid();
    return this;
  }

  /**
   * How to align the text on the widget.
   *
   * @return titleAlign
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTextAlign getTitleAlign() {
    return titleAlign;
  }

  public void setTitleAlign(WidgetTextAlign titleAlign) {
    if (!titleAlign.isValid()) {
      this.unparsed = true;
    }
    this.titleAlign = titleAlign;
  }

  public EventStreamWidgetDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

  /**
   * Size of the title.
   *
   * @return titleSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitleSize() {
    return titleSize;
  }

  public void setTitleSize(String titleSize) {
    this.titleSize = titleSize;
  }

  public EventStreamWidgetDefinition type(EventStreamWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the event stream widget.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EventStreamWidgetDefinitionType getType() {
    return type;
  }

  public void setType(EventStreamWidgetDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return EventStreamWidgetDefinition
   */
  @JsonAnySetter
  public EventStreamWidgetDefinition putAdditionalProperty(String key, Object value) {
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

  /** Return true if this EventStreamWidgetDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventStreamWidgetDefinition eventStreamWidgetDefinition = (EventStreamWidgetDefinition) o;
    return Objects.equals(this.eventSize, eventStreamWidgetDefinition.eventSize)
        && Objects.equals(this.query, eventStreamWidgetDefinition.query)
        && Objects.equals(this.tagsExecution, eventStreamWidgetDefinition.tagsExecution)
        && Objects.equals(this.time, eventStreamWidgetDefinition.time)
        && Objects.equals(this.title, eventStreamWidgetDefinition.title)
        && Objects.equals(this.titleAlign, eventStreamWidgetDefinition.titleAlign)
        && Objects.equals(this.titleSize, eventStreamWidgetDefinition.titleSize)
        && Objects.equals(this.type, eventStreamWidgetDefinition.type)
        && Objects.equals(
            this.additionalProperties, eventStreamWidgetDefinition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        eventSize,
        query,
        tagsExecution,
        time,
        title,
        titleAlign,
        titleSize,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventStreamWidgetDefinition {\n");
    sb.append("    eventSize: ").append(toIndentedString(eventSize)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    tagsExecution: ").append(toIndentedString(tagsExecution)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
