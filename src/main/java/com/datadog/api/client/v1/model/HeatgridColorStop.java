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

/** A position and color in a continuous gradient. */
@JsonPropertyOrder({
  HeatgridColorStop.JSON_PROPERTY_COLOR,
  HeatgridColorStop.JSON_PROPERTY_POSITION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatgridColorStop {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLOR = "color";
  private HeatgridColor color;

  public static final String JSON_PROPERTY_POSITION = "position";
  private Long position;

  public HeatgridColorStop() {}

  @JsonCreator
  public HeatgridColorStop(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLOR) HeatgridColor color,
      @JsonProperty(required = true, value = JSON_PROPERTY_POSITION) Long position) {
    this.color = color;
    this.unparsed |= color.unparsed;
    this.position = position;
  }

  public HeatgridColorStop color(HeatgridColor color) {
    this.color = color;
    this.unparsed |= color.unparsed;
    return this;
  }

  /**
   * A color string, or two color strings for the light and dark themes, in that order.
   *
   * @return color
   */
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HeatgridColor getColor() {
    return color;
  }

  public void setColor(HeatgridColor color) {
    this.color = color;
    if (color != null) {
      this.unparsed |= color.unparsed;
    }
  }

  public HeatgridColorStop position(Long position) {
    this.position = position;
    return this;
  }

  /**
   * Position in the gradient, from 0 to 100. minimum: 0 maximum: 100
   *
   * @return position
   */
  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getPosition() {
    return position;
  }

  public void setPosition(Long position) {
    this.position = position;
  }

  /** Return true if this HeatgridColorStop object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatgridColorStop heatgridColorStop = (HeatgridColorStop) o;
    return Objects.equals(this.color, heatgridColorStop.color)
        && Objects.equals(this.position, heatgridColorStop.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatgridColorStop {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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
