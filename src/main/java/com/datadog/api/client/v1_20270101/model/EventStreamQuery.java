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
  EventStreamQuery.JSON_PROPERTY_CROSS_ORG_UUIDS,
  EventStreamQuery.JSON_PROPERTY_DATA_SOURCE,
  EventStreamQuery.JSON_PROPERTY_EVENT_SIZE,
  EventStreamQuery.JSON_PROPERTY_INDEXES,
  EventStreamQuery.JSON_PROPERTY_QUERY_STRING,
  EventStreamQuery.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventStreamQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CROSS_ORG_UUIDS = "cross_org_uuids";
  private List<String> crossOrgUuids = null;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private EventStreamQueryDataSource dataSource;

  public static final String JSON_PROPERTY_EVENT_SIZE = "event_size";
  private EventStreamQueryEventSize eventSize;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = null;

  public static final String JSON_PROPERTY_QUERY_STRING = "query_string";
  private String queryString;

  public static final String JSON_PROPERTY_SORT = "sort";
  private EventStreamQuery20270101Sort sort;

  public EventStreamQuery() {}

  @JsonCreator
  public EventStreamQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          EventStreamQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY_STRING) String queryString) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.queryString = queryString;
  }

  public EventStreamQuery crossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
    return this;
  }

  public EventStreamQuery addCrossOrgUuidsItem(String crossOrgUuidsItem) {
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

  public EventStreamQuery dataSource(EventStreamQueryDataSource dataSource) {
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
  public EventStreamQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(EventStreamQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public EventStreamQuery eventSize(EventStreamQueryEventSize eventSize) {
    this.eventSize = eventSize;
    this.unparsed |= !eventSize.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return eventSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EventStreamQueryEventSize getEventSize() {
    return eventSize;
  }

  public void setEventSize(EventStreamQueryEventSize eventSize) {
    if (!eventSize.isValid()) {
      this.unparsed = true;
    }
    this.eventSize = eventSize;
  }

  public EventStreamQuery indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }

  public EventStreamQuery addIndexesItem(String indexesItem) {
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

  public EventStreamQuery queryString(String queryString) {
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

  public EventStreamQuery sort(EventStreamQuery20270101Sort sort) {
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
  public EventStreamQuery20270101Sort getSort() {
    return sort;
  }

  public void setSort(EventStreamQuery20270101Sort sort) {
    this.sort = sort;
    if (sort != null) {
      this.unparsed |= sort.unparsed;
    }
  }

  /** Return true if this EventStreamQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventStreamQuery eventStreamQuery = (EventStreamQuery) o;
    return Objects.equals(this.crossOrgUuids, eventStreamQuery.crossOrgUuids)
        && Objects.equals(this.dataSource, eventStreamQuery.dataSource)
        && Objects.equals(this.eventSize, eventStreamQuery.eventSize)
        && Objects.equals(this.indexes, eventStreamQuery.indexes)
        && Objects.equals(this.queryString, eventStreamQuery.queryString)
        && Objects.equals(this.sort, eventStreamQuery.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crossOrgUuids, dataSource, eventSize, indexes, queryString, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventStreamQuery {\n");
    sb.append("    crossOrgUuids: ").append(toIndentedString(crossOrgUuids)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    eventSize: ").append(toIndentedString(eventSize)).append("\n");
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
