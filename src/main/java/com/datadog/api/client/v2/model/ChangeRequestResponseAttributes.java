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
   * <p>Attributes of a change request response.</p>
 */
@JsonPropertyOrder({
  ChangeRequestResponseAttributes.JSON_PROPERTY_ARCHIVED_AT,
  ChangeRequestResponseAttributes.JSON_PROPERTY_ATTRIBUTES,
  ChangeRequestResponseAttributes.JSON_PROPERTY_CHANGE_REQUEST_LINKED_INCIDENT_UUID,
  ChangeRequestResponseAttributes.JSON_PROPERTY_CHANGE_REQUEST_MAINTENANCE_WINDOW_QUERY,
  ChangeRequestResponseAttributes.JSON_PROPERTY_CHANGE_REQUEST_PLAN,
  ChangeRequestResponseAttributes.JSON_PROPERTY_CHANGE_REQUEST_RISK,
  ChangeRequestResponseAttributes.JSON_PROPERTY_CHANGE_REQUEST_TYPE,
  ChangeRequestResponseAttributes.JSON_PROPERTY_CLOSED_AT,
  ChangeRequestResponseAttributes.JSON_PROPERTY_CREATED_AT,
  ChangeRequestResponseAttributes.JSON_PROPERTY_CREATION_SOURCE,
  ChangeRequestResponseAttributes.JSON_PROPERTY_DESCRIPTION,
  ChangeRequestResponseAttributes.JSON_PROPERTY_END_DATE,
  ChangeRequestResponseAttributes.JSON_PROPERTY_KEY,
  ChangeRequestResponseAttributes.JSON_PROPERTY_MODIFIED_AT,
  ChangeRequestResponseAttributes.JSON_PROPERTY_PLAN_NOTEBOOK_ID,
  ChangeRequestResponseAttributes.JSON_PROPERTY_PRIORITY,
  ChangeRequestResponseAttributes.JSON_PROPERTY_PROJECT_ID,
  ChangeRequestResponseAttributes.JSON_PROPERTY_START_DATE,
  ChangeRequestResponseAttributes.JSON_PROPERTY_STATUS,
  ChangeRequestResponseAttributes.JSON_PROPERTY_TITLE,
  ChangeRequestResponseAttributes.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChangeRequestResponseAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARCHIVED_AT = "archived_at";
  private JsonNullable<OffsetDateTime> archivedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private Map<String, List<String>> attributes = new HashMap<String, List<String>>();

  public static final String JSON_PROPERTY_CHANGE_REQUEST_LINKED_INCIDENT_UUID = "change_request_linked_incident_uuid";
  private String changeRequestLinkedIncidentUuid;

  public static final String JSON_PROPERTY_CHANGE_REQUEST_MAINTENANCE_WINDOW_QUERY = "change_request_maintenance_window_query";
  private String changeRequestMaintenanceWindowQuery;

  public static final String JSON_PROPERTY_CHANGE_REQUEST_PLAN = "change_request_plan";
  private String changeRequestPlan;

  public static final String JSON_PROPERTY_CHANGE_REQUEST_RISK = "change_request_risk";
  private ChangeRequestRiskLevel changeRequestRisk;

  public static final String JSON_PROPERTY_CHANGE_REQUEST_TYPE = "change_request_type";
  private ChangeRequestChangeType changeRequestType;

  public static final String JSON_PROPERTY_CLOSED_AT = "closed_at";
  private JsonNullable<OffsetDateTime> closedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATION_SOURCE = "creation_source";
  private String creationSource;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_END_DATE = "end_date";
  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_PLAN_NOTEBOOK_ID = "plan_notebook_id";
  private Long planNotebookId;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private String priority;

  public static final String JSON_PROPERTY_PROJECT_ID = "project_id";
  private String projectId;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public ChangeRequestResponseAttributes() {}

  @JsonCreator
  public ChangeRequestResponseAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_ATTRIBUTES)Map<String, List<String>> attributes,
            @JsonProperty(required=true, value=JSON_PROPERTY_CHANGE_REQUEST_LINKED_INCIDENT_UUID)String changeRequestLinkedIncidentUuid,
            @JsonProperty(required=true, value=JSON_PROPERTY_CHANGE_REQUEST_MAINTENANCE_WINDOW_QUERY)String changeRequestMaintenanceWindowQuery,
            @JsonProperty(required=true, value=JSON_PROPERTY_CHANGE_REQUEST_PLAN)String changeRequestPlan,
            @JsonProperty(required=true, value=JSON_PROPERTY_CHANGE_REQUEST_RISK)ChangeRequestRiskLevel changeRequestRisk,
            @JsonProperty(required=true, value=JSON_PROPERTY_CHANGE_REQUEST_TYPE)ChangeRequestChangeType changeRequestType,
            @JsonProperty(required=true, value=JSON_PROPERTY_CREATED_AT)OffsetDateTime createdAt,
            @JsonProperty(required=true, value=JSON_PROPERTY_CREATION_SOURCE)String creationSource,
            @JsonProperty(required=true, value=JSON_PROPERTY_DESCRIPTION)String description,
            @JsonProperty(required=true, value=JSON_PROPERTY_KEY)String key,
            @JsonProperty(required=true, value=JSON_PROPERTY_MODIFIED_AT)OffsetDateTime modifiedAt,
            @JsonProperty(required=true, value=JSON_PROPERTY_PLAN_NOTEBOOK_ID)Long planNotebookId,
            @JsonProperty(required=true, value=JSON_PROPERTY_PRIORITY)String priority,
            @JsonProperty(required=true, value=JSON_PROPERTY_PROJECT_ID)String projectId,
            @JsonProperty(required=true, value=JSON_PROPERTY_STATUS)String status,
            @JsonProperty(required=true, value=JSON_PROPERTY_TITLE)String title,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)String type) {
        this.attributes = attributes;
        this.changeRequestLinkedIncidentUuid = changeRequestLinkedIncidentUuid;
        this.changeRequestMaintenanceWindowQuery = changeRequestMaintenanceWindowQuery;
        this.changeRequestPlan = changeRequestPlan;
        this.changeRequestRisk = changeRequestRisk;
        this.unparsed |= !changeRequestRisk.isValid();
        this.changeRequestType = changeRequestType;
        this.unparsed |= !changeRequestType.isValid();
        this.createdAt = createdAt;
        this.creationSource = creationSource;
        this.description = description;
        this.key = key;
        this.modifiedAt = modifiedAt;
        this.planNotebookId = planNotebookId;
        this.priority = priority;
        this.projectId = projectId;
        this.status = status;
        this.title = title;
        this.type = type;
  }

  /**
   * <p>Timestamp of when the change request was archived.</p>
   * @return archivedAt
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public OffsetDateTime getArchivedAt() {

        if (archivedAt == null) {
          archivedAt = JsonNullable.<OffsetDateTime>undefined();
        }
        return archivedAt.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_ARCHIVED_AT)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getArchivedAt_JsonNullable() {
    return archivedAt;
  }
  @JsonProperty(JSON_PROPERTY_ARCHIVED_AT)private void setArchivedAt_JsonNullable(JsonNullable<OffsetDateTime> archivedAt) {
    this.archivedAt = archivedAt;
  }
  public ChangeRequestResponseAttributes attributes(Map<String, List<String>> attributes) {
    this.attributes = attributes;
    return this;
  }
  public ChangeRequestResponseAttributes putAttributesItem(String key, List<String> attributesItem) {
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * <p>Custom attributes of the change request as key-value pairs.</p>
   * @return attributes
  **/
      @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Map<String, List<String>> getAttributes() {
        return attributes;
      }
  public void setAttributes(Map<String, List<String>> attributes) {
    this.attributes = attributes;
  }
  public ChangeRequestResponseAttributes changeRequestLinkedIncidentUuid(String changeRequestLinkedIncidentUuid) {
    this.changeRequestLinkedIncidentUuid = changeRequestLinkedIncidentUuid;
    return this;
  }

  /**
   * <p>The UUID of the linked incident.</p>
   * @return changeRequestLinkedIncidentUuid
  **/
      @JsonProperty(JSON_PROPERTY_CHANGE_REQUEST_LINKED_INCIDENT_UUID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getChangeRequestLinkedIncidentUuid() {
        return changeRequestLinkedIncidentUuid;
      }
  public void setChangeRequestLinkedIncidentUuid(String changeRequestLinkedIncidentUuid) {
    this.changeRequestLinkedIncidentUuid = changeRequestLinkedIncidentUuid;
  }
  public ChangeRequestResponseAttributes changeRequestMaintenanceWindowQuery(String changeRequestMaintenanceWindowQuery) {
    this.changeRequestMaintenanceWindowQuery = changeRequestMaintenanceWindowQuery;
    return this;
  }

  /**
   * <p>The maintenance window query for the change request.</p>
   * @return changeRequestMaintenanceWindowQuery
  **/
      @JsonProperty(JSON_PROPERTY_CHANGE_REQUEST_MAINTENANCE_WINDOW_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getChangeRequestMaintenanceWindowQuery() {
        return changeRequestMaintenanceWindowQuery;
      }
  public void setChangeRequestMaintenanceWindowQuery(String changeRequestMaintenanceWindowQuery) {
    this.changeRequestMaintenanceWindowQuery = changeRequestMaintenanceWindowQuery;
  }
  public ChangeRequestResponseAttributes changeRequestPlan(String changeRequestPlan) {
    this.changeRequestPlan = changeRequestPlan;
    return this;
  }

  /**
   * <p>The plan associated with the change request.</p>
   * @return changeRequestPlan
  **/
      @JsonProperty(JSON_PROPERTY_CHANGE_REQUEST_PLAN)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getChangeRequestPlan() {
        return changeRequestPlan;
      }
  public void setChangeRequestPlan(String changeRequestPlan) {
    this.changeRequestPlan = changeRequestPlan;
  }
  public ChangeRequestResponseAttributes changeRequestRisk(ChangeRequestRiskLevel changeRequestRisk) {
    this.changeRequestRisk = changeRequestRisk;
    this.unparsed |= !changeRequestRisk.isValid();
    return this;
  }

  /**
   * <p>The risk level of the change request.</p>
   * @return changeRequestRisk
  **/
      @JsonProperty(JSON_PROPERTY_CHANGE_REQUEST_RISK)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ChangeRequestRiskLevel getChangeRequestRisk() {
        return changeRequestRisk;
      }
  public void setChangeRequestRisk(ChangeRequestRiskLevel changeRequestRisk) {
    if (!changeRequestRisk.isValid()) {
        this.unparsed = true;
    }
    this.changeRequestRisk = changeRequestRisk;
  }
  public ChangeRequestResponseAttributes changeRequestType(ChangeRequestChangeType changeRequestType) {
    this.changeRequestType = changeRequestType;
    this.unparsed |= !changeRequestType.isValid();
    return this;
  }

  /**
   * <p>The type of the change request.</p>
   * @return changeRequestType
  **/
      @JsonProperty(JSON_PROPERTY_CHANGE_REQUEST_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ChangeRequestChangeType getChangeRequestType() {
        return changeRequestType;
      }
  public void setChangeRequestType(ChangeRequestChangeType changeRequestType) {
    if (!changeRequestType.isValid()) {
        this.unparsed = true;
    }
    this.changeRequestType = changeRequestType;
  }

  /**
   * <p>Timestamp of when the change request was closed.</p>
   * @return closedAt
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public OffsetDateTime getClosedAt() {

        if (closedAt == null) {
          closedAt = JsonNullable.<OffsetDateTime>undefined();
        }
        return closedAt.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_CLOSED_AT)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getClosedAt_JsonNullable() {
    return closedAt;
  }
  @JsonProperty(JSON_PROPERTY_CLOSED_AT)private void setClosedAt_JsonNullable(JsonNullable<OffsetDateTime> closedAt) {
    this.closedAt = closedAt;
  }

  /**
   * <p>Timestamp of when the change request was created.</p>
   * @return createdAt
  **/
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public OffsetDateTime getCreatedAt() {
        return createdAt;
      }
  public ChangeRequestResponseAttributes creationSource(String creationSource) {
    this.creationSource = creationSource;
    return this;
  }

  /**
   * <p>The source from which the change request was created.</p>
   * @return creationSource
  **/
      @JsonProperty(JSON_PROPERTY_CREATION_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getCreationSource() {
        return creationSource;
      }
  public void setCreationSource(String creationSource) {
    this.creationSource = creationSource;
  }
  public ChangeRequestResponseAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>The description of the change request.</p>
   * @return description
  **/
      @JsonProperty(JSON_PROPERTY_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getDescription() {
        return description;
      }
  public void setDescription(String description) {
    this.description = description;
  }
  public ChangeRequestResponseAttributes endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * <p>The planned end date of the change request.</p>
   * @return endDate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_END_DATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getEndDate() {
        return endDate;
      }
  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }
  public ChangeRequestResponseAttributes key(String key) {
    this.key = key;
    return this;
  }

  /**
   * <p>The human-readable key of the change request.</p>
   * @return key
  **/
      @JsonProperty(JSON_PROPERTY_KEY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getKey() {
        return key;
      }
  public void setKey(String key) {
    this.key = key;
  }

  /**
   * <p>Timestamp of when the change request was last modified.</p>
   * @return modifiedAt
  **/
      @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public OffsetDateTime getModifiedAt() {
        return modifiedAt;
      }
  public ChangeRequestResponseAttributes planNotebookId(Long planNotebookId) {
    this.planNotebookId = planNotebookId;
    return this;
  }

  /**
   * <p>The notebook ID associated with the change request plan.</p>
   * @return planNotebookId
  **/
      @JsonProperty(JSON_PROPERTY_PLAN_NOTEBOOK_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getPlanNotebookId() {
        return planNotebookId;
      }
  public void setPlanNotebookId(Long planNotebookId) {
    this.planNotebookId = planNotebookId;
  }
  public ChangeRequestResponseAttributes priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * <p>The priority of the change request.</p>
   * @return priority
  **/
      @JsonProperty(JSON_PROPERTY_PRIORITY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getPriority() {
        return priority;
      }
  public void setPriority(String priority) {
    this.priority = priority;
  }
  public ChangeRequestResponseAttributes projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * <p>The project UUID associated with the change request.</p>
   * @return projectId
  **/
      @JsonProperty(JSON_PROPERTY_PROJECT_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getProjectId() {
        return projectId;
      }
  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }
  public ChangeRequestResponseAttributes startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * <p>The planned start date of the change request.</p>
   * @return startDate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_START_DATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getStartDate() {
        return startDate;
      }
  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }
  public ChangeRequestResponseAttributes status(String status) {
    this.status = status;
    return this;
  }

  /**
   * <p>The current status of the change request.</p>
   * @return status
  **/
      @JsonProperty(JSON_PROPERTY_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getStatus() {
        return status;
      }
  public void setStatus(String status) {
    this.status = status;
  }
  public ChangeRequestResponseAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <p>The title of the change request.</p>
   * @return title
  **/
      @JsonProperty(JSON_PROPERTY_TITLE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getTitle() {
        return title;
      }
  public void setTitle(String title) {
    this.title = title;
  }
  public ChangeRequestResponseAttributes type(String type) {
    this.type = type;
    return this;
  }

  /**
   * <p>The case type.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getType() {
        return type;
      }
  public void setType(String type) {
    this.type = type;
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
   * @return ChangeRequestResponseAttributes
   */
  @JsonAnySetter
  public ChangeRequestResponseAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this ChangeRequestResponseAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeRequestResponseAttributes changeRequestResponseAttributes = (ChangeRequestResponseAttributes) o;
    return Objects.equals(this.archivedAt, changeRequestResponseAttributes.archivedAt) && Objects.equals(this.attributes, changeRequestResponseAttributes.attributes) && Objects.equals(this.changeRequestLinkedIncidentUuid, changeRequestResponseAttributes.changeRequestLinkedIncidentUuid) && Objects.equals(this.changeRequestMaintenanceWindowQuery, changeRequestResponseAttributes.changeRequestMaintenanceWindowQuery) && Objects.equals(this.changeRequestPlan, changeRequestResponseAttributes.changeRequestPlan) && Objects.equals(this.changeRequestRisk, changeRequestResponseAttributes.changeRequestRisk) && Objects.equals(this.changeRequestType, changeRequestResponseAttributes.changeRequestType) && Objects.equals(this.closedAt, changeRequestResponseAttributes.closedAt) && Objects.equals(this.createdAt, changeRequestResponseAttributes.createdAt) && Objects.equals(this.creationSource, changeRequestResponseAttributes.creationSource) && Objects.equals(this.description, changeRequestResponseAttributes.description) && Objects.equals(this.endDate, changeRequestResponseAttributes.endDate) && Objects.equals(this.key, changeRequestResponseAttributes.key) && Objects.equals(this.modifiedAt, changeRequestResponseAttributes.modifiedAt) && Objects.equals(this.planNotebookId, changeRequestResponseAttributes.planNotebookId) && Objects.equals(this.priority, changeRequestResponseAttributes.priority) && Objects.equals(this.projectId, changeRequestResponseAttributes.projectId) && Objects.equals(this.startDate, changeRequestResponseAttributes.startDate) && Objects.equals(this.status, changeRequestResponseAttributes.status) && Objects.equals(this.title, changeRequestResponseAttributes.title) && Objects.equals(this.type, changeRequestResponseAttributes.type) && Objects.equals(this.additionalProperties, changeRequestResponseAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(archivedAt,attributes,changeRequestLinkedIncidentUuid,changeRequestMaintenanceWindowQuery,changeRequestPlan,changeRequestRisk,changeRequestType,closedAt,createdAt,creationSource,description,endDate,key,modifiedAt,planNotebookId,priority,projectId,startDate,status,title,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeRequestResponseAttributes {\n");
    sb.append("    archivedAt: ").append(toIndentedString(archivedAt)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    changeRequestLinkedIncidentUuid: ").append(toIndentedString(changeRequestLinkedIncidentUuid)).append("\n");
    sb.append("    changeRequestMaintenanceWindowQuery: ").append(toIndentedString(changeRequestMaintenanceWindowQuery)).append("\n");
    sb.append("    changeRequestPlan: ").append(toIndentedString(changeRequestPlan)).append("\n");
    sb.append("    changeRequestRisk: ").append(toIndentedString(changeRequestRisk)).append("\n");
    sb.append("    changeRequestType: ").append(toIndentedString(changeRequestType)).append("\n");
    sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creationSource: ").append(toIndentedString(creationSource)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    planNotebookId: ").append(toIndentedString(planNotebookId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
