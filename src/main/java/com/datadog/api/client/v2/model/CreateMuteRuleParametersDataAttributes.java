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

/**
 * Attributes of the mute rule create request: the rule name, the rule details, the associated
 * action, and the optional enabled field.
 */
@JsonPropertyOrder({
  CreateMuteRuleParametersDataAttributes.JSON_PROPERTY_ACTION,
  CreateMuteRuleParametersDataAttributes.JSON_PROPERTY_ENABLED,
  CreateMuteRuleParametersDataAttributes.JSON_PROPERTY_NAME,
  CreateMuteRuleParametersDataAttributes.JSON_PROPERTY_RULE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateMuteRuleParametersDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION = "action";
  private ActionMute action;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RULE = "rule";
  private Rule rule;

  public CreateMuteRuleParametersDataAttributes() {}

  @JsonCreator
  public CreateMuteRuleParametersDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTION) ActionMute action,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE) Rule rule) {
    this.action = action;
    this.unparsed |= action.unparsed;
    this.name = name;
    this.rule = rule;
    this.unparsed |= rule.unparsed;
  }

  public CreateMuteRuleParametersDataAttributes action(ActionMute action) {
    this.action = action;
    this.unparsed |= action.unparsed;
    return this;
  }

  /**
   * Action of the mute rule
   *
   * @return action
   */
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ActionMute getAction() {
    return action;
  }

  public void setAction(ActionMute action) {
    this.action = action;
  }

  public CreateMuteRuleParametersDataAttributes enabled(Boolean enabled) {
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

  public CreateMuteRuleParametersDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the pipeline rule
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

  public CreateMuteRuleParametersDataAttributes rule(Rule rule) {
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
  @JsonProperty(JSON_PROPERTY_RULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Rule getRule() {
    return rule;
  }

  public void setRule(Rule rule) {
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
   * @return CreateMuteRuleParametersDataAttributes
   */
  @JsonAnySetter
  public CreateMuteRuleParametersDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CreateMuteRuleParametersDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMuteRuleParametersDataAttributes createMuteRuleParametersDataAttributes =
        (CreateMuteRuleParametersDataAttributes) o;
    return Objects.equals(this.action, createMuteRuleParametersDataAttributes.action)
        && Objects.equals(this.enabled, createMuteRuleParametersDataAttributes.enabled)
        && Objects.equals(this.name, createMuteRuleParametersDataAttributes.name)
        && Objects.equals(this.rule, createMuteRuleParametersDataAttributes.rule)
        && Objects.equals(
            this.additionalProperties, createMuteRuleParametersDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, enabled, name, rule, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMuteRuleParametersDataAttributes {\n");
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