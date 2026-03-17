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

/** */
@JsonPropertyOrder({
  SLOCountDefinitionWithBadEventsFormula.JSON_PROPERTY_BAD_EVENTS_FORMULA,
  SLOCountDefinitionWithBadEventsFormula.JSON_PROPERTY_GOOD_EVENTS_FORMULA,
  SLOCountDefinitionWithBadEventsFormula.JSON_PROPERTY_QUERIES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOCountDefinitionWithBadEventsFormula {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BAD_EVENTS_FORMULA = "bad_events_formula";
  private SLOFormula badEventsFormula;

  public static final String JSON_PROPERTY_GOOD_EVENTS_FORMULA = "good_events_formula";
  private SLOFormula goodEventsFormula;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<SLODataSourceQueryDefinition> queries = new ArrayList<>();

  public SLOCountDefinitionWithBadEventsFormula() {}

  @JsonCreator
  public SLOCountDefinitionWithBadEventsFormula(
      @JsonProperty(required = true, value = JSON_PROPERTY_BAD_EVENTS_FORMULA)
          SLOFormula badEventsFormula,
      @JsonProperty(required = true, value = JSON_PROPERTY_GOOD_EVENTS_FORMULA)
          SLOFormula goodEventsFormula,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERIES)
          List<SLODataSourceQueryDefinition> queries) {
    this.badEventsFormula = badEventsFormula;
    this.unparsed |= badEventsFormula.unparsed;
    this.goodEventsFormula = goodEventsFormula;
    this.unparsed |= goodEventsFormula.unparsed;
    this.queries = queries;
  }

  public SLOCountDefinitionWithBadEventsFormula badEventsFormula(SLOFormula badEventsFormula) {
    this.badEventsFormula = badEventsFormula;
    this.unparsed |= badEventsFormula.unparsed;
    return this;
  }

  /**
   * A formula that specifies how to combine the results of multiple queries.
   *
   * @return badEventsFormula
   */
  @JsonProperty(JSON_PROPERTY_BAD_EVENTS_FORMULA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SLOFormula getBadEventsFormula() {
    return badEventsFormula;
  }

  public void setBadEventsFormula(SLOFormula badEventsFormula) {
    this.badEventsFormula = badEventsFormula;
  }

  public SLOCountDefinitionWithBadEventsFormula goodEventsFormula(SLOFormula goodEventsFormula) {
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

  public SLOCountDefinitionWithBadEventsFormula queries(
      List<SLODataSourceQueryDefinition> queries) {
    this.queries = queries;
    for (SLODataSourceQueryDefinition item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SLOCountDefinitionWithBadEventsFormula addQueriesItem(
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

  /** Return true if this SLOCountDefinitionWithBadEventsFormula object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOCountDefinitionWithBadEventsFormula sloCountDefinitionWithBadEventsFormula =
        (SLOCountDefinitionWithBadEventsFormula) o;
    return Objects.equals(
            this.badEventsFormula, sloCountDefinitionWithBadEventsFormula.badEventsFormula)
        && Objects.equals(
            this.goodEventsFormula, sloCountDefinitionWithBadEventsFormula.goodEventsFormula)
        && Objects.equals(this.queries, sloCountDefinitionWithBadEventsFormula.queries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(badEventsFormula, goodEventsFormula, queries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOCountDefinitionWithBadEventsFormula {\n");
    sb.append("    badEventsFormula: ").append(toIndentedString(badEventsFormula)).append("\n");
    sb.append("    goodEventsFormula: ").append(toIndentedString(goodEventsFormula)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
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
