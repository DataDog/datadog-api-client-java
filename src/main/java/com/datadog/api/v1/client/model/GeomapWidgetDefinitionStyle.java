/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** The style to apply to the widget. */
@JsonPropertyOrder({
  GeomapWidgetDefinitionStyle.JSON_PROPERTY_PALETTE,
  GeomapWidgetDefinitionStyle.JSON_PROPERTY_PALETTE_FLIP
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GeomapWidgetDefinitionStyle {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PALETTE = "palette";
  private String palette;

  public static final String JSON_PROPERTY_PALETTE_FLIP = "palette_flip";
  private Boolean paletteFlip;

  public GeomapWidgetDefinitionStyle() {}

  @JsonCreator
  public GeomapWidgetDefinitionStyle(
      @JsonProperty(required = true, value = JSON_PROPERTY_PALETTE) String palette,
      @JsonProperty(required = true, value = JSON_PROPERTY_PALETTE_FLIP) Boolean paletteFlip) {
    this.palette = palette;
    this.paletteFlip = paletteFlip;
  }

  public GeomapWidgetDefinitionStyle palette(String palette) {
    this.palette = palette;
    return this;
  }

  /**
   * The color palette to apply to the widget.
   *
   * @return palette
   */
  @JsonProperty(JSON_PROPERTY_PALETTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPalette() {
    return palette;
  }

  public void setPalette(String palette) {
    this.palette = palette;
  }

  public GeomapWidgetDefinitionStyle paletteFlip(Boolean paletteFlip) {
    this.paletteFlip = paletteFlip;
    return this;
  }

  /**
   * Whether to flip the palette tones.
   *
   * @return paletteFlip
   */
  @JsonProperty(JSON_PROPERTY_PALETTE_FLIP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getPaletteFlip() {
    return paletteFlip;
  }

  public void setPaletteFlip(Boolean paletteFlip) {
    this.paletteFlip = paletteFlip;
  }

  /** Return true if this GeomapWidgetDefinitionStyle object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeomapWidgetDefinitionStyle geomapWidgetDefinitionStyle = (GeomapWidgetDefinitionStyle) o;
    return Objects.equals(this.palette, geomapWidgetDefinitionStyle.palette)
        && Objects.equals(this.paletteFlip, geomapWidgetDefinitionStyle.paletteFlip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(palette, paletteFlip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeomapWidgetDefinitionStyle {\n");
    sb.append("    palette: ").append(toIndentedString(palette)).append("\n");
    sb.append("    paletteFlip: ").append(toIndentedString(paletteFlip)).append("\n");
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
