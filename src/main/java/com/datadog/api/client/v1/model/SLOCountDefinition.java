/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * A count-based (metric) SLI specification, composed of three parts: the good events formula, the
 * total events formula, and the underlying queries.
 */
@JsonPropertyOrder({
  SLOCountDefinition.JSON_PROPERTY_GOOD_EVENTS_FORMULA,
  SLOCountDefinition.JSON_PROPERTY_QUERIES,
  SLOCountDefinition.JSON_PROPERTY_TOTAL_EVENTS_FORMULA
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOCountDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GOOD_EVENTS_FORMULA = "good_events_formula";
  private SLOFormula goodEventsFormula;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<SLODataSourceQueryDefinition> queries = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL_EVENTS_FORMULA = "total_events_formula";
  private SLOFormula totalEventsFormula;

  public SLOCountDefinition() {}

  @JsonCreator
  public SLOCountDefinition(
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

  public SLOCountDefinition goodEventsFormula(SLOFormula goodEventsFormula) {
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

  public SLOCountDefinition queries(List<SLODataSourceQueryDefinition> queries) {
    this.queries = queries;
    for (SLODataSourceQueryDefinition item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SLOCountDefinition addQueriesItem(SLODataSourceQueryDefinition queriesItem) {
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

  public SLOCountDefinition totalEventsFormula(SLOFormula totalEventsFormula) {
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

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SLOCountDefinition
   */
  @JsonAnySetter
  public SLOCountDefinition putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this SLOCountDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOCountDefinition sloCountDefinition = (SLOCountDefinition) o;
    return Objects.equals(this.goodEventsFormula, sloCountDefinition.goodEventsFormula)
        && Objects.equals(this.queries, sloCountDefinition.queries)
        && Objects.equals(this.totalEventsFormula, sloCountDefinition.totalEventsFormula)
        && Objects.equals(this.additionalProperties, sloCountDefinition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goodEventsFormula, queries, totalEventsFormula, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOCountDefinition {\n");
    sb.append("    goodEventsFormula: ").append(toIndentedString(goodEventsFormula)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    totalEventsFormula: ").append(toIndentedString(totalEventsFormula)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
