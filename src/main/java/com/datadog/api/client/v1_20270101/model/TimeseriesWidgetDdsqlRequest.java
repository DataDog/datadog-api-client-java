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
  TimeseriesWidgetDdsqlRequest.JSON_PROPERTY_DDSQL_QUERY,
  TimeseriesWidgetDdsqlRequest.JSON_PROPERTY_DISPLAY_TYPE,
  TimeseriesWidgetDdsqlRequest.JSON_PROPERTY_METADATA,
  TimeseriesWidgetDdsqlRequest.JSON_PROPERTY_ON_RIGHT_YAXIS,
  TimeseriesWidgetDdsqlRequest.JSON_PROPERTY_REQUEST_TYPE,
  TimeseriesWidgetDdsqlRequest.JSON_PROPERTY_RESPONSE_FORMAT,
  TimeseriesWidgetDdsqlRequest.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesWidgetDdsqlRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DDSQL_QUERY = "ddsql_query";
  private String ddsqlQuery;

  public static final String JSON_PROPERTY_DISPLAY_TYPE = "display_type";
  private WidgetDisplayType displayType;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private List<TimeseriesWidgetExpressionAlias> metadata = null;

  public static final String JSON_PROPERTY_ON_RIGHT_YAXIS = "on_right_yaxis";
  private Boolean onRightYaxis;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private TimeseriesWidgetDdsqlRequestRequestType requestType;

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private TimeseriesWidgetDdsqlRequestResponseFormat responseFormat;

  public static final String JSON_PROPERTY_STYLE = "style";
  private TimeseriesRequestStyle style;

  public TimeseriesWidgetDdsqlRequest() {}

  @JsonCreator
  public TimeseriesWidgetDdsqlRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_DDSQL_QUERY) String ddsqlQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          TimeseriesWidgetDdsqlRequestRequestType requestType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          TimeseriesWidgetDdsqlRequestResponseFormat responseFormat) {
    this.ddsqlQuery = ddsqlQuery;
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public TimeseriesWidgetDdsqlRequest ddsqlQuery(String ddsqlQuery) {
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

  public TimeseriesWidgetDdsqlRequest displayType(WidgetDisplayType displayType) {
    this.displayType = displayType;
    this.unparsed |= !displayType.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return displayType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetDisplayType getDisplayType() {
    return displayType;
  }

  public void setDisplayType(WidgetDisplayType displayType) {
    if (!displayType.isValid()) {
      this.unparsed = true;
    }
    this.displayType = displayType;
  }

  public TimeseriesWidgetDdsqlRequest metadata(List<TimeseriesWidgetExpressionAlias> metadata) {
    this.metadata = metadata;
    if (metadata != null) {
      for (TimeseriesWidgetExpressionAlias item : metadata) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public TimeseriesWidgetDdsqlRequest addMetadataItem(
      TimeseriesWidgetExpressionAlias metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    this.unparsed |= metadataItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TimeseriesWidgetExpressionAlias> getMetadata() {
    return metadata;
  }

  public void setMetadata(List<TimeseriesWidgetExpressionAlias> metadata) {
    this.metadata = metadata;
    if (metadata != null) {
      for (TimeseriesWidgetExpressionAlias item : metadata) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public TimeseriesWidgetDdsqlRequest onRightYaxis(Boolean onRightYaxis) {
    this.onRightYaxis = onRightYaxis;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return onRightYaxis
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ON_RIGHT_YAXIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getOnRightYaxis() {
    return onRightYaxis;
  }

  public void setOnRightYaxis(Boolean onRightYaxis) {
    this.onRightYaxis = onRightYaxis;
  }

  public TimeseriesWidgetDdsqlRequest requestType(
      TimeseriesWidgetDdsqlRequestRequestType requestType) {
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
  public TimeseriesWidgetDdsqlRequestRequestType getRequestType() {
    return requestType;
  }

  public void setRequestType(TimeseriesWidgetDdsqlRequestRequestType requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public TimeseriesWidgetDdsqlRequest responseFormat(
      TimeseriesWidgetDdsqlRequestResponseFormat responseFormat) {
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
  public TimeseriesWidgetDdsqlRequestResponseFormat getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(TimeseriesWidgetDdsqlRequestResponseFormat responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  public TimeseriesWidgetDdsqlRequest style(TimeseriesRequestStyle style) {
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
  public TimeseriesRequestStyle getStyle() {
    return style;
  }

  public void setStyle(TimeseriesRequestStyle style) {
    this.style = style;
    if (style != null) {
      this.unparsed |= style.unparsed;
    }
  }

  /** Return true if this TimeseriesWidgetDdsqlRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesWidgetDdsqlRequest timeseriesWidgetDdsqlRequest = (TimeseriesWidgetDdsqlRequest) o;
    return Objects.equals(this.ddsqlQuery, timeseriesWidgetDdsqlRequest.ddsqlQuery)
        && Objects.equals(this.displayType, timeseriesWidgetDdsqlRequest.displayType)
        && Objects.equals(this.metadata, timeseriesWidgetDdsqlRequest.metadata)
        && Objects.equals(this.onRightYaxis, timeseriesWidgetDdsqlRequest.onRightYaxis)
        && Objects.equals(this.requestType, timeseriesWidgetDdsqlRequest.requestType)
        && Objects.equals(this.responseFormat, timeseriesWidgetDdsqlRequest.responseFormat)
        && Objects.equals(this.style, timeseriesWidgetDdsqlRequest.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        ddsqlQuery, displayType, metadata, onRightYaxis, requestType, responseFormat, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesWidgetDdsqlRequest {\n");
    sb.append("    ddsqlQuery: ").append(toIndentedString(ddsqlQuery)).append("\n");
    sb.append("    displayType: ").append(toIndentedString(displayType)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    onRightYaxis: ").append(toIndentedString(onRightYaxis)).append("\n");
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
