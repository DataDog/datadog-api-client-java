/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Recipient data</p>
 */
@JsonPropertyOrder({
  CaseNotificationRuleRecipientData.JSON_PROPERTY_CHANNEL,
  CaseNotificationRuleRecipientData.JSON_PROPERTY_CHANNEL_ID,
  CaseNotificationRuleRecipientData.JSON_PROPERTY_CHANNEL_NAME,
  CaseNotificationRuleRecipientData.JSON_PROPERTY_CONNECTOR_NAME,
  CaseNotificationRuleRecipientData.JSON_PROPERTY_EMAIL,
  CaseNotificationRuleRecipientData.JSON_PROPERTY_NAME,
  CaseNotificationRuleRecipientData.JSON_PROPERTY_SERVICE_NAME,
  CaseNotificationRuleRecipientData.JSON_PROPERTY_TEAM_ID,
  CaseNotificationRuleRecipientData.JSON_PROPERTY_TEAM_NAME,
  CaseNotificationRuleRecipientData.JSON_PROPERTY_TENANT_ID,
  CaseNotificationRuleRecipientData.JSON_PROPERTY_TENANT_NAME,
  CaseNotificationRuleRecipientData.JSON_PROPERTY_WORKSPACE,
  CaseNotificationRuleRecipientData.JSON_PROPERTY_WORKSPACE_ID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CaseNotificationRuleRecipientData {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHANNEL = "channel";
  private String channel;

  public static final String JSON_PROPERTY_CHANNEL_ID = "channel_id";
  private String channelId;

  public static final String JSON_PROPERTY_CHANNEL_NAME = "channel_name";
  private String channelName;

  public static final String JSON_PROPERTY_CONNECTOR_NAME = "connector_name";
  private String connectorName;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

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

  public static final String JSON_PROPERTY_WORKSPACE = "workspace";
  private String workspace;

  public static final String JSON_PROPERTY_WORKSPACE_ID = "workspace_id";
  private String workspaceId;

  public CaseNotificationRuleRecipientData channel(String channel) {
    this.channel = channel;
    return this;
  }

  /**
   * <p>Slack channel name</p>
   * @return channel
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CHANNEL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getChannel() {
        return channel;
      }
  public void setChannel(String channel) {
    this.channel = channel;
  }
  public CaseNotificationRuleRecipientData channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * <p>Slack channel ID</p>
   * @return channelId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CHANNEL_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getChannelId() {
        return channelId;
      }
  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }
  public CaseNotificationRuleRecipientData channelName(String channelName) {
    this.channelName = channelName;
    return this;
  }

  /**
   * <p>Microsoft Teams channel name</p>
   * @return channelName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CHANNEL_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getChannelName() {
        return channelName;
      }
  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }
  public CaseNotificationRuleRecipientData connectorName(String connectorName) {
    this.connectorName = connectorName;
    return this;
  }

  /**
   * <p>Microsoft Teams connector name</p>
   * @return connectorName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONNECTOR_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getConnectorName() {
        return connectorName;
      }
  public void setConnectorName(String connectorName) {
    this.connectorName = connectorName;
  }
  public CaseNotificationRuleRecipientData email(String email) {
    this.email = email;
    return this;
  }

  /**
   * <p>Email address</p>
   * @return email
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EMAIL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getEmail() {
        return email;
      }
  public void setEmail(String email) {
    this.email = email;
  }
  public CaseNotificationRuleRecipientData name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>HTTP webhook name</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public CaseNotificationRuleRecipientData serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * <p>PagerDuty service name</p>
   * @return serviceName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getServiceName() {
        return serviceName;
      }
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }
  public CaseNotificationRuleRecipientData teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * <p>Microsoft Teams team ID</p>
   * @return teamId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TEAM_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTeamId() {
        return teamId;
      }
  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }
  public CaseNotificationRuleRecipientData teamName(String teamName) {
    this.teamName = teamName;
    return this;
  }

  /**
   * <p>Microsoft Teams team name</p>
   * @return teamName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TEAM_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTeamName() {
        return teamName;
      }
  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }
  public CaseNotificationRuleRecipientData tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * <p>Microsoft Teams tenant ID</p>
   * @return tenantId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TENANT_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTenantId() {
        return tenantId;
      }
  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }
  public CaseNotificationRuleRecipientData tenantName(String tenantName) {
    this.tenantName = tenantName;
    return this;
  }

  /**
   * <p>Microsoft Teams tenant name</p>
   * @return tenantName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TENANT_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTenantName() {
        return tenantName;
      }
  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }
  public CaseNotificationRuleRecipientData workspace(String workspace) {
    this.workspace = workspace;
    return this;
  }

  /**
   * <p>Slack workspace name</p>
   * @return workspace
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_WORKSPACE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getWorkspace() {
        return workspace;
      }
  public void setWorkspace(String workspace) {
    this.workspace = workspace;
  }
  public CaseNotificationRuleRecipientData workspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  /**
   * <p>Slack workspace ID</p>
   * @return workspaceId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_WORKSPACE_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getWorkspaceId() {
        return workspaceId;
      }
  public void setWorkspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return CaseNotificationRuleRecipientData
   */
  @JsonAnySetter
  public CaseNotificationRuleRecipientData putAdditionalProperty(String key, Object value) {
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
   * Return true if this CaseNotificationRuleRecipientData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseNotificationRuleRecipientData caseNotificationRuleRecipientData = (CaseNotificationRuleRecipientData) o;
    return Objects.equals(this.channel, caseNotificationRuleRecipientData.channel) && Objects.equals(this.channelId, caseNotificationRuleRecipientData.channelId) && Objects.equals(this.channelName, caseNotificationRuleRecipientData.channelName) && Objects.equals(this.connectorName, caseNotificationRuleRecipientData.connectorName) && Objects.equals(this.email, caseNotificationRuleRecipientData.email) && Objects.equals(this.name, caseNotificationRuleRecipientData.name) && Objects.equals(this.serviceName, caseNotificationRuleRecipientData.serviceName) && Objects.equals(this.teamId, caseNotificationRuleRecipientData.teamId) && Objects.equals(this.teamName, caseNotificationRuleRecipientData.teamName) && Objects.equals(this.tenantId, caseNotificationRuleRecipientData.tenantId) && Objects.equals(this.tenantName, caseNotificationRuleRecipientData.tenantName) && Objects.equals(this.workspace, caseNotificationRuleRecipientData.workspace) && Objects.equals(this.workspaceId, caseNotificationRuleRecipientData.workspaceId) && Objects.equals(this.additionalProperties, caseNotificationRuleRecipientData.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(channel,channelId,channelName,connectorName,email,name,serviceName,teamId,teamName,tenantId,tenantName,workspace,workspaceId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseNotificationRuleRecipientData {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    connectorName: ").append(toIndentedString(connectorName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
