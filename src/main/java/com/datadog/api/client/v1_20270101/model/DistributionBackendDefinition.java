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
  DistributionBackendDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  DistributionBackendDefinition.JSON_PROPERTY_DESCRIPTION,
  DistributionBackendDefinition.JSON_PROPERTY_LEGEND_COLUMNS,
  DistributionBackendDefinition.JSON_PROPERTY_LEGEND_LAYOUT,
  DistributionBackendDefinition.JSON_PROPERTY_LEGEND_SIZE,
  DistributionBackendDefinition.JSON_PROPERTY_MARKERS,
  DistributionBackendDefinition.JSON_PROPERTY_NOTES,
  DistributionBackendDefinition.JSON_PROPERTY_REQUESTS,
  DistributionBackendDefinition.JSON_PROPERTY_SHOW_LEGEND,
  DistributionBackendDefinition.JSON_PROPERTY_TIME,
  DistributionBackendDefinition.JSON_PROPERTY_TITLE,
  DistributionBackendDefinition.JSON_PROPERTY_TITLE_ALIGN,
  DistributionBackendDefinition.JSON_PROPERTY_TITLE_SIZE,
  DistributionBackendDefinition.JSON_PROPERTY_TYPE,
  DistributionBackendDefinition.JSON_PROPERTY_XAXIS,
  DistributionBackendDefinition.JSON_PROPERTY_YAXIS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DistributionBackendDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LEGEND_COLUMNS = "legend_columns";
  private List<TimeseriesWidgetLegendColumn> legendColumns = null;

  public static final String JSON_PROPERTY_LEGEND_LAYOUT = "legend_layout";
  private DistributionBackendDefinitionLegendLayout legendLayout;

  public static final String JSON_PROPERTY_LEGEND_SIZE = "legend_size";
  private String legendSize;

  public static final String JSON_PROPERTY_MARKERS = "markers";
  private List<WidgetMarker> markers = null;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<DistributionBackendRequest> requests = new ArrayList<>();

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
  private DistributionBackendDefinitionType type;

  public static final String JSON_PROPERTY_XAXIS = "xaxis";
  private DistributionXAxis xaxis;

  public static final String JSON_PROPERTY_YAXIS = "yaxis";
  private BackendDistributionYAxis yaxis;

  public DistributionBackendDefinition() {}

  @JsonCreator
  public DistributionBackendDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS)
          List<DistributionBackendRequest> requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          DistributionBackendDefinitionType type) {
    this.requests = requests;
    for (DistributionBackendRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public DistributionBackendDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    if (customLinks != null) {
      for (WidgetCustomLink item : customLinks) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public DistributionBackendDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
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

  public DistributionBackendDefinition description(String description) {
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

  public DistributionBackendDefinition legendColumns(
      List<TimeseriesWidgetLegendColumn> legendColumns) {
    this.legendColumns = legendColumns;
    return this;
  }

  public DistributionBackendDefinition addLegendColumnsItem(
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

  public DistributionBackendDefinition legendLayout(
      DistributionBackendDefinitionLegendLayout legendLayout) {
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
  public DistributionBackendDefinitionLegendLayout getLegendLayout() {
    return legendLayout;
  }

  public void setLegendLayout(DistributionBackendDefinitionLegendLayout legendLayout) {
    if (!legendLayout.isValid()) {
      this.unparsed = true;
    }
    this.legendLayout = legendLayout;
  }

  public DistributionBackendDefinition legendSize(String legendSize) {
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

  public DistributionBackendDefinition markers(List<WidgetMarker> markers) {
    this.markers = markers;
    if (markers != null) {
      for (WidgetMarker item : markers) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public DistributionBackendDefinition addMarkersItem(WidgetMarker markersItem) {
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

  public DistributionBackendDefinition notes(String notes) {
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

  public DistributionBackendDefinition requests(List<DistributionBackendRequest> requests) {
    this.requests = requests;
    for (DistributionBackendRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DistributionBackendDefinition addRequestsItem(DistributionBackendRequest requestsItem) {
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
  public List<DistributionBackendRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<DistributionBackendRequest> requests) {
    this.requests = requests;
    if (requests != null) {
      for (DistributionBackendRequest item : requests) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public DistributionBackendDefinition showLegend(Boolean showLegend) {
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

  public DistributionBackendDefinition time(WidgetTime time) {
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

  public DistributionBackendDefinition title(String title) {
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

  public DistributionBackendDefinition titleAlign(WidgetTextAlign titleAlign) {
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

  public DistributionBackendDefinition titleSize(String titleSize) {
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

  public DistributionBackendDefinition type(DistributionBackendDefinitionType type) {
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
  public DistributionBackendDefinitionType getType() {
    return type;
  }

  public void setType(DistributionBackendDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public DistributionBackendDefinition xaxis(DistributionXAxis xaxis) {
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
  public DistributionXAxis getXaxis() {
    return xaxis;
  }

  public void setXaxis(DistributionXAxis xaxis) {
    this.xaxis = xaxis;
    if (xaxis != null) {
      this.unparsed |= xaxis.unparsed;
    }
  }

  public DistributionBackendDefinition yaxis(BackendDistributionYAxis yaxis) {
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
  public BackendDistributionYAxis getYaxis() {
    return yaxis;
  }

  public void setYaxis(BackendDistributionYAxis yaxis) {
    this.yaxis = yaxis;
    if (yaxis != null) {
      this.unparsed |= yaxis.unparsed;
    }
  }

  /** Return true if this DistributionBackendDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionBackendDefinition distributionBackendDefinition = (DistributionBackendDefinition) o;
    return Objects.equals(this.customLinks, distributionBackendDefinition.customLinks)
        && Objects.equals(this.description, distributionBackendDefinition.description)
        && Objects.equals(this.legendColumns, distributionBackendDefinition.legendColumns)
        && Objects.equals(this.legendLayout, distributionBackendDefinition.legendLayout)
        && Objects.equals(this.legendSize, distributionBackendDefinition.legendSize)
        && Objects.equals(this.markers, distributionBackendDefinition.markers)
        && Objects.equals(this.notes, distributionBackendDefinition.notes)
        && Objects.equals(this.requests, distributionBackendDefinition.requests)
        && Objects.equals(this.showLegend, distributionBackendDefinition.showLegend)
        && Objects.equals(this.time, distributionBackendDefinition.time)
        && Objects.equals(this.title, distributionBackendDefinition.title)
        && Objects.equals(this.titleAlign, distributionBackendDefinition.titleAlign)
        && Objects.equals(this.titleSize, distributionBackendDefinition.titleSize)
        && Objects.equals(this.type, distributionBackendDefinition.type)
        && Objects.equals(this.xaxis, distributionBackendDefinition.xaxis)
        && Objects.equals(this.yaxis, distributionBackendDefinition.yaxis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        customLinks,
        description,
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
    sb.append("class DistributionBackendDefinition {\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
