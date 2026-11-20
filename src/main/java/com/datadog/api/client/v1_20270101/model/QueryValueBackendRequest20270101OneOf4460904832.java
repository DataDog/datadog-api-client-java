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
  QueryValueBackendRequest20270101OneOf4460904832.JSON_PROPERTY_AGGREGATOR,
  QueryValueBackendRequest20270101OneOf4460904832.JSON_PROPERTY_COMPARISON,
  QueryValueBackendRequest20270101OneOf4460904832.JSON_PROPERTY_CONDITIONAL_FORMATS,
  QueryValueBackendRequest20270101OneOf4460904832.JSON_PROPERTY_RUM_QUERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class QueryValueBackendRequest20270101OneOf4460904832 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATOR = "aggregator";
  private ScalarAggregator aggregator;

  public static final String JSON_PROPERTY_COMPARISON = "comparison";
  private ComparisonRequest comparison;

  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<ThresholdFormattingRule> conditionalFormats = null;

  public static final String JSON_PROPERTY_RUM_QUERY = "rum_query";
  private LogQueryDefinition rumQuery;

  public QueryValueBackendRequest20270101OneOf4460904832() {}

  @JsonCreator
  public QueryValueBackendRequest20270101OneOf4460904832(
      @JsonProperty(required = true, value = JSON_PROPERTY_RUM_QUERY) LogQueryDefinition rumQuery) {
    this.rumQuery = rumQuery;
    this.unparsed |= rumQuery.unparsed;
  }

  public QueryValueBackendRequest20270101OneOf4460904832 aggregator(ScalarAggregator aggregator) {
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

  public QueryValueBackendRequest20270101OneOf4460904832 comparison(ComparisonRequest comparison) {
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

  public QueryValueBackendRequest20270101OneOf4460904832 conditionalFormats(
      List<ThresholdFormattingRule> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public QueryValueBackendRequest20270101OneOf4460904832 addConditionalFormatsItem(
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

  public QueryValueBackendRequest20270101OneOf4460904832 rumQuery(LogQueryDefinition rumQuery) {
    this.rumQuery = rumQuery;
    this.unparsed |= rumQuery.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return rumQuery
   */
  @JsonProperty(JSON_PROPERTY_RUM_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogQueryDefinition getRumQuery() {
    return rumQuery;
  }

  public void setRumQuery(LogQueryDefinition rumQuery) {
    this.rumQuery = rumQuery;
    if (rumQuery != null) {
      this.unparsed |= rumQuery.unparsed;
    }
  }

  /** Return true if this QueryValueBackendRequest20270101OneOf4460904832 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryValueBackendRequest20270101OneOf4460904832
        queryValueBackendRequest20270101OneOf4460904832 =
            (QueryValueBackendRequest20270101OneOf4460904832) o;
    return Objects.equals(
            this.aggregator, queryValueBackendRequest20270101OneOf4460904832.aggregator)
        && Objects.equals(
            this.comparison, queryValueBackendRequest20270101OneOf4460904832.comparison)
        && Objects.equals(
            this.conditionalFormats,
            queryValueBackendRequest20270101OneOf4460904832.conditionalFormats)
        && Objects.equals(this.rumQuery, queryValueBackendRequest20270101OneOf4460904832.rumQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregator, comparison, conditionalFormats, rumQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryValueBackendRequest20270101OneOf4460904832 {\n");
    sb.append("    aggregator: ").append(toIndentedString(aggregator)).append("\n");
    sb.append("    comparison: ").append(toIndentedString(comparison)).append("\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    rumQuery: ").append(toIndentedString(rumQuery)).append("\n");
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
