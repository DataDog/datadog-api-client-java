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
  QueryValueBackendRequest20270101OneOf4460908192.JSON_PROPERTY_AGGREGATOR,
  QueryValueBackendRequest20270101OneOf4460908192.JSON_PROPERTY_COMPARISON,
  QueryValueBackendRequest20270101OneOf4460908192.JSON_PROPERTY_CONDITIONAL_FORMATS,
  QueryValueBackendRequest20270101OneOf4460908192.JSON_PROPERTY_EVENT_QUERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class QueryValueBackendRequest20270101OneOf4460908192 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATOR = "aggregator";
  private ScalarAggregator_20270101 aggregator;

  public static final String JSON_PROPERTY_COMPARISON = "comparison";
  private ComparisonRequest_20270101 comparison;

  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<ThresholdFormattingRule_20270101> conditionalFormats = null;

  public static final String JSON_PROPERTY_EVENT_QUERY = "event_query";
  private LogQueryDefinition_20270101 eventQuery;

  public QueryValueBackendRequest20270101OneOf4460908192() {}

  @JsonCreator
  public QueryValueBackendRequest20270101OneOf4460908192(
      @JsonProperty(required = true, value = JSON_PROPERTY_EVENT_QUERY)
          LogQueryDefinition_20270101 eventQuery) {
    this.eventQuery = eventQuery;
    this.unparsed |= eventQuery.unparsed;
  }

  public QueryValueBackendRequest20270101OneOf4460908192 aggregator(
      ScalarAggregator_20270101 aggregator) {
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

  public QueryValueBackendRequest20270101OneOf4460908192 comparison(
      ComparisonRequest_20270101 comparison) {
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
  public ComparisonRequest_20270101 getComparison() {
    return comparison;
  }

  public void setComparison(ComparisonRequest_20270101 comparison) {
    this.comparison = comparison;
    if (comparison != null) {
      this.unparsed |= comparison.unparsed;
    }
  }

  public QueryValueBackendRequest20270101OneOf4460908192 conditionalFormats(
      List<ThresholdFormattingRule_20270101> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule_20270101 item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public QueryValueBackendRequest20270101OneOf4460908192 addConditionalFormatsItem(
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

  public QueryValueBackendRequest20270101OneOf4460908192 eventQuery(
      LogQueryDefinition_20270101 eventQuery) {
    this.eventQuery = eventQuery;
    this.unparsed |= eventQuery.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return eventQuery
   */
  @JsonProperty(JSON_PROPERTY_EVENT_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogQueryDefinition_20270101 getEventQuery() {
    return eventQuery;
  }

  public void setEventQuery(LogQueryDefinition_20270101 eventQuery) {
    this.eventQuery = eventQuery;
    if (eventQuery != null) {
      this.unparsed |= eventQuery.unparsed;
    }
  }

  /** Return true if this QueryValueBackendRequest20270101OneOf4460908192 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryValueBackendRequest20270101OneOf4460908192
        queryValueBackendRequest20270101OneOf4460908192 =
            (QueryValueBackendRequest20270101OneOf4460908192) o;
    return Objects.equals(
            this.aggregator, queryValueBackendRequest20270101OneOf4460908192.aggregator)
        && Objects.equals(
            this.comparison, queryValueBackendRequest20270101OneOf4460908192.comparison)
        && Objects.equals(
            this.conditionalFormats,
            queryValueBackendRequest20270101OneOf4460908192.conditionalFormats)
        && Objects.equals(
            this.eventQuery, queryValueBackendRequest20270101OneOf4460908192.eventQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregator, comparison, conditionalFormats, eventQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryValueBackendRequest20270101OneOf4460908192 {\n");
    sb.append("    aggregator: ").append(toIndentedString(aggregator)).append("\n");
    sb.append("    comparison: ").append(toIndentedString(comparison)).append("\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    eventQuery: ").append(toIndentedString(eventQuery)).append("\n");
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
