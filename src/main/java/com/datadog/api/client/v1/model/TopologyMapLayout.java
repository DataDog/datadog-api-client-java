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

/**
 * Algorithm that positions nodes and edges. The <code>hierarchical</code> layout places nodes in
 * ranks so edges flow in one direction.
 */
@JsonPropertyOrder({
  TopologyMapLayout.JSON_PROPERTY_DIRECTION,
  TopologyMapLayout.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TopologyMapLayout {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private TopologyMapLayoutDirection direction;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TopologyMapLayoutType type = TopologyMapLayoutType.HIERARCHICAL;

  public TopologyMapLayout() {}

  @JsonCreator
  public TopologyMapLayout(
      @JsonProperty(required = true, value = JSON_PROPERTY_DIRECTION)
          TopologyMapLayoutDirection direction,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) TopologyMapLayoutType type) {
    this.direction = direction;
    this.unparsed |= !direction.isValid();
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public TopologyMapLayout direction(TopologyMapLayoutDirection direction) {
    this.direction = direction;
    this.unparsed |= !direction.isValid();
    return this;
  }

  /**
   * Direction of ranks. For example, <code>top-to-bottom</code> places first-rank nodes at the top
   * and last-rank nodes at the bottom.
   *
   * @return direction
   */
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TopologyMapLayoutDirection getDirection() {
    return direction;
  }

  public void setDirection(TopologyMapLayoutDirection direction) {
    if (!direction.isValid()) {
      this.unparsed = true;
    }
    this.direction = direction;
  }

  public TopologyMapLayout type(TopologyMapLayoutType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of layout algorithm.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TopologyMapLayoutType getType() {
    return type;
  }

  public void setType(TopologyMapLayoutType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this TopologyMapLayout object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopologyMapLayout topologyMapLayout = (TopologyMapLayout) o;
    return Objects.equals(this.direction, topologyMapLayout.direction)
        && Objects.equals(this.type, topologyMapLayout.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopologyMapLayout {\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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
