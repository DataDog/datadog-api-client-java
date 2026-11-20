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
  GroupBySort.JSON_PROPERTY_AGGREGATION,
  GroupBySort.JSON_PROPERTY_METRIC,
  GroupBySort.JSON_PROPERTY_ORDER,
  GroupBySort.JSON_PROPERTY_SOURCE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GroupBySort {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private EventsAggregator aggregation;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_ORDER = "order";
  private GroupBySortOrder order;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public GroupBySort() {}

  @JsonCreator
  public GroupBySort(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATION)
          EventsAggregator aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= aggregation.unparsed;
  }

  public GroupBySort aggregation(EventsAggregator aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= aggregation.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return aggregation
   */
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EventsAggregator getAggregation() {
    return aggregation;
  }

  public void setAggregation(EventsAggregator aggregation) {
    this.aggregation = aggregation;
    if (aggregation != null) {
      this.unparsed |= aggregation.unparsed;
    }
  }

  public GroupBySort metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return metric
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMetric() {
    return metric;
  }

  public void setMetric(String metric) {
    this.metric = metric;
  }

  public GroupBySort order(GroupBySortOrder order) {
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
  public GroupBySortOrder getOrder() {
    return order;
  }

  public void setOrder(GroupBySortOrder order) {
    if (!order.isValid()) {
      this.unparsed = true;
    }
    this.order = order;
  }

  public GroupBySort source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return source
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  /** Return true if this GroupBySort object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupBySort groupBySort = (GroupBySort) o;
    return Objects.equals(this.aggregation, groupBySort.aggregation)
        && Objects.equals(this.metric, groupBySort.metric)
        && Objects.equals(this.order, groupBySort.order)
        && Objects.equals(this.source, groupBySort.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, metric, order, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupBySort {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
