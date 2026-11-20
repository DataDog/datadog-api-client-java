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
  MetricDatasetMetricScalar.JSON_PROPERTY_AGGREGATION,
  MetricDatasetMetricScalar.JSON_PROPERTY_DATA_SOURCE,
  MetricDatasetMetricScalar.JSON_PROPERTY_METRIC_NAME,
  MetricDatasetMetricScalar.JSON_PROPERTY_NAME,
  MetricDatasetMetricScalar.JSON_PROPERTY_QUERY_FILTER,
  MetricDatasetMetricScalar.JSON_PROPERTY_TAG_NAMES,
  MetricDatasetMetricScalar.JSON_PROPERTY_TIME_WINDOW
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricDatasetMetricScalar {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private MetricDatasetMetricScalarAggregation aggregation;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private MetricDatasetMetricScalarDataSource dataSource;

  public static final String JSON_PROPERTY_METRIC_NAME = "metric_name";
  private String metricName;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY_FILTER = "query_filter";
  private String queryFilter;

  public static final String JSON_PROPERTY_TAG_NAMES = "tag_names";
  private List<String> tagNames = null;

  public static final String JSON_PROPERTY_TIME_WINDOW = "time_window";
  private TimeWindow timeWindow;

  public MetricDatasetMetricScalar() {}

  @JsonCreator
  public MetricDatasetMetricScalar(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATION)
          MetricDatasetMetricScalarAggregation aggregation,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          MetricDatasetMetricScalarDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_METRIC_NAME) String metricName,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.metricName = metricName;
    this.name = name;
  }

  public MetricDatasetMetricScalar aggregation(MetricDatasetMetricScalarAggregation aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return aggregation
   */
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MetricDatasetMetricScalarAggregation getAggregation() {
    return aggregation;
  }

  public void setAggregation(MetricDatasetMetricScalarAggregation aggregation) {
    if (!aggregation.isValid()) {
      this.unparsed = true;
    }
    this.aggregation = aggregation;
  }

  public MetricDatasetMetricScalar dataSource(MetricDatasetMetricScalarDataSource dataSource) {
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
  public MetricDatasetMetricScalarDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(MetricDatasetMetricScalarDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public MetricDatasetMetricScalar metricName(String metricName) {
    this.metricName = metricName;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return metricName
   */
  @JsonProperty(JSON_PROPERTY_METRIC_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMetricName() {
    return metricName;
  }

  public void setMetricName(String metricName) {
    this.metricName = metricName;
  }

  public MetricDatasetMetricScalar name(String name) {
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

  public MetricDatasetMetricScalar queryFilter(String queryFilter) {
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

  public MetricDatasetMetricScalar tagNames(List<String> tagNames) {
    this.tagNames = tagNames;
    return this;
  }

  public MetricDatasetMetricScalar addTagNamesItem(String tagNamesItem) {
    if (this.tagNames == null) {
      this.tagNames = new ArrayList<>();
    }
    this.tagNames.add(tagNamesItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return tagNames
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTagNames() {
    return tagNames;
  }

  public void setTagNames(List<String> tagNames) {
    this.tagNames = tagNames;
  }

  public MetricDatasetMetricScalar timeWindow(TimeWindow timeWindow) {
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

  /** Return true if this MetricDatasetMetricScalar object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricDatasetMetricScalar metricDatasetMetricScalar = (MetricDatasetMetricScalar) o;
    return Objects.equals(this.aggregation, metricDatasetMetricScalar.aggregation)
        && Objects.equals(this.dataSource, metricDatasetMetricScalar.dataSource)
        && Objects.equals(this.metricName, metricDatasetMetricScalar.metricName)
        && Objects.equals(this.name, metricDatasetMetricScalar.name)
        && Objects.equals(this.queryFilter, metricDatasetMetricScalar.queryFilter)
        && Objects.equals(this.tagNames, metricDatasetMetricScalar.tagNames)
        && Objects.equals(this.timeWindow, metricDatasetMetricScalar.timeWindow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aggregation, dataSource, metricName, name, queryFilter, tagNames, timeWindow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricDatasetMetricScalar {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    queryFilter: ").append(toIndentedString(queryFilter)).append("\n");
    sb.append("    tagNames: ").append(toIndentedString(tagNames)).append("\n");
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
