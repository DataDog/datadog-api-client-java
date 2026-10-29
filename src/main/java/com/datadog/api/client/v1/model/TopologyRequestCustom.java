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

/** Scalar request whose result rows become nodes. */
@JsonPropertyOrder({
  TopologyRequestCustom.JSON_PROPERTY_FORMULAS,
  TopologyRequestCustom.JSON_PROPERTY_PROJECTION,
  TopologyRequestCustom.JSON_PROPERTY_QUERIES,
  TopologyRequestCustom.JSON_PROPERTY_RESPONSE_FORMAT,
  TopologyRequestCustom.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TopologyRequestCustom {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FORMULAS = "formulas";
  private List<WidgetFormula> formulas = null;

  public static final String JSON_PROPERTY_PROJECTION = "projection";
  private TopologyRequestCustomProjection projection;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<FormulaAndFunctionQueryDefinition> queries = new ArrayList<>();

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private TopologyRequestCustomResponseFormat responseFormat =
      TopologyRequestCustomResponseFormat.SCALAR;

  public static final String JSON_PROPERTY_SORT = "sort";
  private WidgetSortBy sort;

  public TopologyRequestCustom() {}

  @JsonCreator
  public TopologyRequestCustom(
      @JsonProperty(required = true, value = JSON_PROPERTY_PROJECTION)
          TopologyRequestCustomProjection projection,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERIES)
          List<FormulaAndFunctionQueryDefinition> queries,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          TopologyRequestCustomResponseFormat responseFormat) {
    this.projection = projection;
    this.unparsed |= projection.unparsed;
    this.queries = queries;
    for (FormulaAndFunctionQueryDefinition item : queries) {
      this.unparsed |= item.unparsed;
    }
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public TopologyRequestCustom formulas(List<WidgetFormula> formulas) {
    this.formulas = formulas;
    if (formulas != null) {
      for (WidgetFormula item : formulas) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public TopologyRequestCustom addFormulasItem(WidgetFormula formulasItem) {
    if (this.formulas == null) {
      this.formulas = new ArrayList<>();
    }
    this.formulas.add(formulasItem);
    this.unparsed |= formulasItem.unparsed;
    return this;
  }

  /**
   * List of formulas that operate on queries.
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

  public TopologyRequestCustom projection(TopologyRequestCustomProjection projection) {
    this.projection = projection;
    this.unparsed |= projection.unparsed;
    return this;
  }

  /**
   * Mapping from result columns to node fields. Each result row feeds one node.
   *
   * @return projection
   */
  @JsonProperty(JSON_PROPERTY_PROJECTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TopologyRequestCustomProjection getProjection() {
    return projection;
  }

  public void setProjection(TopologyRequestCustomProjection projection) {
    this.projection = projection;
    if (projection != null) {
      this.unparsed |= projection.unparsed;
    }
  }

  public TopologyRequestCustom queries(List<FormulaAndFunctionQueryDefinition> queries) {
    this.queries = queries;
    for (FormulaAndFunctionQueryDefinition item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TopologyRequestCustom addQueriesItem(FormulaAndFunctionQueryDefinition queriesItem) {
    this.queries.add(queriesItem);
    this.unparsed |= queriesItem.unparsed;
    return this;
  }

  /**
   * List of queries that can be returned directly or used in formulas.
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

  public TopologyRequestCustom responseFormat(TopologyRequestCustomResponseFormat responseFormat) {
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
    return this;
  }

  /**
   * Response format of a custom topology map request.
   *
   * @return responseFormat
   */
  @JsonProperty(JSON_PROPERTY_RESPONSE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TopologyRequestCustomResponseFormat getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(TopologyRequestCustomResponseFormat responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  public TopologyRequestCustom sort(WidgetSortBy sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * The controls for sorting the widget.
   *
   * @return sort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetSortBy getSort() {
    return sort;
  }

  public void setSort(WidgetSortBy sort) {
    this.sort = sort;
    if (sort != null) {
      this.unparsed |= sort.unparsed;
    }
  }

  /** Return true if this TopologyRequestCustom object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopologyRequestCustom topologyRequestCustom = (TopologyRequestCustom) o;
    return Objects.equals(this.formulas, topologyRequestCustom.formulas)
        && Objects.equals(this.projection, topologyRequestCustom.projection)
        && Objects.equals(this.queries, topologyRequestCustom.queries)
        && Objects.equals(this.responseFormat, topologyRequestCustom.responseFormat)
        && Objects.equals(this.sort, topologyRequestCustom.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formulas, projection, queries, responseFormat, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopologyRequestCustom {\n");
    sb.append("    formulas: ").append(toIndentedString(formulas)).append("\n");
    sb.append("    projection: ").append(toIndentedString(projection)).append("\n");
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
