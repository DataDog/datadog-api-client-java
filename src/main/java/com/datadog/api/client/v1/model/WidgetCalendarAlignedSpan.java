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

/** Used for calendar-aligned time spans, such as the current month or previous year. */
@JsonPropertyOrder({
  WidgetCalendarAlignedSpan.JSON_PROPERTY_HIDE_INCOMPLETE_COST_DATA,
  WidgetCalendarAlignedSpan.JSON_PROPERTY_OFFSET,
  WidgetCalendarAlignedSpan.JSON_PROPERTY_TIMEZONE,
  WidgetCalendarAlignedSpan.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetCalendarAlignedSpan {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HIDE_INCOMPLETE_COST_DATA = "hide_incomplete_cost_data";
  private Boolean hideIncompleteCostData;

  public static final String JSON_PROPERTY_OFFSET = "offset";
  private Long offset;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_TYPE = "type";
  private WidgetCalendarAlignedSpanType type;

  public WidgetCalendarAlignedSpan() {}

  @JsonCreator
  public WidgetCalendarAlignedSpan(
      @JsonProperty(required = true, value = JSON_PROPERTY_OFFSET) Long offset,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          WidgetCalendarAlignedSpanType type) {
    this.offset = offset;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public WidgetCalendarAlignedSpan hideIncompleteCostData(Boolean hideIncompleteCostData) {
    this.hideIncompleteCostData = hideIncompleteCostData;
    return this;
  }

  /**
   * Whether to hide incomplete cost data in the widget.
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

  public WidgetCalendarAlignedSpan offset(Long offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Number of completed periods before the current period. 0 represents the current period.
   * minimum: 0
   *
   * @return offset
   */
  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getOffset() {
    return offset;
  }

  public void setOffset(Long offset) {
    this.offset = offset;
  }

  public WidgetCalendarAlignedSpan timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Time zone used to align the calendar period.
   *
   * @return timezone
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public WidgetCalendarAlignedSpan type(WidgetCalendarAlignedSpanType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Calendar-aligned time span type.
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
   * @return WidgetCalendarAlignedSpan
   */
  @JsonAnySetter
  public WidgetCalendarAlignedSpan putAdditionalProperty(String key, Object value) {
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

  /** Return true if this WidgetCalendarAlignedSpan object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetCalendarAlignedSpan widgetCalendarAlignedSpan = (WidgetCalendarAlignedSpan) o;
    return Objects.equals(
            this.hideIncompleteCostData, widgetCalendarAlignedSpan.hideIncompleteCostData)
        && Objects.equals(this.offset, widgetCalendarAlignedSpan.offset)
        && Objects.equals(this.timezone, widgetCalendarAlignedSpan.timezone)
        && Objects.equals(this.type, widgetCalendarAlignedSpan.type)
        && Objects.equals(
            this.additionalProperties, widgetCalendarAlignedSpan.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hideIncompleteCostData, offset, timezone, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetCalendarAlignedSpan {\n");
    sb.append("    hideIncompleteCostData: ")
        .append(toIndentedString(hideIncompleteCostData))
        .append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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
