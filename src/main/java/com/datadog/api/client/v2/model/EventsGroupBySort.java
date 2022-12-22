/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** The dimension by which to sort a query's results. */
@JsonPropertyOrder({
  EventsGroupBySort.JSON_PROPERTY_AGGREGATION,
  EventsGroupBySort.JSON_PROPERTY_METRIC,
  EventsGroupBySort.JSON_PROPERTY_ORDER,
  EventsGroupBySort.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventsGroupBySort {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private EventsAggregation aggregation = EventsAggregation.COUNT;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_ORDER = "order";
  private QuerySortOrder order = QuerySortOrder.DESC;

  public static final String JSON_PROPERTY_TYPE = "type";
  private EventsSortType type;

  public EventsGroupBySort() {}

  @JsonCreator
  public EventsGroupBySort(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATION)
          EventsAggregation aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
  }

  public EventsGroupBySort aggregation(EventsAggregation aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
    return this;
  }

  /**
   * The type of aggregation that can be performed on events-based queries.
   *
   * @return aggregation
   */
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EventsAggregation getAggregation() {
    return aggregation;
  }

  public void setAggregation(EventsAggregation aggregation) {
    if (!aggregation.isValid()) {
      this.unparsed = true;
    }
    this.aggregation = aggregation;
  }

  public EventsGroupBySort metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * Metric whose calculated value should be used to define the sort order of a query's results.
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

  public EventsGroupBySort order(QuerySortOrder order) {
    this.order = order;
    this.unparsed |= !order.isValid();
    return this;
  }

  /**
   * Direction of sort.
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

  public EventsGroupBySort type(EventsSortType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of sort to use on the calculated value.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EventsSortType getType() {
    return type;
  }

  public void setType(EventsSortType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this EventsGroupBySort object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsGroupBySort eventsGroupBySort = (EventsGroupBySort) o;
    return Objects.equals(this.aggregation, eventsGroupBySort.aggregation)
        && Objects.equals(this.metric, eventsGroupBySort.metric)
        && Objects.equals(this.order, eventsGroupBySort.order)
        && Objects.equals(this.type, eventsGroupBySort.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, metric, order, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsGroupBySort {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
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
