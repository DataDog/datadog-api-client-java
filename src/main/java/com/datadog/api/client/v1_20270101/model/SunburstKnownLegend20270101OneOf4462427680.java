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
  SunburstKnownLegend20270101OneOf4462427680.JSON_PROPERTY_HIDE_PERCENT,
  SunburstKnownLegend20270101OneOf4462427680.JSON_PROPERTY_HIDE_VALUE,
  SunburstKnownLegend20270101OneOf4462427680.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SunburstKnownLegend20270101OneOf4462427680 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HIDE_PERCENT = "hide_percent";
  private Boolean hidePercent;

  public static final String JSON_PROPERTY_HIDE_VALUE = "hide_value";
  private Boolean hideValue;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SunburstKnownLegendAnyOfAnyOfItemType4452235232 type;

  public SunburstKnownLegend20270101OneOf4462427680() {}

  @JsonCreator
  public SunburstKnownLegend20270101OneOf4462427680(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          SunburstKnownLegendAnyOfAnyOfItemType4452235232 type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SunburstKnownLegend20270101OneOf4462427680 hidePercent(Boolean hidePercent) {
    this.hidePercent = hidePercent;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return hidePercent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIDE_PERCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHidePercent() {
    return hidePercent;
  }

  public void setHidePercent(Boolean hidePercent) {
    this.hidePercent = hidePercent;
  }

  public SunburstKnownLegend20270101OneOf4462427680 hideValue(Boolean hideValue) {
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

  public SunburstKnownLegend20270101OneOf4462427680 type(
      SunburstKnownLegendAnyOfAnyOfItemType4452235232 type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SunburstKnownLegendAnyOfAnyOfItemType4452235232 getType() {
    return type;
  }

  public void setType(SunburstKnownLegendAnyOfAnyOfItemType4452235232 type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this SunburstKnownLegend20270101OneOf4462427680 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SunburstKnownLegend20270101OneOf4462427680 sunburstKnownLegend20270101OneOf4462427680 =
        (SunburstKnownLegend20270101OneOf4462427680) o;
    return Objects.equals(this.hidePercent, sunburstKnownLegend20270101OneOf4462427680.hidePercent)
        && Objects.equals(this.hideValue, sunburstKnownLegend20270101OneOf4462427680.hideValue)
        && Objects.equals(this.type, sunburstKnownLegend20270101OneOf4462427680.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hidePercent, hideValue, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SunburstKnownLegend20270101OneOf4462427680 {\n");
    sb.append("    hidePercent: ").append(toIndentedString(hidePercent)).append("\n");
    sb.append("    hideValue: ").append(toIndentedString(hideValue)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
