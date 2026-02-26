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

/** */
@JsonPropertyOrder({
  QueryEventFilteredUsersRequestDataAttributes.JSON_PROPERTY_EVENT_QUERY,
  QueryEventFilteredUsersRequestDataAttributes.JSON_PROPERTY_INCLUDE_ROW_COUNT,
  QueryEventFilteredUsersRequestDataAttributes.JSON_PROPERTY_LIMIT,
  QueryEventFilteredUsersRequestDataAttributes.JSON_PROPERTY_QUERY,
  QueryEventFilteredUsersRequestDataAttributes.JSON_PROPERTY_SELECT_COLUMNS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class QueryEventFilteredUsersRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EVENT_QUERY = "event_query";
  private QueryEventFilteredUsersRequestDataAttributesEventQuery eventQuery;

  public static final String JSON_PROPERTY_INCLUDE_ROW_COUNT = "include_row_count";
  private Boolean includeRowCount;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_SELECT_COLUMNS = "select_columns";
  private List<String> selectColumns = null;

  public QueryEventFilteredUsersRequestDataAttributes eventQuery(
      QueryEventFilteredUsersRequestDataAttributesEventQuery eventQuery) {
    this.eventQuery = eventQuery;
    this.unparsed |= eventQuery.unparsed;
    return this;
  }

  /**
   * GeteventQuery
   *
   * @return eventQuery
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public QueryEventFilteredUsersRequestDataAttributesEventQuery getEventQuery() {
    return eventQuery;
  }

  public void setEventQuery(QueryEventFilteredUsersRequestDataAttributesEventQuery eventQuery) {
    this.eventQuery = eventQuery;
  }

  public QueryEventFilteredUsersRequestDataAttributes includeRowCount(Boolean includeRowCount) {
    this.includeRowCount = includeRowCount;
    return this;
  }

  /**
   * GetincludeRowCount
   *
   * @return includeRowCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_ROW_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIncludeRowCount() {
    return includeRowCount;
  }

  public void setIncludeRowCount(Boolean includeRowCount) {
    this.includeRowCount = includeRowCount;
  }

  public QueryEventFilteredUsersRequestDataAttributes limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Getlimit
   *
   * @return limit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public QueryEventFilteredUsersRequestDataAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Getquery
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

  public QueryEventFilteredUsersRequestDataAttributes selectColumns(List<String> selectColumns) {
    this.selectColumns = selectColumns;
    return this;
  }

  public QueryEventFilteredUsersRequestDataAttributes addSelectColumnsItem(
      String selectColumnsItem) {
    if (this.selectColumns == null) {
      this.selectColumns = new ArrayList<>();
    }
    this.selectColumns.add(selectColumnsItem);
    return this;
  }

  /**
   * GetselectColumns
   *
   * @return selectColumns
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SELECT_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getSelectColumns() {
    return selectColumns;
  }

  public void setSelectColumns(List<String> selectColumns) {
    this.selectColumns = selectColumns;
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
   * @return QueryEventFilteredUsersRequestDataAttributes
   */
  @JsonAnySetter
  public QueryEventFilteredUsersRequestDataAttributes putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this QueryEventFilteredUsersRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryEventFilteredUsersRequestDataAttributes queryEventFilteredUsersRequestDataAttributes =
        (QueryEventFilteredUsersRequestDataAttributes) o;
    return Objects.equals(this.eventQuery, queryEventFilteredUsersRequestDataAttributes.eventQuery)
        && Objects.equals(
            this.includeRowCount, queryEventFilteredUsersRequestDataAttributes.includeRowCount)
        && Objects.equals(this.limit, queryEventFilteredUsersRequestDataAttributes.limit)
        && Objects.equals(this.query, queryEventFilteredUsersRequestDataAttributes.query)
        && Objects.equals(
            this.selectColumns, queryEventFilteredUsersRequestDataAttributes.selectColumns)
        && Objects.equals(
            this.additionalProperties,
            queryEventFilteredUsersRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        eventQuery, includeRowCount, limit, query, selectColumns, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryEventFilteredUsersRequestDataAttributes {\n");
    sb.append("    eventQuery: ").append(toIndentedString(eventQuery)).append("\n");
    sb.append("    includeRowCount: ").append(toIndentedString(includeRowCount)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    selectColumns: ").append(toIndentedString(selectColumns)).append("\n");
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
