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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Object containing the information of a case. */
@JsonPropertyOrder({
  IssueCaseAttributes.JSON_PROPERTY_ARCHIVED_AT,
  IssueCaseAttributes.JSON_PROPERTY_CLOSED_AT,
  IssueCaseAttributes.JSON_PROPERTY_CREATED_AT,
  IssueCaseAttributes.JSON_PROPERTY_CREATION_SOURCE,
  IssueCaseAttributes.JSON_PROPERTY_DESCRIPTION,
  IssueCaseAttributes.JSON_PROPERTY_DUE_DATE,
  IssueCaseAttributes.JSON_PROPERTY_INSIGHTS,
  IssueCaseAttributes.JSON_PROPERTY_JIRA_ISSUE,
  IssueCaseAttributes.JSON_PROPERTY_KEY,
  IssueCaseAttributes.JSON_PROPERTY_MODIFIED_AT,
  IssueCaseAttributes.JSON_PROPERTY_PRIORITY,
  IssueCaseAttributes.JSON_PROPERTY_STATUS,
  IssueCaseAttributes.JSON_PROPERTY_TITLE,
  IssueCaseAttributes.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IssueCaseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARCHIVED_AT = "archived_at";
  private OffsetDateTime archivedAt;

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
  private List<IssueCaseInsight> insights = null;

  public static final String JSON_PROPERTY_JIRA_ISSUE = "jira_issue";
  private IssueCaseJiraIssue jiraIssue;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private CasePriority priority = CasePriority.NOT_DEFINED;

  public static final String JSON_PROPERTY_STATUS = "status";
  private CaseStatus status;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public IssueCaseAttributes archivedAt(OffsetDateTime archivedAt) {
    this.archivedAt = archivedAt;
    return this;
  }

  /**
   * Timestamp of when the case was archived.
   *
   * @return archivedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARCHIVED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getArchivedAt() {
    return archivedAt;
  }

  public void setArchivedAt(OffsetDateTime archivedAt) {
    this.archivedAt = archivedAt;
  }

  public IssueCaseAttributes closedAt(OffsetDateTime closedAt) {
    this.closedAt = closedAt;
    return this;
  }

  /**
   * Timestamp of when the case was closed.
   *
   * @return closedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOSED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getClosedAt() {
    return closedAt;
  }

  public void setClosedAt(OffsetDateTime closedAt) {
    this.closedAt = closedAt;
  }

  public IssueCaseAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp of when the case was created.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public IssueCaseAttributes creationSource(String creationSource) {
    this.creationSource = creationSource;
    return this;
  }

  /**
   * Source of the case creation.
   *
   * @return creationSource
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATION_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCreationSource() {
    return creationSource;
  }

  public void setCreationSource(String creationSource) {
    this.creationSource = creationSource;
  }

  public IssueCaseAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the case.
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

  public IssueCaseAttributes dueDate(String dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Due date of the case.
   *
   * @return dueDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDueDate() {
    return dueDate;
  }

  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }

  public IssueCaseAttributes insights(List<IssueCaseInsight> insights) {
    this.insights = insights;
    for (IssueCaseInsight item : insights) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IssueCaseAttributes addInsightsItem(IssueCaseInsight insightsItem) {
    if (this.insights == null) {
      this.insights = new ArrayList<>();
    }
    this.insights.add(insightsItem);
    this.unparsed |= insightsItem.unparsed;
    return this;
  }

  /**
   * Insights of the case.
   *
   * @return insights
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSIGHTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IssueCaseInsight> getInsights() {
    return insights;
  }

  public void setInsights(List<IssueCaseInsight> insights) {
    this.insights = insights;
  }

  public IssueCaseAttributes jiraIssue(IssueCaseJiraIssue jiraIssue) {
    this.jiraIssue = jiraIssue;
    this.unparsed |= jiraIssue.unparsed;
    return this;
  }

  /**
   * Jira issue of the case.
   *
   * @return jiraIssue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JIRA_ISSUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IssueCaseJiraIssue getJiraIssue() {
    return jiraIssue;
  }

  public void setJiraIssue(IssueCaseJiraIssue jiraIssue) {
    this.jiraIssue = jiraIssue;
  }

  public IssueCaseAttributes key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Key of the case.
   *
   * @return key
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public IssueCaseAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Timestamp of when the case was last modified.
   *
   * @return modifiedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public IssueCaseAttributes priority(CasePriority priority) {
    this.priority = priority;
    this.unparsed |= !priority.isValid();
    return this;
  }

  /**
   * Case priority
   *
   * @return priority
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CasePriority getPriority() {
    return priority;
  }

  public void setPriority(CasePriority priority) {
    if (!priority.isValid()) {
      this.unparsed = true;
    }
    this.priority = priority;
  }

  public IssueCaseAttributes status(CaseStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Deprecated way of representing the case status, which only supports OPEN, IN_PROGRESS, and
   * CLOSED statuses. Use <code>status_name</code> instead.
   *
   * @return status
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CaseStatus getStatus() {
    return status;
  }

  @Deprecated
  public void setStatus(CaseStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public IssueCaseAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the case.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public IssueCaseAttributes type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the case.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
   * @return IssueCaseAttributes
   */
  @JsonAnySetter
  public IssueCaseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IssueCaseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueCaseAttributes issueCaseAttributes = (IssueCaseAttributes) o;
    return Objects.equals(this.archivedAt, issueCaseAttributes.archivedAt)
        && Objects.equals(this.closedAt, issueCaseAttributes.closedAt)
        && Objects.equals(this.createdAt, issueCaseAttributes.createdAt)
        && Objects.equals(this.creationSource, issueCaseAttributes.creationSource)
        && Objects.equals(this.description, issueCaseAttributes.description)
        && Objects.equals(this.dueDate, issueCaseAttributes.dueDate)
        && Objects.equals(this.insights, issueCaseAttributes.insights)
        && Objects.equals(this.jiraIssue, issueCaseAttributes.jiraIssue)
        && Objects.equals(this.key, issueCaseAttributes.key)
        && Objects.equals(this.modifiedAt, issueCaseAttributes.modifiedAt)
        && Objects.equals(this.priority, issueCaseAttributes.priority)
        && Objects.equals(this.status, issueCaseAttributes.status)
        && Objects.equals(this.title, issueCaseAttributes.title)
        && Objects.equals(this.type, issueCaseAttributes.type)
        && Objects.equals(this.additionalProperties, issueCaseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        archivedAt,
        closedAt,
        createdAt,
        creationSource,
        description,
        dueDate,
        insights,
        jiraIssue,
        key,
        modifiedAt,
        priority,
        status,
        title,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueCaseAttributes {\n");
    sb.append("    archivedAt: ").append(toIndentedString(archivedAt)).append("\n");
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
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
