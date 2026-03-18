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

/** Formats values according to where they fall on a color scale. */
@JsonPropertyOrder({
  GuidedTableRangeFormattingRule.JSON_PROPERTY_MAX,
  GuidedTableRangeFormattingRule.JSON_PROPERTY_MIN,
  GuidedTableRangeFormattingRule.JSON_PROPERTY_PALETTE,
  GuidedTableRangeFormattingRule.JSON_PROPERTY_REVERSE,
  GuidedTableRangeFormattingRule.JSON_PROPERTY_SCALE,
  GuidedTableRangeFormattingRule.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GuidedTableRangeFormattingRule {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MAX = "max";
  private Double max;

  public static final String JSON_PROPERTY_MIN = "min";
  private Double min;

  public static final String JSON_PROPERTY_PALETTE = "palette";
  private GuidedTableRangePalette palette;

  public static final String JSON_PROPERTY_REVERSE = "reverse";
  private Boolean reverse;

  public static final String JSON_PROPERTY_SCALE = "scale";
  private GuidedTableRangeFormattingRuleScale scale;

  public static final String JSON_PROPERTY_TYPE = "type";
  private GuidedTableRangeFormattingRuleType type;

  public GuidedTableRangeFormattingRule() {}

  @JsonCreator
  public GuidedTableRangeFormattingRule(
      @JsonProperty(required = true, value = JSON_PROPERTY_PALETTE) GuidedTableRangePalette palette,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          GuidedTableRangeFormattingRuleType type) {
    this.palette = palette;
    this.unparsed |= !palette.isValid();
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public GuidedTableRangeFormattingRule max(Double max) {
    this.max = max;
    return this;
  }

  /**
   * Maximum value on the mapping scale.
   *
   * @return max
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getMax() {
    return max;
  }

  public void setMax(Double max) {
    this.max = max;
  }

  public GuidedTableRangeFormattingRule min(Double min) {
    this.min = min;
    return this;
  }

  /**
   * Minimum value on the mapping scale.
   *
   * @return min
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getMin() {
    return min;
  }

  public void setMin(Double min) {
    this.min = min;
  }

  public GuidedTableRangeFormattingRule palette(GuidedTableRangePalette palette) {
    this.palette = palette;
    this.unparsed |= !palette.isValid();
    return this;
  }

  /**
   * Color palette used by range-based conditional formatting rules.
   *
   * @return palette
   */
  @JsonProperty(JSON_PROPERTY_PALETTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GuidedTableRangePalette getPalette() {
    return palette;
  }

  public void setPalette(GuidedTableRangePalette palette) {
    if (!palette.isValid()) {
      this.unparsed = true;
    }
    this.palette = palette;
  }

  public GuidedTableRangeFormattingRule reverse(Boolean reverse) {
    this.reverse = reverse;
    return this;
  }

  /**
   * Whether to reverse the palette scale direction.
   *
   * @return reverse
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVERSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getReverse() {
    return reverse;
  }

  public void setReverse(Boolean reverse) {
    this.reverse = reverse;
  }

  public GuidedTableRangeFormattingRule scale(GuidedTableRangeFormattingRuleScale scale) {
    this.scale = scale;
    this.unparsed |= !scale.isValid();
    return this;
  }

  /**
   * Scale function for mapping values to colors.
   *
   * @return scale
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GuidedTableRangeFormattingRuleScale getScale() {
    return scale;
  }

  public void setScale(GuidedTableRangeFormattingRuleScale scale) {
    if (!scale.isValid()) {
      this.unparsed = true;
    }
    this.scale = scale;
  }

  public GuidedTableRangeFormattingRule type(GuidedTableRangeFormattingRuleType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Gettype
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GuidedTableRangeFormattingRuleType getType() {
    return type;
  }

  public void setType(GuidedTableRangeFormattingRuleType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return GuidedTableRangeFormattingRule
   */
  @JsonAnySetter
  public GuidedTableRangeFormattingRule putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GuidedTableRangeFormattingRule object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuidedTableRangeFormattingRule guidedTableRangeFormattingRule =
        (GuidedTableRangeFormattingRule) o;
    return Objects.equals(this.max, guidedTableRangeFormattingRule.max)
        && Objects.equals(this.min, guidedTableRangeFormattingRule.min)
        && Objects.equals(this.palette, guidedTableRangeFormattingRule.palette)
        && Objects.equals(this.reverse, guidedTableRangeFormattingRule.reverse)
        && Objects.equals(this.scale, guidedTableRangeFormattingRule.scale)
        && Objects.equals(this.type, guidedTableRangeFormattingRule.type)
        && Objects.equals(
            this.additionalProperties, guidedTableRangeFormattingRule.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, min, palette, reverse, scale, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuidedTableRangeFormattingRule {\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    palette: ").append(toIndentedString(palette)).append("\n");
    sb.append("    reverse: ").append(toIndentedString(reverse)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
