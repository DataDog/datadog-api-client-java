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
  HeatmapBackendDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  HeatmapBackendDefinition.JSON_PROPERTY_DESCRIPTION,
  HeatmapBackendDefinition.JSON_PROPERTY_EVENTS,
  HeatmapBackendDefinition.JSON_PROPERTY_LEGEND_COLUMNS,
  HeatmapBackendDefinition.JSON_PROPERTY_LEGEND_LAYOUT,
  HeatmapBackendDefinition.JSON_PROPERTY_LEGEND_SIZE,
  HeatmapBackendDefinition.JSON_PROPERTY_MARKERS,
  HeatmapBackendDefinition.JSON_PROPERTY_NOTES,
  HeatmapBackendDefinition.JSON_PROPERTY_REQUESTS,
  HeatmapBackendDefinition.JSON_PROPERTY_SHOW_LEGEND,
  HeatmapBackendDefinition.JSON_PROPERTY_TIME,
  HeatmapBackendDefinition.JSON_PROPERTY_TITLE,
  HeatmapBackendDefinition.JSON_PROPERTY_TITLE_ALIGN,
  HeatmapBackendDefinition.JSON_PROPERTY_TITLE_SIZE,
  HeatmapBackendDefinition.JSON_PROPERTY_TYPE,
  HeatmapBackendDefinition.JSON_PROPERTY_XAXIS,
  HeatmapBackendDefinition.JSON_PROPERTY_YAXIS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatmapBackendDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EVENTS = "events";
  private List<LegacyEventOverlayQuery> events = null;

  public static final String JSON_PROPERTY_LEGEND_COLUMNS = "legend_columns";
  private List<TimeseriesWidgetLegendColumn> legendColumns = null;

  public static final String JSON_PROPERTY_LEGEND_LAYOUT = "legend_layout";
  private HeatmapBackendDefinitionLegendLayout legendLayout;

  public static final String JSON_PROPERTY_LEGEND_SIZE = "legend_size";
  private String legendSize;

  public static final String JSON_PROPERTY_MARKERS = "markers";
  private List<WidgetMarker> markers = null;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<HeatmapBackendRequest> requests = new ArrayList<>();

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
  private HeatmapBackendDefinitionType type;

  public static final String JSON_PROPERTY_XAXIS = "xaxis";
  private HeatmapXAxis xaxis;

  public static final String JSON_PROPERTY_YAXIS = "yaxis";
  private HeatmapBackendDefinitionYaxis yaxis;

  public HeatmapBackendDefinition() {}

  @JsonCreator
  public HeatmapBackendDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS)
          List<HeatmapBackendRequest> requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          HeatmapBackendDefinitionType type) {
    this.requests = requests;
    for (HeatmapBackendRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public HeatmapBackendDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    if (customLinks != null) {
      for (WidgetCustomLink item : customLinks) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public HeatmapBackendDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
    if (this.customLinks == null) {
      this.customLinks = new ArrayList<>();
    }
    this.customLinks.add(customLinksItem);
    this.unparsed |= customLinksItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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
    if (customLinks != null) {
      for (WidgetCustomLink item : customLinks) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public HeatmapBackendDefinition description(String description) {
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

  public HeatmapBackendDefinition events(List<LegacyEventOverlayQuery> events) {
    this.events = events;
    if (events != null) {
      for (LegacyEventOverlayQuery item : events) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public HeatmapBackendDefinition addEventsItem(LegacyEventOverlayQuery eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    this.unparsed |= eventsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return events
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LegacyEventOverlayQuery> getEvents() {
    return events;
  }

  public void setEvents(List<LegacyEventOverlayQuery> events) {
    this.events = events;
    if (events != null) {
      for (LegacyEventOverlayQuery item : events) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public HeatmapBackendDefinition legendColumns(List<TimeseriesWidgetLegendColumn> legendColumns) {
    this.legendColumns = legendColumns;
    return this;
  }

  public HeatmapBackendDefinition addLegendColumnsItem(
      TimeseriesWidgetLegendColumn legendColumnsItem) {
    if (this.legendColumns == null) {
      this.legendColumns = new ArrayList<>();
    }
    this.legendColumns.add(legendColumnsItem);
    this.unparsed |= !legendColumnsItem.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public HeatmapBackendDefinition legendLayout(HeatmapBackendDefinitionLegendLayout legendLayout) {
    this.legendLayout = legendLayout;
    this.unparsed |= !legendLayout.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return legendLayout
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEGEND_LAYOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HeatmapBackendDefinitionLegendLayout getLegendLayout() {
    return legendLayout;
  }

  public void setLegendLayout(HeatmapBackendDefinitionLegendLayout legendLayout) {
    if (!legendLayout.isValid()) {
      this.unparsed = true;
    }
    this.legendLayout = legendLayout;
  }

  public HeatmapBackendDefinition legendSize(String legendSize) {
    this.legendSize = legendSize;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public HeatmapBackendDefinition markers(List<WidgetMarker> markers) {
    this.markers = markers;
    if (markers != null) {
      for (WidgetMarker item : markers) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public HeatmapBackendDefinition addMarkersItem(WidgetMarker markersItem) {
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
  public List<WidgetMarker> getMarkers() {
    return markers;
  }

  public void setMarkers(List<WidgetMarker> markers) {
    this.markers = markers;
    if (markers != null) {
      for (WidgetMarker item : markers) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public HeatmapBackendDefinition notes(String notes) {
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

  public HeatmapBackendDefinition requests(List<HeatmapBackendRequest> requests) {
    this.requests = requests;
    for (HeatmapBackendRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public HeatmapBackendDefinition addRequestsItem(HeatmapBackendRequest requestsItem) {
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
  public List<HeatmapBackendRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<HeatmapBackendRequest> requests) {
    this.requests = requests;
    if (requests != null) {
      for (HeatmapBackendRequest item : requests) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public HeatmapBackendDefinition showLegend(Boolean showLegend) {
    this.showLegend = showLegend;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public HeatmapBackendDefinition time(WidgetTime time) {
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

  public HeatmapBackendDefinition title(String title) {
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

  public HeatmapBackendDefinition titleAlign(WidgetTextAlign titleAlign) {
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

  public HeatmapBackendDefinition titleSize(String titleSize) {
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

  public HeatmapBackendDefinition type(HeatmapBackendDefinitionType type) {
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
  public HeatmapBackendDefinitionType getType() {
    return type;
  }

  public void setType(HeatmapBackendDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public HeatmapBackendDefinition xaxis(HeatmapXAxis xaxis) {
    this.xaxis = xaxis;
    this.unparsed |= xaxis.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return xaxis
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_XAXIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HeatmapXAxis getXaxis() {
    return xaxis;
  }

  public void setXaxis(HeatmapXAxis xaxis) {
    this.xaxis = xaxis;
    if (xaxis != null) {
      this.unparsed |= xaxis.unparsed;
    }
  }

  public HeatmapBackendDefinition yaxis(HeatmapBackendDefinitionYaxis yaxis) {
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
  public HeatmapBackendDefinitionYaxis getYaxis() {
    return yaxis;
  }

  public void setYaxis(HeatmapBackendDefinitionYaxis yaxis) {
    this.yaxis = yaxis;
    if (yaxis != null) {
      this.unparsed |= yaxis.unparsed;
    }
  }

  /** Return true if this HeatmapBackendDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatmapBackendDefinition heatmapBackendDefinition = (HeatmapBackendDefinition) o;
    return Objects.equals(this.customLinks, heatmapBackendDefinition.customLinks)
        && Objects.equals(this.description, heatmapBackendDefinition.description)
        && Objects.equals(this.events, heatmapBackendDefinition.events)
        && Objects.equals(this.legendColumns, heatmapBackendDefinition.legendColumns)
        && Objects.equals(this.legendLayout, heatmapBackendDefinition.legendLayout)
        && Objects.equals(this.legendSize, heatmapBackendDefinition.legendSize)
        && Objects.equals(this.markers, heatmapBackendDefinition.markers)
        && Objects.equals(this.notes, heatmapBackendDefinition.notes)
        && Objects.equals(this.requests, heatmapBackendDefinition.requests)
        && Objects.equals(this.showLegend, heatmapBackendDefinition.showLegend)
        && Objects.equals(this.time, heatmapBackendDefinition.time)
        && Objects.equals(this.title, heatmapBackendDefinition.title)
        && Objects.equals(this.titleAlign, heatmapBackendDefinition.titleAlign)
        && Objects.equals(this.titleSize, heatmapBackendDefinition.titleSize)
        && Objects.equals(this.type, heatmapBackendDefinition.type)
        && Objects.equals(this.xaxis, heatmapBackendDefinition.xaxis)
        && Objects.equals(this.yaxis, heatmapBackendDefinition.yaxis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        customLinks,
        description,
        events,
        legendColumns,
        legendLayout,
        legendSize,
        markers,
        notes,
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
    sb.append("class HeatmapBackendDefinition {\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    legendColumns: ").append(toIndentedString(legendColumns)).append("\n");
    sb.append("    legendLayout: ").append(toIndentedString(legendLayout)).append("\n");
    sb.append("    legendSize: ").append(toIndentedString(legendSize)).append("\n");
    sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    showLegend: ").append(toIndentedString(showLegend)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    xaxis: ").append(toIndentedString(xaxis)).append("\n");
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
