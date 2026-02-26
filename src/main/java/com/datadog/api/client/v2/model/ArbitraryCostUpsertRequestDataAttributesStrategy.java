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
   * <p>The definition of <code>ArbitraryCostUpsertRequestDataAttributesStrategy</code> object.</p>
 */
@JsonPropertyOrder({
  ArbitraryCostUpsertRequestDataAttributesStrategy.JSON_PROPERTY_ALLOCATED_BY,
  ArbitraryCostUpsertRequestDataAttributesStrategy.JSON_PROPERTY_ALLOCATED_BY_FILTERS,
  ArbitraryCostUpsertRequestDataAttributesStrategy.JSON_PROPERTY_ALLOCATED_BY_TAG_KEYS,
  ArbitraryCostUpsertRequestDataAttributesStrategy.JSON_PROPERTY_BASED_ON_COSTS,
  ArbitraryCostUpsertRequestDataAttributesStrategy.JSON_PROPERTY_BASED_ON_TIMESERIES,
  ArbitraryCostUpsertRequestDataAttributesStrategy.JSON_PROPERTY_EVALUATE_GROUPED_BY_FILTERS,
  ArbitraryCostUpsertRequestDataAttributesStrategy.JSON_PROPERTY_EVALUATE_GROUPED_BY_TAG_KEYS,
  ArbitraryCostUpsertRequestDataAttributesStrategy.JSON_PROPERTY_GRANULARITY,
  ArbitraryCostUpsertRequestDataAttributesStrategy.JSON_PROPERTY_METHOD
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ArbitraryCostUpsertRequestDataAttributesStrategy {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOCATED_BY = "allocated_by";
  private List<ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItems> allocatedBy = null;

  public static final String JSON_PROPERTY_ALLOCATED_BY_FILTERS = "allocated_by_filters";
  private List<ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems> allocatedByFilters = null;

  public static final String JSON_PROPERTY_ALLOCATED_BY_TAG_KEYS = "allocated_by_tag_keys";
  private List<String> allocatedByTagKeys = null;

  public static final String JSON_PROPERTY_BASED_ON_COSTS = "based_on_costs";
  private List<ArbitraryCostUpsertRequestDataAttributesStrategyBasedOnCostsItems> basedOnCosts = null;

  public static final String JSON_PROPERTY_BASED_ON_TIMESERIES = "based_on_timeseries";
  private Map<String, Object> basedOnTimeseries = null;

  public static final String JSON_PROPERTY_EVALUATE_GROUPED_BY_FILTERS = "evaluate_grouped_by_filters";
  private List<ArbitraryCostUpsertRequestDataAttributesStrategyEvaluateGroupedByFiltersItems> evaluateGroupedByFilters = null;

  public static final String JSON_PROPERTY_EVALUATE_GROUPED_BY_TAG_KEYS = "evaluate_grouped_by_tag_keys";
  private List<String> evaluateGroupedByTagKeys = null;

  public static final String JSON_PROPERTY_GRANULARITY = "granularity";
  private String granularity;

  public static final String JSON_PROPERTY_METHOD = "method";
  private String method;

  public ArbitraryCostUpsertRequestDataAttributesStrategy() {}

  @JsonCreator
  public ArbitraryCostUpsertRequestDataAttributesStrategy(
            @JsonProperty(required=true, value=JSON_PROPERTY_METHOD)String method) {
        this.method = method;
  }
  public ArbitraryCostUpsertRequestDataAttributesStrategy allocatedBy(List<ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItems> allocatedBy) {
    this.allocatedBy = allocatedBy;
    for (ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItems item : allocatedBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ArbitraryCostUpsertRequestDataAttributesStrategy addAllocatedByItem(ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItems allocatedByItem) {
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
      public List<ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItems> getAllocatedBy() {
        return allocatedBy;
      }
  public void setAllocatedBy(List<ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByItems> allocatedBy) {
    this.allocatedBy = allocatedBy;
  }
  public ArbitraryCostUpsertRequestDataAttributesStrategy allocatedByFilters(List<ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems> allocatedByFilters) {
    this.allocatedByFilters = allocatedByFilters;
    for (ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems item : allocatedByFilters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ArbitraryCostUpsertRequestDataAttributesStrategy addAllocatedByFiltersItem(ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems allocatedByFiltersItem) {
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
      public List<ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems> getAllocatedByFilters() {
        return allocatedByFilters;
      }
  public void setAllocatedByFilters(List<ArbitraryCostUpsertRequestDataAttributesStrategyAllocatedByFiltersItems> allocatedByFilters) {
    this.allocatedByFilters = allocatedByFilters;
  }
  public ArbitraryCostUpsertRequestDataAttributesStrategy allocatedByTagKeys(List<String> allocatedByTagKeys) {
    this.allocatedByTagKeys = allocatedByTagKeys;
    return this;
  }
  public ArbitraryCostUpsertRequestDataAttributesStrategy addAllocatedByTagKeysItem(String allocatedByTagKeysItem) {
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
  public ArbitraryCostUpsertRequestDataAttributesStrategy basedOnCosts(List<ArbitraryCostUpsertRequestDataAttributesStrategyBasedOnCostsItems> basedOnCosts) {
    this.basedOnCosts = basedOnCosts;
    for (ArbitraryCostUpsertRequestDataAttributesStrategyBasedOnCostsItems item : basedOnCosts) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ArbitraryCostUpsertRequestDataAttributesStrategy addBasedOnCostsItem(ArbitraryCostUpsertRequestDataAttributesStrategyBasedOnCostsItems basedOnCostsItem) {
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
      public List<ArbitraryCostUpsertRequestDataAttributesStrategyBasedOnCostsItems> getBasedOnCosts() {
        return basedOnCosts;
      }
  public void setBasedOnCosts(List<ArbitraryCostUpsertRequestDataAttributesStrategyBasedOnCostsItems> basedOnCosts) {
    this.basedOnCosts = basedOnCosts;
  }
  public ArbitraryCostUpsertRequestDataAttributesStrategy basedOnTimeseries(Map<String, Object> basedOnTimeseries) {
    this.basedOnTimeseries = basedOnTimeseries;
    return this;
  }
  public ArbitraryCostUpsertRequestDataAttributesStrategy putBasedOnTimeseriesItem(String key, Object basedOnTimeseriesItem) {
    if (this.basedOnTimeseries == null) {
      this.basedOnTimeseries = new HashMap<>();
    }
    this.basedOnTimeseries.put(key, basedOnTimeseriesItem);
    return this;
  }

  /**
   * <p>The <code>strategy</code> <code>based_on_timeseries</code>.</p>
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
  public ArbitraryCostUpsertRequestDataAttributesStrategy evaluateGroupedByFilters(List<ArbitraryCostUpsertRequestDataAttributesStrategyEvaluateGroupedByFiltersItems> evaluateGroupedByFilters) {
    this.evaluateGroupedByFilters = evaluateGroupedByFilters;
    for (ArbitraryCostUpsertRequestDataAttributesStrategyEvaluateGroupedByFiltersItems item : evaluateGroupedByFilters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ArbitraryCostUpsertRequestDataAttributesStrategy addEvaluateGroupedByFiltersItem(ArbitraryCostUpsertRequestDataAttributesStrategyEvaluateGroupedByFiltersItems evaluateGroupedByFiltersItem) {
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
      public List<ArbitraryCostUpsertRequestDataAttributesStrategyEvaluateGroupedByFiltersItems> getEvaluateGroupedByFilters() {
        return evaluateGroupedByFilters;
      }
  public void setEvaluateGroupedByFilters(List<ArbitraryCostUpsertRequestDataAttributesStrategyEvaluateGroupedByFiltersItems> evaluateGroupedByFilters) {
    this.evaluateGroupedByFilters = evaluateGroupedByFilters;
  }
  public ArbitraryCostUpsertRequestDataAttributesStrategy evaluateGroupedByTagKeys(List<String> evaluateGroupedByTagKeys) {
    this.evaluateGroupedByTagKeys = evaluateGroupedByTagKeys;
    return this;
  }
  public ArbitraryCostUpsertRequestDataAttributesStrategy addEvaluateGroupedByTagKeysItem(String evaluateGroupedByTagKeysItem) {
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
  public ArbitraryCostUpsertRequestDataAttributesStrategy granularity(String granularity) {
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
  public ArbitraryCostUpsertRequestDataAttributesStrategy method(String method) {
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
   * @return ArbitraryCostUpsertRequestDataAttributesStrategy
   */
  @JsonAnySetter
  public ArbitraryCostUpsertRequestDataAttributesStrategy putAdditionalProperty(String key, Object value) {
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
   * Return true if this ArbitraryCostUpsertRequestDataAttributesStrategy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArbitraryCostUpsertRequestDataAttributesStrategy arbitraryCostUpsertRequestDataAttributesStrategy = (ArbitraryCostUpsertRequestDataAttributesStrategy) o;
    return Objects.equals(this.allocatedBy, arbitraryCostUpsertRequestDataAttributesStrategy.allocatedBy) && Objects.equals(this.allocatedByFilters, arbitraryCostUpsertRequestDataAttributesStrategy.allocatedByFilters) && Objects.equals(this.allocatedByTagKeys, arbitraryCostUpsertRequestDataAttributesStrategy.allocatedByTagKeys) && Objects.equals(this.basedOnCosts, arbitraryCostUpsertRequestDataAttributesStrategy.basedOnCosts) && Objects.equals(this.basedOnTimeseries, arbitraryCostUpsertRequestDataAttributesStrategy.basedOnTimeseries) && Objects.equals(this.evaluateGroupedByFilters, arbitraryCostUpsertRequestDataAttributesStrategy.evaluateGroupedByFilters) && Objects.equals(this.evaluateGroupedByTagKeys, arbitraryCostUpsertRequestDataAttributesStrategy.evaluateGroupedByTagKeys) && Objects.equals(this.granularity, arbitraryCostUpsertRequestDataAttributesStrategy.granularity) && Objects.equals(this.method, arbitraryCostUpsertRequestDataAttributesStrategy.method) && Objects.equals(this.additionalProperties, arbitraryCostUpsertRequestDataAttributesStrategy.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(allocatedBy,allocatedByFilters,allocatedByTagKeys,basedOnCosts,basedOnTimeseries,evaluateGroupedByFilters,evaluateGroupedByTagKeys,granularity,method, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArbitraryCostUpsertRequestDataAttributesStrategy {\n");
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
