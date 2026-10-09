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

/** Ordering of the heatgrid rows. */
@JsonPropertyOrder({HeatgridSort.JSON_PROPERTY_NESTING_DISPLAY, HeatgridSort.JSON_PROPERTY_SORT_BY})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatgridSort {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NESTING_DISPLAY = "nesting_display";
  private HeatgridNestingDisplay nestingDisplay;

  public static final String JSON_PROPERTY_SORT_BY = "sort_by";
  private HeatgridSortBy sortBy;

  public HeatgridSort() {}

  @JsonCreator
  public HeatgridSort(
      @JsonProperty(required = true, value = JSON_PROPERTY_NESTING_DISPLAY)
          HeatgridNestingDisplay nestingDisplay,
      @JsonProperty(required = true, value = JSON_PROPERTY_SORT_BY) HeatgridSortBy sortBy) {
    this.nestingDisplay = nestingDisplay;
    this.unparsed |= !nestingDisplay.isValid();
    this.sortBy = sortBy;
    this.unparsed |= sortBy.unparsed;
  }

  public HeatgridSort nestingDisplay(HeatgridNestingDisplay nestingDisplay) {
    this.nestingDisplay = nestingDisplay;
    this.unparsed |= !nestingDisplay.isValid();
    return this;
  }

  /**
   * Display groups as flat rows.
   *
   * @return nestingDisplay
   */
  @JsonProperty(JSON_PROPERTY_NESTING_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HeatgridNestingDisplay getNestingDisplay() {
    return nestingDisplay;
  }

  public void setNestingDisplay(HeatgridNestingDisplay nestingDisplay) {
    if (!nestingDisplay.isValid()) {
      this.unparsed = true;
    }
    this.nestingDisplay = nestingDisplay;
  }

  public HeatgridSort sortBy(HeatgridSortBy sortBy) {
    this.sortBy = sortBy;
    this.unparsed |= sortBy.unparsed;
    return this;
  }

  /**
   * Sort rows by aggregated value or group label.
   *
   * @return sortBy
   */
  @JsonProperty(JSON_PROPERTY_SORT_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HeatgridSortBy getSortBy() {
    return sortBy;
  }

  public void setSortBy(HeatgridSortBy sortBy) {
    this.sortBy = sortBy;
    if (sortBy != null) {
      this.unparsed |= sortBy.unparsed;
    }
  }

  /** Return true if this HeatgridSort object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatgridSort heatgridSort = (HeatgridSort) o;
    return Objects.equals(this.nestingDisplay, heatgridSort.nestingDisplay)
        && Objects.equals(this.sortBy, heatgridSort.sortBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nestingDisplay, sortBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatgridSort {\n");
    sb.append("    nestingDisplay: ").append(toIndentedString(nestingDisplay)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
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
