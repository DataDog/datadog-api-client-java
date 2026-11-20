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
  AggregateFilteredQuery.JSON_PROPERTY_BASE_QUERY,
  AggregateFilteredQuery.JSON_PROPERTY_COMPUTE,
  AggregateFilteredQuery.JSON_PROPERTY_DATA_SOURCE,
  AggregateFilteredQuery.JSON_PROPERTY_FILTER_QUERY,
  AggregateFilteredQuery.JSON_PROPERTY_FILTERS,
  AggregateFilteredQuery.JSON_PROPERTY_GROUP_BY,
  AggregateFilteredQuery.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AggregateFilteredQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BASE_QUERY = "base_query";
  private CompositeEventsPlatformQuery baseQuery;

  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private List<CompositeCompute> compute = new ArrayList<>();

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private AggregateFilteredQueryDataSource dataSource;

  public static final String JSON_PROPERTY_FILTER_QUERY = "filter_query";
  private CompositeSourceSubQuery filterQuery;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<AggregateFilteredQueryFiltersItems> filters = new ArrayList<>();

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<CompositeGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public AggregateFilteredQuery() {}

  @JsonCreator
  public AggregateFilteredQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_BASE_QUERY)
          CompositeEventsPlatformQuery baseQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPUTE) List<CompositeCompute> compute,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          AggregateFilteredQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_FILTER_QUERY)
          CompositeSourceSubQuery filterQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_FILTERS)
          List<AggregateFilteredQueryFiltersItems> filters,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.baseQuery = baseQuery;
    this.unparsed |= baseQuery.unparsed;
    this.compute = compute;
    for (CompositeCompute item : compute) {
      this.unparsed |= item.unparsed;
    }
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.filterQuery = filterQuery;
    this.unparsed |= filterQuery.unparsed;
    this.filters = filters;
    for (AggregateFilteredQueryFiltersItems item : filters) {
      this.unparsed |= item.unparsed;
    }
    this.name = name;
  }

  public AggregateFilteredQuery baseQuery(CompositeEventsPlatformQuery baseQuery) {
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

  public AggregateFilteredQuery compute(List<CompositeCompute> compute) {
    this.compute = compute;
    for (CompositeCompute item : compute) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AggregateFilteredQuery addComputeItem(CompositeCompute computeItem) {
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

  public AggregateFilteredQuery dataSource(AggregateFilteredQueryDataSource dataSource) {
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
  public AggregateFilteredQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(AggregateFilteredQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public AggregateFilteredQuery filterQuery(CompositeSourceSubQuery filterQuery) {
    this.filterQuery = filterQuery;
    this.unparsed |= filterQuery.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return filterQuery
   */
  @JsonProperty(JSON_PROPERTY_FILTER_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CompositeSourceSubQuery getFilterQuery() {
    return filterQuery;
  }

  public void setFilterQuery(CompositeSourceSubQuery filterQuery) {
    this.filterQuery = filterQuery;
    if (filterQuery != null) {
      this.unparsed |= filterQuery.unparsed;
    }
  }

  public AggregateFilteredQuery filters(List<AggregateFilteredQueryFiltersItems> filters) {
    this.filters = filters;
    for (AggregateFilteredQueryFiltersItems item : filters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AggregateFilteredQuery addFiltersItem(AggregateFilteredQueryFiltersItems filtersItem) {
    this.filters.add(filtersItem);
    this.unparsed |= filtersItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return filters
   */
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<AggregateFilteredQueryFiltersItems> getFilters() {
    return filters;
  }

  public void setFilters(List<AggregateFilteredQueryFiltersItems> filters) {
    this.filters = filters;
    if (filters != null) {
      for (AggregateFilteredQueryFiltersItems item : filters) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AggregateFilteredQuery groupBy(List<CompositeGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (CompositeGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public AggregateFilteredQuery addGroupByItem(CompositeGroupBy groupByItem) {
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

  public AggregateFilteredQuery name(String name) {
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

  /** Return true if this AggregateFilteredQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregateFilteredQuery aggregateFilteredQuery = (AggregateFilteredQuery) o;
    return Objects.equals(this.baseQuery, aggregateFilteredQuery.baseQuery)
        && Objects.equals(this.compute, aggregateFilteredQuery.compute)
        && Objects.equals(this.dataSource, aggregateFilteredQuery.dataSource)
        && Objects.equals(this.filterQuery, aggregateFilteredQuery.filterQuery)
        && Objects.equals(this.filters, aggregateFilteredQuery.filters)
        && Objects.equals(this.groupBy, aggregateFilteredQuery.groupBy)
        && Objects.equals(this.name, aggregateFilteredQuery.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseQuery, compute, dataSource, filterQuery, filters, groupBy, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregateFilteredQuery {\n");
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
