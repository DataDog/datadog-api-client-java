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

/** Discrete thresholds with custom colors. */
@JsonPropertyOrder({
  HeatgridDiscreteCustomColor.JSON_PROPERTY_BINS,
  HeatgridDiscreteCustomColor.JSON_PROPERTY_MODE,
  HeatgridDiscreteCustomColor.JSON_PROPERTY_SOURCE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatgridDiscreteCustomColor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BINS = "bins";
  private List<HeatgridColorBin> bins = new ArrayList<>();

  public static final String JSON_PROPERTY_MODE = "mode";
  private HeatgridDiscreteMode mode;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private HeatgridCustomColorSource source;

  public HeatgridDiscreteCustomColor() {}

  @JsonCreator
  public HeatgridDiscreteCustomColor(
      @JsonProperty(required = true, value = JSON_PROPERTY_BINS) List<HeatgridColorBin> bins,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODE) HeatgridDiscreteMode mode,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE)
          HeatgridCustomColorSource source) {
    this.bins = bins;
    for (HeatgridColorBin item : bins) {
      this.unparsed |= item.unparsed;
    }
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    this.source = source;
    this.unparsed |= !source.isValid();
  }

  public HeatgridDiscreteCustomColor bins(List<HeatgridColorBin> bins) {
    this.bins = bins;
    for (HeatgridColorBin item : bins) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public HeatgridDiscreteCustomColor addBinsItem(HeatgridColorBin binsItem) {
    this.bins.add(binsItem);
    this.unparsed |= binsItem.unparsed;
    return this;
  }

  /**
   * Two to six bins. Omit <code>lower_bound</code> on the first bin. Subsequent lower bounds must
   * be in ascending order.
   *
   * @return bins
   */
  @JsonProperty(JSON_PROPERTY_BINS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<HeatgridColorBin> getBins() {
    return bins;
  }

  public void setBins(List<HeatgridColorBin> bins) {
    this.bins = bins;
    if (bins != null) {
      for (HeatgridColorBin item : bins) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public HeatgridDiscreteCustomColor mode(HeatgridDiscreteMode mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    return this;
  }

  /**
   * Use discrete color thresholds.
   *
   * @return mode
   */
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HeatgridDiscreteMode getMode() {
    return mode;
  }

  public void setMode(HeatgridDiscreteMode mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public HeatgridDiscreteCustomColor source(HeatgridCustomColorSource source) {
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

  /** Return true if this HeatgridDiscreteCustomColor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatgridDiscreteCustomColor heatgridDiscreteCustomColor = (HeatgridDiscreteCustomColor) o;
    return Objects.equals(this.bins, heatgridDiscreteCustomColor.bins)
        && Objects.equals(this.mode, heatgridDiscreteCustomColor.mode)
        && Objects.equals(this.source, heatgridDiscreteCustomColor.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bins, mode, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatgridDiscreteCustomColor {\n");
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
