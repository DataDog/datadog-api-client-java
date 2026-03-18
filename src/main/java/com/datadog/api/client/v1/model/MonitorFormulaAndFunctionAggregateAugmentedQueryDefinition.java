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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A formula and functions aggregate augmented query. Used to enrich base query results with data
 * from a reference table.
 */
@JsonPropertyOrder({
  MonitorFormulaAndFunctionAggregateAugmentedQueryDefinition.JSON_PROPERTY_AUGMENT_QUERY,
  MonitorFormulaAndFunctionAggregateAugmentedQueryDefinition.JSON_PROPERTY_BASE_QUERY,
  MonitorFormulaAndFunctionAggregateAugmentedQueryDefinition.JSON_PROPERTY_COMPUTE,
  MonitorFormulaAndFunctionAggregateAugmentedQueryDefinition.JSON_PROPERTY_DATA_SOURCE,
  MonitorFormulaAndFunctionAggregateAugmentedQueryDefinition.JSON_PROPERTY_GROUP_BY,
  MonitorFormulaAndFunctionAggregateAugmentedQueryDefinition.JSON_PROPERTY_JOIN_CONDITION,
  MonitorFormulaAndFunctionAggregateAugmentedQueryDefinition.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorFormulaAndFunctionAggregateAugmentedQueryDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUGMENT_QUERY = "augment_query";
  private MonitorFormulaAndFunctionAggregateSubQuery augmentQuery;

  public static final String JSON_PROPERTY_BASE_QUERY = "base_query";
  private MonitorFormulaAndFunctionAggregateBaseQuery baseQuery;

  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private List<MonitorFormulaAndFunctionEventQueryDefinitionCompute> compute = new ArrayList<>();

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private MonitorFormulaAndFunctionAggregateAugmentedDataSource dataSource;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<MonitorFormulaAndFunctionEventQueryGroupBy> groupBy = new ArrayList<>();

  public static final String JSON_PROPERTY_JOIN_CONDITION = "join_condition";
  private MonitorFormulaAndFunctionAggregateQueryJoinCondition joinCondition;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public MonitorFormulaAndFunctionAggregateAugmentedQueryDefinition() {}

  @JsonCreator
  public MonitorFormulaAndFunctionAggregateAugmentedQueryDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUGMENT_QUERY)
          MonitorFormulaAndFunctionAggregateSubQuery augmentQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_BASE_QUERY)
          MonitorFormulaAndFunctionAggregateBaseQuery baseQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPUTE)
          List<MonitorFormulaAndFunctionEventQueryDefinitionCompute> compute,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          MonitorFormulaAndFunctionAggregateAugmentedDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUP_BY)
          List<MonitorFormulaAndFunctionEventQueryGroupBy> groupBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_JOIN_CONDITION)
          MonitorFormulaAndFunctionAggregateQueryJoinCondition joinCondition) {
    this.augmentQuery = augmentQuery;
    this.unparsed |= augmentQuery.unparsed;
    this.baseQuery = baseQuery;
    this.unparsed |= baseQuery.unparsed;
    this.compute = compute;
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.groupBy = groupBy;
    this.joinCondition = joinCondition;
    this.unparsed |= joinCondition.unparsed;
  }

  public MonitorFormulaAndFunctionAggregateAugmentedQueryDefinition augmentQuery(
      MonitorFormulaAndFunctionAggregateSubQuery augmentQuery) {
    this.augmentQuery = augmentQuery;
    this.unparsed |= augmentQuery.unparsed;
    return this;
  }

  /**
   * Sub-query for aggregate composite queries (augmented or filtered). Can be an events query or a
   * reference table query.
   *
   * @return augmentQuery
   */
  @JsonProperty(JSON_PROPERTY_AUGMENT_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MonitorFormulaAndFunctionAggregateSubQuery getAugmentQuery() {
    return augmentQuery;
  }

  public void setAugmentQuery(MonitorFormulaAndFunctionAggregateSubQuery augmentQuery) {
    this.augmentQuery = augmentQuery;
  }

  public MonitorFormulaAndFunctionAggregateAugmentedQueryDefinition baseQuery(
      MonitorFormulaAndFunctionAggregateBaseQuery baseQuery) {
    this.baseQuery = baseQuery;
    this.unparsed |= baseQuery.unparsed;
    return this;
  }

  /**
   * Base query for aggregate queries. Can be an events query or a metrics query.
   *
   * @return baseQuery
   */
  @JsonProperty(JSON_PROPERTY_BASE_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MonitorFormulaAndFunctionAggregateBaseQuery getBaseQuery() {
    return baseQuery;
  }

  public void setBaseQuery(MonitorFormulaAndFunctionAggregateBaseQuery baseQuery) {
    this.baseQuery = baseQuery;
  }

  public MonitorFormulaAndFunctionAggregateAugmentedQueryDefinition compute(
      List<MonitorFormulaAndFunctionEventQueryDefinitionCompute> compute) {
    this.compute = compute;
    for (MonitorFormulaAndFunctionEventQueryDefinitionCompute item : compute) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public MonitorFormulaAndFunctionAggregateAugmentedQueryDefinition addComputeItem(
      MonitorFormulaAndFunctionEventQueryDefinitionCompute computeItem) {
    this.compute.add(computeItem);
    this.unparsed |= computeItem.unparsed;
    return this;
  }

  /**
   * Compute options for the query.
   *
   * @return compute
   */
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<MonitorFormulaAndFunctionEventQueryDefinitionCompute> getCompute() {
    return compute;
  }

  public void setCompute(List<MonitorFormulaAndFunctionEventQueryDefinitionCompute> compute) {
    this.compute = compute;
  }

  public MonitorFormulaAndFunctionAggregateAugmentedQueryDefinition dataSource(
      MonitorFormulaAndFunctionAggregateAugmentedDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Data source for aggregate augmented queries.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MonitorFormulaAndFunctionAggregateAugmentedDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(MonitorFormulaAndFunctionAggregateAugmentedDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public MonitorFormulaAndFunctionAggregateAugmentedQueryDefinition groupBy(
      List<MonitorFormulaAndFunctionEventQueryGroupBy> groupBy) {
    this.groupBy = groupBy;
    for (MonitorFormulaAndFunctionEventQueryGroupBy item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public MonitorFormulaAndFunctionAggregateAugmentedQueryDefinition addGroupByItem(
      MonitorFormulaAndFunctionEventQueryGroupBy groupByItem) {
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * Group by options for the query.
   *
   * @return groupBy
   */
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<MonitorFormulaAndFunctionEventQueryGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<MonitorFormulaAndFunctionEventQueryGroupBy> groupBy) {
    this.groupBy = groupBy;
  }

  public MonitorFormulaAndFunctionAggregateAugmentedQueryDefinition joinCondition(
      MonitorFormulaAndFunctionAggregateQueryJoinCondition joinCondition) {
    this.joinCondition = joinCondition;
    this.unparsed |= joinCondition.unparsed;
    return this;
  }

  /**
   * Join condition for aggregate augmented queries.
   *
   * @return joinCondition
   */
  @JsonProperty(JSON_PROPERTY_JOIN_CONDITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MonitorFormulaAndFunctionAggregateQueryJoinCondition getJoinCondition() {
    return joinCondition;
  }

  public void setJoinCondition(MonitorFormulaAndFunctionAggregateQueryJoinCondition joinCondition) {
    this.joinCondition = joinCondition;
  }

  public MonitorFormulaAndFunctionAggregateAugmentedQueryDefinition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the query for use in formulas.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Return true if this MonitorFormulaAndFunctionAggregateAugmentedQueryDefinition object is equal
   * to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorFormulaAndFunctionAggregateAugmentedQueryDefinition
        monitorFormulaAndFunctionAggregateAugmentedQueryDefinition =
            (MonitorFormulaAndFunctionAggregateAugmentedQueryDefinition) o;
    return Objects.equals(
            this.augmentQuery,
            monitorFormulaAndFunctionAggregateAugmentedQueryDefinition.augmentQuery)
        && Objects.equals(
            this.baseQuery, monitorFormulaAndFunctionAggregateAugmentedQueryDefinition.baseQuery)
        && Objects.equals(
            this.compute, monitorFormulaAndFunctionAggregateAugmentedQueryDefinition.compute)
        && Objects.equals(
            this.dataSource, monitorFormulaAndFunctionAggregateAugmentedQueryDefinition.dataSource)
        && Objects.equals(
            this.groupBy, monitorFormulaAndFunctionAggregateAugmentedQueryDefinition.groupBy)
        && Objects.equals(
            this.joinCondition,
            monitorFormulaAndFunctionAggregateAugmentedQueryDefinition.joinCondition)
        && Objects.equals(
            this.name, monitorFormulaAndFunctionAggregateAugmentedQueryDefinition.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(augmentQuery, baseQuery, compute, dataSource, groupBy, joinCondition, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorFormulaAndFunctionAggregateAugmentedQueryDefinition {\n");
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
