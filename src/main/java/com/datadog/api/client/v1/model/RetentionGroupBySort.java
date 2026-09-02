/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Sort configuration for retention group by. */
@JsonPropertyOrder({RetentionGroupBySort.JSON_PROPERTY_ORDER})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RetentionGroupBySort {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ORDER = "order";
  private WidgetSort order;

  public RetentionGroupBySort order(WidgetSort order) {
    this.order = order;
    this.unparsed |= !order.isValid();
    return this;
  }

  /**
   * Widget sorting methods.
   *
   * @return order
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetSort getOrder() {
    return order;
  }

  public void setOrder(WidgetSort order) {
    if (!order.isValid()) {
      this.unparsed = true;
    }
    this.order = order;
  }

  /** Return true if this RetentionGroupBySort object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionGroupBySort retentionGroupBySort = (RetentionGroupBySort) o;
    return Objects.equals(this.order, retentionGroupBySort.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionGroupBySort {\n");
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
