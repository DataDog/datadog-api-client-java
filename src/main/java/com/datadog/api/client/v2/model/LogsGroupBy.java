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
   * <p>A group by rule</p>
 */
@JsonPropertyOrder({
  LogsGroupBy.JSON_PROPERTY_FACET,
  LogsGroupBy.JSON_PROPERTY_HISTOGRAM,
  LogsGroupBy.JSON_PROPERTY_LIMIT,
  LogsGroupBy.JSON_PROPERTY_MISSING,
  LogsGroupBy.JSON_PROPERTY_SORT,
  LogsGroupBy.JSON_PROPERTY_TOTAL
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsGroupBy {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FACET = "facet";
  private String facet;

  public static final String JSON_PROPERTY_HISTOGRAM = "histogram";
  private LogsGroupByHistogram histogram;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit = 10l;

  public static final String JSON_PROPERTY_MISSING = "missing";
  private LogsGroupByMissing missing;

  public static final String JSON_PROPERTY_SORT = "sort";
  private LogsAggregateSort sort;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private LogsGroupByTotal total = new LogsGroupByTotal(false);

  public LogsGroupBy() {}

  @JsonCreator
  public LogsGroupBy(
            @JsonProperty(required=true, value=JSON_PROPERTY_FACET)String facet) {
        this.facet = facet;
  }
  public LogsGroupBy facet(String facet) {
    this.facet = facet;
    return this;
  }

  /**
   * <p>The name of the facet to use (required)</p>
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
  public LogsGroupBy histogram(LogsGroupByHistogram histogram) {
    this.histogram = histogram;
    this.unparsed |= histogram.unparsed;
    return this;
  }

  /**
   * <p>Used to perform a histogram computation (only for measure facets).
   * Note: at most 100 buckets are allowed, the number of buckets is (max - min)/interval.</p>
   * @return histogram
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HISTOGRAM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public LogsGroupByHistogram getHistogram() {
        return histogram;
      }
  public void setHistogram(LogsGroupByHistogram histogram) {
    this.histogram = histogram;
  }
  public LogsGroupBy limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <p>The maximum buckets to return for this group by. Note: at most 10000 buckets are allowed.
   * If grouping by multiple facets, the product of limits must not exceed 10000.</p>
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
  public LogsGroupBy missing(LogsGroupByMissing missing) {
    this.missing = missing;
    this.unparsed |= missing.unparsed;
    return this;
  }

  /**
   * <p>The value to use for logs that don't have the facet used to group by</p>
   * @return missing
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MISSING)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public LogsGroupByMissing getMissing() {
        return missing;
      }
  public void setMissing(LogsGroupByMissing missing) {
    this.missing = missing;
  }
  public LogsGroupBy sort(LogsAggregateSort sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * <p>A sort rule</p>
   * @return sort
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SORT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public LogsAggregateSort getSort() {
        return sort;
      }
  public void setSort(LogsAggregateSort sort) {
    this.sort = sort;
  }
  public LogsGroupBy total(LogsGroupByTotal total) {
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
      public LogsGroupByTotal getTotal() {
        return total;
      }
  public void setTotal(LogsGroupByTotal total) {
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
   * @return LogsGroupBy
   */
  @JsonAnySetter
  public LogsGroupBy putAdditionalProperty(String key, Object value) {
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
   * Return true if this LogsGroupBy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsGroupBy logsGroupBy = (LogsGroupBy) o;
    return Objects.equals(this.facet, logsGroupBy.facet) && Objects.equals(this.histogram, logsGroupBy.histogram) && Objects.equals(this.limit, logsGroupBy.limit) && Objects.equals(this.missing, logsGroupBy.missing) && Objects.equals(this.sort, logsGroupBy.sort) && Objects.equals(this.total, logsGroupBy.total) && Objects.equals(this.additionalProperties, logsGroupBy.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(facet,histogram,limit,missing,sort,total, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsGroupBy {\n");
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
