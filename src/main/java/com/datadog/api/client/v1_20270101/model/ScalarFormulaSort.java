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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  ScalarFormulaSort.JSON_PROPERTY_COUNT,
  ScalarFormulaSort.JSON_PROPERTY_OFFSET,
  ScalarFormulaSort.JSON_PROPERTY_ORDER_BY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScalarFormulaSort {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COUNT = "count";
  private Double count;

  public static final String JSON_PROPERTY_OFFSET = "offset";
  private Double offset;

  public static final String JSON_PROPERTY_ORDER_BY = "order_by";
  private List<ScalarFormulaOrderBy> orderBy = null;

  public ScalarFormulaSort count(Double count) {
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

  public ScalarFormulaSort offset(Double offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return offset
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOffset() {
    return offset;
  }

  public void setOffset(Double offset) {
    this.offset = offset;
  }

  public ScalarFormulaSort orderBy(List<ScalarFormulaOrderBy> orderBy) {
    this.orderBy = orderBy;
    if (orderBy != null) {
      for (ScalarFormulaOrderBy item : orderBy) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ScalarFormulaSort addOrderByItem(ScalarFormulaOrderBy orderByItem) {
    if (this.orderBy == null) {
      this.orderBy = new ArrayList<>();
    }
    this.orderBy.add(orderByItem);
    this.unparsed |= orderByItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return orderBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ScalarFormulaOrderBy> getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(List<ScalarFormulaOrderBy> orderBy) {
    this.orderBy = orderBy;
    if (orderBy != null) {
      for (ScalarFormulaOrderBy item : orderBy) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  /** Return true if this ScalarFormulaSort object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScalarFormulaSort scalarFormulaSort = (ScalarFormulaSort) o;
    return Objects.equals(this.count, scalarFormulaSort.count)
        && Objects.equals(this.offset, scalarFormulaSort.offset)
        && Objects.equals(this.orderBy, scalarFormulaSort.orderBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, offset, orderBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScalarFormulaSort {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
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
