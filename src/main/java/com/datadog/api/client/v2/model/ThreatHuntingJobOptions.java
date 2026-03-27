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

/** Job options. */
@JsonPropertyOrder({
  ThreatHuntingJobOptions.JSON_PROPERTY_ANOMALY_DETECTION_OPTIONS,
  ThreatHuntingJobOptions.JSON_PROPERTY_DETECTION_METHOD,
  ThreatHuntingJobOptions.JSON_PROPERTY_EVALUATION_WINDOW,
  ThreatHuntingJobOptions.JSON_PROPERTY_IMPOSSIBLE_TRAVEL_OPTIONS,
  ThreatHuntingJobOptions.JSON_PROPERTY_KEEP_ALIVE,
  ThreatHuntingJobOptions.JSON_PROPERTY_MAX_SIGNAL_DURATION,
  ThreatHuntingJobOptions.JSON_PROPERTY_NEW_VALUE_OPTIONS,
  ThreatHuntingJobOptions.JSON_PROPERTY_SEQUENCE_DETECTION_OPTIONS,
  ThreatHuntingJobOptions.JSON_PROPERTY_THIRD_PARTY_RULE_OPTIONS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ThreatHuntingJobOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANOMALY_DETECTION_OPTIONS = "anomalyDetectionOptions";
  private SecurityMonitoringRuleAnomalyDetectionOptions anomalyDetectionOptions;

  public static final String JSON_PROPERTY_DETECTION_METHOD = "detectionMethod";
  private SecurityMonitoringRuleDetectionMethod detectionMethod;

  public static final String JSON_PROPERTY_EVALUATION_WINDOW = "evaluationWindow";
  private SecurityMonitoringRuleEvaluationWindow evaluationWindow;

  public static final String JSON_PROPERTY_IMPOSSIBLE_TRAVEL_OPTIONS = "impossibleTravelOptions";
  private SecurityMonitoringRuleImpossibleTravelOptions impossibleTravelOptions;

  public static final String JSON_PROPERTY_KEEP_ALIVE = "keepAlive";
  private SecurityMonitoringRuleKeepAlive keepAlive;

  public static final String JSON_PROPERTY_MAX_SIGNAL_DURATION = "maxSignalDuration";
  private SecurityMonitoringRuleMaxSignalDuration maxSignalDuration;

  public static final String JSON_PROPERTY_NEW_VALUE_OPTIONS = "newValueOptions";
  private SecurityMonitoringRuleNewValueOptions newValueOptions;

  public static final String JSON_PROPERTY_SEQUENCE_DETECTION_OPTIONS = "sequenceDetectionOptions";
  private SecurityMonitoringRuleSequenceDetectionOptions sequenceDetectionOptions;

  public static final String JSON_PROPERTY_THIRD_PARTY_RULE_OPTIONS = "thirdPartyRuleOptions";
  private SecurityMonitoringRuleThirdPartyOptions thirdPartyRuleOptions;

  public ThreatHuntingJobOptions anomalyDetectionOptions(
      SecurityMonitoringRuleAnomalyDetectionOptions anomalyDetectionOptions) {
    this.anomalyDetectionOptions = anomalyDetectionOptions;
    this.unparsed |= anomalyDetectionOptions.unparsed;
    return this;
  }

  /**
   * Options on anomaly detection method.
   *
   * @return anomalyDetectionOptions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANOMALY_DETECTION_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringRuleAnomalyDetectionOptions getAnomalyDetectionOptions() {
    return anomalyDetectionOptions;
  }

  public void setAnomalyDetectionOptions(
      SecurityMonitoringRuleAnomalyDetectionOptions anomalyDetectionOptions) {
    this.anomalyDetectionOptions = anomalyDetectionOptions;
  }

  public ThreatHuntingJobOptions detectionMethod(
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

  public ThreatHuntingJobOptions evaluationWindow(
      SecurityMonitoringRuleEvaluationWindow evaluationWindow) {
    this.evaluationWindow = evaluationWindow;
    this.unparsed |= !evaluationWindow.isValid();
    return this;
  }

  /**
   * A time window is specified to match when at least one of the cases matches true. This is a
   * sliding window and evaluates in real time. For third party detection method, this field is not
   * used.
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

  public ThreatHuntingJobOptions impossibleTravelOptions(
      SecurityMonitoringRuleImpossibleTravelOptions impossibleTravelOptions) {
    this.impossibleTravelOptions = impossibleTravelOptions;
    this.unparsed |= impossibleTravelOptions.unparsed;
    return this;
  }

  /**
   * Options on impossible travel detection method.
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

  public ThreatHuntingJobOptions keepAlive(SecurityMonitoringRuleKeepAlive keepAlive) {
    this.keepAlive = keepAlive;
    this.unparsed |= !keepAlive.isValid();
    return this;
  }

  /**
   * Once a signal is generated, the signal will remain "open" if a case is matched at least once
   * within this keep alive window. For third party detection method, this field is not used.
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

  public ThreatHuntingJobOptions maxSignalDuration(
      SecurityMonitoringRuleMaxSignalDuration maxSignalDuration) {
    this.maxSignalDuration = maxSignalDuration;
    this.unparsed |= !maxSignalDuration.isValid();
    return this;
  }

  /**
   * A signal will "close" regardless of the query being matched once the time exceeds the maximum
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

  public ThreatHuntingJobOptions newValueOptions(
      SecurityMonitoringRuleNewValueOptions newValueOptions) {
    this.newValueOptions = newValueOptions;
    this.unparsed |= newValueOptions.unparsed;
    return this;
  }

  /**
   * Options on new value detection method.
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

  public ThreatHuntingJobOptions sequenceDetectionOptions(
      SecurityMonitoringRuleSequenceDetectionOptions sequenceDetectionOptions) {
    this.sequenceDetectionOptions = sequenceDetectionOptions;
    this.unparsed |= sequenceDetectionOptions.unparsed;
    return this;
  }

  /**
   * Options on sequence detection method.
   *
   * @return sequenceDetectionOptions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEQUENCE_DETECTION_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringRuleSequenceDetectionOptions getSequenceDetectionOptions() {
    return sequenceDetectionOptions;
  }

  public void setSequenceDetectionOptions(
      SecurityMonitoringRuleSequenceDetectionOptions sequenceDetectionOptions) {
    this.sequenceDetectionOptions = sequenceDetectionOptions;
  }

  public ThreatHuntingJobOptions thirdPartyRuleOptions(
      SecurityMonitoringRuleThirdPartyOptions thirdPartyRuleOptions) {
    this.thirdPartyRuleOptions = thirdPartyRuleOptions;
    this.unparsed |= thirdPartyRuleOptions.unparsed;
    return this;
  }

  /**
   * Options on third party detection method.
   *
   * @return thirdPartyRuleOptions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THIRD_PARTY_RULE_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringRuleThirdPartyOptions getThirdPartyRuleOptions() {
    return thirdPartyRuleOptions;
  }

  public void setThirdPartyRuleOptions(
      SecurityMonitoringRuleThirdPartyOptions thirdPartyRuleOptions) {
    this.thirdPartyRuleOptions = thirdPartyRuleOptions;
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
   * @return ThreatHuntingJobOptions
   */
  @JsonAnySetter
  public ThreatHuntingJobOptions putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ThreatHuntingJobOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreatHuntingJobOptions threatHuntingJobOptions = (ThreatHuntingJobOptions) o;
    return Objects.equals(
            this.anomalyDetectionOptions, threatHuntingJobOptions.anomalyDetectionOptions)
        && Objects.equals(this.detectionMethod, threatHuntingJobOptions.detectionMethod)
        && Objects.equals(this.evaluationWindow, threatHuntingJobOptions.evaluationWindow)
        && Objects.equals(
            this.impossibleTravelOptions, threatHuntingJobOptions.impossibleTravelOptions)
        && Objects.equals(this.keepAlive, threatHuntingJobOptions.keepAlive)
        && Objects.equals(this.maxSignalDuration, threatHuntingJobOptions.maxSignalDuration)
        && Objects.equals(this.newValueOptions, threatHuntingJobOptions.newValueOptions)
        && Objects.equals(
            this.sequenceDetectionOptions, threatHuntingJobOptions.sequenceDetectionOptions)
        && Objects.equals(this.thirdPartyRuleOptions, threatHuntingJobOptions.thirdPartyRuleOptions)
        && Objects.equals(this.additionalProperties, threatHuntingJobOptions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        anomalyDetectionOptions,
        detectionMethod,
        evaluationWindow,
        impossibleTravelOptions,
        keepAlive,
        maxSignalDuration,
        newValueOptions,
        sequenceDetectionOptions,
        thirdPartyRuleOptions,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreatHuntingJobOptions {\n");
    sb.append("    anomalyDetectionOptions: ")
        .append(toIndentedString(anomalyDetectionOptions))
        .append("\n");
    sb.append("    detectionMethod: ").append(toIndentedString(detectionMethod)).append("\n");
    sb.append("    evaluationWindow: ").append(toIndentedString(evaluationWindow)).append("\n");
    sb.append("    impossibleTravelOptions: ")
        .append(toIndentedString(impossibleTravelOptions))
        .append("\n");
    sb.append("    keepAlive: ").append(toIndentedString(keepAlive)).append("\n");
    sb.append("    maxSignalDuration: ").append(toIndentedString(maxSignalDuration)).append("\n");
    sb.append("    newValueOptions: ").append(toIndentedString(newValueOptions)).append("\n");
    sb.append("    sequenceDetectionOptions: ")
        .append(toIndentedString(sequenceDetectionOptions))
        .append("\n");
    sb.append("    thirdPartyRuleOptions: ")
        .append(toIndentedString(thirdPartyRuleOptions))
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
