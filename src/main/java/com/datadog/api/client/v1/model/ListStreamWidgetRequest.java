/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Updated list stream widget. */
@JsonPropertyOrder({
  ListStreamWidgetRequest.JSON_PROPERTY_COLUMNS,
  ListStreamWidgetRequest.JSON_PROPERTY_QUERY,
  ListStreamWidgetRequest.JSON_PROPERTY_RESPONSE_FORMAT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ListStreamWidgetRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<ListStreamColumn> columns = new ArrayList<>();

  public static final String JSON_PROPERTY_QUERY = "query";
  private ListStreamQuery query;

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private ListStreamResponseFormat responseFormat;

  public ListStreamWidgetRequest() {}

  @JsonCreator
  public ListStreamWidgetRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMNS) List<ListStreamColumn> columns,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) ListStreamQuery query,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          ListStreamResponseFormat responseFormat) {
    this.columns = columns;
    this.query = query;
    this.unparsed |= query.unparsed;
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public ListStreamWidgetRequest columns(List<ListStreamColumn> columns) {
    this.columns = columns;
    for (ListStreamColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ListStreamWidgetRequest addColumnsItem(ListStreamColumn columnsItem) {
    this.columns.add(columnsItem);
    this.unparsed |= columnsItem.unparsed;
    return this;
  }

  /**
   * Widget columns.
   *
   * @return columns
   */
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ListStreamColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<ListStreamColumn> columns) {
    this.columns = columns;
  }

  public ListStreamWidgetRequest query(ListStreamQuery query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * Updated list stream widget.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ListStreamQuery getQuery() {
    return query;
  }

  public void setQuery(ListStreamQuery query) {
    this.query = query;
  }

  public ListStreamWidgetRequest responseFormat(ListStreamResponseFormat responseFormat) {
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
    return this;
  }

  /**
   * Widget response format.
   *
   * @return responseFormat
   */
  @JsonProperty(JSON_PROPERTY_RESPONSE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ListStreamResponseFormat getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(ListStreamResponseFormat responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  /** Return true if this ListStreamWidgetRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListStreamWidgetRequest listStreamWidgetRequest = (ListStreamWidgetRequest) o;
    return Objects.equals(this.columns, listStreamWidgetRequest.columns)
        && Objects.equals(this.query, listStreamWidgetRequest.query)
        && Objects.equals(this.responseFormat, listStreamWidgetRequest.responseFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, query, responseFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListStreamWidgetRequest {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
    sb.append("}");
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
