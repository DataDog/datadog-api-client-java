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
   * <p>A formula and functions metrics query.</p>
 */
@JsonPropertyOrder({
  FormulaAndFunctionMetricQueryDefinition.JSON_PROPERTY_AGGREGATOR,
  FormulaAndFunctionMetricQueryDefinition.JSON_PROPERTY_CROSS_ORG_UUIDS,
  FormulaAndFunctionMetricQueryDefinition.JSON_PROPERTY_DATA_SOURCE,
  FormulaAndFunctionMetricQueryDefinition.JSON_PROPERTY_NAME,
  FormulaAndFunctionMetricQueryDefinition.JSON_PROPERTY_QUERY,
  FormulaAndFunctionMetricQueryDefinition.JSON_PROPERTY_SEMANTIC_MODE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaAndFunctionMetricQueryDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATOR = "aggregator";
  private FormulaAndFunctionMetricAggregation aggregator;

  public static final String JSON_PROPERTY_CROSS_ORG_UUIDS = "cross_org_uuids";
  private List<String> crossOrgUuids = null;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FormulaAndFunctionMetricDataSource dataSource;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_SEMANTIC_MODE = "semantic_mode";
  private FormulaAndFunctionMetricSemanticMode semanticMode;

  public FormulaAndFunctionMetricQueryDefinition() {}

  @JsonCreator
  public FormulaAndFunctionMetricQueryDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_DATA_SOURCE)FormulaAndFunctionMetricDataSource dataSource,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_QUERY)String query) {
        this.dataSource = dataSource;
        this.unparsed |= !dataSource.isValid();
        this.name = name;
        this.query = query;
  }
  public FormulaAndFunctionMetricQueryDefinition aggregator(FormulaAndFunctionMetricAggregation aggregator) {
    this.aggregator = aggregator;
    this.unparsed |= !aggregator.isValid();
    return this;
  }

  /**
   * <p>The aggregation methods available for metrics queries.</p>
   * @return aggregator
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AGGREGATOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public FormulaAndFunctionMetricAggregation getAggregator() {
        return aggregator;
      }
  public void setAggregator(FormulaAndFunctionMetricAggregation aggregator) {
    if (!aggregator.isValid()) {
        this.unparsed = true;
    }
    this.aggregator = aggregator;
  }
  public FormulaAndFunctionMetricQueryDefinition crossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
    return this;
  }
  public FormulaAndFunctionMetricQueryDefinition addCrossOrgUuidsItem(String crossOrgUuidsItem) {
    if (this.crossOrgUuids == null) {
      this.crossOrgUuids = new ArrayList<>();
    }
    this.crossOrgUuids.add(crossOrgUuidsItem);
    return this;
  }

  /**
   * <p>The source organization UUID for cross organization queries. Feature in Private Beta.</p>
   * @return crossOrgUuids
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CROSS_ORG_UUIDS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getCrossOrgUuids() {
        return crossOrgUuids;
      }
  public void setCrossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
  }
  public FormulaAndFunctionMetricQueryDefinition dataSource(FormulaAndFunctionMetricDataSource dataSource) {
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
      public FormulaAndFunctionMetricDataSource getDataSource() {
        return dataSource;
      }
  public void setDataSource(FormulaAndFunctionMetricDataSource dataSource) {
    if (!dataSource.isValid()) {
        this.unparsed = true;
    }
    this.dataSource = dataSource;
  }
  public FormulaAndFunctionMetricQueryDefinition name(String name) {
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
  public FormulaAndFunctionMetricQueryDefinition query(String query) {
    this.query = query;
    return this;
  }

  /**
   * <p>Metrics query definition.</p>
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
  public FormulaAndFunctionMetricQueryDefinition semanticMode(FormulaAndFunctionMetricSemanticMode semanticMode) {
    this.semanticMode = semanticMode;
    this.unparsed |= !semanticMode.isValid();
    return this;
  }

  /**
   * <p>Semantic mode for metrics queries. This determines how metrics from different sources are combined or displayed.</p>
   * @return semanticMode
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SEMANTIC_MODE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public FormulaAndFunctionMetricSemanticMode getSemanticMode() {
        return semanticMode;
      }
  public void setSemanticMode(FormulaAndFunctionMetricSemanticMode semanticMode) {
    if (!semanticMode.isValid()) {
        this.unparsed = true;
    }
    this.semanticMode = semanticMode;
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
   * @return FormulaAndFunctionMetricQueryDefinition
   */
  @JsonAnySetter
  public FormulaAndFunctionMetricQueryDefinition putAdditionalProperty(String key, Object value) {
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
   * Return true if this FormulaAndFunctionMetricQueryDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaAndFunctionMetricQueryDefinition formulaAndFunctionMetricQueryDefinition = (FormulaAndFunctionMetricQueryDefinition) o;
    return Objects.equals(this.aggregator, formulaAndFunctionMetricQueryDefinition.aggregator) && Objects.equals(this.crossOrgUuids, formulaAndFunctionMetricQueryDefinition.crossOrgUuids) && Objects.equals(this.dataSource, formulaAndFunctionMetricQueryDefinition.dataSource) && Objects.equals(this.name, formulaAndFunctionMetricQueryDefinition.name) && Objects.equals(this.query, formulaAndFunctionMetricQueryDefinition.query) && Objects.equals(this.semanticMode, formulaAndFunctionMetricQueryDefinition.semanticMode) && Objects.equals(this.additionalProperties, formulaAndFunctionMetricQueryDefinition.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(aggregator,crossOrgUuids,dataSource,name,query,semanticMode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaAndFunctionMetricQueryDefinition {\n");
    sb.append("    aggregator: ").append(toIndentedString(aggregator)).append("\n");
    sb.append("    crossOrgUuids: ").append(toIndentedString(crossOrgUuids)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    semanticMode: ").append(toIndentedString(semanticMode)).append("\n");
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
