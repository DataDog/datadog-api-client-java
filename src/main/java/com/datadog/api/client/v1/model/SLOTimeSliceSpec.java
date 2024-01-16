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

/** A time-slice SLI specification. */
@JsonPropertyOrder({SLOTimeSliceSpec.JSON_PROPERTY_TIME_SLICE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOTimeSliceSpec {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TIME_SLICE = "time_slice";
  private SLOTimeSliceCondition timeSlice;

  public SLOTimeSliceSpec() {}

  @JsonCreator
  public SLOTimeSliceSpec(
      @JsonProperty(required = true, value = JSON_PROPERTY_TIME_SLICE)
          SLOTimeSliceCondition timeSlice) {
    this.timeSlice = timeSlice;
    this.unparsed |= timeSlice.unparsed;
  }

  public SLOTimeSliceSpec timeSlice(SLOTimeSliceCondition timeSlice) {
    this.timeSlice = timeSlice;
    this.unparsed |= timeSlice.unparsed;
    return this;
  }

  /**
   * The time-slice condition, composed of 3 parts: 1. the metric timeseries query, 2. the
   * comparator, and 3. the threshold.
   *
   * @return timeSlice
   */
  @JsonProperty(JSON_PROPERTY_TIME_SLICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SLOTimeSliceCondition getTimeSlice() {
    return timeSlice;
  }

  public void setTimeSlice(SLOTimeSliceCondition timeSlice) {
    this.timeSlice = timeSlice;
  }

  /** Return true if this SLOTimeSliceSpec object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOTimeSliceSpec sloTimeSliceSpec = (SLOTimeSliceSpec) o;
    return Objects.equals(this.timeSlice, sloTimeSliceSpec.timeSlice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeSlice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOTimeSliceSpec {\n");
    sb.append("    timeSlice: ").append(toIndentedString(timeSlice)).append("\n");
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
