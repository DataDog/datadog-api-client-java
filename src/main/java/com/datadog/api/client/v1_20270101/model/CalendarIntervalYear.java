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
  CalendarIntervalYear.JSON_PROPERTY_ALIGNMENT,
  CalendarIntervalYear.JSON_PROPERTY_QUANTITY,
  CalendarIntervalYear.JSON_PROPERTY_TIMEZONE,
  CalendarIntervalYear.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CalendarIntervalYear {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIGNMENT = "alignment";
  private Month alignment;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private Double quantity;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CalendarIntervalYearType type;

  public CalendarIntervalYear() {}

  @JsonCreator
  public CalendarIntervalYear(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) CalendarIntervalYearType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public CalendarIntervalYear alignment(Month alignment) {
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
  public Month getAlignment() {
    return alignment;
  }

  public void setAlignment(Month alignment) {
    if (!alignment.isValid()) {
      this.unparsed = true;
    }
    this.alignment = alignment;
  }

  public CalendarIntervalYear quantity(Double quantity) {
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

  public CalendarIntervalYear timezone(String timezone) {
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

  public CalendarIntervalYear type(CalendarIntervalYearType type) {
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
  public CalendarIntervalYearType getType() {
    return type;
  }

  public void setType(CalendarIntervalYearType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this CalendarIntervalYear object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarIntervalYear calendarIntervalYear = (CalendarIntervalYear) o;
    return Objects.equals(this.alignment, calendarIntervalYear.alignment)
        && Objects.equals(this.quantity, calendarIntervalYear.quantity)
        && Objects.equals(this.timezone, calendarIntervalYear.timezone)
        && Objects.equals(this.type, calendarIntervalYear.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alignment, quantity, timezone, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarIntervalYear {\n");
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
