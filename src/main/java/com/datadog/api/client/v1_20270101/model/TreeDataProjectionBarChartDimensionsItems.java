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
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  TreeDataProjectionBarChartDimensionsItems.JSON_PROPERTY_COLUMN,
  TreeDataProjectionBarChartDimensionsItems.JSON_PROPERTY_DIMENSION,
  TreeDataProjectionBarChartDimensionsItems.JSON_PROPERTY_NUMBER_FORMAT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TreeDataProjectionBarChartDimensionsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMN = "column";
  private String column;

  public static final String JSON_PROPERTY_DIMENSION = "dimension";
  private TreeDataProjectionBarChartDimensionsItemsDimension dimension;

  public static final String JSON_PROPERTY_NUMBER_FORMAT = "number_format";
  private WidgetNumberFormat numberFormat;

  public TreeDataProjectionBarChartDimensionsItems() {}

  @JsonCreator
  public TreeDataProjectionBarChartDimensionsItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMN) String column,
      @JsonProperty(required = true, value = JSON_PROPERTY_DIMENSION)
          TreeDataProjectionBarChartDimensionsItemsDimension dimension) {
    this.column = column;
    this.dimension = dimension;
    this.unparsed |= !dimension.isValid();
  }

  public TreeDataProjectionBarChartDimensionsItems column(String column) {
    this.column = column;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return column
   */
  @JsonProperty(JSON_PROPERTY_COLUMN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getColumn() {
    return column;
  }

  public void setColumn(String column) {
    this.column = column;
  }

  public TreeDataProjectionBarChartDimensionsItems dimension(
      TreeDataProjectionBarChartDimensionsItemsDimension dimension) {
    this.dimension = dimension;
    this.unparsed |= !dimension.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return dimension
   */
  @JsonProperty(JSON_PROPERTY_DIMENSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TreeDataProjectionBarChartDimensionsItemsDimension getDimension() {
    return dimension;
  }

  public void setDimension(TreeDataProjectionBarChartDimensionsItemsDimension dimension) {
    if (!dimension.isValid()) {
      this.unparsed = true;
    }
    this.dimension = dimension;
  }

  public TreeDataProjectionBarChartDimensionsItems numberFormat(WidgetNumberFormat numberFormat) {
    this.numberFormat = numberFormat;
    this.unparsed |= numberFormat.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return numberFormat
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetNumberFormat getNumberFormat() {
    return numberFormat;
  }

  public void setNumberFormat(WidgetNumberFormat numberFormat) {
    this.numberFormat = numberFormat;
    if (numberFormat != null) {
      this.unparsed |= numberFormat.unparsed;
    }
  }

  /** Return true if this TreeDataProjectionBarChartDimensionsItems object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TreeDataProjectionBarChartDimensionsItems treeDataProjectionBarChartDimensionsItems =
        (TreeDataProjectionBarChartDimensionsItems) o;
    return Objects.equals(this.column, treeDataProjectionBarChartDimensionsItems.column)
        && Objects.equals(this.dimension, treeDataProjectionBarChartDimensionsItems.dimension)
        && Objects.equals(
            this.numberFormat, treeDataProjectionBarChartDimensionsItems.numberFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, dimension, numberFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TreeDataProjectionBarChartDimensionsItems {\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    numberFormat: ").append(toIndentedString(numberFormat)).append("\n");
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
