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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** A query for container-level metrics such as CPU and memory usage. */
@JsonPropertyOrder({
  ContainerScalarQuery.JSON_PROPERTY_AGGREGATOR,
  ContainerScalarQuery.JSON_PROPERTY_DATA_SOURCE,
  ContainerScalarQuery.JSON_PROPERTY_IS_NORMALIZED_CPU,
  ContainerScalarQuery.JSON_PROPERTY_LIMIT,
  ContainerScalarQuery.JSON_PROPERTY_METRIC,
  ContainerScalarQuery.JSON_PROPERTY_NAME,
  ContainerScalarQuery.JSON_PROPERTY_SORT,
  ContainerScalarQuery.JSON_PROPERTY_TAG_FILTERS,
  ContainerScalarQuery.JSON_PROPERTY_TEXT_FILTER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ContainerScalarQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATOR = "aggregator";
  private MetricsAggregator aggregator = MetricsAggregator.AVG;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private ContainerDataSource dataSource = ContainerDataSource.CONTAINER;

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

  public ContainerScalarQuery() {}

  @JsonCreator
  public ContainerScalarQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          ContainerDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_METRIC) String metric,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.metric = metric;
    this.name = name;
  }

  public ContainerScalarQuery aggregator(MetricsAggregator aggregator) {
    this.aggregator = aggregator;
    this.unparsed |= !aggregator.isValid();
    return this;
  }

  /**
   * The type of aggregation that can be performed on metrics-based queries.
   *
   * @return aggregator
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGGREGATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MetricsAggregator getAggregator() {
    return aggregator;
  }

  public void setAggregator(MetricsAggregator aggregator) {
    if (!aggregator.isValid()) {
      this.unparsed = true;
    }
    this.aggregator = aggregator;
  }

  public ContainerScalarQuery dataSource(ContainerDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * A data source for container-level infrastructure metrics.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ContainerDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(ContainerDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public ContainerScalarQuery isNormalizedCpu(Boolean isNormalizedCpu) {
    this.isNormalizedCpu = isNormalizedCpu;
    return this;
  }

  /**
   * Whether CPU metrics should be normalized by core count.
   *
   * @return isNormalizedCpu
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_NORMALIZED_CPU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsNormalizedCpu() {
    return isNormalizedCpu;
  }

  public void setIsNormalizedCpu(Boolean isNormalizedCpu) {
    this.isNormalizedCpu = isNormalizedCpu;
  }

  public ContainerScalarQuery limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Maximum number of results to return.
   *
   * @return limit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public ContainerScalarQuery metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * The container metric to query.
   *
   * @return metric
   */
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMetric() {
    return metric;
  }

  public void setMetric(String metric) {
    this.metric = metric;
  }

  public ContainerScalarQuery name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The variable name for use in formulas.
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

  public ContainerScalarQuery sort(QuerySortOrder sort) {
    this.sort = sort;
    this.unparsed |= !sort.isValid();
    return this;
  }

  /**
   * Direction of sort.
   *
   * @return sort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public QuerySortOrder getSort() {
    return sort;
  }

  public void setSort(QuerySortOrder sort) {
    if (!sort.isValid()) {
      this.unparsed = true;
    }
    this.sort = sort;
  }

  public ContainerScalarQuery tagFilters(List<String> tagFilters) {
    this.tagFilters = tagFilters;
    return this;
  }

  public ContainerScalarQuery addTagFiltersItem(String tagFiltersItem) {
    if (this.tagFilters == null) {
      this.tagFilters = new ArrayList<>();
    }
    this.tagFilters.add(tagFiltersItem);
    return this;
  }

  /**
   * Tag filters to narrow down containers.
   *
   * @return tagFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTagFilters() {
    return tagFilters;
  }

  public void setTagFilters(List<String> tagFilters) {
    this.tagFilters = tagFilters;
  }

  public ContainerScalarQuery textFilter(String textFilter) {
    this.textFilter = textFilter;
    return this;
  }

  /**
   * A full-text search filter to match container names.
   *
   * @return textFilter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTextFilter() {
    return textFilter;
  }

  public void setTextFilter(String textFilter) {
    this.textFilter = textFilter;
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
   * @return ContainerScalarQuery
   */
  @JsonAnySetter
  public ContainerScalarQuery putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ContainerScalarQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerScalarQuery containerScalarQuery = (ContainerScalarQuery) o;
    return Objects.equals(this.aggregator, containerScalarQuery.aggregator)
        && Objects.equals(this.dataSource, containerScalarQuery.dataSource)
        && Objects.equals(this.isNormalizedCpu, containerScalarQuery.isNormalizedCpu)
        && Objects.equals(this.limit, containerScalarQuery.limit)
        && Objects.equals(this.metric, containerScalarQuery.metric)
        && Objects.equals(this.name, containerScalarQuery.name)
        && Objects.equals(this.sort, containerScalarQuery.sort)
        && Objects.equals(this.tagFilters, containerScalarQuery.tagFilters)
        && Objects.equals(this.textFilter, containerScalarQuery.textFilter)
        && Objects.equals(this.additionalProperties, containerScalarQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aggregator,
        dataSource,
        isNormalizedCpu,
        limit,
        metric,
        name,
        sort,
        tagFilters,
        textFilter,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerScalarQuery {\n");
    sb.append("    aggregator: ").append(toIndentedString(aggregator)).append("\n");
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
