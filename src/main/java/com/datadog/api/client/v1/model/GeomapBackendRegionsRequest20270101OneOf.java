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
  GeomapBackendRegionsRequest20270101OneOf.JSON_PROPERTY_CONDITIONAL_FORMATS,
  GeomapBackendRegionsRequest20270101OneOf.JSON_PROPERTY_FORMULAS,
  GeomapBackendRegionsRequest20270101OneOf.JSON_PROPERTY_QUERIES,
  GeomapBackendRegionsRequest20270101OneOf.JSON_PROPERTY_RESPONSE_FORMAT,
  GeomapBackendRegionsRequest20270101OneOf.JSON_PROPERTY_SORT,
  GeomapBackendRegionsRequest20270101OneOf.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GeomapBackendRegionsRequest20270101OneOf {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<ThresholdFormattingRule_20270101> conditionalFormats = null;

  public static final String JSON_PROPERTY_FORMULAS = "formulas";
  private List<WidgetFormula_20270101> formulas = null;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<FormulaAndFunctionQueryDefinition_20270101> queries = new ArrayList<>();

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat_20270101 responseFormat;

  public static final String JSON_PROPERTY_SORT = "sort";
  private ScalarFormulaSort_20270101 sort;

  public static final String JSON_PROPERTY_STYLE = "style";
  private GeomapRequestStyle_20270101 style;

  public GeomapBackendRegionsRequest20270101OneOf() {}

  @JsonCreator
  public GeomapBackendRegionsRequest20270101OneOf(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERIES)
          List<FormulaAndFunctionQueryDefinition_20270101> queries,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat_20270101 responseFormat) {
    this.queries = queries;
    for (FormulaAndFunctionQueryDefinition_20270101 item : queries) {
      this.unparsed |= item.unparsed;
    }
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public GeomapBackendRegionsRequest20270101OneOf conditionalFormats(
      List<ThresholdFormattingRule_20270101> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule_20270101 item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public GeomapBackendRegionsRequest20270101OneOf addConditionalFormatsItem(
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

  public GeomapBackendRegionsRequest20270101OneOf formulas(List<WidgetFormula_20270101> formulas) {
    this.formulas = formulas;
    if (formulas != null) {
      for (WidgetFormula_20270101 item : formulas) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public GeomapBackendRegionsRequest20270101OneOf addFormulasItem(
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

  public GeomapBackendRegionsRequest20270101OneOf queries(
      List<FormulaAndFunctionQueryDefinition_20270101> queries) {
    this.queries = queries;
    for (FormulaAndFunctionQueryDefinition_20270101 item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GeomapBackendRegionsRequest20270101OneOf addQueriesItem(
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

  public GeomapBackendRegionsRequest20270101OneOf responseFormat(
      GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat_20270101 responseFormat) {
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
  public GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat_20270101 getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(
      GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat_20270101 responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  public GeomapBackendRegionsRequest20270101OneOf sort(ScalarFormulaSort_20270101 sort) {
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

  public GeomapBackendRegionsRequest20270101OneOf style(GeomapRequestStyle_20270101 style) {
    this.style = style;
    this.unparsed |= style.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return style
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GeomapRequestStyle_20270101 getStyle() {
    return style;
  }

  public void setStyle(GeomapRequestStyle_20270101 style) {
    this.style = style;
    if (style != null) {
      this.unparsed |= style.unparsed;
    }
  }

  /** Return true if this GeomapBackendRegionsRequest20270101OneOf object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeomapBackendRegionsRequest20270101OneOf geomapBackendRegionsRequest20270101OneOf =
        (GeomapBackendRegionsRequest20270101OneOf) o;
    return Objects.equals(
            this.conditionalFormats, geomapBackendRegionsRequest20270101OneOf.conditionalFormats)
        && Objects.equals(this.formulas, geomapBackendRegionsRequest20270101OneOf.formulas)
        && Objects.equals(this.queries, geomapBackendRegionsRequest20270101OneOf.queries)
        && Objects.equals(
            this.responseFormat, geomapBackendRegionsRequest20270101OneOf.responseFormat)
        && Objects.equals(this.sort, geomapBackendRegionsRequest20270101OneOf.sort)
        && Objects.equals(this.style, geomapBackendRegionsRequest20270101OneOf.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionalFormats, formulas, queries, responseFormat, sort, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeomapBackendRegionsRequest20270101OneOf {\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    formulas: ").append(toIndentedString(formulas)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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
