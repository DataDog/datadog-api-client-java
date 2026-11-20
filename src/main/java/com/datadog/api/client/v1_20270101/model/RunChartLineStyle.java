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
  RunChartLineStyle.JSON_PROPERTY_COLOR_ORDER,
  RunChartLineStyle.JSON_PROPERTY_LINE_WIDTH,
  RunChartLineStyle.JSON_PROPERTY_PALETTE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RunChartLineStyle {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLOR_ORDER = "color_order";
  private TimeseriesColorOrder colorOrder;

  public static final String JSON_PROPERTY_LINE_WIDTH = "line_width";
  private WidgetLineWidth lineWidth;

  public static final String JSON_PROPERTY_PALETTE = "palette";
  private String palette;

  public RunChartLineStyle colorOrder(TimeseriesColorOrder colorOrder) {
    this.colorOrder = colorOrder;
    this.unparsed |= !colorOrder.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return colorOrder
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLOR_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TimeseriesColorOrder getColorOrder() {
    return colorOrder;
  }

  public void setColorOrder(TimeseriesColorOrder colorOrder) {
    if (!colorOrder.isValid()) {
      this.unparsed = true;
    }
    this.colorOrder = colorOrder;
  }

  public RunChartLineStyle lineWidth(WidgetLineWidth lineWidth) {
    this.lineWidth = lineWidth;
    this.unparsed |= !lineWidth.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return lineWidth
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetLineWidth getLineWidth() {
    return lineWidth;
  }

  public void setLineWidth(WidgetLineWidth lineWidth) {
    if (!lineWidth.isValid()) {
      this.unparsed = true;
    }
    this.lineWidth = lineWidth;
  }

  public RunChartLineStyle palette(String palette) {
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

  /** Return true if this RunChartLineStyle object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunChartLineStyle runChartLineStyle = (RunChartLineStyle) o;
    return Objects.equals(this.colorOrder, runChartLineStyle.colorOrder)
        && Objects.equals(this.lineWidth, runChartLineStyle.lineWidth)
        && Objects.equals(this.palette, runChartLineStyle.palette);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorOrder, lineWidth, palette);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunChartLineStyle {\n");
    sb.append("    colorOrder: ").append(toIndentedString(colorOrder)).append("\n");
    sb.append("    lineWidth: ").append(toIndentedString(lineWidth)).append("\n");
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
