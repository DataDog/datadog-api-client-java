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
  CompositeStreamRequest.JSON_PROPERTY_COLUMNS,
  CompositeStreamRequest.JSON_PROPERTY_QUERY,
  CompositeStreamRequest.JSON_PROPERTY_REQUEST_TYPE,
  CompositeStreamRequest.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CompositeStreamRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<CompositeStreamRequestColumn> columns = new ArrayList<>();

  public static final String JSON_PROPERTY_QUERY = "query";
  private ListCompositeQuery query;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private CompositeStreamRequestRequestType requestType;

  public static final String JSON_PROPERTY_SORT = "sort";
  private ListStreamSort sort;

  public CompositeStreamRequest() {}

  @JsonCreator
  public CompositeStreamRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMNS)
          List<CompositeStreamRequestColumn> columns,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) ListCompositeQuery query,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          CompositeStreamRequestRequestType requestType) {
    this.columns = columns;
    for (CompositeStreamRequestColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
    this.query = query;
    this.unparsed |= query.unparsed;
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
  }

  public CompositeStreamRequest columns(List<CompositeStreamRequestColumn> columns) {
    this.columns = columns;
    for (CompositeStreamRequestColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CompositeStreamRequest addColumnsItem(CompositeStreamRequestColumn columnsItem) {
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
  public List<CompositeStreamRequestColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<CompositeStreamRequestColumn> columns) {
    this.columns = columns;
    if (columns != null) {
      for (CompositeStreamRequestColumn item : columns) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public CompositeStreamRequest query(ListCompositeQuery query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ListCompositeQuery getQuery() {
    return query;
  }

  public void setQuery(ListCompositeQuery query) {
    this.query = query;
    if (query != null) {
      this.unparsed |= query.unparsed;
    }
  }

  public CompositeStreamRequest requestType(CompositeStreamRequestRequestType requestType) {
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return requestType
   */
  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CompositeStreamRequestRequestType getRequestType() {
    return requestType;
  }

  public void setRequestType(CompositeStreamRequestRequestType requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public CompositeStreamRequest sort(ListStreamSort sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return sort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ListStreamSort getSort() {
    return sort;
  }

  public void setSort(ListStreamSort sort) {
    this.sort = sort;
    if (sort != null) {
      this.unparsed |= sort.unparsed;
    }
  }

  /** Return true if this CompositeStreamRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompositeStreamRequest compositeStreamRequest = (CompositeStreamRequest) o;
    return Objects.equals(this.columns, compositeStreamRequest.columns)
        && Objects.equals(this.query, compositeStreamRequest.query)
        && Objects.equals(this.requestType, compositeStreamRequest.requestType)
        && Objects.equals(this.sort, compositeStreamRequest.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, query, requestType, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompositeStreamRequest {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
