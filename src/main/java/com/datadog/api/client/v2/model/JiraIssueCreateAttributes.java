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
   * <p>Jira issue creation attributes</p>
 */
@JsonPropertyOrder({
  JiraIssueCreateAttributes.JSON_PROPERTY_FIELDS,
  JiraIssueCreateAttributes.JSON_PROPERTY_ISSUE_TYPE_ID,
  JiraIssueCreateAttributes.JSON_PROPERTY_JIRA_ACCOUNT_ID,
  JiraIssueCreateAttributes.JSON_PROPERTY_PROJECT_ID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class JiraIssueCreateAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIELDS = "fields";
  private Map<String, Object> fields = null;

  public static final String JSON_PROPERTY_ISSUE_TYPE_ID = "issue_type_id";
  private String issueTypeId;

  public static final String JSON_PROPERTY_JIRA_ACCOUNT_ID = "jira_account_id";
  private String jiraAccountId;

  public static final String JSON_PROPERTY_PROJECT_ID = "project_id";
  private String projectId;

  public JiraIssueCreateAttributes() {}

  @JsonCreator
  public JiraIssueCreateAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_ISSUE_TYPE_ID)String issueTypeId,
            @JsonProperty(required=true, value=JSON_PROPERTY_JIRA_ACCOUNT_ID)String jiraAccountId,
            @JsonProperty(required=true, value=JSON_PROPERTY_PROJECT_ID)String projectId) {
        this.issueTypeId = issueTypeId;
        this.jiraAccountId = jiraAccountId;
        this.projectId = projectId;
  }
  public JiraIssueCreateAttributes fields(Map<String, Object> fields) {
    this.fields = fields;
    return this;
  }
  public JiraIssueCreateAttributes putFieldsItem(String key, Object fieldsItem) {
    if (this.fields == null) {
      this.fields = new HashMap<>();
    }
    this.fields.put(key, fieldsItem);
    return this;
  }

  /**
   * <p>Additional Jira fields</p>
   * @return fields
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FIELDS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, Object> getFields() {
        return fields;
      }
  public void setFields(Map<String, Object> fields) {
    this.fields = fields;
  }
  public JiraIssueCreateAttributes issueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
    return this;
  }

  /**
   * <p>Jira issue type ID</p>
   * @return issueTypeId
  **/
      @JsonProperty(JSON_PROPERTY_ISSUE_TYPE_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getIssueTypeId() {
        return issueTypeId;
      }
  public void setIssueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
  }
  public JiraIssueCreateAttributes jiraAccountId(String jiraAccountId) {
    this.jiraAccountId = jiraAccountId;
    return this;
  }

  /**
   * <p>Jira account ID</p>
   * @return jiraAccountId
  **/
      @JsonProperty(JSON_PROPERTY_JIRA_ACCOUNT_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getJiraAccountId() {
        return jiraAccountId;
      }
  public void setJiraAccountId(String jiraAccountId) {
    this.jiraAccountId = jiraAccountId;
  }
  public JiraIssueCreateAttributes projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * <p>Jira project ID</p>
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
   * @return JiraIssueCreateAttributes
   */
  @JsonAnySetter
  public JiraIssueCreateAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this JiraIssueCreateAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraIssueCreateAttributes jiraIssueCreateAttributes = (JiraIssueCreateAttributes) o;
    return Objects.equals(this.fields, jiraIssueCreateAttributes.fields) && Objects.equals(this.issueTypeId, jiraIssueCreateAttributes.issueTypeId) && Objects.equals(this.jiraAccountId, jiraIssueCreateAttributes.jiraAccountId) && Objects.equals(this.projectId, jiraIssueCreateAttributes.projectId) && Objects.equals(this.additionalProperties, jiraIssueCreateAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(fields,issueTypeId,jiraAccountId,projectId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraIssueCreateAttributes {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    issueTypeId: ").append(toIndentedString(issueTypeId)).append("\n");
    sb.append("    jiraAccountId: ").append(toIndentedString(jiraAccountId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
