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
   * <p>The definition of <code>ArbitraryRuleResponseDataAttributesStrategy</code> object.</p>
 */
@JsonPropertyOrder({
  ArbitraryRuleResponseDataAttributesStrategy.JSON_PROPERTY_ALLOCATED_BY,
  ArbitraryRuleResponseDataAttributesStrategy.JSON_PROPERTY_ALLOCATED_BY_FILTERS,
  ArbitraryRuleResponseDataAttributesStrategy.JSON_PROPERTY_ALLOCATED_BY_TAG_KEYS,
  ArbitraryRuleResponseDataAttributesStrategy.JSON_PROPERTY_BASED_ON_COSTS,
  ArbitraryRuleResponseDataAttributesStrategy.JSON_PROPERTY_BASED_ON_TIMESERIES,
  ArbitraryRuleResponseDataAttributesStrategy.JSON_PROPERTY_EVALUATE_GROUPED_BY_FILTERS,
  ArbitraryRuleResponseDataAttributesStrategy.JSON_PROPERTY_EVALUATE_GROUPED_BY_TAG_KEYS,
  ArbitraryRuleResponseDataAttributesStrategy.JSON_PROPERTY_GRANULARITY,
  ArbitraryRuleResponseDataAttributesStrategy.JSON_PROPERTY_METHOD
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ArbitraryRuleResponseDataAttributesStrategy {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOCATED_BY = "allocated_by";
  private List<ArbitraryRuleResponseDataAttributesStrategyAllocatedByItems> allocatedBy = null;

  public static final String JSON_PROPERTY_ALLOCATED_BY_FILTERS = "allocated_by_filters";
  private List<ArbitraryRuleResponseDataAttributesStrategyAllocatedByFiltersItems> allocatedByFilters = null;

  public static final String JSON_PROPERTY_ALLOCATED_BY_TAG_KEYS = "allocated_by_tag_keys";
  private List<String> allocatedByTagKeys = null;

  public static final String JSON_PROPERTY_BASED_ON_COSTS = "based_on_costs";
  private List<ArbitraryRuleResponseDataAttributesStrategyBasedOnCostsItems> basedOnCosts = null;

  public static final String JSON_PROPERTY_BASED_ON_TIMESERIES = "based_on_timeseries";
  private Map<String, Object> basedOnTimeseries = null;

  public static final String JSON_PROPERTY_EVALUATE_GROUPED_BY_FILTERS = "evaluate_grouped_by_filters";
  private List<ArbitraryRuleResponseDataAttributesStrategyEvaluateGroupedByFiltersItems> evaluateGroupedByFilters = null;

  public static final String JSON_PROPERTY_EVALUATE_GROUPED_BY_TAG_KEYS = "evaluate_grouped_by_tag_keys";
  private List<String> evaluateGroupedByTagKeys = null;

  public static final String JSON_PROPERTY_GRANULARITY = "granularity";
  private String granularity;

  public static final String JSON_PROPERTY_METHOD = "method";
  private String method;

  public ArbitraryRuleResponseDataAttributesStrategy() {}

  @JsonCreator
  public ArbitraryRuleResponseDataAttributesStrategy(
            @JsonProperty(required=true, value=JSON_PROPERTY_METHOD)String method) {
        this.method = method;
  }
  public ArbitraryRuleResponseDataAttributesStrategy allocatedBy(List<ArbitraryRuleResponseDataAttributesStrategyAllocatedByItems> allocatedBy) {
    this.allocatedBy = allocatedBy;
    for (ArbitraryRuleResponseDataAttributesStrategyAllocatedByItems item : allocatedBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ArbitraryRuleResponseDataAttributesStrategy addAllocatedByItem(ArbitraryRuleResponseDataAttributesStrategyAllocatedByItems allocatedByItem) {
    if (this.allocatedBy == null) {
      this.allocatedBy = new ArrayList<>();
    }
    this.allocatedBy.add(allocatedByItem);
    this.unparsed |= allocatedByItem.unparsed;
    return this;
  }

  /**
   * <p>The <code>strategy</code> <code>allocated_by</code>.</p>
   * @return allocatedBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ALLOCATED_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ArbitraryRuleResponseDataAttributesStrategyAllocatedByItems> getAllocatedBy() {
        return allocatedBy;
      }
  public void setAllocatedBy(List<ArbitraryRuleResponseDataAttributesStrategyAllocatedByItems> allocatedBy) {
    this.allocatedBy = allocatedBy;
  }
  public ArbitraryRuleResponseDataAttributesStrategy allocatedByFilters(List<ArbitraryRuleResponseDataAttributesStrategyAllocatedByFiltersItems> allocatedByFilters) {
    this.allocatedByFilters = allocatedByFilters;
    for (ArbitraryRuleResponseDataAttributesStrategyAllocatedByFiltersItems item : allocatedByFilters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ArbitraryRuleResponseDataAttributesStrategy addAllocatedByFiltersItem(ArbitraryRuleResponseDataAttributesStrategyAllocatedByFiltersItems allocatedByFiltersItem) {
    if (this.allocatedByFilters == null) {
      this.allocatedByFilters = new ArrayList<>();
    }
    this.allocatedByFilters.add(allocatedByFiltersItem);
    this.unparsed |= allocatedByFiltersItem.unparsed;
    return this;
  }

  /**
   * <p>The <code>strategy</code> <code>allocated_by_filters</code>.</p>
   * @return allocatedByFilters
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ALLOCATED_BY_FILTERS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ArbitraryRuleResponseDataAttributesStrategyAllocatedByFiltersItems> getAllocatedByFilters() {
        return allocatedByFilters;
      }
  public void setAllocatedByFilters(List<ArbitraryRuleResponseDataAttributesStrategyAllocatedByFiltersItems> allocatedByFilters) {
    this.allocatedByFilters = allocatedByFilters;
  }
  public ArbitraryRuleResponseDataAttributesStrategy allocatedByTagKeys(List<String> allocatedByTagKeys) {
    this.allocatedByTagKeys = allocatedByTagKeys;
    return this;
  }
  public ArbitraryRuleResponseDataAttributesStrategy addAllocatedByTagKeysItem(String allocatedByTagKeysItem) {
    if (this.allocatedByTagKeys == null) {
      this.allocatedByTagKeys = new ArrayList<>();
    }
    this.allocatedByTagKeys.add(allocatedByTagKeysItem);
    return this;
  }

  /**
   * <p>The <code>strategy</code> <code>allocated_by_tag_keys</code>.</p>
   * @return allocatedByTagKeys
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ALLOCATED_BY_TAG_KEYS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getAllocatedByTagKeys() {
        return allocatedByTagKeys;
      }
  public void setAllocatedByTagKeys(List<String> allocatedByTagKeys) {
    this.allocatedByTagKeys = allocatedByTagKeys;
  }
  public ArbitraryRuleResponseDataAttributesStrategy basedOnCosts(List<ArbitraryRuleResponseDataAttributesStrategyBasedOnCostsItems> basedOnCosts) {
    this.basedOnCosts = basedOnCosts;
    for (ArbitraryRuleResponseDataAttributesStrategyBasedOnCostsItems item : basedOnCosts) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ArbitraryRuleResponseDataAttributesStrategy addBasedOnCostsItem(ArbitraryRuleResponseDataAttributesStrategyBasedOnCostsItems basedOnCostsItem) {
    if (this.basedOnCosts == null) {
      this.basedOnCosts = new ArrayList<>();
    }
    this.basedOnCosts.add(basedOnCostsItem);
    this.unparsed |= basedOnCostsItem.unparsed;
    return this;
  }

  /**
   * <p>The <code>strategy</code> <code>based_on_costs</code>.</p>
   * @return basedOnCosts
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BASED_ON_COSTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ArbitraryRuleResponseDataAttributesStrategyBasedOnCostsItems> getBasedOnCosts() {
        return basedOnCosts;
      }
  public void setBasedOnCosts(List<ArbitraryRuleResponseDataAttributesStrategyBasedOnCostsItems> basedOnCosts) {
    this.basedOnCosts = basedOnCosts;
  }
  public ArbitraryRuleResponseDataAttributesStrategy basedOnTimeseries(Map<String, Object> basedOnTimeseries) {
    this.basedOnTimeseries = basedOnTimeseries;
    return this;
  }
  public ArbitraryRuleResponseDataAttributesStrategy putBasedOnTimeseriesItem(String key, Object basedOnTimeseriesItem) {
    if (this.basedOnTimeseries == null) {
      this.basedOnTimeseries = new HashMap<>();
    }
    this.basedOnTimeseries.put(key, basedOnTimeseriesItem);
    return this;
  }

  /**
   * <p>The rule <code>strategy</code> <code>based_on_timeseries</code>.</p>
   * @return basedOnTimeseries
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BASED_ON_TIMESERIES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, Object> getBasedOnTimeseries() {
        return basedOnTimeseries;
      }
  public void setBasedOnTimeseries(Map<String, Object> basedOnTimeseries) {
    this.basedOnTimeseries = basedOnTimeseries;
  }
  public ArbitraryRuleResponseDataAttributesStrategy evaluateGroupedByFilters(List<ArbitraryRuleResponseDataAttributesStrategyEvaluateGroupedByFiltersItems> evaluateGroupedByFilters) {
    this.evaluateGroupedByFilters = evaluateGroupedByFilters;
    for (ArbitraryRuleResponseDataAttributesStrategyEvaluateGroupedByFiltersItems item : evaluateGroupedByFilters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ArbitraryRuleResponseDataAttributesStrategy addEvaluateGroupedByFiltersItem(ArbitraryRuleResponseDataAttributesStrategyEvaluateGroupedByFiltersItems evaluateGroupedByFiltersItem) {
    if (this.evaluateGroupedByFilters == null) {
      this.evaluateGroupedByFilters = new ArrayList<>();
    }
    this.evaluateGroupedByFilters.add(evaluateGroupedByFiltersItem);
    this.unparsed |= evaluateGroupedByFiltersItem.unparsed;
    return this;
  }

  /**
   * <p>The <code>strategy</code> <code>evaluate_grouped_by_filters</code>.</p>
   * @return evaluateGroupedByFilters
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EVALUATE_GROUPED_BY_FILTERS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ArbitraryRuleResponseDataAttributesStrategyEvaluateGroupedByFiltersItems> getEvaluateGroupedByFilters() {
        return evaluateGroupedByFilters;
      }
  public void setEvaluateGroupedByFilters(List<ArbitraryRuleResponseDataAttributesStrategyEvaluateGroupedByFiltersItems> evaluateGroupedByFilters) {
    this.evaluateGroupedByFilters = evaluateGroupedByFilters;
  }
  public ArbitraryRuleResponseDataAttributesStrategy evaluateGroupedByTagKeys(List<String> evaluateGroupedByTagKeys) {
    this.evaluateGroupedByTagKeys = evaluateGroupedByTagKeys;
    return this;
  }
  public ArbitraryRuleResponseDataAttributesStrategy addEvaluateGroupedByTagKeysItem(String evaluateGroupedByTagKeysItem) {
    if (this.evaluateGroupedByTagKeys == null) {
      this.evaluateGroupedByTagKeys = new ArrayList<>();
    }
    this.evaluateGroupedByTagKeys.add(evaluateGroupedByTagKeysItem);
    return this;
  }

  /**
   * <p>The <code>strategy</code> <code>evaluate_grouped_by_tag_keys</code>.</p>
   * @return evaluateGroupedByTagKeys
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EVALUATE_GROUPED_BY_TAG_KEYS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getEvaluateGroupedByTagKeys() {
        return evaluateGroupedByTagKeys;
      }
  public void setEvaluateGroupedByTagKeys(List<String> evaluateGroupedByTagKeys) {
    this.evaluateGroupedByTagKeys = evaluateGroupedByTagKeys;
  }
  public ArbitraryRuleResponseDataAttributesStrategy granularity(String granularity) {
    this.granularity = granularity;
    return this;
  }

  /**
   * <p>The <code>strategy</code> <code>granularity</code>.</p>
   * @return granularity
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GRANULARITY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getGranularity() {
        return granularity;
      }
  public void setGranularity(String granularity) {
    this.granularity = granularity;
  }
  public ArbitraryRuleResponseDataAttributesStrategy method(String method) {
    this.method = method;
    return this;
  }

  /**
   * <p>The <code>strategy</code> <code>method</code>.</p>
   * @return method
  **/
      @JsonProperty(JSON_PROPERTY_METHOD)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getMethod() {
        return method;
      }
  public void setMethod(String method) {
    this.method = method;
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
   * @return ArbitraryRuleResponseDataAttributesStrategy
   */
  @JsonAnySetter
  public ArbitraryRuleResponseDataAttributesStrategy putAdditionalProperty(String key, Object value) {
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
   * Return true if this ArbitraryRuleResponseDataAttributesStrategy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArbitraryRuleResponseDataAttributesStrategy arbitraryRuleResponseDataAttributesStrategy = (ArbitraryRuleResponseDataAttributesStrategy) o;
    return Objects.equals(this.allocatedBy, arbitraryRuleResponseDataAttributesStrategy.allocatedBy) && Objects.equals(this.allocatedByFilters, arbitraryRuleResponseDataAttributesStrategy.allocatedByFilters) && Objects.equals(this.allocatedByTagKeys, arbitraryRuleResponseDataAttributesStrategy.allocatedByTagKeys) && Objects.equals(this.basedOnCosts, arbitraryRuleResponseDataAttributesStrategy.basedOnCosts) && Objects.equals(this.basedOnTimeseries, arbitraryRuleResponseDataAttributesStrategy.basedOnTimeseries) && Objects.equals(this.evaluateGroupedByFilters, arbitraryRuleResponseDataAttributesStrategy.evaluateGroupedByFilters) && Objects.equals(this.evaluateGroupedByTagKeys, arbitraryRuleResponseDataAttributesStrategy.evaluateGroupedByTagKeys) && Objects.equals(this.granularity, arbitraryRuleResponseDataAttributesStrategy.granularity) && Objects.equals(this.method, arbitraryRuleResponseDataAttributesStrategy.method) && Objects.equals(this.additionalProperties, arbitraryRuleResponseDataAttributesStrategy.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(allocatedBy,allocatedByFilters,allocatedByTagKeys,basedOnCosts,basedOnTimeseries,evaluateGroupedByFilters,evaluateGroupedByTagKeys,granularity,method, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArbitraryRuleResponseDataAttributesStrategy {\n");
    sb.append("    allocatedBy: ").append(toIndentedString(allocatedBy)).append("\n");
    sb.append("    allocatedByFilters: ").append(toIndentedString(allocatedByFilters)).append("\n");
    sb.append("    allocatedByTagKeys: ").append(toIndentedString(allocatedByTagKeys)).append("\n");
    sb.append("    basedOnCosts: ").append(toIndentedString(basedOnCosts)).append("\n");
    sb.append("    basedOnTimeseries: ").append(toIndentedString(basedOnTimeseries)).append("\n");
    sb.append("    evaluateGroupedByFilters: ").append(toIndentedString(evaluateGroupedByFilters)).append("\n");
    sb.append("    evaluateGroupedByTagKeys: ").append(toIndentedString(evaluateGroupedByTagKeys)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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
