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

/** Triggers an escalation policy when the routing rule matches. */
@JsonPropertyOrder({
  EscalationPolicyAction.JSON_PROPERTY_POLICY_ID,
  EscalationPolicyAction.JSON_PROPERTY_SUPPORT_HOURS,
  EscalationPolicyAction.JSON_PROPERTY_TYPE,
  EscalationPolicyAction.JSON_PROPERTY_URGENCY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EscalationPolicyAction {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_POLICY_ID = "policy_id";
  private String policyId;

  public static final String JSON_PROPERTY_SUPPORT_HOURS = "support_hours";
  private TimeRestrictions supportHours;

  public static final String JSON_PROPERTY_TYPE = "type";
  private EscalationPolicyActionType type = EscalationPolicyActionType.ESCALATION_POLICY;

  public static final String JSON_PROPERTY_URGENCY = "urgency";
  private Urgency urgency;

  public EscalationPolicyAction() {}

  @JsonCreator
  public EscalationPolicyAction(
      @JsonProperty(required = true, value = JSON_PROPERTY_POLICY_ID) String policyId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) EscalationPolicyActionType type) {
    this.policyId = policyId;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public EscalationPolicyAction policyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  /**
   * The ID of the escalation policy to trigger.
   *
   * @return policyId
   */
  @JsonProperty(JSON_PROPERTY_POLICY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  public EscalationPolicyAction supportHours(TimeRestrictions supportHours) {
    this.supportHours = supportHours;
    this.unparsed |= supportHours.unparsed;
    return this;
  }

  /**
   * Holds time zone information and a list of time restrictions for a routing rule.
   *
   * @return supportHours
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPORT_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TimeRestrictions getSupportHours() {
    return supportHours;
  }

  public void setSupportHours(TimeRestrictions supportHours) {
    this.supportHours = supportHours;
  }

  public EscalationPolicyAction type(EscalationPolicyActionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Indicates that the action is an escalation policy action.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EscalationPolicyActionType getType() {
    return type;
  }

  public void setType(EscalationPolicyActionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public EscalationPolicyAction urgency(Urgency urgency) {
    this.urgency = urgency;
    this.unparsed |= !urgency.isValid();
    return this;
  }

  /**
   * Specifies the level of urgency for a routing rule (low, high, or dynamic).
   *
   * @return urgency
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URGENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Urgency getUrgency() {
    return urgency;
  }

  public void setUrgency(Urgency urgency) {
    if (!urgency.isValid()) {
      this.unparsed = true;
    }
    this.urgency = urgency;
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
   * @return EscalationPolicyAction
   */
  @JsonAnySetter
  public EscalationPolicyAction putAdditionalProperty(String key, Object value) {
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

  /** Return true if this EscalationPolicyAction object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EscalationPolicyAction escalationPolicyAction = (EscalationPolicyAction) o;
    return Objects.equals(this.policyId, escalationPolicyAction.policyId)
        && Objects.equals(this.supportHours, escalationPolicyAction.supportHours)
        && Objects.equals(this.type, escalationPolicyAction.type)
        && Objects.equals(this.urgency, escalationPolicyAction.urgency)
        && Objects.equals(this.additionalProperties, escalationPolicyAction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId, supportHours, type, urgency, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EscalationPolicyAction {\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    supportHours: ").append(toIndentedString(supportHours)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    urgency: ").append(toIndentedString(urgency)).append("\n");
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
