/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  ThresholdFormattingRule.JSON_PROPERTY_COMPARATOR,
  ThresholdFormattingRule.JSON_PROPERTY_CUSTOM_BG_COLOR,
  ThresholdFormattingRule.JSON_PROPERTY_CUSTOM_FG_COLOR,
  ThresholdFormattingRule.JSON_PROPERTY_HIDE_VALUE,
  ThresholdFormattingRule.JSON_PROPERTY_HIGHLIGHT_ROW,
  ThresholdFormattingRule.JSON_PROPERTY_IMAGE_URL,
  ThresholdFormattingRule.JSON_PROPERTY_METRIC,
  ThresholdFormattingRule.JSON_PROPERTY_PALETTE,
  ThresholdFormattingRule.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ThresholdFormattingRule {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPARATOR = "comparator";
  private Comparator comparator;

  public static final String JSON_PROPERTY_CUSTOM_BG_COLOR = "custom_bg_color";
  private String customBgColor;

  public static final String JSON_PROPERTY_CUSTOM_FG_COLOR = "custom_fg_color";
  private String customFgColor;

  public static final String JSON_PROPERTY_HIDE_VALUE = "hide_value";
  private Boolean hideValue;

  public static final String JSON_PROPERTY_HIGHLIGHT_ROW = "highlight_row";
  private Boolean highlightRow;

  public static final String JSON_PROPERTY_IMAGE_URL = "image_url";
  private String imageUrl;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_PALETTE = "palette";
  private String palette;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Double value;

  public ThresholdFormattingRule() {}

  @JsonCreator
  public ThresholdFormattingRule(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPARATOR) Comparator comparator,
      @JsonProperty(required = true, value = JSON_PROPERTY_PALETTE) String palette,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE) Double value) {
    this.comparator = comparator;
    this.unparsed |= !comparator.isValid();
    this.palette = palette;
    this.value = value;
  }

  public ThresholdFormattingRule comparator(Comparator comparator) {
    this.comparator = comparator;
    this.unparsed |= !comparator.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return comparator
   */
  @JsonProperty(JSON_PROPERTY_COMPARATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Comparator getComparator() {
    return comparator;
  }

  public void setComparator(Comparator comparator) {
    if (!comparator.isValid()) {
      this.unparsed = true;
    }
    this.comparator = comparator;
  }

  public ThresholdFormattingRule customBgColor(String customBgColor) {
    this.customBgColor = customBgColor;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public ThresholdFormattingRule customFgColor(String customFgColor) {
    this.customFgColor = customFgColor;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public ThresholdFormattingRule hideValue(Boolean hideValue) {
    this.hideValue = hideValue;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public ThresholdFormattingRule highlightRow(Boolean highlightRow) {
    this.highlightRow = highlightRow;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return highlightRow
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIGHLIGHT_ROW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHighlightRow() {
    return highlightRow;
  }

  public void setHighlightRow(Boolean highlightRow) {
    this.highlightRow = highlightRow;
  }

  public ThresholdFormattingRule imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public ThresholdFormattingRule metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public ThresholdFormattingRule palette(String palette) {
    this.palette = palette;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return palette
   */
  @JsonProperty(JSON_PROPERTY_PALETTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPalette() {
    return palette;
  }

  public void setPalette(String palette) {
    this.palette = palette;
  }

  public ThresholdFormattingRule value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  /** Return true if this ThresholdFormattingRule object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThresholdFormattingRule thresholdFormattingRule = (ThresholdFormattingRule) o;
    return Objects.equals(this.comparator, thresholdFormattingRule.comparator)
        && Objects.equals(this.customBgColor, thresholdFormattingRule.customBgColor)
        && Objects.equals(this.customFgColor, thresholdFormattingRule.customFgColor)
        && Objects.equals(this.hideValue, thresholdFormattingRule.hideValue)
        && Objects.equals(this.highlightRow, thresholdFormattingRule.highlightRow)
        && Objects.equals(this.imageUrl, thresholdFormattingRule.imageUrl)
        && Objects.equals(this.metric, thresholdFormattingRule.metric)
        && Objects.equals(this.palette, thresholdFormattingRule.palette)
        && Objects.equals(this.value, thresholdFormattingRule.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        comparator,
        customBgColor,
        customFgColor,
        hideValue,
        highlightRow,
        imageUrl,
        metric,
        palette,
        value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThresholdFormattingRule {\n");
    sb.append("    comparator: ").append(toIndentedString(comparator)).append("\n");
    sb.append("    customBgColor: ").append(toIndentedString(customBgColor)).append("\n");
    sb.append("    customFgColor: ").append(toIndentedString(customFgColor)).append("\n");
    sb.append("    hideValue: ").append(toIndentedString(hideValue)).append("\n");
    sb.append("    highlightRow: ").append(toIndentedString(highlightRow)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    palette: ").append(toIndentedString(palette)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
