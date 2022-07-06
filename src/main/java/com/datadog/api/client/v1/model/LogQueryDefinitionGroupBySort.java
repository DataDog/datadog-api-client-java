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
import java.util.Objects;

/** Define a sorting method. */
@JsonPropertyOrder({
  LogQueryDefinitionGroupBySort.JSON_PROPERTY_AGGREGATION,
  LogQueryDefinitionGroupBySort.JSON_PROPERTY_FACET,
  LogQueryDefinitionGroupBySort.JSON_PROPERTY_ORDER
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogQueryDefinitionGroupBySort {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private String aggregation;

  public static final String JSON_PROPERTY_FACET = "facet";
  private String facet;

  public static final String JSON_PROPERTY_ORDER = "order";
  private WidgetSort order;

  public LogQueryDefinitionGroupBySort() {}

  @JsonCreator
  public LogQueryDefinitionGroupBySort(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATION) String aggregation,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORDER) WidgetSort order) {
    this.aggregation = aggregation;
    this.order = order;
    this.unparsed |= !order.isValid();
  }

  public LogQueryDefinitionGroupBySort aggregation(String aggregation) {
    this.aggregation = aggregation;
    return this;
  }

  /**
   * The aggregation method.
   *
   * @return aggregation
   */
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAggregation() {
    return aggregation;
  }

  public void setAggregation(String aggregation) {
    this.aggregation = aggregation;
  }

  public LogQueryDefinitionGroupBySort facet(String facet) {
    this.facet = facet;
    return this;
  }

  /**
   * Facet name.
   *
   * @return facet
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FACET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFacet() {
    return facet;
  }

  public void setFacet(String facet) {
    this.facet = facet;
  }

  public LogQueryDefinitionGroupBySort order(WidgetSort order) {
    this.order = order;
    this.unparsed |= !order.isValid();
    return this;
  }

  /**
   * Widget sorting methods.
   *
   * @return order
   */
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public WidgetSort getOrder() {
    return order;
  }

  public void setOrder(WidgetSort order) {
    if (!order.isValid()) {
      this.unparsed = true;
    }
    this.order = order;
  }

  /** Return true if this LogQueryDefinitionGroupBySort object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogQueryDefinitionGroupBySort logQueryDefinitionGroupBySort = (LogQueryDefinitionGroupBySort) o;
    return Objects.equals(this.aggregation, logQueryDefinitionGroupBySort.aggregation)
        && Objects.equals(this.facet, logQueryDefinitionGroupBySort.facet)
        && Objects.equals(this.order, logQueryDefinitionGroupBySort.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, facet, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogQueryDefinitionGroupBySort {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    facet: ").append(toIndentedString(facet)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
