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

/** The definition of a derived metric as a formula over one or more queries. */
@JsonPropertyOrder({
  DerivedMetricDefinition.JSON_PROPERTY_FORMULA,
  DerivedMetricDefinition.JSON_PROPERTY_QUERIES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DerivedMetricDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FORMULA = "formula";
  private String formula;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<DerivedMetricQuery> queries = new ArrayList<>();

  public DerivedMetricDefinition() {}

  @JsonCreator
  public DerivedMetricDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_FORMULA) String formula,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERIES)
          List<DerivedMetricQuery> queries) {
    this.formula = formula;
    this.queries = queries;
    for (DerivedMetricQuery item : queries) {
      this.unparsed |= item.unparsed;
    }
  }

  public DerivedMetricDefinition formula(String formula) {
    this.formula = formula;
    return this;
  }

  /**
   * The formula that combines the queries into the value of the derived metric.
   *
   * @return formula
   */
  @JsonProperty(JSON_PROPERTY_FORMULA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFormula() {
    return formula;
  }

  public void setFormula(String formula) {
    this.formula = formula;
  }

  public DerivedMetricDefinition queries(List<DerivedMetricQuery> queries) {
    this.queries = queries;
    for (DerivedMetricQuery item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DerivedMetricDefinition addQueriesItem(DerivedMetricQuery queriesItem) {
    this.queries.add(queriesItem);
    this.unparsed |= queriesItem.unparsed;
    return this;
  }

  /**
   * The list of queries referenced by the formula.
   *
   * @return queries
   */
  @JsonProperty(JSON_PROPERTY_QUERIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<DerivedMetricQuery> getQueries() {
    return queries;
  }

  public void setQueries(List<DerivedMetricQuery> queries) {
    this.queries = queries;
    if (queries != null) {
      for (DerivedMetricQuery item : queries) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return DerivedMetricDefinition
   */
  @JsonAnySetter
  public DerivedMetricDefinition putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DerivedMetricDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DerivedMetricDefinition derivedMetricDefinition = (DerivedMetricDefinition) o;
    return Objects.equals(this.formula, derivedMetricDefinition.formula)
        && Objects.equals(this.queries, derivedMetricDefinition.queries)
        && Objects.equals(this.additionalProperties, derivedMetricDefinition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formula, queries, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DerivedMetricDefinition {\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
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
