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

/** Attributes required to create an automation rule. */
@JsonPropertyOrder({
  AutomationRuleCreateAttributes.JSON_PROPERTY_ACTION,
  AutomationRuleCreateAttributes.JSON_PROPERTY_NAME,
  AutomationRuleCreateAttributes.JSON_PROPERTY_STATE,
  AutomationRuleCreateAttributes.JSON_PROPERTY_TRIGGER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AutomationRuleCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION = "action";
  private AutomationRuleAction action;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATE = "state";
  private CaseAutomationRuleState state;

  public static final String JSON_PROPERTY_TRIGGER = "trigger";
  private AutomationRuleTrigger trigger;

  public AutomationRuleCreateAttributes() {}

  @JsonCreator
  public AutomationRuleCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTION) AutomationRuleAction action,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TRIGGER) AutomationRuleTrigger trigger) {
    this.action = action;
    this.unparsed |= action.unparsed;
    this.name = name;
    this.trigger = trigger;
    this.unparsed |= trigger.unparsed;
  }

  public AutomationRuleCreateAttributes action(AutomationRuleAction action) {
    this.action = action;
    this.unparsed |= action.unparsed;
    return this;
  }

  /**
   * Defines what happens when the rule triggers. Combines an action type with action-specific
   * configuration data.
   *
   * @return action
   */
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AutomationRuleAction getAction() {
    return action;
  }

  public void setAction(AutomationRuleAction action) {
    this.action = action;
  }

  public AutomationRuleCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the automation rule.
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

  public AutomationRuleCreateAttributes state(CaseAutomationRuleState state) {
    this.state = state;
    this.unparsed |= !state.isValid();
    return this;
  }

  /**
   * Whether the automation rule is active. Enabled rules trigger on matching case events; disabled
   * rules are inactive but preserve their configuration.
   *
   * @return state
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CaseAutomationRuleState getState() {
    return state;
  }

  public void setState(CaseAutomationRuleState state) {
    if (!state.isValid()) {
      this.unparsed = true;
    }
    this.state = state;
  }

  public AutomationRuleCreateAttributes trigger(AutomationRuleTrigger trigger) {
    this.trigger = trigger;
    this.unparsed |= trigger.unparsed;
    return this;
  }

  /**
   * Defines when the rule activates. Combines a trigger type (the case event to listen for) with
   * optional trigger data (conditions that narrow when the trigger fires).
   *
   * @return trigger
   */
  @JsonProperty(JSON_PROPERTY_TRIGGER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AutomationRuleTrigger getTrigger() {
    return trigger;
  }

  public void setTrigger(AutomationRuleTrigger trigger) {
    this.trigger = trigger;
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
   * @return AutomationRuleCreateAttributes
   */
  @JsonAnySetter
  public AutomationRuleCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AutomationRuleCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomationRuleCreateAttributes automationRuleCreateAttributes =
        (AutomationRuleCreateAttributes) o;
    return Objects.equals(this.action, automationRuleCreateAttributes.action)
        && Objects.equals(this.name, automationRuleCreateAttributes.name)
        && Objects.equals(this.state, automationRuleCreateAttributes.state)
        && Objects.equals(this.trigger, automationRuleCreateAttributes.trigger)
        && Objects.equals(
            this.additionalProperties, automationRuleCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, name, state, trigger, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomationRuleCreateAttributes {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
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
