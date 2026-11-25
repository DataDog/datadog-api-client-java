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
@JsonPropertyOrder({IssueStreamSort.JSON_PROPERTY_COLUMN, IssueStreamSort.JSON_PROPERTY_ORDER})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IssueStreamSort {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMN = "column";
  private IssueStreamOrderingKey column;

  public static final String JSON_PROPERTY_ORDER = "order";
  private IssueStreamSortOrder order;

  public IssueStreamSort() {}

  @JsonCreator
  public IssueStreamSort(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMN) IssueStreamOrderingKey column,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORDER) IssueStreamSortOrder order) {
    this.column = column;
    this.unparsed |= !column.isValid();
    this.order = order;
    this.unparsed |= !order.isValid();
  }

  public IssueStreamSort column(IssueStreamOrderingKey column) {
    this.column = column;
    this.unparsed |= !column.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return column
   */
  @JsonProperty(JSON_PROPERTY_COLUMN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IssueStreamOrderingKey getColumn() {
    return column;
  }

  public void setColumn(IssueStreamOrderingKey column) {
    if (!column.isValid()) {
      this.unparsed = true;
    }
    this.column = column;
  }

  public IssueStreamSort order(IssueStreamSortOrder order) {
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
  public IssueStreamSortOrder getOrder() {
    return order;
  }

  public void setOrder(IssueStreamSortOrder order) {
    if (!order.isValid()) {
      this.unparsed = true;
    }
    this.order = order;
  }

  /** Return true if this IssueStreamSort object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueStreamSort issueStreamSort = (IssueStreamSort) o;
    return Objects.equals(this.column, issueStreamSort.column)
        && Objects.equals(this.order, issueStreamSort.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueStreamSort {\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
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
