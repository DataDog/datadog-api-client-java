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

/** A preset discrete color palette. */
@JsonPropertyOrder({
  HeatgridDiscretePresetColor.JSON_PROPERTY_MODE,
  HeatgridDiscretePresetColor.JSON_PROPERTY_PRESET_NAME,
  HeatgridDiscretePresetColor.JSON_PROPERTY_SOURCE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatgridDiscretePresetColor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MODE = "mode";
  private HeatgridDiscreteMode mode;

  public static final String JSON_PROPERTY_PRESET_NAME = "preset_name";
  private String presetName;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private HeatgridPresetColorSource source;

  public HeatgridDiscretePresetColor() {}

  @JsonCreator
  public HeatgridDiscretePresetColor(
      @JsonProperty(required = true, value = JSON_PROPERTY_MODE) HeatgridDiscreteMode mode,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRESET_NAME) String presetName,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE)
          HeatgridPresetColorSource source) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    this.presetName = presetName;
    this.source = source;
    this.unparsed |= !source.isValid();
  }

  public HeatgridDiscretePresetColor mode(HeatgridDiscreteMode mode) {
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

  public HeatgridDiscretePresetColor presetName(String presetName) {
    this.presetName = presetName;
    return this;
  }

  /**
   * Name of the preset color palette.
   *
   * @return presetName
   */
  @JsonProperty(JSON_PROPERTY_PRESET_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPresetName() {
    return presetName;
  }

  public void setPresetName(String presetName) {
    this.presetName = presetName;
  }

  public HeatgridDiscretePresetColor source(HeatgridPresetColorSource source) {
    this.source = source;
    this.unparsed |= !source.isValid();
    return this;
  }

  /**
   * Use a preset color palette.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HeatgridPresetColorSource getSource() {
    return source;
  }

  public void setSource(HeatgridPresetColorSource source) {
    if (!source.isValid()) {
      this.unparsed = true;
    }
    this.source = source;
  }

  /** Return true if this HeatgridDiscretePresetColor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatgridDiscretePresetColor heatgridDiscretePresetColor = (HeatgridDiscretePresetColor) o;
    return Objects.equals(this.mode, heatgridDiscretePresetColor.mode)
        && Objects.equals(this.presetName, heatgridDiscretePresetColor.presetName)
        && Objects.equals(this.source, heatgridDiscretePresetColor.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, presetName, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatgridDiscretePresetColor {\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    presetName: ").append(toIndentedString(presetName)).append("\n");
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
