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
import com.datadog.api.v1.client.model.TimeseriesWidgetDefinitionType;
import com.datadog.api.v1.client.model.TimeseriesWidgetRequest;
import com.datadog.api.v1.client.model.WidgetAxis;
import com.datadog.api.v1.client.model.WidgetEvent;
import com.datadog.api.v1.client.model.WidgetLegendSize;
import com.datadog.api.v1.client.model.WidgetMarker;
import com.datadog.api.v1.client.model.WidgetTextAlign;
import com.datadog.api.v1.client.model.WidgetTime;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The timeseries visualization allows you to display the evolution of one or more metrics, log events, or Analyzed Spans over time.
 */
@ApiModel(description = "The timeseries visualization allows you to display the evolution of one or more metrics, log events, or Analyzed Spans over time.")
@JsonPropertyOrder({
  TimeseriesWidgetDefinition.JSON_PROPERTY_EVENTS,
  TimeseriesWidgetDefinition.JSON_PROPERTY_LEGEND_SIZE,
  TimeseriesWidgetDefinition.JSON_PROPERTY_MARKERS,
  TimeseriesWidgetDefinition.JSON_PROPERTY_REQUESTS,
  TimeseriesWidgetDefinition.JSON_PROPERTY_SHOW_LEGEND,
  TimeseriesWidgetDefinition.JSON_PROPERTY_TIME,
  TimeseriesWidgetDefinition.JSON_PROPERTY_TITLE,
  TimeseriesWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  TimeseriesWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  TimeseriesWidgetDefinition.JSON_PROPERTY_TYPE,
  TimeseriesWidgetDefinition.JSON_PROPERTY_YAXIS
})

public class TimeseriesWidgetDefinition {
  public static final String JSON_PROPERTY_EVENTS = "events";
  private List<WidgetEvent> events = null;

  public static final String JSON_PROPERTY_LEGEND_SIZE = "legend_size";
  private WidgetLegendSize legendSize;

  public static final String JSON_PROPERTY_MARKERS = "markers";
  private List<WidgetMarker> markers = null;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<TimeseriesWidgetRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_SHOW_LEGEND = "show_legend";
  private Boolean showLegend;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TimeseriesWidgetDefinitionType type = TimeseriesWidgetDefinitionType.TIMESERIES;

  public static final String JSON_PROPERTY_YAXIS = "yaxis";
  private WidgetAxis yaxis;


  public TimeseriesWidgetDefinition events(List<WidgetEvent> events) {
    
    this.events = events;
    return this;
  }

  public TimeseriesWidgetDefinition addEventsItem(WidgetEvent eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * List of widget events.
   * @return events
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of widget events.")
  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WidgetEvent> getEvents() {
    return events;
  }


  public void setEvents(List<WidgetEvent> events) {
    this.events = events;
  }


  public TimeseriesWidgetDefinition legendSize(WidgetLegendSize legendSize) {
    
    this.legendSize = legendSize;
    return this;
  }

   /**
   * Get legendSize
   * @return legendSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEGEND_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WidgetLegendSize getLegendSize() {
    return legendSize;
  }


  public void setLegendSize(WidgetLegendSize legendSize) {
    this.legendSize = legendSize;
  }


  public TimeseriesWidgetDefinition markers(List<WidgetMarker> markers) {
    
    this.markers = markers;
    return this;
  }

  public TimeseriesWidgetDefinition addMarkersItem(WidgetMarker markersItem) {
    if (this.markers == null) {
      this.markers = new ArrayList<>();
    }
    this.markers.add(markersItem);
    return this;
  }

   /**
   * List of markers.
   * @return markers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of markers.")
  @JsonProperty(JSON_PROPERTY_MARKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WidgetMarker> getMarkers() {
    return markers;
  }


  public void setMarkers(List<WidgetMarker> markers) {
    this.markers = markers;
  }


  public TimeseriesWidgetDefinition requests(List<TimeseriesWidgetRequest> requests) {
    
    this.requests = requests;
    return this;
  }

  public TimeseriesWidgetDefinition addRequestsItem(TimeseriesWidgetRequest requestsItem) {
    this.requests.add(requestsItem);
    return this;
  }

   /**
   * List of timeseries widget requests.
   * @return requests
  **/
  @ApiModelProperty(example = "[{\"q/apm_query/log_query\":\"<METRIC_1>{<SCOPE_1>}\"}]", required = true, value = "List of timeseries widget requests.")
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<TimeseriesWidgetRequest> getRequests() {
    return requests;
  }


  public void setRequests(List<TimeseriesWidgetRequest> requests) {
    this.requests = requests;
  }


  public TimeseriesWidgetDefinition showLegend(Boolean showLegend) {
    
    this.showLegend = showLegend;
    return this;
  }

   /**
   * (screenboard only) Show the legend for this widget.
   * @return showLegend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "(screenboard only) Show the legend for this widget.")
  @JsonProperty(JSON_PROPERTY_SHOW_LEGEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShowLegend() {
    return showLegend;
  }


  public void setShowLegend(Boolean showLegend) {
    this.showLegend = showLegend;
  }


  public TimeseriesWidgetDefinition time(WidgetTime time) {
    
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


  public TimeseriesWidgetDefinition title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title of your widget.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title of your widget.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public TimeseriesWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
    
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


  public TimeseriesWidgetDefinition titleSize(String titleSize) {
    
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


  public TimeseriesWidgetDefinition type(TimeseriesWidgetDefinitionType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TimeseriesWidgetDefinitionType getType() {
    return type;
  }


  public void setType(TimeseriesWidgetDefinitionType type) {
    this.type = type;
  }


  public TimeseriesWidgetDefinition yaxis(WidgetAxis yaxis) {
    
    this.yaxis = yaxis;
    return this;
  }

   /**
   * Get yaxis
   * @return yaxis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_YAXIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WidgetAxis getYaxis() {
    return yaxis;
  }


  public void setYaxis(WidgetAxis yaxis) {
    this.yaxis = yaxis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesWidgetDefinition timeseriesWidgetDefinition = (TimeseriesWidgetDefinition) o;
    return Objects.equals(this.events, timeseriesWidgetDefinition.events) &&
        Objects.equals(this.legendSize, timeseriesWidgetDefinition.legendSize) &&
        Objects.equals(this.markers, timeseriesWidgetDefinition.markers) &&
        Objects.equals(this.requests, timeseriesWidgetDefinition.requests) &&
        Objects.equals(this.showLegend, timeseriesWidgetDefinition.showLegend) &&
        Objects.equals(this.time, timeseriesWidgetDefinition.time) &&
        Objects.equals(this.title, timeseriesWidgetDefinition.title) &&
        Objects.equals(this.titleAlign, timeseriesWidgetDefinition.titleAlign) &&
        Objects.equals(this.titleSize, timeseriesWidgetDefinition.titleSize) &&
        Objects.equals(this.type, timeseriesWidgetDefinition.type) &&
        Objects.equals(this.yaxis, timeseriesWidgetDefinition.yaxis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, legendSize, markers, requests, showLegend, time, title, titleAlign, titleSize, type, yaxis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesWidgetDefinition {\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    legendSize: ").append(toIndentedString(legendSize)).append("\n");
    sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    showLegend: ").append(toIndentedString(showLegend)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    yaxis: ").append(toIndentedString(yaxis)).append("\n");
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

