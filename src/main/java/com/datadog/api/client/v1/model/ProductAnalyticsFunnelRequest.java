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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** User journey funnel widget request. */
@JsonPropertyOrder({
  ProductAnalyticsFunnelRequest.JSON_PROPERTY_COMPARISON_SEGMENTS,
  ProductAnalyticsFunnelRequest.JSON_PROPERTY_COMPARISON_TIME,
  ProductAnalyticsFunnelRequest.JSON_PROPERTY_QUERY,
  ProductAnalyticsFunnelRequest.JSON_PROPERTY_REQUEST_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsFunnelRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPARISON_SEGMENTS = "comparison_segments";
  private List<String> comparisonSegments = null;

  public static final String JSON_PROPERTY_COMPARISON_TIME = "comparison_time";
  private FunnelComparisonDuration comparisonTime;

  public static final String JSON_PROPERTY_QUERY = "query";
  private ProductAnalyticsFunnelQuery query;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private ProductAnalyticsFunnelRequestType requestType;

  public ProductAnalyticsFunnelRequest() {}

  @JsonCreator
  public ProductAnalyticsFunnelRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) ProductAnalyticsFunnelQuery query,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          ProductAnalyticsFunnelRequestType requestType) {
    this.query = query;
    this.unparsed |= query.unparsed;
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
  }

  public ProductAnalyticsFunnelRequest comparisonSegments(List<String> comparisonSegments) {
    this.comparisonSegments = comparisonSegments;
    return this;
  }

  public ProductAnalyticsFunnelRequest addComparisonSegmentsItem(String comparisonSegmentsItem) {
    if (this.comparisonSegments == null) {
      this.comparisonSegments = new ArrayList<>();
    }
    this.comparisonSegments.add(comparisonSegmentsItem);
    return this;
  }

  /**
   * Comparison segments.
   *
   * @return comparisonSegments
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPARISON_SEGMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getComparisonSegments() {
    return comparisonSegments;
  }

  public void setComparisonSegments(List<String> comparisonSegments) {
    this.comparisonSegments = comparisonSegments;
  }

  public ProductAnalyticsFunnelRequest comparisonTime(FunnelComparisonDuration comparisonTime) {
    this.comparisonTime = comparisonTime;
    this.unparsed |= comparisonTime.unparsed;
    return this;
  }

  /**
   * Comparison time configuration for funnel widgets.
   *
   * @return comparisonTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPARISON_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FunnelComparisonDuration getComparisonTime() {
    return comparisonTime;
  }

  public void setComparisonTime(FunnelComparisonDuration comparisonTime) {
    this.comparisonTime = comparisonTime;
  }

  public ProductAnalyticsFunnelRequest query(ProductAnalyticsFunnelQuery query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * User journey funnel query definition.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsFunnelQuery getQuery() {
    return query;
  }

  public void setQuery(ProductAnalyticsFunnelQuery query) {
    this.query = query;
  }

  public ProductAnalyticsFunnelRequest requestType(ProductAnalyticsFunnelRequestType requestType) {
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    return this;
  }

  /**
   * Request type for user journey funnel widget.
   *
   * @return requestType
   */
  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsFunnelRequestType getRequestType() {
    return requestType;
  }

  public void setRequestType(ProductAnalyticsFunnelRequestType requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  /** Return true if this ProductAnalyticsFunnelRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsFunnelRequest productAnalyticsFunnelRequest = (ProductAnalyticsFunnelRequest) o;
    return Objects.equals(this.comparisonSegments, productAnalyticsFunnelRequest.comparisonSegments)
        && Objects.equals(this.comparisonTime, productAnalyticsFunnelRequest.comparisonTime)
        && Objects.equals(this.query, productAnalyticsFunnelRequest.query)
        && Objects.equals(this.requestType, productAnalyticsFunnelRequest.requestType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparisonSegments, comparisonTime, query, requestType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsFunnelRequest {\n");
    sb.append("    comparisonSegments: ").append(toIndentedString(comparisonSegments)).append("\n");
    sb.append("    comparisonTime: ").append(toIndentedString(comparisonTime)).append("\n");
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
