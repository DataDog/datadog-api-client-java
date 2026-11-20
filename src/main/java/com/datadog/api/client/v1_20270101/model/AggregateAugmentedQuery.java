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
  AggregateAugmentedQuery.JSON_PROPERTY_AUGMENT_QUERY,
  AggregateAugmentedQuery.JSON_PROPERTY_BASE_QUERY,
  AggregateAugmentedQuery.JSON_PROPERTY_COMPUTE,
  AggregateAugmentedQuery.JSON_PROPERTY_DATA_SOURCE,
  AggregateAugmentedQuery.JSON_PROPERTY_GROUP_BY,
  AggregateAugmentedQuery.JSON_PROPERTY_JOIN_CONDITION,
  AggregateAugmentedQuery.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AggregateAugmentedQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUGMENT_QUERY = "augment_query";
  private CompositeSourceSubQuery augmentQuery;

  public static final String JSON_PROPERTY_BASE_QUERY = "base_query";
  private CompositeSourceBaseQuery baseQuery;

  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private List<CompositeCompute> compute = new ArrayList<>();

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private AggregateAugmentedQueryDataSource dataSource;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<CompositeGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_JOIN_CONDITION = "join_condition";
  private AggregateAugmentedQueryJoinCondition joinCondition;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public AggregateAugmentedQuery() {}

  @JsonCreator
  public AggregateAugmentedQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUGMENT_QUERY)
          CompositeSourceSubQuery augmentQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_BASE_QUERY)
          CompositeSourceBaseQuery baseQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPUTE) List<CompositeCompute> compute,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          AggregateAugmentedQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_JOIN_CONDITION)
          AggregateAugmentedQueryJoinCondition joinCondition,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.augmentQuery = augmentQuery;
    this.unparsed |= augmentQuery.unparsed;
    this.baseQuery = baseQuery;
    this.unparsed |= baseQuery.unparsed;
    this.compute = compute;
    for (CompositeCompute item : compute) {
      this.unparsed |= item.unparsed;
    }
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.joinCondition = joinCondition;
    this.unparsed |= joinCondition.unparsed;
    this.name = name;
  }

  public AggregateAugmentedQuery augmentQuery(CompositeSourceSubQuery augmentQuery) {
    this.augmentQuery = augmentQuery;
    this.unparsed |= augmentQuery.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return augmentQuery
   */
  @JsonProperty(JSON_PROPERTY_AUGMENT_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CompositeSourceSubQuery getAugmentQuery() {
    return augmentQuery;
  }

  public void setAugmentQuery(CompositeSourceSubQuery augmentQuery) {
    this.augmentQuery = augmentQuery;
    if (augmentQuery != null) {
      this.unparsed |= augmentQuery.unparsed;
    }
  }

  public AggregateAugmentedQuery baseQuery(CompositeSourceBaseQuery baseQuery) {
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
  public CompositeSourceBaseQuery getBaseQuery() {
    return baseQuery;
  }

  public void setBaseQuery(CompositeSourceBaseQuery baseQuery) {
    this.baseQuery = baseQuery;
    if (baseQuery != null) {
      this.unparsed |= baseQuery.unparsed;
    }
  }

  public AggregateAugmentedQuery compute(List<CompositeCompute> compute) {
    this.compute = compute;
    for (CompositeCompute item : compute) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AggregateAugmentedQuery addComputeItem(CompositeCompute computeItem) {
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

  public AggregateAugmentedQuery dataSource(AggregateAugmentedQueryDataSource dataSource) {
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
  public AggregateAugmentedQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(AggregateAugmentedQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public AggregateAugmentedQuery groupBy(List<CompositeGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (CompositeGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public AggregateAugmentedQuery addGroupByItem(CompositeGroupBy groupByItem) {
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

  public AggregateAugmentedQuery joinCondition(AggregateAugmentedQueryJoinCondition joinCondition) {
    this.joinCondition = joinCondition;
    this.unparsed |= joinCondition.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return joinCondition
   */
  @JsonProperty(JSON_PROPERTY_JOIN_CONDITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AggregateAugmentedQueryJoinCondition getJoinCondition() {
    return joinCondition;
  }

  public void setJoinCondition(AggregateAugmentedQueryJoinCondition joinCondition) {
    this.joinCondition = joinCondition;
    if (joinCondition != null) {
      this.unparsed |= joinCondition.unparsed;
    }
  }

  public AggregateAugmentedQuery name(String name) {
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

  /** Return true if this AggregateAugmentedQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregateAugmentedQuery aggregateAugmentedQuery = (AggregateAugmentedQuery) o;
    return Objects.equals(this.augmentQuery, aggregateAugmentedQuery.augmentQuery)
        && Objects.equals(this.baseQuery, aggregateAugmentedQuery.baseQuery)
        && Objects.equals(this.compute, aggregateAugmentedQuery.compute)
        && Objects.equals(this.dataSource, aggregateAugmentedQuery.dataSource)
        && Objects.equals(this.groupBy, aggregateAugmentedQuery.groupBy)
        && Objects.equals(this.joinCondition, aggregateAugmentedQuery.joinCondition)
        && Objects.equals(this.name, aggregateAugmentedQuery.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(augmentQuery, baseQuery, compute, dataSource, groupBy, joinCondition, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregateAugmentedQuery {\n");
    sb.append("    augmentQuery: ").append(toIndentedString(augmentQuery)).append("\n");
    sb.append("    baseQuery: ").append(toIndentedString(baseQuery)).append("\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    joinCondition: ").append(toIndentedString(joinCondition)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
