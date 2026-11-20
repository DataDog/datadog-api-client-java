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
  WidgetTime20270101OneOf4464104512.JSON_PROPERTY_HIDE_INCOMPLETE_COST_DATA,
  WidgetTime20270101OneOf4464104512.JSON_PROPERTY_OFFSET,
  WidgetTime20270101OneOf4464104512.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetTime20270101OneOf4464104512 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HIDE_INCOMPLETE_COST_DATA = "hide_incomplete_cost_data";
  private Boolean hideIncompleteCostData;

  public static final String JSON_PROPERTY_OFFSET = "offset";
  private Double offset;

  public static final String JSON_PROPERTY_TYPE = "type";
  private WidgetCalendarAlignedSpanType type;

  public WidgetTime20270101OneOf4464104512() {}

  @JsonCreator
  public WidgetTime20270101OneOf4464104512(
      @JsonProperty(required = true, value = JSON_PROPERTY_OFFSET) Double offset,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          WidgetCalendarAlignedSpanType type) {
    this.offset = offset;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public WidgetTime20270101OneOf4464104512 hideIncompleteCostData(Boolean hideIncompleteCostData) {
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

  public WidgetTime20270101OneOf4464104512 offset(Double offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return offset
   */
  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getOffset() {
    return offset;
  }

  public void setOffset(Double offset) {
    this.offset = offset;
  }

  public WidgetTime20270101OneOf4464104512 type(WidgetCalendarAlignedSpanType type) {
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
  public WidgetCalendarAlignedSpanType getType() {
    return type;
  }

  public void setType(WidgetCalendarAlignedSpanType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this WidgetTime20270101OneOf4464104512 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetTime20270101OneOf4464104512 widgetTime20270101OneOf4464104512 =
        (WidgetTime20270101OneOf4464104512) o;
    return Objects.equals(
            this.hideIncompleteCostData, widgetTime20270101OneOf4464104512.hideIncompleteCostData)
        && Objects.equals(this.offset, widgetTime20270101OneOf4464104512.offset)
        && Objects.equals(this.type, widgetTime20270101OneOf4464104512.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hideIncompleteCostData, offset, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetTime20270101OneOf4464104512 {\n");
    sb.append("    hideIncompleteCostData: ")
        .append(toIndentedString(hideIncompleteCostData))
        .append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
