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
  FormulaApmResourceStatsQuery.JSON_PROPERTY_DATA_SOURCE,
  FormulaApmResourceStatsQuery.JSON_PROPERTY_ENV,
  FormulaApmResourceStatsQuery.JSON_PROPERTY_GROUP_BY,
  FormulaApmResourceStatsQuery.JSON_PROPERTY_NAME,
  FormulaApmResourceStatsQuery.JSON_PROPERTY_OPERATION_NAME,
  FormulaApmResourceStatsQuery.JSON_PROPERTY_PEER_SERVICE,
  FormulaApmResourceStatsQuery.JSON_PROPERTY_PRIMARY_TAG_NAME,
  FormulaApmResourceStatsQuery.JSON_PROPERTY_PRIMARY_TAG_VALUE,
  FormulaApmResourceStatsQuery.JSON_PROPERTY_RESOURCE_NAME,
  FormulaApmResourceStatsQuery.JSON_PROPERTY_SERVICE,
  FormulaApmResourceStatsQuery.JSON_PROPERTY_STAT,
  FormulaApmResourceStatsQuery.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaApmResourceStatsQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FormulaApmResourceStatsQueryDataSource dataSource;

  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<String> groupBy = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPERATION_NAME = "operation_name";
  private String operationName;

  public static final String JSON_PROPERTY_PEER_SERVICE = "peer.service";
  private String peerService;

  public static final String JSON_PROPERTY_PRIMARY_TAG_NAME = "primary_tag_name";
  private String primaryTagName;

  public static final String JSON_PROPERTY_PRIMARY_TAG_VALUE = "primary_tag_value";
  private String primaryTagValue;

  public static final String JSON_PROPERTY_RESOURCE_NAME = "resource_name";
  private String resourceName;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_STAT = "stat";
  private ApmResourceStat stat;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public FormulaApmResourceStatsQuery() {}

  @JsonCreator
  public FormulaApmResourceStatsQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          FormulaApmResourceStatsQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENV) String env,
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUP_BY) List<String> groupBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_OPERATION_NAME) String operationName,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE) String service,
      @JsonProperty(required = true, value = JSON_PROPERTY_STAT) ApmResourceStat stat) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.env = env;
    this.groupBy = groupBy;
    this.name = name;
    this.operationName = operationName;
    this.service = service;
    this.stat = stat;
    this.unparsed |= !stat.isValid();
  }

  public FormulaApmResourceStatsQuery dataSource(
      FormulaApmResourceStatsQueryDataSource dataSource) {
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
  public FormulaApmResourceStatsQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(FormulaApmResourceStatsQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public FormulaApmResourceStatsQuery env(String env) {
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

  public FormulaApmResourceStatsQuery groupBy(List<String> groupBy) {
    this.groupBy = groupBy;
    return this;
  }

  public FormulaApmResourceStatsQuery addGroupByItem(String groupByItem) {
    this.groupBy.add(groupByItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return groupBy
   */
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<String> groupBy) {
    this.groupBy = groupBy;
  }

  public FormulaApmResourceStatsQuery name(String name) {
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

  public FormulaApmResourceStatsQuery operationName(String operationName) {
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

  public FormulaApmResourceStatsQuery peerService(String peerService) {
    this.peerService = peerService;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return peerService
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PEER_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPeerService() {
    return peerService;
  }

  public void setPeerService(String peerService) {
    this.peerService = peerService;
  }

  public FormulaApmResourceStatsQuery primaryTagName(String primaryTagName) {
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

  public FormulaApmResourceStatsQuery primaryTagValue(String primaryTagValue) {
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

  public FormulaApmResourceStatsQuery resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public FormulaApmResourceStatsQuery service(String service) {
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

  public FormulaApmResourceStatsQuery stat(ApmResourceStat stat) {
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
  public ApmResourceStat getStat() {
    return stat;
  }

  public void setStat(ApmResourceStat stat) {
    if (!stat.isValid()) {
      this.unparsed = true;
    }
    this.stat = stat;
  }

  public FormulaApmResourceStatsQuery version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  /** Return true if this FormulaApmResourceStatsQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaApmResourceStatsQuery formulaApmResourceStatsQuery = (FormulaApmResourceStatsQuery) o;
    return Objects.equals(this.dataSource, formulaApmResourceStatsQuery.dataSource)
        && Objects.equals(this.env, formulaApmResourceStatsQuery.env)
        && Objects.equals(this.groupBy, formulaApmResourceStatsQuery.groupBy)
        && Objects.equals(this.name, formulaApmResourceStatsQuery.name)
        && Objects.equals(this.operationName, formulaApmResourceStatsQuery.operationName)
        && Objects.equals(this.peerService, formulaApmResourceStatsQuery.peerService)
        && Objects.equals(this.primaryTagName, formulaApmResourceStatsQuery.primaryTagName)
        && Objects.equals(this.primaryTagValue, formulaApmResourceStatsQuery.primaryTagValue)
        && Objects.equals(this.resourceName, formulaApmResourceStatsQuery.resourceName)
        && Objects.equals(this.service, formulaApmResourceStatsQuery.service)
        && Objects.equals(this.stat, formulaApmResourceStatsQuery.stat)
        && Objects.equals(this.version, formulaApmResourceStatsQuery.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dataSource,
        env,
        groupBy,
        name,
        operationName,
        peerService,
        primaryTagName,
        primaryTagValue,
        resourceName,
        service,
        stat,
        version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaApmResourceStatsQuery {\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operationName: ").append(toIndentedString(operationName)).append("\n");
    sb.append("    peerService: ").append(toIndentedString(peerService)).append("\n");
    sb.append("    primaryTagName: ").append(toIndentedString(primaryTagName)).append("\n");
    sb.append("    primaryTagValue: ").append(toIndentedString(primaryTagValue)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
