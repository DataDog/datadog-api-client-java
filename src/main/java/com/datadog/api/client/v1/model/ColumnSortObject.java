/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Sort object */
@JsonPropertyOrder({ColumnSortObject.JSON_PROPERTY_COUNT, ColumnSortObject.JSON_PROPERTY_ORDER_BY})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ColumnSortObject {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COUNT = "count";
  private Double count;

  public static final String JSON_PROPERTY_ORDER_BY = "order_by";
  private List<ColumnOrderObject> orderBy = null;

  public ColumnSortObject count(Double count) {
    this.count = count;
    return this;
  }

  /**
   * Limit number of items displayed
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

  public ColumnSortObject orderBy(List<ColumnOrderObject> orderBy) {
    this.orderBy = orderBy;
    for (ColumnOrderObject item : orderBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ColumnSortObject addOrderByItem(ColumnOrderObject orderByItem) {
    if (this.orderBy == null) {
      this.orderBy = new ArrayList<>();
    }
    this.orderBy.add(orderByItem);
    this.unparsed |= orderByItem.unparsed;
    return this;
  }

  /**
   * Order criteria
   *
   * @return orderBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ColumnOrderObject> getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(List<ColumnOrderObject> orderBy) {
    this.orderBy = orderBy;
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
   * @return ColumnSortObject
   */
  @JsonAnySetter
  public ColumnSortObject putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ColumnSortObject object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColumnSortObject columnSortObject = (ColumnSortObject) o;
    return Objects.equals(this.count, columnSortObject.count)
        && Objects.equals(this.orderBy, columnSortObject.orderBy)
        && Objects.equals(this.additionalProperties, columnSortObject.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, orderBy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColumnSortObject {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
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
