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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Attributes of an investigation in a list. To get an investigation's full content, use the get
 * investigation endpoint.
 */
@JsonPropertyOrder({
  SecurityAgentInvestigationListItemAttributes.JSON_PROPERTY_CREATED_AT,
  SecurityAgentInvestigationListItemAttributes.JSON_PROPERTY_IS_LATEST,
  SecurityAgentInvestigationListItemAttributes.JSON_PROPERTY_RULE_ID,
  SecurityAgentInvestigationListItemAttributes.JSON_PROPERTY_SIGNAL,
  SecurityAgentInvestigationListItemAttributes.JSON_PROPERTY_SIGNAL_ID,
  SecurityAgentInvestigationListItemAttributes.JSON_PROPERTY_STATE,
  SecurityAgentInvestigationListItemAttributes.JSON_PROPERTY_UPDATED_AT,
  SecurityAgentInvestigationListItemAttributes.JSON_PROPERTY_VERDICT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityAgentInvestigationListItemAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_IS_LATEST = "is_latest";
  private Boolean isLatest;

  public static final String JSON_PROPERTY_RULE_ID = "rule_id";
  private String ruleId;

  public static final String JSON_PROPERTY_SIGNAL = "signal";
  private SecurityAgentInvestigationSignal signal;

  public static final String JSON_PROPERTY_SIGNAL_ID = "signal_id";
  private String signalId;

  public static final String JSON_PROPERTY_STATE = "state";
  private SecurityAgentInvestigationState state;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_VERDICT = "verdict";
  private SecurityAgentInvestigationVerdict verdict;

  public SecurityAgentInvestigationListItemAttributes() {}

  @JsonCreator
  public SecurityAgentInvestigationListItemAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_LATEST) Boolean isLatest,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE_ID) String ruleId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SIGNAL_ID) String signalId,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATE)
          SecurityAgentInvestigationState state) {
    this.isLatest = isLatest;
    this.ruleId = ruleId;
    this.signalId = signalId;
    this.state = state;
    this.unparsed |= !state.isValid();
  }

  public SecurityAgentInvestigationListItemAttributes createdAt(OffsetDateTime createdAt) {
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

  public SecurityAgentInvestigationListItemAttributes isLatest(Boolean isLatest) {
    this.isLatest = isLatest;
    return this;
  }

  /**
   * Whether this is the latest investigation of the signal. Always true when <code>
   * filter[signal_id]</code> isn't set.
   *
   * @return isLatest
   */
  @JsonProperty(JSON_PROPERTY_IS_LATEST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsLatest() {
    return isLatest;
  }

  public void setIsLatest(Boolean isLatest) {
    this.isLatest = isLatest;
  }

  public SecurityAgentInvestigationListItemAttributes ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  /**
   * ID of the detection rule that generated the signal. It can be empty while the investigation
   * runs.
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

  public SecurityAgentInvestigationListItemAttributes signal(
      SecurityAgentInvestigationSignal signal) {
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

  public SecurityAgentInvestigationListItemAttributes signalId(String signalId) {
    this.signalId = signalId;
    return this;
  }

  /**
   * ID of the signal, in its V1 form.
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

  public SecurityAgentInvestigationListItemAttributes state(SecurityAgentInvestigationState state) {
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
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityAgentInvestigationState getState() {
    return state;
  }

  public void setState(SecurityAgentInvestigationState state) {
    if (!state.isValid()) {
      this.unparsed = true;
    }
    this.state = state;
  }

  public SecurityAgentInvestigationListItemAttributes updatedAt(OffsetDateTime updatedAt) {
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

  public SecurityAgentInvestigationListItemAttributes verdict(
      SecurityAgentInvestigationVerdict verdict) {
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
   * @return SecurityAgentInvestigationListItemAttributes
   */
  @JsonAnySetter
  public SecurityAgentInvestigationListItemAttributes putAdditionalProperty(
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

  /** Return true if this SecurityAgentInvestigationListItemAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityAgentInvestigationListItemAttributes securityAgentInvestigationListItemAttributes =
        (SecurityAgentInvestigationListItemAttributes) o;
    return Objects.equals(this.createdAt, securityAgentInvestigationListItemAttributes.createdAt)
        && Objects.equals(this.isLatest, securityAgentInvestigationListItemAttributes.isLatest)
        && Objects.equals(this.ruleId, securityAgentInvestigationListItemAttributes.ruleId)
        && Objects.equals(this.signal, securityAgentInvestigationListItemAttributes.signal)
        && Objects.equals(this.signalId, securityAgentInvestigationListItemAttributes.signalId)
        && Objects.equals(this.state, securityAgentInvestigationListItemAttributes.state)
        && Objects.equals(this.updatedAt, securityAgentInvestigationListItemAttributes.updatedAt)
        && Objects.equals(this.verdict, securityAgentInvestigationListItemAttributes.verdict)
        && Objects.equals(
            this.additionalProperties,
            securityAgentInvestigationListItemAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        isLatest,
        ruleId,
        signal,
        signalId,
        state,
        updatedAt,
        verdict,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityAgentInvestigationListItemAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    isLatest: ").append(toIndentedString(isLatest)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    signal: ").append(toIndentedString(signal)).append("\n");
    sb.append("    signalId: ").append(toIndentedString(signalId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
