/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>An individual scalar events query.</p>
 */
@JsonPropertyOrder({
  EventsScalarQuery.JSON_PROPERTY_COMPUTE,
  EventsScalarQuery.JSON_PROPERTY_DATA_SOURCE,
  EventsScalarQuery.JSON_PROPERTY_GROUP_BY,
  EventsScalarQuery.JSON_PROPERTY_INDEXES,
  EventsScalarQuery.JSON_PROPERTY_NAME,
  EventsScalarQuery.JSON_PROPERTY_SEARCH
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventsScalarQuery {
  @JsonIgnore
  public boolean unparsed = false;
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
            @JsonProperty(required=true, value=JSON_PROPERTY_COMPUTE)EventsCompute compute,
            @JsonProperty(required=true, value=JSON_PROPERTY_DATA_SOURCE)EventsDataSource dataSource) {
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
   * <p>The instructions for what to compute for this query.</p>
   * @return compute
  **/
      @JsonProperty(JSON_PROPERTY_COMPUTE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * <p>A data source that is powered by the Events Platform.</p>
   * @return dataSource
  **/
      @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * <p>The list of facets on which to split results.</p>
   * @return groupBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GROUP_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The indexes in which to search.</p>
   * @return indexes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INDEXES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The variable name for use in formulas.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Configuration of the search/filter for an events query.</p>
   * @return search
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SEARCH)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public EventsSearch getSearch() {
        return search;
      }
  public void setSearch(EventsSearch search) {
    this.search = search;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return EventsScalarQuery
   */
  @JsonAnySetter
  public EventsScalarQuery putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this EventsScalarQuery object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsScalarQuery eventsScalarQuery = (EventsScalarQuery) o;
    return Objects.equals(this.compute, eventsScalarQuery.compute) && Objects.equals(this.dataSource, eventsScalarQuery.dataSource) && Objects.equals(this.groupBy, eventsScalarQuery.groupBy) && Objects.equals(this.indexes, eventsScalarQuery.indexes) && Objects.equals(this.name, eventsScalarQuery.name) && Objects.equals(this.search, eventsScalarQuery.search) && Objects.equals(this.additionalProperties, eventsScalarQuery.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(compute,dataSource,groupBy,indexes,name,search, additionalProperties);
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
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
