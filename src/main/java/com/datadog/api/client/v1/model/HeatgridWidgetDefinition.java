/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The heatgrid visualization displays values for each group over time using color. */
@JsonPropertyOrder({
  HeatgridWidgetDefinition.JSON_PROPERTY_COLOR,
  HeatgridWidgetDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  HeatgridWidgetDefinition.JSON_PROPERTY_DESCRIPTION,
  HeatgridWidgetDefinition.JSON_PROPERTY_LABEL_COLUMN,
  HeatgridWidgetDefinition.JSON_PROPERTY_LEGEND,
  HeatgridWidgetDefinition.JSON_PROPERTY_REQUESTS,
  HeatgridWidgetDefinition.JSON_PROPERTY_SORT,
  HeatgridWidgetDefinition.JSON_PROPERTY_TIME,
  HeatgridWidgetDefinition.JSON_PROPERTY_TITLE,
  HeatgridWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  HeatgridWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  HeatgridWidgetDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatgridWidgetDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLOR = "color";
  private HeatgridColorConfig color;

  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LABEL_COLUMN = "label_column";
  private HeatgridLabelColumn labelColumn;

  public static final String JSON_PROPERTY_LEGEND = "legend";
  private HeatgridLegend legend;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<HeatgridWidgetRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_SORT = "sort";
  private HeatgridSort sort;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private HeatgridWidgetDefinitionType type = HeatgridWidgetDefinitionType.HEATGRID;

  public HeatgridWidgetDefinition() {}

  @JsonCreator
  public HeatgridWidgetDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS)
          List<HeatgridWidgetRequest> requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_SORT) HeatgridSort sort,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          HeatgridWidgetDefinitionType type) {
    this.requests = requests;
    for (HeatgridWidgetRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public HeatgridWidgetDefinition color(HeatgridColorConfig color) {
    this.color = color;
    this.unparsed |= color.unparsed;
    return this;
  }

  /**
   * Color configuration for continuous gradients or discrete thresholds.
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

  public HeatgridWidgetDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    if (customLinks != null) {
      for (WidgetCustomLink item : customLinks) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public HeatgridWidgetDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
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
    if (customLinks != null) {
      for (WidgetCustomLink item : customLinks) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public HeatgridWidgetDefinition description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the widget.
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

  public HeatgridWidgetDefinition labelColumn(HeatgridLabelColumn labelColumn) {
    this.labelColumn = labelColumn;
    this.unparsed |= labelColumn.unparsed;
    return this;
  }

  /**
   * Configuration of the group label column.
   *
   * @return labelColumn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL_COLUMN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HeatgridLabelColumn getLabelColumn() {
    return labelColumn;
  }

  public void setLabelColumn(HeatgridLabelColumn labelColumn) {
    this.labelColumn = labelColumn;
    if (labelColumn != null) {
      this.unparsed |= labelColumn.unparsed;
    }
  }

  public HeatgridWidgetDefinition legend(HeatgridLegend legend) {
    this.legend = legend;
    this.unparsed |= legend.unparsed;
    return this;
  }

  /**
   * Legend configuration for the heatgrid widget.
   *
   * @return legend
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEGEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HeatgridLegend getLegend() {
    return legend;
  }

  public void setLegend(HeatgridLegend legend) {
    this.legend = legend;
    if (legend != null) {
      this.unparsed |= legend.unparsed;
    }
  }

  public HeatgridWidgetDefinition requests(List<HeatgridWidgetRequest> requests) {
    this.requests = requests;
    for (HeatgridWidgetRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public HeatgridWidgetDefinition addRequestsItem(HeatgridWidgetRequest requestsItem) {
    this.requests.add(requestsItem);
    this.unparsed |= requestsItem.unparsed;
    return this;
  }

  /**
   * Widget requests. The widget displays one formula, which can combine multiple queries.
   *
   * @return requests
   */
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<HeatgridWidgetRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<HeatgridWidgetRequest> requests) {
    this.requests = requests;
    if (requests != null) {
      for (HeatgridWidgetRequest item : requests) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public HeatgridWidgetDefinition sort(HeatgridSort sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * Ordering of the heatgrid rows.
   *
   * @return sort
   */
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HeatgridSort getSort() {
    return sort;
  }

  public void setSort(HeatgridSort sort) {
    this.sort = sort;
    if (sort != null) {
      this.unparsed |= sort.unparsed;
    }
  }

  public HeatgridWidgetDefinition time(WidgetTime time) {
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
    if (time != null) {
      this.unparsed |= time.unparsed;
    }
  }

  public HeatgridWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the widget.
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

  public HeatgridWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
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

  public HeatgridWidgetDefinition titleSize(String titleSize) {
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

  public HeatgridWidgetDefinition type(HeatgridWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the heatgrid widget.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HeatgridWidgetDefinitionType getType() {
    return type;
  }

  public void setType(HeatgridWidgetDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this HeatgridWidgetDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatgridWidgetDefinition heatgridWidgetDefinition = (HeatgridWidgetDefinition) o;
    return Objects.equals(this.color, heatgridWidgetDefinition.color)
        && Objects.equals(this.customLinks, heatgridWidgetDefinition.customLinks)
        && Objects.equals(this.description, heatgridWidgetDefinition.description)
        && Objects.equals(this.labelColumn, heatgridWidgetDefinition.labelColumn)
        && Objects.equals(this.legend, heatgridWidgetDefinition.legend)
        && Objects.equals(this.requests, heatgridWidgetDefinition.requests)
        && Objects.equals(this.sort, heatgridWidgetDefinition.sort)
        && Objects.equals(this.time, heatgridWidgetDefinition.time)
        && Objects.equals(this.title, heatgridWidgetDefinition.title)
        && Objects.equals(this.titleAlign, heatgridWidgetDefinition.titleAlign)
        && Objects.equals(this.titleSize, heatgridWidgetDefinition.titleSize)
        && Objects.equals(this.type, heatgridWidgetDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        color,
        customLinks,
        description,
        labelColumn,
        legend,
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
    sb.append("class HeatgridWidgetDefinition {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    labelColumn: ").append(toIndentedString(labelColumn)).append("\n");
    sb.append("    legend: ").append(toIndentedString(legend)).append("\n");
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
