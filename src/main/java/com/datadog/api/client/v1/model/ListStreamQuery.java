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

/** Updated list stream widget. */
@JsonPropertyOrder({
  ListStreamQuery.JSON_PROPERTY_COMPUTE,
  ListStreamQuery.JSON_PROPERTY_DATA_SOURCE,
  ListStreamQuery.JSON_PROPERTY_EVENT_SIZE,
  ListStreamQuery.JSON_PROPERTY_GROUP_BY,
  ListStreamQuery.JSON_PROPERTY_INDEXES,
  ListStreamQuery.JSON_PROPERTY_QUERY_STRING,
  ListStreamQuery.JSON_PROPERTY_STORAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ListStreamQuery {
  @JsonIgnore public boolean unparsed = false;
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
   * logs_pattern_stream (up to 3 items) or logs_transaction_stream (one group by item is required)
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
    return Objects.equals(this.compute, listStreamQuery.compute)
        && Objects.equals(this.dataSource, listStreamQuery.dataSource)
        && Objects.equals(this.eventSize, listStreamQuery.eventSize)
        && Objects.equals(this.groupBy, listStreamQuery.groupBy)
        && Objects.equals(this.indexes, listStreamQuery.indexes)
        && Objects.equals(this.queryString, listStreamQuery.queryString)
        && Objects.equals(this.storage, listStreamQuery.storage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compute, dataSource, eventSize, groupBy, indexes, queryString, storage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListStreamQuery {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    eventSize: ").append(toIndentedString(eventSize)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("}");
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
