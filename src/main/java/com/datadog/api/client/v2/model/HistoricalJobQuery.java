/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
   * <p>Query for selecting logs analyzed by the historical job.</p>
 */
@JsonPropertyOrder({
  HistoricalJobQuery.JSON_PROPERTY_ADDITIONAL_FILTERS,
  HistoricalJobQuery.JSON_PROPERTY_AGGREGATION,
  HistoricalJobQuery.JSON_PROPERTY_CORRELATED_BY_FIELDS,
  HistoricalJobQuery.JSON_PROPERTY_CORRELATED_QUERY_INDEX,
  HistoricalJobQuery.JSON_PROPERTY_CUSTOM_QUERY_EXTENSION,
  HistoricalJobQuery.JSON_PROPERTY_DATA_SOURCE,
  HistoricalJobQuery.JSON_PROPERTY_DATASET_IDS,
  HistoricalJobQuery.JSON_PROPERTY_DISTINCT_FIELDS,
  HistoricalJobQuery.JSON_PROPERTY_GROUP_BY_FIELDS,
  HistoricalJobQuery.JSON_PROPERTY_HAS_OPTIONAL_GROUP_BY_FIELDS,
  HistoricalJobQuery.JSON_PROPERTY_INDEX,
  HistoricalJobQuery.JSON_PROPERTY_INDEXES,
  HistoricalJobQuery.JSON_PROPERTY_METRICS,
  HistoricalJobQuery.JSON_PROPERTY_NAME,
  HistoricalJobQuery.JSON_PROPERTY_QUERY,
  HistoricalJobQuery.JSON_PROPERTY_QUERY_LANGUAGE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HistoricalJobQuery {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADDITIONAL_FILTERS = "additionalFilters";
  private String additionalFilters;

  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private SecurityMonitoringRuleQueryAggregation aggregation;

  public static final String JSON_PROPERTY_CORRELATED_BY_FIELDS = "correlatedByFields";
  private List<String> correlatedByFields = null;

  public static final String JSON_PROPERTY_CORRELATED_QUERY_INDEX = "correlatedQueryIndex";
  private Long correlatedQueryIndex;

  public static final String JSON_PROPERTY_CUSTOM_QUERY_EXTENSION = "customQueryExtension";
  private String customQueryExtension;

  public static final String JSON_PROPERTY_DATA_SOURCE = "dataSource";
  private SecurityMonitoringStandardDataSource dataSource = SecurityMonitoringStandardDataSource.LOGS;

  public static final String JSON_PROPERTY_DATASET_IDS = "datasetIds";
  private List<String> datasetIds = null;

  public static final String JSON_PROPERTY_DISTINCT_FIELDS = "distinctFields";
  private List<String> distinctFields = null;

  public static final String JSON_PROPERTY_GROUP_BY_FIELDS = "groupByFields";
  private List<String> groupByFields = null;

  public static final String JSON_PROPERTY_HAS_OPTIONAL_GROUP_BY_FIELDS = "hasOptionalGroupByFields";
  private Boolean hasOptionalGroupByFields = false;

  public static final String JSON_PROPERTY_INDEX = "index";
  private String index;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = null;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private List<String> metrics = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_QUERY_LANGUAGE = "queryLanguage";
  private String queryLanguage;

  public HistoricalJobQuery additionalFilters(String additionalFilters) {
    this.additionalFilters = additionalFilters;
    return this;
  }

  /**
   * <p>Additional filters appended to the query at evaluation time.</p>
   * @return additionalFilters
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ADDITIONAL_FILTERS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAdditionalFilters() {
        return additionalFilters;
      }
  public void setAdditionalFilters(String additionalFilters) {
    this.additionalFilters = additionalFilters;
  }
  public HistoricalJobQuery aggregation(SecurityMonitoringRuleQueryAggregation aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
    return this;
  }

  /**
   * <p>The aggregation type.</p>
   * @return aggregation
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AGGREGATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SecurityMonitoringRuleQueryAggregation getAggregation() {
        return aggregation;
      }
  public void setAggregation(SecurityMonitoringRuleQueryAggregation aggregation) {
    if (!aggregation.isValid()) {
        this.unparsed = true;
    }
    this.aggregation = aggregation;
  }
  public HistoricalJobQuery correlatedByFields(List<String> correlatedByFields) {
    this.correlatedByFields = correlatedByFields;
    return this;
  }
  public HistoricalJobQuery addCorrelatedByFieldsItem(String correlatedByFieldsItem) {
    if (this.correlatedByFields == null) {
      this.correlatedByFields = new ArrayList<>();
    }
    this.correlatedByFields.add(correlatedByFieldsItem);
    return this;
  }

  /**
   * <p>Fields used to correlate results across queries in sequence detection rules.</p>
   * @return correlatedByFields
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CORRELATED_BY_FIELDS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getCorrelatedByFields() {
        return correlatedByFields;
      }
  public void setCorrelatedByFields(List<String> correlatedByFields) {
    this.correlatedByFields = correlatedByFields;
  }
  public HistoricalJobQuery correlatedQueryIndex(Long correlatedQueryIndex) {
    this.correlatedQueryIndex = correlatedQueryIndex;
    return this;
  }

  /**
   * <p>Zero-based index of the query to correlate with in sequence detection rules. Up to 10 queries are supported, so valid values are 0 to 9.</p>
   * minimum: 0
   * maximum: 9
   * @return correlatedQueryIndex
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CORRELATED_QUERY_INDEX)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getCorrelatedQueryIndex() {
        return correlatedQueryIndex;
      }
  public void setCorrelatedQueryIndex(Long correlatedQueryIndex) {
    this.correlatedQueryIndex = correlatedQueryIndex;
  }
  public HistoricalJobQuery customQueryExtension(String customQueryExtension) {
    this.customQueryExtension = customQueryExtension;
    return this;
  }

  /**
   * <p>Custom query extension used to refine the base query.</p>
   * @return customQueryExtension
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CUSTOM_QUERY_EXTENSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCustomQueryExtension() {
        return customQueryExtension;
      }
  public void setCustomQueryExtension(String customQueryExtension) {
    this.customQueryExtension = customQueryExtension;
  }
  public HistoricalJobQuery dataSource(SecurityMonitoringStandardDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * <p>Source of events, either logs, audit trail, security signals, or Datadog events. <code>app_sec_spans</code> is deprecated in favor of <code>spans</code>.</p>
   * @return dataSource
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SecurityMonitoringStandardDataSource getDataSource() {
        return dataSource;
      }
  public void setDataSource(SecurityMonitoringStandardDataSource dataSource) {
    if (!dataSource.isValid()) {
        this.unparsed = true;
    }
    this.dataSource = dataSource;
  }
  public HistoricalJobQuery datasetIds(List<String> datasetIds) {
    this.datasetIds = datasetIds;
    return this;
  }
  public HistoricalJobQuery addDatasetIdsItem(String datasetIdsItem) {
    if (this.datasetIds == null) {
      this.datasetIds = new ArrayList<>();
    }
    this.datasetIds.add(datasetIdsItem);
    return this;
  }

  /**
   * <p>IDs of reference datasets used by this query.</p>
   * @return datasetIds
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DATASET_IDS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getDatasetIds() {
        return datasetIds;
      }
  public void setDatasetIds(List<String> datasetIds) {
    this.datasetIds = datasetIds;
  }
  public HistoricalJobQuery distinctFields(List<String> distinctFields) {
    this.distinctFields = distinctFields;
    return this;
  }
  public HistoricalJobQuery addDistinctFieldsItem(String distinctFieldsItem) {
    if (this.distinctFields == null) {
      this.distinctFields = new ArrayList<>();
    }
    this.distinctFields.add(distinctFieldsItem);
    return this;
  }

  /**
   * <p>Field for which the cardinality is measured. Sent as an array.</p>
   * @return distinctFields
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DISTINCT_FIELDS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getDistinctFields() {
        return distinctFields;
      }
  public void setDistinctFields(List<String> distinctFields) {
    this.distinctFields = distinctFields;
  }
  public HistoricalJobQuery groupByFields(List<String> groupByFields) {
    this.groupByFields = groupByFields;
    return this;
  }
  public HistoricalJobQuery addGroupByFieldsItem(String groupByFieldsItem) {
    if (this.groupByFields == null) {
      this.groupByFields = new ArrayList<>();
    }
    this.groupByFields.add(groupByFieldsItem);
    return this;
  }

  /**
   * <p>Fields to group by.</p>
   * @return groupByFields
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GROUP_BY_FIELDS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getGroupByFields() {
        return groupByFields;
      }
  public void setGroupByFields(List<String> groupByFields) {
    this.groupByFields = groupByFields;
  }
  public HistoricalJobQuery hasOptionalGroupByFields(Boolean hasOptionalGroupByFields) {
    this.hasOptionalGroupByFields = hasOptionalGroupByFields;
    return this;
  }

  /**
   * <p>When false, events without a group-by value are ignored by the query. When true, events with missing group-by fields are processed with <code>N/A</code>, replacing the missing values.</p>
   * @return hasOptionalGroupByFields
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HAS_OPTIONAL_GROUP_BY_FIELDS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getHasOptionalGroupByFields() {
        return hasOptionalGroupByFields;
      }
  public void setHasOptionalGroupByFields(Boolean hasOptionalGroupByFields) {
    this.hasOptionalGroupByFields = hasOptionalGroupByFields;
  }
  public HistoricalJobQuery index(String index) {
    this.index = index;
    return this;
  }

  /**
   * <p>Index used to load the data for this query.</p>
   * @return index
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INDEX)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getIndex() {
        return index;
      }
  public void setIndex(String index) {
    this.index = index;
  }
  public HistoricalJobQuery indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }
  public HistoricalJobQuery addIndexesItem(String indexesItem) {
    if (this.indexes == null) {
      this.indexes = new ArrayList<>();
    }
    this.indexes.add(indexesItem);
    return this;
  }

  /**
   * <p>Indexes used to load the data for this query. Mutually exclusive with <code>index</code>.</p>
   * @return indexes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INDEXES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getIndexes() {
        return indexes;
      }
  public void setIndexes(List<String> indexes) {
    this.indexes = indexes;
  }
  public HistoricalJobQuery metrics(List<String> metrics) {
    this.metrics = metrics;
    return this;
  }
  public HistoricalJobQuery addMetricsItem(String metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

  /**
   * <p>Group of target fields to aggregate over when using the sum, max, geo data, or new value aggregations. The sum, max, and geo data aggregations only accept one value in this list, whereas the new value aggregation accepts up to five values.</p>
   * @return metrics
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_METRICS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getMetrics() {
        return metrics;
      }
  public void setMetrics(List<String> metrics) {
    this.metrics = metrics;
  }
  public HistoricalJobQuery name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the query.</p>
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
  public HistoricalJobQuery query(String query) {
    this.query = query;
    return this;
  }

  /**
   * <p>Query to run on logs.</p>
   * @return query
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getQuery() {
        return query;
      }
  public void setQuery(String query) {
    this.query = query;
  }
  public HistoricalJobQuery queryLanguage(String queryLanguage) {
    this.queryLanguage = queryLanguage;
    return this;
  }

  /**
   * <p>Language used to parse the query string.</p>
   * @return queryLanguage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_QUERY_LANGUAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getQueryLanguage() {
        return queryLanguage;
      }
  public void setQueryLanguage(String queryLanguage) {
    this.queryLanguage = queryLanguage;
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
   * @return HistoricalJobQuery
   */
  @JsonAnySetter
  public HistoricalJobQuery putAdditionalProperty(String key, Object value) {
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
   * Return true if this HistoricalJobQuery object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalJobQuery historicalJobQuery = (HistoricalJobQuery) o;
    return Objects.equals(this.additionalFilters, historicalJobQuery.additionalFilters) && Objects.equals(this.aggregation, historicalJobQuery.aggregation) && Objects.equals(this.correlatedByFields, historicalJobQuery.correlatedByFields) && Objects.equals(this.correlatedQueryIndex, historicalJobQuery.correlatedQueryIndex) && Objects.equals(this.customQueryExtension, historicalJobQuery.customQueryExtension) && Objects.equals(this.dataSource, historicalJobQuery.dataSource) && Objects.equals(this.datasetIds, historicalJobQuery.datasetIds) && Objects.equals(this.distinctFields, historicalJobQuery.distinctFields) && Objects.equals(this.groupByFields, historicalJobQuery.groupByFields) && Objects.equals(this.hasOptionalGroupByFields, historicalJobQuery.hasOptionalGroupByFields) && Objects.equals(this.index, historicalJobQuery.index) && Objects.equals(this.indexes, historicalJobQuery.indexes) && Objects.equals(this.metrics, historicalJobQuery.metrics) && Objects.equals(this.name, historicalJobQuery.name) && Objects.equals(this.query, historicalJobQuery.query) && Objects.equals(this.queryLanguage, historicalJobQuery.queryLanguage) && Objects.equals(this.additionalProperties, historicalJobQuery.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(additionalFilters,aggregation,correlatedByFields,correlatedQueryIndex,customQueryExtension,dataSource,datasetIds,distinctFields,groupByFields,hasOptionalGroupByFields,index,indexes,metrics,name,query,queryLanguage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalJobQuery {\n");
    sb.append("    additionalFilters: ").append(toIndentedString(additionalFilters)).append("\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    correlatedByFields: ").append(toIndentedString(correlatedByFields)).append("\n");
    sb.append("    correlatedQueryIndex: ").append(toIndentedString(correlatedQueryIndex)).append("\n");
    sb.append("    customQueryExtension: ").append(toIndentedString(customQueryExtension)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    datasetIds: ").append(toIndentedString(datasetIds)).append("\n");
    sb.append("    distinctFields: ").append(toIndentedString(distinctFields)).append("\n");
    sb.append("    groupByFields: ").append(toIndentedString(groupByFields)).append("\n");
    sb.append("    hasOptionalGroupByFields: ").append(toIndentedString(hasOptionalGroupByFields)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    queryLanguage: ").append(toIndentedString(queryLanguage)).append("\n");
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
