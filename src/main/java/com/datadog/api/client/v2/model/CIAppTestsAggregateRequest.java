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
   * <p>The object sent with the request to retrieve aggregation buckets of test events from your organization.</p>
 */
@JsonPropertyOrder({
  CIAppTestsAggregateRequest.JSON_PROPERTY_COMPUTE,
  CIAppTestsAggregateRequest.JSON_PROPERTY_FILTER,
  CIAppTestsAggregateRequest.JSON_PROPERTY_GROUP_BY,
  CIAppTestsAggregateRequest.JSON_PROPERTY_OPTIONS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppTestsAggregateRequest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private List<CIAppCompute> compute = null;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private CIAppTestsQueryFilter filter;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<CIAppTestsGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private CIAppQueryOptions options;

  public CIAppTestsAggregateRequest compute(List<CIAppCompute> compute) {
    this.compute = compute;
    for (CIAppCompute item : compute) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public CIAppTestsAggregateRequest addComputeItem(CIAppCompute computeItem) {
    if (this.compute == null) {
      this.compute = new ArrayList<>();
    }
    this.compute.add(computeItem);
    this.unparsed |= computeItem.unparsed;
    return this;
  }

  /**
   * <p>The list of metrics or timeseries to compute for the retrieved buckets.</p>
   * @return compute
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COMPUTE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<CIAppCompute> getCompute() {
        return compute;
      }
  public void setCompute(List<CIAppCompute> compute) {
    this.compute = compute;
  }
  public CIAppTestsAggregateRequest filter(CIAppTestsQueryFilter filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * <p>The search and filter query settings.</p>
   * @return filter
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILTER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CIAppTestsQueryFilter getFilter() {
        return filter;
      }
  public void setFilter(CIAppTestsQueryFilter filter) {
    this.filter = filter;
  }
  public CIAppTestsAggregateRequest groupBy(List<CIAppTestsGroupBy> groupBy) {
    this.groupBy = groupBy;
    for (CIAppTestsGroupBy item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public CIAppTestsAggregateRequest addGroupByItem(CIAppTestsGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * <p>The rules for the group-by.</p>
   * @return groupBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GROUP_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<CIAppTestsGroupBy> getGroupBy() {
        return groupBy;
      }
  public void setGroupBy(List<CIAppTestsGroupBy> groupBy) {
    this.groupBy = groupBy;
  }
  public CIAppTestsAggregateRequest options(CIAppQueryOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * <p>Global query options that are used during the query.
   * Only supply timezone or time offset, not both. Otherwise, the query fails.</p>
   * @return options
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OPTIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CIAppQueryOptions getOptions() {
        return options;
      }
  public void setOptions(CIAppQueryOptions options) {
    this.options = options;
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
   * @return CIAppTestsAggregateRequest
   */
  @JsonAnySetter
  public CIAppTestsAggregateRequest putAdditionalProperty(String key, Object value) {
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
   * Return true if this CIAppTestsAggregateRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppTestsAggregateRequest ciAppTestsAggregateRequest = (CIAppTestsAggregateRequest) o;
    return Objects.equals(this.compute, ciAppTestsAggregateRequest.compute) && Objects.equals(this.filter, ciAppTestsAggregateRequest.filter) && Objects.equals(this.groupBy, ciAppTestsAggregateRequest.groupBy) && Objects.equals(this.options, ciAppTestsAggregateRequest.options) && Objects.equals(this.additionalProperties, ciAppTestsAggregateRequest.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(compute,filter,groupBy,options, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppTestsAggregateRequest {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
