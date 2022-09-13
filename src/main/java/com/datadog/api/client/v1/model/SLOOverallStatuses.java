/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Overall status of the SLO by timeframes. */
@JsonPropertyOrder({
  SLOOverallStatuses.JSON_PROPERTY_ERROR,
  SLOOverallStatuses.JSON_PROPERTY_INDEXED_AT,
  SLOOverallStatuses.JSON_PROPERTY_RAW_ERROR_BUDGET_REMAINING,
  SLOOverallStatuses.JSON_PROPERTY_SPAN_PRECISION,
  SLOOverallStatuses.JSON_PROPERTY_STATUS,
  SLOOverallStatuses.JSON_PROPERTY_TARGET,
  SLOOverallStatuses.JSON_PROPERTY_TIMEFRAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOOverallStatuses {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERROR = "error";
  private JsonNullable<String> error = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INDEXED_AT = "indexed_at";
  private Long indexedAt;

  public static final String JSON_PROPERTY_RAW_ERROR_BUDGET_REMAINING =
      "raw_error_budget_remaining";
  private SLORawErrorBudgetRemaining rawErrorBudgetRemaining;

  public static final String JSON_PROPERTY_SPAN_PRECISION = "span_precision";
  private Long spanPrecision;

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
   * Error message if SLO status or error budget could not be calculated.
   *
   * @return error
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getError() {
    return error.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getError_JsonNullable() {
    return error;
  }

  @JsonProperty(JSON_PROPERTY_ERROR)
  public void setError_JsonNullable(JsonNullable<String> error) {
    this.error = error;
  }

  public void setError(String error) {
    this.error = JsonNullable.<String>of(error);
  }

  public SLOOverallStatuses indexedAt(Long indexedAt) {
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

  public SLOOverallStatuses rawErrorBudgetRemaining(
      SLORawErrorBudgetRemaining rawErrorBudgetRemaining) {
    this.rawErrorBudgetRemaining = rawErrorBudgetRemaining;
    this.unparsed |= rawErrorBudgetRemaining.unparsed;
    return this;
  }

  /**
   * Error budget remaining for an SLO.
   *
   * @return rawErrorBudgetRemaining
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RAW_ERROR_BUDGET_REMAINING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SLORawErrorBudgetRemaining getRawErrorBudgetRemaining() {
    return rawErrorBudgetRemaining;
  }

  public void setRawErrorBudgetRemaining(SLORawErrorBudgetRemaining rawErrorBudgetRemaining) {
    this.rawErrorBudgetRemaining = rawErrorBudgetRemaining;
  }

  public SLOOverallStatuses spanPrecision(Long spanPrecision) {
    this.spanPrecision = spanPrecision;
    return this;
  }

  /**
   * The amount of decimal places the SLI value is accurate to.
   *
   * @return spanPrecision
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPAN_PRECISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSpanPrecision() {
    return spanPrecision;
  }

  public void setSpanPrecision(Long spanPrecision) {
    this.spanPrecision = spanPrecision;
  }

  public SLOOverallStatuses status(Double status) {
    this.status = JsonNullable.<Double>of(status);
    return this;
  }

  /**
   * The status of the SLO.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getStatus() {
    return status.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getStatus_JsonNullable() {
    return status;
  }

  @JsonProperty(JSON_PROPERTY_STATUS)
  public void setStatus_JsonNullable(JsonNullable<Double> status) {
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
   * The target of the SLO.
   *
   * @return target
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * The SLO time window options.
   *
   * @return timeframe
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEFRAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SLOTimeframe getTimeframe() {
    return timeframe;
  }

  public void setTimeframe(SLOTimeframe timeframe) {
    if (!timeframe.isValid()) {
      this.unparsed = true;
    }
    this.timeframe = timeframe;
  }

  /** Return true if this SLOOverallStatuses object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOOverallStatuses sloOverallStatuses = (SLOOverallStatuses) o;
    return Objects.equals(this.error, sloOverallStatuses.error)
        && Objects.equals(this.indexedAt, sloOverallStatuses.indexedAt)
        && Objects.equals(this.rawErrorBudgetRemaining, sloOverallStatuses.rawErrorBudgetRemaining)
        && Objects.equals(this.spanPrecision, sloOverallStatuses.spanPrecision)
        && Objects.equals(this.status, sloOverallStatuses.status)
        && Objects.equals(this.target, sloOverallStatuses.target)
        && Objects.equals(this.timeframe, sloOverallStatuses.timeframe);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        error, indexedAt, rawErrorBudgetRemaining, spanPrecision, status, target, timeframe);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOOverallStatuses {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    indexedAt: ").append(toIndentedString(indexedAt)).append("\n");
    sb.append("    rawErrorBudgetRemaining: ")
        .append(toIndentedString(rawErrorBudgetRemaining))
        .append("\n");
    sb.append("    spanPrecision: ").append(toIndentedString(spanPrecision)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    timeframe: ").append(toIndentedString(timeframe)).append("\n");
    sb.append("}");
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
