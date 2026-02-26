/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Object to send with the request to retrieve a list of logs from your Organization.</p>
 */
@JsonPropertyOrder({
  LogsListRequest.JSON_PROPERTY_INDEX,
  LogsListRequest.JSON_PROPERTY_LIMIT,
  LogsListRequest.JSON_PROPERTY_QUERY,
  LogsListRequest.JSON_PROPERTY_SORT,
  LogsListRequest.JSON_PROPERTY_START_AT,
  LogsListRequest.JSON_PROPERTY_TIME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsListRequest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_INDEX = "index";
  private String index;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_SORT = "sort";
  private LogsSort sort;

  public static final String JSON_PROPERTY_START_AT = "startAt";
  private String startAt;

  public static final String JSON_PROPERTY_TIME = "time";
  private LogsListRequestTime time;

  public LogsListRequest() {}

  @JsonCreator
  public LogsListRequest(
            @JsonProperty(required=true, value=JSON_PROPERTY_TIME)LogsListRequestTime time) {
        this.time = time;
        this.unparsed |= time.unparsed;
  }
  public LogsListRequest index(String index) {
    this.index = index;
    return this;
  }

  /**
   * <p>The log index on which the request is performed. For multi-index organizations,
   * the default is all live indexes. Historical indexes of rehydrated logs must be specified.</p>
   * @return index
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INDEX)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getIndex() {
        return index;
      }
  public void setIndex(String index) {
    this.index = index;
  }
  public LogsListRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <p>Number of logs return in the response.</p>
   * maximum: 1000
   * @return limit
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LIMIT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getLimit() {
        return limit;
      }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }
  public LogsListRequest query(String query) {
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
  public LogsListRequest sort(LogsSort sort) {
    this.sort = sort;
    this.unparsed |= !sort.isValid();
    return this;
  }

  /**
   * <p>Time-ascending <code>asc</code> or time-descending <code>desc</code> results.</p>
   * @return sort
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SORT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public LogsSort getSort() {
        return sort;
      }
  public void setSort(LogsSort sort) {
    if (!sort.isValid()) {
        this.unparsed = true;
    }
    this.sort = sort;
  }
  public LogsListRequest startAt(String startAt) {
    this.startAt = startAt;
    return this;
  }

  /**
   * <p>Hash identifier of the first log to return in the list, available in a log <code>id</code> attribute.
   * This parameter is used for the pagination feature.</p>
   * <p><strong>Note</strong>: This parameter is ignored if the corresponding log
   * is out of the scope of the specified time window.</p>
   * @return startAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_START_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getStartAt() {
        return startAt;
      }
  public void setStartAt(String startAt) {
    this.startAt = startAt;
  }
  public LogsListRequest time(LogsListRequestTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * <p>Timeframe to retrieve the log from.</p>
   * @return time
  **/
      @JsonProperty(JSON_PROPERTY_TIME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public LogsListRequestTime getTime() {
        return time;
      }
  public void setTime(LogsListRequestTime time) {
    this.time = time;
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
   * @return LogsListRequest
   */
  @JsonAnySetter
  public LogsListRequest putAdditionalProperty(String key, Object value) {
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
   * Return true if this LogsListRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsListRequest logsListRequest = (LogsListRequest) o;
    return Objects.equals(this.index, logsListRequest.index) && Objects.equals(this.limit, logsListRequest.limit) && Objects.equals(this.query, logsListRequest.query) && Objects.equals(this.sort, logsListRequest.sort) && Objects.equals(this.startAt, logsListRequest.startAt) && Objects.equals(this.time, logsListRequest.time) && Objects.equals(this.additionalProperties, logsListRequest.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(index,limit,query,sort,startAt,time, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsListRequest {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
