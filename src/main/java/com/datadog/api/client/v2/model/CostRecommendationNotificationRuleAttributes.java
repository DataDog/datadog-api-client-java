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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes of a recommendation notification rule. */
@JsonPropertyOrder({
  CostRecommendationNotificationRuleAttributes.JSON_PROPERTY_CHANNEL_ID,
  CostRecommendationNotificationRuleAttributes.JSON_PROPERTY_CREATED_AT,
  CostRecommendationNotificationRuleAttributes.JSON_PROPERTY_CREATED_BY,
  CostRecommendationNotificationRuleAttributes.JSON_PROPERTY_DESTINATION_TYPE,
  CostRecommendationNotificationRuleAttributes.JSON_PROPERTY_ENABLED,
  CostRecommendationNotificationRuleAttributes.JSON_PROPERTY_FREQUENCY,
  CostRecommendationNotificationRuleAttributes.JSON_PROPERTY_INTERVAL_EXECUTION_DATE,
  CostRecommendationNotificationRuleAttributes.JSON_PROPERTY_INTERVAL_EXECUTION_TIME,
  CostRecommendationNotificationRuleAttributes.JSON_PROPERTY_MENTION_TARGETS,
  CostRecommendationNotificationRuleAttributes.JSON_PROPERTY_MESSAGE_CUSTOMIZATION,
  CostRecommendationNotificationRuleAttributes.JSON_PROPERTY_MODIFIED_AT,
  CostRecommendationNotificationRuleAttributes.JSON_PROPERTY_MODIFIED_BY,
  CostRecommendationNotificationRuleAttributes.JSON_PROPERTY_NAME,
  CostRecommendationNotificationRuleAttributes.JSON_PROPERTY_ORG_ID,
  CostRecommendationNotificationRuleAttributes.JSON_PROPERTY_SCOPE_QUERY,
  CostRecommendationNotificationRuleAttributes.JSON_PROPERTY_TEAMS_CHANNEL_ID,
  CostRecommendationNotificationRuleAttributes.JSON_PROPERTY_TEAMS_CHANNEL_NAME,
  CostRecommendationNotificationRuleAttributes.JSON_PROPERTY_TEAMS_TEAM_ID,
  CostRecommendationNotificationRuleAttributes.JSON_PROPERTY_TEAMS_TEAM_NAME,
  CostRecommendationNotificationRuleAttributes.JSON_PROPERTY_TEAMS_TENANT_ID,
  CostRecommendationNotificationRuleAttributes.JSON_PROPERTY_TEAMS_TENANT_NAME,
  CostRecommendationNotificationRuleAttributes.JSON_PROPERTY_TIMEZONE,
  CostRecommendationNotificationRuleAttributes.JSON_PROPERTY_WEEKLY_EXECUTION_DAY,
  CostRecommendationNotificationRuleAttributes.JSON_PROPERTY_WEEKLY_EXECUTION_TIME,
  CostRecommendationNotificationRuleAttributes.JSON_PROPERTY_WORKSPACE_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CostRecommendationNotificationRuleAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHANNEL_ID = "channel_id";
  private String channelId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

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
  private List<String> mentionTargets = new ArrayList<>();

  public static final String JSON_PROPERTY_MESSAGE_CUSTOMIZATION = "message_customization";
  private CostRecommendationNotificationRuleMessageCustomization messageCustomization;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modified_by";
  private String modifiedBy;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

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

  public CostRecommendationNotificationRuleAttributes() {}

  @JsonCreator
  public CostRecommendationNotificationRuleAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CHANNEL_ID) String channelId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY) String createdBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESTINATION_TYPE)
          CostRecommendationNotificationRuleDestinationType destinationType,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_FREQUENCY)
          CostRecommendationNotificationRuleFrequency frequency,
      @JsonProperty(required = true, value = JSON_PROPERTY_INTERVAL_EXECUTION_DATE)
          String intervalExecutionDate,
      @JsonProperty(required = true, value = JSON_PROPERTY_INTERVAL_EXECUTION_TIME)
          String intervalExecutionTime,
      @JsonProperty(required = true, value = JSON_PROPERTY_MENTION_TARGETS)
          List<String> mentionTargets,
      @JsonProperty(required = true, value = JSON_PROPERTY_MESSAGE_CUSTOMIZATION)
          CostRecommendationNotificationRuleMessageCustomization messageCustomization,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_BY) String modifiedBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORG_ID) Long orgId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SCOPE_QUERY) String scopeQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEAMS_CHANNEL_ID) String teamsChannelId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEAMS_CHANNEL_NAME)
          String teamsChannelName,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEAMS_TEAM_ID) String teamsTeamId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEAMS_TEAM_NAME) String teamsTeamName,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEAMS_TENANT_ID) String teamsTenantId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEAMS_TENANT_NAME)
          String teamsTenantName,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMEZONE) String timezone,
      @JsonProperty(required = true, value = JSON_PROPERTY_WEEKLY_EXECUTION_DAY)
          String weeklyExecutionDay,
      @JsonProperty(required = true, value = JSON_PROPERTY_WEEKLY_EXECUTION_TIME)
          String weeklyExecutionTime,
      @JsonProperty(required = true, value = JSON_PROPERTY_WORKSPACE_ID) String workspaceId) {
    this.channelId = channelId;
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.destinationType = destinationType;
    this.unparsed |= !destinationType.isValid();
    this.enabled = enabled;
    this.frequency = frequency;
    this.unparsed |= !frequency.isValid();
    this.intervalExecutionDate = intervalExecutionDate;
    if (intervalExecutionDate != null) {}
    this.intervalExecutionTime = intervalExecutionTime;
    if (intervalExecutionTime != null) {}
    this.mentionTargets = mentionTargets;
    this.messageCustomization = messageCustomization;
    this.unparsed |= messageCustomization.unparsed;
    this.modifiedAt = modifiedAt;
    this.modifiedBy = modifiedBy;
    this.name = name;
    this.orgId = orgId;
    this.scopeQuery = scopeQuery;
    this.teamsChannelId = teamsChannelId;
    this.teamsChannelName = teamsChannelName;
    this.teamsTeamId = teamsTeamId;
    this.teamsTeamName = teamsTeamName;
    this.teamsTenantId = teamsTenantId;
    this.teamsTenantName = teamsTenantName;
    this.timezone = timezone;
    this.weeklyExecutionDay = weeklyExecutionDay;
    if (weeklyExecutionDay != null) {}
    this.weeklyExecutionTime = weeklyExecutionTime;
    if (weeklyExecutionTime != null) {}
    this.workspaceId = workspaceId;
  }

  public CostRecommendationNotificationRuleAttributes channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * The Slack channel ID. Empty for <code>teams</code> rules.
   *
   * @return channelId
   */
  @JsonProperty(JSON_PROPERTY_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public CostRecommendationNotificationRuleAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * When the rule was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public CostRecommendationNotificationRuleAttributes createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The UUID of the user who created the rule.
   *
   * @return createdBy
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public CostRecommendationNotificationRuleAttributes destinationType(
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
  @JsonProperty(JSON_PROPERTY_DESTINATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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

  public CostRecommendationNotificationRuleAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the digest is sent.
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

  public CostRecommendationNotificationRuleAttributes frequency(
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

  public CostRecommendationNotificationRuleAttributes intervalExecutionDate(
      String intervalExecutionDate) {
    this.intervalExecutionDate = intervalExecutionDate;
    if (intervalExecutionDate != null) {}
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
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIntervalExecutionDate() {
    return intervalExecutionDate;
  }

  public void setIntervalExecutionDate(String intervalExecutionDate) {
    this.intervalExecutionDate = intervalExecutionDate;
  }

  public CostRecommendationNotificationRuleAttributes intervalExecutionTime(
      String intervalExecutionTime) {
    this.intervalExecutionTime = intervalExecutionTime;
    if (intervalExecutionTime != null) {}
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
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIntervalExecutionTime() {
    return intervalExecutionTime;
  }

  public void setIntervalExecutionTime(String intervalExecutionTime) {
    this.intervalExecutionTime = intervalExecutionTime;
  }

  public CostRecommendationNotificationRuleAttributes mentionTargets(List<String> mentionTargets) {
    this.mentionTargets = mentionTargets;
    return this;
  }

  public CostRecommendationNotificationRuleAttributes addMentionTargetsItem(
      String mentionTargetsItem) {
    this.mentionTargets.add(mentionTargetsItem);
    return this;
  }

  /**
   * Slack member IDs to mention in the digest. Only valid for <code>slack</code> rules.
   *
   * @return mentionTargets
   */
  @JsonProperty(JSON_PROPERTY_MENTION_TARGETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getMentionTargets() {
    return mentionTargets;
  }

  public void setMentionTargets(List<String> mentionTargets) {
    this.mentionTargets = mentionTargets;
  }

  public CostRecommendationNotificationRuleAttributes messageCustomization(
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
  @JsonProperty(JSON_PROPERTY_MESSAGE_CUSTOMIZATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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

  public CostRecommendationNotificationRuleAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * When the rule was last modified.
   *
   * @return modifiedAt
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public CostRecommendationNotificationRuleAttributes modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * The UUID of the user who last modified the rule.
   *
   * @return modifiedBy
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public CostRecommendationNotificationRuleAttributes name(String name) {
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

  public CostRecommendationNotificationRuleAttributes orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * The ID of the organization that owns the rule.
   *
   * @return orgId
   */
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public CostRecommendationNotificationRuleAttributes scopeQuery(String scopeQuery) {
    this.scopeQuery = scopeQuery;
    return this;
  }

  /**
   * The recommendation search query that selects what the digest includes. Empty selects every
   * recommendation.
   *
   * @return scopeQuery
   */
  @JsonProperty(JSON_PROPERTY_SCOPE_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getScopeQuery() {
    return scopeQuery;
  }

  public void setScopeQuery(String scopeQuery) {
    this.scopeQuery = scopeQuery;
  }

  public CostRecommendationNotificationRuleAttributes teamsChannelId(String teamsChannelId) {
    this.teamsChannelId = teamsChannelId;
    return this;
  }

  /**
   * The Microsoft Teams channel ID. Empty for <code>slack</code> rules.
   *
   * @return teamsChannelId
   */
  @JsonProperty(JSON_PROPERTY_TEAMS_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTeamsChannelId() {
    return teamsChannelId;
  }

  public void setTeamsChannelId(String teamsChannelId) {
    this.teamsChannelId = teamsChannelId;
  }

  public CostRecommendationNotificationRuleAttributes teamsChannelName(String teamsChannelName) {
    this.teamsChannelName = teamsChannelName;
    return this;
  }

  /**
   * The Microsoft Teams channel name. Empty for <code>slack</code> rules.
   *
   * @return teamsChannelName
   */
  @JsonProperty(JSON_PROPERTY_TEAMS_CHANNEL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTeamsChannelName() {
    return teamsChannelName;
  }

  public void setTeamsChannelName(String teamsChannelName) {
    this.teamsChannelName = teamsChannelName;
  }

  public CostRecommendationNotificationRuleAttributes teamsTeamId(String teamsTeamId) {
    this.teamsTeamId = teamsTeamId;
    return this;
  }

  /**
   * The Microsoft Teams team ID. Empty for <code>slack</code> rules.
   *
   * @return teamsTeamId
   */
  @JsonProperty(JSON_PROPERTY_TEAMS_TEAM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTeamsTeamId() {
    return teamsTeamId;
  }

  public void setTeamsTeamId(String teamsTeamId) {
    this.teamsTeamId = teamsTeamId;
  }

  public CostRecommendationNotificationRuleAttributes teamsTeamName(String teamsTeamName) {
    this.teamsTeamName = teamsTeamName;
    return this;
  }

  /**
   * The Microsoft Teams team name. Empty for <code>slack</code> rules.
   *
   * @return teamsTeamName
   */
  @JsonProperty(JSON_PROPERTY_TEAMS_TEAM_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTeamsTeamName() {
    return teamsTeamName;
  }

  public void setTeamsTeamName(String teamsTeamName) {
    this.teamsTeamName = teamsTeamName;
  }

  public CostRecommendationNotificationRuleAttributes teamsTenantId(String teamsTenantId) {
    this.teamsTenantId = teamsTenantId;
    return this;
  }

  /**
   * The Microsoft Teams tenant ID. Empty for <code>slack</code> rules.
   *
   * @return teamsTenantId
   */
  @JsonProperty(JSON_PROPERTY_TEAMS_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTeamsTenantId() {
    return teamsTenantId;
  }

  public void setTeamsTenantId(String teamsTenantId) {
    this.teamsTenantId = teamsTenantId;
  }

  public CostRecommendationNotificationRuleAttributes teamsTenantName(String teamsTenantName) {
    this.teamsTenantName = teamsTenantName;
    return this;
  }

  /**
   * The Microsoft Teams tenant name. Empty for <code>slack</code> rules.
   *
   * @return teamsTenantName
   */
  @JsonProperty(JSON_PROPERTY_TEAMS_TENANT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTeamsTenantName() {
    return teamsTenantName;
  }

  public void setTeamsTenantName(String teamsTenantName) {
    this.teamsTenantName = teamsTenantName;
  }

  public CostRecommendationNotificationRuleAttributes timezone(String timezone) {
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

  public CostRecommendationNotificationRuleAttributes weeklyExecutionDay(
      String weeklyExecutionDay) {
    this.weeklyExecutionDay = weeklyExecutionDay;
    if (weeklyExecutionDay != null) {}
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
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getWeeklyExecutionDay() {
    return weeklyExecutionDay;
  }

  public void setWeeklyExecutionDay(String weeklyExecutionDay) {
    this.weeklyExecutionDay = weeklyExecutionDay;
  }

  public CostRecommendationNotificationRuleAttributes weeklyExecutionTime(
      String weeklyExecutionTime) {
    this.weeklyExecutionTime = weeklyExecutionTime;
    if (weeklyExecutionTime != null) {}
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
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getWeeklyExecutionTime() {
    return weeklyExecutionTime;
  }

  public void setWeeklyExecutionTime(String weeklyExecutionTime) {
    this.weeklyExecutionTime = weeklyExecutionTime;
  }

  public CostRecommendationNotificationRuleAttributes workspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  /**
   * The Slack workspace ID. Empty for <code>teams</code> rules.
   *
   * @return workspaceId
   */
  @JsonProperty(JSON_PROPERTY_WORKSPACE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return CostRecommendationNotificationRuleAttributes
   */
  @JsonAnySetter
  public CostRecommendationNotificationRuleAttributes putAdditionalProperty(
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

  /** Return true if this CostRecommendationNotificationRuleAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostRecommendationNotificationRuleAttributes costRecommendationNotificationRuleAttributes =
        (CostRecommendationNotificationRuleAttributes) o;
    return Objects.equals(this.channelId, costRecommendationNotificationRuleAttributes.channelId)
        && Objects.equals(this.createdAt, costRecommendationNotificationRuleAttributes.createdAt)
        && Objects.equals(this.createdBy, costRecommendationNotificationRuleAttributes.createdBy)
        && Objects.equals(
            this.destinationType, costRecommendationNotificationRuleAttributes.destinationType)
        && Objects.equals(this.enabled, costRecommendationNotificationRuleAttributes.enabled)
        && Objects.equals(this.frequency, costRecommendationNotificationRuleAttributes.frequency)
        && Objects.equals(
            this.intervalExecutionDate,
            costRecommendationNotificationRuleAttributes.intervalExecutionDate)
        && Objects.equals(
            this.intervalExecutionTime,
            costRecommendationNotificationRuleAttributes.intervalExecutionTime)
        && Objects.equals(
            this.mentionTargets, costRecommendationNotificationRuleAttributes.mentionTargets)
        && Objects.equals(
            this.messageCustomization,
            costRecommendationNotificationRuleAttributes.messageCustomization)
        && Objects.equals(this.modifiedAt, costRecommendationNotificationRuleAttributes.modifiedAt)
        && Objects.equals(this.modifiedBy, costRecommendationNotificationRuleAttributes.modifiedBy)
        && Objects.equals(this.name, costRecommendationNotificationRuleAttributes.name)
        && Objects.equals(this.orgId, costRecommendationNotificationRuleAttributes.orgId)
        && Objects.equals(this.scopeQuery, costRecommendationNotificationRuleAttributes.scopeQuery)
        && Objects.equals(
            this.teamsChannelId, costRecommendationNotificationRuleAttributes.teamsChannelId)
        && Objects.equals(
            this.teamsChannelName, costRecommendationNotificationRuleAttributes.teamsChannelName)
        && Objects.equals(
            this.teamsTeamId, costRecommendationNotificationRuleAttributes.teamsTeamId)
        && Objects.equals(
            this.teamsTeamName, costRecommendationNotificationRuleAttributes.teamsTeamName)
        && Objects.equals(
            this.teamsTenantId, costRecommendationNotificationRuleAttributes.teamsTenantId)
        && Objects.equals(
            this.teamsTenantName, costRecommendationNotificationRuleAttributes.teamsTenantName)
        && Objects.equals(this.timezone, costRecommendationNotificationRuleAttributes.timezone)
        && Objects.equals(
            this.weeklyExecutionDay,
            costRecommendationNotificationRuleAttributes.weeklyExecutionDay)
        && Objects.equals(
            this.weeklyExecutionTime,
            costRecommendationNotificationRuleAttributes.weeklyExecutionTime)
        && Objects.equals(
            this.workspaceId, costRecommendationNotificationRuleAttributes.workspaceId)
        && Objects.equals(
            this.additionalProperties,
            costRecommendationNotificationRuleAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        channelId,
        createdAt,
        createdBy,
        destinationType,
        enabled,
        frequency,
        intervalExecutionDate,
        intervalExecutionTime,
        mentionTargets,
        messageCustomization,
        modifiedAt,
        modifiedBy,
        name,
        orgId,
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
    sb.append("class CostRecommendationNotificationRuleAttributes {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
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
