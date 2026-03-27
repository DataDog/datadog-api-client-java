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

/** The Sankey diagram visualizes the flow of data between categories, stages or sets of values. */
@JsonPropertyOrder({
  SankeyWidgetDefinition.JSON_PROPERTY_REQUESTS,
  SankeyWidgetDefinition.JSON_PROPERTY_SHOW_OTHER_LINKS,
  SankeyWidgetDefinition.JSON_PROPERTY_SORT_NODES,
  SankeyWidgetDefinition.JSON_PROPERTY_TIME,
  SankeyWidgetDefinition.JSON_PROPERTY_TITLE,
  SankeyWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  SankeyWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  SankeyWidgetDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SankeyWidgetDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<SankeyWidgetRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_SHOW_OTHER_LINKS = "show_other_links";
  private Boolean showOtherLinks;

  public static final String JSON_PROPERTY_SORT_NODES = "sort_nodes";
  private Boolean sortNodes;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SankeyWidgetDefinitionType type = SankeyWidgetDefinitionType.SANKEY;

  public SankeyWidgetDefinition() {}

  @JsonCreator
  public SankeyWidgetDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS)
          List<SankeyWidgetRequest> requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) SankeyWidgetDefinitionType type) {
    this.requests = requests;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SankeyWidgetDefinition requests(List<SankeyWidgetRequest> requests) {
    this.requests = requests;
    for (SankeyWidgetRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SankeyWidgetDefinition addRequestsItem(SankeyWidgetRequest requestsItem) {
    this.requests.add(requestsItem);
    this.unparsed |= requestsItem.unparsed;
    return this;
  }

  /**
   * List of Sankey widget requests.
   *
   * @return requests
   */
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SankeyWidgetRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<SankeyWidgetRequest> requests) {
    this.requests = requests;
  }

  public SankeyWidgetDefinition showOtherLinks(Boolean showOtherLinks) {
    this.showOtherLinks = showOtherLinks;
    return this;
  }

  /**
   * Whether to show links for "other" category.
   *
   * @return showOtherLinks
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_OTHER_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowOtherLinks() {
    return showOtherLinks;
  }

  public void setShowOtherLinks(Boolean showOtherLinks) {
    this.showOtherLinks = showOtherLinks;
  }

  public SankeyWidgetDefinition sortNodes(Boolean sortNodes) {
    this.sortNodes = sortNodes;
    return this;
  }

  /**
   * Whether to sort nodes in the Sankey diagram.
   *
   * @return sortNodes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT_NODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSortNodes() {
    return sortNodes;
  }

  public void setSortNodes(Boolean sortNodes) {
    this.sortNodes = sortNodes;
  }

  public SankeyWidgetDefinition time(WidgetTime time) {
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

  public SankeyWidgetDefinition title(String title) {
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

  public SankeyWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
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

  public SankeyWidgetDefinition titleSize(String titleSize) {
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

  public SankeyWidgetDefinition type(SankeyWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the Sankey widget.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SankeyWidgetDefinitionType getType() {
    return type;
  }

  public void setType(SankeyWidgetDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this SankeyWidgetDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SankeyWidgetDefinition sankeyWidgetDefinition = (SankeyWidgetDefinition) o;
    return Objects.equals(this.requests, sankeyWidgetDefinition.requests)
        && Objects.equals(this.showOtherLinks, sankeyWidgetDefinition.showOtherLinks)
        && Objects.equals(this.sortNodes, sankeyWidgetDefinition.sortNodes)
        && Objects.equals(this.time, sankeyWidgetDefinition.time)
        && Objects.equals(this.title, sankeyWidgetDefinition.title)
        && Objects.equals(this.titleAlign, sankeyWidgetDefinition.titleAlign)
        && Objects.equals(this.titleSize, sankeyWidgetDefinition.titleSize)
        && Objects.equals(this.type, sankeyWidgetDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        requests, showOtherLinks, sortNodes, time, title, titleAlign, titleSize, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SankeyWidgetDefinition {\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    showOtherLinks: ").append(toIndentedString(showOtherLinks)).append("\n");
    sb.append("    sortNodes: ").append(toIndentedString(sortNodes)).append("\n");
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
