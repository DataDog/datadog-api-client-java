/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>A formula and functions APM metrics query.</p>
 */
@JsonPropertyOrder({
  FormulaAndFunctionApmMetricsQueryDefinition.JSON_PROPERTY_DATA_SOURCE,
  FormulaAndFunctionApmMetricsQueryDefinition.JSON_PROPERTY_GROUP_BY,
  FormulaAndFunctionApmMetricsQueryDefinition.JSON_PROPERTY_NAME,
  FormulaAndFunctionApmMetricsQueryDefinition.JSON_PROPERTY_OPERATION_MODE,
  FormulaAndFunctionApmMetricsQueryDefinition.JSON_PROPERTY_OPERATION_NAME,
  FormulaAndFunctionApmMetricsQueryDefinition.JSON_PROPERTY_PEER_TAGS,
  FormulaAndFunctionApmMetricsQueryDefinition.JSON_PROPERTY_QUERY_FILTER,
  FormulaAndFunctionApmMetricsQueryDefinition.JSON_PROPERTY_RESOURCE_HASH,
  FormulaAndFunctionApmMetricsQueryDefinition.JSON_PROPERTY_RESOURCE_NAME,
  FormulaAndFunctionApmMetricsQueryDefinition.JSON_PROPERTY_SERVICE,
  FormulaAndFunctionApmMetricsQueryDefinition.JSON_PROPERTY_SPAN_KIND,
  FormulaAndFunctionApmMetricsQueryDefinition.JSON_PROPERTY_STAT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaAndFunctionApmMetricsQueryDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FormulaAndFunctionApmMetricsDataSource dataSource;

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
  private FormulaAndFunctionApmMetricsSpanKind spanKind;

  public static final String JSON_PROPERTY_STAT = "stat";
  private FormulaAndFunctionApmMetricStatName stat;

  public FormulaAndFunctionApmMetricsQueryDefinition() {}

  @JsonCreator
  public FormulaAndFunctionApmMetricsQueryDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_DATA_SOURCE)FormulaAndFunctionApmMetricsDataSource dataSource,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_STAT)FormulaAndFunctionApmMetricStatName stat) {
        this.dataSource = dataSource;
        this.unparsed |= !dataSource.isValid();
        this.name = name;
        this.stat = stat;
        this.unparsed |= !stat.isValid();
  }
  public FormulaAndFunctionApmMetricsQueryDefinition dataSource(FormulaAndFunctionApmMetricsDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * <p>Data source for APM metrics queries.</p>
   * @return dataSource
  **/
      @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public FormulaAndFunctionApmMetricsDataSource getDataSource() {
        return dataSource;
      }
  public void setDataSource(FormulaAndFunctionApmMetricsDataSource dataSource) {
    if (!dataSource.isValid()) {
        this.unparsed = true;
    }
    this.dataSource = dataSource;
  }
  public FormulaAndFunctionApmMetricsQueryDefinition groupBy(List<String> groupBy) {
    this.groupBy = groupBy;
    return this;
  }
  public FormulaAndFunctionApmMetricsQueryDefinition addGroupByItem(String groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    return this;
  }

  /**
   * <p>Optional fields to group the query results by.</p>
   * @return groupBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GROUP_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getGroupBy() {
        return groupBy;
      }
  public void setGroupBy(List<String> groupBy) {
    this.groupBy = groupBy;
  }
  public FormulaAndFunctionApmMetricsQueryDefinition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of this query to use in formulas.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public FormulaAndFunctionApmMetricsQueryDefinition operationMode(String operationMode) {
    this.operationMode = operationMode;
    return this;
  }

  /**
   * <p>Optional operation mode to aggregate across operation names.</p>
   * @return operationMode
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OPERATION_MODE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getOperationMode() {
        return operationMode;
      }
  public void setOperationMode(String operationMode) {
    this.operationMode = operationMode;
  }
  public FormulaAndFunctionApmMetricsQueryDefinition operationName(String operationName) {
    this.operationName = operationName;
    return this;
  }

  /**
   * <p>Name of operation on service. If not provided, the primary operation name is used.</p>
   * @return operationName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OPERATION_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getOperationName() {
        return operationName;
      }
  public void setOperationName(String operationName) {
    this.operationName = operationName;
  }
  public FormulaAndFunctionApmMetricsQueryDefinition peerTags(List<String> peerTags) {
    this.peerTags = peerTags;
    return this;
  }
  public FormulaAndFunctionApmMetricsQueryDefinition addPeerTagsItem(String peerTagsItem) {
    if (this.peerTags == null) {
      this.peerTags = new ArrayList<>();
    }
    this.peerTags.add(peerTagsItem);
    return this;
  }

  /**
   * <p>Tags to query for a specific downstream entity (peer.service, peer.db_instance, peer.s3, peer.s3.bucket, etc.).</p>
   * @return peerTags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PEER_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getPeerTags() {
        return peerTags;
      }
  public void setPeerTags(List<String> peerTags) {
    this.peerTags = peerTags;
  }
  public FormulaAndFunctionApmMetricsQueryDefinition queryFilter(String queryFilter) {
    this.queryFilter = queryFilter;
    return this;
  }

  /**
   * <p>Additional filters for the query using metrics query syntax (e.g., env, primary_tag).</p>
   * @return queryFilter
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_QUERY_FILTER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getQueryFilter() {
        return queryFilter;
      }
  public void setQueryFilter(String queryFilter) {
    this.queryFilter = queryFilter;
  }
  public FormulaAndFunctionApmMetricsQueryDefinition resourceHash(String resourceHash) {
    this.resourceHash = resourceHash;
    return this;
  }

  /**
   * <p>The hash of a specific resource to filter by.</p>
   * @return resourceHash
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESOURCE_HASH)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getResourceHash() {
        return resourceHash;
      }
  public void setResourceHash(String resourceHash) {
    this.resourceHash = resourceHash;
  }
  public FormulaAndFunctionApmMetricsQueryDefinition resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * <p>The full name of a specific resource to filter by.</p>
   * @return resourceName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESOURCE_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getResourceName() {
        return resourceName;
      }
  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }
  public FormulaAndFunctionApmMetricsQueryDefinition service(String service) {
    this.service = service;
    return this;
  }

  /**
   * <p>APM service name.</p>
   * @return service
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SERVICE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getService() {
        return service;
      }
  public void setService(String service) {
    this.service = service;
  }
  public FormulaAndFunctionApmMetricsQueryDefinition spanKind(FormulaAndFunctionApmMetricsSpanKind spanKind) {
    this.spanKind = spanKind;
    this.unparsed |= !spanKind.isValid();
    return this;
  }

  /**
   * <p>Describes the relationship between the span, its parents, and its children in a trace.</p>
   * @return spanKind
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SPAN_KIND)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public FormulaAndFunctionApmMetricsSpanKind getSpanKind() {
        return spanKind;
      }
  public void setSpanKind(FormulaAndFunctionApmMetricsSpanKind spanKind) {
    if (!spanKind.isValid()) {
        this.unparsed = true;
    }
    this.spanKind = spanKind;
  }
  public FormulaAndFunctionApmMetricsQueryDefinition stat(FormulaAndFunctionApmMetricStatName stat) {
    this.stat = stat;
    this.unparsed |= !stat.isValid();
    return this;
  }

  /**
   * <p>APM metric stat name.</p>
   * @return stat
  **/
      @JsonProperty(JSON_PROPERTY_STAT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public FormulaAndFunctionApmMetricStatName getStat() {
        return stat;
      }
  public void setStat(FormulaAndFunctionApmMetricStatName stat) {
    if (!stat.isValid()) {
        this.unparsed = true;
    }
    this.stat = stat;
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
   * @return FormulaAndFunctionApmMetricsQueryDefinition
   */
  @JsonAnySetter
  public FormulaAndFunctionApmMetricsQueryDefinition putAdditionalProperty(String key, Object value) {
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
   * Return true if this FormulaAndFunctionApmMetricsQueryDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaAndFunctionApmMetricsQueryDefinition formulaAndFunctionApmMetricsQueryDefinition = (FormulaAndFunctionApmMetricsQueryDefinition) o;
    return Objects.equals(this.dataSource, formulaAndFunctionApmMetricsQueryDefinition.dataSource) && Objects.equals(this.groupBy, formulaAndFunctionApmMetricsQueryDefinition.groupBy) && Objects.equals(this.name, formulaAndFunctionApmMetricsQueryDefinition.name) && Objects.equals(this.operationMode, formulaAndFunctionApmMetricsQueryDefinition.operationMode) && Objects.equals(this.operationName, formulaAndFunctionApmMetricsQueryDefinition.operationName) && Objects.equals(this.peerTags, formulaAndFunctionApmMetricsQueryDefinition.peerTags) && Objects.equals(this.queryFilter, formulaAndFunctionApmMetricsQueryDefinition.queryFilter) && Objects.equals(this.resourceHash, formulaAndFunctionApmMetricsQueryDefinition.resourceHash) && Objects.equals(this.resourceName, formulaAndFunctionApmMetricsQueryDefinition.resourceName) && Objects.equals(this.service, formulaAndFunctionApmMetricsQueryDefinition.service) && Objects.equals(this.spanKind, formulaAndFunctionApmMetricsQueryDefinition.spanKind) && Objects.equals(this.stat, formulaAndFunctionApmMetricsQueryDefinition.stat) && Objects.equals(this.additionalProperties, formulaAndFunctionApmMetricsQueryDefinition.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(dataSource,groupBy,name,operationMode,operationName,peerTags,queryFilter,resourceHash,resourceName,service,spanKind,stat, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaAndFunctionApmMetricsQueryDefinition {\n");
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
