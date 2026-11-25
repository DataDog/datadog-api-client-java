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
  PublishedAnalysis.JSON_PROPERTY_COLUMNS,
  PublishedAnalysis.JSON_PROPERTY_DATA_SOURCE,
  PublishedAnalysis.JSON_PROPERTY_DATASET_ID,
  PublishedAnalysis.JSON_PROPERTY_NAME,
  PublishedAnalysis.JSON_PROPERTY_QUERY_FILTER,
  PublishedAnalysis.JSON_PROPERTY_TIME_WINDOW
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PublishedAnalysis {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<DatasetColumn> columns = null;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private PublishedAnalysisDataSource dataSource;

  public static final String JSON_PROPERTY_DATASET_ID = "dataset_id";
  private String datasetId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY_FILTER = "query_filter";
  private String queryFilter;

  public static final String JSON_PROPERTY_TIME_WINDOW = "time_window";
  private TimeWindow timeWindow;

  public PublishedAnalysis() {}

  @JsonCreator
  public PublishedAnalysis(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          PublishedAnalysisDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATASET_ID) String datasetId,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.datasetId = datasetId;
    this.name = name;
  }

  public PublishedAnalysis columns(List<DatasetColumn> columns) {
    this.columns = columns;
    if (columns != null) {
      for (DatasetColumn item : columns) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public PublishedAnalysis addColumnsItem(DatasetColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    this.unparsed |= columnsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return columns
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DatasetColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<DatasetColumn> columns) {
    this.columns = columns;
    if (columns != null) {
      for (DatasetColumn item : columns) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public PublishedAnalysis dataSource(PublishedAnalysisDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public PublishedAnalysisDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(PublishedAnalysisDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public PublishedAnalysis datasetId(String datasetId) {
    this.datasetId = datasetId;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return datasetId
   */
  @JsonProperty(JSON_PROPERTY_DATASET_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDatasetId() {
    return datasetId;
  }

  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }

  public PublishedAnalysis name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PublishedAnalysis queryFilter(String queryFilter) {
    this.queryFilter = queryFilter;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return queryFilter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQueryFilter() {
    return queryFilter;
  }

  public void setQueryFilter(String queryFilter) {
    this.queryFilter = queryFilter;
  }

  public PublishedAnalysis timeWindow(TimeWindow timeWindow) {
    this.timeWindow = timeWindow;
    this.unparsed |= timeWindow.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return timeWindow
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TimeWindow getTimeWindow() {
    return timeWindow;
  }

  public void setTimeWindow(TimeWindow timeWindow) {
    this.timeWindow = timeWindow;
    if (timeWindow != null) {
      this.unparsed |= timeWindow.unparsed;
    }
  }

  /** Return true if this PublishedAnalysis object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishedAnalysis publishedAnalysis = (PublishedAnalysis) o;
    return Objects.equals(this.columns, publishedAnalysis.columns)
        && Objects.equals(this.dataSource, publishedAnalysis.dataSource)
        && Objects.equals(this.datasetId, publishedAnalysis.datasetId)
        && Objects.equals(this.name, publishedAnalysis.name)
        && Objects.equals(this.queryFilter, publishedAnalysis.queryFilter)
        && Objects.equals(this.timeWindow, publishedAnalysis.timeWindow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, dataSource, datasetId, name, queryFilter, timeWindow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishedAnalysis {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    queryFilter: ").append(toIndentedString(queryFilter)).append("\n");
    sb.append("    timeWindow: ").append(toIndentedString(timeWindow)).append("\n");
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
