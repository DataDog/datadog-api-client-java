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
  GeomapRequestStyle.JSON_PROPERTY_COLOR_BY,
  GeomapRequestStyle.JSON_PROPERTY_PALETTE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GeomapRequestStyle {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLOR_BY = "color_by";
  private String colorBy;

  public static final String JSON_PROPERTY_PALETTE = "palette";
  private String palette;

  public GeomapRequestStyle colorBy(String colorBy) {
    this.colorBy = colorBy;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return colorBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLOR_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getColorBy() {
    return colorBy;
  }

  public void setColorBy(String colorBy) {
    this.colorBy = colorBy;
  }

  public GeomapRequestStyle palette(String palette) {
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

  /** Return true if this GeomapRequestStyle object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeomapRequestStyle geomapRequestStyle = (GeomapRequestStyle) o;
    return Objects.equals(this.colorBy, geomapRequestStyle.colorBy)
        && Objects.equals(this.palette, geomapRequestStyle.palette);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorBy, palette);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeomapRequestStyle {\n");
    sb.append("    colorBy: ").append(toIndentedString(colorBy)).append("\n");
    sb.append("    palette: ").append(toIndentedString(palette)).append("\n");
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
