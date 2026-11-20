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
  CustomTopologyMapLayout.JSON_PROPERTY_DIRECTION,
  CustomTopologyMapLayout.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomTopologyMapLayout {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private CustomTopologyMapLayoutDirection direction;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CustomTopologyMapLayoutType type;

  public CustomTopologyMapLayout() {}

  @JsonCreator
  public CustomTopologyMapLayout(
      @JsonProperty(required = true, value = JSON_PROPERTY_DIRECTION)
          CustomTopologyMapLayoutDirection direction,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) CustomTopologyMapLayoutType type) {
    this.direction = direction;
    this.unparsed |= !direction.isValid();
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public CustomTopologyMapLayout direction(CustomTopologyMapLayoutDirection direction) {
    this.direction = direction;
    this.unparsed |= !direction.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return direction
   */
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CustomTopologyMapLayoutDirection getDirection() {
    return direction;
  }

  public void setDirection(CustomTopologyMapLayoutDirection direction) {
    if (!direction.isValid()) {
      this.unparsed = true;
    }
    this.direction = direction;
  }

  public CustomTopologyMapLayout type(CustomTopologyMapLayoutType type) {
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
  public CustomTopologyMapLayoutType getType() {
    return type;
  }

  public void setType(CustomTopologyMapLayoutType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this CustomTopologyMapLayout object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomTopologyMapLayout customTopologyMapLayout = (CustomTopologyMapLayout) o;
    return Objects.equals(this.direction, customTopologyMapLayout.direction)
        && Objects.equals(this.type, customTopologyMapLayout.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomTopologyMapLayout {\n");
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
