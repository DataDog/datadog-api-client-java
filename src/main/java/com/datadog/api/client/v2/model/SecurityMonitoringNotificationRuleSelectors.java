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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Selectors describing the notification rule. */
@JsonPropertyOrder({
  SecurityMonitoringNotificationRuleSelectors.JSON_PROPERTY_ATTRIBUTES,
  SecurityMonitoringNotificationRuleSelectors.JSON_PROPERTY_IMPLICIT_VM_RULE_MATCH,
  SecurityMonitoringNotificationRuleSelectors.JSON_PROPERTY_MIGRATED,
  SecurityMonitoringNotificationRuleSelectors.JSON_PROPERTY_QUERY,
  SecurityMonitoringNotificationRuleSelectors.JSON_PROPERTY_RULE_TAGS,
  SecurityMonitoringNotificationRuleSelectors.JSON_PROPERTY_RULE_TYPES,
  SecurityMonitoringNotificationRuleSelectors.JSON_PROPERTY_SEVERITIES,
  SecurityMonitoringNotificationRuleSelectors.JSON_PROPERTY_SIGNAL_TAGS,
  SecurityMonitoringNotificationRuleSelectors.JSON_PROPERTY_TRIGGER_SOURCE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringNotificationRuleSelectors {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private List<String> attributes = new ArrayList<>();

  public static final String JSON_PROPERTY_IMPLICIT_VM_RULE_MATCH = "implicit_vm_rule_match";
  private Boolean implicitVmRuleMatch;

  public static final String JSON_PROPERTY_MIGRATED = "migrated";
  private Boolean migrated;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_RULE_TAGS = "rule_tags";
  private List<String> ruleTags = new ArrayList<>();

  public static final String JSON_PROPERTY_RULE_TYPES = "rule_types";
  private List<SecurityMonitoringRuleTypes> ruleTypes = new ArrayList<>();

  public static final String JSON_PROPERTY_SEVERITIES = "severities";
  private List<SecurityMonitoringRuleSeverity> severities = new ArrayList<>();

  public static final String JSON_PROPERTY_SIGNAL_TAGS = "signal_tags";
  private List<String> signalTags = new ArrayList<>();

  public static final String JSON_PROPERTY_TRIGGER_SOURCE = "trigger_source";
  private SecurityMonitoringNotificationRuleTriggerSource triggerSource;

  public SecurityMonitoringNotificationRuleSelectors() {}

  @JsonCreator
  public SecurityMonitoringNotificationRuleSelectors(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES) List<String> attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_IMPLICIT_VM_RULE_MATCH)
          Boolean implicitVmRuleMatch,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE_TAGS) List<String> ruleTags,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE_TYPES)
          List<SecurityMonitoringRuleTypes> ruleTypes,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEVERITIES)
          List<SecurityMonitoringRuleSeverity> severities,
      @JsonProperty(required = true, value = JSON_PROPERTY_SIGNAL_TAGS) List<String> signalTags) {
    this.attributes = attributes;
    this.implicitVmRuleMatch = implicitVmRuleMatch;
    this.ruleTags = ruleTags;
    this.ruleTypes = ruleTypes;
    this.severities = severities;
    this.signalTags = signalTags;
  }

  public SecurityMonitoringNotificationRuleSelectors attributes(List<String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public SecurityMonitoringNotificationRuleSelectors addAttributesItem(String attributesItem) {
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Set of rule and signal tags for which a notification will be triggered.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<String> attributes) {
    this.attributes = attributes;
  }

  public SecurityMonitoringNotificationRuleSelectors implicitVmRuleMatch(
      Boolean implicitVmRuleMatch) {
    this.implicitVmRuleMatch = implicitVmRuleMatch;
    return this;
  }

  /**
   * Whether vulnerability_management rules are matched by default when the selector for rule type
   * is empty.
   *
   * @return implicitVmRuleMatch
   */
  @JsonProperty(JSON_PROPERTY_IMPLICIT_VM_RULE_MATCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getImplicitVmRuleMatch() {
    return implicitVmRuleMatch;
  }

  public void setImplicitVmRuleMatch(Boolean implicitVmRuleMatch) {
    this.implicitVmRuleMatch = implicitVmRuleMatch;
  }

  public SecurityMonitoringNotificationRuleSelectors migrated(Boolean migrated) {
    this.migrated = migrated;
    return this;
  }

  /**
   * True if the notification_rule was created with signal tags/attributes and migrated to an event
   * query and false if it was created with an event query
   *
   * @return migrated
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIGRATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getMigrated() {
    return migrated;
  }

  public void setMigrated(Boolean migrated) {
    this.migrated = migrated;
  }

  public SecurityMonitoringNotificationRuleSelectors query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Query for matching the notification_rule against signal content
   *
   * @return query
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public SecurityMonitoringNotificationRuleSelectors ruleTags(List<String> ruleTags) {
    this.ruleTags = ruleTags;
    return this;
  }

  public SecurityMonitoringNotificationRuleSelectors addRuleTagsItem(String ruleTagsItem) {
    this.ruleTags.add(ruleTagsItem);
    return this;
  }

  /**
   * Set of rule tags for which a notification will be triggered.
   *
   * @return ruleTags
   */
  @JsonProperty(JSON_PROPERTY_RULE_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getRuleTags() {
    return ruleTags;
  }

  public void setRuleTags(List<String> ruleTags) {
    this.ruleTags = ruleTags;
  }

  public SecurityMonitoringNotificationRuleSelectors ruleTypes(
      List<SecurityMonitoringRuleTypes> ruleTypes) {
    this.ruleTypes = ruleTypes;
    return this;
  }

  public SecurityMonitoringNotificationRuleSelectors addRuleTypesItem(
      SecurityMonitoringRuleTypes ruleTypesItem) {
    this.ruleTypes.add(ruleTypesItem);
    this.unparsed |= !ruleTypesItem.isValid();
    return this;
  }

  /**
   * Set of signal types (rule types) for which a notification will be triggered.
   *
   * @return ruleTypes
   */
  @JsonProperty(JSON_PROPERTY_RULE_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SecurityMonitoringRuleTypes> getRuleTypes() {
    return ruleTypes;
  }

  public void setRuleTypes(List<SecurityMonitoringRuleTypes> ruleTypes) {
    this.ruleTypes = ruleTypes;
  }

  public SecurityMonitoringNotificationRuleSelectors severities(
      List<SecurityMonitoringRuleSeverity> severities) {
    this.severities = severities;
    return this;
  }

  public SecurityMonitoringNotificationRuleSelectors addSeveritiesItem(
      SecurityMonitoringRuleSeverity severitiesItem) {
    this.severities.add(severitiesItem);
    this.unparsed |= !severitiesItem.isValid();
    return this;
  }

  /**
   * Set of signal severities (rule case statuses) for which a notification will be triggered.
   *
   * @return severities
   */
  @JsonProperty(JSON_PROPERTY_SEVERITIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SecurityMonitoringRuleSeverity> getSeverities() {
    return severities;
  }

  public void setSeverities(List<SecurityMonitoringRuleSeverity> severities) {
    this.severities = severities;
  }

  public SecurityMonitoringNotificationRuleSelectors signalTags(List<String> signalTags) {
    this.signalTags = signalTags;
    return this;
  }

  public SecurityMonitoringNotificationRuleSelectors addSignalTagsItem(String signalTagsItem) {
    this.signalTags.add(signalTagsItem);
    return this;
  }

  /**
   * Set of signal tags for which a notification will be triggered.
   *
   * @return signalTags
   */
  @JsonProperty(JSON_PROPERTY_SIGNAL_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getSignalTags() {
    return signalTags;
  }

  public void setSignalTags(List<String> signalTags) {
    this.signalTags = signalTags;
  }

  public SecurityMonitoringNotificationRuleSelectors triggerSource(
      SecurityMonitoringNotificationRuleTriggerSource triggerSource) {
    this.triggerSource = triggerSource;
    this.unparsed |= !triggerSource.isValid();
    return this;
  }

  /**
   * Specifies the evaluation result (Signal or Finding).
   *
   * @return triggerSource
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRIGGER_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringNotificationRuleTriggerSource getTriggerSource() {
    return triggerSource;
  }

  public void setTriggerSource(SecurityMonitoringNotificationRuleTriggerSource triggerSource) {
    if (!triggerSource.isValid()) {
      this.unparsed = true;
    }
    this.triggerSource = triggerSource;
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
   * @return SecurityMonitoringNotificationRuleSelectors
   */
  @JsonAnySetter
  public SecurityMonitoringNotificationRuleSelectors putAdditionalProperty(
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

  /** Return true if this SecurityMonitoringNotificationRuleSelectors object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringNotificationRuleSelectors securityMonitoringNotificationRuleSelectors =
        (SecurityMonitoringNotificationRuleSelectors) o;
    return Objects.equals(this.attributes, securityMonitoringNotificationRuleSelectors.attributes)
        && Objects.equals(
            this.implicitVmRuleMatch,
            securityMonitoringNotificationRuleSelectors.implicitVmRuleMatch)
        && Objects.equals(this.migrated, securityMonitoringNotificationRuleSelectors.migrated)
        && Objects.equals(this.query, securityMonitoringNotificationRuleSelectors.query)
        && Objects.equals(this.ruleTags, securityMonitoringNotificationRuleSelectors.ruleTags)
        && Objects.equals(this.ruleTypes, securityMonitoringNotificationRuleSelectors.ruleTypes)
        && Objects.equals(this.severities, securityMonitoringNotificationRuleSelectors.severities)
        && Objects.equals(this.signalTags, securityMonitoringNotificationRuleSelectors.signalTags)
        && Objects.equals(
            this.triggerSource, securityMonitoringNotificationRuleSelectors.triggerSource)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringNotificationRuleSelectors.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        attributes,
        implicitVmRuleMatch,
        migrated,
        query,
        ruleTags,
        ruleTypes,
        severities,
        signalTags,
        triggerSource,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringNotificationRuleSelectors {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    implicitVmRuleMatch: ")
        .append(toIndentedString(implicitVmRuleMatch))
        .append("\n");
    sb.append("    migrated: ").append(toIndentedString(migrated)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    ruleTags: ").append(toIndentedString(ruleTags)).append("\n");
    sb.append("    ruleTypes: ").append(toIndentedString(ruleTypes)).append("\n");
    sb.append("    severities: ").append(toIndentedString(severities)).append("\n");
    sb.append("    signalTags: ").append(toIndentedString(signalTags)).append("\n");
    sb.append("    triggerSource: ").append(toIndentedString(triggerSource)).append("\n");
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
