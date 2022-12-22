/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** An individual scalar events query. */
@JsonPropertyOrder({
  EventsScalarQuery.JSON_PROPERTY_COMPUTE,
  EventsScalarQuery.JSON_PROPERTY_DATA_SOURCE,
  EventsScalarQuery.JSON_PROPERTY_GROUP_BY,
  EventsScalarQuery.JSON_PROPERTY_INDEXES,
  EventsScalarQuery.JSON_PROPERTY_NAME,
  EventsScalarQuery.JSON_PROPERTY_SEARCH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventsScalarQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private EventsCompute compute;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private EventsDataSource dataSource = EventsDataSource.LOGS;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<EventsGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private EventsSearch search;

  public EventsScalarQuery() {}

  @JsonCreator
  public EventsScalarQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPUTE) EventsCompute compute,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          EventsDataSource dataSource) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
  }

  public EventsScalarQuery compute(EventsCompute compute) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    return this;
  }

  /**
   * The instructions for what to compute for this query.
   *
   * @return compute
   */
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EventsCompute getCompute() {
    return compute;
  }

  public void setCompute(EventsCompute compute) {
    this.compute = compute;
  }

  public EventsScalarQuery dataSource(EventsDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * A data source that is powered by the Events Platform.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EventsDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(EventsDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public EventsScalarQuery groupBy(List<EventsGroupBy> groupBy) {
    this.groupBy = groupBy;
    for (EventsGroupBy item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public EventsScalarQuery addGroupByItem(EventsGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * The list of facets on which to split results.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EventsGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<EventsGroupBy> groupBy) {
    this.groupBy = groupBy;
  }

  public EventsScalarQuery indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }

  public EventsScalarQuery addIndexesItem(String indexesItem) {
    if (this.indexes == null) {
      this.indexes = new ArrayList<>();
    }
    this.indexes.add(indexesItem);
    return this;
  }

  /**
   * The indexes in which to search.
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

  public EventsScalarQuery name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The variable name for use in formulas.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EventsScalarQuery search(EventsSearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * Configuration of the search/filter for an events query.
   *
   * @return search
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EventsSearch getSearch() {
    return search;
  }

  public void setSearch(EventsSearch search) {
    this.search = search;
  }

  /** Return true if this EventsScalarQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsScalarQuery eventsScalarQuery = (EventsScalarQuery) o;
    return Objects.equals(this.compute, eventsScalarQuery.compute)
        && Objects.equals(this.dataSource, eventsScalarQuery.dataSource)
        && Objects.equals(this.groupBy, eventsScalarQuery.groupBy)
        && Objects.equals(this.indexes, eventsScalarQuery.indexes)
        && Objects.equals(this.name, eventsScalarQuery.name)
        && Objects.equals(this.search, eventsScalarQuery.search);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compute, dataSource, groupBy, indexes, name, search);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsScalarQuery {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
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
