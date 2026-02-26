/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Query for matching rule on signals. */
@JsonPropertyOrder({
  SecurityMonitoringSignalRuleResponseQuery.JSON_PROPERTY_AGGREGATION,
  SecurityMonitoringSignalRuleResponseQuery.JSON_PROPERTY_CORRELATED_BY_FIELDS,
  SecurityMonitoringSignalRuleResponseQuery.JSON_PROPERTY_CORRELATED_QUERY_INDEX,
  SecurityMonitoringSignalRuleResponseQuery.JSON_PROPERTY_DEFAULT_RULE_ID,
  SecurityMonitoringSignalRuleResponseQuery.JSON_PROPERTY_DISTINCT_FIELDS,
  SecurityMonitoringSignalRuleResponseQuery.JSON_PROPERTY_GROUP_BY_FIELDS,
  SecurityMonitoringSignalRuleResponseQuery.JSON_PROPERTY_METRICS,
  SecurityMonitoringSignalRuleResponseQuery.JSON_PROPERTY_NAME,
  SecurityMonitoringSignalRuleResponseQuery.JSON_PROPERTY_RULE_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalRuleResponseQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private SecurityMonitoringRuleQueryAggregation aggregation;

  public static final String JSON_PROPERTY_CORRELATED_BY_FIELDS = "correlatedByFields";
  private List<String> correlatedByFields = null;

  public static final String JSON_PROPERTY_CORRELATED_QUERY_INDEX = "correlatedQueryIndex";
  private Integer correlatedQueryIndex;

  public static final String JSON_PROPERTY_DEFAULT_RULE_ID = "defaultRuleId";
  private String defaultRuleId;

  public static final String JSON_PROPERTY_DISTINCT_FIELDS = "distinctFields";
  private List<String> distinctFields = null;

  public static final String JSON_PROPERTY_GROUP_BY_FIELDS = "groupByFields";
  private List<String> groupByFields = null;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private List<String> metrics = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RULE_ID = "ruleId";
  private String ruleId;

  public SecurityMonitoringSignalRuleResponseQuery aggregation(
      SecurityMonitoringRuleQueryAggregation aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
    return this;
  }

  /**
   * The aggregation type.
   *
   * @return aggregation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringRuleQueryAggregation getAggregation() {
    return aggregation;
  }

  public void setAggregation(SecurityMonitoringRuleQueryAggregation aggregation) {
    if (!aggregation.isValid()) {
      this.unparsed = true;
    }
    this.aggregation = aggregation;
  }

  public SecurityMonitoringSignalRuleResponseQuery correlatedByFields(
      List<String> correlatedByFields) {
    this.correlatedByFields = correlatedByFields;
    return this;
  }

  public SecurityMonitoringSignalRuleResponseQuery addCorrelatedByFieldsItem(
      String correlatedByFieldsItem) {
    if (this.correlatedByFields == null) {
      this.correlatedByFields = new ArrayList<>();
    }
    this.correlatedByFields.add(correlatedByFieldsItem);
    return this;
  }

  /**
   * Fields to correlate by.
   *
   * @return correlatedByFields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CORRELATED_BY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCorrelatedByFields() {
    return correlatedByFields;
  }

  public void setCorrelatedByFields(List<String> correlatedByFields) {
    this.correlatedByFields = correlatedByFields;
  }

  public SecurityMonitoringSignalRuleResponseQuery correlatedQueryIndex(
      Integer correlatedQueryIndex) {
    this.correlatedQueryIndex = correlatedQueryIndex;
    return this;
  }

  /**
   * Index of the rule query used to retrieve the correlated field. maximum: 9
   *
   * @return correlatedQueryIndex
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CORRELATED_QUERY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getCorrelatedQueryIndex() {
    return correlatedQueryIndex;
  }

  public void setCorrelatedQueryIndex(Integer correlatedQueryIndex) {
    this.correlatedQueryIndex = correlatedQueryIndex;
  }

  public SecurityMonitoringSignalRuleResponseQuery defaultRuleId(String defaultRuleId) {
    this.defaultRuleId = defaultRuleId;
    return this;
  }

  /**
   * Default Rule ID to match on signals.
   *
   * @return defaultRuleId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_RULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDefaultRuleId() {
    return defaultRuleId;
  }

  public void setDefaultRuleId(String defaultRuleId) {
    this.defaultRuleId = defaultRuleId;
  }

  public SecurityMonitoringSignalRuleResponseQuery distinctFields(List<String> distinctFields) {
    this.distinctFields = distinctFields;
    return this;
  }

  public SecurityMonitoringSignalRuleResponseQuery addDistinctFieldsItem(
      String distinctFieldsItem) {
    if (this.distinctFields == null) {
      this.distinctFields = new ArrayList<>();
    }
    this.distinctFields.add(distinctFieldsItem);
    return this;
  }

  /**
   * Field for which the cardinality is measured. Sent as an array.
   *
   * @return distinctFields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISTINCT_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getDistinctFields() {
    return distinctFields;
  }

  public void setDistinctFields(List<String> distinctFields) {
    this.distinctFields = distinctFields;
  }

  public SecurityMonitoringSignalRuleResponseQuery groupByFields(List<String> groupByFields) {
    this.groupByFields = groupByFields;
    return this;
  }

  public SecurityMonitoringSignalRuleResponseQuery addGroupByFieldsItem(String groupByFieldsItem) {
    if (this.groupByFields == null) {
      this.groupByFields = new ArrayList<>();
    }
    this.groupByFields.add(groupByFieldsItem);
    return this;
  }

  /**
   * Fields to group by.
   *
   * @return groupByFields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getGroupByFields() {
    return groupByFields;
  }

  public void setGroupByFields(List<String> groupByFields) {
    this.groupByFields = groupByFields;
  }

  public SecurityMonitoringSignalRuleResponseQuery metrics(List<String> metrics) {
    this.metrics = metrics;
    return this;
  }

  public SecurityMonitoringSignalRuleResponseQuery addMetricsItem(String metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

  /**
   * Group of target fields to aggregate over.
   *
   * @return metrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<String> metrics) {
    this.metrics = metrics;
  }

  public SecurityMonitoringSignalRuleResponseQuery name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the query.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SecurityMonitoringSignalRuleResponseQuery ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  /**
   * Rule ID to match on signals.
   *
   * @return ruleId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
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
   * @return SecurityMonitoringSignalRuleResponseQuery
   */
  @JsonAnySetter
  public SecurityMonitoringSignalRuleResponseQuery putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityMonitoringSignalRuleResponseQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalRuleResponseQuery securityMonitoringSignalRuleResponseQuery =
        (SecurityMonitoringSignalRuleResponseQuery) o;
    return Objects.equals(this.aggregation, securityMonitoringSignalRuleResponseQuery.aggregation)
        && Objects.equals(
            this.correlatedByFields, securityMonitoringSignalRuleResponseQuery.correlatedByFields)
        && Objects.equals(
            this.correlatedQueryIndex,
            securityMonitoringSignalRuleResponseQuery.correlatedQueryIndex)
        && Objects.equals(
            this.defaultRuleId, securityMonitoringSignalRuleResponseQuery.defaultRuleId)
        && Objects.equals(
            this.distinctFields, securityMonitoringSignalRuleResponseQuery.distinctFields)
        && Objects.equals(
            this.groupByFields, securityMonitoringSignalRuleResponseQuery.groupByFields)
        && Objects.equals(this.metrics, securityMonitoringSignalRuleResponseQuery.metrics)
        && Objects.equals(this.name, securityMonitoringSignalRuleResponseQuery.name)
        && Objects.equals(this.ruleId, securityMonitoringSignalRuleResponseQuery.ruleId)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringSignalRuleResponseQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aggregation,
        correlatedByFields,
        correlatedQueryIndex,
        defaultRuleId,
        distinctFields,
        groupByFields,
        metrics,
        name,
        ruleId,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalRuleResponseQuery {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    correlatedByFields: ").append(toIndentedString(correlatedByFields)).append("\n");
    sb.append("    correlatedQueryIndex: ")
        .append(toIndentedString(correlatedQueryIndex))
        .append("\n");
    sb.append("    defaultRuleId: ").append(toIndentedString(defaultRuleId)).append("\n");
    sb.append("    distinctFields: ").append(toIndentedString(distinctFields)).append("\n");
    sb.append("    groupByFields: ").append(toIndentedString(groupByFields)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
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
