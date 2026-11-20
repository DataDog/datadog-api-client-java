/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  FormulaGraphQueryGroupByItems.JSON_PROPERTY_FACET,
  FormulaGraphQueryGroupByItems.JSON_PROPERTY_LIMIT,
  FormulaGraphQueryGroupByItems.JSON_PROPERTY_SHOULD_EXCLUDE_MISSING,
  FormulaGraphQueryGroupByItems.JSON_PROPERTY_SORT,
  FormulaGraphQueryGroupByItems.JSON_PROPERTY_SOURCE,
  FormulaGraphQueryGroupByItems.JSON_PROPERTY_TARGET
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaGraphQueryGroupByItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FACET = "facet";
  private String facet;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Double limit;

  public static final String JSON_PROPERTY_SHOULD_EXCLUDE_MISSING = "should_exclude_missing";
  private Boolean shouldExcludeMissing;

  public static final String JSON_PROPERTY_SORT = "sort";
  private FormulaAndFunctionEventQueryGroupBySort sort;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_TARGET = "target";
  private GraphTarget target;

  public FormulaGraphQueryGroupByItems() {}

  @JsonCreator
  public FormulaGraphQueryGroupByItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_FACET) String facet) {
    this.facet = facet;
  }

  public FormulaGraphQueryGroupByItems facet(String facet) {
    this.facet = facet;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public FormulaGraphQueryGroupByItems limit(Double limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return limit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLimit() {
    return limit;
  }

  public void setLimit(Double limit) {
    this.limit = limit;
  }

  public FormulaGraphQueryGroupByItems shouldExcludeMissing(Boolean shouldExcludeMissing) {
    this.shouldExcludeMissing = shouldExcludeMissing;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public FormulaGraphQueryGroupByItems sort(FormulaAndFunctionEventQueryGroupBySort sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return sort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FormulaAndFunctionEventQueryGroupBySort getSort() {
    return sort;
  }

  public void setSort(FormulaAndFunctionEventQueryGroupBySort sort) {
    this.sort = sort;
    if (sort != null) {
      this.unparsed |= sort.unparsed;
    }
  }

  public FormulaGraphQueryGroupByItems source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return source
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public FormulaGraphQueryGroupByItems target(GraphTarget target) {
    this.target = target;
    this.unparsed |= target.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return target
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GraphTarget getTarget() {
    return target;
  }

  public void setTarget(GraphTarget target) {
    this.target = target;
    if (target != null) {
      this.unparsed |= target.unparsed;
    }
  }

  /** Return true if this FormulaGraphQueryGroupByItems object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaGraphQueryGroupByItems formulaGraphQueryGroupByItems = (FormulaGraphQueryGroupByItems) o;
    return Objects.equals(this.facet, formulaGraphQueryGroupByItems.facet)
        && Objects.equals(this.limit, formulaGraphQueryGroupByItems.limit)
        && Objects.equals(
            this.shouldExcludeMissing, formulaGraphQueryGroupByItems.shouldExcludeMissing)
        && Objects.equals(this.sort, formulaGraphQueryGroupByItems.sort)
        && Objects.equals(this.source, formulaGraphQueryGroupByItems.source)
        && Objects.equals(this.target, formulaGraphQueryGroupByItems.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facet, limit, shouldExcludeMissing, sort, source, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaGraphQueryGroupByItems {\n");
    sb.append("    facet: ").append(toIndentedString(facet)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    shouldExcludeMissing: ")
        .append(toIndentedString(shouldExcludeMissing))
        .append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
