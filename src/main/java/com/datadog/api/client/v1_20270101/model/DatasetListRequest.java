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
  DatasetListRequest.JSON_PROPERTY_COLUMNS,
  DatasetListRequest.JSON_PROPERTY_QUERY,
  DatasetListRequest.JSON_PROPERTY_REQUEST_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatasetListRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<DatasetListRequestColumnsItems> columns = new ArrayList<>();

  public static final String JSON_PROPERTY_QUERY = "query";
  private DatasetListRequest20270101Query query;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private DatasetListRequestRequestType requestType;

  public DatasetListRequest() {}

  @JsonCreator
  public DatasetListRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMNS)
          List<DatasetListRequestColumnsItems> columns,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY)
          DatasetListRequest20270101Query query,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          DatasetListRequestRequestType requestType) {
    this.columns = columns;
    for (DatasetListRequestColumnsItems item : columns) {
      this.unparsed |= item.unparsed;
    }
    this.query = query;
    this.unparsed |= query.unparsed;
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
  }

  public DatasetListRequest columns(List<DatasetListRequestColumnsItems> columns) {
    this.columns = columns;
    for (DatasetListRequestColumnsItems item : columns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DatasetListRequest addColumnsItem(DatasetListRequestColumnsItems columnsItem) {
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
  public List<DatasetListRequestColumnsItems> getColumns() {
    return columns;
  }

  public void setColumns(List<DatasetListRequestColumnsItems> columns) {
    this.columns = columns;
    if (columns != null) {
      for (DatasetListRequestColumnsItems item : columns) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public DatasetListRequest query(DatasetListRequest20270101Query query) {
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
  public DatasetListRequest20270101Query getQuery() {
    return query;
  }

  public void setQuery(DatasetListRequest20270101Query query) {
    this.query = query;
    if (query != null) {
      this.unparsed |= query.unparsed;
    }
  }

  public DatasetListRequest requestType(DatasetListRequestRequestType requestType) {
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
  public DatasetListRequestRequestType getRequestType() {
    return requestType;
  }

  public void setRequestType(DatasetListRequestRequestType requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  /** Return true if this DatasetListRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetListRequest datasetListRequest = (DatasetListRequest) o;
    return Objects.equals(this.columns, datasetListRequest.columns)
        && Objects.equals(this.query, datasetListRequest.query)
        && Objects.equals(this.requestType, datasetListRequest.requestType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, query, requestType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetListRequest {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
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
