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
  HeatgridSortAndOrderBy.JSON_PROPERTY_NESTING_DISPLAY,
  HeatgridSortAndOrderBy.JSON_PROPERTY_SORT_BY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatgridSortAndOrderBy {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NESTING_DISPLAY = "nesting_display";
  private HeatgridSortAndOrderByNestingDisplay nestingDisplay;

  public static final String JSON_PROPERTY_SORT_BY = "sort_by";
  private FlatSortBy sortBy;

  public HeatgridSortAndOrderBy() {}

  @JsonCreator
  public HeatgridSortAndOrderBy(
      @JsonProperty(required = true, value = JSON_PROPERTY_NESTING_DISPLAY)
          HeatgridSortAndOrderByNestingDisplay nestingDisplay,
      @JsonProperty(required = true, value = JSON_PROPERTY_SORT_BY) FlatSortBy sortBy) {
    this.nestingDisplay = nestingDisplay;
    this.unparsed |= !nestingDisplay.isValid();
    this.sortBy = sortBy;
    this.unparsed |= sortBy.unparsed;
  }

  public HeatgridSortAndOrderBy nestingDisplay(
      HeatgridSortAndOrderByNestingDisplay nestingDisplay) {
    this.nestingDisplay = nestingDisplay;
    this.unparsed |= !nestingDisplay.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return nestingDisplay
   */
  @JsonProperty(JSON_PROPERTY_NESTING_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HeatgridSortAndOrderByNestingDisplay getNestingDisplay() {
    return nestingDisplay;
  }

  public void setNestingDisplay(HeatgridSortAndOrderByNestingDisplay nestingDisplay) {
    if (!nestingDisplay.isValid()) {
      this.unparsed = true;
    }
    this.nestingDisplay = nestingDisplay;
  }

  public HeatgridSortAndOrderBy sortBy(FlatSortBy sortBy) {
    this.sortBy = sortBy;
    this.unparsed |= sortBy.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return sortBy
   */
  @JsonProperty(JSON_PROPERTY_SORT_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FlatSortBy getSortBy() {
    return sortBy;
  }

  public void setSortBy(FlatSortBy sortBy) {
    this.sortBy = sortBy;
    if (sortBy != null) {
      this.unparsed |= sortBy.unparsed;
    }
  }

  /** Return true if this HeatgridSortAndOrderBy object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatgridSortAndOrderBy heatgridSortAndOrderBy = (HeatgridSortAndOrderBy) o;
    return Objects.equals(this.nestingDisplay, heatgridSortAndOrderBy.nestingDisplay)
        && Objects.equals(this.sortBy, heatgridSortAndOrderBy.sortBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nestingDisplay, sortBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatgridSortAndOrderBy {\n");
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
