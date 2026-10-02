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

/** Controls that determine which protocol settings can be changed in an experiment. */
@JsonPropertyOrder({
  ExperimentsPublicProtocolResponseDataAttributesEnforcement
      .JSON_PROPERTY_CONFIDENCE_INTERVAL_METHOD,
  ExperimentsPublicProtocolResponseDataAttributesEnforcement.JSON_PROPERTY_CONFIDENCE_LEVEL,
  ExperimentsPublicProtocolResponseDataAttributesEnforcement.JSON_PROPERTY_CUPED_CALCULATION,
  ExperimentsPublicProtocolResponseDataAttributesEnforcement.JSON_PROPERTY_DEFAULT_DURATION,
  ExperimentsPublicProtocolResponseDataAttributesEnforcement.JSON_PROPERTY_ENVIRONMENT,
  ExperimentsPublicProtocolResponseDataAttributesEnforcement.JSON_PROPERTY_FLAG_SOURCE,
  ExperimentsPublicProtocolResponseDataAttributesEnforcement
      .JSON_PROPERTY_MULTIPLE_TESTING_CORRECTION,
  ExperimentsPublicProtocolResponseDataAttributesEnforcement.JSON_PROPERTY_NOTIFICATIONS,
  ExperimentsPublicProtocolResponseDataAttributesEnforcement.JSON_PROPERTY_PRIMARY_METRIC,
  ExperimentsPublicProtocolResponseDataAttributesEnforcement.JSON_PROPERTY_SECONDARY_METRICS,
  ExperimentsPublicProtocolResponseDataAttributesEnforcement
      .JSON_PROPERTY_SPLIT_BY_EXPLORATION_DIMENSIONS,
  ExperimentsPublicProtocolResponseDataAttributesEnforcement.JSON_PROPERTY_SUBJECT_TYPE,
  ExperimentsPublicProtocolResponseDataAttributesEnforcement.JSON_PROPERTY_TARGETING_RULES,
  ExperimentsPublicProtocolResponseDataAttributesEnforcement.JSON_PROPERTY_TRAFFIC_EXPOSURE,
  ExperimentsPublicProtocolResponseDataAttributesEnforcement.JSON_PROPERTY_WAREHOUSE_EXPOSURE_SOURCE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsPublicProtocolResponseDataAttributesEnforcement {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIDENCE_INTERVAL_METHOD =
      "confidence_interval_method";
  private String confidenceIntervalMethod;

  public static final String JSON_PROPERTY_CONFIDENCE_LEVEL = "confidence_level";
  private String confidenceLevel;

  public static final String JSON_PROPERTY_CUPED_CALCULATION = "cuped_calculation";
  private String cupedCalculation;

  public static final String JSON_PROPERTY_DEFAULT_DURATION = "default_duration";
  private String defaultDuration;

  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  private String environment;

  public static final String JSON_PROPERTY_FLAG_SOURCE = "flag_source";
  private String flagSource;

  public static final String JSON_PROPERTY_MULTIPLE_TESTING_CORRECTION =
      "multiple_testing_correction";
  private String multipleTestingCorrection;

  public static final String JSON_PROPERTY_NOTIFICATIONS = "notifications";
  private String notifications;

  public static final String JSON_PROPERTY_PRIMARY_METRIC = "primary_metric";
  private String primaryMetric;

  public static final String JSON_PROPERTY_SECONDARY_METRICS = "secondary_metrics";
  private String secondaryMetrics;

  public static final String JSON_PROPERTY_SPLIT_BY_EXPLORATION_DIMENSIONS =
      "split_by_exploration_dimensions";
  private String splitByExplorationDimensions;

  public static final String JSON_PROPERTY_SUBJECT_TYPE = "subject_type";
  private String subjectType;

  public static final String JSON_PROPERTY_TARGETING_RULES = "targeting_rules";
  private String targetingRules;

  public static final String JSON_PROPERTY_TRAFFIC_EXPOSURE = "traffic_exposure";
  private String trafficExposure;

  public static final String JSON_PROPERTY_WAREHOUSE_EXPOSURE_SOURCE = "warehouse_exposure_source";
  private String warehouseExposureSource;

  public ExperimentsPublicProtocolResponseDataAttributesEnforcement confidenceIntervalMethod(
      String confidenceIntervalMethod) {
    this.confidenceIntervalMethod = confidenceIntervalMethod;
    return this;
  }

  /**
   * LOCKED prevents changes to confidence interval method. EDITABLE permits changes.
   *
   * @return confidenceIntervalMethod
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIDENCE_INTERVAL_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getConfidenceIntervalMethod() {
    return confidenceIntervalMethod;
  }

  public void setConfidenceIntervalMethod(String confidenceIntervalMethod) {
    this.confidenceIntervalMethod = confidenceIntervalMethod;
  }

  public ExperimentsPublicProtocolResponseDataAttributesEnforcement confidenceLevel(
      String confidenceLevel) {
    this.confidenceLevel = confidenceLevel;
    return this;
  }

  /**
   * LOCKED prevents changes to confidence level. EDITABLE permits changes.
   *
   * @return confidenceLevel
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIDENCE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getConfidenceLevel() {
    return confidenceLevel;
  }

  public void setConfidenceLevel(String confidenceLevel) {
    this.confidenceLevel = confidenceLevel;
  }

  public ExperimentsPublicProtocolResponseDataAttributesEnforcement cupedCalculation(
      String cupedCalculation) {
    this.cupedCalculation = cupedCalculation;
    return this;
  }

  /**
   * LOCKED prevents changes to CUPED variance reduction. EDITABLE permits changes.
   *
   * @return cupedCalculation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUPED_CALCULATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCupedCalculation() {
    return cupedCalculation;
  }

  public void setCupedCalculation(String cupedCalculation) {
    this.cupedCalculation = cupedCalculation;
  }

  public ExperimentsPublicProtocolResponseDataAttributesEnforcement defaultDuration(
      String defaultDuration) {
    this.defaultDuration = defaultDuration;
    return this;
  }

  /**
   * LOCKED prevents changes to default duration. EDITABLE permits changes.
   *
   * @return defaultDuration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDefaultDuration() {
    return defaultDuration;
  }

  public void setDefaultDuration(String defaultDuration) {
    this.defaultDuration = defaultDuration;
  }

  public ExperimentsPublicProtocolResponseDataAttributesEnforcement environment(
      String environment) {
    this.environment = environment;
    return this;
  }

  /**
   * LOCKED prevents changes to environment. EDITABLE permits changes.
   *
   * @return environment
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEnvironment() {
    return environment;
  }

  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  public ExperimentsPublicProtocolResponseDataAttributesEnforcement flagSource(String flagSource) {
    this.flagSource = flagSource;
    return this;
  }

  /**
   * LOCKED prevents changes to feature flag source. EDITABLE permits changes.
   *
   * @return flagSource
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLAG_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFlagSource() {
    return flagSource;
  }

  public void setFlagSource(String flagSource) {
    this.flagSource = flagSource;
  }

  public ExperimentsPublicProtocolResponseDataAttributesEnforcement multipleTestingCorrection(
      String multipleTestingCorrection) {
    this.multipleTestingCorrection = multipleTestingCorrection;
    return this;
  }

  /**
   * LOCKED prevents changes to multiple testing correction. EDITABLE permits changes.
   *
   * @return multipleTestingCorrection
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MULTIPLE_TESTING_CORRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMultipleTestingCorrection() {
    return multipleTestingCorrection;
  }

  public void setMultipleTestingCorrection(String multipleTestingCorrection) {
    this.multipleTestingCorrection = multipleTestingCorrection;
  }

  public ExperimentsPublicProtocolResponseDataAttributesEnforcement notifications(
      String notifications) {
    this.notifications = notifications;
    return this;
  }

  /**
   * LOCKED prevents changes to notifications. EDITABLE permits changes.
   *
   * @return notifications
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNotifications() {
    return notifications;
  }

  public void setNotifications(String notifications) {
    this.notifications = notifications;
  }

  public ExperimentsPublicProtocolResponseDataAttributesEnforcement primaryMetric(
      String primaryMetric) {
    this.primaryMetric = primaryMetric;
    return this;
  }

  /**
   * LOCKED prevents changes to primary metric. EDITABLE permits changes.
   *
   * @return primaryMetric
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPrimaryMetric() {
    return primaryMetric;
  }

  public void setPrimaryMetric(String primaryMetric) {
    this.primaryMetric = primaryMetric;
  }

  public ExperimentsPublicProtocolResponseDataAttributesEnforcement secondaryMetrics(
      String secondaryMetrics) {
    this.secondaryMetrics = secondaryMetrics;
    return this;
  }

  /**
   * LOCKED prevents changes to secondary metrics. EDITABLE permits changes.
   *
   * @return secondaryMetrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECONDARY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSecondaryMetrics() {
    return secondaryMetrics;
  }

  public void setSecondaryMetrics(String secondaryMetrics) {
    this.secondaryMetrics = secondaryMetrics;
  }

  public ExperimentsPublicProtocolResponseDataAttributesEnforcement splitByExplorationDimensions(
      String splitByExplorationDimensions) {
    this.splitByExplorationDimensions = splitByExplorationDimensions;
    return this;
  }

  /**
   * LOCKED prevents changes to result exploration dimensions. EDITABLE permits changes.
   *
   * @return splitByExplorationDimensions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPLIT_BY_EXPLORATION_DIMENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSplitByExplorationDimensions() {
    return splitByExplorationDimensions;
  }

  public void setSplitByExplorationDimensions(String splitByExplorationDimensions) {
    this.splitByExplorationDimensions = splitByExplorationDimensions;
  }

  public ExperimentsPublicProtocolResponseDataAttributesEnforcement subjectType(
      String subjectType) {
    this.subjectType = subjectType;
    return this;
  }

  /**
   * LOCKED prevents changes to subject type. EDITABLE permits changes.
   *
   * @return subjectType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSubjectType() {
    return subjectType;
  }

  public void setSubjectType(String subjectType) {
    this.subjectType = subjectType;
  }

  public ExperimentsPublicProtocolResponseDataAttributesEnforcement targetingRules(
      String targetingRules) {
    this.targetingRules = targetingRules;
    return this;
  }

  /**
   * LOCKED prevents changes to targeting rules. EDITABLE permits changes.
   *
   * @return targetingRules
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGETING_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTargetingRules() {
    return targetingRules;
  }

  public void setTargetingRules(String targetingRules) {
    this.targetingRules = targetingRules;
  }

  public ExperimentsPublicProtocolResponseDataAttributesEnforcement trafficExposure(
      String trafficExposure) {
    this.trafficExposure = trafficExposure;
    return this;
  }

  /**
   * LOCKED prevents changes to traffic exposure. EDITABLE permits changes.
   *
   * @return trafficExposure
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRAFFIC_EXPOSURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTrafficExposure() {
    return trafficExposure;
  }

  public void setTrafficExposure(String trafficExposure) {
    this.trafficExposure = trafficExposure;
  }

  public ExperimentsPublicProtocolResponseDataAttributesEnforcement warehouseExposureSource(
      String warehouseExposureSource) {
    this.warehouseExposureSource = warehouseExposureSource;
    return this;
  }

  /**
   * LOCKED prevents changes to warehouse exposure source. EDITABLE permits changes.
   *
   * @return warehouseExposureSource
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WAREHOUSE_EXPOSURE_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWarehouseExposureSource() {
    return warehouseExposureSource;
  }

  public void setWarehouseExposureSource(String warehouseExposureSource) {
    this.warehouseExposureSource = warehouseExposureSource;
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
   * @return ExperimentsPublicProtocolResponseDataAttributesEnforcement
   */
  @JsonAnySetter
  public ExperimentsPublicProtocolResponseDataAttributesEnforcement putAdditionalProperty(
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
   * Return true if this ExperimentsPublicProtocolResponseDataAttributesEnforcement object is equal
   * to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsPublicProtocolResponseDataAttributesEnforcement
        experimentsPublicProtocolResponseDataAttributesEnforcement =
            (ExperimentsPublicProtocolResponseDataAttributesEnforcement) o;
    return Objects.equals(
            this.confidenceIntervalMethod,
            experimentsPublicProtocolResponseDataAttributesEnforcement.confidenceIntervalMethod)
        && Objects.equals(
            this.confidenceLevel,
            experimentsPublicProtocolResponseDataAttributesEnforcement.confidenceLevel)
        && Objects.equals(
            this.cupedCalculation,
            experimentsPublicProtocolResponseDataAttributesEnforcement.cupedCalculation)
        && Objects.equals(
            this.defaultDuration,
            experimentsPublicProtocolResponseDataAttributesEnforcement.defaultDuration)
        && Objects.equals(
            this.environment,
            experimentsPublicProtocolResponseDataAttributesEnforcement.environment)
        && Objects.equals(
            this.flagSource, experimentsPublicProtocolResponseDataAttributesEnforcement.flagSource)
        && Objects.equals(
            this.multipleTestingCorrection,
            experimentsPublicProtocolResponseDataAttributesEnforcement.multipleTestingCorrection)
        && Objects.equals(
            this.notifications,
            experimentsPublicProtocolResponseDataAttributesEnforcement.notifications)
        && Objects.equals(
            this.primaryMetric,
            experimentsPublicProtocolResponseDataAttributesEnforcement.primaryMetric)
        && Objects.equals(
            this.secondaryMetrics,
            experimentsPublicProtocolResponseDataAttributesEnforcement.secondaryMetrics)
        && Objects.equals(
            this.splitByExplorationDimensions,
            experimentsPublicProtocolResponseDataAttributesEnforcement.splitByExplorationDimensions)
        && Objects.equals(
            this.subjectType,
            experimentsPublicProtocolResponseDataAttributesEnforcement.subjectType)
        && Objects.equals(
            this.targetingRules,
            experimentsPublicProtocolResponseDataAttributesEnforcement.targetingRules)
        && Objects.equals(
            this.trafficExposure,
            experimentsPublicProtocolResponseDataAttributesEnforcement.trafficExposure)
        && Objects.equals(
            this.warehouseExposureSource,
            experimentsPublicProtocolResponseDataAttributesEnforcement.warehouseExposureSource)
        && Objects.equals(
            this.additionalProperties,
            experimentsPublicProtocolResponseDataAttributesEnforcement.additionalProperties);
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
    sb.append("class ExperimentsPublicProtocolResponseDataAttributesEnforcement {\n");
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
