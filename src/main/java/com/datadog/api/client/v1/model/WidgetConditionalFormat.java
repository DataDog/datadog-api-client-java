/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Define a conditional format for the widget. */
@JsonPropertyOrder({
  WidgetConditionalFormat.JSON_PROPERTY_COMPARATOR,
  WidgetConditionalFormat.JSON_PROPERTY_CUSTOM_BG_COLOR,
  WidgetConditionalFormat.JSON_PROPERTY_CUSTOM_FG_COLOR,
  WidgetConditionalFormat.JSON_PROPERTY_HIDE_VALUE,
  WidgetConditionalFormat.JSON_PROPERTY_IMAGE_URL,
  WidgetConditionalFormat.JSON_PROPERTY_METRIC,
  WidgetConditionalFormat.JSON_PROPERTY_PALETTE,
  WidgetConditionalFormat.JSON_PROPERTY_TIMEFRAME,
  WidgetConditionalFormat.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetConditionalFormat {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPARATOR = "comparator";
  private WidgetComparator comparator;

  public static final String JSON_PROPERTY_CUSTOM_BG_COLOR = "custom_bg_color";
  private String customBgColor;

  public static final String JSON_PROPERTY_CUSTOM_FG_COLOR = "custom_fg_color";
  private String customFgColor;

  public static final String JSON_PROPERTY_HIDE_VALUE = "hide_value";
  private Boolean hideValue;

  public static final String JSON_PROPERTY_IMAGE_URL = "image_url";
  private String imageUrl;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_PALETTE = "palette";
  private WidgetPalette palette;

  public static final String JSON_PROPERTY_TIMEFRAME = "timeframe";
  private String timeframe;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Double value;

  public WidgetConditionalFormat() {}

  @JsonCreator
  public WidgetConditionalFormat(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPARATOR) WidgetComparator comparator,
      @JsonProperty(required = true, value = JSON_PROPERTY_PALETTE) WidgetPalette palette,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE) Double value) {
    this.comparator = comparator;
    this.unparsed |= !comparator.isValid();
    this.palette = palette;
    this.unparsed |= !palette.isValid();
    this.value = value;
  }

  public WidgetConditionalFormat comparator(WidgetComparator comparator) {
    this.comparator = comparator;
    this.unparsed |= !comparator.isValid();
    return this;
  }

  /**
   * Comparator to apply.
   *
   * @return comparator
   */
  @JsonProperty(JSON_PROPERTY_COMPARATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public WidgetComparator getComparator() {
    return comparator;
  }

  public void setComparator(WidgetComparator comparator) {
    if (!comparator.isValid()) {
      this.unparsed = true;
    }
    this.comparator = comparator;
  }

  public WidgetConditionalFormat customBgColor(String customBgColor) {
    this.customBgColor = customBgColor;
    return this;
  }

  /**
   * Color palette to apply to the background, same values available as palette.
   *
   * @return customBgColor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_BG_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomBgColor() {
    return customBgColor;
  }

  public void setCustomBgColor(String customBgColor) {
    this.customBgColor = customBgColor;
  }

  public WidgetConditionalFormat customFgColor(String customFgColor) {
    this.customFgColor = customFgColor;
    return this;
  }

  /**
   * Color palette to apply to the foreground, same values available as palette.
   *
   * @return customFgColor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_FG_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomFgColor() {
    return customFgColor;
  }

  public void setCustomFgColor(String customFgColor) {
    this.customFgColor = customFgColor;
  }

  public WidgetConditionalFormat hideValue(Boolean hideValue) {
    this.hideValue = hideValue;
    return this;
  }

  /**
   * True hides values.
   *
   * @return hideValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIDE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHideValue() {
    return hideValue;
  }

  public void setHideValue(Boolean hideValue) {
    this.hideValue = hideValue;
  }

  public WidgetConditionalFormat imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Displays an image as the background.
   *
   * @return imageUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public WidgetConditionalFormat metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * Metric from the request to correlate this conditional format with.
   *
   * @return metric
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMetric() {
    return metric;
  }

  public void setMetric(String metric) {
    this.metric = metric;
  }

  public WidgetConditionalFormat palette(WidgetPalette palette) {
    this.palette = palette;
    this.unparsed |= !palette.isValid();
    return this;
  }

  /**
   * Color palette to apply.
   *
   * @return palette
   */
  @JsonProperty(JSON_PROPERTY_PALETTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public WidgetPalette getPalette() {
    return palette;
  }

  public void setPalette(WidgetPalette palette) {
    if (!palette.isValid()) {
      this.unparsed = true;
    }
    this.palette = palette;
  }

  public WidgetConditionalFormat timeframe(String timeframe) {
    this.timeframe = timeframe;
    return this;
  }

  /**
   * Defines the displayed timeframe.
   *
   * @return timeframe
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEFRAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTimeframe() {
    return timeframe;
  }

  public void setTimeframe(String timeframe) {
    this.timeframe = timeframe;
  }

  public WidgetConditionalFormat value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * Value for the comparator.
   *
   * @return value
   */
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  /** Return true if this WidgetConditionalFormat object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetConditionalFormat widgetConditionalFormat = (WidgetConditionalFormat) o;
    return Objects.equals(this.comparator, widgetConditionalFormat.comparator)
        && Objects.equals(this.customBgColor, widgetConditionalFormat.customBgColor)
        && Objects.equals(this.customFgColor, widgetConditionalFormat.customFgColor)
        && Objects.equals(this.hideValue, widgetConditionalFormat.hideValue)
        && Objects.equals(this.imageUrl, widgetConditionalFormat.imageUrl)
        && Objects.equals(this.metric, widgetConditionalFormat.metric)
        && Objects.equals(this.palette, widgetConditionalFormat.palette)
        && Objects.equals(this.timeframe, widgetConditionalFormat.timeframe)
        && Objects.equals(this.value, widgetConditionalFormat.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        comparator,
        customBgColor,
        customFgColor,
        hideValue,
        imageUrl,
        metric,
        palette,
        timeframe,
        value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetConditionalFormat {\n");
    sb.append("    comparator: ").append(toIndentedString(comparator)).append("\n");
    sb.append("    customBgColor: ").append(toIndentedString(customBgColor)).append("\n");
    sb.append("    customFgColor: ").append(toIndentedString(customFgColor)).append("\n");
    sb.append("    hideValue: ").append(toIndentedString(hideValue)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    palette: ").append(toIndentedString(palette)).append("\n");
    sb.append("    timeframe: ").append(toIndentedString(timeframe)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
