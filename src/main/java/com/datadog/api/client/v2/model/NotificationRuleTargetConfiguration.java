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
 * Configuration for a notification target. Which fields apply depends on the target's <code>type
 * </code>.
 */
@JsonPropertyOrder({
  NotificationRuleTargetConfiguration.JSON_PROPERTY_CHANNEL,
  NotificationRuleTargetConfiguration.JSON_PROPERTY_CHANNEL_ID,
  NotificationRuleTargetConfiguration.JSON_PROPERTY_CHANNEL_NAME,
  NotificationRuleTargetConfiguration.JSON_PROPERTY_CONNECTOR_NAME,
  NotificationRuleTargetConfiguration.JSON_PROPERTY_RECIPIENT,
  NotificationRuleTargetConfiguration.JSON_PROPERTY_SERVICE_NAME,
  NotificationRuleTargetConfiguration.JSON_PROPERTY_TEAM_ID,
  NotificationRuleTargetConfiguration.JSON_PROPERTY_TEAM_NAME,
  NotificationRuleTargetConfiguration.JSON_PROPERTY_TENANT_ID,
  NotificationRuleTargetConfiguration.JSON_PROPERTY_TENANT_NAME,
  NotificationRuleTargetConfiguration.JSON_PROPERTY_USERNAME,
  NotificationRuleTargetConfiguration.JSON_PROPERTY_WEBHOOK_NAME,
  NotificationRuleTargetConfiguration.JSON_PROPERTY_WORKSPACE,
  NotificationRuleTargetConfiguration.JSON_PROPERTY_WORKSPACE_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotificationRuleTargetConfiguration {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHANNEL = "channel";
  private String channel;

  public static final String JSON_PROPERTY_CHANNEL_ID = "channel_id";
  private String channelId;

  public static final String JSON_PROPERTY_CHANNEL_NAME = "channel_name";
  private String channelName;

  public static final String JSON_PROPERTY_CONNECTOR_NAME = "connector_name";
  private String connectorName;

  public static final String JSON_PROPERTY_RECIPIENT = "recipient";
  private NotificationRuleTargetConfigurationRecipient recipient;

  public static final String JSON_PROPERTY_SERVICE_NAME = "service_name";
  private String serviceName;

  public static final String JSON_PROPERTY_TEAM_ID = "team_id";
  private String teamId;

  public static final String JSON_PROPERTY_TEAM_NAME = "team_name";
  private String teamName;

  public static final String JSON_PROPERTY_TENANT_ID = "tenant_id";
  private String tenantId;

  public static final String JSON_PROPERTY_TENANT_NAME = "tenant_name";
  private String tenantName;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_WEBHOOK_NAME = "webhook_name";
  private String webhookName;

  public static final String JSON_PROPERTY_WORKSPACE = "workspace";
  private String workspace;

  public static final String JSON_PROPERTY_WORKSPACE_ID = "workspace_id";
  private String workspaceId;

  public NotificationRuleTargetConfiguration channel(String channel) {
    this.channel = channel;
    return this;
  }

  /**
   * Slack channel name, for a <code>SLACK_CHANNEL</code> target.
   *
   * @return channel
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public NotificationRuleTargetConfiguration channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * Slack channel ID for a <code>SLACK_CHANNEL</code> target, or Microsoft Teams channel ID for an
   * <code>MS_TEAMS_CHANNEL</code> target.
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

  public NotificationRuleTargetConfiguration channelName(String channelName) {
    this.channelName = channelName;
    return this;
  }

  /**
   * Microsoft Teams channel name, for an <code>MS_TEAMS_CHANNEL</code> target.
   *
   * @return channelName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANNEL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getChannelName() {
    return channelName;
  }

  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }

  public NotificationRuleTargetConfiguration connectorName(String connectorName) {
    this.connectorName = connectorName;
    return this;
  }

  /**
   * Microsoft Teams connector name, for an <code>MS_TEAMS_CHANNEL</code> target.
   *
   * @return connectorName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECTOR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getConnectorName() {
    return connectorName;
  }

  public void setConnectorName(String connectorName) {
    this.connectorName = connectorName;
  }

  public NotificationRuleTargetConfiguration recipient(
      NotificationRuleTargetConfigurationRecipient recipient) {
    this.recipient = recipient;
    this.unparsed |= recipient.unparsed;
    return this;
  }

  /**
   * Recipient for an <code>EMAIL</code> target.
   *
   * @return recipient
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECIPIENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotificationRuleTargetConfigurationRecipient getRecipient() {
    return recipient;
  }

  public void setRecipient(NotificationRuleTargetConfigurationRecipient recipient) {
    this.recipient = recipient;
    if (recipient != null) {
      this.unparsed |= recipient.unparsed;
    }
  }

  public NotificationRuleTargetConfiguration serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * PagerDuty service name, for a <code>PAGERDUTY_SERVICE</code> target.
   *
   * @return serviceName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public NotificationRuleTargetConfiguration teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * Microsoft Teams team ID, for an <code>MS_TEAMS_CHANNEL</code> target.
   *
   * @return teamId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  public NotificationRuleTargetConfiguration teamName(String teamName) {
    this.teamName = teamName;
    return this;
  }

  /**
   * Microsoft Teams team name, for an <code>MS_TEAMS_CHANNEL</code> target.
   *
   * @return teamName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public NotificationRuleTargetConfiguration tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Microsoft Teams tenant ID, for an <code>MS_TEAMS_CHANNEL</code> target.
   *
   * @return tenantId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public NotificationRuleTargetConfiguration tenantName(String tenantName) {
    this.tenantName = tenantName;
    return this;
  }

  /**
   * Microsoft Teams tenant name, for an <code>MS_TEAMS_CHANNEL</code> target.
   *
   * @return tenantName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TENANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTenantName() {
    return tenantName;
  }

  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  public NotificationRuleTargetConfiguration username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Slack username, for a <code>SLACK_USER</code> target.
   *
   * @return username
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public NotificationRuleTargetConfiguration webhookName(String webhookName) {
    this.webhookName = webhookName;
    return this;
  }

  /**
   * Name of the configured webhook, for a <code>WEBHOOK</code> target.
   *
   * @return webhookName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEBHOOK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWebhookName() {
    return webhookName;
  }

  public void setWebhookName(String webhookName) {
    this.webhookName = webhookName;
  }

  public NotificationRuleTargetConfiguration workspace(String workspace) {
    this.workspace = workspace;
    return this;
  }

  /**
   * Slack workspace name, for a <code>SLACK_CHANNEL</code> or <code>SLACK_USER</code> target.
   *
   * @return workspace
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKSPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWorkspace() {
    return workspace;
  }

  public void setWorkspace(String workspace) {
    this.workspace = workspace;
  }

  public NotificationRuleTargetConfiguration workspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  /**
   * Slack workspace ID, for a <code>SLACK_CHANNEL</code> target.
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
   * @return NotificationRuleTargetConfiguration
   */
  @JsonAnySetter
  public NotificationRuleTargetConfiguration putAdditionalProperty(String key, Object value) {
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

  /** Return true if this NotificationRuleTargetConfiguration object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationRuleTargetConfiguration notificationRuleTargetConfiguration =
        (NotificationRuleTargetConfiguration) o;
    return Objects.equals(this.channel, notificationRuleTargetConfiguration.channel)
        && Objects.equals(this.channelId, notificationRuleTargetConfiguration.channelId)
        && Objects.equals(this.channelName, notificationRuleTargetConfiguration.channelName)
        && Objects.equals(this.connectorName, notificationRuleTargetConfiguration.connectorName)
        && Objects.equals(this.recipient, notificationRuleTargetConfiguration.recipient)
        && Objects.equals(this.serviceName, notificationRuleTargetConfiguration.serviceName)
        && Objects.equals(this.teamId, notificationRuleTargetConfiguration.teamId)
        && Objects.equals(this.teamName, notificationRuleTargetConfiguration.teamName)
        && Objects.equals(this.tenantId, notificationRuleTargetConfiguration.tenantId)
        && Objects.equals(this.tenantName, notificationRuleTargetConfiguration.tenantName)
        && Objects.equals(this.username, notificationRuleTargetConfiguration.username)
        && Objects.equals(this.webhookName, notificationRuleTargetConfiguration.webhookName)
        && Objects.equals(this.workspace, notificationRuleTargetConfiguration.workspace)
        && Objects.equals(this.workspaceId, notificationRuleTargetConfiguration.workspaceId)
        && Objects.equals(
            this.additionalProperties, notificationRuleTargetConfiguration.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        channel,
        channelId,
        channelName,
        connectorName,
        recipient,
        serviceName,
        teamId,
        teamName,
        tenantId,
        tenantName,
        username,
        webhookName,
        workspace,
        workspaceId,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationRuleTargetConfiguration {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    connectorName: ").append(toIndentedString(connectorName)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    webhookName: ").append(toIndentedString(webhookName)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
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
