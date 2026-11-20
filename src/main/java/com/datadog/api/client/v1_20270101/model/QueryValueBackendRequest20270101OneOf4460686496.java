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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  QueryValueBackendRequest20270101OneOf4460686496.JSON_PROPERTY__QUERY_OPTIONS,
  QueryValueBackendRequest20270101OneOf4460686496.JSON_PROPERTY_AGGREGATOR,
  QueryValueBackendRequest20270101OneOf4460686496.JSON_PROPERTY_COMPARISON,
  QueryValueBackendRequest20270101OneOf4460686496.JSON_PROPERTY_CONDITIONAL_FORMATS,
  QueryValueBackendRequest20270101OneOf4460686496.JSON_PROPERTY_Q
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class QueryValueBackendRequest20270101OneOf4460686496 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY__QUERY_OPTIONS = "_query_options";
  private Map<String, DashboardInlineSchema3> QueryOptions = null;

  public static final String JSON_PROPERTY_AGGREGATOR = "aggregator";
  private ScalarAggregator aggregator;

  public static final String JSON_PROPERTY_COMPARISON = "comparison";
  private ComparisonRequest comparison;

  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<ThresholdFormattingRule> conditionalFormats = null;

  public static final String JSON_PROPERTY_Q = "q";
  private String q;

  public QueryValueBackendRequest20270101OneOf4460686496() {}

  @JsonCreator
  public QueryValueBackendRequest20270101OneOf4460686496(
      @JsonProperty(required = true, value = JSON_PROPERTY_Q) String q) {
    this.q = q;
  }

  public QueryValueBackendRequest20270101OneOf4460686496 QueryOptions(
      Map<String, DashboardInlineSchema3> QueryOptions) {
    this.QueryOptions = QueryOptions;
    return this;
  }

  public QueryValueBackendRequest20270101OneOf4460686496 putQueryOptionsItem(
      String key, DashboardInlineSchema3 QueryOptionsItem) {
    if (this.QueryOptions == null) {
      this.QueryOptions = new HashMap<>();
    }
    this.QueryOptions.put(key, QueryOptionsItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return QueryOptions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY__QUERY_OPTIONS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, DashboardInlineSchema3> getQueryOptions() {
    return QueryOptions;
  }

  public void setQueryOptions(Map<String, DashboardInlineSchema3> QueryOptions) {
    this.QueryOptions = QueryOptions;
  }

  public QueryValueBackendRequest20270101OneOf4460686496 aggregator(ScalarAggregator aggregator) {
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

  public QueryValueBackendRequest20270101OneOf4460686496 comparison(ComparisonRequest comparison) {
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

  public QueryValueBackendRequest20270101OneOf4460686496 conditionalFormats(
      List<ThresholdFormattingRule> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public QueryValueBackendRequest20270101OneOf4460686496 addConditionalFormatsItem(
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

  public QueryValueBackendRequest20270101OneOf4460686496 q(String q) {
    this.q = q;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return q
   */
  @JsonProperty(JSON_PROPERTY_Q)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQ() {
    return q;
  }

  public void setQ(String q) {
    this.q = q;
  }

  /** Return true if this QueryValueBackendRequest20270101OneOf4460686496 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryValueBackendRequest20270101OneOf4460686496
        queryValueBackendRequest20270101OneOf4460686496 =
            (QueryValueBackendRequest20270101OneOf4460686496) o;
    return Objects.equals(
            this.QueryOptions, queryValueBackendRequest20270101OneOf4460686496.QueryOptions)
        && Objects.equals(
            this.aggregator, queryValueBackendRequest20270101OneOf4460686496.aggregator)
        && Objects.equals(
            this.comparison, queryValueBackendRequest20270101OneOf4460686496.comparison)
        && Objects.equals(
            this.conditionalFormats,
            queryValueBackendRequest20270101OneOf4460686496.conditionalFormats)
        && Objects.equals(this.q, queryValueBackendRequest20270101OneOf4460686496.q);
  }

  @Override
  public int hashCode() {
    return Objects.hash(QueryOptions, aggregator, comparison, conditionalFormats, q);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryValueBackendRequest20270101OneOf4460686496 {\n");
    sb.append("    QueryOptions: ").append(toIndentedString(QueryOptions)).append("\n");
    sb.append("    aggregator: ").append(toIndentedString(aggregator)).append("\n");
    sb.append("    comparison: ").append(toIndentedString(comparison)).append("\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
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
