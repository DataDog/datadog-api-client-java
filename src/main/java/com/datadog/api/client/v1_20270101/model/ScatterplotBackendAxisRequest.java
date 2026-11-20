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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  ScatterplotBackendAxisRequest.JSON_PROPERTY__QUERY_OPTIONS,
  ScatterplotBackendAxisRequest.JSON_PROPERTY_AGGREGATOR,
  ScatterplotBackendAxisRequest.JSON_PROPERTY_Q
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScatterplotBackendAxisRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY__QUERY_OPTIONS = "_query_options";
  private Map<String, DashboardInlineSchema45> QueryOptions = null;

  public static final String JSON_PROPERTY_AGGREGATOR = "aggregator";
  private ScalarAggregator aggregator;

  public static final String JSON_PROPERTY_Q = "q";
  private String q;

  public ScatterplotBackendAxisRequest() {}

  @JsonCreator
  public ScatterplotBackendAxisRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_Q) String q) {
    this.q = q;
  }

  public ScatterplotBackendAxisRequest QueryOptions(
      Map<String, DashboardInlineSchema45> QueryOptions) {
    this.QueryOptions = QueryOptions;
    return this;
  }

  public ScatterplotBackendAxisRequest putQueryOptionsItem(
      String key, DashboardInlineSchema45 QueryOptionsItem) {
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
  public Map<String, DashboardInlineSchema45> getQueryOptions() {
    return QueryOptions;
  }

  public void setQueryOptions(Map<String, DashboardInlineSchema45> QueryOptions) {
    this.QueryOptions = QueryOptions;
  }

  public ScatterplotBackendAxisRequest aggregator(ScalarAggregator aggregator) {
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

  public ScatterplotBackendAxisRequest q(String q) {
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

  /** Return true if this ScatterplotBackendAxisRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScatterplotBackendAxisRequest scatterplotBackendAxisRequest = (ScatterplotBackendAxisRequest) o;
    return Objects.equals(this.QueryOptions, scatterplotBackendAxisRequest.QueryOptions)
        && Objects.equals(this.aggregator, scatterplotBackendAxisRequest.aggregator)
        && Objects.equals(this.q, scatterplotBackendAxisRequest.q);
  }

  @Override
  public int hashCode() {
    return Objects.hash(QueryOptions, aggregator, q);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScatterplotBackendAxisRequest {\n");
    sb.append("    QueryOptions: ").append(toIndentedString(QueryOptions)).append("\n");
    sb.append("    aggregator: ").append(toIndentedString(aggregator)).append("\n");
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
