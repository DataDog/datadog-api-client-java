/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Population totals and allocation used to calculate metric coverage. */
@JsonPropertyOrder({
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsCoverageSummary
      .JSON_PROPERTY_CONTROL_TOTAL,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsCoverageSummary.JSON_PROPERTY_COVERAGE,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsCoverageSummary
      .JSON_PROPERTY_COVERAGE_UNAVAILABLE_REASON,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsCoverageSummary
      .JSON_PROPERTY_ELIGIBLE_POPULATION_TOTAL,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsCoverageSummary
      .JSON_PROPERTY_EXPERIMENT_TOTAL,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsCoverageSummary
      .JSON_PROPERTY_GLOBAL_METRIC_TOTAL,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsCoverageSummary
      .JSON_PROPERTY_TRAFFIC_ALLOCATION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsVariantResultsV2DTODataAttributesMetricsItemsCoverageSummary {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTROL_TOTAL = "control_total";
  private Double controlTotal;

  public static final String JSON_PROPERTY_COVERAGE = "coverage";
  private Double coverage;

  public static final String JSON_PROPERTY_COVERAGE_UNAVAILABLE_REASON =
      "coverage_unavailable_reason";
  private String coverageUnavailableReason;

  public static final String JSON_PROPERTY_ELIGIBLE_POPULATION_TOTAL = "eligible_population_total";
  private Double eligiblePopulationTotal;

  public static final String JSON_PROPERTY_EXPERIMENT_TOTAL = "experiment_total";
  private Double experimentTotal;

  public static final String JSON_PROPERTY_GLOBAL_METRIC_TOTAL = "global_metric_total";
  private Double globalMetricTotal;

  public static final String JSON_PROPERTY_TRAFFIC_ALLOCATION = "traffic_allocation";
  private Double trafficAllocation;

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsCoverageSummary controlTotal(
      Double controlTotal) {
    this.controlTotal = controlTotal;
    return this;
  }

  /**
   * Total metric value for the control population in the coverage calculation.
   *
   * @return controlTotal
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTROL_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getControlTotal() {
    return controlTotal;
  }

  public void setControlTotal(Double controlTotal) {
    this.controlTotal = controlTotal;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsCoverageSummary coverage(
      Double coverage) {
    this.coverage = coverage;
    return this;
  }

  /**
   * Estimated share of the global metric total from the eligible population if that population
   * received control. The estimate can exceed 1.
   *
   * @return coverage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCoverage() {
    return coverage;
  }

  public void setCoverage(Double coverage) {
    this.coverage = coverage;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsCoverageSummary
      coverageUnavailableReason(String coverageUnavailableReason) {
    this.coverageUnavailableReason = coverageUnavailableReason;
    return this;
  }

  /**
   * Reason that metric coverage could not be calculated.
   *
   * @return coverageUnavailableReason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COVERAGE_UNAVAILABLE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCoverageUnavailableReason() {
    return coverageUnavailableReason;
  }

  public void setCoverageUnavailableReason(String coverageUnavailableReason) {
    this.coverageUnavailableReason = coverageUnavailableReason;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsCoverageSummary
      eligiblePopulationTotal(Double eligiblePopulationTotal) {
    this.eligiblePopulationTotal = eligiblePopulationTotal;
    return this;
  }

  /**
   * Estimated metric total for the eligible population if that population received control.
   *
   * @return eligiblePopulationTotal
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELIGIBLE_POPULATION_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEligiblePopulationTotal() {
    return eligiblePopulationTotal;
  }

  public void setEligiblePopulationTotal(Double eligiblePopulationTotal) {
    this.eligiblePopulationTotal = eligiblePopulationTotal;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsCoverageSummary experimentTotal(
      Double experimentTotal) {
    this.experimentTotal = experimentTotal;
    return this;
  }

  /**
   * Total metric value for the experiment population in the coverage calculation.
   *
   * @return experimentTotal
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPERIMENT_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getExperimentTotal() {
    return experimentTotal;
  }

  public void setExperimentTotal(Double experimentTotal) {
    this.experimentTotal = experimentTotal;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsCoverageSummary globalMetricTotal(
      Double globalMetricTotal) {
    this.globalMetricTotal = globalMetricTotal;
    return this;
  }

  /**
   * Observed metric total across subjects inside and outside the experiment.
   *
   * @return globalMetricTotal
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GLOBAL_METRIC_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGlobalMetricTotal() {
    return globalMetricTotal;
  }

  public void setGlobalMetricTotal(Double globalMetricTotal) {
    this.globalMetricTotal = globalMetricTotal;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsCoverageSummary trafficAllocation(
      Double trafficAllocation) {
    this.trafficAllocation = trafficAllocation;
    return this;
  }

  /**
   * Fraction of eligible traffic allocated to the experiment, weighted by time.
   *
   * @return trafficAllocation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRAFFIC_ALLOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTrafficAllocation() {
    return trafficAllocation;
  }

  public void setTrafficAllocation(Double trafficAllocation) {
    this.trafficAllocation = trafficAllocation;
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
   * @return ExperimentsVariantResultsV2DTODataAttributesMetricsItemsCoverageSummary
   */
  @JsonAnySetter
  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsCoverageSummary
      putAdditionalProperty(String key, Object value) {
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
   * Return true if this ExperimentsVariantResultsV2DTODataAttributesMetricsItemsCoverageSummary
   * object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsVariantResultsV2DTODataAttributesMetricsItemsCoverageSummary
        experimentsVariantResultsV2DtoDataAttributesMetricsItemsCoverageSummary =
            (ExperimentsVariantResultsV2DTODataAttributesMetricsItemsCoverageSummary) o;
    return Objects.equals(
            this.controlTotal,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsCoverageSummary.controlTotal)
        && Objects.equals(
            this.coverage,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsCoverageSummary.coverage)
        && Objects.equals(
            this.coverageUnavailableReason,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsCoverageSummary
                .coverageUnavailableReason)
        && Objects.equals(
            this.eligiblePopulationTotal,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsCoverageSummary
                .eligiblePopulationTotal)
        && Objects.equals(
            this.experimentTotal,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsCoverageSummary.experimentTotal)
        && Objects.equals(
            this.globalMetricTotal,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsCoverageSummary
                .globalMetricTotal)
        && Objects.equals(
            this.trafficAllocation,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsCoverageSummary
                .trafficAllocation)
        && Objects.equals(
            this.additionalProperties,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsCoverageSummary
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        controlTotal,
        coverage,
        coverageUnavailableReason,
        eligiblePopulationTotal,
        experimentTotal,
        globalMetricTotal,
        trafficAllocation,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsVariantResultsV2DTODataAttributesMetricsItemsCoverageSummary {\n");
    sb.append("    controlTotal: ").append(toIndentedString(controlTotal)).append("\n");
    sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
    sb.append("    coverageUnavailableReason: ")
        .append(toIndentedString(coverageUnavailableReason))
        .append("\n");
    sb.append("    eligiblePopulationTotal: ")
        .append(toIndentedString(eligiblePopulationTotal))
        .append("\n");
    sb.append("    experimentTotal: ").append(toIndentedString(experimentTotal)).append("\n");
    sb.append("    globalMetricTotal: ").append(toIndentedString(globalMetricTotal)).append("\n");
    sb.append("    trafficAllocation: ").append(toIndentedString(trafficAllocation)).append("\n");
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
