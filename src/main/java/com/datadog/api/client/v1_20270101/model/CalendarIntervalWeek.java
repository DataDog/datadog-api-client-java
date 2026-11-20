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
  CalendarIntervalWeek.JSON_PROPERTY_ALIGNMENT,
  CalendarIntervalWeek.JSON_PROPERTY_QUANTITY,
  CalendarIntervalWeek.JSON_PROPERTY_TIMEZONE,
  CalendarIntervalWeek.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CalendarIntervalWeek {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIGNMENT = "alignment";
  private Day alignment;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private Double quantity;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CalendarIntervalWeekType type;

  public CalendarIntervalWeek() {}

  @JsonCreator
  public CalendarIntervalWeek(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) CalendarIntervalWeekType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public CalendarIntervalWeek alignment(Day alignment) {
    this.alignment = alignment;
    this.unparsed |= !alignment.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return alignment
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALIGNMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Day getAlignment() {
    return alignment;
  }

  public void setAlignment(Day alignment) {
    if (!alignment.isValid()) {
      this.unparsed = true;
    }
    this.alignment = alignment;
  }

  public CalendarIntervalWeek quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return quantity
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public CalendarIntervalWeek timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * IANA time zone identifier, for example America/New_York.
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

  public CalendarIntervalWeek type(CalendarIntervalWeekType type) {
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
  public CalendarIntervalWeekType getType() {
    return type;
  }

  public void setType(CalendarIntervalWeekType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this CalendarIntervalWeek object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarIntervalWeek calendarIntervalWeek = (CalendarIntervalWeek) o;
    return Objects.equals(this.alignment, calendarIntervalWeek.alignment)
        && Objects.equals(this.quantity, calendarIntervalWeek.quantity)
        && Objects.equals(this.timezone, calendarIntervalWeek.timezone)
        && Objects.equals(this.type, calendarIntervalWeek.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alignment, quantity, timezone, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarIntervalWeek {\n");
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
