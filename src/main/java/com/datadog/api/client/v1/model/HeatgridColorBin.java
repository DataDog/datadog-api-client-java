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

/** A color and optional lower threshold for a discrete bin. */
@JsonPropertyOrder({
  HeatgridColorBin.JSON_PROPERTY_COLOR,
  HeatgridColorBin.JSON_PROPERTY_LOWER_BOUND
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatgridColorBin {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLOR = "color";
  private HeatgridColor color;

  public static final String JSON_PROPERTY_LOWER_BOUND = "lower_bound";
  private Double lowerBound;

  public HeatgridColorBin() {}

  @JsonCreator
  public HeatgridColorBin(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLOR) HeatgridColor color) {
    this.color = color;
    this.unparsed |= color.unparsed;
  }

  public HeatgridColorBin color(HeatgridColor color) {
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

  public HeatgridColorBin lowerBound(Double lowerBound) {
    this.lowerBound = lowerBound;
    return this;
  }

  /**
   * Inclusive lower bound. Omit for the first bin.
   *
   * @return lowerBound
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOWER_BOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLowerBound() {
    return lowerBound;
  }

  public void setLowerBound(Double lowerBound) {
    this.lowerBound = lowerBound;
  }

  /** Return true if this HeatgridColorBin object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatgridColorBin heatgridColorBin = (HeatgridColorBin) o;
    return Objects.equals(this.color, heatgridColorBin.color)
        && Objects.equals(this.lowerBound, heatgridColorBin.lowerBound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, lowerBound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatgridColorBin {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    lowerBound: ").append(toIndentedString(lowerBound)).append("\n");
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
