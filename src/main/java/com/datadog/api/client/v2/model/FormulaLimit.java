/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
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
   * <p>Message for specifying limits to the number of values returned by a query.</p>
 */
@JsonPropertyOrder({
  FormulaLimit.JSON_PROPERTY_COUNT,
  FormulaLimit.JSON_PROPERTY_ORDER
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaLimit {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COUNT = "count";
  private Integer count;

  public static final String JSON_PROPERTY_ORDER = "order";
  private QuerySortOrder order = QuerySortOrder.DESC;

  public FormulaLimit count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * <p>The number of results to which to limit.</p>
   * maximum: 2147483647
   * @return count
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getCount() {
        return count;
      }
  public void setCount(Integer count) {
    this.count = count;
  }
  public FormulaLimit order(QuerySortOrder order) {
    this.order = order;
    this.unparsed |= !order.isValid();
    return this;
  }

  /**
   * <p>Direction of sort.</p>
   * @return order
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ORDER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public QuerySortOrder getOrder() {
        return order;
      }
  public void setOrder(QuerySortOrder order) {
    if (!order.isValid()) {
        this.unparsed = true;
    }
    this.order = order;
  }

  /**
   * Return true if this FormulaLimit object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaLimit formulaLimit = (FormulaLimit) o;
    return Objects.equals(this.count, formulaLimit.count) && Objects.equals(this.order, formulaLimit.order);
  }


  @Override
  public int hashCode() {
    return Objects.hash(count,order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaLimit {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("}");
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
