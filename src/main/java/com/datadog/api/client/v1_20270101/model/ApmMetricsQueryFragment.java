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
  ApmMetricsQueryFragment.JSON_PROPERTY_ALIAS,
  ApmMetricsQueryFragment.JSON_PROPERTY_BYOC_CLUSTER,
  ApmMetricsQueryFragment.JSON_PROPERTY_DATA_SOURCE,
  ApmMetricsQueryFragment.JSON_PROPERTY_NAME,
  ApmMetricsQueryFragment.JSON_PROPERTY_OPERATION_MODE,
  ApmMetricsQueryFragment.JSON_PROPERTY_OPERATION_NAME,
  ApmMetricsQueryFragment.JSON_PROPERTY_PEER_TAGS,
  ApmMetricsQueryFragment.JSON_PROPERTY_QUERY_FILTER,
  ApmMetricsQueryFragment.JSON_PROPERTY_RESOURCE_HASH,
  ApmMetricsQueryFragment.JSON_PROPERTY_RESOURCE_NAME,
  ApmMetricsQueryFragment.JSON_PROPERTY_SERVICE,
  ApmMetricsQueryFragment.JSON_PROPERTY_SPAN_KIND
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApmMetricsQueryFragment {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_BYOC_CLUSTER = "byoc_cluster";
  private String byocCluster;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private ApmMetricsQueryFragmentDataSource dataSource;

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
  private SpanKind spanKind;

  public ApmMetricsQueryFragment() {}

  @JsonCreator
  public ApmMetricsQueryFragment(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          ApmMetricsQueryFragmentDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.name = name;
  }

  public ApmMetricsQueryFragment alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return alias
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public ApmMetricsQueryFragment byocCluster(String byocCluster) {
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

  public ApmMetricsQueryFragment dataSource(ApmMetricsQueryFragmentDataSource dataSource) {
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
  public ApmMetricsQueryFragmentDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(ApmMetricsQueryFragmentDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public ApmMetricsQueryFragment name(String name) {
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

  public ApmMetricsQueryFragment operationMode(String operationMode) {
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

  public ApmMetricsQueryFragment operationName(String operationName) {
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

  public ApmMetricsQueryFragment peerTags(List<String> peerTags) {
    this.peerTags = peerTags;
    return this;
  }

  public ApmMetricsQueryFragment addPeerTagsItem(String peerTagsItem) {
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

  public ApmMetricsQueryFragment queryFilter(String queryFilter) {
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

  public ApmMetricsQueryFragment resourceHash(String resourceHash) {
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

  public ApmMetricsQueryFragment resourceName(String resourceName) {
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

  public ApmMetricsQueryFragment service(String service) {
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

  public ApmMetricsQueryFragment spanKind(SpanKind spanKind) {
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

  /** Return true if this ApmMetricsQueryFragment object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApmMetricsQueryFragment apmMetricsQueryFragment = (ApmMetricsQueryFragment) o;
    return Objects.equals(this.alias, apmMetricsQueryFragment.alias)
        && Objects.equals(this.byocCluster, apmMetricsQueryFragment.byocCluster)
        && Objects.equals(this.dataSource, apmMetricsQueryFragment.dataSource)
        && Objects.equals(this.name, apmMetricsQueryFragment.name)
        && Objects.equals(this.operationMode, apmMetricsQueryFragment.operationMode)
        && Objects.equals(this.operationName, apmMetricsQueryFragment.operationName)
        && Objects.equals(this.peerTags, apmMetricsQueryFragment.peerTags)
        && Objects.equals(this.queryFilter, apmMetricsQueryFragment.queryFilter)
        && Objects.equals(this.resourceHash, apmMetricsQueryFragment.resourceHash)
        && Objects.equals(this.resourceName, apmMetricsQueryFragment.resourceName)
        && Objects.equals(this.service, apmMetricsQueryFragment.service)
        && Objects.equals(this.spanKind, apmMetricsQueryFragment.spanKind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        alias,
        byocCluster,
        dataSource,
        name,
        operationMode,
        operationName,
        peerTags,
        queryFilter,
        resourceHash,
        resourceName,
        service,
        spanKind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApmMetricsQueryFragment {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    byocCluster: ").append(toIndentedString(byocCluster)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operationMode: ").append(toIndentedString(operationMode)).append("\n");
    sb.append("    operationName: ").append(toIndentedString(operationName)).append("\n");
    sb.append("    peerTags: ").append(toIndentedString(peerTags)).append("\n");
    sb.append("    queryFilter: ").append(toIndentedString(queryFilter)).append("\n");
    sb.append("    resourceHash: ").append(toIndentedString(resourceHash)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    spanKind: ").append(toIndentedString(spanKind)).append("\n");
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
