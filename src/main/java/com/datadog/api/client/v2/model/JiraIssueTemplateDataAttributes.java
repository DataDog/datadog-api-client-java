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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes of a Jira issue template */
@JsonPropertyOrder({
  JiraIssueTemplateDataAttributes.JSON_PROPERTY_FIELDS,
  JiraIssueTemplateDataAttributes.JSON_PROPERTY_ISSUE_TYPE_ID,
  JiraIssueTemplateDataAttributes.JSON_PROPERTY_NAME,
  JiraIssueTemplateDataAttributes.JSON_PROPERTY_PROJECT_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class JiraIssueTemplateDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIELDS = "fields";
  private Map<String, Object> fields = new HashMap<String, Object>();

  public static final String JSON_PROPERTY_ISSUE_TYPE_ID = "issue_type_id";
  private String issueTypeId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROJECT_ID = "project_id";
  private String projectId;

  public JiraIssueTemplateDataAttributes() {}

  @JsonCreator
  public JiraIssueTemplateDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FIELDS) Map<String, Object> fields,
      @JsonProperty(required = true, value = JSON_PROPERTY_ISSUE_TYPE_ID) String issueTypeId,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROJECT_ID) String projectId) {
    this.fields = fields;
    this.issueTypeId = issueTypeId;
    this.name = name;
    this.projectId = projectId;
  }

  public JiraIssueTemplateDataAttributes fields(Map<String, Object> fields) {
    this.fields = fields;
    return this;
  }

  public JiraIssueTemplateDataAttributes putFieldsItem(String key, Object fieldsItem) {
    this.fields.put(key, fieldsItem);
    return this;
  }

  /**
   * Custom fields for the Jira issue template
   *
   * @return fields
   */
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Object> getFields() {
    return fields;
  }

  public void setFields(Map<String, Object> fields) {
    this.fields = fields;
  }

  public JiraIssueTemplateDataAttributes issueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
    return this;
  }

  /**
   * The ID of the Jira issue type
   *
   * @return issueTypeId
   */
  @JsonProperty(JSON_PROPERTY_ISSUE_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIssueTypeId() {
    return issueTypeId;
  }

  public void setIssueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
  }

  public JiraIssueTemplateDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the issue template
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JiraIssueTemplateDataAttributes projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The ID of the Jira project
   *
   * @return projectId
   */
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return JiraIssueTemplateDataAttributes
   */
  @JsonAnySetter
  public JiraIssueTemplateDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this JiraIssueTemplateDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraIssueTemplateDataAttributes jiraIssueTemplateDataAttributes =
        (JiraIssueTemplateDataAttributes) o;
    return Objects.equals(this.fields, jiraIssueTemplateDataAttributes.fields)
        && Objects.equals(this.issueTypeId, jiraIssueTemplateDataAttributes.issueTypeId)
        && Objects.equals(this.name, jiraIssueTemplateDataAttributes.name)
        && Objects.equals(this.projectId, jiraIssueTemplateDataAttributes.projectId)
        && Objects.equals(
            this.additionalProperties, jiraIssueTemplateDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, issueTypeId, name, projectId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraIssueTemplateDataAttributes {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    issueTypeId: ").append(toIndentedString(issueTypeId)).append("\n");
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
