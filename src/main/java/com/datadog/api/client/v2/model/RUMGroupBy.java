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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** A group-by rule. */
@JsonPropertyOrder({
  RUMGroupBy.JSON_PROPERTY_FACET,
  RUMGroupBy.JSON_PROPERTY_HISTOGRAM,
  RUMGroupBy.JSON_PROPERTY_LIMIT,
  RUMGroupBy.JSON_PROPERTY_MISSING,
  RUMGroupBy.JSON_PROPERTY_SORT,
  RUMGroupBy.JSON_PROPERTY_TOTAL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RUMGroupBy {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FACET = "facet";
  private String facet;

  public static final String JSON_PROPERTY_HISTOGRAM = "histogram";
  private RUMGroupByHistogram histogram;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit = 10l;

  public static final String JSON_PROPERTY_MISSING = "missing";
  private RUMGroupByMissing missing;

  public static final String JSON_PROPERTY_SORT = "sort";
  private RUMAggregateSort sort;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private RUMGroupByTotal total = new RUMGroupByTotal(false);

  public RUMGroupBy() {}

  @JsonCreator
  public RUMGroupBy(@JsonProperty(required = true, value = JSON_PROPERTY_FACET) String facet) {
    this.facet = facet;
  }

  public RUMGroupBy facet(String facet) {
    this.facet = facet;
    return this;
  }

  /**
   * The name of the facet to use (required).
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

  public RUMGroupBy histogram(RUMGroupByHistogram histogram) {
    this.histogram = histogram;
    this.unparsed |= histogram.unparsed;
    return this;
  }

  /**
   * Used to perform a histogram computation (only for measure facets). Note: At most 100 buckets
   * are allowed, the number of buckets is (max - min)/interval.
   *
   * @return histogram
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HISTOGRAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RUMGroupByHistogram getHistogram() {
    return histogram;
  }

  public void setHistogram(RUMGroupByHistogram histogram) {
    this.histogram = histogram;
  }

  public RUMGroupBy limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * The maximum buckets to return for this group-by.
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

  public RUMGroupBy missing(RUMGroupByMissing missing) {
    this.missing = missing;
    this.unparsed |= missing.unparsed;
    return this;
  }

  /**
   * The value to use for logs that don't have the facet used to group by.
   *
   * @return missing
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MISSING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RUMGroupByMissing getMissing() {
    return missing;
  }

  public void setMissing(RUMGroupByMissing missing) {
    this.missing = missing;
  }

  public RUMGroupBy sort(RUMAggregateSort sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * A sort rule.
   *
   * @return sort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RUMAggregateSort getSort() {
    return sort;
  }

  public void setSort(RUMAggregateSort sort) {
    this.sort = sort;
  }

  public RUMGroupBy total(RUMGroupByTotal total) {
    this.total = total;
    this.unparsed |= total.unparsed;
    return this;
  }

  /**
   * A resulting object to put the given computes in over all the matching records.
   *
   * @return total
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RUMGroupByTotal getTotal() {
    return total;
  }

  public void setTotal(RUMGroupByTotal total) {
    this.total = total;
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
   * @return RUMGroupBy
   */
  @JsonAnySetter
  public RUMGroupBy putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RUMGroupBy object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RUMGroupBy rumGroupBy = (RUMGroupBy) o;
    return Objects.equals(this.facet, rumGroupBy.facet)
        && Objects.equals(this.histogram, rumGroupBy.histogram)
        && Objects.equals(this.limit, rumGroupBy.limit)
        && Objects.equals(this.missing, rumGroupBy.missing)
        && Objects.equals(this.sort, rumGroupBy.sort)
        && Objects.equals(this.total, rumGroupBy.total)
        && Objects.equals(this.additionalProperties, rumGroupBy.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facet, histogram, limit, missing, sort, total, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RUMGroupBy {\n");
    sb.append("    facet: ").append(toIndentedString(facet)).append("\n");
    sb.append("    histogram: ").append(toIndentedString(histogram)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    missing: ").append(toIndentedString(missing)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
