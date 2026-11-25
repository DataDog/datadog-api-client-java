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
  ToplistBackendRequest20270101OneOf4463321920.JSON_PROPERTY_CONDITIONAL_FORMATS,
  ToplistBackendRequest20270101OneOf4463321920.JSON_PROPERTY_PROJECTION,
  ToplistBackendRequest20270101OneOf4463321920.JSON_PROPERTY_QUERY,
  ToplistBackendRequest20270101OneOf4463321920.JSON_PROPERTY_REQUEST_TYPE,
  ToplistBackendRequest20270101OneOf4463321920.JSON_PROPERTY_RESPONSE_FORMAT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ToplistBackendRequest20270101OneOf4463321920 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<ThresholdFormattingRule_20270101> conditionalFormats = null;

  public static final String JSON_PROPERTY_PROJECTION = "projection";
  private TabularProjection_20270101 projection;

  public static final String JSON_PROPERTY_QUERY = "query";
  private ToplistBackendRequest20270101OneOfQuery query;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private ToplistBackendRequestAnyOfAnyOfItemRequestType4453036448_20270101 requestType;

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private ToplistBackendRequestAnyOfAnyOfItemResponseFormat4453036768_20270101 responseFormat;

  public ToplistBackendRequest20270101OneOf4463321920() {}

  @JsonCreator
  public ToplistBackendRequest20270101OneOf4463321920(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY)
          ToplistBackendRequest20270101OneOfQuery query,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          ToplistBackendRequestAnyOfAnyOfItemRequestType4453036448_20270101 requestType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          ToplistBackendRequestAnyOfAnyOfItemResponseFormat4453036768_20270101 responseFormat) {
    this.query = query;
    this.unparsed |= query.unparsed;
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public ToplistBackendRequest20270101OneOf4463321920 conditionalFormats(
      List<ThresholdFormattingRule_20270101> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule_20270101 item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ToplistBackendRequest20270101OneOf4463321920 addConditionalFormatsItem(
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

  public ToplistBackendRequest20270101OneOf4463321920 projection(
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

  public ToplistBackendRequest20270101OneOf4463321920 query(
      ToplistBackendRequest20270101OneOfQuery query) {
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
  public ToplistBackendRequest20270101OneOfQuery getQuery() {
    return query;
  }

  public void setQuery(ToplistBackendRequest20270101OneOfQuery query) {
    this.query = query;
    if (query != null) {
      this.unparsed |= query.unparsed;
    }
  }

  public ToplistBackendRequest20270101OneOf4463321920 requestType(
      ToplistBackendRequestAnyOfAnyOfItemRequestType4453036448_20270101 requestType) {
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
  public ToplistBackendRequestAnyOfAnyOfItemRequestType4453036448_20270101 getRequestType() {
    return requestType;
  }

  public void setRequestType(
      ToplistBackendRequestAnyOfAnyOfItemRequestType4453036448_20270101 requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public ToplistBackendRequest20270101OneOf4463321920 responseFormat(
      ToplistBackendRequestAnyOfAnyOfItemResponseFormat4453036768_20270101 responseFormat) {
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
  public ToplistBackendRequestAnyOfAnyOfItemResponseFormat4453036768_20270101 getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(
      ToplistBackendRequestAnyOfAnyOfItemResponseFormat4453036768_20270101 responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  /** Return true if this ToplistBackendRequest20270101OneOf4463321920 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToplistBackendRequest20270101OneOf4463321920 toplistBackendRequest20270101OneOf4463321920 =
        (ToplistBackendRequest20270101OneOf4463321920) o;
    return Objects.equals(
            this.conditionalFormats,
            toplistBackendRequest20270101OneOf4463321920.conditionalFormats)
        && Objects.equals(this.projection, toplistBackendRequest20270101OneOf4463321920.projection)
        && Objects.equals(this.query, toplistBackendRequest20270101OneOf4463321920.query)
        && Objects.equals(
            this.requestType, toplistBackendRequest20270101OneOf4463321920.requestType)
        && Objects.equals(
            this.responseFormat, toplistBackendRequest20270101OneOf4463321920.responseFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionalFormats, projection, query, requestType, responseFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToplistBackendRequest20270101OneOf4463321920 {\n");
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
