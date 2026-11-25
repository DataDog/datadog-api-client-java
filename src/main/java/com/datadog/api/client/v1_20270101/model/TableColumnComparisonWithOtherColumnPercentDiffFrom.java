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
  TableColumnComparisonWithOtherColumnPercentDiffFrom.JSON_PROPERTY_COLUMN,
  TableColumnComparisonWithOtherColumnPercentDiffFrom.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TableColumnComparisonWithOtherColumnPercentDiffFrom {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMN = "column";
  private String column;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TableColumnComparisonWithOtherColumnPercentDiffFromType type;

  public TableColumnComparisonWithOtherColumnPercentDiffFrom() {}

  @JsonCreator
  public TableColumnComparisonWithOtherColumnPercentDiffFrom(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMN) String column,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          TableColumnComparisonWithOtherColumnPercentDiffFromType type) {
    this.column = column;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public TableColumnComparisonWithOtherColumnPercentDiffFrom column(String column) {
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

  public TableColumnComparisonWithOtherColumnPercentDiffFrom type(
      TableColumnComparisonWithOtherColumnPercentDiffFromType type) {
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
  public TableColumnComparisonWithOtherColumnPercentDiffFromType getType() {
    return type;
  }

  public void setType(TableColumnComparisonWithOtherColumnPercentDiffFromType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * Return true if this TableColumnComparisonWithOtherColumnPercentDiffFrom object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableColumnComparisonWithOtherColumnPercentDiffFrom
        tableColumnComparisonWithOtherColumnPercentDiffFrom =
            (TableColumnComparisonWithOtherColumnPercentDiffFrom) o;
    return Objects.equals(this.column, tableColumnComparisonWithOtherColumnPercentDiffFrom.column)
        && Objects.equals(this.type, tableColumnComparisonWithOtherColumnPercentDiffFrom.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableColumnComparisonWithOtherColumnPercentDiffFrom {\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
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
