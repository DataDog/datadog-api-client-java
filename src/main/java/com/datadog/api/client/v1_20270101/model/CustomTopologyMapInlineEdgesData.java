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
@JsonPropertyOrder({CustomTopologyMapInlineEdgesData.JSON_PROPERTY_COLUMNS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomTopologyMapInlineEdgesData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<CustomTopologyMapInlineEdgeColumn> columns = new ArrayList<>();

  public CustomTopologyMapInlineEdgesData() {}

  @JsonCreator
  public CustomTopologyMapInlineEdgesData(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMNS)
          List<CustomTopologyMapInlineEdgeColumn> columns) {
    this.columns = columns;
    for (CustomTopologyMapInlineEdgeColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
  }

  public CustomTopologyMapInlineEdgesData columns(List<CustomTopologyMapInlineEdgeColumn> columns) {
    this.columns = columns;
    for (CustomTopologyMapInlineEdgeColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CustomTopologyMapInlineEdgesData addColumnsItem(
      CustomTopologyMapInlineEdgeColumn columnsItem) {
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
  public List<CustomTopologyMapInlineEdgeColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<CustomTopologyMapInlineEdgeColumn> columns) {
    this.columns = columns;
    if (columns != null) {
      for (CustomTopologyMapInlineEdgeColumn item : columns) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  /** Return true if this CustomTopologyMapInlineEdgesData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomTopologyMapInlineEdgesData customTopologyMapInlineEdgesData =
        (CustomTopologyMapInlineEdgesData) o;
    return Objects.equals(this.columns, customTopologyMapInlineEdgesData.columns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomTopologyMapInlineEdgesData {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
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
