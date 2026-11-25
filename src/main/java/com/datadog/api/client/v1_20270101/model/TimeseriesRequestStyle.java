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
  TimeseriesRequestStyle.JSON_PROPERTY_COLOR_ORDER,
  TimeseriesRequestStyle.JSON_PROPERTY_HAS_VALUE_LABELS,
  TimeseriesRequestStyle.JSON_PROPERTY_LINE_TYPE,
  TimeseriesRequestStyle.JSON_PROPERTY_LINE_WIDTH,
  TimeseriesRequestStyle.JSON_PROPERTY_ORDER_BY,
  TimeseriesRequestStyle.JSON_PROPERTY_ORDER_REVERSE,
  TimeseriesRequestStyle.JSON_PROPERTY_PALETTE,
  TimeseriesRequestStyle.JSON_PROPERTY_VALUE_LABELS_DENSITY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesRequestStyle {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLOR_ORDER = "color_order";
  private TimeseriesColorOrder colorOrder;

  public static final String JSON_PROPERTY_HAS_VALUE_LABELS = "has_value_labels";
  private Boolean hasValueLabels;

  public static final String JSON_PROPERTY_LINE_TYPE = "line_type";
  private WidgetLineType lineType;

  public static final String JSON_PROPERTY_LINE_WIDTH = "line_width";
  private WidgetLineWidth lineWidth;

  public static final String JSON_PROPERTY_ORDER_BY = "order_by";
  private WidgetStyleOrderBy orderBy;

  public static final String JSON_PROPERTY_ORDER_REVERSE = "order_reverse";
  private Boolean orderReverse;

  public static final String JSON_PROPERTY_PALETTE = "palette";
  private String palette;

  public static final String JSON_PROPERTY_VALUE_LABELS_DENSITY = "value_labels_density";
  private ValueLabelsDensity valueLabelsDensity;

  public TimeseriesRequestStyle colorOrder(TimeseriesColorOrder colorOrder) {
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

  public TimeseriesRequestStyle hasValueLabels(Boolean hasValueLabels) {
    this.hasValueLabels = hasValueLabels;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return hasValueLabels
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_VALUE_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasValueLabels() {
    return hasValueLabels;
  }

  public void setHasValueLabels(Boolean hasValueLabels) {
    this.hasValueLabels = hasValueLabels;
  }

  public TimeseriesRequestStyle lineType(WidgetLineType lineType) {
    this.lineType = lineType;
    this.unparsed |= !lineType.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return lineType
   */
  @jakarta.annotation.Nullable
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

  public TimeseriesRequestStyle lineWidth(WidgetLineWidth lineWidth) {
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

  public TimeseriesRequestStyle orderBy(WidgetStyleOrderBy orderBy) {
    this.orderBy = orderBy;
    this.unparsed |= !orderBy.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return orderBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetStyleOrderBy getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(WidgetStyleOrderBy orderBy) {
    if (!orderBy.isValid()) {
      this.unparsed = true;
    }
    this.orderBy = orderBy;
  }

  public TimeseriesRequestStyle orderReverse(Boolean orderReverse) {
    this.orderReverse = orderReverse;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return orderReverse
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_REVERSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getOrderReverse() {
    return orderReverse;
  }

  public void setOrderReverse(Boolean orderReverse) {
    this.orderReverse = orderReverse;
  }

  public TimeseriesRequestStyle palette(String palette) {
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

  public TimeseriesRequestStyle valueLabelsDensity(ValueLabelsDensity valueLabelsDensity) {
    this.valueLabelsDensity = valueLabelsDensity;
    this.unparsed |= !valueLabelsDensity.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return valueLabelsDensity
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE_LABELS_DENSITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ValueLabelsDensity getValueLabelsDensity() {
    return valueLabelsDensity;
  }

  public void setValueLabelsDensity(ValueLabelsDensity valueLabelsDensity) {
    if (!valueLabelsDensity.isValid()) {
      this.unparsed = true;
    }
    this.valueLabelsDensity = valueLabelsDensity;
  }

  /** Return true if this TimeseriesRequestStyle object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesRequestStyle timeseriesRequestStyle = (TimeseriesRequestStyle) o;
    return Objects.equals(this.colorOrder, timeseriesRequestStyle.colorOrder)
        && Objects.equals(this.hasValueLabels, timeseriesRequestStyle.hasValueLabels)
        && Objects.equals(this.lineType, timeseriesRequestStyle.lineType)
        && Objects.equals(this.lineWidth, timeseriesRequestStyle.lineWidth)
        && Objects.equals(this.orderBy, timeseriesRequestStyle.orderBy)
        && Objects.equals(this.orderReverse, timeseriesRequestStyle.orderReverse)
        && Objects.equals(this.palette, timeseriesRequestStyle.palette)
        && Objects.equals(this.valueLabelsDensity, timeseriesRequestStyle.valueLabelsDensity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        colorOrder,
        hasValueLabels,
        lineType,
        lineWidth,
        orderBy,
        orderReverse,
        palette,
        valueLabelsDensity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesRequestStyle {\n");
    sb.append("    colorOrder: ").append(toIndentedString(colorOrder)).append("\n");
    sb.append("    hasValueLabels: ").append(toIndentedString(hasValueLabels)).append("\n");
    sb.append("    lineType: ").append(toIndentedString(lineType)).append("\n");
    sb.append("    lineWidth: ").append(toIndentedString(lineWidth)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    orderReverse: ").append(toIndentedString(orderReverse)).append("\n");
    sb.append("    palette: ").append(toIndentedString(palette)).append("\n");
    sb.append("    valueLabelsDensity: ").append(toIndentedString(valueLabelsDensity)).append("\n");
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
