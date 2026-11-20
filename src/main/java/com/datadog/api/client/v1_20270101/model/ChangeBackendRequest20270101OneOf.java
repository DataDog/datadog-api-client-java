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
  ChangeBackendRequest20270101OneOf.JSON_PROPERTY_CHANGE_TYPE,
  ChangeBackendRequest20270101OneOf.JSON_PROPERTY_FORMULAS,
  ChangeBackendRequest20270101OneOf.JSON_PROPERTY_INCREASE_GOOD,
  ChangeBackendRequest20270101OneOf.JSON_PROPERTY_LIMIT,
  ChangeBackendRequest20270101OneOf.JSON_PROPERTY_ORDER_BY,
  ChangeBackendRequest20270101OneOf.JSON_PROPERTY_ORDER_DIR,
  ChangeBackendRequest20270101OneOf.JSON_PROPERTY_QUERIES,
  ChangeBackendRequest20270101OneOf.JSON_PROPERTY_RESPONSE_FORMAT,
  ChangeBackendRequest20270101OneOf.JSON_PROPERTY_SHOW_PRESENT,
  ChangeBackendRequest20270101OneOf.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChangeBackendRequest20270101OneOf {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHANGE_TYPE = "change_type";
  private ChangeTypeOptions changeType;

  public static final String JSON_PROPERTY_FORMULAS = "formulas";
  private List<WidgetFormula> formulas = null;

  public static final String JSON_PROPERTY_INCREASE_GOOD = "increase_good";
  private Boolean increaseGood;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Double limit;

  public static final String JSON_PROPERTY_ORDER_BY = "order_by";
  private OrderByOptions orderBy;

  public static final String JSON_PROPERTY_ORDER_DIR = "order_dir";
  private QuerySortOrder orderDir;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<FormulaAndFunctionQueryDefinition> queries = new ArrayList<>();

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private ChangeBackendRequestAnyOfAnyOfItemResponseFormat responseFormat;

  public static final String JSON_PROPERTY_SHOW_PRESENT = "show_present";
  private Boolean showPresent;

  public static final String JSON_PROPERTY_SORT = "sort";
  private ScalarFormulaSort sort;

  public ChangeBackendRequest20270101OneOf() {}

  @JsonCreator
  public ChangeBackendRequest20270101OneOf(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERIES)
          List<FormulaAndFunctionQueryDefinition> queries,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          ChangeBackendRequestAnyOfAnyOfItemResponseFormat responseFormat) {
    this.queries = queries;
    for (FormulaAndFunctionQueryDefinition item : queries) {
      this.unparsed |= item.unparsed;
    }
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public ChangeBackendRequest20270101OneOf changeType(ChangeTypeOptions changeType) {
    this.changeType = changeType;
    this.unparsed |= !changeType.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return changeType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChangeTypeOptions getChangeType() {
    return changeType;
  }

  public void setChangeType(ChangeTypeOptions changeType) {
    if (!changeType.isValid()) {
      this.unparsed = true;
    }
    this.changeType = changeType;
  }

  public ChangeBackendRequest20270101OneOf formulas(List<WidgetFormula> formulas) {
    this.formulas = formulas;
    if (formulas != null) {
      for (WidgetFormula item : formulas) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ChangeBackendRequest20270101OneOf addFormulasItem(WidgetFormula formulasItem) {
    if (this.formulas == null) {
      this.formulas = new ArrayList<>();
    }
    this.formulas.add(formulasItem);
    this.unparsed |= formulasItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return formulas
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORMULAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<WidgetFormula> getFormulas() {
    return formulas;
  }

  public void setFormulas(List<WidgetFormula> formulas) {
    this.formulas = formulas;
    if (formulas != null) {
      for (WidgetFormula item : formulas) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ChangeBackendRequest20270101OneOf increaseGood(Boolean increaseGood) {
    this.increaseGood = increaseGood;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return increaseGood
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCREASE_GOOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIncreaseGood() {
    return increaseGood;
  }

  public void setIncreaseGood(Boolean increaseGood) {
    this.increaseGood = increaseGood;
  }

  public ChangeBackendRequest20270101OneOf limit(Double limit) {
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

  public ChangeBackendRequest20270101OneOf orderBy(OrderByOptions orderBy) {
    this.orderBy = orderBy;
    this.unparsed |= !orderBy.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return orderBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OrderByOptions getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(OrderByOptions orderBy) {
    if (!orderBy.isValid()) {
      this.unparsed = true;
    }
    this.orderBy = orderBy;
  }

  public ChangeBackendRequest20270101OneOf orderDir(QuerySortOrder orderDir) {
    this.orderDir = orderDir;
    this.unparsed |= !orderDir.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return orderDir
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_DIR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public QuerySortOrder getOrderDir() {
    return orderDir;
  }

  public void setOrderDir(QuerySortOrder orderDir) {
    if (!orderDir.isValid()) {
      this.unparsed = true;
    }
    this.orderDir = orderDir;
  }

  public ChangeBackendRequest20270101OneOf queries(
      List<FormulaAndFunctionQueryDefinition> queries) {
    this.queries = queries;
    for (FormulaAndFunctionQueryDefinition item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ChangeBackendRequest20270101OneOf addQueriesItem(
      FormulaAndFunctionQueryDefinition queriesItem) {
    this.queries.add(queriesItem);
    this.unparsed |= queriesItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return queries
   */
  @JsonProperty(JSON_PROPERTY_QUERIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<FormulaAndFunctionQueryDefinition> getQueries() {
    return queries;
  }

  public void setQueries(List<FormulaAndFunctionQueryDefinition> queries) {
    this.queries = queries;
    if (queries != null) {
      for (FormulaAndFunctionQueryDefinition item : queries) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ChangeBackendRequest20270101OneOf responseFormat(
      ChangeBackendRequestAnyOfAnyOfItemResponseFormat responseFormat) {
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return responseFormat
   */
  @JsonProperty(JSON_PROPERTY_RESPONSE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ChangeBackendRequestAnyOfAnyOfItemResponseFormat getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(ChangeBackendRequestAnyOfAnyOfItemResponseFormat responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  public ChangeBackendRequest20270101OneOf showPresent(Boolean showPresent) {
    this.showPresent = showPresent;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return showPresent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_PRESENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowPresent() {
    return showPresent;
  }

  public void setShowPresent(Boolean showPresent) {
    this.showPresent = showPresent;
  }

  public ChangeBackendRequest20270101OneOf sort(ScalarFormulaSort sort) {
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
  public ScalarFormulaSort getSort() {
    return sort;
  }

  public void setSort(ScalarFormulaSort sort) {
    this.sort = sort;
    if (sort != null) {
      this.unparsed |= sort.unparsed;
    }
  }

  /** Return true if this ChangeBackendRequest20270101OneOf object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeBackendRequest20270101OneOf changeBackendRequest20270101OneOf =
        (ChangeBackendRequest20270101OneOf) o;
    return Objects.equals(this.changeType, changeBackendRequest20270101OneOf.changeType)
        && Objects.equals(this.formulas, changeBackendRequest20270101OneOf.formulas)
        && Objects.equals(this.increaseGood, changeBackendRequest20270101OneOf.increaseGood)
        && Objects.equals(this.limit, changeBackendRequest20270101OneOf.limit)
        && Objects.equals(this.orderBy, changeBackendRequest20270101OneOf.orderBy)
        && Objects.equals(this.orderDir, changeBackendRequest20270101OneOf.orderDir)
        && Objects.equals(this.queries, changeBackendRequest20270101OneOf.queries)
        && Objects.equals(this.responseFormat, changeBackendRequest20270101OneOf.responseFormat)
        && Objects.equals(this.showPresent, changeBackendRequest20270101OneOf.showPresent)
        && Objects.equals(this.sort, changeBackendRequest20270101OneOf.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        changeType,
        formulas,
        increaseGood,
        limit,
        orderBy,
        orderDir,
        queries,
        responseFormat,
        showPresent,
        sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeBackendRequest20270101OneOf {\n");
    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
    sb.append("    formulas: ").append(toIndentedString(formulas)).append("\n");
    sb.append("    increaseGood: ").append(toIndentedString(increaseGood)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    orderDir: ").append(toIndentedString(orderDir)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
    sb.append("    showPresent: ").append(toIndentedString(showPresent)).append("\n");
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
