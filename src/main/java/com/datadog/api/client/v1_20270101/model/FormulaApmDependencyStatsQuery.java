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
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  FormulaApmDependencyStatsQuery.JSON_PROPERTY_DATA_SOURCE,
  FormulaApmDependencyStatsQuery.JSON_PROPERTY_ENV,
  FormulaApmDependencyStatsQuery.JSON_PROPERTY_IS_UPSTREAM,
  FormulaApmDependencyStatsQuery.JSON_PROPERTY_NAME,
  FormulaApmDependencyStatsQuery.JSON_PROPERTY_OPERATION_NAME,
  FormulaApmDependencyStatsQuery.JSON_PROPERTY_PRIMARY_TAG_NAME,
  FormulaApmDependencyStatsQuery.JSON_PROPERTY_PRIMARY_TAG_VALUE,
  FormulaApmDependencyStatsQuery.JSON_PROPERTY_RESOURCE_NAME,
  FormulaApmDependencyStatsQuery.JSON_PROPERTY_SERVICE,
  FormulaApmDependencyStatsQuery.JSON_PROPERTY_STAT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaApmDependencyStatsQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FormulaApmDependencyStatsQueryDataSource dataSource;

  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_IS_UPSTREAM = "is_upstream";
  private Boolean isUpstream;

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
  private ApmDependencyStat stat;

  public FormulaApmDependencyStatsQuery() {}

  @JsonCreator
  public FormulaApmDependencyStatsQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          FormulaApmDependencyStatsQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENV) String env,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_OPERATION_NAME) String operationName,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_NAME) String resourceName,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE) String service,
      @JsonProperty(required = true, value = JSON_PROPERTY_STAT) ApmDependencyStat stat) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.env = env;
    this.name = name;
    this.operationName = operationName;
    this.resourceName = resourceName;
    this.service = service;
    this.stat = stat;
    this.unparsed |= !stat.isValid();
  }

  public FormulaApmDependencyStatsQuery dataSource(
      FormulaApmDependencyStatsQueryDataSource dataSource) {
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
  public FormulaApmDependencyStatsQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(FormulaApmDependencyStatsQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public FormulaApmDependencyStatsQuery env(String env) {
    this.env = env;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public FormulaApmDependencyStatsQuery isUpstream(Boolean isUpstream) {
    this.isUpstream = isUpstream;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return isUpstream
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_UPSTREAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsUpstream() {
    return isUpstream;
  }

  public void setIsUpstream(Boolean isUpstream) {
    this.isUpstream = isUpstream;
  }

  public FormulaApmDependencyStatsQuery name(String name) {
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

  public FormulaApmDependencyStatsQuery operationName(String operationName) {
    this.operationName = operationName;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return operationName
   */
  @JsonProperty(JSON_PROPERTY_OPERATION_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getOperationName() {
    return operationName;
  }

  public void setOperationName(String operationName) {
    this.operationName = operationName;
  }

  public FormulaApmDependencyStatsQuery primaryTagName(String primaryTagName) {
    this.primaryTagName = primaryTagName;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public FormulaApmDependencyStatsQuery primaryTagValue(String primaryTagValue) {
    this.primaryTagValue = primaryTagValue;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public FormulaApmDependencyStatsQuery resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return resourceName
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }

  public FormulaApmDependencyStatsQuery service(String service) {
    this.service = service;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public FormulaApmDependencyStatsQuery stat(ApmDependencyStat stat) {
    this.stat = stat;
    this.unparsed |= !stat.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return stat
   */
  @JsonProperty(JSON_PROPERTY_STAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ApmDependencyStat getStat() {
    return stat;
  }

  public void setStat(ApmDependencyStat stat) {
    if (!stat.isValid()) {
      this.unparsed = true;
    }
    this.stat = stat;
  }

  /** Return true if this FormulaApmDependencyStatsQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaApmDependencyStatsQuery formulaApmDependencyStatsQuery =
        (FormulaApmDependencyStatsQuery) o;
    return Objects.equals(this.dataSource, formulaApmDependencyStatsQuery.dataSource)
        && Objects.equals(this.env, formulaApmDependencyStatsQuery.env)
        && Objects.equals(this.isUpstream, formulaApmDependencyStatsQuery.isUpstream)
        && Objects.equals(this.name, formulaApmDependencyStatsQuery.name)
        && Objects.equals(this.operationName, formulaApmDependencyStatsQuery.operationName)
        && Objects.equals(this.primaryTagName, formulaApmDependencyStatsQuery.primaryTagName)
        && Objects.equals(this.primaryTagValue, formulaApmDependencyStatsQuery.primaryTagValue)
        && Objects.equals(this.resourceName, formulaApmDependencyStatsQuery.resourceName)
        && Objects.equals(this.service, formulaApmDependencyStatsQuery.service)
        && Objects.equals(this.stat, formulaApmDependencyStatsQuery.stat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dataSource,
        env,
        isUpstream,
        name,
        operationName,
        primaryTagName,
        primaryTagValue,
        resourceName,
        service,
        stat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaApmDependencyStatsQuery {\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    isUpstream: ").append(toIndentedString(isUpstream)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operationName: ").append(toIndentedString(operationName)).append("\n");
    sb.append("    primaryTagName: ").append(toIndentedString(primaryTagName)).append("\n");
    sb.append("    primaryTagValue: ").append(toIndentedString(primaryTagValue)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
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
