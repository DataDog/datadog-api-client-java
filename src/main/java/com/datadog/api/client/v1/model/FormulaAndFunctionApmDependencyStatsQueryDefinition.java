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
   * <p>A formula and functions APM dependency stats query.</p>
 */
@JsonPropertyOrder({
  FormulaAndFunctionApmDependencyStatsQueryDefinition.JSON_PROPERTY_CROSS_ORG_UUIDS,
  FormulaAndFunctionApmDependencyStatsQueryDefinition.JSON_PROPERTY_DATA_SOURCE,
  FormulaAndFunctionApmDependencyStatsQueryDefinition.JSON_PROPERTY_ENV,
  FormulaAndFunctionApmDependencyStatsQueryDefinition.JSON_PROPERTY_IS_UPSTREAM,
  FormulaAndFunctionApmDependencyStatsQueryDefinition.JSON_PROPERTY_NAME,
  FormulaAndFunctionApmDependencyStatsQueryDefinition.JSON_PROPERTY_OPERATION_NAME,
  FormulaAndFunctionApmDependencyStatsQueryDefinition.JSON_PROPERTY_PRIMARY_TAG_NAME,
  FormulaAndFunctionApmDependencyStatsQueryDefinition.JSON_PROPERTY_PRIMARY_TAG_VALUE,
  FormulaAndFunctionApmDependencyStatsQueryDefinition.JSON_PROPERTY_RESOURCE_NAME,
  FormulaAndFunctionApmDependencyStatsQueryDefinition.JSON_PROPERTY_SERVICE,
  FormulaAndFunctionApmDependencyStatsQueryDefinition.JSON_PROPERTY_STAT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaAndFunctionApmDependencyStatsQueryDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CROSS_ORG_UUIDS = "cross_org_uuids";
  private List<String> crossOrgUuids = null;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FormulaAndFunctionApmDependencyStatsDataSource dataSource;

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
  private FormulaAndFunctionApmDependencyStatName stat;

  public FormulaAndFunctionApmDependencyStatsQueryDefinition() {}

  @JsonCreator
  public FormulaAndFunctionApmDependencyStatsQueryDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_DATA_SOURCE)FormulaAndFunctionApmDependencyStatsDataSource dataSource,
            @JsonProperty(required=true, value=JSON_PROPERTY_ENV)String env,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_OPERATION_NAME)String operationName,
            @JsonProperty(required=true, value=JSON_PROPERTY_RESOURCE_NAME)String resourceName,
            @JsonProperty(required=true, value=JSON_PROPERTY_SERVICE)String service,
            @JsonProperty(required=true, value=JSON_PROPERTY_STAT)FormulaAndFunctionApmDependencyStatName stat) {
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
  public FormulaAndFunctionApmDependencyStatsQueryDefinition crossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
    return this;
  }
  public FormulaAndFunctionApmDependencyStatsQueryDefinition addCrossOrgUuidsItem(String crossOrgUuidsItem) {
    if (this.crossOrgUuids == null) {
      this.crossOrgUuids = new ArrayList<>();
    }
    this.crossOrgUuids.add(crossOrgUuidsItem);
    return this;
  }

  /**
   * <p>The source organization UUID for cross organization queries. Feature in Private Beta.</p>
   * @return crossOrgUuids
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CROSS_ORG_UUIDS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getCrossOrgUuids() {
        return crossOrgUuids;
      }
  public void setCrossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
  }
  public FormulaAndFunctionApmDependencyStatsQueryDefinition dataSource(FormulaAndFunctionApmDependencyStatsDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * <p>Data source for APM dependency stats queries.</p>
   * @return dataSource
  **/
      @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public FormulaAndFunctionApmDependencyStatsDataSource getDataSource() {
        return dataSource;
      }
  public void setDataSource(FormulaAndFunctionApmDependencyStatsDataSource dataSource) {
    if (!dataSource.isValid()) {
        this.unparsed = true;
    }
    this.dataSource = dataSource;
  }
  public FormulaAndFunctionApmDependencyStatsQueryDefinition env(String env) {
    this.env = env;
    return this;
  }

  /**
   * <p>APM environment.</p>
   * @return env
  **/
      @JsonProperty(JSON_PROPERTY_ENV)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getEnv() {
        return env;
      }
  public void setEnv(String env) {
    this.env = env;
  }
  public FormulaAndFunctionApmDependencyStatsQueryDefinition isUpstream(Boolean isUpstream) {
    this.isUpstream = isUpstream;
    return this;
  }

  /**
   * <p>Determines whether stats for upstream or downstream dependencies should be queried.</p>
   * @return isUpstream
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_UPSTREAM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsUpstream() {
        return isUpstream;
      }
  public void setIsUpstream(Boolean isUpstream) {
    this.isUpstream = isUpstream;
  }
  public FormulaAndFunctionApmDependencyStatsQueryDefinition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of query to use in formulas.</p>
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
  public FormulaAndFunctionApmDependencyStatsQueryDefinition operationName(String operationName) {
    this.operationName = operationName;
    return this;
  }

  /**
   * <p>Name of operation on service.</p>
   * @return operationName
  **/
      @JsonProperty(JSON_PROPERTY_OPERATION_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getOperationName() {
        return operationName;
      }
  public void setOperationName(String operationName) {
    this.operationName = operationName;
  }
  public FormulaAndFunctionApmDependencyStatsQueryDefinition primaryTagName(String primaryTagName) {
    this.primaryTagName = primaryTagName;
    return this;
  }

  /**
   * <p>The name of the second primary tag used within APM; required when <code>primary_tag_value</code> is specified. See https://docs.datadoghq.com/tracing/guide/setting_primary_tags_to_scope/#add-a-second-primary-tag-in-datadog.</p>
   * @return primaryTagName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PRIMARY_TAG_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPrimaryTagName() {
        return primaryTagName;
      }
  public void setPrimaryTagName(String primaryTagName) {
    this.primaryTagName = primaryTagName;
  }
  public FormulaAndFunctionApmDependencyStatsQueryDefinition primaryTagValue(String primaryTagValue) {
    this.primaryTagValue = primaryTagValue;
    return this;
  }

  /**
   * <p>Filter APM data by the second primary tag. <code>primary_tag_name</code> must also be specified.</p>
   * @return primaryTagValue
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PRIMARY_TAG_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPrimaryTagValue() {
        return primaryTagValue;
      }
  public void setPrimaryTagValue(String primaryTagValue) {
    this.primaryTagValue = primaryTagValue;
  }
  public FormulaAndFunctionApmDependencyStatsQueryDefinition resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * <p>APM resource.</p>
   * @return resourceName
  **/
      @JsonProperty(JSON_PROPERTY_RESOURCE_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getResourceName() {
        return resourceName;
      }
  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }
  public FormulaAndFunctionApmDependencyStatsQueryDefinition service(String service) {
    this.service = service;
    return this;
  }

  /**
   * <p>APM service.</p>
   * @return service
  **/
      @JsonProperty(JSON_PROPERTY_SERVICE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getService() {
        return service;
      }
  public void setService(String service) {
    this.service = service;
  }
  public FormulaAndFunctionApmDependencyStatsQueryDefinition stat(FormulaAndFunctionApmDependencyStatName stat) {
    this.stat = stat;
    this.unparsed |= !stat.isValid();
    return this;
  }

  /**
   * <p>APM statistic.</p>
   * @return stat
  **/
      @JsonProperty(JSON_PROPERTY_STAT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public FormulaAndFunctionApmDependencyStatName getStat() {
        return stat;
      }
  public void setStat(FormulaAndFunctionApmDependencyStatName stat) {
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
   * @return FormulaAndFunctionApmDependencyStatsQueryDefinition
   */
  @JsonAnySetter
  public FormulaAndFunctionApmDependencyStatsQueryDefinition putAdditionalProperty(String key, Object value) {
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
   * Return true if this FormulaAndFunctionApmDependencyStatsQueryDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaAndFunctionApmDependencyStatsQueryDefinition formulaAndFunctionApmDependencyStatsQueryDefinition = (FormulaAndFunctionApmDependencyStatsQueryDefinition) o;
    return Objects.equals(this.crossOrgUuids, formulaAndFunctionApmDependencyStatsQueryDefinition.crossOrgUuids) && Objects.equals(this.dataSource, formulaAndFunctionApmDependencyStatsQueryDefinition.dataSource) && Objects.equals(this.env, formulaAndFunctionApmDependencyStatsQueryDefinition.env) && Objects.equals(this.isUpstream, formulaAndFunctionApmDependencyStatsQueryDefinition.isUpstream) && Objects.equals(this.name, formulaAndFunctionApmDependencyStatsQueryDefinition.name) && Objects.equals(this.operationName, formulaAndFunctionApmDependencyStatsQueryDefinition.operationName) && Objects.equals(this.primaryTagName, formulaAndFunctionApmDependencyStatsQueryDefinition.primaryTagName) && Objects.equals(this.primaryTagValue, formulaAndFunctionApmDependencyStatsQueryDefinition.primaryTagValue) && Objects.equals(this.resourceName, formulaAndFunctionApmDependencyStatsQueryDefinition.resourceName) && Objects.equals(this.service, formulaAndFunctionApmDependencyStatsQueryDefinition.service) && Objects.equals(this.stat, formulaAndFunctionApmDependencyStatsQueryDefinition.stat) && Objects.equals(this.additionalProperties, formulaAndFunctionApmDependencyStatsQueryDefinition.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(crossOrgUuids,dataSource,env,isUpstream,name,operationName,primaryTagName,primaryTagValue,resourceName,service,stat, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaAndFunctionApmDependencyStatsQueryDefinition {\n");
    sb.append("    crossOrgUuids: ").append(toIndentedString(crossOrgUuids)).append("\n");
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
