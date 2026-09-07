/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The formula to sort the widget by.</p>
 */
@JsonPropertyOrder({
  WidgetFormulaSort.JSON_PROPERTY_INDEX,
  WidgetFormulaSort.JSON_PROPERTY_ORDER,
  WidgetFormulaSort.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetFormulaSort {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_INDEX = "index";
  private Long index;

  public static final String JSON_PROPERTY_ORDER = "order";
  private WidgetSort order;

  public static final String JSON_PROPERTY_TYPE = "type";
  private FormulaType type;

  public WidgetFormulaSort() {}

  @JsonCreator
  public WidgetFormulaSort(
            @JsonProperty(required=true, value=JSON_PROPERTY_INDEX)Long index,
            @JsonProperty(required=true, value=JSON_PROPERTY_ORDER)WidgetSort order,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)FormulaType type) {
        this.index = index;
        this.order = order;
        this.unparsed |= !order.isValid();
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public WidgetFormulaSort index(Long index) {
    this.index = index;
    return this;
  }

  /**
   * <p>The index of the formula to sort by.</p>
   * minimum: 0
   * @return index
  **/
      @JsonProperty(JSON_PROPERTY_INDEX)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getIndex() {
        return index;
      }
  public void setIndex(Long index) {
    this.index = index;
  }
  public WidgetFormulaSort order(WidgetSort order) {
    this.order = order;
    this.unparsed |= !order.isValid();
    return this;
  }

  /**
   * <p>Widget sorting methods.</p>
   * @return order
  **/
      @JsonProperty(JSON_PROPERTY_ORDER)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public WidgetSort getOrder() {
        return order;
      }
  public void setOrder(WidgetSort order) {
    if (!order.isValid()) {
        this.unparsed = true;
    }
    this.order = order;
  }
  public WidgetFormulaSort type(FormulaType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Set the sort type to formula.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public FormulaType getType() {
        return type;
      }
  public void setType(FormulaType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return WidgetFormulaSort
   */
  @JsonAnySetter
  public WidgetFormulaSort putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this WidgetFormulaSort object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetFormulaSort widgetFormulaSort = (WidgetFormulaSort) o;
    return Objects.equals(this.index, widgetFormulaSort.index) && Objects.equals(this.order, widgetFormulaSort.order) && Objects.equals(this.type, widgetFormulaSort.type) && Objects.equals(this.additionalProperties, widgetFormulaSort.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(index,order,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetFormulaSort {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
