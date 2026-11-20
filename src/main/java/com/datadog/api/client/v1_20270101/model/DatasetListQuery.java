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
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  DatasetListQuery.JSON_PROPERTY_DATA_SOURCE,
  DatasetListQuery.JSON_PROPERTY_DATASET_ID,
  DatasetListQuery.JSON_PROPERTY_DATASET_PROVIDER,
  DatasetListQuery.JSON_PROPERTY_FILTER,
  DatasetListQuery.JSON_PROPERTY_LIMIT,
  DatasetListQuery.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatasetListQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private DatasetListQueryDataSource dataSource;

  public static final String JSON_PROPERTY_DATASET_ID = "dataset_id";
  private String datasetId;

  public static final String JSON_PROPERTY_DATASET_PROVIDER = "dataset_provider";
  private PublishedDatasetProvider datasetProvider;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private String filter;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Double limit;

  public static final String JSON_PROPERTY_SORT = "sort";
  private DatasetListQuerySort sort;

  public DatasetListQuery() {}

  @JsonCreator
  public DatasetListQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          DatasetListQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATASET_ID) String datasetId,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATASET_PROVIDER)
          PublishedDatasetProvider datasetProvider) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.datasetId = datasetId;
    if (datasetId != null) {}
    this.datasetProvider = datasetProvider;
    this.unparsed |= !datasetProvider.isValid();
  }

  public DatasetListQuery dataSource(DatasetListQueryDataSource dataSource) {
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
  public DatasetListQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(DatasetListQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public DatasetListQuery datasetId(String datasetId) {
    this.datasetId = datasetId;
    if (datasetId != null) {}
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return datasetId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATASET_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDatasetId() {
    return datasetId;
  }

  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }

  public DatasetListQuery datasetProvider(PublishedDatasetProvider datasetProvider) {
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

  public DatasetListQuery filter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return filter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public DatasetListQuery limit(Double limit) {
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

  public DatasetListQuery sort(DatasetListQuerySort sort) {
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
  public DatasetListQuerySort getSort() {
    return sort;
  }

  public void setSort(DatasetListQuerySort sort) {
    this.sort = sort;
    if (sort != null) {
      this.unparsed |= sort.unparsed;
    }
  }

  /** Return true if this DatasetListQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetListQuery datasetListQuery = (DatasetListQuery) o;
    return Objects.equals(this.dataSource, datasetListQuery.dataSource)
        && Objects.equals(this.datasetId, datasetListQuery.datasetId)
        && Objects.equals(this.datasetProvider, datasetListQuery.datasetProvider)
        && Objects.equals(this.filter, datasetListQuery.filter)
        && Objects.equals(this.limit, datasetListQuery.limit)
        && Objects.equals(this.sort, datasetListQuery.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSource, datasetId, datasetProvider, filter, limit, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetListQuery {\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    datasetProvider: ").append(toIndentedString(datasetProvider)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
