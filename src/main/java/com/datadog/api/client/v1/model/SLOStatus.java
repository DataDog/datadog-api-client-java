/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Status of the SLO's primary timeframe. */
@JsonPropertyOrder({
  SLOStatus.JSON_PROPERTY_CALCULATION_ERROR,
  SLOStatus.JSON_PROPERTY_ERROR_BUDGET_REMAINING,
  SLOStatus.JSON_PROPERTY_INDEXED_AT,
  SLOStatus.JSON_PROPERTY_RAW_ERROR_BUDGET_REMAINING,
  SLOStatus.JSON_PROPERTY_SLI,
  SLOStatus.JSON_PROPERTY_SPAN_PRECISION,
  SLOStatus.JSON_PROPERTY_STATE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOStatus {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CALCULATION_ERROR = "calculation_error";
  private JsonNullable<String> calculationError = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ERROR_BUDGET_REMAINING = "error_budget_remaining";
  private JsonNullable<Double> errorBudgetRemaining = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_INDEXED_AT = "indexed_at";
  private Long indexedAt;

  public static final String JSON_PROPERTY_RAW_ERROR_BUDGET_REMAINING =
      "raw_error_budget_remaining";
  private JsonNullable<SLORawErrorBudgetRemaining> rawErrorBudgetRemaining =
      JsonNullable.<SLORawErrorBudgetRemaining>undefined();

  public static final String JSON_PROPERTY_SLI = "sli";
  private JsonNullable<Double> sli = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_SPAN_PRECISION = "span_precision";
  private JsonNullable<Long> spanPrecision = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_STATE = "state";
  private SLOState state;

  public SLOStatus calculationError(String calculationError) {
    this.calculationError = JsonNullable.<String>of(calculationError);
    return this;
  }

  /**
   * Error message if SLO status or error budget could not be calculated.
   *
   * @return calculationError
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getCalculationError() {
    return calculationError.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CALCULATION_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCalculationError_JsonNullable() {
    return calculationError;
  }

  @JsonProperty(JSON_PROPERTY_CALCULATION_ERROR)
  public void setCalculationError_JsonNullable(JsonNullable<String> calculationError) {
    this.calculationError = calculationError;
  }

  public void setCalculationError(String calculationError) {
    this.calculationError = JsonNullable.<String>of(calculationError);
  }

  public SLOStatus errorBudgetRemaining(Double errorBudgetRemaining) {
    this.errorBudgetRemaining = JsonNullable.<Double>of(errorBudgetRemaining);
    return this;
  }

  /**
   * Remaining error budget of the SLO in percentage.
   *
   * @return errorBudgetRemaining
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getErrorBudgetRemaining() {
    return errorBudgetRemaining.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERROR_BUDGET_REMAINING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getErrorBudgetRemaining_JsonNullable() {
    return errorBudgetRemaining;
  }

  @JsonProperty(JSON_PROPERTY_ERROR_BUDGET_REMAINING)
  public void setErrorBudgetRemaining_JsonNullable(JsonNullable<Double> errorBudgetRemaining) {
    this.errorBudgetRemaining = errorBudgetRemaining;
  }

  public void setErrorBudgetRemaining(Double errorBudgetRemaining) {
    this.errorBudgetRemaining = JsonNullable.<Double>of(errorBudgetRemaining);
  }

  public SLOStatus indexedAt(Long indexedAt) {
    this.indexedAt = indexedAt;
    return this;
  }

  /**
   * timestamp (UNIX time in seconds) of when the SLO status and error budget were calculated.
   *
   * @return indexedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEXED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIndexedAt() {
    return indexedAt;
  }

  public void setIndexedAt(Long indexedAt) {
    this.indexedAt = indexedAt;
  }

  public SLOStatus rawErrorBudgetRemaining(SLORawErrorBudgetRemaining rawErrorBudgetRemaining) {
    this.rawErrorBudgetRemaining =
        JsonNullable.<SLORawErrorBudgetRemaining>of(rawErrorBudgetRemaining);
    return this;
  }

  /**
   * Error budget remaining for an SLO.
   *
   * @return rawErrorBudgetRemaining
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public SLORawErrorBudgetRemaining getRawErrorBudgetRemaining() {
    return rawErrorBudgetRemaining.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RAW_ERROR_BUDGET_REMAINING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<SLORawErrorBudgetRemaining> getRawErrorBudgetRemaining_JsonNullable() {
    return rawErrorBudgetRemaining;
  }

  @JsonProperty(JSON_PROPERTY_RAW_ERROR_BUDGET_REMAINING)
  public void setRawErrorBudgetRemaining_JsonNullable(
      JsonNullable<SLORawErrorBudgetRemaining> rawErrorBudgetRemaining) {
    this.rawErrorBudgetRemaining = rawErrorBudgetRemaining;
  }

  public void setRawErrorBudgetRemaining(SLORawErrorBudgetRemaining rawErrorBudgetRemaining) {
    this.rawErrorBudgetRemaining =
        JsonNullable.<SLORawErrorBudgetRemaining>of(rawErrorBudgetRemaining);
  }

  public SLOStatus sli(Double sli) {
    this.sli = JsonNullable.<Double>of(sli);
    return this;
  }

  /**
   * The current service level indicator (SLI) of the SLO, also known as 'status'. This is a
   * percentage value from 0-100 (inclusive).
   *
   * @return sli
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getSli() {
    return sli.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SLI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getSli_JsonNullable() {
    return sli;
  }

  @JsonProperty(JSON_PROPERTY_SLI)
  public void setSli_JsonNullable(JsonNullable<Double> sli) {
    this.sli = sli;
  }

  public void setSli(Double sli) {
    this.sli = JsonNullable.<Double>of(sli);
  }

  public SLOStatus spanPrecision(Long spanPrecision) {
    this.spanPrecision = JsonNullable.<Long>of(spanPrecision);
    return this;
  }

  /**
   * The number of decimal places the SLI value is accurate to.
   *
   * @return spanPrecision
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getSpanPrecision() {
    return spanPrecision.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SPAN_PRECISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getSpanPrecision_JsonNullable() {
    return spanPrecision;
  }

  @JsonProperty(JSON_PROPERTY_SPAN_PRECISION)
  public void setSpanPrecision_JsonNullable(JsonNullable<Long> spanPrecision) {
    this.spanPrecision = spanPrecision;
  }

  public void setSpanPrecision(Long spanPrecision) {
    this.spanPrecision = JsonNullable.<Long>of(spanPrecision);
  }

  public SLOStatus state(SLOState state) {
    this.state = state;
    this.unparsed |= !state.isValid();
    return this;
  }

  /**
   * State of the SLO.
   *
   * @return state
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SLOState getState() {
    return state;
  }

  public void setState(SLOState state) {
    if (!state.isValid()) {
      this.unparsed = true;
    }
    this.state = state;
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
   * @return SLOStatus
   */
  @JsonAnySetter
  public SLOStatus putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SLOStatus object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOStatus sloStatus = (SLOStatus) o;
    return Objects.equals(this.calculationError, sloStatus.calculationError)
        && Objects.equals(this.errorBudgetRemaining, sloStatus.errorBudgetRemaining)
        && Objects.equals(this.indexedAt, sloStatus.indexedAt)
        && Objects.equals(this.rawErrorBudgetRemaining, sloStatus.rawErrorBudgetRemaining)
        && Objects.equals(this.sli, sloStatus.sli)
        && Objects.equals(this.spanPrecision, sloStatus.spanPrecision)
        && Objects.equals(this.state, sloStatus.state)
        && Objects.equals(this.additionalProperties, sloStatus.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        calculationError,
        errorBudgetRemaining,
        indexedAt,
        rawErrorBudgetRemaining,
        sli,
        spanPrecision,
        state,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOStatus {\n");
    sb.append("    calculationError: ").append(toIndentedString(calculationError)).append("\n");
    sb.append("    errorBudgetRemaining: ")
        .append(toIndentedString(errorBudgetRemaining))
        .append("\n");
    sb.append("    indexedAt: ").append(toIndentedString(indexedAt)).append("\n");
    sb.append("    rawErrorBudgetRemaining: ")
        .append(toIndentedString(rawErrorBudgetRemaining))
        .append("\n");
    sb.append("    sli: ").append(toIndentedString(sli)).append("\n");
    sb.append("    spanPrecision: ").append(toIndentedString(spanPrecision)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
