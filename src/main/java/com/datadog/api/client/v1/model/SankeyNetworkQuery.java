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

/** Query configuration for Sankey network widget. */
@JsonPropertyOrder({
  SankeyNetworkQuery.JSON_PROPERTY_COMPUTE,
  SankeyNetworkQuery.JSON_PROPERTY_DATA_SOURCE,
  SankeyNetworkQuery.JSON_PROPERTY_GROUP_BY,
  SankeyNetworkQuery.JSON_PROPERTY_LIMIT,
  SankeyNetworkQuery.JSON_PROPERTY_MODE,
  SankeyNetworkQuery.JSON_PROPERTY_QUERY_STRING,
  SankeyNetworkQuery.JSON_PROPERTY_SHOULD_EXCLUDE_MISSING,
  SankeyNetworkQuery.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SankeyNetworkQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private SankeyNetworkQueryCompute compute;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private SankeyNetworkDataSource dataSource = SankeyNetworkDataSource.NETWORK;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<String> groupBy = new ArrayList<>();

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_MODE = "mode";
  private SankeyNetworkQueryMode mode = SankeyNetworkQueryMode.TARGET;

  public static final String JSON_PROPERTY_QUERY_STRING = "query_string";
  private String queryString;

  public static final String JSON_PROPERTY_SHOULD_EXCLUDE_MISSING = "should_exclude_missing";
  private Boolean shouldExcludeMissing;

  public static final String JSON_PROPERTY_SORT = "sort";
  private SankeyNetworkQuerySort sort;

  public SankeyNetworkQuery() {}

  @JsonCreator
  public SankeyNetworkQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          SankeyNetworkDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUP_BY) List<String> groupBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_LIMIT) Long limit,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY_STRING) String queryString) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.groupBy = groupBy;
    this.limit = limit;
    this.queryString = queryString;
  }

  public SankeyNetworkQuery compute(SankeyNetworkQueryCompute compute) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    return this;
  }

  /**
   * Compute aggregation for network queries.
   *
   * @return compute
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SankeyNetworkQueryCompute getCompute() {
    return compute;
  }

  public void setCompute(SankeyNetworkQueryCompute compute) {
    this.compute = compute;
  }

  public SankeyNetworkQuery dataSource(SankeyNetworkDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Network data source type.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SankeyNetworkDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(SankeyNetworkDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public SankeyNetworkQuery groupBy(List<String> groupBy) {
    this.groupBy = groupBy;
    return this;
  }

  public SankeyNetworkQuery addGroupByItem(String groupByItem) {
    this.groupBy.add(groupByItem);
    return this;
  }

  /**
   * Fields to group by.
   *
   * @return groupBy
   */
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<String> groupBy) {
    this.groupBy = groupBy;
  }

  public SankeyNetworkQuery limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Maximum number of results.
   *
   * @return limit
   */
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public SankeyNetworkQuery mode(SankeyNetworkQueryMode mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    return this;
  }

  /**
   * Sankey mode for network queries.
   *
   * @return mode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SankeyNetworkQueryMode getMode() {
    return mode;
  }

  public void setMode(SankeyNetworkQueryMode mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public SankeyNetworkQuery queryString(String queryString) {
    this.queryString = queryString;
    return this;
  }

  /**
   * Query string for filtering network data.
   *
   * @return queryString
   */
  @JsonProperty(JSON_PROPERTY_QUERY_STRING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQueryString() {
    return queryString;
  }

  public void setQueryString(String queryString) {
    this.queryString = queryString;
  }

  public SankeyNetworkQuery shouldExcludeMissing(Boolean shouldExcludeMissing) {
    this.shouldExcludeMissing = shouldExcludeMissing;
    return this;
  }

  /**
   * Whether to exclude missing values.
   *
   * @return shouldExcludeMissing
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOULD_EXCLUDE_MISSING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShouldExcludeMissing() {
    return shouldExcludeMissing;
  }

  public void setShouldExcludeMissing(Boolean shouldExcludeMissing) {
    this.shouldExcludeMissing = shouldExcludeMissing;
  }

  public SankeyNetworkQuery sort(SankeyNetworkQuerySort sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * Sort configuration for network queries.
   *
   * @return sort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SankeyNetworkQuerySort getSort() {
    return sort;
  }

  public void setSort(SankeyNetworkQuerySort sort) {
    this.sort = sort;
  }

  /** Return true if this SankeyNetworkQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SankeyNetworkQuery sankeyNetworkQuery = (SankeyNetworkQuery) o;
    return Objects.equals(this.compute, sankeyNetworkQuery.compute)
        && Objects.equals(this.dataSource, sankeyNetworkQuery.dataSource)
        && Objects.equals(this.groupBy, sankeyNetworkQuery.groupBy)
        && Objects.equals(this.limit, sankeyNetworkQuery.limit)
        && Objects.equals(this.mode, sankeyNetworkQuery.mode)
        && Objects.equals(this.queryString, sankeyNetworkQuery.queryString)
        && Objects.equals(this.shouldExcludeMissing, sankeyNetworkQuery.shouldExcludeMissing)
        && Objects.equals(this.sort, sankeyNetworkQuery.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        compute, dataSource, groupBy, limit, mode, queryString, shouldExcludeMissing, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SankeyNetworkQuery {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    shouldExcludeMissing: ")
        .append(toIndentedString(shouldExcludeMissing))
        .append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
