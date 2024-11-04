/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The object describing the Datadog rum-based metric to create. */
@JsonPropertyOrder({
  RumMetricCreateAttributes.JSON_PROPERTY_COMPUTE,
  RumMetricCreateAttributes.JSON_PROPERTY_EVENT_TYPE,
  RumMetricCreateAttributes.JSON_PROPERTY_FILTER,
  RumMetricCreateAttributes.JSON_PROPERTY_GROUP_BY,
  RumMetricCreateAttributes.JSON_PROPERTY_UNIQUENESS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumMetricCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private RumMetricCompute compute;

  public static final String JSON_PROPERTY_EVENT_TYPE = "event_type";
  private RumMetricEventType eventType;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private RumMetricFilter filter;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<RumMetricGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_UNIQUENESS = "uniqueness";
  private RumMetricUniqueness uniqueness;

  public RumMetricCreateAttributes() {}

  @JsonCreator
  public RumMetricCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPUTE) RumMetricCompute compute,
      @JsonProperty(required = true, value = JSON_PROPERTY_EVENT_TYPE)
          RumMetricEventType eventType) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    this.eventType = eventType;
    this.unparsed |= !eventType.isValid();
  }

  public RumMetricCreateAttributes compute(RumMetricCompute compute) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    return this;
  }

  /**
   * The compute rule to compute the rum-based metric.
   *
   * @return compute
   */
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RumMetricCompute getCompute() {
    return compute;
  }

  public void setCompute(RumMetricCompute compute) {
    this.compute = compute;
  }

  public RumMetricCreateAttributes eventType(RumMetricEventType eventType) {
    this.eventType = eventType;
    this.unparsed |= !eventType.isValid();
    return this;
  }

  /**
   * The type of RUM events to filter on.
   *
   * @return eventType
   */
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RumMetricEventType getEventType() {
    return eventType;
  }

  public void setEventType(RumMetricEventType eventType) {
    if (!eventType.isValid()) {
      this.unparsed = true;
    }
    this.eventType = eventType;
  }

  public RumMetricCreateAttributes filter(RumMetricFilter filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * The rum-based metric filter. Events matching this filter will be aggregated in this metric.
   *
   * @return filter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RumMetricFilter getFilter() {
    return filter;
  }

  public void setFilter(RumMetricFilter filter) {
    this.filter = filter;
  }

  public RumMetricCreateAttributes groupBy(List<RumMetricGroupBy> groupBy) {
    this.groupBy = groupBy;
    for (RumMetricGroupBy item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public RumMetricCreateAttributes addGroupByItem(RumMetricGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * The rules for the group by.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RumMetricGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<RumMetricGroupBy> groupBy) {
    this.groupBy = groupBy;
  }

  public RumMetricCreateAttributes uniqueness(RumMetricUniqueness uniqueness) {
    this.uniqueness = uniqueness;
    this.unparsed |= uniqueness.unparsed;
    return this;
  }

  /**
   * The rule to count updatable events. Is only set if <code>event_type</code> is <code>sessions
   * </code> or <code>views</code>.
   *
   * @return uniqueness
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIQUENESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RumMetricUniqueness getUniqueness() {
    return uniqueness;
  }

  public void setUniqueness(RumMetricUniqueness uniqueness) {
    this.uniqueness = uniqueness;
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
   * @return RumMetricCreateAttributes
   */
  @JsonAnySetter
  public RumMetricCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumMetricCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumMetricCreateAttributes rumMetricCreateAttributes = (RumMetricCreateAttributes) o;
    return Objects.equals(this.compute, rumMetricCreateAttributes.compute)
        && Objects.equals(this.eventType, rumMetricCreateAttributes.eventType)
        && Objects.equals(this.filter, rumMetricCreateAttributes.filter)
        && Objects.equals(this.groupBy, rumMetricCreateAttributes.groupBy)
        && Objects.equals(this.uniqueness, rumMetricCreateAttributes.uniqueness)
        && Objects.equals(
            this.additionalProperties, rumMetricCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compute, eventType, filter, groupBy, uniqueness, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumMetricCreateAttributes {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    uniqueness: ").append(toIndentedString(uniqueness)).append("\n");
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
