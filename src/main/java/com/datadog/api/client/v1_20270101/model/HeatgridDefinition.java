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
  HeatgridDefinition.JSON_PROPERTY_COLOR,
  HeatgridDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  HeatgridDefinition.JSON_PROPERTY_DESCRIPTION,
  HeatgridDefinition.JSON_PROPERTY_LABEL_COLUMN,
  HeatgridDefinition.JSON_PROPERTY_LEGEND,
  HeatgridDefinition.JSON_PROPERTY_NOTES,
  HeatgridDefinition.JSON_PROPERTY_REQUESTS,
  HeatgridDefinition.JSON_PROPERTY_SORT,
  HeatgridDefinition.JSON_PROPERTY_TIME,
  HeatgridDefinition.JSON_PROPERTY_TITLE,
  HeatgridDefinition.JSON_PROPERTY_TITLE_ALIGN,
  HeatgridDefinition.JSON_PROPERTY_TITLE_SIZE,
  HeatgridDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatgridDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLOR = "color";
  private HeatgridColorConfig color;

  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LABEL_COLUMN = "label_column";
  private HeatgridLabelColumnConfig labelColumn;

  public static final String JSON_PROPERTY_LEGEND = "legend";
  private HeatgridLegendConfig legend;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<HeatgridTileDefRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_SORT = "sort";
  private HeatgridSortAndOrderBy sort;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private HeatgridDefinitionType type;

  public HeatgridDefinition() {}

  @JsonCreator
  public HeatgridDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS)
          List<HeatgridTileDefRequest> requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_SORT) HeatgridSortAndOrderBy sort,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) HeatgridDefinitionType type) {
    this.requests = requests;
    for (HeatgridTileDefRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public HeatgridDefinition color(HeatgridColorConfig color) {
    this.color = color;
    this.unparsed |= color.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return color
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HeatgridColorConfig getColor() {
    return color;
  }

  public void setColor(HeatgridColorConfig color) {
    this.color = color;
    if (color != null) {
      this.unparsed |= color.unparsed;
    }
  }

  public HeatgridDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    if (customLinks != null) {
      for (WidgetCustomLink item : customLinks) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public HeatgridDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
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

  public HeatgridDefinition description(String description) {
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

  public HeatgridDefinition labelColumn(HeatgridLabelColumnConfig labelColumn) {
    this.labelColumn = labelColumn;
    this.unparsed |= labelColumn.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return labelColumn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL_COLUMN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HeatgridLabelColumnConfig getLabelColumn() {
    return labelColumn;
  }

  public void setLabelColumn(HeatgridLabelColumnConfig labelColumn) {
    this.labelColumn = labelColumn;
    if (labelColumn != null) {
      this.unparsed |= labelColumn.unparsed;
    }
  }

  public HeatgridDefinition legend(HeatgridLegendConfig legend) {
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
  public HeatgridLegendConfig getLegend() {
    return legend;
  }

  public void setLegend(HeatgridLegendConfig legend) {
    this.legend = legend;
    if (legend != null) {
      this.unparsed |= legend.unparsed;
    }
  }

  public HeatgridDefinition notes(String notes) {
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

  public HeatgridDefinition requests(List<HeatgridTileDefRequest> requests) {
    this.requests = requests;
    for (HeatgridTileDefRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public HeatgridDefinition addRequestsItem(HeatgridTileDefRequest requestsItem) {
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
  public List<HeatgridTileDefRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<HeatgridTileDefRequest> requests) {
    this.requests = requests;
    if (requests != null) {
      for (HeatgridTileDefRequest item : requests) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public HeatgridDefinition sort(HeatgridSortAndOrderBy sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return sort
   */
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HeatgridSortAndOrderBy getSort() {
    return sort;
  }

  public void setSort(HeatgridSortAndOrderBy sort) {
    this.sort = sort;
    if (sort != null) {
      this.unparsed |= sort.unparsed;
    }
  }

  public HeatgridDefinition time(WidgetTime time) {
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

  public HeatgridDefinition title(String title) {
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

  public HeatgridDefinition titleAlign(WidgetTextAlign titleAlign) {
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

  public HeatgridDefinition titleSize(String titleSize) {
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

  public HeatgridDefinition type(HeatgridDefinitionType type) {
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
  public HeatgridDefinitionType getType() {
    return type;
  }

  public void setType(HeatgridDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this HeatgridDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatgridDefinition heatgridDefinition = (HeatgridDefinition) o;
    return Objects.equals(this.color, heatgridDefinition.color)
        && Objects.equals(this.customLinks, heatgridDefinition.customLinks)
        && Objects.equals(this.description, heatgridDefinition.description)
        && Objects.equals(this.labelColumn, heatgridDefinition.labelColumn)
        && Objects.equals(this.legend, heatgridDefinition.legend)
        && Objects.equals(this.notes, heatgridDefinition.notes)
        && Objects.equals(this.requests, heatgridDefinition.requests)
        && Objects.equals(this.sort, heatgridDefinition.sort)
        && Objects.equals(this.time, heatgridDefinition.time)
        && Objects.equals(this.title, heatgridDefinition.title)
        && Objects.equals(this.titleAlign, heatgridDefinition.titleAlign)
        && Objects.equals(this.titleSize, heatgridDefinition.titleSize)
        && Objects.equals(this.type, heatgridDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        color,
        customLinks,
        description,
        labelColumn,
        legend,
        notes,
        requests,
        sort,
        time,
        title,
        titleAlign,
        titleSize,
        type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatgridDefinition {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    labelColumn: ").append(toIndentedString(labelColumn)).append("\n");
    sb.append("    legend: ").append(toIndentedString(legend)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
