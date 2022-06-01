/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Options on rules. */
@JsonPropertyOrder({
  SecurityMonitoringRuleOptions.JSON_PROPERTY_DETECTION_METHOD,
  SecurityMonitoringRuleOptions.JSON_PROPERTY_EVALUATION_WINDOW,
  SecurityMonitoringRuleOptions.JSON_PROPERTY_HARDCODED_EVALUATOR_TYPE,
  SecurityMonitoringRuleOptions.JSON_PROPERTY_IMPOSSIBLE_TRAVEL_OPTIONS,
  SecurityMonitoringRuleOptions.JSON_PROPERTY_KEEP_ALIVE,
  SecurityMonitoringRuleOptions.JSON_PROPERTY_MAX_SIGNAL_DURATION,
  SecurityMonitoringRuleOptions.JSON_PROPERTY_NEW_VALUE_OPTIONS
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringRuleOptions {
  @JsonIgnore public boolean unparsed = false;
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEW_VALUE_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringRuleNewValueOptions getNewValueOptions() {
    return newValueOptions;
  }

  public void setNewValueOptions(SecurityMonitoringRuleNewValueOptions newValueOptions) {
    this.newValueOptions = newValueOptions;
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
    return Objects.equals(this.detectionMethod, securityMonitoringRuleOptions.detectionMethod)
        && Objects.equals(this.evaluationWindow, securityMonitoringRuleOptions.evaluationWindow)
        && Objects.equals(
            this.hardcodedEvaluatorType, securityMonitoringRuleOptions.hardcodedEvaluatorType)
        && Objects.equals(
            this.impossibleTravelOptions, securityMonitoringRuleOptions.impossibleTravelOptions)
        && Objects.equals(this.keepAlive, securityMonitoringRuleOptions.keepAlive)
        && Objects.equals(this.maxSignalDuration, securityMonitoringRuleOptions.maxSignalDuration)
        && Objects.equals(this.newValueOptions, securityMonitoringRuleOptions.newValueOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        detectionMethod,
        evaluationWindow,
        hardcodedEvaluatorType,
        impossibleTravelOptions,
        keepAlive,
        maxSignalDuration,
        newValueOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringRuleOptions {\n");
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
