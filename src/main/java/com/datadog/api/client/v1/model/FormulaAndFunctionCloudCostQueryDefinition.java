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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** A formula and functions Cloud Cost query. */
@JsonPropertyOrder({
  FormulaAndFunctionCloudCostQueryDefinition.JSON_PROPERTY_AGGREGATOR,
  FormulaAndFunctionCloudCostQueryDefinition.JSON_PROPERTY_CROSS_ORG_UUIDS,
  FormulaAndFunctionCloudCostQueryDefinition.JSON_PROPERTY_DATA_SOURCE,
  FormulaAndFunctionCloudCostQueryDefinition.JSON_PROPERTY_NAME,
  FormulaAndFunctionCloudCostQueryDefinition.JSON_PROPERTY_QUERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaAndFunctionCloudCostQueryDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATOR = "aggregator";
  private WidgetAggregator aggregator;

  public static final String JSON_PROPERTY_CROSS_ORG_UUIDS = "cross_org_uuids";
  private List<String> crossOrgUuids = null;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FormulaAndFunctionCloudCostDataSource dataSource;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public FormulaAndFunctionCloudCostQueryDefinition() {}

  @JsonCreator
  public FormulaAndFunctionCloudCostQueryDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          FormulaAndFunctionCloudCostDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.name = name;
    this.query = query;
  }

  public FormulaAndFunctionCloudCostQueryDefinition aggregator(WidgetAggregator aggregator) {
    this.aggregator = aggregator;
    this.unparsed |= !aggregator.isValid();
    return this;
  }

  /**
   * Aggregator used for the request.
   *
   * @return aggregator
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGGREGATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetAggregator getAggregator() {
    return aggregator;
  }

  public void setAggregator(WidgetAggregator aggregator) {
    if (!aggregator.isValid()) {
      this.unparsed = true;
    }
    this.aggregator = aggregator;
  }

  public FormulaAndFunctionCloudCostQueryDefinition crossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
    return this;
  }

  public FormulaAndFunctionCloudCostQueryDefinition addCrossOrgUuidsItem(String crossOrgUuidsItem) {
    if (this.crossOrgUuids == null) {
      this.crossOrgUuids = new ArrayList<>();
    }
    this.crossOrgUuids.add(crossOrgUuidsItem);
    return this;
  }

  /**
   * The source organization UUID for cross organization queries. Feature in Private Beta.
   *
   * @return crossOrgUuids
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CROSS_ORG_UUIDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCrossOrgUuids() {
    return crossOrgUuids;
  }

  public void setCrossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
  }

  public FormulaAndFunctionCloudCostQueryDefinition dataSource(
      FormulaAndFunctionCloudCostDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Data source for Cloud Cost queries.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormulaAndFunctionCloudCostDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(FormulaAndFunctionCloudCostDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public FormulaAndFunctionCloudCostQueryDefinition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the query for use in formulas.
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

  public FormulaAndFunctionCloudCostQueryDefinition query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Query for Cloud Cost data.
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
   * @return FormulaAndFunctionCloudCostQueryDefinition
   */
  @JsonAnySetter
  public FormulaAndFunctionCloudCostQueryDefinition putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this FormulaAndFunctionCloudCostQueryDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaAndFunctionCloudCostQueryDefinition formulaAndFunctionCloudCostQueryDefinition =
        (FormulaAndFunctionCloudCostQueryDefinition) o;
    return Objects.equals(this.aggregator, formulaAndFunctionCloudCostQueryDefinition.aggregator)
        && Objects.equals(
            this.crossOrgUuids, formulaAndFunctionCloudCostQueryDefinition.crossOrgUuids)
        && Objects.equals(this.dataSource, formulaAndFunctionCloudCostQueryDefinition.dataSource)
        && Objects.equals(this.name, formulaAndFunctionCloudCostQueryDefinition.name)
        && Objects.equals(this.query, formulaAndFunctionCloudCostQueryDefinition.query)
        && Objects.equals(
            this.additionalProperties,
            formulaAndFunctionCloudCostQueryDefinition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregator, crossOrgUuids, dataSource, name, query, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaAndFunctionCloudCostQueryDefinition {\n");
    sb.append("    aggregator: ").append(toIndentedString(aggregator)).append("\n");
    sb.append("    crossOrgUuids: ").append(toIndentedString(crossOrgUuids)).append("\n");
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
