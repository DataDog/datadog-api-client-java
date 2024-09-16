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

/** Text format rules. */
@JsonPropertyOrder({
  TableWidgetTextFormatRule.JSON_PROPERTY_CUSTOM_BG_COLOR,
  TableWidgetTextFormatRule.JSON_PROPERTY_CUSTOM_FG_COLOR,
  TableWidgetTextFormatRule.JSON_PROPERTY_MATCH,
  TableWidgetTextFormatRule.JSON_PROPERTY_PALETTE,
  TableWidgetTextFormatRule.JSON_PROPERTY_REPLACE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TableWidgetTextFormatRule {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_BG_COLOR = "custom_bg_color";
  private String customBgColor;

  public static final String JSON_PROPERTY_CUSTOM_FG_COLOR = "custom_fg_color";
  private String customFgColor;

  public static final String JSON_PROPERTY_MATCH = "match";
  private TableWidgetTextFormatMatch match;

  public static final String JSON_PROPERTY_PALETTE = "palette";
  private TableWidgetTextFormatPalette palette = TableWidgetTextFormatPalette.WHITE_ON_GREEN;

  public static final String JSON_PROPERTY_REPLACE = "replace";
  private TableWidgetTextFormatReplace replace;

  public TableWidgetTextFormatRule() {}

  @JsonCreator
  public TableWidgetTextFormatRule(
      @JsonProperty(required = true, value = JSON_PROPERTY_MATCH)
          TableWidgetTextFormatMatch match) {
    this.match = match;
    this.unparsed |= match.unparsed;
  }

  public TableWidgetTextFormatRule customBgColor(String customBgColor) {
    this.customBgColor = customBgColor;
    return this;
  }

  /**
   * Hex representation of the custom background color. Used with custom background palette option.
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

  public TableWidgetTextFormatRule customFgColor(String customFgColor) {
    this.customFgColor = customFgColor;
    return this;
  }

  /**
   * Hex representation of the custom text color. Used with custom text palette option.
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

  public TableWidgetTextFormatRule match(TableWidgetTextFormatMatch match) {
    this.match = match;
    this.unparsed |= match.unparsed;
    return this;
  }

  /**
   * Match rule for the table widget text format.
   *
   * @return match
   */
  @JsonProperty(JSON_PROPERTY_MATCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TableWidgetTextFormatMatch getMatch() {
    return match;
  }

  public void setMatch(TableWidgetTextFormatMatch match) {
    this.match = match;
  }

  public TableWidgetTextFormatRule palette(TableWidgetTextFormatPalette palette) {
    this.palette = palette;
    this.unparsed |= !palette.isValid();
    return this;
  }

  /**
   * Color-on-color palette to highlight replaced text.
   *
   * @return palette
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PALETTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TableWidgetTextFormatPalette getPalette() {
    return palette;
  }

  public void setPalette(TableWidgetTextFormatPalette palette) {
    if (!palette.isValid()) {
      this.unparsed = true;
    }
    this.palette = palette;
  }

  public TableWidgetTextFormatRule replace(TableWidgetTextFormatReplace replace) {
    this.replace = replace;
    this.unparsed |= replace.unparsed;
    return this;
  }

  /**
   * Replace rule for the table widget text format.
   *
   * @return replace
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPLACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TableWidgetTextFormatReplace getReplace() {
    return replace;
  }

  public void setReplace(TableWidgetTextFormatReplace replace) {
    this.replace = replace;
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
   * @return TableWidgetTextFormatRule
   */
  @JsonAnySetter
  public TableWidgetTextFormatRule putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TableWidgetTextFormatRule object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableWidgetTextFormatRule tableWidgetTextFormatRule = (TableWidgetTextFormatRule) o;
    return Objects.equals(this.customBgColor, tableWidgetTextFormatRule.customBgColor)
        && Objects.equals(this.customFgColor, tableWidgetTextFormatRule.customFgColor)
        && Objects.equals(this.match, tableWidgetTextFormatRule.match)
        && Objects.equals(this.palette, tableWidgetTextFormatRule.palette)
        && Objects.equals(this.replace, tableWidgetTextFormatRule.replace)
        && Objects.equals(
            this.additionalProperties, tableWidgetTextFormatRule.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        customBgColor, customFgColor, match, palette, replace, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableWidgetTextFormatRule {\n");
    sb.append("    customBgColor: ").append(toIndentedString(customBgColor)).append("\n");
    sb.append("    customFgColor: ").append(toIndentedString(customFgColor)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    palette: ").append(toIndentedString(palette)).append("\n");
    sb.append("    replace: ").append(toIndentedString(replace)).append("\n");
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
