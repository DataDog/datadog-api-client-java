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
 * Scalar formula request for the infrastructure host map widget. Each formula specifies which
 * visual dimension it drives.
 */
@JsonPropertyOrder({
  HostMapWidgetScalarRequest.JSON_PROPERTY_FORMULAS,
  HostMapWidgetScalarRequest.JSON_PROPERTY_QUERIES,
  HostMapWidgetScalarRequest.JSON_PROPERTY_RESPONSE_FORMAT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HostMapWidgetScalarRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FORMULAS = "formulas";
  private List<HostMapWidgetFormula> formulas = new ArrayList<>();

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<FormulaAndFunctionQueryDefinition> queries = new ArrayList<>();

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private HostMapWidgetScalarRequestResponseFormat responseFormat;

  public HostMapWidgetScalarRequest() {}

  @JsonCreator
  public HostMapWidgetScalarRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_FORMULAS)
          List<HostMapWidgetFormula> formulas,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERIES)
          List<FormulaAndFunctionQueryDefinition> queries,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          HostMapWidgetScalarRequestResponseFormat responseFormat) {
    this.formulas = formulas;
    this.queries = queries;
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public HostMapWidgetScalarRequest formulas(List<HostMapWidgetFormula> formulas) {
    this.formulas = formulas;
    for (HostMapWidgetFormula item : formulas) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public HostMapWidgetScalarRequest addFormulasItem(HostMapWidgetFormula formulasItem) {
    this.formulas.add(formulasItem);
    this.unparsed |= formulasItem.unparsed;
    return this;
  }

  /**
   * List of formulas that operate on queries, each assigned to a visual dimension.
   *
   * @return formulas
   */
  @JsonProperty(JSON_PROPERTY_FORMULAS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<HostMapWidgetFormula> getFormulas() {
    return formulas;
  }

  public void setFormulas(List<HostMapWidgetFormula> formulas) {
    this.formulas = formulas;
  }

  public HostMapWidgetScalarRequest queries(List<FormulaAndFunctionQueryDefinition> queries) {
    this.queries = queries;
    for (FormulaAndFunctionQueryDefinition item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public HostMapWidgetScalarRequest addQueriesItem(FormulaAndFunctionQueryDefinition queriesItem) {
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
  }

  public HostMapWidgetScalarRequest responseFormat(
      HostMapWidgetScalarRequestResponseFormat responseFormat) {
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
    return this;
  }

  /**
   * Response format for the scalar formula request. Only <code>scalar</code> is supported.
   *
   * @return responseFormat
   */
  @JsonProperty(JSON_PROPERTY_RESPONSE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HostMapWidgetScalarRequestResponseFormat getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(HostMapWidgetScalarRequestResponseFormat responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
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
   * @return HostMapWidgetScalarRequest
   */
  @JsonAnySetter
  public HostMapWidgetScalarRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this HostMapWidgetScalarRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostMapWidgetScalarRequest hostMapWidgetScalarRequest = (HostMapWidgetScalarRequest) o;
    return Objects.equals(this.formulas, hostMapWidgetScalarRequest.formulas)
        && Objects.equals(this.queries, hostMapWidgetScalarRequest.queries)
        && Objects.equals(this.responseFormat, hostMapWidgetScalarRequest.responseFormat)
        && Objects.equals(
            this.additionalProperties, hostMapWidgetScalarRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formulas, queries, responseFormat, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostMapWidgetScalarRequest {\n");
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
