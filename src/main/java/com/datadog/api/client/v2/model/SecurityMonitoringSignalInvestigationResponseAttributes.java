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

/** Attributes of a signal investigation response. */
@JsonPropertyOrder({
  SecurityMonitoringSignalInvestigationResponseAttributes.JSON_PROPERTY_INVESTIGATION_ID,
  SecurityMonitoringSignalInvestigationResponseAttributes.JSON_PROPERTY_RULE_ID,
  SecurityMonitoringSignalInvestigationResponseAttributes.JSON_PROPERTY_SIGNAL_ID,
  SecurityMonitoringSignalInvestigationResponseAttributes.JSON_PROPERTY_STATE,
  SecurityMonitoringSignalInvestigationResponseAttributes.JSON_PROPERTY_STEP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalInvestigationResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INVESTIGATION_ID = "investigation_id";
  private String investigationId;

  public static final String JSON_PROPERTY_RULE_ID = "rule_id";
  private String ruleId;

  public static final String JSON_PROPERTY_SIGNAL_ID = "signal_id";
  private String signalId;

  public static final String JSON_PROPERTY_STATE = "state";
  private SecurityMonitoringSignalInvestigationState state;

  public static final String JSON_PROPERTY_STEP = "step";
  private SecurityMonitoringSignalInvestigationStep step;

  public SecurityMonitoringSignalInvestigationResponseAttributes() {}

  @JsonCreator
  public SecurityMonitoringSignalInvestigationResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_INVESTIGATION_ID) String investigationId,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE_ID) String ruleId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SIGNAL_ID) String signalId) {
    this.investigationId = investigationId;
    this.ruleId = ruleId;
    this.signalId = signalId;
  }

  public SecurityMonitoringSignalInvestigationResponseAttributes investigationId(
      String investigationId) {
    this.investigationId = investigationId;
    return this;
  }

  /**
   * The unique ID of the investigation.
   *
   * @return investigationId
   */
  @JsonProperty(JSON_PROPERTY_INVESTIGATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInvestigationId() {
    return investigationId;
  }

  public void setInvestigationId(String investigationId) {
    this.investigationId = investigationId;
  }

  public SecurityMonitoringSignalInvestigationResponseAttributes ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  /**
   * The ID of the rule that triggered the signal.
   *
   * @return ruleId
   */
  @JsonProperty(JSON_PROPERTY_RULE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

  public SecurityMonitoringSignalInvestigationResponseAttributes signalId(String signalId) {
    this.signalId = signalId;
    return this;
  }

  /**
   * The unique ID of the security signal.
   *
   * @return signalId
   */
  @JsonProperty(JSON_PROPERTY_SIGNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSignalId() {
    return signalId;
  }

  public void setSignalId(String signalId) {
    this.signalId = signalId;
  }

  public SecurityMonitoringSignalInvestigationResponseAttributes state(
      SecurityMonitoringSignalInvestigationState state) {
    this.state = state;
    this.unparsed |= !state.isValid();
    return this;
  }

  /**
   * The state of the investigation.
   *
   * @return state
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringSignalInvestigationState getState() {
    return state;
  }

  public void setState(SecurityMonitoringSignalInvestigationState state) {
    if (!state.isValid()) {
      this.unparsed = true;
    }
    this.state = state;
  }

  public SecurityMonitoringSignalInvestigationResponseAttributes step(
      SecurityMonitoringSignalInvestigationStep step) {
    this.step = step;
    this.unparsed |= step.unparsed;
    return this;
  }

  /**
   * Information about an investigation step.
   *
   * @return step
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringSignalInvestigationStep getStep() {
    return step;
  }

  public void setStep(SecurityMonitoringSignalInvestigationStep step) {
    this.step = step;
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
   * @return SecurityMonitoringSignalInvestigationResponseAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringSignalInvestigationResponseAttributes putAdditionalProperty(
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
   * Return true if this SecurityMonitoringSignalInvestigationResponseAttributes object is equal to
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
    SecurityMonitoringSignalInvestigationResponseAttributes
        securityMonitoringSignalInvestigationResponseAttributes =
            (SecurityMonitoringSignalInvestigationResponseAttributes) o;
    return Objects.equals(
            this.investigationId,
            securityMonitoringSignalInvestigationResponseAttributes.investigationId)
        && Objects.equals(
            this.ruleId, securityMonitoringSignalInvestigationResponseAttributes.ruleId)
        && Objects.equals(
            this.signalId, securityMonitoringSignalInvestigationResponseAttributes.signalId)
        && Objects.equals(this.state, securityMonitoringSignalInvestigationResponseAttributes.state)
        && Objects.equals(this.step, securityMonitoringSignalInvestigationResponseAttributes.step)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringSignalInvestigationResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(investigationId, ruleId, signalId, state, step, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalInvestigationResponseAttributes {\n");
    sb.append("    investigationId: ").append(toIndentedString(investigationId)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    signalId: ").append(toIndentedString(signalId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
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
