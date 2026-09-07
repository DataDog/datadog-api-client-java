/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>A formula and functions metrics query for use in aggregate queries.</p>
 */
@JsonPropertyOrder({
  MonitorFormulaAndFunctionMetricsQueryDefinition.JSON_PROPERTY_AGGREGATOR,
  MonitorFormulaAndFunctionMetricsQueryDefinition.JSON_PROPERTY_DATA_SOURCE,
  MonitorFormulaAndFunctionMetricsQueryDefinition.JSON_PROPERTY_NAME,
  MonitorFormulaAndFunctionMetricsQueryDefinition.JSON_PROPERTY_QUERY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorFormulaAndFunctionMetricsQueryDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATOR = "aggregator";
  private MonitorFormulaAndFunctionMetricsAggregator aggregator;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private MonitorFormulaAndFunctionMetricsDataSource dataSource;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public MonitorFormulaAndFunctionMetricsQueryDefinition() {}

  @JsonCreator
  public MonitorFormulaAndFunctionMetricsQueryDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_DATA_SOURCE)MonitorFormulaAndFunctionMetricsDataSource dataSource,
            @JsonProperty(required=true, value=JSON_PROPERTY_QUERY)String query) {
        this.dataSource = dataSource;
        this.unparsed |= !dataSource.isValid();
        this.query = query;
  }
  public MonitorFormulaAndFunctionMetricsQueryDefinition aggregator(MonitorFormulaAndFunctionMetricsAggregator aggregator) {
    this.aggregator = aggregator;
    this.unparsed |= !aggregator.isValid();
    return this;
  }

  /**
   * <p>Aggregator for metrics queries.</p>
   * @return aggregator
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AGGREGATOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public MonitorFormulaAndFunctionMetricsAggregator getAggregator() {
        return aggregator;
      }
  public void setAggregator(MonitorFormulaAndFunctionMetricsAggregator aggregator) {
    if (!aggregator.isValid()) {
        this.unparsed = true;
    }
    this.aggregator = aggregator;
  }
  public MonitorFormulaAndFunctionMetricsQueryDefinition dataSource(MonitorFormulaAndFunctionMetricsDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * <p>Data source for metrics queries.</p>
   * @return dataSource
  **/
      @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public MonitorFormulaAndFunctionMetricsDataSource getDataSource() {
        return dataSource;
      }
  public void setDataSource(MonitorFormulaAndFunctionMetricsDataSource dataSource) {
    if (!dataSource.isValid()) {
        this.unparsed = true;
    }
    this.dataSource = dataSource;
  }
  public MonitorFormulaAndFunctionMetricsQueryDefinition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the query for use in formulas.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public MonitorFormulaAndFunctionMetricsQueryDefinition query(String query) {
    this.query = query;
    return this;
  }

  /**
   * <p>The metrics query definition.</p>
   * @return query
  **/
      @JsonProperty(JSON_PROPERTY_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getQuery() {
        return query;
      }
  public void setQuery(String query) {
    this.query = query;
  }

  /**
   * Return true if this MonitorFormulaAndFunctionMetricsQueryDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorFormulaAndFunctionMetricsQueryDefinition monitorFormulaAndFunctionMetricsQueryDefinition = (MonitorFormulaAndFunctionMetricsQueryDefinition) o;
    return Objects.equals(this.aggregator, monitorFormulaAndFunctionMetricsQueryDefinition.aggregator) && Objects.equals(this.dataSource, monitorFormulaAndFunctionMetricsQueryDefinition.dataSource) && Objects.equals(this.name, monitorFormulaAndFunctionMetricsQueryDefinition.name) && Objects.equals(this.query, monitorFormulaAndFunctionMetricsQueryDefinition.query);
  }


  @Override
  public int hashCode() {
    return Objects.hash(aggregator,dataSource,name,query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorFormulaAndFunctionMetricsQueryDefinition {\n");
    sb.append("    aggregator: ").append(toIndentedString(aggregator)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
