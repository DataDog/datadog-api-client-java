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

/** A formula and functions Product Analytics Extended query for advanced analytics features. */
@JsonPropertyOrder({
  FormulaAndFunctionProductAnalyticsExtendedQueryDefinition.JSON_PROPERTY_AUDIENCE_FILTERS,
  FormulaAndFunctionProductAnalyticsExtendedQueryDefinition.JSON_PROPERTY_COMPUTE,
  FormulaAndFunctionProductAnalyticsExtendedQueryDefinition.JSON_PROPERTY_DATA_SOURCE,
  FormulaAndFunctionProductAnalyticsExtendedQueryDefinition.JSON_PROPERTY_GROUP_BY,
  FormulaAndFunctionProductAnalyticsExtendedQueryDefinition.JSON_PROPERTY_INDEXES,
  FormulaAndFunctionProductAnalyticsExtendedQueryDefinition.JSON_PROPERTY_NAME,
  FormulaAndFunctionProductAnalyticsExtendedQueryDefinition.JSON_PROPERTY_QUERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaAndFunctionProductAnalyticsExtendedQueryDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUDIENCE_FILTERS = "audience_filters";
  private ProductAnalyticsAudienceFilters audienceFilters;

  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private ProductAnalyticsExtendedCompute compute;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FormulaAndFunctionProductAnalyticsExtendedDataSource dataSource;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<ProductAnalyticsExtendedGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<FormulaAndFunctionProductAnalyticsExtendedQueryDefinitionIndexesItems> indexes =
      null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private ProductAnalyticsBaseQuery query;

  public FormulaAndFunctionProductAnalyticsExtendedQueryDefinition() {}

  @JsonCreator
  public FormulaAndFunctionProductAnalyticsExtendedQueryDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPUTE)
          ProductAnalyticsExtendedCompute compute,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          FormulaAndFunctionProductAnalyticsExtendedDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) ProductAnalyticsBaseQuery query) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.name = name;
    this.query = query;
    this.unparsed |= query.unparsed;
  }

  public FormulaAndFunctionProductAnalyticsExtendedQueryDefinition audienceFilters(
      ProductAnalyticsAudienceFilters audienceFilters) {
    this.audienceFilters = audienceFilters;
    this.unparsed |= audienceFilters.unparsed;
    return this;
  }

  /**
   * Product Analytics/RUM audience filters.
   *
   * @return audienceFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsAudienceFilters getAudienceFilters() {
    return audienceFilters;
  }

  public void setAudienceFilters(ProductAnalyticsAudienceFilters audienceFilters) {
    this.audienceFilters = audienceFilters;
  }

  public FormulaAndFunctionProductAnalyticsExtendedQueryDefinition compute(
      ProductAnalyticsExtendedCompute compute) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    return this;
  }

  /**
   * Compute configuration for Product Analytics Extended queries.
   *
   * @return compute
   */
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsExtendedCompute getCompute() {
    return compute;
  }

  public void setCompute(ProductAnalyticsExtendedCompute compute) {
    this.compute = compute;
  }

  public FormulaAndFunctionProductAnalyticsExtendedQueryDefinition dataSource(
      FormulaAndFunctionProductAnalyticsExtendedDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Data source for Product Analytics Extended queries.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormulaAndFunctionProductAnalyticsExtendedDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(FormulaAndFunctionProductAnalyticsExtendedDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public FormulaAndFunctionProductAnalyticsExtendedQueryDefinition groupBy(
      List<ProductAnalyticsExtendedGroupBy> groupBy) {
    this.groupBy = groupBy;
    for (ProductAnalyticsExtendedGroupBy item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FormulaAndFunctionProductAnalyticsExtendedQueryDefinition addGroupByItem(
      ProductAnalyticsExtendedGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * Group by configuration.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ProductAnalyticsExtendedGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<ProductAnalyticsExtendedGroupBy> groupBy) {
    this.groupBy = groupBy;
  }

  public FormulaAndFunctionProductAnalyticsExtendedQueryDefinition indexes(
      List<FormulaAndFunctionProductAnalyticsExtendedQueryDefinitionIndexesItems> indexes) {
    this.indexes = indexes;
    return this;
  }

  public FormulaAndFunctionProductAnalyticsExtendedQueryDefinition addIndexesItem(
      FormulaAndFunctionProductAnalyticsExtendedQueryDefinitionIndexesItems indexesItem) {
    if (this.indexes == null) {
      this.indexes = new ArrayList<>();
    }
    this.indexes.add(indexesItem);
    this.unparsed |= !indexesItem.isValid();
    return this;
  }

  /**
   * Event indexes to query.
   *
   * @return indexes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FormulaAndFunctionProductAnalyticsExtendedQueryDefinitionIndexesItems> getIndexes() {
    return indexes;
  }

  public void setIndexes(
      List<FormulaAndFunctionProductAnalyticsExtendedQueryDefinitionIndexesItems> indexes) {
    this.indexes = indexes;
  }

  public FormulaAndFunctionProductAnalyticsExtendedQueryDefinition name(String name) {
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

  public FormulaAndFunctionProductAnalyticsExtendedQueryDefinition query(
      ProductAnalyticsBaseQuery query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * Product Analytics event query.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsBaseQuery getQuery() {
    return query;
  }

  public void setQuery(ProductAnalyticsBaseQuery query) {
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
   * @return FormulaAndFunctionProductAnalyticsExtendedQueryDefinition
   */
  @JsonAnySetter
  public FormulaAndFunctionProductAnalyticsExtendedQueryDefinition putAdditionalProperty(
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

  /**
   * Return true if this FormulaAndFunctionProductAnalyticsExtendedQueryDefinition object is equal
   * to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaAndFunctionProductAnalyticsExtendedQueryDefinition
        formulaAndFunctionProductAnalyticsExtendedQueryDefinition =
            (FormulaAndFunctionProductAnalyticsExtendedQueryDefinition) o;
    return Objects.equals(
            this.audienceFilters,
            formulaAndFunctionProductAnalyticsExtendedQueryDefinition.audienceFilters)
        && Objects.equals(
            this.compute, formulaAndFunctionProductAnalyticsExtendedQueryDefinition.compute)
        && Objects.equals(
            this.dataSource, formulaAndFunctionProductAnalyticsExtendedQueryDefinition.dataSource)
        && Objects.equals(
            this.groupBy, formulaAndFunctionProductAnalyticsExtendedQueryDefinition.groupBy)
        && Objects.equals(
            this.indexes, formulaAndFunctionProductAnalyticsExtendedQueryDefinition.indexes)
        && Objects.equals(this.name, formulaAndFunctionProductAnalyticsExtendedQueryDefinition.name)
        && Objects.equals(
            this.query, formulaAndFunctionProductAnalyticsExtendedQueryDefinition.query)
        && Objects.equals(
            this.additionalProperties,
            formulaAndFunctionProductAnalyticsExtendedQueryDefinition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        audienceFilters, compute, dataSource, groupBy, indexes, name, query, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaAndFunctionProductAnalyticsExtendedQueryDefinition {\n");
    sb.append("    audienceFilters: ").append(toIndentedString(audienceFilters)).append("\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
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
