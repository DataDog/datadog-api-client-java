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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  FlatSortBy20270101OneOf.JSON_PROPERTY_AGGREGATION,
  FlatSortBy20270101OneOf.JSON_PROPERTY_ORDER,
  FlatSortBy20270101OneOf.JSON_PROPERTY_PROPERTY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FlatSortBy20270101OneOf {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private HeatGridSortAggregation_20270101 aggregation;

  public static final String JSON_PROPERTY_ORDER = "order";
  private QuerySortOrder_20270101 order;

  public static final String JSON_PROPERTY_PROPERTY = "property";
  private FlatSortByAnyOfAnyOfItemProperty_20270101 property;

  public FlatSortBy20270101OneOf() {}

  @JsonCreator
  public FlatSortBy20270101OneOf(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATION)
          HeatGridSortAggregation_20270101 aggregation,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORDER) QuerySortOrder_20270101 order,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROPERTY)
          FlatSortByAnyOfAnyOfItemProperty_20270101 property) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
    this.order = order;
    this.unparsed |= !order.isValid();
    this.property = property;
    this.unparsed |= !property.isValid();
  }

  public FlatSortBy20270101OneOf aggregation(HeatGridSortAggregation_20270101 aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return aggregation
   */
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HeatGridSortAggregation_20270101 getAggregation() {
    return aggregation;
  }

  public void setAggregation(HeatGridSortAggregation_20270101 aggregation) {
    if (!aggregation.isValid()) {
      this.unparsed = true;
    }
    this.aggregation = aggregation;
  }

  public FlatSortBy20270101OneOf order(QuerySortOrder_20270101 order) {
    this.order = order;
    this.unparsed |= !order.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return order
   */
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public QuerySortOrder_20270101 getOrder() {
    return order;
  }

  public void setOrder(QuerySortOrder_20270101 order) {
    if (!order.isValid()) {
      this.unparsed = true;
    }
    this.order = order;
  }

  public FlatSortBy20270101OneOf property(FlatSortByAnyOfAnyOfItemProperty_20270101 property) {
    this.property = property;
    this.unparsed |= !property.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return property
   */
  @JsonProperty(JSON_PROPERTY_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FlatSortByAnyOfAnyOfItemProperty_20270101 getProperty() {
    return property;
  }

  public void setProperty(FlatSortByAnyOfAnyOfItemProperty_20270101 property) {
    if (!property.isValid()) {
      this.unparsed = true;
    }
    this.property = property;
  }

  /** Return true if this FlatSortBy20270101OneOf object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlatSortBy20270101OneOf flatSortBy20270101OneOf = (FlatSortBy20270101OneOf) o;
    return Objects.equals(this.aggregation, flatSortBy20270101OneOf.aggregation)
        && Objects.equals(this.order, flatSortBy20270101OneOf.order)
        && Objects.equals(this.property, flatSortBy20270101OneOf.property);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, order, property);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlatSortBy20270101OneOf {\n");
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
