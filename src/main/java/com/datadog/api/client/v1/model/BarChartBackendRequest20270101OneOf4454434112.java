/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
  BarChartBackendRequest20270101OneOf4454434112.JSON_PROPERTY_CONDITIONAL_FORMATS,
  BarChartBackendRequest20270101OneOf4454434112.JSON_PROPERTY_FORMULAS,
  BarChartBackendRequest20270101OneOf4454434112.JSON_PROPERTY_QUERIES,
  BarChartBackendRequest20270101OneOf4454434112.JSON_PROPERTY_RESPONSE_FORMAT,
  BarChartBackendRequest20270101OneOf4454434112.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class BarChartBackendRequest20270101OneOf4454434112 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<ThresholdFormattingRule_20270101> conditionalFormats = null;

  public static final String JSON_PROPERTY_FORMULAS = "formulas";
  private List<WidgetFormula_20270101> formulas = null;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<FormulaAndFunctionQueryDefinition_20270101> queries = new ArrayList<>();

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443921184_20270101 responseFormat;

  public static final String JSON_PROPERTY_SORT = "sort";
  private ScalarFormulaSort_20270101 sort;

  public BarChartBackendRequest20270101OneOf4454434112() {}

  @JsonCreator
  public BarChartBackendRequest20270101OneOf4454434112(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERIES)
          List<FormulaAndFunctionQueryDefinition_20270101> queries,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443921184_20270101 responseFormat) {
    this.queries = queries;
    for (FormulaAndFunctionQueryDefinition_20270101 item : queries) {
      this.unparsed |= item.unparsed;
    }
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public BarChartBackendRequest20270101OneOf4454434112 conditionalFormats(
      List<ThresholdFormattingRule_20270101> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule_20270101 item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public BarChartBackendRequest20270101OneOf4454434112 addConditionalFormatsItem(
      ThresholdFormattingRule_20270101 conditionalFormatsItem) {
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
  public List<ThresholdFormattingRule_20270101> getConditionalFormats() {
    return conditionalFormats;
  }

  public void setConditionalFormats(List<ThresholdFormattingRule_20270101> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule_20270101 item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public BarChartBackendRequest20270101OneOf4454434112 formulas(
      List<WidgetFormula_20270101> formulas) {
    this.formulas = formulas;
    if (formulas != null) {
      for (WidgetFormula_20270101 item : formulas) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public BarChartBackendRequest20270101OneOf4454434112 addFormulasItem(
      WidgetFormula_20270101 formulasItem) {
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
  public List<WidgetFormula_20270101> getFormulas() {
    return formulas;
  }

  public void setFormulas(List<WidgetFormula_20270101> formulas) {
    this.formulas = formulas;
    if (formulas != null) {
      for (WidgetFormula_20270101 item : formulas) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public BarChartBackendRequest20270101OneOf4454434112 queries(
      List<FormulaAndFunctionQueryDefinition_20270101> queries) {
    this.queries = queries;
    for (FormulaAndFunctionQueryDefinition_20270101 item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public BarChartBackendRequest20270101OneOf4454434112 addQueriesItem(
      FormulaAndFunctionQueryDefinition_20270101 queriesItem) {
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
  public List<FormulaAndFunctionQueryDefinition_20270101> getQueries() {
    return queries;
  }

  public void setQueries(List<FormulaAndFunctionQueryDefinition_20270101> queries) {
    this.queries = queries;
    if (queries != null) {
      for (FormulaAndFunctionQueryDefinition_20270101 item : queries) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public BarChartBackendRequest20270101OneOf4454434112 responseFormat(
      BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443921184_20270101 responseFormat) {
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
  public BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443921184_20270101 getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(
      BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443921184_20270101 responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  public BarChartBackendRequest20270101OneOf4454434112 sort(ScalarFormulaSort_20270101 sort) {
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
  public ScalarFormulaSort_20270101 getSort() {
    return sort;
  }

  public void setSort(ScalarFormulaSort_20270101 sort) {
    this.sort = sort;
    if (sort != null) {
      this.unparsed |= sort.unparsed;
    }
  }

  /** Return true if this BarChartBackendRequest20270101OneOf4454434112 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BarChartBackendRequest20270101OneOf4454434112 barChartBackendRequest20270101OneOf4454434112 =
        (BarChartBackendRequest20270101OneOf4454434112) o;
    return Objects.equals(
            this.conditionalFormats,
            barChartBackendRequest20270101OneOf4454434112.conditionalFormats)
        && Objects.equals(this.formulas, barChartBackendRequest20270101OneOf4454434112.formulas)
        && Objects.equals(this.queries, barChartBackendRequest20270101OneOf4454434112.queries)
        && Objects.equals(
            this.responseFormat, barChartBackendRequest20270101OneOf4454434112.responseFormat)
        && Objects.equals(this.sort, barChartBackendRequest20270101OneOf4454434112.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionalFormats, formulas, queries, responseFormat, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BarChartBackendRequest20270101OneOf4454434112 {\n");
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
