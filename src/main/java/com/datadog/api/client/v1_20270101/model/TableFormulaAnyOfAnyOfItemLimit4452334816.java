/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  TableFormulaAnyOfAnyOfItemLimit4452334816.JSON_PROPERTY_COUNT,
  TableFormulaAnyOfAnyOfItemLimit4452334816.JSON_PROPERTY_ORDER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TableFormulaAnyOfAnyOfItemLimit4452334816 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COUNT = "count";
  private Double count;

  public static final String JSON_PROPERTY_ORDER = "order";
  private QuerySortOrder order;

  public TableFormulaAnyOfAnyOfItemLimit4452334816 count(Double count) {
    this.count = count;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return count
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCount() {
    return count;
  }

  public void setCount(Double count) {
    this.count = count;
  }

  public TableFormulaAnyOfAnyOfItemLimit4452334816 order(QuerySortOrder order) {
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
  public QuerySortOrder getOrder() {
    return order;
  }

  public void setOrder(QuerySortOrder order) {
    if (!order.isValid()) {
      this.unparsed = true;
    }
    this.order = order;
  }

  /** Return true if this TableFormulaAnyOfAnyOfItemLimit4452334816 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableFormulaAnyOfAnyOfItemLimit4452334816 tableFormulaAnyOfAnyOfItemLimit4452334816 =
        (TableFormulaAnyOfAnyOfItemLimit4452334816) o;
    return Objects.equals(this.count, tableFormulaAnyOfAnyOfItemLimit4452334816.count)
        && Objects.equals(this.order, tableFormulaAnyOfAnyOfItemLimit4452334816.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableFormulaAnyOfAnyOfItemLimit4452334816 {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
