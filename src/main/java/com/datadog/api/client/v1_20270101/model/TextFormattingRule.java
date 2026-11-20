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
  TextFormattingRule.JSON_PROPERTY_CUSTOM_BG_COLOR,
  TextFormattingRule.JSON_PROPERTY_CUSTOM_FG_COLOR,
  TextFormattingRule.JSON_PROPERTY_HIGHLIGHT_ROW,
  TextFormattingRule.JSON_PROPERTY_MATCH,
  TextFormattingRule.JSON_PROPERTY_PALETTE,
  TextFormattingRule.JSON_PROPERTY_REPLACE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TextFormattingRule {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_BG_COLOR = "custom_bg_color";
  private String customBgColor;

  public static final String JSON_PROPERTY_CUSTOM_FG_COLOR = "custom_fg_color";
  private String customFgColor;

  public static final String JSON_PROPERTY_HIGHLIGHT_ROW = "highlight_row";
  private Boolean highlightRow;

  public static final String JSON_PROPERTY_MATCH = "match";
  private TextMatch match;

  public static final String JSON_PROPERTY_PALETTE = "palette";
  private ThresholdPaletteWithCustom palette;

  public static final String JSON_PROPERTY_REPLACE = "replace";
  private TextFormattingRule20270101Replace replace;

  public TextFormattingRule() {}

  @JsonCreator
  public TextFormattingRule(
      @JsonProperty(required = true, value = JSON_PROPERTY_MATCH) TextMatch match) {
    this.match = match;
    this.unparsed |= match.unparsed;
  }

  public TextFormattingRule customBgColor(String customBgColor) {
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

  public TextFormattingRule customFgColor(String customFgColor) {
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

  public TextFormattingRule highlightRow(Boolean highlightRow) {
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

  public TextFormattingRule match(TextMatch match) {
    this.match = match;
    this.unparsed |= match.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return match
   */
  @JsonProperty(JSON_PROPERTY_MATCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TextMatch getMatch() {
    return match;
  }

  public void setMatch(TextMatch match) {
    this.match = match;
    if (match != null) {
      this.unparsed |= match.unparsed;
    }
  }

  public TextFormattingRule palette(ThresholdPaletteWithCustom palette) {
    this.palette = palette;
    this.unparsed |= palette.unparsed;
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
  public ThresholdPaletteWithCustom getPalette() {
    return palette;
  }

  public void setPalette(ThresholdPaletteWithCustom palette) {
    this.palette = palette;
    if (palette != null) {
      this.unparsed |= palette.unparsed;
    }
  }

  public TextFormattingRule replace(TextFormattingRule20270101Replace replace) {
    this.replace = replace;
    this.unparsed |= replace.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return replace
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPLACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TextFormattingRule20270101Replace getReplace() {
    return replace;
  }

  public void setReplace(TextFormattingRule20270101Replace replace) {
    this.replace = replace;
    if (replace != null) {
      this.unparsed |= replace.unparsed;
    }
  }

  /** Return true if this TextFormattingRule object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextFormattingRule textFormattingRule = (TextFormattingRule) o;
    return Objects.equals(this.customBgColor, textFormattingRule.customBgColor)
        && Objects.equals(this.customFgColor, textFormattingRule.customFgColor)
        && Objects.equals(this.highlightRow, textFormattingRule.highlightRow)
        && Objects.equals(this.match, textFormattingRule.match)
        && Objects.equals(this.palette, textFormattingRule.palette)
        && Objects.equals(this.replace, textFormattingRule.replace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customBgColor, customFgColor, highlightRow, match, palette, replace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextFormattingRule {\n");
    sb.append("    customBgColor: ").append(toIndentedString(customBgColor)).append("\n");
    sb.append("    customFgColor: ").append(toIndentedString(customFgColor)).append("\n");
    sb.append("    highlightRow: ").append(toIndentedString(highlightRow)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    palette: ").append(toIndentedString(palette)).append("\n");
    sb.append("    replace: ").append(toIndentedString(replace)).append("\n");
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
