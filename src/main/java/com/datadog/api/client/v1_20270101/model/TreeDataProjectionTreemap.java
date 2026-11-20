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
  TreeDataProjectionTreemap.JSON_PROPERTY_DIMENSIONS,
  TreeDataProjectionTreemap.JSON_PROPERTY_GROUP_STYLES,
  TreeDataProjectionTreemap.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TreeDataProjectionTreemap {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DIMENSIONS = "dimensions";
  private List<TreeDataProjectionTreemapDimensionsItems> dimensions = new ArrayList<>();

  public static final String JSON_PROPERTY_GROUP_STYLES = "group_styles";
  private List<GroupStyleRule> groupStyles = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TreeDataProjectionTreemapType type;

  public TreeDataProjectionTreemap() {}

  @JsonCreator
  public TreeDataProjectionTreemap(
      @JsonProperty(required = true, value = JSON_PROPERTY_DIMENSIONS)
          List<TreeDataProjectionTreemapDimensionsItems> dimensions,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          TreeDataProjectionTreemapType type) {
    this.dimensions = dimensions;
    for (TreeDataProjectionTreemapDimensionsItems item : dimensions) {
      this.unparsed |= item.unparsed;
    }
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public TreeDataProjectionTreemap dimensions(
      List<TreeDataProjectionTreemapDimensionsItems> dimensions) {
    this.dimensions = dimensions;
    for (TreeDataProjectionTreemapDimensionsItems item : dimensions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TreeDataProjectionTreemap addDimensionsItem(
      TreeDataProjectionTreemapDimensionsItems dimensionsItem) {
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
  public List<TreeDataProjectionTreemapDimensionsItems> getDimensions() {
    return dimensions;
  }

  public void setDimensions(List<TreeDataProjectionTreemapDimensionsItems> dimensions) {
    this.dimensions = dimensions;
    if (dimensions != null) {
      for (TreeDataProjectionTreemapDimensionsItems item : dimensions) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public TreeDataProjectionTreemap groupStyles(List<GroupStyleRule> groupStyles) {
    this.groupStyles = groupStyles;
    if (groupStyles != null) {
      for (GroupStyleRule item : groupStyles) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public TreeDataProjectionTreemap addGroupStylesItem(GroupStyleRule groupStylesItem) {
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

  public TreeDataProjectionTreemap type(TreeDataProjectionTreemapType type) {
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
  public TreeDataProjectionTreemapType getType() {
    return type;
  }

  public void setType(TreeDataProjectionTreemapType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this TreeDataProjectionTreemap object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TreeDataProjectionTreemap treeDataProjectionTreemap = (TreeDataProjectionTreemap) o;
    return Objects.equals(this.dimensions, treeDataProjectionTreemap.dimensions)
        && Objects.equals(this.groupStyles, treeDataProjectionTreemap.groupStyles)
        && Objects.equals(this.type, treeDataProjectionTreemap.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensions, groupStyles, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TreeDataProjectionTreemap {\n");
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
