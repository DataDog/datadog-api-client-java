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
@JsonPropertyOrder({
  SplitConfig.JSON_PROPERTY_CALENDAR_SHIFT,
  SplitConfig.JSON_PROPERTY_LIMIT,
  SplitConfig.JSON_PROPERTY_SORT,
  SplitConfig.JSON_PROPERTY_SPLIT_DIMENSIONS,
  SplitConfig.JSON_PROPERTY_STATIC_SPLITS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SplitConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CALENDAR_SHIFT = "calendar_shift";
  private CalendarShiftSplitConfig calendarShift;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Double limit;

  public static final String JSON_PROPERTY_SORT = "sort";
  private SplitConfigSort sort;

  public static final String JSON_PROPERTY_SPLIT_DIMENSIONS = "split_dimensions";
  private List<SplitDimension> splitDimensions = new ArrayList<>();

  public static final String JSON_PROPERTY_STATIC_SPLITS = "static_splits";
  private List<List<SplitVectorTagFilter>> staticSplits = null;

  public SplitConfig() {}

  @JsonCreator
  public SplitConfig(
      @JsonProperty(required = true, value = JSON_PROPERTY_LIMIT) Double limit,
      @JsonProperty(required = true, value = JSON_PROPERTY_SORT) SplitConfigSort sort,
      @JsonProperty(required = true, value = JSON_PROPERTY_SPLIT_DIMENSIONS)
          List<SplitDimension> splitDimensions) {
    this.limit = limit;
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    this.splitDimensions = splitDimensions;
    for (SplitDimension item : splitDimensions) {
      this.unparsed |= item.unparsed;
    }
  }

  public SplitConfig calendarShift(CalendarShiftSplitConfig calendarShift) {
    this.calendarShift = calendarShift;
    this.unparsed |= calendarShift.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return calendarShift
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CALENDAR_SHIFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CalendarShiftSplitConfig getCalendarShift() {
    return calendarShift;
  }

  public void setCalendarShift(CalendarShiftSplitConfig calendarShift) {
    this.calendarShift = calendarShift;
    if (calendarShift != null) {
      this.unparsed |= calendarShift.unparsed;
    }
  }

  public SplitConfig limit(Double limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return limit
   */
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getLimit() {
    return limit;
  }

  public void setLimit(Double limit) {
    this.limit = limit;
  }

  public SplitConfig sort(SplitConfigSort sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return sort
   */
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SplitConfigSort getSort() {
    return sort;
  }

  public void setSort(SplitConfigSort sort) {
    this.sort = sort;
    if (sort != null) {
      this.unparsed |= sort.unparsed;
    }
  }

  public SplitConfig splitDimensions(List<SplitDimension> splitDimensions) {
    this.splitDimensions = splitDimensions;
    for (SplitDimension item : splitDimensions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SplitConfig addSplitDimensionsItem(SplitDimension splitDimensionsItem) {
    this.splitDimensions.add(splitDimensionsItem);
    this.unparsed |= splitDimensionsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return splitDimensions
   */
  @JsonProperty(JSON_PROPERTY_SPLIT_DIMENSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SplitDimension> getSplitDimensions() {
    return splitDimensions;
  }

  public void setSplitDimensions(List<SplitDimension> splitDimensions) {
    this.splitDimensions = splitDimensions;
    if (splitDimensions != null) {
      for (SplitDimension item : splitDimensions) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SplitConfig staticSplits(List<List<SplitVectorTagFilter>> staticSplits) {
    this.staticSplits = staticSplits;
    return this;
  }

  public SplitConfig addStaticSplitsItem(List<SplitVectorTagFilter> staticSplitsItem) {
    if (this.staticSplits == null) {
      this.staticSplits = new ArrayList<>();
    }
    this.staticSplits.add(staticSplitsItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return staticSplits
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATIC_SPLITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<List<SplitVectorTagFilter>> getStaticSplits() {
    return staticSplits;
  }

  public void setStaticSplits(List<List<SplitVectorTagFilter>> staticSplits) {
    this.staticSplits = staticSplits;
  }

  /** Return true if this SplitConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitConfig splitConfig = (SplitConfig) o;
    return Objects.equals(this.calendarShift, splitConfig.calendarShift)
        && Objects.equals(this.limit, splitConfig.limit)
        && Objects.equals(this.sort, splitConfig.sort)
        && Objects.equals(this.splitDimensions, splitConfig.splitDimensions)
        && Objects.equals(this.staticSplits, splitConfig.staticSplits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calendarShift, limit, sort, splitDimensions, staticSplits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitConfig {\n");
    sb.append("    calendarShift: ").append(toIndentedString(calendarShift)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    splitDimensions: ").append(toIndentedString(splitDimensions)).append("\n");
    sb.append("    staticSplits: ").append(toIndentedString(staticSplits)).append("\n");
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
