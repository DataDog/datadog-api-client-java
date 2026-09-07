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

/** Available values query for logs, RUM, or spans data sources. */
@JsonPropertyOrder({
  NotebookTemplateVariableAvailableValuesQueryLogRumSpans.JSON_PROPERTY_DATA_SOURCE,
  NotebookTemplateVariableAvailableValuesQueryLogRumSpans.JSON_PROPERTY_GROUP_BY,
  NotebookTemplateVariableAvailableValuesQueryLogRumSpans.JSON_PROPERTY_SEARCH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotebookTemplateVariableAvailableValuesQueryLogRumSpans {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private String dataSource;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<NotebookTemplateVariableAvailableValuesQueryGroupBy> groupBy = new ArrayList<>();

  public static final String JSON_PROPERTY_SEARCH = "search";
  private NotebookTemplateVariableAvailableValuesQuerySearch search;

  public NotebookTemplateVariableAvailableValuesQueryLogRumSpans() {}

  @JsonCreator
  public NotebookTemplateVariableAvailableValuesQueryLogRumSpans(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE) String dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUP_BY)
          List<NotebookTemplateVariableAvailableValuesQueryGroupBy> groupBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEARCH)
          NotebookTemplateVariableAvailableValuesQuerySearch search) {
    this.dataSource = dataSource;
    this.groupBy = groupBy;
    for (NotebookTemplateVariableAvailableValuesQueryGroupBy item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    this.search = search;
    this.unparsed |= search.unparsed;
  }

  public NotebookTemplateVariableAvailableValuesQueryLogRumSpans dataSource(String dataSource) {
    this.dataSource = dataSource;
    return this;
  }

  /**
   * The data source for the query. Must be one of <code>logs</code>, <code>rum</code>, or <code>
   * spans</code>.
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

  public NotebookTemplateVariableAvailableValuesQueryLogRumSpans groupBy(
      List<NotebookTemplateVariableAvailableValuesQueryGroupBy> groupBy) {
    this.groupBy = groupBy;
    for (NotebookTemplateVariableAvailableValuesQueryGroupBy item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public NotebookTemplateVariableAvailableValuesQueryLogRumSpans addGroupByItem(
      NotebookTemplateVariableAvailableValuesQueryGroupBy groupByItem) {
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * Group-by fields for the query.
   *
   * @return groupBy
   */
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<NotebookTemplateVariableAvailableValuesQueryGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<NotebookTemplateVariableAvailableValuesQueryGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (NotebookTemplateVariableAvailableValuesQueryGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public NotebookTemplateVariableAvailableValuesQueryLogRumSpans search(
      NotebookTemplateVariableAvailableValuesQuerySearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * Search parameters for an available values query.
   *
   * @return search
   */
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public NotebookTemplateVariableAvailableValuesQuerySearch getSearch() {
    return search;
  }

  public void setSearch(NotebookTemplateVariableAvailableValuesQuerySearch search) {
    this.search = search;
    if (search != null) {
      this.unparsed |= search.unparsed;
    }
  }

  /**
   * Return true if this NotebookTemplateVariableAvailableValuesQueryLogRumSpans object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookTemplateVariableAvailableValuesQueryLogRumSpans
        notebookTemplateVariableAvailableValuesQueryLogRumSpans =
            (NotebookTemplateVariableAvailableValuesQueryLogRumSpans) o;
    return Objects.equals(
            this.dataSource, notebookTemplateVariableAvailableValuesQueryLogRumSpans.dataSource)
        && Objects.equals(
            this.groupBy, notebookTemplateVariableAvailableValuesQueryLogRumSpans.groupBy)
        && Objects.equals(
            this.search, notebookTemplateVariableAvailableValuesQueryLogRumSpans.search);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSource, groupBy, search);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookTemplateVariableAvailableValuesQueryLogRumSpans {\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
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
