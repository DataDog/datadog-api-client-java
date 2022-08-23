/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
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
   * <p>The event timeline is a widget version of the timeline that appears at the top of the Event Stream view. Only available on FREE layout dashboards.</p>
 */
@JsonPropertyOrder({
  EventTimelineWidgetDefinition.JSON_PROPERTY_QUERY,
  EventTimelineWidgetDefinition.JSON_PROPERTY_TAGS_EXECUTION,
  EventTimelineWidgetDefinition.JSON_PROPERTY_TIME,
  EventTimelineWidgetDefinition.JSON_PROPERTY_TITLE,
  EventTimelineWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  EventTimelineWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  EventTimelineWidgetDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventTimelineWidgetDefinition {
  @JsonIgnore
  public boolean unparsed = false;
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
  private EventTimelineWidgetDefinitionType type = EventTimelineWidgetDefinitionType.EVENT_TIMELINE;

  public EventTimelineWidgetDefinition() {}

  @JsonCreator
  public EventTimelineWidgetDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_QUERY)String query,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)EventTimelineWidgetDefinitionType type) {
        this.query = query;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public EventTimelineWidgetDefinition query(String query) {
    this.query = query;
    return this;
  }

  /**
   * <p>Query to filter the event timeline with.</p>
   * @return query
  **/
      @JsonProperty(JSON_PROPERTY_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getQuery() {
        return query;
      }
  public void setQuery(String query) {
    this.query = query;
  }
  public EventTimelineWidgetDefinition tagsExecution(String tagsExecution) {
    this.tagsExecution = tagsExecution;
    return this;
  }

  /**
   * <p>The execution method for multi-value filters. Can be either and or or.</p>
   * @return tagsExecution
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAGS_EXECUTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTagsExecution() {
        return tagsExecution;
      }
  public void setTagsExecution(String tagsExecution) {
    this.tagsExecution = tagsExecution;
  }
  public EventTimelineWidgetDefinition time(WidgetTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * <p>Time setting for the widget.</p>
   * @return time
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetTime getTime() {
        return time;
      }
  public void setTime(WidgetTime time) {
    this.time = time;
  }
  public EventTimelineWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <p>Title of the widget.</p>
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
  public EventTimelineWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
    this.unparsed |= !titleAlign.isValid();
    return this;
  }

  /**
   * <p>How to align the text on the widget.</p>
   * @return titleAlign
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TITLE_ALIGN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetTextAlign getTitleAlign() {
        return titleAlign;
      }
  public void setTitleAlign(WidgetTextAlign titleAlign) {
    if (!titleAlign.isValid()) {
        this.unparsed = true;
    }
    this.titleAlign = titleAlign;
  }
  public EventTimelineWidgetDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

  /**
   * <p>Size of the title.</p>
   * @return titleSize
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTitleSize() {
        return titleSize;
      }
  public void setTitleSize(String titleSize) {
    this.titleSize = titleSize;
  }
  public EventTimelineWidgetDefinition type(EventTimelineWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of the event timeline widget.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public EventTimelineWidgetDefinitionType getType() {
        return type;
      }
  public void setType(EventTimelineWidgetDefinitionType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * Return true if this EventTimelineWidgetDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventTimelineWidgetDefinition eventTimelineWidgetDefinition = (EventTimelineWidgetDefinition) o;
    return Objects.equals(this.query, eventTimelineWidgetDefinition.query) && Objects.equals(this.tagsExecution, eventTimelineWidgetDefinition.tagsExecution) && Objects.equals(this.time, eventTimelineWidgetDefinition.time) && Objects.equals(this.title, eventTimelineWidgetDefinition.title) && Objects.equals(this.titleAlign, eventTimelineWidgetDefinition.titleAlign) && Objects.equals(this.titleSize, eventTimelineWidgetDefinition.titleSize) && Objects.equals(this.type, eventTimelineWidgetDefinition.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(query,tagsExecution,time,title,titleAlign,titleSize,type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventTimelineWidgetDefinition {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    tagsExecution: ").append(toIndentedString(tagsExecution)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
