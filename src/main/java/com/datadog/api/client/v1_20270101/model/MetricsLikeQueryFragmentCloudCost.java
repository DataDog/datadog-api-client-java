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
@JsonPropertyOrder({
  MetricsLikeQueryFragmentCloudCost.JSON_PROPERTY_ALIAS,
  MetricsLikeQueryFragmentCloudCost.JSON_PROPERTY_DATA_SOURCE,
  MetricsLikeQueryFragmentCloudCost.JSON_PROPERTY_FILTER,
  MetricsLikeQueryFragmentCloudCost.JSON_PROPERTY_METRIC_NAME,
  MetricsLikeQueryFragmentCloudCost.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricsLikeQueryFragmentCloudCost {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private MetricsLikeQueryFragmentCloudCostDataSource dataSource;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private String filter;

  public static final String JSON_PROPERTY_METRIC_NAME = "metric_name";
  private String metricName;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public MetricsLikeQueryFragmentCloudCost() {}

  @JsonCreator
  public MetricsLikeQueryFragmentCloudCost(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          MetricsLikeQueryFragmentCloudCostDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_METRIC_NAME) String metricName,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.metricName = metricName;
    this.name = name;
  }

  public MetricsLikeQueryFragmentCloudCost alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return alias
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public MetricsLikeQueryFragmentCloudCost dataSource(
      MetricsLikeQueryFragmentCloudCostDataSource dataSource) {
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
  public MetricsLikeQueryFragmentCloudCostDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(MetricsLikeQueryFragmentCloudCostDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public MetricsLikeQueryFragmentCloudCost filter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return filter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public MetricsLikeQueryFragmentCloudCost metricName(String metricName) {
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

  public MetricsLikeQueryFragmentCloudCost name(String name) {
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

  /** Return true if this MetricsLikeQueryFragmentCloudCost object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricsLikeQueryFragmentCloudCost metricsLikeQueryFragmentCloudCost =
        (MetricsLikeQueryFragmentCloudCost) o;
    return Objects.equals(this.alias, metricsLikeQueryFragmentCloudCost.alias)
        && Objects.equals(this.dataSource, metricsLikeQueryFragmentCloudCost.dataSource)
        && Objects.equals(this.filter, metricsLikeQueryFragmentCloudCost.filter)
        && Objects.equals(this.metricName, metricsLikeQueryFragmentCloudCost.metricName)
        && Objects.equals(this.name, metricsLikeQueryFragmentCloudCost.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, dataSource, filter, metricName, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricsLikeQueryFragmentCloudCost {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
