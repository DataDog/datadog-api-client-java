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

/**
 * A query for APM trace metrics such as hits, errors, and latency percentiles, aggregated across
 * services.
 */
@JsonPropertyOrder({
  ApmMetricsQuery.JSON_PROPERTY_DATA_SOURCE,
  ApmMetricsQuery.JSON_PROPERTY_GROUP_BY,
  ApmMetricsQuery.JSON_PROPERTY_NAME,
  ApmMetricsQuery.JSON_PROPERTY_OPERATION_MODE,
  ApmMetricsQuery.JSON_PROPERTY_OPERATION_NAME,
  ApmMetricsQuery.JSON_PROPERTY_PEER_TAGS,
  ApmMetricsQuery.JSON_PROPERTY_QUERY_FILTER,
  ApmMetricsQuery.JSON_PROPERTY_RESOURCE_HASH,
  ApmMetricsQuery.JSON_PROPERTY_RESOURCE_NAME,
  ApmMetricsQuery.JSON_PROPERTY_SERVICE,
  ApmMetricsQuery.JSON_PROPERTY_SPAN_KIND,
  ApmMetricsQuery.JSON_PROPERTY_STAT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApmMetricsQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private ApmMetricsDataSource dataSource = ApmMetricsDataSource.APM_METRICS;

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

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_SPAN_KIND = "span_kind";
  private ApmMetricsSpanKind spanKind;

  public static final String JSON_PROPERTY_STAT = "stat";
  private ApmMetricsStat stat;

  public ApmMetricsQuery() {}

  @JsonCreator
  public ApmMetricsQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          ApmMetricsDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_STAT) ApmMetricsStat stat) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.name = name;
    this.stat = stat;
    this.unparsed |= !stat.isValid();
  }

  public ApmMetricsQuery dataSource(ApmMetricsDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * A data source for APM metrics queries.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ApmMetricsDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(ApmMetricsDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public ApmMetricsQuery groupBy(List<String> groupBy) {
    this.groupBy = groupBy;
    return this;
  }

  public ApmMetricsQuery addGroupByItem(String groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    return this;
  }

  /**
   * Optional fields to group the query results by.
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

  public ApmMetricsQuery name(String name) {
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

  public ApmMetricsQuery operationMode(String operationMode) {
    this.operationMode = operationMode;
    return this;
  }

  /**
   * Optional operation mode to aggregate across operation names.
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

  public ApmMetricsQuery operationName(String operationName) {
    this.operationName = operationName;
    return this;
  }

  /**
   * Name of operation on service. If not provided, the primary operation name is used.
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

  public ApmMetricsQuery peerTags(List<String> peerTags) {
    this.peerTags = peerTags;
    return this;
  }

  public ApmMetricsQuery addPeerTagsItem(String peerTagsItem) {
    if (this.peerTags == null) {
      this.peerTags = new ArrayList<>();
    }
    this.peerTags.add(peerTagsItem);
    return this;
  }

  /**
   * Tags to query for a specific downstream entity (peer.service, peer.db_instance, peer.s3,
   * peer.s3.bucket, etc.).
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

  public ApmMetricsQuery queryFilter(String queryFilter) {
    this.queryFilter = queryFilter;
    return this;
  }

  /**
   * Additional filters for the query using metrics query syntax (for example, env, primary_tag).
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

  public ApmMetricsQuery resourceHash(String resourceHash) {
    this.resourceHash = resourceHash;
    return this;
  }

  /**
   * The resource hash for exact matching.
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

  public ApmMetricsQuery resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * The full name of a specific resource to filter by.
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

  public ApmMetricsQuery service(String service) {
    this.service = service;
    return this;
  }

  /**
   * The service name to filter by.
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

  public ApmMetricsQuery spanKind(ApmMetricsSpanKind spanKind) {
    this.spanKind = spanKind;
    this.unparsed |= !spanKind.isValid();
    return this;
  }

  /**
   * Describes the relationship between the span, its parents, and its children in a trace.
   *
   * @return spanKind
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPAN_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ApmMetricsSpanKind getSpanKind() {
    return spanKind;
  }

  public void setSpanKind(ApmMetricsSpanKind spanKind) {
    if (!spanKind.isValid()) {
      this.unparsed = true;
    }
    this.spanKind = spanKind;
  }

  public ApmMetricsQuery stat(ApmMetricsStat stat) {
    this.stat = stat;
    this.unparsed |= !stat.isValid();
    return this;
  }

  /**
   * The APM metric statistic to query.
   *
   * @return stat
   */
  @JsonProperty(JSON_PROPERTY_STAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ApmMetricsStat getStat() {
    return stat;
  }

  public void setStat(ApmMetricsStat stat) {
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
   * @return ApmMetricsQuery
   */
  @JsonAnySetter
  public ApmMetricsQuery putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ApmMetricsQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApmMetricsQuery apmMetricsQuery = (ApmMetricsQuery) o;
    return Objects.equals(this.dataSource, apmMetricsQuery.dataSource)
        && Objects.equals(this.groupBy, apmMetricsQuery.groupBy)
        && Objects.equals(this.name, apmMetricsQuery.name)
        && Objects.equals(this.operationMode, apmMetricsQuery.operationMode)
        && Objects.equals(this.operationName, apmMetricsQuery.operationName)
        && Objects.equals(this.peerTags, apmMetricsQuery.peerTags)
        && Objects.equals(this.queryFilter, apmMetricsQuery.queryFilter)
        && Objects.equals(this.resourceHash, apmMetricsQuery.resourceHash)
        && Objects.equals(this.resourceName, apmMetricsQuery.resourceName)
        && Objects.equals(this.service, apmMetricsQuery.service)
        && Objects.equals(this.spanKind, apmMetricsQuery.spanKind)
        && Objects.equals(this.stat, apmMetricsQuery.stat)
        && Objects.equals(this.additionalProperties, apmMetricsQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dataSource,
        groupBy,
        name,
        operationMode,
        operationName,
        peerTags,
        queryFilter,
        resourceHash,
        resourceName,
        service,
        spanKind,
        stat,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApmMetricsQuery {\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operationMode: ").append(toIndentedString(operationMode)).append("\n");
    sb.append("    operationName: ").append(toIndentedString(operationName)).append("\n");
    sb.append("    peerTags: ").append(toIndentedString(peerTags)).append("\n");
    sb.append("    queryFilter: ").append(toIndentedString(queryFilter)).append("\n");
    sb.append("    resourceHash: ").append(toIndentedString(resourceHash)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    spanKind: ").append(toIndentedString(spanKind)).append("\n");
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
