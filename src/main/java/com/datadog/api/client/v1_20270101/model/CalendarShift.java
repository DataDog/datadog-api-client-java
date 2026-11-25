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
@JsonPropertyOrder({CalendarShift.JSON_PROPERTY_AMOUNT, CalendarShift.JSON_PROPERTY_UNIT})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CalendarShift {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Double amount;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private CalendarShiftUnit unit;

  public CalendarShift() {}

  @JsonCreator
  public CalendarShift(
      @JsonProperty(required = true, value = JSON_PROPERTY_AMOUNT) Double amount,
      @JsonProperty(required = true, value = JSON_PROPERTY_UNIT) CalendarShiftUnit unit) {
    this.amount = amount;
    this.unit = unit;
    this.unparsed |= !unit.isValid();
  }

  public CalendarShift amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return amount
   */
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public CalendarShift unit(CalendarShiftUnit unit) {
    this.unit = unit;
    this.unparsed |= !unit.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return unit
   */
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CalendarShiftUnit getUnit() {
    return unit;
  }

  public void setUnit(CalendarShiftUnit unit) {
    if (!unit.isValid()) {
      this.unparsed = true;
    }
    this.unit = unit;
  }

  /** Return true if this CalendarShift object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarShift calendarShift = (CalendarShift) o;
    return Objects.equals(this.amount, calendarShift.amount)
        && Objects.equals(this.unit, calendarShift.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarShift {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
