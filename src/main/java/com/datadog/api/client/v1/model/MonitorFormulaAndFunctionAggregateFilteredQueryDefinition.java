/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>A formula and functions aggregate filtered query. Used to filter base query results using data from another source.</p>
 */
@JsonPropertyOrder({
  MonitorFormulaAndFunctionAggregateFilteredQueryDefinition.JSON_PROPERTY_BASE_QUERY,
  MonitorFormulaAndFunctionAggregateFilteredQueryDefinition.JSON_PROPERTY_COMPUTE,
  MonitorFormulaAndFunctionAggregateFilteredQueryDefinition.JSON_PROPERTY_DATA_SOURCE,
  MonitorFormulaAndFunctionAggregateFilteredQueryDefinition.JSON_PROPERTY_FILTER_QUERY,
  MonitorFormulaAndFunctionAggregateFilteredQueryDefinition.JSON_PROPERTY_FILTERS,
  MonitorFormulaAndFunctionAggregateFilteredQueryDefinition.JSON_PROPERTY_GROUP_BY,
  MonitorFormulaAndFunctionAggregateFilteredQueryDefinition.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorFormulaAndFunctionAggregateFilteredQueryDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BASE_QUERY = "base_query";
  private MonitorFormulaAndFunctionAggregateBaseQuery baseQuery;

  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private List<MonitorFormulaAndFunctionEventQueryDefinitionCompute> compute = null;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private MonitorFormulaAndFunctionAggregateFilteredDataSource dataSource;

  public static final String JSON_PROPERTY_FILTER_QUERY = "filter_query";
  private MonitorFormulaAndFunctionAggregateFilterQuery filterQuery;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<MonitorFormulaAndFunctionAggregateQueryFilter> filters = new ArrayList<>();

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<MonitorFormulaAndFunctionEventQueryGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public MonitorFormulaAndFunctionAggregateFilteredQueryDefinition() {}

  @JsonCreator
  public MonitorFormulaAndFunctionAggregateFilteredQueryDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_BASE_QUERY)MonitorFormulaAndFunctionAggregateBaseQuery baseQuery,
            @JsonProperty(required=true, value=JSON_PROPERTY_DATA_SOURCE)MonitorFormulaAndFunctionAggregateFilteredDataSource dataSource,
            @JsonProperty(required=true, value=JSON_PROPERTY_FILTER_QUERY)MonitorFormulaAndFunctionAggregateFilterQuery filterQuery,
            @JsonProperty(required=true, value=JSON_PROPERTY_FILTERS)List<MonitorFormulaAndFunctionAggregateQueryFilter> filters) {
        this.baseQuery = baseQuery;
        this.unparsed |= baseQuery.unparsed;
        this.dataSource = dataSource;
        this.unparsed |= !dataSource.isValid();
        this.filterQuery = filterQuery;
        this.unparsed |= filterQuery.unparsed;
        this.filters = filters;
  }
  public MonitorFormulaAndFunctionAggregateFilteredQueryDefinition baseQuery(MonitorFormulaAndFunctionAggregateBaseQuery baseQuery) {
    this.baseQuery = baseQuery;
    this.unparsed |= baseQuery.unparsed;
    return this;
  }

  /**
   * <p>Base query for aggregate queries. Can be an events query or a metrics query.</p>
   * @return baseQuery
  **/
      @JsonProperty(JSON_PROPERTY_BASE_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public MonitorFormulaAndFunctionAggregateBaseQuery getBaseQuery() {
        return baseQuery;
      }
  public void setBaseQuery(MonitorFormulaAndFunctionAggregateBaseQuery baseQuery) {
    this.baseQuery = baseQuery;
  }
  public MonitorFormulaAndFunctionAggregateFilteredQueryDefinition compute(List<MonitorFormulaAndFunctionEventQueryDefinitionCompute> compute) {
    this.compute = compute;
    for (MonitorFormulaAndFunctionEventQueryDefinitionCompute item : compute) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public MonitorFormulaAndFunctionAggregateFilteredQueryDefinition addComputeItem(MonitorFormulaAndFunctionEventQueryDefinitionCompute computeItem) {
    if (this.compute == null) {
      this.compute = new ArrayList<>();
    }
    this.compute.add(computeItem);
    this.unparsed |= computeItem.unparsed;
    return this;
  }

  /**
   * <p>Compute options for the query.</p>
   * @return compute
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COMPUTE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<MonitorFormulaAndFunctionEventQueryDefinitionCompute> getCompute() {
        return compute;
      }
  public void setCompute(List<MonitorFormulaAndFunctionEventQueryDefinitionCompute> compute) {
    this.compute = compute;
  }
  public MonitorFormulaAndFunctionAggregateFilteredQueryDefinition dataSource(MonitorFormulaAndFunctionAggregateFilteredDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * <p>Data source for aggregate filtered queries.</p>
   * @return dataSource
  **/
      @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public MonitorFormulaAndFunctionAggregateFilteredDataSource getDataSource() {
        return dataSource;
      }
  public void setDataSource(MonitorFormulaAndFunctionAggregateFilteredDataSource dataSource) {
    if (!dataSource.isValid()) {
        this.unparsed = true;
    }
    this.dataSource = dataSource;
  }
  public MonitorFormulaAndFunctionAggregateFilteredQueryDefinition filterQuery(MonitorFormulaAndFunctionAggregateFilterQuery filterQuery) {
    this.filterQuery = filterQuery;
    this.unparsed |= filterQuery.unparsed;
    return this;
  }

  /**
   * <p>Filter query for aggregate filtered queries. Can be an events query or a reference table query.</p>
   * @return filterQuery
  **/
      @JsonProperty(JSON_PROPERTY_FILTER_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public MonitorFormulaAndFunctionAggregateFilterQuery getFilterQuery() {
        return filterQuery;
      }
  public void setFilterQuery(MonitorFormulaAndFunctionAggregateFilterQuery filterQuery) {
    this.filterQuery = filterQuery;
  }
  public MonitorFormulaAndFunctionAggregateFilteredQueryDefinition filters(List<MonitorFormulaAndFunctionAggregateQueryFilter> filters) {
    this.filters = filters;
    for (MonitorFormulaAndFunctionAggregateQueryFilter item : filters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public MonitorFormulaAndFunctionAggregateFilteredQueryDefinition addFiltersItem(MonitorFormulaAndFunctionAggregateQueryFilter filtersItem) {
    this.filters.add(filtersItem);
    this.unparsed |= filtersItem.unparsed;
    return this;
  }

  /**
   * <p>Filter conditions for the query.</p>
   * @return filters
  **/
      @JsonProperty(JSON_PROPERTY_FILTERS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<MonitorFormulaAndFunctionAggregateQueryFilter> getFilters() {
        return filters;
      }
  public void setFilters(List<MonitorFormulaAndFunctionAggregateQueryFilter> filters) {
    this.filters = filters;
  }
  public MonitorFormulaAndFunctionAggregateFilteredQueryDefinition groupBy(List<MonitorFormulaAndFunctionEventQueryGroupBy> groupBy) {
    this.groupBy = groupBy;
    for (MonitorFormulaAndFunctionEventQueryGroupBy item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public MonitorFormulaAndFunctionAggregateFilteredQueryDefinition addGroupByItem(MonitorFormulaAndFunctionEventQueryGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * <p>Group by options for the query.</p>
   * @return groupBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GROUP_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<MonitorFormulaAndFunctionEventQueryGroupBy> getGroupBy() {
        return groupBy;
      }
  public void setGroupBy(List<MonitorFormulaAndFunctionEventQueryGroupBy> groupBy) {
    this.groupBy = groupBy;
  }
  public MonitorFormulaAndFunctionAggregateFilteredQueryDefinition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the query for use in formulas.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Return true if this MonitorFormulaAndFunctionAggregateFilteredQueryDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorFormulaAndFunctionAggregateFilteredQueryDefinition monitorFormulaAndFunctionAggregateFilteredQueryDefinition = (MonitorFormulaAndFunctionAggregateFilteredQueryDefinition) o;
    return Objects.equals(this.baseQuery, monitorFormulaAndFunctionAggregateFilteredQueryDefinition.baseQuery) && Objects.equals(this.compute, monitorFormulaAndFunctionAggregateFilteredQueryDefinition.compute) && Objects.equals(this.dataSource, monitorFormulaAndFunctionAggregateFilteredQueryDefinition.dataSource) && Objects.equals(this.filterQuery, monitorFormulaAndFunctionAggregateFilteredQueryDefinition.filterQuery) && Objects.equals(this.filters, monitorFormulaAndFunctionAggregateFilteredQueryDefinition.filters) && Objects.equals(this.groupBy, monitorFormulaAndFunctionAggregateFilteredQueryDefinition.groupBy) && Objects.equals(this.name, monitorFormulaAndFunctionAggregateFilteredQueryDefinition.name);
  }


  @Override
  public int hashCode() {
    return Objects.hash(baseQuery,compute,dataSource,filterQuery,filters,groupBy,name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorFormulaAndFunctionAggregateFilteredQueryDefinition {\n");
    sb.append("    baseQuery: ").append(toIndentedString(baseQuery)).append("\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    filterQuery: ").append(toIndentedString(filterQuery)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
