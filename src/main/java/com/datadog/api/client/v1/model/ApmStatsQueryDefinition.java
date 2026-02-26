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
   * <p>The APM stats query for table and distributions widgets.</p>
 */
@JsonPropertyOrder({
  ApmStatsQueryDefinition.JSON_PROPERTY_COLUMNS,
  ApmStatsQueryDefinition.JSON_PROPERTY_ENV,
  ApmStatsQueryDefinition.JSON_PROPERTY_NAME,
  ApmStatsQueryDefinition.JSON_PROPERTY_PRIMARY_TAG,
  ApmStatsQueryDefinition.JSON_PROPERTY_RESOURCE,
  ApmStatsQueryDefinition.JSON_PROPERTY_ROW_TYPE,
  ApmStatsQueryDefinition.JSON_PROPERTY_SERVICE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApmStatsQueryDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<ApmStatsQueryColumnType> columns = null;

  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PRIMARY_TAG = "primary_tag";
  private String primaryTag;

  public static final String JSON_PROPERTY_RESOURCE = "resource";
  private String resource;

  public static final String JSON_PROPERTY_ROW_TYPE = "row_type";
  private ApmStatsQueryRowType rowType;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public ApmStatsQueryDefinition() {}

  @JsonCreator
  public ApmStatsQueryDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_ENV)String env,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_PRIMARY_TAG)String primaryTag,
            @JsonProperty(required=true, value=JSON_PROPERTY_ROW_TYPE)ApmStatsQueryRowType rowType,
            @JsonProperty(required=true, value=JSON_PROPERTY_SERVICE)String service) {
        this.env = env;
        this.name = name;
        this.primaryTag = primaryTag;
        this.rowType = rowType;
        this.unparsed |= !rowType.isValid();
        this.service = service;
  }
  public ApmStatsQueryDefinition columns(List<ApmStatsQueryColumnType> columns) {
    this.columns = columns;
    for (ApmStatsQueryColumnType item : columns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ApmStatsQueryDefinition addColumnsItem(ApmStatsQueryColumnType columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    this.unparsed |= columnsItem.unparsed;
    return this;
  }

  /**
   * <p>Column properties used by the front end for display.</p>
   * @return columns
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COLUMNS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ApmStatsQueryColumnType> getColumns() {
        return columns;
      }
  public void setColumns(List<ApmStatsQueryColumnType> columns) {
    this.columns = columns;
  }
  public ApmStatsQueryDefinition env(String env) {
    this.env = env;
    return this;
  }

  /**
   * <p>Environment name.</p>
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
  public ApmStatsQueryDefinition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Operation name associated with service.</p>
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
  public ApmStatsQueryDefinition primaryTag(String primaryTag) {
    this.primaryTag = primaryTag;
    return this;
  }

  /**
   * <p>The organization's host group name and value.</p>
   * @return primaryTag
  **/
      @JsonProperty(JSON_PROPERTY_PRIMARY_TAG)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getPrimaryTag() {
        return primaryTag;
      }
  public void setPrimaryTag(String primaryTag) {
    this.primaryTag = primaryTag;
  }
  public ApmStatsQueryDefinition resource(String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * <p>Resource name.</p>
   * @return resource
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESOURCE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getResource() {
        return resource;
      }
  public void setResource(String resource) {
    this.resource = resource;
  }
  public ApmStatsQueryDefinition rowType(ApmStatsQueryRowType rowType) {
    this.rowType = rowType;
    this.unparsed |= !rowType.isValid();
    return this;
  }

  /**
   * <p>The level of detail for the request.</p>
   * @return rowType
  **/
      @JsonProperty(JSON_PROPERTY_ROW_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ApmStatsQueryRowType getRowType() {
        return rowType;
      }
  public void setRowType(ApmStatsQueryRowType rowType) {
    if (!rowType.isValid()) {
        this.unparsed = true;
    }
    this.rowType = rowType;
  }
  public ApmStatsQueryDefinition service(String service) {
    this.service = service;
    return this;
  }

  /**
   * <p>Service name.</p>
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
   * @return ApmStatsQueryDefinition
   */
  @JsonAnySetter
  public ApmStatsQueryDefinition putAdditionalProperty(String key, Object value) {
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
   * Return true if this ApmStatsQueryDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApmStatsQueryDefinition apmStatsQueryDefinition = (ApmStatsQueryDefinition) o;
    return Objects.equals(this.columns, apmStatsQueryDefinition.columns) && Objects.equals(this.env, apmStatsQueryDefinition.env) && Objects.equals(this.name, apmStatsQueryDefinition.name) && Objects.equals(this.primaryTag, apmStatsQueryDefinition.primaryTag) && Objects.equals(this.resource, apmStatsQueryDefinition.resource) && Objects.equals(this.rowType, apmStatsQueryDefinition.rowType) && Objects.equals(this.service, apmStatsQueryDefinition.service) && Objects.equals(this.additionalProperties, apmStatsQueryDefinition.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(columns,env,name,primaryTag,resource,rowType,service, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApmStatsQueryDefinition {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    primaryTag: ").append(toIndentedString(primaryTag)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    rowType: ").append(toIndentedString(rowType)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
