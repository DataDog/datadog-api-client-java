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
  FormulaMetricsQueryCloudCost.JSON_PROPERTY_AGGREGATOR,
  FormulaMetricsQueryCloudCost.JSON_PROPERTY_BYOC_CLUSTER,
  FormulaMetricsQueryCloudCost.JSON_PROPERTY_CROSS_ORG_UUIDS,
  FormulaMetricsQueryCloudCost.JSON_PROPERTY_DATA_SOURCE,
  FormulaMetricsQueryCloudCost.JSON_PROPERTY_NAME,
  FormulaMetricsQueryCloudCost.JSON_PROPERTY_QUERY,
  FormulaMetricsQueryCloudCost.JSON_PROPERTY_SEMANTIC_MODE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaMetricsQueryCloudCost {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATOR = "aggregator";
  private ScalarAggregator aggregator;

  public static final String JSON_PROPERTY_BYOC_CLUSTER = "byoc_cluster";
  private String byocCluster;

  public static final String JSON_PROPERTY_CROSS_ORG_UUIDS = "cross_org_uuids";
  private List<String> crossOrgUuids = null;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FormulaMetricsQueryCloudCostDataSource dataSource;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_SEMANTIC_MODE = "semantic_mode";
  private FormulaSemanticMode semanticMode;

  public FormulaMetricsQueryCloudCost() {}

  @JsonCreator
  public FormulaMetricsQueryCloudCost(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          FormulaMetricsQueryCloudCostDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.name = name;
    this.query = query;
  }

  public FormulaMetricsQueryCloudCost aggregator(ScalarAggregator aggregator) {
    this.aggregator = aggregator;
    this.unparsed |= !aggregator.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return aggregator
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGGREGATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ScalarAggregator getAggregator() {
    return aggregator;
  }

  public void setAggregator(ScalarAggregator aggregator) {
    if (!aggregator.isValid()) {
      this.unparsed = true;
    }
    this.aggregator = aggregator;
  }

  public FormulaMetricsQueryCloudCost byocCluster(String byocCluster) {
    this.byocCluster = byocCluster;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return byocCluster
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BYOC_CLUSTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getByocCluster() {
    return byocCluster;
  }

  public void setByocCluster(String byocCluster) {
    this.byocCluster = byocCluster;
  }

  public FormulaMetricsQueryCloudCost crossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
    return this;
  }

  public FormulaMetricsQueryCloudCost addCrossOrgUuidsItem(String crossOrgUuidsItem) {
    if (this.crossOrgUuids == null) {
      this.crossOrgUuids = new ArrayList<>();
    }
    this.crossOrgUuids.add(crossOrgUuidsItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public FormulaMetricsQueryCloudCost dataSource(
      FormulaMetricsQueryCloudCostDataSource dataSource) {
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
  public FormulaMetricsQueryCloudCostDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(FormulaMetricsQueryCloudCostDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public FormulaMetricsQueryCloudCost name(String name) {
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

  public FormulaMetricsQueryCloudCost query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public FormulaMetricsQueryCloudCost semanticMode(FormulaSemanticMode semanticMode) {
    this.semanticMode = semanticMode;
    this.unparsed |= !semanticMode.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return semanticMode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEMANTIC_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FormulaSemanticMode getSemanticMode() {
    return semanticMode;
  }

  public void setSemanticMode(FormulaSemanticMode semanticMode) {
    if (!semanticMode.isValid()) {
      this.unparsed = true;
    }
    this.semanticMode = semanticMode;
  }

  /** Return true if this FormulaMetricsQueryCloudCost object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaMetricsQueryCloudCost formulaMetricsQueryCloudCost = (FormulaMetricsQueryCloudCost) o;
    return Objects.equals(this.aggregator, formulaMetricsQueryCloudCost.aggregator)
        && Objects.equals(this.byocCluster, formulaMetricsQueryCloudCost.byocCluster)
        && Objects.equals(this.crossOrgUuids, formulaMetricsQueryCloudCost.crossOrgUuids)
        && Objects.equals(this.dataSource, formulaMetricsQueryCloudCost.dataSource)
        && Objects.equals(this.name, formulaMetricsQueryCloudCost.name)
        && Objects.equals(this.query, formulaMetricsQueryCloudCost.query)
        && Objects.equals(this.semanticMode, formulaMetricsQueryCloudCost.semanticMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aggregator, byocCluster, crossOrgUuids, dataSource, name, query, semanticMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaMetricsQueryCloudCost {\n");
    sb.append("    aggregator: ").append(toIndentedString(aggregator)).append("\n");
    sb.append("    byocCluster: ").append(toIndentedString(byocCluster)).append("\n");
    sb.append("    crossOrgUuids: ").append(toIndentedString(crossOrgUuids)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    semanticMode: ").append(toIndentedString(semanticMode)).append("\n");
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
