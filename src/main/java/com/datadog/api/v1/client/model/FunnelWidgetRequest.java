/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Updated funnel widget. */
@JsonPropertyOrder({
  FunnelWidgetRequest.JSON_PROPERTY_QUERY,
  FunnelWidgetRequest.JSON_PROPERTY_REQUEST_TYPE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FunnelWidgetRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_QUERY = "query";
  private FunnelQuery query;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private FunnelRequestType requestType;

  public FunnelWidgetRequest() {}

  @JsonCreator
  public FunnelWidgetRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) FunnelQuery query,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          FunnelRequestType requestType) {
    this.query = query;
    this.unparsed |= query.unparsed;
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
  }

  public FunnelWidgetRequest query(FunnelQuery query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * Updated funnel widget.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FunnelQuery getQuery() {
    return query;
  }

  public void setQuery(FunnelQuery query) {
    this.query = query;
  }

  public FunnelWidgetRequest requestType(FunnelRequestType requestType) {
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    return this;
  }

  /**
   * Widget request type.
   *
   * @return requestType
   */
  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FunnelRequestType getRequestType() {
    return requestType;
  }

  public void setRequestType(FunnelRequestType requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  /** Return true if this FunnelWidgetRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FunnelWidgetRequest funnelWidgetRequest = (FunnelWidgetRequest) o;
    return Objects.equals(this.query, funnelWidgetRequest.query)
        && Objects.equals(this.requestType, funnelWidgetRequest.requestType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, requestType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunnelWidgetRequest {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("}");
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
