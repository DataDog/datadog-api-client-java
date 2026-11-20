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
@JsonPropertyOrder({HeatgridStop.JSON_PROPERTY_COLOR, HeatgridStop.JSON_PROPERTY_POSITION})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatgridStop {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLOR = "color";
  private HeatgridColor color;

  public static final String JSON_PROPERTY_POSITION = "position";
  private Double position;

  public HeatgridStop() {}

  @JsonCreator
  public HeatgridStop(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLOR) HeatgridColor color,
      @JsonProperty(required = true, value = JSON_PROPERTY_POSITION) Double position) {
    this.color = color;
    this.unparsed |= color.unparsed;
    this.position = position;
  }

  public HeatgridStop color(HeatgridColor color) {
    this.color = color;
    this.unparsed |= color.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public HeatgridStop position(Double position) {
    this.position = position;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return position
   */
  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getPosition() {
    return position;
  }

  public void setPosition(Double position) {
    this.position = position;
  }

  /** Return true if this HeatgridStop object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatgridStop heatgridStop = (HeatgridStop) o;
    return Objects.equals(this.color, heatgridStop.color)
        && Objects.equals(this.position, heatgridStop.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatgridStop {\n");
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
