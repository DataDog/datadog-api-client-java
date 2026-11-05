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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Attributes of an investigation. When <code>fields[investigations]</code> is set, only listed
 * attributes are returned. Attributes the investigation doesn't have yet are absent.
 */
@JsonPropertyOrder({
  SecurityAgentInvestigationAttributes.JSON_PROPERTY_CONCLUSION,
  SecurityAgentInvestigationAttributes.JSON_PROPERTY_CREATED_AT,
  SecurityAgentInvestigationAttributes.JSON_PROPERTY_KEY_ENTITIES,
  SecurityAgentInvestigationAttributes.JSON_PROPERTY_KEY_EVIDENCE,
  SecurityAgentInvestigationAttributes.JSON_PROPERTY_RESPONSE_SUGGESTIONS,
  SecurityAgentInvestigationAttributes.JSON_PROPERTY_RULE_ID,
  SecurityAgentInvestigationAttributes.JSON_PROPERTY_SIGNAL,
  SecurityAgentInvestigationAttributes.JSON_PROPERTY_SIGNAL_ID,
  SecurityAgentInvestigationAttributes.JSON_PROPERTY_STATE,
  SecurityAgentInvestigationAttributes.JSON_PROPERTY_STEPS,
  SecurityAgentInvestigationAttributes.JSON_PROPERTY_UPDATED_AT,
  SecurityAgentInvestigationAttributes.JSON_PROPERTY_VERDICT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityAgentInvestigationAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONCLUSION = "conclusion";
  private String conclusion;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_KEY_ENTITIES = "key_entities";
  private SecurityAgentInvestigationKeyEntities keyEntities;

  public static final String JSON_PROPERTY_KEY_EVIDENCE = "key_evidence";
  private List<SecurityAgentInvestigationKeyEvidence> keyEvidence = null;

  public static final String JSON_PROPERTY_RESPONSE_SUGGESTIONS = "response_suggestions";
  private SecurityAgentInvestigationResponseSuggestions responseSuggestions;

  public static final String JSON_PROPERTY_RULE_ID = "rule_id";
  private String ruleId;

  public static final String JSON_PROPERTY_SIGNAL = "signal";
  private SecurityAgentInvestigationSignal signal;

  public static final String JSON_PROPERTY_SIGNAL_ID = "signal_id";
  private String signalId;

  public static final String JSON_PROPERTY_STATE = "state";
  private SecurityAgentInvestigationState state;

  public static final String JSON_PROPERTY_STEPS = "steps";
  private List<SecurityAgentInvestigationStep> steps = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_VERDICT = "verdict";
  private SecurityAgentInvestigationVerdict verdict;

  public SecurityAgentInvestigationAttributes conclusion(String conclusion) {
    this.conclusion = conclusion;
    return this;
  }

  /**
   * Summary of the investigation's findings.
   *
   * @return conclusion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONCLUSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getConclusion() {
    return conclusion;
  }

  public void setConclusion(String conclusion) {
    this.conclusion = conclusion;
  }

  public SecurityAgentInvestigationAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * When the investigation started.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public SecurityAgentInvestigationAttributes keyEntities(
      SecurityAgentInvestigationKeyEntities keyEntities) {
    this.keyEntities = keyEntities;
    this.unparsed |= keyEntities.unparsed;
    return this;
  }

  /**
   * The entities the investigation found, by role.
   *
   * @return keyEntities
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityAgentInvestigationKeyEntities getKeyEntities() {
    return keyEntities;
  }

  public void setKeyEntities(SecurityAgentInvestigationKeyEntities keyEntities) {
    this.keyEntities = keyEntities;
    if (keyEntities != null) {
      this.unparsed |= keyEntities.unparsed;
    }
  }

  public SecurityAgentInvestigationAttributes keyEvidence(
      List<SecurityAgentInvestigationKeyEvidence> keyEvidence) {
    this.keyEvidence = keyEvidence;
    if (keyEvidence != null) {
      for (SecurityAgentInvestigationKeyEvidence item : keyEvidence) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public SecurityAgentInvestigationAttributes addKeyEvidenceItem(
      SecurityAgentInvestigationKeyEvidence keyEvidenceItem) {
    if (this.keyEvidence == null) {
      this.keyEvidence = new ArrayList<>();
    }
    this.keyEvidence.add(keyEvidenceItem);
    this.unparsed |= keyEvidenceItem.unparsed;
    return this;
  }

  /**
   * The evidence the verdict rests on.
   *
   * @return keyEvidence
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY_EVIDENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SecurityAgentInvestigationKeyEvidence> getKeyEvidence() {
    return keyEvidence;
  }

  public void setKeyEvidence(List<SecurityAgentInvestigationKeyEvidence> keyEvidence) {
    this.keyEvidence = keyEvidence;
    if (keyEvidence != null) {
      for (SecurityAgentInvestigationKeyEvidence item : keyEvidence) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SecurityAgentInvestigationAttributes responseSuggestions(
      SecurityAgentInvestigationResponseSuggestions responseSuggestions) {
    this.responseSuggestions = responseSuggestions;
    this.unparsed |= responseSuggestions.unparsed;
    return this;
  }

  /**
   * Suggested responses to the signal.
   *
   * @return responseSuggestions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_SUGGESTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityAgentInvestigationResponseSuggestions getResponseSuggestions() {
    return responseSuggestions;
  }

  public void setResponseSuggestions(
      SecurityAgentInvestigationResponseSuggestions responseSuggestions) {
    this.responseSuggestions = responseSuggestions;
    if (responseSuggestions != null) {
      this.unparsed |= responseSuggestions.unparsed;
    }
  }

  public SecurityAgentInvestigationAttributes ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  /**
   * ID of the detection rule that generated the signal.
   *
   * @return ruleId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

  public SecurityAgentInvestigationAttributes signal(SecurityAgentInvestigationSignal signal) {
    this.signal = signal;
    this.unparsed |= signal.unparsed;
    return this;
  }

  /**
   * Summary of the signal the investigation is about.
   *
   * @return signal
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityAgentInvestigationSignal getSignal() {
    return signal;
  }

  public void setSignal(SecurityAgentInvestigationSignal signal) {
    this.signal = signal;
    if (signal != null) {
      this.unparsed |= signal.unparsed;
    }
  }

  public SecurityAgentInvestigationAttributes signalId(String signalId) {
    this.signalId = signalId;
    return this;
  }

  /**
   * ID of the signal, in its V1 form.
   *
   * @return signalId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSignalId() {
    return signalId;
  }

  public void setSignalId(String signalId) {
    this.signalId = signalId;
  }

  public SecurityAgentInvestigationAttributes state(SecurityAgentInvestigationState state) {
    this.state = state;
    this.unparsed |= !state.isValid();
    return this;
  }

  /**
   * State of the investigation: <code>investigating</code> while it runs, <code>completed</code>
   * after it has a result, or <code>failed</code> when it produced no result before its timeout.
   *
   * @return state
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityAgentInvestigationState getState() {
    return state;
  }

  public void setState(SecurityAgentInvestigationState state) {
    if (!state.isValid()) {
      this.unparsed = true;
    }
    this.state = state;
  }

  public SecurityAgentInvestigationAttributes steps(List<SecurityAgentInvestigationStep> steps) {
    this.steps = steps;
    if (steps != null) {
      for (SecurityAgentInvestigationStep item : steps) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public SecurityAgentInvestigationAttributes addStepsItem(
      SecurityAgentInvestigationStep stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    this.unparsed |= stepsItem.unparsed;
    return this;
  }

  /**
   * The steps of the investigation, in order.
   *
   * @return steps
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SecurityAgentInvestigationStep> getSteps() {
    return steps;
  }

  public void setSteps(List<SecurityAgentInvestigationStep> steps) {
    this.steps = steps;
    if (steps != null) {
      for (SecurityAgentInvestigationStep item : steps) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SecurityAgentInvestigationAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * When the investigation last changed.
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public SecurityAgentInvestigationAttributes verdict(SecurityAgentInvestigationVerdict verdict) {
    this.verdict = verdict;
    this.unparsed |= !verdict.isValid();
    return this;
  }

  /**
   * Verdict of the investigation. Only completed investigations have one.
   *
   * @return verdict
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERDICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityAgentInvestigationVerdict getVerdict() {
    return verdict;
  }

  public void setVerdict(SecurityAgentInvestigationVerdict verdict) {
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
   * @return SecurityAgentInvestigationAttributes
   */
  @JsonAnySetter
  public SecurityAgentInvestigationAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityAgentInvestigationAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityAgentInvestigationAttributes securityAgentInvestigationAttributes =
        (SecurityAgentInvestigationAttributes) o;
    return Objects.equals(this.conclusion, securityAgentInvestigationAttributes.conclusion)
        && Objects.equals(this.createdAt, securityAgentInvestigationAttributes.createdAt)
        && Objects.equals(this.keyEntities, securityAgentInvestigationAttributes.keyEntities)
        && Objects.equals(this.keyEvidence, securityAgentInvestigationAttributes.keyEvidence)
        && Objects.equals(
            this.responseSuggestions, securityAgentInvestigationAttributes.responseSuggestions)
        && Objects.equals(this.ruleId, securityAgentInvestigationAttributes.ruleId)
        && Objects.equals(this.signal, securityAgentInvestigationAttributes.signal)
        && Objects.equals(this.signalId, securityAgentInvestigationAttributes.signalId)
        && Objects.equals(this.state, securityAgentInvestigationAttributes.state)
        && Objects.equals(this.steps, securityAgentInvestigationAttributes.steps)
        && Objects.equals(this.updatedAt, securityAgentInvestigationAttributes.updatedAt)
        && Objects.equals(this.verdict, securityAgentInvestigationAttributes.verdict)
        && Objects.equals(
            this.additionalProperties, securityAgentInvestigationAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        conclusion,
        createdAt,
        keyEntities,
        keyEvidence,
        responseSuggestions,
        ruleId,
        signal,
        signalId,
        state,
        steps,
        updatedAt,
        verdict,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityAgentInvestigationAttributes {\n");
    sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    keyEntities: ").append(toIndentedString(keyEntities)).append("\n");
    sb.append("    keyEvidence: ").append(toIndentedString(keyEvidence)).append("\n");
    sb.append("    responseSuggestions: ")
        .append(toIndentedString(responseSuggestions))
        .append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    signal: ").append(toIndentedString(signal)).append("\n");
    sb.append("    signalId: ").append(toIndentedString(signalId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
