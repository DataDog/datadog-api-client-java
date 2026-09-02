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
   * <p>The attributes of a teams ownership mapping.</p>
 */
@JsonPropertyOrder({
  TeamsOwnershipMappingResponseAttributes.JSON_PROPERTY_APPLICATION_ID,
  TeamsOwnershipMappingResponseAttributes.JSON_PROPERTY_CREATED_AT,
  TeamsOwnershipMappingResponseAttributes.JSON_PROPERTY_CREATED_BY,
  TeamsOwnershipMappingResponseAttributes.JSON_PROPERTY_MATCH_TYPE,
  TeamsOwnershipMappingResponseAttributes.JSON_PROPERTY_ORG_ID,
  TeamsOwnershipMappingResponseAttributes.JSON_PROPERTY_SERVICE,
  TeamsOwnershipMappingResponseAttributes.JSON_PROPERTY_TEAM_HANDLE,
  TeamsOwnershipMappingResponseAttributes.JSON_PROPERTY_VIEW_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamsOwnershipMappingResponseAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION_ID = "application_id";
  private String applicationId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_MATCH_TYPE = "match_type";
  private TeamsOwnershipMatchType matchType = TeamsOwnershipMatchType.EXACT;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_TEAM_HANDLE = "team_handle";
  private String teamHandle;

  public static final String JSON_PROPERTY_VIEW_NAME = "view_name";
  private String viewName;

  public TeamsOwnershipMappingResponseAttributes() {}

  @JsonCreator
  public TeamsOwnershipMappingResponseAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_APPLICATION_ID)String applicationId,
            @JsonProperty(required=true, value=JSON_PROPERTY_CREATED_AT)OffsetDateTime createdAt,
            @JsonProperty(required=true, value=JSON_PROPERTY_CREATED_BY)String createdBy,
            @JsonProperty(required=true, value=JSON_PROPERTY_MATCH_TYPE)TeamsOwnershipMatchType matchType,
            @JsonProperty(required=true, value=JSON_PROPERTY_ORG_ID)Long orgId,
            @JsonProperty(required=true, value=JSON_PROPERTY_SERVICE)String service,
            @JsonProperty(required=true, value=JSON_PROPERTY_TEAM_HANDLE)String teamHandle,
            @JsonProperty(required=true, value=JSON_PROPERTY_VIEW_NAME)String viewName) {
        this.applicationId = applicationId;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.matchType = matchType;
        this.unparsed |= !matchType.isValid();
        this.orgId = orgId;
        this.service = service;
        this.teamHandle = teamHandle;
        this.viewName = viewName;
  }
  public TeamsOwnershipMappingResponseAttributes applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * <p>The ID of the RUM application this mapping applies to.
   * For browser applications, this is the real application UUID.
   * For mobile applications, this is the nil UUID <code>00000000-0000-0000-0000-000000000000</code> (wildcard), meaning the ownership applies across all applications.</p>
   * @return applicationId
  **/
      @JsonProperty(JSON_PROPERTY_APPLICATION_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getApplicationId() {
        return applicationId;
      }
  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }
  public TeamsOwnershipMappingResponseAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>Timestamp when the mapping was created.</p>
   * @return createdAt
  **/
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public OffsetDateTime getCreatedAt() {
        return createdAt;
      }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }
  public TeamsOwnershipMappingResponseAttributes createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * <p>The UUID of the user who created the mapping.</p>
   * @return createdBy
  **/
      @JsonProperty(JSON_PROPERTY_CREATED_BY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getCreatedBy() {
        return createdBy;
      }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }
  public TeamsOwnershipMappingResponseAttributes matchType(TeamsOwnershipMatchType matchType) {
    this.matchType = matchType;
    this.unparsed |= !matchType.isValid();
    return this;
  }

  /**
   * <p>How the <code>view_name</code> is matched against RUM view names.</p>
   * @return matchType
  **/
      @JsonProperty(JSON_PROPERTY_MATCH_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public TeamsOwnershipMatchType getMatchType() {
        return matchType;
      }
  public void setMatchType(TeamsOwnershipMatchType matchType) {
    if (!matchType.isValid()) {
        this.unparsed = true;
    }
    this.matchType = matchType;
  }
  public TeamsOwnershipMappingResponseAttributes orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * <p>The ID of the organization that owns this mapping.</p>
   * @return orgId
  **/
      @JsonProperty(JSON_PROPERTY_ORG_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getOrgId() {
        return orgId;
      }
  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }
  public TeamsOwnershipMappingResponseAttributes service(String service) {
    this.service = service;
    return this;
  }

  /**
   * <p>The RUM application's service name. For browser applications, may be empty. For mobile applications, this is the service that scopes the ownership.</p>
   * @return service
  **/
      @JsonProperty(JSON_PROPERTY_SERVICE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getService() {
        return service;
      }
  public void setService(String service) {
    this.service = service;
  }
  public TeamsOwnershipMappingResponseAttributes teamHandle(String teamHandle) {
    this.teamHandle = teamHandle;
    return this;
  }

  /**
   * <p>The handle of the team that owns the matched RUM views.</p>
   * @return teamHandle
  **/
      @JsonProperty(JSON_PROPERTY_TEAM_HANDLE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getTeamHandle() {
        return teamHandle;
      }
  public void setTeamHandle(String teamHandle) {
    this.teamHandle = teamHandle;
  }
  public TeamsOwnershipMappingResponseAttributes viewName(String viewName) {
    this.viewName = viewName;
    return this;
  }

  /**
   * <p>The RUM view name to match, or its prefix when <code>match_type</code> is <code>prefix</code>.</p>
   * @return viewName
  **/
      @JsonProperty(JSON_PROPERTY_VIEW_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getViewName() {
        return viewName;
      }
  public void setViewName(String viewName) {
    this.viewName = viewName;
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
   * @return TeamsOwnershipMappingResponseAttributes
   */
  @JsonAnySetter
  public TeamsOwnershipMappingResponseAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this TeamsOwnershipMappingResponseAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamsOwnershipMappingResponseAttributes teamsOwnershipMappingResponseAttributes = (TeamsOwnershipMappingResponseAttributes) o;
    return Objects.equals(this.applicationId, teamsOwnershipMappingResponseAttributes.applicationId) && Objects.equals(this.createdAt, teamsOwnershipMappingResponseAttributes.createdAt) && Objects.equals(this.createdBy, teamsOwnershipMappingResponseAttributes.createdBy) && Objects.equals(this.matchType, teamsOwnershipMappingResponseAttributes.matchType) && Objects.equals(this.orgId, teamsOwnershipMappingResponseAttributes.orgId) && Objects.equals(this.service, teamsOwnershipMappingResponseAttributes.service) && Objects.equals(this.teamHandle, teamsOwnershipMappingResponseAttributes.teamHandle) && Objects.equals(this.viewName, teamsOwnershipMappingResponseAttributes.viewName) && Objects.equals(this.additionalProperties, teamsOwnershipMappingResponseAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(applicationId,createdAt,createdBy,matchType,orgId,service,teamHandle,viewName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamsOwnershipMappingResponseAttributes {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    teamHandle: ").append(toIndentedString(teamHandle)).append("\n");
    sb.append("    viewName: ").append(toIndentedString(viewName)).append("\n");
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
