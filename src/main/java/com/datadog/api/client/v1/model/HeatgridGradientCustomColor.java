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

/** A continuous gradient with custom color stops. */
@JsonPropertyOrder({
  HeatgridGradientCustomColor.JSON_PROPERTY_MODE,
  HeatgridGradientCustomColor.JSON_PROPERTY_SOURCE,
  HeatgridGradientCustomColor.JSON_PROPERTY_STOPS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatgridGradientCustomColor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MODE = "mode";
  private HeatgridGradientMode mode;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private HeatgridCustomColorSource source;

  public static final String JSON_PROPERTY_STOPS = "stops";
  private List<HeatgridColorStop> stops = new ArrayList<>();

  public HeatgridGradientCustomColor() {}

  @JsonCreator
  public HeatgridGradientCustomColor(
      @JsonProperty(required = true, value = JSON_PROPERTY_MODE) HeatgridGradientMode mode,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE) HeatgridCustomColorSource source,
      @JsonProperty(required = true, value = JSON_PROPERTY_STOPS) List<HeatgridColorStop> stops) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    this.source = source;
    this.unparsed |= !source.isValid();
    this.stops = stops;
    for (HeatgridColorStop item : stops) {
      this.unparsed |= item.unparsed;
    }
  }

  public HeatgridGradientCustomColor mode(HeatgridGradientMode mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    return this;
  }

  /**
   * Use a continuous color gradient.
   *
   * @return mode
   */
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HeatgridGradientMode getMode() {
    return mode;
  }

  public void setMode(HeatgridGradientMode mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public HeatgridGradientCustomColor source(HeatgridCustomColorSource source) {
    this.source = source;
    this.unparsed |= !source.isValid();
    return this;
  }

  /**
   * Use custom colors.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HeatgridCustomColorSource getSource() {
    return source;
  }

  public void setSource(HeatgridCustomColorSource source) {
    if (!source.isValid()) {
      this.unparsed = true;
    }
    this.source = source;
  }

  public HeatgridGradientCustomColor stops(List<HeatgridColorStop> stops) {
    this.stops = stops;
    for (HeatgridColorStop item : stops) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public HeatgridGradientCustomColor addStopsItem(HeatgridColorStop stopsItem) {
    this.stops.add(stopsItem);
    this.unparsed |= stopsItem.unparsed;
    return this;
  }

  /**
   * Two to six stops with positions in ascending order.
   *
   * @return stops
   */
  @JsonProperty(JSON_PROPERTY_STOPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<HeatgridColorStop> getStops() {
    return stops;
  }

  public void setStops(List<HeatgridColorStop> stops) {
    this.stops = stops;
    if (stops != null) {
      for (HeatgridColorStop item : stops) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  /** Return true if this HeatgridGradientCustomColor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatgridGradientCustomColor heatgridGradientCustomColor = (HeatgridGradientCustomColor) o;
    return Objects.equals(this.mode, heatgridGradientCustomColor.mode)
        && Objects.equals(this.source, heatgridGradientCustomColor.source)
        && Objects.equals(this.stops, heatgridGradientCustomColor.stops);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, source, stops);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatgridGradientCustomColor {\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    stops: ").append(toIndentedString(stops)).append("\n");
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
