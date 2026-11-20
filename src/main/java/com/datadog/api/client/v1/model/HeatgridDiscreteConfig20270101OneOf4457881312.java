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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  HeatgridDiscreteConfig20270101OneOf4457881312.JSON_PROPERTY_MODE,
  HeatgridDiscreteConfig20270101OneOf4457881312.JSON_PROPERTY_PRESET_NAME,
  HeatgridDiscreteConfig20270101OneOf4457881312.JSON_PROPERTY_SOURCE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatgridDiscreteConfig20270101OneOf4457881312 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MODE = "mode";
  private HeatgridDiscreteConfigAnyOfAnyOfItemMode4447618848_20270101 mode;

  public static final String JSON_PROPERTY_PRESET_NAME = "preset_name";
  private HeatgridPresetName_20270101 presetName;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private HeatgridDiscreteConfigAnyOfAnyOfItemSource4447619168_20270101 source;

  public HeatgridDiscreteConfig20270101OneOf4457881312() {}

  @JsonCreator
  public HeatgridDiscreteConfig20270101OneOf4457881312(
      @JsonProperty(required = true, value = JSON_PROPERTY_MODE)
          HeatgridDiscreteConfigAnyOfAnyOfItemMode4447618848_20270101 mode,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRESET_NAME)
          HeatgridPresetName_20270101 presetName,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE)
          HeatgridDiscreteConfigAnyOfAnyOfItemSource4447619168_20270101 source) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    this.presetName = presetName;
    this.unparsed |= !presetName.isValid();
    this.source = source;
    this.unparsed |= !source.isValid();
  }

  public HeatgridDiscreteConfig20270101OneOf4457881312 mode(
      HeatgridDiscreteConfigAnyOfAnyOfItemMode4447618848_20270101 mode) {
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
  public HeatgridDiscreteConfigAnyOfAnyOfItemMode4447618848_20270101 getMode() {
    return mode;
  }

  public void setMode(HeatgridDiscreteConfigAnyOfAnyOfItemMode4447618848_20270101 mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public HeatgridDiscreteConfig20270101OneOf4457881312 presetName(
      HeatgridPresetName_20270101 presetName) {
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
  public HeatgridPresetName_20270101 getPresetName() {
    return presetName;
  }

  public void setPresetName(HeatgridPresetName_20270101 presetName) {
    if (!presetName.isValid()) {
      this.unparsed = true;
    }
    this.presetName = presetName;
  }

  public HeatgridDiscreteConfig20270101OneOf4457881312 source(
      HeatgridDiscreteConfigAnyOfAnyOfItemSource4447619168_20270101 source) {
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
  public HeatgridDiscreteConfigAnyOfAnyOfItemSource4447619168_20270101 getSource() {
    return source;
  }

  public void setSource(HeatgridDiscreteConfigAnyOfAnyOfItemSource4447619168_20270101 source) {
    if (!source.isValid()) {
      this.unparsed = true;
    }
    this.source = source;
  }

  /** Return true if this HeatgridDiscreteConfig20270101OneOf4457881312 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatgridDiscreteConfig20270101OneOf4457881312 heatgridDiscreteConfig20270101OneOf4457881312 =
        (HeatgridDiscreteConfig20270101OneOf4457881312) o;
    return Objects.equals(this.mode, heatgridDiscreteConfig20270101OneOf4457881312.mode)
        && Objects.equals(this.presetName, heatgridDiscreteConfig20270101OneOf4457881312.presetName)
        && Objects.equals(this.source, heatgridDiscreteConfig20270101OneOf4457881312.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, presetName, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatgridDiscreteConfig20270101OneOf4457881312 {\n");
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
