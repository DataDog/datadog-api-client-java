/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/**
 * The definition of the dataset. The shape depends on the value of <code>data_source</code>. Use
 * <code>reference_table</code> or <code>managed_resource</code> for a referential dataset, or one
 * of the event platform sources (for example <code>logs</code>, <code>audit</code>, <code>events
 * </code>, <code>spans</code>, <code>rum</code>) for an event platform dataset.
 */
@JsonPropertyOrder({
  SecurityMonitoringDatasetDefinition.JSON_PROPERTY_COLUMNS,
  SecurityMonitoringDatasetDefinition.JSON_PROPERTY_DATA_SOURCE,
  SecurityMonitoringDatasetDefinition.JSON_PROPERTY_INDEXES,
  SecurityMonitoringDatasetDefinition.JSON_PROPERTY_NAME,
  SecurityMonitoringDatasetDefinition.JSON_PROPERTY_QUERY_FILTER,
  SecurityMonitoringDatasetDefinition.JSON_PROPERTY_SEARCH,
  SecurityMonitoringDatasetDefinition.JSON_PROPERTY_STORAGE,
  SecurityMonitoringDatasetDefinition.JSON_PROPERTY_TABLE_NAME,
  SecurityMonitoringDatasetDefinition.JSON_PROPERTY_TIME_WINDOW
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringDatasetDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<SecurityMonitoringDatasetColumn> columns = null;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private String dataSource;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY_FILTER = "query_filter";
  private String queryFilter;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private SecurityMonitoringDatasetSearch search;

  public static final String JSON_PROPERTY_STORAGE = "storage";
  private String storage;

  public static final String JSON_PROPERTY_TABLE_NAME = "table_name";
  private String tableName;

  public static final String JSON_PROPERTY_TIME_WINDOW = "time_window";
  private SecurityMonitoringDatasetTimeWindow timeWindow;

  public SecurityMonitoringDatasetDefinition() {}

  @JsonCreator
  public SecurityMonitoringDatasetDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE) String dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.dataSource = dataSource;
    this.name = name;
  }

  public SecurityMonitoringDatasetDefinition columns(
      List<SecurityMonitoringDatasetColumn> columns) {
    this.columns = columns;
    for (SecurityMonitoringDatasetColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringDatasetDefinition addColumnsItem(
      SecurityMonitoringDatasetColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    this.unparsed |= columnsItem.unparsed;
    return this;
  }

  /**
   * For event platform datasets, the list of columns exposed by the dataset.
   *
   * @return columns
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SecurityMonitoringDatasetColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<SecurityMonitoringDatasetColumn> columns) {
    this.columns = columns;
    if (columns != null) {
      for (SecurityMonitoringDatasetColumn item : columns) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SecurityMonitoringDatasetDefinition dataSource(String dataSource) {
    this.dataSource = dataSource;
    return this;
  }

  /**
   * The data source backing this dataset definition.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDataSource() {
    return dataSource;
  }

  public void setDataSource(String dataSource) {
    this.dataSource = dataSource;
  }

  public SecurityMonitoringDatasetDefinition indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }

  public SecurityMonitoringDatasetDefinition addIndexesItem(String indexesItem) {
    if (this.indexes == null) {
      this.indexes = new ArrayList<>();
    }
    this.indexes.add(indexesItem);
    return this;
  }

  /**
   * For event platform datasets, the list of indexes to query.
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

  public SecurityMonitoringDatasetDefinition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The unique name of the dataset. Must start with a lowercase letter and contain only lowercase
   * letters, digits, and underscores (max 255 characters).
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

  public SecurityMonitoringDatasetDefinition queryFilter(String queryFilter) {
    this.queryFilter = queryFilter;
    return this;
  }

  /**
   * For referential datasets, an optional filter expression applied to the table.
   *
   * @return queryFilter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQueryFilter() {
    return queryFilter;
  }

  public void setQueryFilter(String queryFilter) {
    this.queryFilter = queryFilter;
  }

  public SecurityMonitoringDatasetDefinition search(SecurityMonitoringDatasetSearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * The search clause applied to an event platform dataset.
   *
   * @return search
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringDatasetSearch getSearch() {
    return search;
  }

  public void setSearch(SecurityMonitoringDatasetSearch search) {
    this.search = search;
    if (search != null) {
      this.unparsed |= search.unparsed;
    }
  }

  public SecurityMonitoringDatasetDefinition storage(String storage) {
    this.storage = storage;
    return this;
  }

  /**
   * Storage tier the dataset reads from. Applies to event platform datasets.
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

  public SecurityMonitoringDatasetDefinition tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  /**
   * For referential datasets, the name of the underlying table.
   *
   * @return tableName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TABLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public SecurityMonitoringDatasetDefinition timeWindow(
      SecurityMonitoringDatasetTimeWindow timeWindow) {
    this.timeWindow = timeWindow;
    this.unparsed |= timeWindow.unparsed;
    return this;
  }

  /**
   * An optional time window that overrides the default query time range.
   *
   * @return timeWindow
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringDatasetTimeWindow getTimeWindow() {
    return timeWindow;
  }

  public void setTimeWindow(SecurityMonitoringDatasetTimeWindow timeWindow) {
    this.timeWindow = timeWindow;
    if (timeWindow != null) {
      this.unparsed |= timeWindow.unparsed;
    }
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
   * @return SecurityMonitoringDatasetDefinition
   */
  @JsonAnySetter
  public SecurityMonitoringDatasetDefinition putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityMonitoringDatasetDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringDatasetDefinition securityMonitoringDatasetDefinition =
        (SecurityMonitoringDatasetDefinition) o;
    return Objects.equals(this.columns, securityMonitoringDatasetDefinition.columns)
        && Objects.equals(this.dataSource, securityMonitoringDatasetDefinition.dataSource)
        && Objects.equals(this.indexes, securityMonitoringDatasetDefinition.indexes)
        && Objects.equals(this.name, securityMonitoringDatasetDefinition.name)
        && Objects.equals(this.queryFilter, securityMonitoringDatasetDefinition.queryFilter)
        && Objects.equals(this.search, securityMonitoringDatasetDefinition.search)
        && Objects.equals(this.storage, securityMonitoringDatasetDefinition.storage)
        && Objects.equals(this.tableName, securityMonitoringDatasetDefinition.tableName)
        && Objects.equals(this.timeWindow, securityMonitoringDatasetDefinition.timeWindow)
        && Objects.equals(
            this.additionalProperties, securityMonitoringDatasetDefinition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        columns,
        dataSource,
        indexes,
        name,
        queryFilter,
        search,
        storage,
        tableName,
        timeWindow,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringDatasetDefinition {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    queryFilter: ").append(toIndentedString(queryFilter)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    timeWindow: ").append(toIndentedString(timeWindow)).append("\n");
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
