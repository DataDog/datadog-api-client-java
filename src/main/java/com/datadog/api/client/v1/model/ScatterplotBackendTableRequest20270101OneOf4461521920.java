/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  ScatterplotBackendTableRequest20270101OneOf4461521920.JSON_PROPERTY_PROJECTION,
  ScatterplotBackendTableRequest20270101OneOf4461521920.JSON_PROPERTY_QUERY,
  ScatterplotBackendTableRequest20270101OneOf4461521920.JSON_PROPERTY_REQUEST_TYPE,
  ScatterplotBackendTableRequest20270101OneOf4461521920.JSON_PROPERTY_RESPONSE_FORMAT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScatterplotBackendTableRequest20270101OneOf4461521920 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PROJECTION = "projection";
  private TabularProjection_20270101 projection;

  public static final String JSON_PROPERTY_QUERY = "query";
  private ScatterplotBackendTableRequest20270101OneOfQuery query;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451204320_20270101 requestType;

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451204640_20270101
      responseFormat;

  public ScatterplotBackendTableRequest20270101OneOf4461521920() {}

  @JsonCreator
  public ScatterplotBackendTableRequest20270101OneOf4461521920(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY)
          ScatterplotBackendTableRequest20270101OneOfQuery query,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451204320_20270101 requestType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451204640_20270101
              responseFormat) {
    this.query = query;
    this.unparsed |= query.unparsed;
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public ScatterplotBackendTableRequest20270101OneOf4461521920 projection(
      TabularProjection_20270101 projection) {
    this.projection = projection;
    this.unparsed |= projection.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return projection
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROJECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TabularProjection_20270101 getProjection() {
    return projection;
  }

  public void setProjection(TabularProjection_20270101 projection) {
    this.projection = projection;
    if (projection != null) {
      this.unparsed |= projection.unparsed;
    }
  }

  public ScatterplotBackendTableRequest20270101OneOf4461521920 query(
      ScatterplotBackendTableRequest20270101OneOfQuery query) {
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
  public ScatterplotBackendTableRequest20270101OneOfQuery getQuery() {
    return query;
  }

  public void setQuery(ScatterplotBackendTableRequest20270101OneOfQuery query) {
    this.query = query;
    if (query != null) {
      this.unparsed |= query.unparsed;
    }
  }

  public ScatterplotBackendTableRequest20270101OneOf4461521920 requestType(
      ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451204320_20270101 requestType) {
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
  public ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451204320_20270101
      getRequestType() {
    return requestType;
  }

  public void setRequestType(
      ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451204320_20270101 requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public ScatterplotBackendTableRequest20270101OneOf4461521920 responseFormat(
      ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451204640_20270101
          responseFormat) {
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return responseFormat
   */
  @JsonProperty(JSON_PROPERTY_RESPONSE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451204640_20270101
      getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(
      ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451204640_20270101
          responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  /**
   * Return true if this ScatterplotBackendTableRequest20270101OneOf4461521920 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScatterplotBackendTableRequest20270101OneOf4461521920
        scatterplotBackendTableRequest20270101OneOf4461521920 =
            (ScatterplotBackendTableRequest20270101OneOf4461521920) o;
    return Objects.equals(
            this.projection, scatterplotBackendTableRequest20270101OneOf4461521920.projection)
        && Objects.equals(this.query, scatterplotBackendTableRequest20270101OneOf4461521920.query)
        && Objects.equals(
            this.requestType, scatterplotBackendTableRequest20270101OneOf4461521920.requestType)
        && Objects.equals(
            this.responseFormat,
            scatterplotBackendTableRequest20270101OneOf4461521920.responseFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projection, query, requestType, responseFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScatterplotBackendTableRequest20270101OneOf4461521920 {\n");
    sb.append("    projection: ").append(toIndentedString(projection)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
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
