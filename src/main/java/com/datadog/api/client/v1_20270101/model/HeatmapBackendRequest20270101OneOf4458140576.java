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
  HeatmapBackendRequest20270101OneOf4458140576.JSON_PROPERTY_NUMBER_FORMAT,
  HeatmapBackendRequest20270101OneOf4458140576.JSON_PROPERTY_QUERY,
  HeatmapBackendRequest20270101OneOf4458140576.JSON_PROPERTY_REQUEST_TYPE,
  HeatmapBackendRequest20270101OneOf4458140576.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatmapBackendRequest20270101OneOf4458140576 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NUMBER_FORMAT = "number_format";
  private WidgetNumberFormat numberFormat;

  public static final String JSON_PROPERTY_QUERY = "query";
  private HeatmapBackendRequestAnyOfAnyOfItemQuery query;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private HeatmapBackendRequestAnyOfAnyOfItemRequestType requestType;

  public static final String JSON_PROPERTY_STYLE = "style";
  private RequestStyle style;

  public HeatmapBackendRequest20270101OneOf4458140576() {}

  @JsonCreator
  public HeatmapBackendRequest20270101OneOf4458140576(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY)
          HeatmapBackendRequestAnyOfAnyOfItemQuery query,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          HeatmapBackendRequestAnyOfAnyOfItemRequestType requestType) {
    this.query = query;
    this.unparsed |= query.unparsed;
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
  }

  public HeatmapBackendRequest20270101OneOf4458140576 numberFormat(
      WidgetNumberFormat numberFormat) {
    this.numberFormat = numberFormat;
    this.unparsed |= numberFormat.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return numberFormat
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetNumberFormat getNumberFormat() {
    return numberFormat;
  }

  public void setNumberFormat(WidgetNumberFormat numberFormat) {
    this.numberFormat = numberFormat;
    if (numberFormat != null) {
      this.unparsed |= numberFormat.unparsed;
    }
  }

  public HeatmapBackendRequest20270101OneOf4458140576 query(
      HeatmapBackendRequestAnyOfAnyOfItemQuery query) {
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
  public HeatmapBackendRequestAnyOfAnyOfItemQuery getQuery() {
    return query;
  }

  public void setQuery(HeatmapBackendRequestAnyOfAnyOfItemQuery query) {
    this.query = query;
    if (query != null) {
      this.unparsed |= query.unparsed;
    }
  }

  public HeatmapBackendRequest20270101OneOf4458140576 requestType(
      HeatmapBackendRequestAnyOfAnyOfItemRequestType requestType) {
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
  public HeatmapBackendRequestAnyOfAnyOfItemRequestType getRequestType() {
    return requestType;
  }

  public void setRequestType(HeatmapBackendRequestAnyOfAnyOfItemRequestType requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public HeatmapBackendRequest20270101OneOf4458140576 style(RequestStyle style) {
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
  public RequestStyle getStyle() {
    return style;
  }

  public void setStyle(RequestStyle style) {
    this.style = style;
    if (style != null) {
      this.unparsed |= style.unparsed;
    }
  }

  /** Return true if this HeatmapBackendRequest20270101OneOf4458140576 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatmapBackendRequest20270101OneOf4458140576 heatmapBackendRequest20270101OneOf4458140576 =
        (HeatmapBackendRequest20270101OneOf4458140576) o;
    return Objects.equals(
            this.numberFormat, heatmapBackendRequest20270101OneOf4458140576.numberFormat)
        && Objects.equals(this.query, heatmapBackendRequest20270101OneOf4458140576.query)
        && Objects.equals(
            this.requestType, heatmapBackendRequest20270101OneOf4458140576.requestType)
        && Objects.equals(this.style, heatmapBackendRequest20270101OneOf4458140576.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberFormat, query, requestType, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatmapBackendRequest20270101OneOf4458140576 {\n");
    sb.append("    numberFormat: ").append(toIndentedString(numberFormat)).append("\n");
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
