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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({CalendarShiftSplitConfig.JSON_PROPERTY_SHIFTS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CalendarShiftSplitConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SHIFTS = "shifts";
  private List<CalendarShift> shifts = new ArrayList<>();

  public CalendarShiftSplitConfig() {}

  @JsonCreator
  public CalendarShiftSplitConfig(
      @JsonProperty(required = true, value = JSON_PROPERTY_SHIFTS) List<CalendarShift> shifts) {
    this.shifts = shifts;
    for (CalendarShift item : shifts) {
      this.unparsed |= item.unparsed;
    }
  }

  public CalendarShiftSplitConfig shifts(List<CalendarShift> shifts) {
    this.shifts = shifts;
    for (CalendarShift item : shifts) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CalendarShiftSplitConfig addShiftsItem(CalendarShift shiftsItem) {
    this.shifts.add(shiftsItem);
    this.unparsed |= shiftsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return shifts
   */
  @JsonProperty(JSON_PROPERTY_SHIFTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<CalendarShift> getShifts() {
    return shifts;
  }

  public void setShifts(List<CalendarShift> shifts) {
    this.shifts = shifts;
    if (shifts != null) {
      for (CalendarShift item : shifts) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  /** Return true if this CalendarShiftSplitConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarShiftSplitConfig calendarShiftSplitConfig = (CalendarShiftSplitConfig) o;
    return Objects.equals(this.shifts, calendarShiftSplitConfig.shifts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shifts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarShiftSplitConfig {\n");
    sb.append("    shifts: ").append(toIndentedString(shifts)).append("\n");
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
