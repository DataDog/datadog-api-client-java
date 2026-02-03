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

/** Output from an investigation step. */
@JsonPropertyOrder({
  SecurityMonitoringSignalInvestigationStepOutput.JSON_PROPERTY_CURRENT_STEP_ANALYSIS_ONELINER,
  SecurityMonitoringSignalInvestigationStepOutput.JSON_PROPERTY_CURRENT_STEP_ANALYSIS_SUMMARY,
  SecurityMonitoringSignalInvestigationStepOutput.JSON_PROPERTY_NAME,
  SecurityMonitoringSignalInvestigationStepOutput.JSON_PROPERTY_VERDICT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalInvestigationStepOutput {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CURRENT_STEP_ANALYSIS_ONELINER =
      "currentStepAnalysisOneliner";
  private String currentStepAnalysisOneliner;

  public static final String JSON_PROPERTY_CURRENT_STEP_ANALYSIS_SUMMARY =
      "currentStepAnalysisSummary";
  private String currentStepAnalysisSummary;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VERDICT = "verdict";
  private SecurityMonitoringSignalInvestigationStepOutputVerdict verdict;

  public SecurityMonitoringSignalInvestigationStepOutput() {}

  @JsonCreator
  public SecurityMonitoringSignalInvestigationStepOutput(
      @JsonProperty(required = true, value = JSON_PROPERTY_CURRENT_STEP_ANALYSIS_SUMMARY)
          String currentStepAnalysisSummary,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERDICT)
          SecurityMonitoringSignalInvestigationStepOutputVerdict verdict) {
    this.currentStepAnalysisSummary = currentStepAnalysisSummary;
    this.name = name;
    this.verdict = verdict;
    this.unparsed |= !verdict.isValid();
  }

  public SecurityMonitoringSignalInvestigationStepOutput currentStepAnalysisOneliner(
      String currentStepAnalysisOneliner) {
    this.currentStepAnalysisOneliner = currentStepAnalysisOneliner;
    return this;
  }

  /**
   * A one-line summary of the step analysis.
   *
   * @return currentStepAnalysisOneliner
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_STEP_ANALYSIS_ONELINER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCurrentStepAnalysisOneliner() {
    return currentStepAnalysisOneliner;
  }

  public void setCurrentStepAnalysisOneliner(String currentStepAnalysisOneliner) {
    this.currentStepAnalysisOneliner = currentStepAnalysisOneliner;
  }

  public SecurityMonitoringSignalInvestigationStepOutput currentStepAnalysisSummary(
      String currentStepAnalysisSummary) {
    this.currentStepAnalysisSummary = currentStepAnalysisSummary;
    return this;
  }

  /**
   * A detailed summary of the step analysis.
   *
   * @return currentStepAnalysisSummary
   */
  @JsonProperty(JSON_PROPERTY_CURRENT_STEP_ANALYSIS_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCurrentStepAnalysisSummary() {
    return currentStepAnalysisSummary;
  }

  public void setCurrentStepAnalysisSummary(String currentStepAnalysisSummary) {
    this.currentStepAnalysisSummary = currentStepAnalysisSummary;
  }

  public SecurityMonitoringSignalInvestigationStepOutput name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the investigation step.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SecurityMonitoringSignalInvestigationStepOutput verdict(
      SecurityMonitoringSignalInvestigationStepOutputVerdict verdict) {
    this.verdict = verdict;
    this.unparsed |= !verdict.isValid();
    return this;
  }

  /**
   * The verdict from the investigation step.
   *
   * @return verdict
   */
  @JsonProperty(JSON_PROPERTY_VERDICT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringSignalInvestigationStepOutputVerdict getVerdict() {
    return verdict;
  }

  public void setVerdict(SecurityMonitoringSignalInvestigationStepOutputVerdict verdict) {
    if (!verdict.isValid()) {
      this.unparsed = true;
    }
    this.verdict = verdict;
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
   * @return SecurityMonitoringSignalInvestigationStepOutput
   */
  @JsonAnySetter
  public SecurityMonitoringSignalInvestigationStepOutput putAdditionalProperty(
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

  /** Return true if this SecurityMonitoringSignalInvestigationStepOutput object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalInvestigationStepOutput
        securityMonitoringSignalInvestigationStepOutput =
            (SecurityMonitoringSignalInvestigationStepOutput) o;
    return Objects.equals(
            this.currentStepAnalysisOneliner,
            securityMonitoringSignalInvestigationStepOutput.currentStepAnalysisOneliner)
        && Objects.equals(
            this.currentStepAnalysisSummary,
            securityMonitoringSignalInvestigationStepOutput.currentStepAnalysisSummary)
        && Objects.equals(this.name, securityMonitoringSignalInvestigationStepOutput.name)
        && Objects.equals(this.verdict, securityMonitoringSignalInvestigationStepOutput.verdict)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringSignalInvestigationStepOutput.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        currentStepAnalysisOneliner,
        currentStepAnalysisSummary,
        name,
        verdict,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalInvestigationStepOutput {\n");
    sb.append("    currentStepAnalysisOneliner: ")
        .append(toIndentedString(currentStepAnalysisOneliner))
        .append("\n");
    sb.append("    currentStepAnalysisSummary: ")
        .append(toIndentedString(currentStepAnalysisSummary))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    verdict: ").append(toIndentedString(verdict)).append("\n");
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
