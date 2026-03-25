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

/** Sankey widget request for network data source. */
@JsonPropertyOrder({
  SankeyNetworkRequest.JSON_PROPERTY_QUERY,
  SankeyNetworkRequest.JSON_PROPERTY_REQUEST_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SankeyNetworkRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_QUERY = "query";
  private SankeyNetworkQuery query;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private SankeyNetworkRequestType requestType = SankeyNetworkRequestType.NETFLOW_SANKEY;

  public SankeyNetworkRequest() {}

  @JsonCreator
  public SankeyNetworkRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) SankeyNetworkQuery query,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          SankeyNetworkRequestType requestType) {
    this.query = query;
    this.unparsed |= query.unparsed;
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
  }

  public SankeyNetworkRequest query(SankeyNetworkQuery query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * Query configuration for Sankey network widget.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SankeyNetworkQuery getQuery() {
    return query;
  }

  public void setQuery(SankeyNetworkQuery query) {
    this.query = query;
  }

  public SankeyNetworkRequest requestType(SankeyNetworkRequestType requestType) {
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    return this;
  }

  /**
   * Type of request for network Sankey widget.
   *
   * @return requestType
   */
  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SankeyNetworkRequestType getRequestType() {
    return requestType;
  }

  public void setRequestType(SankeyNetworkRequestType requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  /** Return true if this SankeyNetworkRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SankeyNetworkRequest sankeyNetworkRequest = (SankeyNetworkRequest) o;
    return Objects.equals(this.query, sankeyNetworkRequest.query)
        && Objects.equals(this.requestType, sankeyNetworkRequest.requestType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, requestType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SankeyNetworkRequest {\n");
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
