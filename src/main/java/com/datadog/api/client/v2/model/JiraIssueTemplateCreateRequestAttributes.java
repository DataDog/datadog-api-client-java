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

/** Attributes for creating a Jira issue template */
@JsonPropertyOrder({
  JiraIssueTemplateCreateRequestAttributes.JSON_PROPERTY_FIELDS,
  JiraIssueTemplateCreateRequestAttributes.JSON_PROPERTY_ISSUE_TYPE_ID,
  JiraIssueTemplateCreateRequestAttributes.JSON_PROPERTY_JIRA_ACCOUNT,
  JiraIssueTemplateCreateRequestAttributes.JSON_PROPERTY_NAME,
  JiraIssueTemplateCreateRequestAttributes.JSON_PROPERTY_PROJECT_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class JiraIssueTemplateCreateRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIELDS = "fields";
  private Map<String, Object> fields = null;

  public static final String JSON_PROPERTY_ISSUE_TYPE_ID = "issue_type_id";
  private String issueTypeId;

  public static final String JSON_PROPERTY_JIRA_ACCOUNT = "jira-account";
  private JiraIssueTemplateCreateRequestAttributesJiraAccount jiraAccount;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROJECT_ID = "project_id";
  private String projectId;

  public JiraIssueTemplateCreateRequestAttributes fields(Map<String, Object> fields) {
    this.fields = fields;
    return this;
  }

  public JiraIssueTemplateCreateRequestAttributes putFieldsItem(String key, Object fieldsItem) {
    if (this.fields == null) {
      this.fields = new HashMap<>();
    }
    this.fields.put(key, fieldsItem);
    return this;
  }

  /**
   * Custom fields for the Jira issue template
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

  public JiraIssueTemplateCreateRequestAttributes issueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
    return this;
  }

  /**
   * The ID of the Jira issue type
   *
   * @return issueTypeId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUE_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIssueTypeId() {
    return issueTypeId;
  }

  public void setIssueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
  }

  public JiraIssueTemplateCreateRequestAttributes jiraAccount(
      JiraIssueTemplateCreateRequestAttributesJiraAccount jiraAccount) {
    this.jiraAccount = jiraAccount;
    this.unparsed |= jiraAccount.unparsed;
    return this;
  }

  /**
   * Reference to the Jira account
   *
   * @return jiraAccount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JIRA_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JiraIssueTemplateCreateRequestAttributesJiraAccount getJiraAccount() {
    return jiraAccount;
  }

  public void setJiraAccount(JiraIssueTemplateCreateRequestAttributesJiraAccount jiraAccount) {
    this.jiraAccount = jiraAccount;
  }

  public JiraIssueTemplateCreateRequestAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the issue template
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JiraIssueTemplateCreateRequestAttributes projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The ID of the Jira project
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
   * @return JiraIssueTemplateCreateRequestAttributes
   */
  @JsonAnySetter
  public JiraIssueTemplateCreateRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this JiraIssueTemplateCreateRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraIssueTemplateCreateRequestAttributes jiraIssueTemplateCreateRequestAttributes =
        (JiraIssueTemplateCreateRequestAttributes) o;
    return Objects.equals(this.fields, jiraIssueTemplateCreateRequestAttributes.fields)
        && Objects.equals(this.issueTypeId, jiraIssueTemplateCreateRequestAttributes.issueTypeId)
        && Objects.equals(this.jiraAccount, jiraIssueTemplateCreateRequestAttributes.jiraAccount)
        && Objects.equals(this.name, jiraIssueTemplateCreateRequestAttributes.name)
        && Objects.equals(this.projectId, jiraIssueTemplateCreateRequestAttributes.projectId)
        && Objects.equals(
            this.additionalProperties,
            jiraIssueTemplateCreateRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, issueTypeId, jiraAccount, name, projectId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraIssueTemplateCreateRequestAttributes {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    issueTypeId: ").append(toIndentedString(issueTypeId)).append("\n");
    sb.append("    jiraAccount: ").append(toIndentedString(jiraAccount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
