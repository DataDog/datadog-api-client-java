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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Formula evaluated by the timeseries request. */
@JsonPropertyOrder({
  TimeseriesAnomalyInvestigationFormula.JSON_PROPERTY_FORMULA,
  TimeseriesAnomalyInvestigationFormula.JSON_PROPERTY_LIMIT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesAnomalyInvestigationFormula {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FORMULA = "formula";
  private String formula;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private TimeseriesAnomalyInvestigationFormulaLimit limit;

  public TimeseriesAnomalyInvestigationFormula() {}

  @JsonCreator
  public TimeseriesAnomalyInvestigationFormula(
      @JsonProperty(required = true, value = JSON_PROPERTY_FORMULA) String formula) {
    this.formula = formula;
  }

  public TimeseriesAnomalyInvestigationFormula formula(String formula) {
    this.formula = formula;
    return this;
  }

  /**
   * Formula expression referencing one or more named queries.
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

  public TimeseriesAnomalyInvestigationFormula limit(
      TimeseriesAnomalyInvestigationFormulaLimit limit) {
    this.limit = limit;
    this.unparsed |= limit.unparsed;
    return this;
  }

  /**
   * Optional formula limit accepted for compatibility with Timeseries API requests. Formula limits
   * have no effect on timeseries queries.
   *
   * @return limit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TimeseriesAnomalyInvestigationFormulaLimit getLimit() {
    return limit;
  }

  public void setLimit(TimeseriesAnomalyInvestigationFormulaLimit limit) {
    this.limit = limit;
    if (limit != null) {
      this.unparsed |= limit.unparsed;
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
   * @return TimeseriesAnomalyInvestigationFormula
   */
  @JsonAnySetter
  public TimeseriesAnomalyInvestigationFormula putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TimeseriesAnomalyInvestigationFormula object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesAnomalyInvestigationFormula timeseriesAnomalyInvestigationFormula =
        (TimeseriesAnomalyInvestigationFormula) o;
    return Objects.equals(this.formula, timeseriesAnomalyInvestigationFormula.formula)
        && Objects.equals(this.limit, timeseriesAnomalyInvestigationFormula.limit)
        && Objects.equals(
            this.additionalProperties, timeseriesAnomalyInvestigationFormula.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formula, limit, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesAnomalyInvestigationFormula {\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
