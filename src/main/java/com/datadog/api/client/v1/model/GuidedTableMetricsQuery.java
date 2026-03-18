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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * A metrics (or cloud cost) query fragment used as source data for a guided table. Group-by and
 * time/space aggregation are defined separately.
 */
@JsonPropertyOrder({
  GuidedTableMetricsQuery.JSON_PROPERTY_ALIAS,
  GuidedTableMetricsQuery.JSON_PROPERTY_DATA_SOURCE,
  GuidedTableMetricsQuery.JSON_PROPERTY_FILTER,
  GuidedTableMetricsQuery.JSON_PROPERTY_METRIC_NAME,
  GuidedTableMetricsQuery.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GuidedTableMetricsQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private GuidedTableMetricsQueryDataSource dataSource;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private String filter;

  public static final String JSON_PROPERTY_METRIC_NAME = "metric_name";
  private String metricName;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public GuidedTableMetricsQuery() {}

  @JsonCreator
  public GuidedTableMetricsQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          GuidedTableMetricsQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_METRIC_NAME) String metricName,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.metricName = metricName;
    this.name = name;
  }

  public GuidedTableMetricsQuery alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Display alias for the query.
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

  public GuidedTableMetricsQuery dataSource(GuidedTableMetricsQueryDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Metrics data source.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GuidedTableMetricsQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(GuidedTableMetricsQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public GuidedTableMetricsQuery filter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Filter string to apply to the metric query.
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

  public GuidedTableMetricsQuery metricName(String metricName) {
    this.metricName = metricName;
    return this;
  }

  /**
   * Name of the metric to query.
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

  public GuidedTableMetricsQuery name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Variable name used to reference this query in columns and formulas.
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
   * @return GuidedTableMetricsQuery
   */
  @JsonAnySetter
  public GuidedTableMetricsQuery putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GuidedTableMetricsQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuidedTableMetricsQuery guidedTableMetricsQuery = (GuidedTableMetricsQuery) o;
    return Objects.equals(this.alias, guidedTableMetricsQuery.alias)
        && Objects.equals(this.dataSource, guidedTableMetricsQuery.dataSource)
        && Objects.equals(this.filter, guidedTableMetricsQuery.filter)
        && Objects.equals(this.metricName, guidedTableMetricsQuery.metricName)
        && Objects.equals(this.name, guidedTableMetricsQuery.name)
        && Objects.equals(this.additionalProperties, guidedTableMetricsQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, dataSource, filter, metricName, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuidedTableMetricsQuery {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
