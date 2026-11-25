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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  HeatgridGradientConfig20270101OneOf.JSON_PROPERTY_MODE,
  HeatgridGradientConfig20270101OneOf.JSON_PROPERTY_SOURCE,
  HeatgridGradientConfig20270101OneOf.JSON_PROPERTY_STOPS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatgridGradientConfig20270101OneOf {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MODE = "mode";
  private HeatgridGradientConfigAnyOfAnyOfItemMode_20270101 mode;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private HeatgridGradientConfigAnyOfAnyOfItemSource_20270101 source;

  public static final String JSON_PROPERTY_STOPS = "stops";
  private List<HeatgridStop_20270101> stops = new ArrayList<>();

  public HeatgridGradientConfig20270101OneOf() {}

  @JsonCreator
  public HeatgridGradientConfig20270101OneOf(
      @JsonProperty(required = true, value = JSON_PROPERTY_MODE)
          HeatgridGradientConfigAnyOfAnyOfItemMode_20270101 mode,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE)
          HeatgridGradientConfigAnyOfAnyOfItemSource_20270101 source,
      @JsonProperty(required = true, value = JSON_PROPERTY_STOPS)
          List<HeatgridStop_20270101> stops) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    this.source = source;
    this.unparsed |= !source.isValid();
    this.stops = stops;
    for (HeatgridStop_20270101 item : stops) {
      this.unparsed |= item.unparsed;
    }
  }

  public HeatgridGradientConfig20270101OneOf mode(
      HeatgridGradientConfigAnyOfAnyOfItemMode_20270101 mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return mode
   */
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HeatgridGradientConfigAnyOfAnyOfItemMode_20270101 getMode() {
    return mode;
  }

  public void setMode(HeatgridGradientConfigAnyOfAnyOfItemMode_20270101 mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public HeatgridGradientConfig20270101OneOf source(
      HeatgridGradientConfigAnyOfAnyOfItemSource_20270101 source) {
    this.source = source;
    this.unparsed |= !source.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HeatgridGradientConfigAnyOfAnyOfItemSource_20270101 getSource() {
    return source;
  }

  public void setSource(HeatgridGradientConfigAnyOfAnyOfItemSource_20270101 source) {
    if (!source.isValid()) {
      this.unparsed = true;
    }
    this.source = source;
  }

  public HeatgridGradientConfig20270101OneOf stops(List<HeatgridStop_20270101> stops) {
    this.stops = stops;
    for (HeatgridStop_20270101 item : stops) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public HeatgridGradientConfig20270101OneOf addStopsItem(HeatgridStop_20270101 stopsItem) {
    this.stops.add(stopsItem);
    this.unparsed |= stopsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return stops
   */
  @JsonProperty(JSON_PROPERTY_STOPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<HeatgridStop_20270101> getStops() {
    return stops;
  }

  public void setStops(List<HeatgridStop_20270101> stops) {
    this.stops = stops;
    if (stops != null) {
      for (HeatgridStop_20270101 item : stops) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  /** Return true if this HeatgridGradientConfig20270101OneOf object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatgridGradientConfig20270101OneOf heatgridGradientConfig20270101OneOf =
        (HeatgridGradientConfig20270101OneOf) o;
    return Objects.equals(this.mode, heatgridGradientConfig20270101OneOf.mode)
        && Objects.equals(this.source, heatgridGradientConfig20270101OneOf.source)
        && Objects.equals(this.stops, heatgridGradientConfig20270101OneOf.stops);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, source, stops);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatgridGradientConfig20270101OneOf {\n");
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
