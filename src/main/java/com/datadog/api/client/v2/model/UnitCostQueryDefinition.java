/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** A timeseries object containing <code>queries</code> and <code>formulas</code> arrays. */
@JsonPropertyOrder({
  UnitCostQueryDefinition.JSON_PROPERTY_FORMULAS,
  UnitCostQueryDefinition.JSON_PROPERTY_QUERIES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UnitCostQueryDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FORMULAS = "formulas";
  private List<Map<String, Object>> formulas = new ArrayList<>();

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<Map<String, Object>> queries = new ArrayList<>();

  public UnitCostQueryDefinition() {}

  @JsonCreator
  public UnitCostQueryDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_FORMULAS)
          List<Map<String, Object>> formulas,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERIES)
          List<Map<String, Object>> queries) {
    this.formulas = formulas;
    this.queries = queries;
  }

  public UnitCostQueryDefinition formulas(List<Map<String, Object>> formulas) {
    this.formulas = formulas;
    return this;
  }

  public UnitCostQueryDefinition addFormulasItem(Map<String, Object> formulasItem) {
    this.formulas.add(formulasItem);
    return this;
  }

  /**
   * The list of formulas applied to the queries for this side of the ratio.
   *
   * @return formulas
   */
  @JsonProperty(JSON_PROPERTY_FORMULAS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Map<String, Object>> getFormulas() {
    return formulas;
  }

  public void setFormulas(List<Map<String, Object>> formulas) {
    this.formulas = formulas;
  }

  public UnitCostQueryDefinition queries(List<Map<String, Object>> queries) {
    this.queries = queries;
    return this;
  }

  public UnitCostQueryDefinition addQueriesItem(Map<String, Object> queriesItem) {
    this.queries.add(queriesItem);
    return this;
  }

  /**
   * The list of queries evaluated for this side of the ratio.
   *
   * @return queries
   */
  @JsonProperty(JSON_PROPERTY_QUERIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Map<String, Object>> getQueries() {
    return queries;
  }

  public void setQueries(List<Map<String, Object>> queries) {
    this.queries = queries;
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
   * @return UnitCostQueryDefinition
   */
  @JsonAnySetter
  public UnitCostQueryDefinition putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UnitCostQueryDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnitCostQueryDefinition unitCostQueryDefinition = (UnitCostQueryDefinition) o;
    return Objects.equals(this.formulas, unitCostQueryDefinition.formulas)
        && Objects.equals(this.queries, unitCostQueryDefinition.queries)
        && Objects.equals(this.additionalProperties, unitCostQueryDefinition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formulas, queries, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnitCostQueryDefinition {\n");
    sb.append("    formulas: ").append(toIndentedString(formulas)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
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
