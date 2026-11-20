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
  ApmStatsHistogramRequest.JSON_PROPERTY_NUMBER_FORMAT,
  ApmStatsHistogramRequest.JSON_PROPERTY_QUERY,
  ApmStatsHistogramRequest.JSON_PROPERTY_REQUEST_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApmStatsHistogramRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NUMBER_FORMAT = "number_format";
  private WidgetNumberFormat numberFormat;

  public static final String JSON_PROPERTY_QUERY = "query";
  private FormulaApmStatsQuery query;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private ApmStatsHistogramRequestRequestType requestType;

  public ApmStatsHistogramRequest() {}

  @JsonCreator
  public ApmStatsHistogramRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) FormulaApmStatsQuery query,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          ApmStatsHistogramRequestRequestType requestType) {
    this.query = query;
    this.unparsed |= query.unparsed;
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
  }

  public ApmStatsHistogramRequest numberFormat(WidgetNumberFormat numberFormat) {
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

  public ApmStatsHistogramRequest query(FormulaApmStatsQuery query) {
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
  public FormulaApmStatsQuery getQuery() {
    return query;
  }

  public void setQuery(FormulaApmStatsQuery query) {
    this.query = query;
    if (query != null) {
      this.unparsed |= query.unparsed;
    }
  }

  public ApmStatsHistogramRequest requestType(ApmStatsHistogramRequestRequestType requestType) {
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
  public ApmStatsHistogramRequestRequestType getRequestType() {
    return requestType;
  }

  public void setRequestType(ApmStatsHistogramRequestRequestType requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  /** Return true if this ApmStatsHistogramRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApmStatsHistogramRequest apmStatsHistogramRequest = (ApmStatsHistogramRequest) o;
    return Objects.equals(this.numberFormat, apmStatsHistogramRequest.numberFormat)
        && Objects.equals(this.query, apmStatsHistogramRequest.query)
        && Objects.equals(this.requestType, apmStatsHistogramRequest.requestType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberFormat, query, requestType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApmStatsHistogramRequest {\n");
    sb.append("    numberFormat: ").append(toIndentedString(numberFormat)).append("\n");
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
