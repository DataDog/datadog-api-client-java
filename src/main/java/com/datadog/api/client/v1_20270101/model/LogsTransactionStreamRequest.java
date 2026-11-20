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
  LogsTransactionStreamRequest.JSON_PROPERTY_COLUMNS,
  LogsTransactionStreamRequest.JSON_PROPERTY_QUERY,
  LogsTransactionStreamRequest.JSON_PROPERTY_RESPONSE_FORMAT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsTransactionStreamRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<LogsTransactionStreamRequestColumnsItems> columns = new ArrayList<>();

  public static final String JSON_PROPERTY_QUERY = "query";
  private LogsTransactionStreamQuery query;

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private LogsTransactionStreamRequestResponseFormat responseFormat;

  public LogsTransactionStreamRequest() {}

  @JsonCreator
  public LogsTransactionStreamRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMNS)
          List<LogsTransactionStreamRequestColumnsItems> columns,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) LogsTransactionStreamQuery query,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          LogsTransactionStreamRequestResponseFormat responseFormat) {
    this.columns = columns;
    for (LogsTransactionStreamRequestColumnsItems item : columns) {
      this.unparsed |= item.unparsed;
    }
    this.query = query;
    this.unparsed |= query.unparsed;
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public LogsTransactionStreamRequest columns(
      List<LogsTransactionStreamRequestColumnsItems> columns) {
    this.columns = columns;
    for (LogsTransactionStreamRequestColumnsItems item : columns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LogsTransactionStreamRequest addColumnsItem(
      LogsTransactionStreamRequestColumnsItems columnsItem) {
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
  public List<LogsTransactionStreamRequestColumnsItems> getColumns() {
    return columns;
  }

  public void setColumns(List<LogsTransactionStreamRequestColumnsItems> columns) {
    this.columns = columns;
    if (columns != null) {
      for (LogsTransactionStreamRequestColumnsItems item : columns) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LogsTransactionStreamRequest query(LogsTransactionStreamQuery query) {
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
  public LogsTransactionStreamQuery getQuery() {
    return query;
  }

  public void setQuery(LogsTransactionStreamQuery query) {
    this.query = query;
    if (query != null) {
      this.unparsed |= query.unparsed;
    }
  }

  public LogsTransactionStreamRequest responseFormat(
      LogsTransactionStreamRequestResponseFormat responseFormat) {
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return responseFormat
   */
  @JsonProperty(JSON_PROPERTY_RESPONSE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsTransactionStreamRequestResponseFormat getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(LogsTransactionStreamRequestResponseFormat responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  /** Return true if this LogsTransactionStreamRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsTransactionStreamRequest logsTransactionStreamRequest = (LogsTransactionStreamRequest) o;
    return Objects.equals(this.columns, logsTransactionStreamRequest.columns)
        && Objects.equals(this.query, logsTransactionStreamRequest.query)
        && Objects.equals(this.responseFormat, logsTransactionStreamRequest.responseFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, query, responseFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsTransactionStreamRequest {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
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
