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
  WidgetTime20270101OneOf.JSON_PROPERTY_FROM,
  WidgetTime20270101OneOf.JSON_PROPERTY_HIDE_INCOMPLETE_COST_DATA,
  WidgetTime20270101OneOf.JSON_PROPERTY_TO,
  WidgetTime20270101OneOf.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetTime20270101OneOf {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FROM = "from";
  private Double from;

  public static final String JSON_PROPERTY_HIDE_INCOMPLETE_COST_DATA = "hide_incomplete_cost_data";
  private Boolean hideIncompleteCostData;

  public static final String JSON_PROPERTY_TO = "to";
  private Double to;

  public static final String JSON_PROPERTY_TYPE = "type";
  private WidgetNewFixedSpanType type;

  public WidgetTime20270101OneOf() {}

  @JsonCreator
  public WidgetTime20270101OneOf(
      @JsonProperty(required = true, value = JSON_PROPERTY_FROM) Double from,
      @JsonProperty(required = true, value = JSON_PROPERTY_TO) Double to,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) WidgetNewFixedSpanType type) {
    this.from = from;
    this.to = to;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public WidgetTime20270101OneOf from(Double from) {
    this.from = from;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return from
   */
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getFrom() {
    return from;
  }

  public void setFrom(Double from) {
    this.from = from;
  }

  public WidgetTime20270101OneOf hideIncompleteCostData(Boolean hideIncompleteCostData) {
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

  public WidgetTime20270101OneOf to(Double to) {
    this.to = to;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return to
   */
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getTo() {
    return to;
  }

  public void setTo(Double to) {
    this.to = to;
  }

  public WidgetTime20270101OneOf type(WidgetNewFixedSpanType type) {
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
  public WidgetNewFixedSpanType getType() {
    return type;
  }

  public void setType(WidgetNewFixedSpanType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this WidgetTime20270101OneOf object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetTime20270101OneOf widgetTime20270101OneOf = (WidgetTime20270101OneOf) o;
    return Objects.equals(this.from, widgetTime20270101OneOf.from)
        && Objects.equals(
            this.hideIncompleteCostData, widgetTime20270101OneOf.hideIncompleteCostData)
        && Objects.equals(this.to, widgetTime20270101OneOf.to)
        && Objects.equals(this.type, widgetTime20270101OneOf.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, hideIncompleteCostData, to, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetTime20270101OneOf {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    hideIncompleteCostData: ")
        .append(toIndentedString(hideIncompleteCostData))
        .append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
