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
   * <p>Overall status of the SLO by timeframes.</p>
 */
@JsonPropertyOrder({
  SLOOverallStatuses.JSON_PROPERTY_ERROR,
  SLOOverallStatuses.JSON_PROPERTY_ERROR_BUDGET_REMAINING,
  SLOOverallStatuses.JSON_PROPERTY_INDEXED_AT,
  SLOOverallStatuses.JSON_PROPERTY_RAW_ERROR_BUDGET_REMAINING,
  SLOOverallStatuses.JSON_PROPERTY_SPAN_PRECISION,
  SLOOverallStatuses.JSON_PROPERTY_STATE,
  SLOOverallStatuses.JSON_PROPERTY_STATUS,
  SLOOverallStatuses.JSON_PROPERTY_TARGET,
  SLOOverallStatuses.JSON_PROPERTY_TIMEFRAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOOverallStatuses {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERROR = "error";
  private JsonNullable<String> error = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ERROR_BUDGET_REMAINING = "error_budget_remaining";
  private JsonNullable<Double> errorBudgetRemaining = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_INDEXED_AT = "indexed_at";
  private Long indexedAt;

  public static final String JSON_PROPERTY_RAW_ERROR_BUDGET_REMAINING = "raw_error_budget_remaining";
  private JsonNullable<SLORawErrorBudgetRemaining> rawErrorBudgetRemaining = JsonNullable.<SLORawErrorBudgetRemaining>undefined();

  public static final String JSON_PROPERTY_SPAN_PRECISION = "span_precision";
  private JsonNullable<Long> spanPrecision = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_STATE = "state";
  private SLOState state;

  public static final String JSON_PROPERTY_STATUS = "status";
  private JsonNullable<Double> status = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_TARGET = "target";
  private Double target;

  public static final String JSON_PROPERTY_TIMEFRAME = "timeframe";
  private SLOTimeframe timeframe;

  public SLOOverallStatuses error(String error) {
    this.error = JsonNullable.<String>of(error);
    return this;
  }

  /**
   * <p>Error message if SLO status or error budget could not be calculated.</p>
   * @return error
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getError() {
        return error.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getError_JsonNullable() {
    return error;
  }
  @JsonProperty(JSON_PROPERTY_ERROR)public void setError_JsonNullable(JsonNullable<String> error) {
    this.error = error;
  }
  public void setError(String error) {
    this.error = JsonNullable.<String>of(error);
  }
  public SLOOverallStatuses errorBudgetRemaining(Double errorBudgetRemaining) {
    this.errorBudgetRemaining = JsonNullable.<Double>of(errorBudgetRemaining);
    return this;
  }

  /**
   * <p>Remaining error budget of the SLO in percentage.</p>
   * @return errorBudgetRemaining
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Double getErrorBudgetRemaining() {
        return errorBudgetRemaining.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_ERROR_BUDGET_REMAINING)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getErrorBudgetRemaining_JsonNullable() {
    return errorBudgetRemaining;
  }
  @JsonProperty(JSON_PROPERTY_ERROR_BUDGET_REMAINING)public void setErrorBudgetRemaining_JsonNullable(JsonNullable<Double> errorBudgetRemaining) {
    this.errorBudgetRemaining = errorBudgetRemaining;
  }
  public void setErrorBudgetRemaining(Double errorBudgetRemaining) {
    this.errorBudgetRemaining = JsonNullable.<Double>of(errorBudgetRemaining);
  }
  public SLOOverallStatuses indexedAt(Long indexedAt) {
    this.indexedAt = indexedAt;
    return this;
  }

  /**
   * <p>timestamp (UNIX time in seconds) of when the SLO status and error budget
   * were calculated.</p>
   * @return indexedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INDEXED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getIndexedAt() {
        return indexedAt;
      }
  public void setIndexedAt(Long indexedAt) {
    this.indexedAt = indexedAt;
  }
  public SLOOverallStatuses rawErrorBudgetRemaining(SLORawErrorBudgetRemaining rawErrorBudgetRemaining) {
    this.rawErrorBudgetRemaining = JsonNullable.<SLORawErrorBudgetRemaining>of(rawErrorBudgetRemaining);
    return this;
  }

  /**
   * <p>Error budget remaining for an SLO.</p>
   * @return rawErrorBudgetRemaining
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public SLORawErrorBudgetRemaining getRawErrorBudgetRemaining() {
        return rawErrorBudgetRemaining.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_RAW_ERROR_BUDGET_REMAINING)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<SLORawErrorBudgetRemaining> getRawErrorBudgetRemaining_JsonNullable() {
    return rawErrorBudgetRemaining;
  }
  @JsonProperty(JSON_PROPERTY_RAW_ERROR_BUDGET_REMAINING)public void setRawErrorBudgetRemaining_JsonNullable(JsonNullable<SLORawErrorBudgetRemaining> rawErrorBudgetRemaining) {
    this.rawErrorBudgetRemaining = rawErrorBudgetRemaining;
  }
  public void setRawErrorBudgetRemaining(SLORawErrorBudgetRemaining rawErrorBudgetRemaining) {
    this.rawErrorBudgetRemaining = JsonNullable.<SLORawErrorBudgetRemaining>of(rawErrorBudgetRemaining);
  }
  public SLOOverallStatuses spanPrecision(Long spanPrecision) {
    this.spanPrecision = JsonNullable.<Long>of(spanPrecision);
    return this;
  }

  /**
   * <p>The amount of decimal places the SLI value is accurate to.</p>
   * @return spanPrecision
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getSpanPrecision() {
        return spanPrecision.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_SPAN_PRECISION)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getSpanPrecision_JsonNullable() {
    return spanPrecision;
  }
  @JsonProperty(JSON_PROPERTY_SPAN_PRECISION)public void setSpanPrecision_JsonNullable(JsonNullable<Long> spanPrecision) {
    this.spanPrecision = spanPrecision;
  }
  public void setSpanPrecision(Long spanPrecision) {
    this.spanPrecision = JsonNullable.<Long>of(spanPrecision);
  }
  public SLOOverallStatuses state(SLOState state) {
    this.state = state;
    this.unparsed |= !state.isValid();
    return this;
  }

  /**
   * <p>State of the SLO.</p>
   * @return state
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SLOState getState() {
        return state;
      }
  public void setState(SLOState state) {
    if (!state.isValid()) {
        this.unparsed = true;
    }
    this.state = state;
  }
  public SLOOverallStatuses status(Double status) {
    this.status = JsonNullable.<Double>of(status);
    return this;
  }

  /**
   * <p>The status of the SLO.</p>
   * @return status
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Double getStatus() {
        return status.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getStatus_JsonNullable() {
    return status;
  }
  @JsonProperty(JSON_PROPERTY_STATUS)public void setStatus_JsonNullable(JsonNullable<Double> status) {
    this.status = status;
  }
  public void setStatus(Double status) {
    this.status = JsonNullable.<Double>of(status);
  }
  public SLOOverallStatuses target(Double target) {
    this.target = target;
    return this;
  }

  /**
   * <p>The target of the SLO.</p>
   * @return target
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TARGET)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getTarget() {
        return target;
      }
  public void setTarget(Double target) {
    this.target = target;
  }
  public SLOOverallStatuses timeframe(SLOTimeframe timeframe) {
    this.timeframe = timeframe;
    this.unparsed |= !timeframe.isValid();
    return this;
  }

  /**
   * <p>The SLO time window options. Note that "custom" is not a valid option for creating
   * or updating SLOs. It is only used when querying SLO history over custom timeframes.</p>
   * @return timeframe
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIMEFRAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SLOTimeframe getTimeframe() {
        return timeframe;
      }
  public void setTimeframe(SLOTimeframe timeframe) {
    if (!timeframe.isValid()) {
        this.unparsed = true;
    }
    this.timeframe = timeframe;
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
   * @return SLOOverallStatuses
   */
  @JsonAnySetter
  public SLOOverallStatuses putAdditionalProperty(String key, Object value) {
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
   * Return true if this SLOOverallStatuses object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOOverallStatuses sloOverallStatuses = (SLOOverallStatuses) o;
    return Objects.equals(this.error, sloOverallStatuses.error) && Objects.equals(this.errorBudgetRemaining, sloOverallStatuses.errorBudgetRemaining) && Objects.equals(this.indexedAt, sloOverallStatuses.indexedAt) && Objects.equals(this.rawErrorBudgetRemaining, sloOverallStatuses.rawErrorBudgetRemaining) && Objects.equals(this.spanPrecision, sloOverallStatuses.spanPrecision) && Objects.equals(this.state, sloOverallStatuses.state) && Objects.equals(this.status, sloOverallStatuses.status) && Objects.equals(this.target, sloOverallStatuses.target) && Objects.equals(this.timeframe, sloOverallStatuses.timeframe) && Objects.equals(this.additionalProperties, sloOverallStatuses.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(error,errorBudgetRemaining,indexedAt,rawErrorBudgetRemaining,spanPrecision,state,status,target,timeframe, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOOverallStatuses {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorBudgetRemaining: ").append(toIndentedString(errorBudgetRemaining)).append("\n");
    sb.append("    indexedAt: ").append(toIndentedString(indexedAt)).append("\n");
    sb.append("    rawErrorBudgetRemaining: ").append(toIndentedString(rawErrorBudgetRemaining)).append("\n");
    sb.append("    spanPrecision: ").append(toIndentedString(spanPrecision)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    timeframe: ").append(toIndentedString(timeframe)).append("\n");
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
