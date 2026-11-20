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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  HeatgridDiscreteConfig20270101OneOf.JSON_PROPERTY_BINS,
  HeatgridDiscreteConfig20270101OneOf.JSON_PROPERTY_MODE,
  HeatgridDiscreteConfig20270101OneOf.JSON_PROPERTY_SOURCE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatgridDiscreteConfig20270101OneOf {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BINS = "bins";
  private List<HeatgridBin> bins = new ArrayList<>();

  public static final String JSON_PROPERTY_MODE = "mode";
  private HeatgridDiscreteConfigAnyOfAnyOfItemMode mode;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private HeatgridDiscreteConfigAnyOfAnyOfItemSource source;

  public HeatgridDiscreteConfig20270101OneOf() {}

  @JsonCreator
  public HeatgridDiscreteConfig20270101OneOf(
      @JsonProperty(required = true, value = JSON_PROPERTY_BINS) List<HeatgridBin> bins,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODE)
          HeatgridDiscreteConfigAnyOfAnyOfItemMode mode,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE)
          HeatgridDiscreteConfigAnyOfAnyOfItemSource source) {
    this.bins = bins;
    for (HeatgridBin item : bins) {
      this.unparsed |= item.unparsed;
    }
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    this.source = source;
    this.unparsed |= !source.isValid();
  }

  public HeatgridDiscreteConfig20270101OneOf bins(List<HeatgridBin> bins) {
    this.bins = bins;
    for (HeatgridBin item : bins) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public HeatgridDiscreteConfig20270101OneOf addBinsItem(HeatgridBin binsItem) {
    this.bins.add(binsItem);
    this.unparsed |= binsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return bins
   */
  @JsonProperty(JSON_PROPERTY_BINS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<HeatgridBin> getBins() {
    return bins;
  }

  public void setBins(List<HeatgridBin> bins) {
    this.bins = bins;
    if (bins != null) {
      for (HeatgridBin item : bins) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public HeatgridDiscreteConfig20270101OneOf mode(HeatgridDiscreteConfigAnyOfAnyOfItemMode mode) {
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
  public HeatgridDiscreteConfigAnyOfAnyOfItemMode getMode() {
    return mode;
  }

  public void setMode(HeatgridDiscreteConfigAnyOfAnyOfItemMode mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public HeatgridDiscreteConfig20270101OneOf source(
      HeatgridDiscreteConfigAnyOfAnyOfItemSource source) {
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
  public HeatgridDiscreteConfigAnyOfAnyOfItemSource getSource() {
    return source;
  }

  public void setSource(HeatgridDiscreteConfigAnyOfAnyOfItemSource source) {
    if (!source.isValid()) {
      this.unparsed = true;
    }
    this.source = source;
  }

  /** Return true if this HeatgridDiscreteConfig20270101OneOf object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatgridDiscreteConfig20270101OneOf heatgridDiscreteConfig20270101OneOf =
        (HeatgridDiscreteConfig20270101OneOf) o;
    return Objects.equals(this.bins, heatgridDiscreteConfig20270101OneOf.bins)
        && Objects.equals(this.mode, heatgridDiscreteConfig20270101OneOf.mode)
        && Objects.equals(this.source, heatgridDiscreteConfig20270101OneOf.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bins, mode, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatgridDiscreteConfig20270101OneOf {\n");
    sb.append("    bins: ").append(toIndentedString(bins)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
