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
import org.openapitools.jackson.nullable.JsonNullable;

/** One statistical comparison for a metric and variant. */
@JsonPropertyOrder({
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems
      .JSON_PROPERTY_CONFIDENCE_INTERVAL,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems
      .JSON_PROPERTY_CONFIDENCE_LEVEL,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems.JSON_PROPERTY_EVSI,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems
      .JSON_PROPERTY_EXPECTATION_ABOVE_ZERO,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems
      .JSON_PROPERTY_EXPECTATION_BELOW_ZERO,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems.JSON_PROPERTY_GLOBAL_LIFT,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems
      .JSON_PROPERTY_GLOBAL_LIFT_LOWER_BOUND,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems
      .JSON_PROPERTY_GLOBAL_LIFT_UPPER_BOUND,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems
      .JSON_PROPERTY_IS_CUPED_ADJUSTED,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems.JSON_PROPERTY_IS_UNRELIABLE,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems.JSON_PROPERTY_LIFT_TYPE,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems.JSON_PROPERTY_METHOD,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems
      .JSON_PROPERTY_MINIMUM_EXPECTED_REGRET,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems.JSON_PROPERTY_P_VALUE,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems
      .JSON_PROPERTY_POINT_ESTIMATE,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems
      .JSON_PROPERTY_PROBABILITY_ABOVE_ZERO,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems
      .JSON_PROPERTY_PROBABILITY_BELOW_ZERO,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems
      .JSON_PROPERTY_STANDARD_ERROR,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems
      .JSON_PROPERTY_UNRELIABLE_REASON,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems
      .JSON_PROPERTY_VARIANT_METRIC_VALUE,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems.JSON_PROPERTY_Z_SCORE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIDENCE_INTERVAL = "confidence_interval";
  private ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsConfidenceInterval
      confidenceInterval;

  public static final String JSON_PROPERTY_CONFIDENCE_LEVEL = "confidence_level";
  private Double confidenceLevel;

  public static final String JSON_PROPERTY_EVSI = "evsi";
  private Double evsi;

  public static final String JSON_PROPERTY_EXPECTATION_ABOVE_ZERO = "expectation_above_zero";
  private Double expectationAboveZero;

  public static final String JSON_PROPERTY_EXPECTATION_BELOW_ZERO = "expectation_below_zero";
  private Double expectationBelowZero;

  public static final String JSON_PROPERTY_GLOBAL_LIFT = "global_lift";
  private Double globalLift;

  public static final String JSON_PROPERTY_GLOBAL_LIFT_LOWER_BOUND = "global_lift_lower_bound";
  private Double globalLiftLowerBound;

  public static final String JSON_PROPERTY_GLOBAL_LIFT_UPPER_BOUND = "global_lift_upper_bound";
  private Double globalLiftUpperBound;

  public static final String JSON_PROPERTY_IS_CUPED_ADJUSTED = "is_cuped_adjusted";
  private Boolean isCupedAdjusted;

  public static final String JSON_PROPERTY_IS_UNRELIABLE = "is_unreliable";
  private Boolean isUnreliable;

  public static final String JSON_PROPERTY_LIFT_TYPE = "lift_type";
  private ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsLiftType liftType;

  public static final String JSON_PROPERTY_METHOD = "method";
  private ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsMethod method;

  public static final String JSON_PROPERTY_MINIMUM_EXPECTED_REGRET = "minimum_expected_regret";
  private Double minimumExpectedRegret;

  public static final String JSON_PROPERTY_P_VALUE = "p_value";
  private Double pValue;

  public static final String JSON_PROPERTY_POINT_ESTIMATE = "point_estimate";
  private Double pointEstimate;

  public static final String JSON_PROPERTY_PROBABILITY_ABOVE_ZERO = "probability_above_zero";
  private Double probabilityAboveZero;

  public static final String JSON_PROPERTY_PROBABILITY_BELOW_ZERO = "probability_below_zero";
  private Double probabilityBelowZero;

  public static final String JSON_PROPERTY_STANDARD_ERROR = "standard_error";
  private Double standardError;

  public static final String JSON_PROPERTY_UNRELIABLE_REASON = "unreliable_reason";
  private ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReason
      unreliableReason;

  public static final String JSON_PROPERTY_VARIANT_METRIC_VALUE = "variant_metric_value";
  private JsonNullable<Double> variantMetricValue = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_Z_SCORE = "z_score";
  private Double zScore;

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems confidenceInterval(
      ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsConfidenceInterval
          confidenceInterval) {
    this.confidenceInterval = confidenceInterval;
    this.unparsed |= confidenceInterval.unparsed;
    return this;
  }

  /**
   * Lower and upper bounds of the reported statistical interval.
   *
   * @return confidenceInterval
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIDENCE_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsConfidenceInterval
      getConfidenceInterval() {
    return confidenceInterval;
  }

  public void setConfidenceInterval(
      ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsConfidenceInterval
          confidenceInterval) {
    this.confidenceInterval = confidenceInterval;
    if (confidenceInterval != null) {
      this.unparsed |= confidenceInterval.unparsed;
    }
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems confidenceLevel(
      Double confidenceLevel) {
    this.confidenceLevel = confidenceLevel;
    return this;
  }

  /**
   * Configured nominal confidence level. Interval bounds can use an adjusted level for multiple
   * testing or hybrid methods.
   *
   * @return confidenceLevel
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIDENCE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getConfidenceLevel() {
    return confidenceLevel;
  }

  public void setConfidenceLevel(Double confidenceLevel) {
    this.confidenceLevel = confidenceLevel;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems evsi(Double evsi) {
    this.evsi = evsi;
    return this;
  }

  /**
   * Expected reduction in minimum expected regret from collecting more sample data.
   *
   * @return evsi
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVSI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEvsi() {
    return evsi;
  }

  public void setEvsi(Double evsi) {
    this.evsi = evsi;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems expectationAboveZero(
      Double expectationAboveZero) {
    this.expectationAboveZero = expectationAboveZero;
    return this;
  }

  /**
   * Expected effect when the effect is positive.
   *
   * @return expectationAboveZero
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPECTATION_ABOVE_ZERO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getExpectationAboveZero() {
    return expectationAboveZero;
  }

  public void setExpectationAboveZero(Double expectationAboveZero) {
    this.expectationAboveZero = expectationAboveZero;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems expectationBelowZero(
      Double expectationBelowZero) {
    this.expectationBelowZero = expectationBelowZero;
    return this;
  }

  /**
   * Expected effect when the effect is negative.
   *
   * @return expectationBelowZero
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPECTATION_BELOW_ZERO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getExpectationBelowZero() {
    return expectationBelowZero;
  }

  public void setExpectationBelowZero(Double expectationBelowZero) {
    this.expectationBelowZero = expectationBelowZero;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems globalLift(
      Double globalLift) {
    this.globalLift = globalLift;
    return this;
  }

  /**
   * Estimated lift across the population. Calculated as metric coverage multiplied by the
   * experiment lift.
   *
   * @return globalLift
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GLOBAL_LIFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGlobalLift() {
    return globalLift;
  }

  public void setGlobalLift(Double globalLift) {
    this.globalLift = globalLift;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems globalLiftLowerBound(
      Double globalLiftLowerBound) {
    this.globalLiftLowerBound = globalLiftLowerBound;
    return this;
  }

  /**
   * Lower bound of the estimated lift across the population.
   *
   * @return globalLiftLowerBound
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GLOBAL_LIFT_LOWER_BOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGlobalLiftLowerBound() {
    return globalLiftLowerBound;
  }

  public void setGlobalLiftLowerBound(Double globalLiftLowerBound) {
    this.globalLiftLowerBound = globalLiftLowerBound;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems globalLiftUpperBound(
      Double globalLiftUpperBound) {
    this.globalLiftUpperBound = globalLiftUpperBound;
    return this;
  }

  /**
   * Upper bound of the estimated lift across the population.
   *
   * @return globalLiftUpperBound
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GLOBAL_LIFT_UPPER_BOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGlobalLiftUpperBound() {
    return globalLiftUpperBound;
  }

  public void setGlobalLiftUpperBound(Double globalLiftUpperBound) {
    this.globalLiftUpperBound = globalLiftUpperBound;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems isCupedAdjusted(
      Boolean isCupedAdjusted) {
    this.isCupedAdjusted = isCupedAdjusted;
    return this;
  }

  /**
   * Whether CUPED used pre-experiment data to reduce variance in this result.
   *
   * @return isCupedAdjusted
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_CUPED_ADJUSTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsCupedAdjusted() {
    return isCupedAdjusted;
  }

  public void setIsCupedAdjusted(Boolean isCupedAdjusted) {
    this.isCupedAdjusted = isCupedAdjusted;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems isUnreliable(
      Boolean isUnreliable) {
    this.isUnreliable = isUnreliable;
    return this;
  }

  /**
   * Whether the statistical result is marked as unreliable.
   *
   * @return isUnreliable
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_UNRELIABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsUnreliable() {
    return isUnreliable;
  }

  public void setIsUnreliable(Boolean isUnreliable) {
    this.isUnreliable = isUnreliable;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems liftType(
      ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsLiftType liftType) {
    this.liftType = liftType;
    this.unparsed |= !liftType.isValid();
    return this;
  }

  /**
   * Whether the reported lift is relative or absolute.
   *
   * @return liftType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIFT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsLiftType
      getLiftType() {
    return liftType;
  }

  public void setLiftType(
      ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsLiftType liftType) {
    if (!liftType.isValid()) {
      this.unparsed = true;
    }
    this.liftType = liftType;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems method(
      ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsMethod method) {
    this.method = method;
    this.unparsed |= !method.isValid();
    return this;
  }

  /**
   * Statistical method used to calculate this result.
   *
   * @return method
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsMethod getMethod() {
    return method;
  }

  public void setMethod(
      ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsMethod method) {
    if (!method.isValid()) {
      this.unparsed = true;
    }
    this.method = method;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems
      minimumExpectedRegret(Double minimumExpectedRegret) {
    this.minimumExpectedRegret = minimumExpectedRegret;
    return this;
  }

  /**
   * The smaller expected opportunity cost of choosing treatment or control.
   *
   * @return minimumExpectedRegret
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MINIMUM_EXPECTED_REGRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getMinimumExpectedRegret() {
    return minimumExpectedRegret;
  }

  public void setMinimumExpectedRegret(Double minimumExpectedRegret) {
    this.minimumExpectedRegret = minimumExpectedRegret;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems pValue(
      Double pValue) {
    this.pValue = pValue;
    return this;
  }

  /**
   * Probability, under the no-effect hypothesis, of a result at least as extreme as the observed
   * result.
   *
   * @return pValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_P_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPValue() {
    return pValue;
  }

  public void setPValue(Double pValue) {
    this.pValue = pValue;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems pointEstimate(
      Double pointEstimate) {
    this.pointEstimate = pointEstimate;
    return this;
  }

  /**
   * Estimated difference between the variant and control for this metric.
   *
   * @return pointEstimate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POINT_ESTIMATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPointEstimate() {
    return pointEstimate;
  }

  public void setPointEstimate(Double pointEstimate) {
    this.pointEstimate = pointEstimate;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems probabilityAboveZero(
      Double probabilityAboveZero) {
    this.probabilityAboveZero = probabilityAboveZero;
    return this;
  }

  /**
   * Estimated probability that the effect is greater than zero.
   *
   * @return probabilityAboveZero
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROBABILITY_ABOVE_ZERO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getProbabilityAboveZero() {
    return probabilityAboveZero;
  }

  public void setProbabilityAboveZero(Double probabilityAboveZero) {
    this.probabilityAboveZero = probabilityAboveZero;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems probabilityBelowZero(
      Double probabilityBelowZero) {
    this.probabilityBelowZero = probabilityBelowZero;
    return this;
  }

  /**
   * Estimated probability that the effect is less than zero.
   *
   * @return probabilityBelowZero
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROBABILITY_BELOW_ZERO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getProbabilityBelowZero() {
    return probabilityBelowZero;
  }

  public void setProbabilityBelowZero(Double probabilityBelowZero) {
    this.probabilityBelowZero = probabilityBelowZero;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems standardError(
      Double standardError) {
    this.standardError = standardError;
    return this;
  }

  /**
   * Estimated uncertainty in the effect estimate.
   *
   * @return standardError
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STANDARD_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getStandardError() {
    return standardError;
  }

  public void setStandardError(Double standardError) {
    this.standardError = standardError;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems unreliableReason(
      ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReason
          unreliableReason) {
    this.unreliableReason = unreliableReason;
    this.unparsed |= !unreliableReason.isValid();
    return this;
  }

  /**
   * Reason that the statistical result is marked as unreliable.
   *
   * @return unreliableReason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNRELIABLE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReason
      getUnreliableReason() {
    return unreliableReason;
  }

  public void setUnreliableReason(
      ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReason
          unreliableReason) {
    if (!unreliableReason.isValid()) {
      this.unparsed = true;
    }
    this.unreliableReason = unreliableReason;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems variantMetricValue(
      Double variantMetricValue) {
    this.variantMetricValue = JsonNullable.<Double>of(variantMetricValue);
    return this;
  }

  /**
   * Metric value calculated for this variant.
   *
   * @return variantMetricValue
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getVariantMetricValue() {
    return variantMetricValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VARIANT_METRIC_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getVariantMetricValue_JsonNullable() {
    return variantMetricValue;
  }

  @JsonProperty(JSON_PROPERTY_VARIANT_METRIC_VALUE)
  public void setVariantMetricValue_JsonNullable(JsonNullable<Double> variantMetricValue) {
    this.variantMetricValue = variantMetricValue;
  }

  public void setVariantMetricValue(Double variantMetricValue) {
    this.variantMetricValue = JsonNullable.<Double>of(variantMetricValue);
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems zScore(
      Double zScore) {
    this.zScore = zScore;
    return this;
  }

  /**
   * Standardized statistic used to compare the observed effect with zero.
   *
   * @return zScore
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_Z_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getZScore() {
    return zScore;
  }

  public void setZScore(Double zScore) {
    this.zScore = zScore;
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
   * @return ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems
   */
  @JsonAnySetter
  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems
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
   * Return true if this ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems
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
    ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems
        experimentsVariantResultsV2DtoDataAttributesMetricsItemsAnalysesItems =
            (ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems) o;
    return Objects.equals(
            this.confidenceInterval,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsAnalysesItems
                .confidenceInterval)
        && Objects.equals(
            this.confidenceLevel,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsAnalysesItems.confidenceLevel)
        && Objects.equals(
            this.evsi, experimentsVariantResultsV2DtoDataAttributesMetricsItemsAnalysesItems.evsi)
        && Objects.equals(
            this.expectationAboveZero,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsAnalysesItems
                .expectationAboveZero)
        && Objects.equals(
            this.expectationBelowZero,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsAnalysesItems
                .expectationBelowZero)
        && Objects.equals(
            this.globalLift,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsAnalysesItems.globalLift)
        && Objects.equals(
            this.globalLiftLowerBound,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsAnalysesItems
                .globalLiftLowerBound)
        && Objects.equals(
            this.globalLiftUpperBound,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsAnalysesItems
                .globalLiftUpperBound)
        && Objects.equals(
            this.isCupedAdjusted,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsAnalysesItems.isCupedAdjusted)
        && Objects.equals(
            this.isUnreliable,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsAnalysesItems.isUnreliable)
        && Objects.equals(
            this.liftType,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsAnalysesItems.liftType)
        && Objects.equals(
            this.method,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsAnalysesItems.method)
        && Objects.equals(
            this.minimumExpectedRegret,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsAnalysesItems
                .minimumExpectedRegret)
        && Objects.equals(
            this.pValue,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsAnalysesItems.pValue)
        && Objects.equals(
            this.pointEstimate,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsAnalysesItems.pointEstimate)
        && Objects.equals(
            this.probabilityAboveZero,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsAnalysesItems
                .probabilityAboveZero)
        && Objects.equals(
            this.probabilityBelowZero,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsAnalysesItems
                .probabilityBelowZero)
        && Objects.equals(
            this.standardError,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsAnalysesItems.standardError)
        && Objects.equals(
            this.unreliableReason,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsAnalysesItems.unreliableReason)
        && Objects.equals(
            this.variantMetricValue,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsAnalysesItems
                .variantMetricValue)
        && Objects.equals(
            this.zScore,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsAnalysesItems.zScore)
        && Objects.equals(
            this.additionalProperties,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsAnalysesItems
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        confidenceInterval,
        confidenceLevel,
        evsi,
        expectationAboveZero,
        expectationBelowZero,
        globalLift,
        globalLiftLowerBound,
        globalLiftUpperBound,
        isCupedAdjusted,
        isUnreliable,
        liftType,
        method,
        minimumExpectedRegret,
        pValue,
        pointEstimate,
        probabilityAboveZero,
        probabilityBelowZero,
        standardError,
        unreliableReason,
        variantMetricValue,
        zScore,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems {\n");
    sb.append("    confidenceInterval: ").append(toIndentedString(confidenceInterval)).append("\n");
    sb.append("    confidenceLevel: ").append(toIndentedString(confidenceLevel)).append("\n");
    sb.append("    evsi: ").append(toIndentedString(evsi)).append("\n");
    sb.append("    expectationAboveZero: ")
        .append(toIndentedString(expectationAboveZero))
        .append("\n");
    sb.append("    expectationBelowZero: ")
        .append(toIndentedString(expectationBelowZero))
        .append("\n");
    sb.append("    globalLift: ").append(toIndentedString(globalLift)).append("\n");
    sb.append("    globalLiftLowerBound: ")
        .append(toIndentedString(globalLiftLowerBound))
        .append("\n");
    sb.append("    globalLiftUpperBound: ")
        .append(toIndentedString(globalLiftUpperBound))
        .append("\n");
    sb.append("    isCupedAdjusted: ").append(toIndentedString(isCupedAdjusted)).append("\n");
    sb.append("    isUnreliable: ").append(toIndentedString(isUnreliable)).append("\n");
    sb.append("    liftType: ").append(toIndentedString(liftType)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    minimumExpectedRegret: ")
        .append(toIndentedString(minimumExpectedRegret))
        .append("\n");
    sb.append("    pValue: ").append(toIndentedString(pValue)).append("\n");
    sb.append("    pointEstimate: ").append(toIndentedString(pointEstimate)).append("\n");
    sb.append("    probabilityAboveZero: ")
        .append(toIndentedString(probabilityAboveZero))
        .append("\n");
    sb.append("    probabilityBelowZero: ")
        .append(toIndentedString(probabilityBelowZero))
        .append("\n");
    sb.append("    standardError: ").append(toIndentedString(standardError)).append("\n");
    sb.append("    unreliableReason: ").append(toIndentedString(unreliableReason)).append("\n");
    sb.append("    variantMetricValue: ").append(toIndentedString(variantMetricValue)).append("\n");
    sb.append("    zScore: ").append(toIndentedString(zScore)).append("\n");
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
