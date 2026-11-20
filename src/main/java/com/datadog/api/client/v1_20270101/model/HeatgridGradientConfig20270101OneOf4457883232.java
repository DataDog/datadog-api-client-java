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
  HeatgridGradientConfig20270101OneOf4457883232.JSON_PROPERTY_MODE,
  HeatgridGradientConfig20270101OneOf4457883232.JSON_PROPERTY_PRESET_NAME,
  HeatgridGradientConfig20270101OneOf4457883232.JSON_PROPERTY_SOURCE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatgridGradientConfig20270101OneOf4457883232 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MODE = "mode";
  private HeatgridGradientConfigAnyOfAnyOfItemMode4447621888 mode;

  public static final String JSON_PROPERTY_PRESET_NAME = "preset_name";
  private HeatgridPresetName presetName;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private HeatgridGradientConfigAnyOfAnyOfItemSource4447622208 source;

  public HeatgridGradientConfig20270101OneOf4457883232() {}

  @JsonCreator
  public HeatgridGradientConfig20270101OneOf4457883232(
      @JsonProperty(required = true, value = JSON_PROPERTY_MODE)
          HeatgridGradientConfigAnyOfAnyOfItemMode4447621888 mode,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRESET_NAME)
          HeatgridPresetName presetName,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE)
          HeatgridGradientConfigAnyOfAnyOfItemSource4447622208 source) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    this.presetName = presetName;
    this.unparsed |= !presetName.isValid();
    this.source = source;
    this.unparsed |= !source.isValid();
  }

  public HeatgridGradientConfig20270101OneOf4457883232 mode(
      HeatgridGradientConfigAnyOfAnyOfItemMode4447621888 mode) {
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
  public HeatgridGradientConfigAnyOfAnyOfItemMode4447621888 getMode() {
    return mode;
  }

  public void setMode(HeatgridGradientConfigAnyOfAnyOfItemMode4447621888 mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public HeatgridGradientConfig20270101OneOf4457883232 presetName(HeatgridPresetName presetName) {
    this.presetName = presetName;
    this.unparsed |= !presetName.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return presetName
   */
  @JsonProperty(JSON_PROPERTY_PRESET_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HeatgridPresetName getPresetName() {
    return presetName;
  }

  public void setPresetName(HeatgridPresetName presetName) {
    if (!presetName.isValid()) {
      this.unparsed = true;
    }
    this.presetName = presetName;
  }

  public HeatgridGradientConfig20270101OneOf4457883232 source(
      HeatgridGradientConfigAnyOfAnyOfItemSource4447622208 source) {
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
  public HeatgridGradientConfigAnyOfAnyOfItemSource4447622208 getSource() {
    return source;
  }

  public void setSource(HeatgridGradientConfigAnyOfAnyOfItemSource4447622208 source) {
    if (!source.isValid()) {
      this.unparsed = true;
    }
    this.source = source;
  }

  /** Return true if this HeatgridGradientConfig20270101OneOf4457883232 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatgridGradientConfig20270101OneOf4457883232 heatgridGradientConfig20270101OneOf4457883232 =
        (HeatgridGradientConfig20270101OneOf4457883232) o;
    return Objects.equals(this.mode, heatgridGradientConfig20270101OneOf4457883232.mode)
        && Objects.equals(this.presetName, heatgridGradientConfig20270101OneOf4457883232.presetName)
        && Objects.equals(this.source, heatgridGradientConfig20270101OneOf4457883232.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, presetName, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatgridGradientConfig20270101OneOf4457883232 {\n");
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
