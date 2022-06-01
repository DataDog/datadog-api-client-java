/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The Distribution visualization is another way of showing metrics aggregated across one or several
 * tags, such as hosts. Unlike the heat map, a distribution graph’s x-axis is quantity rather than
 * time.
 */
@JsonPropertyOrder({
  DistributionWidgetDefinition.JSON_PROPERTY_LEGEND_SIZE,
  DistributionWidgetDefinition.JSON_PROPERTY_MARKERS,
  DistributionWidgetDefinition.JSON_PROPERTY_REQUESTS,
  DistributionWidgetDefinition.JSON_PROPERTY_SHOW_LEGEND,
  DistributionWidgetDefinition.JSON_PROPERTY_TIME,
  DistributionWidgetDefinition.JSON_PROPERTY_TITLE,
  DistributionWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  DistributionWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  DistributionWidgetDefinition.JSON_PROPERTY_TYPE,
  DistributionWidgetDefinition.JSON_PROPERTY_XAXIS,
  DistributionWidgetDefinition.JSON_PROPERTY_YAXIS
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DistributionWidgetDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LEGEND_SIZE = "legend_size";
  private String legendSize;

  public static final String JSON_PROPERTY_MARKERS = "markers";
  private List<WidgetMarker> markers = null;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<DistributionWidgetRequest> requests = new ArrayList<>();

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
  private DistributionWidgetDefinitionType type = DistributionWidgetDefinitionType.DISTRIBUTION;

  public static final String JSON_PROPERTY_XAXIS = "xaxis";
  private DistributionWidgetXAxis xaxis;

  public static final String JSON_PROPERTY_YAXIS = "yaxis";
  private DistributionWidgetYAxis yaxis;

  public DistributionWidgetDefinition() {}

  @JsonCreator
  public DistributionWidgetDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS)
          List<DistributionWidgetRequest> requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          DistributionWidgetDefinitionType type) {
    this.requests = requests;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public DistributionWidgetDefinition legendSize(String legendSize) {
    this.legendSize = legendSize;
    return this;
  }

  /**
   * (Deprecated) The widget legend was replaced by a tooltip and sidebar.
   *
   * @return legendSize
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEGEND_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLegendSize() {
    return legendSize;
  }

  public void setLegendSize(String legendSize) {
    this.legendSize = legendSize;
  }

  public DistributionWidgetDefinition markers(List<WidgetMarker> markers) {
    this.markers = markers;
    for (WidgetMarker item : markers) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DistributionWidgetDefinition addMarkersItem(WidgetMarker markersItem) {
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
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MARKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<WidgetMarker> getMarkers() {
    return markers;
  }

  public void setMarkers(List<WidgetMarker> markers) {
    this.markers = markers;
  }

  public DistributionWidgetDefinition requests(List<DistributionWidgetRequest> requests) {
    this.requests = requests;
    for (DistributionWidgetRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DistributionWidgetDefinition addRequestsItem(DistributionWidgetRequest requestsItem) {
    this.requests.add(requestsItem);
    this.unparsed |= requestsItem.unparsed;
    return this;
  }

  /**
   * Array of one request object to display in the widget.
   *
   * <p>See the dedicated <a
   * href="https://docs.datadoghq.com/dashboards/graphing_json/request_json">Request JSON schema
   * documentation</a> to learn how to build the <code>REQUEST_SCHEMA</code>.
   *
   * @return requests
   */
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<DistributionWidgetRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<DistributionWidgetRequest> requests) {
    this.requests = requests;
  }

  public DistributionWidgetDefinition showLegend(Boolean showLegend) {
    this.showLegend = showLegend;
    return this;
  }

  /**
   * (Deprecated) The widget legend was replaced by a tooltip and sidebar.
   *
   * @return showLegend
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_LEGEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowLegend() {
    return showLegend;
  }

  public void setShowLegend(Boolean showLegend) {
    this.showLegend = showLegend;
  }

  public DistributionWidgetDefinition time(WidgetTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * Time setting for the widget.
   *
   * @return time
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTime getTime() {
    return time;
  }

  public void setTime(WidgetTime time) {
    this.time = time;
  }

  public DistributionWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the widget.
   *
   * @return title
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public DistributionWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
    this.unparsed |= !titleAlign.isValid();
    return this;
  }

  /**
   * How to align the text on the widget.
   *
   * @return titleAlign
   */
  @javax.annotation.Nullable
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

  public DistributionWidgetDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

  /**
   * Size of the title.
   *
   * @return titleSize
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitleSize() {
    return titleSize;
  }

  public void setTitleSize(String titleSize) {
    this.titleSize = titleSize;
  }

  public DistributionWidgetDefinition type(DistributionWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the distribution widget.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DistributionWidgetDefinitionType getType() {
    return type;
  }

  public void setType(DistributionWidgetDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public DistributionWidgetDefinition xaxis(DistributionWidgetXAxis xaxis) {
    this.xaxis = xaxis;
    this.unparsed |= xaxis.unparsed;
    return this;
  }

  /**
   * X Axis controls for the distribution widget.
   *
   * @return xaxis
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_XAXIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DistributionWidgetXAxis getXaxis() {
    return xaxis;
  }

  public void setXaxis(DistributionWidgetXAxis xaxis) {
    this.xaxis = xaxis;
  }

  public DistributionWidgetDefinition yaxis(DistributionWidgetYAxis yaxis) {
    this.yaxis = yaxis;
    this.unparsed |= yaxis.unparsed;
    return this;
  }

  /**
   * Y Axis controls for the distribution widget.
   *
   * @return yaxis
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_YAXIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DistributionWidgetYAxis getYaxis() {
    return yaxis;
  }

  public void setYaxis(DistributionWidgetYAxis yaxis) {
    this.yaxis = yaxis;
  }

  /** Return true if this DistributionWidgetDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionWidgetDefinition distributionWidgetDefinition = (DistributionWidgetDefinition) o;
    return Objects.equals(this.legendSize, distributionWidgetDefinition.legendSize)
        && Objects.equals(this.markers, distributionWidgetDefinition.markers)
        && Objects.equals(this.requests, distributionWidgetDefinition.requests)
        && Objects.equals(this.showLegend, distributionWidgetDefinition.showLegend)
        && Objects.equals(this.time, distributionWidgetDefinition.time)
        && Objects.equals(this.title, distributionWidgetDefinition.title)
        && Objects.equals(this.titleAlign, distributionWidgetDefinition.titleAlign)
        && Objects.equals(this.titleSize, distributionWidgetDefinition.titleSize)
        && Objects.equals(this.type, distributionWidgetDefinition.type)
        && Objects.equals(this.xaxis, distributionWidgetDefinition.xaxis)
        && Objects.equals(this.yaxis, distributionWidgetDefinition.yaxis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        legendSize,
        markers,
        requests,
        showLegend,
        time,
        title,
        titleAlign,
        titleSize,
        type,
        xaxis,
        yaxis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionWidgetDefinition {\n");
    sb.append("    legendSize: ").append(toIndentedString(legendSize)).append("\n");
    sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    showLegend: ").append(toIndentedString(showLegend)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    xaxis: ").append(toIndentedString(xaxis)).append("\n");
    sb.append("    yaxis: ").append(toIndentedString(yaxis)).append("\n");
    sb.append("}");
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
