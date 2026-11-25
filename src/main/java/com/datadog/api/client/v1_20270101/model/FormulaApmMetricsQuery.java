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
  FormulaApmMetricsQuery.JSON_PROPERTY_BYOC_CLUSTER,
  FormulaApmMetricsQuery.JSON_PROPERTY_DATA_SOURCE,
  FormulaApmMetricsQuery.JSON_PROPERTY_GROUP_BY,
  FormulaApmMetricsQuery.JSON_PROPERTY_NAME,
  FormulaApmMetricsQuery.JSON_PROPERTY_OPERATION_MODE,
  FormulaApmMetricsQuery.JSON_PROPERTY_OPERATION_NAME,
  FormulaApmMetricsQuery.JSON_PROPERTY_PEER_TAGS,
  FormulaApmMetricsQuery.JSON_PROPERTY_QUERY_FILTER,
  FormulaApmMetricsQuery.JSON_PROPERTY_RESOURCE_HASH,
  FormulaApmMetricsQuery.JSON_PROPERTY_RESOURCE_NAME,
  FormulaApmMetricsQuery.JSON_PROPERTY_SEMANTIC_MODE,
  FormulaApmMetricsQuery.JSON_PROPERTY_SERVICE,
  FormulaApmMetricsQuery.JSON_PROPERTY_SPAN_KIND,
  FormulaApmMetricsQuery.JSON_PROPERTY_STAT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaApmMetricsQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BYOC_CLUSTER = "byoc_cluster";
  private String byocCluster;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FormulaApmMetricsQueryDataSource dataSource;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<String> groupBy = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPERATION_MODE = "operation_mode";
  private String operationMode;

  public static final String JSON_PROPERTY_OPERATION_NAME = "operation_name";
  private String operationName;

  public static final String JSON_PROPERTY_PEER_TAGS = "peer_tags";
  private List<String> peerTags = null;

  public static final String JSON_PROPERTY_QUERY_FILTER = "query_filter";
  private String queryFilter;

  public static final String JSON_PROPERTY_RESOURCE_HASH = "resource_hash";
  private String resourceHash;

  public static final String JSON_PROPERTY_RESOURCE_NAME = "resource_name";
  private String resourceName;

  public static final String JSON_PROPERTY_SEMANTIC_MODE = "semantic_mode";
  private FormulaSemanticMode semanticMode;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_SPAN_KIND = "span_kind";
  private SpanKind spanKind;

  public static final String JSON_PROPERTY_STAT = "stat";
  private ApmMetricStat stat;

  public FormulaApmMetricsQuery() {}

  @JsonCreator
  public FormulaApmMetricsQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          FormulaApmMetricsQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_STAT) ApmMetricStat stat) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.name = name;
    this.stat = stat;
    this.unparsed |= !stat.isValid();
  }

  public FormulaApmMetricsQuery byocCluster(String byocCluster) {
    this.byocCluster = byocCluster;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return byocCluster
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BYOC_CLUSTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getByocCluster() {
    return byocCluster;
  }

  public void setByocCluster(String byocCluster) {
    this.byocCluster = byocCluster;
  }

  public FormulaApmMetricsQuery dataSource(FormulaApmMetricsQueryDataSource dataSource) {
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
  public FormulaApmMetricsQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(FormulaApmMetricsQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public FormulaApmMetricsQuery groupBy(List<String> groupBy) {
    this.groupBy = groupBy;
    return this;
  }

  public FormulaApmMetricsQuery addGroupByItem(String groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public FormulaApmMetricsQuery name(String name) {
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

  public FormulaApmMetricsQuery operationMode(String operationMode) {
    this.operationMode = operationMode;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return operationMode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATION_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOperationMode() {
    return operationMode;
  }

  public void setOperationMode(String operationMode) {
    this.operationMode = operationMode;
  }

  public FormulaApmMetricsQuery operationName(String operationName) {
    this.operationName = operationName;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public FormulaApmMetricsQuery peerTags(List<String> peerTags) {
    this.peerTags = peerTags;
    return this;
  }

  public FormulaApmMetricsQuery addPeerTagsItem(String peerTagsItem) {
    if (this.peerTags == null) {
      this.peerTags = new ArrayList<>();
    }
    this.peerTags.add(peerTagsItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return peerTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PEER_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getPeerTags() {
    return peerTags;
  }

  public void setPeerTags(List<String> peerTags) {
    this.peerTags = peerTags;
  }

  public FormulaApmMetricsQuery queryFilter(String queryFilter) {
    this.queryFilter = queryFilter;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return queryFilter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQueryFilter() {
    return queryFilter;
  }

  public void setQueryFilter(String queryFilter) {
    this.queryFilter = queryFilter;
  }

  public FormulaApmMetricsQuery resourceHash(String resourceHash) {
    this.resourceHash = resourceHash;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return resourceHash
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResourceHash() {
    return resourceHash;
  }

  public void setResourceHash(String resourceHash) {
    this.resourceHash = resourceHash;
  }

  public FormulaApmMetricsQuery resourceName(String resourceName) {
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

  public FormulaApmMetricsQuery semanticMode(FormulaSemanticMode semanticMode) {
    this.semanticMode = semanticMode;
    this.unparsed |= !semanticMode.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return semanticMode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEMANTIC_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FormulaSemanticMode getSemanticMode() {
    return semanticMode;
  }

  public void setSemanticMode(FormulaSemanticMode semanticMode) {
    if (!semanticMode.isValid()) {
      this.unparsed = true;
    }
    this.semanticMode = semanticMode;
  }

  public FormulaApmMetricsQuery service(String service) {
    this.service = service;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return service
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public FormulaApmMetricsQuery spanKind(SpanKind spanKind) {
    this.spanKind = spanKind;
    this.unparsed |= !spanKind.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return spanKind
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPAN_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SpanKind getSpanKind() {
    return spanKind;
  }

  public void setSpanKind(SpanKind spanKind) {
    if (!spanKind.isValid()) {
      this.unparsed = true;
    }
    this.spanKind = spanKind;
  }

  public FormulaApmMetricsQuery stat(ApmMetricStat stat) {
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
  public ApmMetricStat getStat() {
    return stat;
  }

  public void setStat(ApmMetricStat stat) {
    if (!stat.isValid()) {
      this.unparsed = true;
    }
    this.stat = stat;
  }

  /** Return true if this FormulaApmMetricsQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaApmMetricsQuery formulaApmMetricsQuery = (FormulaApmMetricsQuery) o;
    return Objects.equals(this.byocCluster, formulaApmMetricsQuery.byocCluster)
        && Objects.equals(this.dataSource, formulaApmMetricsQuery.dataSource)
        && Objects.equals(this.groupBy, formulaApmMetricsQuery.groupBy)
        && Objects.equals(this.name, formulaApmMetricsQuery.name)
        && Objects.equals(this.operationMode, formulaApmMetricsQuery.operationMode)
        && Objects.equals(this.operationName, formulaApmMetricsQuery.operationName)
        && Objects.equals(this.peerTags, formulaApmMetricsQuery.peerTags)
        && Objects.equals(this.queryFilter, formulaApmMetricsQuery.queryFilter)
        && Objects.equals(this.resourceHash, formulaApmMetricsQuery.resourceHash)
        && Objects.equals(this.resourceName, formulaApmMetricsQuery.resourceName)
        && Objects.equals(this.semanticMode, formulaApmMetricsQuery.semanticMode)
        && Objects.equals(this.service, formulaApmMetricsQuery.service)
        && Objects.equals(this.spanKind, formulaApmMetricsQuery.spanKind)
        && Objects.equals(this.stat, formulaApmMetricsQuery.stat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        byocCluster,
        dataSource,
        groupBy,
        name,
        operationMode,
        operationName,
        peerTags,
        queryFilter,
        resourceHash,
        resourceName,
        semanticMode,
        service,
        spanKind,
        stat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaApmMetricsQuery {\n");
    sb.append("    byocCluster: ").append(toIndentedString(byocCluster)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operationMode: ").append(toIndentedString(operationMode)).append("\n");
    sb.append("    operationName: ").append(toIndentedString(operationName)).append("\n");
    sb.append("    peerTags: ").append(toIndentedString(peerTags)).append("\n");
    sb.append("    queryFilter: ").append(toIndentedString(queryFilter)).append("\n");
    sb.append("    resourceHash: ").append(toIndentedString(resourceHash)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    semanticMode: ").append(toIndentedString(semanticMode)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    spanKind: ").append(toIndentedString(spanKind)).append("\n");
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
