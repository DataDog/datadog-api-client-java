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

/** Item in the Microsoft Teams integration metadata teams array. */
@JsonPropertyOrder({
  MicrosoftTeamsIntegrationMetadataTeamsItem.JSON_PROPERTY_MS_TEAM_ID,
  MicrosoftTeamsIntegrationMetadataTeamsItem.JSON_PROPERTY_MS_TENANT_ID,
  MicrosoftTeamsIntegrationMetadataTeamsItem.JSON_PROPERTY_REDIRECT_URL,
  MicrosoftTeamsIntegrationMetadataTeamsItem.JSON_PROPERTY_TEAM_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MicrosoftTeamsIntegrationMetadataTeamsItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MS_TEAM_ID = "ms_team_id";
  private String msTeamId;

  public static final String JSON_PROPERTY_MS_TENANT_ID = "ms_tenant_id";
  private String msTenantId;

  public static final String JSON_PROPERTY_REDIRECT_URL = "redirect_url";
  private String redirectUrl;

  public static final String JSON_PROPERTY_TEAM_NAME = "team_name";
  private String teamName;

  public MicrosoftTeamsIntegrationMetadataTeamsItem() {}

  @JsonCreator
  public MicrosoftTeamsIntegrationMetadataTeamsItem(
      @JsonProperty(required = true, value = JSON_PROPERTY_MS_TEAM_ID) String msTeamId,
      @JsonProperty(required = true, value = JSON_PROPERTY_MS_TENANT_ID) String msTenantId,
      @JsonProperty(required = true, value = JSON_PROPERTY_REDIRECT_URL) String redirectUrl,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEAM_NAME) String teamName) {
    this.msTeamId = msTeamId;
    this.msTenantId = msTenantId;
    this.redirectUrl = redirectUrl;
    this.teamName = teamName;
  }

  public MicrosoftTeamsIntegrationMetadataTeamsItem msTeamId(String msTeamId) {
    this.msTeamId = msTeamId;
    return this;
  }

  /**
   * Team ID of the Microsoft Teams team
   *
   * @return msTeamId
   */
  @JsonProperty(JSON_PROPERTY_MS_TEAM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMsTeamId() {
    return msTeamId;
  }

  public void setMsTeamId(String msTeamId) {
    this.msTeamId = msTeamId;
  }

  public MicrosoftTeamsIntegrationMetadataTeamsItem msTenantId(String msTenantId) {
    this.msTenantId = msTenantId;
    return this;
  }

  /**
   * Microsoft Teams tenant ID
   *
   * @return msTenantId
   */
  @JsonProperty(JSON_PROPERTY_MS_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMsTenantId() {
    return msTenantId;
  }

  public void setMsTenantId(String msTenantId) {
    this.msTenantId = msTenantId;
  }

  public MicrosoftTeamsIntegrationMetadataTeamsItem redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

  /**
   * URL redirecting to the Microsoft Teams team
   *
   * @return redirectUrl
   */
  @JsonProperty(JSON_PROPERTY_REDIRECT_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  public MicrosoftTeamsIntegrationMetadataTeamsItem teamName(String teamName) {
    this.teamName = teamName;
    return this;
  }

  /**
   * Name of the Microsoft Teams team
   *
   * @return teamName
   */
  @JsonProperty(JSON_PROPERTY_TEAM_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return MicrosoftTeamsIntegrationMetadataTeamsItem
   */
  @JsonAnySetter
  public MicrosoftTeamsIntegrationMetadataTeamsItem putAdditionalProperty(
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

  /** Return true if this MicrosoftTeamsIntegrationMetadataTeamsItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MicrosoftTeamsIntegrationMetadataTeamsItem microsoftTeamsIntegrationMetadataTeamsItem =
        (MicrosoftTeamsIntegrationMetadataTeamsItem) o;
    return Objects.equals(this.msTeamId, microsoftTeamsIntegrationMetadataTeamsItem.msTeamId)
        && Objects.equals(this.msTenantId, microsoftTeamsIntegrationMetadataTeamsItem.msTenantId)
        && Objects.equals(this.redirectUrl, microsoftTeamsIntegrationMetadataTeamsItem.redirectUrl)
        && Objects.equals(this.teamName, microsoftTeamsIntegrationMetadataTeamsItem.teamName)
        && Objects.equals(
            this.additionalProperties,
            microsoftTeamsIntegrationMetadataTeamsItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msTeamId, msTenantId, redirectUrl, teamName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicrosoftTeamsIntegrationMetadataTeamsItem {\n");
    sb.append("    msTeamId: ").append(toIndentedString(msTeamId)).append("\n");
    sb.append("    msTenantId: ").append(toIndentedString(msTenantId)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append("}");
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
