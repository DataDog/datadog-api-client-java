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
   * <p>Process query using formulas and functions.</p>
 */
@JsonPropertyOrder({
  FormulaAndFunctionProcessQueryDefinition.JSON_PROPERTY_AGGREGATOR,
  FormulaAndFunctionProcessQueryDefinition.JSON_PROPERTY_CROSS_ORG_UUIDS,
  FormulaAndFunctionProcessQueryDefinition.JSON_PROPERTY_DATA_SOURCE,
  FormulaAndFunctionProcessQueryDefinition.JSON_PROPERTY_IS_NORMALIZED_CPU,
  FormulaAndFunctionProcessQueryDefinition.JSON_PROPERTY_LIMIT,
  FormulaAndFunctionProcessQueryDefinition.JSON_PROPERTY_METRIC,
  FormulaAndFunctionProcessQueryDefinition.JSON_PROPERTY_NAME,
  FormulaAndFunctionProcessQueryDefinition.JSON_PROPERTY_SORT,
  FormulaAndFunctionProcessQueryDefinition.JSON_PROPERTY_TAG_FILTERS,
  FormulaAndFunctionProcessQueryDefinition.JSON_PROPERTY_TEXT_FILTER
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaAndFunctionProcessQueryDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATOR = "aggregator";
  private FormulaAndFunctionMetricAggregation aggregator;

  public static final String JSON_PROPERTY_CROSS_ORG_UUIDS = "cross_org_uuids";
  private List<String> crossOrgUuids = null;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FormulaAndFunctionProcessQueryDataSource dataSource;

  public static final String JSON_PROPERTY_IS_NORMALIZED_CPU = "is_normalized_cpu";
  private Boolean isNormalizedCpu;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SORT = "sort";
  private QuerySortOrder sort = QuerySortOrder.DESC;

  public static final String JSON_PROPERTY_TAG_FILTERS = "tag_filters";
  private List<String> tagFilters = null;

  public static final String JSON_PROPERTY_TEXT_FILTER = "text_filter";
  private String textFilter;

  public FormulaAndFunctionProcessQueryDefinition() {}

  @JsonCreator
  public FormulaAndFunctionProcessQueryDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_DATA_SOURCE)FormulaAndFunctionProcessQueryDataSource dataSource,
            @JsonProperty(required=true, value=JSON_PROPERTY_METRIC)String metric,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name) {
        this.dataSource = dataSource;
        this.unparsed |= !dataSource.isValid();
        this.metric = metric;
        this.name = name;
  }
  public FormulaAndFunctionProcessQueryDefinition aggregator(FormulaAndFunctionMetricAggregation aggregator) {
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
  public FormulaAndFunctionProcessQueryDefinition crossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
    return this;
  }
  public FormulaAndFunctionProcessQueryDefinition addCrossOrgUuidsItem(String crossOrgUuidsItem) {
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
  public FormulaAndFunctionProcessQueryDefinition dataSource(FormulaAndFunctionProcessQueryDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * <p>Data sources that rely on the process backend.</p>
   * @return dataSource
  **/
      @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public FormulaAndFunctionProcessQueryDataSource getDataSource() {
        return dataSource;
      }
  public void setDataSource(FormulaAndFunctionProcessQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
        this.unparsed = true;
    }
    this.dataSource = dataSource;
  }
  public FormulaAndFunctionProcessQueryDefinition isNormalizedCpu(Boolean isNormalizedCpu) {
    this.isNormalizedCpu = isNormalizedCpu;
    return this;
  }

  /**
   * <p>Whether to normalize the CPU percentages.</p>
   * @return isNormalizedCpu
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_NORMALIZED_CPU)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsNormalizedCpu() {
        return isNormalizedCpu;
      }
  public void setIsNormalizedCpu(Boolean isNormalizedCpu) {
    this.isNormalizedCpu = isNormalizedCpu;
  }
  public FormulaAndFunctionProcessQueryDefinition limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <p>Number of hits to return.</p>
   * @return limit
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LIMIT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getLimit() {
        return limit;
      }
  public void setLimit(Long limit) {
    this.limit = limit;
  }
  public FormulaAndFunctionProcessQueryDefinition metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * <p>Process metric name.</p>
   * @return metric
  **/
      @JsonProperty(JSON_PROPERTY_METRIC)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getMetric() {
        return metric;
      }
  public void setMetric(String metric) {
    this.metric = metric;
  }
  public FormulaAndFunctionProcessQueryDefinition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of query for use in formulas.</p>
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
  public FormulaAndFunctionProcessQueryDefinition sort(QuerySortOrder sort) {
    this.sort = sort;
    this.unparsed |= !sort.isValid();
    return this;
  }

  /**
   * <p>Direction of sort.</p>
   * @return sort
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SORT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public QuerySortOrder getSort() {
        return sort;
      }
  public void setSort(QuerySortOrder sort) {
    if (!sort.isValid()) {
        this.unparsed = true;
    }
    this.sort = sort;
  }
  public FormulaAndFunctionProcessQueryDefinition tagFilters(List<String> tagFilters) {
    this.tagFilters = tagFilters;
    return this;
  }
  public FormulaAndFunctionProcessQueryDefinition addTagFiltersItem(String tagFiltersItem) {
    if (this.tagFilters == null) {
      this.tagFilters = new ArrayList<>();
    }
    this.tagFilters.add(tagFiltersItem);
    return this;
  }

  /**
   * <p>An array of tags to filter by.</p>
   * @return tagFilters
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAG_FILTERS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getTagFilters() {
        return tagFilters;
      }
  public void setTagFilters(List<String> tagFilters) {
    this.tagFilters = tagFilters;
  }
  public FormulaAndFunctionProcessQueryDefinition textFilter(String textFilter) {
    this.textFilter = textFilter;
    return this;
  }

  /**
   * <p>Text to use as filter.</p>
   * @return textFilter
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TEXT_FILTER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTextFilter() {
        return textFilter;
      }
  public void setTextFilter(String textFilter) {
    this.textFilter = textFilter;
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
   * @return FormulaAndFunctionProcessQueryDefinition
   */
  @JsonAnySetter
  public FormulaAndFunctionProcessQueryDefinition putAdditionalProperty(String key, Object value) {
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
   * Return true if this FormulaAndFunctionProcessQueryDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaAndFunctionProcessQueryDefinition formulaAndFunctionProcessQueryDefinition = (FormulaAndFunctionProcessQueryDefinition) o;
    return Objects.equals(this.aggregator, formulaAndFunctionProcessQueryDefinition.aggregator) && Objects.equals(this.crossOrgUuids, formulaAndFunctionProcessQueryDefinition.crossOrgUuids) && Objects.equals(this.dataSource, formulaAndFunctionProcessQueryDefinition.dataSource) && Objects.equals(this.isNormalizedCpu, formulaAndFunctionProcessQueryDefinition.isNormalizedCpu) && Objects.equals(this.limit, formulaAndFunctionProcessQueryDefinition.limit) && Objects.equals(this.metric, formulaAndFunctionProcessQueryDefinition.metric) && Objects.equals(this.name, formulaAndFunctionProcessQueryDefinition.name) && Objects.equals(this.sort, formulaAndFunctionProcessQueryDefinition.sort) && Objects.equals(this.tagFilters, formulaAndFunctionProcessQueryDefinition.tagFilters) && Objects.equals(this.textFilter, formulaAndFunctionProcessQueryDefinition.textFilter) && Objects.equals(this.additionalProperties, formulaAndFunctionProcessQueryDefinition.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(aggregator,crossOrgUuids,dataSource,isNormalizedCpu,limit,metric,name,sort,tagFilters,textFilter, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaAndFunctionProcessQueryDefinition {\n");
    sb.append("    aggregator: ").append(toIndentedString(aggregator)).append("\n");
    sb.append("    crossOrgUuids: ").append(toIndentedString(crossOrgUuids)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    isNormalizedCpu: ").append(toIndentedString(isNormalizedCpu)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    tagFilters: ").append(toIndentedString(tagFilters)).append("\n");
    sb.append("    textFilter: ").append(toIndentedString(textFilter)).append("\n");
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
