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
  ScatterplotBackendTableRequest20270101OneOf.JSON_PROPERTY_DDSQL_QUERY,
  ScatterplotBackendTableRequest20270101OneOf.JSON_PROPERTY_REQUEST_TYPE,
  ScatterplotBackendTableRequest20270101OneOf.JSON_PROPERTY_RESPONSE_FORMAT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScatterplotBackendTableRequest20270101OneOf {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DDSQL_QUERY = "ddsql_query";
  private String ddsqlQuery;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType requestType;

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat responseFormat;

  public ScatterplotBackendTableRequest20270101OneOf() {}

  @JsonCreator
  public ScatterplotBackendTableRequest20270101OneOf(
      @JsonProperty(required = true, value = JSON_PROPERTY_DDSQL_QUERY) String ddsqlQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType requestType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat responseFormat) {
    this.ddsqlQuery = ddsqlQuery;
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public ScatterplotBackendTableRequest20270101OneOf ddsqlQuery(String ddsqlQuery) {
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

  public ScatterplotBackendTableRequest20270101OneOf requestType(
      ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType requestType) {
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
  public ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType getRequestType() {
    return requestType;
  }

  public void setRequestType(ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public ScatterplotBackendTableRequest20270101OneOf responseFormat(
      ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat responseFormat) {
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
  public ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(
      ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  /** Return true if this ScatterplotBackendTableRequest20270101OneOf object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScatterplotBackendTableRequest20270101OneOf scatterplotBackendTableRequest20270101OneOf =
        (ScatterplotBackendTableRequest20270101OneOf) o;
    return Objects.equals(this.ddsqlQuery, scatterplotBackendTableRequest20270101OneOf.ddsqlQuery)
        && Objects.equals(this.requestType, scatterplotBackendTableRequest20270101OneOf.requestType)
        && Objects.equals(
            this.responseFormat, scatterplotBackendTableRequest20270101OneOf.responseFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ddsqlQuery, requestType, responseFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScatterplotBackendTableRequest20270101OneOf {\n");
    sb.append("    ddsqlQuery: ").append(toIndentedString(ddsqlQuery)).append("\n");
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
