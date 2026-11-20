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
  UnifiedIssueStreamRequest.JSON_PROPERTY_COLUMNS,
  UnifiedIssueStreamRequest.JSON_PROPERTY_QUERY,
  UnifiedIssueStreamRequest.JSON_PROPERTY_RESPONSE_FORMAT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UnifiedIssueStreamRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<IssueStreamColumn> columns = new ArrayList<>();

  public static final String JSON_PROPERTY_QUERY = "query";
  private UnifiedIssueStreamQuery query;

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private UnifiedIssueStreamRequestResponseFormat responseFormat;

  public UnifiedIssueStreamRequest() {}

  @JsonCreator
  public UnifiedIssueStreamRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMNS) List<IssueStreamColumn> columns,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) UnifiedIssueStreamQuery query,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          UnifiedIssueStreamRequestResponseFormat responseFormat) {
    this.columns = columns;
    for (IssueStreamColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
    this.query = query;
    this.unparsed |= query.unparsed;
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public UnifiedIssueStreamRequest columns(List<IssueStreamColumn> columns) {
    this.columns = columns;
    for (IssueStreamColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public UnifiedIssueStreamRequest addColumnsItem(IssueStreamColumn columnsItem) {
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
  public List<IssueStreamColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<IssueStreamColumn> columns) {
    this.columns = columns;
    if (columns != null) {
      for (IssueStreamColumn item : columns) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public UnifiedIssueStreamRequest query(UnifiedIssueStreamQuery query) {
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
  public UnifiedIssueStreamQuery getQuery() {
    return query;
  }

  public void setQuery(UnifiedIssueStreamQuery query) {
    this.query = query;
    if (query != null) {
      this.unparsed |= query.unparsed;
    }
  }

  public UnifiedIssueStreamRequest responseFormat(
      UnifiedIssueStreamRequestResponseFormat responseFormat) {
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
  public UnifiedIssueStreamRequestResponseFormat getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(UnifiedIssueStreamRequestResponseFormat responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  /** Return true if this UnifiedIssueStreamRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnifiedIssueStreamRequest unifiedIssueStreamRequest = (UnifiedIssueStreamRequest) o;
    return Objects.equals(this.columns, unifiedIssueStreamRequest.columns)
        && Objects.equals(this.query, unifiedIssueStreamRequest.query)
        && Objects.equals(this.responseFormat, unifiedIssueStreamRequest.responseFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, query, responseFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnifiedIssueStreamRequest {\n");
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
