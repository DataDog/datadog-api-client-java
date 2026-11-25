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
  FormulaDatasetQuery.JSON_PROPERTY_COMPUTE,
  FormulaDatasetQuery.JSON_PROPERTY_DATA_SOURCE,
  FormulaDatasetQuery.JSON_PROPERTY_DATASET_ID,
  FormulaDatasetQuery.JSON_PROPERTY_DATASET_PROVIDER,
  FormulaDatasetQuery.JSON_PROPERTY_GROUP_BY,
  FormulaDatasetQuery.JSON_PROPERTY_LIMIT,
  FormulaDatasetQuery.JSON_PROPERTY_NAME,
  FormulaDatasetQuery.JSON_PROPERTY_QUERY_FILTER,
  FormulaDatasetQuery.JSON_PROPERTY_SORT,
  FormulaDatasetQuery.JSON_PROPERTY_TIME_COLUMN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaDatasetQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private List<DatasetCompute> compute = new ArrayList<>();

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FormulaDatasetQueryDataSource dataSource;

  public static final String JSON_PROPERTY_DATASET_ID = "dataset_id";
  private String datasetId;

  public static final String JSON_PROPERTY_DATASET_PROVIDER = "dataset_provider";
  private PublishedDatasetProvider datasetProvider;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<DatasetGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Double limit;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY_FILTER = "query_filter";
  private String queryFilter;

  public static final String JSON_PROPERTY_SORT = "sort";
  private List<DatasetSort> sort = null;

  public static final String JSON_PROPERTY_TIME_COLUMN = "time_column";
  private String timeColumn;

  public FormulaDatasetQuery() {}

  @JsonCreator
  public FormulaDatasetQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPUTE) List<DatasetCompute> compute,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          FormulaDatasetQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATASET_ID) String datasetId,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATASET_PROVIDER)
          PublishedDatasetProvider datasetProvider,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.compute = compute;
    for (DatasetCompute item : compute) {
      this.unparsed |= item.unparsed;
    }
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.datasetId = datasetId;
    this.datasetProvider = datasetProvider;
    this.unparsed |= !datasetProvider.isValid();
    this.name = name;
  }

  public FormulaDatasetQuery compute(List<DatasetCompute> compute) {
    this.compute = compute;
    for (DatasetCompute item : compute) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FormulaDatasetQuery addComputeItem(DatasetCompute computeItem) {
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
  public List<DatasetCompute> getCompute() {
    return compute;
  }

  public void setCompute(List<DatasetCompute> compute) {
    this.compute = compute;
    if (compute != null) {
      for (DatasetCompute item : compute) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public FormulaDatasetQuery dataSource(FormulaDatasetQueryDataSource dataSource) {
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
  public FormulaDatasetQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(FormulaDatasetQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public FormulaDatasetQuery datasetId(String datasetId) {
    this.datasetId = datasetId;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return datasetId
   */
  @JsonProperty(JSON_PROPERTY_DATASET_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDatasetId() {
    return datasetId;
  }

  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }

  public FormulaDatasetQuery datasetProvider(PublishedDatasetProvider datasetProvider) {
    this.datasetProvider = datasetProvider;
    this.unparsed |= !datasetProvider.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return datasetProvider
   */
  @JsonProperty(JSON_PROPERTY_DATASET_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public PublishedDatasetProvider getDatasetProvider() {
    return datasetProvider;
  }

  public void setDatasetProvider(PublishedDatasetProvider datasetProvider) {
    if (!datasetProvider.isValid()) {
      this.unparsed = true;
    }
    this.datasetProvider = datasetProvider;
  }

  public FormulaDatasetQuery groupBy(List<DatasetGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (DatasetGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public FormulaDatasetQuery addGroupByItem(DatasetGroupBy groupByItem) {
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
  public List<DatasetGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<DatasetGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (DatasetGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public FormulaDatasetQuery limit(Double limit) {
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

  public FormulaDatasetQuery name(String name) {
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

  public FormulaDatasetQuery queryFilter(String queryFilter) {
    this.queryFilter = queryFilter;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return queryFilter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQueryFilter() {
    return queryFilter;
  }

  public void setQueryFilter(String queryFilter) {
    this.queryFilter = queryFilter;
  }

  public FormulaDatasetQuery sort(List<DatasetSort> sort) {
    this.sort = sort;
    if (sort != null) {
      for (DatasetSort item : sort) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public FormulaDatasetQuery addSortItem(DatasetSort sortItem) {
    if (this.sort == null) {
      this.sort = new ArrayList<>();
    }
    this.sort.add(sortItem);
    this.unparsed |= sortItem.unparsed;
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
  public List<DatasetSort> getSort() {
    return sort;
  }

  public void setSort(List<DatasetSort> sort) {
    this.sort = sort;
    if (sort != null) {
      for (DatasetSort item : sort) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public FormulaDatasetQuery timeColumn(String timeColumn) {
    this.timeColumn = timeColumn;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return timeColumn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_COLUMN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTimeColumn() {
    return timeColumn;
  }

  public void setTimeColumn(String timeColumn) {
    this.timeColumn = timeColumn;
  }

  /** Return true if this FormulaDatasetQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaDatasetQuery formulaDatasetQuery = (FormulaDatasetQuery) o;
    return Objects.equals(this.compute, formulaDatasetQuery.compute)
        && Objects.equals(this.dataSource, formulaDatasetQuery.dataSource)
        && Objects.equals(this.datasetId, formulaDatasetQuery.datasetId)
        && Objects.equals(this.datasetProvider, formulaDatasetQuery.datasetProvider)
        && Objects.equals(this.groupBy, formulaDatasetQuery.groupBy)
        && Objects.equals(this.limit, formulaDatasetQuery.limit)
        && Objects.equals(this.name, formulaDatasetQuery.name)
        && Objects.equals(this.queryFilter, formulaDatasetQuery.queryFilter)
        && Objects.equals(this.sort, formulaDatasetQuery.sort)
        && Objects.equals(this.timeColumn, formulaDatasetQuery.timeColumn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        compute,
        dataSource,
        datasetId,
        datasetProvider,
        groupBy,
        limit,
        name,
        queryFilter,
        sort,
        timeColumn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaDatasetQuery {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    datasetProvider: ").append(toIndentedString(datasetProvider)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    queryFilter: ").append(toIndentedString(queryFilter)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    timeColumn: ").append(toIndentedString(timeColumn)).append("\n");
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
