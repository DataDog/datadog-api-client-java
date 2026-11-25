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
  QueryValueBackendRequest20270101OneOf4460685056.JSON_PROPERTY_AGGREGATOR,
  QueryValueBackendRequest20270101OneOf4460685056.JSON_PROPERTY_COMPARISON,
  QueryValueBackendRequest20270101OneOf4460685056.JSON_PROPERTY_CONDITIONAL_FORMATS,
  QueryValueBackendRequest20270101OneOf4460685056.JSON_PROPERTY_DDSQL_QUERY,
  QueryValueBackendRequest20270101OneOf4460685056.JSON_PROPERTY_REQUEST_TYPE,
  QueryValueBackendRequest20270101OneOf4460685056.JSON_PROPERTY_RESPONSE_FORMAT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class QueryValueBackendRequest20270101OneOf4460685056 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATOR = "aggregator";
  private ScalarAggregator aggregator;

  public static final String JSON_PROPERTY_COMPARISON = "comparison";
  private ComparisonRequest comparison;

  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<ThresholdFormattingRule> conditionalFormats = null;

  public static final String JSON_PROPERTY_DDSQL_QUERY = "ddsql_query";
  private String ddsqlQuery;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private QueryValueBackendRequestAnyOfAnyOfItemRequestType4450439776 requestType;

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private QueryValueBackendRequestAnyOfAnyOfItemResponseFormat4450440096 responseFormat;

  public QueryValueBackendRequest20270101OneOf4460685056() {}

  @JsonCreator
  public QueryValueBackendRequest20270101OneOf4460685056(
      @JsonProperty(required = true, value = JSON_PROPERTY_DDSQL_QUERY) String ddsqlQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          QueryValueBackendRequestAnyOfAnyOfItemRequestType4450439776 requestType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          QueryValueBackendRequestAnyOfAnyOfItemResponseFormat4450440096 responseFormat) {
    this.ddsqlQuery = ddsqlQuery;
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public QueryValueBackendRequest20270101OneOf4460685056 aggregator(ScalarAggregator aggregator) {
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

  public QueryValueBackendRequest20270101OneOf4460685056 comparison(ComparisonRequest comparison) {
    this.comparison = comparison;
    this.unparsed |= comparison.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return comparison
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPARISON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ComparisonRequest getComparison() {
    return comparison;
  }

  public void setComparison(ComparisonRequest comparison) {
    this.comparison = comparison;
    if (comparison != null) {
      this.unparsed |= comparison.unparsed;
    }
  }

  public QueryValueBackendRequest20270101OneOf4460685056 conditionalFormats(
      List<ThresholdFormattingRule> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public QueryValueBackendRequest20270101OneOf4460685056 addConditionalFormatsItem(
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

  public QueryValueBackendRequest20270101OneOf4460685056 ddsqlQuery(String ddsqlQuery) {
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

  public QueryValueBackendRequest20270101OneOf4460685056 requestType(
      QueryValueBackendRequestAnyOfAnyOfItemRequestType4450439776 requestType) {
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
  public QueryValueBackendRequestAnyOfAnyOfItemRequestType4450439776 getRequestType() {
    return requestType;
  }

  public void setRequestType(
      QueryValueBackendRequestAnyOfAnyOfItemRequestType4450439776 requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public QueryValueBackendRequest20270101OneOf4460685056 responseFormat(
      QueryValueBackendRequestAnyOfAnyOfItemResponseFormat4450440096 responseFormat) {
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
  public QueryValueBackendRequestAnyOfAnyOfItemResponseFormat4450440096 getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(
      QueryValueBackendRequestAnyOfAnyOfItemResponseFormat4450440096 responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  /** Return true if this QueryValueBackendRequest20270101OneOf4460685056 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryValueBackendRequest20270101OneOf4460685056
        queryValueBackendRequest20270101OneOf4460685056 =
            (QueryValueBackendRequest20270101OneOf4460685056) o;
    return Objects.equals(
            this.aggregator, queryValueBackendRequest20270101OneOf4460685056.aggregator)
        && Objects.equals(
            this.comparison, queryValueBackendRequest20270101OneOf4460685056.comparison)
        && Objects.equals(
            this.conditionalFormats,
            queryValueBackendRequest20270101OneOf4460685056.conditionalFormats)
        && Objects.equals(
            this.ddsqlQuery, queryValueBackendRequest20270101OneOf4460685056.ddsqlQuery)
        && Objects.equals(
            this.requestType, queryValueBackendRequest20270101OneOf4460685056.requestType)
        && Objects.equals(
            this.responseFormat, queryValueBackendRequest20270101OneOf4460685056.responseFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aggregator, comparison, conditionalFormats, ddsqlQuery, requestType, responseFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryValueBackendRequest20270101OneOf4460685056 {\n");
    sb.append("    aggregator: ").append(toIndentedString(aggregator)).append("\n");
    sb.append("    comparison: ").append(toIndentedString(comparison)).append("\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    ddsqlQuery: ").append(toIndentedString(ddsqlQuery)).append("\n");
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
