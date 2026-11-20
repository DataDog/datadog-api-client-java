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
  TreeDataProjectionToplist.JSON_PROPERTY_DIMENSIONS,
  TreeDataProjectionToplist.JSON_PROPERTY_GROUP_STYLES,
  TreeDataProjectionToplist.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TreeDataProjectionToplist {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DIMENSIONS = "dimensions";
  private List<TreeDataProjectionToplistDimensionsItems> dimensions = new ArrayList<>();

  public static final String JSON_PROPERTY_GROUP_STYLES = "group_styles";
  private List<GroupStyleRule> groupStyles = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TreeDataProjectionToplistType type;

  public TreeDataProjectionToplist() {}

  @JsonCreator
  public TreeDataProjectionToplist(
      @JsonProperty(required = true, value = JSON_PROPERTY_DIMENSIONS)
          List<TreeDataProjectionToplistDimensionsItems> dimensions,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          TreeDataProjectionToplistType type) {
    this.dimensions = dimensions;
    for (TreeDataProjectionToplistDimensionsItems item : dimensions) {
      this.unparsed |= item.unparsed;
    }
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public TreeDataProjectionToplist dimensions(
      List<TreeDataProjectionToplistDimensionsItems> dimensions) {
    this.dimensions = dimensions;
    for (TreeDataProjectionToplistDimensionsItems item : dimensions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TreeDataProjectionToplist addDimensionsItem(
      TreeDataProjectionToplistDimensionsItems dimensionsItem) {
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
  public List<TreeDataProjectionToplistDimensionsItems> getDimensions() {
    return dimensions;
  }

  public void setDimensions(List<TreeDataProjectionToplistDimensionsItems> dimensions) {
    this.dimensions = dimensions;
    if (dimensions != null) {
      for (TreeDataProjectionToplistDimensionsItems item : dimensions) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public TreeDataProjectionToplist groupStyles(List<GroupStyleRule> groupStyles) {
    this.groupStyles = groupStyles;
    if (groupStyles != null) {
      for (GroupStyleRule item : groupStyles) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public TreeDataProjectionToplist addGroupStylesItem(GroupStyleRule groupStylesItem) {
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

  public TreeDataProjectionToplist type(TreeDataProjectionToplistType type) {
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
  public TreeDataProjectionToplistType getType() {
    return type;
  }

  public void setType(TreeDataProjectionToplistType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this TreeDataProjectionToplist object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TreeDataProjectionToplist treeDataProjectionToplist = (TreeDataProjectionToplist) o;
    return Objects.equals(this.dimensions, treeDataProjectionToplist.dimensions)
        && Objects.equals(this.groupStyles, treeDataProjectionToplist.groupStyles)
        && Objects.equals(this.type, treeDataProjectionToplist.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensions, groupStyles, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TreeDataProjectionToplist {\n");
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
