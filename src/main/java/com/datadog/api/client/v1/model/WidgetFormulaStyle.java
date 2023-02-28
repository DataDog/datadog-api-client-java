/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Styling options for widget formulas. */
@JsonPropertyOrder({
  WidgetFormulaStyle.JSON_PROPERTY_PALETTE,
  WidgetFormulaStyle.JSON_PROPERTY_PALETTE_INDEX
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetFormulaStyle {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PALETTE = "palette";
  private String palette;

  public static final String JSON_PROPERTY_PALETTE_INDEX = "palette_index";
  private Long paletteIndex;

  public WidgetFormulaStyle palette(String palette) {
    this.palette = palette;
    return this;
  }

  /**
   * The color palette used to display the formula. A guide to the available color palettes can be
   * found at https://docs.datadoghq.com/dashboards/guide/widget_colors
   *
   * @return palette
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PALETTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPalette() {
    return palette;
  }

  public void setPalette(String palette) {
    this.palette = palette;
  }

  public WidgetFormulaStyle paletteIndex(Long paletteIndex) {
    this.paletteIndex = paletteIndex;
    return this;
  }

  /**
   * Index specifying which color to use within the palette.
   *
   * @return paletteIndex
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PALETTE_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPaletteIndex() {
    return paletteIndex;
  }

  public void setPaletteIndex(Long paletteIndex) {
    this.paletteIndex = paletteIndex;
  }

  /** Return true if this WidgetFormulaStyle object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetFormulaStyle widgetFormulaStyle = (WidgetFormulaStyle) o;
    return Objects.equals(this.palette, widgetFormulaStyle.palette)
        && Objects.equals(this.paletteIndex, widgetFormulaStyle.paletteIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(palette, paletteIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetFormulaStyle {\n");
    sb.append("    palette: ").append(toIndentedString(palette)).append("\n");
    sb.append("    paletteIndex: ").append(toIndentedString(paletteIndex)).append("\n");
    sb.append("}");
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
