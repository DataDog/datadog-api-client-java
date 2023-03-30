/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The object describing the Datadog span-based metric to create. */
@JsonPropertyOrder({
  SpansMetricCreateAttributes.JSON_PROPERTY_COMPUTE,
  SpansMetricCreateAttributes.JSON_PROPERTY_FILTER,
  SpansMetricCreateAttributes.JSON_PROPERTY_GROUP_BY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SpansMetricCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private SpansMetricCompute compute;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private SpansMetricFilter filter;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<SpansMetricGroupBy> groupBy = null;

  public SpansMetricCreateAttributes() {}

  @JsonCreator
  public SpansMetricCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPUTE) SpansMetricCompute compute) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
  }

  public SpansMetricCreateAttributes compute(SpansMetricCompute compute) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    return this;
  }

  /**
   * The compute rule to compute the span-based metric.
   *
   * @return compute
   */
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SpansMetricCompute getCompute() {
    return compute;
  }

  public void setCompute(SpansMetricCompute compute) {
    this.compute = compute;
  }

  public SpansMetricCreateAttributes filter(SpansMetricFilter filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * The span-based metric filter. Spans matching this filter will be aggregated in this metric.
   *
   * @return filter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SpansMetricFilter getFilter() {
    return filter;
  }

  public void setFilter(SpansMetricFilter filter) {
    this.filter = filter;
  }

  public SpansMetricCreateAttributes groupBy(List<SpansMetricGroupBy> groupBy) {
    this.groupBy = groupBy;
    for (SpansMetricGroupBy item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SpansMetricCreateAttributes addGroupByItem(SpansMetricGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * The rules for the group by.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SpansMetricGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<SpansMetricGroupBy> groupBy) {
    this.groupBy = groupBy;
  }

  /** Return true if this SpansMetricCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpansMetricCreateAttributes spansMetricCreateAttributes = (SpansMetricCreateAttributes) o;
    return Objects.equals(this.compute, spansMetricCreateAttributes.compute)
        && Objects.equals(this.filter, spansMetricCreateAttributes.filter)
        && Objects.equals(this.groupBy, spansMetricCreateAttributes.groupBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compute, filter, groupBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpansMetricCreateAttributes {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
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
