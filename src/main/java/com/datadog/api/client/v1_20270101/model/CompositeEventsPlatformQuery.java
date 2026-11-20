/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  CompositeEventsPlatformQuery.JSON_PROPERTY_COLUMNS,
  CompositeEventsPlatformQuery.JSON_PROPERTY_COMPUTE,
  CompositeEventsPlatformQuery.JSON_PROPERTY_COMPUTE_COUNT,
  CompositeEventsPlatformQuery.JSON_PROPERTY_DATA_SOURCE,
  CompositeEventsPlatformQuery.JSON_PROPERTY_GROUP_BY,
  CompositeEventsPlatformQuery.JSON_PROPERTY_INDEXES,
  CompositeEventsPlatformQuery.JSON_PROPERTY_NAME,
  CompositeEventsPlatformQuery.JSON_PROPERTY_SEARCH,
  CompositeEventsPlatformQuery.JSON_PROPERTY_STORAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CompositeEventsPlatformQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<ListColumn> columns = null;

  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private List<AggregateCompute> compute = null;

  public static final String JSON_PROPERTY_COMPUTE_COUNT = "compute_count";
  private Boolean computeCount;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FormulaAndFunctionEventsDataSource dataSource;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<FormulaAndFunctionEventQueryGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private CompositeEventsPlatformQuerySearch search;

  public static final String JSON_PROPERTY_STORAGE = "storage";
  private StorageType storage;

  public CompositeEventsPlatformQuery() {}

  @JsonCreator
  public CompositeEventsPlatformQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          FormulaAndFunctionEventsDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.name = name;
  }

  public CompositeEventsPlatformQuery columns(List<ListColumn> columns) {
    this.columns = columns;
    if (columns != null) {
      for (ListColumn item : columns) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public CompositeEventsPlatformQuery addColumnsItem(ListColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    this.unparsed |= columnsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return columns
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ListColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<ListColumn> columns) {
    this.columns = columns;
    if (columns != null) {
      for (ListColumn item : columns) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public CompositeEventsPlatformQuery compute(List<AggregateCompute> compute) {
    this.compute = compute;
    if (compute != null) {
      for (AggregateCompute item : compute) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public CompositeEventsPlatformQuery addComputeItem(AggregateCompute computeItem) {
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
  public List<AggregateCompute> getCompute() {
    return compute;
  }

  public void setCompute(List<AggregateCompute> compute) {
    this.compute = compute;
    if (compute != null) {
      for (AggregateCompute item : compute) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public CompositeEventsPlatformQuery computeCount(Boolean computeCount) {
    this.computeCount = computeCount;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return computeCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPUTE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getComputeCount() {
    return computeCount;
  }

  public void setComputeCount(Boolean computeCount) {
    this.computeCount = computeCount;
  }

  public CompositeEventsPlatformQuery dataSource(FormulaAndFunctionEventsDataSource dataSource) {
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
  public FormulaAndFunctionEventsDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(FormulaAndFunctionEventsDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public CompositeEventsPlatformQuery groupBy(List<FormulaAndFunctionEventQueryGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (FormulaAndFunctionEventQueryGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public CompositeEventsPlatformQuery addGroupByItem(
      FormulaAndFunctionEventQueryGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
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
  public List<FormulaAndFunctionEventQueryGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<FormulaAndFunctionEventQueryGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (FormulaAndFunctionEventQueryGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public CompositeEventsPlatformQuery indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }

  public CompositeEventsPlatformQuery addIndexesItem(String indexesItem) {
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

  public CompositeEventsPlatformQuery name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CompositeEventsPlatformQuery search(CompositeEventsPlatformQuerySearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return search
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CompositeEventsPlatformQuerySearch getSearch() {
    return search;
  }

  public void setSearch(CompositeEventsPlatformQuerySearch search) {
    this.search = search;
    if (search != null) {
      this.unparsed |= search.unparsed;
    }
  }

  public CompositeEventsPlatformQuery storage(StorageType storage) {
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
   * @return CompositeEventsPlatformQuery
   */
  @JsonAnySetter
  public CompositeEventsPlatformQuery putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CompositeEventsPlatformQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompositeEventsPlatformQuery compositeEventsPlatformQuery = (CompositeEventsPlatformQuery) o;
    return Objects.equals(this.columns, compositeEventsPlatformQuery.columns)
        && Objects.equals(this.compute, compositeEventsPlatformQuery.compute)
        && Objects.equals(this.computeCount, compositeEventsPlatformQuery.computeCount)
        && Objects.equals(this.dataSource, compositeEventsPlatformQuery.dataSource)
        && Objects.equals(this.groupBy, compositeEventsPlatformQuery.groupBy)
        && Objects.equals(this.indexes, compositeEventsPlatformQuery.indexes)
        && Objects.equals(this.name, compositeEventsPlatformQuery.name)
        && Objects.equals(this.search, compositeEventsPlatformQuery.search)
        && Objects.equals(this.storage, compositeEventsPlatformQuery.storage)
        && Objects.equals(
            this.additionalProperties, compositeEventsPlatformQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        columns,
        compute,
        computeCount,
        dataSource,
        groupBy,
        indexes,
        name,
        search,
        storage,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompositeEventsPlatformQuery {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    computeCount: ").append(toIndentedString(computeCount)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
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
