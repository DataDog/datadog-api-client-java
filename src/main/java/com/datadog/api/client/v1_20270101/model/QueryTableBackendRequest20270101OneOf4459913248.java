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
  QueryTableBackendRequest20270101OneOf4459913248.JSON_PROPERTY_AGGREGATOR,
  QueryTableBackendRequest20270101OneOf4459913248.JSON_PROPERTY_ALIAS,
  QueryTableBackendRequest20270101OneOf4459913248.JSON_PROPERTY_CELL_DISPLAY_MODE,
  QueryTableBackendRequest20270101OneOf4459913248.JSON_PROPERTY_CONDITIONAL_FORMATS,
  QueryTableBackendRequest20270101OneOf4459913248.JSON_PROPERTY_LIMIT,
  QueryTableBackendRequest20270101OneOf4459913248.JSON_PROPERTY_ORDER,
  QueryTableBackendRequest20270101OneOf4459913248.JSON_PROPERTY_PROJECTION,
  QueryTableBackendRequest20270101OneOf4459913248.JSON_PROPERTY_QUERY,
  QueryTableBackendRequest20270101OneOf4459913248.JSON_PROPERTY_REQUEST_TYPE,
  QueryTableBackendRequest20270101OneOf4459913248.JSON_PROPERTY_RESPONSE_FORMAT,
  QueryTableBackendRequest20270101OneOf4459913248.JSON_PROPERTY_TEXT_FORMATS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class QueryTableBackendRequest20270101OneOf4459913248 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATOR = "aggregator";
  private ScalarAggregator aggregator;

  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_CELL_DISPLAY_MODE = "cell_display_mode";
  private List<CellDisplayModeOption> cellDisplayMode = null;

  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<ThresholdFormattingRule> conditionalFormats = null;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Double limit;

  public static final String JSON_PROPERTY_ORDER = "order";
  private QuerySortOrder order;

  public static final String JSON_PROPERTY_PROJECTION = "projection";
  private TabularProjection projection;

  public static final String JSON_PROPERTY_QUERY = "query";
  private QueryTableBackendRequest20270101OneOfQuery query;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private QueryTableBackendRequestAnyOfAnyOfItemRequestType4449627456 requestType;

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4449627776 responseFormat;

  public static final String JSON_PROPERTY_TEXT_FORMATS = "text_formats";
  private List<List<TextFormattingRule>> textFormats = null;

  public QueryTableBackendRequest20270101OneOf4459913248() {}

  @JsonCreator
  public QueryTableBackendRequest20270101OneOf4459913248(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY)
          QueryTableBackendRequest20270101OneOfQuery query,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          QueryTableBackendRequestAnyOfAnyOfItemRequestType4449627456 requestType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4449627776 responseFormat) {
    this.query = query;
    this.unparsed |= query.unparsed;
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public QueryTableBackendRequest20270101OneOf4459913248 aggregator(ScalarAggregator aggregator) {
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
  public ScalarAggregator getAggregator() {
    return aggregator;
  }

  public void setAggregator(ScalarAggregator aggregator) {
    if (!aggregator.isValid()) {
      this.unparsed = true;
    }
    this.aggregator = aggregator;
  }

  public QueryTableBackendRequest20270101OneOf4459913248 alias(String alias) {
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

  public QueryTableBackendRequest20270101OneOf4459913248 cellDisplayMode(
      List<CellDisplayModeOption> cellDisplayMode) {
    this.cellDisplayMode = cellDisplayMode;
    return this;
  }

  public QueryTableBackendRequest20270101OneOf4459913248 addCellDisplayModeItem(
      CellDisplayModeOption cellDisplayModeItem) {
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
  public List<CellDisplayModeOption> getCellDisplayMode() {
    return cellDisplayMode;
  }

  public void setCellDisplayMode(List<CellDisplayModeOption> cellDisplayMode) {
    this.cellDisplayMode = cellDisplayMode;
  }

  public QueryTableBackendRequest20270101OneOf4459913248 conditionalFormats(
      List<ThresholdFormattingRule> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public QueryTableBackendRequest20270101OneOf4459913248 addConditionalFormatsItem(
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

  public QueryTableBackendRequest20270101OneOf4459913248 limit(Double limit) {
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

  public QueryTableBackendRequest20270101OneOf4459913248 order(QuerySortOrder order) {
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
  public QuerySortOrder getOrder() {
    return order;
  }

  public void setOrder(QuerySortOrder order) {
    if (!order.isValid()) {
      this.unparsed = true;
    }
    this.order = order;
  }

  public QueryTableBackendRequest20270101OneOf4459913248 projection(TabularProjection projection) {
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
  public TabularProjection getProjection() {
    return projection;
  }

  public void setProjection(TabularProjection projection) {
    this.projection = projection;
    if (projection != null) {
      this.unparsed |= projection.unparsed;
    }
  }

  public QueryTableBackendRequest20270101OneOf4459913248 query(
      QueryTableBackendRequest20270101OneOfQuery query) {
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
  public QueryTableBackendRequest20270101OneOfQuery getQuery() {
    return query;
  }

  public void setQuery(QueryTableBackendRequest20270101OneOfQuery query) {
    this.query = query;
    if (query != null) {
      this.unparsed |= query.unparsed;
    }
  }

  public QueryTableBackendRequest20270101OneOf4459913248 requestType(
      QueryTableBackendRequestAnyOfAnyOfItemRequestType4449627456 requestType) {
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
  public QueryTableBackendRequestAnyOfAnyOfItemRequestType4449627456 getRequestType() {
    return requestType;
  }

  public void setRequestType(
      QueryTableBackendRequestAnyOfAnyOfItemRequestType4449627456 requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public QueryTableBackendRequest20270101OneOf4459913248 responseFormat(
      QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4449627776 responseFormat) {
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
  public QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4449627776 getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(
      QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4449627776 responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  public QueryTableBackendRequest20270101OneOf4459913248 textFormats(
      List<List<TextFormattingRule>> textFormats) {
    this.textFormats = textFormats;
    return this;
  }

  public QueryTableBackendRequest20270101OneOf4459913248 addTextFormatsItem(
      List<TextFormattingRule> textFormatsItem) {
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
  public List<List<TextFormattingRule>> getTextFormats() {
    return textFormats;
  }

  public void setTextFormats(List<List<TextFormattingRule>> textFormats) {
    this.textFormats = textFormats;
  }

  /** Return true if this QueryTableBackendRequest20270101OneOf4459913248 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryTableBackendRequest20270101OneOf4459913248
        queryTableBackendRequest20270101OneOf4459913248 =
            (QueryTableBackendRequest20270101OneOf4459913248) o;
    return Objects.equals(
            this.aggregator, queryTableBackendRequest20270101OneOf4459913248.aggregator)
        && Objects.equals(this.alias, queryTableBackendRequest20270101OneOf4459913248.alias)
        && Objects.equals(
            this.cellDisplayMode, queryTableBackendRequest20270101OneOf4459913248.cellDisplayMode)
        && Objects.equals(
            this.conditionalFormats,
            queryTableBackendRequest20270101OneOf4459913248.conditionalFormats)
        && Objects.equals(this.limit, queryTableBackendRequest20270101OneOf4459913248.limit)
        && Objects.equals(this.order, queryTableBackendRequest20270101OneOf4459913248.order)
        && Objects.equals(
            this.projection, queryTableBackendRequest20270101OneOf4459913248.projection)
        && Objects.equals(this.query, queryTableBackendRequest20270101OneOf4459913248.query)
        && Objects.equals(
            this.requestType, queryTableBackendRequest20270101OneOf4459913248.requestType)
        && Objects.equals(
            this.responseFormat, queryTableBackendRequest20270101OneOf4459913248.responseFormat)
        && Objects.equals(
            this.textFormats, queryTableBackendRequest20270101OneOf4459913248.textFormats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aggregator,
        alias,
        cellDisplayMode,
        conditionalFormats,
        limit,
        order,
        projection,
        query,
        requestType,
        responseFormat,
        textFormats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryTableBackendRequest20270101OneOf4459913248 {\n");
    sb.append("    aggregator: ").append(toIndentedString(aggregator)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    cellDisplayMode: ").append(toIndentedString(cellDisplayMode)).append("\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    projection: ").append(toIndentedString(projection)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
