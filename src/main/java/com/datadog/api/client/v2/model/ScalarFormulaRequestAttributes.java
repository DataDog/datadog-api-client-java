/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The object describing a scalar formula request. */
@JsonPropertyOrder({
  ScalarFormulaRequestAttributes.JSON_PROPERTY_FORMULAS,
  ScalarFormulaRequestAttributes.JSON_PROPERTY_FROM,
  ScalarFormulaRequestAttributes.JSON_PROPERTY_QUERIES,
  ScalarFormulaRequestAttributes.JSON_PROPERTY_TO
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScalarFormulaRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FORMULAS = "formulas";
  private List<QueryFormula> formulas = null;

  public static final String JSON_PROPERTY_FROM = "from";
  private Long from;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<ScalarQuery> queries = new ArrayList<>();

  public static final String JSON_PROPERTY_TO = "to";
  private Long to;

  public ScalarFormulaRequestAttributes() {}

  @JsonCreator
  public ScalarFormulaRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FROM) Long from,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERIES) List<ScalarQuery> queries,
      @JsonProperty(required = true, value = JSON_PROPERTY_TO) Long to) {
    this.from = from;
    this.queries = queries;
    this.to = to;
  }

  public ScalarFormulaRequestAttributes formulas(List<QueryFormula> formulas) {
    this.formulas = formulas;
    for (QueryFormula item : formulas) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ScalarFormulaRequestAttributes addFormulasItem(QueryFormula formulasItem) {
    if (this.formulas == null) {
      this.formulas = new ArrayList<>();
    }
    this.formulas.add(formulasItem);
    this.unparsed |= formulasItem.unparsed;
    return this;
  }

  /**
   * List of formulas to be calculated and returned as responses.
   *
   * @return formulas
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORMULAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<QueryFormula> getFormulas() {
    return formulas;
  }

  public void setFormulas(List<QueryFormula> formulas) {
    this.formulas = formulas;
  }

  public ScalarFormulaRequestAttributes from(Long from) {
    this.from = from;
    return this;
  }

  /**
   * Start date (inclusive) of the query in milliseconds since the Unix epoch.
   *
   * @return from
   */
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFrom() {
    return from;
  }

  public void setFrom(Long from) {
    this.from = from;
  }

  public ScalarFormulaRequestAttributes queries(List<ScalarQuery> queries) {
    this.queries = queries;
    for (ScalarQuery item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ScalarFormulaRequestAttributes addQueriesItem(ScalarQuery queriesItem) {
    this.queries.add(queriesItem);
    this.unparsed |= queriesItem.unparsed;
    return this;
  }

  /**
   * List of queries to be run and used as inputs to the formulas.
   *
   * @return queries
   */
  @JsonProperty(JSON_PROPERTY_QUERIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ScalarQuery> getQueries() {
    return queries;
  }

  public void setQueries(List<ScalarQuery> queries) {
    this.queries = queries;
  }

  public ScalarFormulaRequestAttributes to(Long to) {
    this.to = to;
    return this;
  }

  /**
   * End date (exclusive) of the query in milliseconds since the Unix epoch.
   *
   * @return to
   */
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTo() {
    return to;
  }

  public void setTo(Long to) {
    this.to = to;
  }

  /** Return true if this ScalarFormulaRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScalarFormulaRequestAttributes scalarFormulaRequestAttributes =
        (ScalarFormulaRequestAttributes) o;
    return Objects.equals(this.formulas, scalarFormulaRequestAttributes.formulas)
        && Objects.equals(this.from, scalarFormulaRequestAttributes.from)
        && Objects.equals(this.queries, scalarFormulaRequestAttributes.queries)
        && Objects.equals(this.to, scalarFormulaRequestAttributes.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formulas, from, queries, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScalarFormulaRequestAttributes {\n");
    sb.append("    formulas: ").append(toIndentedString(formulas)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("}");
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
