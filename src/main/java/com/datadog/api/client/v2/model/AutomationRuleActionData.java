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

/** Configuration for the action to execute, dependent on the action type. */
@JsonPropertyOrder({
  AutomationRuleActionData.JSON_PROPERTY_AGENT_TYPE,
  AutomationRuleActionData.JSON_PROPERTY_ASSIGNED_AGENT_ID,
  AutomationRuleActionData.JSON_PROPERTY_HANDLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AutomationRuleActionData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGENT_TYPE = "agent_type";
  private String agentType;

  public static final String JSON_PROPERTY_ASSIGNED_AGENT_ID = "assigned_agent_id";
  private String assignedAgentId;

  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public AutomationRuleActionData agentType(String agentType) {
    this.agentType = agentType;
    return this;
  }

  /**
   * The type of AI agent to assign. Required when the action type is <code>assign_agent</code>.
   *
   * @return agentType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAgentType() {
    return agentType;
  }

  public void setAgentType(String agentType) {
    this.agentType = agentType;
  }

  public AutomationRuleActionData assignedAgentId(String assignedAgentId) {
    this.assignedAgentId = assignedAgentId;
    return this;
  }

  /**
   * The identifier of the AI agent to assign to the case. Required when the action type is <code>
   * assign_agent</code>.
   *
   * @return assignedAgentId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNED_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAssignedAgentId() {
    return assignedAgentId;
  }

  public void setAssignedAgentId(String assignedAgentId) {
    this.assignedAgentId = assignedAgentId;
  }

  public AutomationRuleActionData handle(String handle) {
    this.handle = handle;
    return this;
  }

  /**
   * The handle of the Datadog workflow to execute. Required when the action type is <code>
   * execute_workflow</code>.
   *
   * @return handle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
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
   * @return AutomationRuleActionData
   */
  @JsonAnySetter
  public AutomationRuleActionData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AutomationRuleActionData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomationRuleActionData automationRuleActionData = (AutomationRuleActionData) o;
    return Objects.equals(this.agentType, automationRuleActionData.agentType)
        && Objects.equals(this.assignedAgentId, automationRuleActionData.assignedAgentId)
        && Objects.equals(this.handle, automationRuleActionData.handle)
        && Objects.equals(this.additionalProperties, automationRuleActionData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentType, assignedAgentId, handle, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomationRuleActionData {\n");
    sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
    sb.append("    assignedAgentId: ").append(toIndentedString(assignedAgentId)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
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
