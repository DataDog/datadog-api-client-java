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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Case resource attributes */
@JsonPropertyOrder({
  CaseResourceAttributes.JSON_PROPERTY_ARCHIVED_AT,
  CaseResourceAttributes.JSON_PROPERTY_ATTRIBUTES,
  CaseResourceAttributes.JSON_PROPERTY_CLOSED_AT,
  CaseResourceAttributes.JSON_PROPERTY_CREATED_AT,
  CaseResourceAttributes.JSON_PROPERTY_DESCRIPTION,
  CaseResourceAttributes.JSON_PROPERTY_JIRA_ISSUE,
  CaseResourceAttributes.JSON_PROPERTY_KEY,
  CaseResourceAttributes.JSON_PROPERTY_MODIFIED_AT,
  CaseResourceAttributes.JSON_PROPERTY_PRIORITY,
  CaseResourceAttributes.JSON_PROPERTY_SERVICE_NOW_TICKET,
  CaseResourceAttributes.JSON_PROPERTY_STATUS,
  CaseResourceAttributes.JSON_PROPERTY_TITLE,
  CaseResourceAttributes.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CaseResourceAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARCHIVED_AT = "archived_at";
  private JsonNullable<OffsetDateTime> archivedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private Map<String, List<String>> attributes = null;

  public static final String JSON_PROPERTY_CLOSED_AT = "closed_at";
  private JsonNullable<OffsetDateTime> closedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_JIRA_ISSUE = "jira_issue";
  private JsonNullable<JiraIssue> jiraIssue = JsonNullable.<JiraIssue>undefined();

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private JsonNullable<OffsetDateTime> modifiedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private CasePriority priority = CasePriority.NOT_DEFINED;

  public static final String JSON_PROPERTY_SERVICE_NOW_TICKET = "service_now_ticket";
  private JsonNullable<ServiceNowTicket> serviceNowTicket =
      JsonNullable.<ServiceNowTicket>undefined();

  public static final String JSON_PROPERTY_STATUS = "status";
  private CaseStatus status;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CaseType type;

  /**
   * Timestamp of when the case was archived
   *
   * @return archivedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getArchivedAt() {

    if (archivedAt == null) {
      archivedAt = JsonNullable.<OffsetDateTime>undefined();
    }
    return archivedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ARCHIVED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getArchivedAt_JsonNullable() {
    return archivedAt;
  }

  @JsonProperty(JSON_PROPERTY_ARCHIVED_AT)
  private void setArchivedAt_JsonNullable(JsonNullable<OffsetDateTime> archivedAt) {
    this.archivedAt = archivedAt;
  }

  public CaseResourceAttributes attributes(Map<String, List<String>> attributes) {
    this.attributes = attributes;
    return this;
  }

  public CaseResourceAttributes putAttributesItem(String key, List<String> attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * The definition of <code>CaseAttributes</code> object.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, List<String>> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, List<String>> attributes) {
    this.attributes = attributes;
  }

  /**
   * Timestamp of when the case was closed
   *
   * @return closedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getClosedAt() {

    if (closedAt == null) {
      closedAt = JsonNullable.<OffsetDateTime>undefined();
    }
    return closedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CLOSED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getClosedAt_JsonNullable() {
    return closedAt;
  }

  @JsonProperty(JSON_PROPERTY_CLOSED_AT)
  private void setClosedAt_JsonNullable(JsonNullable<OffsetDateTime> closedAt) {
    this.closedAt = closedAt;
  }

  /**
   * Timestamp of when the case was created
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public CaseResourceAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description
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

  /**
   * Jira issue attached to case
   *
   * @return jiraIssue
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public JiraIssue getJiraIssue() {

    if (jiraIssue == null) {
      jiraIssue = JsonNullable.<JiraIssue>undefined();
    }
    return jiraIssue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_JIRA_ISSUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<JiraIssue> getJiraIssue_JsonNullable() {
    return jiraIssue;
  }

  @JsonProperty(JSON_PROPERTY_JIRA_ISSUE)
  private void setJiraIssue_JsonNullable(JsonNullable<JiraIssue> jiraIssue) {
    this.jiraIssue = jiraIssue;
  }

  public CaseResourceAttributes key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Key
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

  /**
   * Timestamp of when the case was last modified
   *
   * @return modifiedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getModifiedAt() {

    if (modifiedAt == null) {
      modifiedAt = JsonNullable.<OffsetDateTime>undefined();
    }
    return modifiedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getModifiedAt_JsonNullable() {
    return modifiedAt;
  }

  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  private void setModifiedAt_JsonNullable(JsonNullable<OffsetDateTime> modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public CaseResourceAttributes priority(CasePriority priority) {
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

  /**
   * ServiceNow ticket attached to case
   *
   * @return serviceNowTicket
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public ServiceNowTicket getServiceNowTicket() {

    if (serviceNowTicket == null) {
      serviceNowTicket = JsonNullable.<ServiceNowTicket>undefined();
    }
    return serviceNowTicket.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SERVICE_NOW_TICKET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<ServiceNowTicket> getServiceNowTicket_JsonNullable() {
    return serviceNowTicket;
  }

  @JsonProperty(JSON_PROPERTY_SERVICE_NOW_TICKET)
  private void setServiceNowTicket_JsonNullable(JsonNullable<ServiceNowTicket> serviceNowTicket) {
    this.serviceNowTicket = serviceNowTicket;
  }

  public CaseResourceAttributes status(CaseStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Case status
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CaseStatus getStatus() {
    return status;
  }

  public void setStatus(CaseStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public CaseResourceAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title
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

  public CaseResourceAttributes type(CaseType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Case type
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CaseType getType() {
    return type;
  }

  public void setType(CaseType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
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
   * @return CaseResourceAttributes
   */
  @JsonAnySetter
  public CaseResourceAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CaseResourceAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseResourceAttributes caseResourceAttributes = (CaseResourceAttributes) o;
    return Objects.equals(this.archivedAt, caseResourceAttributes.archivedAt)
        && Objects.equals(this.attributes, caseResourceAttributes.attributes)
        && Objects.equals(this.closedAt, caseResourceAttributes.closedAt)
        && Objects.equals(this.createdAt, caseResourceAttributes.createdAt)
        && Objects.equals(this.description, caseResourceAttributes.description)
        && Objects.equals(this.jiraIssue, caseResourceAttributes.jiraIssue)
        && Objects.equals(this.key, caseResourceAttributes.key)
        && Objects.equals(this.modifiedAt, caseResourceAttributes.modifiedAt)
        && Objects.equals(this.priority, caseResourceAttributes.priority)
        && Objects.equals(this.serviceNowTicket, caseResourceAttributes.serviceNowTicket)
        && Objects.equals(this.status, caseResourceAttributes.status)
        && Objects.equals(this.title, caseResourceAttributes.title)
        && Objects.equals(this.type, caseResourceAttributes.type)
        && Objects.equals(this.additionalProperties, caseResourceAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        archivedAt,
        attributes,
        closedAt,
        createdAt,
        description,
        jiraIssue,
        key,
        modifiedAt,
        priority,
        serviceNowTicket,
        status,
        title,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseResourceAttributes {\n");
    sb.append("    archivedAt: ").append(toIndentedString(archivedAt)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    jiraIssue: ").append(toIndentedString(jiraIssue)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    serviceNowTicket: ").append(toIndentedString(serviceNowTicket)).append("\n");
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
