/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.v1.client.model.WidgetLineType;
import com.datadog.api.v1.client.model.WidgetLineWidth;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Define widget style.
 */
@ApiModel(description = "Define widget style.")
@JsonPropertyOrder({
  TimeseriesWidgetRequestStyle.JSON_PROPERTY_LINE_TYPE,
  TimeseriesWidgetRequestStyle.JSON_PROPERTY_LINE_WIDTH,
  TimeseriesWidgetRequestStyle.JSON_PROPERTY_PALETTE
})

public class TimeseriesWidgetRequestStyle {
  public static final String JSON_PROPERTY_LINE_TYPE = "line_type";
  private WidgetLineType lineType;

  public static final String JSON_PROPERTY_LINE_WIDTH = "line_width";
  private WidgetLineWidth lineWidth;

  public static final String JSON_PROPERTY_PALETTE = "palette";
  private String palette;


  public TimeseriesWidgetRequestStyle lineType(WidgetLineType lineType) {
    
    this.lineType = lineType;
    return this;
  }

   /**
   * Get lineType
   * @return lineType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WidgetLineType getLineType() {
    return lineType;
  }


  public void setLineType(WidgetLineType lineType) {
    this.lineType = lineType;
  }


  public TimeseriesWidgetRequestStyle lineWidth(WidgetLineWidth lineWidth) {
    
    this.lineWidth = lineWidth;
    return this;
  }

   /**
   * Get lineWidth
   * @return lineWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINE_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WidgetLineWidth getLineWidth() {
    return lineWidth;
  }


  public void setLineWidth(WidgetLineWidth lineWidth) {
    this.lineWidth = lineWidth;
  }


  public TimeseriesWidgetRequestStyle palette(String palette) {
    
    this.palette = palette;
    return this;
  }

   /**
   * Color palette to apply to the widget.
   * @return palette
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Color palette to apply to the widget.")
  @JsonProperty(JSON_PROPERTY_PALETTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPalette() {
    return palette;
  }


  public void setPalette(String palette) {
    this.palette = palette;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesWidgetRequestStyle timeseriesWidgetRequestStyle = (TimeseriesWidgetRequestStyle) o;
    return Objects.equals(this.lineType, timeseriesWidgetRequestStyle.lineType) &&
        Objects.equals(this.lineWidth, timeseriesWidgetRequestStyle.lineWidth) &&
        Objects.equals(this.palette, timeseriesWidgetRequestStyle.palette);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineType, lineWidth, palette);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesWidgetRequestStyle {\n");
    sb.append("    lineType: ").append(toIndentedString(lineType)).append("\n");
    sb.append("    lineWidth: ").append(toIndentedString(lineWidth)).append("\n");
    sb.append("    palette: ").append(toIndentedString(palette)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

