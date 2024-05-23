/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The group to sort the widget by. */
@JsonPropertyOrder({
  WidgetGroupSort.JSON_PROPERTY_NAME,
  WidgetGroupSort.JSON_PROPERTY_ORDER,
  WidgetGroupSort.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetGroupSort {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORDER = "order";
  private WidgetSort order;

  public static final String JSON_PROPERTY_TYPE = "type";
  private GroupType type;

  public WidgetGroupSort() {}

  @JsonCreator
  public WidgetGroupSort(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORDER) WidgetSort order,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) GroupType type) {
    this.name = name;
    this.order = order;
    this.unparsed |= !order.isValid();
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public WidgetGroupSort name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the group.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WidgetGroupSort order(WidgetSort order) {
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

  public WidgetGroupSort type(GroupType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Set the sort type to group.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GroupType getType() {
    return type;
  }

  public void setType(GroupType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return WidgetGroupSort
   */
  @JsonAnySetter
  public WidgetGroupSort putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this WidgetGroupSort object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetGroupSort widgetGroupSort = (WidgetGroupSort) o;
    return Objects.equals(this.name, widgetGroupSort.name)
        && Objects.equals(this.order, widgetGroupSort.order)
        && Objects.equals(this.type, widgetGroupSort.type)
        && Objects.equals(this.additionalProperties, widgetGroupSort.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, order, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetGroupSort {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
