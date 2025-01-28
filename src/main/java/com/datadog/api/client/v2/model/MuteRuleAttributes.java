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

/** Attributes of the mute rule */
@JsonPropertyOrder({
  MuteRuleAttributes.JSON_PROPERTY_ACTION,
  MuteRuleAttributes.JSON_PROPERTY_CREATED_AT,
  MuteRuleAttributes.JSON_PROPERTY_CREATED_BY,
  MuteRuleAttributes.JSON_PROPERTY_ENABLED,
  MuteRuleAttributes.JSON_PROPERTY_MODIFIED_AT,
  MuteRuleAttributes.JSON_PROPERTY_MODIFIED_BY,
  MuteRuleAttributes.JSON_PROPERTY_NAME,
  MuteRuleAttributes.JSON_PROPERTY_RULE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MuteRuleAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION = "action";
  private ActionMute action;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private AutomationRuleUser createdBy;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private Long modifiedAt;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modified_by";
  private AutomationRuleUser modifiedBy;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RULE = "rule";
  private AutomationRule rule;

  public MuteRuleAttributes() {}

  @JsonCreator
  public MuteRuleAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTION) ActionMute action,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) Long createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY) AutomationRuleUser createdBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) Long modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_BY)
          AutomationRuleUser modifiedBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE) AutomationRule rule) {
    this.action = action;
    this.unparsed |= action.unparsed;
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.unparsed |= createdBy.unparsed;
    this.enabled = enabled;
    this.modifiedAt = modifiedAt;
    this.modifiedBy = modifiedBy;
    this.unparsed |= modifiedBy.unparsed;
    this.name = name;
    this.rule = rule;
    this.unparsed |= rule.unparsed;
  }

  public MuteRuleAttributes action(ActionMute action) {
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

  public MuteRuleAttributes createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Date as Unix timestamp in milliseconds
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public MuteRuleAttributes createdBy(AutomationRuleUser createdBy) {
    this.createdBy = createdBy;
    this.unparsed |= createdBy.unparsed;
    return this;
  }

  /**
   * User creating or modifying a rule
   *
   * @return createdBy
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AutomationRuleUser getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(AutomationRuleUser createdBy) {
    this.createdBy = createdBy;
  }

  public MuteRuleAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Field used to enable or disable the rule.
   *
   * @return enabled
   */
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public MuteRuleAttributes modifiedAt(Long modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Date as Unix timestamp in milliseconds
   *
   * @return modifiedAt
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(Long modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public MuteRuleAttributes modifiedBy(AutomationRuleUser modifiedBy) {
    this.modifiedBy = modifiedBy;
    this.unparsed |= modifiedBy.unparsed;
    return this;
  }

  /**
   * User creating or modifying a rule
   *
   * @return modifiedBy
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AutomationRuleUser getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(AutomationRuleUser modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public MuteRuleAttributes name(String name) {
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

  public MuteRuleAttributes rule(AutomationRule rule) {
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
   * @return MuteRuleAttributes
   */
  @JsonAnySetter
  public MuteRuleAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MuteRuleAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MuteRuleAttributes muteRuleAttributes = (MuteRuleAttributes) o;
    return Objects.equals(this.action, muteRuleAttributes.action)
        && Objects.equals(this.createdAt, muteRuleAttributes.createdAt)
        && Objects.equals(this.createdBy, muteRuleAttributes.createdBy)
        && Objects.equals(this.enabled, muteRuleAttributes.enabled)
        && Objects.equals(this.modifiedAt, muteRuleAttributes.modifiedAt)
        && Objects.equals(this.modifiedBy, muteRuleAttributes.modifiedBy)
        && Objects.equals(this.name, muteRuleAttributes.name)
        && Objects.equals(this.rule, muteRuleAttributes.rule)
        && Objects.equals(this.additionalProperties, muteRuleAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        action,
        createdAt,
        createdBy,
        enabled,
        modifiedAt,
        modifiedBy,
        name,
        rule,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MuteRuleAttributes {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
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
