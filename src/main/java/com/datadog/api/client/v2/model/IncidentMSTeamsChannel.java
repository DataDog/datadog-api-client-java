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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** A Microsoft Teams channel associated with an incident. */
@JsonPropertyOrder({
  IncidentMSTeamsChannel.JSON_PROPERTY_MS_CHANNEL_ID,
  IncidentMSTeamsChannel.JSON_PROPERTY_MS_CHANNEL_NAME,
  IncidentMSTeamsChannel.JSON_PROPERTY_MS_TEAM_ID,
  IncidentMSTeamsChannel.JSON_PROPERTY_MS_TENANT_ID,
  IncidentMSTeamsChannel.JSON_PROPERTY_REDIRECT_URL,
  IncidentMSTeamsChannel.JSON_PROPERTY_TEAM_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentMSTeamsChannel {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MS_CHANNEL_ID = "ms_channel_id";
  private String msChannelId;

  public static final String JSON_PROPERTY_MS_CHANNEL_NAME = "ms_channel_name";
  private String msChannelName;

  public static final String JSON_PROPERTY_MS_TEAM_ID = "ms_team_id";
  private String msTeamId;

  public static final String JSON_PROPERTY_MS_TENANT_ID = "ms_tenant_id";
  private String msTenantId;

  public static final String JSON_PROPERTY_REDIRECT_URL = "redirect_url";
  private String redirectUrl;

  public static final String JSON_PROPERTY_TEAM_NAME = "team_name";
  private String teamName;

  public IncidentMSTeamsChannel() {}

  @JsonCreator
  public IncidentMSTeamsChannel(
      @JsonProperty(required = true, value = JSON_PROPERTY_MS_CHANNEL_ID) String msChannelId,
      @JsonProperty(required = true, value = JSON_PROPERTY_MS_CHANNEL_NAME) String msChannelName) {
    this.msChannelId = msChannelId;
    this.msChannelName = msChannelName;
  }

  public IncidentMSTeamsChannel msChannelId(String msChannelId) {
    this.msChannelId = msChannelId;
    return this;
  }

  /**
   * The Teams channel identifier.
   *
   * @return msChannelId
   */
  @JsonProperty(JSON_PROPERTY_MS_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMsChannelId() {
    return msChannelId;
  }

  public void setMsChannelId(String msChannelId) {
    this.msChannelId = msChannelId;
  }

  public IncidentMSTeamsChannel msChannelName(String msChannelName) {
    this.msChannelName = msChannelName;
    return this;
  }

  /**
   * The name of the Teams channel.
   *
   * @return msChannelName
   */
  @JsonProperty(JSON_PROPERTY_MS_CHANNEL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMsChannelName() {
    return msChannelName;
  }

  public void setMsChannelName(String msChannelName) {
    this.msChannelName = msChannelName;
  }

  public IncidentMSTeamsChannel msTeamId(String msTeamId) {
    this.msTeamId = msTeamId;
    return this;
  }

  /**
   * The Teams team identifier.
   *
   * @return msTeamId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MS_TEAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMsTeamId() {
    return msTeamId;
  }

  public void setMsTeamId(String msTeamId) {
    this.msTeamId = msTeamId;
  }

  public IncidentMSTeamsChannel msTenantId(String msTenantId) {
    this.msTenantId = msTenantId;
    return this;
  }

  /**
   * The Teams tenant identifier.
   *
   * @return msTenantId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MS_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMsTenantId() {
    return msTenantId;
  }

  public void setMsTenantId(String msTenantId) {
    this.msTenantId = msTenantId;
  }

  public IncidentMSTeamsChannel redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

  /**
   * The redirect URL for the channel.
   *
   * @return redirectUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REDIRECT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  public IncidentMSTeamsChannel teamName(String teamName) {
    this.teamName = teamName;
    return this;
  }

  /**
   * The name of the Teams team.
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
   * @return IncidentMSTeamsChannel
   */
  @JsonAnySetter
  public IncidentMSTeamsChannel putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentMSTeamsChannel object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentMSTeamsChannel incidentMsTeamsChannel = (IncidentMSTeamsChannel) o;
    return Objects.equals(this.msChannelId, incidentMsTeamsChannel.msChannelId)
        && Objects.equals(this.msChannelName, incidentMsTeamsChannel.msChannelName)
        && Objects.equals(this.msTeamId, incidentMsTeamsChannel.msTeamId)
        && Objects.equals(this.msTenantId, incidentMsTeamsChannel.msTenantId)
        && Objects.equals(this.redirectUrl, incidentMsTeamsChannel.redirectUrl)
        && Objects.equals(this.teamName, incidentMsTeamsChannel.teamName)
        && Objects.equals(this.additionalProperties, incidentMsTeamsChannel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        msChannelId,
        msChannelName,
        msTeamId,
        msTenantId,
        redirectUrl,
        teamName,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentMSTeamsChannel {\n");
    sb.append("    msChannelId: ").append(toIndentedString(msChannelId)).append("\n");
    sb.append("    msChannelName: ").append(toIndentedString(msChannelName)).append("\n");
    sb.append("    msTeamId: ").append(toIndentedString(msTeamId)).append("\n");
    sb.append("    msTenantId: ").append(toIndentedString(msTenantId)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
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
