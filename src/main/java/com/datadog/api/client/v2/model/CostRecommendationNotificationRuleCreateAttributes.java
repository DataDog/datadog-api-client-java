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
 * Attributes of a new recommendation notification rule. Schedule attributes depend on <code>
 * frequency</code> and target attributes depend on <code>destination_type</code>.
 */
@JsonPropertyOrder({
  CostRecommendationNotificationRuleCreateAttributes.JSON_PROPERTY_CHANNEL_ID,
  CostRecommendationNotificationRuleCreateAttributes.JSON_PROPERTY_DESTINATION_TYPE,
  CostRecommendationNotificationRuleCreateAttributes.JSON_PROPERTY_ENABLED,
  CostRecommendationNotificationRuleCreateAttributes.JSON_PROPERTY_FREQUENCY,
  CostRecommendationNotificationRuleCreateAttributes.JSON_PROPERTY_INTERVAL_EXECUTION_DATE,
  CostRecommendationNotificationRuleCreateAttributes.JSON_PROPERTY_INTERVAL_EXECUTION_TIME,
  CostRecommendationNotificationRuleCreateAttributes.JSON_PROPERTY_MENTION_TARGETS,
  CostRecommendationNotificationRuleCreateAttributes.JSON_PROPERTY_MESSAGE_CUSTOMIZATION,
  CostRecommendationNotificationRuleCreateAttributes.JSON_PROPERTY_NAME,
  CostRecommendationNotificationRuleCreateAttributes.JSON_PROPERTY_SCOPE_QUERY,
  CostRecommendationNotificationRuleCreateAttributes.JSON_PROPERTY_TEAMS_CHANNEL_ID,
  CostRecommendationNotificationRuleCreateAttributes.JSON_PROPERTY_TEAMS_CHANNEL_NAME,
  CostRecommendationNotificationRuleCreateAttributes.JSON_PROPERTY_TEAMS_TEAM_ID,
  CostRecommendationNotificationRuleCreateAttributes.JSON_PROPERTY_TEAMS_TEAM_NAME,
  CostRecommendationNotificationRuleCreateAttributes.JSON_PROPERTY_TEAMS_TENANT_ID,
  CostRecommendationNotificationRuleCreateAttributes.JSON_PROPERTY_TEAMS_TENANT_NAME,
  CostRecommendationNotificationRuleCreateAttributes.JSON_PROPERTY_TIMEZONE,
  CostRecommendationNotificationRuleCreateAttributes.JSON_PROPERTY_WEEKLY_EXECUTION_DAY,
  CostRecommendationNotificationRuleCreateAttributes.JSON_PROPERTY_WEEKLY_EXECUTION_TIME,
  CostRecommendationNotificationRuleCreateAttributes.JSON_PROPERTY_WORKSPACE_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CostRecommendationNotificationRuleCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHANNEL_ID = "channel_id";
  private String channelId;

  public static final String JSON_PROPERTY_DESTINATION_TYPE = "destination_type";
  private CostRecommendationNotificationRuleDestinationType destinationType;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private CostRecommendationNotificationRuleFrequency frequency;

  public static final String JSON_PROPERTY_INTERVAL_EXECUTION_DATE = "interval_execution_date";
  private String intervalExecutionDate;

  public static final String JSON_PROPERTY_INTERVAL_EXECUTION_TIME = "interval_execution_time";
  private String intervalExecutionTime;

  public static final String JSON_PROPERTY_MENTION_TARGETS = "mention_targets";
  private List<String> mentionTargets = null;

  public static final String JSON_PROPERTY_MESSAGE_CUSTOMIZATION = "message_customization";
  private CostRecommendationNotificationRuleMessageCustomization messageCustomization;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SCOPE_QUERY = "scope_query";
  private String scopeQuery;

  public static final String JSON_PROPERTY_TEAMS_CHANNEL_ID = "teams_channel_id";
  private String teamsChannelId;

  public static final String JSON_PROPERTY_TEAMS_CHANNEL_NAME = "teams_channel_name";
  private String teamsChannelName;

  public static final String JSON_PROPERTY_TEAMS_TEAM_ID = "teams_team_id";
  private String teamsTeamId;

  public static final String JSON_PROPERTY_TEAMS_TEAM_NAME = "teams_team_name";
  private String teamsTeamName;

  public static final String JSON_PROPERTY_TEAMS_TENANT_ID = "teams_tenant_id";
  private String teamsTenantId;

  public static final String JSON_PROPERTY_TEAMS_TENANT_NAME = "teams_tenant_name";
  private String teamsTenantName;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_WEEKLY_EXECUTION_DAY = "weekly_execution_day";
  private String weeklyExecutionDay;

  public static final String JSON_PROPERTY_WEEKLY_EXECUTION_TIME = "weekly_execution_time";
  private String weeklyExecutionTime;

  public static final String JSON_PROPERTY_WORKSPACE_ID = "workspace_id";
  private String workspaceId;

  public CostRecommendationNotificationRuleCreateAttributes() {}

  @JsonCreator
  public CostRecommendationNotificationRuleCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FREQUENCY)
          CostRecommendationNotificationRuleFrequency frequency,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMEZONE) String timezone) {
    this.frequency = frequency;
    this.unparsed |= !frequency.isValid();
    this.name = name;
    this.timezone = timezone;
  }

  public CostRecommendationNotificationRuleCreateAttributes channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * The Slack channel ID, starting with <code>C</code> or <code>G</code>. Required for <code>slack
   * </code> rules.
   *
   * @return channelId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public CostRecommendationNotificationRuleCreateAttributes destinationType(
      CostRecommendationNotificationRuleDestinationType destinationType) {
    this.destinationType = destinationType;
    this.unparsed |= !destinationType.isValid();
    return this;
  }

  /**
   * Where the digest is sent. <code>slack</code> requires <code>workspace_id</code> and <code>
   * channel_id</code>; <code>teams</code> requires the <code>teams_*</code> attributes. Defaults to
   * <code>slack</code>.
   *
   * @return destinationType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESTINATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CostRecommendationNotificationRuleDestinationType getDestinationType() {
    return destinationType;
  }

  public void setDestinationType(
      CostRecommendationNotificationRuleDestinationType destinationType) {
    if (!destinationType.isValid()) {
      this.unparsed = true;
    }
    this.destinationType = destinationType;
  }

  public CostRecommendationNotificationRuleCreateAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the digest is sent. Defaults to <code>true</code>.
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

  public CostRecommendationNotificationRuleCreateAttributes frequency(
      CostRecommendationNotificationRuleFrequency frequency) {
    this.frequency = frequency;
    this.unparsed |= !frequency.isValid();
    return this;
  }

  /**
   * How often the digest is sent. <code>weekly</code> and <code>biweekly</code> use <code>
   * weekly_execution_day</code> and <code>weekly_execution_time</code>; <code>every_30</code> and
   * <code>every_90</code> (days) use <code>interval_execution_date</code> and <code>
   * interval_execution_time</code>.
   *
   * @return frequency
   */
  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CostRecommendationNotificationRuleFrequency getFrequency() {
    return frequency;
  }

  public void setFrequency(CostRecommendationNotificationRuleFrequency frequency) {
    if (!frequency.isValid()) {
      this.unparsed = true;
    }
    this.frequency = frequency;
  }

  public CostRecommendationNotificationRuleCreateAttributes intervalExecutionDate(
      String intervalExecutionDate) {
    this.intervalExecutionDate = intervalExecutionDate;
    return this;
  }

  /**
   * The first date (<code>YYYY-MM-DD</code>) of an <code>every_30</code> or <code>every_90</code>
   * schedule.
   *
   * @return intervalExecutionDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL_EXECUTION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIntervalExecutionDate() {
    return intervalExecutionDate;
  }

  public void setIntervalExecutionDate(String intervalExecutionDate) {
    this.intervalExecutionDate = intervalExecutionDate;
  }

  public CostRecommendationNotificationRuleCreateAttributes intervalExecutionTime(
      String intervalExecutionTime) {
    this.intervalExecutionTime = intervalExecutionTime;
    return this;
  }

  /**
   * The time of day (<code>HH:MM</code>, in <code>timezone</code>) of an <code>every_30</code> or
   * <code>every_90</code> schedule.
   *
   * @return intervalExecutionTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL_EXECUTION_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIntervalExecutionTime() {
    return intervalExecutionTime;
  }

  public void setIntervalExecutionTime(String intervalExecutionTime) {
    this.intervalExecutionTime = intervalExecutionTime;
  }

  public CostRecommendationNotificationRuleCreateAttributes mentionTargets(
      List<String> mentionTargets) {
    this.mentionTargets = mentionTargets;
    return this;
  }

  public CostRecommendationNotificationRuleCreateAttributes addMentionTargetsItem(
      String mentionTargetsItem) {
    if (this.mentionTargets == null) {
      this.mentionTargets = new ArrayList<>();
    }
    this.mentionTargets.add(mentionTargetsItem);
    return this;
  }

  /**
   * Slack member IDs to mention in the digest. Only valid for <code>slack</code> rules.
   *
   * @return mentionTargets
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MENTION_TARGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getMentionTargets() {
    return mentionTargets;
  }

  public void setMentionTargets(List<String> mentionTargets) {
    this.mentionTargets = mentionTargets;
  }

  public CostRecommendationNotificationRuleCreateAttributes messageCustomization(
      CostRecommendationNotificationRuleMessageCustomization messageCustomization) {
    this.messageCustomization = messageCustomization;
    this.unparsed |= messageCustomization.unparsed;
    return this;
  }

  /**
   * Which sections the digest shows. Sent as a whole: sections left out of a request use their
   * defaults, which show everything.
   *
   * @return messageCustomization
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE_CUSTOMIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CostRecommendationNotificationRuleMessageCustomization getMessageCustomization() {
    return messageCustomization;
  }

  public void setMessageCustomization(
      CostRecommendationNotificationRuleMessageCustomization messageCustomization) {
    this.messageCustomization = messageCustomization;
    if (messageCustomization != null) {
      this.unparsed |= messageCustomization.unparsed;
    }
  }

  public CostRecommendationNotificationRuleCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the rule, unique within the organization.
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

  public CostRecommendationNotificationRuleCreateAttributes scopeQuery(String scopeQuery) {
    this.scopeQuery = scopeQuery;
    return this;
  }

  /**
   * The recommendation search query that selects what the digest includes. Empty selects every
   * recommendation.
   *
   * @return scopeQuery
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getScopeQuery() {
    return scopeQuery;
  }

  public void setScopeQuery(String scopeQuery) {
    this.scopeQuery = scopeQuery;
  }

  public CostRecommendationNotificationRuleCreateAttributes teamsChannelId(String teamsChannelId) {
    this.teamsChannelId = teamsChannelId;
    return this;
  }

  /**
   * The Microsoft Teams channel ID. Required for <code>teams</code> rules.
   *
   * @return teamsChannelId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAMS_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTeamsChannelId() {
    return teamsChannelId;
  }

  public void setTeamsChannelId(String teamsChannelId) {
    this.teamsChannelId = teamsChannelId;
  }

  public CostRecommendationNotificationRuleCreateAttributes teamsChannelName(
      String teamsChannelName) {
    this.teamsChannelName = teamsChannelName;
    return this;
  }

  /**
   * The Microsoft Teams channel name. Required for <code>teams</code> rules.
   *
   * @return teamsChannelName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAMS_CHANNEL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTeamsChannelName() {
    return teamsChannelName;
  }

  public void setTeamsChannelName(String teamsChannelName) {
    this.teamsChannelName = teamsChannelName;
  }

  public CostRecommendationNotificationRuleCreateAttributes teamsTeamId(String teamsTeamId) {
    this.teamsTeamId = teamsTeamId;
    return this;
  }

  /**
   * The Microsoft Teams team ID. Required for <code>teams</code> rules.
   *
   * @return teamsTeamId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAMS_TEAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTeamsTeamId() {
    return teamsTeamId;
  }

  public void setTeamsTeamId(String teamsTeamId) {
    this.teamsTeamId = teamsTeamId;
  }

  public CostRecommendationNotificationRuleCreateAttributes teamsTeamName(String teamsTeamName) {
    this.teamsTeamName = teamsTeamName;
    return this;
  }

  /**
   * The Microsoft Teams team name. Required for <code>teams</code> rules.
   *
   * @return teamsTeamName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAMS_TEAM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTeamsTeamName() {
    return teamsTeamName;
  }

  public void setTeamsTeamName(String teamsTeamName) {
    this.teamsTeamName = teamsTeamName;
  }

  public CostRecommendationNotificationRuleCreateAttributes teamsTenantId(String teamsTenantId) {
    this.teamsTenantId = teamsTenantId;
    return this;
  }

  /**
   * The Microsoft Teams tenant ID. Required for <code>teams</code> rules.
   *
   * @return teamsTenantId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAMS_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTeamsTenantId() {
    return teamsTenantId;
  }

  public void setTeamsTenantId(String teamsTenantId) {
    this.teamsTenantId = teamsTenantId;
  }

  public CostRecommendationNotificationRuleCreateAttributes teamsTenantName(
      String teamsTenantName) {
    this.teamsTenantName = teamsTenantName;
    return this;
  }

  /**
   * The Microsoft Teams tenant name. Required for <code>teams</code> rules.
   *
   * @return teamsTenantName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAMS_TENANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTeamsTenantName() {
    return teamsTenantName;
  }

  public void setTeamsTenantName(String teamsTenantName) {
    this.teamsTenantName = teamsTenantName;
  }

  public CostRecommendationNotificationRuleCreateAttributes timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * The IANA time zone of the schedule.
   *
   * @return timezone
   */
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public CostRecommendationNotificationRuleCreateAttributes weeklyExecutionDay(
      String weeklyExecutionDay) {
    this.weeklyExecutionDay = weeklyExecutionDay;
    return this;
  }

  /**
   * The day of the week of a <code>weekly</code> or <code>biweekly</code> schedule, such as <code>
   * monday</code>.
   *
   * @return weeklyExecutionDay
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEEKLY_EXECUTION_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWeeklyExecutionDay() {
    return weeklyExecutionDay;
  }

  public void setWeeklyExecutionDay(String weeklyExecutionDay) {
    this.weeklyExecutionDay = weeklyExecutionDay;
  }

  public CostRecommendationNotificationRuleCreateAttributes weeklyExecutionTime(
      String weeklyExecutionTime) {
    this.weeklyExecutionTime = weeklyExecutionTime;
    return this;
  }

  /**
   * The time of day (<code>HH:MM</code>, in <code>timezone</code>) of a <code>weekly</code> or
   * <code>biweekly</code> schedule.
   *
   * @return weeklyExecutionTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEEKLY_EXECUTION_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWeeklyExecutionTime() {
    return weeklyExecutionTime;
  }

  public void setWeeklyExecutionTime(String weeklyExecutionTime) {
    this.weeklyExecutionTime = weeklyExecutionTime;
  }

  public CostRecommendationNotificationRuleCreateAttributes workspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  /**
   * The Slack workspace ID, starting with <code>T</code>. Required for <code>slack</code> rules.
   *
   * @return workspaceId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKSPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWorkspaceId() {
    return workspaceId;
  }

  public void setWorkspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
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
   * @return CostRecommendationNotificationRuleCreateAttributes
   */
  @JsonAnySetter
  public CostRecommendationNotificationRuleCreateAttributes putAdditionalProperty(
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

  /**
   * Return true if this CostRecommendationNotificationRuleCreateAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostRecommendationNotificationRuleCreateAttributes
        costRecommendationNotificationRuleCreateAttributes =
            (CostRecommendationNotificationRuleCreateAttributes) o;
    return Objects.equals(
            this.channelId, costRecommendationNotificationRuleCreateAttributes.channelId)
        && Objects.equals(
            this.destinationType,
            costRecommendationNotificationRuleCreateAttributes.destinationType)
        && Objects.equals(this.enabled, costRecommendationNotificationRuleCreateAttributes.enabled)
        && Objects.equals(
            this.frequency, costRecommendationNotificationRuleCreateAttributes.frequency)
        && Objects.equals(
            this.intervalExecutionDate,
            costRecommendationNotificationRuleCreateAttributes.intervalExecutionDate)
        && Objects.equals(
            this.intervalExecutionTime,
            costRecommendationNotificationRuleCreateAttributes.intervalExecutionTime)
        && Objects.equals(
            this.mentionTargets, costRecommendationNotificationRuleCreateAttributes.mentionTargets)
        && Objects.equals(
            this.messageCustomization,
            costRecommendationNotificationRuleCreateAttributes.messageCustomization)
        && Objects.equals(this.name, costRecommendationNotificationRuleCreateAttributes.name)
        && Objects.equals(
            this.scopeQuery, costRecommendationNotificationRuleCreateAttributes.scopeQuery)
        && Objects.equals(
            this.teamsChannelId, costRecommendationNotificationRuleCreateAttributes.teamsChannelId)
        && Objects.equals(
            this.teamsChannelName,
            costRecommendationNotificationRuleCreateAttributes.teamsChannelName)
        && Objects.equals(
            this.teamsTeamId, costRecommendationNotificationRuleCreateAttributes.teamsTeamId)
        && Objects.equals(
            this.teamsTeamName, costRecommendationNotificationRuleCreateAttributes.teamsTeamName)
        && Objects.equals(
            this.teamsTenantId, costRecommendationNotificationRuleCreateAttributes.teamsTenantId)
        && Objects.equals(
            this.teamsTenantName,
            costRecommendationNotificationRuleCreateAttributes.teamsTenantName)
        && Objects.equals(
            this.timezone, costRecommendationNotificationRuleCreateAttributes.timezone)
        && Objects.equals(
            this.weeklyExecutionDay,
            costRecommendationNotificationRuleCreateAttributes.weeklyExecutionDay)
        && Objects.equals(
            this.weeklyExecutionTime,
            costRecommendationNotificationRuleCreateAttributes.weeklyExecutionTime)
        && Objects.equals(
            this.workspaceId, costRecommendationNotificationRuleCreateAttributes.workspaceId)
        && Objects.equals(
            this.additionalProperties,
            costRecommendationNotificationRuleCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        channelId,
        destinationType,
        enabled,
        frequency,
        intervalExecutionDate,
        intervalExecutionTime,
        mentionTargets,
        messageCustomization,
        name,
        scopeQuery,
        teamsChannelId,
        teamsChannelName,
        teamsTeamId,
        teamsTeamName,
        teamsTenantId,
        teamsTenantName,
        timezone,
        weeklyExecutionDay,
        weeklyExecutionTime,
        workspaceId,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostRecommendationNotificationRuleCreateAttributes {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    intervalExecutionDate: ")
        .append(toIndentedString(intervalExecutionDate))
        .append("\n");
    sb.append("    intervalExecutionTime: ")
        .append(toIndentedString(intervalExecutionTime))
        .append("\n");
    sb.append("    mentionTargets: ").append(toIndentedString(mentionTargets)).append("\n");
    sb.append("    messageCustomization: ")
        .append(toIndentedString(messageCustomization))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scopeQuery: ").append(toIndentedString(scopeQuery)).append("\n");
    sb.append("    teamsChannelId: ").append(toIndentedString(teamsChannelId)).append("\n");
    sb.append("    teamsChannelName: ").append(toIndentedString(teamsChannelName)).append("\n");
    sb.append("    teamsTeamId: ").append(toIndentedString(teamsTeamId)).append("\n");
    sb.append("    teamsTeamName: ").append(toIndentedString(teamsTeamName)).append("\n");
    sb.append("    teamsTenantId: ").append(toIndentedString(teamsTenantId)).append("\n");
    sb.append("    teamsTenantName: ").append(toIndentedString(teamsTenantName)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    weeklyExecutionDay: ").append(toIndentedString(weeklyExecutionDay)).append("\n");
    sb.append("    weeklyExecutionTime: ")
        .append(toIndentedString(weeklyExecutionTime))
        .append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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
