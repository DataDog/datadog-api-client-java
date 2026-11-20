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
  CustomTopologyMapTileDefRequest.JSON_PROPERTY_FORMULAS,
  CustomTopologyMapTileDefRequest.JSON_PROPERTY_PROJECTION,
  CustomTopologyMapTileDefRequest.JSON_PROPERTY_QUERIES,
  CustomTopologyMapTileDefRequest.JSON_PROPERTY_RESPONSE_FORMAT,
  CustomTopologyMapTileDefRequest.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomTopologyMapTileDefRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FORMULAS = "formulas";
  private List<WidgetFormula> formulas = null;

  public static final String JSON_PROPERTY_PROJECTION = "projection";
  private CustomTopologyMapProjection projection;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<FormulaAndFunctionQueryDefinition> queries = new ArrayList<>();

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private CustomTopologyMapTileDefRequestResponseFormat responseFormat;

  public static final String JSON_PROPERTY_SORT = "sort";
  private ScalarFormulaSort sort;

  public CustomTopologyMapTileDefRequest() {}

  @JsonCreator
  public CustomTopologyMapTileDefRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_PROJECTION)
          CustomTopologyMapProjection projection,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERIES)
          List<FormulaAndFunctionQueryDefinition> queries,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          CustomTopologyMapTileDefRequestResponseFormat responseFormat) {
    this.projection = projection;
    this.unparsed |= projection.unparsed;
    this.queries = queries;
    for (FormulaAndFunctionQueryDefinition item : queries) {
      this.unparsed |= item.unparsed;
    }
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public CustomTopologyMapTileDefRequest formulas(List<WidgetFormula> formulas) {
    this.formulas = formulas;
    if (formulas != null) {
      for (WidgetFormula item : formulas) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public CustomTopologyMapTileDefRequest addFormulasItem(WidgetFormula formulasItem) {
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

  public CustomTopologyMapTileDefRequest projection(CustomTopologyMapProjection projection) {
    this.projection = projection;
    this.unparsed |= projection.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return projection
   */
  @JsonProperty(JSON_PROPERTY_PROJECTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CustomTopologyMapProjection getProjection() {
    return projection;
  }

  public void setProjection(CustomTopologyMapProjection projection) {
    this.projection = projection;
    if (projection != null) {
      this.unparsed |= projection.unparsed;
    }
  }

  public CustomTopologyMapTileDefRequest queries(List<FormulaAndFunctionQueryDefinition> queries) {
    this.queries = queries;
    for (FormulaAndFunctionQueryDefinition item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CustomTopologyMapTileDefRequest addQueriesItem(
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

  public CustomTopologyMapTileDefRequest responseFormat(
      CustomTopologyMapTileDefRequestResponseFormat responseFormat) {
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
  public CustomTopologyMapTileDefRequestResponseFormat getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(CustomTopologyMapTileDefRequestResponseFormat responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  public CustomTopologyMapTileDefRequest sort(ScalarFormulaSort sort) {
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

  /** Return true if this CustomTopologyMapTileDefRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomTopologyMapTileDefRequest customTopologyMapTileDefRequest =
        (CustomTopologyMapTileDefRequest) o;
    return Objects.equals(this.formulas, customTopologyMapTileDefRequest.formulas)
        && Objects.equals(this.projection, customTopologyMapTileDefRequest.projection)
        && Objects.equals(this.queries, customTopologyMapTileDefRequest.queries)
        && Objects.equals(this.responseFormat, customTopologyMapTileDefRequest.responseFormat)
        && Objects.equals(this.sort, customTopologyMapTileDefRequest.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formulas, projection, queries, responseFormat, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomTopologyMapTileDefRequest {\n");
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
