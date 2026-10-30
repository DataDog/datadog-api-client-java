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

/** Journey Paths widget request. */
@JsonPropertyOrder({
  JourneyMapWidgetRequest.JSON_PROPERTY_QUERY,
  JourneyMapWidgetRequest.JSON_PROPERTY_REQUEST_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class JourneyMapWidgetRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_QUERY = "query";
  private JourneyMapQuery query;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private JourneyMapRequestType requestType;

  public JourneyMapWidgetRequest() {}

  @JsonCreator
  public JourneyMapWidgetRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) JourneyMapQuery query,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          JourneyMapRequestType requestType) {
    this.query = query;
    this.unparsed |= query.unparsed;
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
  }

  public JourneyMapWidgetRequest query(JourneyMapQuery query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * Journey Paths query definition.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public JourneyMapQuery getQuery() {
    return query;
  }

  public void setQuery(JourneyMapQuery query) {
    this.query = query;
    if (query != null) {
      this.unparsed |= query.unparsed;
    }
  }

  public JourneyMapWidgetRequest requestType(JourneyMapRequestType requestType) {
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    return this;
  }

  /**
   * Request type for the Journey Paths widget.
   *
   * @return requestType
   */
  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public JourneyMapRequestType getRequestType() {
    return requestType;
  }

  public void setRequestType(JourneyMapRequestType requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  /** Return true if this JourneyMapWidgetRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyMapWidgetRequest journeyMapWidgetRequest = (JourneyMapWidgetRequest) o;
    return Objects.equals(this.query, journeyMapWidgetRequest.query)
        && Objects.equals(this.requestType, journeyMapWidgetRequest.requestType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, requestType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyMapWidgetRequest {\n");
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
