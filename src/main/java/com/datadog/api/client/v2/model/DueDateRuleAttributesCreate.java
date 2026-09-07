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

/** Attributes for creating or updating a due date rule. */
@JsonPropertyOrder({
  DueDateRuleAttributesCreate.JSON_PROPERTY_ACTION,
  DueDateRuleAttributesCreate.JSON_PROPERTY_ENABLED,
  DueDateRuleAttributesCreate.JSON_PROPERTY_NAME,
  DueDateRuleAttributesCreate.JSON_PROPERTY_RULE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DueDateRuleAttributesCreate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION = "action";
  private DueDateRuleAction action;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RULE = "rule";
  private AutomationRuleScope rule;

  public DueDateRuleAttributesCreate() {}

  @JsonCreator
  public DueDateRuleAttributesCreate(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTION) DueDateRuleAction action,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE) AutomationRuleScope rule) {
    this.action = action;
    this.unparsed |= action.unparsed;
    this.name = name;
    this.rule = rule;
    this.unparsed |= rule.unparsed;
  }

  public DueDateRuleAttributesCreate action(DueDateRuleAction action) {
    this.action = action;
    this.unparsed |= action.unparsed;
    return this;
  }

  /**
   * The action to take when the due date rule matches a finding.
   *
   * @return action
   */
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DueDateRuleAction getAction() {
    return action;
  }

  public void setAction(DueDateRuleAction action) {
    this.action = action;
    if (action != null) {
      this.unparsed |= action.unparsed;
    }
  }

  public DueDateRuleAttributesCreate enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the due date rule is enabled.
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public DueDateRuleAttributesCreate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the due date rule.
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

  public DueDateRuleAttributesCreate rule(AutomationRuleScope rule) {
    this.rule = rule;
    this.unparsed |= rule.unparsed;
    return this;
  }

  /**
   * Defines the scope of findings to which the automation rule applies.
   *
   * @return rule
   */
  @JsonProperty(JSON_PROPERTY_RULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AutomationRuleScope getRule() {
    return rule;
  }

  public void setRule(AutomationRuleScope rule) {
    this.rule = rule;
    if (rule != null) {
      this.unparsed |= rule.unparsed;
    }
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
   * @return DueDateRuleAttributesCreate
   */
  @JsonAnySetter
  public DueDateRuleAttributesCreate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DueDateRuleAttributesCreate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DueDateRuleAttributesCreate dueDateRuleAttributesCreate = (DueDateRuleAttributesCreate) o;
    return Objects.equals(this.action, dueDateRuleAttributesCreate.action)
        && Objects.equals(this.enabled, dueDateRuleAttributesCreate.enabled)
        && Objects.equals(this.name, dueDateRuleAttributesCreate.name)
        && Objects.equals(this.rule, dueDateRuleAttributesCreate.rule)
        && Objects.equals(
            this.additionalProperties, dueDateRuleAttributesCreate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, enabled, name, rule, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DueDateRuleAttributesCreate {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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
