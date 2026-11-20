/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  PointPlotBackendDefinition.JSON_PROPERTY_DESCRIPTION,
  PointPlotBackendDefinition.JSON_PROPERTY_LEGEND,
  PointPlotBackendDefinition.JSON_PROPERTY_MARKERS,
  PointPlotBackendDefinition.JSON_PROPERTY_NOTES,
  PointPlotBackendDefinition.JSON_PROPERTY_REQUESTS,
  PointPlotBackendDefinition.JSON_PROPERTY_TIME,
  PointPlotBackendDefinition.JSON_PROPERTY_TITLE,
  PointPlotBackendDefinition.JSON_PROPERTY_TITLE_ALIGN,
  PointPlotBackendDefinition.JSON_PROPERTY_TITLE_SIZE,
  PointPlotBackendDefinition.JSON_PROPERTY_TYPE,
  PointPlotBackendDefinition.JSON_PROPERTY_YAXIS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PointPlotBackendDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LEGEND = "legend";
  private ScatterPlotLegendType legend;

  public static final String JSON_PROPERTY_MARKERS = "markers";
  private List<Marker> markers = null;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<PointPlotDataProjectionRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private PointPlotBackendDefinitionType type;

  public static final String JSON_PROPERTY_YAXIS = "yaxis";
  private Axis yaxis;

  public PointPlotBackendDefinition() {}

  @JsonCreator
  public PointPlotBackendDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS)
          List<PointPlotDataProjectionRequest> requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          PointPlotBackendDefinitionType type) {
    this.requests = requests;
    for (PointPlotDataProjectionRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public PointPlotBackendDefinition description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PointPlotBackendDefinition legend(ScatterPlotLegendType legend) {
    this.legend = legend;
    this.unparsed |= legend.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return legend
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEGEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ScatterPlotLegendType getLegend() {
    return legend;
  }

  public void setLegend(ScatterPlotLegendType legend) {
    this.legend = legend;
    if (legend != null) {
      this.unparsed |= legend.unparsed;
    }
  }

  public PointPlotBackendDefinition markers(List<Marker> markers) {
    this.markers = markers;
    if (markers != null) {
      for (Marker item : markers) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public PointPlotBackendDefinition addMarkersItem(Marker markersItem) {
    if (this.markers == null) {
      this.markers = new ArrayList<>();
    }
    this.markers.add(markersItem);
    this.unparsed |= markersItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return markers
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MARKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Marker> getMarkers() {
    return markers;
  }

  public void setMarkers(List<Marker> markers) {
    this.markers = markers;
    if (markers != null) {
      for (Marker item : markers) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public PointPlotBackendDefinition notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return notes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public PointPlotBackendDefinition requests(List<PointPlotDataProjectionRequest> requests) {
    this.requests = requests;
    for (PointPlotDataProjectionRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public PointPlotBackendDefinition addRequestsItem(PointPlotDataProjectionRequest requestsItem) {
    this.requests.add(requestsItem);
    this.unparsed |= requestsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return requests
   */
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<PointPlotDataProjectionRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<PointPlotDataProjectionRequest> requests) {
    this.requests = requests;
    if (requests != null) {
      for (PointPlotDataProjectionRequest item : requests) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public PointPlotBackendDefinition time(WidgetTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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
    if (time != null) {
      this.unparsed |= time.unparsed;
    }
  }

  public PointPlotBackendDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public PointPlotBackendDefinition titleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
    this.unparsed |= !titleAlign.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public PointPlotBackendDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public PointPlotBackendDefinition type(PointPlotBackendDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public PointPlotBackendDefinitionType getType() {
    return type;
  }

  public void setType(PointPlotBackendDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public PointPlotBackendDefinition yaxis(Axis yaxis) {
    this.yaxis = yaxis;
    this.unparsed |= yaxis.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return yaxis
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_YAXIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Axis getYaxis() {
    return yaxis;
  }

  public void setYaxis(Axis yaxis) {
    this.yaxis = yaxis;
    if (yaxis != null) {
      this.unparsed |= yaxis.unparsed;
    }
  }

  /** Return true if this PointPlotBackendDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointPlotBackendDefinition pointPlotBackendDefinition = (PointPlotBackendDefinition) o;
    return Objects.equals(this.description, pointPlotBackendDefinition.description)
        && Objects.equals(this.legend, pointPlotBackendDefinition.legend)
        && Objects.equals(this.markers, pointPlotBackendDefinition.markers)
        && Objects.equals(this.notes, pointPlotBackendDefinition.notes)
        && Objects.equals(this.requests, pointPlotBackendDefinition.requests)
        && Objects.equals(this.time, pointPlotBackendDefinition.time)
        && Objects.equals(this.title, pointPlotBackendDefinition.title)
        && Objects.equals(this.titleAlign, pointPlotBackendDefinition.titleAlign)
        && Objects.equals(this.titleSize, pointPlotBackendDefinition.titleSize)
        && Objects.equals(this.type, pointPlotBackendDefinition.type)
        && Objects.equals(this.yaxis, pointPlotBackendDefinition.yaxis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description,
        legend,
        markers,
        notes,
        requests,
        time,
        title,
        titleAlign,
        titleSize,
        type,
        yaxis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointPlotBackendDefinition {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    legend: ").append(toIndentedString(legend)).append("\n");
    sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    yaxis: ").append(toIndentedString(yaxis)).append("\n");
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
