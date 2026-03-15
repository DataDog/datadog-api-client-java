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

/**
 * An events-platform query fragment used as source data for a guided table. Covers logs, RUM,
 * spans, CI pipelines, events, and product analytics.
 */
@JsonPropertyOrder({
  GuidedTableEventsQuery.JSON_PROPERTY_ALIAS,
  GuidedTableEventsQuery.JSON_PROPERTY_DATA_SOURCE,
  GuidedTableEventsQuery.JSON_PROPERTY_INDEXES,
  GuidedTableEventsQuery.JSON_PROPERTY_NAME,
  GuidedTableEventsQuery.JSON_PROPERTY_SEARCH,
  GuidedTableEventsQuery.JSON_PROPERTY_STORAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GuidedTableEventsQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private GuidedTableEventsQueryDataSource dataSource;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private GuidedTableEventsQuerySearch search;

  public static final String JSON_PROPERTY_STORAGE = "storage";
  private GuidedTableStorageType storage;

  public GuidedTableEventsQuery() {}

  @JsonCreator
  public GuidedTableEventsQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          GuidedTableEventsQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.name = name;
  }

  public GuidedTableEventsQuery alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Display alias for the query.
   *
   * @return alias
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public GuidedTableEventsQuery dataSource(GuidedTableEventsQueryDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Events data source.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GuidedTableEventsQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(GuidedTableEventsQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public GuidedTableEventsQuery indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }

  public GuidedTableEventsQuery addIndexesItem(String indexesItem) {
    if (this.indexes == null) {
      this.indexes = new ArrayList<>();
    }
    this.indexes.add(indexesItem);
    return this;
  }

  /**
   * Indexes to search for events.
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

  public GuidedTableEventsQuery name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Variable name used to reference this query in columns and formulas.
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

  public GuidedTableEventsQuery search(GuidedTableEventsQuerySearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * Search filter for matching events.
   *
   * @return search
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GuidedTableEventsQuerySearch getSearch() {
    return search;
  }

  public void setSearch(GuidedTableEventsQuerySearch search) {
    this.search = search;
  }

  public GuidedTableEventsQuery storage(GuidedTableStorageType storage) {
    this.storage = storage;
    this.unparsed |= !storage.isValid();
    return this;
  }

  /**
   * Storage tier to target for an events-platform query in a guided table.
   *
   * @return storage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STORAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GuidedTableStorageType getStorage() {
    return storage;
  }

  public void setStorage(GuidedTableStorageType storage) {
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
   * @return GuidedTableEventsQuery
   */
  @JsonAnySetter
  public GuidedTableEventsQuery putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GuidedTableEventsQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuidedTableEventsQuery guidedTableEventsQuery = (GuidedTableEventsQuery) o;
    return Objects.equals(this.alias, guidedTableEventsQuery.alias)
        && Objects.equals(this.dataSource, guidedTableEventsQuery.dataSource)
        && Objects.equals(this.indexes, guidedTableEventsQuery.indexes)
        && Objects.equals(this.name, guidedTableEventsQuery.name)
        && Objects.equals(this.search, guidedTableEventsQuery.search)
        && Objects.equals(this.storage, guidedTableEventsQuery.storage)
        && Objects.equals(this.additionalProperties, guidedTableEventsQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, dataSource, indexes, name, search, storage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuidedTableEventsQuery {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
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
