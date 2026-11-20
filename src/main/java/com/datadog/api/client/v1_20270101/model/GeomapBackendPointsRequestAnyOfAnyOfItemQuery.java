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
  GeomapBackendPointsRequestAnyOfAnyOfItemQuery.JSON_PROPERTY_DATA_SOURCE,
  GeomapBackendPointsRequestAnyOfAnyOfItemQuery.JSON_PROPERTY_QUERY_STRING
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GeomapBackendPointsRequestAnyOfAnyOfItemQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private NetworkDevicesDataSourceName dataSource;

  public static final String JSON_PROPERTY_QUERY_STRING = "query_string";
  private String queryString;

  public GeomapBackendPointsRequestAnyOfAnyOfItemQuery() {}

  @JsonCreator
  public GeomapBackendPointsRequestAnyOfAnyOfItemQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          NetworkDevicesDataSourceName dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY_STRING) String queryString) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.queryString = queryString;
  }

  public GeomapBackendPointsRequestAnyOfAnyOfItemQuery dataSource(
      NetworkDevicesDataSourceName dataSource) {
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
  public NetworkDevicesDataSourceName getDataSource() {
    return dataSource;
  }

  public void setDataSource(NetworkDevicesDataSourceName dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public GeomapBackendPointsRequestAnyOfAnyOfItemQuery queryString(String queryString) {
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

  /** Return true if this GeomapBackendPointsRequestAnyOfAnyOfItemQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeomapBackendPointsRequestAnyOfAnyOfItemQuery geomapBackendPointsRequestAnyOfAnyOfItemQuery =
        (GeomapBackendPointsRequestAnyOfAnyOfItemQuery) o;
    return Objects.equals(this.dataSource, geomapBackendPointsRequestAnyOfAnyOfItemQuery.dataSource)
        && Objects.equals(
            this.queryString, geomapBackendPointsRequestAnyOfAnyOfItemQuery.queryString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSource, queryString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeomapBackendPointsRequestAnyOfAnyOfItemQuery {\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
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
