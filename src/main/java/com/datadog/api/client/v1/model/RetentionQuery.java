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

/** Retention query definition. */
@JsonPropertyOrder({
  RetentionQuery.JSON_PROPERTY_COMPUTE,
  RetentionQuery.JSON_PROPERTY_DATA_SOURCE,
  RetentionQuery.JSON_PROPERTY_FILTERS,
  RetentionQuery.JSON_PROPERTY_GROUP_BY,
  RetentionQuery.JSON_PROPERTY_NAME,
  RetentionQuery.JSON_PROPERTY_SEARCH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RetentionQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private RetentionCompute compute;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private RetentionDataSource dataSource;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private RetentionFilters filters;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<RetentionGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private RetentionSearch search;

  public RetentionQuery() {}

  @JsonCreator
  public RetentionQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPUTE) RetentionCompute compute,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          RetentionDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEARCH) RetentionSearch search) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.search = search;
    this.unparsed |= search.unparsed;
  }

  public RetentionQuery compute(RetentionCompute compute) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    return this;
  }

  /**
   * Compute configuration for retention queries.
   *
   * @return compute
   */
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RetentionCompute getCompute() {
    return compute;
  }

  public void setCompute(RetentionCompute compute) {
    this.compute = compute;
  }

  public RetentionQuery dataSource(RetentionDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Data source for retention queries.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RetentionDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(RetentionDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public RetentionQuery filters(RetentionFilters filters) {
    this.filters = filters;
    this.unparsed |= filters.unparsed;
    return this;
  }

  /**
   * Filters for retention queries.
   *
   * @return filters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RetentionFilters getFilters() {
    return filters;
  }

  public void setFilters(RetentionFilters filters) {
    this.filters = filters;
  }

  public RetentionQuery groupBy(List<RetentionGroupBy> groupBy) {
    this.groupBy = groupBy;
    for (RetentionGroupBy item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public RetentionQuery addGroupByItem(RetentionGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * Group by configuration.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RetentionGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<RetentionGroupBy> groupBy) {
    this.groupBy = groupBy;
  }

  public RetentionQuery name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the query.
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

  public RetentionQuery search(RetentionSearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * Search configuration for retention queries.
   *
   * @return search
   */
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RetentionSearch getSearch() {
    return search;
  }

  public void setSearch(RetentionSearch search) {
    this.search = search;
  }

  /** Return true if this RetentionQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionQuery retentionQuery = (RetentionQuery) o;
    return Objects.equals(this.compute, retentionQuery.compute)
        && Objects.equals(this.dataSource, retentionQuery.dataSource)
        && Objects.equals(this.filters, retentionQuery.filters)
        && Objects.equals(this.groupBy, retentionQuery.groupBy)
        && Objects.equals(this.name, retentionQuery.name)
        && Objects.equals(this.search, retentionQuery.search);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compute, dataSource, filters, groupBy, name, search);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionQuery {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
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
