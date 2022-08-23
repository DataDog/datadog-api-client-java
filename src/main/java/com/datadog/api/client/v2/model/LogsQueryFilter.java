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
   * <p>The search and filter query settings</p>
 */
@JsonPropertyOrder({
  LogsQueryFilter.JSON_PROPERTY_FROM,
  LogsQueryFilter.JSON_PROPERTY_INDEXES,
  LogsQueryFilter.JSON_PROPERTY_QUERY,
  LogsQueryFilter.JSON_PROPERTY_TO
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsQueryFilter {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FROM = "from";
  private String from = "now-15m";

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = null;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query = "*";

  public static final String JSON_PROPERTY_TO = "to";
  private String to = "now";

  public LogsQueryFilter from(String from) {
    this.from = from;
    return this;
  }

  /**
   * <p>The minimum time for the requested logs, supports date math and regular timestamps (milliseconds).</p>
   * @return from
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FROM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>For customers with multiple indexes, the indexes to search. Defaults to ['*'] which means all indexes.</p>
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
  public LogsQueryFilter query(String query) {
    this.query = query;
    return this;
  }

  /**
   * <p>The search query - following the log search syntax.</p>
   * @return query
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getQuery() {
        return query;
      }
  public void setQuery(String query) {
    this.query = query;
  }
  public LogsQueryFilter to(String to) {
    this.to = to;
    return this;
  }

  /**
   * <p>The maximum time for the requested logs, supports date math and regular timestamps (milliseconds).</p>
   * @return to
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TO)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTo() {
        return to;
      }
  public void setTo(String to) {
    this.to = to;
  }

  /**
   * Return true if this LogsQueryFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsQueryFilter logsQueryFilter = (LogsQueryFilter) o;
    return Objects.equals(this.from, logsQueryFilter.from) && Objects.equals(this.indexes, logsQueryFilter.indexes) && Objects.equals(this.query, logsQueryFilter.query) && Objects.equals(this.to, logsQueryFilter.to);
  }


  @Override
  public int hashCode() {
    return Objects.hash(from,indexes,query,to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsQueryFilter {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("}");
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
