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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  FormulaAndFunctionEventQueryGroupByFields.JSON_PROPERTY_FIELDS,
  FormulaAndFunctionEventQueryGroupByFields.JSON_PROPERTY_LIMIT,
  FormulaAndFunctionEventQueryGroupByFields.JSON_PROPERTY_SHOULD_EXCLUDE_MISSING,
  FormulaAndFunctionEventQueryGroupByFields.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaAndFunctionEventQueryGroupByFields {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIELDS = "fields";
  private List<String> fields = new ArrayList<>();

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Double limit;

  public static final String JSON_PROPERTY_SHOULD_EXCLUDE_MISSING = "should_exclude_missing";
  private Boolean shouldExcludeMissing;

  public static final String JSON_PROPERTY_SORT = "sort";
  private FormulaAndFunctionEventQueryGroupBySort sort;

  public FormulaAndFunctionEventQueryGroupByFields() {}

  @JsonCreator
  public FormulaAndFunctionEventQueryGroupByFields(
      @JsonProperty(required = true, value = JSON_PROPERTY_FIELDS) List<String> fields) {
    this.fields = fields;
  }

  public FormulaAndFunctionEventQueryGroupByFields fields(List<String> fields) {
    this.fields = fields;
    return this;
  }

  public FormulaAndFunctionEventQueryGroupByFields addFieldsItem(String fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return fields
   */
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getFields() {
    return fields;
  }

  public void setFields(List<String> fields) {
    this.fields = fields;
  }

  public FormulaAndFunctionEventQueryGroupByFields limit(Double limit) {
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

  public FormulaAndFunctionEventQueryGroupByFields shouldExcludeMissing(
      Boolean shouldExcludeMissing) {
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

  public FormulaAndFunctionEventQueryGroupByFields sort(
      FormulaAndFunctionEventQueryGroupBySort sort) {
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

  /** Return true if this FormulaAndFunctionEventQueryGroupByFields object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaAndFunctionEventQueryGroupByFields formulaAndFunctionEventQueryGroupByFields =
        (FormulaAndFunctionEventQueryGroupByFields) o;
    return Objects.equals(this.fields, formulaAndFunctionEventQueryGroupByFields.fields)
        && Objects.equals(this.limit, formulaAndFunctionEventQueryGroupByFields.limit)
        && Objects.equals(
            this.shouldExcludeMissing,
            formulaAndFunctionEventQueryGroupByFields.shouldExcludeMissing)
        && Objects.equals(this.sort, formulaAndFunctionEventQueryGroupByFields.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, limit, shouldExcludeMissing, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaAndFunctionEventQueryGroupByFields {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    shouldExcludeMissing: ")
        .append(toIndentedString(shouldExcludeMissing))
        .append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
