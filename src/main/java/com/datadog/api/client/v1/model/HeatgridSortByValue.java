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

/** Sort rows by their aggregated values. */
@JsonPropertyOrder({
  HeatgridSortByValue.JSON_PROPERTY_AGGREGATION,
  HeatgridSortByValue.JSON_PROPERTY_ORDER,
  HeatgridSortByValue.JSON_PROPERTY_PROPERTY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatgridSortByValue {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private HeatgridSortAggregation aggregation;

  public static final String JSON_PROPERTY_ORDER = "order";
  private HeatgridSortOrder order;

  public static final String JSON_PROPERTY_PROPERTY = "property";
  private HeatgridSortByValueProperty property;

  public HeatgridSortByValue() {}

  @JsonCreator
  public HeatgridSortByValue(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATION)
          HeatgridSortAggregation aggregation,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORDER) HeatgridSortOrder order,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROPERTY)
          HeatgridSortByValueProperty property) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
    this.order = order;
    this.unparsed |= !order.isValid();
    this.property = property;
    this.unparsed |= !property.isValid();
  }

  public HeatgridSortByValue aggregation(HeatgridSortAggregation aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
    return this;
  }

  /**
   * Aggregation used to order rows over the displayed time range.
   *
   * @return aggregation
   */
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HeatgridSortAggregation getAggregation() {
    return aggregation;
  }

  public void setAggregation(HeatgridSortAggregation aggregation) {
    if (!aggregation.isValid()) {
      this.unparsed = true;
    }
    this.aggregation = aggregation;
  }

  public HeatgridSortByValue order(HeatgridSortOrder order) {
    this.order = order;
    this.unparsed |= !order.isValid();
    return this;
  }

  /**
   * Sort direction.
   *
   * @return order
   */
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HeatgridSortOrder getOrder() {
    return order;
  }

  public void setOrder(HeatgridSortOrder order) {
    if (!order.isValid()) {
      this.unparsed = true;
    }
    this.order = order;
  }

  public HeatgridSortByValue property(HeatgridSortByValueProperty property) {
    this.property = property;
    this.unparsed |= !property.isValid();
    return this;
  }

  /**
   * Sort by value.
   *
   * @return property
   */
  @JsonProperty(JSON_PROPERTY_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HeatgridSortByValueProperty getProperty() {
    return property;
  }

  public void setProperty(HeatgridSortByValueProperty property) {
    if (!property.isValid()) {
      this.unparsed = true;
    }
    this.property = property;
  }

  /** Return true if this HeatgridSortByValue object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatgridSortByValue heatgridSortByValue = (HeatgridSortByValue) o;
    return Objects.equals(this.aggregation, heatgridSortByValue.aggregation)
        && Objects.equals(this.order, heatgridSortByValue.order)
        && Objects.equals(this.property, heatgridSortByValue.property);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, order, property);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatgridSortByValue {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
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
