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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Axis controls for the widget
 */
@ApiModel(description = "Axis controls for the widget")
@JsonPropertyOrder({
  WidgetAxis.JSON_PROPERTY_INCLUDE_ZERO,
  WidgetAxis.JSON_PROPERTY_LABEL,
  WidgetAxis.JSON_PROPERTY_MAX,
  WidgetAxis.JSON_PROPERTY_MIN,
  WidgetAxis.JSON_PROPERTY_SCALE
})

public class WidgetAxis {
  public static final String JSON_PROPERTY_INCLUDE_ZERO = "include_zero";
  private Boolean includeZero;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_MAX = "max";
  private String max = "auto";

  public static final String JSON_PROPERTY_MIN = "min";
  private String min = "auto";

  public static final String JSON_PROPERTY_SCALE = "scale";
  private String scale = "linear";


  public WidgetAxis includeZero(Boolean includeZero) {
    
    this.includeZero = includeZero;
    return this;
  }

   /**
   * TODO.
   * @return includeZero
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonProperty(JSON_PROPERTY_INCLUDE_ZERO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeZero() {
    return includeZero;
  }


  public void setIncludeZero(Boolean includeZero) {
    this.includeZero = includeZero;
  }


  public WidgetAxis label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * The label of the axis to display on the graph.
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The label of the axis to display on the graph.")
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public WidgetAxis max(String max) {
    
    this.max = max;
    return this;
  }

   /**
   * Specifies the maximum value to show on the y-axis. It takes a number, or auto for default behavior.
   * @return max
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the maximum value to show on the y-axis. It takes a number, or auto for default behavior.")
  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMax() {
    return max;
  }


  public void setMax(String max) {
    this.max = max;
  }


  public WidgetAxis min(String min) {
    
    this.min = min;
    return this;
  }

   /**
   * Specifies minimum value to show on the y-axis. It takes a number, or auto for default behavior.
   * @return min
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies minimum value to show on the y-axis. It takes a number, or auto for default behavior.")
  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMin() {
    return min;
  }


  public void setMin(String min) {
    this.min = min;
  }


  public WidgetAxis scale(String scale) {
    
    this.scale = scale;
    return this;
  }

   /**
   * Specifies the scale type. Possible values are linear, log, sqrt, pow## (eg. pow2, pow0.5..)
   * @return scale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the scale type. Possible values are linear, log, sqrt, pow## (eg. pow2, pow0.5..)")
  @JsonProperty(JSON_PROPERTY_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScale() {
    return scale;
  }


  public void setScale(String scale) {
    this.scale = scale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetAxis widgetAxis = (WidgetAxis) o;
    return Objects.equals(this.includeZero, widgetAxis.includeZero) &&
        Objects.equals(this.label, widgetAxis.label) &&
        Objects.equals(this.max, widgetAxis.max) &&
        Objects.equals(this.min, widgetAxis.min) &&
        Objects.equals(this.scale, widgetAxis.scale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeZero, label, max, min, scale);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetAxis {\n");
    sb.append("    includeZero: ").append(toIndentedString(includeZero)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
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

