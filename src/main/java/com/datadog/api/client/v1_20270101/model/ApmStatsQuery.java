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
  ApmStatsQuery.JSON_PROPERTY_COLUMNS,
  ApmStatsQuery.JSON_PROPERTY_ENV,
  ApmStatsQuery.JSON_PROPERTY_NAME,
  ApmStatsQuery.JSON_PROPERTY_PRIMARY_TAG,
  ApmStatsQuery.JSON_PROPERTY_RESOURCE,
  ApmStatsQuery.JSON_PROPERTY_ROW_TYPE,
  ApmStatsQuery.JSON_PROPERTY_SERVICE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApmStatsQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<QueryTableColumnRequest> columns = null;

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

  public ApmStatsQuery() {}

  @JsonCreator
  public ApmStatsQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENV) String env,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRIMARY_TAG) String primaryTag,
      @JsonProperty(required = true, value = JSON_PROPERTY_ROW_TYPE) ApmStatsQueryRowType rowType,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE) String service) {
    this.env = env;
    this.name = name;
    this.primaryTag = primaryTag;
    this.rowType = rowType;
    this.unparsed |= !rowType.isValid();
    this.service = service;
  }

  public ApmStatsQuery columns(List<QueryTableColumnRequest> columns) {
    this.columns = columns;
    if (columns != null) {
      for (QueryTableColumnRequest item : columns) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ApmStatsQuery addColumnsItem(QueryTableColumnRequest columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    this.unparsed |= columnsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return columns
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<QueryTableColumnRequest> getColumns() {
    return columns;
  }

  public void setColumns(List<QueryTableColumnRequest> columns) {
    this.columns = columns;
    if (columns != null) {
      for (QueryTableColumnRequest item : columns) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ApmStatsQuery env(String env) {
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

  public ApmStatsQuery name(String name) {
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

  public ApmStatsQuery primaryTag(String primaryTag) {
    this.primaryTag = primaryTag;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return primaryTag
   */
  @JsonProperty(JSON_PROPERTY_PRIMARY_TAG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPrimaryTag() {
    return primaryTag;
  }

  public void setPrimaryTag(String primaryTag) {
    this.primaryTag = primaryTag;
  }

  public ApmStatsQuery resource(String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return resource
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public ApmStatsQuery rowType(ApmStatsQueryRowType rowType) {
    this.rowType = rowType;
    this.unparsed |= !rowType.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return rowType
   */
  @JsonProperty(JSON_PROPERTY_ROW_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ApmStatsQueryRowType getRowType() {
    return rowType;
  }

  public void setRowType(ApmStatsQueryRowType rowType) {
    if (!rowType.isValid()) {
      this.unparsed = true;
    }
    this.rowType = rowType;
  }

  public ApmStatsQuery service(String service) {
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

  /** Return true if this ApmStatsQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApmStatsQuery apmStatsQuery = (ApmStatsQuery) o;
    return Objects.equals(this.columns, apmStatsQuery.columns)
        && Objects.equals(this.env, apmStatsQuery.env)
        && Objects.equals(this.name, apmStatsQuery.name)
        && Objects.equals(this.primaryTag, apmStatsQuery.primaryTag)
        && Objects.equals(this.resource, apmStatsQuery.resource)
        && Objects.equals(this.rowType, apmStatsQuery.rowType)
        && Objects.equals(this.service, apmStatsQuery.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, env, name, primaryTag, resource, rowType, service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApmStatsQuery {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    primaryTag: ").append(toIndentedString(primaryTag)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    rowType: ").append(toIndentedString(rowType)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
