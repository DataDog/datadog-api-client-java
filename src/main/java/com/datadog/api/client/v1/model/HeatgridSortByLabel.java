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

/** Sort rows by their group labels. */
@JsonPropertyOrder({
  HeatgridSortByLabel.JSON_PROPERTY_ORDER,
  HeatgridSortByLabel.JSON_PROPERTY_PROPERTY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatgridSortByLabel {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ORDER = "order";
  private HeatgridSortOrder order;

  public static final String JSON_PROPERTY_PROPERTY = "property";
  private HeatgridSortByLabelProperty property;

  public HeatgridSortByLabel() {}

  @JsonCreator
  public HeatgridSortByLabel(
      @JsonProperty(required = true, value = JSON_PROPERTY_ORDER) HeatgridSortOrder order,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROPERTY)
          HeatgridSortByLabelProperty property) {
    this.order = order;
    this.unparsed |= !order.isValid();
    this.property = property;
    this.unparsed |= !property.isValid();
  }

  public HeatgridSortByLabel order(HeatgridSortOrder order) {
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

  public HeatgridSortByLabel property(HeatgridSortByLabelProperty property) {
    this.property = property;
    this.unparsed |= !property.isValid();
    return this;
  }

  /**
   * Sort by label.
   *
   * @return property
   */
  @JsonProperty(JSON_PROPERTY_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HeatgridSortByLabelProperty getProperty() {
    return property;
  }

  public void setProperty(HeatgridSortByLabelProperty property) {
    if (!property.isValid()) {
      this.unparsed = true;
    }
    this.property = property;
  }

  /** Return true if this HeatgridSortByLabel object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatgridSortByLabel heatgridSortByLabel = (HeatgridSortByLabel) o;
    return Objects.equals(this.order, heatgridSortByLabel.order)
        && Objects.equals(this.property, heatgridSortByLabel.property);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, property);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatgridSortByLabel {\n");
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
