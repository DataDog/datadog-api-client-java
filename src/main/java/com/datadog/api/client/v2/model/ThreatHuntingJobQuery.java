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
   * <p>Query for selecting logs analyzed by the threat hunting job.</p>
 */
@JsonPropertyOrder({
  ThreatHuntingJobQuery.JSON_PROPERTY_AGGREGATION,
  ThreatHuntingJobQuery.JSON_PROPERTY_DATA_SOURCE,
  ThreatHuntingJobQuery.JSON_PROPERTY_DISTINCT_FIELDS,
  ThreatHuntingJobQuery.JSON_PROPERTY_GROUP_BY_FIELDS,
  ThreatHuntingJobQuery.JSON_PROPERTY_HAS_OPTIONAL_GROUP_BY_FIELDS,
  ThreatHuntingJobQuery.JSON_PROPERTY_METRICS,
  ThreatHuntingJobQuery.JSON_PROPERTY_NAME,
  ThreatHuntingJobQuery.JSON_PROPERTY_QUERY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ThreatHuntingJobQuery {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private SecurityMonitoringRuleQueryAggregation aggregation;

  public static final String JSON_PROPERTY_DATA_SOURCE = "dataSource";
  private SecurityMonitoringStandardDataSource dataSource = SecurityMonitoringStandardDataSource.LOGS;

  public static final String JSON_PROPERTY_DISTINCT_FIELDS = "distinctFields";
  private List<String> distinctFields = null;

  public static final String JSON_PROPERTY_GROUP_BY_FIELDS = "groupByFields";
  private List<String> groupByFields = null;

  public static final String JSON_PROPERTY_HAS_OPTIONAL_GROUP_BY_FIELDS = "hasOptionalGroupByFields";
  private Boolean hasOptionalGroupByFields = false;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private List<String> metrics = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public ThreatHuntingJobQuery aggregation(SecurityMonitoringRuleQueryAggregation aggregation) {
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
  public ThreatHuntingJobQuery dataSource(SecurityMonitoringStandardDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * <p>Source of events, either logs, audit trail, or Datadog events.</p>
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
  public ThreatHuntingJobQuery distinctFields(List<String> distinctFields) {
    this.distinctFields = distinctFields;
    return this;
  }
  public ThreatHuntingJobQuery addDistinctFieldsItem(String distinctFieldsItem) {
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
  public ThreatHuntingJobQuery groupByFields(List<String> groupByFields) {
    this.groupByFields = groupByFields;
    return this;
  }
  public ThreatHuntingJobQuery addGroupByFieldsItem(String groupByFieldsItem) {
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
  public ThreatHuntingJobQuery hasOptionalGroupByFields(Boolean hasOptionalGroupByFields) {
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
  public ThreatHuntingJobQuery metrics(List<String> metrics) {
    this.metrics = metrics;
    return this;
  }
  public ThreatHuntingJobQuery addMetricsItem(String metricsItem) {
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
  public ThreatHuntingJobQuery name(String name) {
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
  public ThreatHuntingJobQuery query(String query) {
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
   * @return ThreatHuntingJobQuery
   */
  @JsonAnySetter
  public ThreatHuntingJobQuery putAdditionalProperty(String key, Object value) {
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
   * Return true if this ThreatHuntingJobQuery object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreatHuntingJobQuery threatHuntingJobQuery = (ThreatHuntingJobQuery) o;
    return Objects.equals(this.aggregation, threatHuntingJobQuery.aggregation) && Objects.equals(this.dataSource, threatHuntingJobQuery.dataSource) && Objects.equals(this.distinctFields, threatHuntingJobQuery.distinctFields) && Objects.equals(this.groupByFields, threatHuntingJobQuery.groupByFields) && Objects.equals(this.hasOptionalGroupByFields, threatHuntingJobQuery.hasOptionalGroupByFields) && Objects.equals(this.metrics, threatHuntingJobQuery.metrics) && Objects.equals(this.name, threatHuntingJobQuery.name) && Objects.equals(this.query, threatHuntingJobQuery.query) && Objects.equals(this.additionalProperties, threatHuntingJobQuery.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(aggregation,dataSource,distinctFields,groupByFields,hasOptionalGroupByFields,metrics,name,query, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreatHuntingJobQuery {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    distinctFields: ").append(toIndentedString(distinctFields)).append("\n");
    sb.append("    groupByFields: ").append(toIndentedString(groupByFields)).append("\n");
    sb.append("    hasOptionalGroupByFields: ").append(toIndentedString(hasOptionalGroupByFields)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
