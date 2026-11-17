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

/**
 * Forecast horizon and traffic counts used to calculate expected value of sample information (EVSI)
 * for result_run_id. Assumes traffic continues at the rate observed during the lookback window.
 * Omitted if the forecast was not recorded or could not be loaded.
 */
@JsonPropertyOrder({
  ExperimentsEVSIContext.JSON_PROPERTY_ELAPSED_DAYS,
  ExperimentsEVSIContext.JSON_PROPERTY_HORIZON_DAYS,
  ExperimentsEVSIContext.JSON_PROPERTY_HORIZON_EXPOSURES,
  ExperimentsEVSIContext.JSON_PROPERTY_LOOKBACK_DAYS,
  ExperimentsEVSIContext.JSON_PROPERTY_LOOKBACK_EXPOSURES,
  ExperimentsEVSIContext.JSON_PROPERTY_TOTAL_EXPOSURES,
  ExperimentsEVSIContext.JSON_PROPERTY_UNAVAILABLE_REASON,
  ExperimentsEVSIContext.JSON_PROPERTY_USABLE_TRAFFIC_DAYS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsEVSIContext {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ELAPSED_DAYS = "elapsed_days";
  private Double elapsedDays;

  public static final String JSON_PROPERTY_HORIZON_DAYS = "horizon_days";
  private Double horizonDays;

  public static final String JSON_PROPERTY_HORIZON_EXPOSURES = "horizon_exposures";
  private Double horizonExposures;

  public static final String JSON_PROPERTY_LOOKBACK_DAYS = "lookback_days";
  private Long lookbackDays;

  public static final String JSON_PROPERTY_LOOKBACK_EXPOSURES = "lookback_exposures";
  private Long lookbackExposures;

  public static final String JSON_PROPERTY_TOTAL_EXPOSURES = "total_exposures";
  private Long totalExposures;

  public static final String JSON_PROPERTY_UNAVAILABLE_REASON = "unavailable_reason";
  private ExperimentsEVSITrafficUnavailableReason unavailableReason;

  public static final String JSON_PROPERTY_USABLE_TRAFFIC_DAYS = "usable_traffic_days";
  private Long usableTrafficDays;

  public ExperimentsEVSIContext() {}

  @JsonCreator
  public ExperimentsEVSIContext(
      @JsonProperty(required = true, value = JSON_PROPERTY_ELAPSED_DAYS) Double elapsedDays,
      @JsonProperty(required = true, value = JSON_PROPERTY_HORIZON_DAYS) Double horizonDays,
      @JsonProperty(required = true, value = JSON_PROPERTY_HORIZON_EXPOSURES)
          Double horizonExposures,
      @JsonProperty(required = true, value = JSON_PROPERTY_LOOKBACK_DAYS) Long lookbackDays,
      @JsonProperty(required = true, value = JSON_PROPERTY_LOOKBACK_EXPOSURES)
          Long lookbackExposures,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL_EXPOSURES) Long totalExposures,
      @JsonProperty(required = true, value = JSON_PROPERTY_UNAVAILABLE_REASON)
          ExperimentsEVSITrafficUnavailableReason unavailableReason,
      @JsonProperty(required = true, value = JSON_PROPERTY_USABLE_TRAFFIC_DAYS)
          Long usableTrafficDays) {
    this.elapsedDays = elapsedDays;
    if (elapsedDays != null) {}
    this.horizonDays = horizonDays;
    this.horizonExposures = horizonExposures;
    if (horizonExposures != null) {}
    this.lookbackDays = lookbackDays;
    this.lookbackExposures = lookbackExposures;
    if (lookbackExposures != null) {}
    this.totalExposures = totalExposures;
    if (totalExposures != null) {}
    this.unavailableReason = unavailableReason;
    if (unavailableReason != null) {
      this.unparsed |= !unavailableReason.isValid();
    }
    this.usableTrafficDays = usableTrafficDays;
    if (usableTrafficDays != null) {}
  }

  public ExperimentsEVSIContext elapsedDays(Double elapsedDays) {
    this.elapsedDays = elapsedDays;
    if (elapsedDays != null) {}
    return this;
  }

  /**
   * Exact assignment-window duration in days, including fractional days.
   *
   * @return elapsedDays
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELAPSED_DAYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getElapsedDays() {
    return elapsedDays;
  }

  public void setElapsedDays(Double elapsedDays) {
    this.elapsedDays = elapsedDays;
  }

  public ExperimentsEVSIContext horizonDays(Double horizonDays) {
    this.horizonDays = horizonDays;
    return this;
  }

  /**
   * Forecast horizon in days from the original assignment window.
   *
   * @return horizonDays
   */
  @JsonProperty(JSON_PROPERTY_HORIZON_DAYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getHorizonDays() {
    return horizonDays;
  }

  public void setHorizonDays(Double horizonDays) {
    this.horizonDays = horizonDays;
  }

  public ExperimentsEVSIContext horizonExposures(Double horizonExposures) {
    this.horizonExposures = horizonExposures;
    if (horizonExposures != null) {}
    return this;
  }

  /**
   * Projected additional exposures over the horizon, assuming constant traffic.
   *
   * @return horizonExposures
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HORIZON_EXPOSURES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getHorizonExposures() {
    return horizonExposures;
  }

  public void setHorizonExposures(Double horizonExposures) {
    this.horizonExposures = horizonExposures;
  }

  public ExperimentsEVSIContext lookbackDays(Long lookbackDays) {
    this.lookbackDays = lookbackDays;
    return this;
  }

  /**
   * Selected lookback length in complete days.
   *
   * @return lookbackDays
   */
  @JsonProperty(JSON_PROPERTY_LOOKBACK_DAYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getLookbackDays() {
    return lookbackDays;
  }

  public void setLookbackDays(Long lookbackDays) {
    this.lookbackDays = lookbackDays;
  }

  public ExperimentsEVSIContext lookbackExposures(Long lookbackExposures) {
    this.lookbackExposures = lookbackExposures;
    if (lookbackExposures != null) {}
    return this;
  }

  /**
   * Exposures across all variants in the eligible lookback buckets.
   *
   * @return lookbackExposures
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOOKBACK_EXPOSURES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getLookbackExposures() {
    return lookbackExposures;
  }

  public void setLookbackExposures(Long lookbackExposures) {
    this.lookbackExposures = lookbackExposures;
  }

  public ExperimentsEVSIContext totalExposures(Long totalExposures) {
    this.totalExposures = totalExposures;
    if (totalExposures != null) {}
    return this;
  }

  /**
   * Experiment-wide exposures across the assignment window, including boundary buckets.
   *
   * @return totalExposures
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_EXPOSURES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTotalExposures() {
    return totalExposures;
  }

  public void setTotalExposures(Long totalExposures) {
    this.totalExposures = totalExposures;
  }

  public ExperimentsEVSIContext unavailableReason(
      ExperimentsEVSITrafficUnavailableReason unavailableReason) {
    this.unavailableReason = unavailableReason;
    if (unavailableReason != null) {
      this.unparsed |= !unavailableReason.isValid();
    }
    return this;
  }

  /**
   * Recorded traffic forecast unavailability reason. Per-analysis reasons are reported separately.
   *
   * @return unavailableReason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNAVAILABLE_REASON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsEVSITrafficUnavailableReason getUnavailableReason() {
    return unavailableReason;
  }

  public void setUnavailableReason(ExperimentsEVSITrafficUnavailableReason unavailableReason) {
    if (!unavailableReason.isValid()) {
      this.unparsed = true;
    }
    this.unavailableReason = unavailableReason;
  }

  public ExperimentsEVSIContext usableTrafficDays(Long usableTrafficDays) {
    this.usableTrafficDays = usableTrafficDays;
    if (usableTrafficDays != null) {}
    return this;
  }

  /**
   * Interior UTC daily buckets excluding both boundary days. Includes zero-traffic days and does
   * not certify ingestion completeness.
   *
   * @return usableTrafficDays
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USABLE_TRAFFIC_DAYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getUsableTrafficDays() {
    return usableTrafficDays;
  }

  public void setUsableTrafficDays(Long usableTrafficDays) {
    this.usableTrafficDays = usableTrafficDays;
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
   * @return ExperimentsEVSIContext
   */
  @JsonAnySetter
  public ExperimentsEVSIContext putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsEVSIContext object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsEVSIContext experimentsEvsiContext = (ExperimentsEVSIContext) o;
    return Objects.equals(this.elapsedDays, experimentsEvsiContext.elapsedDays)
        && Objects.equals(this.horizonDays, experimentsEvsiContext.horizonDays)
        && Objects.equals(this.horizonExposures, experimentsEvsiContext.horizonExposures)
        && Objects.equals(this.lookbackDays, experimentsEvsiContext.lookbackDays)
        && Objects.equals(this.lookbackExposures, experimentsEvsiContext.lookbackExposures)
        && Objects.equals(this.totalExposures, experimentsEvsiContext.totalExposures)
        && Objects.equals(this.unavailableReason, experimentsEvsiContext.unavailableReason)
        && Objects.equals(this.usableTrafficDays, experimentsEvsiContext.usableTrafficDays)
        && Objects.equals(this.additionalProperties, experimentsEvsiContext.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        elapsedDays,
        horizonDays,
        horizonExposures,
        lookbackDays,
        lookbackExposures,
        totalExposures,
        unavailableReason,
        usableTrafficDays,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsEVSIContext {\n");
    sb.append("    elapsedDays: ").append(toIndentedString(elapsedDays)).append("\n");
    sb.append("    horizonDays: ").append(toIndentedString(horizonDays)).append("\n");
    sb.append("    horizonExposures: ").append(toIndentedString(horizonExposures)).append("\n");
    sb.append("    lookbackDays: ").append(toIndentedString(lookbackDays)).append("\n");
    sb.append("    lookbackExposures: ").append(toIndentedString(lookbackExposures)).append("\n");
    sb.append("    totalExposures: ").append(toIndentedString(totalExposures)).append("\n");
    sb.append("    unavailableReason: ").append(toIndentedString(unavailableReason)).append("\n");
    sb.append("    usableTrafficDays: ").append(toIndentedString(usableTrafficDays)).append("\n");
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
