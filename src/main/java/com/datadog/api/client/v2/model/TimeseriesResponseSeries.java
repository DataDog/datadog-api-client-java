/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** */
@JsonPropertyOrder({
  TimeseriesResponseSeries.JSON_PROPERTY_GROUP_TAGS,
  TimeseriesResponseSeries.JSON_PROPERTY_QUERY_INDEX,
  TimeseriesResponseSeries.JSON_PROPERTY_UNIT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesResponseSeries {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GROUP_TAGS = "group_tags";
  private List<String> groupTags = null;

  public static final String JSON_PROPERTY_QUERY_INDEX = "query_index";
  private Integer queryIndex;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private List<Unit> unit = null;

  public TimeseriesResponseSeries groupTags(List<String> groupTags) {
    this.groupTags = groupTags;
    return this;
  }

  public TimeseriesResponseSeries addGroupTagsItem(String groupTagsItem) {
    if (this.groupTags == null) {
      this.groupTags = new ArrayList<>();
    }
    this.groupTags.add(groupTagsItem);
    return this;
  }

  /**
   * List of tags that apply to a single response value.
   *
   * @return groupTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getGroupTags() {
    return groupTags;
  }

  public void setGroupTags(List<String> groupTags) {
    this.groupTags = groupTags;
  }

  public TimeseriesResponseSeries queryIndex(Integer queryIndex) {
    this.queryIndex = queryIndex;
    return this;
  }

  /**
   * The index of the query in the "formulas" array (or "queries" array if no "formulas" was
   * specified). maximum: 2147483647
   *
   * @return queryIndex
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getQueryIndex() {
    return queryIndex;
  }

  public void setQueryIndex(Integer queryIndex) {
    this.queryIndex = queryIndex;
  }

  public TimeseriesResponseSeries unit(List<Unit> unit) {
    this.unit = unit;
    for (Unit item : unit) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TimeseriesResponseSeries addUnitItem(Unit unitItem) {
    if (this.unit == null) {
      this.unit = new ArrayList<>();
    }
    this.unit.add(unitItem);
    this.unparsed |= unitItem.unparsed;
    return this;
  }

  /**
   * Detailed information about the unit. The first element describes the "primary unit" (for
   * example, <code>bytes</code> in <code>bytes per second</code>). The second element describes the
   * "per unit" (for example, <code>second</code> in <code>bytes per second</code>). If the second
   * element is not present, the API returns null.
   *
   * @return unit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Unit> getUnit() {
    return unit;
  }

  public void setUnit(List<Unit> unit) {
    this.unit = unit;
  }

  /** Return true if this TimeseriesResponseSeries object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesResponseSeries timeseriesResponseSeries = (TimeseriesResponseSeries) o;
    return Objects.equals(this.groupTags, timeseriesResponseSeries.groupTags)
        && Objects.equals(this.queryIndex, timeseriesResponseSeries.queryIndex)
        && Objects.equals(this.unit, timeseriesResponseSeries.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupTags, queryIndex, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesResponseSeries {\n");
    sb.append("    groupTags: ").append(toIndentedString(groupTags)).append("\n");
    sb.append("    queryIndex: ").append(toIndentedString(queryIndex)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("}");
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
