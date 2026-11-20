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
  DoraListStreamQuery.JSON_PROPERTY_CROSS_ORG_UUIDS,
  DoraListStreamQuery.JSON_PROPERTY_DATA_SOURCE,
  DoraListStreamQuery.JSON_PROPERTY_INDEXES,
  DoraListStreamQuery.JSON_PROPERTY_QUERY_STRING,
  DoraListStreamQuery.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DoraListStreamQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CROSS_ORG_UUIDS = "cross_org_uuids";
  private List<String> crossOrgUuids = null;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private DoraListStreamQueryDataSource dataSource;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<DoraIndexes> indexes = new ArrayList<>();

  public static final String JSON_PROPERTY_QUERY_STRING = "query_string";
  private String queryString;

  public static final String JSON_PROPERTY_SORT = "sort";
  private DoraListStreamQuery20270101Sort sort;

  public DoraListStreamQuery() {}

  @JsonCreator
  public DoraListStreamQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          DoraListStreamQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_INDEXES) List<DoraIndexes> indexes,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY_STRING) String queryString) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.indexes = indexes;
    this.queryString = queryString;
  }

  public DoraListStreamQuery crossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
    return this;
  }

  public DoraListStreamQuery addCrossOrgUuidsItem(String crossOrgUuidsItem) {
    if (this.crossOrgUuids == null) {
      this.crossOrgUuids = new ArrayList<>();
    }
    this.crossOrgUuids.add(crossOrgUuidsItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return crossOrgUuids
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CROSS_ORG_UUIDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCrossOrgUuids() {
    return crossOrgUuids;
  }

  public void setCrossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
  }

  public DoraListStreamQuery dataSource(DoraListStreamQueryDataSource dataSource) {
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
  public DoraListStreamQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(DoraListStreamQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public DoraListStreamQuery indexes(List<DoraIndexes> indexes) {
    this.indexes = indexes;
    return this;
  }

  public DoraListStreamQuery addIndexesItem(DoraIndexes indexesItem) {
    this.indexes.add(indexesItem);
    this.unparsed |= !indexesItem.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return indexes
   */
  @JsonProperty(JSON_PROPERTY_INDEXES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<DoraIndexes> getIndexes() {
    return indexes;
  }

  public void setIndexes(List<DoraIndexes> indexes) {
    this.indexes = indexes;
  }

  public DoraListStreamQuery queryString(String queryString) {
    this.queryString = queryString;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public DoraListStreamQuery sort(DoraListStreamQuery20270101Sort sort) {
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
  public DoraListStreamQuery20270101Sort getSort() {
    return sort;
  }

  public void setSort(DoraListStreamQuery20270101Sort sort) {
    this.sort = sort;
    if (sort != null) {
      this.unparsed |= sort.unparsed;
    }
  }

  /** Return true if this DoraListStreamQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoraListStreamQuery doraListStreamQuery = (DoraListStreamQuery) o;
    return Objects.equals(this.crossOrgUuids, doraListStreamQuery.crossOrgUuids)
        && Objects.equals(this.dataSource, doraListStreamQuery.dataSource)
        && Objects.equals(this.indexes, doraListStreamQuery.indexes)
        && Objects.equals(this.queryString, doraListStreamQuery.queryString)
        && Objects.equals(this.sort, doraListStreamQuery.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crossOrgUuids, dataSource, indexes, queryString, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoraListStreamQuery {\n");
    sb.append("    crossOrgUuids: ").append(toIndentedString(crossOrgUuids)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
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
