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
import java.util.Objects;

/** Mapping from one result column to one node field. */
@JsonPropertyOrder({
  TopologyRequestCustomProjectionDimension.JSON_PROPERTY_COLUMN,
  TopologyRequestCustomProjectionDimension.JSON_PROPERTY_DIMENSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TopologyRequestCustomProjectionDimension {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMN = "column";
  private String column;

  public static final String JSON_PROPERTY_DIMENSION = "dimension";
  private String dimension;

  public TopologyRequestCustomProjectionDimension() {}

  @JsonCreator
  public TopologyRequestCustomProjectionDimension(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMN) String column,
      @JsonProperty(required = true, value = JSON_PROPERTY_DIMENSION) String dimension) {
    this.column = column;
    this.dimension = dimension;
  }

  public TopologyRequestCustomProjectionDimension column(String column) {
    this.column = column;
    return this;
  }

  /**
   * Column name from the result. Must be a group-by tag key or a formula.
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

  public TopologyRequestCustomProjectionDimension dimension(String dimension) {
    this.dimension = dimension;
    return this;
  }

  /**
   * Node field that receives the column's value: <code>id</code>, <code>title</code>, <code>
   * subtitle</code>, or <code>values[N]</code> for the value at position N. When <code>id</code> is
   * not set, each node's ID is derived from the group-by tags (for example, <code>
   * env:prod,service:web</code>). When <code>title</code> is not set, the title is the node's ID.
   * When several rows set the same non-<code>id</code> field on a node, the last non-null value
   * wins.
   *
   * @return dimension
   */
  @JsonProperty(JSON_PROPERTY_DIMENSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDimension() {
    return dimension;
  }

  public void setDimension(String dimension) {
    this.dimension = dimension;
  }

  /** Return true if this TopologyRequestCustomProjectionDimension object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopologyRequestCustomProjectionDimension topologyRequestCustomProjectionDimension =
        (TopologyRequestCustomProjectionDimension) o;
    return Objects.equals(this.column, topologyRequestCustomProjectionDimension.column)
        && Objects.equals(this.dimension, topologyRequestCustomProjectionDimension.dimension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, dimension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopologyRequestCustomProjectionDimension {\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
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
