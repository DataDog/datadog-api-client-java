/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>A sort rule.</p>
 */
@JsonPropertyOrder({
  RUMAggregateSort.JSON_PROPERTY_AGGREGATION,
  RUMAggregateSort.JSON_PROPERTY_METRIC,
  RUMAggregateSort.JSON_PROPERTY_ORDER,
  RUMAggregateSort.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RUMAggregateSort {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private RUMAggregationFunction aggregation;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_ORDER = "order";
  private RUMSortOrder order;

  public static final String JSON_PROPERTY_TYPE = "type";
  private RUMAggregateSortType type = RUMAggregateSortType.ALPHABETICAL;

  public RUMAggregateSort aggregation(RUMAggregationFunction aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
    return this;
  }

  /**
   * <p>An aggregation function.</p>
   * @return aggregation
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AGGREGATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public RUMAggregationFunction getAggregation() {
        return aggregation;
      }
  public void setAggregation(RUMAggregationFunction aggregation) {
    if (!aggregation.isValid()) {
        this.unparsed = true;
    }
    this.aggregation = aggregation;
  }
  public RUMAggregateSort metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * <p>The metric to sort by (only used for <code>type=measure</code>).</p>
   * @return metric
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_METRIC)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getMetric() {
        return metric;
      }
  public void setMetric(String metric) {
    this.metric = metric;
  }
  public RUMAggregateSort order(RUMSortOrder order) {
    this.order = order;
    this.unparsed |= !order.isValid();
    return this;
  }

  /**
   * <p>The order to use, ascending or descending.</p>
   * @return order
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ORDER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public RUMSortOrder getOrder() {
        return order;
      }
  public void setOrder(RUMSortOrder order) {
    if (!order.isValid()) {
        this.unparsed = true;
    }
    this.order = order;
  }
  public RUMAggregateSort type(RUMAggregateSortType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The type of sorting algorithm.</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public RUMAggregateSortType getType() {
        return type;
      }
  public void setType(RUMAggregateSortType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * Return true if this RUMAggregateSort object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RUMAggregateSort rumAggregateSort = (RUMAggregateSort) o;
    return Objects.equals(this.aggregation, rumAggregateSort.aggregation) && Objects.equals(this.metric, rumAggregateSort.metric) && Objects.equals(this.order, rumAggregateSort.order) && Objects.equals(this.type, rumAggregateSort.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(aggregation,metric,order,type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RUMAggregateSort {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
