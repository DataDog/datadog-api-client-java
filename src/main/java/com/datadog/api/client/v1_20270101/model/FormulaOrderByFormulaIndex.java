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
  FormulaOrderByFormulaIndex.JSON_PROPERTY_INDEX,
  FormulaOrderByFormulaIndex.JSON_PROPERTY_ORDER,
  FormulaOrderByFormulaIndex.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaOrderByFormulaIndex {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INDEX = "index";
  private Double index;

  public static final String JSON_PROPERTY_ORDER = "order";
  private QuerySortOrder order;

  public static final String JSON_PROPERTY_TYPE = "type";
  private FormulaOrderByFormulaIndexType type;

  public FormulaOrderByFormulaIndex() {}

  @JsonCreator
  public FormulaOrderByFormulaIndex(
      @JsonProperty(required = true, value = JSON_PROPERTY_INDEX) Double index,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORDER) QuerySortOrder order,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          FormulaOrderByFormulaIndexType type) {
    this.index = index;
    this.order = order;
    this.unparsed |= !order.isValid();
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public FormulaOrderByFormulaIndex index(Double index) {
    this.index = index;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return index
   */
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getIndex() {
    return index;
  }

  public void setIndex(Double index) {
    this.index = index;
  }

  public FormulaOrderByFormulaIndex order(QuerySortOrder order) {
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
  public QuerySortOrder getOrder() {
    return order;
  }

  public void setOrder(QuerySortOrder order) {
    if (!order.isValid()) {
      this.unparsed = true;
    }
    this.order = order;
  }

  public FormulaOrderByFormulaIndex type(FormulaOrderByFormulaIndexType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormulaOrderByFormulaIndexType getType() {
    return type;
  }

  public void setType(FormulaOrderByFormulaIndexType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this FormulaOrderByFormulaIndex object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaOrderByFormulaIndex formulaOrderByFormulaIndex = (FormulaOrderByFormulaIndex) o;
    return Objects.equals(this.index, formulaOrderByFormulaIndex.index)
        && Objects.equals(this.order, formulaOrderByFormulaIndex.order)
        && Objects.equals(this.type, formulaOrderByFormulaIndex.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, order, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaOrderByFormulaIndex {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
