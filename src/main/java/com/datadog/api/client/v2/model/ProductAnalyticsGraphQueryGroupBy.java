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

/** Segments journey results by the values of a facet. */
@JsonPropertyOrder({
  ProductAnalyticsGraphQueryGroupBy.JSON_PROPERTY_FACET,
  ProductAnalyticsGraphQueryGroupBy.JSON_PROPERTY_LIMIT,
  ProductAnalyticsGraphQueryGroupBy.JSON_PROPERTY_SHOULD_EXCLUDE_MISSING,
  ProductAnalyticsGraphQueryGroupBy.JSON_PROPERTY_SORT,
  ProductAnalyticsGraphQueryGroupBy.JSON_PROPERTY_SOURCE,
  ProductAnalyticsGraphQueryGroupBy.JSON_PROPERTY_TARGET,
  ProductAnalyticsGraphQueryGroupBy.JSON_PROPERTY_VALUE_FILTERS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsGraphQueryGroupBy {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FACET = "facet";
  private String facet;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_SHOULD_EXCLUDE_MISSING = "should_exclude_missing";
  private Boolean shouldExcludeMissing = false;

  public static final String JSON_PROPERTY_SORT = "sort";
  private ProductAnalyticsGroupBySort sort;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private ProductAnalyticsGraphQueryGroupBySource source;

  public static final String JSON_PROPERTY_TARGET = "target";
  private ProductAnalyticsJourneyTarget target;

  public static final String JSON_PROPERTY_VALUE_FILTERS = "value_filters";
  private List<String> valueFilters = null;

  public ProductAnalyticsGraphQueryGroupBy() {}

  @JsonCreator
  public ProductAnalyticsGraphQueryGroupBy(
      @JsonProperty(required = true, value = JSON_PROPERTY_FACET) String facet) {
    this.facet = facet;
  }

  public ProductAnalyticsGraphQueryGroupBy facet(String facet) {
    this.facet = facet;
    return this;
  }

  /**
   * Attribute path to group by.
   *
   * @return facet
   */
  @JsonProperty(JSON_PROPERTY_FACET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFacet() {
    return facet;
  }

  public void setFacet(String facet) {
    this.facet = facet;
  }

  public ProductAnalyticsGraphQueryGroupBy limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Maximum number of groups to return. Omit it to let the service choose. minimum: 1
   *
   * @return limit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public ProductAnalyticsGraphQueryGroupBy shouldExcludeMissing(Boolean shouldExcludeMissing) {
    this.shouldExcludeMissing = shouldExcludeMissing;
    return this;
  }

  /**
   * Whether to exclude entities that have no value for this facet.
   *
   * @return shouldExcludeMissing
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOULD_EXCLUDE_MISSING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShouldExcludeMissing() {
    return shouldExcludeMissing;
  }

  public void setShouldExcludeMissing(Boolean shouldExcludeMissing) {
    this.shouldExcludeMissing = shouldExcludeMissing;
  }

  public ProductAnalyticsGraphQueryGroupBy sort(ProductAnalyticsGroupBySort sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * Sort configuration for group-by results.
   *
   * @return sort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsGroupBySort getSort() {
    return sort;
  }

  public void setSort(ProductAnalyticsGroupBySort sort) {
    this.sort = sort;
    if (sort != null) {
      this.unparsed |= sort.unparsed;
    }
  }

  public ProductAnalyticsGraphQueryGroupBy source(ProductAnalyticsGraphQueryGroupBySource source) {
    this.source = source;
    this.unparsed |= !source.isValid();
    return this;
  }

  /**
   * Audience dimension to group by, instead of an event facet.
   *
   * @return source
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsGraphQueryGroupBySource getSource() {
    return source;
  }

  public void setSource(ProductAnalyticsGraphQueryGroupBySource source) {
    if (!source.isValid()) {
      this.unparsed = true;
    }
    this.source = source;
  }

  public ProductAnalyticsGraphQueryGroupBy target(ProductAnalyticsJourneyTarget target) {
    this.target = target;
    this.unparsed |= target.unparsed;
    return this;
  }

  /**
   * A reference to a step, or a range of steps, in the journey. Use a <code>node</code> target to
   * name a single step, or a <code>path</code> target to name the range between two steps.
   *
   * @return target
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsJourneyTarget getTarget() {
    return target;
  }

  public void setTarget(ProductAnalyticsJourneyTarget target) {
    this.target = target;
    if (target != null) {
      this.unparsed |= target.unparsed;
    }
  }

  public ProductAnalyticsGraphQueryGroupBy valueFilters(List<String> valueFilters) {
    this.valueFilters = valueFilters;
    return this;
  }

  public ProductAnalyticsGraphQueryGroupBy addValueFiltersItem(String valueFiltersItem) {
    if (this.valueFilters == null) {
      this.valueFilters = new ArrayList<>();
    }
    this.valueFilters.add(valueFiltersItem);
    return this;
  }

  /**
   * Restricts the results to these facet values.
   *
   * @return valueFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getValueFilters() {
    return valueFilters;
  }

  public void setValueFilters(List<String> valueFilters) {
    this.valueFilters = valueFilters;
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
   * @return ProductAnalyticsGraphQueryGroupBy
   */
  @JsonAnySetter
  public ProductAnalyticsGraphQueryGroupBy putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsGraphQueryGroupBy object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsGraphQueryGroupBy productAnalyticsGraphQueryGroupBy =
        (ProductAnalyticsGraphQueryGroupBy) o;
    return Objects.equals(this.facet, productAnalyticsGraphQueryGroupBy.facet)
        && Objects.equals(this.limit, productAnalyticsGraphQueryGroupBy.limit)
        && Objects.equals(
            this.shouldExcludeMissing, productAnalyticsGraphQueryGroupBy.shouldExcludeMissing)
        && Objects.equals(this.sort, productAnalyticsGraphQueryGroupBy.sort)
        && Objects.equals(this.source, productAnalyticsGraphQueryGroupBy.source)
        && Objects.equals(this.target, productAnalyticsGraphQueryGroupBy.target)
        && Objects.equals(this.valueFilters, productAnalyticsGraphQueryGroupBy.valueFilters)
        && Objects.equals(
            this.additionalProperties, productAnalyticsGraphQueryGroupBy.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        facet,
        limit,
        shouldExcludeMissing,
        sort,
        source,
        target,
        valueFilters,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsGraphQueryGroupBy {\n");
    sb.append("    facet: ").append(toIndentedString(facet)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    shouldExcludeMissing: ")
        .append(toIndentedString(shouldExcludeMissing))
        .append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    valueFilters: ").append(toIndentedString(valueFilters)).append("\n");
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
