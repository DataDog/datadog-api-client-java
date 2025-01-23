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

/**
 * The definition of an automation pipeline rule scope. A rule can act on specific issue types,
 * security rule types, security rule IDs, rule severities, or a query. The query can be used to
 * filter resources on tags and attributes. The issue type and rule types fields are required.
 */
@JsonPropertyOrder({
  Rule.JSON_PROPERTY_ISSUE_TYPE,
  Rule.JSON_PROPERTY_QUERY,
  Rule.JSON_PROPERTY_RULE_IDS,
  Rule.JSON_PROPERTY_RULE_TYPES,
  Rule.JSON_PROPERTY_SEVERITIES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class Rule {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ISSUE_TYPE = "issue_type";
  private IssueType issueType;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_RULE_IDS = "rule_ids";
  private List<String> ruleIds = null;

  public static final String JSON_PROPERTY_RULE_TYPES = "rule_types";
  private List<RuleTypesItems> ruleTypes = new ArrayList<>();

  public static final String JSON_PROPERTY_SEVERITIES = "severities";
  private List<RuleSeverity> severities = null;

  public Rule() {}

  @JsonCreator
  public Rule(
      @JsonProperty(required = true, value = JSON_PROPERTY_ISSUE_TYPE) IssueType issueType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE_TYPES)
          List<RuleTypesItems> ruleTypes) {
    this.issueType = issueType;
    this.unparsed |= !issueType.isValid();
    this.ruleTypes = ruleTypes;
  }

  public Rule issueType(IssueType issueType) {
    this.issueType = issueType;
    this.unparsed |= !issueType.isValid();
    return this;
  }

  /**
   * The type of issues on which the rule applies
   *
   * @return issueType
   */
  @JsonProperty(JSON_PROPERTY_ISSUE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IssueType getIssueType() {
    return issueType;
  }

  public void setIssueType(IssueType issueType) {
    if (!issueType.isValid()) {
      this.unparsed = true;
    }
    this.issueType = issueType;
  }

  public Rule query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The query is composed of one or several key:value pairs, which can be used to filter resources
   * on tags and attributes.
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

  public Rule ruleIds(List<String> ruleIds) {
    this.ruleIds = ruleIds;
    return this;
  }

  public Rule addRuleIdsItem(String ruleIdsItem) {
    if (this.ruleIds == null) {
      this.ruleIds = new ArrayList<>();
    }
    this.ruleIds.add(ruleIdsItem);
    return this;
  }

  /**
   * Security rule ids
   *
   * @return ruleIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getRuleIds() {
    return ruleIds;
  }

  public void setRuleIds(List<String> ruleIds) {
    this.ruleIds = ruleIds;
  }

  public Rule ruleTypes(List<RuleTypesItems> ruleTypes) {
    this.ruleTypes = ruleTypes;
    return this;
  }

  public Rule addRuleTypesItem(RuleTypesItems ruleTypesItem) {
    this.ruleTypes.add(ruleTypesItem);
    this.unparsed |= !ruleTypesItem.isValid();
    return this;
  }

  /**
   * Security rule types
   *
   * @return ruleTypes
   */
  @JsonProperty(JSON_PROPERTY_RULE_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<RuleTypesItems> getRuleTypes() {
    return ruleTypes;
  }

  public void setRuleTypes(List<RuleTypesItems> ruleTypes) {
    this.ruleTypes = ruleTypes;
  }

  public Rule severities(List<RuleSeverity> severities) {
    this.severities = severities;
    return this;
  }

  public Rule addSeveritiesItem(RuleSeverity severitiesItem) {
    if (this.severities == null) {
      this.severities = new ArrayList<>();
    }
    this.severities.add(severitiesItem);
    this.unparsed |= !severitiesItem.isValid();
    return this;
  }

  /**
   * The security rules severities to consider
   *
   * @return severities
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEVERITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RuleSeverity> getSeverities() {
    return severities;
  }

  public void setSeverities(List<RuleSeverity> severities) {
    this.severities = severities;
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
   * @return Rule
   */
  @JsonAnySetter
  public Rule putAdditionalProperty(String key, Object value) {
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

  /** Return true if this Rule object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rule rule = (Rule) o;
    return Objects.equals(this.issueType, rule.issueType)
        && Objects.equals(this.query, rule.query)
        && Objects.equals(this.ruleIds, rule.ruleIds)
        && Objects.equals(this.ruleTypes, rule.ruleTypes)
        && Objects.equals(this.severities, rule.severities)
        && Objects.equals(this.additionalProperties, rule.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueType, query, ruleIds, ruleTypes, severities, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rule {\n");
    sb.append("    issueType: ").append(toIndentedString(issueType)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    ruleIds: ").append(toIndentedString(ruleIds)).append("\n");
    sb.append("    ruleTypes: ").append(toIndentedString(ruleTypes)).append("\n");
    sb.append("    severities: ").append(toIndentedString(severities)).append("\n");
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
