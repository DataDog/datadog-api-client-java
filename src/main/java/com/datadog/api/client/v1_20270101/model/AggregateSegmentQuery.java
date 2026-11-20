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
  AggregateSegmentQuery.JSON_PROPERTY_BASE_QUERY,
  AggregateSegmentQuery.JSON_PROPERTY_COMPUTE,
  AggregateSegmentQuery.JSON_PROPERTY_DATA_SOURCE,
  AggregateSegmentQuery.JSON_PROPERTY_GROUP_BY,
  AggregateSegmentQuery.JSON_PROPERTY_NAME,
  AggregateSegmentQuery.JSON_PROPERTY_SEGMENT_QUERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AggregateSegmentQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BASE_QUERY = "base_query";
  private CompositeEventsPlatformQuery baseQuery;

  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private List<CompositeCompute> compute = new ArrayList<>();

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private AggregateSegmentQueryDataSource dataSource;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<CompositeGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SEGMENT_QUERY = "segment_query";
  private AggregateSegmentQuerySegmentQuery segmentQuery;

  public AggregateSegmentQuery() {}

  @JsonCreator
  public AggregateSegmentQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_BASE_QUERY)
          CompositeEventsPlatformQuery baseQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPUTE) List<CompositeCompute> compute,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          AggregateSegmentQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEGMENT_QUERY)
          AggregateSegmentQuerySegmentQuery segmentQuery) {
    this.baseQuery = baseQuery;
    this.unparsed |= baseQuery.unparsed;
    this.compute = compute;
    for (CompositeCompute item : compute) {
      this.unparsed |= item.unparsed;
    }
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.name = name;
    this.segmentQuery = segmentQuery;
    this.unparsed |= segmentQuery.unparsed;
  }

  public AggregateSegmentQuery baseQuery(CompositeEventsPlatformQuery baseQuery) {
    this.baseQuery = baseQuery;
    this.unparsed |= baseQuery.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return baseQuery
   */
  @JsonProperty(JSON_PROPERTY_BASE_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CompositeEventsPlatformQuery getBaseQuery() {
    return baseQuery;
  }

  public void setBaseQuery(CompositeEventsPlatformQuery baseQuery) {
    this.baseQuery = baseQuery;
    if (baseQuery != null) {
      this.unparsed |= baseQuery.unparsed;
    }
  }

  public AggregateSegmentQuery compute(List<CompositeCompute> compute) {
    this.compute = compute;
    for (CompositeCompute item : compute) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AggregateSegmentQuery addComputeItem(CompositeCompute computeItem) {
    this.compute.add(computeItem);
    this.unparsed |= computeItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return compute
   */
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<CompositeCompute> getCompute() {
    return compute;
  }

  public void setCompute(List<CompositeCompute> compute) {
    this.compute = compute;
    if (compute != null) {
      for (CompositeCompute item : compute) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AggregateSegmentQuery dataSource(AggregateSegmentQueryDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AggregateSegmentQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(AggregateSegmentQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public AggregateSegmentQuery groupBy(List<CompositeGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (CompositeGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public AggregateSegmentQuery addGroupByItem(CompositeGroupBy groupByItem) {
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
  public List<CompositeGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<CompositeGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (CompositeGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AggregateSegmentQuery name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AggregateSegmentQuery segmentQuery(AggregateSegmentQuerySegmentQuery segmentQuery) {
    this.segmentQuery = segmentQuery;
    this.unparsed |= segmentQuery.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return segmentQuery
   */
  @JsonProperty(JSON_PROPERTY_SEGMENT_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AggregateSegmentQuerySegmentQuery getSegmentQuery() {
    return segmentQuery;
  }

  public void setSegmentQuery(AggregateSegmentQuerySegmentQuery segmentQuery) {
    this.segmentQuery = segmentQuery;
    if (segmentQuery != null) {
      this.unparsed |= segmentQuery.unparsed;
    }
  }

  /** Return true if this AggregateSegmentQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregateSegmentQuery aggregateSegmentQuery = (AggregateSegmentQuery) o;
    return Objects.equals(this.baseQuery, aggregateSegmentQuery.baseQuery)
        && Objects.equals(this.compute, aggregateSegmentQuery.compute)
        && Objects.equals(this.dataSource, aggregateSegmentQuery.dataSource)
        && Objects.equals(this.groupBy, aggregateSegmentQuery.groupBy)
        && Objects.equals(this.name, aggregateSegmentQuery.name)
        && Objects.equals(this.segmentQuery, aggregateSegmentQuery.segmentQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseQuery, compute, dataSource, groupBy, name, segmentQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregateSegmentQuery {\n");
    sb.append("    baseQuery: ").append(toIndentedString(baseQuery)).append("\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    segmentQuery: ").append(toIndentedString(segmentQuery)).append("\n");
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
