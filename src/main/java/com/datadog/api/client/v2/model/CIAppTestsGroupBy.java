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
   * <p>A group-by rule.</p>
 */
@JsonPropertyOrder({
  CIAppTestsGroupBy.JSON_PROPERTY_FACET,
  CIAppTestsGroupBy.JSON_PROPERTY_HISTOGRAM,
  CIAppTestsGroupBy.JSON_PROPERTY_LIMIT,
  CIAppTestsGroupBy.JSON_PROPERTY_MISSING,
  CIAppTestsGroupBy.JSON_PROPERTY_SORT,
  CIAppTestsGroupBy.JSON_PROPERTY_TOTAL
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppTestsGroupBy {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FACET = "facet";
  private String facet;

  public static final String JSON_PROPERTY_HISTOGRAM = "histogram";
  private CIAppGroupByHistogram histogram;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit = 10l;

  public static final String JSON_PROPERTY_MISSING = "missing";
  private CIAppGroupByMissing missing;

  public static final String JSON_PROPERTY_SORT = "sort";
  private CIAppAggregateSort sort;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private CIAppGroupByTotal total = new CIAppGroupByTotal(false);

  public CIAppTestsGroupBy() {}

  @JsonCreator
  public CIAppTestsGroupBy(
            @JsonProperty(required=true, value=JSON_PROPERTY_FACET)String facet) {
        this.facet = facet;
  }
  public CIAppTestsGroupBy facet(String facet) {
    this.facet = facet;
    return this;
  }

  /**
   * <p>The name of the facet to use (required).</p>
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
  public CIAppTestsGroupBy histogram(CIAppGroupByHistogram histogram) {
    this.histogram = histogram;
    this.unparsed |= histogram.unparsed;
    return this;
  }

  /**
   * <p>Used to perform a histogram computation (only for measure facets).
   * At most, 100 buckets are allowed, the number of buckets is <code>(max - min)/interval</code>.</p>
   * @return histogram
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HISTOGRAM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CIAppGroupByHistogram getHistogram() {
        return histogram;
      }
  public void setHistogram(CIAppGroupByHistogram histogram) {
    this.histogram = histogram;
  }
  public CIAppTestsGroupBy limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <p>The maximum buckets to return for this group-by.</p>
   * @return limit
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LIMIT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getLimit() {
        return limit;
      }
  public void setLimit(Long limit) {
    this.limit = limit;
  }
  public CIAppTestsGroupBy missing(CIAppGroupByMissing missing) {
    this.missing = missing;
    this.unparsed |= missing.unparsed;
    return this;
  }

  /**
   * <p>The value to use for logs that don't have the facet used to group-by.</p>
   * @return missing
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MISSING)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CIAppGroupByMissing getMissing() {
        return missing;
      }
  public void setMissing(CIAppGroupByMissing missing) {
    this.missing = missing;
  }
  public CIAppTestsGroupBy sort(CIAppAggregateSort sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * <p>A sort rule. The <code>aggregation</code> field is required when <code>type</code> is <code>measure</code>.</p>
   * @return sort
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SORT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CIAppAggregateSort getSort() {
        return sort;
      }
  public void setSort(CIAppAggregateSort sort) {
    this.sort = sort;
  }
  public CIAppTestsGroupBy total(CIAppGroupByTotal total) {
    this.total = total;
    this.unparsed |= total.unparsed;
    return this;
  }

  /**
   * <p>A resulting object to put the given computes in over all the matching records.</p>
   * @return total
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TOTAL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CIAppGroupByTotal getTotal() {
        return total;
      }
  public void setTotal(CIAppGroupByTotal total) {
    this.total = total;
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
   * @return CIAppTestsGroupBy
   */
  @JsonAnySetter
  public CIAppTestsGroupBy putAdditionalProperty(String key, Object value) {
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
   * Return true if this CIAppTestsGroupBy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppTestsGroupBy ciAppTestsGroupBy = (CIAppTestsGroupBy) o;
    return Objects.equals(this.facet, ciAppTestsGroupBy.facet) && Objects.equals(this.histogram, ciAppTestsGroupBy.histogram) && Objects.equals(this.limit, ciAppTestsGroupBy.limit) && Objects.equals(this.missing, ciAppTestsGroupBy.missing) && Objects.equals(this.sort, ciAppTestsGroupBy.sort) && Objects.equals(this.total, ciAppTestsGroupBy.total) && Objects.equals(this.additionalProperties, ciAppTestsGroupBy.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(facet,histogram,limit,missing,sort,total, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppTestsGroupBy {\n");
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
