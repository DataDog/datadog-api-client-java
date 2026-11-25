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
  LogsTransactionStreamQuery.JSON_PROPERTY_CALCULATED_FIELDS,
  LogsTransactionStreamQuery.JSON_PROPERTY_COMPUTE,
  LogsTransactionStreamQuery.JSON_PROPERTY_CROSS_ORG_UUIDS,
  LogsTransactionStreamQuery.JSON_PROPERTY_DATA_SOURCE,
  LogsTransactionStreamQuery.JSON_PROPERTY_END_QUERY_STRING,
  LogsTransactionStreamQuery.JSON_PROPERTY_GROUP_BY,
  LogsTransactionStreamQuery.JSON_PROPERTY_INDEXES,
  LogsTransactionStreamQuery.JSON_PROPERTY_QUERY_STRING,
  LogsTransactionStreamQuery.JSON_PROPERTY_SORT,
  LogsTransactionStreamQuery.JSON_PROPERTY_START_QUERY_STRING,
  LogsTransactionStreamQuery.JSON_PROPERTY_STORAGE,
  LogsTransactionStreamQuery.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsTransactionStreamQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CALCULATED_FIELDS = "calculated_fields";
  private List<EventsCalculatedField> calculatedFields = null;

  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private List<LogsTransactionCompute> compute = null;

  public static final String JSON_PROPERTY_CROSS_ORG_UUIDS = "cross_org_uuids";
  private List<String> crossOrgUuids = null;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private LogsTransactionStreamQueryDataSource dataSource;

  public static final String JSON_PROPERTY_END_QUERY_STRING = "end_query_string";
  private String endQueryString;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<Object> groupBy = null;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = null;

  public static final String JSON_PROPERTY_QUERY_STRING = "query_string";
  private String queryString;

  public static final String JSON_PROPERTY_SORT = "sort";
  private LogsTransactionStreamQuery20270101Sort sort;

  public static final String JSON_PROPERTY_START_QUERY_STRING = "start_query_string";
  private String startQueryString;

  public static final String JSON_PROPERTY_STORAGE = "storage";
  private StorageType storage;

  public static final String JSON_PROPERTY_VERSION = "version";
  private LogsTransactionStreamQueryVersion version;

  public LogsTransactionStreamQuery() {}

  @JsonCreator
  public LogsTransactionStreamQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          LogsTransactionStreamQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY_STRING) String queryString) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.queryString = queryString;
  }

  public LogsTransactionStreamQuery calculatedFields(List<EventsCalculatedField> calculatedFields) {
    this.calculatedFields = calculatedFields;
    if (calculatedFields != null) {
      for (EventsCalculatedField item : calculatedFields) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public LogsTransactionStreamQuery addCalculatedFieldsItem(
      EventsCalculatedField calculatedFieldsItem) {
    if (this.calculatedFields == null) {
      this.calculatedFields = new ArrayList<>();
    }
    this.calculatedFields.add(calculatedFieldsItem);
    this.unparsed |= calculatedFieldsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return calculatedFields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CALCULATED_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EventsCalculatedField> getCalculatedFields() {
    return calculatedFields;
  }

  public void setCalculatedFields(List<EventsCalculatedField> calculatedFields) {
    this.calculatedFields = calculatedFields;
    if (calculatedFields != null) {
      for (EventsCalculatedField item : calculatedFields) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LogsTransactionStreamQuery compute(List<LogsTransactionCompute> compute) {
    this.compute = compute;
    if (compute != null) {
      for (LogsTransactionCompute item : compute) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public LogsTransactionStreamQuery addComputeItem(LogsTransactionCompute computeItem) {
    if (this.compute == null) {
      this.compute = new ArrayList<>();
    }
    this.compute.add(computeItem);
    this.unparsed |= computeItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return compute
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LogsTransactionCompute> getCompute() {
    return compute;
  }

  public void setCompute(List<LogsTransactionCompute> compute) {
    this.compute = compute;
    if (compute != null) {
      for (LogsTransactionCompute item : compute) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LogsTransactionStreamQuery crossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
    return this;
  }

  public LogsTransactionStreamQuery addCrossOrgUuidsItem(String crossOrgUuidsItem) {
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

  public LogsTransactionStreamQuery dataSource(LogsTransactionStreamQueryDataSource dataSource) {
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
  public LogsTransactionStreamQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(LogsTransactionStreamQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public LogsTransactionStreamQuery endQueryString(String endQueryString) {
    this.endQueryString = endQueryString;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return endQueryString
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_QUERY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEndQueryString() {
    return endQueryString;
  }

  public void setEndQueryString(String endQueryString) {
    this.endQueryString = endQueryString;
  }

  public LogsTransactionStreamQuery groupBy(List<Object> groupBy) {
    this.groupBy = groupBy;
    return this;
  }

  public LogsTransactionStreamQuery addGroupByItem(Object groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
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
  public List<Object> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<Object> groupBy) {
    this.groupBy = groupBy;
  }

  public LogsTransactionStreamQuery indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }

  public LogsTransactionStreamQuery addIndexesItem(String indexesItem) {
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

  public LogsTransactionStreamQuery queryString(String queryString) {
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

  public LogsTransactionStreamQuery sort(LogsTransactionStreamQuery20270101Sort sort) {
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
  public LogsTransactionStreamQuery20270101Sort getSort() {
    return sort;
  }

  public void setSort(LogsTransactionStreamQuery20270101Sort sort) {
    this.sort = sort;
    if (sort != null) {
      this.unparsed |= sort.unparsed;
    }
  }

  public LogsTransactionStreamQuery startQueryString(String startQueryString) {
    this.startQueryString = startQueryString;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return startQueryString
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_QUERY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStartQueryString() {
    return startQueryString;
  }

  public void setStartQueryString(String startQueryString) {
    this.startQueryString = startQueryString;
  }

  public LogsTransactionStreamQuery storage(StorageType storage) {
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

  public LogsTransactionStreamQuery version(LogsTransactionStreamQueryVersion version) {
    this.version = version;
    this.unparsed |= !version.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsTransactionStreamQueryVersion getVersion() {
    return version;
  }

  public void setVersion(LogsTransactionStreamQueryVersion version) {
    if (!version.isValid()) {
      this.unparsed = true;
    }
    this.version = version;
  }

  /** Return true if this LogsTransactionStreamQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsTransactionStreamQuery logsTransactionStreamQuery = (LogsTransactionStreamQuery) o;
    return Objects.equals(this.calculatedFields, logsTransactionStreamQuery.calculatedFields)
        && Objects.equals(this.compute, logsTransactionStreamQuery.compute)
        && Objects.equals(this.crossOrgUuids, logsTransactionStreamQuery.crossOrgUuids)
        && Objects.equals(this.dataSource, logsTransactionStreamQuery.dataSource)
        && Objects.equals(this.endQueryString, logsTransactionStreamQuery.endQueryString)
        && Objects.equals(this.groupBy, logsTransactionStreamQuery.groupBy)
        && Objects.equals(this.indexes, logsTransactionStreamQuery.indexes)
        && Objects.equals(this.queryString, logsTransactionStreamQuery.queryString)
        && Objects.equals(this.sort, logsTransactionStreamQuery.sort)
        && Objects.equals(this.startQueryString, logsTransactionStreamQuery.startQueryString)
        && Objects.equals(this.storage, logsTransactionStreamQuery.storage)
        && Objects.equals(this.version, logsTransactionStreamQuery.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        calculatedFields,
        compute,
        crossOrgUuids,
        dataSource,
        endQueryString,
        groupBy,
        indexes,
        queryString,
        sort,
        startQueryString,
        storage,
        version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsTransactionStreamQuery {\n");
    sb.append("    calculatedFields: ").append(toIndentedString(calculatedFields)).append("\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    crossOrgUuids: ").append(toIndentedString(crossOrgUuids)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    endQueryString: ").append(toIndentedString(endQueryString)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    startQueryString: ").append(toIndentedString(startQueryString)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
