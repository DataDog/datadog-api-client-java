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
  AuditStreamQuery.JSON_PROPERTY_CONTEXT,
  AuditStreamQuery.JSON_PROPERTY_CROSS_ORG_UUIDS,
  AuditStreamQuery.JSON_PROPERTY_DATA_SOURCE,
  AuditStreamQuery.JSON_PROPERTY_INDEXES,
  AuditStreamQuery.JSON_PROPERTY_QUERY_STRING,
  AuditStreamQuery.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AuditStreamQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTEXT = "context";
  private EventsContext context;

  public static final String JSON_PROPERTY_CROSS_ORG_UUIDS = "cross_org_uuids";
  private List<String> crossOrgUuids = null;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private AuditStreamQueryDataSource dataSource;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = null;

  public static final String JSON_PROPERTY_QUERY_STRING = "query_string";
  private String queryString;

  public static final String JSON_PROPERTY_SORT = "sort";
  private AuditStreamQuery20270101Sort sort;

  public AuditStreamQuery() {}

  @JsonCreator
  public AuditStreamQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          AuditStreamQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY_STRING) String queryString) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.queryString = queryString;
  }

  public AuditStreamQuery context(EventsContext context) {
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

  public AuditStreamQuery crossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
    return this;
  }

  public AuditStreamQuery addCrossOrgUuidsItem(String crossOrgUuidsItem) {
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

  public AuditStreamQuery dataSource(AuditStreamQueryDataSource dataSource) {
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
  public AuditStreamQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(AuditStreamQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public AuditStreamQuery indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }

  public AuditStreamQuery addIndexesItem(String indexesItem) {
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

  public AuditStreamQuery queryString(String queryString) {
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

  public AuditStreamQuery sort(AuditStreamQuery20270101Sort sort) {
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
  public AuditStreamQuery20270101Sort getSort() {
    return sort;
  }

  public void setSort(AuditStreamQuery20270101Sort sort) {
    this.sort = sort;
    if (sort != null) {
      this.unparsed |= sort.unparsed;
    }
  }

  /** Return true if this AuditStreamQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditStreamQuery auditStreamQuery = (AuditStreamQuery) o;
    return Objects.equals(this.context, auditStreamQuery.context)
        && Objects.equals(this.crossOrgUuids, auditStreamQuery.crossOrgUuids)
        && Objects.equals(this.dataSource, auditStreamQuery.dataSource)
        && Objects.equals(this.indexes, auditStreamQuery.indexes)
        && Objects.equals(this.queryString, auditStreamQuery.queryString)
        && Objects.equals(this.sort, auditStreamQuery.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, crossOrgUuids, dataSource, indexes, queryString, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditStreamQuery {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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
