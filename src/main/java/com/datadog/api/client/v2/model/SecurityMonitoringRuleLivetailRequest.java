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

/** Request to preview a rule query with applied filters. */
@JsonPropertyOrder({
  SecurityMonitoringRuleLivetailRequest.JSON_PROPERTY_DATA_SOURCE,
  SecurityMonitoringRuleLivetailRequest.JSON_PROPERTY_DETECTION_METHOD,
  SecurityMonitoringRuleLivetailRequest.JSON_PROPERTY_DISTINCT_FIELDS,
  SecurityMonitoringRuleLivetailRequest.JSON_PROPERTY_FILTERS,
  SecurityMonitoringRuleLivetailRequest.JSON_PROPERTY_GROUP_BY_FIELDS,
  SecurityMonitoringRuleLivetailRequest.JSON_PROPERTY_QUERY,
  SecurityMonitoringRuleLivetailRequest.JSON_PROPERTY_QUERY_INDEX,
  SecurityMonitoringRuleLivetailRequest.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringRuleLivetailRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE = "dataSource";
  private String dataSource;

  public static final String JSON_PROPERTY_DETECTION_METHOD = "detectionMethod";
  private SecurityMonitoringRuleDetectionMethod detectionMethod;

  public static final String JSON_PROPERTY_DISTINCT_FIELDS = "distinctFields";
  private List<String> distinctFields = null;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<SecurityMonitoringFilter> filters = null;

  public static final String JSON_PROPERTY_GROUP_BY_FIELDS = "groupByFields";
  private List<String> groupByFields = null;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_QUERY_INDEX = "queryIndex";
  private Integer queryIndex;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SecurityMonitoringRuleTypeRead type;

  public SecurityMonitoringRuleLivetailRequest() {}

  @JsonCreator
  public SecurityMonitoringRuleLivetailRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE) String dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_DETECTION_METHOD)
          SecurityMonitoringRuleDetectionMethod detectionMethod,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY_INDEX) Integer queryIndex,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          SecurityMonitoringRuleTypeRead type) {
    this.dataSource = dataSource;
    this.detectionMethod = detectionMethod;
    this.unparsed |= !detectionMethod.isValid();
    this.query = query;
    this.queryIndex = queryIndex;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SecurityMonitoringRuleLivetailRequest dataSource(String dataSource) {
    this.dataSource = dataSource;
    return this;
  }

  /**
   * Data source for the query.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDataSource() {
    return dataSource;
  }

  public void setDataSource(String dataSource) {
    this.dataSource = dataSource;
  }

  public SecurityMonitoringRuleLivetailRequest detectionMethod(
      SecurityMonitoringRuleDetectionMethod detectionMethod) {
    this.detectionMethod = detectionMethod;
    this.unparsed |= !detectionMethod.isValid();
    return this;
  }

  /**
   * The detection method.
   *
   * @return detectionMethod
   */
  @JsonProperty(JSON_PROPERTY_DETECTION_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringRuleDetectionMethod getDetectionMethod() {
    return detectionMethod;
  }

  public void setDetectionMethod(SecurityMonitoringRuleDetectionMethod detectionMethod) {
    if (!detectionMethod.isValid()) {
      this.unparsed = true;
    }
    this.detectionMethod = detectionMethod;
  }

  public SecurityMonitoringRuleLivetailRequest distinctFields(List<String> distinctFields) {
    this.distinctFields = distinctFields;
    return this;
  }

  public SecurityMonitoringRuleLivetailRequest addDistinctFieldsItem(String distinctFieldsItem) {
    if (this.distinctFields == null) {
      this.distinctFields = new ArrayList<>();
    }
    this.distinctFields.add(distinctFieldsItem);
    return this;
  }

  /**
   * Fields to apply distinct on.
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

  public SecurityMonitoringRuleLivetailRequest filters(List<SecurityMonitoringFilter> filters) {
    this.filters = filters;
    for (SecurityMonitoringFilter item : filters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringRuleLivetailRequest addFiltersItem(
      SecurityMonitoringFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    this.unparsed |= filtersItem.unparsed;
    return this;
  }

  /**
   * Additional security filters to apply.
   *
   * @return filters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SecurityMonitoringFilter> getFilters() {
    return filters;
  }

  public void setFilters(List<SecurityMonitoringFilter> filters) {
    this.filters = filters;
  }

  public SecurityMonitoringRuleLivetailRequest groupByFields(List<String> groupByFields) {
    this.groupByFields = groupByFields;
    return this;
  }

  public SecurityMonitoringRuleLivetailRequest addGroupByFieldsItem(String groupByFieldsItem) {
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

  public SecurityMonitoringRuleLivetailRequest query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The query to preview.
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

  public SecurityMonitoringRuleLivetailRequest queryIndex(Integer queryIndex) {
    this.queryIndex = queryIndex;
    return this;
  }

  /**
   * Index of the query in the rule. minimum: 0 maximum: 9
   *
   * @return queryIndex
   */
  @JsonProperty(JSON_PROPERTY_QUERY_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getQueryIndex() {
    return queryIndex;
  }

  public void setQueryIndex(Integer queryIndex) {
    this.queryIndex = queryIndex;
  }

  public SecurityMonitoringRuleLivetailRequest type(SecurityMonitoringRuleTypeRead type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The rule type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringRuleTypeRead getType() {
    return type;
  }

  public void setType(SecurityMonitoringRuleTypeRead type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return SecurityMonitoringRuleLivetailRequest
   */
  @JsonAnySetter
  public SecurityMonitoringRuleLivetailRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityMonitoringRuleLivetailRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringRuleLivetailRequest securityMonitoringRuleLivetailRequest =
        (SecurityMonitoringRuleLivetailRequest) o;
    return Objects.equals(this.dataSource, securityMonitoringRuleLivetailRequest.dataSource)
        && Objects.equals(
            this.detectionMethod, securityMonitoringRuleLivetailRequest.detectionMethod)
        && Objects.equals(this.distinctFields, securityMonitoringRuleLivetailRequest.distinctFields)
        && Objects.equals(this.filters, securityMonitoringRuleLivetailRequest.filters)
        && Objects.equals(this.groupByFields, securityMonitoringRuleLivetailRequest.groupByFields)
        && Objects.equals(this.query, securityMonitoringRuleLivetailRequest.query)
        && Objects.equals(this.queryIndex, securityMonitoringRuleLivetailRequest.queryIndex)
        && Objects.equals(this.type, securityMonitoringRuleLivetailRequest.type)
        && Objects.equals(
            this.additionalProperties, securityMonitoringRuleLivetailRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dataSource,
        detectionMethod,
        distinctFields,
        filters,
        groupByFields,
        query,
        queryIndex,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringRuleLivetailRequest {\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    detectionMethod: ").append(toIndentedString(detectionMethod)).append("\n");
    sb.append("    distinctFields: ").append(toIndentedString(distinctFields)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    groupByFields: ").append(toIndentedString(groupByFields)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    queryIndex: ").append(toIndentedString(queryIndex)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
