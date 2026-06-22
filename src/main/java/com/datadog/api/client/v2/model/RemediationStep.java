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

/** A single execution-oriented step in a remediation plan. */
@JsonPropertyOrder({
  RemediationStep.JSON_PROPERTY_ACTION_FQN,
  RemediationStep.JSON_PROPERTY_APPROVAL_STATE,
  RemediationStep.JSON_PROPERTY_DESCRIPTION,
  RemediationStep.JSON_PROPERTY_REVERSIBLE,
  RemediationStep.JSON_PROPERTY_RISK,
  RemediationStep.JSON_PROPERTY_STEP_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RemediationStep {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION_FQN = "action_fqn";
  private String actionFqn;

  public static final String JSON_PROPERTY_APPROVAL_STATE = "approval_state";
  private RemediationStepApprovalState approvalState;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_REVERSIBLE = "reversible";
  private Boolean reversible;

  public static final String JSON_PROPERTY_RISK = "risk";
  private RemediationRiskLevel risk;

  public static final String JSON_PROPERTY_STEP_ID = "step_id";
  private String stepId;

  public RemediationStep actionFqn(String actionFqn) {
    this.actionFqn = actionFqn;
    return this;
  }

  /**
   * Fully qualified action type, for example ecs.update_service_memory.
   *
   * @return actionFqn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTION_FQN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getActionFqn() {
    return actionFqn;
  }

  public void setActionFqn(String actionFqn) {
    this.actionFqn = actionFqn;
  }

  public RemediationStep approvalState(RemediationStepApprovalState approvalState) {
    this.approvalState = approvalState;
    this.unparsed |= !approvalState.isValid();
    return this;
  }

  /**
   * Approval state for a remediation step.
   *
   * @return approvalState
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPROVAL_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RemediationStepApprovalState getApprovalState() {
    return approvalState;
  }

  public void setApprovalState(RemediationStepApprovalState approvalState) {
    if (!approvalState.isValid()) {
      this.unparsed = true;
    }
    this.approvalState = approvalState;
  }

  public RemediationStep description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Human-readable description of the step.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RemediationStep reversible(Boolean reversible) {
    this.reversible = reversible;
    return this;
  }

  /**
   * Whether the step can be reversed after execution.
   *
   * @return reversible
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVERSIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getReversible() {
    return reversible;
  }

  public void setReversible(Boolean reversible) {
    this.reversible = reversible;
  }

  public RemediationStep risk(RemediationRiskLevel risk) {
    this.risk = risk;
    this.unparsed |= !risk.isValid();
    return this;
  }

  /**
   * Estimated risk of a remediation step or proposed fix.
   *
   * @return risk
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RISK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RemediationRiskLevel getRisk() {
    return risk;
  }

  public void setRisk(RemediationRiskLevel risk) {
    if (!risk.isValid()) {
      this.unparsed = true;
    }
    this.risk = risk;
  }

  public RemediationStep stepId(String stepId) {
    this.stepId = stepId;
    return this;
  }

  /**
   * Unique ID for the step within the plan.
   *
   * @return stepId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStepId() {
    return stepId;
  }

  public void setStepId(String stepId) {
    this.stepId = stepId;
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
   * @return RemediationStep
   */
  @JsonAnySetter
  public RemediationStep putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RemediationStep object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemediationStep remediationStep = (RemediationStep) o;
    return Objects.equals(this.actionFqn, remediationStep.actionFqn)
        && Objects.equals(this.approvalState, remediationStep.approvalState)
        && Objects.equals(this.description, remediationStep.description)
        && Objects.equals(this.reversible, remediationStep.reversible)
        && Objects.equals(this.risk, remediationStep.risk)
        && Objects.equals(this.stepId, remediationStep.stepId)
        && Objects.equals(this.additionalProperties, remediationStep.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actionFqn, approvalState, description, reversible, risk, stepId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemediationStep {\n");
    sb.append("    actionFqn: ").append(toIndentedString(actionFqn)).append("\n");
    sb.append("    approvalState: ").append(toIndentedString(approvalState)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    reversible: ").append(toIndentedString(reversible)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    stepId: ").append(toIndentedString(stepId)).append("\n");
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
