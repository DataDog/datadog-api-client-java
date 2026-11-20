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
  QueryTableBackendRequest20270101OneOf.JSON_PROPERTY_AGGREGATOR,
  QueryTableBackendRequest20270101OneOf.JSON_PROPERTY_ALIAS,
  QueryTableBackendRequest20270101OneOf.JSON_PROPERTY_CELL_DISPLAY_MODE,
  QueryTableBackendRequest20270101OneOf.JSON_PROPERTY_CONDITIONAL_FORMATS,
  QueryTableBackendRequest20270101OneOf.JSON_PROPERTY_DDSQL_QUERY,
  QueryTableBackendRequest20270101OneOf.JSON_PROPERTY_LIMIT,
  QueryTableBackendRequest20270101OneOf.JSON_PROPERTY_ORDER,
  QueryTableBackendRequest20270101OneOf.JSON_PROPERTY_REQUEST_TYPE,
  QueryTableBackendRequest20270101OneOf.JSON_PROPERTY_RESPONSE_FORMAT,
  QueryTableBackendRequest20270101OneOf.JSON_PROPERTY_TEXT_FORMATS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class QueryTableBackendRequest20270101OneOf {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATOR = "aggregator";
  private ScalarAggregator_20270101 aggregator;

  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_CELL_DISPLAY_MODE = "cell_display_mode";
  private List<CellDisplayModeOption_20270101> cellDisplayMode = null;

  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<ThresholdFormattingRule_20270101> conditionalFormats = null;

  public static final String JSON_PROPERTY_DDSQL_QUERY = "ddsql_query";
  private String ddsqlQuery;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Double limit;

  public static final String JSON_PROPERTY_ORDER = "order";
  private QuerySortOrder_20270101 order;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private QueryTableBackendRequestAnyOfAnyOfItemRequestType_20270101 requestType;

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private QueryTableBackendRequestAnyOfAnyOfItemResponseFormat_20270101 responseFormat;

  public static final String JSON_PROPERTY_TEXT_FORMATS = "text_formats";
  private List<List<TextFormattingRule_20270101>> textFormats = null;

  public QueryTableBackendRequest20270101OneOf() {}

  @JsonCreator
  public QueryTableBackendRequest20270101OneOf(
      @JsonProperty(required = true, value = JSON_PROPERTY_DDSQL_QUERY) String ddsqlQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          QueryTableBackendRequestAnyOfAnyOfItemRequestType_20270101 requestType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          QueryTableBackendRequestAnyOfAnyOfItemResponseFormat_20270101 responseFormat) {
    this.ddsqlQuery = ddsqlQuery;
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public QueryTableBackendRequest20270101OneOf aggregator(ScalarAggregator_20270101 aggregator) {
    this.aggregator = aggregator;
    this.unparsed |= !aggregator.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return aggregator
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGGREGATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ScalarAggregator_20270101 getAggregator() {
    return aggregator;
  }

  public void setAggregator(ScalarAggregator_20270101 aggregator) {
    if (!aggregator.isValid()) {
      this.unparsed = true;
    }
    this.aggregator = aggregator;
  }

  public QueryTableBackendRequest20270101OneOf alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return alias
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public QueryTableBackendRequest20270101OneOf cellDisplayMode(
      List<CellDisplayModeOption_20270101> cellDisplayMode) {
    this.cellDisplayMode = cellDisplayMode;
    return this;
  }

  public QueryTableBackendRequest20270101OneOf addCellDisplayModeItem(
      CellDisplayModeOption_20270101 cellDisplayModeItem) {
    if (this.cellDisplayMode == null) {
      this.cellDisplayMode = new ArrayList<>();
    }
    this.cellDisplayMode.add(cellDisplayModeItem);
    this.unparsed |= !cellDisplayModeItem.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return cellDisplayMode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CELL_DISPLAY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<CellDisplayModeOption_20270101> getCellDisplayMode() {
    return cellDisplayMode;
  }

  public void setCellDisplayMode(List<CellDisplayModeOption_20270101> cellDisplayMode) {
    this.cellDisplayMode = cellDisplayMode;
  }

  public QueryTableBackendRequest20270101OneOf conditionalFormats(
      List<ThresholdFormattingRule_20270101> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule_20270101 item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public QueryTableBackendRequest20270101OneOf addConditionalFormatsItem(
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

  public QueryTableBackendRequest20270101OneOf ddsqlQuery(String ddsqlQuery) {
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

  public QueryTableBackendRequest20270101OneOf limit(Double limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return limit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLimit() {
    return limit;
  }

  public void setLimit(Double limit) {
    this.limit = limit;
  }

  public QueryTableBackendRequest20270101OneOf order(QuerySortOrder_20270101 order) {
    this.order = order;
    this.unparsed |= !order.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return order
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public QuerySortOrder_20270101 getOrder() {
    return order;
  }

  public void setOrder(QuerySortOrder_20270101 order) {
    if (!order.isValid()) {
      this.unparsed = true;
    }
    this.order = order;
  }

  public QueryTableBackendRequest20270101OneOf requestType(
      QueryTableBackendRequestAnyOfAnyOfItemRequestType_20270101 requestType) {
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
  public QueryTableBackendRequestAnyOfAnyOfItemRequestType_20270101 getRequestType() {
    return requestType;
  }

  public void setRequestType(
      QueryTableBackendRequestAnyOfAnyOfItemRequestType_20270101 requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public QueryTableBackendRequest20270101OneOf responseFormat(
      QueryTableBackendRequestAnyOfAnyOfItemResponseFormat_20270101 responseFormat) {
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
  public QueryTableBackendRequestAnyOfAnyOfItemResponseFormat_20270101 getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(
      QueryTableBackendRequestAnyOfAnyOfItemResponseFormat_20270101 responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  public QueryTableBackendRequest20270101OneOf textFormats(
      List<List<TextFormattingRule_20270101>> textFormats) {
    this.textFormats = textFormats;
    return this;
  }

  public QueryTableBackendRequest20270101OneOf addTextFormatsItem(
      List<TextFormattingRule_20270101> textFormatsItem) {
    if (this.textFormats == null) {
      this.textFormats = new ArrayList<>();
    }
    this.textFormats.add(textFormatsItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return textFormats
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<List<TextFormattingRule_20270101>> getTextFormats() {
    return textFormats;
  }

  public void setTextFormats(List<List<TextFormattingRule_20270101>> textFormats) {
    this.textFormats = textFormats;
  }

  /** Return true if this QueryTableBackendRequest20270101OneOf object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryTableBackendRequest20270101OneOf queryTableBackendRequest20270101OneOf =
        (QueryTableBackendRequest20270101OneOf) o;
    return Objects.equals(this.aggregator, queryTableBackendRequest20270101OneOf.aggregator)
        && Objects.equals(this.alias, queryTableBackendRequest20270101OneOf.alias)
        && Objects.equals(
            this.cellDisplayMode, queryTableBackendRequest20270101OneOf.cellDisplayMode)
        && Objects.equals(
            this.conditionalFormats, queryTableBackendRequest20270101OneOf.conditionalFormats)
        && Objects.equals(this.ddsqlQuery, queryTableBackendRequest20270101OneOf.ddsqlQuery)
        && Objects.equals(this.limit, queryTableBackendRequest20270101OneOf.limit)
        && Objects.equals(this.order, queryTableBackendRequest20270101OneOf.order)
        && Objects.equals(this.requestType, queryTableBackendRequest20270101OneOf.requestType)
        && Objects.equals(this.responseFormat, queryTableBackendRequest20270101OneOf.responseFormat)
        && Objects.equals(this.textFormats, queryTableBackendRequest20270101OneOf.textFormats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aggregator,
        alias,
        cellDisplayMode,
        conditionalFormats,
        ddsqlQuery,
        limit,
        order,
        requestType,
        responseFormat,
        textFormats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryTableBackendRequest20270101OneOf {\n");
    sb.append("    aggregator: ").append(toIndentedString(aggregator)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    cellDisplayMode: ").append(toIndentedString(cellDisplayMode)).append("\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    ddsqlQuery: ").append(toIndentedString(ddsqlQuery)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
    sb.append("    textFormats: ").append(toIndentedString(textFormats)).append("\n");
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
