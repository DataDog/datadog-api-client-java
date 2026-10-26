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

/**
 * Partial lock map. Omitted fields remain unchanged. Null clears the whole map. Empty or null field
 * values become <code>EDITABLE</code>, except <code>subject_type</code>, <code>flag_source</code>,
 * and <code>confidence_interval_method</code>, which remain <code>LOCKED</code>.
 */
@JsonPropertyOrder({
  ExperimentsPatchProtocolEnforcementInput.JSON_PROPERTY_CONFIDENCE_INTERVAL_METHOD,
  ExperimentsPatchProtocolEnforcementInput.JSON_PROPERTY_CONFIDENCE_LEVEL,
  ExperimentsPatchProtocolEnforcementInput.JSON_PROPERTY_CUPED_CALCULATION,
  ExperimentsPatchProtocolEnforcementInput.JSON_PROPERTY_DEFAULT_DURATION,
  ExperimentsPatchProtocolEnforcementInput.JSON_PROPERTY_ENVIRONMENT,
  ExperimentsPatchProtocolEnforcementInput.JSON_PROPERTY_FLAG_SOURCE,
  ExperimentsPatchProtocolEnforcementInput.JSON_PROPERTY_MULTIPLE_TESTING_CORRECTION,
  ExperimentsPatchProtocolEnforcementInput.JSON_PROPERTY_NOTIFICATIONS,
  ExperimentsPatchProtocolEnforcementInput.JSON_PROPERTY_PRIMARY_METRIC,
  ExperimentsPatchProtocolEnforcementInput.JSON_PROPERTY_SECONDARY_METRICS,
  ExperimentsPatchProtocolEnforcementInput.JSON_PROPERTY_SPLIT_BY_EXPLORATION_DIMENSIONS,
  ExperimentsPatchProtocolEnforcementInput.JSON_PROPERTY_SUBJECT_TYPE,
  ExperimentsPatchProtocolEnforcementInput.JSON_PROPERTY_TARGETING_RULES,
  ExperimentsPatchProtocolEnforcementInput.JSON_PROPERTY_TRAFFIC_EXPOSURE,
  ExperimentsPatchProtocolEnforcementInput.JSON_PROPERTY_WAREHOUSE_EXPOSURE_SOURCE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsPatchProtocolEnforcementInput {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIDENCE_INTERVAL_METHOD =
      "confidence_interval_method";
  private JsonNullable<String> confidenceIntervalMethod = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONFIDENCE_LEVEL = "confidence_level";
  private JsonNullable<String> confidenceLevel = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CUPED_CALCULATION = "cuped_calculation";
  private JsonNullable<String> cupedCalculation = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DEFAULT_DURATION = "default_duration";
  private JsonNullable<String> defaultDuration = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  private JsonNullable<String> environment = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FLAG_SOURCE = "flag_source";
  private JsonNullable<String> flagSource = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MULTIPLE_TESTING_CORRECTION =
      "multiple_testing_correction";
  private JsonNullable<String> multipleTestingCorrection = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NOTIFICATIONS = "notifications";
  private JsonNullable<String> notifications = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRIMARY_METRIC = "primary_metric";
  private JsonNullable<String> primaryMetric = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SECONDARY_METRICS = "secondary_metrics";
  private JsonNullable<String> secondaryMetrics = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SPLIT_BY_EXPLORATION_DIMENSIONS =
      "split_by_exploration_dimensions";
  private JsonNullable<String> splitByExplorationDimensions = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SUBJECT_TYPE = "subject_type";
  private JsonNullable<String> subjectType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TARGETING_RULES = "targeting_rules";
  private JsonNullable<String> targetingRules = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TRAFFIC_EXPOSURE = "traffic_exposure";
  private JsonNullable<String> trafficExposure = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_WAREHOUSE_EXPOSURE_SOURCE = "warehouse_exposure_source";
  private JsonNullable<String> warehouseExposureSource = JsonNullable.<String>undefined();

  public ExperimentsPatchProtocolEnforcementInput confidenceIntervalMethod(
      String confidenceIntervalMethod) {
    this.confidenceIntervalMethod = JsonNullable.<String>of(confidenceIntervalMethod);
    return this;
  }

  /**
   * Always <code>LOCKED</code>. The server keeps this setting locked regardless of the supplied
   * value.
   *
   * @return confidenceIntervalMethod
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getConfidenceIntervalMethod() {
    return confidenceIntervalMethod.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONFIDENCE_INTERVAL_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getConfidenceIntervalMethod_JsonNullable() {
    return confidenceIntervalMethod;
  }

  @JsonProperty(JSON_PROPERTY_CONFIDENCE_INTERVAL_METHOD)
  public void setConfidenceIntervalMethod_JsonNullable(
      JsonNullable<String> confidenceIntervalMethod) {
    this.confidenceIntervalMethod = confidenceIntervalMethod;
  }

  public void setConfidenceIntervalMethod(String confidenceIntervalMethod) {
    this.confidenceIntervalMethod = JsonNullable.<String>of(confidenceIntervalMethod);
  }

  public ExperimentsPatchProtocolEnforcementInput confidenceLevel(String confidenceLevel) {
    this.confidenceLevel = JsonNullable.<String>of(confidenceLevel);
    return this;
  }

  /**
   * LOCKED prevents changes to confidence level. EDITABLE permits changes.
   *
   * @return confidenceLevel
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getConfidenceLevel() {
    return confidenceLevel.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONFIDENCE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getConfidenceLevel_JsonNullable() {
    return confidenceLevel;
  }

  @JsonProperty(JSON_PROPERTY_CONFIDENCE_LEVEL)
  public void setConfidenceLevel_JsonNullable(JsonNullable<String> confidenceLevel) {
    this.confidenceLevel = confidenceLevel;
  }

  public void setConfidenceLevel(String confidenceLevel) {
    this.confidenceLevel = JsonNullable.<String>of(confidenceLevel);
  }

  public ExperimentsPatchProtocolEnforcementInput cupedCalculation(String cupedCalculation) {
    this.cupedCalculation = JsonNullable.<String>of(cupedCalculation);
    return this;
  }

  /**
   * LOCKED prevents changes to CUPED variance reduction. EDITABLE permits changes.
   *
   * @return cupedCalculation
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getCupedCalculation() {
    return cupedCalculation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUPED_CALCULATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCupedCalculation_JsonNullable() {
    return cupedCalculation;
  }

  @JsonProperty(JSON_PROPERTY_CUPED_CALCULATION)
  public void setCupedCalculation_JsonNullable(JsonNullable<String> cupedCalculation) {
    this.cupedCalculation = cupedCalculation;
  }

  public void setCupedCalculation(String cupedCalculation) {
    this.cupedCalculation = JsonNullable.<String>of(cupedCalculation);
  }

  public ExperimentsPatchProtocolEnforcementInput defaultDuration(String defaultDuration) {
    this.defaultDuration = JsonNullable.<String>of(defaultDuration);
    return this;
  }

  /**
   * LOCKED prevents changes to default duration. EDITABLE permits changes.
   *
   * @return defaultDuration
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDefaultDuration() {
    return defaultDuration.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDefaultDuration_JsonNullable() {
    return defaultDuration;
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_DURATION)
  public void setDefaultDuration_JsonNullable(JsonNullable<String> defaultDuration) {
    this.defaultDuration = defaultDuration;
  }

  public void setDefaultDuration(String defaultDuration) {
    this.defaultDuration = JsonNullable.<String>of(defaultDuration);
  }

  public ExperimentsPatchProtocolEnforcementInput environment(String environment) {
    this.environment = JsonNullable.<String>of(environment);
    return this;
  }

  /**
   * LOCKED prevents changes to environment. EDITABLE permits changes.
   *
   * @return environment
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getEnvironment() {
    return environment.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getEnvironment_JsonNullable() {
    return environment;
  }

  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  public void setEnvironment_JsonNullable(JsonNullable<String> environment) {
    this.environment = environment;
  }

  public void setEnvironment(String environment) {
    this.environment = JsonNullable.<String>of(environment);
  }

  public ExperimentsPatchProtocolEnforcementInput flagSource(String flagSource) {
    this.flagSource = JsonNullable.<String>of(flagSource);
    return this;
  }

  /**
   * Always LOCKED. The server keeps this setting locked regardless of the supplied value.
   *
   * @return flagSource
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getFlagSource() {
    return flagSource.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FLAG_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getFlagSource_JsonNullable() {
    return flagSource;
  }

  @JsonProperty(JSON_PROPERTY_FLAG_SOURCE)
  public void setFlagSource_JsonNullable(JsonNullable<String> flagSource) {
    this.flagSource = flagSource;
  }

  public void setFlagSource(String flagSource) {
    this.flagSource = JsonNullable.<String>of(flagSource);
  }

  public ExperimentsPatchProtocolEnforcementInput multipleTestingCorrection(
      String multipleTestingCorrection) {
    this.multipleTestingCorrection = JsonNullable.<String>of(multipleTestingCorrection);
    return this;
  }

  /**
   * LOCKED prevents changes to multiple testing correction. EDITABLE permits changes.
   *
   * @return multipleTestingCorrection
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getMultipleTestingCorrection() {
    return multipleTestingCorrection.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MULTIPLE_TESTING_CORRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getMultipleTestingCorrection_JsonNullable() {
    return multipleTestingCorrection;
  }

  @JsonProperty(JSON_PROPERTY_MULTIPLE_TESTING_CORRECTION)
  public void setMultipleTestingCorrection_JsonNullable(
      JsonNullable<String> multipleTestingCorrection) {
    this.multipleTestingCorrection = multipleTestingCorrection;
  }

  public void setMultipleTestingCorrection(String multipleTestingCorrection) {
    this.multipleTestingCorrection = JsonNullable.<String>of(multipleTestingCorrection);
  }

  public ExperimentsPatchProtocolEnforcementInput notifications(String notifications) {
    this.notifications = JsonNullable.<String>of(notifications);
    return this;
  }

  /**
   * LOCKED prevents changes to notifications. EDITABLE permits changes.
   *
   * @return notifications
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getNotifications() {
    return notifications.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NOTIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getNotifications_JsonNullable() {
    return notifications;
  }

  @JsonProperty(JSON_PROPERTY_NOTIFICATIONS)
  public void setNotifications_JsonNullable(JsonNullable<String> notifications) {
    this.notifications = notifications;
  }

  public void setNotifications(String notifications) {
    this.notifications = JsonNullable.<String>of(notifications);
  }

  public ExperimentsPatchProtocolEnforcementInput primaryMetric(String primaryMetric) {
    this.primaryMetric = JsonNullable.<String>of(primaryMetric);
    return this;
  }

  /**
   * LOCKED prevents changes to primary metric. EDITABLE permits changes.
   *
   * @return primaryMetric
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getPrimaryMetric() {
    return primaryMetric.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIMARY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPrimaryMetric_JsonNullable() {
    return primaryMetric;
  }

  @JsonProperty(JSON_PROPERTY_PRIMARY_METRIC)
  public void setPrimaryMetric_JsonNullable(JsonNullable<String> primaryMetric) {
    this.primaryMetric = primaryMetric;
  }

  public void setPrimaryMetric(String primaryMetric) {
    this.primaryMetric = JsonNullable.<String>of(primaryMetric);
  }

  public ExperimentsPatchProtocolEnforcementInput secondaryMetrics(String secondaryMetrics) {
    this.secondaryMetrics = JsonNullable.<String>of(secondaryMetrics);
    return this;
  }

  /**
   * LOCKED prevents changes to secondary metrics. EDITABLE permits changes.
   *
   * @return secondaryMetrics
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getSecondaryMetrics() {
    return secondaryMetrics.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SECONDARY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSecondaryMetrics_JsonNullable() {
    return secondaryMetrics;
  }

  @JsonProperty(JSON_PROPERTY_SECONDARY_METRICS)
  public void setSecondaryMetrics_JsonNullable(JsonNullable<String> secondaryMetrics) {
    this.secondaryMetrics = secondaryMetrics;
  }

  public void setSecondaryMetrics(String secondaryMetrics) {
    this.secondaryMetrics = JsonNullable.<String>of(secondaryMetrics);
  }

  public ExperimentsPatchProtocolEnforcementInput splitByExplorationDimensions(
      String splitByExplorationDimensions) {
    this.splitByExplorationDimensions = JsonNullable.<String>of(splitByExplorationDimensions);
    return this;
  }

  /**
   * LOCKED prevents changes to result exploration dimensions. EDITABLE permits changes.
   *
   * @return splitByExplorationDimensions
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getSplitByExplorationDimensions() {
    return splitByExplorationDimensions.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SPLIT_BY_EXPLORATION_DIMENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSplitByExplorationDimensions_JsonNullable() {
    return splitByExplorationDimensions;
  }

  @JsonProperty(JSON_PROPERTY_SPLIT_BY_EXPLORATION_DIMENSIONS)
  public void setSplitByExplorationDimensions_JsonNullable(
      JsonNullable<String> splitByExplorationDimensions) {
    this.splitByExplorationDimensions = splitByExplorationDimensions;
  }

  public void setSplitByExplorationDimensions(String splitByExplorationDimensions) {
    this.splitByExplorationDimensions = JsonNullable.<String>of(splitByExplorationDimensions);
  }

  public ExperimentsPatchProtocolEnforcementInput subjectType(String subjectType) {
    this.subjectType = JsonNullable.<String>of(subjectType);
    return this;
  }

  /**
   * Always LOCKED. The server keeps this setting locked regardless of the supplied value.
   *
   * @return subjectType
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getSubjectType() {
    return subjectType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBJECT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSubjectType_JsonNullable() {
    return subjectType;
  }

  @JsonProperty(JSON_PROPERTY_SUBJECT_TYPE)
  public void setSubjectType_JsonNullable(JsonNullable<String> subjectType) {
    this.subjectType = subjectType;
  }

  public void setSubjectType(String subjectType) {
    this.subjectType = JsonNullable.<String>of(subjectType);
  }

  public ExperimentsPatchProtocolEnforcementInput targetingRules(String targetingRules) {
    this.targetingRules = JsonNullable.<String>of(targetingRules);
    return this;
  }

  /**
   * LOCKED prevents changes to targeting rules. EDITABLE permits changes.
   *
   * @return targetingRules
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getTargetingRules() {
    return targetingRules.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TARGETING_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTargetingRules_JsonNullable() {
    return targetingRules;
  }

  @JsonProperty(JSON_PROPERTY_TARGETING_RULES)
  public void setTargetingRules_JsonNullable(JsonNullable<String> targetingRules) {
    this.targetingRules = targetingRules;
  }

  public void setTargetingRules(String targetingRules) {
    this.targetingRules = JsonNullable.<String>of(targetingRules);
  }

  public ExperimentsPatchProtocolEnforcementInput trafficExposure(String trafficExposure) {
    this.trafficExposure = JsonNullable.<String>of(trafficExposure);
    return this;
  }

  /**
   * LOCKED prevents changes to traffic exposure. EDITABLE permits changes.
   *
   * @return trafficExposure
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getTrafficExposure() {
    return trafficExposure.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TRAFFIC_EXPOSURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTrafficExposure_JsonNullable() {
    return trafficExposure;
  }

  @JsonProperty(JSON_PROPERTY_TRAFFIC_EXPOSURE)
  public void setTrafficExposure_JsonNullable(JsonNullable<String> trafficExposure) {
    this.trafficExposure = trafficExposure;
  }

  public void setTrafficExposure(String trafficExposure) {
    this.trafficExposure = JsonNullable.<String>of(trafficExposure);
  }

  public ExperimentsPatchProtocolEnforcementInput warehouseExposureSource(
      String warehouseExposureSource) {
    this.warehouseExposureSource = JsonNullable.<String>of(warehouseExposureSource);
    return this;
  }

  /**
   * LOCKED prevents changes to warehouse exposure source. EDITABLE permits changes.
   *
   * @return warehouseExposureSource
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getWarehouseExposureSource() {
    return warehouseExposureSource.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WAREHOUSE_EXPOSURE_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getWarehouseExposureSource_JsonNullable() {
    return warehouseExposureSource;
  }

  @JsonProperty(JSON_PROPERTY_WAREHOUSE_EXPOSURE_SOURCE)
  public void setWarehouseExposureSource_JsonNullable(
      JsonNullable<String> warehouseExposureSource) {
    this.warehouseExposureSource = warehouseExposureSource;
  }

  public void setWarehouseExposureSource(String warehouseExposureSource) {
    this.warehouseExposureSource = JsonNullable.<String>of(warehouseExposureSource);
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
   * @return ExperimentsPatchProtocolEnforcementInput
   */
  @JsonAnySetter
  public ExperimentsPatchProtocolEnforcementInput putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsPatchProtocolEnforcementInput object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsPatchProtocolEnforcementInput experimentsPatchProtocolEnforcementInput =
        (ExperimentsPatchProtocolEnforcementInput) o;
    return Objects.equals(
            this.confidenceIntervalMethod,
            experimentsPatchProtocolEnforcementInput.confidenceIntervalMethod)
        && Objects.equals(
            this.confidenceLevel, experimentsPatchProtocolEnforcementInput.confidenceLevel)
        && Objects.equals(
            this.cupedCalculation, experimentsPatchProtocolEnforcementInput.cupedCalculation)
        && Objects.equals(
            this.defaultDuration, experimentsPatchProtocolEnforcementInput.defaultDuration)
        && Objects.equals(this.environment, experimentsPatchProtocolEnforcementInput.environment)
        && Objects.equals(this.flagSource, experimentsPatchProtocolEnforcementInput.flagSource)
        && Objects.equals(
            this.multipleTestingCorrection,
            experimentsPatchProtocolEnforcementInput.multipleTestingCorrection)
        && Objects.equals(
            this.notifications, experimentsPatchProtocolEnforcementInput.notifications)
        && Objects.equals(
            this.primaryMetric, experimentsPatchProtocolEnforcementInput.primaryMetric)
        && Objects.equals(
            this.secondaryMetrics, experimentsPatchProtocolEnforcementInput.secondaryMetrics)
        && Objects.equals(
            this.splitByExplorationDimensions,
            experimentsPatchProtocolEnforcementInput.splitByExplorationDimensions)
        && Objects.equals(this.subjectType, experimentsPatchProtocolEnforcementInput.subjectType)
        && Objects.equals(
            this.targetingRules, experimentsPatchProtocolEnforcementInput.targetingRules)
        && Objects.equals(
            this.trafficExposure, experimentsPatchProtocolEnforcementInput.trafficExposure)
        && Objects.equals(
            this.warehouseExposureSource,
            experimentsPatchProtocolEnforcementInput.warehouseExposureSource)
        && Objects.equals(
            this.additionalProperties,
            experimentsPatchProtocolEnforcementInput.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        confidenceIntervalMethod,
        confidenceLevel,
        cupedCalculation,
        defaultDuration,
        environment,
        flagSource,
        multipleTestingCorrection,
        notifications,
        primaryMetric,
        secondaryMetrics,
        splitByExplorationDimensions,
        subjectType,
        targetingRules,
        trafficExposure,
        warehouseExposureSource,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsPatchProtocolEnforcementInput {\n");
    sb.append("    confidenceIntervalMethod: ")
        .append(toIndentedString(confidenceIntervalMethod))
        .append("\n");
    sb.append("    confidenceLevel: ").append(toIndentedString(confidenceLevel)).append("\n");
    sb.append("    cupedCalculation: ").append(toIndentedString(cupedCalculation)).append("\n");
    sb.append("    defaultDuration: ").append(toIndentedString(defaultDuration)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    flagSource: ").append(toIndentedString(flagSource)).append("\n");
    sb.append("    multipleTestingCorrection: ")
        .append(toIndentedString(multipleTestingCorrection))
        .append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    primaryMetric: ").append(toIndentedString(primaryMetric)).append("\n");
    sb.append("    secondaryMetrics: ").append(toIndentedString(secondaryMetrics)).append("\n");
    sb.append("    splitByExplorationDimensions: ")
        .append(toIndentedString(splitByExplorationDimensions))
        .append("\n");
    sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
    sb.append("    targetingRules: ").append(toIndentedString(targetingRules)).append("\n");
    sb.append("    trafficExposure: ").append(toIndentedString(trafficExposure)).append("\n");
    sb.append("    warehouseExposureSource: ")
        .append(toIndentedString(warehouseExposureSource))
        .append("\n");
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
