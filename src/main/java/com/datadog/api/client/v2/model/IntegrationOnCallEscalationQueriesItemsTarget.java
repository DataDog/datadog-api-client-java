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

/** */
@JsonPropertyOrder({
  IntegrationOnCallEscalationQueriesItemsTarget.JSON_PROPERTY_DYNAMIC_TEAM_PAGING,
  IntegrationOnCallEscalationQueriesItemsTarget.JSON_PROPERTY_TEAM_ID,
  IntegrationOnCallEscalationQueriesItemsTarget.JSON_PROPERTY_USER_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IntegrationOnCallEscalationQueriesItemsTarget {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DYNAMIC_TEAM_PAGING = "dynamic_team_paging";
  private Boolean dynamicTeamPaging;

  public static final String JSON_PROPERTY_TEAM_ID = "team_id";
  private String teamId;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public IntegrationOnCallEscalationQueriesItemsTarget dynamicTeamPaging(
      Boolean dynamicTeamPaging) {
    this.dynamicTeamPaging = dynamicTeamPaging;
    return this;
  }

  /**
   * GetdynamicTeamPaging
   *
   * @return dynamicTeamPaging
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DYNAMIC_TEAM_PAGING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDynamicTeamPaging() {
    return dynamicTeamPaging;
  }

  public void setDynamicTeamPaging(Boolean dynamicTeamPaging) {
    this.dynamicTeamPaging = dynamicTeamPaging;
  }

  public IntegrationOnCallEscalationQueriesItemsTarget teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * GetteamId
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

  public IntegrationOnCallEscalationQueriesItemsTarget userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * GetuserId
   *
   * @return userId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
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
   * @return IntegrationOnCallEscalationQueriesItemsTarget
   */
  @JsonAnySetter
  public IntegrationOnCallEscalationQueriesItemsTarget putAdditionalProperty(
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

  /** Return true if this IntegrationOnCallEscalationQueriesItemsTarget object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationOnCallEscalationQueriesItemsTarget integrationOnCallEscalationQueriesItemsTarget =
        (IntegrationOnCallEscalationQueriesItemsTarget) o;
    return Objects.equals(
            this.dynamicTeamPaging, integrationOnCallEscalationQueriesItemsTarget.dynamicTeamPaging)
        && Objects.equals(this.teamId, integrationOnCallEscalationQueriesItemsTarget.teamId)
        && Objects.equals(this.userId, integrationOnCallEscalationQueriesItemsTarget.userId)
        && Objects.equals(
            this.additionalProperties,
            integrationOnCallEscalationQueriesItemsTarget.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dynamicTeamPaging, teamId, userId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationOnCallEscalationQueriesItemsTarget {\n");
    sb.append("    dynamicTeamPaging: ").append(toIndentedString(dynamicTeamPaging)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
