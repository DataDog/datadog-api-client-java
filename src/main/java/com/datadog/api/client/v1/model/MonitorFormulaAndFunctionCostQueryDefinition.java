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
   * <p>A formula and functions cost query.</p>
 */
@JsonPropertyOrder({
  MonitorFormulaAndFunctionCostQueryDefinition.JSON_PROPERTY_AGGREGATOR,
  MonitorFormulaAndFunctionCostQueryDefinition.JSON_PROPERTY_DATA_SOURCE,
  MonitorFormulaAndFunctionCostQueryDefinition.JSON_PROPERTY_NAME,
  MonitorFormulaAndFunctionCostQueryDefinition.JSON_PROPERTY_QUERY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorFormulaAndFunctionCostQueryDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATOR = "aggregator";
  private MonitorFormulaAndFunctionCostAggregator aggregator;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private MonitorFormulaAndFunctionCostDataSource dataSource;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public MonitorFormulaAndFunctionCostQueryDefinition() {}

  @JsonCreator
  public MonitorFormulaAndFunctionCostQueryDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_DATA_SOURCE)MonitorFormulaAndFunctionCostDataSource dataSource,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_QUERY)String query) {
        this.dataSource = dataSource;
        this.unparsed |= !dataSource.isValid();
        this.name = name;
        this.query = query;
  }
  public MonitorFormulaAndFunctionCostQueryDefinition aggregator(MonitorFormulaAndFunctionCostAggregator aggregator) {
    this.aggregator = aggregator;
    this.unparsed |= !aggregator.isValid();
    return this;
  }

  /**
   * <p>Aggregation methods for metric queries.</p>
   * @return aggregator
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AGGREGATOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public MonitorFormulaAndFunctionCostAggregator getAggregator() {
        return aggregator;
      }
  public void setAggregator(MonitorFormulaAndFunctionCostAggregator aggregator) {
    if (!aggregator.isValid()) {
        this.unparsed = true;
    }
    this.aggregator = aggregator;
  }
  public MonitorFormulaAndFunctionCostQueryDefinition dataSource(MonitorFormulaAndFunctionCostDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * <p>Data source for cost queries.</p>
   * @return dataSource
  **/
      @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public MonitorFormulaAndFunctionCostDataSource getDataSource() {
        return dataSource;
      }
  public void setDataSource(MonitorFormulaAndFunctionCostDataSource dataSource) {
    if (!dataSource.isValid()) {
        this.unparsed = true;
    }
    this.dataSource = dataSource;
  }
  public MonitorFormulaAndFunctionCostQueryDefinition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the query for use in formulas.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public MonitorFormulaAndFunctionCostQueryDefinition query(String query) {
    this.query = query;
    return this;
  }

  /**
   * <p>The monitor query.</p>
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
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return MonitorFormulaAndFunctionCostQueryDefinition
   */
  @JsonAnySetter
  public MonitorFormulaAndFunctionCostQueryDefinition putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this MonitorFormulaAndFunctionCostQueryDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorFormulaAndFunctionCostQueryDefinition monitorFormulaAndFunctionCostQueryDefinition = (MonitorFormulaAndFunctionCostQueryDefinition) o;
    return Objects.equals(this.aggregator, monitorFormulaAndFunctionCostQueryDefinition.aggregator) && Objects.equals(this.dataSource, monitorFormulaAndFunctionCostQueryDefinition.dataSource) && Objects.equals(this.name, monitorFormulaAndFunctionCostQueryDefinition.name) && Objects.equals(this.query, monitorFormulaAndFunctionCostQueryDefinition.query) && Objects.equals(this.additionalProperties, monitorFormulaAndFunctionCostQueryDefinition.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(aggregator,dataSource,name,query, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorFormulaAndFunctionCostQueryDefinition {\n");
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
