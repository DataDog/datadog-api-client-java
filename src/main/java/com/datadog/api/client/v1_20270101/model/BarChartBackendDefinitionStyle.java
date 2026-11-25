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
  BarChartBackendDefinitionStyle.JSON_PROPERTY_DISPLAY,
  BarChartBackendDefinitionStyle.JSON_PROPERTY_PALETTE,
  BarChartBackendDefinitionStyle.JSON_PROPERTY_SCALING
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class BarChartBackendDefinitionStyle {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISPLAY = "display";
  private BarChartBackendDefinitionStyle20270101Display display;

  public static final String JSON_PROPERTY_PALETTE = "palette";
  private String palette;

  public static final String JSON_PROPERTY_SCALING = "scaling";
  private BarChartBackendDefinitionStyleScaling scaling;

  public BarChartBackendDefinitionStyle display(
      BarChartBackendDefinitionStyle20270101Display display) {
    this.display = display;
    this.unparsed |= display.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return display
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BarChartBackendDefinitionStyle20270101Display getDisplay() {
    return display;
  }

  public void setDisplay(BarChartBackendDefinitionStyle20270101Display display) {
    this.display = display;
    if (display != null) {
      this.unparsed |= display.unparsed;
    }
  }

  public BarChartBackendDefinitionStyle palette(String palette) {
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

  public BarChartBackendDefinitionStyle scaling(BarChartBackendDefinitionStyleScaling scaling) {
    this.scaling = scaling;
    this.unparsed |= !scaling.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return scaling
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCALING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BarChartBackendDefinitionStyleScaling getScaling() {
    return scaling;
  }

  public void setScaling(BarChartBackendDefinitionStyleScaling scaling) {
    if (!scaling.isValid()) {
      this.unparsed = true;
    }
    this.scaling = scaling;
  }

  /** Return true if this BarChartBackendDefinitionStyle object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BarChartBackendDefinitionStyle barChartBackendDefinitionStyle =
        (BarChartBackendDefinitionStyle) o;
    return Objects.equals(this.display, barChartBackendDefinitionStyle.display)
        && Objects.equals(this.palette, barChartBackendDefinitionStyle.palette)
        && Objects.equals(this.scaling, barChartBackendDefinitionStyle.scaling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(display, palette, scaling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BarChartBackendDefinitionStyle {\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    palette: ").append(toIndentedString(palette)).append("\n");
    sb.append("    scaling: ").append(toIndentedString(scaling)).append("\n");
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
