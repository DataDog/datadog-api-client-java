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
  ScatterplotBackendTableRequest20270101OneOf4461756480.JSON_PROPERTY_LIMIT,
  ScatterplotBackendTableRequest20270101OneOf4461756480.JSON_PROPERTY_PROJECTION,
  ScatterplotBackendTableRequest20270101OneOf4461756480.JSON_PROPERTY_QUERY,
  ScatterplotBackendTableRequest20270101OneOf4461756480.JSON_PROPERTY_REQUEST_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScatterplotBackendTableRequest20270101OneOf4461756480 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Double limit;

  public static final String JSON_PROPERTY_PROJECTION = "projection";
  private ScatterplotProjection projection;

  public static final String JSON_PROPERTY_QUERY = "query";
  private EventsPlatformDataProjectionQuery query;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451375104 requestType;

  public ScatterplotBackendTableRequest20270101OneOf4461756480() {}

  @JsonCreator
  public ScatterplotBackendTableRequest20270101OneOf4461756480(
      @JsonProperty(required = true, value = JSON_PROPERTY_PROJECTION)
          ScatterplotProjection projection,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY)
          EventsPlatformDataProjectionQuery query,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451375104 requestType) {
    this.projection = projection;
    this.unparsed |= projection.unparsed;
    this.query = query;
    this.unparsed |= query.unparsed;
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
  }

  public ScatterplotBackendTableRequest20270101OneOf4461756480 limit(Double limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return limit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLimit() {
    return limit;
  }

  public void setLimit(Double limit) {
    this.limit = limit;
  }

  public ScatterplotBackendTableRequest20270101OneOf4461756480 projection(
      ScatterplotProjection projection) {
    this.projection = projection;
    this.unparsed |= projection.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return projection
   */
  @JsonProperty(JSON_PROPERTY_PROJECTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ScatterplotProjection getProjection() {
    return projection;
  }

  public void setProjection(ScatterplotProjection projection) {
    this.projection = projection;
    if (projection != null) {
      this.unparsed |= projection.unparsed;
    }
  }

  public ScatterplotBackendTableRequest20270101OneOf4461756480 query(
      EventsPlatformDataProjectionQuery query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EventsPlatformDataProjectionQuery getQuery() {
    return query;
  }

  public void setQuery(EventsPlatformDataProjectionQuery query) {
    this.query = query;
    if (query != null) {
      this.unparsed |= query.unparsed;
    }
  }

  public ScatterplotBackendTableRequest20270101OneOf4461756480 requestType(
      ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451375104 requestType) {
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return requestType
   */
  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451375104 getRequestType() {
    return requestType;
  }

  public void setRequestType(
      ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451375104 requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  /**
   * Return true if this ScatterplotBackendTableRequest20270101OneOf4461756480 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScatterplotBackendTableRequest20270101OneOf4461756480
        scatterplotBackendTableRequest20270101OneOf4461756480 =
            (ScatterplotBackendTableRequest20270101OneOf4461756480) o;
    return Objects.equals(this.limit, scatterplotBackendTableRequest20270101OneOf4461756480.limit)
        && Objects.equals(
            this.projection, scatterplotBackendTableRequest20270101OneOf4461756480.projection)
        && Objects.equals(this.query, scatterplotBackendTableRequest20270101OneOf4461756480.query)
        && Objects.equals(
            this.requestType, scatterplotBackendTableRequest20270101OneOf4461756480.requestType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, projection, query, requestType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScatterplotBackendTableRequest20270101OneOf4461756480 {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    projection: ").append(toIndentedString(projection)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
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
