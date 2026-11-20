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
  EventsPlatformListStreamQuery.JSON_PROPERTY_CROSS_ORG_UUIDS,
  EventsPlatformListStreamQuery.JSON_PROPERTY_DATA_SOURCE,
  EventsPlatformListStreamQuery.JSON_PROPERTY_INDEXES,
  EventsPlatformListStreamQuery.JSON_PROPERTY_QUERY_SNAPSHOT,
  EventsPlatformListStreamQuery.JSON_PROPERTY_QUERY_STRING,
  EventsPlatformListStreamQuery.JSON_PROPERTY_SORT,
  EventsPlatformListStreamQuery.JSON_PROPERTY_STORAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventsPlatformListStreamQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CROSS_ORG_UUIDS = "cross_org_uuids";
  private List<String> crossOrgUuids = null;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private EventPlatformStreamDataSource dataSource;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = null;

  public static final String JSON_PROPERTY_QUERY_SNAPSHOT = "query_snapshot";
  private Boolean querySnapshot;

  public static final String JSON_PROPERTY_QUERY_STRING = "query_string";
  private String queryString;

  public static final String JSON_PROPERTY_SORT = "sort";
  private EventsPlatformListStreamQuery20270101Sort sort;

  public static final String JSON_PROPERTY_STORAGE = "storage";
  private StorageType storage;

  public EventsPlatformListStreamQuery() {}

  @JsonCreator
  public EventsPlatformListStreamQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          EventPlatformStreamDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY_STRING) String queryString) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.queryString = queryString;
  }

  public EventsPlatformListStreamQuery crossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
    return this;
  }

  public EventsPlatformListStreamQuery addCrossOrgUuidsItem(String crossOrgUuidsItem) {
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

  public EventsPlatformListStreamQuery dataSource(EventPlatformStreamDataSource dataSource) {
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
  public EventPlatformStreamDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(EventPlatformStreamDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public EventsPlatformListStreamQuery indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }

  public EventsPlatformListStreamQuery addIndexesItem(String indexesItem) {
    if (this.indexes == null) {
      this.indexes = new ArrayList<>();
    }
    this.indexes.add(indexesItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return indexes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getIndexes() {
    return indexes;
  }

  public void setIndexes(List<String> indexes) {
    this.indexes = indexes;
  }

  public EventsPlatformListStreamQuery querySnapshot(Boolean querySnapshot) {
    this.querySnapshot = querySnapshot;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return querySnapshot
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY_SNAPSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getQuerySnapshot() {
    return querySnapshot;
  }

  public void setQuerySnapshot(Boolean querySnapshot) {
    this.querySnapshot = querySnapshot;
  }

  public EventsPlatformListStreamQuery queryString(String queryString) {
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

  public EventsPlatformListStreamQuery sort(EventsPlatformListStreamQuery20270101Sort sort) {
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
  public EventsPlatformListStreamQuery20270101Sort getSort() {
    return sort;
  }

  public void setSort(EventsPlatformListStreamQuery20270101Sort sort) {
    this.sort = sort;
    if (sort != null) {
      this.unparsed |= sort.unparsed;
    }
  }

  public EventsPlatformListStreamQuery storage(StorageType storage) {
    this.storage = storage;
    this.unparsed |= !storage.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return storage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STORAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public StorageType getStorage() {
    return storage;
  }

  public void setStorage(StorageType storage) {
    if (!storage.isValid()) {
      this.unparsed = true;
    }
    this.storage = storage;
  }

  /** Return true if this EventsPlatformListStreamQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsPlatformListStreamQuery eventsPlatformListStreamQuery = (EventsPlatformListStreamQuery) o;
    return Objects.equals(this.crossOrgUuids, eventsPlatformListStreamQuery.crossOrgUuids)
        && Objects.equals(this.dataSource, eventsPlatformListStreamQuery.dataSource)
        && Objects.equals(this.indexes, eventsPlatformListStreamQuery.indexes)
        && Objects.equals(this.querySnapshot, eventsPlatformListStreamQuery.querySnapshot)
        && Objects.equals(this.queryString, eventsPlatformListStreamQuery.queryString)
        && Objects.equals(this.sort, eventsPlatformListStreamQuery.sort)
        && Objects.equals(this.storage, eventsPlatformListStreamQuery.storage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        crossOrgUuids, dataSource, indexes, querySnapshot, queryString, sort, storage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsPlatformListStreamQuery {\n");
    sb.append("    crossOrgUuids: ").append(toIndentedString(crossOrgUuids)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    querySnapshot: ").append(toIndentedString(querySnapshot)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
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
