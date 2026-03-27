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

/** Team notification rule attributes */
@JsonPropertyOrder({
  TeamNotificationRuleAttributes.JSON_PROPERTY_EMAIL,
  TeamNotificationRuleAttributes.JSON_PROPERTY_MS_TEAMS,
  TeamNotificationRuleAttributes.JSON_PROPERTY_PAGERDUTY,
  TeamNotificationRuleAttributes.JSON_PROPERTY_SLACK
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamNotificationRuleAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EMAIL = "email";
  private TeamNotificationRuleAttributesEmail email;

  public static final String JSON_PROPERTY_MS_TEAMS = "ms_teams";
  private TeamNotificationRuleAttributesMsTeams msTeams;

  public static final String JSON_PROPERTY_PAGERDUTY = "pagerduty";
  private TeamNotificationRuleAttributesPagerduty pagerduty;

  public static final String JSON_PROPERTY_SLACK = "slack";
  private TeamNotificationRuleAttributesSlack slack;

  public TeamNotificationRuleAttributes email(TeamNotificationRuleAttributesEmail email) {
    this.email = email;
    this.unparsed |= email.unparsed;
    return this;
  }

  /**
   * Email notification settings for the team
   *
   * @return email
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TeamNotificationRuleAttributesEmail getEmail() {
    return email;
  }

  public void setEmail(TeamNotificationRuleAttributesEmail email) {
    this.email = email;
  }

  public TeamNotificationRuleAttributes msTeams(TeamNotificationRuleAttributesMsTeams msTeams) {
    this.msTeams = msTeams;
    this.unparsed |= msTeams.unparsed;
    return this;
  }

  /**
   * MS Teams notification settings for the team
   *
   * @return msTeams
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MS_TEAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TeamNotificationRuleAttributesMsTeams getMsTeams() {
    return msTeams;
  }

  public void setMsTeams(TeamNotificationRuleAttributesMsTeams msTeams) {
    this.msTeams = msTeams;
  }

  public TeamNotificationRuleAttributes pagerduty(
      TeamNotificationRuleAttributesPagerduty pagerduty) {
    this.pagerduty = pagerduty;
    this.unparsed |= pagerduty.unparsed;
    return this;
  }

  /**
   * PagerDuty notification settings for the team
   *
   * @return pagerduty
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGERDUTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TeamNotificationRuleAttributesPagerduty getPagerduty() {
    return pagerduty;
  }

  public void setPagerduty(TeamNotificationRuleAttributesPagerduty pagerduty) {
    this.pagerduty = pagerduty;
  }

  public TeamNotificationRuleAttributes slack(TeamNotificationRuleAttributesSlack slack) {
    this.slack = slack;
    this.unparsed |= slack.unparsed;
    return this;
  }

  /**
   * Slack notification settings for the team
   *
   * @return slack
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TeamNotificationRuleAttributesSlack getSlack() {
    return slack;
  }

  public void setSlack(TeamNotificationRuleAttributesSlack slack) {
    this.slack = slack;
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
   * @return TeamNotificationRuleAttributes
   */
  @JsonAnySetter
  public TeamNotificationRuleAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TeamNotificationRuleAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamNotificationRuleAttributes teamNotificationRuleAttributes =
        (TeamNotificationRuleAttributes) o;
    return Objects.equals(this.email, teamNotificationRuleAttributes.email)
        && Objects.equals(this.msTeams, teamNotificationRuleAttributes.msTeams)
        && Objects.equals(this.pagerduty, teamNotificationRuleAttributes.pagerduty)
        && Objects.equals(this.slack, teamNotificationRuleAttributes.slack)
        && Objects.equals(
            this.additionalProperties, teamNotificationRuleAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, msTeams, pagerduty, slack, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamNotificationRuleAttributes {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    msTeams: ").append(toIndentedString(msTeams)).append("\n");
    sb.append("    pagerduty: ").append(toIndentedString(pagerduty)).append("\n");
    sb.append("    slack: ").append(toIndentedString(slack)).append("\n");
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
