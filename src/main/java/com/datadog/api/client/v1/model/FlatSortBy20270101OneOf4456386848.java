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
  FlatSortBy20270101OneOf4456386848.JSON_PROPERTY_ORDER,
  FlatSortBy20270101OneOf4456386848.JSON_PROPERTY_PROPERTY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FlatSortBy20270101OneOf4456386848 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ORDER = "order";
  private QuerySortOrder_20270101 order;

  public static final String JSON_PROPERTY_PROPERTY = "property";
  private FlatSortByAnyOfAnyOfItemProperty4446002432_20270101 property;

  public FlatSortBy20270101OneOf4456386848() {}

  @JsonCreator
  public FlatSortBy20270101OneOf4456386848(
      @JsonProperty(required = true, value = JSON_PROPERTY_ORDER) QuerySortOrder_20270101 order,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROPERTY)
          FlatSortByAnyOfAnyOfItemProperty4446002432_20270101 property) {
    this.order = order;
    this.unparsed |= !order.isValid();
    this.property = property;
    this.unparsed |= !property.isValid();
  }

  public FlatSortBy20270101OneOf4456386848 order(QuerySortOrder_20270101 order) {
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

  public FlatSortBy20270101OneOf4456386848 property(
      FlatSortByAnyOfAnyOfItemProperty4446002432_20270101 property) {
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
  public FlatSortByAnyOfAnyOfItemProperty4446002432_20270101 getProperty() {
    return property;
  }

  public void setProperty(FlatSortByAnyOfAnyOfItemProperty4446002432_20270101 property) {
    if (!property.isValid()) {
      this.unparsed = true;
    }
    this.property = property;
  }

  /** Return true if this FlatSortBy20270101OneOf4456386848 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlatSortBy20270101OneOf4456386848 flatSortBy20270101OneOf4456386848 =
        (FlatSortBy20270101OneOf4456386848) o;
    return Objects.equals(this.order, flatSortBy20270101OneOf4456386848.order)
        && Objects.equals(this.property, flatSortBy20270101OneOf4456386848.property);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, property);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlatSortBy20270101OneOf4456386848 {\n");
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
