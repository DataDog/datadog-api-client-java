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
  TreemapBackendRequest20270101OneOf4463751424.JSON_PROPERTY_DDSQL_QUERY,
  TreemapBackendRequest20270101OneOf4463751424.JSON_PROPERTY_REQUEST_TYPE,
  TreemapBackendRequest20270101OneOf4463751424.JSON_PROPERTY_RESPONSE_FORMAT,
  TreemapBackendRequest20270101OneOf4463751424.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TreemapBackendRequest20270101OneOf4463751424 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DDSQL_QUERY = "ddsql_query";
  private String ddsqlQuery;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private TreemapBackendRequestAnyOfAnyOfItemRequestType4453528768 requestType;

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private TreemapBackendRequestAnyOfAnyOfItemResponseFormat4453529088 responseFormat;

  public static final String JSON_PROPERTY_STYLE = "style";
  private TreemapRequestStyle style;

  public TreemapBackendRequest20270101OneOf4463751424() {}

  @JsonCreator
  public TreemapBackendRequest20270101OneOf4463751424(
      @JsonProperty(required = true, value = JSON_PROPERTY_DDSQL_QUERY) String ddsqlQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          TreemapBackendRequestAnyOfAnyOfItemRequestType4453528768 requestType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          TreemapBackendRequestAnyOfAnyOfItemResponseFormat4453529088 responseFormat) {
    this.ddsqlQuery = ddsqlQuery;
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public TreemapBackendRequest20270101OneOf4463751424 ddsqlQuery(String ddsqlQuery) {
    this.ddsqlQuery = ddsqlQuery;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return ddsqlQuery
   */
  @JsonProperty(JSON_PROPERTY_DDSQL_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDdsqlQuery() {
    return ddsqlQuery;
  }

  public void setDdsqlQuery(String ddsqlQuery) {
    this.ddsqlQuery = ddsqlQuery;
  }

  public TreemapBackendRequest20270101OneOf4463751424 requestType(
      TreemapBackendRequestAnyOfAnyOfItemRequestType4453528768 requestType) {
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
  public TreemapBackendRequestAnyOfAnyOfItemRequestType4453528768 getRequestType() {
    return requestType;
  }

  public void setRequestType(TreemapBackendRequestAnyOfAnyOfItemRequestType4453528768 requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public TreemapBackendRequest20270101OneOf4463751424 responseFormat(
      TreemapBackendRequestAnyOfAnyOfItemResponseFormat4453529088 responseFormat) {
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
  public TreemapBackendRequestAnyOfAnyOfItemResponseFormat4453529088 getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(
      TreemapBackendRequestAnyOfAnyOfItemResponseFormat4453529088 responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  public TreemapBackendRequest20270101OneOf4463751424 style(TreemapRequestStyle style) {
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
  public TreemapRequestStyle getStyle() {
    return style;
  }

  public void setStyle(TreemapRequestStyle style) {
    this.style = style;
    if (style != null) {
      this.unparsed |= style.unparsed;
    }
  }

  /** Return true if this TreemapBackendRequest20270101OneOf4463751424 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TreemapBackendRequest20270101OneOf4463751424 treemapBackendRequest20270101OneOf4463751424 =
        (TreemapBackendRequest20270101OneOf4463751424) o;
    return Objects.equals(this.ddsqlQuery, treemapBackendRequest20270101OneOf4463751424.ddsqlQuery)
        && Objects.equals(
            this.requestType, treemapBackendRequest20270101OneOf4463751424.requestType)
        && Objects.equals(
            this.responseFormat, treemapBackendRequest20270101OneOf4463751424.responseFormat)
        && Objects.equals(this.style, treemapBackendRequest20270101OneOf4463751424.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ddsqlQuery, requestType, responseFormat, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TreemapBackendRequest20270101OneOf4463751424 {\n");
    sb.append("    ddsqlQuery: ").append(toIndentedString(ddsqlQuery)).append("\n");
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
