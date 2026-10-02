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

/** Statistical settings and duration targets in the saved analysis plan. */
@JsonPropertyOrder({
  ExperimentsAnalysisPlanV2MutationResponseDataAttributes.JSON_PROPERTY_BAYESIAN_PRIOR,
  ExperimentsAnalysisPlanV2MutationResponseDataAttributes.JSON_PROPERTY_CONFIDENCE_INTERVAL_METHOD,
  ExperimentsAnalysisPlanV2MutationResponseDataAttributes.JSON_PROPERTY_CONFIDENCE_LEVEL,
  ExperimentsAnalysisPlanV2MutationResponseDataAttributes.JSON_PROPERTY_CUPED_LOOKBACK_PERIOD_DAYS,
  ExperimentsAnalysisPlanV2MutationResponseDataAttributes.JSON_PROPERTY_EXPERIMENT_AUTO_END_DAYS,
  ExperimentsAnalysisPlanV2MutationResponseDataAttributes.JSON_PROPERTY_EXPERIMENT_MIN_DURATION,
  ExperimentsAnalysisPlanV2MutationResponseDataAttributes.JSON_PROPERTY_EXPERIMENT_MIN_SAMPLE_SIZE,
  ExperimentsAnalysisPlanV2MutationResponseDataAttributes
      .JSON_PROPERTY_HAS_CUSTOM_ANALYSIS_SETTINGS,
  ExperimentsAnalysisPlanV2MutationResponseDataAttributes.JSON_PROPERTY_IS_CUPED_ENABLED,
  ExperimentsAnalysisPlanV2MutationResponseDataAttributes
      .JSON_PROPERTY_IS_MULTIPLE_TESTING_CORRECTION_ENABLED,
  ExperimentsAnalysisPlanV2MutationResponseDataAttributes
      .JSON_PROPERTY_PREFERENTIAL_BONFERRONI_PRIMARY_METRIC_WEIGHT,
  ExperimentsAnalysisPlanV2MutationResponseDataAttributes.JSON_PROPERTY_TARGET_DURATION_DAYS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsAnalysisPlanV2MutationResponseDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BAYESIAN_PRIOR = "bayesian_prior";
  private ExperimentsAnalysisPlanV2MutationResponseDataAttributesBayesianPrior bayesianPrior;

  public static final String JSON_PROPERTY_CONFIDENCE_INTERVAL_METHOD =
      "confidence_interval_method";
  private ExperimentsAnalysisPlanV2DTODataAttributesConfidenceIntervalMethod
      confidenceIntervalMethod;

  public static final String JSON_PROPERTY_CONFIDENCE_LEVEL = "confidence_level";
  private Double confidenceLevel;

  public static final String JSON_PROPERTY_CUPED_LOOKBACK_PERIOD_DAYS =
      "cuped_lookback_period_days";
  private Long cupedLookbackPeriodDays;

  public static final String JSON_PROPERTY_EXPERIMENT_AUTO_END_DAYS = "experiment_auto_end_days";
  private Long experimentAutoEndDays;

  public static final String JSON_PROPERTY_EXPERIMENT_MIN_DURATION = "experiment_min_duration";
  private Long experimentMinDuration;

  public static final String JSON_PROPERTY_EXPERIMENT_MIN_SAMPLE_SIZE =
      "experiment_min_sample_size";
  private Long experimentMinSampleSize;

  public static final String JSON_PROPERTY_HAS_CUSTOM_ANALYSIS_SETTINGS =
      "has_custom_analysis_settings";
  private Boolean hasCustomAnalysisSettings;

  public static final String JSON_PROPERTY_IS_CUPED_ENABLED = "is_cuped_enabled";
  private Boolean isCupedEnabled;

  public static final String JSON_PROPERTY_IS_MULTIPLE_TESTING_CORRECTION_ENABLED =
      "is_multiple_testing_correction_enabled";
  private Boolean isMultipleTestingCorrectionEnabled;

  public static final String JSON_PROPERTY_PREFERENTIAL_BONFERRONI_PRIMARY_METRIC_WEIGHT =
      "preferential_bonferroni_primary_metric_weight";
  private Double preferentialBonferroniPrimaryMetricWeight;

  public static final String JSON_PROPERTY_TARGET_DURATION_DAYS = "target_duration_days";
  private JsonNullable<Long> targetDurationDays = JsonNullable.<Long>undefined();

  public ExperimentsAnalysisPlanV2MutationResponseDataAttributes bayesianPrior(
      ExperimentsAnalysisPlanV2MutationResponseDataAttributesBayesianPrior bayesianPrior) {
    this.bayesianPrior = bayesianPrior;
    this.unparsed |= bayesianPrior.unparsed;
    return this;
  }

  /**
   * Parameters of the prior distribution used for Bayesian analysis.
   *
   * @return bayesianPrior
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BAYESIAN_PRIOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsAnalysisPlanV2MutationResponseDataAttributesBayesianPrior getBayesianPrior() {
    return bayesianPrior;
  }

  public void setBayesianPrior(
      ExperimentsAnalysisPlanV2MutationResponseDataAttributesBayesianPrior bayesianPrior) {
    this.bayesianPrior = bayesianPrior;
    if (bayesianPrior != null) {
      this.unparsed |= bayesianPrior.unparsed;
    }
  }

  public ExperimentsAnalysisPlanV2MutationResponseDataAttributes confidenceIntervalMethod(
      ExperimentsAnalysisPlanV2DTODataAttributesConfidenceIntervalMethod confidenceIntervalMethod) {
    this.confidenceIntervalMethod = confidenceIntervalMethod;
    this.unparsed |= !confidenceIntervalMethod.isValid();
    return this;
  }

  /**
   * Statistical method used to calculate the experiment results.
   *
   * @return confidenceIntervalMethod
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIDENCE_INTERVAL_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsAnalysisPlanV2DTODataAttributesConfidenceIntervalMethod
      getConfidenceIntervalMethod() {
    return confidenceIntervalMethod;
  }

  public void setConfidenceIntervalMethod(
      ExperimentsAnalysisPlanV2DTODataAttributesConfidenceIntervalMethod confidenceIntervalMethod) {
    if (!confidenceIntervalMethod.isValid()) {
      this.unparsed = true;
    }
    this.confidenceIntervalMethod = confidenceIntervalMethod;
  }

  public ExperimentsAnalysisPlanV2MutationResponseDataAttributes confidenceLevel(
      Double confidenceLevel) {
    this.confidenceLevel = confidenceLevel;
    return this;
  }

  /**
   * Confidence level used for statistical analysis, expressed as a fraction.
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

  public ExperimentsAnalysisPlanV2MutationResponseDataAttributes cupedLookbackPeriodDays(
      Long cupedLookbackPeriodDays) {
    this.cupedLookbackPeriodDays = cupedLookbackPeriodDays;
    return this;
  }

  /**
   * Number of days of pre-experiment data used for CUPED variance reduction.
   *
   * @return cupedLookbackPeriodDays
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUPED_LOOKBACK_PERIOD_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCupedLookbackPeriodDays() {
    return cupedLookbackPeriodDays;
  }

  public void setCupedLookbackPeriodDays(Long cupedLookbackPeriodDays) {
    this.cupedLookbackPeriodDays = cupedLookbackPeriodDays;
  }

  public ExperimentsAnalysisPlanV2MutationResponseDataAttributes experimentAutoEndDays(
      Long experimentAutoEndDays) {
    this.experimentAutoEndDays = experimentAutoEndDays;
    return this;
  }

  /**
   * Number of days configured for the experiment to end automatically.
   *
   * @return experimentAutoEndDays
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPERIMENT_AUTO_END_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getExperimentAutoEndDays() {
    return experimentAutoEndDays;
  }

  public void setExperimentAutoEndDays(Long experimentAutoEndDays) {
    this.experimentAutoEndDays = experimentAutoEndDays;
  }

  public ExperimentsAnalysisPlanV2MutationResponseDataAttributes experimentMinDuration(
      Long experimentMinDuration) {
    this.experimentMinDuration = experimentMinDuration;
    return this;
  }

  /**
   * Minimum experiment duration in days configured in the analysis plan.
   *
   * @return experimentMinDuration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPERIMENT_MIN_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getExperimentMinDuration() {
    return experimentMinDuration;
  }

  public void setExperimentMinDuration(Long experimentMinDuration) {
    this.experimentMinDuration = experimentMinDuration;
  }

  public ExperimentsAnalysisPlanV2MutationResponseDataAttributes experimentMinSampleSize(
      Long experimentMinSampleSize) {
    this.experimentMinSampleSize = experimentMinSampleSize;
    return this;
  }

  /**
   * Minimum sample size configured in the analysis plan.
   *
   * @return experimentMinSampleSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPERIMENT_MIN_SAMPLE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getExperimentMinSampleSize() {
    return experimentMinSampleSize;
  }

  public void setExperimentMinSampleSize(Long experimentMinSampleSize) {
    this.experimentMinSampleSize = experimentMinSampleSize;
  }

  public ExperimentsAnalysisPlanV2MutationResponseDataAttributes hasCustomAnalysisSettings(
      Boolean hasCustomAnalysisSettings) {
    this.hasCustomAnalysisSettings = hasCustomAnalysisSettings;
    return this;
  }

  /**
   * Whether the experiment has custom analysis settings.
   *
   * @return hasCustomAnalysisSettings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_CUSTOM_ANALYSIS_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasCustomAnalysisSettings() {
    return hasCustomAnalysisSettings;
  }

  public void setHasCustomAnalysisSettings(Boolean hasCustomAnalysisSettings) {
    this.hasCustomAnalysisSettings = hasCustomAnalysisSettings;
  }

  public ExperimentsAnalysisPlanV2MutationResponseDataAttributes isCupedEnabled(
      Boolean isCupedEnabled) {
    this.isCupedEnabled = isCupedEnabled;
    return this;
  }

  /**
   * Whether CUPED uses pre-experiment data to reduce variance in the analysis.
   *
   * @return isCupedEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_CUPED_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsCupedEnabled() {
    return isCupedEnabled;
  }

  public void setIsCupedEnabled(Boolean isCupedEnabled) {
    this.isCupedEnabled = isCupedEnabled;
  }

  public ExperimentsAnalysisPlanV2MutationResponseDataAttributes isMultipleTestingCorrectionEnabled(
      Boolean isMultipleTestingCorrectionEnabled) {
    this.isMultipleTestingCorrectionEnabled = isMultipleTestingCorrectionEnabled;
    return this;
  }

  /**
   * Whether the analysis adjusts for testing multiple hypotheses.
   *
   * @return isMultipleTestingCorrectionEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_MULTIPLE_TESTING_CORRECTION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsMultipleTestingCorrectionEnabled() {
    return isMultipleTestingCorrectionEnabled;
  }

  public void setIsMultipleTestingCorrectionEnabled(Boolean isMultipleTestingCorrectionEnabled) {
    this.isMultipleTestingCorrectionEnabled = isMultipleTestingCorrectionEnabled;
  }

  public ExperimentsAnalysisPlanV2MutationResponseDataAttributes
      preferentialBonferroniPrimaryMetricWeight(Double preferentialBonferroniPrimaryMetricWeight) {
    this.preferentialBonferroniPrimaryMetricWeight = preferentialBonferroniPrimaryMetricWeight;
    return this;
  }

  /**
   * Weight assigned to the primary metric in the preferential Bonferroni correction.
   *
   * @return preferentialBonferroniPrimaryMetricWeight
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFERENTIAL_BONFERRONI_PRIMARY_METRIC_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPreferentialBonferroniPrimaryMetricWeight() {
    return preferentialBonferroniPrimaryMetricWeight;
  }

  public void setPreferentialBonferroniPrimaryMetricWeight(
      Double preferentialBonferroniPrimaryMetricWeight) {
    this.preferentialBonferroniPrimaryMetricWeight = preferentialBonferroniPrimaryMetricWeight;
  }

  public ExperimentsAnalysisPlanV2MutationResponseDataAttributes targetDurationDays(
      Long targetDurationDays) {
    this.targetDurationDays = JsonNullable.<Long>of(targetDurationDays);
    return this;
  }

  /**
   * Planned experiment duration in days.
   *
   * @return targetDurationDays
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getTargetDurationDays() {
    return targetDurationDays.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TARGET_DURATION_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getTargetDurationDays_JsonNullable() {
    return targetDurationDays;
  }

  @JsonProperty(JSON_PROPERTY_TARGET_DURATION_DAYS)
  public void setTargetDurationDays_JsonNullable(JsonNullable<Long> targetDurationDays) {
    this.targetDurationDays = targetDurationDays;
  }

  public void setTargetDurationDays(Long targetDurationDays) {
    this.targetDurationDays = JsonNullable.<Long>of(targetDurationDays);
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
   * @return ExperimentsAnalysisPlanV2MutationResponseDataAttributes
   */
  @JsonAnySetter
  public ExperimentsAnalysisPlanV2MutationResponseDataAttributes putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this ExperimentsAnalysisPlanV2MutationResponseDataAttributes object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsAnalysisPlanV2MutationResponseDataAttributes
        experimentsAnalysisPlanV2MutationResponseDataAttributes =
            (ExperimentsAnalysisPlanV2MutationResponseDataAttributes) o;
    return Objects.equals(
            this.bayesianPrior,
            experimentsAnalysisPlanV2MutationResponseDataAttributes.bayesianPrior)
        && Objects.equals(
            this.confidenceIntervalMethod,
            experimentsAnalysisPlanV2MutationResponseDataAttributes.confidenceIntervalMethod)
        && Objects.equals(
            this.confidenceLevel,
            experimentsAnalysisPlanV2MutationResponseDataAttributes.confidenceLevel)
        && Objects.equals(
            this.cupedLookbackPeriodDays,
            experimentsAnalysisPlanV2MutationResponseDataAttributes.cupedLookbackPeriodDays)
        && Objects.equals(
            this.experimentAutoEndDays,
            experimentsAnalysisPlanV2MutationResponseDataAttributes.experimentAutoEndDays)
        && Objects.equals(
            this.experimentMinDuration,
            experimentsAnalysisPlanV2MutationResponseDataAttributes.experimentMinDuration)
        && Objects.equals(
            this.experimentMinSampleSize,
            experimentsAnalysisPlanV2MutationResponseDataAttributes.experimentMinSampleSize)
        && Objects.equals(
            this.hasCustomAnalysisSettings,
            experimentsAnalysisPlanV2MutationResponseDataAttributes.hasCustomAnalysisSettings)
        && Objects.equals(
            this.isCupedEnabled,
            experimentsAnalysisPlanV2MutationResponseDataAttributes.isCupedEnabled)
        && Objects.equals(
            this.isMultipleTestingCorrectionEnabled,
            experimentsAnalysisPlanV2MutationResponseDataAttributes
                .isMultipleTestingCorrectionEnabled)
        && Objects.equals(
            this.preferentialBonferroniPrimaryMetricWeight,
            experimentsAnalysisPlanV2MutationResponseDataAttributes
                .preferentialBonferroniPrimaryMetricWeight)
        && Objects.equals(
            this.targetDurationDays,
            experimentsAnalysisPlanV2MutationResponseDataAttributes.targetDurationDays)
        && Objects.equals(
            this.additionalProperties,
            experimentsAnalysisPlanV2MutationResponseDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        bayesianPrior,
        confidenceIntervalMethod,
        confidenceLevel,
        cupedLookbackPeriodDays,
        experimentAutoEndDays,
        experimentMinDuration,
        experimentMinSampleSize,
        hasCustomAnalysisSettings,
        isCupedEnabled,
        isMultipleTestingCorrectionEnabled,
        preferentialBonferroniPrimaryMetricWeight,
        targetDurationDays,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsAnalysisPlanV2MutationResponseDataAttributes {\n");
    sb.append("    bayesianPrior: ").append(toIndentedString(bayesianPrior)).append("\n");
    sb.append("    confidenceIntervalMethod: ")
        .append(toIndentedString(confidenceIntervalMethod))
        .append("\n");
    sb.append("    confidenceLevel: ").append(toIndentedString(confidenceLevel)).append("\n");
    sb.append("    cupedLookbackPeriodDays: ")
        .append(toIndentedString(cupedLookbackPeriodDays))
        .append("\n");
    sb.append("    experimentAutoEndDays: ")
        .append(toIndentedString(experimentAutoEndDays))
        .append("\n");
    sb.append("    experimentMinDuration: ")
        .append(toIndentedString(experimentMinDuration))
        .append("\n");
    sb.append("    experimentMinSampleSize: ")
        .append(toIndentedString(experimentMinSampleSize))
        .append("\n");
    sb.append("    hasCustomAnalysisSettings: ")
        .append(toIndentedString(hasCustomAnalysisSettings))
        .append("\n");
    sb.append("    isCupedEnabled: ").append(toIndentedString(isCupedEnabled)).append("\n");
    sb.append("    isMultipleTestingCorrectionEnabled: ")
        .append(toIndentedString(isMultipleTestingCorrectionEnabled))
        .append("\n");
    sb.append("    preferentialBonferroniPrimaryMetricWeight: ")
        .append(toIndentedString(preferentialBonferroniPrimaryMetricWeight))
        .append("\n");
    sb.append("    targetDurationDays: ").append(toIndentedString(targetDurationDays)).append("\n");
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
