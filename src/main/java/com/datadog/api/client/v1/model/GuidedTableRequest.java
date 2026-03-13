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
 * Request definition for the guided table widget — a structured, guided format for defining a table
 * of data. Used when the <code>graphing_new_table_widget_editor</code> feature flag is enabled;
 * otherwise use the classic <code>TableWidgetRequest</code>. Defines base queries, how to produce
 * rows, and how to compute columns.
 */
@JsonPropertyOrder({
  GuidedTableRequest.JSON_PROPERTY_COLUMNS,
  GuidedTableRequest.JSON_PROPERTY_QUERIES,
  GuidedTableRequest.JSON_PROPERTY_REQUEST_TYPE,
  GuidedTableRequest.JSON_PROPERTY_ROWS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GuidedTableRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<GuidedTableColumn> columns = new ArrayList<>();

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<GuidedTableQuery> queries = new ArrayList<>();

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private GuidedTableRequestRequestType requestType;

  public static final String JSON_PROPERTY_ROWS = "rows";
  private GuidedTableRows rows;

  public GuidedTableRequest() {}

  @JsonCreator
  public GuidedTableRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMNS) List<GuidedTableColumn> columns,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERIES) List<GuidedTableQuery> queries,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          GuidedTableRequestRequestType requestType,
      @JsonProperty(required = true, value = JSON_PROPERTY_ROWS) GuidedTableRows rows) {
    this.columns = columns;
    this.queries = queries;
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    this.rows = rows;
    this.unparsed |= rows.unparsed;
  }

  public GuidedTableRequest columns(List<GuidedTableColumn> columns) {
    this.columns = columns;
    for (GuidedTableColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GuidedTableRequest addColumnsItem(GuidedTableColumn columnsItem) {
    this.columns.add(columnsItem);
    this.unparsed |= columnsItem.unparsed;
    return this;
  }

  /**
   * Column definitions that describe how to compute and display table values.
   *
   * @return columns
   */
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<GuidedTableColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<GuidedTableColumn> columns) {
    this.columns = columns;
  }

  public GuidedTableRequest queries(List<GuidedTableQuery> queries) {
    this.queries = queries;
    for (GuidedTableQuery item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GuidedTableRequest addQueriesItem(GuidedTableQuery queriesItem) {
    this.queries.add(queriesItem);
    this.unparsed |= queriesItem.unparsed;
    return this;
  }

  /**
   * Base queries that provide the source data for the table.
   *
   * @return queries
   */
  @JsonProperty(JSON_PROPERTY_QUERIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<GuidedTableQuery> getQueries() {
    return queries;
  }

  public void setQueries(List<GuidedTableQuery> queries) {
    this.queries = queries;
  }

  public GuidedTableRequest requestType(GuidedTableRequestRequestType requestType) {
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    return this;
  }

  /**
   * Identifies this as a guided table request.
   *
   * @return requestType
   */
  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GuidedTableRequestRequestType getRequestType() {
    return requestType;
  }

  public void setRequestType(GuidedTableRequestRequestType requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public GuidedTableRequest rows(GuidedTableRows rows) {
    this.rows = rows;
    this.unparsed |= rows.unparsed;
    return this;
  }

  /**
   * Defines how to compute the rows of a guided table.
   *
   * @return rows
   */
  @JsonProperty(JSON_PROPERTY_ROWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GuidedTableRows getRows() {
    return rows;
  }

  public void setRows(GuidedTableRows rows) {
    this.rows = rows;
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
   * @return GuidedTableRequest
   */
  @JsonAnySetter
  public GuidedTableRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GuidedTableRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuidedTableRequest guidedTableRequest = (GuidedTableRequest) o;
    return Objects.equals(this.columns, guidedTableRequest.columns)
        && Objects.equals(this.queries, guidedTableRequest.queries)
        && Objects.equals(this.requestType, guidedTableRequest.requestType)
        && Objects.equals(this.rows, guidedTableRequest.rows)
        && Objects.equals(this.additionalProperties, guidedTableRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, queries, requestType, rows, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuidedTableRequest {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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
