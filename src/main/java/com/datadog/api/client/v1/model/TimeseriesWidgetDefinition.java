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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * The timeseries visualization allows you to display the evolution of one or more metrics, log
 * events, or Indexed Spans over time.
 */
@JsonPropertyOrder({
  TimeseriesWidgetDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  TimeseriesWidgetDefinition.JSON_PROPERTY_EVENTS,
  TimeseriesWidgetDefinition.JSON_PROPERTY_LEGEND_COLUMNS,
  TimeseriesWidgetDefinition.JSON_PROPERTY_LEGEND_LAYOUT,
  TimeseriesWidgetDefinition.JSON_PROPERTY_LEGEND_SIZE,
  TimeseriesWidgetDefinition.JSON_PROPERTY_MARKERS,
  TimeseriesWidgetDefinition.JSON_PROPERTY_REQUESTS,
  TimeseriesWidgetDefinition.JSON_PROPERTY_RIGHT_YAXIS,
  TimeseriesWidgetDefinition.JSON_PROPERTY_SHOW_LEGEND,
  TimeseriesWidgetDefinition.JSON_PROPERTY_TIME,
  TimeseriesWidgetDefinition.JSON_PROPERTY_TITLE,
  TimeseriesWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  TimeseriesWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  TimeseriesWidgetDefinition.JSON_PROPERTY_TYPE,
  TimeseriesWidgetDefinition.JSON_PROPERTY_YAXIS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesWidgetDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_EVENTS = "events";
  private List<WidgetEvent> events = null;

  public static final String JSON_PROPERTY_LEGEND_COLUMNS = "legend_columns";
  private List<TimeseriesWidgetLegendColumn> legendColumns = null;

  public static final String JSON_PROPERTY_LEGEND_LAYOUT = "legend_layout";
  private TimeseriesWidgetLegendLayout legendLayout;

  public static final String JSON_PROPERTY_LEGEND_SIZE = "legend_size";
  private String legendSize;

  public static final String JSON_PROPERTY_MARKERS = "markers";
  private List<WidgetMarker> markers = null;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<TimeseriesWidgetRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_RIGHT_YAXIS = "right_yaxis";
  private WidgetAxis rightYaxis;

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

  public TimeseriesWidgetDefinition() {}

  @JsonCreator
  public TimeseriesWidgetDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS)
          List<TimeseriesWidgetRequest> requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          TimeseriesWidgetDefinitionType type) {
    this.requests = requests;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public TimeseriesWidgetDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    for (WidgetCustomLink item : customLinks) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TimeseriesWidgetDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
    if (this.customLinks == null) {
      this.customLinks = new ArrayList<>();
    }
    this.customLinks.add(customLinksItem);
    this.unparsed |= customLinksItem.unparsed;
    return this;
  }

  /**
   * List of custom links.
   *
   * @return customLinks
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<WidgetCustomLink> getCustomLinks() {
    return customLinks;
  }

  public void setCustomLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
  }

  public TimeseriesWidgetDefinition events(List<WidgetEvent> events) {
    this.events = events;
    for (WidgetEvent item : events) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TimeseriesWidgetDefinition addEventsItem(WidgetEvent eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    this.unparsed |= eventsItem.unparsed;
    return this;
  }

  /**
   * List of widget events. Deprecated - Use <code>overlay</code> request type instead.
   *
   * @return events
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<WidgetEvent> getEvents() {
    return events;
  }

  @Deprecated
  public void setEvents(List<WidgetEvent> events) {
    this.events = events;
  }

  public TimeseriesWidgetDefinition legendColumns(
      List<TimeseriesWidgetLegendColumn> legendColumns) {
    this.legendColumns = legendColumns;
    return this;
  }

  public TimeseriesWidgetDefinition addLegendColumnsItem(
      TimeseriesWidgetLegendColumn legendColumnsItem) {
    if (this.legendColumns == null) {
      this.legendColumns = new ArrayList<>();
    }
    this.legendColumns.add(legendColumnsItem);
    this.unparsed |= !legendColumnsItem.isValid();
    return this;
  }

  /**
   * Columns displayed in the legend.
   *
   * @return legendColumns
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEGEND_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TimeseriesWidgetLegendColumn> getLegendColumns() {
    return legendColumns;
  }

  public void setLegendColumns(List<TimeseriesWidgetLegendColumn> legendColumns) {
    this.legendColumns = legendColumns;
  }

  public TimeseriesWidgetDefinition legendLayout(TimeseriesWidgetLegendLayout legendLayout) {
    this.legendLayout = legendLayout;
    this.unparsed |= !legendLayout.isValid();
    return this;
  }

  /**
   * Layout of the legend.
   *
   * @return legendLayout
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEGEND_LAYOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TimeseriesWidgetLegendLayout getLegendLayout() {
    return legendLayout;
  }

  public void setLegendLayout(TimeseriesWidgetLegendLayout legendLayout) {
    if (!legendLayout.isValid()) {
      this.unparsed = true;
    }
    this.legendLayout = legendLayout;
  }

  public TimeseriesWidgetDefinition legendSize(String legendSize) {
    this.legendSize = legendSize;
    return this;
  }

  /**
   * Available legend sizes for a widget. Should be one of "0", "2", "4", "8", "16", or "auto".
   *
   * @return legendSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEGEND_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLegendSize() {
    return legendSize;
  }

  public void setLegendSize(String legendSize) {
    this.legendSize = legendSize;
  }

  public TimeseriesWidgetDefinition markers(List<WidgetMarker> markers) {
    this.markers = markers;
    for (WidgetMarker item : markers) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TimeseriesWidgetDefinition addMarkersItem(WidgetMarker markersItem) {
    if (this.markers == null) {
      this.markers = new ArrayList<>();
    }
    this.markers.add(markersItem);
    this.unparsed |= markersItem.unparsed;
    return this;
  }

  /**
   * List of markers.
   *
   * @return markers
   */
  @jakarta.annotation.Nullable
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
    for (TimeseriesWidgetRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TimeseriesWidgetDefinition addRequestsItem(TimeseriesWidgetRequest requestsItem) {
    this.requests.add(requestsItem);
    this.unparsed |= requestsItem.unparsed;
    return this;
  }

  /**
   * List of timeseries widget requests.
   *
   * @return requests
   */
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TimeseriesWidgetRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<TimeseriesWidgetRequest> requests) {
    this.requests = requests;
  }

  public TimeseriesWidgetDefinition rightYaxis(WidgetAxis rightYaxis) {
    this.rightYaxis = rightYaxis;
    this.unparsed |= rightYaxis.unparsed;
    return this;
  }

  /**
   * Axis controls for the widget.
   *
   * @return rightYaxis
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RIGHT_YAXIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetAxis getRightYaxis() {
    return rightYaxis;
  }

  public void setRightYaxis(WidgetAxis rightYaxis) {
    this.rightYaxis = rightYaxis;
  }

  public TimeseriesWidgetDefinition showLegend(Boolean showLegend) {
    this.showLegend = showLegend;
    return this;
  }

  /**
   * (screenboard only) Show the legend for this widget.
   *
   * @return showLegend
   */
  @jakarta.annotation.Nullable
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

  public TimeseriesWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of your widget.
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

  public TimeseriesWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
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

  public TimeseriesWidgetDefinition titleSize(String titleSize) {
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

  public TimeseriesWidgetDefinition type(TimeseriesWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the timeseries widget.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TimeseriesWidgetDefinitionType getType() {
    return type;
  }

  public void setType(TimeseriesWidgetDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public TimeseriesWidgetDefinition yaxis(WidgetAxis yaxis) {
    this.yaxis = yaxis;
    this.unparsed |= yaxis.unparsed;
    return this;
  }

  /**
   * Axis controls for the widget.
   *
   * @return yaxis
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_YAXIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetAxis getYaxis() {
    return yaxis;
  }

  public void setYaxis(WidgetAxis yaxis) {
    this.yaxis = yaxis;
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
   * @return TimeseriesWidgetDefinition
   */
  @JsonAnySetter
  public TimeseriesWidgetDefinition putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TimeseriesWidgetDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesWidgetDefinition timeseriesWidgetDefinition = (TimeseriesWidgetDefinition) o;
    return Objects.equals(this.customLinks, timeseriesWidgetDefinition.customLinks)
        && Objects.equals(this.events, timeseriesWidgetDefinition.events)
        && Objects.equals(this.legendColumns, timeseriesWidgetDefinition.legendColumns)
        && Objects.equals(this.legendLayout, timeseriesWidgetDefinition.legendLayout)
        && Objects.equals(this.legendSize, timeseriesWidgetDefinition.legendSize)
        && Objects.equals(this.markers, timeseriesWidgetDefinition.markers)
        && Objects.equals(this.requests, timeseriesWidgetDefinition.requests)
        && Objects.equals(this.rightYaxis, timeseriesWidgetDefinition.rightYaxis)
        && Objects.equals(this.showLegend, timeseriesWidgetDefinition.showLegend)
        && Objects.equals(this.time, timeseriesWidgetDefinition.time)
        && Objects.equals(this.title, timeseriesWidgetDefinition.title)
        && Objects.equals(this.titleAlign, timeseriesWidgetDefinition.titleAlign)
        && Objects.equals(this.titleSize, timeseriesWidgetDefinition.titleSize)
        && Objects.equals(this.type, timeseriesWidgetDefinition.type)
        && Objects.equals(this.yaxis, timeseriesWidgetDefinition.yaxis)
        && Objects.equals(
            this.additionalProperties, timeseriesWidgetDefinition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        customLinks,
        events,
        legendColumns,
        legendLayout,
        legendSize,
        markers,
        requests,
        rightYaxis,
        showLegend,
        time,
        title,
        titleAlign,
        titleSize,
        type,
        yaxis,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesWidgetDefinition {\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    legendColumns: ").append(toIndentedString(legendColumns)).append("\n");
    sb.append("    legendLayout: ").append(toIndentedString(legendLayout)).append("\n");
    sb.append("    legendSize: ").append(toIndentedString(legendSize)).append("\n");
    sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    rightYaxis: ").append(toIndentedString(rightYaxis)).append("\n");
    sb.append("    showLegend: ").append(toIndentedString(showLegend)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    yaxis: ").append(toIndentedString(yaxis)).append("\n");
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
