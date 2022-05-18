/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** A group by rule */
@JsonPropertyOrder({
  LogsGroupBy.JSON_PROPERTY_FACET,
  LogsGroupBy.JSON_PROPERTY_HISTOGRAM,
  LogsGroupBy.JSON_PROPERTY_LIMIT,
  LogsGroupBy.JSON_PROPERTY_MISSING,
  LogsGroupBy.JSON_PROPERTY_SORT,
  LogsGroupBy.JSON_PROPERTY_TOTAL
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsGroupBy {
  @JsonIgnore public boolean unparsed = false;
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
  public LogsGroupBy(@JsonProperty(required = true, value = JSON_PROPERTY_FACET) String facet) {
    this.facet = facet;
  }

  public LogsGroupBy facet(String facet) {
    this.facet = facet;
    return this;
  }

  /**
   * The name of the facet to use (required)
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

  public LogsGroupBy histogram(LogsGroupByHistogram histogram) {
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
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HISTOGRAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * The maximum buckets to return for this group by
   *
   * @return limit
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * The value to use for logs that don't have the facet used to group by
   *
   * @return missing
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MISSING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * A sort rule
   *
   * @return sort
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * A resulting object to put the given computes in over all the matching records.
   *
   * @return total
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsGroupByTotal getTotal() {
    return total;
  }

  public void setTotal(LogsGroupByTotal total) {
    this.total = total;
  }

  /** Return true if this LogsGroupBy object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsGroupBy logsGroupBy = (LogsGroupBy) o;
    return Objects.equals(this.facet, logsGroupBy.facet)
        && Objects.equals(this.histogram, logsGroupBy.histogram)
        && Objects.equals(this.limit, logsGroupBy.limit)
        && Objects.equals(this.missing, logsGroupBy.missing)
        && Objects.equals(this.sort, logsGroupBy.sort)
        && Objects.equals(this.total, logsGroupBy.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facet, histogram, limit, missing, sort, total);
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
    sb.append("}");
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
