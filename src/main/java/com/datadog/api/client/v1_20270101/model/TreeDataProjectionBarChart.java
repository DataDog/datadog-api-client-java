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
  TreeDataProjectionBarChart.JSON_PROPERTY_DIMENSIONS,
  TreeDataProjectionBarChart.JSON_PROPERTY_GROUP_STYLES,
  TreeDataProjectionBarChart.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TreeDataProjectionBarChart {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DIMENSIONS = "dimensions";
  private List<TreeDataProjectionBarChartDimensionsItems> dimensions = new ArrayList<>();

  public static final String JSON_PROPERTY_GROUP_STYLES = "group_styles";
  private List<GroupStyleRule> groupStyles = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TreeDataProjectionBarChartType type;

  public TreeDataProjectionBarChart() {}

  @JsonCreator
  public TreeDataProjectionBarChart(
      @JsonProperty(required = true, value = JSON_PROPERTY_DIMENSIONS)
          List<TreeDataProjectionBarChartDimensionsItems> dimensions,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          TreeDataProjectionBarChartType type) {
    this.dimensions = dimensions;
    for (TreeDataProjectionBarChartDimensionsItems item : dimensions) {
      this.unparsed |= item.unparsed;
    }
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public TreeDataProjectionBarChart dimensions(
      List<TreeDataProjectionBarChartDimensionsItems> dimensions) {
    this.dimensions = dimensions;
    for (TreeDataProjectionBarChartDimensionsItems item : dimensions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TreeDataProjectionBarChart addDimensionsItem(
      TreeDataProjectionBarChartDimensionsItems dimensionsItem) {
    this.dimensions.add(dimensionsItem);
    this.unparsed |= dimensionsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return dimensions
   */
  @JsonProperty(JSON_PROPERTY_DIMENSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TreeDataProjectionBarChartDimensionsItems> getDimensions() {
    return dimensions;
  }

  public void setDimensions(List<TreeDataProjectionBarChartDimensionsItems> dimensions) {
    this.dimensions = dimensions;
    if (dimensions != null) {
      for (TreeDataProjectionBarChartDimensionsItems item : dimensions) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public TreeDataProjectionBarChart groupStyles(List<GroupStyleRule> groupStyles) {
    this.groupStyles = groupStyles;
    if (groupStyles != null) {
      for (GroupStyleRule item : groupStyles) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public TreeDataProjectionBarChart addGroupStylesItem(GroupStyleRule groupStylesItem) {
    if (this.groupStyles == null) {
      this.groupStyles = new ArrayList<>();
    }
    this.groupStyles.add(groupStylesItem);
    this.unparsed |= groupStylesItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return groupStyles
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_STYLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<GroupStyleRule> getGroupStyles() {
    return groupStyles;
  }

  public void setGroupStyles(List<GroupStyleRule> groupStyles) {
    this.groupStyles = groupStyles;
    if (groupStyles != null) {
      for (GroupStyleRule item : groupStyles) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public TreeDataProjectionBarChart type(TreeDataProjectionBarChartType type) {
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
  public TreeDataProjectionBarChartType getType() {
    return type;
  }

  public void setType(TreeDataProjectionBarChartType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this TreeDataProjectionBarChart object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TreeDataProjectionBarChart treeDataProjectionBarChart = (TreeDataProjectionBarChart) o;
    return Objects.equals(this.dimensions, treeDataProjectionBarChart.dimensions)
        && Objects.equals(this.groupStyles, treeDataProjectionBarChart.groupStyles)
        && Objects.equals(this.type, treeDataProjectionBarChart.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensions, groupStyles, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TreeDataProjectionBarChart {\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    groupStyles: ").append(toIndentedString(groupStyles)).append("\n");
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
