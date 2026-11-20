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
  ScatterplotBackendDefinition.JSON_PROPERTY_COLOR_BY_GROUPS,
  ScatterplotBackendDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  ScatterplotBackendDefinition.JSON_PROPERTY_DESCRIPTION,
  ScatterplotBackendDefinition.JSON_PROPERTY_LEGEND,
  ScatterplotBackendDefinition.JSON_PROPERTY_NOTES,
  ScatterplotBackendDefinition.JSON_PROPERTY_PALETTE,
  ScatterplotBackendDefinition.JSON_PROPERTY_REQUESTS,
  ScatterplotBackendDefinition.JSON_PROPERTY_TIME,
  ScatterplotBackendDefinition.JSON_PROPERTY_TITLE,
  ScatterplotBackendDefinition.JSON_PROPERTY_TITLE_ALIGN,
  ScatterplotBackendDefinition.JSON_PROPERTY_TITLE_SIZE,
  ScatterplotBackendDefinition.JSON_PROPERTY_TYPE,
  ScatterplotBackendDefinition.JSON_PROPERTY_XAXIS,
  ScatterplotBackendDefinition.JSON_PROPERTY_YAXIS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScatterplotBackendDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLOR_BY_GROUPS = "color_by_groups";
  private List<String> colorByGroups = null;

  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LEGEND = "legend";
  private ScatterPlotLegendType legend;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_PALETTE = "palette";
  private String palette;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private ScatterplotRequests requests;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ScatterplotBackendDefinitionType type;

  public static final String JSON_PROPERTY_XAXIS = "xaxis";
  private WidgetAxis xaxis;

  public static final String JSON_PROPERTY_YAXIS = "yaxis";
  private WidgetAxis yaxis;

  public ScatterplotBackendDefinition() {}

  @JsonCreator
  public ScatterplotBackendDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS) ScatterplotRequests requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ScatterplotBackendDefinitionType type) {
    this.requests = requests;
    this.unparsed |= requests.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ScatterplotBackendDefinition colorByGroups(List<String> colorByGroups) {
    this.colorByGroups = colorByGroups;
    return this;
  }

  public ScatterplotBackendDefinition addColorByGroupsItem(String colorByGroupsItem) {
    if (this.colorByGroups == null) {
      this.colorByGroups = new ArrayList<>();
    }
    this.colorByGroups.add(colorByGroupsItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return colorByGroups
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLOR_BY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getColorByGroups() {
    return colorByGroups;
  }

  public void setColorByGroups(List<String> colorByGroups) {
    this.colorByGroups = colorByGroups;
  }

  public ScatterplotBackendDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    if (customLinks != null) {
      for (WidgetCustomLink item : customLinks) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ScatterplotBackendDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
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

  public ScatterplotBackendDefinition description(String description) {
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

  public ScatterplotBackendDefinition legend(ScatterPlotLegendType legend) {
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

  public ScatterplotBackendDefinition notes(String notes) {
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

  public ScatterplotBackendDefinition palette(String palette) {
    this.palette = palette;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return palette
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PALETTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPalette() {
    return palette;
  }

  public void setPalette(String palette) {
    this.palette = palette;
  }

  public ScatterplotBackendDefinition requests(ScatterplotRequests requests) {
    this.requests = requests;
    this.unparsed |= requests.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return requests
   */
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ScatterplotRequests getRequests() {
    return requests;
  }

  public void setRequests(ScatterplotRequests requests) {
    this.requests = requests;
    if (requests != null) {
      this.unparsed |= requests.unparsed;
    }
  }

  public ScatterplotBackendDefinition time(WidgetTime time) {
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

  public ScatterplotBackendDefinition title(String title) {
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

  public ScatterplotBackendDefinition titleAlign(WidgetTextAlign titleAlign) {
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

  public ScatterplotBackendDefinition titleSize(String titleSize) {
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

  public ScatterplotBackendDefinition type(ScatterplotBackendDefinitionType type) {
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
  public ScatterplotBackendDefinitionType getType() {
    return type;
  }

  public void setType(ScatterplotBackendDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public ScatterplotBackendDefinition xaxis(WidgetAxis xaxis) {
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
  public WidgetAxis getXaxis() {
    return xaxis;
  }

  public void setXaxis(WidgetAxis xaxis) {
    this.xaxis = xaxis;
    if (xaxis != null) {
      this.unparsed |= xaxis.unparsed;
    }
  }

  public ScatterplotBackendDefinition yaxis(WidgetAxis yaxis) {
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
  public WidgetAxis getYaxis() {
    return yaxis;
  }

  public void setYaxis(WidgetAxis yaxis) {
    this.yaxis = yaxis;
    if (yaxis != null) {
      this.unparsed |= yaxis.unparsed;
    }
  }

  /** Return true if this ScatterplotBackendDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScatterplotBackendDefinition scatterplotBackendDefinition = (ScatterplotBackendDefinition) o;
    return Objects.equals(this.colorByGroups, scatterplotBackendDefinition.colorByGroups)
        && Objects.equals(this.customLinks, scatterplotBackendDefinition.customLinks)
        && Objects.equals(this.description, scatterplotBackendDefinition.description)
        && Objects.equals(this.legend, scatterplotBackendDefinition.legend)
        && Objects.equals(this.notes, scatterplotBackendDefinition.notes)
        && Objects.equals(this.palette, scatterplotBackendDefinition.palette)
        && Objects.equals(this.requests, scatterplotBackendDefinition.requests)
        && Objects.equals(this.time, scatterplotBackendDefinition.time)
        && Objects.equals(this.title, scatterplotBackendDefinition.title)
        && Objects.equals(this.titleAlign, scatterplotBackendDefinition.titleAlign)
        && Objects.equals(this.titleSize, scatterplotBackendDefinition.titleSize)
        && Objects.equals(this.type, scatterplotBackendDefinition.type)
        && Objects.equals(this.xaxis, scatterplotBackendDefinition.xaxis)
        && Objects.equals(this.yaxis, scatterplotBackendDefinition.yaxis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        colorByGroups,
        customLinks,
        description,
        legend,
        notes,
        palette,
        requests,
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
    sb.append("class ScatterplotBackendDefinition {\n");
    sb.append("    colorByGroups: ").append(toIndentedString(colorByGroups)).append("\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    legend: ").append(toIndentedString(legend)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    palette: ").append(toIndentedString(palette)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
