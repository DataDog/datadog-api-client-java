/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Define request widget style for timeseries widgets. */
@JsonPropertyOrder({
  TimeseriesRequestStyle.JSON_PROPERTY_HAS_VALUE_LABELS,
  TimeseriesRequestStyle.JSON_PROPERTY_LINE_TYPE,
  TimeseriesRequestStyle.JSON_PROPERTY_LINE_WIDTH,
  TimeseriesRequestStyle.JSON_PROPERTY_ORDER_BY,
  TimeseriesRequestStyle.JSON_PROPERTY_PALETTE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesRequestStyle {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HAS_VALUE_LABELS = "has_value_labels";
  private Boolean hasValueLabels;

  public static final String JSON_PROPERTY_LINE_TYPE = "line_type";
  private WidgetLineType lineType;

  public static final String JSON_PROPERTY_LINE_WIDTH = "line_width";
  private WidgetLineWidth lineWidth;

  public static final String JSON_PROPERTY_ORDER_BY = "order_by";
  private WidgetStyleOrderBy orderBy;

  public static final String JSON_PROPERTY_PALETTE = "palette";
  private String palette;

  public TimeseriesRequestStyle hasValueLabels(Boolean hasValueLabels) {
    this.hasValueLabels = hasValueLabels;
    return this;
  }

  /**
   * If true, the value is displayed as a label relative to the data point.
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
   * Type of lines displayed.
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
   * Width of line displayed.
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
   * How to order series in timeseries visualizations. - <code>tags</code>: Order series
   * alphabetically by tag name (default behavior) - <code>values</code>: Order series by their
   * current metric values (typically descending)
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

  public TimeseriesRequestStyle palette(String palette) {
    this.palette = palette;
    return this;
  }

  /**
   * Color palette to apply to the widget.
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

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return TimeseriesRequestStyle
   */
  @JsonAnySetter
  public TimeseriesRequestStyle putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
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
    return Objects.equals(this.hasValueLabels, timeseriesRequestStyle.hasValueLabels)
        && Objects.equals(this.lineType, timeseriesRequestStyle.lineType)
        && Objects.equals(this.lineWidth, timeseriesRequestStyle.lineWidth)
        && Objects.equals(this.orderBy, timeseriesRequestStyle.orderBy)
        && Objects.equals(this.palette, timeseriesRequestStyle.palette)
        && Objects.equals(this.additionalProperties, timeseriesRequestStyle.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        hasValueLabels, lineType, lineWidth, orderBy, palette, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesRequestStyle {\n");
    sb.append("    hasValueLabels: ").append(toIndentedString(hasValueLabels)).append("\n");
    sb.append("    lineType: ").append(toIndentedString(lineType)).append("\n");
    sb.append("    lineWidth: ").append(toIndentedString(lineWidth)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    palette: ").append(toIndentedString(palette)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
