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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  GeomapBackendRegionsRequest20270101OneOf4457233792.JSON_PROPERTY_CONDITIONAL_FORMATS,
  GeomapBackendRegionsRequest20270101OneOf4457233792.JSON_PROPERTY_DDSQL_QUERY,
  GeomapBackendRegionsRequest20270101OneOf4457233792.JSON_PROPERTY_REQUEST_TYPE,
  GeomapBackendRegionsRequest20270101OneOf4457233792.JSON_PROPERTY_RESPONSE_FORMAT,
  GeomapBackendRegionsRequest20270101OneOf4457233792.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GeomapBackendRegionsRequest20270101OneOf4457233792 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<ThresholdFormattingRule> conditionalFormats = null;

  public static final String JSON_PROPERTY_DDSQL_QUERY = "ddsql_query";
  private String ddsqlQuery;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private GeomapBackendRegionsRequestAnyOfAnyOfItemRequestType requestType;

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat4447008416 responseFormat;

  public static final String JSON_PROPERTY_STYLE = "style";
  private GeomapRequestStyle style;

  public GeomapBackendRegionsRequest20270101OneOf4457233792() {}

  @JsonCreator
  public GeomapBackendRegionsRequest20270101OneOf4457233792(
      @JsonProperty(required = true, value = JSON_PROPERTY_DDSQL_QUERY) String ddsqlQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          GeomapBackendRegionsRequestAnyOfAnyOfItemRequestType requestType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat4447008416 responseFormat) {
    this.ddsqlQuery = ddsqlQuery;
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public GeomapBackendRegionsRequest20270101OneOf4457233792 conditionalFormats(
      List<ThresholdFormattingRule> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public GeomapBackendRegionsRequest20270101OneOf4457233792 addConditionalFormatsItem(
      ThresholdFormattingRule conditionalFormatsItem) {
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
  public List<ThresholdFormattingRule> getConditionalFormats() {
    return conditionalFormats;
  }

  public void setConditionalFormats(List<ThresholdFormattingRule> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public GeomapBackendRegionsRequest20270101OneOf4457233792 ddsqlQuery(String ddsqlQuery) {
    this.ddsqlQuery = ddsqlQuery;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return ddsqlQuery
   */
  @JsonProperty(JSON_PROPERTY_DDSQL_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDdsqlQuery() {
    return ddsqlQuery;
  }

  public void setDdsqlQuery(String ddsqlQuery) {
    this.ddsqlQuery = ddsqlQuery;
  }

  public GeomapBackendRegionsRequest20270101OneOf4457233792 requestType(
      GeomapBackendRegionsRequestAnyOfAnyOfItemRequestType requestType) {
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
  public GeomapBackendRegionsRequestAnyOfAnyOfItemRequestType getRequestType() {
    return requestType;
  }

  public void setRequestType(GeomapBackendRegionsRequestAnyOfAnyOfItemRequestType requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public GeomapBackendRegionsRequest20270101OneOf4457233792 responseFormat(
      GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat4447008416 responseFormat) {
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
  public GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat4447008416 getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(
      GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat4447008416 responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  public GeomapBackendRegionsRequest20270101OneOf4457233792 style(GeomapRequestStyle style) {
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
  public GeomapRequestStyle getStyle() {
    return style;
  }

  public void setStyle(GeomapRequestStyle style) {
    this.style = style;
    if (style != null) {
      this.unparsed |= style.unparsed;
    }
  }

  /**
   * Return true if this GeomapBackendRegionsRequest20270101OneOf4457233792 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeomapBackendRegionsRequest20270101OneOf4457233792
        geomapBackendRegionsRequest20270101OneOf4457233792 =
            (GeomapBackendRegionsRequest20270101OneOf4457233792) o;
    return Objects.equals(
            this.conditionalFormats,
            geomapBackendRegionsRequest20270101OneOf4457233792.conditionalFormats)
        && Objects.equals(
            this.ddsqlQuery, geomapBackendRegionsRequest20270101OneOf4457233792.ddsqlQuery)
        && Objects.equals(
            this.requestType, geomapBackendRegionsRequest20270101OneOf4457233792.requestType)
        && Objects.equals(
            this.responseFormat, geomapBackendRegionsRequest20270101OneOf4457233792.responseFormat)
        && Objects.equals(this.style, geomapBackendRegionsRequest20270101OneOf4457233792.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionalFormats, ddsqlQuery, requestType, responseFormat, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeomapBackendRegionsRequest20270101OneOf4457233792 {\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    ddsqlQuery: ").append(toIndentedString(ddsqlQuery)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
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
