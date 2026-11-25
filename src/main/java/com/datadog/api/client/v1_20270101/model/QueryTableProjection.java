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
  QueryTableProjection.JSON_PROPERTY_COLUMN_ORDER,
  QueryTableProjection.JSON_PROPERTY_DIMENSIONS,
  QueryTableProjection.JSON_PROPERTY_TYPE,
  QueryTableProjection.JSON_PROPERTY_UNLISTED_COLUMNS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class QueryTableProjection {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMN_ORDER = "column_order";
  private QueryTableProjectionColumnOrder columnOrder;

  public static final String JSON_PROPERTY_DIMENSIONS = "dimensions";
  private List<QueryTableProjectionDimension> dimensions = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private QueryTableProjectionType type;

  public static final String JSON_PROPERTY_UNLISTED_COLUMNS = "unlisted_columns";
  private QueryTableProjectionUnlistedColumns unlistedColumns;

  public QueryTableProjection() {}

  @JsonCreator
  public QueryTableProjection(
      @JsonProperty(required = true, value = JSON_PROPERTY_DIMENSIONS)
          List<QueryTableProjectionDimension> dimensions,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) QueryTableProjectionType type) {
    this.dimensions = dimensions;
    for (QueryTableProjectionDimension item : dimensions) {
      this.unparsed |= item.unparsed;
    }
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public QueryTableProjection columnOrder(QueryTableProjectionColumnOrder columnOrder) {
    this.columnOrder = columnOrder;
    this.unparsed |= !columnOrder.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return columnOrder
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLUMN_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public QueryTableProjectionColumnOrder getColumnOrder() {
    return columnOrder;
  }

  public void setColumnOrder(QueryTableProjectionColumnOrder columnOrder) {
    if (!columnOrder.isValid()) {
      this.unparsed = true;
    }
    this.columnOrder = columnOrder;
  }

  public QueryTableProjection dimensions(List<QueryTableProjectionDimension> dimensions) {
    this.dimensions = dimensions;
    for (QueryTableProjectionDimension item : dimensions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public QueryTableProjection addDimensionsItem(QueryTableProjectionDimension dimensionsItem) {
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
  public List<QueryTableProjectionDimension> getDimensions() {
    return dimensions;
  }

  public void setDimensions(List<QueryTableProjectionDimension> dimensions) {
    this.dimensions = dimensions;
    if (dimensions != null) {
      for (QueryTableProjectionDimension item : dimensions) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public QueryTableProjection type(QueryTableProjectionType type) {
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
  public QueryTableProjectionType getType() {
    return type;
  }

  public void setType(QueryTableProjectionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public QueryTableProjection unlistedColumns(QueryTableProjectionUnlistedColumns unlistedColumns) {
    this.unlistedColumns = unlistedColumns;
    this.unparsed |= !unlistedColumns.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return unlistedColumns
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNLISTED_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public QueryTableProjectionUnlistedColumns getUnlistedColumns() {
    return unlistedColumns;
  }

  public void setUnlistedColumns(QueryTableProjectionUnlistedColumns unlistedColumns) {
    if (!unlistedColumns.isValid()) {
      this.unparsed = true;
    }
    this.unlistedColumns = unlistedColumns;
  }

  /** Return true if this QueryTableProjection object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryTableProjection queryTableProjection = (QueryTableProjection) o;
    return Objects.equals(this.columnOrder, queryTableProjection.columnOrder)
        && Objects.equals(this.dimensions, queryTableProjection.dimensions)
        && Objects.equals(this.type, queryTableProjection.type)
        && Objects.equals(this.unlistedColumns, queryTableProjection.unlistedColumns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnOrder, dimensions, type, unlistedColumns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryTableProjection {\n");
    sb.append("    columnOrder: ").append(toIndentedString(columnOrder)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unlistedColumns: ").append(toIndentedString(unlistedColumns)).append("\n");
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
