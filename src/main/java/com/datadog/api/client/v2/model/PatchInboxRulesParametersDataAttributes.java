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

/**
 * Attributes of the inbox rule patch request: the rule name, the rule details, the associated
 * action, and the enabled field.
 */
@JsonPropertyOrder({
  PatchInboxRulesParametersDataAttributes.JSON_PROPERTY_ACTION,
  PatchInboxRulesParametersDataAttributes.JSON_PROPERTY_ENABLED,
  PatchInboxRulesParametersDataAttributes.JSON_PROPERTY_NAME,
  PatchInboxRulesParametersDataAttributes.JSON_PROPERTY_RULE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PatchInboxRulesParametersDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION = "action";
  private ActionInbox action;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RULE = "rule";
  private AutomationRule rule;

  public PatchInboxRulesParametersDataAttributes action(ActionInbox action) {
    this.action = action;
    this.unparsed |= action.unparsed;
    return this;
  }

  /**
   * Action of the inbox rule
   *
   * @return action
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ActionInbox getAction() {
    return action;
  }

  public void setAction(ActionInbox action) {
    this.action = action;
  }

  public PatchInboxRulesParametersDataAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Field used to enable or disable the rule.
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

  public PatchInboxRulesParametersDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the pipeline rule
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PatchInboxRulesParametersDataAttributes rule(AutomationRule rule) {
    this.rule = rule;
    this.unparsed |= rule.unparsed;
    return this;
  }

  /**
   * The definition of an automation pipeline rule scope. A rule can act on specific issue types,
   * security rule types, security rule IDs, rule severities, or a query. The query can be used to
   * filter resources on tags and attributes. The issue type and rule types fields are required.
   *
   * @return rule
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AutomationRule getRule() {
    return rule;
  }

  public void setRule(AutomationRule rule) {
    this.rule = rule;
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
   * @return PatchInboxRulesParametersDataAttributes
   */
  @JsonAnySetter
  public PatchInboxRulesParametersDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this PatchInboxRulesParametersDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchInboxRulesParametersDataAttributes patchInboxRulesParametersDataAttributes =
        (PatchInboxRulesParametersDataAttributes) o;
    return Objects.equals(this.action, patchInboxRulesParametersDataAttributes.action)
        && Objects.equals(this.enabled, patchInboxRulesParametersDataAttributes.enabled)
        && Objects.equals(this.name, patchInboxRulesParametersDataAttributes.name)
        && Objects.equals(this.rule, patchInboxRulesParametersDataAttributes.rule)
        && Objects.equals(
            this.additionalProperties,
            patchInboxRulesParametersDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, enabled, name, rule, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchInboxRulesParametersDataAttributes {\n");
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
