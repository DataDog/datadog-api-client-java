/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  CustomTopologyMapInlineData.JSON_PROPERTY_EDGES,
  CustomTopologyMapInlineData.JSON_PROPERTY_NODES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomTopologyMapInlineData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EDGES = "edges";
  private CustomTopologyMapInlineEdgesData edges;

  public static final String JSON_PROPERTY_NODES = "nodes";
  private CustomTopologyMapInlineNodesData nodes;

  public CustomTopologyMapInlineData edges(CustomTopologyMapInlineEdgesData edges) {
    this.edges = edges;
    this.unparsed |= edges.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return edges
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EDGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomTopologyMapInlineEdgesData getEdges() {
    return edges;
  }

  public void setEdges(CustomTopologyMapInlineEdgesData edges) {
    this.edges = edges;
    if (edges != null) {
      this.unparsed |= edges.unparsed;
    }
  }

  public CustomTopologyMapInlineData nodes(CustomTopologyMapInlineNodesData nodes) {
    this.nodes = nodes;
    this.unparsed |= nodes.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return nodes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomTopologyMapInlineNodesData getNodes() {
    return nodes;
  }

  public void setNodes(CustomTopologyMapInlineNodesData nodes) {
    this.nodes = nodes;
    if (nodes != null) {
      this.unparsed |= nodes.unparsed;
    }
  }

  /** Return true if this CustomTopologyMapInlineData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomTopologyMapInlineData customTopologyMapInlineData = (CustomTopologyMapInlineData) o;
    return Objects.equals(this.edges, customTopologyMapInlineData.edges)
        && Objects.equals(this.nodes, customTopologyMapInlineData.nodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(edges, nodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomTopologyMapInlineData {\n");
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
