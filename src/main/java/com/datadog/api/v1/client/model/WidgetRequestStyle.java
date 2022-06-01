/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Define request widget style. */
@JsonPropertyOrder({
  WidgetRequestStyle.JSON_PROPERTY_LINE_TYPE,
  WidgetRequestStyle.JSON_PROPERTY_LINE_WIDTH,
  WidgetRequestStyle.JSON_PROPERTY_PALETTE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetRequestStyle {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LINE_TYPE = "line_type";
  private WidgetLineType lineType;

  public static final String JSON_PROPERTY_LINE_WIDTH = "line_width";
  private WidgetLineWidth lineWidth;

  public static final String JSON_PROPERTY_PALETTE = "palette";
  private String palette;

  public WidgetRequestStyle lineType(WidgetLineType lineType) {
    this.lineType = lineType;
    this.unparsed |= !lineType.isValid();
    return this;
  }

  /**
   * Type of lines displayed.
   *
   * @return lineType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetLineType getLineType() {
    return lineType;
  }

  public void setLineType(WidgetLineType lineType) {
    if (!lineType.isValid()) {
      this.unparsed = true;
    }
    this.lineType = lineType;
  }

  public WidgetRequestStyle lineWidth(WidgetLineWidth lineWidth) {
    this.lineWidth = lineWidth;
    this.unparsed |= !lineWidth.isValid();
    return this;
  }

  /**
   * Width of line displayed.
   *
   * @return lineWidth
   */
  @javax.annotation.Nullable
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

  public WidgetRequestStyle palette(String palette) {
    this.palette = palette;
    return this;
  }

  /**
   * Color palette to apply to the widget.
   *
   * @return palette
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PALETTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPalette() {
    return palette;
  }

  public void setPalette(String palette) {
    this.palette = palette;
  }

  /** Return true if this WidgetRequestStyle object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetRequestStyle widgetRequestStyle = (WidgetRequestStyle) o;
    return Objects.equals(this.lineType, widgetRequestStyle.lineType)
        && Objects.equals(this.lineWidth, widgetRequestStyle.lineWidth)
        && Objects.equals(this.palette, widgetRequestStyle.palette);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineType, lineWidth, palette);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetRequestStyle {\n");
    sb.append("    lineType: ").append(toIndentedString(lineType)).append("\n");
    sb.append("    lineWidth: ").append(toIndentedString(lineWidth)).append("\n");
    sb.append("    palette: ").append(toIndentedString(palette)).append("\n");
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
