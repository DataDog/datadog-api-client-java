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
   * <p>The attributes of the mapping to add. <code>team_handle</code> and <code>view_name</code> are required
   * when <code>op</code> is <code>add</code>. At least one of <code>service</code> or <code>application_id</code> must be provided.</p>
 */
@JsonPropertyOrder({
  TeamsOwnershipMappingBatchOperationDataAttributes.JSON_PROPERTY_APPLICATION_ID,
  TeamsOwnershipMappingBatchOperationDataAttributes.JSON_PROPERTY_MATCH_TYPE,
  TeamsOwnershipMappingBatchOperationDataAttributes.JSON_PROPERTY_SERVICE,
  TeamsOwnershipMappingBatchOperationDataAttributes.JSON_PROPERTY_TEAM_HANDLE,
  TeamsOwnershipMappingBatchOperationDataAttributes.JSON_PROPERTY_VIEW_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamsOwnershipMappingBatchOperationDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION_ID = "application_id";
  private UUID applicationId;

  public static final String JSON_PROPERTY_MATCH_TYPE = "match_type";
  private TeamsOwnershipMatchType matchType = TeamsOwnershipMatchType.EXACT;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_TEAM_HANDLE = "team_handle";
  private String teamHandle;

  public static final String JSON_PROPERTY_VIEW_NAME = "view_name";
  private String viewName;

  public TeamsOwnershipMappingBatchOperationDataAttributes applicationId(UUID applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * <p>The ID of the RUM application this mapping applies to.
   * For browser applications, provide the real application UUID — the team is applied to the view regardless of service.
   * For mobile applications, omit this field (or set it to the nil UUID <code>00000000-0000-0000-0000-000000000000</code>) — the team is applied to the view and service combination across all applications.</p>
   * @return applicationId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_APPLICATION_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UUID getApplicationId() {
        return applicationId;
      }
  public void setApplicationId(UUID applicationId) {
    this.applicationId = applicationId;
  }
  public TeamsOwnershipMappingBatchOperationDataAttributes matchType(TeamsOwnershipMatchType matchType) {
    this.matchType = matchType;
    this.unparsed |= !matchType.isValid();
    return this;
  }

  /**
   * <p>How the <code>view_name</code> is matched against RUM view names.</p>
   * @return matchType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MATCH_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public TeamsOwnershipMatchType getMatchType() {
        return matchType;
      }
  public void setMatchType(TeamsOwnershipMatchType matchType) {
    if (!matchType.isValid()) {
        this.unparsed = true;
    }
    this.matchType = matchType;
  }
  public TeamsOwnershipMappingBatchOperationDataAttributes service(String service) {
    this.service = service;
    return this;
  }

  /**
   * <p>The RUM application's service name. For browser applications, this is optional. For mobile applications, this is required and scopes the ownership to a specific service.</p>
   * @return service
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SERVICE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getService() {
        return service;
      }
  public void setService(String service) {
    this.service = service;
  }
  public TeamsOwnershipMappingBatchOperationDataAttributes teamHandle(String teamHandle) {
    this.teamHandle = teamHandle;
    return this;
  }

  /**
   * <p>The handle of the team that owns the matched RUM views.</p>
   * @return teamHandle
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TEAM_HANDLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTeamHandle() {
        return teamHandle;
      }
  public void setTeamHandle(String teamHandle) {
    this.teamHandle = teamHandle;
  }
  public TeamsOwnershipMappingBatchOperationDataAttributes viewName(String viewName) {
    this.viewName = viewName;
    return this;
  }

  /**
   * <p>The RUM view name to match, or its prefix when <code>match_type</code> is <code>prefix</code>.</p>
   * @return viewName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VIEW_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * @return TeamsOwnershipMappingBatchOperationDataAttributes
   */
  @JsonAnySetter
  public TeamsOwnershipMappingBatchOperationDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this TeamsOwnershipMappingBatchOperationDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamsOwnershipMappingBatchOperationDataAttributes teamsOwnershipMappingBatchOperationDataAttributes = (TeamsOwnershipMappingBatchOperationDataAttributes) o;
    return Objects.equals(this.applicationId, teamsOwnershipMappingBatchOperationDataAttributes.applicationId) && Objects.equals(this.matchType, teamsOwnershipMappingBatchOperationDataAttributes.matchType) && Objects.equals(this.service, teamsOwnershipMappingBatchOperationDataAttributes.service) && Objects.equals(this.teamHandle, teamsOwnershipMappingBatchOperationDataAttributes.teamHandle) && Objects.equals(this.viewName, teamsOwnershipMappingBatchOperationDataAttributes.viewName) && Objects.equals(this.additionalProperties, teamsOwnershipMappingBatchOperationDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(applicationId,matchType,service,teamHandle,viewName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamsOwnershipMappingBatchOperationDataAttributes {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
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
