/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Group by configuration for retention queries.</p>
 */
@JsonPropertyOrder({
  RetentionGroupBy.JSON_PROPERTY_FACET,
  RetentionGroupBy.JSON_PROPERTY_LIMIT,
  RetentionGroupBy.JSON_PROPERTY_SHOULD_EXCLUDE_MISSING,
  RetentionGroupBy.JSON_PROPERTY_SORT,
  RetentionGroupBy.JSON_PROPERTY_SOURCE,
  RetentionGroupBy.JSON_PROPERTY_TARGET
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RetentionGroupBy {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FACET = "facet";
  private String facet;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_SHOULD_EXCLUDE_MISSING = "should_exclude_missing";
  private Boolean shouldExcludeMissing;

  public static final String JSON_PROPERTY_SORT = "sort";
  private RetentionGroupBySort sort;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_TARGET = "target";
  private RetentionGroupByTarget target;

  public RetentionGroupBy() {}

  @JsonCreator
  public RetentionGroupBy(
            @JsonProperty(required=true, value=JSON_PROPERTY_FACET)String facet,
            @JsonProperty(required=true, value=JSON_PROPERTY_TARGET)RetentionGroupByTarget target) {
        this.facet = facet;
        this.target = target;
        this.unparsed |= !target.isValid();
  }
  public RetentionGroupBy facet(String facet) {
    this.facet = facet;
    return this;
  }

  /**
   * <p>Facet to group by.</p>
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
  public RetentionGroupBy limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <p>Maximum number of groups.</p>
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
  public RetentionGroupBy shouldExcludeMissing(Boolean shouldExcludeMissing) {
    this.shouldExcludeMissing = shouldExcludeMissing;
    return this;
  }

  /**
   * <p>Whether to exclude missing values.</p>
   * @return shouldExcludeMissing
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SHOULD_EXCLUDE_MISSING)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getShouldExcludeMissing() {
        return shouldExcludeMissing;
      }
  public void setShouldExcludeMissing(Boolean shouldExcludeMissing) {
    this.shouldExcludeMissing = shouldExcludeMissing;
  }
  public RetentionGroupBy sort(RetentionGroupBySort sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * <p>Sort configuration for retention group by.</p>
   * @return sort
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SORT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public RetentionGroupBySort getSort() {
        return sort;
      }
  public void setSort(RetentionGroupBySort sort) {
    this.sort = sort;
    if (sort != null) {
      this.unparsed |= sort.unparsed;
    }
  }
  public RetentionGroupBy source(String source) {
    this.source = source;
    return this;
  }

  /**
   * <p>Source field.</p>
   * @return source
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSource() {
        return source;
      }
  public void setSource(String source) {
    this.source = source;
  }
  public RetentionGroupBy target(RetentionGroupByTarget target) {
    this.target = target;
    this.unparsed |= !target.isValid();
    return this;
  }

  /**
   * <p>Target for retention group by.</p>
   * @return target
  **/
      @JsonProperty(JSON_PROPERTY_TARGET)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public RetentionGroupByTarget getTarget() {
        return target;
      }
  public void setTarget(RetentionGroupByTarget target) {
    if (!target.isValid()) {
        this.unparsed = true;
    }
    this.target = target;
  }

  /**
   * Return true if this RetentionGroupBy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionGroupBy retentionGroupBy = (RetentionGroupBy) o;
    return Objects.equals(this.facet, retentionGroupBy.facet) && Objects.equals(this.limit, retentionGroupBy.limit) && Objects.equals(this.shouldExcludeMissing, retentionGroupBy.shouldExcludeMissing) && Objects.equals(this.sort, retentionGroupBy.sort) && Objects.equals(this.source, retentionGroupBy.source) && Objects.equals(this.target, retentionGroupBy.target);
  }


  @Override
  public int hashCode() {
    return Objects.hash(facet,limit,shouldExcludeMissing,sort,source,target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionGroupBy {\n");
    sb.append("    facet: ").append(toIndentedString(facet)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    shouldExcludeMissing: ").append(toIndentedString(shouldExcludeMissing)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
