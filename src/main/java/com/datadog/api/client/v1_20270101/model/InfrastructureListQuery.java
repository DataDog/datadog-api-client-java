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
  InfrastructureListQuery.JSON_PROPERTY_DATA_SOURCE,
  InfrastructureListQuery.JSON_PROPERTY_QUERY_STRING,
  InfrastructureListQuery.JSON_PROPERTY_RESOURCE_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class InfrastructureListQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private InfrastructureListQueryDataSource dataSource;

  public static final String JSON_PROPERTY_QUERY_STRING = "query_string";
  private String queryString;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resource_type";
  private ContainerView resourceType;

  public InfrastructureListQuery() {}

  @JsonCreator
  public InfrastructureListQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          InfrastructureListQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY_STRING) String queryString,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_TYPE)
          ContainerView resourceType) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.queryString = queryString;
    this.resourceType = resourceType;
    this.unparsed |= resourceType.unparsed;
  }

  public InfrastructureListQuery dataSource(InfrastructureListQueryDataSource dataSource) {
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
  public InfrastructureListQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(InfrastructureListQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public InfrastructureListQuery queryString(String queryString) {
    this.queryString = queryString;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return queryString
   */
  @JsonProperty(JSON_PROPERTY_QUERY_STRING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQueryString() {
    return queryString;
  }

  public void setQueryString(String queryString) {
    this.queryString = queryString;
  }

  public InfrastructureListQuery resourceType(ContainerView resourceType) {
    this.resourceType = resourceType;
    this.unparsed |= resourceType.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return resourceType
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ContainerView getResourceType() {
    return resourceType;
  }

  public void setResourceType(ContainerView resourceType) {
    this.resourceType = resourceType;
    if (resourceType != null) {
      this.unparsed |= resourceType.unparsed;
    }
  }

  /** Return true if this InfrastructureListQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfrastructureListQuery infrastructureListQuery = (InfrastructureListQuery) o;
    return Objects.equals(this.dataSource, infrastructureListQuery.dataSource)
        && Objects.equals(this.queryString, infrastructureListQuery.queryString)
        && Objects.equals(this.resourceType, infrastructureListQuery.resourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSource, queryString, resourceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfrastructureListQuery {\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
