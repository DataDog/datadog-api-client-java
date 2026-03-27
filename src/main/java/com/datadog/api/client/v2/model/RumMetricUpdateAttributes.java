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
   * <p>The rum-based metric properties that will be updated.</p>
 */
@JsonPropertyOrder({
  RumMetricUpdateAttributes.JSON_PROPERTY_COMPUTE,
  RumMetricUpdateAttributes.JSON_PROPERTY_FILTER,
  RumMetricUpdateAttributes.JSON_PROPERTY_GROUP_BY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumMetricUpdateAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private RumMetricUpdateCompute compute;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private RumMetricFilter filter;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<RumMetricGroupBy> groupBy = null;

  public RumMetricUpdateAttributes compute(RumMetricUpdateCompute compute) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    return this;
  }

  /**
   * <p>The compute rule to compute the rum-based metric.</p>
   * @return compute
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COMPUTE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public RumMetricUpdateCompute getCompute() {
        return compute;
      }
  public void setCompute(RumMetricUpdateCompute compute) {
    this.compute = compute;
  }
  public RumMetricUpdateAttributes filter(RumMetricFilter filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * <p>The rum-based metric filter. Events matching this filter will be aggregated in this metric.</p>
   * @return filter
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILTER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public RumMetricFilter getFilter() {
        return filter;
      }
  public void setFilter(RumMetricFilter filter) {
    this.filter = filter;
  }
  public RumMetricUpdateAttributes groupBy(List<RumMetricGroupBy> groupBy) {
    this.groupBy = groupBy;
    for (RumMetricGroupBy item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public RumMetricUpdateAttributes addGroupByItem(RumMetricGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * <p>The rules for the group by.</p>
   * @return groupBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GROUP_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<RumMetricGroupBy> getGroupBy() {
        return groupBy;
      }
  public void setGroupBy(List<RumMetricGroupBy> groupBy) {
    this.groupBy = groupBy;
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
   * @return RumMetricUpdateAttributes
   */
  @JsonAnySetter
  public RumMetricUpdateAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this RumMetricUpdateAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumMetricUpdateAttributes rumMetricUpdateAttributes = (RumMetricUpdateAttributes) o;
    return Objects.equals(this.compute, rumMetricUpdateAttributes.compute) && Objects.equals(this.filter, rumMetricUpdateAttributes.filter) && Objects.equals(this.groupBy, rumMetricUpdateAttributes.groupBy) && Objects.equals(this.additionalProperties, rumMetricUpdateAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(compute,filter,groupBy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumMetricUpdateAttributes {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
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
