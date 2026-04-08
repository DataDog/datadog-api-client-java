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

/** SLO count definition using a total events formula alongside a good events formula. */
@JsonPropertyOrder({
  SLOCountDefinitionWithTotalEventsFormula.JSON_PROPERTY_GOOD_EVENTS_FORMULA,
  SLOCountDefinitionWithTotalEventsFormula.JSON_PROPERTY_QUERIES,
  SLOCountDefinitionWithTotalEventsFormula.JSON_PROPERTY_TOTAL_EVENTS_FORMULA
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOCountDefinitionWithTotalEventsFormula {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GOOD_EVENTS_FORMULA = "good_events_formula";
  private SLOFormula goodEventsFormula;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<SLODataSourceQueryDefinition> queries = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL_EVENTS_FORMULA = "total_events_formula";
  private SLOFormula totalEventsFormula;

  public SLOCountDefinitionWithTotalEventsFormula() {}

  @JsonCreator
  public SLOCountDefinitionWithTotalEventsFormula(
      @JsonProperty(required = true, value = JSON_PROPERTY_GOOD_EVENTS_FORMULA)
          SLOFormula goodEventsFormula,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERIES)
          List<SLODataSourceQueryDefinition> queries,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL_EVENTS_FORMULA)
          SLOFormula totalEventsFormula) {
    this.goodEventsFormula = goodEventsFormula;
    this.unparsed |= goodEventsFormula.unparsed;
    this.queries = queries;
    this.totalEventsFormula = totalEventsFormula;
    this.unparsed |= totalEventsFormula.unparsed;
  }

  public SLOCountDefinitionWithTotalEventsFormula goodEventsFormula(SLOFormula goodEventsFormula) {
    this.goodEventsFormula = goodEventsFormula;
    this.unparsed |= goodEventsFormula.unparsed;
    return this;
  }

  /**
   * A formula that specifies how to combine the results of multiple queries.
   *
   * @return goodEventsFormula
   */
  @JsonProperty(JSON_PROPERTY_GOOD_EVENTS_FORMULA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SLOFormula getGoodEventsFormula() {
    return goodEventsFormula;
  }

  public void setGoodEventsFormula(SLOFormula goodEventsFormula) {
    this.goodEventsFormula = goodEventsFormula;
  }

  public SLOCountDefinitionWithTotalEventsFormula queries(
      List<SLODataSourceQueryDefinition> queries) {
    this.queries = queries;
    for (SLODataSourceQueryDefinition item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SLOCountDefinitionWithTotalEventsFormula addQueriesItem(
      SLODataSourceQueryDefinition queriesItem) {
    this.queries.add(queriesItem);
    this.unparsed |= queriesItem.unparsed;
    return this;
  }

  /**
   * Getqueries
   *
   * @return queries
   */
  @JsonProperty(JSON_PROPERTY_QUERIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SLODataSourceQueryDefinition> getQueries() {
    return queries;
  }

  public void setQueries(List<SLODataSourceQueryDefinition> queries) {
    this.queries = queries;
  }

  public SLOCountDefinitionWithTotalEventsFormula totalEventsFormula(
      SLOFormula totalEventsFormula) {
    this.totalEventsFormula = totalEventsFormula;
    this.unparsed |= totalEventsFormula.unparsed;
    return this;
  }

  /**
   * A formula that specifies how to combine the results of multiple queries.
   *
   * @return totalEventsFormula
   */
  @JsonProperty(JSON_PROPERTY_TOTAL_EVENTS_FORMULA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SLOFormula getTotalEventsFormula() {
    return totalEventsFormula;
  }

  public void setTotalEventsFormula(SLOFormula totalEventsFormula) {
    this.totalEventsFormula = totalEventsFormula;
  }

  /** Return true if this SLOCountDefinitionWithTotalEventsFormula object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOCountDefinitionWithTotalEventsFormula sloCountDefinitionWithTotalEventsFormula =
        (SLOCountDefinitionWithTotalEventsFormula) o;
    return Objects.equals(
            this.goodEventsFormula, sloCountDefinitionWithTotalEventsFormula.goodEventsFormula)
        && Objects.equals(this.queries, sloCountDefinitionWithTotalEventsFormula.queries)
        && Objects.equals(
            this.totalEventsFormula, sloCountDefinitionWithTotalEventsFormula.totalEventsFormula);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goodEventsFormula, queries, totalEventsFormula);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOCountDefinitionWithTotalEventsFormula {\n");
    sb.append("    goodEventsFormula: ").append(toIndentedString(goodEventsFormula)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    totalEventsFormula: ").append(toIndentedString(totalEventsFormula)).append("\n");
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
