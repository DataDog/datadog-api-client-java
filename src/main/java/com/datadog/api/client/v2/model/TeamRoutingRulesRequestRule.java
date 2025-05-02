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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Defines an individual routing rule item that contains the rule data for the request. */
@JsonPropertyOrder({
  TeamRoutingRulesRequestRule.JSON_PROPERTY_ACTIONS,
  TeamRoutingRulesRequestRule.JSON_PROPERTY_POLICY_ID,
  TeamRoutingRulesRequestRule.JSON_PROPERTY_QUERY,
  TeamRoutingRulesRequestRule.JSON_PROPERTY_TIME_RESTRICTION,
  TeamRoutingRulesRequestRule.JSON_PROPERTY_URGENCY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamRoutingRulesRequestRule {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTIONS = "actions";
  private List<RoutingRuleAction> actions = null;

  public static final String JSON_PROPERTY_POLICY_ID = "policy_id";
  private String policyId;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_TIME_RESTRICTION = "time_restriction";
  private TimeRestrictions timeRestriction;

  public static final String JSON_PROPERTY_URGENCY = "urgency";
  private Urgency urgency;

  public TeamRoutingRulesRequestRule actions(List<RoutingRuleAction> actions) {
    this.actions = actions;
    for (RoutingRuleAction item : actions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TeamRoutingRulesRequestRule addActionsItem(RoutingRuleAction actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    this.unparsed |= actionsItem.unparsed;
    return this;
  }

  /**
   * Specifies the list of actions to perform when the routing rule is matched.
   *
   * @return actions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RoutingRuleAction> getActions() {
    return actions;
  }

  public void setActions(List<RoutingRuleAction> actions) {
    this.actions = actions;
  }

  public TeamRoutingRulesRequestRule policyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  /**
   * Identifies the policy to be applied when this routing rule matches.
   *
   * @return policyId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POLICY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  public TeamRoutingRulesRequestRule query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Defines the query or condition that triggers this routing rule.
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

  public TeamRoutingRulesRequestRule timeRestriction(TimeRestrictions timeRestriction) {
    this.timeRestriction = timeRestriction;
    this.unparsed |= timeRestriction.unparsed;
    return this;
  }

  /**
   * Holds time zone information and a list of time restrictions for a routing rule.
   *
   * @return timeRestriction
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_RESTRICTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TimeRestrictions getTimeRestriction() {
    return timeRestriction;
  }

  public void setTimeRestriction(TimeRestrictions timeRestriction) {
    this.timeRestriction = timeRestriction;
  }

  public TeamRoutingRulesRequestRule urgency(Urgency urgency) {
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
   * @return TeamRoutingRulesRequestRule
   */
  @JsonAnySetter
  public TeamRoutingRulesRequestRule putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TeamRoutingRulesRequestRule object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamRoutingRulesRequestRule teamRoutingRulesRequestRule = (TeamRoutingRulesRequestRule) o;
    return Objects.equals(this.actions, teamRoutingRulesRequestRule.actions)
        && Objects.equals(this.policyId, teamRoutingRulesRequestRule.policyId)
        && Objects.equals(this.query, teamRoutingRulesRequestRule.query)
        && Objects.equals(this.timeRestriction, teamRoutingRulesRequestRule.timeRestriction)
        && Objects.equals(this.urgency, teamRoutingRulesRequestRule.urgency)
        && Objects.equals(
            this.additionalProperties, teamRoutingRulesRequestRule.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, policyId, query, timeRestriction, urgency, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamRoutingRulesRequestRule {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    timeRestriction: ").append(toIndentedString(timeRestriction)).append("\n");
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
