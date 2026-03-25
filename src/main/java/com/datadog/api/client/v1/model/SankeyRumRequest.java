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

/** Sankey widget with RUM data source. */
@JsonPropertyOrder({
  SankeyRumRequest.JSON_PROPERTY_QUERY,
  SankeyRumRequest.JSON_PROPERTY_REQUEST_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SankeyRumRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_QUERY = "query";
  private SankeyRumQuery query;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private SankeyWidgetDefinitionType requestType = SankeyWidgetDefinitionType.SANKEY;

  public SankeyRumRequest() {}

  @JsonCreator
  public SankeyRumRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) SankeyRumQuery query,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          SankeyWidgetDefinitionType requestType) {
    this.query = query;
    this.unparsed |= query.unparsed;
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
  }

  public SankeyRumRequest query(SankeyRumQuery query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * Sankey widget with RUM data source query.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SankeyRumQuery getQuery() {
    return query;
  }

  public void setQuery(SankeyRumQuery query) {
    this.query = query;
  }

  public SankeyRumRequest requestType(SankeyWidgetDefinitionType requestType) {
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    return this;
  }

  /**
   * Type of the Sankey widget.
   *
   * @return requestType
   */
  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SankeyWidgetDefinitionType getRequestType() {
    return requestType;
  }

  public void setRequestType(SankeyWidgetDefinitionType requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  /** Return true if this SankeyRumRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SankeyRumRequest sankeyRumRequest = (SankeyRumRequest) o;
    return Objects.equals(this.query, sankeyRumRequest.query)
        && Objects.equals(this.requestType, sankeyRumRequest.requestType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, requestType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SankeyRumRequest {\n");
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
