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

/** Handle attributes. */
@JsonPropertyOrder({
  MicrosoftTeamsApiHandleInfoResponseAttributes.JSON_PROPERTY_CHANNEL_ID,
  MicrosoftTeamsApiHandleInfoResponseAttributes.JSON_PROPERTY_CHANNEL_NAME,
  MicrosoftTeamsApiHandleInfoResponseAttributes.JSON_PROPERTY_NAME,
  MicrosoftTeamsApiHandleInfoResponseAttributes.JSON_PROPERTY_TEAM_ID,
  MicrosoftTeamsApiHandleInfoResponseAttributes.JSON_PROPERTY_TEAM_NAME,
  MicrosoftTeamsApiHandleInfoResponseAttributes.JSON_PROPERTY_TENANT_ID,
  MicrosoftTeamsApiHandleInfoResponseAttributes.JSON_PROPERTY_TENANT_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MicrosoftTeamsApiHandleInfoResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHANNEL_ID = "channel_id";
  private String channelId;

  public static final String JSON_PROPERTY_CHANNEL_NAME = "channel_name";
  private String channelName;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TEAM_ID = "team_id";
  private String teamId;

  public static final String JSON_PROPERTY_TEAM_NAME = "team_name";
  private String teamName;

  public static final String JSON_PROPERTY_TENANT_ID = "tenant_id";
  private String tenantId;

  public static final String JSON_PROPERTY_TENANT_NAME = "tenant_name";
  private String tenantName;

  public MicrosoftTeamsApiHandleInfoResponseAttributes channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * Channel id.
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

  public MicrosoftTeamsApiHandleInfoResponseAttributes channelName(String channelName) {
    this.channelName = channelName;
    return this;
  }

  /**
   * Channel name.
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

  public MicrosoftTeamsApiHandleInfoResponseAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Handle name.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MicrosoftTeamsApiHandleInfoResponseAttributes teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * Team id.
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

  public MicrosoftTeamsApiHandleInfoResponseAttributes teamName(String teamName) {
    this.teamName = teamName;
    return this;
  }

  /**
   * Team name.
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

  public MicrosoftTeamsApiHandleInfoResponseAttributes tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Tenant id.
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

  public MicrosoftTeamsApiHandleInfoResponseAttributes tenantName(String tenantName) {
    this.tenantName = tenantName;
    return this;
  }

  /**
   * Tenant name.
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
   * @return MicrosoftTeamsApiHandleInfoResponseAttributes
   */
  @JsonAnySetter
  public MicrosoftTeamsApiHandleInfoResponseAttributes putAdditionalProperty(
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

  /** Return true if this MicrosoftTeamsApiHandleInfoResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MicrosoftTeamsApiHandleInfoResponseAttributes microsoftTeamsApiHandleInfoResponseAttributes =
        (MicrosoftTeamsApiHandleInfoResponseAttributes) o;
    return Objects.equals(this.channelId, microsoftTeamsApiHandleInfoResponseAttributes.channelId)
        && Objects.equals(
            this.channelName, microsoftTeamsApiHandleInfoResponseAttributes.channelName)
        && Objects.equals(this.name, microsoftTeamsApiHandleInfoResponseAttributes.name)
        && Objects.equals(this.teamId, microsoftTeamsApiHandleInfoResponseAttributes.teamId)
        && Objects.equals(this.teamName, microsoftTeamsApiHandleInfoResponseAttributes.teamName)
        && Objects.equals(this.tenantId, microsoftTeamsApiHandleInfoResponseAttributes.tenantId)
        && Objects.equals(this.tenantName, microsoftTeamsApiHandleInfoResponseAttributes.tenantName)
        && Objects.equals(
            this.additionalProperties,
            microsoftTeamsApiHandleInfoResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        channelId, channelName, name, teamId, teamName, tenantId, tenantName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicrosoftTeamsApiHandleInfoResponseAttributes {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
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
