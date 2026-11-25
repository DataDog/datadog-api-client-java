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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  BarChartBackendRequest20270101OneOf4454436672.JSON_PROPERTY_CONDITIONAL_FORMATS,
  BarChartBackendRequest20270101OneOf4454436672.JSON_PROPERTY_PROJECTION,
  BarChartBackendRequest20270101OneOf4454436672.JSON_PROPERTY_QUERY,
  BarChartBackendRequest20270101OneOf4454436672.JSON_PROPERTY_REQUEST_TYPE,
  BarChartBackendRequest20270101OneOf4454436672.JSON_PROPERTY_RESPONSE_FORMAT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class BarChartBackendRequest20270101OneOf4454436672 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<ThresholdFormattingRule_20270101> conditionalFormats = null;

  public static final String JSON_PROPERTY_PROJECTION = "projection";
  private TabularProjection_20270101 projection;

  public static final String JSON_PROPERTY_QUERY = "query";
  private BarChartBackendRequest20270101OneOfQuery query;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private BarChartBackendRequestAnyOfAnyOfItemRequestType4443924544_20270101 requestType;

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443924864_20270101 responseFormat;

  public BarChartBackendRequest20270101OneOf4454436672() {}

  @JsonCreator
  public BarChartBackendRequest20270101OneOf4454436672(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY)
          BarChartBackendRequest20270101OneOfQuery query,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          BarChartBackendRequestAnyOfAnyOfItemRequestType4443924544_20270101 requestType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443924864_20270101 responseFormat) {
    this.query = query;
    this.unparsed |= query.unparsed;
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public BarChartBackendRequest20270101OneOf4454436672 conditionalFormats(
      List<ThresholdFormattingRule_20270101> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule_20270101 item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public BarChartBackendRequest20270101OneOf4454436672 addConditionalFormatsItem(
      ThresholdFormattingRule_20270101 conditionalFormatsItem) {
    if (this.conditionalFormats == null) {
      this.conditionalFormats = new ArrayList<>();
    }
    this.conditionalFormats.add(conditionalFormatsItem);
    this.unparsed |= conditionalFormatsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return conditionalFormats
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONDITIONAL_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ThresholdFormattingRule_20270101> getConditionalFormats() {
    return conditionalFormats;
  }

  public void setConditionalFormats(List<ThresholdFormattingRule_20270101> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule_20270101 item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public BarChartBackendRequest20270101OneOf4454436672 projection(
      TabularProjection_20270101 projection) {
    this.projection = projection;
    this.unparsed |= projection.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return projection
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROJECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TabularProjection_20270101 getProjection() {
    return projection;
  }

  public void setProjection(TabularProjection_20270101 projection) {
    this.projection = projection;
    if (projection != null) {
      this.unparsed |= projection.unparsed;
    }
  }

  public BarChartBackendRequest20270101OneOf4454436672 query(
      BarChartBackendRequest20270101OneOfQuery query) {
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
  public BarChartBackendRequest20270101OneOfQuery getQuery() {
    return query;
  }

  public void setQuery(BarChartBackendRequest20270101OneOfQuery query) {
    this.query = query;
    if (query != null) {
      this.unparsed |= query.unparsed;
    }
  }

  public BarChartBackendRequest20270101OneOf4454436672 requestType(
      BarChartBackendRequestAnyOfAnyOfItemRequestType4443924544_20270101 requestType) {
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
  public BarChartBackendRequestAnyOfAnyOfItemRequestType4443924544_20270101 getRequestType() {
    return requestType;
  }

  public void setRequestType(
      BarChartBackendRequestAnyOfAnyOfItemRequestType4443924544_20270101 requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public BarChartBackendRequest20270101OneOf4454436672 responseFormat(
      BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443924864_20270101 responseFormat) {
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
  public BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443924864_20270101 getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(
      BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443924864_20270101 responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  /** Return true if this BarChartBackendRequest20270101OneOf4454436672 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BarChartBackendRequest20270101OneOf4454436672 barChartBackendRequest20270101OneOf4454436672 =
        (BarChartBackendRequest20270101OneOf4454436672) o;
    return Objects.equals(
            this.conditionalFormats,
            barChartBackendRequest20270101OneOf4454436672.conditionalFormats)
        && Objects.equals(this.projection, barChartBackendRequest20270101OneOf4454436672.projection)
        && Objects.equals(this.query, barChartBackendRequest20270101OneOf4454436672.query)
        && Objects.equals(
            this.requestType, barChartBackendRequest20270101OneOf4454436672.requestType)
        && Objects.equals(
            this.responseFormat, barChartBackendRequest20270101OneOf4454436672.responseFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionalFormats, projection, query, requestType, responseFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BarChartBackendRequest20270101OneOf4454436672 {\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    projection: ").append(toIndentedString(projection)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
