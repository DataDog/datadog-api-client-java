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
   * <p>Attributes of the case.</p>
 */
@JsonPropertyOrder({
  FindingCaseResponseDataAttributes.JSON_PROPERTY_ARCHIVED_AT,
  FindingCaseResponseDataAttributes.JSON_PROPERTY_ASSIGNED_TO,
  FindingCaseResponseDataAttributes.JSON_PROPERTY_ATTRIBUTES,
  FindingCaseResponseDataAttributes.JSON_PROPERTY_CLOSED_AT,
  FindingCaseResponseDataAttributes.JSON_PROPERTY_CREATED_AT,
  FindingCaseResponseDataAttributes.JSON_PROPERTY_CREATION_SOURCE,
  FindingCaseResponseDataAttributes.JSON_PROPERTY_DESCRIPTION,
  FindingCaseResponseDataAttributes.JSON_PROPERTY_DUE_DATE,
  FindingCaseResponseDataAttributes.JSON_PROPERTY_INSIGHTS,
  FindingCaseResponseDataAttributes.JSON_PROPERTY_JIRA_ISSUE,
  FindingCaseResponseDataAttributes.JSON_PROPERTY_KEY,
  FindingCaseResponseDataAttributes.JSON_PROPERTY_MODIFIED_AT,
  FindingCaseResponseDataAttributes.JSON_PROPERTY_PRIORITY,
  FindingCaseResponseDataAttributes.JSON_PROPERTY_STATUS,
  FindingCaseResponseDataAttributes.JSON_PROPERTY_STATUS_GROUP,
  FindingCaseResponseDataAttributes.JSON_PROPERTY_STATUS_NAME,
  FindingCaseResponseDataAttributes.JSON_PROPERTY_TITLE,
  FindingCaseResponseDataAttributes.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FindingCaseResponseDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARCHIVED_AT = "archived_at";
  private OffsetDateTime archivedAt;

  public static final String JSON_PROPERTY_ASSIGNED_TO = "assigned_to";
  private RelationshipToUser assignedTo;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private Map<String, List<String>> attributes = null;

  public static final String JSON_PROPERTY_CLOSED_AT = "closed_at";
  private OffsetDateTime closedAt;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATION_SOURCE = "creation_source";
  private String creationSource;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DUE_DATE = "due_date";
  private String dueDate;

  public static final String JSON_PROPERTY_INSIGHTS = "insights";
  private List<CaseInsightsItems> insights = null;

  public static final String JSON_PROPERTY_JIRA_ISSUE = "jira_issue";
  private FindingJiraIssue jiraIssue;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private String priority;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_STATUS_GROUP = "status_group";
  private String statusGroup;

  public static final String JSON_PROPERTY_STATUS_NAME = "status_name";
  private String statusName;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public FindingCaseResponseDataAttributes archivedAt(OffsetDateTime archivedAt) {
    this.archivedAt = archivedAt;
    return this;
  }

  /**
   * <p>Timestamp of when the case was archived.</p>
   * @return archivedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ARCHIVED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getArchivedAt() {
        return archivedAt;
      }
  public void setArchivedAt(OffsetDateTime archivedAt) {
    this.archivedAt = archivedAt;
  }
  public FindingCaseResponseDataAttributes assignedTo(RelationshipToUser assignedTo) {
    this.assignedTo = assignedTo;
    this.unparsed |= assignedTo.unparsed;
    return this;
  }

  /**
   * <p>Relationship to user.</p>
   * @return assignedTo
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ASSIGNED_TO)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public RelationshipToUser getAssignedTo() {
        return assignedTo;
      }
  public void setAssignedTo(RelationshipToUser assignedTo) {
    this.assignedTo = assignedTo;
  }
  public FindingCaseResponseDataAttributes attributes(Map<String, List<String>> attributes) {
    this.attributes = attributes;
    return this;
  }
  public FindingCaseResponseDataAttributes putAttributesItem(String key, List<String> attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * <p>Getattributes</p>
   * @return attributes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, List<String>> getAttributes() {
        return attributes;
      }
  public void setAttributes(Map<String, List<String>> attributes) {
    this.attributes = attributes;
  }
  public FindingCaseResponseDataAttributes closedAt(OffsetDateTime closedAt) {
    this.closedAt = closedAt;
    return this;
  }

  /**
   * <p>Timestamp of when the case was closed.</p>
   * @return closedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CLOSED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getClosedAt() {
        return closedAt;
      }
  public void setClosedAt(OffsetDateTime closedAt) {
    this.closedAt = closedAt;
  }
  public FindingCaseResponseDataAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>Timestamp of when the case was created.</p>
   * @return createdAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getCreatedAt() {
        return createdAt;
      }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }
  public FindingCaseResponseDataAttributes creationSource(String creationSource) {
    this.creationSource = creationSource;
    return this;
  }

  /**
   * <p>Source of the case creation.</p>
   * @return creationSource
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATION_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCreationSource() {
        return creationSource;
      }
  public void setCreationSource(String creationSource) {
    this.creationSource = creationSource;
  }
  public FindingCaseResponseDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>Description of the case.</p>
   * @return description
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDescription() {
        return description;
      }
  public void setDescription(String description) {
    this.description = description;
  }
  public FindingCaseResponseDataAttributes dueDate(String dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * <p>Due date of the case.</p>
   * @return dueDate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DUE_DATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDueDate() {
        return dueDate;
      }
  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }
  public FindingCaseResponseDataAttributes insights(List<CaseInsightsItems> insights) {
    this.insights = insights;
    for (CaseInsightsItems item : insights) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public FindingCaseResponseDataAttributes addInsightsItem(CaseInsightsItems insightsItem) {
    if (this.insights == null) {
      this.insights = new ArrayList<>();
    }
    this.insights.add(insightsItem);
    this.unparsed |= insightsItem.unparsed;
    return this;
  }

  /**
   * <p>Insights of the case.</p>
   * @return insights
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INSIGHTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<CaseInsightsItems> getInsights() {
        return insights;
      }
  public void setInsights(List<CaseInsightsItems> insights) {
    this.insights = insights;
  }
  public FindingCaseResponseDataAttributes jiraIssue(FindingJiraIssue jiraIssue) {
    this.jiraIssue = jiraIssue;
    this.unparsed |= jiraIssue.unparsed;
    return this;
  }

  /**
   * <p>Jira issue associated with the case.</p>
   * @return jiraIssue
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_JIRA_ISSUE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public FindingJiraIssue getJiraIssue() {
        return jiraIssue;
      }
  public void setJiraIssue(FindingJiraIssue jiraIssue) {
    this.jiraIssue = jiraIssue;
  }
  public FindingCaseResponseDataAttributes key(String key) {
    this.key = key;
    return this;
  }

  /**
   * <p>Key of the case.</p>
   * @return key
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getKey() {
        return key;
      }
  public void setKey(String key) {
    this.key = key;
  }
  public FindingCaseResponseDataAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * <p>Timestamp of when the case was last modified.</p>
   * @return modifiedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getModifiedAt() {
        return modifiedAt;
      }
  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }
  public FindingCaseResponseDataAttributes priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * <p>Priority of the case.</p>
   * @return priority
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PRIORITY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPriority() {
        return priority;
      }
  public void setPriority(String priority) {
    this.priority = priority;
  }
  public FindingCaseResponseDataAttributes status(String status) {
    this.status = status;
    return this;
  }

  /**
   * <p>Status of the case.</p>
   * @return status
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getStatus() {
        return status;
      }
  public void setStatus(String status) {
    this.status = status;
  }
  public FindingCaseResponseDataAttributes statusGroup(String statusGroup) {
    this.statusGroup = statusGroup;
    return this;
  }

  /**
   * <p>Status group of the case.</p>
   * @return statusGroup
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATUS_GROUP)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getStatusGroup() {
        return statusGroup;
      }
  public void setStatusGroup(String statusGroup) {
    this.statusGroup = statusGroup;
  }
  public FindingCaseResponseDataAttributes statusName(String statusName) {
    this.statusName = statusName;
    return this;
  }

  /**
   * <p>Status name of the case.</p>
   * @return statusName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATUS_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getStatusName() {
        return statusName;
      }
  public void setStatusName(String statusName) {
    this.statusName = statusName;
  }
  public FindingCaseResponseDataAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <p>Title of the case.</p>
   * @return title
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TITLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTitle() {
        return title;
      }
  public void setTitle(String title) {
    this.title = title;
  }
  public FindingCaseResponseDataAttributes type(String type) {
    this.type = type;
    return this;
  }

  /**
   * <p>Type of the case. For security cases, this is always "SECURITY".</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * @return FindingCaseResponseDataAttributes
   */
  @JsonAnySetter
  public FindingCaseResponseDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this FindingCaseResponseDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindingCaseResponseDataAttributes findingCaseResponseDataAttributes = (FindingCaseResponseDataAttributes) o;
    return Objects.equals(this.archivedAt, findingCaseResponseDataAttributes.archivedAt) && Objects.equals(this.assignedTo, findingCaseResponseDataAttributes.assignedTo) && Objects.equals(this.attributes, findingCaseResponseDataAttributes.attributes) && Objects.equals(this.closedAt, findingCaseResponseDataAttributes.closedAt) && Objects.equals(this.createdAt, findingCaseResponseDataAttributes.createdAt) && Objects.equals(this.creationSource, findingCaseResponseDataAttributes.creationSource) && Objects.equals(this.description, findingCaseResponseDataAttributes.description) && Objects.equals(this.dueDate, findingCaseResponseDataAttributes.dueDate) && Objects.equals(this.insights, findingCaseResponseDataAttributes.insights) && Objects.equals(this.jiraIssue, findingCaseResponseDataAttributes.jiraIssue) && Objects.equals(this.key, findingCaseResponseDataAttributes.key) && Objects.equals(this.modifiedAt, findingCaseResponseDataAttributes.modifiedAt) && Objects.equals(this.priority, findingCaseResponseDataAttributes.priority) && Objects.equals(this.status, findingCaseResponseDataAttributes.status) && Objects.equals(this.statusGroup, findingCaseResponseDataAttributes.statusGroup) && Objects.equals(this.statusName, findingCaseResponseDataAttributes.statusName) && Objects.equals(this.title, findingCaseResponseDataAttributes.title) && Objects.equals(this.type, findingCaseResponseDataAttributes.type) && Objects.equals(this.additionalProperties, findingCaseResponseDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(archivedAt,assignedTo,attributes,closedAt,createdAt,creationSource,description,dueDate,insights,jiraIssue,key,modifiedAt,priority,status,statusGroup,statusName,title,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindingCaseResponseDataAttributes {\n");
    sb.append("    archivedAt: ").append(toIndentedString(archivedAt)).append("\n");
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creationSource: ").append(toIndentedString(creationSource)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    insights: ").append(toIndentedString(insights)).append("\n");
    sb.append("    jiraIssue: ").append(toIndentedString(jiraIssue)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusGroup: ").append(toIndentedString(statusGroup)).append("\n");
    sb.append("    statusName: ").append(toIndentedString(statusName)).append("\n");
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
