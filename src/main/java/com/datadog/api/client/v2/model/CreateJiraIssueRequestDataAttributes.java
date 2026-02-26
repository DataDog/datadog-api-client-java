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

/** Attributes of the Jira issue to create. */
@JsonPropertyOrder({
  CreateJiraIssueRequestDataAttributes.JSON_PROPERTY_ASSIGNEE_ID,
  CreateJiraIssueRequestDataAttributes.JSON_PROPERTY_DESCRIPTION,
  CreateJiraIssueRequestDataAttributes.JSON_PROPERTY_FIELDS,
  CreateJiraIssueRequestDataAttributes.JSON_PROPERTY_PRIORITY,
  CreateJiraIssueRequestDataAttributes.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateJiraIssueRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSIGNEE_ID = "assignee_id";
  private String assigneeId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private Map<String, Object> fields = null;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private CasePriority priority = CasePriority.NOT_DEFINED;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public CreateJiraIssueRequestDataAttributes assigneeId(String assigneeId) {
    this.assigneeId = assigneeId;
    return this;
  }

  /**
   * Unique identifier of the Datadog user assigned to the Jira issue.
   *
   * @return assigneeId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNEE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAssigneeId() {
    return assigneeId;
  }

  public void setAssigneeId(String assigneeId) {
    this.assigneeId = assigneeId;
  }

  public CreateJiraIssueRequestDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the Jira issue. If not provided, the description will be automatically
   * generated.
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

  public CreateJiraIssueRequestDataAttributes fields(Map<String, Object> fields) {
    this.fields = fields;
    return this;
  }

  public CreateJiraIssueRequestDataAttributes putFieldsItem(String key, Object fieldsItem) {
    if (this.fields == null) {
      this.fields = new HashMap<>();
    }
    this.fields.put(key, fieldsItem);
    return this;
  }

  /**
   * Custom fields of the Jira issue to create. For the list of available fields, see <a
   * href="https://developer.atlassian.com/cloud/jira/platform/rest/v2/api-group-issues/#api-rest-api-2-issue-createmeta-projectidorkey-issuetypes-issuetypeid-get">Jira
   * documentation</a>.
   *
   * @return fields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getFields() {
    return fields;
  }

  public void setFields(Map<String, Object> fields) {
    this.fields = fields;
  }

  public CreateJiraIssueRequestDataAttributes priority(CasePriority priority) {
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

  public CreateJiraIssueRequestDataAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the Jira issue. If not provided, the title will be automatically generated.
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
   * @return CreateJiraIssueRequestDataAttributes
   */
  @JsonAnySetter
  public CreateJiraIssueRequestDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CreateJiraIssueRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateJiraIssueRequestDataAttributes createJiraIssueRequestDataAttributes =
        (CreateJiraIssueRequestDataAttributes) o;
    return Objects.equals(this.assigneeId, createJiraIssueRequestDataAttributes.assigneeId)
        && Objects.equals(this.description, createJiraIssueRequestDataAttributes.description)
        && Objects.equals(this.fields, createJiraIssueRequestDataAttributes.fields)
        && Objects.equals(this.priority, createJiraIssueRequestDataAttributes.priority)
        && Objects.equals(this.title, createJiraIssueRequestDataAttributes.title)
        && Objects.equals(
            this.additionalProperties, createJiraIssueRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assigneeId, description, fields, priority, title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateJiraIssueRequestDataAttributes {\n");
    sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
