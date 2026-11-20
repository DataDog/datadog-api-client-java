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
  GeomapBackendRegionsRequest20270101OneOf4457463328.JSON_PROPERTY_CONDITIONAL_FORMATS,
  GeomapBackendRegionsRequest20270101OneOf4457463328.JSON_PROPERTY_FORMULAS,
  GeomapBackendRegionsRequest20270101OneOf4457463328.JSON_PROPERTY_QUERIES,
  GeomapBackendRegionsRequest20270101OneOf4457463328.JSON_PROPERTY_RESPONSE_FORMAT,
  GeomapBackendRegionsRequest20270101OneOf4457463328.JSON_PROPERTY_SORT,
  GeomapBackendRegionsRequest20270101OneOf4457463328.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GeomapBackendRegionsRequest20270101OneOf4457463328 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<ThresholdFormattingRule> conditionalFormats = null;

  public static final String JSON_PROPERTY_FORMULAS = "formulas";
  private List<WidgetFormula> formulas = null;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<FormulaAndFunctionQueryDefinition> queries = new ArrayList<>();

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat4447322496 responseFormat;

  public static final String JSON_PROPERTY_SORT = "sort";
  private ScalarFormulaSort sort;

  public static final String JSON_PROPERTY_STYLE = "style";
  private GeomapRequestStyle style;

  public GeomapBackendRegionsRequest20270101OneOf4457463328() {}

  @JsonCreator
  public GeomapBackendRegionsRequest20270101OneOf4457463328(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERIES)
          List<FormulaAndFunctionQueryDefinition> queries,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat4447322496 responseFormat) {
    this.queries = queries;
    for (FormulaAndFunctionQueryDefinition item : queries) {
      this.unparsed |= item.unparsed;
    }
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public GeomapBackendRegionsRequest20270101OneOf4457463328 conditionalFormats(
      List<ThresholdFormattingRule> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public GeomapBackendRegionsRequest20270101OneOf4457463328 addConditionalFormatsItem(
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

  public GeomapBackendRegionsRequest20270101OneOf4457463328 formulas(List<WidgetFormula> formulas) {
    this.formulas = formulas;
    if (formulas != null) {
      for (WidgetFormula item : formulas) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public GeomapBackendRegionsRequest20270101OneOf4457463328 addFormulasItem(
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

  public GeomapBackendRegionsRequest20270101OneOf4457463328 queries(
      List<FormulaAndFunctionQueryDefinition> queries) {
    this.queries = queries;
    for (FormulaAndFunctionQueryDefinition item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GeomapBackendRegionsRequest20270101OneOf4457463328 addQueriesItem(
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

  public GeomapBackendRegionsRequest20270101OneOf4457463328 responseFormat(
      GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat4447322496 responseFormat) {
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
  public GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat4447322496 getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(
      GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat4447322496 responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  public GeomapBackendRegionsRequest20270101OneOf4457463328 sort(ScalarFormulaSort sort) {
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

  public GeomapBackendRegionsRequest20270101OneOf4457463328 style(GeomapRequestStyle style) {
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
  public GeomapRequestStyle getStyle() {
    return style;
  }

  public void setStyle(GeomapRequestStyle style) {
    this.style = style;
    if (style != null) {
      this.unparsed |= style.unparsed;
    }
  }

  /**
   * Return true if this GeomapBackendRegionsRequest20270101OneOf4457463328 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeomapBackendRegionsRequest20270101OneOf4457463328
        geomapBackendRegionsRequest20270101OneOf4457463328 =
            (GeomapBackendRegionsRequest20270101OneOf4457463328) o;
    return Objects.equals(
            this.conditionalFormats,
            geomapBackendRegionsRequest20270101OneOf4457463328.conditionalFormats)
        && Objects.equals(
            this.formulas, geomapBackendRegionsRequest20270101OneOf4457463328.formulas)
        && Objects.equals(this.queries, geomapBackendRegionsRequest20270101OneOf4457463328.queries)
        && Objects.equals(
            this.responseFormat, geomapBackendRegionsRequest20270101OneOf4457463328.responseFormat)
        && Objects.equals(this.sort, geomapBackendRegionsRequest20270101OneOf4457463328.sort)
        && Objects.equals(this.style, geomapBackendRegionsRequest20270101OneOf4457463328.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionalFormats, formulas, queries, responseFormat, sort, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeomapBackendRegionsRequest20270101OneOf4457463328 {\n");
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
