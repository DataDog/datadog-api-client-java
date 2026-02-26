/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The queries and formula used to calculate the SLI value.</p>
 */
@JsonPropertyOrder({
  SLOTimeSliceQuery.JSON_PROPERTY_FORMULAS,
  SLOTimeSliceQuery.JSON_PROPERTY_QUERIES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOTimeSliceQuery {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FORMULAS = "formulas";
  private List<SLOFormula> formulas = new ArrayList<>();

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<SLODataSourceQueryDefinition> queries = new ArrayList<>();

  public SLOTimeSliceQuery() {}

  @JsonCreator
  public SLOTimeSliceQuery(
            @JsonProperty(required=true, value=JSON_PROPERTY_FORMULAS)List<SLOFormula> formulas,
            @JsonProperty(required=true, value=JSON_PROPERTY_QUERIES)List<SLODataSourceQueryDefinition> queries) {
        this.formulas = formulas;
        this.queries = queries;
  }
  public SLOTimeSliceQuery formulas(List<SLOFormula> formulas) {
    this.formulas = formulas;
    for (SLOFormula item : formulas) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SLOTimeSliceQuery addFormulasItem(SLOFormula formulasItem) {
    this.formulas.add(formulasItem);
    this.unparsed |= formulasItem.unparsed;
    return this;
  }

  /**
   * <p>A list that contains exactly one formula, as only a single formula may be used in a time-slice SLO.</p>
   * @return formulas
  **/
      @JsonProperty(JSON_PROPERTY_FORMULAS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<SLOFormula> getFormulas() {
        return formulas;
      }
  public void setFormulas(List<SLOFormula> formulas) {
    this.formulas = formulas;
  }
  public SLOTimeSliceQuery queries(List<SLODataSourceQueryDefinition> queries) {
    this.queries = queries;
    for (SLODataSourceQueryDefinition item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SLOTimeSliceQuery addQueriesItem(SLODataSourceQueryDefinition queriesItem) {
    this.queries.add(queriesItem);
    this.unparsed |= queriesItem.unparsed;
    return this;
  }

  /**
   * <p>A list of queries that are used to calculate the SLI value.</p>
   * @return queries
  **/
      @JsonProperty(JSON_PROPERTY_QUERIES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<SLODataSourceQueryDefinition> getQueries() {
        return queries;
      }
  public void setQueries(List<SLODataSourceQueryDefinition> queries) {
    this.queries = queries;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SLOTimeSliceQuery
   */
  @JsonAnySetter
  public SLOTimeSliceQuery putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this SLOTimeSliceQuery object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOTimeSliceQuery sloTimeSliceQuery = (SLOTimeSliceQuery) o;
    return Objects.equals(this.formulas, sloTimeSliceQuery.formulas) && Objects.equals(this.queries, sloTimeSliceQuery.queries) && Objects.equals(this.additionalProperties, sloTimeSliceQuery.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(formulas,queries, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOTimeSliceQuery {\n");
    sb.append("    formulas: ").append(toIndentedString(formulas)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
