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

/** Retention curve widget request. */
@JsonPropertyOrder({
  RetentionCurveWidgetRequest.JSON_PROPERTY_QUERY,
  RetentionCurveWidgetRequest.JSON_PROPERTY_REQUEST_TYPE,
  RetentionCurveWidgetRequest.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RetentionCurveWidgetRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_QUERY = "query";
  private RetentionQuery query;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private RetentionCurveRequestType requestType;

  public static final String JSON_PROPERTY_STYLE = "style";
  private RetentionCurveStyle style;

  public RetentionCurveWidgetRequest() {}

  @JsonCreator
  public RetentionCurveWidgetRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) RetentionQuery query,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          RetentionCurveRequestType requestType) {
    this.query = query;
    this.unparsed |= query.unparsed;
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
  }

  public RetentionCurveWidgetRequest query(RetentionQuery query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * Retention query definition.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RetentionQuery getQuery() {
    return query;
  }

  public void setQuery(RetentionQuery query) {
    this.query = query;
  }

  public RetentionCurveWidgetRequest requestType(RetentionCurveRequestType requestType) {
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    return this;
  }

  /**
   * Request type for retention curve widget.
   *
   * @return requestType
   */
  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RetentionCurveRequestType getRequestType() {
    return requestType;
  }

  public void setRequestType(RetentionCurveRequestType requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public RetentionCurveWidgetRequest style(RetentionCurveStyle style) {
    this.style = style;
    this.unparsed |= style.unparsed;
    return this;
  }

  /**
   * Style configuration for retention curve.
   *
   * @return style
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RetentionCurveStyle getStyle() {
    return style;
  }

  public void setStyle(RetentionCurveStyle style) {
    this.style = style;
  }

  /** Return true if this RetentionCurveWidgetRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionCurveWidgetRequest retentionCurveWidgetRequest = (RetentionCurveWidgetRequest) o;
    return Objects.equals(this.query, retentionCurveWidgetRequest.query)
        && Objects.equals(this.requestType, retentionCurveWidgetRequest.requestType)
        && Objects.equals(this.style, retentionCurveWidgetRequest.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, requestType, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionCurveWidgetRequest {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
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
