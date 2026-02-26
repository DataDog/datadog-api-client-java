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
   * <p>A dimension on which to split a query's results.</p>
 */
@JsonPropertyOrder({
  EventsGroupBy.JSON_PROPERTY_FACET,
  EventsGroupBy.JSON_PROPERTY_LIMIT,
  EventsGroupBy.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventsGroupBy {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FACET = "facet";
  private String facet;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit = 10;

  public static final String JSON_PROPERTY_SORT = "sort";
  private EventsGroupBySort sort;

  public EventsGroupBy() {}

  @JsonCreator
  public EventsGroupBy(
            @JsonProperty(required=true, value=JSON_PROPERTY_FACET)String facet) {
        this.facet = facet;
  }
  public EventsGroupBy facet(String facet) {
    this.facet = facet;
    return this;
  }

  /**
   * <p>The facet by which to split groups.</p>
   * @return facet
  **/
      @JsonProperty(JSON_PROPERTY_FACET)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getFacet() {
        return facet;
      }
  public void setFacet(String facet) {
    this.facet = facet;
  }
  public EventsGroupBy limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <p>The maximum buckets to return for this group by. Note: at most 10000 buckets are allowed.
   * If grouping by multiple facets, the product of limits must not exceed 10000.</p>
   * maximum: 10000
   * @return limit
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LIMIT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getLimit() {
        return limit;
      }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }
  public EventsGroupBy sort(EventsGroupBySort sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * <p>The dimension by which to sort a query's results.</p>
   * @return sort
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SORT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public EventsGroupBySort getSort() {
        return sort;
      }
  public void setSort(EventsGroupBySort sort) {
    this.sort = sort;
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
   * @return EventsGroupBy
   */
  @JsonAnySetter
  public EventsGroupBy putAdditionalProperty(String key, Object value) {
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
   * Return true if this EventsGroupBy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsGroupBy eventsGroupBy = (EventsGroupBy) o;
    return Objects.equals(this.facet, eventsGroupBy.facet) && Objects.equals(this.limit, eventsGroupBy.limit) && Objects.equals(this.sort, eventsGroupBy.sort) && Objects.equals(this.additionalProperties, eventsGroupBy.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(facet,limit,sort, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsGroupBy {\n");
    sb.append("    facet: ").append(toIndentedString(facet)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
