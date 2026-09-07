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

/** Available values query for the metrics data source. */
@JsonPropertyOrder({
  NotebookTemplateVariableAvailableValuesQueryMetrics.JSON_PROPERTY_DATA_SOURCE,
  NotebookTemplateVariableAvailableValuesQueryMetrics.JSON_PROPERTY_QUERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotebookTemplateVariableAvailableValuesQueryMetrics {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private String dataSource;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public NotebookTemplateVariableAvailableValuesQueryMetrics() {}

  @JsonCreator
  public NotebookTemplateVariableAvailableValuesQueryMetrics(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE) String dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query) {
    this.dataSource = dataSource;
    this.query = query;
  }

  public NotebookTemplateVariableAvailableValuesQueryMetrics dataSource(String dataSource) {
    this.dataSource = dataSource;
    return this;
  }

  /**
   * The data source for the query. Must be <code>metrics</code>.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDataSource() {
    return dataSource;
  }

  public void setDataSource(String dataSource) {
    this.dataSource = dataSource;
  }

  public NotebookTemplateVariableAvailableValuesQueryMetrics query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The metrics query string.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  /**
   * Return true if this NotebookTemplateVariableAvailableValuesQueryMetrics object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookTemplateVariableAvailableValuesQueryMetrics
        notebookTemplateVariableAvailableValuesQueryMetrics =
            (NotebookTemplateVariableAvailableValuesQueryMetrics) o;
    return Objects.equals(
            this.dataSource, notebookTemplateVariableAvailableValuesQueryMetrics.dataSource)
        && Objects.equals(this.query, notebookTemplateVariableAvailableValuesQueryMetrics.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSource, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookTemplateVariableAvailableValuesQueryMetrics {\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
