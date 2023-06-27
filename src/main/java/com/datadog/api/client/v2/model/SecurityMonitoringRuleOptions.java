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

/** Options on rules. */
@JsonPropertyOrder({
  SecurityMonitoringRuleOptions.JSON_PROPERTY_COMPLIANCE_RULE_OPTIONS,
  SecurityMonitoringRuleOptions.JSON_PROPERTY_DECREASE_CRITICALITY_BASED_ON_ENV,
  SecurityMonitoringRuleOptions.JSON_PROPERTY_DETECTION_METHOD,
  SecurityMonitoringRuleOptions.JSON_PROPERTY_EVALUATION_WINDOW,
  SecurityMonitoringRuleOptions.JSON_PROPERTY_HARDCODED_EVALUATOR_TYPE,
  SecurityMonitoringRuleOptions.JSON_PROPERTY_IMPOSSIBLE_TRAVEL_OPTIONS,
  SecurityMonitoringRuleOptions.JSON_PROPERTY_KEEP_ALIVE,
  SecurityMonitoringRuleOptions.JSON_PROPERTY_MAX_SIGNAL_DURATION,
  SecurityMonitoringRuleOptions.JSON_PROPERTY_NEW_VALUE_OPTIONS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringRuleOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPLIANCE_RULE_OPTIONS = "complianceRuleOptions";
  private CloudConfigurationComplianceRuleOptions complianceRuleOptions;

  public static final String JSON_PROPERTY_DECREASE_CRITICALITY_BASED_ON_ENV =
      "decreaseCriticalityBasedOnEnv";
  private Boolean decreaseCriticalityBasedOnEnv;

  public static final String JSON_PROPERTY_DETECTION_METHOD = "detectionMethod";
  private SecurityMonitoringRuleDetectionMethod detectionMethod;

  public static final String JSON_PROPERTY_EVALUATION_WINDOW = "evaluationWindow";
  private SecurityMonitoringRuleEvaluationWindow evaluationWindow;

  public static final String JSON_PROPERTY_HARDCODED_EVALUATOR_TYPE = "hardcodedEvaluatorType";
  private SecurityMonitoringRuleHardcodedEvaluatorType hardcodedEvaluatorType;

  public static final String JSON_PROPERTY_IMPOSSIBLE_TRAVEL_OPTIONS = "impossibleTravelOptions";
  private SecurityMonitoringRuleImpossibleTravelOptions impossibleTravelOptions;

  public static final String JSON_PROPERTY_KEEP_ALIVE = "keepAlive";
  private SecurityMonitoringRuleKeepAlive keepAlive;

  public static final String JSON_PROPERTY_MAX_SIGNAL_DURATION = "maxSignalDuration";
  private SecurityMonitoringRuleMaxSignalDuration maxSignalDuration;

  public static final String JSON_PROPERTY_NEW_VALUE_OPTIONS = "newValueOptions";
  private SecurityMonitoringRuleNewValueOptions newValueOptions;

  public SecurityMonitoringRuleOptions complianceRuleOptions(
      CloudConfigurationComplianceRuleOptions complianceRuleOptions) {
    this.complianceRuleOptions = complianceRuleOptions;
    this.unparsed |= complianceRuleOptions.unparsed;
    return this;
  }

  /**
   * Options for cloud_configuration rules. Fields <code>resourceType</code> and <code>regoRule
   * </code> are mandatory when managing custom <code>cloud_configuration</code> rules.
   *
   * @return complianceRuleOptions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLIANCE_RULE_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CloudConfigurationComplianceRuleOptions getComplianceRuleOptions() {
    return complianceRuleOptions;
  }

  public void setComplianceRuleOptions(
      CloudConfigurationComplianceRuleOptions complianceRuleOptions) {
    this.complianceRuleOptions = complianceRuleOptions;
  }

  public SecurityMonitoringRuleOptions decreaseCriticalityBasedOnEnv(
      Boolean decreaseCriticalityBasedOnEnv) {
    this.decreaseCriticalityBasedOnEnv = decreaseCriticalityBasedOnEnv;
    return this;
  }

  /**
   * If true, signals in non-production environments have a lower severity than what is defined by
   * the rule case, which can reduce signal noise. The severity is decreased by one level: <code>
   * CRITICAL</code> in production becomes <code>HIGH</code> in non-production, <code>HIGH</code>
   * becomes <code>MEDIUM</code> and so on. <code>INFO</code> remains <code>INFO</code>. The
   * decrement is applied when the environment tag of the signal starts with <code>staging</code>,
   * <code>test</code> or <code>dev</code>.
   *
   * @return decreaseCriticalityBasedOnEnv
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DECREASE_CRITICALITY_BASED_ON_ENV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDecreaseCriticalityBasedOnEnv() {
    return decreaseCriticalityBasedOnEnv;
  }

  public void setDecreaseCriticalityBasedOnEnv(Boolean decreaseCriticalityBasedOnEnv) {
    this.decreaseCriticalityBasedOnEnv = decreaseCriticalityBasedOnEnv;
  }

  public SecurityMonitoringRuleOptions detectionMethod(
      SecurityMonitoringRuleDetectionMethod detectionMethod) {
    this.detectionMethod = detectionMethod;
    this.unparsed |= !detectionMethod.isValid();
    return this;
  }

  /**
   * The detection method.
   *
   * @return detectionMethod
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETECTION_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringRuleDetectionMethod getDetectionMethod() {
    return detectionMethod;
  }

  public void setDetectionMethod(SecurityMonitoringRuleDetectionMethod detectionMethod) {
    if (!detectionMethod.isValid()) {
      this.unparsed = true;
    }
    this.detectionMethod = detectionMethod;
  }

  public SecurityMonitoringRuleOptions evaluationWindow(
      SecurityMonitoringRuleEvaluationWindow evaluationWindow) {
    this.evaluationWindow = evaluationWindow;
    this.unparsed |= !evaluationWindow.isValid();
    return this;
  }

  /**
   * A time window is specified to match when at least one of the cases matches true. This is a
   * sliding window and evaluates in real time.
   *
   * @return evaluationWindow
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVALUATION_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringRuleEvaluationWindow getEvaluationWindow() {
    return evaluationWindow;
  }

  public void setEvaluationWindow(SecurityMonitoringRuleEvaluationWindow evaluationWindow) {
    if (!evaluationWindow.isValid()) {
      this.unparsed = true;
    }
    this.evaluationWindow = evaluationWindow;
  }

  public SecurityMonitoringRuleOptions hardcodedEvaluatorType(
      SecurityMonitoringRuleHardcodedEvaluatorType hardcodedEvaluatorType) {
    this.hardcodedEvaluatorType = hardcodedEvaluatorType;
    this.unparsed |= !hardcodedEvaluatorType.isValid();
    return this;
  }

  /**
   * Hardcoded evaluator type.
   *
   * @return hardcodedEvaluatorType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HARDCODED_EVALUATOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringRuleHardcodedEvaluatorType getHardcodedEvaluatorType() {
    return hardcodedEvaluatorType;
  }

  public void setHardcodedEvaluatorType(
      SecurityMonitoringRuleHardcodedEvaluatorType hardcodedEvaluatorType) {
    if (!hardcodedEvaluatorType.isValid()) {
      this.unparsed = true;
    }
    this.hardcodedEvaluatorType = hardcodedEvaluatorType;
  }

  public SecurityMonitoringRuleOptions impossibleTravelOptions(
      SecurityMonitoringRuleImpossibleTravelOptions impossibleTravelOptions) {
    this.impossibleTravelOptions = impossibleTravelOptions;
    this.unparsed |= impossibleTravelOptions.unparsed;
    return this;
  }

  /**
   * Options on impossible travel rules.
   *
   * @return impossibleTravelOptions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMPOSSIBLE_TRAVEL_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringRuleImpossibleTravelOptions getImpossibleTravelOptions() {
    return impossibleTravelOptions;
  }

  public void setImpossibleTravelOptions(
      SecurityMonitoringRuleImpossibleTravelOptions impossibleTravelOptions) {
    this.impossibleTravelOptions = impossibleTravelOptions;
  }

  public SecurityMonitoringRuleOptions keepAlive(SecurityMonitoringRuleKeepAlive keepAlive) {
    this.keepAlive = keepAlive;
    this.unparsed |= !keepAlive.isValid();
    return this;
  }

  /**
   * Once a signal is generated, the signal will remain “open” if a case is matched at least once
   * within this keep alive window.
   *
   * @return keepAlive
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEEP_ALIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringRuleKeepAlive getKeepAlive() {
    return keepAlive;
  }

  public void setKeepAlive(SecurityMonitoringRuleKeepAlive keepAlive) {
    if (!keepAlive.isValid()) {
      this.unparsed = true;
    }
    this.keepAlive = keepAlive;
  }

  public SecurityMonitoringRuleOptions maxSignalDuration(
      SecurityMonitoringRuleMaxSignalDuration maxSignalDuration) {
    this.maxSignalDuration = maxSignalDuration;
    this.unparsed |= !maxSignalDuration.isValid();
    return this;
  }

  /**
   * A signal will “close” regardless of the query being matched once the time exceeds the maximum
   * duration. This time is calculated from the first seen timestamp.
   *
   * @return maxSignalDuration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_SIGNAL_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringRuleMaxSignalDuration getMaxSignalDuration() {
    return maxSignalDuration;
  }

  public void setMaxSignalDuration(SecurityMonitoringRuleMaxSignalDuration maxSignalDuration) {
    if (!maxSignalDuration.isValid()) {
      this.unparsed = true;
    }
    this.maxSignalDuration = maxSignalDuration;
  }

  public SecurityMonitoringRuleOptions newValueOptions(
      SecurityMonitoringRuleNewValueOptions newValueOptions) {
    this.newValueOptions = newValueOptions;
    this.unparsed |= newValueOptions.unparsed;
    return this;
  }

  /**
   * Options on new value rules.
   *
   * @return newValueOptions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEW_VALUE_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringRuleNewValueOptions getNewValueOptions() {
    return newValueOptions;
  }

  public void setNewValueOptions(SecurityMonitoringRuleNewValueOptions newValueOptions) {
    this.newValueOptions = newValueOptions;
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
   * @return SecurityMonitoringRuleOptions
   */
  @JsonAnySetter
  public SecurityMonitoringRuleOptions putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityMonitoringRuleOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringRuleOptions securityMonitoringRuleOptions = (SecurityMonitoringRuleOptions) o;
    return Objects.equals(
            this.complianceRuleOptions, securityMonitoringRuleOptions.complianceRuleOptions)
        && Objects.equals(
            this.decreaseCriticalityBasedOnEnv,
            securityMonitoringRuleOptions.decreaseCriticalityBasedOnEnv)
        && Objects.equals(this.detectionMethod, securityMonitoringRuleOptions.detectionMethod)
        && Objects.equals(this.evaluationWindow, securityMonitoringRuleOptions.evaluationWindow)
        && Objects.equals(
            this.hardcodedEvaluatorType, securityMonitoringRuleOptions.hardcodedEvaluatorType)
        && Objects.equals(
            this.impossibleTravelOptions, securityMonitoringRuleOptions.impossibleTravelOptions)
        && Objects.equals(this.keepAlive, securityMonitoringRuleOptions.keepAlive)
        && Objects.equals(this.maxSignalDuration, securityMonitoringRuleOptions.maxSignalDuration)
        && Objects.equals(this.newValueOptions, securityMonitoringRuleOptions.newValueOptions)
        && Objects.equals(
            this.additionalProperties, securityMonitoringRuleOptions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        complianceRuleOptions,
        decreaseCriticalityBasedOnEnv,
        detectionMethod,
        evaluationWindow,
        hardcodedEvaluatorType,
        impossibleTravelOptions,
        keepAlive,
        maxSignalDuration,
        newValueOptions,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringRuleOptions {\n");
    sb.append("    complianceRuleOptions: ")
        .append(toIndentedString(complianceRuleOptions))
        .append("\n");
    sb.append("    decreaseCriticalityBasedOnEnv: ")
        .append(toIndentedString(decreaseCriticalityBasedOnEnv))
        .append("\n");
    sb.append("    detectionMethod: ").append(toIndentedString(detectionMethod)).append("\n");
    sb.append("    evaluationWindow: ").append(toIndentedString(evaluationWindow)).append("\n");
    sb.append("    hardcodedEvaluatorType: ")
        .append(toIndentedString(hardcodedEvaluatorType))
        .append("\n");
    sb.append("    impossibleTravelOptions: ")
        .append(toIndentedString(impossibleTravelOptions))
        .append("\n");
    sb.append("    keepAlive: ").append(toIndentedString(keepAlive)).append("\n");
    sb.append("    maxSignalDuration: ").append(toIndentedString(maxSignalDuration)).append("\n");
    sb.append("    newValueOptions: ").append(toIndentedString(newValueOptions)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
