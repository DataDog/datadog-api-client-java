/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The search and filter query settings */
@JsonPropertyOrder({
  LogsQueryFilter.JSON_PROPERTY_FROM,
  LogsQueryFilter.JSON_PROPERTY_INDEXES,
  LogsQueryFilter.JSON_PROPERTY_QUERY,
  LogsQueryFilter.JSON_PROPERTY_STORAGE_TIER,
  LogsQueryFilter.JSON_PROPERTY_TO
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsQueryFilter {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FROM = "from";
  private String from = "now-15m";

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = null;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query = "*";

  public static final String JSON_PROPERTY_STORAGE_TIER = "storage_tier";
  private LogsStorageTier storageTier = LogsStorageTier.INDEXES;

  public static final String JSON_PROPERTY_TO = "to";
  private String to = "now";

  public LogsQueryFilter from(String from) {
    this.from = from;
    return this;
  }

  /**
   * The minimum time for the requested logs, supports date math and regular timestamps
   * (milliseconds).
   *
   * @return from
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public LogsQueryFilter indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }

  public LogsQueryFilter addIndexesItem(String indexesItem) {
    if (this.indexes == null) {
      this.indexes = new ArrayList<>();
    }
    this.indexes.add(indexesItem);
    return this;
  }

  /**
   * For customers with multiple indexes, the indexes to search. Defaults to ['*'] which means all
   * indexes.
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

  public LogsQueryFilter query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The search query - following the log search syntax.
   *
   * @return query
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public LogsQueryFilter storageTier(LogsStorageTier storageTier) {
    this.storageTier = storageTier;
    this.unparsed |= !storageTier.isValid();
    return this;
  }

  /**
   * Specifies storage type as indexes, online-archives or flex
   *
   * @return storageTier
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STORAGE_TIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsStorageTier getStorageTier() {
    return storageTier;
  }

  public void setStorageTier(LogsStorageTier storageTier) {
    if (!storageTier.isValid()) {
      this.unparsed = true;
    }
    this.storageTier = storageTier;
  }

  public LogsQueryFilter to(String to) {
    this.to = to;
    return this;
  }

  /**
   * The maximum time for the requested logs, supports date math and regular timestamps
   * (milliseconds).
   *
   * @return to
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
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
   * @return LogsQueryFilter
   */
  @JsonAnySetter
  public LogsQueryFilter putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LogsQueryFilter object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsQueryFilter logsQueryFilter = (LogsQueryFilter) o;
    return Objects.equals(this.from, logsQueryFilter.from)
        && Objects.equals(this.indexes, logsQueryFilter.indexes)
        && Objects.equals(this.query, logsQueryFilter.query)
        && Objects.equals(this.storageTier, logsQueryFilter.storageTier)
        && Objects.equals(this.to, logsQueryFilter.to)
        && Objects.equals(this.additionalProperties, logsQueryFilter.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, indexes, query, storageTier, to, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsQueryFilter {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    storageTier: ").append(toIndentedString(storageTier)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
