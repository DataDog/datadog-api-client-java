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

/** The object describing a Datadog span-based metric. */
@JsonPropertyOrder({
  SpansMetricResponseAttributes.JSON_PROPERTY_COMPUTE,
  SpansMetricResponseAttributes.JSON_PROPERTY_FILTER,
  SpansMetricResponseAttributes.JSON_PROPERTY_GROUP_BY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SpansMetricResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private SpansMetricResponseCompute compute;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private SpansMetricResponseFilter filter;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<SpansMetricResponseGroupBy> groupBy = null;

  public SpansMetricResponseAttributes compute(SpansMetricResponseCompute compute) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    return this;
  }

  /**
   * The compute rule to compute the span-based metric.
   *
   * @return compute
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SpansMetricResponseCompute getCompute() {
    return compute;
  }

  public void setCompute(SpansMetricResponseCompute compute) {
    this.compute = compute;
  }

  public SpansMetricResponseAttributes filter(SpansMetricResponseFilter filter) {
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
  public SpansMetricResponseFilter getFilter() {
    return filter;
  }

  public void setFilter(SpansMetricResponseFilter filter) {
    this.filter = filter;
  }

  public SpansMetricResponseAttributes groupBy(List<SpansMetricResponseGroupBy> groupBy) {
    this.groupBy = groupBy;
    for (SpansMetricResponseGroupBy item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SpansMetricResponseAttributes addGroupByItem(SpansMetricResponseGroupBy groupByItem) {
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
  public List<SpansMetricResponseGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<SpansMetricResponseGroupBy> groupBy) {
    this.groupBy = groupBy;
  }

  /** Return true if this SpansMetricResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpansMetricResponseAttributes spansMetricResponseAttributes = (SpansMetricResponseAttributes) o;
    return Objects.equals(this.compute, spansMetricResponseAttributes.compute)
        && Objects.equals(this.filter, spansMetricResponseAttributes.filter)
        && Objects.equals(this.groupBy, spansMetricResponseAttributes.groupBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compute, filter, groupBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpansMetricResponseAttributes {\n");
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
