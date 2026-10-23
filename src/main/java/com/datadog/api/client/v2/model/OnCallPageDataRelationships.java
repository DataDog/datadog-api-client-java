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

/** The relationships of an On-Call Page. */
@JsonPropertyOrder({
  OnCallPageDataRelationships.JSON_PROPERTY_AUTHOR,
  OnCallPageDataRelationships.JSON_PROPERTY_CLOSED_BY,
  OnCallPageDataRelationships.JSON_PROPERTY_JIRA_ISSUE,
  OnCallPageDataRelationships.JSON_PROPERTY_LINKS,
  OnCallPageDataRelationships.JSON_PROPERTY_RESPONDERS,
  OnCallPageDataRelationships.JSON_PROPERTY_SCHEDULED_ACTION,
  OnCallPageDataRelationships.JSON_PROPERTY_SERVICE_NOW_INCIDENT,
  OnCallPageDataRelationships.JSON_PROPERTY_TARGET,
  OnCallPageDataRelationships.JSON_PROPERTY_TEAM_ROUTING_RULE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OnCallPageDataRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHOR = "author";
  private OnCallPageAuthorRelationship author;

  public static final String JSON_PROPERTY_CLOSED_BY = "closed_by";
  private OnCallPageAuthorRelationship closedBy;

  public static final String JSON_PROPERTY_JIRA_ISSUE = "jira_issue";
  private OnCallPageJiraIssueRelationship jiraIssue;

  public static final String JSON_PROPERTY_LINKS = "links";
  private OnCallPageLinksRelationship links;

  public static final String JSON_PROPERTY_RESPONDERS = "responders";
  private OnCallPageRespondersRelationship responders;

  public static final String JSON_PROPERTY_SCHEDULED_ACTION = "scheduled_action";
  private OnCallPageScheduledActionRelationship scheduledAction;

  public static final String JSON_PROPERTY_SERVICE_NOW_INCIDENT = "service_now_incident";
  private OnCallPageServiceNowIncidentRelationship serviceNowIncident;

  public static final String JSON_PROPERTY_TARGET = "target";
  private OnCallPageTargetRelationship target;

  public static final String JSON_PROPERTY_TEAM_ROUTING_RULE = "team_routing_rule";
  private OnCallPageTeamRoutingRuleRelationship teamRoutingRule;

  public OnCallPageDataRelationships author(OnCallPageAuthorRelationship author) {
    this.author = author;
    this.unparsed |= author.unparsed;
    return this;
  }

  /**
   * Reference to the entity that performed an action on the page.
   *
   * @return author
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OnCallPageAuthorRelationship getAuthor() {
    return author;
  }

  public void setAuthor(OnCallPageAuthorRelationship author) {
    this.author = author;
    if (author != null) {
      this.unparsed |= author.unparsed;
    }
  }

  public OnCallPageDataRelationships closedBy(OnCallPageAuthorRelationship closedBy) {
    this.closedBy = closedBy;
    this.unparsed |= closedBy.unparsed;
    return this;
  }

  /**
   * Reference to the entity that performed an action on the page.
   *
   * @return closedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOSED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OnCallPageAuthorRelationship getClosedBy() {
    return closedBy;
  }

  public void setClosedBy(OnCallPageAuthorRelationship closedBy) {
    this.closedBy = closedBy;
    if (closedBy != null) {
      this.unparsed |= closedBy.unparsed;
    }
  }

  public OnCallPageDataRelationships jiraIssue(OnCallPageJiraIssueRelationship jiraIssue) {
    this.jiraIssue = jiraIssue;
    this.unparsed |= jiraIssue.unparsed;
    return this;
  }

  /**
   * The Jira issue linked to the page.
   *
   * @return jiraIssue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JIRA_ISSUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OnCallPageJiraIssueRelationship getJiraIssue() {
    return jiraIssue;
  }

  public void setJiraIssue(OnCallPageJiraIssueRelationship jiraIssue) {
    this.jiraIssue = jiraIssue;
    if (jiraIssue != null) {
      this.unparsed |= jiraIssue.unparsed;
    }
  }

  public OnCallPageDataRelationships links(OnCallPageLinksRelationship links) {
    this.links = links;
    this.unparsed |= links.unparsed;
    return this;
  }

  /**
   * Links between the page and other Datadog resources, such as incidents. Always empty when
   * listing pages.
   *
   * @return links
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OnCallPageLinksRelationship getLinks() {
    return links;
  }

  public void setLinks(OnCallPageLinksRelationship links) {
    this.links = links;
    if (links != null) {
      this.unparsed |= links.unparsed;
    }
  }

  public OnCallPageDataRelationships responders(OnCallPageRespondersRelationship responders) {
    this.responders = responders;
    this.unparsed |= responders.unparsed;
    return this;
  }

  /**
   * The users responding to the page.
   *
   * @return responders
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONDERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OnCallPageRespondersRelationship getResponders() {
    return responders;
  }

  public void setResponders(OnCallPageRespondersRelationship responders) {
    this.responders = responders;
    if (responders != null) {
      this.unparsed |= responders.unparsed;
    }
  }

  public OnCallPageDataRelationships scheduledAction(
      OnCallPageScheduledActionRelationship scheduledAction) {
    this.scheduledAction = scheduledAction;
    this.unparsed |= scheduledAction.unparsed;
    return this;
  }

  /**
   * The next action scheduled on the page, such as an escalation.
   *
   * @return scheduledAction
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULED_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OnCallPageScheduledActionRelationship getScheduledAction() {
    return scheduledAction;
  }

  public void setScheduledAction(OnCallPageScheduledActionRelationship scheduledAction) {
    this.scheduledAction = scheduledAction;
    if (scheduledAction != null) {
      this.unparsed |= scheduledAction.unparsed;
    }
  }

  public OnCallPageDataRelationships serviceNowIncident(
      OnCallPageServiceNowIncidentRelationship serviceNowIncident) {
    this.serviceNowIncident = serviceNowIncident;
    this.unparsed |= serviceNowIncident.unparsed;
    return this;
  }

  /**
   * The ServiceNow incident linked to the page.
   *
   * @return serviceNowIncident
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_NOW_INCIDENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OnCallPageServiceNowIncidentRelationship getServiceNowIncident() {
    return serviceNowIncident;
  }

  public void setServiceNowIncident(OnCallPageServiceNowIncidentRelationship serviceNowIncident) {
    this.serviceNowIncident = serviceNowIncident;
    if (serviceNowIncident != null) {
      this.unparsed |= serviceNowIncident.unparsed;
    }
  }

  public OnCallPageDataRelationships target(OnCallPageTargetRelationship target) {
    this.target = target;
    this.unparsed |= target.unparsed;
    return this;
  }

  /**
   * The team, user, or cross-organization handle that was paged.
   *
   * @return target
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OnCallPageTargetRelationship getTarget() {
    return target;
  }

  public void setTarget(OnCallPageTargetRelationship target) {
    this.target = target;
    if (target != null) {
      this.unparsed |= target.unparsed;
    }
  }

  public OnCallPageDataRelationships teamRoutingRule(
      OnCallPageTeamRoutingRuleRelationship teamRoutingRule) {
    this.teamRoutingRule = teamRoutingRule;
    this.unparsed |= teamRoutingRule.unparsed;
    return this;
  }

  /**
   * The team routing rule that matched the page.
   *
   * @return teamRoutingRule
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_ROUTING_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OnCallPageTeamRoutingRuleRelationship getTeamRoutingRule() {
    return teamRoutingRule;
  }

  public void setTeamRoutingRule(OnCallPageTeamRoutingRuleRelationship teamRoutingRule) {
    this.teamRoutingRule = teamRoutingRule;
    if (teamRoutingRule != null) {
      this.unparsed |= teamRoutingRule.unparsed;
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
   * @return OnCallPageDataRelationships
   */
  @JsonAnySetter
  public OnCallPageDataRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OnCallPageDataRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnCallPageDataRelationships onCallPageDataRelationships = (OnCallPageDataRelationships) o;
    return Objects.equals(this.author, onCallPageDataRelationships.author)
        && Objects.equals(this.closedBy, onCallPageDataRelationships.closedBy)
        && Objects.equals(this.jiraIssue, onCallPageDataRelationships.jiraIssue)
        && Objects.equals(this.links, onCallPageDataRelationships.links)
        && Objects.equals(this.responders, onCallPageDataRelationships.responders)
        && Objects.equals(this.scheduledAction, onCallPageDataRelationships.scheduledAction)
        && Objects.equals(this.serviceNowIncident, onCallPageDataRelationships.serviceNowIncident)
        && Objects.equals(this.target, onCallPageDataRelationships.target)
        && Objects.equals(this.teamRoutingRule, onCallPageDataRelationships.teamRoutingRule)
        && Objects.equals(
            this.additionalProperties, onCallPageDataRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        author,
        closedBy,
        jiraIssue,
        links,
        responders,
        scheduledAction,
        serviceNowIncident,
        target,
        teamRoutingRule,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnCallPageDataRelationships {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    closedBy: ").append(toIndentedString(closedBy)).append("\n");
    sb.append("    jiraIssue: ").append(toIndentedString(jiraIssue)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    responders: ").append(toIndentedString(responders)).append("\n");
    sb.append("    scheduledAction: ").append(toIndentedString(scheduledAction)).append("\n");
    sb.append("    serviceNowIncident: ").append(toIndentedString(serviceNowIncident)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    teamRoutingRule: ").append(toIndentedString(teamRoutingRule)).append("\n");
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
