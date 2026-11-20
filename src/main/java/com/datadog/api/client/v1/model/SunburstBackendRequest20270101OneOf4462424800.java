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
  SunburstBackendRequest20270101OneOf4462424800.JSON_PROPERTY_PROJECTION,
  SunburstBackendRequest20270101OneOf4462424800.JSON_PROPERTY_QUERY,
  SunburstBackendRequest20270101OneOf4462424800.JSON_PROPERTY_REQUEST_TYPE,
  SunburstBackendRequest20270101OneOf4462424800.JSON_PROPERTY_RESPONSE_FORMAT,
  SunburstBackendRequest20270101OneOf4462424800.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SunburstBackendRequest20270101OneOf4462424800 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PROJECTION = "projection";
  private TabularProjection_20270101 projection;

  public static final String JSON_PROPERTY_QUERY = "query";
  private SunburstBackendRequest20270101OneOfQuery query;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private SunburstBackendRequestAnyOfAnyOfItemRequestType4452231072_20270101 requestType;

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private SunburstBackendRequestAnyOfAnyOfItemResponseFormat4452231392_20270101 responseFormat;

  public static final String JSON_PROPERTY_STYLE = "style";
  private SunburstRequestStyle_20270101 style;

  public SunburstBackendRequest20270101OneOf4462424800() {}

  @JsonCreator
  public SunburstBackendRequest20270101OneOf4462424800(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY)
          SunburstBackendRequest20270101OneOfQuery query,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          SunburstBackendRequestAnyOfAnyOfItemRequestType4452231072_20270101 requestType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          SunburstBackendRequestAnyOfAnyOfItemResponseFormat4452231392_20270101 responseFormat) {
    this.query = query;
    this.unparsed |= query.unparsed;
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public SunburstBackendRequest20270101OneOf4462424800 projection(
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

  public SunburstBackendRequest20270101OneOf4462424800 query(
      SunburstBackendRequest20270101OneOfQuery query) {
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
  public SunburstBackendRequest20270101OneOfQuery getQuery() {
    return query;
  }

  public void setQuery(SunburstBackendRequest20270101OneOfQuery query) {
    this.query = query;
    if (query != null) {
      this.unparsed |= query.unparsed;
    }
  }

  public SunburstBackendRequest20270101OneOf4462424800 requestType(
      SunburstBackendRequestAnyOfAnyOfItemRequestType4452231072_20270101 requestType) {
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
  public SunburstBackendRequestAnyOfAnyOfItemRequestType4452231072_20270101 getRequestType() {
    return requestType;
  }

  public void setRequestType(
      SunburstBackendRequestAnyOfAnyOfItemRequestType4452231072_20270101 requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public SunburstBackendRequest20270101OneOf4462424800 responseFormat(
      SunburstBackendRequestAnyOfAnyOfItemResponseFormat4452231392_20270101 responseFormat) {
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
  public SunburstBackendRequestAnyOfAnyOfItemResponseFormat4452231392_20270101 getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(
      SunburstBackendRequestAnyOfAnyOfItemResponseFormat4452231392_20270101 responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  public SunburstBackendRequest20270101OneOf4462424800 style(SunburstRequestStyle_20270101 style) {
    this.style = style;
    this.unparsed |= style.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return style
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SunburstRequestStyle_20270101 getStyle() {
    return style;
  }

  public void setStyle(SunburstRequestStyle_20270101 style) {
    this.style = style;
    if (style != null) {
      this.unparsed |= style.unparsed;
    }
  }

  /** Return true if this SunburstBackendRequest20270101OneOf4462424800 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SunburstBackendRequest20270101OneOf4462424800 sunburstBackendRequest20270101OneOf4462424800 =
        (SunburstBackendRequest20270101OneOf4462424800) o;
    return Objects.equals(this.projection, sunburstBackendRequest20270101OneOf4462424800.projection)
        && Objects.equals(this.query, sunburstBackendRequest20270101OneOf4462424800.query)
        && Objects.equals(
            this.requestType, sunburstBackendRequest20270101OneOf4462424800.requestType)
        && Objects.equals(
            this.responseFormat, sunburstBackendRequest20270101OneOf4462424800.responseFormat)
        && Objects.equals(this.style, sunburstBackendRequest20270101OneOf4462424800.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projection, query, requestType, responseFormat, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SunburstBackendRequest20270101OneOf4462424800 {\n");
    sb.append("    projection: ").append(toIndentedString(projection)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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
