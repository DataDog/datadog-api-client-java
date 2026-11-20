/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  HostmapStyle.JSON_PROPERTY_FILL_MAX,
  HostmapStyle.JSON_PROPERTY_FILL_MIN,
  HostmapStyle.JSON_PROPERTY_PALETTE,
  HostmapStyle.JSON_PROPERTY_PALETTE_FLIP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HostmapStyle {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILL_MAX = "fill_max";
  private Double fillMax;

  public static final String JSON_PROPERTY_FILL_MIN = "fill_min";
  private Double fillMin;

  public static final String JSON_PROPERTY_PALETTE = "palette";
  private HostmapStylePalette palette;

  public static final String JSON_PROPERTY_PALETTE_FLIP = "palette_flip";
  private Boolean paletteFlip;

  public HostmapStyle fillMax(Double fillMax) {
    this.fillMax = fillMax;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return fillMax
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILL_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFillMax() {
    return fillMax;
  }

  public void setFillMax(Double fillMax) {
    this.fillMax = fillMax;
  }

  public HostmapStyle fillMin(Double fillMin) {
    this.fillMin = fillMin;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return fillMin
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILL_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFillMin() {
    return fillMin;
  }

  public void setFillMin(Double fillMin) {
    this.fillMin = fillMin;
  }

  public HostmapStyle palette(HostmapStylePalette palette) {
    this.palette = palette;
    this.unparsed |= !palette.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return palette
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PALETTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HostmapStylePalette getPalette() {
    return palette;
  }

  public void setPalette(HostmapStylePalette palette) {
    if (!palette.isValid()) {
      this.unparsed = true;
    }
    this.palette = palette;
  }

  public HostmapStyle paletteFlip(Boolean paletteFlip) {
    this.paletteFlip = paletteFlip;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return paletteFlip
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PALETTE_FLIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPaletteFlip() {
    return paletteFlip;
  }

  public void setPaletteFlip(Boolean paletteFlip) {
    this.paletteFlip = paletteFlip;
  }

  /** Return true if this HostmapStyle object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostmapStyle hostmapStyle = (HostmapStyle) o;
    return Objects.equals(this.fillMax, hostmapStyle.fillMax)
        && Objects.equals(this.fillMin, hostmapStyle.fillMin)
        && Objects.equals(this.palette, hostmapStyle.palette)
        && Objects.equals(this.paletteFlip, hostmapStyle.paletteFlip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fillMax, fillMin, palette, paletteFlip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostmapStyle {\n");
    sb.append("    fillMax: ").append(toIndentedString(fillMax)).append("\n");
    sb.append("    fillMin: ").append(toIndentedString(fillMin)).append("\n");
    sb.append("    palette: ").append(toIndentedString(palette)).append("\n");
    sb.append("    paletteFlip: ").append(toIndentedString(paletteFlip)).append("\n");
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
