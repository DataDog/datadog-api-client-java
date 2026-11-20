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
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({SqlAnalysisQuery.JSON_PROPERTY_SQL_QUERY, SqlAnalysisQuery.JSON_PROPERTY_TYPE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SqlAnalysisQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SQL_QUERY = "sql_query";
  private String sqlQuery;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SqlAnalysisQueryType type;

  public SqlAnalysisQuery() {}

  @JsonCreator
  public SqlAnalysisQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_SQL_QUERY) String sqlQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) SqlAnalysisQueryType type) {
    this.sqlQuery = sqlQuery;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SqlAnalysisQuery sqlQuery(String sqlQuery) {
    this.sqlQuery = sqlQuery;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return sqlQuery
   */
  @JsonProperty(JSON_PROPERTY_SQL_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSqlQuery() {
    return sqlQuery;
  }

  public void setSqlQuery(String sqlQuery) {
    this.sqlQuery = sqlQuery;
  }

  public SqlAnalysisQuery type(SqlAnalysisQueryType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SqlAnalysisQueryType getType() {
    return type;
  }

  public void setType(SqlAnalysisQueryType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this SqlAnalysisQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SqlAnalysisQuery sqlAnalysisQuery = (SqlAnalysisQuery) o;
    return Objects.equals(this.sqlQuery, sqlAnalysisQuery.sqlQuery)
        && Objects.equals(this.type, sqlAnalysisQuery.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sqlQuery, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SqlAnalysisQuery {\n");
    sb.append("    sqlQuery: ").append(toIndentedString(sqlQuery)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
