/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** An individual scalar metrics query. */
@JsonPropertyOrder({
  MetricsScalarQuery.JSON_PROPERTY_AGGREGATOR,
  MetricsScalarQuery.JSON_PROPERTY_DATA_SOURCE,
  MetricsScalarQuery.JSON_PROPERTY_NAME,
  MetricsScalarQuery.JSON_PROPERTY_QUERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricsScalarQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATOR = "aggregator";
  private MetricsAggregator aggregator = MetricsAggregator.AVG;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private MetricsDataSource dataSource = MetricsDataSource.METRICS;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public MetricsScalarQuery() {}

  @JsonCreator
  public MetricsScalarQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATOR) MetricsAggregator aggregator,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          MetricsDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query) {
    this.aggregator = aggregator;
    this.unparsed |= !aggregator.isValid();
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.query = query;
  }

  public MetricsScalarQuery aggregator(MetricsAggregator aggregator) {
    this.aggregator = aggregator;
    this.unparsed |= !aggregator.isValid();
    return this;
  }

  /**
   * The type of aggregation that can be performed on metrics-based queries.
   *
   * @return aggregator
   */
  @JsonProperty(JSON_PROPERTY_AGGREGATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MetricsAggregator getAggregator() {
    return aggregator;
  }

  public void setAggregator(MetricsAggregator aggregator) {
    if (!aggregator.isValid()) {
      this.unparsed = true;
    }
    this.aggregator = aggregator;
  }

  public MetricsScalarQuery dataSource(MetricsDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * A data source that is powered by the Metrics platform.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MetricsDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(MetricsDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public MetricsScalarQuery name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The variable name for use in formulas.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MetricsScalarQuery query(String query) {
    this.query = query;
    return this;
  }

  /**
   * A classic metrics query string.
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
   * @return MetricsScalarQuery
   */
  @JsonAnySetter
  public MetricsScalarQuery putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MetricsScalarQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricsScalarQuery metricsScalarQuery = (MetricsScalarQuery) o;
    return Objects.equals(this.aggregator, metricsScalarQuery.aggregator)
        && Objects.equals(this.dataSource, metricsScalarQuery.dataSource)
        && Objects.equals(this.name, metricsScalarQuery.name)
        && Objects.equals(this.query, metricsScalarQuery.query)
        && Objects.equals(this.additionalProperties, metricsScalarQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregator, dataSource, name, query, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricsScalarQuery {\n");
    sb.append("    aggregator: ").append(toIndentedString(aggregator)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
