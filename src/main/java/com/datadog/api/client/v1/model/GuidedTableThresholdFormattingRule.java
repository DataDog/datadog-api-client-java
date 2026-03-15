/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Conditional formatting rule that applies when a value satisfies a threshold comparator condition.
 */
@JsonPropertyOrder({
  GuidedTableThresholdFormattingRule.JSON_PROPERTY_COMPARATOR,
  GuidedTableThresholdFormattingRule.JSON_PROPERTY_CUSTOM_BG_COLOR,
  GuidedTableThresholdFormattingRule.JSON_PROPERTY_CUSTOM_FG_COLOR,
  GuidedTableThresholdFormattingRule.JSON_PROPERTY_HIDE_VALUE,
  GuidedTableThresholdFormattingRule.JSON_PROPERTY_IMAGE_URL,
  GuidedTableThresholdFormattingRule.JSON_PROPERTY_PALETTE,
  GuidedTableThresholdFormattingRule.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GuidedTableThresholdFormattingRule {
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

  public static final String JSON_PROPERTY_PALETTE = "palette";
  private GuidedTableThresholdPalette palette;

  public static final String JSON_PROPERTY_VALUE = "value";
  private GuidedTableThresholdFormattingRuleValue value;

  public GuidedTableThresholdFormattingRule() {}

  @JsonCreator
  public GuidedTableThresholdFormattingRule(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPARATOR) WidgetComparator comparator,
      @JsonProperty(required = true, value = JSON_PROPERTY_PALETTE)
          GuidedTableThresholdPalette palette) {
    this.comparator = comparator;
    this.unparsed |= !comparator.isValid();
    this.palette = palette;
    this.unparsed |= !palette.isValid();
  }

  public GuidedTableThresholdFormattingRule comparator(WidgetComparator comparator) {
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

  public GuidedTableThresholdFormattingRule customBgColor(String customBgColor) {
    this.customBgColor = customBgColor;
    return this;
  }

  /**
   * Custom background color. Used with <code>custom_bg</code> palette.
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

  public GuidedTableThresholdFormattingRule customFgColor(String customFgColor) {
    this.customFgColor = customFgColor;
    return this;
  }

  /**
   * Custom text color. Used with <code>custom_text</code> palette.
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

  public GuidedTableThresholdFormattingRule hideValue(Boolean hideValue) {
    this.hideValue = hideValue;
    return this;
  }

  /**
   * Whether to hide the data value when this rule matches.
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

  public GuidedTableThresholdFormattingRule imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * URL of an image to display as background.
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

  public GuidedTableThresholdFormattingRule palette(GuidedTableThresholdPalette palette) {
    this.palette = palette;
    this.unparsed |= !palette.isValid();
    return this;
  }

  /**
   * Color palette used by threshold-based conditional formatting and text formatting rules in a
   * guided table.
   *
   * @return palette
   */
  @JsonProperty(JSON_PROPERTY_PALETTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GuidedTableThresholdPalette getPalette() {
    return palette;
  }

  public void setPalette(GuidedTableThresholdPalette palette) {
    if (!palette.isValid()) {
      this.unparsed = true;
    }
    this.palette = palette;
  }

  public GuidedTableThresholdFormattingRule value(GuidedTableThresholdFormattingRuleValue value) {
    this.value = value;
    this.unparsed |= value.unparsed;
    return this;
  }

  /**
   * Threshold value to compare against.
   *
   * @return value
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GuidedTableThresholdFormattingRuleValue getValue() {
    return value;
  }

  public void setValue(GuidedTableThresholdFormattingRuleValue value) {
    this.value = value;
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
   * @return GuidedTableThresholdFormattingRule
   */
  @JsonAnySetter
  public GuidedTableThresholdFormattingRule putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GuidedTableThresholdFormattingRule object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuidedTableThresholdFormattingRule guidedTableThresholdFormattingRule =
        (GuidedTableThresholdFormattingRule) o;
    return Objects.equals(this.comparator, guidedTableThresholdFormattingRule.comparator)
        && Objects.equals(this.customBgColor, guidedTableThresholdFormattingRule.customBgColor)
        && Objects.equals(this.customFgColor, guidedTableThresholdFormattingRule.customFgColor)
        && Objects.equals(this.hideValue, guidedTableThresholdFormattingRule.hideValue)
        && Objects.equals(this.imageUrl, guidedTableThresholdFormattingRule.imageUrl)
        && Objects.equals(this.palette, guidedTableThresholdFormattingRule.palette)
        && Objects.equals(this.value, guidedTableThresholdFormattingRule.value)
        && Objects.equals(
            this.additionalProperties, guidedTableThresholdFormattingRule.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        comparator,
        customBgColor,
        customFgColor,
        hideValue,
        imageUrl,
        palette,
        value,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuidedTableThresholdFormattingRule {\n");
    sb.append("    comparator: ").append(toIndentedString(comparator)).append("\n");
    sb.append("    customBgColor: ").append(toIndentedString(customBgColor)).append("\n");
    sb.append("    customFgColor: ").append(toIndentedString(customFgColor)).append("\n");
    sb.append("    hideValue: ").append(toIndentedString(hideValue)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    palette: ").append(toIndentedString(palette)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
