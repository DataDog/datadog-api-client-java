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
  ScatterplotBackendTableRequest20270101OneOf4461524480.JSON_PROPERTY_FORMULAS,
  ScatterplotBackendTableRequest20270101OneOf4461524480.JSON_PROPERTY_QUERIES,
  ScatterplotBackendTableRequest20270101OneOf4461524480.JSON_PROPERTY_RESPONSE_FORMAT,
  ScatterplotBackendTableRequest20270101OneOf4461524480.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScatterplotBackendTableRequest20270101OneOf4461524480 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FORMULAS = "formulas";
  private List<ScatterplotFormula> formulas = new ArrayList<>();

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<FormulaAndFunctionQueryDefinition> queries = new ArrayList<>();

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451371744 responseFormat;

  public static final String JSON_PROPERTY_SORT = "sort";
  private ScalarFormulaSort sort;

  public ScatterplotBackendTableRequest20270101OneOf4461524480() {}

  @JsonCreator
  public ScatterplotBackendTableRequest20270101OneOf4461524480(
      @JsonProperty(required = true, value = JSON_PROPERTY_FORMULAS)
          List<ScatterplotFormula> formulas,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERIES)
          List<FormulaAndFunctionQueryDefinition> queries,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451371744 responseFormat) {
    this.formulas = formulas;
    for (ScatterplotFormula item : formulas) {
      this.unparsed |= item.unparsed;
    }
    this.queries = queries;
    for (FormulaAndFunctionQueryDefinition item : queries) {
      this.unparsed |= item.unparsed;
    }
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public ScatterplotBackendTableRequest20270101OneOf4461524480 formulas(
      List<ScatterplotFormula> formulas) {
    this.formulas = formulas;
    for (ScatterplotFormula item : formulas) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ScatterplotBackendTableRequest20270101OneOf4461524480 addFormulasItem(
      ScatterplotFormula formulasItem) {
    this.formulas.add(formulasItem);
    this.unparsed |= formulasItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return formulas
   */
  @JsonProperty(JSON_PROPERTY_FORMULAS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ScatterplotFormula> getFormulas() {
    return formulas;
  }

  public void setFormulas(List<ScatterplotFormula> formulas) {
    this.formulas = formulas;
    if (formulas != null) {
      for (ScatterplotFormula item : formulas) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ScatterplotBackendTableRequest20270101OneOf4461524480 queries(
      List<FormulaAndFunctionQueryDefinition> queries) {
    this.queries = queries;
    for (FormulaAndFunctionQueryDefinition item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ScatterplotBackendTableRequest20270101OneOf4461524480 addQueriesItem(
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

  public ScatterplotBackendTableRequest20270101OneOf4461524480 responseFormat(
      ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451371744 responseFormat) {
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
  public ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451371744 getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(
      ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451371744 responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  public ScatterplotBackendTableRequest20270101OneOf4461524480 sort(ScalarFormulaSort sort) {
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

  /**
   * Return true if this ScatterplotBackendTableRequest20270101OneOf4461524480 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScatterplotBackendTableRequest20270101OneOf4461524480
        scatterplotBackendTableRequest20270101OneOf4461524480 =
            (ScatterplotBackendTableRequest20270101OneOf4461524480) o;
    return Objects.equals(
            this.formulas, scatterplotBackendTableRequest20270101OneOf4461524480.formulas)
        && Objects.equals(
            this.queries, scatterplotBackendTableRequest20270101OneOf4461524480.queries)
        && Objects.equals(
            this.responseFormat,
            scatterplotBackendTableRequest20270101OneOf4461524480.responseFormat)
        && Objects.equals(this.sort, scatterplotBackendTableRequest20270101OneOf4461524480.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formulas, queries, responseFormat, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScatterplotBackendTableRequest20270101OneOf4461524480 {\n");
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
