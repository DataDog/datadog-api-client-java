/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Which column and order to sort by */
@JsonPropertyOrder({WidgetFieldSort.JSON_PROPERTY_COLUMN, WidgetFieldSort.JSON_PROPERTY_ORDER})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetFieldSort {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMN = "column";
  private String column;

  public static final String JSON_PROPERTY_ORDER = "order";
  private WidgetSort order;

  public WidgetFieldSort() {}

  @JsonCreator
  public WidgetFieldSort(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMN) String column,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORDER) WidgetSort order) {
    this.column = column;
    this.order = order;
    this.unparsed |= !order.isValid();
  }

  public WidgetFieldSort column(String column) {
    this.column = column;
    return this;
  }

  /**
   * Facet path for the column
   *
   * @return column
   */
  @JsonProperty(JSON_PROPERTY_COLUMN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getColumn() {
    return column;
  }

  public void setColumn(String column) {
    this.column = column;
  }

  public WidgetFieldSort order(WidgetSort order) {
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

  /** Return true if this WidgetFieldSort object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetFieldSort widgetFieldSort = (WidgetFieldSort) o;
    return Objects.equals(this.column, widgetFieldSort.column)
        && Objects.equals(this.order, widgetFieldSort.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetFieldSort {\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
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
