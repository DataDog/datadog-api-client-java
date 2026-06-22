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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The remediation plan proposed by the ECS remediation agent. */
@JsonPropertyOrder({
  RemediationPlan.JSON_PROPERTY_CONFIDENCE,
  RemediationPlan.JSON_PROPERTY_EVIDENCE,
  RemediationPlan.JSON_PROPERTY_EXPLANATION,
  RemediationPlan.JSON_PROPERTY_GUARDRAIL_DECISION,
  RemediationPlan.JSON_PROPERTY_PLAN_SOURCE,
  RemediationPlan.JSON_PROPERTY_PROPOSED_FIX,
  RemediationPlan.JSON_PROPERTY_STATUS,
  RemediationPlan.JSON_PROPERTY_STEPS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RemediationPlan {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIDENCE = "confidence";
  private RemediationConfidence confidence;

  public static final String JSON_PROPERTY_EVIDENCE = "evidence";
  private String evidence;

  public static final String JSON_PROPERTY_EXPLANATION = "explanation";
  private String explanation;

  public static final String JSON_PROPERTY_GUARDRAIL_DECISION = "guardrail_decision";
  private RemediationGuardrailDecision guardrailDecision;

  public static final String JSON_PROPERTY_PLAN_SOURCE = "plan_source";
  private RemediationPlanSource planSource;

  public static final String JSON_PROPERTY_PROPOSED_FIX = "proposed_fix";
  private List<RemediationProposedFix> proposedFix = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private RemediationPlanStatus status;

  public static final String JSON_PROPERTY_STEPS = "steps";
  private List<RemediationStep> steps = null;

  public RemediationPlan confidence(RemediationConfidence confidence) {
    this.confidence = confidence;
    this.unparsed |= !confidence.isValid();
    return this;
  }

  /**
   * The agent's self-rated confidence in a plan.
   *
   * @return confidence
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIDENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RemediationConfidence getConfidence() {
    return confidence;
  }

  public void setConfidence(RemediationConfidence confidence) {
    if (!confidence.isValid()) {
      this.unparsed = true;
    }
    this.confidence = confidence;
  }

  public RemediationPlan evidence(String evidence) {
    this.evidence = evidence;
    return this;
  }

  /**
   * Evidence supporting the diagnosis. Treat as user-provided content and escape before display.
   *
   * @return evidence
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVIDENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEvidence() {
    return evidence;
  }

  public void setEvidence(String evidence) {
    this.evidence = evidence;
  }

  public RemediationPlan explanation(String explanation) {
    this.explanation = explanation;
    return this;
  }

  /**
   * Human-readable summary of why the plan was proposed. Treat as user-provided content and escape
   * before display.
   *
   * @return explanation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPLANATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExplanation() {
    return explanation;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }

  public RemediationPlan guardrailDecision(RemediationGuardrailDecision guardrailDecision) {
    this.guardrailDecision = guardrailDecision;
    this.unparsed |= guardrailDecision.unparsed;
    return this;
  }

  /**
   * The guardrail decision applied to a plan or investigation.
   *
   * @return guardrailDecision
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GUARDRAIL_DECISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RemediationGuardrailDecision getGuardrailDecision() {
    return guardrailDecision;
  }

  public void setGuardrailDecision(RemediationGuardrailDecision guardrailDecision) {
    this.guardrailDecision = guardrailDecision;
  }

  public RemediationPlan planSource(RemediationPlanSource planSource) {
    this.planSource = planSource;
    this.unparsed |= !planSource.isValid();
    return this;
  }

  /**
   * How the plan was produced.
   *
   * @return planSource
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAN_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RemediationPlanSource getPlanSource() {
    return planSource;
  }

  public void setPlanSource(RemediationPlanSource planSource) {
    if (!planSource.isValid()) {
      this.unparsed = true;
    }
    this.planSource = planSource;
  }

  public RemediationPlan proposedFix(List<RemediationProposedFix> proposedFix) {
    this.proposedFix = proposedFix;
    for (RemediationProposedFix item : proposedFix) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public RemediationPlan addProposedFixItem(RemediationProposedFix proposedFixItem) {
    if (this.proposedFix == null) {
      this.proposedFix = new ArrayList<>();
    }
    this.proposedFix.add(proposedFixItem);
    this.unparsed |= proposedFixItem.unparsed;
    return this;
  }

  /**
   * Recommendation-oriented view of the candidate remediations, distinct from the
   * execution-oriented steps.
   *
   * @return proposedFix
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPOSED_FIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RemediationProposedFix> getProposedFix() {
    return proposedFix;
  }

  public void setProposedFix(List<RemediationProposedFix> proposedFix) {
    this.proposedFix = proposedFix;
  }

  public RemediationPlan status(RemediationPlanStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Plan status.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RemediationPlanStatus getStatus() {
    return status;
  }

  public void setStatus(RemediationPlanStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public RemediationPlan steps(List<RemediationStep> steps) {
    this.steps = steps;
    for (RemediationStep item : steps) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public RemediationPlan addStepsItem(RemediationStep stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    this.unparsed |= stepsItem.unparsed;
    return this;
  }

  /**
   * Execution-oriented steps that make up the plan.
   *
   * @return steps
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RemediationStep> getSteps() {
    return steps;
  }

  public void setSteps(List<RemediationStep> steps) {
    this.steps = steps;
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
   * @return RemediationPlan
   */
  @JsonAnySetter
  public RemediationPlan putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RemediationPlan object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemediationPlan remediationPlan = (RemediationPlan) o;
    return Objects.equals(this.confidence, remediationPlan.confidence)
        && Objects.equals(this.evidence, remediationPlan.evidence)
        && Objects.equals(this.explanation, remediationPlan.explanation)
        && Objects.equals(this.guardrailDecision, remediationPlan.guardrailDecision)
        && Objects.equals(this.planSource, remediationPlan.planSource)
        && Objects.equals(this.proposedFix, remediationPlan.proposedFix)
        && Objects.equals(this.status, remediationPlan.status)
        && Objects.equals(this.steps, remediationPlan.steps)
        && Objects.equals(this.additionalProperties, remediationPlan.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        confidence,
        evidence,
        explanation,
        guardrailDecision,
        planSource,
        proposedFix,
        status,
        steps,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemediationPlan {\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    evidence: ").append(toIndentedString(evidence)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    guardrailDecision: ").append(toIndentedString(guardrailDecision)).append("\n");
    sb.append("    planSource: ").append(toIndentedString(planSource)).append("\n");
    sb.append("    proposedFix: ").append(toIndentedString(proposedFix)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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
