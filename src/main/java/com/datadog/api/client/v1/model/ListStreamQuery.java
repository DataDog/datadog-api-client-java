/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Updated list stream widget. */
@JsonPropertyOrder({
  ListStreamQuery.JSON_PROPERTY_CLUSTERING_PATTERN_FIELD_PATH,
  ListStreamQuery.JSON_PROPERTY_COMPUTE,
  ListStreamQuery.JSON_PROPERTY_DATA_SOURCE,
  ListStreamQuery.JSON_PROPERTY_EVENT_SIZE,
  ListStreamQuery.JSON_PROPERTY_GROUP_BY,
  ListStreamQuery.JSON_PROPERTY_INDEXES,
  ListStreamQuery.JSON_PROPERTY_QUERY_STRING,
  ListStreamQuery.JSON_PROPERTY_SORT,
  ListStreamQuery.JSON_PROPERTY_STORAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ListStreamQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLUSTERING_PATTERN_FIELD_PATH =
      "clustering_pattern_field_path";
  private String clusteringPatternFieldPath;

  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private List<ListStreamComputeItems> compute = null;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private ListStreamSource dataSource = ListStreamSource.APM_ISSUE_STREAM;

  public static final String JSON_PROPERTY_EVENT_SIZE = "event_size";
  private WidgetEventSize eventSize;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<ListStreamGroupByItems> groupBy = null;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = null;

  public static final String JSON_PROPERTY_QUERY_STRING = "query_string";
  private String queryString;

  public static final String JSON_PROPERTY_SORT = "sort";
  private WidgetFieldSort sort;

  public static final String JSON_PROPERTY_STORAGE = "storage";
  private String storage;

  public ListStreamQuery() {}

  @JsonCreator
  public ListStreamQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE) ListStreamSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY_STRING) String queryString) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.queryString = queryString;
  }

  public ListStreamQuery clusteringPatternFieldPath(String clusteringPatternFieldPath) {
    this.clusteringPatternFieldPath = clusteringPatternFieldPath;
    return this;
  }

  /**
   * Specifies the field for logs pattern clustering. Usable only with logs_pattern_stream.
   *
   * @return clusteringPatternFieldPath
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLUSTERING_PATTERN_FIELD_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClusteringPatternFieldPath() {
    return clusteringPatternFieldPath;
  }

  public void setClusteringPatternFieldPath(String clusteringPatternFieldPath) {
    this.clusteringPatternFieldPath = clusteringPatternFieldPath;
  }

  public ListStreamQuery compute(List<ListStreamComputeItems> compute) {
    this.compute = compute;
    for (ListStreamComputeItems item : compute) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ListStreamQuery addComputeItem(ListStreamComputeItems computeItem) {
    if (this.compute == null) {
      this.compute = new ArrayList<>();
    }
    this.compute.add(computeItem);
    this.unparsed |= computeItem.unparsed;
    return this;
  }

  /**
   * Compute configuration for the List Stream Widget. Compute can be used only with the
   * logs_transaction_stream (from 1 to 5 items) list stream source.
   *
   * @return compute
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ListStreamComputeItems> getCompute() {
    return compute;
  }

  public void setCompute(List<ListStreamComputeItems> compute) {
    this.compute = compute;
  }

  public ListStreamQuery dataSource(ListStreamSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Source from which to query items to display in the stream.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ListStreamSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(ListStreamSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public ListStreamQuery eventSize(WidgetEventSize eventSize) {
    this.eventSize = eventSize;
    this.unparsed |= !eventSize.isValid();
    return this;
  }

  /**
   * Size to use to display an event.
   *
   * @return eventSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetEventSize getEventSize() {
    return eventSize;
  }

  public void setEventSize(WidgetEventSize eventSize) {
    if (!eventSize.isValid()) {
      this.unparsed = true;
    }
    this.eventSize = eventSize;
  }

  public ListStreamQuery groupBy(List<ListStreamGroupByItems> groupBy) {
    this.groupBy = groupBy;
    for (ListStreamGroupByItems item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ListStreamQuery addGroupByItem(ListStreamGroupByItems groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * Group by configuration for the List Stream Widget. Group by can be used only with
   * logs_pattern_stream (up to 4 items) or logs_transaction_stream (one group by item is required)
   * list stream source.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ListStreamGroupByItems> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<ListStreamGroupByItems> groupBy) {
    this.groupBy = groupBy;
  }

  public ListStreamQuery indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }

  public ListStreamQuery addIndexesItem(String indexesItem) {
    if (this.indexes == null) {
      this.indexes = new ArrayList<>();
    }
    this.indexes.add(indexesItem);
    return this;
  }

  /**
   * List of indexes.
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

  public ListStreamQuery queryString(String queryString) {
    this.queryString = queryString;
    return this;
  }

  /**
   * Widget query.
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

  public ListStreamQuery sort(WidgetFieldSort sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * Which column and order to sort by
   *
   * @return sort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetFieldSort getSort() {
    return sort;
  }

  public void setSort(WidgetFieldSort sort) {
    this.sort = sort;
  }

  public ListStreamQuery storage(String storage) {
    this.storage = storage;
    return this;
  }

  /**
   * Option for storage location. Feature in Private Beta.
   *
   * @return storage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STORAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStorage() {
    return storage;
  }

  public void setStorage(String storage) {
    this.storage = storage;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ListStreamQuery
   */
  @JsonAnySetter
  public ListStreamQuery putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this ListStreamQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListStreamQuery listStreamQuery = (ListStreamQuery) o;
    return Objects.equals(
            this.clusteringPatternFieldPath, listStreamQuery.clusteringPatternFieldPath)
        && Objects.equals(this.compute, listStreamQuery.compute)
        && Objects.equals(this.dataSource, listStreamQuery.dataSource)
        && Objects.equals(this.eventSize, listStreamQuery.eventSize)
        && Objects.equals(this.groupBy, listStreamQuery.groupBy)
        && Objects.equals(this.indexes, listStreamQuery.indexes)
        && Objects.equals(this.queryString, listStreamQuery.queryString)
        && Objects.equals(this.sort, listStreamQuery.sort)
        && Objects.equals(this.storage, listStreamQuery.storage)
        && Objects.equals(this.additionalProperties, listStreamQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        clusteringPatternFieldPath,
        compute,
        dataSource,
        eventSize,
        groupBy,
        indexes,
        queryString,
        sort,
        storage,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListStreamQuery {\n");
    sb.append("    clusteringPatternFieldPath: ")
        .append(toIndentedString(clusteringPatternFieldPath))
        .append("\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    eventSize: ").append(toIndentedString(eventSize)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
