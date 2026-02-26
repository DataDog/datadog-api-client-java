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

/** APM resource stats query using formulas and functions. */
@JsonPropertyOrder({
  FormulaAndFunctionApmResourceStatsQueryDefinition.JSON_PROPERTY_CROSS_ORG_UUIDS,
  FormulaAndFunctionApmResourceStatsQueryDefinition.JSON_PROPERTY_DATA_SOURCE,
  FormulaAndFunctionApmResourceStatsQueryDefinition.JSON_PROPERTY_ENV,
  FormulaAndFunctionApmResourceStatsQueryDefinition.JSON_PROPERTY_GROUP_BY,
  FormulaAndFunctionApmResourceStatsQueryDefinition.JSON_PROPERTY_NAME,
  FormulaAndFunctionApmResourceStatsQueryDefinition.JSON_PROPERTY_OPERATION_NAME,
  FormulaAndFunctionApmResourceStatsQueryDefinition.JSON_PROPERTY_PRIMARY_TAG_NAME,
  FormulaAndFunctionApmResourceStatsQueryDefinition.JSON_PROPERTY_PRIMARY_TAG_VALUE,
  FormulaAndFunctionApmResourceStatsQueryDefinition.JSON_PROPERTY_RESOURCE_NAME,
  FormulaAndFunctionApmResourceStatsQueryDefinition.JSON_PROPERTY_SERVICE,
  FormulaAndFunctionApmResourceStatsQueryDefinition.JSON_PROPERTY_STAT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaAndFunctionApmResourceStatsQueryDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CROSS_ORG_UUIDS = "cross_org_uuids";
  private List<String> crossOrgUuids = null;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FormulaAndFunctionApmResourceStatsDataSource dataSource;

  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<String> groupBy = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPERATION_NAME = "operation_name";
  private String operationName;

  public static final String JSON_PROPERTY_PRIMARY_TAG_NAME = "primary_tag_name";
  private String primaryTagName;

  public static final String JSON_PROPERTY_PRIMARY_TAG_VALUE = "primary_tag_value";
  private String primaryTagValue;

  public static final String JSON_PROPERTY_RESOURCE_NAME = "resource_name";
  private String resourceName;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_STAT = "stat";
  private FormulaAndFunctionApmResourceStatName stat;

  public FormulaAndFunctionApmResourceStatsQueryDefinition() {}

  @JsonCreator
  public FormulaAndFunctionApmResourceStatsQueryDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          FormulaAndFunctionApmResourceStatsDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENV) String env,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE) String service,
      @JsonProperty(required = true, value = JSON_PROPERTY_STAT)
          FormulaAndFunctionApmResourceStatName stat) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.env = env;
    this.name = name;
    this.service = service;
    this.stat = stat;
    this.unparsed |= !stat.isValid();
  }

  public FormulaAndFunctionApmResourceStatsQueryDefinition crossOrgUuids(
      List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
    return this;
  }

  public FormulaAndFunctionApmResourceStatsQueryDefinition addCrossOrgUuidsItem(
      String crossOrgUuidsItem) {
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

  public FormulaAndFunctionApmResourceStatsQueryDefinition dataSource(
      FormulaAndFunctionApmResourceStatsDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Data source for APM resource stats queries.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormulaAndFunctionApmResourceStatsDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(FormulaAndFunctionApmResourceStatsDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public FormulaAndFunctionApmResourceStatsQueryDefinition env(String env) {
    this.env = env;
    return this;
  }

  /**
   * APM environment.
   *
   * @return env
   */
  @JsonProperty(JSON_PROPERTY_ENV)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEnv() {
    return env;
  }

  public void setEnv(String env) {
    this.env = env;
  }

  public FormulaAndFunctionApmResourceStatsQueryDefinition groupBy(List<String> groupBy) {
    this.groupBy = groupBy;
    return this;
  }

  public FormulaAndFunctionApmResourceStatsQueryDefinition addGroupByItem(String groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    return this;
  }

  /**
   * Array of fields to group results by.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<String> groupBy) {
    this.groupBy = groupBy;
  }

  public FormulaAndFunctionApmResourceStatsQueryDefinition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of this query to use in formulas.
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

  public FormulaAndFunctionApmResourceStatsQueryDefinition operationName(String operationName) {
    this.operationName = operationName;
    return this;
  }

  /**
   * Name of operation on service.
   *
   * @return operationName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOperationName() {
    return operationName;
  }

  public void setOperationName(String operationName) {
    this.operationName = operationName;
  }

  public FormulaAndFunctionApmResourceStatsQueryDefinition primaryTagName(String primaryTagName) {
    this.primaryTagName = primaryTagName;
    return this;
  }

  /**
   * Name of the second primary tag used within APM. Required when <code>primary_tag_value</code> is
   * specified. See
   * https://docs.datadoghq.com/tracing/guide/setting_primary_tags_to_scope/#add-a-second-primary-tag-in-datadog
   *
   * @return primaryTagName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_TAG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPrimaryTagName() {
    return primaryTagName;
  }

  public void setPrimaryTagName(String primaryTagName) {
    this.primaryTagName = primaryTagName;
  }

  public FormulaAndFunctionApmResourceStatsQueryDefinition primaryTagValue(String primaryTagValue) {
    this.primaryTagValue = primaryTagValue;
    return this;
  }

  /**
   * Value of the second primary tag by which to filter APM data. <code>primary_tag_name</code> must
   * also be specified.
   *
   * @return primaryTagValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_TAG_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPrimaryTagValue() {
    return primaryTagValue;
  }

  public void setPrimaryTagValue(String primaryTagValue) {
    this.primaryTagValue = primaryTagValue;
  }

  public FormulaAndFunctionApmResourceStatsQueryDefinition resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * APM resource name.
   *
   * @return resourceName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }

  public FormulaAndFunctionApmResourceStatsQueryDefinition service(String service) {
    this.service = service;
    return this;
  }

  /**
   * APM service name.
   *
   * @return service
   */
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public FormulaAndFunctionApmResourceStatsQueryDefinition stat(
      FormulaAndFunctionApmResourceStatName stat) {
    this.stat = stat;
    this.unparsed |= !stat.isValid();
    return this;
  }

  /**
   * APM resource stat name.
   *
   * @return stat
   */
  @JsonProperty(JSON_PROPERTY_STAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormulaAndFunctionApmResourceStatName getStat() {
    return stat;
  }

  public void setStat(FormulaAndFunctionApmResourceStatName stat) {
    if (!stat.isValid()) {
      this.unparsed = true;
    }
    this.stat = stat;
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
   * @return FormulaAndFunctionApmResourceStatsQueryDefinition
   */
  @JsonAnySetter
  public FormulaAndFunctionApmResourceStatsQueryDefinition putAdditionalProperty(
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

  /** Return true if this FormulaAndFunctionApmResourceStatsQueryDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaAndFunctionApmResourceStatsQueryDefinition
        formulaAndFunctionApmResourceStatsQueryDefinition =
            (FormulaAndFunctionApmResourceStatsQueryDefinition) o;
    return Objects.equals(
            this.crossOrgUuids, formulaAndFunctionApmResourceStatsQueryDefinition.crossOrgUuids)
        && Objects.equals(
            this.dataSource, formulaAndFunctionApmResourceStatsQueryDefinition.dataSource)
        && Objects.equals(this.env, formulaAndFunctionApmResourceStatsQueryDefinition.env)
        && Objects.equals(this.groupBy, formulaAndFunctionApmResourceStatsQueryDefinition.groupBy)
        && Objects.equals(this.name, formulaAndFunctionApmResourceStatsQueryDefinition.name)
        && Objects.equals(
            this.operationName, formulaAndFunctionApmResourceStatsQueryDefinition.operationName)
        && Objects.equals(
            this.primaryTagName, formulaAndFunctionApmResourceStatsQueryDefinition.primaryTagName)
        && Objects.equals(
            this.primaryTagValue, formulaAndFunctionApmResourceStatsQueryDefinition.primaryTagValue)
        && Objects.equals(
            this.resourceName, formulaAndFunctionApmResourceStatsQueryDefinition.resourceName)
        && Objects.equals(this.service, formulaAndFunctionApmResourceStatsQueryDefinition.service)
        && Objects.equals(this.stat, formulaAndFunctionApmResourceStatsQueryDefinition.stat)
        && Objects.equals(
            this.additionalProperties,
            formulaAndFunctionApmResourceStatsQueryDefinition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        crossOrgUuids,
        dataSource,
        env,
        groupBy,
        name,
        operationName,
        primaryTagName,
        primaryTagValue,
        resourceName,
        service,
        stat,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaAndFunctionApmResourceStatsQueryDefinition {\n");
    sb.append("    crossOrgUuids: ").append(toIndentedString(crossOrgUuids)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operationName: ").append(toIndentedString(operationName)).append("\n");
    sb.append("    primaryTagName: ").append(toIndentedString(primaryTagName)).append("\n");
    sb.append("    primaryTagValue: ").append(toIndentedString(primaryTagValue)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
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
