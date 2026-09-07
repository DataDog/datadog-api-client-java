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

/** Attributes for creating a change request. */
@JsonPropertyOrder({
  ChangeRequestCreateAttributes.JSON_PROPERTY_CHANGE_REQUEST_LINKED_INCIDENT_UUID,
  ChangeRequestCreateAttributes.JSON_PROPERTY_CHANGE_REQUEST_MAINTENANCE_WINDOW_QUERY,
  ChangeRequestCreateAttributes.JSON_PROPERTY_CHANGE_REQUEST_PLAN,
  ChangeRequestCreateAttributes.JSON_PROPERTY_CHANGE_REQUEST_RISK,
  ChangeRequestCreateAttributes.JSON_PROPERTY_CHANGE_REQUEST_TYPE,
  ChangeRequestCreateAttributes.JSON_PROPERTY_DESCRIPTION,
  ChangeRequestCreateAttributes.JSON_PROPERTY_END_DATE,
  ChangeRequestCreateAttributes.JSON_PROPERTY_PROJECT_ID,
  ChangeRequestCreateAttributes.JSON_PROPERTY_REQUESTED_TEAMS,
  ChangeRequestCreateAttributes.JSON_PROPERTY_START_DATE,
  ChangeRequestCreateAttributes.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChangeRequestCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHANGE_REQUEST_LINKED_INCIDENT_UUID =
      "change_request_linked_incident_uuid";
  private String changeRequestLinkedIncidentUuid;

  public static final String JSON_PROPERTY_CHANGE_REQUEST_MAINTENANCE_WINDOW_QUERY =
      "change_request_maintenance_window_query";
  private String changeRequestMaintenanceWindowQuery;

  public static final String JSON_PROPERTY_CHANGE_REQUEST_PLAN = "change_request_plan";
  private String changeRequestPlan;

  public static final String JSON_PROPERTY_CHANGE_REQUEST_RISK = "change_request_risk";
  private ChangeRequestRiskLevel changeRequestRisk;

  public static final String JSON_PROPERTY_CHANGE_REQUEST_TYPE = "change_request_type";
  private ChangeRequestChangeType changeRequestType;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_END_DATE = "end_date";
  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_PROJECT_ID = "project_id";
  private String projectId;

  public static final String JSON_PROPERTY_REQUESTED_TEAMS = "requested_teams";
  private List<String> requestedTeams = null;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public ChangeRequestCreateAttributes() {}

  @JsonCreator
  public ChangeRequestCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title) {
    this.title = title;
  }

  public ChangeRequestCreateAttributes changeRequestLinkedIncidentUuid(
      String changeRequestLinkedIncidentUuid) {
    this.changeRequestLinkedIncidentUuid = changeRequestLinkedIncidentUuid;
    return this;
  }

  /**
   * The UUID of an incident to link to the change request.
   *
   * @return changeRequestLinkedIncidentUuid
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANGE_REQUEST_LINKED_INCIDENT_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getChangeRequestLinkedIncidentUuid() {
    return changeRequestLinkedIncidentUuid;
  }

  public void setChangeRequestLinkedIncidentUuid(String changeRequestLinkedIncidentUuid) {
    this.changeRequestLinkedIncidentUuid = changeRequestLinkedIncidentUuid;
  }

  public ChangeRequestCreateAttributes changeRequestMaintenanceWindowQuery(
      String changeRequestMaintenanceWindowQuery) {
    this.changeRequestMaintenanceWindowQuery = changeRequestMaintenanceWindowQuery;
    return this;
  }

  /**
   * The maintenance window query for the change request.
   *
   * @return changeRequestMaintenanceWindowQuery
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANGE_REQUEST_MAINTENANCE_WINDOW_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getChangeRequestMaintenanceWindowQuery() {
    return changeRequestMaintenanceWindowQuery;
  }

  public void setChangeRequestMaintenanceWindowQuery(String changeRequestMaintenanceWindowQuery) {
    this.changeRequestMaintenanceWindowQuery = changeRequestMaintenanceWindowQuery;
  }

  public ChangeRequestCreateAttributes changeRequestPlan(String changeRequestPlan) {
    this.changeRequestPlan = changeRequestPlan;
    return this;
  }

  /**
   * The plan associated with the change request.
   *
   * @return changeRequestPlan
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANGE_REQUEST_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getChangeRequestPlan() {
    return changeRequestPlan;
  }

  public void setChangeRequestPlan(String changeRequestPlan) {
    this.changeRequestPlan = changeRequestPlan;
  }

  public ChangeRequestCreateAttributes changeRequestRisk(ChangeRequestRiskLevel changeRequestRisk) {
    this.changeRequestRisk = changeRequestRisk;
    this.unparsed |= !changeRequestRisk.isValid();
    return this;
  }

  /**
   * The risk level of the change request.
   *
   * @return changeRequestRisk
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANGE_REQUEST_RISK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChangeRequestRiskLevel getChangeRequestRisk() {
    return changeRequestRisk;
  }

  public void setChangeRequestRisk(ChangeRequestRiskLevel changeRequestRisk) {
    if (!changeRequestRisk.isValid()) {
      this.unparsed = true;
    }
    this.changeRequestRisk = changeRequestRisk;
  }

  public ChangeRequestCreateAttributes changeRequestType(
      ChangeRequestChangeType changeRequestType) {
    this.changeRequestType = changeRequestType;
    this.unparsed |= !changeRequestType.isValid();
    return this;
  }

  /**
   * The type of the change request.
   *
   * @return changeRequestType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANGE_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChangeRequestChangeType getChangeRequestType() {
    return changeRequestType;
  }

  public void setChangeRequestType(ChangeRequestChangeType changeRequestType) {
    if (!changeRequestType.isValid()) {
      this.unparsed = true;
    }
    this.changeRequestType = changeRequestType;
  }

  public ChangeRequestCreateAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the change request.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ChangeRequestCreateAttributes endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The planned end date of the change request.
   *
   * @return endDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public ChangeRequestCreateAttributes projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The project UUID to associate with the change request.
   *
   * @return projectId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public ChangeRequestCreateAttributes requestedTeams(List<String> requestedTeams) {
    this.requestedTeams = requestedTeams;
    return this;
  }

  public ChangeRequestCreateAttributes addRequestedTeamsItem(String requestedTeamsItem) {
    if (this.requestedTeams == null) {
      this.requestedTeams = new ArrayList<>();
    }
    this.requestedTeams.add(requestedTeamsItem);
    return this;
  }

  /**
   * A list of team handles to request decisions from.
   *
   * @return requestedTeams
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUESTED_TEAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getRequestedTeams() {
    return requestedTeams;
  }

  public void setRequestedTeams(List<String> requestedTeams) {
    this.requestedTeams = requestedTeams;
  }

  public ChangeRequestCreateAttributes startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The planned start date of the change request.
   *
   * @return startDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public ChangeRequestCreateAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the change request.
   *
   * @return title
   */
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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
   * @return ChangeRequestCreateAttributes
   */
  @JsonAnySetter
  public ChangeRequestCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ChangeRequestCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeRequestCreateAttributes changeRequestCreateAttributes = (ChangeRequestCreateAttributes) o;
    return Objects.equals(
            this.changeRequestLinkedIncidentUuid,
            changeRequestCreateAttributes.changeRequestLinkedIncidentUuid)
        && Objects.equals(
            this.changeRequestMaintenanceWindowQuery,
            changeRequestCreateAttributes.changeRequestMaintenanceWindowQuery)
        && Objects.equals(this.changeRequestPlan, changeRequestCreateAttributes.changeRequestPlan)
        && Objects.equals(this.changeRequestRisk, changeRequestCreateAttributes.changeRequestRisk)
        && Objects.equals(this.changeRequestType, changeRequestCreateAttributes.changeRequestType)
        && Objects.equals(this.description, changeRequestCreateAttributes.description)
        && Objects.equals(this.endDate, changeRequestCreateAttributes.endDate)
        && Objects.equals(this.projectId, changeRequestCreateAttributes.projectId)
        && Objects.equals(this.requestedTeams, changeRequestCreateAttributes.requestedTeams)
        && Objects.equals(this.startDate, changeRequestCreateAttributes.startDate)
        && Objects.equals(this.title, changeRequestCreateAttributes.title)
        && Objects.equals(
            this.additionalProperties, changeRequestCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        changeRequestLinkedIncidentUuid,
        changeRequestMaintenanceWindowQuery,
        changeRequestPlan,
        changeRequestRisk,
        changeRequestType,
        description,
        endDate,
        projectId,
        requestedTeams,
        startDate,
        title,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeRequestCreateAttributes {\n");
    sb.append("    changeRequestLinkedIncidentUuid: ")
        .append(toIndentedString(changeRequestLinkedIncidentUuid))
        .append("\n");
    sb.append("    changeRequestMaintenanceWindowQuery: ")
        .append(toIndentedString(changeRequestMaintenanceWindowQuery))
        .append("\n");
    sb.append("    changeRequestPlan: ").append(toIndentedString(changeRequestPlan)).append("\n");
    sb.append("    changeRequestRisk: ").append(toIndentedString(changeRequestRisk)).append("\n");
    sb.append("    changeRequestType: ").append(toIndentedString(changeRequestType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    requestedTeams: ").append(toIndentedString(requestedTeams)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
