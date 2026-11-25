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
  ListFilteredQuery.JSON_PROPERTY_BASE_QUERY,
  ListFilteredQuery.JSON_PROPERTY_CONTEXT,
  ListFilteredQuery.JSON_PROPERTY_DATA_SOURCE,
  ListFilteredQuery.JSON_PROPERTY_FILTER_QUERY,
  ListFilteredQuery.JSON_PROPERTY_FILTERS,
  ListFilteredQuery.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ListFilteredQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BASE_QUERY = "base_query";
  private CompositeEventsPlatformQuery baseQuery;

  public static final String JSON_PROPERTY_CONTEXT = "context";
  private EventsContext context;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private ListFilteredQueryDataSource dataSource;

  public static final String JSON_PROPERTY_FILTER_QUERY = "filter_query";
  private CompositeSourceSubQuery filterQuery;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<ListFilteredQueryFiltersItems> filters = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public ListFilteredQuery() {}

  @JsonCreator
  public ListFilteredQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_BASE_QUERY)
          CompositeEventsPlatformQuery baseQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          ListFilteredQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_FILTER_QUERY)
          CompositeSourceSubQuery filterQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_FILTERS)
          List<ListFilteredQueryFiltersItems> filters,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.baseQuery = baseQuery;
    this.unparsed |= baseQuery.unparsed;
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.filterQuery = filterQuery;
    this.unparsed |= filterQuery.unparsed;
    this.filters = filters;
    for (ListFilteredQueryFiltersItems item : filters) {
      this.unparsed |= item.unparsed;
    }
    this.name = name;
  }

  public ListFilteredQuery baseQuery(CompositeEventsPlatformQuery baseQuery) {
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

  public ListFilteredQuery context(EventsContext context) {
    this.context = context;
    this.unparsed |= context.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return context
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EventsContext getContext() {
    return context;
  }

  public void setContext(EventsContext context) {
    this.context = context;
    if (context != null) {
      this.unparsed |= context.unparsed;
    }
  }

  public ListFilteredQuery dataSource(ListFilteredQueryDataSource dataSource) {
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
  public ListFilteredQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(ListFilteredQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public ListFilteredQuery filterQuery(CompositeSourceSubQuery filterQuery) {
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

  public ListFilteredQuery filters(List<ListFilteredQueryFiltersItems> filters) {
    this.filters = filters;
    for (ListFilteredQueryFiltersItems item : filters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ListFilteredQuery addFiltersItem(ListFilteredQueryFiltersItems filtersItem) {
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
  public List<ListFilteredQueryFiltersItems> getFilters() {
    return filters;
  }

  public void setFilters(List<ListFilteredQueryFiltersItems> filters) {
    this.filters = filters;
    if (filters != null) {
      for (ListFilteredQueryFiltersItems item : filters) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ListFilteredQuery name(String name) {
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

  /** Return true if this ListFilteredQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListFilteredQuery listFilteredQuery = (ListFilteredQuery) o;
    return Objects.equals(this.baseQuery, listFilteredQuery.baseQuery)
        && Objects.equals(this.context, listFilteredQuery.context)
        && Objects.equals(this.dataSource, listFilteredQuery.dataSource)
        && Objects.equals(this.filterQuery, listFilteredQuery.filterQuery)
        && Objects.equals(this.filters, listFilteredQuery.filters)
        && Objects.equals(this.name, listFilteredQuery.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseQuery, context, dataSource, filterQuery, filters, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListFilteredQuery {\n");
    sb.append("    baseQuery: ").append(toIndentedString(baseQuery)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    filterQuery: ").append(toIndentedString(filterQuery)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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
