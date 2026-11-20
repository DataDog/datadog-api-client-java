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
@JsonPropertyOrder({CustomTopologyMapInlineNodesData.JSON_PROPERTY_COLUMNS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomTopologyMapInlineNodesData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<CustomTopologyMapInlineNodeColumn> columns = new ArrayList<>();

  public CustomTopologyMapInlineNodesData() {}

  @JsonCreator
  public CustomTopologyMapInlineNodesData(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMNS)
          List<CustomTopologyMapInlineNodeColumn> columns) {
    this.columns = columns;
    for (CustomTopologyMapInlineNodeColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
  }

  public CustomTopologyMapInlineNodesData columns(List<CustomTopologyMapInlineNodeColumn> columns) {
    this.columns = columns;
    for (CustomTopologyMapInlineNodeColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CustomTopologyMapInlineNodesData addColumnsItem(
      CustomTopologyMapInlineNodeColumn columnsItem) {
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
  public List<CustomTopologyMapInlineNodeColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<CustomTopologyMapInlineNodeColumn> columns) {
    this.columns = columns;
    if (columns != null) {
      for (CustomTopologyMapInlineNodeColumn item : columns) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  /** Return true if this CustomTopologyMapInlineNodesData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomTopologyMapInlineNodesData customTopologyMapInlineNodesData =
        (CustomTopologyMapInlineNodesData) o;
    return Objects.equals(this.columns, customTopologyMapInlineNodesData.columns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomTopologyMapInlineNodesData {\n");
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
