/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Configuration of inline or automatic legends. */
@JsonPropertyOrder({
  SunburstWidgetLegendInlineAutomatic.JSON_PROPERTY_HIDE_PERCENT,
  SunburstWidgetLegendInlineAutomatic.JSON_PROPERTY_HIDE_VALUE,
  SunburstWidgetLegendInlineAutomatic.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SunburstWidgetLegendInlineAutomatic {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HIDE_PERCENT = "hide_percent";
  private Boolean hidePercent;

  public static final String JSON_PROPERTY_HIDE_VALUE = "hide_value";
  private Boolean hideValue;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SunburstWidgetLegendInlineAutomaticType type;

  public SunburstWidgetLegendInlineAutomatic() {}

  @JsonCreator
  public SunburstWidgetLegendInlineAutomatic(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          SunburstWidgetLegendInlineAutomaticType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SunburstWidgetLegendInlineAutomatic hidePercent(Boolean hidePercent) {
    this.hidePercent = hidePercent;
    return this;
  }

  /**
   * Whether to hide the percentages of the groups.
   *
   * @return hidePercent
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIDE_PERCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHidePercent() {
    return hidePercent;
  }

  public void setHidePercent(Boolean hidePercent) {
    this.hidePercent = hidePercent;
  }

  public SunburstWidgetLegendInlineAutomatic hideValue(Boolean hideValue) {
    this.hideValue = hideValue;
    return this;
  }

  /**
   * Whether to hide the values of the groups.
   *
   * @return hideValue
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIDE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHideValue() {
    return hideValue;
  }

  public void setHideValue(Boolean hideValue) {
    this.hideValue = hideValue;
  }

  public SunburstWidgetLegendInlineAutomatic type(SunburstWidgetLegendInlineAutomaticType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Whether to show the legend inline or let it be automatically generated.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SunburstWidgetLegendInlineAutomaticType getType() {
    return type;
  }

  public void setType(SunburstWidgetLegendInlineAutomaticType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this SunburstWidgetLegendInlineAutomatic object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SunburstWidgetLegendInlineAutomatic sunburstWidgetLegendInlineAutomatic =
        (SunburstWidgetLegendInlineAutomatic) o;
    return Objects.equals(this.hidePercent, sunburstWidgetLegendInlineAutomatic.hidePercent)
        && Objects.equals(this.hideValue, sunburstWidgetLegendInlineAutomatic.hideValue)
        && Objects.equals(this.type, sunburstWidgetLegendInlineAutomatic.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hidePercent, hideValue, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SunburstWidgetLegendInlineAutomatic {\n");
    sb.append("    hidePercent: ").append(toIndentedString(hidePercent)).append("\n");
    sb.append("    hideValue: ").append(toIndentedString(hideValue)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
