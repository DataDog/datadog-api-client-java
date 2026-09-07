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

/** The attributes of a teams ownership rule. */
@JsonPropertyOrder({
  TeamsOwnershipRuleResponseAttributes.JSON_PROPERTY_APPLICATION_ID,
  TeamsOwnershipRuleResponseAttributes.JSON_PROPERTY_MATCH_TYPE,
  TeamsOwnershipRuleResponseAttributes.JSON_PROPERTY_SERVICE,
  TeamsOwnershipRuleResponseAttributes.JSON_PROPERTY_TEAMS,
  TeamsOwnershipRuleResponseAttributes.JSON_PROPERTY_VIEW_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamsOwnershipRuleResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION_ID = "application_id";
  private String applicationId;

  public static final String JSON_PROPERTY_MATCH_TYPE = "match_type";
  private TeamsOwnershipMatchType matchType = TeamsOwnershipMatchType.EXACT;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_TEAMS = "teams";
  private List<TeamsOwnershipRuleTeamMapping> teams = new ArrayList<>();

  public static final String JSON_PROPERTY_VIEW_NAME = "view_name";
  private String viewName;

  public TeamsOwnershipRuleResponseAttributes() {}

  @JsonCreator
  public TeamsOwnershipRuleResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_APPLICATION_ID) String applicationId,
      @JsonProperty(required = true, value = JSON_PROPERTY_MATCH_TYPE)
          TeamsOwnershipMatchType matchType,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE) String service,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEAMS)
          List<TeamsOwnershipRuleTeamMapping> teams,
      @JsonProperty(required = true, value = JSON_PROPERTY_VIEW_NAME) String viewName) {
    this.applicationId = applicationId;
    this.matchType = matchType;
    this.unparsed |= !matchType.isValid();
    this.service = service;
    this.teams = teams;
    for (TeamsOwnershipRuleTeamMapping item : teams) {
      this.unparsed |= item.unparsed;
    }
    this.viewName = viewName;
  }

  public TeamsOwnershipRuleResponseAttributes applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * The ID of the RUM application this mapping applies to. For browser applications, this is the
   * real application UUID. For mobile applications, this is the nil UUID <code>
   * 00000000-0000-0000-0000-000000000000</code> (wildcard), meaning the ownership applies across
   * all applications.
   *
   * @return applicationId
   */
  @JsonProperty(JSON_PROPERTY_APPLICATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public TeamsOwnershipRuleResponseAttributes matchType(TeamsOwnershipMatchType matchType) {
    this.matchType = matchType;
    this.unparsed |= !matchType.isValid();
    return this;
  }

  /**
   * How the <code>view_name</code> is matched against RUM view names.
   *
   * @return matchType
   */
  @JsonProperty(JSON_PROPERTY_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TeamsOwnershipMatchType getMatchType() {
    return matchType;
  }

  public void setMatchType(TeamsOwnershipMatchType matchType) {
    if (!matchType.isValid()) {
      this.unparsed = true;
    }
    this.matchType = matchType;
  }

  public TeamsOwnershipRuleResponseAttributes service(String service) {
    this.service = service;
    return this;
  }

  /**
   * The RUM application's service name. For browser applications, may be empty. For mobile
   * applications, this is the service that scopes the ownership.
   *
   * @return service
   */
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public TeamsOwnershipRuleResponseAttributes teams(List<TeamsOwnershipRuleTeamMapping> teams) {
    this.teams = teams;
    for (TeamsOwnershipRuleTeamMapping item : teams) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TeamsOwnershipRuleResponseAttributes addTeamsItem(
      TeamsOwnershipRuleTeamMapping teamsItem) {
    this.teams.add(teamsItem);
    this.unparsed |= teamsItem.unparsed;
    return this;
  }

  /**
   * The teams that own the matched views, each paired with the ID of its underlying mapping.
   *
   * @return teams
   */
  @JsonProperty(JSON_PROPERTY_TEAMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TeamsOwnershipRuleTeamMapping> getTeams() {
    return teams;
  }

  public void setTeams(List<TeamsOwnershipRuleTeamMapping> teams) {
    this.teams = teams;
    if (teams != null) {
      for (TeamsOwnershipRuleTeamMapping item : teams) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public TeamsOwnershipRuleResponseAttributes viewName(String viewName) {
    this.viewName = viewName;
    return this;
  }

  /**
   * The RUM view name to match, or its prefix when <code>match_type</code> is <code>prefix</code>.
   *
   * @return viewName
   */
  @JsonProperty(JSON_PROPERTY_VIEW_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getViewName() {
    return viewName;
  }

  public void setViewName(String viewName) {
    this.viewName = viewName;
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
   * @return TeamsOwnershipRuleResponseAttributes
   */
  @JsonAnySetter
  public TeamsOwnershipRuleResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TeamsOwnershipRuleResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamsOwnershipRuleResponseAttributes teamsOwnershipRuleResponseAttributes =
        (TeamsOwnershipRuleResponseAttributes) o;
    return Objects.equals(this.applicationId, teamsOwnershipRuleResponseAttributes.applicationId)
        && Objects.equals(this.matchType, teamsOwnershipRuleResponseAttributes.matchType)
        && Objects.equals(this.service, teamsOwnershipRuleResponseAttributes.service)
        && Objects.equals(this.teams, teamsOwnershipRuleResponseAttributes.teams)
        && Objects.equals(this.viewName, teamsOwnershipRuleResponseAttributes.viewName)
        && Objects.equals(
            this.additionalProperties, teamsOwnershipRuleResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, matchType, service, teams, viewName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamsOwnershipRuleResponseAttributes {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    viewName: ").append(toIndentedString(viewName)).append("\n");
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
