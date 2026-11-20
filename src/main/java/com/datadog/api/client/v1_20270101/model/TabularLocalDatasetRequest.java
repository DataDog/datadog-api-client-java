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
  TabularLocalDatasetRequest.JSON_PROPERTY_PROJECTION,
  TabularLocalDatasetRequest.JSON_PROPERTY_QUERY,
  TabularLocalDatasetRequest.JSON_PROPERTY_REQUEST_TYPE,
  TabularLocalDatasetRequest.JSON_PROPERTY_RESPONSE_FORMAT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TabularLocalDatasetRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PROJECTION = "projection";
  private TabularProjection projection;

  public static final String JSON_PROPERTY_QUERY = "query";
  private TabularLocalDatasetRequest20270101Query query;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private TabularLocalDatasetRequestRequestType requestType;

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private TabularLocalDatasetRequestResponseFormat responseFormat;

  public TabularLocalDatasetRequest() {}

  @JsonCreator
  public TabularLocalDatasetRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY)
          TabularLocalDatasetRequest20270101Query query,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          TabularLocalDatasetRequestRequestType requestType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          TabularLocalDatasetRequestResponseFormat responseFormat) {
    this.query = query;
    this.unparsed |= query.unparsed;
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public TabularLocalDatasetRequest projection(TabularProjection projection) {
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
  public TabularProjection getProjection() {
    return projection;
  }

  public void setProjection(TabularProjection projection) {
    this.projection = projection;
    if (projection != null) {
      this.unparsed |= projection.unparsed;
    }
  }

  public TabularLocalDatasetRequest query(TabularLocalDatasetRequest20270101Query query) {
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
  public TabularLocalDatasetRequest20270101Query getQuery() {
    return query;
  }

  public void setQuery(TabularLocalDatasetRequest20270101Query query) {
    this.query = query;
    if (query != null) {
      this.unparsed |= query.unparsed;
    }
  }

  public TabularLocalDatasetRequest requestType(TabularLocalDatasetRequestRequestType requestType) {
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
  public TabularLocalDatasetRequestRequestType getRequestType() {
    return requestType;
  }

  public void setRequestType(TabularLocalDatasetRequestRequestType requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public TabularLocalDatasetRequest responseFormat(
      TabularLocalDatasetRequestResponseFormat responseFormat) {
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
  public TabularLocalDatasetRequestResponseFormat getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(TabularLocalDatasetRequestResponseFormat responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  /** Return true if this TabularLocalDatasetRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TabularLocalDatasetRequest tabularLocalDatasetRequest = (TabularLocalDatasetRequest) o;
    return Objects.equals(this.projection, tabularLocalDatasetRequest.projection)
        && Objects.equals(this.query, tabularLocalDatasetRequest.query)
        && Objects.equals(this.requestType, tabularLocalDatasetRequest.requestType)
        && Objects.equals(this.responseFormat, tabularLocalDatasetRequest.responseFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projection, query, requestType, responseFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TabularLocalDatasetRequest {\n");
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
