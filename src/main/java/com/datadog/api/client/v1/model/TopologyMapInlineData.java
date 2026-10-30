/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/**
 * Static nodes and edges, stored in columns. Within a table, every column must have the same number
 * of values and a unique <code>id</code>.
 */
@JsonPropertyOrder({
  TopologyMapInlineData.JSON_PROPERTY_EDGES,
  TopologyMapInlineData.JSON_PROPERTY_NODES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TopologyMapInlineData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EDGES = "edges";
  private TopologyMapInlineEdgesData edges;

  public static final String JSON_PROPERTY_NODES = "nodes";
  private TopologyMapInlineNodesData nodes;

  public TopologyMapInlineData edges(TopologyMapInlineEdgesData edges) {
    this.edges = edges;
    this.unparsed |= edges.unparsed;
    return this;
  }

  /**
   * Table of edges, one row per edge.
   *
   * @return edges
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EDGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TopologyMapInlineEdgesData getEdges() {
    return edges;
  }

  public void setEdges(TopologyMapInlineEdgesData edges) {
    this.edges = edges;
    if (edges != null) {
      this.unparsed |= edges.unparsed;
    }
  }

  public TopologyMapInlineData nodes(TopologyMapInlineNodesData nodes) {
    this.nodes = nodes;
    this.unparsed |= nodes.unparsed;
    return this;
  }

  /**
   * Table of nodes, one row per node.
   *
   * @return nodes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TopologyMapInlineNodesData getNodes() {
    return nodes;
  }

  public void setNodes(TopologyMapInlineNodesData nodes) {
    this.nodes = nodes;
    if (nodes != null) {
      this.unparsed |= nodes.unparsed;
    }
  }

  /** Return true if this TopologyMapInlineData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopologyMapInlineData topologyMapInlineData = (TopologyMapInlineData) o;
    return Objects.equals(this.edges, topologyMapInlineData.edges)
        && Objects.equals(this.nodes, topologyMapInlineData.nodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(edges, nodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopologyMapInlineData {\n");
    sb.append("    edges: ").append(toIndentedString(edges)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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
