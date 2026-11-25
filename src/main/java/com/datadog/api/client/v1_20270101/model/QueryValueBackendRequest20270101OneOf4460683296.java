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
  QueryValueBackendRequest20270101OneOf4460683296.JSON_PROPERTY_AGGREGATOR,
  QueryValueBackendRequest20270101OneOf4460683296.JSON_PROPERTY_COMPARISON,
  QueryValueBackendRequest20270101OneOf4460683296.JSON_PROPERTY_CONDITIONAL_FORMATS,
  QueryValueBackendRequest20270101OneOf4460683296.JSON_PROPERTY_FORMULAS,
  QueryValueBackendRequest20270101OneOf4460683296.JSON_PROPERTY_QUERIES,
  QueryValueBackendRequest20270101OneOf4460683296.JSON_PROPERTY_RESPONSE_FORMAT,
  QueryValueBackendRequest20270101OneOf4460683296.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class QueryValueBackendRequest20270101OneOf4460683296 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATOR = "aggregator";
  private ScalarAggregator aggregator;

  public static final String JSON_PROPERTY_COMPARISON = "comparison";
  private ComparisonRequest comparison;

  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<ThresholdFormattingRule> conditionalFormats = null;

  public static final String JSON_PROPERTY_FORMULAS = "formulas";
  private List<WidgetFormula> formulas = null;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<FormulaAndFunctionQueryDefinition> queries = new ArrayList<>();

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private QueryValueBackendRequestAnyOfAnyOfItemResponseFormat4450437696 responseFormat;

  public static final String JSON_PROPERTY_SORT = "sort";
  private ScalarFormulaSort sort;

  public QueryValueBackendRequest20270101OneOf4460683296() {}

  @JsonCreator
  public QueryValueBackendRequest20270101OneOf4460683296(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERIES)
          List<FormulaAndFunctionQueryDefinition> queries,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          QueryValueBackendRequestAnyOfAnyOfItemResponseFormat4450437696 responseFormat) {
    this.queries = queries;
    for (FormulaAndFunctionQueryDefinition item : queries) {
      this.unparsed |= item.unparsed;
    }
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public QueryValueBackendRequest20270101OneOf4460683296 aggregator(ScalarAggregator aggregator) {
    this.aggregator = aggregator;
    this.unparsed |= !aggregator.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return aggregator
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGGREGATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ScalarAggregator getAggregator() {
    return aggregator;
  }

  public void setAggregator(ScalarAggregator aggregator) {
    if (!aggregator.isValid()) {
      this.unparsed = true;
    }
    this.aggregator = aggregator;
  }

  public QueryValueBackendRequest20270101OneOf4460683296 comparison(ComparisonRequest comparison) {
    this.comparison = comparison;
    this.unparsed |= comparison.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return comparison
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPARISON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ComparisonRequest getComparison() {
    return comparison;
  }

  public void setComparison(ComparisonRequest comparison) {
    this.comparison = comparison;
    if (comparison != null) {
      this.unparsed |= comparison.unparsed;
    }
  }

  public QueryValueBackendRequest20270101OneOf4460683296 conditionalFormats(
      List<ThresholdFormattingRule> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public QueryValueBackendRequest20270101OneOf4460683296 addConditionalFormatsItem(
      ThresholdFormattingRule conditionalFormatsItem) {
    if (this.conditionalFormats == null) {
      this.conditionalFormats = new ArrayList<>();
    }
    this.conditionalFormats.add(conditionalFormatsItem);
    this.unparsed |= conditionalFormatsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return conditionalFormats
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONDITIONAL_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ThresholdFormattingRule> getConditionalFormats() {
    return conditionalFormats;
  }

  public void setConditionalFormats(List<ThresholdFormattingRule> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public QueryValueBackendRequest20270101OneOf4460683296 formulas(List<WidgetFormula> formulas) {
    this.formulas = formulas;
    if (formulas != null) {
      for (WidgetFormula item : formulas) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public QueryValueBackendRequest20270101OneOf4460683296 addFormulasItem(
      WidgetFormula formulasItem) {
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

  public QueryValueBackendRequest20270101OneOf4460683296 queries(
      List<FormulaAndFunctionQueryDefinition> queries) {
    this.queries = queries;
    for (FormulaAndFunctionQueryDefinition item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public QueryValueBackendRequest20270101OneOf4460683296 addQueriesItem(
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

  public QueryValueBackendRequest20270101OneOf4460683296 responseFormat(
      QueryValueBackendRequestAnyOfAnyOfItemResponseFormat4450437696 responseFormat) {
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
  public QueryValueBackendRequestAnyOfAnyOfItemResponseFormat4450437696 getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(
      QueryValueBackendRequestAnyOfAnyOfItemResponseFormat4450437696 responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  public QueryValueBackendRequest20270101OneOf4460683296 sort(ScalarFormulaSort sort) {
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

  /** Return true if this QueryValueBackendRequest20270101OneOf4460683296 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryValueBackendRequest20270101OneOf4460683296
        queryValueBackendRequest20270101OneOf4460683296 =
            (QueryValueBackendRequest20270101OneOf4460683296) o;
    return Objects.equals(
            this.aggregator, queryValueBackendRequest20270101OneOf4460683296.aggregator)
        && Objects.equals(
            this.comparison, queryValueBackendRequest20270101OneOf4460683296.comparison)
        && Objects.equals(
            this.conditionalFormats,
            queryValueBackendRequest20270101OneOf4460683296.conditionalFormats)
        && Objects.equals(this.formulas, queryValueBackendRequest20270101OneOf4460683296.formulas)
        && Objects.equals(this.queries, queryValueBackendRequest20270101OneOf4460683296.queries)
        && Objects.equals(
            this.responseFormat, queryValueBackendRequest20270101OneOf4460683296.responseFormat)
        && Objects.equals(this.sort, queryValueBackendRequest20270101OneOf4460683296.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aggregator, comparison, conditionalFormats, formulas, queries, responseFormat, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryValueBackendRequest20270101OneOf4460683296 {\n");
    sb.append("    aggregator: ").append(toIndentedString(aggregator)).append("\n");
    sb.append("    comparison: ").append(toIndentedString(comparison)).append("\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    formulas: ").append(toIndentedString(formulas)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
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
