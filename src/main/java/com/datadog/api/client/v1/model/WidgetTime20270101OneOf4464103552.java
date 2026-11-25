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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  WidgetTime20270101OneOf4464103552.JSON_PROPERTY_HIDE_INCOMPLETE_COST_DATA,
  WidgetTime20270101OneOf4464103552.JSON_PROPERTY_TYPE,
  WidgetTime20270101OneOf4464103552.JSON_PROPERTY_UNIT,
  WidgetTime20270101OneOf4464103552.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetTime20270101OneOf4464103552 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HIDE_INCOMPLETE_COST_DATA = "hide_incomplete_cost_data";
  private Boolean hideIncompleteCostData;

  public static final String JSON_PROPERTY_TYPE = "type";
  private WidgetNewLiveSpanType_20270101 type;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private String unit;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Double value;

  public WidgetTime20270101OneOf4464103552() {}

  @JsonCreator
  public WidgetTime20270101OneOf4464103552(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          WidgetNewLiveSpanType_20270101 type,
      @JsonProperty(required = true, value = JSON_PROPERTY_UNIT) String unit,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE) Double value) {
    this.type = type;
    this.unparsed |= !type.isValid();
    this.unit = unit;
    this.value = value;
  }

  public WidgetTime20270101OneOf4464103552 hideIncompleteCostData(Boolean hideIncompleteCostData) {
    this.hideIncompleteCostData = hideIncompleteCostData;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return hideIncompleteCostData
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIDE_INCOMPLETE_COST_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHideIncompleteCostData() {
    return hideIncompleteCostData;
  }

  public void setHideIncompleteCostData(Boolean hideIncompleteCostData) {
    this.hideIncompleteCostData = hideIncompleteCostData;
  }

  public WidgetTime20270101OneOf4464103552 type(WidgetNewLiveSpanType_20270101 type) {
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
  public WidgetNewLiveSpanType_20270101 getType() {
    return type;
  }

  public void setType(WidgetNewLiveSpanType_20270101 type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public WidgetTime20270101OneOf4464103552 unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return unit
   */
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public WidgetTime20270101OneOf4464103552 value(Double value) {
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

  /** Return true if this WidgetTime20270101OneOf4464103552 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetTime20270101OneOf4464103552 widgetTime20270101OneOf4464103552 =
        (WidgetTime20270101OneOf4464103552) o;
    return Objects.equals(
            this.hideIncompleteCostData, widgetTime20270101OneOf4464103552.hideIncompleteCostData)
        && Objects.equals(this.type, widgetTime20270101OneOf4464103552.type)
        && Objects.equals(this.unit, widgetTime20270101OneOf4464103552.unit)
        && Objects.equals(this.value, widgetTime20270101OneOf4464103552.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hideIncompleteCostData, type, unit, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetTime20270101OneOf4464103552 {\n");
    sb.append("    hideIncompleteCostData: ")
        .append(toIndentedString(hideIncompleteCostData))
        .append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
