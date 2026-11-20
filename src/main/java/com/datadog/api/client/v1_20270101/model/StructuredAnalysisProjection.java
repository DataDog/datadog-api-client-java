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
  StructuredAnalysisProjection.JSON_PROPERTY_COLUMNS,
  StructuredAnalysisProjection.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StructuredAnalysisProjection {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<StructuredAnalysisProjectionColumnsItems> columns = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private StructuredAnalysisProjectionType type;

  public StructuredAnalysisProjection() {}

  @JsonCreator
  public StructuredAnalysisProjection(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMNS)
          List<StructuredAnalysisProjectionColumnsItems> columns,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          StructuredAnalysisProjectionType type) {
    this.columns = columns;
    for (StructuredAnalysisProjectionColumnsItems item : columns) {
      this.unparsed |= item.unparsed;
    }
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public StructuredAnalysisProjection columns(
      List<StructuredAnalysisProjectionColumnsItems> columns) {
    this.columns = columns;
    for (StructuredAnalysisProjectionColumnsItems item : columns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public StructuredAnalysisProjection addColumnsItem(
      StructuredAnalysisProjectionColumnsItems columnsItem) {
    this.columns.add(columnsItem);
    this.unparsed |= columnsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return columns
   */
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<StructuredAnalysisProjectionColumnsItems> getColumns() {
    return columns;
  }

  public void setColumns(List<StructuredAnalysisProjectionColumnsItems> columns) {
    this.columns = columns;
    if (columns != null) {
      for (StructuredAnalysisProjectionColumnsItems item : columns) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public StructuredAnalysisProjection type(StructuredAnalysisProjectionType type) {
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
  public StructuredAnalysisProjectionType getType() {
    return type;
  }

  public void setType(StructuredAnalysisProjectionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this StructuredAnalysisProjection object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredAnalysisProjection structuredAnalysisProjection = (StructuredAnalysisProjection) o;
    return Objects.equals(this.columns, structuredAnalysisProjection.columns)
        && Objects.equals(this.type, structuredAnalysisProjection.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredAnalysisProjection {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
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
