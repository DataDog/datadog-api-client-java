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

/**
 * The treemap visualization found on the Host Dashboards comes from the output of <code>ps auxww
 * </code>. This is not continuously run on your hosts. Instead, it’s run once on Agent
 * start/restart. The treemap is only supported for process data on a single host dashboard — this
 * may not be reused in other dashboards or for other metrics.
 */
@JsonPropertyOrder({
  TreeMapWidgetDefinition.JSON_PROPERTY_COLOR_BY,
  TreeMapWidgetDefinition.JSON_PROPERTY_GROUP_BY,
  TreeMapWidgetDefinition.JSON_PROPERTY_REQUESTS,
  TreeMapWidgetDefinition.JSON_PROPERTY_SIZE_BY,
  TreeMapWidgetDefinition.JSON_PROPERTY_TITLE,
  TreeMapWidgetDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TreeMapWidgetDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLOR_BY = "color_by";
  private TreeMapColorBy colorBy = TreeMapColorBy.USER;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private TreeMapGroupBy groupBy;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<TreeMapWidgetRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_SIZE_BY = "size_by";
  private TreeMapSizeBy sizeBy;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TreeMapWidgetDefinitionType type = TreeMapWidgetDefinitionType.TREEMAP;

  public TreeMapWidgetDefinition() {}

  @JsonCreator
  public TreeMapWidgetDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS)
          List<TreeMapWidgetRequest> requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) TreeMapWidgetDefinitionType type) {
    this.requests = requests;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public TreeMapWidgetDefinition colorBy(TreeMapColorBy colorBy) {
    this.colorBy = colorBy;
    this.unparsed |= !colorBy.isValid();
    return this;
  }

  /**
   * The attribute used to determine color in the widget.
   *
   * @return colorBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLOR_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TreeMapColorBy getColorBy() {
    return colorBy;
  }

  public void setColorBy(TreeMapColorBy colorBy) {
    if (!colorBy.isValid()) {
      this.unparsed = true;
    }
    this.colorBy = colorBy;
  }

  public TreeMapWidgetDefinition groupBy(TreeMapGroupBy groupBy) {
    this.groupBy = groupBy;
    this.unparsed |= !groupBy.isValid();
    return this;
  }

  /**
   * The attribute used to group elements in the widget.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TreeMapGroupBy getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(TreeMapGroupBy groupBy) {
    if (!groupBy.isValid()) {
      this.unparsed = true;
    }
    this.groupBy = groupBy;
  }

  public TreeMapWidgetDefinition requests(List<TreeMapWidgetRequest> requests) {
    this.requests = requests;
    for (TreeMapWidgetRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TreeMapWidgetDefinition addRequestsItem(TreeMapWidgetRequest requestsItem) {
    this.requests.add(requestsItem);
    this.unparsed |= requestsItem.unparsed;
    return this;
  }

  /**
   * List of top list widget requests.
   *
   * @return requests
   */
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TreeMapWidgetRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<TreeMapWidgetRequest> requests) {
    this.requests = requests;
  }

  public TreeMapWidgetDefinition sizeBy(TreeMapSizeBy sizeBy) {
    this.sizeBy = sizeBy;
    this.unparsed |= !sizeBy.isValid();
    return this;
  }

  /**
   * The attribute used to determine size in the widget.
   *
   * @return sizeBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TreeMapSizeBy getSizeBy() {
    return sizeBy;
  }

  public void setSizeBy(TreeMapSizeBy sizeBy) {
    if (!sizeBy.isValid()) {
      this.unparsed = true;
    }
    this.sizeBy = sizeBy;
  }

  public TreeMapWidgetDefinition title(String title) {
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

  public TreeMapWidgetDefinition type(TreeMapWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the treemap widget.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TreeMapWidgetDefinitionType getType() {
    return type;
  }

  public void setType(TreeMapWidgetDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this TreeMapWidgetDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TreeMapWidgetDefinition treeMapWidgetDefinition = (TreeMapWidgetDefinition) o;
    return Objects.equals(this.colorBy, treeMapWidgetDefinition.colorBy)
        && Objects.equals(this.groupBy, treeMapWidgetDefinition.groupBy)
        && Objects.equals(this.requests, treeMapWidgetDefinition.requests)
        && Objects.equals(this.sizeBy, treeMapWidgetDefinition.sizeBy)
        && Objects.equals(this.title, treeMapWidgetDefinition.title)
        && Objects.equals(this.type, treeMapWidgetDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorBy, groupBy, requests, sizeBy, title, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TreeMapWidgetDefinition {\n");
    sb.append("    colorBy: ").append(toIndentedString(colorBy)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    sizeBy: ").append(toIndentedString(sizeBy)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
