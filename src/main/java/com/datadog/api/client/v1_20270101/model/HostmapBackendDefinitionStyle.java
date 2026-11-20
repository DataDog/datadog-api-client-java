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
  HostmapBackendDefinitionStyle.JSON_PROPERTY_FILL_MAX,
  HostmapBackendDefinitionStyle.JSON_PROPERTY_FILL_MIN,
  HostmapBackendDefinitionStyle.JSON_PROPERTY_PALETTE,
  HostmapBackendDefinitionStyle.JSON_PROPERTY_PALETTE_FLIP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HostmapBackendDefinitionStyle {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILL_MAX = "fill_max";
  private String fillMax;

  public static final String JSON_PROPERTY_FILL_MIN = "fill_min";
  private String fillMin;

  public static final String JSON_PROPERTY_PALETTE = "palette";
  private String palette;

  public static final String JSON_PROPERTY_PALETTE_FLIP = "palette_flip";
  private Boolean paletteFlip;

  public HostmapBackendDefinitionStyle fillMax(String fillMax) {
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
  public String getFillMax() {
    return fillMax;
  }

  public void setFillMax(String fillMax) {
    this.fillMax = fillMax;
  }

  public HostmapBackendDefinitionStyle fillMin(String fillMin) {
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
  public String getFillMin() {
    return fillMin;
  }

  public void setFillMin(String fillMin) {
    this.fillMin = fillMin;
  }

  public HostmapBackendDefinitionStyle palette(String palette) {
    this.palette = palette;
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
  public String getPalette() {
    return palette;
  }

  public void setPalette(String palette) {
    this.palette = palette;
  }

  public HostmapBackendDefinitionStyle paletteFlip(Boolean paletteFlip) {
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

  /** Return true if this HostmapBackendDefinitionStyle object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostmapBackendDefinitionStyle hostmapBackendDefinitionStyle = (HostmapBackendDefinitionStyle) o;
    return Objects.equals(this.fillMax, hostmapBackendDefinitionStyle.fillMax)
        && Objects.equals(this.fillMin, hostmapBackendDefinitionStyle.fillMin)
        && Objects.equals(this.palette, hostmapBackendDefinitionStyle.palette)
        && Objects.equals(this.paletteFlip, hostmapBackendDefinitionStyle.paletteFlip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fillMax, fillMin, palette, paletteFlip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostmapBackendDefinitionStyle {\n");
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
