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
   * <p>Scatterplot request containing formulas and functions.</p>
 */
@JsonPropertyOrder({
  ScatterplotTableRequest.JSON_PROPERTY_FORMULAS,
  ScatterplotTableRequest.JSON_PROPERTY_QUERIES,
  ScatterplotTableRequest.JSON_PROPERTY_RESPONSE_FORMAT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScatterplotTableRequest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FORMULAS = "formulas";
  private List<ScatterplotWidgetFormula> formulas = null;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<FormulaAndFunctionQueryDefinition> queries = null;

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private FormulaAndFunctionResponseFormat responseFormat;

  public ScatterplotTableRequest formulas(List<ScatterplotWidgetFormula> formulas) {
    this.formulas = formulas;
    for (ScatterplotWidgetFormula item : formulas) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ScatterplotTableRequest addFormulasItem(ScatterplotWidgetFormula formulasItem) {
    if (this.formulas == null) {
      this.formulas = new ArrayList<>();
    }
    this.formulas.add(formulasItem);
    this.unparsed |= formulasItem.unparsed;
    return this;
  }

  /**
   * <p>List of Scatterplot formulas that operate on queries.</p>
   * @return formulas
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FORMULAS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ScatterplotWidgetFormula> getFormulas() {
        return formulas;
      }
  public void setFormulas(List<ScatterplotWidgetFormula> formulas) {
    this.formulas = formulas;
  }
  public ScatterplotTableRequest queries(List<FormulaAndFunctionQueryDefinition> queries) {
    this.queries = queries;
    for (FormulaAndFunctionQueryDefinition item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ScatterplotTableRequest addQueriesItem(FormulaAndFunctionQueryDefinition queriesItem) {
    if (this.queries == null) {
      this.queries = new ArrayList<>();
    }
    this.queries.add(queriesItem);
    this.unparsed |= queriesItem.unparsed;
    return this;
  }

  /**
   * <p>List of queries that can be returned directly or used in formulas.</p>
   * @return queries
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_QUERIES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<FormulaAndFunctionQueryDefinition> getQueries() {
        return queries;
      }
  public void setQueries(List<FormulaAndFunctionQueryDefinition> queries) {
    this.queries = queries;
  }
  public ScatterplotTableRequest responseFormat(FormulaAndFunctionResponseFormat responseFormat) {
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
    return this;
  }

  /**
   * <p>Timeseries, scalar, or event list response. Event list response formats are supported by Geomap widgets.</p>
   * @return responseFormat
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESPONSE_FORMAT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public FormulaAndFunctionResponseFormat getResponseFormat() {
        return responseFormat;
      }
  public void setResponseFormat(FormulaAndFunctionResponseFormat responseFormat) {
    if (!responseFormat.isValid()) {
        this.unparsed = true;
    }
    this.responseFormat = responseFormat;
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
   * @return ScatterplotTableRequest
   */
  @JsonAnySetter
  public ScatterplotTableRequest putAdditionalProperty(String key, Object value) {
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
   * Return true if this ScatterplotTableRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScatterplotTableRequest scatterplotTableRequest = (ScatterplotTableRequest) o;
    return Objects.equals(this.formulas, scatterplotTableRequest.formulas) && Objects.equals(this.queries, scatterplotTableRequest.queries) && Objects.equals(this.responseFormat, scatterplotTableRequest.responseFormat) && Objects.equals(this.additionalProperties, scatterplotTableRequest.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(formulas,queries,responseFormat, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScatterplotTableRequest {\n");
    sb.append("    formulas: ").append(toIndentedString(formulas)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
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
