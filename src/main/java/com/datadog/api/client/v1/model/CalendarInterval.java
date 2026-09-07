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

/** Calendar interval definition. */
@JsonPropertyOrder({
  CalendarInterval.JSON_PROPERTY_ALIGNMENT,
  CalendarInterval.JSON_PROPERTY_QUANTITY,
  CalendarInterval.JSON_PROPERTY_TIMEZONE,
  CalendarInterval.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CalendarInterval {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIGNMENT = "alignment";
  private String alignment;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private Long quantity;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CalendarIntervalType type;

  public CalendarInterval() {}

  @JsonCreator
  public CalendarInterval(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) CalendarIntervalType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public CalendarInterval alignment(String alignment) {
    this.alignment = alignment;
    return this;
  }

  /**
   * Alignment of the interval. Valid values depend on the interval type. For <code>day</code>, use
   * hours (for example, <code>1am</code>, <code>2pm</code>, or <code>14</code>). For <code>week
   * </code>, use day names (for example, <code>monday</code>). For <code>month</code>, use
   * day-of-month ordinals (for example, <code>1st</code>, <code>15th</code>). For <code>year</code>
   * or <code>quarter</code>, use month names (for example, <code>january</code>).
   *
   * @return alignment
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALIGNMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAlignment() {
    return alignment;
  }

  public void setAlignment(String alignment) {
    this.alignment = alignment;
  }

  public CalendarInterval quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity of the interval.
   *
   * @return quantity
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public CalendarInterval timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Timezone for the interval.
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

  public CalendarInterval type(CalendarIntervalType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of calendar interval.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CalendarIntervalType getType() {
    return type;
  }

  public void setType(CalendarIntervalType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this CalendarInterval object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarInterval calendarInterval = (CalendarInterval) o;
    return Objects.equals(this.alignment, calendarInterval.alignment)
        && Objects.equals(this.quantity, calendarInterval.quantity)
        && Objects.equals(this.timezone, calendarInterval.timezone)
        && Objects.equals(this.type, calendarInterval.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alignment, quantity, timezone, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarInterval {\n");
    sb.append("    alignment: ").append(toIndentedString(alignment)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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
