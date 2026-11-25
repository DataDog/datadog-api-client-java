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
  LogsStreamQuery.JSON_PROPERTY_CALCULATED_FIELDS,
  LogsStreamQuery.JSON_PROPERTY_CONTEXT,
  LogsStreamQuery.JSON_PROPERTY_CROSS_ORG_UUIDS,
  LogsStreamQuery.JSON_PROPERTY_DATA_SOURCE,
  LogsStreamQuery.JSON_PROPERTY_EXTRACTIONS,
  LogsStreamQuery.JSON_PROPERTY_INDEXES,
  LogsStreamQuery.JSON_PROPERTY_QUERY_STRING,
  LogsStreamQuery.JSON_PROPERTY_SORT,
  LogsStreamQuery.JSON_PROPERTY_STORAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsStreamQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CALCULATED_FIELDS = "calculated_fields";
  private List<EventsCalculatedField> calculatedFields = null;

  public static final String JSON_PROPERTY_CONTEXT = "context";
  private EventsContext context;

  public static final String JSON_PROPERTY_CROSS_ORG_UUIDS = "cross_org_uuids";
  private List<String> crossOrgUuids = null;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private LogsStreamQueryDataSource dataSource;

  public static final String JSON_PROPERTY_EXTRACTIONS = "extractions";
  private List<EventsDataExtraction> extractions = null;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = null;

  public static final String JSON_PROPERTY_QUERY_STRING = "query_string";
  private String queryString;

  public static final String JSON_PROPERTY_SORT = "sort";
  private LogsStreamQuery20270101Sort sort;

  public static final String JSON_PROPERTY_STORAGE = "storage";
  private StorageType storage;

  public LogsStreamQuery() {}

  @JsonCreator
  public LogsStreamQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          LogsStreamQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY_STRING) String queryString) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.queryString = queryString;
  }

  public LogsStreamQuery calculatedFields(List<EventsCalculatedField> calculatedFields) {
    this.calculatedFields = calculatedFields;
    if (calculatedFields != null) {
      for (EventsCalculatedField item : calculatedFields) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public LogsStreamQuery addCalculatedFieldsItem(EventsCalculatedField calculatedFieldsItem) {
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

  public LogsStreamQuery context(EventsContext context) {
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

  public LogsStreamQuery crossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
    return this;
  }

  public LogsStreamQuery addCrossOrgUuidsItem(String crossOrgUuidsItem) {
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

  public LogsStreamQuery dataSource(LogsStreamQueryDataSource dataSource) {
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
  public LogsStreamQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(LogsStreamQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public LogsStreamQuery extractions(List<EventsDataExtraction> extractions) {
    this.extractions = extractions;
    if (extractions != null) {
      for (EventsDataExtraction item : extractions) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public LogsStreamQuery addExtractionsItem(EventsDataExtraction extractionsItem) {
    if (this.extractions == null) {
      this.extractions = new ArrayList<>();
    }
    this.extractions.add(extractionsItem);
    this.unparsed |= extractionsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return extractions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTRACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EventsDataExtraction> getExtractions() {
    return extractions;
  }

  public void setExtractions(List<EventsDataExtraction> extractions) {
    this.extractions = extractions;
    if (extractions != null) {
      for (EventsDataExtraction item : extractions) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LogsStreamQuery indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }

  public LogsStreamQuery addIndexesItem(String indexesItem) {
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

  public LogsStreamQuery queryString(String queryString) {
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

  public LogsStreamQuery sort(LogsStreamQuery20270101Sort sort) {
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
  public LogsStreamQuery20270101Sort getSort() {
    return sort;
  }

  public void setSort(LogsStreamQuery20270101Sort sort) {
    this.sort = sort;
    if (sort != null) {
      this.unparsed |= sort.unparsed;
    }
  }

  public LogsStreamQuery storage(StorageType storage) {
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

  /** Return true if this LogsStreamQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsStreamQuery logsStreamQuery = (LogsStreamQuery) o;
    return Objects.equals(this.calculatedFields, logsStreamQuery.calculatedFields)
        && Objects.equals(this.context, logsStreamQuery.context)
        && Objects.equals(this.crossOrgUuids, logsStreamQuery.crossOrgUuids)
        && Objects.equals(this.dataSource, logsStreamQuery.dataSource)
        && Objects.equals(this.extractions, logsStreamQuery.extractions)
        && Objects.equals(this.indexes, logsStreamQuery.indexes)
        && Objects.equals(this.queryString, logsStreamQuery.queryString)
        && Objects.equals(this.sort, logsStreamQuery.sort)
        && Objects.equals(this.storage, logsStreamQuery.storage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        calculatedFields,
        context,
        crossOrgUuids,
        dataSource,
        extractions,
        indexes,
        queryString,
        sort,
        storage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsStreamQuery {\n");
    sb.append("    calculatedFields: ").append(toIndentedString(calculatedFields)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    crossOrgUuids: ").append(toIndentedString(crossOrgUuids)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    extractions: ").append(toIndentedString(extractions)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
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
