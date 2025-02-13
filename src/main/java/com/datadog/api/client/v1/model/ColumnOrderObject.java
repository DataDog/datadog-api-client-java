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

/** Order criteria */
@JsonPropertyOrder({
  ColumnOrderObject.JSON_PROPERTY_INDEX,
  ColumnOrderObject.JSON_PROPERTY_NAME,
  ColumnOrderObject.JSON_PROPERTY_ORDER,
  ColumnOrderObject.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ColumnOrderObject {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INDEX = "index";
  private Double index;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORDER = "order";
  private ColumnOrderObjectOrder order;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ColumnOrderObjectType type;

  public ColumnOrderObject() {}

  @JsonCreator
  public ColumnOrderObject(
      @JsonProperty(required = true, value = JSON_PROPERTY_ORDER) ColumnOrderObjectOrder order,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) ColumnOrderObjectType type) {
    this.order = order;
    this.unparsed |= !order.isValid();
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ColumnOrderObject index(Double index) {
    this.index = index;
    return this;
  }

  /**
   * Index of the sorted column
   *
   * @return index
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getIndex() {
    return index;
  }

  public void setIndex(Double index) {
    this.index = index;
  }

  public ColumnOrderObject name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the sorted column
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ColumnOrderObject order(ColumnOrderObjectOrder order) {
    this.order = order;
    this.unparsed |= !order.isValid();
    return this;
  }

  /**
   * Order object
   *
   * @return order
   */
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ColumnOrderObjectOrder getOrder() {
    return order;
  }

  public void setOrder(ColumnOrderObjectOrder order) {
    if (!order.isValid()) {
      this.unparsed = true;
    }
    this.order = order;
  }

  public ColumnOrderObject type(ColumnOrderObjectType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * type of column
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ColumnOrderObjectType getType() {
    return type;
  }

  public void setType(ColumnOrderObjectType type) {
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
   * @return ColumnOrderObject
   */
  @JsonAnySetter
  public ColumnOrderObject putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ColumnOrderObject object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColumnOrderObject columnOrderObject = (ColumnOrderObject) o;
    return Objects.equals(this.index, columnOrderObject.index)
        && Objects.equals(this.name, columnOrderObject.name)
        && Objects.equals(this.order, columnOrderObject.order)
        && Objects.equals(this.type, columnOrderObject.type)
        && Objects.equals(this.additionalProperties, columnOrderObject.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, name, order, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColumnOrderObject {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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
