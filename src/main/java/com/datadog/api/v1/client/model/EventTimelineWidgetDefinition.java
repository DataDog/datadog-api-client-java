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
import com.datadog.api.v1.client.model.WidgetTextAlign;
import com.datadog.api.v1.client.model.WidgetTime;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.datadog.api.v1.client.model.WidgetDefinition;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The event timeline is a widget version of the timeline that appears at the top of the Event Stream view. Only available on FREE layout dashboards.
 */
@ApiModel(description = "The event timeline is a widget version of the timeline that appears at the top of the Event Stream view. Only available on FREE layout dashboards.")
@JsonPropertyOrder({
  EventTimelineWidgetDefinition.JSON_PROPERTY_QUERY,
  EventTimelineWidgetDefinition.JSON_PROPERTY_TAGS_EXECUTION,
  EventTimelineWidgetDefinition.JSON_PROPERTY_TIME,
  EventTimelineWidgetDefinition.JSON_PROPERTY_TITLE,
  EventTimelineWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  EventTimelineWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  EventTimelineWidgetDefinition.JSON_PROPERTY_TYPE
})

public class EventTimelineWidgetDefinition implements WidgetDefinition {
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
  private String type = "event_timeline";


  public EventTimelineWidgetDefinition query(String query) {
    
    this.query = query;
    return this;
  }

   /**
   * Query to filter the event timeline with.
   * @return query
  **/
  @ApiModelProperty(required = true, value = "Query to filter the event timeline with.")
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

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
   * The execution method for multi-value filters. Can be either and or or.
   * @return tagsExecution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The execution method for multi-value filters. Can be either and or or.")
  @JsonProperty(JSON_PROPERTY_TAGS_EXECUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTagsExecution() {
    return tagsExecution;
  }


  public void setTagsExecution(String tagsExecution) {
    this.tagsExecution = tagsExecution;
  }


  public EventTimelineWidgetDefinition time(WidgetTime time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
   * Title of the widget.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title of the widget.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public EventTimelineWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
    
    this.titleAlign = titleAlign;
    return this;
  }

   /**
   * Get titleAlign
   * @return titleAlign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TITLE_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WidgetTextAlign getTitleAlign() {
    return titleAlign;
  }


  public void setTitleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
  }


  public EventTimelineWidgetDefinition titleSize(String titleSize) {
    
    this.titleSize = titleSize;
    return this;
  }

   /**
   * Size of the title.
   * @return titleSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Size of the title.")
  @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitleSize() {
    return titleSize;
  }


  public void setTitleSize(String titleSize) {
    this.titleSize = titleSize;
  }


   /**
   * Type of the widget.
   * @return type
  **/
  @ApiModelProperty(example = "event_timeline", required = true, value = "Type of the widget.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventTimelineWidgetDefinition eventTimelineWidgetDefinition = (EventTimelineWidgetDefinition) o;
    return Objects.equals(this.query, eventTimelineWidgetDefinition.query) &&
        Objects.equals(this.tagsExecution, eventTimelineWidgetDefinition.tagsExecution) &&
        Objects.equals(this.time, eventTimelineWidgetDefinition.time) &&
        Objects.equals(this.title, eventTimelineWidgetDefinition.title) &&
        Objects.equals(this.titleAlign, eventTimelineWidgetDefinition.titleAlign) &&
        Objects.equals(this.titleSize, eventTimelineWidgetDefinition.titleSize) &&
        Objects.equals(this.type, eventTimelineWidgetDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, tagsExecution, time, title, titleAlign, titleSize, type);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

