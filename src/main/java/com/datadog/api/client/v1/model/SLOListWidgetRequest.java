/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Updated SLO List widget.</p>
 */
@JsonPropertyOrder({
  SLOListWidgetRequest.JSON_PROPERTY_QUERY,
  SLOListWidgetRequest.JSON_PROPERTY_REQUEST_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOListWidgetRequest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_QUERY = "query";
  private SLOListWidgetQuery query;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private SLOListWidgetRequestType requestType;

  public SLOListWidgetRequest() {}

  @JsonCreator
  public SLOListWidgetRequest(
            @JsonProperty(required=true, value=JSON_PROPERTY_QUERY)SLOListWidgetQuery query,
            @JsonProperty(required=true, value=JSON_PROPERTY_REQUEST_TYPE)SLOListWidgetRequestType requestType) {
        this.query = query;
        this.unparsed |= query.unparsed;
        this.requestType = requestType;
        this.unparsed |= !requestType.isValid();
  }
  public SLOListWidgetRequest query(SLOListWidgetQuery query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * <p>Updated SLO List widget.</p>
   * @return query
  **/
      @JsonProperty(JSON_PROPERTY_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SLOListWidgetQuery getQuery() {
        return query;
      }
  public void setQuery(SLOListWidgetQuery query) {
    this.query = query;
  }
  public SLOListWidgetRequest requestType(SLOListWidgetRequestType requestType) {
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    return this;
  }

  /**
   * <p>Widget request type.</p>
   * @return requestType
  **/
      @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SLOListWidgetRequestType getRequestType() {
        return requestType;
      }
  public void setRequestType(SLOListWidgetRequestType requestType) {
    if (!requestType.isValid()) {
        this.unparsed = true;
    }
    this.requestType = requestType;
  }

  /**
   * Return true if this SLOListWidgetRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOListWidgetRequest sloListWidgetRequest = (SLOListWidgetRequest) o;
    return Objects.equals(this.query, sloListWidgetRequest.query) && Objects.equals(this.requestType, sloListWidgetRequest.requestType);
  }


  @Override
  public int hashCode() {
    return Objects.hash(query,requestType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOListWidgetRequest {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
