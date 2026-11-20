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
  StructuredAnalysisAggregation.JSON_PROPERTY_COMPUTE,
  StructuredAnalysisAggregation.JSON_PROPERTY_GROUP_BY,
  StructuredAnalysisAggregation.JSON_PROPERTY_LIMIT,
  StructuredAnalysisAggregation.JSON_PROPERTY_SORT,
  StructuredAnalysisAggregation.JSON_PROPERTY_TIME_AGGREGATION,
  StructuredAnalysisAggregation.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StructuredAnalysisAggregation {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private List<StructuredAnalysisCompute> compute = null;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<StructuredAnalysisGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Double limit;

  public static final String JSON_PROPERTY_SORT = "sort";
  private AnalysisAggregationSort sort;

  public static final String JSON_PROPERTY_TIME_AGGREGATION = "time_aggregation";
  private StructuredAnalysisTimeAggregation timeAggregation;

  public static final String JSON_PROPERTY_TYPE = "type";
  private StructuredAnalysisAggregationType type;

  public StructuredAnalysisAggregation() {}

  @JsonCreator
  public StructuredAnalysisAggregation(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          StructuredAnalysisAggregationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public StructuredAnalysisAggregation compute(List<StructuredAnalysisCompute> compute) {
    this.compute = compute;
    if (compute != null) {
      for (StructuredAnalysisCompute item : compute) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public StructuredAnalysisAggregation addComputeItem(StructuredAnalysisCompute computeItem) {
    if (this.compute == null) {
      this.compute = new ArrayList<>();
    }
    this.compute.add(computeItem);
    this.unparsed |= computeItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return compute
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<StructuredAnalysisCompute> getCompute() {
    return compute;
  }

  public void setCompute(List<StructuredAnalysisCompute> compute) {
    this.compute = compute;
    if (compute != null) {
      for (StructuredAnalysisCompute item : compute) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public StructuredAnalysisAggregation groupBy(List<StructuredAnalysisGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (StructuredAnalysisGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public StructuredAnalysisAggregation addGroupByItem(StructuredAnalysisGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<StructuredAnalysisGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<StructuredAnalysisGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (StructuredAnalysisGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public StructuredAnalysisAggregation limit(Double limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return limit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLimit() {
    return limit;
  }

  public void setLimit(Double limit) {
    this.limit = limit;
  }

  public StructuredAnalysisAggregation sort(AnalysisAggregationSort sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return sort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AnalysisAggregationSort getSort() {
    return sort;
  }

  public void setSort(AnalysisAggregationSort sort) {
    this.sort = sort;
    if (sort != null) {
      this.unparsed |= sort.unparsed;
    }
  }

  public StructuredAnalysisAggregation timeAggregation(
      StructuredAnalysisTimeAggregation timeAggregation) {
    this.timeAggregation = timeAggregation;
    this.unparsed |= timeAggregation.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return timeAggregation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public StructuredAnalysisTimeAggregation getTimeAggregation() {
    return timeAggregation;
  }

  public void setTimeAggregation(StructuredAnalysisTimeAggregation timeAggregation) {
    this.timeAggregation = timeAggregation;
    if (timeAggregation != null) {
      this.unparsed |= timeAggregation.unparsed;
    }
  }

  public StructuredAnalysisAggregation type(StructuredAnalysisAggregationType type) {
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
  public StructuredAnalysisAggregationType getType() {
    return type;
  }

  public void setType(StructuredAnalysisAggregationType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this StructuredAnalysisAggregation object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredAnalysisAggregation structuredAnalysisAggregation = (StructuredAnalysisAggregation) o;
    return Objects.equals(this.compute, structuredAnalysisAggregation.compute)
        && Objects.equals(this.groupBy, structuredAnalysisAggregation.groupBy)
        && Objects.equals(this.limit, structuredAnalysisAggregation.limit)
        && Objects.equals(this.sort, structuredAnalysisAggregation.sort)
        && Objects.equals(this.timeAggregation, structuredAnalysisAggregation.timeAggregation)
        && Objects.equals(this.type, structuredAnalysisAggregation.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compute, groupBy, limit, sort, timeAggregation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredAnalysisAggregation {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    timeAggregation: ").append(toIndentedString(timeAggregation)).append("\n");
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
