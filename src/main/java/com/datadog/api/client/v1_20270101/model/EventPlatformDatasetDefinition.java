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
  EventPlatformDatasetDefinition.JSON_PROPERTY_COLUMNS,
  EventPlatformDatasetDefinition.JSON_PROPERTY_DATA_SOURCE,
  EventPlatformDatasetDefinition.JSON_PROPERTY_INDEXES,
  EventPlatformDatasetDefinition.JSON_PROPERTY_NAME,
  EventPlatformDatasetDefinition.JSON_PROPERTY_SEARCH,
  EventPlatformDatasetDefinition.JSON_PROPERTY_STORAGE,
  EventPlatformDatasetDefinition.JSON_PROPERTY_TIME_WINDOW
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventPlatformDatasetDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<DatasetColumn> columns = new ArrayList<>();

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private AdvancedEventPlatformSource dataSource;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private EventPlatformDatasetDefinitionSearch search;

  public static final String JSON_PROPERTY_STORAGE = "storage";
  private StorageType storage;

  public static final String JSON_PROPERTY_TIME_WINDOW = "time_window";
  private TimeWindow timeWindow;

  public EventPlatformDatasetDefinition() {}

  @JsonCreator
  public EventPlatformDatasetDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMNS) List<DatasetColumn> columns,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          AdvancedEventPlatformSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.columns = columns;
    for (DatasetColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.name = name;
  }

  public EventPlatformDatasetDefinition columns(List<DatasetColumn> columns) {
    this.columns = columns;
    for (DatasetColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public EventPlatformDatasetDefinition addColumnsItem(DatasetColumn columnsItem) {
    this.columns.add(columnsItem);
    this.unparsed |= columnsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return columns
   */
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<DatasetColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<DatasetColumn> columns) {
    this.columns = columns;
    if (columns != null) {
      for (DatasetColumn item : columns) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public EventPlatformDatasetDefinition dataSource(AdvancedEventPlatformSource dataSource) {
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
  public AdvancedEventPlatformSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(AdvancedEventPlatformSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public EventPlatformDatasetDefinition indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }

  public EventPlatformDatasetDefinition addIndexesItem(String indexesItem) {
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

  public EventPlatformDatasetDefinition name(String name) {
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

  public EventPlatformDatasetDefinition search(EventPlatformDatasetDefinitionSearch search) {
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
  public EventPlatformDatasetDefinitionSearch getSearch() {
    return search;
  }

  public void setSearch(EventPlatformDatasetDefinitionSearch search) {
    this.search = search;
    if (search != null) {
      this.unparsed |= search.unparsed;
    }
  }

  public EventPlatformDatasetDefinition storage(StorageType storage) {
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

  public EventPlatformDatasetDefinition timeWindow(TimeWindow timeWindow) {
    this.timeWindow = timeWindow;
    this.unparsed |= timeWindow.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return timeWindow
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TimeWindow getTimeWindow() {
    return timeWindow;
  }

  public void setTimeWindow(TimeWindow timeWindow) {
    this.timeWindow = timeWindow;
    if (timeWindow != null) {
      this.unparsed |= timeWindow.unparsed;
    }
  }

  /** Return true if this EventPlatformDatasetDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventPlatformDatasetDefinition eventPlatformDatasetDefinition =
        (EventPlatformDatasetDefinition) o;
    return Objects.equals(this.columns, eventPlatformDatasetDefinition.columns)
        && Objects.equals(this.dataSource, eventPlatformDatasetDefinition.dataSource)
        && Objects.equals(this.indexes, eventPlatformDatasetDefinition.indexes)
        && Objects.equals(this.name, eventPlatformDatasetDefinition.name)
        && Objects.equals(this.search, eventPlatformDatasetDefinition.search)
        && Objects.equals(this.storage, eventPlatformDatasetDefinition.storage)
        && Objects.equals(this.timeWindow, eventPlatformDatasetDefinition.timeWindow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, dataSource, indexes, name, search, storage, timeWindow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventPlatformDatasetDefinition {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    timeWindow: ").append(toIndentedString(timeWindow)).append("\n");
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
