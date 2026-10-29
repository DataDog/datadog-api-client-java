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

/** Table of nodes, one row per node. */
@JsonPropertyOrder({TopologyMapInlineNodesData.JSON_PROPERTY_COLUMNS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TopologyMapInlineNodesData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<TopologyMapInlineNodeColumn> columns = new ArrayList<>();

  public TopologyMapInlineNodesData() {}

  @JsonCreator
  public TopologyMapInlineNodesData(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMNS)
          List<TopologyMapInlineNodeColumn> columns) {
    this.columns = columns;
    for (TopologyMapInlineNodeColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
  }

  public TopologyMapInlineNodesData columns(List<TopologyMapInlineNodeColumn> columns) {
    this.columns = columns;
    for (TopologyMapInlineNodeColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TopologyMapInlineNodesData addColumnsItem(TopologyMapInlineNodeColumn columnsItem) {
    this.columns.add(columnsItem);
    this.unparsed |= columnsItem.unparsed;
    return this;
  }

  /**
   * Columns of the nodes table. Must include an <code>id</code> column, unless the list is empty
   * (no nodes).
   *
   * @return columns
   */
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TopologyMapInlineNodeColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<TopologyMapInlineNodeColumn> columns) {
    this.columns = columns;
    if (columns != null) {
      for (TopologyMapInlineNodeColumn item : columns) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  /** Return true if this TopologyMapInlineNodesData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopologyMapInlineNodesData topologyMapInlineNodesData = (TopologyMapInlineNodesData) o;
    return Objects.equals(this.columns, topologyMapInlineNodesData.columns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopologyMapInlineNodesData {\n");
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
