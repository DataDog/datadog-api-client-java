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
import java.util.Objects;

/** Updated SLO List widget. */
@JsonPropertyOrder({
  SLOListWidgetQuery.JSON_PROPERTY_LIMIT,
  SLOListWidgetQuery.JSON_PROPERTY_QUERY_STRING
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOListWidgetQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit = 100l;

  public static final String JSON_PROPERTY_QUERY_STRING = "query_string";
  private String queryString;

  public SLOListWidgetQuery() {}

  @JsonCreator
  public SLOListWidgetQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY_STRING) String queryString) {
    this.queryString = queryString;
  }

  public SLOListWidgetQuery limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Maximum number of results to display in the table. minimum: 1 maximum: 100
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

  public SLOListWidgetQuery queryString(String queryString) {
    this.queryString = queryString;
    return this;
  }

  /**
   * Widget query.
   *
   * @return queryString
   */
  @JsonProperty(JSON_PROPERTY_QUERY_STRING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQueryString() {
    return queryString;
  }

  public void setQueryString(String queryString) {
    this.queryString = queryString;
  }

  /** Return true if this SLOListWidgetQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOListWidgetQuery sloListWidgetQuery = (SLOListWidgetQuery) o;
    return Objects.equals(this.limit, sloListWidgetQuery.limit)
        && Objects.equals(this.queryString, sloListWidgetQuery.queryString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, queryString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOListWidgetQuery {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
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
